package com.bumptech.glide.p047q;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.C1730g;
import com.bumptech.glide.load.C1786g;
import com.bumptech.glide.load.C1787h;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.C1794m;
import com.bumptech.glide.load.p030n.C1873j;
import com.bumptech.glide.load.p036p.p037d.C2020i;
import com.bumptech.glide.load.p036p.p037d.C2021j;
import com.bumptech.glide.load.p036p.p037d.C2028l;
import com.bumptech.glide.load.p036p.p037d.C2041q;
import com.bumptech.glide.load.p036p.p041h.C2081i;
import com.bumptech.glide.p047q.C2144a;
import com.bumptech.glide.p050r.C2177c;
import com.bumptech.glide.p051s.C2182b;
import com.bumptech.glide.p051s.C2193j;
import com.bumptech.glide.p051s.C2194k;
import java.util.Map;

/* renamed from: com.bumptech.glide.q.a */
/* compiled from: BaseRequestOptions */
public abstract class C2144a<T extends C2144a<T>> implements Cloneable {

    /* renamed from: A */
    private Resources.Theme f7307A;

    /* renamed from: B */
    private boolean f7308B;

    /* renamed from: C */
    private boolean f7309C;

    /* renamed from: D */
    private boolean f7310D;

    /* renamed from: E */
    private boolean f7311E = true;

    /* renamed from: F */
    private boolean f7312F;

    /* renamed from: g */
    private int f7313g;

    /* renamed from: h */
    private float f7314h = 1.0f;

    /* renamed from: i */
    private C1873j f7315i = C1873j.f6768c;

    /* renamed from: j */
    private C1730g f7316j = C1730g.NORMAL;

    /* renamed from: k */
    private Drawable f7317k;

    /* renamed from: l */
    private int f7318l;

    /* renamed from: m */
    private Drawable f7319m;

    /* renamed from: n */
    private int f7320n;

    /* renamed from: o */
    private boolean f7321o = true;

    /* renamed from: p */
    private int f7322p = -1;

    /* renamed from: q */
    private int f7323q = -1;

    /* renamed from: r */
    private C1786g f7324r = C2177c.m10232c();

    /* renamed from: s */
    private boolean f7325s;

    /* renamed from: t */
    private boolean f7326t = true;

    /* renamed from: u */
    private Drawable f7327u;

    /* renamed from: v */
    private int f7328v;

    /* renamed from: w */
    private C1790i f7329w = new C1790i();

    /* renamed from: x */
    private Map<Class<?>, C1794m<?>> f7330x = new C2182b();

    /* renamed from: y */
    private Class<?> f7331y = Object.class;

    /* renamed from: z */
    private boolean f7332z;

    /* renamed from: K */
    private boolean m10005K(int i) {
        return m10006L(this.f7313g, i);
    }

    /* renamed from: L */
    private static boolean m10006L(int i, int i2) {
        return (i & i2) != 0;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.bumptech.glide.load.m, com.bumptech.glide.load.m<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private T m10007V(com.bumptech.glide.load.p036p.p037d.C2028l r2, com.bumptech.glide.load.C1794m<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            r0 = 0
            com.bumptech.glide.q.a r2 = r1.m10008c0(r2, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p047q.C2144a.m10007V(com.bumptech.glide.load.p.d.l, com.bumptech.glide.load.m):com.bumptech.glide.q.a");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.bumptech.glide.load.m, com.bumptech.glide.load.m<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private T m10008c0(com.bumptech.glide.load.p036p.p037d.C2028l r1, com.bumptech.glide.load.C1794m<android.graphics.Bitmap> r2, boolean r3) {
        /*
            r0 = this;
            if (r3 == 0) goto L_0x0007
            com.bumptech.glide.q.a r1 = r0.mo8396l0(r1, r2)
            goto L_0x000b
        L_0x0007:
            com.bumptech.glide.q.a r1 = r0.mo8373W(r1, r2)
        L_0x000b:
            r2 = 1
            r1.f7311E = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p047q.C2144a.m10008c0(com.bumptech.glide.load.p.d.l, com.bumptech.glide.load.m, boolean):com.bumptech.glide.q.a");
    }

    /* renamed from: d0 */
    private T m10009d0() {
        return this;
    }

    /* renamed from: A */
    public final C1786g mo8355A() {
        return this.f7324r;
    }

    /* renamed from: B */
    public final float mo8356B() {
        return this.f7314h;
    }

    /* renamed from: C */
    public final Resources.Theme mo8357C() {
        return this.f7307A;
    }

    /* renamed from: D */
    public final Map<Class<?>, C1794m<?>> mo8358D() {
        return this.f7330x;
    }

    /* renamed from: E */
    public final boolean mo8359E() {
        return this.f7312F;
    }

    /* renamed from: F */
    public final boolean mo8360F() {
        return this.f7309C;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final boolean mo8361G() {
        return this.f7308B;
    }

    /* renamed from: H */
    public final boolean mo8362H() {
        return this.f7321o;
    }

    /* renamed from: I */
    public final boolean mo8363I() {
        return m10005K(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public boolean mo8364J() {
        return this.f7311E;
    }

    /* renamed from: M */
    public final boolean mo8365M() {
        return this.f7326t;
    }

    /* renamed from: N */
    public final boolean mo8366N() {
        return this.f7325s;
    }

    /* renamed from: O */
    public final boolean mo8367O() {
        return m10005K(2048);
    }

    /* renamed from: P */
    public final boolean mo8368P() {
        return C2194k.m10290t(this.f7323q, this.f7322p);
    }

    /* renamed from: R */
    public T mo8369R() {
        this.f7332z = true;
        m10009d0();
        return this;
    }

    /* renamed from: S */
    public T mo8370S() {
        return mo8373W(C2028l.f7039c, new C2020i());
    }

    /* renamed from: T */
    public T mo8371T() {
        return m10007V(C2028l.f7038b, new C2021j());
    }

    /* renamed from: U */
    public T mo8372U() {
        return m10007V(C2028l.f7037a, new C2041q());
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.bumptech.glide.load.m, com.bumptech.glide.load.m<android.graphics.Bitmap>] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo8373W(com.bumptech.glide.load.p036p.p037d.C2028l r2, com.bumptech.glide.load.C1794m<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.f7308B
            if (r0 == 0) goto L_0x000d
            com.bumptech.glide.q.a r0 = r1.clone()
            com.bumptech.glide.q.a r2 = r0.mo8373W(r2, r3)
            return r2
        L_0x000d:
            r1.mo8389i(r2)
            r2 = 0
            com.bumptech.glide.q.a r2 = r1.mo8394k0(r3, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p047q.C2144a.mo8373W(com.bumptech.glide.load.p.d.l, com.bumptech.glide.load.m):com.bumptech.glide.q.a");
    }

    /* renamed from: X */
    public T mo8374X(int i, int i2) {
        if (this.f7308B) {
            return clone().mo8374X(i, i2);
        }
        this.f7323q = i;
        this.f7322p = i2;
        this.f7313g |= 512;
        mo8380e0();
        return this;
    }

    /* renamed from: Z */
    public T mo8375Z(int i) {
        if (this.f7308B) {
            return clone().mo8375Z(i);
        }
        this.f7320n = i;
        int i2 = this.f7313g | 128;
        this.f7313g = i2;
        this.f7319m = null;
        this.f7313g = i2 & -65;
        mo8380e0();
        return this;
    }

    /* renamed from: a */
    public T mo7637a(C2144a<?> aVar) {
        if (this.f7308B) {
            return clone().mo7637a(aVar);
        }
        if (m10006L(aVar.f7313g, 2)) {
            this.f7314h = aVar.f7314h;
        }
        if (m10006L(aVar.f7313g, 262144)) {
            this.f7309C = aVar.f7309C;
        }
        if (m10006L(aVar.f7313g, 1048576)) {
            this.f7312F = aVar.f7312F;
        }
        if (m10006L(aVar.f7313g, 4)) {
            this.f7315i = aVar.f7315i;
        }
        if (m10006L(aVar.f7313g, 8)) {
            this.f7316j = aVar.f7316j;
        }
        if (m10006L(aVar.f7313g, 16)) {
            this.f7317k = aVar.f7317k;
            this.f7318l = 0;
            this.f7313g &= -33;
        }
        if (m10006L(aVar.f7313g, 32)) {
            this.f7318l = aVar.f7318l;
            this.f7317k = null;
            this.f7313g &= -17;
        }
        if (m10006L(aVar.f7313g, 64)) {
            this.f7319m = aVar.f7319m;
            this.f7320n = 0;
            this.f7313g &= -129;
        }
        if (m10006L(aVar.f7313g, 128)) {
            this.f7320n = aVar.f7320n;
            this.f7319m = null;
            this.f7313g &= -65;
        }
        if (m10006L(aVar.f7313g, 256)) {
            this.f7321o = aVar.f7321o;
        }
        if (m10006L(aVar.f7313g, 512)) {
            this.f7323q = aVar.f7323q;
            this.f7322p = aVar.f7322p;
        }
        if (m10006L(aVar.f7313g, 1024)) {
            this.f7324r = aVar.f7324r;
        }
        if (m10006L(aVar.f7313g, 4096)) {
            this.f7331y = aVar.f7331y;
        }
        if (m10006L(aVar.f7313g, 8192)) {
            this.f7327u = aVar.f7327u;
            this.f7328v = 0;
            this.f7313g &= -16385;
        }
        if (m10006L(aVar.f7313g, 16384)) {
            this.f7328v = aVar.f7328v;
            this.f7327u = null;
            this.f7313g &= -8193;
        }
        if (m10006L(aVar.f7313g, 32768)) {
            this.f7307A = aVar.f7307A;
        }
        if (m10006L(aVar.f7313g, 65536)) {
            this.f7326t = aVar.f7326t;
        }
        if (m10006L(aVar.f7313g, 131072)) {
            this.f7325s = aVar.f7325s;
        }
        if (m10006L(aVar.f7313g, 2048)) {
            this.f7330x.putAll(aVar.f7330x);
            this.f7311E = aVar.f7311E;
        }
        if (m10006L(aVar.f7313g, 524288)) {
            this.f7310D = aVar.f7310D;
        }
        if (!this.f7326t) {
            this.f7330x.clear();
            int i = this.f7313g & -2049;
            this.f7313g = i;
            this.f7325s = false;
            this.f7313g = i & -131073;
            this.f7311E = true;
        }
        this.f7313g |= aVar.f7313g;
        this.f7329w.mo7745d(aVar.f7329w);
        mo8380e0();
        return this;
    }

    /* renamed from: a0 */
    public T mo8376a0(Drawable drawable) {
        if (this.f7308B) {
            return clone().mo8376a0(drawable);
        }
        this.f7319m = drawable;
        int i = this.f7313g | 64;
        this.f7313g = i;
        this.f7320n = 0;
        this.f7313g = i & -129;
        mo8380e0();
        return this;
    }

    /* renamed from: b */
    public T mo8377b() {
        if (!this.f7332z || this.f7308B) {
            this.f7308B = true;
            mo8369R();
            return this;
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    /* renamed from: b0 */
    public T mo8378b0(C1730g gVar) {
        if (this.f7308B) {
            return clone().mo8378b0(gVar);
        }
        C2193j.m10269d(gVar);
        this.f7316j = gVar;
        this.f7313g |= 8;
        mo8380e0();
        return this;
    }

    /* renamed from: c */
    public T mo8379c() {
        return mo8396l0(C2028l.f7039c, new C2020i());
    }

    /* renamed from: e */
    public T clone() {
        try {
            T t = (C2144a) super.clone();
            C1790i iVar = new C1790i();
            t.f7329w = iVar;
            iVar.mo7745d(this.f7329w);
            C2182b bVar = new C2182b();
            t.f7330x = bVar;
            bVar.putAll(this.f7330x);
            t.f7332z = false;
            t.f7308B = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public final T mo8380e0() {
        if (!this.f7332z) {
            m10009d0();
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2144a)) {
            return false;
        }
        C2144a aVar = (C2144a) obj;
        if (Float.compare(aVar.f7314h, this.f7314h) == 0 && this.f7318l == aVar.f7318l && C2194k.m10274d(this.f7317k, aVar.f7317k) && this.f7320n == aVar.f7320n && C2194k.m10274d(this.f7319m, aVar.f7319m) && this.f7328v == aVar.f7328v && C2194k.m10274d(this.f7327u, aVar.f7327u) && this.f7321o == aVar.f7321o && this.f7322p == aVar.f7322p && this.f7323q == aVar.f7323q && this.f7325s == aVar.f7325s && this.f7326t == aVar.f7326t && this.f7309C == aVar.f7309C && this.f7310D == aVar.f7310D && this.f7315i.equals(aVar.f7315i) && this.f7316j == aVar.f7316j && this.f7329w.equals(aVar.f7329w) && this.f7330x.equals(aVar.f7330x) && this.f7331y.equals(aVar.f7331y) && C2194k.m10274d(this.f7324r, aVar.f7324r) && C2194k.m10274d(this.f7307A, aVar.f7307A)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public T mo8382f(Class<?> cls) {
        if (this.f7308B) {
            return clone().mo8382f(cls);
        }
        C2193j.m10269d(cls);
        this.f7331y = cls;
        this.f7313g |= 4096;
        mo8380e0();
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.bumptech.glide.load.h<Y>, java.lang.Object, com.bumptech.glide.load.h] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T mo8383f0(com.bumptech.glide.load.C1787h<Y> r2, Y r3) {
        /*
            r1 = this;
            boolean r0 = r1.f7308B
            if (r0 == 0) goto L_0x000d
            com.bumptech.glide.q.a r0 = r1.clone()
            com.bumptech.glide.q.a r2 = r0.mo8383f0(r2, r3)
            return r2
        L_0x000d:
            com.bumptech.glide.p051s.C2193j.m10269d(r2)
            com.bumptech.glide.p051s.C2193j.m10269d(r3)
            com.bumptech.glide.load.i r0 = r1.f7329w
            r0.mo7746e(r2, r3)
            r1.mo8380e0()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p047q.C2144a.mo8383f0(com.bumptech.glide.load.h, java.lang.Object):com.bumptech.glide.q.a");
    }

    /* renamed from: g */
    public T mo8384g(C1873j jVar) {
        if (this.f7308B) {
            return clone().mo8384g(jVar);
        }
        C2193j.m10269d(jVar);
        this.f7315i = jVar;
        this.f7313g |= 4;
        mo8380e0();
        return this;
    }

    /* renamed from: g0 */
    public T mo8385g0(C1786g gVar) {
        if (this.f7308B) {
            return clone().mo8385g0(gVar);
        }
        C2193j.m10269d(gVar);
        this.f7324r = gVar;
        this.f7313g |= 1024;
        mo8380e0();
        return this;
    }

    /* renamed from: h */
    public T mo8386h() {
        return mo8383f0(C2081i.f7153b, Boolean.TRUE);
    }

    /* renamed from: h0 */
    public T mo8387h0(float f) {
        if (this.f7308B) {
            return clone().mo8387h0(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f7314h = f;
        this.f7313g |= 2;
        mo8380e0();
        return this;
    }

    public int hashCode() {
        return C2194k.m10285o(this.f7307A, C2194k.m10285o(this.f7324r, C2194k.m10285o(this.f7331y, C2194k.m10285o(this.f7330x, C2194k.m10285o(this.f7329w, C2194k.m10285o(this.f7316j, C2194k.m10285o(this.f7315i, C2194k.m10286p(this.f7310D, C2194k.m10286p(this.f7309C, C2194k.m10286p(this.f7326t, C2194k.m10286p(this.f7325s, C2194k.m10284n(this.f7323q, C2194k.m10284n(this.f7322p, C2194k.m10286p(this.f7321o, C2194k.m10285o(this.f7327u, C2194k.m10284n(this.f7328v, C2194k.m10285o(this.f7319m, C2194k.m10284n(this.f7320n, C2194k.m10285o(this.f7317k, C2194k.m10284n(this.f7318l, C2194k.m10282l(this.f7314h)))))))))))))))))))));
    }

    /* renamed from: i */
    public T mo8389i(C2028l lVar) {
        C1787h hVar = C2028l.f7042f;
        C2193j.m10269d(lVar);
        return mo8383f0(hVar, lVar);
    }

    /* renamed from: i0 */
    public T mo8390i0(boolean z) {
        if (this.f7308B) {
            return clone().mo8390i0(true);
        }
        this.f7321o = !z;
        this.f7313g |= 256;
        mo8380e0();
        return this;
    }

    /* renamed from: j */
    public T mo8391j(int i) {
        if (this.f7308B) {
            return clone().mo8391j(i);
        }
        this.f7318l = i;
        int i2 = this.f7313g | 32;
        this.f7313g = i2;
        this.f7317k = null;
        this.f7313g = i2 & -17;
        mo8380e0();
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.bumptech.glide.load.m, com.bumptech.glide.load.m<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo8392j0(com.bumptech.glide.load.C1794m<android.graphics.Bitmap> r2) {
        /*
            r1 = this;
            r0 = 1
            com.bumptech.glide.q.a r2 = r1.mo8394k0(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p047q.C2144a.mo8392j0(com.bumptech.glide.load.m):com.bumptech.glide.q.a");
    }

    /* renamed from: k */
    public T mo8393k(Drawable drawable) {
        if (this.f7308B) {
            return clone().mo8393k(drawable);
        }
        this.f7317k = drawable;
        int i = this.f7313g | 16;
        this.f7313g = i;
        this.f7318l = 0;
        this.f7313g = i & -33;
        mo8380e0();
        return this;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.bumptech.glide.load.m, com.bumptech.glide.load.m<android.graphics.Bitmap>] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo8394k0(com.bumptech.glide.load.C1794m<android.graphics.Bitmap> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.f7308B
            if (r0 == 0) goto L_0x000d
            com.bumptech.glide.q.a r0 = r2.clone()
            com.bumptech.glide.q.a r3 = r0.mo8394k0(r3, r4)
            return r3
        L_0x000d:
            com.bumptech.glide.load.p.d.o r0 = new com.bumptech.glide.load.p.d.o
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.mo8398m0(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.mo8398m0(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            r0.mo8132c()
            r2.mo8398m0(r1, r0, r4)
            java.lang.Class<com.bumptech.glide.load.p.h.c> r0 = com.bumptech.glide.load.p036p.p041h.C2070c.class
            com.bumptech.glide.load.p.h.f r1 = new com.bumptech.glide.load.p.h.f
            r1.<init>(r3)
            r2.mo8398m0(r0, r1, r4)
            r2.mo8380e0()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p047q.C2144a.mo8394k0(com.bumptech.glide.load.m, boolean):com.bumptech.glide.q.a");
    }

    /* renamed from: l */
    public final C1873j mo8395l() {
        return this.f7315i;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.bumptech.glide.load.m, com.bumptech.glide.load.m<android.graphics.Bitmap>] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo8396l0(com.bumptech.glide.load.p036p.p037d.C2028l r2, com.bumptech.glide.load.C1794m<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.f7308B
            if (r0 == 0) goto L_0x000d
            com.bumptech.glide.q.a r0 = r1.clone()
            com.bumptech.glide.q.a r2 = r0.mo8396l0(r2, r3)
            return r2
        L_0x000d:
            r1.mo8389i(r2)
            com.bumptech.glide.q.a r2 = r1.mo8392j0(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p047q.C2144a.mo8396l0(com.bumptech.glide.load.p.d.l, com.bumptech.glide.load.m):com.bumptech.glide.q.a");
    }

    /* renamed from: m */
    public final int mo8397m() {
        return this.f7318l;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.bumptech.glide.load.m, com.bumptech.glide.load.m<Y>, java.lang.Object] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T mo8398m0(java.lang.Class<Y> r2, com.bumptech.glide.load.C1794m<Y> r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = r1.f7308B
            if (r0 == 0) goto L_0x000d
            com.bumptech.glide.q.a r0 = r1.clone()
            com.bumptech.glide.q.a r2 = r0.mo8398m0(r2, r3, r4)
            return r2
        L_0x000d:
            com.bumptech.glide.p051s.C2193j.m10269d(r2)
            com.bumptech.glide.p051s.C2193j.m10269d(r3)
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.m<?>> r0 = r1.f7330x
            r0.put(r2, r3)
            int r2 = r1.f7313g
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r1.f7313g = r2
            r3 = 1
            r1.f7326t = r3
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r0
            r1.f7313g = r2
            r0 = 0
            r1.f7311E = r0
            if (r4 == 0) goto L_0x0032
            r4 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r4
            r1.f7313g = r2
            r1.f7325s = r3
        L_0x0032:
            r1.mo8380e0()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p047q.C2144a.mo8398m0(java.lang.Class, com.bumptech.glide.load.m, boolean):com.bumptech.glide.q.a");
    }

    /* renamed from: n */
    public final Drawable mo8399n() {
        return this.f7317k;
    }

    /* renamed from: n0 */
    public T mo8400n0(boolean z) {
        if (this.f7308B) {
            return clone().mo8400n0(z);
        }
        this.f7312F = z;
        this.f7313g |= 1048576;
        mo8380e0();
        return this;
    }

    /* renamed from: o */
    public final Drawable mo8401o() {
        return this.f7327u;
    }

    /* renamed from: q */
    public final int mo8402q() {
        return this.f7328v;
    }

    /* renamed from: r */
    public final boolean mo8403r() {
        return this.f7310D;
    }

    /* renamed from: s */
    public final C1790i mo8404s() {
        return this.f7329w;
    }

    /* renamed from: t */
    public final int mo8405t() {
        return this.f7322p;
    }

    /* renamed from: u */
    public final int mo8406u() {
        return this.f7323q;
    }

    /* renamed from: v */
    public final Drawable mo8407v() {
        return this.f7319m;
    }

    /* renamed from: w */
    public final int mo8408w() {
        return this.f7320n;
    }

    /* renamed from: y */
    public final C1730g mo8409y() {
        return this.f7316j;
    }

    /* renamed from: z */
    public final Class<?> mo8410z() {
        return this.f7331y;
    }
}
