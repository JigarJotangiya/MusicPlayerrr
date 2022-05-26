package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.C3044v0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzcgc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcgc> CREATOR = new xi0();

    /* renamed from: g */
    public final String f27364g;

    /* renamed from: h */
    public final String f27365h;

    /* renamed from: i */
    public final boolean f27366i;

    /* renamed from: j */
    public final boolean f27367j;

    /* renamed from: k */
    public final List<String> f27368k;

    /* renamed from: l */
    public final boolean f27369l;

    /* renamed from: m */
    public final boolean f27370m;

    /* renamed from: n */
    public final List<String> f27371n;

    public zzcgc(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4, List<String> list2) {
        this.f27364g = str;
        this.f27365h = str2;
        this.f27366i = z;
        this.f27367j = z2;
        this.f27368k = list;
        this.f27369l = z3;
        this.f27370m = z4;
        this.f27371n = list2 == null ? new ArrayList<>() : list2;
    }

    /* renamed from: Y */
    public static zzcgc m34964Y(JSONObject jSONObject) throws JSONException {
        return new zzcgc(jSONObject.optString("click_string", BuildConfig.FLAVOR), jSONObject.optString("report_url", BuildConfig.FLAVOR), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), C3044v0.m13476c(jSONObject.optJSONArray("allowed_headers"), (List<String>) null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), C3044v0.m13476c(jSONObject.optJSONArray("webview_permissions"), (List<String>) null));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14322n(parcel, 2, this.f27364g, false);
        C3315b.m14322n(parcel, 3, this.f27365h, false);
        C3315b.m14311c(parcel, 4, this.f27366i);
        C3315b.m14311c(parcel, 5, this.f27367j);
        C3315b.m14324p(parcel, 6, this.f27368k, false);
        C3315b.m14311c(parcel, 7, this.f27369l);
        C3315b.m14311c(parcel, 8, this.f27370m);
        C3315b.m14324p(parcel, 9, this.f27371n, false);
        C3315b.m14310b(parcel, a);
    }
}
