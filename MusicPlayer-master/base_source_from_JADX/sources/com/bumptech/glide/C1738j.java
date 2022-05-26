package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import com.bumptech.glide.load.p030n.C1873j;
import com.bumptech.glide.p047q.C2144a;
import com.bumptech.glide.p047q.C2145b;
import com.bumptech.glide.p047q.C2146c;
import com.bumptech.glide.p047q.C2147d;
import com.bumptech.glide.p047q.C2148e;
import com.bumptech.glide.p047q.C2150f;
import com.bumptech.glide.p047q.C2152g;
import com.bumptech.glide.p047q.C2153h;
import com.bumptech.glide.p047q.C2155j;
import com.bumptech.glide.p047q.p048l.C2166i;
import com.bumptech.glide.p047q.p048l.C2167j;
import com.bumptech.glide.p050r.C2175a;
import com.bumptech.glide.p051s.C2185e;
import com.bumptech.glide.p051s.C2193j;
import com.bumptech.glide.p051s.C2194k;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.j */
/* compiled from: RequestBuilder */
public class C1738j<TranscodeType> extends C2144a<C1738j<TranscodeType>> implements Cloneable {

    /* renamed from: G */
    private final Context f6485G;

    /* renamed from: H */
    private final C1740k f6486H;

    /* renamed from: I */
    private final Class<TranscodeType> f6487I;

    /* renamed from: J */
    private final C1726d f6488J;

    /* renamed from: K */
    private C1743l<?, ? super TranscodeType> f6489K;

    /* renamed from: L */
    private Object f6490L;

    /* renamed from: M */
    private List<C2152g<TranscodeType>> f6491M;

    /* renamed from: N */
    private C1738j<TranscodeType> f6492N;

    /* renamed from: O */
    private C1738j<TranscodeType> f6493O;

    /* renamed from: P */
    private Float f6494P;

    /* renamed from: Q */
    private boolean f6495Q = true;

    /* renamed from: R */
    private boolean f6496R;

    /* renamed from: S */
    private boolean f6497S;

    /* renamed from: com.bumptech.glide.j$a */
    /* compiled from: RequestBuilder */
    static /* synthetic */ class C1739a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6498a;

        /* renamed from: b */
        static final /* synthetic */ int[] f6499b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
                com.bumptech.glide.g[] r0 = com.bumptech.glide.C1730g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6499b = r0
                r1 = 1
                com.bumptech.glide.g r2 = com.bumptech.glide.C1730g.LOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f6499b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.g r3 = com.bumptech.glide.C1730g.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f6499b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bumptech.glide.g r4 = com.bumptech.glide.C1730g.HIGH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f6499b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bumptech.glide.g r5 = com.bumptech.glide.C1730g.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f6498a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f6498a     // Catch:{ NoSuchFieldError -> 0x004e }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f6498a     // Catch:{ NoSuchFieldError -> 0x0058 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f6498a     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f6498a     // Catch:{ NoSuchFieldError -> 0x006d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f6498a     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f6498a     // Catch:{ NoSuchFieldError -> 0x0083 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f6498a     // Catch:{ NoSuchFieldError -> 0x008f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C1738j.C1739a.<clinit>():void");
        }
    }

    static {
        C2153h hVar = (C2153h) ((C2153h) ((C2153h) new C2153h().mo8384g(C1873j.f6767b)).mo8378b0(C1730g.LOW)).mo8390i0(true);
    }

    @SuppressLint({"CheckResult"})
    protected C1738j(C1719b bVar, C1740k kVar, Class<TranscodeType> cls, Context context) {
        this.f6486H = kVar;
        this.f6487I = cls;
        this.f6485G = context;
        this.f6489K = kVar.mo7660q(cls);
        this.f6488J = bVar.mo7587i();
        m8652v0(kVar.mo7654o());
        mo7637a(kVar.mo7659p());
    }

    /* renamed from: A0 */
    private boolean m8645A0(C2144a<?> aVar, C2147d dVar) {
        return !aVar.mo8362H() && dVar.mo8423j();
    }

    /* renamed from: G0 */
    private C1738j<TranscodeType> m8646G0(Object obj) {
        if (mo8361G()) {
            return mo7639e().m8646G0(obj);
        }
        this.f6490L = obj;
        this.f6496R = true;
        mo8380e0();
        return this;
    }

    /* renamed from: H0 */
    private C2147d m8647H0(Object obj, C2166i<TranscodeType> iVar, C2152g<TranscodeType> gVar, C2144a<?> aVar, C2148e eVar, C1743l<?, ? super TranscodeType> lVar, C1730g gVar2, int i, int i2, Executor executor) {
        Context context = this.f6485G;
        C1726d dVar = this.f6488J;
        return C2155j.m10130x(context, dVar, obj, this.f6490L, this.f6487I, aVar, i, i2, gVar2, iVar, gVar, this.f6491M, eVar, dVar.mo7605f(), lVar.mo7674b(), executor);
    }

    /* renamed from: q0 */
    private C2147d m8648q0(C2166i<TranscodeType> iVar, C2152g<TranscodeType> gVar, C2144a<?> aVar, Executor executor) {
        return m8649r0(new Object(), iVar, gVar, (C2148e) null, this.f6489K, aVar.mo8409y(), aVar.mo8406u(), aVar.mo8405t(), aVar, executor);
    }

    /* renamed from: r0 */
    private C2147d m8649r0(Object obj, C2166i<TranscodeType> iVar, C2152g<TranscodeType> gVar, C2148e eVar, C1743l<?, ? super TranscodeType> lVar, C1730g gVar2, int i, int i2, C2144a<?> aVar, Executor executor) {
        C2145b bVar;
        C2145b bVar2;
        if (this.f6493O != null) {
            bVar2 = new C2145b(obj, eVar);
            bVar = bVar2;
        } else {
            Object obj2 = obj;
            bVar = null;
            bVar2 = eVar;
        }
        C2147d s0 = m8650s0(obj, iVar, gVar, bVar2, lVar, gVar2, i, i2, aVar, executor);
        if (bVar == null) {
            return s0;
        }
        int u = this.f6493O.mo8406u();
        int t = this.f6493O.mo8405t();
        if (C2194k.m10290t(i, i2) && !this.f6493O.mo8368P()) {
            u = aVar.mo8406u();
            t = aVar.mo8405t();
        }
        C1738j<TranscodeType> jVar = this.f6493O;
        C2145b bVar3 = bVar;
        bVar3.mo8425p(s0, jVar.m8649r0(obj, iVar, gVar, bVar3, jVar.f6489K, jVar.mo8409y(), u, t, this.f6493O, executor));
        return bVar3;
    }

    /* JADX WARNING: type inference failed for: r27v0, types: [com.bumptech.glide.q.a, com.bumptech.glide.q.a<?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bumptech.glide.p047q.C2147d m8650s0(java.lang.Object r19, com.bumptech.glide.p047q.p048l.C2166i<TranscodeType> r20, com.bumptech.glide.p047q.C2152g<TranscodeType> r21, com.bumptech.glide.p047q.C2148e r22, com.bumptech.glide.C1743l<?, ? super TranscodeType> r23, com.bumptech.glide.C1730g r24, int r25, int r26, com.bumptech.glide.p047q.C2144a<?> r27, java.util.concurrent.Executor r28) {
        /*
            r18 = this;
            r11 = r18
            r12 = r19
            r5 = r22
            r13 = r24
            com.bumptech.glide.j<TranscodeType> r0 = r11.f6492N
            if (r0 == 0) goto L_0x0094
            boolean r1 = r11.f6497S
            if (r1 != 0) goto L_0x008c
            com.bumptech.glide.l<?, ? super TranscodeType> r1 = r0.f6489K
            boolean r2 = r0.f6495Q
            if (r2 == 0) goto L_0x0019
            r14 = r23
            goto L_0x001a
        L_0x0019:
            r14 = r1
        L_0x001a:
            boolean r0 = r0.mo8363I()
            if (r0 == 0) goto L_0x0027
            com.bumptech.glide.j<TranscodeType> r0 = r11.f6492N
            com.bumptech.glide.g r0 = r0.mo8409y()
            goto L_0x002b
        L_0x0027:
            com.bumptech.glide.g r0 = r11.m8651u0(r13)
        L_0x002b:
            r15 = r0
            com.bumptech.glide.j<TranscodeType> r0 = r11.f6492N
            int r0 = r0.mo8406u()
            com.bumptech.glide.j<TranscodeType> r1 = r11.f6492N
            int r1 = r1.mo8405t()
            boolean r2 = com.bumptech.glide.p051s.C2194k.m10290t(r25, r26)
            if (r2 == 0) goto L_0x004e
            com.bumptech.glide.j<TranscodeType> r2 = r11.f6492N
            boolean r2 = r2.mo8368P()
            if (r2 != 0) goto L_0x004e
            int r0 = r27.mo8406u()
            int r1 = r27.mo8405t()
        L_0x004e:
            r16 = r0
            r17 = r1
            com.bumptech.glide.q.k r10 = new com.bumptech.glide.q.k
            r10.<init>(r12, r5)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r10
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r13 = r10
            r10 = r28
            com.bumptech.glide.q.d r10 = r0.m8647H0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 1
            r11.f6497S = r0
            com.bumptech.glide.j<TranscodeType> r9 = r11.f6492N
            r0 = r9
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r12 = r10
            r10 = r28
            com.bumptech.glide.q.d r0 = r0.m8649r0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 0
            r11.f6497S = r1
            r13.mo8446o(r12, r0)
            return r13
        L_0x008c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"
            r0.<init>(r1)
            throw r0
        L_0x0094:
            java.lang.Float r0 = r11.f6494P
            if (r0 == 0) goto L_0x00d4
            com.bumptech.glide.q.k r14 = new com.bumptech.glide.q.k
            r14.<init>(r12, r5)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r14
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            com.bumptech.glide.q.d r15 = r0.m8647H0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.bumptech.glide.q.a r0 = r27.clone()
            java.lang.Float r1 = r11.f6494P
            float r1 = r1.floatValue()
            com.bumptech.glide.q.a r4 = r0.mo8387h0(r1)
            com.bumptech.glide.g r7 = r11.m8651u0(r13)
            r0 = r18
            r1 = r19
            com.bumptech.glide.q.d r0 = r0.m8647H0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.mo8446o(r15, r0)
            return r14
        L_0x00d4:
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            com.bumptech.glide.q.d r0 = r0.m8647H0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C1738j.m8650s0(java.lang.Object, com.bumptech.glide.q.l.i, com.bumptech.glide.q.g, com.bumptech.glide.q.e, com.bumptech.glide.l, com.bumptech.glide.g, int, int, com.bumptech.glide.q.a, java.util.concurrent.Executor):com.bumptech.glide.q.d");
    }

    /* renamed from: u0 */
    private C1730g m8651u0(C1730g gVar) {
        int i = C1739a.f6499b[gVar.ordinal()];
        if (i == 1) {
            return C1730g.NORMAL;
        }
        if (i == 2) {
            return C1730g.HIGH;
        }
        if (i == 3 || i == 4) {
            return C1730g.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + mo8409y());
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: v0 */
    private void m8652v0(List<C2152g<Object>> list) {
        for (C2152g<Object> o0 : list) {
            mo7640o0(o0);
        }
    }

    /* renamed from: x0 */
    private <Y extends C2166i<TranscodeType>> Y m8653x0(Y y, C2152g<TranscodeType> gVar, C2144a<?> aVar, Executor executor) {
        C2193j.m10269d(y);
        if (this.f6496R) {
            C2147d q0 = m8648q0(y, gVar, aVar, executor);
            C2147d j = y.mo8436j();
            if (!q0.mo8416d(j) || m8645A0(aVar, j)) {
                this.f6486H.mo7653n(y);
                y.mo8429e(q0);
                this.f6486H.mo7646A(y, q0);
                return y;
            }
            C2193j.m10269d(j);
            if (!j.isRunning()) {
                j.mo8420h();
            }
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* renamed from: B0 */
    public C1738j<TranscodeType> mo7629B0(C2152g<TranscodeType> gVar) {
        if (mo8361G()) {
            return mo7639e().mo7629B0(gVar);
        }
        this.f6491M = null;
        return mo7640o0(gVar);
    }

    /* renamed from: C0 */
    public C1738j<TranscodeType> mo7630C0(Uri uri) {
        return m8646G0(uri);
    }

    /* renamed from: D0 */
    public C1738j<TranscodeType> mo7631D0(Integer num) {
        return m8646G0(num).mo7637a(C2153h.m10111q0(C2175a.m10226c(this.f6485G)));
    }

    /* renamed from: E0 */
    public C1738j<TranscodeType> mo7632E0(Object obj) {
        return m8646G0(obj);
    }

    /* renamed from: F0 */
    public C1738j<TranscodeType> mo7633F0(String str) {
        return m8646G0(str);
    }

    /* renamed from: I0 */
    public C2146c<TranscodeType> mo7634I0() {
        return mo7635J0(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: J0 */
    public C2146c<TranscodeType> mo7635J0(int i, int i2) {
        C2150f fVar = new C2150f(i, i2);
        mo7644y0(fVar, fVar, C2185e.m10250a());
        return fVar;
    }

    /* renamed from: K0 */
    public C1738j<TranscodeType> mo7636K0(float f) {
        if (mo8361G()) {
            return mo7639e().mo7636K0(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f6494P = Float.valueOf(f);
        mo8380e0();
        return this;
    }

    /* renamed from: o0 */
    public C1738j<TranscodeType> mo7640o0(C2152g<TranscodeType> gVar) {
        if (mo8361G()) {
            return mo7639e().mo7640o0(gVar);
        }
        if (gVar != null) {
            if (this.f6491M == null) {
                this.f6491M = new ArrayList();
            }
            this.f6491M.add(gVar);
        }
        mo8380e0();
        return this;
    }

    /* renamed from: p0 */
    public C1738j<TranscodeType> mo7637a(C2144a<?> aVar) {
        C2193j.m10269d(aVar);
        return (C1738j) super.mo7637a(aVar);
    }

    /* renamed from: t0 */
    public C1738j<TranscodeType> mo7639e() {
        C1738j<TranscodeType> jVar = (C1738j) super.clone();
        jVar.f6489K = jVar.f6489K.clone();
        if (jVar.f6491M != null) {
            jVar.f6491M = new ArrayList(jVar.f6491M);
        }
        C1738j<TranscodeType> jVar2 = jVar.f6492N;
        if (jVar2 != null) {
            jVar.f6492N = jVar2.mo7639e();
        }
        C1738j<TranscodeType> jVar3 = jVar.f6493O;
        if (jVar3 != null) {
            jVar.f6493O = jVar3.mo7639e();
        }
        return jVar;
    }

    /* renamed from: w0 */
    public <Y extends C2166i<TranscodeType>> Y mo7643w0(Y y) {
        mo7644y0(y, (C2152g) null, C2185e.m10251b());
        return y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public <Y extends C2166i<TranscodeType>> Y mo7644y0(Y y, C2152g<TranscodeType> gVar, Executor executor) {
        m8653x0(y, gVar, this, executor);
        return y;
    }

    /* renamed from: z0 */
    public C2167j<ImageView, TranscodeType> mo7645z0(ImageView imageView) {
        C2144a aVar;
        C2194k.m10272b();
        C2193j.m10269d(imageView);
        if (!mo8367O() && mo8365M() && imageView.getScaleType() != null) {
            switch (C1739a.f6498a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().mo8370S();
                    break;
                case 2:
                    aVar = clone().mo8371T();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().mo8372U();
                    break;
                case 6:
                    aVar = clone().mo8371T();
                    break;
            }
        }
        aVar = this;
        C2167j<ImageView, TranscodeType> a = this.f6488J.mo7600a(imageView, this.f6487I);
        m8653x0(a, (C2152g) null, aVar, C2185e.m10251b());
        return a;
    }
}
