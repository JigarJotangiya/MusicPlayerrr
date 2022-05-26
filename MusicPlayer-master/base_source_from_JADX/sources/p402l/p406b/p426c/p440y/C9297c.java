package p402l.p406b.p426c.p440y;

import java.io.IOException;
import java.util.logging.Logger;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p425b.C9118b;

/* renamed from: l.b.c.y.c */
/* compiled from: VorbisCommentReader */
public class C9297c {

    /* renamed from: a */
    public static Logger f36009a = Logger.getLogger("org.jaudiotagger.tag.vorbiscomment.VorbisCommentReader");

    /* renamed from: a */
    public C9298d mo32142a(byte[] bArr, boolean z) throws IOException, C9015a {
        C9298d dVar = new C9298d();
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        int g = C9057i.m48304g(bArr2);
        byte[] bArr3 = new byte[g];
        System.arraycopy(bArr, 4, bArr3, 0, g);
        int i = g + 4;
        dVar.mo32145o(new String(bArr3, "UTF-8"));
        Logger logger = f36009a;
        logger.config("Vendor is:" + dVar.mo32144n());
        byte[] bArr4 = new byte[4];
        System.arraycopy(bArr, i, bArr4, 0, 4);
        int i2 = i + 4;
        int g2 = C9057i.m48304g(bArr4);
        Logger logger2 = f36009a;
        logger2.config("Number of user comments:" + g2);
        int i3 = 0;
        while (true) {
            if (i3 >= g2) {
                break;
            }
            byte[] bArr5 = new byte[4];
            System.arraycopy(bArr, i2, bArr5, 0, 4);
            i2 += 4;
            int g3 = C9057i.m48304g(bArr5);
            Logger logger3 = f36009a;
            logger3.config("Next Comment Length:" + g3);
            if (g3 > 10000000) {
                f36009a.warning(C9118b.VORBIS_COMMENT_LENGTH_TOO_LARGE.getMsg(Integer.valueOf(g3)));
                break;
            } else if (g3 > bArr.length) {
                f36009a.warning(C9118b.VORBIS_COMMENT_LENGTH_LARGE_THAN_HEADER.getMsg(Integer.valueOf(g3), Integer.valueOf(bArr.length)));
                break;
            } else {
                byte[] bArr6 = new byte[g3];
                System.arraycopy(bArr, i2, bArr6, 0, g3);
                i2 += g3;
                C9299e eVar = new C9299e(bArr6);
                Logger logger4 = f36009a;
                logger4.config("Adding:" + eVar.mo31497D());
                dVar.mo31522f(eVar);
                i3++;
            }
        }
        if (!z || (bArr[i2] & 1) == 1) {
            return dVar;
        }
        throw new C9015a(C9118b.OGG_VORBIS_NO_FRAMING_BIT.getMsg(Integer.valueOf(bArr[i2] & 1)));
    }
}
