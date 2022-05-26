package p402l.p406b.p426c.p428q;

import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;
import p402l.p406b.p407a.p409f.p410c.C8984q;
import p402l.p406b.p407a.p416i.C9057i;

/* renamed from: l.b.c.q.e */
/* compiled from: AsfTagCoverField */
public class C9143e extends C9137a {

    /* renamed from: h */
    private String f35767h;

    /* renamed from: i */
    private String f35768i;

    static {
        Logger.getLogger("org.jaudiotagger.audio.asf.tag");
    }

    public C9143e(C8984q qVar) {
        super(qVar);
        if (!qVar.mo31423r().equals(C9138b.COVER_ART.getFieldName())) {
            throw new IllegalArgumentException("Descriptor description must be WM/Picture");
        } else if (qVar.mo31430y() == 1) {
            try {
                m48613b();
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new IllegalArgumentException("Descriptor type must be binary");
        }
    }

    /* renamed from: b */
    private void m48613b() throws UnsupportedEncodingException {
        int i = 0;
        byte b = mo31499c()[0];
        C9057i.m48305h(mo31499c(), 1, 2);
        this.f35768i = null;
        this.f35767h = null;
        for (int i2 = 5; i2 < mo31499c().length - 1; i2 += 2) {
            if (mo31499c()[i2] == 0 && mo31499c()[i2 + 1] == 0) {
                if (this.f35768i == null) {
                    this.f35768i = new String(mo31499c(), 5, i2 - 5, "UTF-16LE");
                    i = i2 + 2;
                } else if (this.f35767h == null) {
                    this.f35767h = new String(mo31499c(), i, i2 - i, "UTF-16LE");
                    return;
                }
            }
        }
    }
}
