package p402l.p406b.p426c.p431t;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Comparator;
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
import p402l.p406b.p426c.p431t.p432k0.C9216n;

/* renamed from: l.b.c.t.x */
/* compiled from: ID3v22Tag */
public class C9251x extends C9180d {

    /* renamed from: r */
    protected boolean f35953r = false;

    /* renamed from: s */
    protected boolean f35954s = false;

    public C9251x() {
        this.f35837j = new LinkedHashMap();
        this.f35838k = new LinkedHashMap();
    }

    /* renamed from: W */
    private void m49145W(ByteBuffer byteBuffer) throws C9131k {
        byte b = byteBuffer.get();
        boolean z = (b & 128) != 0;
        this.f35954s = z;
        this.f35953r = (b & 64) != 0;
        if (z) {
            C9172a.f35808i.config(C9118b.ID3_TAG_UNSYNCHRONIZED.getMsg(mo31847k()));
        }
        if (this.f35953r) {
            C9172a.f35808i.config(C9118b.ID3_TAG_COMPRESSED.getMsg(mo31847k()));
        }
        if ((b & 32) != 0) {
            C9172a.f35808i.warning(C9118b.ID3_INVALID_OR_UNKNOWN_FLAG_SET.getMsg(mo31847k(), 32));
        }
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
            C9172a.f35808i.warning(C9118b.ID3_INVALID_OR_UNKNOWN_FLAG_SET.getMsg(mo31847k(), 8));
        }
    }

    /* renamed from: Y */
    private ByteBuffer m49146Y(int i, int i2) throws IOException {
        byte b = 0;
        this.f35953r = false;
        ByteBuffer allocate = ByteBuffer.allocate(10);
        allocate.put(C9180d.f35836q);
        allocate.put(mo31848l());
        allocate.put(mo31849m());
        if (this.f35954s) {
            b = (byte) -128;
        }
        if (this.f35953r) {
            b = (byte) (b | 64);
        }
        allocate.put(b);
        allocate.put(C9229l.m49054e(i + i2));
        allocate.flip();
        return allocate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public C9180d.C9182b mo31877B(C9123c cVar) {
        if (cVar != null) {
            C9247t j = C9249v.m49141k().mo32067j(cVar);
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
        return C9249v.m49141k();
    }

    /* renamed from: E */
    public Comparator mo31879E() {
        return C9250w.m49143b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo31880J(String str, C9176c cVar) {
        if (cVar.mo31934j() instanceof C9214l) {
            ((C9214l) cVar.mo31934j()).mo31989F();
        }
        super.mo31880J(str, cVar);
    }

    /* renamed from: P */
    public long mo31882P(File file, long j) throws IOException {
        mo31850n(file.getName());
        Logger logger = C9172a.f35808i;
        logger.config("Writing tag to file:" + mo31847k());
        byte[] byteArray = mo31897R().toByteArray();
        this.f35954s = C9134n.m48562h().mo31728C() && C9240o.m49080a(byteArray);
        if (mo32072U()) {
            byteArray = C9240o.m49082c(byteArray);
            Logger logger2 = C9172a.f35808i;
            logger2.config(mo31847k() + ":bodybytebuffer:sizeafterunsynchronisation:" + byteArray.length);
        }
        byte[] bArr = byteArray;
        int q = mo31899q(bArr.length + 10, (int) j);
        int length = q - (bArr.length + 10);
        Logger logger3 = C9172a.f35808i;
        logger3.config(mo31847k() + ":Current audiostart:" + j);
        Logger logger4 = C9172a.f35808i;
        logger4.config(mo31847k() + ":Size including padding:" + q);
        Logger logger5 = C9172a.f35808i;
        logger5.config(mo31847k() + ":Padding:" + length);
        mo31896Q(file, m49146Y(length, bArr.length), bArr, length, q, j);
        return (long) q;
    }

    /* renamed from: T */
    public C9248u mo31890v(String str) {
        return new C9248u(str);
    }

    /* renamed from: U */
    public boolean mo32072U() {
        return this.f35954s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public void mo32073V(ByteBuffer byteBuffer, int i) {
        this.f35837j = new LinkedHashMap();
        this.f35838k = new LinkedHashMap();
        this.f35842o = i;
        Logger logger = C9172a.f35808i;
        logger.finest(mo31847k() + ":" + "Start of frame body at:" + byteBuffer.position() + ",frames sizes and padding is:" + i);
        while (byteBuffer.position() < i) {
            try {
                Logger logger2 = C9172a.f35808i;
                logger2.finest(mo31847k() + ":" + "looking for next frame at:" + byteBuffer.position());
                C9248u uVar = new C9248u(byteBuffer, mo31847k());
                mo31880J(uVar.mo31857g(), uVar);
            } catch (C9129i unused) {
                Logger logger3 = C9172a.f35808i;
                logger3.config(mo31847k() + ":Found padding starting at:" + byteBuffer.position());
                return;
            } catch (C9121a e) {
                Logger logger4 = C9172a.f35808i;
                logger4.warning(mo31847k() + ":" + "Empty Frame:" + e.getMessage());
                this.f35841n = this.f35841n + 6;
            } catch (C9126f e2) {
                Logger logger5 = C9172a.f35808i;
                logger5.config(mo31847k() + ":" + "Invalid Frame Identifier:" + e2.getMessage());
                this.f35843p = this.f35843p + 1;
                return;
            } catch (C9125e e3) {
                Logger logger6 = C9172a.f35808i;
                logger6.warning(mo31847k() + ":" + "Invalid Frame:" + e3.getMessage());
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
    /* renamed from: X */
    public void mo32074X(C9176c cVar) {
        C9216n nVar = (C9216n) cVar.mo31934j();
        if (nVar.mo31996L().length() != 0) {
            C9248u uVar = new C9248u("TYE");
            ((C9199a) uVar.mo31934j()).mo31964z(nVar.mo31996L());
            this.f35837j.put(uVar.mo31857g(), uVar);
        }
        if (nVar.mo31995K().length() != 0) {
            C9248u uVar2 = new C9248u("TIM");
            ((C9199a) uVar2.mo31934j()).mo31964z(nVar.mo31995K());
            this.f35837j.put(uVar2.mo31857g(), uVar2);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9251x)) {
            return false;
        }
        C9251x xVar = (C9251x) obj;
        if (this.f35953r == xVar.f35953r && this.f35954s == xVar.f35954s && super.equals(obj)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public void mo31887i(ByteBuffer byteBuffer) throws C9131k {
        if (mo31894N(byteBuffer)) {
            Logger logger = C9172a.f35808i;
            logger.config(mo31847k() + ":" + "Reading tag from file");
            m49145W(byteBuffer);
            int a = C9229l.m49050a(byteBuffer);
            ByteBuffer slice = byteBuffer.slice();
            if (this.f35954s) {
                slice = C9240o.m49081b(slice);
            }
            mo32073V(slice, a);
            Logger logger2 = C9172a.f35808i;
            logger2.config(mo31847k() + ":" + "Loaded Frames,there are:" + this.f35837j.keySet().size());
            return;
        }
        throw new C9133m("ID3v2.20 tag not found");
    }

    /* renamed from: l */
    public byte mo31848l() {
        return 2;
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
                mo32074X(cVar);
            } else if (cVar instanceof C9248u) {
                mo31900r(cVar.mo31857g(), cVar);
            } else {
                C9248u uVar = new C9248u(cVar);
                mo31900r(uVar.mo31857g(), uVar);
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
        } else if (cVar != C9123c.GENRE) {
            return super.mo31889u(cVar, str);
        } else {
            if (str != null) {
                C9248u T = mo31890v(mo31877B(cVar).mo31911a());
                C9214l lVar = (C9214l) T.mo31934j();
                lVar.mo31989F();
                lVar.mo31964z(C9214l.m48968B(str));
                return T;
            }
            throw new IllegalArgumentException(C9118b.GENERAL_INVALID_NULL_ARGUMENT.getMsg());
        }
    }

    public C9251x(ByteBuffer byteBuffer, String str) throws C9131k {
        mo31850n(str);
        mo31887i(byteBuffer);
    }
}
