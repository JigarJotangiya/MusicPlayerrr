package p082e.p126k.p129c.p131j;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: e.k.c.j.g */
/* compiled from: ByteBufferWriter */
final class C3928g {

    /* renamed from: a */
    private static final ThreadLocal<SoftReference<byte[]>> f12012a = new ThreadLocal<>();

    /* renamed from: b */
    private static final Class<?> f12013b;

    /* renamed from: c */
    private static final long f12014c;

    static {
        Class<?> e = m16770e("java.io.FileOutputStream");
        f12013b = e;
        f12014c = m16767b(e);
    }

    /* renamed from: a */
    private static byte[] m16766a() {
        SoftReference softReference = f12012a.get();
        if (softReference == null) {
            return null;
        }
        return (byte[]) softReference.get();
    }

    /* renamed from: b */
    private static long m16767b(Class<?> cls) {
        if (cls == null) {
            return -1;
        }
        try {
            if (C4022u1.m17619G()) {
                return C4022u1.m17621I(cls.getDeclaredField("channel"));
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: c */
    private static byte[] m16768c(int i) {
        int max = Math.max(i, 1024);
        byte[] a = m16766a();
        if (a == null || m16769d(max, a.length)) {
            a = new byte[max];
            if (max <= 16384) {
                m16771f(a);
            }
        }
        return a;
    }

    /* renamed from: d */
    private static boolean m16769d(int i, int i2) {
        return i2 < i && ((float) i2) < ((float) i) * 0.5f;
    }

    /* renamed from: e */
    private static Class<?> m16770e(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: f */
    private static void m16771f(byte[] bArr) {
        f12012a.set(new SoftReference(bArr));
    }

    /* renamed from: g */
    static void m16772g(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        int position = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!m16773h(byteBuffer, outputStream)) {
                byte[] c = m16768c(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int min = Math.min(byteBuffer.remaining(), c.length);
                    byteBuffer.get(c, 0, min);
                    outputStream.write(c, 0, min);
                }
            }
        } finally {
            byteBuffer.position(position);
        }
    }

    /* renamed from: h */
    private static boolean m16773h(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        long j = f12014c;
        if (j < 0 || !f12013b.isInstance(outputStream)) {
            return false;
        }
        WritableByteChannel writableByteChannel = null;
        try {
            writableByteChannel = (WritableByteChannel) C4022u1.m17617E(outputStream, j);
        } catch (ClassCastException unused) {
        }
        if (writableByteChannel == null) {
            return false;
        }
        writableByteChannel.write(byteBuffer);
        return true;
    }
}
