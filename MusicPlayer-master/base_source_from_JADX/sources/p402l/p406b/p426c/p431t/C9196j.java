package p402l.p406b.p426c.p431t;

import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.C9125e;

/* renamed from: l.b.c.t.j */
/* compiled from: ID3Compression */
public class C9196j {

    /* renamed from: a */
    public static Logger f35886a = Logger.getLogger("org.jaudiotagger.tag.id3");

    /* renamed from: a */
    protected static ByteBuffer m48899a(String str, String str2, ByteBuffer byteBuffer, int i, int i2) throws C9125e {
        Logger logger = f35886a;
        logger.config(str2 + ":About to decompress " + i2 + " bytes, expect result to be:" + i + " bytes");
        byte[] bArr = new byte[i];
        byte[] bArr2 = new byte[i2];
        int position = byteBuffer.position();
        byteBuffer.get(bArr2, 0, i2);
        byteBuffer.position(position);
        Inflater inflater = new Inflater();
        inflater.setInput(bArr2);
        try {
            int inflate = inflater.inflate(bArr);
            Logger logger2 = f35886a;
            logger2.config(str2 + ":Decompressed to " + inflate + " bytes");
            inflater.end();
            return ByteBuffer.wrap(bArr);
        } catch (DataFormatException e) {
            Logger logger3 = f35886a;
            Level level = Level.CONFIG;
            logger3.log(level, "Unable to decompress this frame:" + str, e);
            byteBuffer.position(byteBuffer.position() + i2);
            throw new C9125e(C9118b.ID3_UNABLE_TO_DECOMPRESS_FRAME.getMsg(str, str2, e.getMessage()));
        }
    }
}
