package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.C2926b;
import com.google.android.gms.ads.internal.C2935k;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.internal.ads.C5054ev;
import com.google.android.gms.internal.ads.C5497qt;
import com.google.android.gms.internal.ads.C5503qz;
import com.google.android.gms.internal.ads.C5737xa;
import com.google.android.gms.internal.ads.C5790yp;
import com.google.android.gms.internal.ads.b60;
import com.google.android.gms.internal.ads.bp2;
import com.google.android.gms.internal.ads.cs0;
import com.google.android.gms.internal.ads.de0;
import com.google.android.gms.internal.ads.ep2;
import com.google.android.gms.internal.ads.et0;
import com.google.android.gms.internal.ads.f00;
import com.google.android.gms.internal.ads.g22;
import com.google.android.gms.internal.ads.gt0;
import com.google.android.gms.internal.ads.gt1;
import com.google.android.gms.internal.ads.gu2;
import com.google.android.gms.internal.ads.lv2;
import com.google.android.gms.internal.ads.pr0;
import com.google.android.gms.internal.ads.q00;
import com.google.android.gms.internal.ads.ul0;
import com.google.android.gms.internal.ads.w03;
import com.google.android.gms.internal.ads.we0;
import com.google.android.gms.internal.ads.x40;
import com.google.android.gms.internal.ads.y12;
import com.google.android.gms.internal.ads.yf1;
import com.google.android.gms.internal.ads.z40;
import com.google.android.gms.internal.ads.z50;
import com.google.android.gms.internal.ads.zi0;
import com.google.android.gms.internal.ads.zzcjf;
import com.un4seen.bass.BASS;
import java.util.Collections;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* renamed from: com.google.android.gms.ads.internal.overlay.n */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class C2955n extends we0 implements C2942b {

    /* renamed from: A */
    static final int f9881A = Color.argb(0, 0, 0, 0);

    /* renamed from: g */
    protected final Activity f9882g;

    /* renamed from: h */
    AdOverlayInfoParcel f9883h;

    /* renamed from: i */
    pr0 f9884i;

    /* renamed from: j */
    C2951j f9885j;

    /* renamed from: k */
    C2961t f9886k;

    /* renamed from: l */
    boolean f9887l = false;

    /* renamed from: m */
    FrameLayout f9888m;

    /* renamed from: n */
    WebChromeClient.CustomViewCallback f9889n;

    /* renamed from: o */
    boolean f9890o = false;

    /* renamed from: p */
    boolean f9891p = false;

    /* renamed from: q */
    C2950i f9892q;

    /* renamed from: r */
    boolean f9893r = false;

    /* renamed from: s */
    private final Object f9894s = new Object();

    /* renamed from: t */
    private Runnable f9895t;

    /* renamed from: u */
    private boolean f9896u;

    /* renamed from: v */
    private boolean f9897v;

    /* renamed from: w */
    private boolean f9898w = false;

    /* renamed from: x */
    private boolean f9899x = false;

    /* renamed from: y */
    private boolean f9900y = true;

    /* renamed from: z */
    int f9901z = 1;

    public C2955n(Activity activity) {
        this.f9882g = activity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.f9864u;
     */
    /* renamed from: h7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m13086h7(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.f9883h
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            com.google.android.gms.ads.internal.zzj r0 = r0.f9864u
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.f10138h
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            com.google.android.gms.ads.internal.util.f r3 = com.google.android.gms.ads.internal.C2971s.m13215r()
            android.app.Activity r4 = r5.f9882g
            boolean r6 = r3.mo11025o(r4, r6)
            boolean r3 = r5.f9891p
            r4 = 19
            if (r3 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0037
        L_0x0023:
            if (r6 != 0) goto L_0x0037
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r4) goto L_0x0038
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.f9883h
            if (r6 == 0) goto L_0x0038
            com.google.android.gms.ads.internal.zzj r6 = r6.f9864u
            if (r6 == 0) goto L_0x0038
            boolean r6 = r6.f10143m
            if (r6 == 0) goto L_0x0038
            r2 = 1
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            android.app.Activity r6 = r5.f9882g
            android.view.Window r6 = r6.getWindow()
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22368L0
            com.google.android.gms.internal.ads.oz r3 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r0 = r3.mo20153b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0068
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L_0x0068
            android.view.View r6 = r6.getDecorView()
            if (r1 == 0) goto L_0x0062
            if (r2 == 0) goto L_0x005f
            r0 = 5894(0x1706, float:8.259E-42)
            goto L_0x0064
        L_0x005f:
            r0 = 5380(0x1504, float:7.539E-42)
            goto L_0x0064
        L_0x0062:
            r0 = 256(0x100, float:3.59E-43)
        L_0x0064:
            r6.setSystemUiVisibility(r0)
            return
        L_0x0068:
            r0 = 1024(0x400, float:1.435E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0084
            r6.addFlags(r0)
            r6.clearFlags(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L_0x0083
            if (r2 == 0) goto L_0x0083
            android.view.View r6 = r6.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r6.setSystemUiVisibility(r0)
        L_0x0083:
            return
        L_0x0084:
            r6.addFlags(r3)
            r6.clearFlags(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.C2955n.m13086h7(android.content.res.Configuration):void");
    }

    /* renamed from: i7 */
    private static final void m13087i7(C4863a aVar, View view) {
        if (aVar != null && view != null) {
            C2971s.m13206i().mo18279T(aVar, view);
        }
    }

    /* renamed from: F */
    public final boolean mo10868F() {
        this.f9901z = 1;
        if (this.f9884i == null) {
            return true;
        }
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22422S5)).booleanValue() || !this.f9884i.canGoBack()) {
            boolean N = this.f9884i.mo17669N();
            if (!N) {
                this.f9884i.mo16880n0("onbackblocked", Collections.emptyMap());
            }
            return N;
        }
        this.f9884i.goBack();
        return false;
    }

    /* renamed from: G */
    public final void mo10869G() {
        this.f9892q.removeView(this.f9886k);
        mo10884j7(true);
    }

    /* renamed from: K */
    public final void mo10870K(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f9890o);
    }

    /* renamed from: K0 */
    public final void mo10860K0() {
        this.f9901z = 2;
        this.f9882g.finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public final void mo10871T() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        C2958q qVar;
        if (this.f9882g.isFinishing() && !this.f9898w) {
            this.f9898w = true;
            pr0 pr0 = this.f9884i;
            if (pr0 != null) {
                pr0.mo17668M0(this.f9901z - 1);
                synchronized (this.f9894s) {
                    if (!this.f9896u && this.f9884i.mo17672Q()) {
                        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22440V2)).booleanValue() && !this.f9899x && (adOverlayInfoParcel = this.f9883h) != null && (qVar = adOverlayInfoParcel.f9852i) != null) {
                            qVar.mo10901o5();
                        }
                        C2948g gVar = new C2948g(this);
                        this.f9895t = gVar;
                        C2979b2.f9980i.postDelayed(gVar, ((Long) C5054ev.m23225c().mo20153b(C5503qz.f22315E0)).longValue());
                        return;
                    }
                }
            }
            mo10875b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071 A[Catch:{ h -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c4 A[Catch:{ h -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e9 A[Catch:{ h -> 0x00f5 }] */
    /* renamed from: U4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10872U4(android.os.Bundle r9) {
        /*
            r8 = this;
            android.app.Activity r0 = r8.f9882g
            r1 = 1
            r0.requestWindowFeature(r1)
            r0 = 0
            if (r9 == 0) goto L_0x0013
            java.lang.String r2 = "com.google.android.gms.ads.internal.overlay.hasResumed"
            boolean r2 = r9.getBoolean(r2, r0)
            if (r2 == 0) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            r8.f9890o = r2
            r2 = 4
            android.app.Activity r3 = r8.f9882g     // Catch:{ h -> 0x00f5 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ h -> 0x00f5 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.m13079Y(r3)     // Catch:{ h -> 0x00f5 }
            r8.f9883h = r3     // Catch:{ h -> 0x00f5 }
            if (r3 == 0) goto L_0x00ed
            com.google.android.gms.internal.ads.zzcjf r3 = r3.f9862s     // Catch:{ h -> 0x00f5 }
            int r3 = r3.f27378i     // Catch:{ h -> 0x00f5 }
            r4 = 7500000(0x7270e0, float:1.0509738E-38)
            if (r3 <= r4) goto L_0x0030
            r8.f9901z = r2     // Catch:{ h -> 0x00f5 }
        L_0x0030:
            android.app.Activity r3 = r8.f9882g     // Catch:{ h -> 0x00f5 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ h -> 0x00f5 }
            if (r3 == 0) goto L_0x0046
            android.app.Activity r3 = r8.f9882g     // Catch:{ h -> 0x00f5 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ h -> 0x00f5 }
            java.lang.String r4 = "shouldCallOnOverlayOpened"
            boolean r3 = r3.getBooleanExtra(r4, r1)     // Catch:{ h -> 0x00f5 }
            r8.f9900y = r3     // Catch:{ h -> 0x00f5 }
        L_0x0046:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r8.f9883h     // Catch:{ h -> 0x00f5 }
            com.google.android.gms.ads.internal.zzj r4 = r3.f9864u     // Catch:{ h -> 0x00f5 }
            r5 = 5
            if (r4 == 0) goto L_0x0054
            boolean r6 = r4.f10137g     // Catch:{ h -> 0x00f5 }
            r8.f9891p = r6     // Catch:{ h -> 0x00f5 }
            if (r6 == 0) goto L_0x006f
            goto L_0x005a
        L_0x0054:
            int r6 = r3.f9860q     // Catch:{ h -> 0x00f5 }
            if (r6 != r5) goto L_0x006d
            r8.f9891p = r1     // Catch:{ h -> 0x00f5 }
        L_0x005a:
            int r3 = r3.f9860q     // Catch:{ h -> 0x00f5 }
            if (r3 == r5) goto L_0x006f
            int r3 = r4.f10142l     // Catch:{ h -> 0x00f5 }
            r4 = -1
            if (r3 == r4) goto L_0x006f
            com.google.android.gms.ads.internal.overlay.m r3 = new com.google.android.gms.ads.internal.overlay.m     // Catch:{ h -> 0x00f5 }
            r4 = 0
            r3.<init>(r8, r4)     // Catch:{ h -> 0x00f5 }
            r3.mo10973b()     // Catch:{ h -> 0x00f5 }
            goto L_0x006f
        L_0x006d:
            r8.f9891p = r0     // Catch:{ h -> 0x00f5 }
        L_0x006f:
            if (r9 != 0) goto L_0x009d
            boolean r9 = r8.f9900y     // Catch:{ h -> 0x00f5 }
            if (r9 == 0) goto L_0x0087
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f9883h     // Catch:{ h -> 0x00f5 }
            com.google.android.gms.internal.ads.s81 r9 = r9.f9848D     // Catch:{ h -> 0x00f5 }
            if (r9 == 0) goto L_0x007e
            r9.mo20809f()     // Catch:{ h -> 0x00f5 }
        L_0x007e:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f9883h     // Catch:{ h -> 0x00f5 }
            com.google.android.gms.ads.internal.overlay.q r9 = r9.f9852i     // Catch:{ h -> 0x00f5 }
            if (r9 == 0) goto L_0x0087
            r9.mo10900a()     // Catch:{ h -> 0x00f5 }
        L_0x0087:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f9883h     // Catch:{ h -> 0x00f5 }
            int r3 = r9.f9860q     // Catch:{ h -> 0x00f5 }
            if (r3 == r1) goto L_0x009d
            com.google.android.gms.internal.ads.qt r9 = r9.f9851h     // Catch:{ h -> 0x00f5 }
            if (r9 == 0) goto L_0x0094
            r9.mo10632u0()     // Catch:{ h -> 0x00f5 }
        L_0x0094:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f9883h     // Catch:{ h -> 0x00f5 }
            com.google.android.gms.internal.ads.yf1 r9 = r9.f9849E     // Catch:{ h -> 0x00f5 }
            if (r9 == 0) goto L_0x009d
            r9.mo15729o()     // Catch:{ h -> 0x00f5 }
        L_0x009d:
            com.google.android.gms.ads.internal.overlay.i r9 = new com.google.android.gms.ads.internal.overlay.i     // Catch:{ h -> 0x00f5 }
            android.app.Activity r3 = r8.f9882g     // Catch:{ h -> 0x00f5 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r8.f9883h     // Catch:{ h -> 0x00f5 }
            java.lang.String r6 = r4.f9863t     // Catch:{ h -> 0x00f5 }
            com.google.android.gms.internal.ads.zzcjf r7 = r4.f9862s     // Catch:{ h -> 0x00f5 }
            java.lang.String r7 = r7.f27376g     // Catch:{ h -> 0x00f5 }
            java.lang.String r4 = r4.f9847C     // Catch:{ h -> 0x00f5 }
            r9.<init>(r3, r6, r7, r4)     // Catch:{ h -> 0x00f5 }
            r8.f9892q = r9     // Catch:{ h -> 0x00f5 }
            r3 = 1000(0x3e8, float:1.401E-42)
            r9.setId(r3)     // Catch:{ h -> 0x00f5 }
            com.google.android.gms.ads.internal.util.f r9 = com.google.android.gms.ads.internal.C2971s.m13215r()     // Catch:{ h -> 0x00f5 }
            android.app.Activity r3 = r8.f9882g     // Catch:{ h -> 0x00f5 }
            r9.mo11007q(r3)     // Catch:{ h -> 0x00f5 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f9883h     // Catch:{ h -> 0x00f5 }
            int r3 = r9.f9860q     // Catch:{ h -> 0x00f5 }
            if (r3 == r1) goto L_0x00e9
            r4 = 2
            if (r3 == r4) goto L_0x00dc
            r9 = 3
            if (r3 == r9) goto L_0x00d8
            if (r3 != r5) goto L_0x00d0
            r8.mo10881g7(r0)     // Catch:{ h -> 0x00f5 }
            return
        L_0x00d0:
            com.google.android.gms.ads.internal.overlay.h r9 = new com.google.android.gms.ads.internal.overlay.h     // Catch:{ h -> 0x00f5 }
            java.lang.String r0 = "Could not determine ad overlay type."
            r9.<init>(r0)     // Catch:{ h -> 0x00f5 }
            throw r9     // Catch:{ h -> 0x00f5 }
        L_0x00d8:
            r8.mo10881g7(r1)     // Catch:{ h -> 0x00f5 }
            return
        L_0x00dc:
            com.google.android.gms.ads.internal.overlay.j r1 = new com.google.android.gms.ads.internal.overlay.j     // Catch:{ h -> 0x00f5 }
            com.google.android.gms.internal.ads.pr0 r9 = r9.f9853j     // Catch:{ h -> 0x00f5 }
            r1.<init>(r9)     // Catch:{ h -> 0x00f5 }
            r8.f9885j = r1     // Catch:{ h -> 0x00f5 }
            r8.mo10881g7(r0)     // Catch:{ h -> 0x00f5 }
            return
        L_0x00e9:
            r8.mo10881g7(r0)     // Catch:{ h -> 0x00f5 }
            return
        L_0x00ed:
            com.google.android.gms.ads.internal.overlay.h r9 = new com.google.android.gms.ads.internal.overlay.h     // Catch:{ h -> 0x00f5 }
            java.lang.String r0 = "Could not get info for ad overlay."
            r9.<init>(r0)     // Catch:{ h -> 0x00f5 }
            throw r9     // Catch:{ h -> 0x00f5 }
        L_0x00f5:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            com.google.android.gms.internal.ads.ul0.m31862g(r9)
            r8.f9901z = r2
            android.app.Activity r9 = r8.f9882g
            r9.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.C2955n.mo10872U4(android.os.Bundle):void");
    }

    /* renamed from: Y */
    public final void mo10873Y(C4863a aVar) {
        m13086h7((Configuration) C4865b.m20502K0(aVar));
    }

    /* renamed from: a */
    public final void mo10874a() {
        this.f9901z = 3;
        this.f9882g.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f9883h;
        if (adOverlayInfoParcel != null && adOverlayInfoParcel.f9860q == 5) {
            this.f9882g.overridePendingTransition(0, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo10875b() {
        pr0 pr0;
        C2958q qVar;
        if (!this.f9899x) {
            this.f9899x = true;
            pr0 pr02 = this.f9884i;
            if (pr02 != null) {
                this.f9892q.removeView(pr02.mo15939Z());
                C2951j jVar = this.f9885j;
                if (jVar != null) {
                    this.f9884i.mo17674R0(jVar.f9877d);
                    this.f9884i.mo17719z0(false);
                    ViewGroup viewGroup = this.f9885j.f9876c;
                    View Z = this.f9884i.mo15939Z();
                    C2951j jVar2 = this.f9885j;
                    viewGroup.addView(Z, jVar2.f9874a, jVar2.f9875b);
                    this.f9885j = null;
                } else if (this.f9882g.getApplicationContext() != null) {
                    this.f9884i.mo17674R0(this.f9882g.getApplicationContext());
                }
                this.f9884i = null;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f9883h;
            if (!(adOverlayInfoParcel == null || (qVar = adOverlayInfoParcel.f9852i) == null)) {
                qVar.mo10903z(this.f9901z);
            }
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f9883h;
            if (adOverlayInfoParcel2 != null && (pr0 = adOverlayInfoParcel2.f9853j) != null) {
                m13087i7(pr0.mo17658F0(), this.f9883h.f9853j.mo15939Z());
            }
        }
    }

    /* renamed from: b3 */
    public final void mo10876b3(int i, int i2, Intent intent) {
    }

    /* renamed from: c */
    public final void mo10877c() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f9883h;
        if (adOverlayInfoParcel != null && this.f9887l) {
            mo10888l7(adOverlayInfoParcel.f9859p);
        }
        if (this.f9888m != null) {
            this.f9882g.setContentView(this.f9892q);
            this.f9897v = true;
            this.f9888m.removeAllViews();
            this.f9888m = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f9889n;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f9889n = null;
        }
        this.f9887l = false;
    }

    /* renamed from: e */
    public final void mo10878e() {
        this.f9901z = 1;
    }

    /* renamed from: f */
    public final void mo10879f() {
        this.f9892q.f9873h = true;
    }

    /* renamed from: f7 */
    public final void mo10880f7(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.f9882g);
        this.f9888m = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.f9888m.addView(view, -1, -1);
        this.f9882g.setContentView(this.f9888m);
        this.f9897v = true;
        this.f9889n = customViewCallback;
        this.f9887l = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g7 */
    public final void mo10881g7(boolean z) throws C2949h {
        if (!this.f9897v) {
            this.f9882g.requestWindowFeature(1);
        }
        Window window = this.f9882g.getWindow();
        if (window != null) {
            pr0 pr0 = this.f9883h.f9853j;
            C2926b bVar = null;
            et0 Q0 = pr0 != null ? pr0.mo17673Q0() : null;
            boolean z2 = false;
            boolean z3 = Q0 != null && Q0.mo17305s();
            this.f9893r = false;
            if (z3) {
                int i = this.f9883h.f9859p;
                if (i == 6) {
                    if (this.f9882g.getResources().getConfiguration().orientation == 1) {
                        z2 = true;
                    }
                    this.f9893r = z2;
                } else if (i == 7) {
                    if (this.f9882g.getResources().getConfiguration().orientation == 2) {
                        z2 = true;
                    }
                    this.f9893r = z2;
                }
            }
            StringBuilder sb = new StringBuilder(46);
            sb.append("Delay onShow to next orientation change: ");
            sb.append(z2);
            ul0.m31857b(sb.toString());
            mo10888l7(this.f9883h.f9859p);
            window.setFlags(BASS.BASS_SPEAKER_FRONT, BASS.BASS_SPEAKER_FRONT);
            ul0.m31857b("Hardware acceleration on the AdActivity window enabled.");
            if (!this.f9891p) {
                this.f9892q.setBackgroundColor(-16777216);
            } else {
                this.f9892q.setBackgroundColor(f9881A);
            }
            this.f9882g.setContentView(this.f9892q);
            this.f9897v = true;
            if (z) {
                try {
                    C2971s.m13197A();
                    Activity activity = this.f9882g;
                    pr0 pr02 = this.f9883h.f9853j;
                    gt0 y = pr02 != null ? pr02.mo17717y() : null;
                    pr0 pr03 = this.f9883h.f9853j;
                    String j0 = pr03 != null ? pr03.mo17694j0() : null;
                    AdOverlayInfoParcel adOverlayInfoParcel = this.f9883h;
                    zzcjf zzcjf = adOverlayInfoParcel.f9862s;
                    pr0 pr04 = adOverlayInfoParcel.f9853j;
                    pr0 a = cs0.m22106a(activity, y, j0, true, z3, (C5737xa) null, (q00) null, zzcjf, (f00) null, (C2935k) null, pr04 != null ? pr04.mo17245m() : null, C5790yp.m34259a(), (bp2) null, (ep2) null);
                    this.f9884i = a;
                    et0 Q02 = a.mo17673Q0();
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.f9883h;
                    x40 x40 = adOverlayInfoParcel2.f9865v;
                    z40 z40 = adOverlayInfoParcel2.f9854k;
                    C2966y yVar = adOverlayInfoParcel2.f9858o;
                    pr0 pr05 = adOverlayInfoParcel2.f9853j;
                    if (pr05 != null) {
                        bVar = pr05.mo17673Q0().mo17301f();
                    }
                    Q02.mo17293O((C5497qt) null, x40, (C2958q) null, z40, yVar, true, (b60) null, bVar, (de0) null, (zi0) null, (y12) null, (lv2) null, (gt1) null, (gu2) null, (z50) null, (yf1) null);
                    this.f9884i.mo17673Q0().mo17300d1(new C2947f(this));
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.f9883h;
                    String str = adOverlayInfoParcel3.f9861r;
                    if (str != null) {
                        this.f9884i.loadUrl(str);
                    } else {
                        String str2 = adOverlayInfoParcel3.f9857n;
                        if (str2 != null) {
                            this.f9884i.loadDataWithBaseURL(adOverlayInfoParcel3.f9855l, str2, "text/html", "UTF-8", (String) null);
                        } else {
                            throw new C2949h("No URL or HTML to display in ad overlay.");
                        }
                    }
                    pr0 pr06 = this.f9883h.f9853j;
                    if (pr06 != null) {
                        pr06.mo17713v0(this);
                    }
                } catch (Exception e) {
                    ul0.m31860e("Error obtaining webview.", e);
                    throw new C2949h("Could not obtain webview for the overlay.");
                }
            } else {
                pr0 pr07 = this.f9883h.f9853j;
                this.f9884i = pr07;
                pr07.mo17674R0(this.f9882g);
            }
            this.f9884i.mo17661I(this);
            pr0 pr08 = this.f9883h.f9853j;
            if (pr08 != null) {
                m13087i7(pr08.mo17658F0(), this.f9892q);
            }
            if (this.f9883h.f9860q != 5) {
                ViewParent parent = this.f9884i.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(this.f9884i.mo15939Z());
                }
                if (this.f9891p) {
                    this.f9884i.mo17708s0();
                }
                this.f9892q.addView(this.f9884i.mo15939Z(), -1, -1);
            }
            if (!z && !this.f9893r) {
                zze();
            }
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f9883h;
            if (adOverlayInfoParcel4.f9860q != 5) {
                mo10884j7(z3);
                if (this.f9884i.mo17683c0()) {
                    mo10886k7(z3, true);
                    return;
                }
                return;
            }
            g22.m24084h7(this.f9882g, this, adOverlayInfoParcel4.f9845A, adOverlayInfoParcel4.f9867x, adOverlayInfoParcel4.f9868y, adOverlayInfoParcel4.f9869z, adOverlayInfoParcel4.f9866w, adOverlayInfoParcel4.f9846B);
            return;
        }
        throw new C2949h("Invalid activity, no window available.");
    }

    /* renamed from: j */
    public final void mo10882j() {
        pr0 pr0 = this.f9884i;
        if (pr0 != null) {
            try {
                this.f9892q.removeView(pr0.mo15939Z());
            } catch (NullPointerException unused) {
            }
        }
        mo10871T();
    }

    /* renamed from: j5 */
    public final void mo10883j5() {
        synchronized (this.f9894s) {
            this.f9896u = true;
            Runnable runnable = this.f9895t;
            if (runnable != null) {
                w03 w03 = C2979b2.f9980i;
                w03.removeCallbacks(runnable);
                w03.post(this.f9895t);
            }
        }
    }

    /* renamed from: j7 */
    public final void mo10884j7(boolean z) {
        int intValue = ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22468Z2)).intValue();
        int i = 0;
        boolean z2 = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22339H0)).booleanValue() || z;
        C2960s sVar = new C2960s();
        sVar.f9906d = 50;
        sVar.f9903a = true != z2 ? 0 : intValue;
        if (true != z2) {
            i = intValue;
        }
        sVar.f9904b = i;
        sVar.f9905c = intValue;
        this.f9886k = new C2961t(this.f9882g, sVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        mo10886k7(z, this.f9883h.f9856m);
        this.f9892q.addView(this.f9886k, layoutParams);
    }

    /* renamed from: k */
    public final void mo10885k() {
        C2958q qVar;
        mo10877c();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f9883h;
        if (!(adOverlayInfoParcel == null || (qVar = adOverlayInfoParcel.f9852i) == null)) {
            qVar.mo10902y3();
        }
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22454X2)).booleanValue() && this.f9884i != null && (!this.f9882g.isFinishing() || this.f9885j == null)) {
            this.f9884i.onPause();
        }
        mo10871T();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r0 = (r0 = r6.f9883h).f9864u;
     */
    /* renamed from: k7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10886k7(boolean r7, boolean r8) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22323F0
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r0 = r1.mo20153b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r6.f9883h
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.ads.internal.zzj r0 = r0.f9864u
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.f10144n
            if (r0 == 0) goto L_0x0022
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.C5503qz.f22331G0
            com.google.android.gms.internal.ads.oz r4 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r3 = r4.mo20153b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0043
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r6.f9883h
            if (r3 == 0) goto L_0x0043
            com.google.android.gms.ads.internal.zzj r3 = r3.f9864u
            if (r3 == 0) goto L_0x0043
            boolean r3 = r3.f10145o
            if (r3 == 0) goto L_0x0043
            r3 = 1
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            if (r7 == 0) goto L_0x005a
            if (r8 == 0) goto L_0x005a
            if (r0 == 0) goto L_0x005a
            if (r3 != 0) goto L_0x005a
            com.google.android.gms.internal.ads.ce0 r7 = new com.google.android.gms.internal.ads.ce0
            com.google.android.gms.internal.ads.pr0 r4 = r6.f9884i
            java.lang.String r5 = "useCustomClose"
            r7.<init>(r4, r5)
            java.lang.String r4 = "Custom close has been disabled for interstitial ads in this ad slot."
            r7.mo16610c(r4)
        L_0x005a:
            com.google.android.gms.ads.internal.overlay.t r7 = r6.f9886k
            if (r7 == 0) goto L_0x0069
            if (r3 != 0) goto L_0x0066
            if (r8 == 0) goto L_0x0065
            if (r0 != 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r1 = 0
        L_0x0066:
            r7.mo10908b(r1)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.C2955n.mo10886k7(boolean, boolean):void");
    }

    /* renamed from: l */
    public final void mo10887l() {
    }

    /* renamed from: l7 */
    public final void mo10888l7(int i) {
        if (this.f9882g.getApplicationInfo().targetSdkVersion >= ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22392O3)).intValue()) {
            if (this.f9882g.getApplicationInfo().targetSdkVersion <= ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22399P3)).intValue()) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22406Q3)).intValue()) {
                    if (i2 <= ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22413R3)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.f9882g.setRequestedOrientation(i);
        } catch (Throwable th) {
            C2971s.m13213p().mo17570r(th, "AdOverlay.setRequestedOrientation");
        }
    }

    /* renamed from: m */
    public final void mo10889m() {
        if (this.f9893r) {
            this.f9893r = false;
            zze();
        }
    }

    /* renamed from: m7 */
    public final void mo10890m7(boolean z) {
        if (z) {
            this.f9892q.setBackgroundColor(0);
        } else {
            this.f9892q.setBackgroundColor(-16777216);
        }
    }

    /* renamed from: n */
    public final void mo10891n() {
        C2958q qVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f9883h;
        if (adOverlayInfoParcel != null && (qVar = adOverlayInfoParcel.f9852i) != null) {
            qVar.zze();
        }
    }

    /* renamed from: t */
    public final void mo10892t() {
        this.f9897v = true;
    }

    /* access modifiers changed from: protected */
    public final void zze() {
        this.f9884i.mo17663J0();
    }

    public final void zzp() {
        C2958q qVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f9883h;
        if (!(adOverlayInfoParcel == null || (qVar = adOverlayInfoParcel.f9852i) == null)) {
            qVar.mo10899F5();
        }
        m13086h7(this.f9882g.getResources().getConfiguration());
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22454X2)).booleanValue()) {
            pr0 pr0 = this.f9884i;
            if (pr0 == null || pr0.mo17666L0()) {
                ul0.m31862g("The webview does not exist. Ignoring action.");
            } else {
                this.f9884i.onResume();
            }
        }
    }

    public final void zzr() {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22454X2)).booleanValue()) {
            pr0 pr0 = this.f9884i;
            if (pr0 == null || pr0.mo17666L0()) {
                ul0.m31862g("The webview does not exist. Ignoring action.");
            } else {
                this.f9884i.onResume();
            }
        }
    }

    public final void zzs() {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22454X2)).booleanValue() && this.f9884i != null && (!this.f9882g.isFinishing() || this.f9885j == null)) {
            this.f9884i.onPause();
        }
        mo10871T();
    }
}
