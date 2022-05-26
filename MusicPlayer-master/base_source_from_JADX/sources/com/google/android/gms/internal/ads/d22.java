package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import com.google.android.gms.ads.internal.overlay.C2955n;
import com.google.android.gms.ads.internal.util.C3041u0;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class d22 implements DialogInterface.OnClickListener {

    /* renamed from: g */
    public final /* synthetic */ gt1 f15471g;

    /* renamed from: h */
    public final /* synthetic */ Activity f15472h;

    /* renamed from: i */
    public final /* synthetic */ gu2 f15473i;

    /* renamed from: j */
    public final /* synthetic */ y12 f15474j;

    /* renamed from: k */
    public final /* synthetic */ String f15475k;

    /* renamed from: l */
    public final /* synthetic */ C3041u0 f15476l;

    /* renamed from: m */
    public final /* synthetic */ String f15477m;

    /* renamed from: n */
    public final /* synthetic */ Resources f15478n;

    /* renamed from: o */
    public final /* synthetic */ C2955n f15479o;

    public /* synthetic */ d22(gt1 gt1, Activity activity, gu2 gu2, y12 y12, String str, C3041u0 u0Var, String str2, Resources resources, C2955n nVar) {
        this.f15471g = gt1;
        this.f15472h = activity;
        this.f15473i = gu2;
        this.f15474j = y12;
        this.f15475k = str;
        this.f15476l = u0Var;
        this.f15477m = str2;
        this.f15478n = resources;
        this.f15479o = nVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003d, code lost:
        if (r0.zzf(p159f.p243f.p245b.p246a.p248b.C4865b.m20503f2(r10), r14, r13) == false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r19, int r20) {
        /*
            r18 = this;
            r1 = r18
            com.google.android.gms.internal.ads.gt1 r9 = r1.f15471g
            android.app.Activity r10 = r1.f15472h
            com.google.android.gms.internal.ads.gu2 r11 = r1.f15473i
            com.google.android.gms.internal.ads.y12 r12 = r1.f15474j
            java.lang.String r13 = r1.f15475k
            com.google.android.gms.ads.internal.util.u0 r0 = r1.f15476l
            java.lang.String r14 = r1.f15477m
            android.content.res.Resources r15 = r1.f15478n
            com.google.android.gms.ads.internal.overlay.n r8 = r1.f15479o
            if (r9 == 0) goto L_0x0034
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.lang.String r2 = "dialog_action"
            java.lang.String r3 = "confirm"
            r7.put(r2, r3)
            java.lang.String r16 = "dialog_click"
            r2 = r10
            r3 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r17 = r7
            r7 = r16
            r1 = r8
            r8 = r17
            com.google.android.gms.internal.ads.g22.m24083g7(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0035
        L_0x0034:
            r1 = r8
        L_0x0035:
            f.f.b.a.b.a r2 = p159f.p243f.p245b.p246a.p248b.C4865b.m20503f2(r10)     // Catch:{ RemoteException -> 0x0040 }
            boolean r0 = r0.zzf(r2, r14, r13)     // Catch:{ RemoteException -> 0x0040 }
            if (r0 != 0) goto L_0x0055
            goto L_0x0046
        L_0x0040:
            r0 = move-exception
            java.lang.String r2 = "Failed to schedule offline notification poster."
            com.google.android.gms.internal.ads.ul0.m31860e(r2, r0)
        L_0x0046:
            r12.mo22136p(r13)
            if (r9 == 0) goto L_0x0055
            java.lang.String r7 = "offline_notification_worker_not_scheduled"
            r2 = r10
            r3 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            com.google.android.gms.internal.ads.g22.m24082f7(r2, r3, r4, r5, r6, r7)
        L_0x0055:
            com.google.android.gms.ads.internal.C2971s.m13214q()
            com.google.android.gms.ads.internal.util.f r0 = com.google.android.gms.ads.internal.C2971s.m13215r()
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            int r0 = r0.mo11021k()
            r2.<init>(r10, r0)
            if (r15 != 0) goto L_0x006a
            java.lang.String r0 = "You'll get a notification with the link when you're back online"
            goto L_0x0070
        L_0x006a:
            int r0 = com.google.android.gms.ads.p074x.C3126b.offline_opt_in_confirmation
            java.lang.String r0 = r15.getString(r0)
        L_0x0070:
            android.app.AlertDialog$Builder r0 = r2.setMessage(r0)
            com.google.android.gms.internal.ads.b22 r3 = new com.google.android.gms.internal.ads.b22
            r3.<init>(r1)
            r0.setOnCancelListener(r3)
            android.app.AlertDialog r0 = r2.create()
            r0.show()
            java.util.Timer r2 = new java.util.Timer
            r2.<init>()
            com.google.android.gms.internal.ads.f22 r3 = new com.google.android.gms.internal.ads.f22
            r3.<init>(r0, r2, r1)
            r0 = 3000(0xbb8, double:1.482E-320)
            r2.schedule(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d22.onClick(android.content.DialogInterface, int):void");
    }
}
