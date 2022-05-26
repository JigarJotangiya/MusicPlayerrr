package p402l.p406b.p426c.p431t;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p425b.C9120d;
import p402l.p406b.p426c.C9121a;
import p402l.p406b.p426c.C9124d;
import p402l.p406b.p426c.C9125e;
import p402l.p406b.p426c.C9126f;
import p402l.p406b.p426c.p431t.C9176c;
import p402l.p406b.p426c.p431t.C9185e0;
import p402l.p406b.p426c.p431t.p432k0.C9203c;
import p402l.p406b.p426c.p431t.p432k0.C9204c0;
import p402l.p406b.p426c.p431t.p432k0.C9207e;
import p402l.p406b.p426c.p431t.p432k0.C9228z;
import p402l.p406b.p441d.C9300a;

/* renamed from: l.b.c.t.z */
/* compiled from: ID3v23Frame */
public class C9253z extends C9176c {

    /* renamed from: p */
    private static Pattern f35956p = Pattern.compile("[A-Z][0-9A-Z]{3}");

    /* renamed from: n */
    private int f35957n;

    /* renamed from: o */
    private int f35958o;

    public C9253z() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9253z)) {
            return false;
        }
        C9253z zVar = (C9253z) obj;
        if (!C9300a.m49299b(this.f35821l, zVar.f35821l) || !C9300a.m49299b(this.f35822m, zVar.f35822m) || !super.equals(zVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo31500f() {
        return C9173a0.m48741k().mo31958e(mo31497D());
    }

    /* renamed from: h */
    public int mo31919h() {
        return this.f35855h.mo31919h() + 10;
    }

    /* renamed from: i */
    public void mo31887i(ByteBuffer byteBuffer) throws C9125e, C9124d {
        String u = mo31867u(byteBuffer);
        if (mo32079x(u)) {
            int i = byteBuffer.getInt();
            this.f35819j = i;
            if (i < 0) {
                Logger logger = C9192h.f35863g;
                logger.warning(mo31861o() + ":Invalid Frame Size:" + this.f35819j + ":" + u);
                throw new C9125e(u + " is invalid frame:" + this.f35819j);
            } else if (i == 0) {
                Logger logger2 = C9192h.f35863g;
                logger2.warning(mo31861o() + ":Empty Frame Size:" + u);
                byteBuffer.get();
                byteBuffer.get();
                throw new C9121a(u + " is empty frame");
            } else if (i <= byteBuffer.remaining()) {
                this.f35821l = new C9255b(byteBuffer.get());
                this.f35822m = new C9254a(byteBuffer.get());
                String d = C9238m.m49065d(u);
                if (d == null) {
                    d = C9238m.m49074m(u) ? u : "Unsupported";
                }
                Logger logger3 = C9192h.f35863g;
                logger3.fine(mo31861o() + ":Identifier was:" + u + " reading using:" + d + "with frame size:" + this.f35819j);
                int i2 = 0;
                int i3 = -1;
                if (((C9254a) this.f35822m).mo32080d()) {
                    i3 = byteBuffer.getInt();
                    i2 = 4;
                    Logger logger4 = C9192h.f35863g;
                    logger4.fine(mo31861o() + ":Decompressed frame size is:" + i3);
                }
                if (((C9254a) this.f35822m).mo32081e()) {
                    i2++;
                    this.f35957n = byteBuffer.get();
                }
                if (((C9254a) this.f35822m).mo32082f()) {
                    i2++;
                    this.f35958o = byteBuffer.get();
                }
                if (((C9254a) this.f35822m).mo32083g()) {
                    Logger logger5 = C9192h.f35863g;
                    logger5.severe(mo31861o() + ":InvalidEncodingFlags:" + C9120d.m48553a(((C9254a) this.f35822m).mo31870a()));
                }
                if (!((C9254a) this.f35822m).mo32080d() || i3 <= this.f35819j * 100) {
                    int i4 = this.f35819j - i2;
                    if (i4 > 0) {
                        try {
                            if (((C9254a) this.f35822m).mo32080d()) {
                                ByteBuffer a = C9196j.m48899a(u, mo31861o(), byteBuffer, i3, i4);
                                if (((C9254a) this.f35822m).mo32081e()) {
                                    this.f35855h = mo31866t(d, a, i3);
                                } else {
                                    this.f35855h = mo31864r(d, a, i3);
                                }
                            } else if (((C9254a) this.f35822m).mo32081e()) {
                                this.f35855h = mo31866t(u, byteBuffer, this.f35819j);
                            } else {
                                ByteBuffer slice = byteBuffer.slice();
                                slice.limit(i4);
                                this.f35855h = mo31864r(d, slice, i4);
                            }
                            if (!(this.f35855h instanceof C9204c0)) {
                                Logger logger6 = C9192h.f35863g;
                                logger6.config(mo31861o() + ":Converted frameBody with:" + u + " to deprecated frameBody");
                                this.f35855h = new C9207e((C9203c) this.f35855h);
                            }
                        } finally {
                            byteBuffer.position(byteBuffer.position() + i4);
                        }
                    } else {
                        throw new C9125e(u + " is invalid frame, realframeSize is:" + i4);
                    }
                } else {
                    throw new C9125e(u + " is invalid frame, frame size " + this.f35819j + " cannot be:" + i3 + " when uncompressed");
                }
            } else {
                Logger logger7 = C9192h.f35863g;
                logger7.warning(mo31861o() + ":Invalid Frame size of " + this.f35819j + " larger than size of" + byteBuffer.remaining() + " before mp3 audio:" + u);
                throw new C9125e(u + " is invalid frame:" + this.f35819j + " larger than size of" + byteBuffer.remaining() + " before mp3 audio:" + u);
            }
        } else {
            Logger logger8 = C9192h.f35863g;
            logger8.config(mo31861o() + ":Invalid identifier:" + u);
            byteBuffer.position(byteBuffer.position() - (mo31860n() + -1));
            throw new C9126f(mo31861o() + ":" + u + ":is not a valid ID3v2.30 frame");
        }
    }

    /* renamed from: l */
    public C9176c.C9177a mo31858l() {
        return this.f35822m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public int mo31859m() {
        return 10;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo31860n() {
        return 4;
    }

    /* renamed from: p */
    public C9176c.C9178b mo31862p() {
        return this.f35821l;
    }

    /* renamed from: w */
    public void mo31869w(ByteArrayOutputStream byteArrayOutputStream) {
        C9192h.f35863g.config("Writing frame to buffer:" + mo31857g());
        ByteBuffer allocate = ByteBuffer.allocate(10);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        ((C9203c) this.f35855h).mo31961w(byteArrayOutputStream2);
        if (mo31857g().length() == 3) {
            this.f35818i += ' ';
        }
        allocate.put(C9057i.m48300c(mo31857g(), "ISO-8859-1"), 0, 4);
        int h = this.f35855h.mo31919h();
        C9192h.f35863g.fine("Frame Size Is:" + h);
        allocate.putInt(this.f35855h.mo31919h());
        allocate.put(this.f35821l.mo31875b());
        ((C9254a) this.f35822m).mo32086j();
        ((C9254a) this.f35822m).mo32085i();
        allocate.put(this.f35822m.mo31870a());
        try {
            byteArrayOutputStream.write(allocate.array());
            if (((C9254a) this.f35822m).mo32081e()) {
                byteArrayOutputStream.write(this.f35957n);
            }
            if (((C9254a) this.f35822m).mo32082f()) {
                byteArrayOutputStream.write(this.f35958o);
            }
            byteArrayOutputStream.write(byteArrayOutputStream2.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: x */
    public boolean mo32079x(String str) {
        return f35956p.matcher(str).matches();
    }

    /* renamed from: l.b.c.t.z$a */
    /* compiled from: ID3v23Frame */
    class C9254a extends C9176c.C9177a {
        public C9254a() {
            super(C9253z.this);
        }

        /* renamed from: d */
        public boolean mo32080d() {
            return (this.f35823a & 128) > 0;
        }

        /* renamed from: e */
        public boolean mo32081e() {
            return (this.f35823a & 64) > 0;
        }

        /* renamed from: f */
        public boolean mo32082f() {
            return (this.f35823a & 32) > 0;
        }

        /* renamed from: g */
        public boolean mo32083g() {
            byte b = this.f35823a;
            return (b & 16) > 0 || (b & 8) > 0 || (b & 4) > 0 || (b & 2) > 0 || (b & 1) > 0;
        }

        /* renamed from: h */
        public void mo32084h() {
            if (mo32083g()) {
                Logger logger = C9192h.f35863g;
                logger.warning(C9253z.this.mo31861o() + ":" + C9253z.this.f35818i + ":Unknown Encoding Flags:" + C9120d.m48553a(this.f35823a));
            }
            if (mo32080d()) {
                Logger logger2 = C9192h.f35863g;
                logger2.warning(C9253z.this.mo31861o() + ":" + C9253z.this.f35818i + " is compressed");
            }
            if (mo32081e()) {
                Logger logger3 = C9192h.f35863g;
                logger3.warning(C9253z.this.mo31861o() + ":" + C9253z.this.f35818i + " is encrypted");
            }
            if (mo32082f()) {
                Logger logger4 = C9192h.f35863g;
                logger4.warning(C9253z.this.mo31861o() + ":" + C9253z.this.f35818i + " is grouped");
            }
        }

        /* renamed from: i */
        public void mo32085i() {
            this.f35823a = (byte) (this.f35823a & Byte.MAX_VALUE);
        }

        /* renamed from: j */
        public void mo32086j() {
            if (mo32083g()) {
                Logger logger = C9192h.f35863g;
                logger.warning(C9253z.this.mo31861o() + ":" + C9253z.this.mo31857g() + ":Unsetting Unknown Encoding Flags:" + C9120d.m48553a(this.f35823a));
                byte b = (byte) (this.f35823a & -17);
                this.f35823a = b;
                byte b2 = (byte) (b & -9);
                this.f35823a = b2;
                byte b3 = (byte) (b2 & -5);
                this.f35823a = b3;
                byte b4 = (byte) (b3 & -3);
                this.f35823a = b4;
                this.f35823a = (byte) (b4 & -2);
            }
        }

        public C9254a(byte b) {
            super(C9253z.this, b);
            mo32084h();
        }
    }

    public C9253z(String str) {
        super(str);
        this.f35821l = new C9255b();
        this.f35822m = new C9254a();
    }

    /* renamed from: l.b.c.t.z$b */
    /* compiled from: ID3v23Frame */
    class C9255b extends C9176c.C9178b {
        public C9255b() {
            super(C9253z.this);
            this.f35824a = 0;
            this.f35825b = 0;
        }

        /* renamed from: c */
        private byte m49178c(byte b) {
            byte b2 = (b & 32) != 0 ? (byte) 64 : 0;
            return (b & 64) != 0 ? (byte) (b2 | Byte.MIN_VALUE) : b2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo32087d() {
            if (C9173a0.m48741k().mo31959f(C9253z.this.mo31857g())) {
                byte b = (byte) (this.f35825b | 64);
                this.f35825b = b;
                this.f35825b = (byte) (b & Byte.MAX_VALUE);
                return;
            }
            byte b2 = (byte) (this.f35825b & -65);
            this.f35825b = b2;
            this.f35825b = (byte) (b2 & Byte.MAX_VALUE);
        }

        C9255b(byte b) {
            super(C9253z.this);
            this.f35824a = b;
            this.f35825b = b;
            mo32087d();
        }

        C9255b(C9185e0.C9187b bVar) {
            super(C9253z.this);
            byte c = m49178c(bVar.mo31874a());
            this.f35824a = c;
            this.f35825b = c;
            mo32087d();
        }
    }

    public C9253z(C9176c cVar) throws C9125e {
        C9192h.f35863g.finer("Creating frame from a frame of a different version");
        if (!(cVar instanceof C9253z)) {
            boolean z = cVar instanceof C9185e0;
            if (z) {
                this.f35821l = new C9255b((C9185e0.C9187b) cVar.mo31862p());
                this.f35822m = new C9254a(cVar.mo31858l().mo31870a());
            }
            if (z) {
                if (cVar.mo31934j() instanceof C9228z) {
                    C9228z zVar = new C9228z((C9228z) cVar.mo31934j());
                    this.f35855h = zVar;
                    zVar.mo31945q(this);
                    this.f35818i = cVar.mo31857g();
                    Logger logger = C9192h.f35863g;
                    logger.config("UNKNOWN:Orig id is:" + cVar.mo31857g() + ":New id is:" + this.f35818i);
                    return;
                } else if (cVar.mo31934j() instanceof C9207e) {
                    if (C9238m.m49074m(cVar.mo31857g())) {
                        C9203c x = ((C9207e) cVar.mo31934j()).mo31977x();
                        this.f35855h = x;
                        x.mo31945q(this);
                        C9190g gVar = this.f35855h;
                        gVar.mo31947s(C9239n.m49078b(this, gVar.mo31942n()));
                        this.f35818i = cVar.mo31857g();
                        Logger logger2 = C9192h.f35863g;
                        logger2.config("DEPRECATED:Orig id is:" + cVar.mo31857g() + ":New id is:" + this.f35818i);
                    } else {
                        C9207e eVar = new C9207e((C9207e) cVar.mo31934j());
                        this.f35855h = eVar;
                        eVar.mo31945q(this);
                        C9190g gVar2 = this.f35855h;
                        gVar2.mo31947s(C9239n.m49078b(this, gVar2.mo31942n()));
                        this.f35818i = cVar.mo31857g();
                        Logger logger3 = C9192h.f35863g;
                        logger3.config("DEPRECATED:Orig id is:" + cVar.mo31857g() + ":New id is:" + this.f35818i);
                        return;
                    }
                } else if (C9238m.m49075n(cVar.mo31857g())) {
                    C9192h.f35863g.finer("isID3v24FrameIdentifier");
                    String e = C9238m.m49066e(cVar.mo31857g());
                    this.f35818i = e;
                    if (e != null) {
                        Logger logger4 = C9192h.f35863g;
                        logger4.finer("V4:Orig id is:" + cVar.mo31857g() + ":New id is:" + this.f35818i);
                        C9190g gVar3 = (C9190g) C9238m.m49067f(cVar.mo31934j());
                        this.f35855h = gVar3;
                        gVar3.mo31945q(this);
                        C9190g gVar4 = this.f35855h;
                        gVar4.mo31947s(C9239n.m49078b(this, gVar4.mo31942n()));
                        return;
                    }
                    String j = C9238m.m49071j(cVar.mo31857g());
                    this.f35818i = j;
                    if (j != null) {
                        Logger logger5 = C9192h.f35863g;
                        logger5.finer("V4:Orig id is:" + cVar.mo31857g() + ":New id is:" + this.f35818i);
                        C9203c s = mo31865s(this.f35818i, (C9203c) cVar.mo31934j());
                        this.f35855h = s;
                        s.mo31945q(this);
                        C9190g gVar5 = this.f35855h;
                        gVar5.mo31947s(C9239n.m49078b(this, gVar5.mo31942n()));
                        return;
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((C9203c) cVar.mo31934j()).mo31961w(byteArrayOutputStream);
                    String g = cVar.mo31857g();
                    this.f35818i = g;
                    C9228z zVar2 = new C9228z(g, byteArrayOutputStream.toByteArray());
                    this.f35855h = zVar2;
                    zVar2.mo31945q(this);
                    Logger logger6 = C9192h.f35863g;
                    logger6.finer("V4:Orig id is:" + cVar.mo31857g() + ":New Id Unsupported is:" + this.f35818i);
                    return;
                } else {
                    Logger logger7 = C9192h.f35863g;
                    logger7.severe("Orig id is:" + cVar.mo31857g() + "Unable to create Frame Body");
                    throw new C9125e("Orig id is:" + cVar.mo31857g() + "Unable to create Frame Body");
                }
            } else if (cVar instanceof C9248u) {
                if (C9238m.m49073l(cVar.mo31857g())) {
                    String a = C9238m.m49062a(cVar.mo31857g());
                    this.f35818i = a;
                    if (a != null) {
                        Logger logger8 = C9192h.f35863g;
                        logger8.config("V3:Orig id is:" + cVar.mo31857g() + ":New id is:" + this.f35818i);
                        C9190g gVar6 = (C9190g) C9238m.m49067f(cVar.mo31934j());
                        this.f35855h = gVar6;
                        gVar6.mo31945q(this);
                        return;
                    } else if (C9238m.m49073l(cVar.mo31857g())) {
                        String g2 = C9238m.m49068g(cVar.mo31857g());
                        this.f35818i = g2;
                        if (g2 != null) {
                            Logger logger9 = C9192h.f35863g;
                            logger9.config("V22Orig id is:" + cVar.mo31857g() + "New id is:" + this.f35818i);
                            C9203c s2 = mo31865s(this.f35818i, (C9203c) cVar.mo31934j());
                            this.f35855h = s2;
                            s2.mo31945q(this);
                            return;
                        }
                        C9207e eVar2 = new C9207e((C9203c) cVar.mo31934j());
                        this.f35855h = eVar2;
                        eVar2.mo31945q(this);
                        this.f35818i = cVar.mo31857g();
                        Logger logger10 = C9192h.f35863g;
                        logger10.config("Deprecated:V22:orig id id is:" + cVar.mo31857g() + ":New id is:" + this.f35818i);
                        return;
                    }
                } else {
                    C9228z zVar3 = new C9228z((C9228z) cVar.mo31934j());
                    this.f35855h = zVar3;
                    zVar3.mo31945q(this);
                    this.f35818i = cVar.mo31857g();
                    Logger logger11 = C9192h.f35863g;
                    logger11.config("UNKNOWN:Orig id is:" + cVar.mo31857g() + ":New id is:" + this.f35818i);
                    return;
                }
            }
            Logger logger12 = C9192h.f35863g;
            logger12.warning("Frame is unknown version:" + cVar.getClass());
            return;
        }
        throw new UnsupportedOperationException("Copy Constructor not called. Please type cast the argument");
    }

    public C9253z(ByteBuffer byteBuffer, String str) throws C9125e, C9124d {
        mo31868v(str);
        mo31887i(byteBuffer);
    }
}
