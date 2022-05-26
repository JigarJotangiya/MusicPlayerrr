package p402l.p406b.p426c.p431t;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.C9121a;
import p402l.p406b.p426c.C9122b;
import p402l.p406b.p426c.C9123c;
import p402l.p406b.p426c.C9124d;
import p402l.p406b.p426c.C9125e;
import p402l.p406b.p426c.C9126f;
import p402l.p406b.p426c.C9127g;
import p402l.p406b.p426c.C9128h;
import p402l.p406b.p426c.C9129i;
import p402l.p406b.p426c.C9131k;
import p402l.p406b.p426c.C9132l;
import p402l.p406b.p426c.C9133m;
import p402l.p406b.p426c.C9134n;
import p402l.p406b.p426c.p431t.C9180d;
import p402l.p406b.p426c.p431t.p432k0.C9205d;
import p402l.p406b.p426c.p431t.p432k0.C9212j;
import p402l.p406b.p426c.p431t.p432k0.C9214l;
import p402l.p406b.p426c.p431t.p432k0.C9216n;
import p402l.p406b.p426c.p431t.p432k0.C9219q;
import p402l.p406b.p426c.p431t.p432k0.C9221s;
import p402l.p406b.p426c.p431t.p432k0.C9223u;
import p402l.p406b.p426c.p431t.p432k0.C9228z;
import p402l.p406b.p426c.p434u.C9256a;
import p402l.p406b.p426c.p434u.C9266k;
import p402l.p406b.p426c.p434u.C9267l;
import p402l.p406b.p426c.p439x.C9290a;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.t.h0 */
/* compiled from: ID3v24Tag */
public class C9193h0 extends C9180d {

    /* renamed from: E */
    protected static int f35864E = 6;

    /* renamed from: F */
    protected static int f35865F = 1;

    /* renamed from: G */
    protected static int f35866G = 6;

    /* renamed from: H */
    protected static int f35867H = 2;

    /* renamed from: I */
    protected static int f35868I = 5;

    /* renamed from: J */
    protected static int f35869J = 1;

    /* renamed from: K */
    protected static int f35870K = 1;

    /* renamed from: A */
    protected byte f35871A = 0;

    /* renamed from: B */
    protected byte f35872B = 0;

    /* renamed from: C */
    protected byte f35873C = 0;

    /* renamed from: D */
    protected byte f35874D = 0;

    /* renamed from: r */
    protected boolean f35875r = false;

    /* renamed from: s */
    protected boolean f35876s = false;

    /* renamed from: t */
    protected boolean f35877t = false;

    /* renamed from: u */
    protected boolean f35878u = false;

    /* renamed from: v */
    protected int f35879v = 0;

    /* renamed from: w */
    protected boolean f35880w = false;

    /* renamed from: x */
    protected boolean f35881x = false;

    /* renamed from: y */
    protected boolean f35882y = false;

    /* renamed from: z */
    protected byte f35883z = 0;

    public C9193h0() {
        this.f35837j = new LinkedHashMap();
        this.f35838k = new LinkedHashMap();
    }

    /* renamed from: V */
    private void m48875V(ByteBuffer byteBuffer, int i) throws C9127g {
        int i2 = byteBuffer.getInt();
        if (i2 > f35864E) {
            byteBuffer.get();
            byte b = byteBuffer.get();
            boolean z = (b & 64) != 0;
            this.f35881x = z;
            this.f35875r = (b & 32) != 0;
            this.f35882y = (b & 16) != 0;
            if (z) {
                byteBuffer.get();
            }
            if (this.f35875r) {
                byteBuffer.get();
                int i3 = f35868I;
                byte[] bArr = new byte[i3];
                byteBuffer.get(bArr, 0, i3);
                this.f35879v = 0;
                for (int i4 = 0; i4 < f35868I; i4++) {
                    int i5 = this.f35879v << 8;
                    this.f35879v = i5;
                    this.f35879v = i5 + bArr[i4];
                }
            }
            if (this.f35882y) {
                byteBuffer.get();
                byte[] bArr2 = new byte[1];
                byteBuffer.get(bArr2, 0, 1);
                this.f35872B = (byte) ((bArr2[0] & -64) >> 6);
                this.f35873C = (byte) ((bArr2[0] & 32) >> 5);
                this.f35874D = (byte) ((bArr2[0] & 24) >> 3);
                this.f35883z = (byte) ((bArr2[0] & 4) >> 2);
                this.f35871A = (byte) (bArr2[0] & 6);
                return;
            }
            return;
        }
        throw new C9127g(C9118b.ID3_EXTENDED_HEADER_SIZE_TOO_SMALL.getMsg(mo31847k(), Integer.valueOf(i2)));
    }

    /* renamed from: X */
    private void m48876X(ByteBuffer byteBuffer) throws C9131k {
        byte b = byteBuffer.get();
        this.f35878u = (b & 128) != 0;
        this.f35877t = (b & 64) != 0;
        this.f35876s = (b & 32) != 0;
        this.f35880w = (b & 16) != 0;
        if ((b & 8) != 0) {
            C9172a.f35808i.warning(C9118b.ID3_INVALID_OR_UNKNOWN_FLAG_SET.getMsg(mo31847k(), 8));
        }
        if ((b & 4) != 0) {
            C9172a.f35808i.warning(C9118b.ID3_INVALID_OR_UNKNOWN_FLAG_SET.getMsg(mo31847k(), 4));
        }
        if ((b & 2) != 0) {
            C9172a.f35808i.warning(C9118b.ID3_INVALID_OR_UNKNOWN_FLAG_SET.getMsg(mo31847k(), 2));
        }
        if ((b & 1) != 0) {
            C9172a.f35808i.warning(C9118b.ID3_INVALID_OR_UNKNOWN_FLAG_SET.getMsg(mo31847k(), 1));
        }
        if (mo31954U()) {
            C9172a.f35808i.config(C9118b.ID3_TAG_UNSYNCHRONIZED.getMsg(mo31847k()));
        }
        if (this.f35877t) {
            C9172a.f35808i.config(C9118b.ID3_TAG_EXTENDED.getMsg(mo31847k()));
        }
        if (this.f35876s) {
            C9172a.f35808i.config(C9118b.ID3_TAG_EXPERIMENTAL.getMsg(mo31847k()));
        }
        if (this.f35880w) {
            C9172a.f35808i.warning(C9118b.ID3_TAG_FOOTER.getMsg(mo31847k()));
        }
    }

    /* renamed from: Y */
    private ByteBuffer m48877Y(int i, int i2) throws IOException {
        int i3;
        this.f35878u = false;
        this.f35877t = false;
        this.f35876s = false;
        this.f35880w = false;
        ByteBuffer allocate = ByteBuffer.allocate(10);
        allocate.put(C9180d.f35836q);
        allocate.put(mo31848l());
        allocate.put(mo31849m());
        byte b = mo31954U() ? (byte) 128 : 0;
        if (this.f35877t) {
            b = (byte) (b | 64);
        }
        if (this.f35876s) {
            b = (byte) (b | 32);
        }
        if (this.f35880w) {
            b = (byte) (b | 16);
        }
        allocate.put(b);
        if (this.f35877t) {
            i3 = f35864E + 0;
            if (this.f35881x) {
                i3 += f35865F;
            }
            if (this.f35875r) {
                i3 += f35866G;
            }
            if (this.f35882y) {
                i3 += f35867H;
            }
        } else {
            i3 = 0;
        }
        allocate.put(C9229l.m49054e(i + i2 + i3));
        ByteBuffer byteBuffer = null;
        if (this.f35877t) {
            int i4 = f35864E;
            if (this.f35881x) {
                i4 += f35865F;
            }
            if (this.f35875r) {
                i4 += f35866G;
            }
            if (this.f35882y) {
                i4 += f35867H;
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i4);
            allocate2.putInt(i4);
            allocate2.put((byte) f35870K);
            byte b2 = this.f35881x ? (byte) 64 : 0;
            if (this.f35875r) {
                b2 = (byte) (b2 | 32);
            }
            if (this.f35882y) {
                b2 = (byte) (b2 | 16);
            }
            allocate2.put(b2);
            if (this.f35881x) {
                allocate2.put((byte) 0);
            }
            if (this.f35875r) {
                allocate2.put((byte) f35868I);
                allocate2.put((byte) 0);
                allocate2.putInt(this.f35879v);
            }
            if (this.f35882y) {
                allocate2.put((byte) f35869J);
                allocate2.put((byte) 0);
            }
            byteBuffer = allocate2;
        }
        if (byteBuffer != null) {
            byteBuffer.flip();
            allocate.put(byteBuffer);
        }
        allocate.flip();
        return allocate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public C9180d.C9182b mo31877B(C9123c cVar) {
        if (cVar != null) {
            C9183d0 j = C9189f0.m48856k().mo31937j(cVar);
            if (j != null) {
                return new C9180d.C9182b(this, j.getFrameId(), j.getSubId());
            }
            throw new C9128h(cVar.name());
        }
        throw new IllegalArgumentException(C9118b.GENERAL_INVALID_NULL_ARGUMENT.getMsg());
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public C9198k mo31878C() {
        return C9189f0.m48856k();
    }

    /* renamed from: E */
    public Comparator mo31879E() {
        return C9191g0.m48870b();
    }

    /* renamed from: P */
    public long mo31882P(File file, long j) throws IOException {
        mo31850n(file.getName());
        Logger logger = C9172a.f35808i;
        logger.config("Writing tag to file:" + mo31847k());
        byte[] byteArray = mo31897R().toByteArray();
        int q = mo31899q(byteArray.length + 10, (int) j);
        int length = q - (byteArray.length + 10);
        mo31896Q(file, m48877Y(length, byteArray.length), byteArray, length, q, j);
        return (long) q;
    }

    /* renamed from: T */
    public C9185e0 mo31890v(String str) {
        return new C9185e0(str);
    }

    /* renamed from: U */
    public boolean mo31954U() {
        return this.f35878u;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public void mo31955W(ByteBuffer byteBuffer, int i) {
        Logger logger = C9172a.f35808i;
        logger.finest(mo31847k() + ":" + "Start of frame body at" + byteBuffer.position());
        this.f35837j = new LinkedHashMap();
        this.f35838k = new LinkedHashMap();
        this.f35842o = i;
        Logger logger2 = C9172a.f35808i;
        logger2.finest(mo31847k() + ":" + "Start of frame body at:" + byteBuffer.position() + ",frames data size is:" + i);
        while (byteBuffer.position() <= i) {
            try {
                Logger logger3 = C9172a.f35808i;
                logger3.finest(mo31847k() + ":" + "looking for next frame at:" + byteBuffer.position());
                C9185e0 e0Var = new C9185e0(byteBuffer, mo31847k());
                mo31880J(e0Var.mo31857g(), e0Var);
            } catch (C9129i unused) {
                Logger logger4 = C9172a.f35808i;
                logger4.config(mo31847k() + ":Found padding starting at:" + byteBuffer.position());
                return;
            } catch (C9121a e) {
                Logger logger5 = C9172a.f35808i;
                logger5.warning(mo31847k() + ":" + "Empty Frame:" + e.getMessage());
                this.f35841n = this.f35841n + 10;
            } catch (C9126f e2) {
                Logger logger6 = C9172a.f35808i;
                logger6.config(mo31847k() + ":" + "Invalid Frame Identifier:" + e2.getMessage());
                this.f35843p = this.f35843p + 1;
                return;
            } catch (C9125e e3) {
                Logger logger7 = C9172a.f35808i;
                logger7.warning(mo31847k() + ":" + "Invalid Frame:" + e3.getMessage());
                this.f35843p = this.f35843p + 1;
                return;
            } catch (C9124d e4) {
                Logger logger8 = C9172a.f35808i;
                logger8.warning(mo31847k() + ":Corrupt Frame:" + e4.getMessage());
                this.f35843p = this.f35843p + 1;
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9193h0)) {
            return false;
        }
        C9193h0 h0Var = (C9193h0) obj;
        if (this.f35880w == h0Var.f35880w && this.f35883z == h0Var.f35883z && this.f35871A == h0Var.f35871A && this.f35882y == h0Var.f35882y && this.f35872B == h0Var.f35872B && this.f35873C == h0Var.f35873C && this.f35874D == h0Var.f35874D && this.f35881x == h0Var.f35881x && super.equals(obj)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public String mo31857g() {
        return "ID3v2.40";
    }

    /* renamed from: i */
    public void mo31887i(ByteBuffer byteBuffer) throws C9131k {
        if (mo31894N(byteBuffer)) {
            Logger logger = C9172a.f35808i;
            logger.config(mo31847k() + ":" + "Reading ID3v24 tag");
            m48876X(byteBuffer);
            int a = C9229l.m49050a(byteBuffer);
            Logger logger2 = C9172a.f35808i;
            logger2.config(mo31847k() + ":" + "Reading tag from file size set in header is" + a);
            if (this.f35877t) {
                m48875V(byteBuffer, a);
            }
            mo31955W(byteBuffer, a);
            return;
        }
        throw new C9133m(mo31847k() + ":" + mo31857g() + " tag not found");
    }

    /* renamed from: l */
    public byte mo31848l() {
        return 4;
    }

    /* renamed from: m */
    public byte mo31849m() {
        return 0;
    }

    /* renamed from: o */
    public void mo31888o(C9176c cVar) {
        try {
            if (cVar instanceof C9185e0) {
                mo31900r(cVar.mo31857g(), cVar);
                return;
            }
            C9185e0 e0Var = new C9185e0(cVar);
            mo31900r(e0Var.mo31857g(), e0Var);
        } catch (C9125e unused) {
            Logger logger = C9172a.f35808i;
            Level level = Level.SEVERE;
            logger.log(level, "Unable to convert frame:" + cVar.mo31857g());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo31900r(String str, C9176c cVar) {
        if (this.f35837j.containsKey(cVar.mo31857g())) {
            Object obj = this.f35837j.get(cVar.mo31857g());
            if (obj instanceof C9176c) {
                C9176c cVar2 = (C9176c) this.f35837j.get(cVar.mo31857g());
                if (!(cVar.mo31934j() instanceof C9216n)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(cVar2);
                    arrayList.add(cVar);
                    this.f35837j.put(cVar.mo31857g(), arrayList);
                } else if (cVar2.mo31934j() instanceof C9216n) {
                    Logger logger = C9172a.f35808i;
                    logger.finest("Modifying frame in map:" + cVar.mo31857g());
                    C9216n nVar = (C9216n) cVar2.mo31934j();
                    C9216n nVar2 = (C9216n) cVar.mo31934j();
                    if (nVar2.mo31994J() != null) {
                        if (nVar2.mo31994J().equals("TYER")) {
                            nVar.mo32003S(nVar2.mo31996L());
                        } else if (nVar2.mo31994J().equals("TDAT")) {
                            nVar.mo31999O(nVar2.mo31992H());
                            nVar.mo32001Q(nVar2.mo31998N());
                        } else if (nVar2.mo31994J().equals("TIME")) {
                            nVar.mo32002R(nVar2.mo31995K());
                            nVar.mo32000P(nVar2.mo31997M());
                        }
                        nVar.mo31946r("Text", nVar.mo31993I());
                    }
                } else if (cVar2.mo31934j() instanceof C9228z) {
                    this.f35837j.put(cVar.mo31857g(), cVar);
                } else {
                    Logger logger2 = C9172a.f35808i;
                    logger2.warning("Found duplicate TDRC frame in invalid situation,discarding:" + cVar.mo31857g());
                }
            } else {
                ((List) obj).add(cVar);
            }
        } else {
            this.f35837j.put(cVar.mo31857g(), cVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo31902t(C9180d dVar) {
        C9172a.f35808i.config("Copying primitives");
        super.mo31902t(dVar);
        if (dVar instanceof C9193h0) {
            C9193h0 h0Var = (C9193h0) dVar;
            this.f35880w = h0Var.f35880w;
            this.f35882y = h0Var.f35882y;
            this.f35881x = h0Var.f35881x;
            this.f35883z = h0Var.f35883z;
            this.f35871A = h0Var.f35871A;
            this.f35872B = h0Var.f35872B;
            this.f35873C = h0Var.f35873C;
            this.f35874D = h0Var.f35874D;
        }
    }

    /* renamed from: u */
    public C9132l mo31889u(C9123c cVar, String str) throws C9128h, C9122b {
        if (cVar == null) {
            throw new C9128h();
        } else if (cVar != C9123c.GENRE) {
            return super.mo31889u(cVar, str);
        } else {
            if (str != null) {
                C9185e0 T = mo31890v(mo31877B(cVar).mo31911a());
                C9214l lVar = (C9214l) T.mo31934j();
                if (C9134n.m48562h().mo31729D()) {
                    lVar.mo31964z(str);
                } else {
                    lVar.mo31964z(C9214l.m48970E(str));
                }
                return T;
            }
            throw new IllegalArgumentException(C9118b.GENERAL_INVALID_NULL_ARGUMENT.getMsg());
        }
    }

    public C9193h0(C9184e eVar) {
        C9266k kVar;
        byte b;
        C9172a.f35808i.config("Creating tag from a tag of a different version");
        this.f35837j = new LinkedHashMap();
        this.f35838k = new LinkedHashMap();
        if (eVar == null) {
            return;
        }
        if (eVar instanceof C9193h0) {
            throw new UnsupportedOperationException("Copy Constructor not called. Please type cast the argument");
        } else if (eVar instanceof C9180d) {
            C9180d dVar = (C9180d) eVar;
            mo31850n(dVar.mo31847k());
            mo31902t(dVar);
            mo31901s(dVar);
        } else if (eVar instanceof C9244r) {
            C9244r rVar = (C9244r) eVar;
            if (rVar.f35939p.length() > 0) {
                C9219q qVar = new C9219q((byte) 0, rVar.f35939p);
                C9185e0 e0Var = new C9185e0("TIT2");
                e0Var.mo31935k(qVar);
                this.f35837j.put(e0Var.mo31857g(), e0Var);
            }
            if (rVar.f35937n.length() > 0) {
                C9221s sVar = new C9221s((byte) 0, rVar.f35937n);
                C9185e0 e0Var2 = new C9185e0("TPE1");
                e0Var2.mo31935k(sVar);
                this.f35837j.put(e0Var2.mo31857g(), e0Var2);
            }
            if (rVar.f35936m.length() > 0) {
                C9212j jVar = new C9212j((byte) 0, rVar.f35936m);
                C9185e0 e0Var3 = new C9185e0("TALB");
                e0Var3.mo31935k(jVar);
                this.f35837j.put(e0Var3.mo31857g(), e0Var3);
            }
            if (rVar.f35940q.length() > 0) {
                C9216n nVar = new C9216n((byte) 0, rVar.f35940q);
                C9185e0 e0Var4 = new C9185e0("TDRC");
                e0Var4.mo31935k(nVar);
                this.f35837j.put(e0Var4.mo31857g(), e0Var4);
            }
            if (rVar.f35938o.length() > 0) {
                C9205d dVar2 = new C9205d((byte) 0, "ENG", BuildConfig.FLAVOR, rVar.f35938o);
                C9185e0 e0Var5 = new C9185e0("COMM");
                e0Var5.mo31935k(dVar2);
                this.f35837j.put(e0Var5.mo31857g(), e0Var5);
            }
            byte b2 = rVar.f35941r;
            if ((b2 & 255) >= 0 && (b2 & 255) != 255) {
                Integer valueOf = Integer.valueOf(b2 & 255);
                C9214l lVar = new C9214l((byte) 0, "(" + valueOf + ") " + C9290a.m49277h().mo31785f(valueOf.intValue()));
                C9185e0 e0Var6 = new C9185e0("TCON");
                e0Var6.mo31935k(lVar);
                this.f35837j.put(e0Var6.mo31857g(), e0Var6);
            }
            if ((eVar instanceof C9241p) && (b = ((C9241p) eVar).f35932t) > 0) {
                C9223u uVar = new C9223u((byte) 0, Byte.toString(b));
                C9185e0 e0Var7 = new C9185e0("TRCK");
                e0Var7.mo31935k(uVar);
                this.f35837j.put(e0Var7.mo31857g(), e0Var7);
            }
        } else if (eVar instanceof C9256a) {
            if (eVar instanceof C9266k) {
                kVar = new C9266k((C9266k) eVar);
            } else {
                kVar = new C9266k(eVar);
            }
            Iterator<C9267l> l = kVar.mo32099l();
            while (l.hasNext()) {
                try {
                    C9185e0 e0Var8 = new C9185e0(l.next());
                    this.f35837j.put(e0Var8.mo31857g(), e0Var8);
                } catch (C9127g unused) {
                    C9172a.f35808i.warning("Unable to convert Lyrics3 to v24 Frame:Frame Identifier");
                }
            }
        }
    }

    public C9193h0(ByteBuffer byteBuffer, String str) throws C9131k {
        this.f35837j = new LinkedHashMap();
        this.f35838k = new LinkedHashMap();
        mo31850n(str);
        mo31887i(byteBuffer);
    }
}
