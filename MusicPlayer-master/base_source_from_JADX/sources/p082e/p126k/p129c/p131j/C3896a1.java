package p082e.p126k.p129c.p131j;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import p082e.p126k.p129c.p131j.C3934i;

/* renamed from: e.k.c.j.a1 */
/* compiled from: NioByteString */
final class C3896a1 extends C3934i.C3943i {
    /* access modifiers changed from: private */
    public final ByteBuffer buffer;

    C3896a1(ByteBuffer byteBuffer) {
        C3899b0.m16646b(byteBuffer, "buffer");
        this.buffer = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    /* renamed from: t */
    private ByteBuffer m16639t(int i, int i2) {
        if (i < this.buffer.position() || i2 > this.buffer.limit() || i > i2) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        }
        ByteBuffer slice = this.buffer.slice();
        slice.position(i - this.buffer.position());
        slice.limit(i2 - this.buffer.position());
        return slice;
    }

    private Object writeReplace() {
        return C3934i.copyFrom(this.buffer.slice());
    }

    public ByteBuffer asReadOnlyByteBuffer() {
        return this.buffer.asReadOnlyBuffer();
    }

    public List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    public byte byteAt(int i) {
        try {
            return this.buffer.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    public void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.buffer.slice());
    }

    /* access modifiers changed from: protected */
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer slice = this.buffer.slice();
        slice.position(i);
        slice.get(bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3934i)) {
            return false;
        }
        C3934i iVar = (C3934i) obj;
        if (size() != iVar.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C3896a1) {
            return this.buffer.equals(((C3896a1) obj).buffer);
        }
        if (obj instanceof C3951i1) {
            return obj.equals(this);
        }
        return this.buffer.equals(iVar.asReadOnlyByteBuffer());
    }

    /* access modifiers changed from: package-private */
    public boolean equalsRange(C3934i iVar, int i, int i2) {
        return substring(0, i2).equals(iVar.substring(i, i2 + i));
    }

    public byte internalByteAt(int i) {
        return byteAt(i);
    }

    public boolean isValidUtf8() {
        return C4032v1.m17830r(this.buffer);
    }

    public C3956j newCodedInput() {
        return C3956j.m16885h(this.buffer, true);
    }

    public InputStream newInput() {
        return new C3897a();
    }

    /* access modifiers changed from: protected */
    public int partialHash(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.buffer.get(i4);
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public int partialIsValidUtf8(int i, int i2, int i3) {
        return C4032v1.m17833u(i, this.buffer, i2, i3 + i2);
    }

    public int size() {
        return this.buffer.remaining();
    }

    public C3934i substring(int i, int i2) {
        try {
            return new C3896a1(m16639t(i, i2));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public String toStringInternal(Charset charset) {
        int i;
        int i2;
        byte[] bArr;
        if (this.buffer.hasArray()) {
            bArr = this.buffer.array();
            i2 = this.buffer.arrayOffset() + this.buffer.position();
            i = this.buffer.remaining();
        } else {
            bArr = toByteArray();
            i2 = 0;
            i = bArr.length;
        }
        return new String(bArr, i2, i, charset);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    /* access modifiers changed from: package-private */
    public void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        if (this.buffer.hasArray()) {
            outputStream.write(this.buffer.array(), this.buffer.arrayOffset() + this.buffer.position() + i, i2);
            return;
        }
        C3928g.m16772g(m16639t(i, i2 + i), outputStream);
    }

    /* renamed from: e.k.c.j.a1$a */
    /* compiled from: NioByteString */
    class C3897a extends InputStream {

        /* renamed from: g */
        private final ByteBuffer f11980g;

        C3897a() {
            this.f11980g = C3896a1.this.buffer.slice();
        }

        public int available() throws IOException {
            return this.f11980g.remaining();
        }

        public void mark(int i) {
            this.f11980g.mark();
        }

        public boolean markSupported() {
            return true;
        }

        public int read() throws IOException {
            if (!this.f11980g.hasRemaining()) {
                return -1;
            }
            return this.f11980g.get() & 255;
        }

        public void reset() throws IOException {
            try {
                this.f11980g.reset();
            } catch (InvalidMarkException e) {
                throw new IOException(e);
            }
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!this.f11980g.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i2, this.f11980g.remaining());
            this.f11980g.get(bArr, i, min);
            return min;
        }
    }

    /* access modifiers changed from: package-private */
    public void writeTo(C3931h hVar) throws IOException {
        hVar.mo13586a(this.buffer.slice());
    }
}
