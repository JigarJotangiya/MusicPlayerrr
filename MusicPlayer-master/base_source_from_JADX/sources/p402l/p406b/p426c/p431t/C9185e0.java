package p402l.p406b.p426c.p431t;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p425b.C9120d;
import p402l.p406b.p426c.C9121a;
import p402l.p406b.p426c.C9124d;
import p402l.p406b.p426c.C9125e;
import p402l.p406b.p426c.C9126f;
import p402l.p406b.p426c.C9127g;
import p402l.p406b.p426c.C9134n;
import p402l.p406b.p426c.p429r.C9154i;
import p402l.p406b.p426c.p431t.C9176c;
import p402l.p406b.p426c.p431t.C9253z;
import p402l.p406b.p426c.p431t.p432k0.C9203c;
import p402l.p406b.p426c.p431t.p432k0.C9205d;
import p402l.p406b.p426c.p431t.p432k0.C9206d0;
import p402l.p406b.p426c.p431t.p432k0.C9207e;
import p402l.p406b.p426c.p431t.p432k0.C9211i;
import p402l.p406b.p426c.p431t.p432k0.C9212j;
import p402l.p406b.p426c.p431t.p432k0.C9213k;
import p402l.p406b.p426c.p431t.p432k0.C9219q;
import p402l.p406b.p426c.p431t.p432k0.C9220r;
import p402l.p406b.p426c.p431t.p432k0.C9221s;
import p402l.p406b.p426c.p431t.p432k0.C9224v;
import p402l.p406b.p426c.p431t.p432k0.C9227y;
import p402l.p406b.p426c.p431t.p432k0.C9228z;
import p402l.p406b.p426c.p434u.C9258c;
import p402l.p406b.p426c.p434u.C9259d;
import p402l.p406b.p426c.p434u.C9260e;
import p402l.p406b.p426c.p434u.C9261f;
import p402l.p406b.p426c.p434u.C9263h;
import p402l.p406b.p426c.p434u.C9264i;
import p402l.p406b.p426c.p434u.C9267l;
import p402l.p406b.p441d.C9300a;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.t.e0 */
/* compiled from: ID3v24Frame */
public class C9185e0 extends C9176c {

    /* renamed from: p */
    private static Pattern f35850p = Pattern.compile("[A-Z][0-9A-Z]{3}");

    /* renamed from: n */
    private int f35851n;

    /* renamed from: o */
    private int f35852o;

    public C9185e0() {
    }

    /* renamed from: A */
    private void m48826A(ByteBuffer byteBuffer) throws C9125e {
        int a = C9229l.m49050a(byteBuffer);
        this.f35819j = a;
        if (a < 0) {
            Logger logger = C9192h.f35863g;
            logger.warning(mo31861o() + ":" + "Invalid Frame size:" + this.f35818i);
            throw new C9125e(this.f35818i + " is invalid frame");
        } else if (a == 0) {
            Logger logger2 = C9192h.f35863g;
            logger2.warning(mo31861o() + ":" + "Empty Frame:" + this.f35818i);
            byteBuffer.get();
            byteBuffer.get();
            throw new C9121a(this.f35818i + " is empty frame");
        } else if (a <= byteBuffer.remaining() - 2) {
            m48827x(byteBuffer);
        } else {
            Logger logger3 = C9192h.f35863g;
            logger3.warning(mo31861o() + ":" + "Invalid Frame size larger than size before mp3 audio:" + this.f35818i);
            throw new C9125e(this.f35818i + " is invalid frame");
        }
    }

    /* renamed from: x */
    private void m48827x(ByteBuffer byteBuffer) throws C9125e {
        if (this.f35819j > 127) {
            int position = byteBuffer.position();
            byteBuffer.position(position - mo31860n());
            int i = byteBuffer.getInt();
            byteBuffer.position(position - mo31860n());
            boolean d = C9229l.m49053d(byteBuffer);
            byteBuffer.position(position);
            if (d) {
                Logger logger = C9192h.f35863g;
                logger.warning(mo31861o() + ":" + "Frame size is NOT stored as a sync safe integer:" + this.f35818i);
                if (i <= byteBuffer.remaining() - (-mo31920z())) {
                    this.f35819j = i;
                    return;
                }
                Logger logger2 = C9192h.f35863g;
                logger2.warning(mo31861o() + ":" + "Invalid Frame size larger than size before mp3 audio:" + this.f35818i);
                throw new C9125e(this.f35818i + " is invalid frame");
            }
            byte[] bArr = new byte[mo31860n()];
            byteBuffer.position(this.f35819j + position + mo31920z());
            if (byteBuffer.remaining() < mo31860n()) {
                byteBuffer.position(position);
                return;
            }
            byteBuffer.get(bArr, 0, mo31860n());
            byteBuffer.position(position);
            if (mo31918B(new String(bArr)) || C9229l.m49052c(bArr)) {
                return;
            }
            if (i > byteBuffer.remaining() - mo31920z()) {
                byteBuffer.position(position);
                return;
            }
            byte[] bArr2 = new byte[mo31860n()];
            byteBuffer.position(position + i + mo31920z());
            if (byteBuffer.remaining() >= mo31860n()) {
                byteBuffer.get(bArr2, 0, mo31860n());
                String str = new String(bArr2);
                byteBuffer.position(position);
                if (mo31918B(str)) {
                    this.f35819j = i;
                    Logger logger3 = C9192h.f35863g;
                    logger3.warning(mo31861o() + ":" + "Assuming frame size is NOT stored as a sync safe integer:" + this.f35818i);
                } else if (C9229l.m49052c(bArr2)) {
                    this.f35819j = i;
                    Logger logger4 = C9192h.f35863g;
                    logger4.warning(mo31861o() + ":" + "Assuming frame size is NOT stored as a sync safe integer:" + this.f35818i);
                }
            } else {
                byteBuffer.position(position);
                if (byteBuffer.remaining() == 0) {
                    this.f35819j = i;
                }
            }
        }
    }

    /* renamed from: y */
    private void m48828y(C9253z zVar) throws C9125e {
        this.f35818i = C9238m.m49065d(zVar.mo31857g());
        Logger logger = C9192h.f35863g;
        logger.finer("Creating V24frame from v23:" + zVar.mo31857g() + ":" + this.f35818i);
        if (zVar.mo31934j() instanceof C9228z) {
            C9228z zVar2 = new C9228z((C9228z) zVar.mo31934j());
            this.f35855h = zVar2;
            zVar2.mo31945q(this);
            this.f35818i = zVar.mo31857g();
            Logger logger2 = C9192h.f35863g;
            logger2.finer("V3:UnsupportedBody:Orig id is:" + zVar.mo31857g() + ":New id is:" + this.f35818i);
        } else if (this.f35818i != null) {
            if (!zVar.mo31857g().equals("TXXX") || !((C9224v) zVar.mo31934j()).mo32022A().equals("MOOD")) {
                Logger logger3 = C9192h.f35863g;
                logger3.finer("V3:Orig id is:" + zVar.mo31857g() + ":New id is:" + this.f35818i);
                C9190g gVar = (C9190g) C9238m.m49067f(zVar.mo31934j());
                this.f35855h = gVar;
                gVar.mo31945q(this);
                return;
            }
            C9220r rVar = new C9220r((C9224v) zVar.mo31934j());
            this.f35855h = rVar;
            rVar.mo31945q(this);
            this.f35818i = this.f35855h.mo31857g();
        } else if (C9238m.m49074m(zVar.mo31857g())) {
            String i = C9238m.m49070i(zVar.mo31857g());
            this.f35818i = i;
            if (i != null) {
                Logger logger4 = C9192h.f35863g;
                logger4.config("V3:Orig id is:" + zVar.mo31857g() + ":New id is:" + this.f35818i);
                C9203c s = mo31865s(this.f35818i, (C9203c) zVar.mo31934j());
                this.f35855h = s;
                s.mo31945q(this);
                return;
            }
            C9207e eVar = new C9207e((C9203c) zVar.mo31934j());
            this.f35855h = eVar;
            eVar.mo31945q(this);
            this.f35818i = zVar.mo31857g();
            Logger logger5 = C9192h.f35863g;
            logger5.finer("V3:Deprecated:Orig id is:" + zVar.mo31857g() + ":New id is:" + this.f35818i);
        } else {
            C9228z zVar3 = new C9228z((C9228z) zVar.mo31934j());
            this.f35855h = zVar3;
            zVar3.mo31945q(this);
            this.f35818i = zVar.mo31857g();
            Logger logger6 = C9192h.f35863g;
            logger6.finer("V3:Unknown:Orig id is:" + zVar.mo31857g() + ":New id is:" + this.f35818i);
        }
    }

    /* renamed from: B */
    public boolean mo31918B(String str) {
        return f35850p.matcher(str).matches();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9185e0)) {
            return false;
        }
        C9185e0 e0Var = (C9185e0) obj;
        if (!C9300a.m49299b(this.f35821l, e0Var.f35821l) || !C9300a.m49299b(this.f35822m, e0Var.f35822m) || !super.equals(e0Var)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo31500f() {
        return C9189f0.m48856k().mo31958e(mo31497D());
    }

    /* renamed from: h */
    public int mo31919h() {
        return this.f35855h.mo31919h() + 10;
    }

    /* renamed from: i */
    public void mo31887i(ByteBuffer byteBuffer) throws C9125e, C9124d {
        int i;
        String u = mo31867u(byteBuffer);
        int i2 = 1;
        if (mo31918B(u)) {
            m48826A(byteBuffer);
            this.f35821l = new C9187b(byteBuffer.get());
            C9186a aVar = new C9186a(byteBuffer.get());
            this.f35822m = aVar;
            int i3 = -1;
            if (aVar.mo31924g()) {
                this.f35852o = byteBuffer.get();
            } else {
                i2 = 0;
            }
            if (((C9186a) this.f35822m).mo31923f()) {
                i2++;
                this.f35851n = byteBuffer.get();
            }
            if (((C9186a) this.f35822m).mo31922e()) {
                i3 = C9229l.m49050a(byteBuffer);
                i2 += 4;
                Logger logger = C9192h.f35863g;
                logger.config(mo31861o() + ":" + "Frame Size Is:" + this.f35819j + " Data Length Size:" + i3);
            }
            int i4 = this.f35819j - i2;
            ByteBuffer slice = byteBuffer.slice();
            slice.limit(i4);
            if (((C9186a) this.f35822m).mo31926i()) {
                slice = C9240o.m49081b(slice);
                i = slice.limit();
                Logger logger2 = C9192h.f35863g;
                logger2.config(mo31861o() + ":" + "Frame Size After Syncing is:" + i);
            } else {
                i = i4;
            }
            try {
                if (((C9186a) this.f35822m).mo31921d()) {
                    ByteBuffer a = C9196j.m48899a(u, mo31861o(), byteBuffer, i3, i4);
                    if (((C9186a) this.f35822m).mo31923f()) {
                        this.f35855h = mo31866t(u, a, i3);
                    } else {
                        this.f35855h = mo31864r(u, a, i3);
                    }
                } else if (((C9186a) this.f35822m).mo31923f()) {
                    byteBuffer.slice().limit(i4);
                    this.f35855h = mo31866t(u, byteBuffer, this.f35819j);
                } else {
                    this.f35855h = mo31864r(u, slice, i);
                }
                if (!(this.f35855h instanceof C9206d0)) {
                    Logger logger3 = C9192h.f35863g;
                    logger3.config(mo31861o() + ":" + "Converted frame body with:" + u + " to deprecated framebody");
                    this.f35855h = new C9207e((C9203c) this.f35855h);
                }
            } finally {
                byteBuffer.position(byteBuffer.position() + i4);
            }
        } else {
            Logger logger4 = C9192h.f35863g;
            logger4.config(mo31861o() + ":" + "Invalid identifier:" + u);
            byteBuffer.position(byteBuffer.position() - (mo31860n() - 1));
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
        C9192h.f35863g.config("Writing frame to file:" + mo31857g());
        ByteBuffer allocate = ByteBuffer.allocate(10);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        ((C9203c) this.f35855h).mo31961w(byteArrayOutputStream2);
        byte[] byteArray = byteArrayOutputStream2.toByteArray();
        boolean z = C9134n.m48562h().mo31728C() && C9240o.m49080a(byteArray);
        if (z) {
            byteArray = C9240o.m49082c(byteArray);
            C9192h.f35863g.config("bodybytebuffer:sizeafterunsynchronisation:" + byteArray.length);
        }
        if (mo31857g().length() == 3) {
            this.f35818i += ' ';
        }
        allocate.put(C9057i.m48300c(mo31857g(), "ISO-8859-1"), 0, 4);
        int length = byteArray.length;
        C9192h.f35863g.fine("Frame Size Is:" + length);
        allocate.put(C9229l.m49054e(length));
        allocate.put(this.f35821l.mo31875b());
        ((C9186a) this.f35822m).mo31931n();
        if (z) {
            ((C9186a) this.f35822m).mo31928k();
        } else {
            ((C9186a) this.f35822m).mo31932o();
        }
        ((C9186a) this.f35822m).mo31929l();
        ((C9186a) this.f35822m).mo31930m();
        allocate.put(this.f35822m.mo31870a());
        try {
            byteArrayOutputStream.write(allocate.array());
            if (((C9186a) this.f35822m).mo31923f()) {
                byteArrayOutputStream.write(this.f35851n);
            }
            if (((C9186a) this.f35822m).mo31924g()) {
                byteArrayOutputStream.write(this.f35852o);
            }
            byteArrayOutputStream.write(byteArray);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo31920z() {
        return 2;
    }

    /* renamed from: l.b.c.t.e0$a */
    /* compiled from: ID3v24Frame */
    class C9186a extends C9176c.C9177a {
        C9186a() {
            super(C9185e0.this);
        }

        /* renamed from: a */
        public byte mo31870a() {
            return this.f35823a;
        }

        /* renamed from: d */
        public boolean mo31921d() {
            return (this.f35823a & 8) > 0;
        }

        /* renamed from: e */
        public boolean mo31922e() {
            return (this.f35823a & 1) > 0;
        }

        /* renamed from: f */
        public boolean mo31923f() {
            return (this.f35823a & 4) > 0;
        }

        /* renamed from: g */
        public boolean mo31924g() {
            return (this.f35823a & 64) > 0;
        }

        /* renamed from: h */
        public boolean mo31925h() {
            byte b = this.f35823a;
            return (b & 128) > 0 || (b & 32) > 0 || (b & 16) > 0;
        }

        /* renamed from: i */
        public boolean mo31926i() {
            return (this.f35823a & 2) > 0;
        }

        /* renamed from: j */
        public void mo31927j() {
            if (mo31925h()) {
                Logger logger = C9192h.f35863g;
                logger.warning(C9185e0.this.mo31861o() + ":" + C9185e0.this.f35818i + ":Unknown Encoding Flags:" + C9120d.m48553a(this.f35823a));
            }
            if (mo31921d()) {
                C9192h.f35863g.warning(C9118b.MP3_FRAME_IS_COMPRESSED.getMsg(C9185e0.this.mo31861o(), C9185e0.this.f35818i));
            }
            if (mo31923f()) {
                C9192h.f35863g.warning(C9118b.MP3_FRAME_IS_ENCRYPTED.getMsg(C9185e0.this.mo31861o(), C9185e0.this.f35818i));
            }
            if (mo31924g()) {
                C9192h.f35863g.config(C9118b.MP3_FRAME_IS_GROUPED.getMsg(C9185e0.this.mo31861o(), C9185e0.this.f35818i));
            }
            if (mo31926i()) {
                C9192h.f35863g.config(C9118b.MP3_FRAME_IS_UNSYNCHRONISED.getMsg(C9185e0.this.mo31861o(), C9185e0.this.f35818i));
            }
            if (mo31922e()) {
                C9192h.f35863g.config(C9118b.MP3_FRAME_IS_DATA_LENGTH_INDICATOR.getMsg(C9185e0.this.mo31861o(), C9185e0.this.f35818i));
            }
        }

        /* renamed from: k */
        public void mo31928k() {
            this.f35823a = (byte) (this.f35823a | 2);
        }

        /* renamed from: l */
        public void mo31929l() {
            this.f35823a = (byte) (this.f35823a & -9);
        }

        /* renamed from: m */
        public void mo31930m() {
            this.f35823a = (byte) (this.f35823a & -2);
        }

        /* renamed from: n */
        public void mo31931n() {
            if (mo31925h()) {
                Logger logger = C9192h.f35863g;
                logger.warning(C9185e0.this.mo31861o() + ":" + C9185e0.this.mo31857g() + ":Unsetting Unknown Encoding Flags:" + C9120d.m48553a(this.f35823a));
                byte b = (byte) (this.f35823a & Byte.MAX_VALUE);
                this.f35823a = b;
                byte b2 = (byte) (b & -33);
                this.f35823a = b2;
                this.f35823a = (byte) (b2 & -17);
            }
        }

        /* renamed from: o */
        public void mo31932o() {
            this.f35823a = (byte) (this.f35823a & -3);
        }

        C9186a(byte b) {
            super(C9185e0.this, b);
            mo31927j();
        }
    }

    /* renamed from: l.b.c.t.e0$b */
    /* compiled from: ID3v24Frame */
    class C9187b extends C9176c.C9178b {
        C9187b() {
            super(C9185e0.this);
        }

        /* renamed from: c */
        private byte m48852c(byte b) {
            byte b2 = (b & 64) != 0 ? (byte) 32 : 0;
            return (b & 128) != 0 ? (byte) (b2 | 64) : b2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo31933d() {
            if (C9189f0.m48856k().mo31959f(C9185e0.this.mo31857g())) {
                byte b = (byte) (this.f35825b | 32);
                this.f35825b = b;
                this.f35825b = (byte) (b & -65);
                return;
            }
            byte b2 = (byte) (this.f35825b & -33);
            this.f35825b = b2;
            this.f35825b = (byte) (b2 & -65);
        }

        C9187b(byte b) {
            super(C9185e0.this);
            this.f35824a = b;
            this.f35825b = b;
            mo31933d();
        }

        C9187b(C9253z.C9255b bVar) {
            super(C9185e0.this);
            byte c = m48852c(bVar.mo31874a());
            this.f35824a = c;
            this.f35825b = c;
            mo31933d();
        }
    }

    public C9185e0(String str) {
        super(str);
        this.f35821l = new C9187b();
        this.f35822m = new C9186a();
    }

    public C9185e0(C9176c cVar) throws C9125e {
        if (!(cVar instanceof C9185e0)) {
            boolean z = cVar instanceof C9253z;
            if (z) {
                this.f35821l = new C9187b((C9253z.C9255b) cVar.mo31862p());
                this.f35822m = new C9186a(cVar.mo31858l().mo31870a());
            } else {
                this.f35821l = new C9187b();
                this.f35822m = new C9186a();
            }
            if (z) {
                m48828y((C9253z) cVar);
            } else if (cVar instanceof C9248u) {
                m48828y(new C9253z(cVar));
            }
            this.f35855h.mo31945q(this);
            return;
        }
        throw new UnsupportedOperationException("Copy Constructor not called. Please type cast the argument");
    }

    public C9185e0(C9267l lVar) throws C9127g {
        String g = lVar.mo31857g();
        if (g.equals("IND")) {
            throw new C9127g("Cannot create ID3v2.40 frame from Lyrics3 indications field.");
        } else if (g.equals("LYR")) {
            C9264i iVar = (C9264i) lVar.mo31934j();
            Iterator<C9154i> p = iVar.mo31944p();
            boolean w = iVar.mo32096w();
            C9211i iVar2 = new C9211i(0, "ENG", 2, 1, BuildConfig.FLAVOR, new byte[0]);
            C9227y yVar = new C9227y((byte) 0, "ENG", BuildConfig.FLAVOR, BuildConfig.FLAVOR);
            while (p.hasNext()) {
                C9154i next = p.next();
                if (!w) {
                    yVar.mo32030x(next);
                }
            }
            if (w) {
                this.f35855h = iVar2;
                iVar2.mo31945q(this);
                return;
            }
            this.f35855h = yVar;
            yVar.mo31945q(this);
        } else if (g.equals("INF")) {
            C9205d dVar = new C9205d((byte) 0, "ENG", BuildConfig.FLAVOR, ((C9263h) lVar.mo31934j()).mo32093u());
            this.f35855h = dVar;
            dVar.mo31945q(this);
        } else if (g.equals("AUT")) {
            C9213k kVar = new C9213k((byte) 0, ((C9258c) lVar.mo31934j()).mo32089u());
            this.f35855h = kVar;
            kVar.mo31945q(this);
        } else if (g.equals("EAL")) {
            C9212j jVar = new C9212j((byte) 0, ((C9259d) lVar.mo31934j()).mo32090u());
            this.f35855h = jVar;
            jVar.mo31945q(this);
        } else if (g.equals("EAR")) {
            C9221s sVar = new C9221s((byte) 0, ((C9260e) lVar.mo31934j()).mo32091u());
            this.f35855h = sVar;
            sVar.mo31945q(this);
        } else if (g.equals("ETT")) {
            C9219q qVar = new C9219q((byte) 0, ((C9261f) lVar.mo31934j()).mo32092u());
            this.f35855h = qVar;
            qVar.mo31945q(this);
        } else if (g.equals("IMG")) {
            throw new C9127g("Cannot create ID3v2.40 frame from Lyrics3 image field.");
        } else {
            throw new C9127g("Cannot caret ID3v2.40 frame from " + g + " Lyrics3 field");
        }
    }

    public C9185e0(ByteBuffer byteBuffer, String str) throws C9125e, C9124d {
        mo31868v(str);
        mo31887i(byteBuffer);
    }
}
