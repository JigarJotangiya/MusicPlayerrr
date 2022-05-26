package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.C3360e;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wd0 extends ce0 {

    /* renamed from: c */
    private String f25348c = "top-right";

    /* renamed from: d */
    private boolean f25349d = true;

    /* renamed from: e */
    private int f25350e = 0;

    /* renamed from: f */
    private int f25351f = 0;

    /* renamed from: g */
    private int f25352g = -1;

    /* renamed from: h */
    private int f25353h = 0;

    /* renamed from: i */
    private int f25354i = 0;

    /* renamed from: j */
    private int f25355j = -1;

    /* renamed from: k */
    private final Object f25356k = new Object();

    /* renamed from: l */
    private final pr0 f25357l;

    /* renamed from: m */
    private final Activity f25358m;

    /* renamed from: n */
    private gt0 f25359n;

    /* renamed from: o */
    private ImageView f25360o;

    /* renamed from: p */
    private LinearLayout f25361p;

    /* renamed from: q */
    private final de0 f25362q;

    /* renamed from: r */
    private PopupWindow f25363r;

    /* renamed from: s */
    private RelativeLayout f25364s;

    /* renamed from: t */
    private ViewGroup f25365t;

    static {
        C3360e.m14443d("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    }

    public wd0(pr0 pr0, de0 de0) {
        super(pr0, "resize");
        this.f25357l = pr0;
        this.f25358m = pr0.mo17241i();
        this.f25362q = de0;
    }

    /* renamed from: h */
    public final void mo21804h(boolean z) {
        synchronized (this.f25356k) {
            PopupWindow popupWindow = this.f25363r;
            if (popupWindow != null) {
                popupWindow.dismiss();
                this.f25364s.removeView((View) this.f25357l);
                ViewGroup viewGroup = this.f25365t;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f25360o);
                    this.f25365t.addView((View) this.f25357l);
                    this.f25357l.mo17656E0(this.f25359n);
                }
                if (z) {
                    mo16614g("default");
                    de0 de0 = this.f25362q;
                    if (de0 != null) {
                        de0.mo16908a();
                    }
                }
                this.f25363r = null;
                this.f25364s = null;
                this.f25365t = null;
                this.f25361p = null;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01f6 A[Catch:{ RuntimeException -> 0x0423 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01f7 A[Catch:{ RuntimeException -> 0x0423 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0257 A[Catch:{ RuntimeException -> 0x0423 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x025e A[Catch:{ RuntimeException -> 0x0423 }] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21805i(java.util.Map<java.lang.String, java.lang.String> r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            java.lang.Object r2 = r1.f25356k
            monitor-enter(r2)
            android.app.Activity r3 = r1.f25358m     // Catch:{ all -> 0x0481 }
            if (r3 != 0) goto L_0x0012
            java.lang.String r0 = "Not an activity context. Cannot resize."
            r1.mo16610c(r0)     // Catch:{ all -> 0x0481 }
            monitor-exit(r2)     // Catch:{ all -> 0x0481 }
            return
        L_0x0012:
            com.google.android.gms.internal.ads.pr0 r3 = r1.f25357l     // Catch:{ all -> 0x0481 }
            com.google.android.gms.internal.ads.gt0 r3 = r3.mo17717y()     // Catch:{ all -> 0x0481 }
            if (r3 != 0) goto L_0x0021
            java.lang.String r0 = "Webview is not yet available, size is not set."
            r1.mo16610c(r0)     // Catch:{ all -> 0x0481 }
            monitor-exit(r2)     // Catch:{ all -> 0x0481 }
            return
        L_0x0021:
            com.google.android.gms.internal.ads.pr0 r3 = r1.f25357l     // Catch:{ all -> 0x0481 }
            com.google.android.gms.internal.ads.gt0 r3 = r3.mo17717y()     // Catch:{ all -> 0x0481 }
            boolean r3 = r3.mo18020i()     // Catch:{ all -> 0x0481 }
            if (r3 == 0) goto L_0x0034
            java.lang.String r0 = "Is interstitial. Cannot resize an interstitial."
            r1.mo16610c(r0)     // Catch:{ all -> 0x0481 }
            monitor-exit(r2)     // Catch:{ all -> 0x0481 }
            return
        L_0x0034:
            com.google.android.gms.internal.ads.pr0 r3 = r1.f25357l     // Catch:{ all -> 0x0481 }
            boolean r3 = r3.mo17692h0()     // Catch:{ all -> 0x0481 }
            if (r3 != 0) goto L_0x047a
            java.lang.String r3 = "width"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0481 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x0481 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0481 }
            if (r3 != 0) goto L_0x005b
            com.google.android.gms.ads.internal.C2971s.m13214q()     // Catch:{ all -> 0x0481 }
            java.lang.String r3 = "width"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0481 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0481 }
            int r3 = com.google.android.gms.ads.internal.util.C2979b2.m13270r(r3)     // Catch:{ all -> 0x0481 }
            r1.f25355j = r3     // Catch:{ all -> 0x0481 }
        L_0x005b:
            java.lang.String r3 = "height"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0481 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x0481 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0481 }
            if (r3 != 0) goto L_0x007a
            com.google.android.gms.ads.internal.C2971s.m13214q()     // Catch:{ all -> 0x0481 }
            java.lang.String r3 = "height"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0481 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0481 }
            int r3 = com.google.android.gms.ads.internal.util.C2979b2.m13270r(r3)     // Catch:{ all -> 0x0481 }
            r1.f25352g = r3     // Catch:{ all -> 0x0481 }
        L_0x007a:
            java.lang.String r3 = "offsetX"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0481 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x0481 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0481 }
            if (r3 != 0) goto L_0x0099
            com.google.android.gms.ads.internal.C2971s.m13214q()     // Catch:{ all -> 0x0481 }
            java.lang.String r3 = "offsetX"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0481 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0481 }
            int r3 = com.google.android.gms.ads.internal.util.C2979b2.m13270r(r3)     // Catch:{ all -> 0x0481 }
            r1.f25353h = r3     // Catch:{ all -> 0x0481 }
        L_0x0099:
            java.lang.String r3 = "offsetY"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0481 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x0481 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0481 }
            if (r3 != 0) goto L_0x00b8
            com.google.android.gms.ads.internal.C2971s.m13214q()     // Catch:{ all -> 0x0481 }
            java.lang.String r3 = "offsetY"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0481 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0481 }
            int r3 = com.google.android.gms.ads.internal.util.C2979b2.m13270r(r3)     // Catch:{ all -> 0x0481 }
            r1.f25354i = r3     // Catch:{ all -> 0x0481 }
        L_0x00b8:
            java.lang.String r3 = "allowOffscreen"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0481 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x0481 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0481 }
            if (r3 != 0) goto L_0x00d4
            java.lang.String r3 = "allowOffscreen"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0481 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0481 }
            boolean r3 = java.lang.Boolean.parseBoolean(r3)     // Catch:{ all -> 0x0481 }
            r1.f25349d = r3     // Catch:{ all -> 0x0481 }
        L_0x00d4:
            java.lang.String r3 = "customClosePosition"
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0481 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0481 }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0481 }
            if (r3 != 0) goto L_0x00e4
            r1.f25348c = r0     // Catch:{ all -> 0x0481 }
        L_0x00e4:
            int r0 = r1.f25355j     // Catch:{ all -> 0x0481 }
            if (r0 < 0) goto L_0x0473
            int r0 = r1.f25352g     // Catch:{ all -> 0x0481 }
            if (r0 < 0) goto L_0x0473
            android.app.Activity r0 = r1.f25358m     // Catch:{ all -> 0x0481 }
            android.view.Window r0 = r0.getWindow()     // Catch:{ all -> 0x0481 }
            if (r0 == 0) goto L_0x046c
            android.view.View r3 = r0.getDecorView()     // Catch:{ all -> 0x0481 }
            if (r3 != 0) goto L_0x00fc
            goto L_0x046c
        L_0x00fc:
            com.google.android.gms.ads.internal.C2971s.m13214q()     // Catch:{ all -> 0x0481 }
            android.app.Activity r3 = r1.f25358m     // Catch:{ all -> 0x0481 }
            int[] r3 = com.google.android.gms.ads.internal.util.C2979b2.m13278z(r3)     // Catch:{ all -> 0x0481 }
            com.google.android.gms.ads.internal.C2971s.m13214q()     // Catch:{ all -> 0x0481 }
            android.app.Activity r4 = r1.f25358m     // Catch:{ all -> 0x0481 }
            int[] r4 = com.google.android.gms.ads.internal.util.C2979b2.m13275w(r4)     // Catch:{ all -> 0x0481 }
            r5 = 0
            r6 = r3[r5]     // Catch:{ all -> 0x0481 }
            r7 = 1
            r3 = r3[r7]     // Catch:{ all -> 0x0481 }
            int r8 = r1.f25355j     // Catch:{ all -> 0x0481 }
            r9 = 5
            r10 = 4
            r11 = 3
            r13 = 2
            r14 = 50
            if (r8 < r14) goto L_0x024f
            if (r8 <= r6) goto L_0x0122
            goto L_0x024f
        L_0x0122:
            int r15 = r1.f25352g     // Catch:{ all -> 0x0481 }
            if (r15 < r14) goto L_0x0249
            if (r15 <= r3) goto L_0x012a
            goto L_0x0249
        L_0x012a:
            if (r15 != r3) goto L_0x0135
            if (r8 != r6) goto L_0x0135
            java.lang.String r3 = "Cannot resize to a full-screen ad."
            com.google.android.gms.internal.ads.ul0.m31862g(r3)     // Catch:{ all -> 0x0481 }
            goto L_0x0254
        L_0x0135:
            boolean r3 = r1.f25349d     // Catch:{ all -> 0x0481 }
            if (r3 == 0) goto L_0x0208
            java.lang.String r3 = r1.f25348c     // Catch:{ all -> 0x0481 }
            int r16 = r3.hashCode()     // Catch:{ all -> 0x0481 }
            switch(r16) {
                case -1364013995: goto L_0x0175;
                case -1012429441: goto L_0x016b;
                case -655373719: goto L_0x0161;
                case 1163912186: goto L_0x0157;
                case 1288627767: goto L_0x014d;
                case 1755462605: goto L_0x0143;
                default: goto L_0x0142;
            }
        L_0x0142:
            goto L_0x017f
        L_0x0143:
            java.lang.String r12 = "top-center"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x017f
            r3 = 1
            goto L_0x0180
        L_0x014d:
            java.lang.String r12 = "bottom-center"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x017f
            r3 = 4
            goto L_0x0180
        L_0x0157:
            java.lang.String r12 = "bottom-right"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x017f
            r3 = 5
            goto L_0x0180
        L_0x0161:
            java.lang.String r12 = "bottom-left"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x017f
            r3 = 3
            goto L_0x0180
        L_0x016b:
            java.lang.String r12 = "top-left"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x017f
            r3 = 0
            goto L_0x0180
        L_0x0175:
            java.lang.String r12 = "center"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x017f
            r3 = 2
            goto L_0x0180
        L_0x017f:
            r3 = -1
        L_0x0180:
            if (r3 == 0) goto L_0x01df
            if (r3 == r7) goto L_0x01d1
            if (r3 == r13) goto L_0x01bd
            if (r3 == r11) goto L_0x01b0
            if (r3 == r10) goto L_0x01a2
            if (r3 == r9) goto L_0x0197
            int r3 = r1.f25350e     // Catch:{ all -> 0x0481 }
            int r12 = r1.f25353h     // Catch:{ all -> 0x0481 }
            int r3 = r3 + r12
            int r3 = r3 + r8
            int r3 = r3 + -50
            int r8 = r1.f25351f     // Catch:{ all -> 0x0481 }
            goto L_0x01dc
        L_0x0197:
            int r3 = r1.f25350e     // Catch:{ all -> 0x0481 }
            int r12 = r1.f25353h     // Catch:{ all -> 0x0481 }
            int r3 = r3 + r12
            int r3 = r3 + r8
            int r3 = r3 + -50
            int r8 = r1.f25351f     // Catch:{ all -> 0x0481 }
            goto L_0x01ad
        L_0x01a2:
            int r3 = r1.f25350e     // Catch:{ all -> 0x0481 }
            int r12 = r1.f25353h     // Catch:{ all -> 0x0481 }
            int r3 = r3 + r12
            int r8 = r8 >> r7
            int r3 = r3 + r8
            int r3 = r3 + -25
            int r8 = r1.f25351f     // Catch:{ all -> 0x0481 }
        L_0x01ad:
            int r12 = r1.f25354i     // Catch:{ all -> 0x0481 }
            goto L_0x01b8
        L_0x01b0:
            int r3 = r1.f25350e     // Catch:{ all -> 0x0481 }
            int r8 = r1.f25353h     // Catch:{ all -> 0x0481 }
            int r3 = r3 + r8
            int r8 = r1.f25351f     // Catch:{ all -> 0x0481 }
            goto L_0x01ad
        L_0x01b8:
            int r8 = r8 + r12
            int r8 = r8 + r15
            int r8 = r8 + -50
            goto L_0x01e8
        L_0x01bd:
            int r3 = r1.f25350e     // Catch:{ all -> 0x0481 }
            int r12 = r1.f25353h     // Catch:{ all -> 0x0481 }
            int r3 = r3 + r12
            int r8 = r8 >> r7
            int r3 = r3 + r8
            int r3 = r3 + -25
            int r8 = r1.f25351f     // Catch:{ all -> 0x0481 }
            int r12 = r1.f25354i     // Catch:{ all -> 0x0481 }
            int r8 = r8 + r12
            int r12 = r15 >> 1
            int r8 = r8 + r12
            int r8 = r8 + -25
            goto L_0x01e8
        L_0x01d1:
            int r3 = r1.f25350e     // Catch:{ all -> 0x0481 }
            int r12 = r1.f25353h     // Catch:{ all -> 0x0481 }
            int r3 = r3 + r12
            int r8 = r8 >> r7
            int r3 = r3 + r8
            int r3 = r3 + -25
            int r8 = r1.f25351f     // Catch:{ all -> 0x0481 }
        L_0x01dc:
            int r12 = r1.f25354i     // Catch:{ all -> 0x0481 }
            goto L_0x01e7
        L_0x01df:
            int r3 = r1.f25350e     // Catch:{ all -> 0x0481 }
            int r8 = r1.f25353h     // Catch:{ all -> 0x0481 }
            int r3 = r3 + r8
            int r8 = r1.f25351f     // Catch:{ all -> 0x0481 }
            goto L_0x01dc
        L_0x01e7:
            int r8 = r8 + r12
        L_0x01e8:
            if (r3 < 0) goto L_0x0254
            int r3 = r3 + r14
            if (r3 > r6) goto L_0x0254
            r3 = r4[r5]     // Catch:{ all -> 0x0481 }
            if (r8 < r3) goto L_0x0254
            int r8 = r8 + r14
            r3 = r4[r7]     // Catch:{ all -> 0x0481 }
            if (r8 <= r3) goto L_0x01f7
            goto L_0x0254
        L_0x01f7:
            int[] r15 = new int[r13]     // Catch:{ all -> 0x0481 }
            int r3 = r1.f25350e     // Catch:{ all -> 0x0481 }
            int r4 = r1.f25353h     // Catch:{ all -> 0x0481 }
            int r3 = r3 + r4
            r15[r5] = r3     // Catch:{ all -> 0x0481 }
            int r3 = r1.f25351f     // Catch:{ all -> 0x0481 }
            int r4 = r1.f25354i     // Catch:{ all -> 0x0481 }
            int r3 = r3 + r4
            r15[r7] = r3     // Catch:{ all -> 0x0481 }
            goto L_0x0255
        L_0x0208:
            com.google.android.gms.ads.internal.C2971s.m13214q()     // Catch:{ all -> 0x0481 }
            android.app.Activity r3 = r1.f25358m     // Catch:{ all -> 0x0481 }
            int[] r3 = com.google.android.gms.ads.internal.util.C2979b2.m13278z(r3)     // Catch:{ all -> 0x0481 }
            com.google.android.gms.ads.internal.C2971s.m13214q()     // Catch:{ all -> 0x0481 }
            android.app.Activity r4 = r1.f25358m     // Catch:{ all -> 0x0481 }
            int[] r4 = com.google.android.gms.ads.internal.util.C2979b2.m13275w(r4)     // Catch:{ all -> 0x0481 }
            r3 = r3[r5]     // Catch:{ all -> 0x0481 }
            int r6 = r1.f25350e     // Catch:{ all -> 0x0481 }
            int r8 = r1.f25353h     // Catch:{ all -> 0x0481 }
            int r6 = r6 + r8
            int r8 = r1.f25351f     // Catch:{ all -> 0x0481 }
            int r12 = r1.f25354i     // Catch:{ all -> 0x0481 }
            int r8 = r8 + r12
            if (r6 >= 0) goto L_0x022a
            r6 = 0
            goto L_0x0232
        L_0x022a:
            int r12 = r1.f25355j     // Catch:{ all -> 0x0481 }
            int r15 = r6 + r12
            if (r15 <= r3) goto L_0x0232
            int r6 = r3 - r12
        L_0x0232:
            r3 = r4[r5]     // Catch:{ all -> 0x0481 }
            if (r8 >= r3) goto L_0x0238
            r8 = r3
            goto L_0x0242
        L_0x0238:
            int r3 = r1.f25352g     // Catch:{ all -> 0x0481 }
            int r12 = r8 + r3
            r4 = r4[r7]     // Catch:{ all -> 0x0481 }
            if (r12 <= r4) goto L_0x0242
            int r8 = r4 - r3
        L_0x0242:
            int[] r15 = new int[r13]     // Catch:{ all -> 0x0481 }
            r15[r5] = r6     // Catch:{ all -> 0x0481 }
            r15[r7] = r8     // Catch:{ all -> 0x0481 }
            goto L_0x0255
        L_0x0249:
            java.lang.String r3 = "Height is too small or too large."
            com.google.android.gms.internal.ads.ul0.m31862g(r3)     // Catch:{ all -> 0x0481 }
            goto L_0x0254
        L_0x024f:
            java.lang.String r3 = "Width is too small or too large."
            com.google.android.gms.internal.ads.ul0.m31862g(r3)     // Catch:{ all -> 0x0481 }
        L_0x0254:
            r15 = 0
        L_0x0255:
            if (r15 != 0) goto L_0x025e
            java.lang.String r0 = "Resize location out of screen or close button is not visible."
            r1.mo16610c(r0)     // Catch:{ all -> 0x0481 }
            monitor-exit(r2)     // Catch:{ all -> 0x0481 }
            return
        L_0x025e:
            com.google.android.gms.internal.ads.C4980cv.m22123b()     // Catch:{ all -> 0x0481 }
            android.app.Activity r3 = r1.f25358m     // Catch:{ all -> 0x0481 }
            int r4 = r1.f25355j     // Catch:{ all -> 0x0481 }
            int r3 = com.google.android.gms.internal.ads.nl0.m27927s(r3, r4)     // Catch:{ all -> 0x0481 }
            com.google.android.gms.internal.ads.C4980cv.m22123b()     // Catch:{ all -> 0x0481 }
            android.app.Activity r4 = r1.f25358m     // Catch:{ all -> 0x0481 }
            int r6 = r1.f25352g     // Catch:{ all -> 0x0481 }
            int r4 = com.google.android.gms.internal.ads.nl0.m27927s(r4, r6)     // Catch:{ all -> 0x0481 }
            com.google.android.gms.internal.ads.pr0 r6 = r1.f25357l     // Catch:{ all -> 0x0481 }
            android.view.View r6 = (android.view.View) r6     // Catch:{ all -> 0x0481 }
            android.view.ViewParent r6 = r6.getParent()     // Catch:{ all -> 0x0481 }
            if (r6 == 0) goto L_0x0465
            boolean r8 = r6 instanceof android.view.ViewGroup     // Catch:{ all -> 0x0481 }
            if (r8 == 0) goto L_0x0465
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6     // Catch:{ all -> 0x0481 }
            com.google.android.gms.internal.ads.pr0 r8 = r1.f25357l     // Catch:{ all -> 0x0481 }
            android.view.View r8 = (android.view.View) r8     // Catch:{ all -> 0x0481 }
            r6.removeView(r8)     // Catch:{ all -> 0x0481 }
            android.widget.PopupWindow r8 = r1.f25363r     // Catch:{ all -> 0x0481 }
            if (r8 != 0) goto L_0x02c8
            r1.f25365t = r6     // Catch:{ all -> 0x0481 }
            com.google.android.gms.ads.internal.C2971s.m13214q()     // Catch:{ all -> 0x0481 }
            com.google.android.gms.internal.ads.pr0 r6 = r1.f25357l     // Catch:{ all -> 0x0481 }
            r8 = r6
            android.view.View r8 = (android.view.View) r8     // Catch:{ all -> 0x0481 }
            r8.setDrawingCacheEnabled(r7)     // Catch:{ all -> 0x0481 }
            r8 = r6
            android.view.View r8 = (android.view.View) r8     // Catch:{ all -> 0x0481 }
            android.graphics.Bitmap r8 = r8.getDrawingCache()     // Catch:{ all -> 0x0481 }
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r8)     // Catch:{ all -> 0x0481 }
            android.view.View r6 = (android.view.View) r6     // Catch:{ all -> 0x0481 }
            r6.setDrawingCacheEnabled(r5)     // Catch:{ all -> 0x0481 }
            android.widget.ImageView r6 = new android.widget.ImageView     // Catch:{ all -> 0x0481 }
            android.app.Activity r12 = r1.f25358m     // Catch:{ all -> 0x0481 }
            r6.<init>(r12)     // Catch:{ all -> 0x0481 }
            r1.f25360o = r6     // Catch:{ all -> 0x0481 }
            r6.setImageBitmap(r8)     // Catch:{ all -> 0x0481 }
            com.google.android.gms.internal.ads.pr0 r6 = r1.f25357l     // Catch:{ all -> 0x0481 }
            com.google.android.gms.internal.ads.gt0 r6 = r6.mo17717y()     // Catch:{ all -> 0x0481 }
            r1.f25359n = r6     // Catch:{ all -> 0x0481 }
            android.view.ViewGroup r6 = r1.f25365t     // Catch:{ all -> 0x0481 }
            android.widget.ImageView r8 = r1.f25360o     // Catch:{ all -> 0x0481 }
            r6.addView(r8)     // Catch:{ all -> 0x0481 }
            goto L_0x02cb
        L_0x02c8:
            r8.dismiss()     // Catch:{ all -> 0x0481 }
        L_0x02cb:
            android.widget.RelativeLayout r6 = new android.widget.RelativeLayout     // Catch:{ all -> 0x0481 }
            android.app.Activity r8 = r1.f25358m     // Catch:{ all -> 0x0481 }
            r6.<init>(r8)     // Catch:{ all -> 0x0481 }
            r1.f25364s = r6     // Catch:{ all -> 0x0481 }
            r6.setBackgroundColor(r5)     // Catch:{ all -> 0x0481 }
            android.widget.RelativeLayout r6 = r1.f25364s     // Catch:{ all -> 0x0481 }
            android.view.ViewGroup$LayoutParams r8 = new android.view.ViewGroup$LayoutParams     // Catch:{ all -> 0x0481 }
            r8.<init>(r3, r4)     // Catch:{ all -> 0x0481 }
            r6.setLayoutParams(r8)     // Catch:{ all -> 0x0481 }
            com.google.android.gms.ads.internal.C2971s.m13214q()     // Catch:{ all -> 0x0481 }
            android.widget.RelativeLayout r6 = r1.f25364s     // Catch:{ all -> 0x0481 }
            android.widget.PopupWindow r8 = new android.widget.PopupWindow     // Catch:{ all -> 0x0481 }
            r8.<init>(r6, r3, r4, r5)     // Catch:{ all -> 0x0481 }
            r1.f25363r = r8     // Catch:{ all -> 0x0481 }
            r8.setOutsideTouchable(r5)     // Catch:{ all -> 0x0481 }
            android.widget.PopupWindow r6 = r1.f25363r     // Catch:{ all -> 0x0481 }
            r6.setTouchable(r7)     // Catch:{ all -> 0x0481 }
            android.widget.PopupWindow r6 = r1.f25363r     // Catch:{ all -> 0x0481 }
            boolean r8 = r1.f25349d     // Catch:{ all -> 0x0481 }
            r8 = r8 ^ r7
            r6.setClippingEnabled(r8)     // Catch:{ all -> 0x0481 }
            android.widget.RelativeLayout r6 = r1.f25364s     // Catch:{ all -> 0x0481 }
            com.google.android.gms.internal.ads.pr0 r8 = r1.f25357l     // Catch:{ all -> 0x0481 }
            android.view.View r8 = (android.view.View) r8     // Catch:{ all -> 0x0481 }
            r12 = -1
            r6.addView(r8, r12, r12)     // Catch:{ all -> 0x0481 }
            android.widget.LinearLayout r6 = new android.widget.LinearLayout     // Catch:{ all -> 0x0481 }
            android.app.Activity r8 = r1.f25358m     // Catch:{ all -> 0x0481 }
            r6.<init>(r8)     // Catch:{ all -> 0x0481 }
            r1.f25361p = r6     // Catch:{ all -> 0x0481 }
            android.widget.RelativeLayout$LayoutParams r6 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x0481 }
            com.google.android.gms.internal.ads.C4980cv.m22123b()     // Catch:{ all -> 0x0481 }
            android.app.Activity r8 = r1.f25358m     // Catch:{ all -> 0x0481 }
            int r8 = com.google.android.gms.internal.ads.nl0.m27927s(r8, r14)     // Catch:{ all -> 0x0481 }
            com.google.android.gms.internal.ads.C4980cv.m22123b()     // Catch:{ all -> 0x0481 }
            android.app.Activity r12 = r1.f25358m     // Catch:{ all -> 0x0481 }
            int r12 = com.google.android.gms.internal.ads.nl0.m27927s(r12, r14)     // Catch:{ all -> 0x0481 }
            r6.<init>(r8, r12)     // Catch:{ all -> 0x0481 }
            java.lang.String r8 = r1.f25348c     // Catch:{ all -> 0x0481 }
            int r12 = r8.hashCode()     // Catch:{ all -> 0x0481 }
            switch(r12) {
                case -1364013995: goto L_0x0363;
                case -1012429441: goto L_0x0359;
                case -655373719: goto L_0x034f;
                case 1163912186: goto L_0x0345;
                case 1288627767: goto L_0x033b;
                case 1755462605: goto L_0x0331;
                default: goto L_0x0330;
            }
        L_0x0330:
            goto L_0x036d
        L_0x0331:
            java.lang.String r12 = "top-center"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x036d
            r12 = 1
            goto L_0x036e
        L_0x033b:
            java.lang.String r12 = "bottom-center"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x036d
            r12 = 4
            goto L_0x036e
        L_0x0345:
            java.lang.String r12 = "bottom-right"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x036d
            r12 = 5
            goto L_0x036e
        L_0x034f:
            java.lang.String r12 = "bottom-left"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x036d
            r12 = 3
            goto L_0x036e
        L_0x0359:
            java.lang.String r12 = "top-left"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x036d
            r12 = 0
            goto L_0x036e
        L_0x0363:
            java.lang.String r12 = "center"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x036d
            r12 = 2
            goto L_0x036e
        L_0x036d:
            r12 = -1
        L_0x036e:
            r8 = 9
            r14 = 10
            if (r12 == 0) goto L_0x03ad
            r5 = 14
            if (r12 == r7) goto L_0x03a6
            if (r12 == r13) goto L_0x03a0
            r13 = 12
            if (r12 == r11) goto L_0x0399
            if (r12 == r10) goto L_0x0392
            r5 = 11
            if (r12 == r9) goto L_0x038b
            r6.addRule(r14)     // Catch:{ all -> 0x0481 }
            r6.addRule(r5)     // Catch:{ all -> 0x0481 }
            goto L_0x03b3
        L_0x038b:
            r6.addRule(r13)     // Catch:{ all -> 0x0481 }
            r6.addRule(r5)     // Catch:{ all -> 0x0481 }
            goto L_0x03b3
        L_0x0392:
            r6.addRule(r13)     // Catch:{ all -> 0x0481 }
            r6.addRule(r5)     // Catch:{ all -> 0x0481 }
            goto L_0x03b3
        L_0x0399:
            r6.addRule(r13)     // Catch:{ all -> 0x0481 }
            r6.addRule(r8)     // Catch:{ all -> 0x0481 }
            goto L_0x03b3
        L_0x03a0:
            r5 = 13
            r6.addRule(r5)     // Catch:{ all -> 0x0481 }
            goto L_0x03b3
        L_0x03a6:
            r6.addRule(r14)     // Catch:{ all -> 0x0481 }
            r6.addRule(r5)     // Catch:{ all -> 0x0481 }
            goto L_0x03b3
        L_0x03ad:
            r6.addRule(r14)     // Catch:{ all -> 0x0481 }
            r6.addRule(r8)     // Catch:{ all -> 0x0481 }
        L_0x03b3:
            android.widget.LinearLayout r5 = r1.f25361p     // Catch:{ all -> 0x0481 }
            com.google.android.gms.internal.ads.vd0 r8 = new com.google.android.gms.internal.ads.vd0     // Catch:{ all -> 0x0481 }
            r8.<init>(r1)     // Catch:{ all -> 0x0481 }
            r5.setOnClickListener(r8)     // Catch:{ all -> 0x0481 }
            android.widget.LinearLayout r5 = r1.f25361p     // Catch:{ all -> 0x0481 }
            java.lang.String r8 = "Close button"
            r5.setContentDescription(r8)     // Catch:{ all -> 0x0481 }
            android.widget.RelativeLayout r5 = r1.f25364s     // Catch:{ all -> 0x0481 }
            android.widget.LinearLayout r8 = r1.f25361p     // Catch:{ all -> 0x0481 }
            r5.addView(r8, r6)     // Catch:{ all -> 0x0481 }
            android.widget.PopupWindow r5 = r1.f25363r     // Catch:{ RuntimeException -> 0x0423 }
            android.view.View r0 = r0.getDecorView()     // Catch:{ RuntimeException -> 0x0423 }
            com.google.android.gms.internal.ads.C4980cv.m22123b()     // Catch:{ RuntimeException -> 0x0423 }
            android.app.Activity r6 = r1.f25358m     // Catch:{ RuntimeException -> 0x0423 }
            r8 = 0
            r9 = r15[r8]     // Catch:{ RuntimeException -> 0x0423 }
            int r6 = com.google.android.gms.internal.ads.nl0.m27927s(r6, r9)     // Catch:{ RuntimeException -> 0x0423 }
            com.google.android.gms.internal.ads.C4980cv.m22123b()     // Catch:{ RuntimeException -> 0x0423 }
            android.app.Activity r8 = r1.f25358m     // Catch:{ RuntimeException -> 0x0423 }
            r9 = r15[r7]     // Catch:{ RuntimeException -> 0x0423 }
            int r8 = com.google.android.gms.internal.ads.nl0.m27927s(r8, r9)     // Catch:{ RuntimeException -> 0x0423 }
            r9 = 0
            r5.showAtLocation(r0, r9, r6, r8)     // Catch:{ RuntimeException -> 0x0423 }
            r0 = r15[r9]     // Catch:{ all -> 0x0481 }
            r5 = r15[r7]     // Catch:{ all -> 0x0481 }
            com.google.android.gms.internal.ads.de0 r6 = r1.f25362q     // Catch:{ all -> 0x0481 }
            if (r6 == 0) goto L_0x03fb
            int r8 = r1.f25355j     // Catch:{ all -> 0x0481 }
            int r9 = r1.f25352g     // Catch:{ all -> 0x0481 }
            r6.mo16910c(r0, r5, r8, r9)     // Catch:{ all -> 0x0481 }
        L_0x03fb:
            com.google.android.gms.internal.ads.pr0 r0 = r1.f25357l     // Catch:{ all -> 0x0481 }
            com.google.android.gms.internal.ads.gt0 r3 = com.google.android.gms.internal.ads.gt0.m24493b(r3, r4)     // Catch:{ all -> 0x0481 }
            r0.mo17656E0(r3)     // Catch:{ all -> 0x0481 }
            r0 = 0
            r3 = r15[r0]     // Catch:{ all -> 0x0481 }
            r4 = r15[r7]     // Catch:{ all -> 0x0481 }
            com.google.android.gms.ads.internal.C2971s.m13214q()     // Catch:{ all -> 0x0481 }
            android.app.Activity r5 = r1.f25358m     // Catch:{ all -> 0x0481 }
            int[] r5 = com.google.android.gms.ads.internal.util.C2979b2.m13275w(r5)     // Catch:{ all -> 0x0481 }
            r0 = r5[r0]     // Catch:{ all -> 0x0481 }
            int r4 = r4 - r0
            int r0 = r1.f25355j     // Catch:{ all -> 0x0481 }
            int r5 = r1.f25352g     // Catch:{ all -> 0x0481 }
            r1.mo16613f(r3, r4, r0, r5)     // Catch:{ all -> 0x0481 }
            java.lang.String r0 = "resized"
            r1.mo16614g(r0)     // Catch:{ all -> 0x0481 }
            monitor-exit(r2)     // Catch:{ all -> 0x0481 }
            return
        L_0x0423:
            r0 = move-exception
            java.lang.String r3 = "Cannot show popup window: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0481 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0481 }
            int r4 = r0.length()     // Catch:{ all -> 0x0481 }
            if (r4 == 0) goto L_0x0439
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x0481 }
            goto L_0x043e
        L_0x0439:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0481 }
            r0.<init>(r3)     // Catch:{ all -> 0x0481 }
        L_0x043e:
            r1.mo16610c(r0)     // Catch:{ all -> 0x0481 }
            android.widget.RelativeLayout r0 = r1.f25364s     // Catch:{ all -> 0x0481 }
            com.google.android.gms.internal.ads.pr0 r3 = r1.f25357l     // Catch:{ all -> 0x0481 }
            android.view.View r3 = (android.view.View) r3     // Catch:{ all -> 0x0481 }
            r0.removeView(r3)     // Catch:{ all -> 0x0481 }
            android.view.ViewGroup r0 = r1.f25365t     // Catch:{ all -> 0x0481 }
            if (r0 == 0) goto L_0x0463
            android.widget.ImageView r3 = r1.f25360o     // Catch:{ all -> 0x0481 }
            r0.removeView(r3)     // Catch:{ all -> 0x0481 }
            android.view.ViewGroup r0 = r1.f25365t     // Catch:{ all -> 0x0481 }
            com.google.android.gms.internal.ads.pr0 r3 = r1.f25357l     // Catch:{ all -> 0x0481 }
            android.view.View r3 = (android.view.View) r3     // Catch:{ all -> 0x0481 }
            r0.addView(r3)     // Catch:{ all -> 0x0481 }
            com.google.android.gms.internal.ads.pr0 r0 = r1.f25357l     // Catch:{ all -> 0x0481 }
            com.google.android.gms.internal.ads.gt0 r3 = r1.f25359n     // Catch:{ all -> 0x0481 }
            r0.mo17656E0(r3)     // Catch:{ all -> 0x0481 }
        L_0x0463:
            monitor-exit(r2)     // Catch:{ all -> 0x0481 }
            return
        L_0x0465:
            java.lang.String r0 = "Webview is detached, probably in the middle of a resize or expand."
            r1.mo16610c(r0)     // Catch:{ all -> 0x0481 }
            monitor-exit(r2)     // Catch:{ all -> 0x0481 }
            return
        L_0x046c:
            java.lang.String r0 = "Activity context is not ready, cannot get window or decor view."
            r1.mo16610c(r0)     // Catch:{ all -> 0x0481 }
            monitor-exit(r2)     // Catch:{ all -> 0x0481 }
            return
        L_0x0473:
            java.lang.String r0 = "Invalid width and height options. Cannot resize."
            r1.mo16610c(r0)     // Catch:{ all -> 0x0481 }
            monitor-exit(r2)     // Catch:{ all -> 0x0481 }
            return
        L_0x047a:
            java.lang.String r0 = "Cannot resize an expanded banner."
            r1.mo16610c(r0)     // Catch:{ all -> 0x0481 }
            monitor-exit(r2)     // Catch:{ all -> 0x0481 }
            return
        L_0x0481:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0481 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wd0.mo21805i(java.util.Map):void");
    }

    /* renamed from: j */
    public final void mo21806j(int i, int i2, boolean z) {
        synchronized (this.f25356k) {
            this.f25350e = i;
            this.f25351f = i2;
        }
    }

    /* renamed from: k */
    public final void mo21807k(int i, int i2) {
        this.f25350e = i;
        this.f25351f = i2;
    }

    /* renamed from: l */
    public final boolean mo21808l() {
        boolean z;
        synchronized (this.f25356k) {
            z = this.f25363r != null;
        }
        return z;
    }
}
