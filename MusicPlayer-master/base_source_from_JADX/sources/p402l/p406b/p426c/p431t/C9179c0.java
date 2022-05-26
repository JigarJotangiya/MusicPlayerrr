package p402l.p406b.p426c.p431t;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.C9121a;
import p402l.p406b.p426c.C9122b;
import p402l.p406b.p426c.C9123c;
import p402l.p406b.p426c.C9124d;
import p402l.p406b.p426c.C9125e;
import p402l.p406b.p426c.C9126f;
import p402l.p406b.p426c.C9128h;
import p402l.p406b.p426c.C9129i;
import p402l.p406b.p426c.C9131k;
import p402l.p406b.p426c.C9132l;
import p402l.p406b.p426c.C9133m;
import p402l.p406b.p426c.C9134n;
import p402l.p406b.p426c.p431t.C9180d;
import p402l.p406b.p426c.p431t.p432k0.C9199a;
import p402l.p406b.p426c.p431t.p432k0.C9214l;
import p402l.p406b.p426c.p431t.p432k0.C9215m;
import p402l.p406b.p426c.p431t.p432k0.C9216n;
import p402l.p406b.p426c.p431t.p432k0.C9217o;
import p402l.p406b.p426c.p431t.p432k0.C9225w;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.t.c0 */
/* compiled from: ID3v23Tag */
public class C9179c0 extends C9180d {

    /* renamed from: A */
    protected static int f35826A = (10 - 4);

    /* renamed from: x */
    protected static int f35827x = 10;

    /* renamed from: y */
    protected static int f35828y = 4;

    /* renamed from: z */
    protected static int f35829z = 4;

    /* renamed from: r */
    protected boolean f35830r = false;

    /* renamed from: s */
    protected boolean f35831s = false;

    /* renamed from: t */
    protected boolean f35832t = false;

    /* renamed from: u */
    private int f35833u;

    /* renamed from: v */
    private int f35834v = 0;

    /* renamed from: w */
    protected boolean f35835w = false;

    public C9179c0() {
        this.f35837j = new LinkedHashMap();
        this.f35838k = new LinkedHashMap();
    }

    /* renamed from: V */
    private void m48767V(ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt();
        int i3 = f35826A;
        if (i2 == i3) {
            boolean z = (byteBuffer.get() & 128) != 0;
            this.f35830r = z;
            if (z) {
                C9172a.f35808i.warning(C9118b.ID3_TAG_CRC_FLAG_SET_INCORRECTLY.getMsg(mo31847k()));
            }
            byteBuffer.get();
            int i4 = byteBuffer.getInt();
            this.f35834v = i4;
            if (i4 > 0) {
                C9172a.f35808i.config(C9118b.ID3_TAG_PADDING_SIZE.getMsg(mo31847k(), Integer.valueOf(this.f35834v)));
            }
        } else if (i2 == i3 + f35828y) {
            C9172a.f35808i.config(C9118b.ID3_TAG_CRC.getMsg(mo31847k()));
            boolean z2 = (byteBuffer.get() & 128) != 0;
            this.f35830r = z2;
            if (!z2) {
                C9172a.f35808i.warning(C9118b.ID3_TAG_CRC_FLAG_SET_INCORRECTLY.getMsg(mo31847k()));
            }
            byteBuffer.get();
            int i5 = byteBuffer.getInt();
            this.f35834v = i5;
            if (i5 > 0) {
                C9172a.f35808i.config(C9118b.ID3_TAG_PADDING_SIZE.getMsg(mo31847k(), Integer.valueOf(this.f35834v)));
            }
            this.f35833u = byteBuffer.getInt();
            C9172a.f35808i.config(C9118b.ID3_TAG_CRC_SIZE.getMsg(mo31847k(), Integer.valueOf(this.f35833u)));
        } else {
            C9172a.f35808i.warning(C9118b.ID3_EXTENDED_HEADER_SIZE_INVALID.getMsg(mo31847k(), Integer.valueOf(i2)));
            byteBuffer.position(byteBuffer.position() - f35829z);
        }
    }

    /* renamed from: X */
    private void m48768X(ByteBuffer byteBuffer) throws C9131k {
        byte b = byteBuffer.get();
        this.f35835w = (b & 128) != 0;
        this.f35832t = (b & 64) != 0;
        this.f35831s = (b & 32) != 0;
        if ((b & 16) != 0) {
            C9172a.f35808i.warning(C9118b.ID3_INVALID_OR_UNKNOWN_FLAG_SET.getMsg(mo31847k(), 16));
        }
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
        if (mo31884U()) {
            C9172a.f35808i.config(C9118b.ID3_TAG_UNSYNCHRONIZED.getMsg(mo31847k()));
        }
        if (this.f35832t) {
            C9172a.f35808i.config(C9118b.ID3_TAG_EXTENDED.getMsg(mo31847k()));
        }
        if (this.f35831s) {
            C9172a.f35808i.config(C9118b.ID3_TAG_EXPERIMENTAL.getMsg(mo31847k()));
        }
    }

    /* renamed from: Z */
    private ByteBuffer m48769Z(int i, int i2) throws IOException {
        int i3;
        this.f35832t = false;
        this.f35831s = false;
        this.f35830r = false;
        ByteBuffer allocate = ByteBuffer.allocate(f35827x + 10 + f35828y);
        allocate.put(C9180d.f35836q);
        allocate.put(mo31848l());
        allocate.put(mo31849m());
        byte b = mo31884U() ? (byte) 128 : 0;
        if (this.f35832t) {
            b = (byte) (b | 64);
        }
        if (this.f35831s) {
            b = (byte) (b | 32);
        }
        allocate.put(b);
        if (this.f35832t) {
            i3 = f35827x + 0;
            if (this.f35830r) {
                i3 += f35828y;
            }
        } else {
            i3 = 0;
        }
        allocate.put(C9229l.m49054e(i2 + i + i3));
        if (this.f35832t) {
            if (this.f35830r) {
                allocate.putInt(f35826A + f35828y);
                allocate.put((byte) 128);
                allocate.put((byte) 0);
                allocate.putInt(this.f35834v);
                allocate.putInt(this.f35833u);
            } else {
                allocate.putInt(f35826A);
                allocate.put((byte) 0);
                allocate.put((byte) 0);
                allocate.putInt(i);
            }
        }
        allocate.flip();
        return allocate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public C9180d.C9182b mo31877B(C9123c cVar) {
        if (cVar != null) {
            C9252y j = C9173a0.m48741k().mo31851j(cVar);
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
        return C9173a0.m48741k();
    }

    /* renamed from: E */
    public Comparator mo31879E() {
        return C9175b0.m48745b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo31880J(String str, C9176c cVar) {
        if (cVar.mo31934j() instanceof C9214l) {
            ((C9214l) cVar.mo31934j()).mo31989F();
        }
        super.mo31880J(str, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo31881K(HashMap hashMap, String str, C9176c cVar) {
        if (!str.equals("TYER") && !str.equals("TDAT")) {
            super.mo31881K(hashMap, str, cVar);
        } else if (hashMap.containsKey(str) || hashMap.containsKey("TYERTDAT")) {
            if (this.f35839l.length() > 0) {
                this.f35839l += ";";
            }
            this.f35839l += str;
            this.f35840m += cVar.mo31919h();
        } else if (str.equals("TYER")) {
            if (hashMap.containsKey("TDAT")) {
                C9197j0 j0Var = new C9197j0();
                j0Var.mo31956a(cVar);
                j0Var.mo31956a((C9176c) hashMap.get("TDAT"));
                hashMap.remove("TDAT");
                hashMap.put("TYERTDAT", j0Var);
                return;
            }
            hashMap.put("TYER", cVar);
        } else if (!str.equals("TDAT")) {
        } else {
            if (hashMap.containsKey("TYER")) {
                C9197j0 j0Var2 = new C9197j0();
                j0Var2.mo31956a((C9176c) hashMap.get("TYER"));
                j0Var2.mo31956a(cVar);
                hashMap.remove("TYER");
                hashMap.put("TYERTDAT", j0Var2);
                return;
            }
            hashMap.put("TDAT", cVar);
        }
    }

    /* renamed from: P */
    public long mo31882P(File file, long j) throws IOException {
        mo31850n(file.getName());
        Logger logger = C9172a.f35808i;
        logger.config("Writing tag to file:" + mo31847k());
        byte[] byteArray = mo31897R().toByteArray();
        Logger logger2 = C9172a.f35808i;
        logger2.config(mo31847k() + ":bodybytebuffer:sizebeforeunsynchronisation:" + byteArray.length);
        this.f35835w = C9134n.m48562h().mo31728C() && C9240o.m49080a(byteArray);
        if (mo31884U()) {
            byteArray = C9240o.m49082c(byteArray);
            Logger logger3 = C9172a.f35808i;
            logger3.config(mo31847k() + ":bodybytebuffer:sizeafterunsynchronisation:" + byteArray.length);
        }
        byte[] bArr = byteArray;
        int q = mo31899q(bArr.length + 10, (int) j);
        int length = q - (bArr.length + 10);
        Logger logger4 = C9172a.f35808i;
        logger4.config(mo31847k() + ":Current audiostart:" + j);
        Logger logger5 = C9172a.f35808i;
        logger5.config(mo31847k() + ":Size including padding:" + q);
        Logger logger6 = C9172a.f35808i;
        logger6.config(mo31847k() + ":Padding:" + length);
        mo31896Q(file, m48769Z(length, bArr.length), bArr, length, q, j);
        return (long) q;
    }

    /* renamed from: T */
    public C9253z mo31890v(String str) {
        return new C9253z(str);
    }

    /* renamed from: U */
    public boolean mo31884U() {
        return this.f35835w;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public void mo31885W(ByteBuffer byteBuffer, int i) {
        this.f35837j = new LinkedHashMap();
        this.f35838k = new LinkedHashMap();
        this.f35842o = i;
        Logger logger = C9172a.f35808i;
        logger.finest(mo31847k() + ":Start of frame body at:" + byteBuffer.position() + ",frames data size is:" + i);
        while (byteBuffer.position() < i) {
            try {
                Logger logger2 = C9172a.f35808i;
                logger2.finest(mo31847k() + ":Looking for next frame at:" + byteBuffer.position());
                C9253z zVar = new C9253z(byteBuffer, mo31847k());
                mo31880J(zVar.mo31857g(), zVar);
            } catch (C9129i unused) {
                Logger logger3 = C9172a.f35808i;
                logger3.config(mo31847k() + ":Found padding starting at:" + byteBuffer.position());
                return;
            } catch (C9121a e) {
                Logger logger4 = C9172a.f35808i;
                logger4.warning(mo31847k() + ":Empty Frame:" + e.getMessage());
                this.f35841n = this.f35841n + 10;
            } catch (C9126f e2) {
                Logger logger5 = C9172a.f35808i;
                logger5.warning(mo31847k() + ":Invalid Frame Identifier:" + e2.getMessage());
                this.f35843p = this.f35843p + 1;
                return;
            } catch (C9125e e3) {
                Logger logger6 = C9172a.f35808i;
                logger6.warning(mo31847k() + ":Invalid Frame:" + e3.getMessage());
                this.f35843p = this.f35843p + 1;
                return;
            } catch (C9124d e4) {
                Logger logger7 = C9172a.f35808i;
                logger7.warning(mo31847k() + ":Corrupt Frame:" + e4.getMessage());
                this.f35843p = this.f35843p + 1;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public void mo31886Y(C9176c cVar) {
        C9216n nVar = (C9216n) cVar.mo31934j();
        nVar.mo31991B();
        if (!nVar.mo31996L().equals(BuildConfig.FLAVOR)) {
            C9253z zVar = new C9253z("TYER");
            ((C9225w) zVar.mo31934j()).mo31964z(nVar.mo31996L());
            Logger logger = C9172a.f35808i;
            logger.config("Adding Frame:" + zVar.mo31857g());
            this.f35837j.put(zVar.mo31857g(), zVar);
        }
        if (!nVar.mo31992H().equals(BuildConfig.FLAVOR)) {
            C9253z zVar2 = new C9253z("TDAT");
            ((C9215m) zVar2.mo31934j()).mo31964z(nVar.mo31992H());
            ((C9215m) zVar2.mo31934j()).mo31990A(nVar.mo31998N());
            Logger logger2 = C9172a.f35808i;
            logger2.config("Adding Frame:" + zVar2.mo31857g());
            this.f35837j.put(zVar2.mo31857g(), zVar2);
        }
        if (!nVar.mo31995K().equals(BuildConfig.FLAVOR)) {
            C9253z zVar3 = new C9253z("TIME");
            ((C9217o) zVar3.mo31934j()).mo31964z(nVar.mo31995K());
            ((C9217o) zVar3.mo31934j()).mo32004A(nVar.mo31997M());
            Logger logger3 = C9172a.f35808i;
            logger3.config("Adding Frame:" + zVar3.mo31857g());
            this.f35837j.put(zVar3.mo31857g(), zVar3);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9179c0)) {
            return false;
        }
        C9179c0 c0Var = (C9179c0) obj;
        if (this.f35833u == c0Var.f35833u && this.f35830r == c0Var.f35830r && this.f35831s == c0Var.f35831s && this.f35832t == c0Var.f35832t && this.f35834v == c0Var.f35834v && super.equals(obj)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public String mo31857g() {
        return "ID3v2.30";
    }

    /* renamed from: i */
    public void mo31887i(ByteBuffer byteBuffer) throws C9131k {
        if (mo31894N(byteBuffer)) {
            Logger logger = C9172a.f35808i;
            logger.config(mo31847k() + ":" + "Reading ID3v23 tag");
            m48768X(byteBuffer);
            int a = C9229l.m49050a(byteBuffer);
            C9172a.f35808i.config(C9118b.ID_TAG_SIZE.getMsg(mo31847k(), Integer.valueOf(a)));
            if (this.f35832t) {
                m48767V(byteBuffer, a);
            }
            ByteBuffer slice = byteBuffer.slice();
            if (mo31884U()) {
                slice = C9240o.m49081b(slice);
            }
            mo31885W(slice, a);
            Logger logger2 = C9172a.f35808i;
            logger2.config(mo31847k() + ":Loaded Frames,there are:" + this.f35837j.keySet().size());
            return;
        }
        throw new C9133m(mo31857g() + " tag not found");
    }

    /* renamed from: l */
    public byte mo31848l() {
        return 3;
    }

    /* renamed from: m */
    public byte mo31849m() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo31888o(C9176c cVar) {
        try {
            if (cVar.mo31857g().equals("TDRC") && (cVar.mo31934j() instanceof C9216n)) {
                mo31886Y(cVar);
            } else if (cVar instanceof C9253z) {
                mo31900r(cVar.mo31857g(), cVar);
            } else {
                C9253z zVar = new C9253z(cVar);
                mo31900r(zVar.mo31857g(), zVar);
            }
        } catch (C9125e unused) {
            Logger logger = C9172a.f35808i;
            Level level = Level.SEVERE;
            logger.log(level, "Unable to convert frame:" + cVar.mo31857g());
        }
    }

    /* renamed from: u */
    public C9132l mo31889u(C9123c cVar, String str) throws C9128h, C9122b {
        if (cVar == null) {
            throw new C9128h();
        } else if (cVar == C9123c.GENRE) {
            if (str != null) {
                C9253z T = mo31890v(mo31877B(cVar).mo31911a());
                C9214l lVar = (C9214l) T.mo31934j();
                lVar.mo31989F();
                if (C9134n.m48562h().mo31729D()) {
                    lVar.mo31964z(str);
                } else {
                    lVar.mo31964z(C9214l.m48969C(str));
                }
                return T;
            }
            throw new IllegalArgumentException(C9118b.GENERAL_INVALID_NULL_ARGUMENT.getMsg());
        } else if (cVar != C9123c.YEAR) {
            return super.mo31889u(cVar, str);
        } else {
            if (str.length() == 1) {
                C9253z T2 = mo31890v("TYER");
                ((C9199a) T2.mo31934j()).mo31964z("000" + str);
                return T2;
            } else if (str.length() == 2) {
                C9253z T3 = mo31890v("TYER");
                ((C9199a) T3.mo31934j()).mo31964z("00" + str);
                return T3;
            } else if (str.length() == 3) {
                C9253z T4 = mo31890v("TYER");
                ((C9199a) T4.mo31934j()).mo31964z("0" + str);
                return T4;
            } else if (str.length() == 4) {
                C9253z T5 = mo31890v("TYER");
                ((C9199a) T5.mo31934j()).mo31964z(str);
                return T5;
            } else if (str.length() <= 4) {
                return null;
            } else {
                C9253z T6 = mo31890v("TYER");
                ((C9199a) T6.mo31934j()).mo31964z(str.substring(0, 4));
                if (str.length() >= 10) {
                    String substring = str.substring(5, 7);
                    String substring2 = str.substring(8, 10);
                    C9253z T7 = mo31890v("TDAT");
                    ((C9199a) T7.mo31934j()).mo31964z(substring2 + substring);
                    C9197j0 j0Var = new C9197j0();
                    j0Var.mo31956a(T6);
                    j0Var.mo31956a(T7);
                    return j0Var;
                } else if (str.length() < 7) {
                    return T6;
                } else {
                    String substring3 = str.substring(5, 7);
                    C9253z T8 = mo31890v("TDAT");
                    ((C9199a) T8.mo31934j()).mo31964z("01" + substring3);
                    C9197j0 j0Var2 = new C9197j0();
                    j0Var2.mo31956a(T6);
                    j0Var2.mo31956a(T8);
                    return j0Var2;
                }
            }
        }
    }

    public C9179c0(ByteBuffer byteBuffer, String str) throws C9131k {
        mo31850n(str);
        mo31887i(byteBuffer);
    }
}
