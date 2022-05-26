package p402l.p406b.p426c.p431t;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p426c.C9121a;
import p402l.p406b.p426c.C9124d;
import p402l.p406b.p426c.C9125e;
import p402l.p406b.p426c.C9126f;
import p402l.p406b.p426c.p431t.p432k0.C9203c;
import p402l.p406b.p426c.p431t.p432k0.C9207e;
import p402l.p406b.p426c.p431t.p432k0.C9228z;
import p402l.p406b.p441d.C9300a;

/* renamed from: l.b.c.t.u */
/* compiled from: ID3v22Frame */
public class C9248u extends C9176c {

    /* renamed from: n */
    private static Pattern f35947n = Pattern.compile("[A-Z][0-9A-Z]{2}");

    public C9248u() {
    }

    /* renamed from: x */
    private void m49129x(C9253z zVar) throws C9125e {
        String c = C9238m.m49064c(zVar.mo31857g());
        this.f35818i = c;
        if (c != null) {
            Logger logger = C9192h.f35863g;
            logger.config("V2:Orig id is:" + zVar.mo31857g() + ":New id is:" + this.f35818i);
            this.f35855h = (C9203c) C9238m.m49067f(zVar.mo31934j());
        } else if (C9238m.m49074m(zVar.mo31857g())) {
            String h = C9238m.m49069h(zVar.mo31857g());
            this.f35818i = h;
            if (h != null) {
                Logger logger2 = C9192h.f35863g;
                logger2.config("V2:Force:Orig id is:" + zVar.mo31857g() + ":New id is:" + this.f35818i);
                this.f35855h = mo31865s(this.f35818i, (C9203c) zVar.mo31934j());
                return;
            }
            throw new C9125e("Unable to convert v23 frame:" + zVar.mo31857g() + " to a v22 frame");
        } else if (!(zVar.mo31934j() instanceof C9207e)) {
            this.f35855h = new C9228z((C9228z) zVar.mo31934j());
            this.f35818i = zVar.mo31857g();
            Logger logger3 = C9192h.f35863g;
            logger3.config("v2:UNKNOWN:Orig id is:" + zVar.mo31857g() + ":New id is:" + this.f35818i);
        } else if (C9238m.m49073l(zVar.mo31857g())) {
            this.f35855h = zVar.mo31934j();
            this.f35818i = zVar.mo31857g();
            Logger logger4 = C9192h.f35863g;
            logger4.config("DEPRECATED:Orig id is:" + zVar.mo31857g() + ":New id is:" + this.f35818i);
        } else {
            this.f35855h = new C9207e((C9207e) zVar.mo31934j());
            this.f35818i = zVar.mo31857g();
            Logger logger5 = C9192h.f35863g;
            logger5.config("DEPRECATED:Orig id is:" + zVar.mo31857g() + ":New id is:" + this.f35818i);
        }
    }

    /* renamed from: y */
    private int m49130y(byte[] bArr) {
        int intValue = new BigInteger(bArr).intValue();
        if (intValue < 0) {
            Logger logger = C9192h.f35863g;
            logger.warning("Invalid Frame Size of:" + intValue + "Decoded from bin:" + Integer.toBinaryString(intValue) + "Decoded from hex:" + Integer.toHexString(intValue));
        }
        return intValue;
    }

    /* renamed from: z */
    private void m49131z(ByteBuffer byteBuffer, int i) {
        byteBuffer.put((byte) ((16711680 & i) >> 16));
        byteBuffer.put((byte) ((65280 & i) >> 8));
        byteBuffer.put((byte) (i & 255));
        Logger logger = C9192h.f35863g;
        logger.fine("Frame Size Is Actual:" + i + ":Encoded bin:" + Integer.toBinaryString(i) + ":Encoded Hex" + Integer.toHexString(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public int mo32065A() {
        return 3;
    }

    /* renamed from: B */
    public boolean mo32066B(String str) {
        return f35947n.matcher(str).matches();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9248u)) {
            return false;
        }
        C9248u uVar = (C9248u) obj;
        if (!C9300a.m49299b(this.f35821l, uVar.f35821l) || !C9300a.m49299b(this.f35822m, uVar.f35822m) || !super.equals(uVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo31500f() {
        return C9249v.m49141k().mo31958e(mo31497D());
    }

    /* renamed from: h */
    public int mo31919h() {
        return this.f35855h.mo31919h() + mo31859m();
    }

    /* renamed from: i */
    public void mo31887i(ByteBuffer byteBuffer) throws C9125e, C9124d {
        String u = mo31867u(byteBuffer);
        byte[] bArr = new byte[mo32065A()];
        if (mo32066B(u)) {
            byteBuffer.get(bArr, 0, mo32065A());
            int y = m49130y(bArr);
            this.f35819j = y;
            if (y < 0) {
                throw new C9125e(u + " has invalid size of:" + this.f35819j);
            } else if (y == 0) {
                Logger logger = C9192h.f35863g;
                logger.warning("Empty Frame:" + u);
                throw new C9121a(u + " is empty frame");
            } else if (y <= byteBuffer.remaining()) {
                Logger logger2 = C9192h.f35863g;
                logger2.fine("Frame Size Is:" + this.f35819j);
                String b = C9238m.m49063b(u);
                if (b == null && (b = C9238m.m49062a(u)) == null) {
                    b = C9238m.m49073l(u) ? u : "Unsupported";
                }
                Logger logger3 = C9192h.f35863g;
                logger3.fine("Identifier was:" + u + " reading using:" + b);
                ByteBuffer slice = byteBuffer.slice();
                slice.limit(this.f35819j);
                try {
                    this.f35855h = mo31864r(b, slice, this.f35819j);
                } finally {
                    byteBuffer.position(byteBuffer.position() + this.f35819j);
                }
            } else {
                Logger logger4 = C9192h.f35863g;
                logger4.warning("Invalid Frame size larger than size before mp3 audio:" + u);
                throw new C9125e(u + " is invalid frame");
            }
        } else {
            Logger logger5 = C9192h.f35863g;
            logger5.config("Invalid identifier:" + u);
            byteBuffer.position(byteBuffer.position() - (mo31860n() + -1));
            throw new C9126f(mo31861o() + ":" + u + ":is not a valid ID3v2.20 frame");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public int mo31859m() {
        return 6;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo31860n() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo31863q(byte[] bArr) {
        return bArr[0] == 0 && bArr[1] == 0 && bArr[2] == 0;
    }

    /* renamed from: w */
    public void mo31869w(ByteArrayOutputStream byteArrayOutputStream) {
        Logger logger = C9192h.f35863g;
        logger.config("Write Frame to Buffer" + mo31857g());
        ByteBuffer allocate = ByteBuffer.allocate(mo31859m());
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        ((C9203c) this.f35855h).mo31961w(byteArrayOutputStream2);
        allocate.put(C9057i.m48300c(mo31857g(), "ISO-8859-1"), 0, mo31860n());
        m49131z(allocate, this.f35855h.mo31919h());
        try {
            byteArrayOutputStream.write(allocate.array());
            byteArrayOutputStream.write(byteArrayOutputStream2.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public C9248u(String str) {
        String str2;
        Logger logger = C9192h.f35863g;
        logger.config("Creating empty frame of type" + str);
        this.f35818i = str;
        if (C9238m.m49073l(str) && C9238m.m49068g(str) == null && !str.equals("CRM")) {
            if (str.equals("TYE") || str.equals("TIM")) {
                str2 = "TDRC";
                this.f35855h = (C9190g) Class.forName("org.jaudiotagger.tag.id3.framebody.FrameBody" + str2).newInstance();
                this.f35855h.mo31945q(this);
                Logger logger2 = C9192h.f35863g;
                logger2.config("Created empty frame of type" + this.f35818i + "with frame body of" + str2);
            } else if (C9238m.m49073l(str)) {
                str2 = C9238m.m49062a(str);
                this.f35855h = (C9190g) Class.forName("org.jaudiotagger.tag.id3.framebody.FrameBody" + str2).newInstance();
                this.f35855h.mo31945q(this);
                Logger logger22 = C9192h.f35863g;
                logger22.config("Created empty frame of type" + this.f35818i + "with frame body of" + str2);
            }
        }
        str2 = str;
        try {
            this.f35855h = (C9190g) Class.forName("org.jaudiotagger.tag.id3.framebody.FrameBody" + str2).newInstance();
        } catch (ClassNotFoundException e) {
            C9192h.f35863g.log(Level.SEVERE, e.getMessage(), e);
            this.f35855h = new C9228z(str);
        } catch (InstantiationException e2) {
            C9192h.f35863g.log(Level.SEVERE, e2.getMessage(), e2);
            throw new RuntimeException(e2);
        } catch (IllegalAccessException e3) {
            C9192h.f35863g.log(Level.SEVERE, e3.getMessage(), e3);
            throw new RuntimeException(e3);
        }
        this.f35855h.mo31945q(this);
        Logger logger222 = C9192h.f35863g;
        logger222.config("Created empty frame of type" + this.f35818i + "with frame body of" + str2);
    }

    public C9248u(C9176c cVar) throws C9125e {
        C9192h.f35863g.config("Creating frame from a frame of a different version");
        if (!(cVar instanceof C9248u)) {
            if (cVar instanceof C9185e0) {
                m49129x(new C9253z(cVar));
            } else if (cVar instanceof C9253z) {
                m49129x((C9253z) cVar);
            }
            this.f35855h.mo31945q(this);
            C9192h.f35863g.config("Created frame from a frame of a different version");
            return;
        }
        throw new UnsupportedOperationException("Copy Constructor not called. Please type cast the argument");
    }

    public C9248u(ByteBuffer byteBuffer, String str) throws C9125e, C9124d {
        mo31868v(str);
        mo31887i(byteBuffer);
    }
}
