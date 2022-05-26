package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.C2955n;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class e22 implements DialogInterface.OnClickListener {

    /* renamed from: g */
    public final /* synthetic */ y12 f15834g;

    /* renamed from: h */
    public final /* synthetic */ String f15835h;

    /* renamed from: i */
    public final /* synthetic */ gt1 f15836i;

    /* renamed from: j */
    public final /* synthetic */ Activity f15837j;

    /* renamed from: k */
    public final /* synthetic */ gu2 f15838k;

    /* renamed from: l */
    public final /* synthetic */ C2955n f15839l;

    public /* synthetic */ e22(y12 y12, String str, gt1 gt1, Activity activity, gu2 gu2, C2955n nVar) {
        this.f15834g = y12;
        this.f15835h = str;
        this.f15836i = gt1;
        this.f15837j = activity;
        this.f15838k = gu2;
        this.f15839l = nVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        y12 y12 = this.f15834g;
        String str = this.f15835h;
        gt1 gt1 = this.f15836i;
        Activity activity = this.f15837j;
        gu2 gu2 = this.f15838k;
        C2955n nVar = this.f15839l;
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
