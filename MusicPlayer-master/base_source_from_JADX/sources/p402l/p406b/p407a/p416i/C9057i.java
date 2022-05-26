package p402l.p406b.p407a.p416i;

import java.io.DataInput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import p402l.p406b.p407a.C8942a;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.a.i.i */
/* compiled from: Utils */
public class C9057i {

    /* renamed from: a */
    public static Logger f35537a = Logger.getLogger("org.jaudiotagger.audio.generic.utils");

    /* renamed from: A */
    public static int m48296A(DataInput dataInput) throws IOException {
        long z = m48323z(dataInput);
        if (z <= 2147483647L) {
            return (int) z;
        }
        throw new IOException("uint32 value read overflows int");
    }

    /* renamed from: B */
    public static boolean m48297B(File file, File file2) {
        Logger logger = f35537a;
        Level level = Level.CONFIG;
        logger.log(level, "Renaming From:" + file.getAbsolutePath() + " to " + file2.getAbsolutePath());
        if (file2.exists()) {
            Logger logger2 = f35537a;
            Level level2 = Level.SEVERE;
            logger2.log(level2, "Destination File:" + file2 + " already exists");
            return false;
        } else if (file.renameTo(file2)) {
            return true;
        } else {
            if (!m48298a(file, file2)) {
                return false;
            }
            if (file.delete()) {
                return true;
            }
            Logger logger3 = f35537a;
            Level level3 = Level.SEVERE;
            logger3.log(level3, "Unable to delete File:" + file);
            file2.delete();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m48298a(File file, File file2) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            fileInputStream.close();
            fileOutputStream.close();
            if (file.length() == file2.length()) {
                return true;
            }
            file2.delete();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public static String m48299b(File file) {
        String k = m48308k(file);
        if (k.length() <= 20) {
            return k;
        }
        return k.substring(0, 20);
    }

    /* renamed from: c */
    public static byte[] m48300c(String str, String str2) {
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public static String m48301d(File file) {
        String lowerCase = file.getName().toLowerCase();
        int lastIndexOf = lowerCase.lastIndexOf(".");
        if (lastIndexOf == -1) {
            return BuildConfig.FLAVOR;
        }
        return lowerCase.substring(lastIndexOf + 1);
    }

    /* renamed from: e */
    public static int m48302e(ByteBuffer byteBuffer, int i, int i2) {
        return (int) m48306i(byteBuffer, i, i2);
    }

    /* renamed from: f */
    public static int m48303f(byte[] bArr, int i, int i2) {
        return (int) m48306i(ByteBuffer.wrap(bArr), i, i2);
    }

    /* renamed from: g */
    public static int m48304g(byte[] bArr) {
        return (int) m48307j(ByteBuffer.wrap(bArr), 0, bArr.length - 1);
    }

    /* renamed from: h */
    public static int m48305h(byte[] bArr, int i, int i2) {
        return (int) m48307j(ByteBuffer.wrap(bArr), i, i2);
    }

    /* renamed from: i */
    public static long m48306i(ByteBuffer byteBuffer, int i, int i2) {
        long j = 0;
        for (int i3 = 0; i3 < (i2 - i) + 1; i3++) {
            j += ((long) (byteBuffer.get(i2 - i3) & 255)) << (i3 * 8);
        }
        return j;
    }

    /* renamed from: j */
    public static long m48307j(ByteBuffer byteBuffer, int i, int i2) {
        long j = 0;
        for (int i3 = 0; i3 < (i2 - i) + 1; i3++) {
            j += (long) ((byteBuffer.get(i + i3) & 255) << (i3 * 8));
        }
        return j;
    }

    /* renamed from: k */
    public static String m48308k(File file) {
        String f = C8942a.m47874f(file);
        if (f.length() >= 3) {
            return f;
        }
        if (f.length() == 1) {
            return f + "000";
        } else if (f.length() == 1) {
            return f + "00";
        } else if (f.length() != 2) {
            return f;
        } else {
            return f + "0";
        }
    }

    /* renamed from: l */
    public static short m48309l(ByteBuffer byteBuffer, int i, int i2) {
        return (short) m48302e(byteBuffer, i, i2);
    }

    /* renamed from: m */
    public static byte[] m48310m(short s) {
        return new byte[]{(byte) ((s >> 8) & 255), (byte) (s & 255)};
    }

    /* renamed from: n */
    public static byte[] m48311n(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    /* renamed from: o */
    public static byte[] m48312o(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((int) (((long) (i >>> 8)) & 255)), (byte) ((int) (((long) (i >>> 16)) & 255)), (byte) ((int) (((long) (i >>> 24)) & 255))};
    }

    /* renamed from: p */
    public static String m48313p(ByteBuffer byteBuffer, int i, int i2, String str) {
        byte[] bArr = new byte[i2];
        byteBuffer.position(byteBuffer.position() + i);
        byteBuffer.get(bArr);
        try {
            return new String(bArr, 0, i2, str);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: q */
    public static String m48314q(byte[] bArr, int i, int i2, String str) {
        try {
            return new String(bArr, i, i2, str);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: r */
    public static byte[] m48315r(String str) throws UnsupportedEncodingException {
        return str.getBytes("UTF-8");
    }

    /* renamed from: s */
    public static int m48316s(ByteBuffer byteBuffer) {
        return byteBuffer.get() & 255;
    }

    /* renamed from: t */
    public static int m48317t(DataInput dataInput) throws IOException {
        byte[] bArr = {0, 0};
        dataInput.readFully(bArr, 0, 2);
        return ByteBuffer.wrap(bArr).getShort();
    }

    /* renamed from: u */
    public static String m48318u(DataInput dataInput, int i) throws IOException {
        byte[] bArr = new byte[i];
        dataInput.readFully(bArr);
        return new String(bArr);
    }

    /* renamed from: v */
    public static int m48319v(ByteBuffer byteBuffer) {
        return (m48321x(byteBuffer) << 8) + 0 + m48321x(byteBuffer);
    }

    /* renamed from: w */
    public static int m48320w(ByteBuffer byteBuffer) {
        return (m48319v(byteBuffer) << 16) + 0 + m48319v(byteBuffer);
    }

    /* renamed from: x */
    public static int m48321x(ByteBuffer byteBuffer) {
        return m48316s(byteBuffer);
    }

    /* renamed from: y */
    public static int m48322y(DataInput dataInput) throws IOException {
        byte[] bArr = {0, 0, 0, 0};
        dataInput.readFully(bArr, 2, 2);
        return ByteBuffer.wrap(bArr).getInt();
    }

    /* renamed from: z */
    public static long m48323z(DataInput dataInput) throws IOException {
        byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0};
        dataInput.readFully(bArr, 4, 4);
        return ByteBuffer.wrap(bArr).getLong();
    }
}
