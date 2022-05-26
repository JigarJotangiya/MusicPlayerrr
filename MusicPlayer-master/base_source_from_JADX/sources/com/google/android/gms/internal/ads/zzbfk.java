package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbfk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbfk> CREATOR = new C5091fu();

    /* renamed from: g */
    public final int f27230g;

    /* renamed from: h */
    public final int f27231h;

    /* renamed from: i */
    public final String f27232i;

    /* renamed from: j */
    public final long f27233j;

    public zzbfk(int i, int i2, String str, long j) {
        this.f27230g = i;
        this.f27231h = i2;
        this.f27232i = str;
        this.f27233j = j;
    }

    /* renamed from: Y */
    public static zzbfk m34954Y(JSONObject jSONObject) throws JSONException {
        return new zzbfk(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f27230g);
        C3315b.m14316h(parcel, 2, this.f27231h);
        C3315b.m14322n(parcel, 3, this.f27232i, false);
        C3315b.m14319k(parcel, 4, this.f27233j);
        C3315b.m14310b(parcel, a);
    }
}
