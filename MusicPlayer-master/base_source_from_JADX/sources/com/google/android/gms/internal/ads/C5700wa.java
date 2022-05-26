package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.wa */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5700wa extends C5663va {
    protected C5700wa(Context context, String str, boolean z) {
        super(context, str, z);
    }

    /* renamed from: v */
    public static C5700wa m33022v(String str, Context context, boolean z) {
        C5663va.m32238s(context, false);
        return new C5700wa(context, str, false);
    }

    @Deprecated
    /* renamed from: w */
    public static C5700wa m33023w(String str, Context context, boolean z, int i) {
        C5663va.m32238s(context, z);
        return new C5700wa(context, str, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final List<Callable<Void>> mo21449q(C5701wb wbVar, Context context, C4920b8 b8Var, C5623u7 u7Var) {
        if (wbVar.mo21786k() == null || !this.f24655A) {
            return super.mo21449q(wbVar, context, b8Var, (C5623u7) null);
        }
        int a = wbVar.mo21777a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.mo21449q(wbVar, context, b8Var, (C5623u7) null));
        arrayList.add(new C5332mc(wbVar, "pzhIFr8jSwvyB8FXK2qfBOfw0jXHNl6+dmbReaTm1jquB51r9sbZLlTA4zaBxZEm", "RbRyr5uGUYOSrOuNnmzV0kl42YeLvs7OFWbwh2MFm18=", b8Var, a, 24));
        return arrayList;
    }
}
