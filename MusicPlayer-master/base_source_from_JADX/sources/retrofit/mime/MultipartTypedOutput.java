package retrofit.mime;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public final class MultipartTypedOutput implements TypedOutput {
    public static final String DEFAULT_TRANSFER_ENCODING = "binary";
    private final String boundary;
    private final byte[] footer;
    private long length;
    private final List<MimePart> mimeParts;

    private static final class MimePart {
        private final TypedOutput body;
        private final String boundary;
        private boolean isBuilt;
        private final boolean isFirst;
        private final String name;
        private byte[] partBoundary;
        private byte[] partHeader;
        private final String transferEncoding;

        public MimePart(String str, String str2, TypedOutput typedOutput, String str3, boolean z) {
            this.name = str;
            this.transferEncoding = str2;
            this.body = typedOutput;
            this.isFirst = z;
            this.boundary = str3;
        }

        private void build() {
            if (!this.isBuilt) {
                this.partBoundary = MultipartTypedOutput.buildBoundary(this.boundary, this.isFirst, false);
                this.partHeader = MultipartTypedOutput.buildHeader(this.name, this.transferEncoding, this.body);
                this.isBuilt = true;
            }
        }

        public long size() {
            build();
            if (this.body.length() > -1) {
                return this.body.length() + ((long) this.partBoundary.length) + ((long) this.partHeader.length);
            }
            return -1;
        }

        public void writeTo(OutputStream outputStream) throws IOException {
            build();
            outputStream.write(this.partBoundary);
            outputStream.write(this.partHeader);
            this.body.writeTo(outputStream);
        }
    }

    public MultipartTypedOutput() {
        this(UUID.randomUUID().toString());
    }

    /* access modifiers changed from: private */
    public static byte[] buildBoundary(String str, boolean z, boolean z2) {
        try {
            StringBuilder sb = new StringBuilder(str.length() + 8);
            if (!z) {
                sb.append("\r\n");
            }
            sb.append("--");
            sb.append(str);
            if (z2) {
                sb.append("--");
            }
            sb.append("\r\n");
            return sb.toString().getBytes("UTF-8");
        } catch (IOException e) {
            throw new RuntimeException("Unable to write multipart boundary", e);
        }
    }

    /* access modifiers changed from: private */
    public static byte[] buildHeader(String str, String str2, TypedOutput typedOutput) {
        try {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Content-Disposition: form-data; name=\"");
            sb.append(str);
            String fileName = typedOutput.fileName();
            if (fileName != null) {
                sb.append("\"; filename=\"");
                sb.append(fileName);
            }
            sb.append("\"\r\nContent-Type: ");
            sb.append(typedOutput.mimeType());
            long length2 = typedOutput.length();
            if (length2 != -1) {
                sb.append("\r\nContent-Length: ");
                sb.append(length2);
            }
            sb.append("\r\nContent-Transfer-Encoding: ");
            sb.append(str2);
            sb.append("\r\n\r\n");
            return sb.toString().getBytes("UTF-8");
        } catch (IOException e) {
            throw new RuntimeException("Unable to write multipart header", e);
        }
    }

    public void addPart(String str, TypedOutput typedOutput) {
        addPart(str, DEFAULT_TRANSFER_ENCODING, typedOutput);
    }

    public String fileName() {
        return null;
    }

    public int getPartCount() {
        return this.mimeParts.size();
    }

    /* access modifiers changed from: package-private */
    public List<byte[]> getParts() throws IOException {
        ArrayList arrayList = new ArrayList(this.mimeParts.size());
        for (MimePart writeTo : this.mimeParts) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            writeTo.writeTo(byteArrayOutputStream);
            arrayList.add(byteArrayOutputStream.toByteArray());
        }
        return arrayList;
    }

    public long length() {
        return this.length;
    }

    public String mimeType() {
        return "multipart/form-data; boundary=" + this.boundary;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        for (MimePart writeTo : this.mimeParts) {
            writeTo.writeTo(outputStream);
        }
        outputStream.write(this.footer);
    }

    MultipartTypedOutput(String str) {
        this.mimeParts = new LinkedList();
        this.boundary = str;
        byte[] buildBoundary = buildBoundary(str, false, true);
        this.footer = buildBoundary;
        this.length = (long) buildBoundary.length;
    }

    public void addPart(String str, String str2, TypedOutput typedOutput) {
        Objects.requireNonNull(str, "Part name must not be null.");
        Objects.requireNonNull(str2, "Transfer encoding must not be null.");
        Objects.requireNonNull(typedOutput, "Part body must not be null.");
        MimePart mimePart = new MimePart(str, str2, typedOutput, this.boundary, this.mimeParts.isEmpty());
        this.mimeParts.add(mimePart);
        long size = mimePart.size();
        if (size == -1) {
            this.length = -1;
            return;
        }
        long j = this.length;
        if (j != -1) {
            this.length = j + size;
        }
    }
}
