package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new C3350d();

    /* renamed from: g */
    final int f10736g;

    /* renamed from: h */
    final String f10737h;

    /* renamed from: i */
    final ArrayList<zam> f10738i;

    zal(int i, String str, ArrayList<zam> arrayList) {
        this.f10736g = i;
        this.f10737h = str;
        this.f10738i = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f10736g);
        C3315b.m14322n(parcel, 2, this.f10737h, false);
        C3315b.m14326r(parcel, 3, this.f10738i, false);
        C3315b.m14310b(parcel, a);
    }

    zal(String str, Map<String, FastJsonResponse.Field<?, ?>> map) {
        ArrayList<zam> arrayList;
        this.f10736g = 1;
        this.f10737h = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
            for (String next : map.keySet()) {
                arrayList.add(new zam(next, map.get(next)));
            }
        }
        this.f10738i = arrayList;
    }
}
