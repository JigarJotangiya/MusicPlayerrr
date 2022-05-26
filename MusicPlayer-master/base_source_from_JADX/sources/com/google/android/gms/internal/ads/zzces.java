package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3289k;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzces extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzces> CREATOR = new qh0();

    /* renamed from: g */
    public final String f27360g;

    /* renamed from: h */
    public final int f27361h;

    public zzces(String str, int i) {
        this.f27360g = str;
        this.f27361h = i;
    }

    /* renamed from: Y */
    public static zzces m34963Y(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzces(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzces)) {
            zzces zzces = (zzces) obj;
            if (!C3289k.m14227a(this.f27360g, zzces.f27360g) || !C3289k.m14227a(Integer.valueOf(this.f27361h), Integer.valueOf(zzces.f27361h))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C3289k.m14228b(this.f27360g, Integer.valueOf(this.f27361h));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14322n(parcel, 2, this.f27360g, false);
        C3315b.m14316h(parcel, 3, this.f27361h);
        C3315b.m14310b(parcel, a);
    }
}
