package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class va2 implements sg2<wa2> {

    /* renamed from: a */
    private final e93 f24661a;

    /* renamed from: b */
    private final Context f24662b;

    /* renamed from: c */
    private final up2 f24663c;

    /* renamed from: d */
    private final View f24664d;

    public va2(e93 e93, Context context, up2 up2, ViewGroup viewGroup) {
        this.f24661a = e93;
        this.f24662b = context;
        this.f24663c = up2;
        this.f24664d = viewGroup;
    }

    /* renamed from: a */
    public final d93<wa2> mo15767a() {
        return this.f24661a.mo17138A0(new ua2(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ wa2 mo21453b() throws Exception {
        Context context = this.f24662b;
        zzbfi zzbfi = this.f24663c.f24396e;
        ArrayList arrayList = new ArrayList();
        View view = this.f24664d;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new wa2(context, zzbfi, arrayList);
    }
}
