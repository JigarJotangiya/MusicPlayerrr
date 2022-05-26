package p402l.p406b.p407a.p408e;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* renamed from: l.b.a.e.d */
/* compiled from: AiffUtil */
public class C8951d {

    /* renamed from: a */
    private static final SimpleDateFormat f35347a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

    /* renamed from: b */
    private static final Charset f35348b = ((Charset) Charset.availableCharsets().get("ISO-8859-1"));

    /* renamed from: a */
    public static String m47907a(byte[] bArr) {
        return new String(bArr, 0, bArr[0], f35348b);
    }

    /* renamed from: b */
    public static String m47908b(Date date) {
        return f35347a.format(date);
    }

    /* renamed from: c */
    public static String m47909c(RandomAccessFile randomAccessFile) throws IOException {
        StringBuffer stringBuffer = new StringBuffer(4);
        for (int i = 0; i < 4; i++) {
            stringBuffer.append((char) randomAccessFile.read());
        }
        return stringBuffer.toString();
    }

    /* renamed from: d */
    public static double m47910d(RandomAccessFile randomAccessFile) throws IOException {
        byte[] bArr = new byte[10];
        randomAccessFile.readFully(bArr);
        return new C8960m(bArr).mo31297a();
    }

    /* renamed from: e */
    public static String m47911e(RandomAccessFile randomAccessFile) throws IOException {
        int read = randomAccessFile.read();
        byte[] bArr = new byte[(read + 1)];
        randomAccessFile.read(bArr, 1, read);
        bArr[0] = (byte) read;
        return m47907a(bArr);
    }

    /* renamed from: f */
    public static long m47912f(RandomAccessFile randomAccessFile) throws IOException {
        long j = 0;
        for (int i = 0; i < 4; i++) {
            j = (j << 8) | ((long) randomAccessFile.read());
        }
        return j;
    }

    /* renamed from: g */
    public static Date m47913g(long j) {
        Calendar instance = Calendar.getInstance();
        instance.set(1904, 0, 1, 0, 0, 0);
        int i = (int) (j / 3600);
        instance.add(11, i);
        instance.add(13, (int) (j - (((long) i) * 3600)));
        return instance.getTime();
    }
}
