package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
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

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fr0 extends un0 implements fr1, gx3 {

    /* renamed from: B */
    public static final /* synthetic */ int f16721B = 0;

    /* renamed from: A */
    private final Set<WeakReference<pq0>> f16722A = new HashSet();

    /* renamed from: i */
    private final Context f16723i;

    /* renamed from: j */
    private final qq0 f16724j;

    /* renamed from: k */
    private final v44 f16725k;

    /* renamed from: l */
    private final do0 f16726l;

    /* renamed from: m */
    private final WeakReference<eo0> f16727m;

    /* renamed from: n */
    private final j34 f16728n;

    /* renamed from: o */
    private uu3 f16729o;

    /* renamed from: p */
    private ByteBuffer f16730p;

    /* renamed from: q */
    private boolean f16731q;

    /* renamed from: r */
    private tn0 f16732r;

    /* renamed from: s */
    private int f16733s;

    /* renamed from: t */
    private int f16734t;

    /* renamed from: u */
    private long f16735u;

    /* renamed from: v */
    private final String f16736v;

    /* renamed from: w */
    private final int f16737w;

    /* renamed from: x */
    private final Object f16738x = new Object();

    /* renamed from: y */
    private final ArrayList<dp1> f16739y;

    /* renamed from: z */
    private volatile sq0 f16740z;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f4, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.C5054ev.m23225c().mo20153b(com.google.android.gms.internal.ads.C5503qz.f22546j1)).booleanValue() == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f8, code lost:
        if (r7.f15692i == false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00fa, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00fd, code lost:
        if (r7.f15691h <= 0) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ff, code lost:
        r8 = new com.google.android.gms.internal.ads.wq0(r5, r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0105, code lost:
        r8 = new com.google.android.gms.internal.ads.xq0(r5, r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010c, code lost:
        if (r7.f15692i == false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010e, code lost:
        r7 = new com.google.android.gms.internal.ads.vq0(r5, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0115, code lost:
        r7 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0116, code lost:
        r6 = r5.f16730p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0118, code lost:
        if (r6 == null) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011e, code lost:
        if (r6.limit() <= 0) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0120, code lost:
        r6 = new byte[r5.f16730p.limit()];
        r5.f16730p.get(r6);
        r7 = new com.google.android.gms.internal.ads.uq0(r7, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fr0(android.content.Context r6, com.google.android.gms.internal.ads.do0 r7, com.google.android.gms.internal.ads.eo0 r8) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r5.f16738x = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r5.f16722A = r0
            r5.f16723i = r6
            r5.f16726l = r7
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r8)
            r5.f16727m = r0
            com.google.android.gms.internal.ads.qq0 r0 = new com.google.android.gms.internal.ads.qq0
            r0.<init>()
            r5.f16724j = r0
            com.google.android.gms.internal.ads.v44 r1 = new com.google.android.gms.internal.ads.v44
            r1.<init>(r6)
            r5.f16725k = r1
            boolean r2 = com.google.android.gms.ads.internal.util.C3018m1.m13390m()
            if (r2 == 0) goto L_0x003d
            java.lang.String r2 = r5.toString()
            java.lang.String r3 = "OfficialSimpleExoPlayerAdapter initialize "
            java.lang.String r2 = r3.concat(r2)
            com.google.android.gms.ads.internal.util.C3018m1.m13388k(r2)
        L_0x003d:
            java.util.concurrent.atomic.AtomicInteger r2 = com.google.android.gms.internal.ads.un0.f24379g
            r2.incrementAndGet()
            com.google.android.gms.internal.ads.hk3 r2 = new com.google.android.gms.internal.ads.hk3
            com.google.android.gms.internal.ads.ar0 r3 = new com.google.android.gms.internal.ads.ar0
            r3.<init>(r5)
            r4 = 0
            r2.<init>(r6, r3, r4)
            r2.mo18164b(r1)
            r2.mo18163a(r0)
            com.google.android.gms.internal.ads.uu3 r0 = r2.mo18165c()
            r5.f16729o = r0
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22570m1
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r0 = r1.mo20153b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto L_0x0071
            com.google.android.gms.internal.ads.uu3 r0 = r5.f16729o
            r0.mo21371J(r1)
        L_0x0071:
            com.google.android.gms.internal.ads.uu3 r0 = r5.f16729o
            r0.mo21365D(r5)
            r5.f16733s = r1
            r2 = 0
            r5.f16735u = r2
            r5.f16734t = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.f16739y = r0
            r5.f16740z = r4
            if (r8 == 0) goto L_0x0094
            java.lang.String r0 = r8.mo17246n()
            if (r0 == 0) goto L_0x0094
            java.lang.String r0 = r8.mo17246n()
            goto L_0x0096
        L_0x0094:
            java.lang.String r0 = ""
        L_0x0096:
            r5.f16736v = r0
            if (r8 == 0) goto L_0x009f
            int r0 = r8.mo17237e()
            goto L_0x00a0
        L_0x009f:
            r0 = 0
        L_0x00a0:
            r5.f16737w = r0
            com.google.android.gms.internal.ads.j34 r0 = new com.google.android.gms.internal.ads.j34
            com.google.android.gms.ads.internal.util.b2 r2 = com.google.android.gms.ads.internal.C2971s.m13214q()
            com.google.android.gms.internal.ads.zzcjf r8 = r8.zzp()
            java.lang.String r8 = r8.f27376g
            java.lang.String r6 = r2.mo10977L(r6, r8)
            boolean r8 = r5.f16731q
            if (r8 == 0) goto L_0x00d1
            java.nio.ByteBuffer r8 = r5.f16730p
            int r8 = r8.limit()
            if (r8 <= 0) goto L_0x00d1
            java.nio.ByteBuffer r6 = r5.f16730p
            int r6 = r6.limit()
            byte[] r6 = new byte[r6]
            java.nio.ByteBuffer r7 = r5.f16730p
            r7.get(r6)
            com.google.android.gms.internal.ads.yq0 r7 = new com.google.android.gms.internal.ads.yq0
            r7.<init>(r6)
            goto L_0x0133
        L_0x00d1:
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r8 = com.google.android.gms.internal.ads.C5503qz.f22586o1
            com.google.android.gms.internal.ads.oz r2 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r8 = r2.mo20153b(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r2 = 1
            if (r8 == 0) goto L_0x00f6
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r8 = com.google.android.gms.internal.ads.C5503qz.f22546j1
            com.google.android.gms.internal.ads.oz r3 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r8 = r3.mo20153b(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x00fa
        L_0x00f6:
            boolean r8 = r7.f15692i
            if (r8 != 0) goto L_0x00fb
        L_0x00fa:
            r1 = 1
        L_0x00fb:
            int r8 = r7.f15691h
            if (r8 <= 0) goto L_0x0105
            com.google.android.gms.internal.ads.wq0 r8 = new com.google.android.gms.internal.ads.wq0
            r8.<init>(r5, r6, r1)
            goto L_0x010a
        L_0x0105:
            com.google.android.gms.internal.ads.xq0 r8 = new com.google.android.gms.internal.ads.xq0
            r8.<init>(r5, r6, r1)
        L_0x010a:
            boolean r6 = r7.f15692i
            if (r6 == 0) goto L_0x0115
            com.google.android.gms.internal.ads.vq0 r6 = new com.google.android.gms.internal.ads.vq0
            r6.<init>(r5, r8)
            r7 = r6
            goto L_0x0116
        L_0x0115:
            r7 = r8
        L_0x0116:
            java.nio.ByteBuffer r6 = r5.f16730p
            if (r6 == 0) goto L_0x0133
            int r6 = r6.limit()
            if (r6 <= 0) goto L_0x0133
            java.nio.ByteBuffer r6 = r5.f16730p
            int r6 = r6.limit()
            byte[] r6 = new byte[r6]
            java.nio.ByteBuffer r8 = r5.f16730p
            r8.get(r6)
            com.google.android.gms.internal.ads.uq0 r8 = new com.google.android.gms.internal.ads.uq0
            r8.<init>(r7, r6)
            r7 = r8
        L_0x0133:
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.C5503qz.f22544j
            com.google.android.gms.internal.ads.oz r8 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r6 = r8.mo20153b(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0148
            com.google.android.gms.internal.ads.br0 r6 = com.google.android.gms.internal.ads.br0.f14683b
            goto L_0x014a
        L_0x0148:
            com.google.android.gms.internal.ads.cr0 r6 = com.google.android.gms.internal.ads.cr0.f15136b
        L_0x014a:
            r0.<init>(r7, r6)
            r5.f16728n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fr0.<init>(android.content.Context, com.google.android.gms.internal.ads.do0, com.google.android.gms.internal.ads.eo0):void");
    }

    /* renamed from: f0 */
    private final boolean m23798f0() {
        return this.f16740z != null && this.f16740z.mo20949x();
    }

    /* renamed from: A */
    public final void mo17604A(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        i24 i24;
        if (this.f16729o != null) {
            this.f16730p = byteBuffer;
            this.f16731q = z;
            int length = uriArr.length;
            if (length == 1) {
                i24 = mo17631c0(uriArr[0]);
            } else {
                i24[] i24Arr = new i24[length];
                for (int i = 0; i < uriArr.length; i++) {
                    i24Arr[i] = mo17631c0(uriArr[i]);
                }
                i24 = new w24(false, false, i24Arr);
            }
            this.f16729o.mo21369H(i24);
            this.f16729o.mo21366E();
            un0.f24380h.incrementAndGet();
        }
    }

    /* renamed from: C */
    public final void mo17605C() {
        uu3 uu3 = this.f16729o;
        if (uu3 != null) {
            uu3.mo21368G(this);
            this.f16729o.mo21367F();
            this.f16729o = null;
            un0.f24380h.decrementAndGet();
        }
    }

    /* renamed from: D */
    public final void mo17606D(long j) {
        uu3 uu3 = this.f16729o;
        uu3.mo17319a(uu3.mo17321d(), j);
    }

    /* renamed from: E */
    public final void mo17607E(int i) {
        this.f16724j.mo20494i(i);
    }

    /* renamed from: F */
    public final void mo17608F(int i) {
        this.f16724j.mo20495j(i);
    }

    /* renamed from: G */
    public final void mo17609G(tn0 tn0) {
        this.f16732r = tn0;
    }

    /* renamed from: H */
    public final void mo17610H(int i) {
        this.f16724j.mo20496k(i);
    }

    /* renamed from: I */
    public final void mo17611I(int i) {
        this.f16724j.mo20497l(i);
    }

    /* renamed from: J */
    public final void mo17612J(boolean z) {
        this.f16729o.mo21370I(z);
    }

    /* renamed from: K */
    public final void mo17613K(boolean z) {
        if (this.f16729o != null) {
            int i = 0;
            while (true) {
                this.f16729o.mo21377Z();
                if (i < 2) {
                    v44 v44 = this.f16725k;
                    q44 d = v44.mo21425h().mo19898d();
                    d.mo20396o(i, !z);
                    v44.mo21426l(d);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: L */
    public final void mo17614L(int i) {
        for (WeakReference<pq0> weakReference : this.f16722A) {
            pq0 pq0 = (pq0) weakReference.get();
            if (pq0 != null) {
                pq0.mo20297t(i);
            }
        }
    }

    /* renamed from: M */
    public final void mo17615M(Surface surface, boolean z) {
        uu3 uu3 = this.f16729o;
        if (uu3 != null) {
            uu3.mo21372K(surface);
        }
    }

    /* renamed from: N */
    public final void mo17616N(float f, boolean z) {
        uu3 uu3 = this.f16729o;
        if (uu3 != null) {
            uu3.mo21373L(f);
        }
    }

    /* renamed from: O */
    public final void mo17617O() {
        this.f16729o.mo21374M(false);
    }

    /* renamed from: P */
    public final boolean mo17618P() {
        return this.f16729o != null;
    }

    /* renamed from: Q */
    public final boolean mo17619Q() {
        return this.f16729o.mo21375O();
    }

    /* renamed from: R */
    public final int mo17620R() {
        return this.f16734t;
    }

    /* renamed from: T */
    public final int mo17621T() {
        return this.f16729o.mo21376Y();
    }

    /* renamed from: V */
    public final long mo17622V() {
        return this.f16729o.mo21378a0();
    }

    /* renamed from: W */
    public final long mo17623W() {
        return (long) this.f16733s;
    }

    /* renamed from: X */
    public final long mo17624X() {
        if (m23798f0() && this.f16740z.mo20948w()) {
            return Math.min((long) this.f16733s, this.f16740z.mo20943r());
        }
        return 0;
    }

    /* renamed from: Y */
    public final long mo17625Y() {
        return this.f16729o.mo17325i();
    }

    /* renamed from: Z */
    public final long mo17626Z() {
        return this.f16729o.mo21379b0();
    }

    /* renamed from: a */
    public final void mo17627a(fx3 fx3, C5689w wVar, eb3 eb3) {
        eo0 eo0 = (eo0) this.f16727m.get();
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22546j1)).booleanValue() && eo0 != null && wVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("audioMime", wVar.f25132k);
            hashMap.put("audioSampleMime", wVar.f25133l);
            hashMap.put("audioCodec", wVar.f25130i);
            eo0.mo16880n0("onMetadataEvent", hashMap);
        }
    }

    /* renamed from: a0 */
    public final long mo17628a0() {
        if (!m23798f0()) {
            return (long) this.f16733s;
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo17629b(qb1 qb1, uf1 uf1, boolean z, int i) {
        this.f16733s += i;
    }

    /* renamed from: b0 */
    public final long mo17630b0() {
        if (m23798f0()) {
            return this.f16740z.mo20944s();
        }
        synchronized (this.f16738x) {
            while (!this.f16739y.isEmpty()) {
                long j = this.f16735u;
                Map<String, List<String>> zza = this.f16739y.remove(0).zza();
                long j2 = 0;
                if (zza != null) {
                    Iterator<Map.Entry<String, List<String>>> it = zza.entrySet().iterator();
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
                this.f16735u = j + j2;
            }
        }
        return this.f16735u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final i24 mo17631c0(Uri uri) {
        C5767y3 y3Var = new C5767y3();
        y3Var.mo22159b(uri);
        C5825zn c = y3Var.mo22160c();
        j34 j34 = this.f16728n;
        j34.mo18537a(this.f16726l.f15689f);
        return j34.mo18538b(c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public final /* synthetic */ void mo17632d0(boolean z, long j) {
        tn0 tn0 = this.f16732r;
        if (tn0 != null) {
            tn0.mo19806d(z, j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public final /* synthetic */ lu3[] mo17633e0(Handler handler, x74 x74, wx3 wx3, b44 b44, h14 h14) {
        Context context = this.f16723i;
        q04 q04 = q04.f21787a;
        vy3 vy3 = new vy3((hx3) null, new kx3[0], false);
        j04 j04 = j04.f18296a;
        return new lu3[]{new zy3(context, j04, q04, false, handler, wx3, vy3), new c74(this.f16723i, j04, q04, 0, false, handler, x74, -1)};
    }

    public final void finalize() {
        un0.f24379g.decrementAndGet();
        if (C3018m1.m13390m()) {
            C3018m1.m13388k("OfficialSimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public final /* synthetic */ qb1 mo17635g0(String str, boolean z) {
        fr0 fr0 = true != z ? null : this;
        do0 do0 = this.f16726l;
        pq0 pq0 = new pq0(str, fr0, do0.f15687d, do0.f15688e, do0.f15691h);
        this.f16722A.add(new WeakReference(pq0));
        return pq0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public final /* synthetic */ qb1 mo17636h0(String str, boolean z) {
        vg1 vg1 = new vg1();
        vg1.mo21499e(str);
        vg1.mo21498d(true != z ? null : this);
        vg1.mo21496b(this.f16726l.f15687d);
        vg1.mo21497c(this.f16726l.f15688e);
        vg1.mo21495a(true);
        return vg1.zza();
    }

    /* renamed from: i */
    public final void mo17637i(fx3 fx3, C5133gz gzVar) {
        tn0 tn0 = this.f16732r;
        if (tn0 != null) {
            tn0.mo19807e("onPlayerError", gzVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public final /* synthetic */ qb1 mo17638i0(pa1 pa1) {
        return new sq0(this.f16723i, pa1.zza(), this.f16736v, this.f16737w, this, new dr0(this), (byte[]) null);
    }

    /* renamed from: j */
    public final void mo17639j(fx3 fx3, cw0 cw0) {
        tn0 tn0 = this.f16732r;
        if (tn0 != null) {
            tn0.mo19808f(cw0.f15355a, cw0.f15356b);
        }
    }

    /* renamed from: k */
    public final void mo17640k(fx3 fx3, Object obj, long j) {
        tn0 tn0 = this.f16732r;
        if (tn0 != null) {
            tn0.mo19809t();
        }
    }

    /* renamed from: m */
    public final void mo17641m(fx3 fx3, x14 x14, c24 c24, IOException iOException, boolean z) {
        tn0 tn0 = this.f16732r;
        if (tn0 == null) {
            return;
        }
        if (this.f16726l.f15694k) {
            tn0.mo19804b("onLoadException", iOException);
        } else {
            tn0.mo19807e("onLoadError", iOException);
        }
    }

    /* renamed from: n */
    public final void mo17642n(fx3 fx3, int i) {
        tn0 tn0 = this.f16732r;
        if (tn0 != null) {
            tn0.mo19805c(i);
        }
    }

    /* renamed from: o */
    public final void mo17643o(qb1 qb1, uf1 uf1, boolean z) {
    }

    /* renamed from: p */
    public final void mo17644p(qb1 qb1, uf1 uf1, boolean z) {
    }

    /* renamed from: t */
    public final void mo17645t(fx3 fx3, C5689w wVar, eb3 eb3) {
        eo0 eo0 = (eo0) this.f16727m.get();
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22546j1)).booleanValue() && eo0 != null && wVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(wVar.f25140s));
            hashMap.put("bitRate", String.valueOf(wVar.f25129h));
            int i = wVar.f25138q;
            int i2 = wVar.f25139r;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            hashMap.put("resolution", sb.toString());
            hashMap.put("videoMime", wVar.f25132k);
            hashMap.put("videoSampleMime", wVar.f25133l);
            hashMap.put("videoCodec", wVar.f25130i);
            eo0.mo16880n0("onMetadataEvent", hashMap);
        }
    }

    /* renamed from: u */
    public final void mo17646u(fx3 fx3, int i, long j) {
        this.f16734t += i;
    }

    /* renamed from: x */
    public final void mo17647x(qb1 qb1, uf1 uf1, boolean z) {
        if (qb1 instanceof dp1) {
            synchronized (this.f16738x) {
                this.f16739y.add((dp1) qb1);
            }
        } else if (qb1 instanceof sq0) {
            this.f16740z = (sq0) qb1;
            eo0 eo0 = (eo0) this.f16727m.get();
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22546j1)).booleanValue() && eo0 != null && this.f16740z.mo20946u()) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.f16740z.mo20948w()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.f16740z.mo20947v()));
                C2979b2.f9980i.post(new er0(eo0, hashMap));
            }
        }
    }

    /* renamed from: z */
    public final void mo17648z(Uri[] uriArr, String str) {
        mo17604A(uriArr, str, ByteBuffer.allocate(0), false);
    }
}
