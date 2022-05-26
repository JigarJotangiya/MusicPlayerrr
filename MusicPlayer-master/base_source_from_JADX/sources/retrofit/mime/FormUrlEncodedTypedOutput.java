package retrofit.mime;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Objects;

public final class FormUrlEncodedTypedOutput implements TypedOutput {
    final ByteArrayOutputStream content = new ByteArrayOutputStream();

    public void addField(String str, String str2) {
        addField(str, true, str2, true);
    }

    public String fileName() {
        return null;
    }

    public long length() {
        return (long) this.content.size();
    }

    public String mimeType() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.content.toByteArray());
    }

    public void addField(String str, boolean z, String str2, boolean z2) {
        Objects.requireNonNull(str, "name");
        Objects.requireNonNull(str2, "value");
        if (this.content.size() > 0) {
            this.content.write(38);
        }
        if (z) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (z2) {
            str2 = URLEncoder.encode(str2, "UTF-8");
        }
        this.content.write(str.getBytes("UTF-8"));
        this.content.write(61);
        this.content.write(str2.getBytes("UTF-8"));
    }
}