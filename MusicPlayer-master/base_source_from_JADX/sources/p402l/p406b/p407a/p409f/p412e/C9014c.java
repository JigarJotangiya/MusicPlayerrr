package p402l.p406b.p407a.p409f.p412e;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.GregorianCalendar;
import p402l.p406b.p407a.p409f.p410c.C8978l;

/* renamed from: l.b.a.f.e.c */
/* compiled from: Utils */
public class C9014c {

    /* renamed from: a */
    public static final String f35470a = System.getProperty("line.separator");

    /* renamed from: a */
    public static void m48167a(InputStream inputStream, OutputStream outputStream, long j) throws IOException {
        byte[] bArr = new byte[8192];
        long j2 = 0;
        while (j2 < j) {
            long j3 = j - j2;
            int read = inputStream.read(bArr, 0, j3 < 8192 ? (int) j3 : 8192);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
                j2 += (long) read;
            } else {
                throw new IOException("Inputstream has to continue for another " + j3 + " bytes.");
            }
        }
    }

    /* renamed from: b */
    public static void m48168b(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public static byte[] m48169c(long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((int) ((j >>> (i2 * 8)) & 255));
        }
        return bArr;
    }

    /* renamed from: d */
    public static byte[] m48170d(String str, Charset charset) {
        ByteBuffer encode = charset.encode(str);
        byte[] bArr = new byte[encode.limit()];
        encode.rewind();
        encode.get(bArr);
        return bArr;
    }

    /* renamed from: e */
    public static GregorianCalendar m48171e(BigInteger bigInteger) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(new Date(bigInteger.divide(new BigInteger("10")).longValue() - 11644470000000L));
        return gregorianCalendar;
    }

    /* renamed from: f */
    public static boolean m48172f(String str) {
        if (str == null) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m48173g(String str) {
        return str == null || str.length() <= 32766;
    }

    /* renamed from: h */
    public static BigInteger m48174h(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[8];
        byte[] bArr2 = new byte[8];
        if (inputStream.read(bArr) == 8) {
            for (int i = 0; i < 8; i++) {
                bArr2[7 - i] = bArr[i];
            }
            return new BigInteger(bArr2);
        }
        throw new EOFException();
    }

    /* renamed from: i */
    public static byte[] m48175i(InputStream inputStream, long j) throws IOException {
        byte[] bArr = new byte[((int) j)];
        inputStream.read(bArr);
        return bArr;
    }

    /* renamed from: j */
    public static String m48176j(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        int m = m48179m(inputStream);
        int read = inputStream.read() | (inputStream.read() << 8);
        while (true) {
            if (read != 0) {
                sb.append((char) read);
                read = inputStream.read() | (inputStream.read() << 8);
            }
            if (read == 0 && sb.length() + 1 <= m) {
                break;
            }
        }
        if (m == sb.length() + 1) {
            return sb.toString();
        }
        throw new IllegalStateException("Invalid Data for current interpretation");
    }

    /* renamed from: k */
    public static String m48177k(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        if (inputStream.read(bArr) == i) {
            if (i >= 2 && bArr[i - 1] == 0) {
                int i2 = i - 2;
                if (bArr[i2] == 0) {
                    byte[] bArr2 = new byte[i2];
                    System.arraycopy(bArr, 0, bArr2, 0, i2);
                    bArr = bArr2;
                }
            }
            return new String(bArr, "UTF-16LE");
        }
        throw new IllegalStateException("Couldn't read the necessary amount of bytes.");
    }

    /* renamed from: l */
    public static C8978l m48178l(InputStream inputStream) throws IOException {
        if (inputStream != null) {
            int[] iArr = new int[16];
            for (int i = 0; i < 16; i++) {
                iArr[i] = inputStream.read();
            }
            return new C8978l(iArr);
        }
        throw new IllegalArgumentException("Argument must not be null");
    }

    /* renamed from: m */
    public static int m48179m(InputStream inputStream) throws IOException {
        return (inputStream.read() << 8) | inputStream.read();
    }

    /* renamed from: n */
    public static long m48180n(InputStream inputStream) throws IOException {
        long j = 0;
        for (int i = 0; i <= 24; i += 8) {
            j |= ((long) inputStream.read()) << i;
        }
        return j;
    }

    /* renamed from: o */
    public static long m48181o(InputStream inputStream) throws IOException {
        long j = 0;
        for (int i = 0; i <= 56; i += 8) {
            j |= ((long) inputStream.read()) << i;
        }
        return j;
    }

    /* renamed from: p */
    public static void m48182p(int i, OutputStream outputStream) throws IOException {
        if (i >= 0) {
            byte[] bArr = new byte[2];
            for (int i2 = 0; i2 <= 8; i2 += 8) {
                bArr[i2 / 8] = (byte) ((i >> i2) & 255);
            }
            outputStream.write(bArr);
            return;
        }
        throw new IllegalArgumentException("positive value expected.");
    }

    /* renamed from: q */
    public static void m48183q(long j, OutputStream outputStream) throws IOException {
        if (j >= 0) {
            byte[] bArr = new byte[4];
            for (int i = 0; i <= 24; i += 8) {
                bArr[i / 8] = (byte) ((int) ((j >> i) & 255));
            }
            outputStream.write(bArr);
            return;
        }
        throw new IllegalArgumentException("positive value expected.");
    }

    /* renamed from: r */
    public static void m48184r(long j, OutputStream outputStream) throws IOException {
        if (j >= 0) {
            byte[] bArr = new byte[8];
            for (int i = 0; i <= 56; i += 8) {
                bArr[i / 8] = (byte) ((int) ((j >> i) & 255));
            }
            outputStream.write(bArr);
            return;
        }
        throw new IllegalArgumentException("positive value expected.");
    }
}
