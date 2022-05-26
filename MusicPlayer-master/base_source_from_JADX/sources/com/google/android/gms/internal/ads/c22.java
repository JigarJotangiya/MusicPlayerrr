package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.C2955n;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class c22 implements DialogInterface.OnCancelListener {

    /* renamed from: g */
    public final /* synthetic */ y12 f14783g;

    /* renamed from: h */
    public final /* synthetic */ String f14784h;

    /* renamed from: i */
    public final /* synthetic */ gt1 f14785i;

    /* renamed from: j */
    public final /* synthetic */ Activity f14786j;

    /* renamed from: k */
    public final /* synthetic */ gu2 f14787k;

    /* renamed from: l */
    public final /* synthetic */ C2955n f14788l;

    public /* synthetic */ c22(y12 y12, String str, gt1 gt1, Activity activity, gu2 gu2, C2955n nVar) {
        this.f14783g = y12;
        this.f14784h = str;
        this.f14785i = gt1;
        this.f14786j = activity;
        this.f14787k = gu2;
        this.f14788l = nVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        y12 y12 = this.f14783g;
        String str = this.f14784h;
        gt1 gt1 = this.f14785i;
        Activity activity = this.f14786j;
        gu2 gu2 = this.f14787k;
        C2955n nVar = this.f14788l;
        y12.mo22136p(str);
        if (gt1 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("dialog_action", "dismiss");
            g22.m24083g7(activity, gt1, gu2, y12, str, "dialog_click", hashMap);
        }
        if (nVar != null) {
            nVar.mo10874a();
        }
    }
}
