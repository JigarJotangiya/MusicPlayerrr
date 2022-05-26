package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3292l;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ib2 implements rg2<Bundle> {

    /* renamed from: a */
    public final zzbfi f17935a;

    /* renamed from: b */
    public final String f17936b;

    /* renamed from: c */
    public final boolean f17937c;

    /* renamed from: d */
    public final String f17938d;

    /* renamed from: e */
    public final float f17939e;

    /* renamed from: f */
    public final int f17940f;

    /* renamed from: g */
    public final int f17941g;

    /* renamed from: h */
    public final String f17942h;

    /* renamed from: i */
    public final boolean f17943i;

    public ib2(zzbfi zzbfi, String str, boolean z, String str2, float f, int i, int i2, String str3, boolean z2) {
        C3292l.m14241i(zzbfi, "the adSize must not be null");
        this.f17935a = zzbfi;
        this.f17936b = str;
        this.f17937c = z;
        this.f17938d = str2;
        this.f17939e = f;
        this.f17940f = i;
        this.f17941g = i2;
        this.f17942h = str3;
        this.f17943i = z2;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        Bundle bundle = (Bundle) obj;
        fq2.m23783g(bundle, "smart_w", "full", this.f17935a.f27219k == -1);
        fq2.m23783g(bundle, "smart_h", "auto", this.f17935a.f27216h == -2);
        Boolean bool = Boolean.TRUE;
        fq2.m23781e(bundle, "ene", bool, this.f17935a.f27224p);
        fq2.m23783g(bundle, "rafmt", "102", this.f17935a.f27227s);
        fq2.m23783g(bundle, "rafmt", "103", this.f17935a.f27228t);
        fq2.m23783g(bundle, "rafmt", "105", this.f17935a.f27229u);
        fq2.m23781e(bundle, "inline_adaptive_slot", bool, this.f17943i);
        fq2.m23781e(bundle, "interscroller_slot", bool, this.f17935a.f27229u);
        fq2.m23779c(bundle, "format", this.f17936b);
        fq2.m23783g(bundle, "fluid", "height", this.f17937c);
        String str = this.f17938d;
        fq2.m23783g(bundle, "sz", str, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.f17939e);
        bundle.putInt("sw", this.f17940f);
        bundle.putInt("sh", this.f17941g);
        String str2 = this.f17942h;
        fq2.m23783g(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        ArrayList arrayList = new ArrayList();
        zzbfi[] zzbfiArr = this.f17935a.f27221m;
        if (zzbfiArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.f17935a.f27216h);
            bundle2.putInt("width", this.f17935a.f27219k);
            bundle2.putBoolean("is_fluid_height", this.f17935a.f27223o);
            arrayList.add(bundle2);
        } else {
            for (zzbfi zzbfi : zzbfiArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzbfi.f27223o);
                bundle3.putInt("height", zzbfi.f27216h);
                bundle3.putInt("width", zzbfi.f27219k);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
