package p402l.p406b.p426c.p431t;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: l.b.c.t.o */
/* compiled from: ID3Unsynchronization */
public class C9240o {

    /* renamed from: a */
    public static Logger f35931a = Logger.getLogger("org.jaudiotagger.tag.id3");

    /* renamed from: a */
    public static boolean m49080a(byte[] bArr) {
        for (int i = 0; i < bArr.length - 1; i++) {
            if ((bArr[i] & 255) == 255 && (bArr[i + 1] & 224) == 224) {
                if (f35931a.isLoggable(Level.FINEST)) {
                    Logger logger = f35931a;
                    logger.finest("Unsynchronisation required found bit at:" + i);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static ByteBuffer m49081b(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[(remaining + 1)];
        byteBuffer.get(bArr, 0, remaining);
        int i = 0;
        int i2 = 0;
        boolean z = true;
        while (i < remaining) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (z || b != 0) {
                bArr[i2] = b;
                i2++;
            }
            z = (b & 255) != 255;
            i = i3;
        }
        return ByteBuffer.wrap(bArr, 0, i2);
    }

    /* renamed from: c */
    public static byte[] m49082c(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        int i = 0;
        while (byteArrayInputStream.available() > 0) {
            int read = byteArrayInputStream.read();
            i++;
            byteArrayOutputStream.write(read);
            if ((read & 255) == 255 && byteArrayInputStream.available() > 0) {
                byteArrayInputStream.mark(1);
                int read2 = byteArrayInputStream.read();
                if ((read2 & 224) == 224) {
                    if (f35931a.isLoggable(Level.FINEST)) {
                        Logger logger = f35931a;
                        logger.finest("Writing unsynchronisation bit at:" + i);
                    }
                    byteArrayOutputStream.write(0);
                } else if (read2 == 0) {
                    if (f35931a.isLoggable(Level.FINEST)) {
                        Logger logger2 = f35931a;
                        logger2.finest("Inserting zero unsynchronisation bit at:" + i);
                    }
                    byteArrayOutputStream.write(0);
                }
                byteArrayInputStream.reset();
            }
        }
        if ((bArr[bArr.length - 1] & 255) == 255) {
            f35931a.finest("Adding unsynchronisation bit at end of stream");
            byteArrayOutputStream.write(0);
        }
        return byteArrayOutputStream.toByteArray();
    }
}
