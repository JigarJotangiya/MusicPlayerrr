package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.ads.internal.util.C3018m1;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class lp0 extends un0 implements C5267kl, C5154hj, C5601tm, C5261kf, C5815zd {

    /* renamed from: C */
    public static final /* synthetic */ int f19476C = 0;

    /* renamed from: A */
    private volatile ap0 f19477A;

    /* renamed from: B */
    private final Set<WeakReference<yo0>> f19478B = new HashSet();

    /* renamed from: i */
    private final Context f19479i;

    /* renamed from: j */
    private final bp0 f19480j;

    /* renamed from: k */
    private final C5519re f19481k;

    /* renamed from: l */
    private final C5519re f19482l;

    /* renamed from: m */
    private final C5340mk f19483m;

    /* renamed from: n */
    private final do0 f19484n;

    /* renamed from: o */
    private C4963ce f19485o;

    /* renamed from: p */
    private ByteBuffer f19486p;

    /* renamed from: q */
    private boolean f19487q;

    /* renamed from: r */
    private final WeakReference<eo0> f19488r;

    /* renamed from: s */
    private tn0 f19489s;

    /* renamed from: t */
    private int f19490t;

    /* renamed from: u */
    private int f19491u;

    /* renamed from: v */
    private long f19492v;

    /* renamed from: w */
    private final String f19493w;

    /* renamed from: x */
    private final int f19494x;

    /* renamed from: y */
    private final Object f19495y = new Object();

    /* renamed from: z */
    private final ArrayList<C5044el> f19496z;

    public lp0(Context context, do0 do0, eo0 eo0) {
        this.f19479i = context;
        this.f19484n = do0;
        this.f19488r = new WeakReference<>(eo0);
        bp0 bp0 = new bp0();
        this.f19480j = bp0;
        C5264ki kiVar = C5264ki.f18882a;
        w03 w03 = C2979b2.f9980i;
        C5194im imVar = new C5194im(context, kiVar, 0, w03, this, -1);
        this.f19481k = imVar;
        C5817zf zfVar = new C5817zf(kiVar, (C5336mg) null, true, w03, this);
        this.f19482l = zfVar;
        C5192ik ikVar = new C5192ik((C5377nk) null);
        this.f19483m = ikVar;
        if (C3018m1.m13390m()) {
            C3018m1.m13388k("ForkedExoPlayerAdapter initialize ".concat(toString()));
        }
        un0.f24379g.incrementAndGet();
        int i = 0;
        C4963ce a = C5000de.m22476a(new C5519re[]{zfVar, imVar}, ikVar, bp0);
        this.f19485o = a;
        a.mo16599P0(this);
        this.f19490t = 0;
        this.f19492v = 0;
        this.f19491u = 0;
        this.f19496z = new ArrayList<>();
        this.f19477A = null;
        this.f19493w = (eo0 == null || eo0.mo17246n() == null) ? BuildConfig.FLAVOR : eo0.mo17246n();
        this.f19494x = eo0 != null ? eo0.mo17237e() : i;
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22552k)).booleanValue()) {
            this.f19485o.mo16603d();
        }
        if (eo0 != null && eo0.mo17236d() > 0) {
            this.f19485o.mo16593J0(eo0.mo17236d());
        }
        if (eo0 != null && eo0.mo17235c() > 0) {
            this.f19485o.mo16602c(eo0.mo17235c());
        }
    }

    /* renamed from: j0 */
    private final boolean m26835j0() {
        return this.f19477A != null && this.f19477A.mo15918k();
    }

    /* renamed from: A */
    public final void mo17604A(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        C5339mj mjVar;
        if (this.f19485o != null) {
            this.f19486p = byteBuffer;
            this.f19487q = z;
            int length = uriArr.length;
            if (length == 1) {
                mjVar = mo19234c0(uriArr[0], str);
            } else {
                C5339mj[] mjVarArr = new C5339mj[length];
                for (int i = 0; i < uriArr.length; i++) {
                    mjVarArr[i] = mo19234c0(uriArr[i], str);
                }
                mjVar = new C5487qj(mjVarArr);
            }
            this.f19485o.mo16597N0(mjVar);
            un0.f24380h.incrementAndGet();
        }
    }

    /* renamed from: B */
    public final void mo19232B(boolean z) {
    }

    /* renamed from: C */
    public final void mo17605C() {
        C4963ce ceVar = this.f19485o;
        if (ceVar != null) {
            ceVar.mo16595L0(this);
            this.f19485o.mo16605g();
            this.f19485o = null;
            un0.f24380h.decrementAndGet();
        }
    }

    /* renamed from: D */
    public final void mo17606D(long j) {
        this.f19485o.mo16596M0(j);
    }

    /* renamed from: E */
    public final void mo17607E(int i) {
        this.f19480j.mo16341f(i);
    }

    /* renamed from: F */
    public final void mo17608F(int i) {
        this.f19480j.mo16342g(i);
    }

    /* renamed from: G */
    public final void mo17609G(tn0 tn0) {
        this.f19489s = tn0;
    }

    /* renamed from: H */
    public final void mo17610H(int i) {
        this.f19480j.mo16343h(i);
    }

    /* renamed from: I */
    public final void mo17611I(int i) {
        this.f19480j.mo16344i(i);
    }

    /* renamed from: J */
    public final void mo17612J(boolean z) {
        this.f19485o.mo16592I0(z);
    }

    /* renamed from: K */
    public final void mo17613K(boolean z) {
        if (this.f19485o != null) {
            for (int i = 0; i < 2; i++) {
                this.f19483m.mo19400f(i, !z);
            }
        }
    }

    /* renamed from: L */
    public final void mo17614L(int i) {
        for (WeakReference<yo0> weakReference : this.f19478B) {
            yo0 yo0 = (yo0) weakReference.get();
            if (yo0 != null) {
                yo0.mo22269g(i);
            }
        }
    }

    /* renamed from: M */
    public final void mo17615M(Surface surface, boolean z) {
        C4963ce ceVar = this.f19485o;
        if (ceVar != null) {
            C4926be beVar = new C4926be(this.f19481k, 1, surface);
            if (z) {
                ceVar.mo16598O0(beVar);
                return;
            }
            ceVar.mo16594K0(beVar);
        }
    }

    /* renamed from: N */
    public final void mo17616N(float f, boolean z) {
        if (this.f19485o != null) {
            C4926be beVar = new C4926be(this.f19482l, 2, Float.valueOf(f));
            if (z) {
                this.f19485o.mo16598O0(beVar);
                return;
            }
            this.f19485o.mo16594K0(beVar);
        }
    }

    /* renamed from: O */
    public final void mo17617O() {
        this.f19485o.zzp();
    }

    /* renamed from: P */
    public final boolean mo17618P() {
        return this.f19485o != null;
    }

    /* renamed from: Q */
    public final boolean mo17619Q() {
        return this.f19485o.mo16606o();
    }

    /* renamed from: R */
    public final int mo17620R() {
        return this.f19491u;
    }

    /* renamed from: T */
    public final int mo17621T() {
        return this.f19485o.zza();
    }

    /* renamed from: V */
    public final long mo17622V() {
        return this.f19485o.mo16600a();
    }

    /* renamed from: W */
    public final long mo17623W() {
        return (long) this.f19490t;
    }

    /* renamed from: X */
    public final long mo17624X() {
        if (m26835j0() && this.f19477A.mo15917j()) {
            return Math.min((long) this.f19490t, this.f19477A.mo15912d());
        }
        return 0;
    }

    /* renamed from: Y */
    public final long mo17625Y() {
        return this.f19485o.mo16601b();
    }

    /* renamed from: Z */
    public final long mo17626Z() {
        return this.f19485o.mo16604f();
    }

    /* renamed from: a0 */
    public final long mo17628a0() {
        if (!m26835j0()) {
            return (long) this.f19490t;
        }
        return 0;
    }

    /* renamed from: b0 */
    public final long mo17630b0() {
        if (m26835j0()) {
            return this.f19477A.mo15913e();
        }
        synchronized (this.f19495y) {
            while (!this.f19496z.isEmpty()) {
                long j = this.f19492v;
                Map<String, List<String>> zze = this.f19496z.remove(0).zze();
                long j2 = 0;
                if (zze != null) {
                    Iterator<Map.Entry<String, List<String>>> it = zze.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry next = it.next();
                        if (next != null) {
                            try {
                                if (!(next.getKey() == null || !a13.m20556c("content-length", (CharSequence) next.getKey()) || next.getValue() == null || ((List) next.getValue()).get(0) == null)) {
                                    j2 = Long.parseLong((String) ((List) next.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.f19492v = j + j2;
            }
        }
        return this.f19492v;
    }

    /* renamed from: c */
    public final void mo19233c(C4969ck ckVar, C5414ok okVar) {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.C5054ev.m23225c().mo20153b(com.google.android.gms.internal.ads.C5503qz.f22546j1)).booleanValue() == false) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009c  */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C5339mj mo19234c0(android.net.Uri r11, java.lang.String r12) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.ij r9 = new com.google.android.gms.internal.ads.ij
            boolean r0 = r10.f19487q
            if (r0 == 0) goto L_0x0022
            java.nio.ByteBuffer r0 = r10.f19486p
            int r0 = r0.limit()
            if (r0 <= 0) goto L_0x0022
            java.nio.ByteBuffer r12 = r10.f19486p
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r0 = r10.f19486p
            r0.get(r12)
            com.google.android.gms.internal.ads.ip0 r0 = new com.google.android.gms.internal.ads.ip0
            r0.<init>(r12)
        L_0x0020:
            r2 = r0
            goto L_0x0087
        L_0x0022:
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22586o1
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r0 = r1.mo20153b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 == 0) goto L_0x0047
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22546j1
            com.google.android.gms.internal.ads.oz r2 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r0 = r2.mo20153b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x004f
        L_0x0047:
            com.google.android.gms.internal.ads.do0 r0 = r10.f19484n
            boolean r0 = r0.f15692i
            if (r0 != 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r1 = 0
        L_0x004f:
            com.google.android.gms.internal.ads.do0 r0 = r10.f19484n
            int r2 = r0.f15691h
            if (r2 <= 0) goto L_0x005b
            com.google.android.gms.internal.ads.gp0 r2 = new com.google.android.gms.internal.ads.gp0
            r2.<init>(r10, r12, r1)
            goto L_0x0060
        L_0x005b:
            com.google.android.gms.internal.ads.hp0 r2 = new com.google.android.gms.internal.ads.hp0
            r2.<init>(r10, r12, r1)
        L_0x0060:
            boolean r12 = r0.f15692i
            if (r12 == 0) goto L_0x006a
            com.google.android.gms.internal.ads.fp0 r12 = new com.google.android.gms.internal.ads.fp0
            r12.<init>(r10, r2)
            r2 = r12
        L_0x006a:
            java.nio.ByteBuffer r12 = r10.f19486p
            if (r12 == 0) goto L_0x0087
            int r12 = r12.limit()
            if (r12 <= 0) goto L_0x0087
            java.nio.ByteBuffer r12 = r10.f19486p
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r0 = r10.f19486p
            r0.get(r12)
            com.google.android.gms.internal.ads.ep0 r0 = new com.google.android.gms.internal.ads.ep0
            r0.<init>(r2, r12)
            goto L_0x0020
        L_0x0087:
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r12 = com.google.android.gms.internal.ads.C5503qz.f22544j
            com.google.android.gms.internal.ads.oz r0 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r12 = r0.mo20153b(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x009c
            com.google.android.gms.internal.ads.cp0 r12 = com.google.android.gms.internal.ads.cp0.f15109a
            goto L_0x009e
        L_0x009c:
            com.google.android.gms.internal.ads.dp0 r12 = com.google.android.gms.internal.ads.dp0.f15720a
        L_0x009e:
            r3 = r12
            com.google.android.gms.internal.ads.do0 r12 = r10.f19484n
            int r4 = r12.f15693j
            com.google.android.gms.internal.ads.w03 r5 = com.google.android.gms.ads.internal.util.C2979b2.f9980i
            r7 = 0
            int r8 = r12.f15689f
            r0 = r9
            r1 = r11
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lp0.mo19234c0(android.net.Uri, java.lang.String):com.google.android.gms.internal.ads.mj");
    }

    /* renamed from: d */
    public final void mo18149d(IOException iOException) {
        tn0 tn0 = this.f19489s;
        if (tn0 == null) {
            return;
        }
        if (this.f19484n.f15694k) {
            tn0.mo19804b("onLoadException", iOException);
        } else {
            tn0.mo19807e("onLoadError", iOException);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public final /* synthetic */ C5673vk mo19235d0(String str, boolean z) {
        lp0 lp0 = true != z ? null : this;
        do0 do0 = this.f19484n;
        yo0 yo0 = new yo0(str, lp0, do0.f15687d, do0.f15688e, do0.f15691h);
        this.f19478B.add(new WeakReference(yo0));
        return yo0;
    }

    /* renamed from: e */
    public final void mo19236e(C5741xe xeVar, Object obj) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public final /* synthetic */ C5673vk mo19237e0(String str, boolean z) {
        lp0 lp0 = true != z ? null : this;
        do0 do0 = this.f19484n;
        return new C4896al(str, (C5674vl<String>) null, lp0, do0.f15687d, do0.f15688e, true, (C5007dl) null);
    }

    /* renamed from: f */
    public final void mo19238f(C5778yd ydVar) {
        tn0 tn0 = this.f19489s;
        if (tn0 != null) {
            tn0.mo19807e("onPlayerError", ydVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final /* synthetic */ C5673vk mo19239f0(C5636uk ukVar) {
        return new ap0(this.f19479i, ukVar.zza(), this.f19493w, this.f19494x, this, new jp0(this), (jp0) null);
    }

    public final void finalize() throws Throwable {
        un0.f24379g.decrementAndGet();
        if (C3018m1.m13390m()) {
            C3018m1.m13388k("ForkedExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    /* renamed from: g */
    public final void mo19241g(int i, int i2, int i3, float f) {
        tn0 tn0 = this.f19489s;
        if (tn0 != null) {
            tn0.mo19808f(i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public final /* synthetic */ void mo19242g0(boolean z, long j) {
        tn0 tn0 = this.f19489s;
        if (tn0 != null) {
            tn0.mo19806d(z, j);
        }
    }

    /* renamed from: h */
    public final /* synthetic */ void mo18904h(Object obj, int i) {
        this.f19490t += i;
    }

    /* renamed from: h0 */
    public final void mo19243h0(C5673vk vkVar, int i) {
        this.f19490t += i;
    }

    /* renamed from: i0 */
    public final void mo18905r(C5673vk vkVar, C5747xk xkVar) {
        if (vkVar instanceof C5044el) {
            synchronized (this.f19495y) {
                this.f19496z.add((C5044el) vkVar);
            }
        } else if (vkVar instanceof ap0) {
            this.f19477A = (ap0) vkVar;
            eo0 eo0 = (eo0) this.f19488r.get();
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22546j1)).booleanValue() && eo0 != null && this.f19477A.mo15915h()) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.f19477A.mo15917j()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.f19477A.mo15916i()));
                C2979b2.f9980i.post(new kp0(eo0, hashMap));
            }
        }
    }

    /* renamed from: l */
    public final void mo18883l(zzapg zzapg) {
        eo0 eo0 = (eo0) this.f19488r.get();
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22546j1)).booleanValue() && eo0 != null && zzapg != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("audioMime", zzapg.f27125k);
            hashMap.put("audioSampleMime", zzapg.f27126l);
            hashMap.put("audioCodec", zzapg.f27123i);
            eo0.mo16880n0("onMetadataEvent", hashMap);
        }
    }

    /* renamed from: q */
    public final void mo19245q(zzapg zzapg) {
        eo0 eo0 = (eo0) this.f19488r.get();
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22546j1)).booleanValue() && eo0 != null && zzapg != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(zzapg.f27132r));
            hashMap.put("bitRate", String.valueOf(zzapg.f27122h));
            int i = zzapg.f27130p;
            int i2 = zzapg.f27131q;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            hashMap.put("resolution", sb.toString());
            hashMap.put("videoMime", zzapg.f27125k);
            hashMap.put("videoSampleMime", zzapg.f27126l);
            hashMap.put("videoCodec", zzapg.f27123i);
            eo0.mo16880n0("onMetadataEvent", hashMap);
        }
    }

    /* renamed from: s */
    public final void mo19246s(C5482qe qeVar) {
    }

    /* renamed from: v */
    public final void mo19247v(int i, long j) {
        this.f19491u += i;
    }

    /* renamed from: w */
    public final void mo19248w(boolean z, int i) {
        tn0 tn0 = this.f19489s;
        if (tn0 != null) {
            tn0.mo19805c(i);
        }
    }

    /* renamed from: y */
    public final void mo19249y(Surface surface) {
        tn0 tn0 = this.f19489s;
        if (tn0 != null) {
            tn0.mo19809t();
        }
    }

    /* renamed from: z */
    public final void mo17648z(Uri[] uriArr, String str) {
        mo17604A(uriArr, str, ByteBuffer.allocate(0), false);
    }

    public final void zze() {
    }
}
