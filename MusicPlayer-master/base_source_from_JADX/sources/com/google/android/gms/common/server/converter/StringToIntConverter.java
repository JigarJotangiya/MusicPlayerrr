package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.C3346a<String, Integer> {
    @RecentlyNonNull
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new C3344b();

    /* renamed from: g */
    final int f10710g;

    /* renamed from: h */
    private final HashMap<String, Integer> f10711h;

    /* renamed from: i */
    private final SparseArray<String> f10712i;

    public StringToIntConverter() {
        this.f10710g = 1;
        this.f10711h = new HashMap<>();
        this.f10712i = new SparseArray<>();
    }

    @RecentlyNonNull
    /* renamed from: Y */
    public StringToIntConverter mo11925Y(@RecentlyNonNull String str, int i) {
        this.f10711h.put(str, Integer.valueOf(i));
        this.f10712i.put(i, str);
        return this;
    }

    @RecentlyNonNull
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo11926d(@RecentlyNonNull Object obj) {
        String str = this.f10712i.get(((Integer) obj).intValue());
        return (str != null || !this.f10711h.containsKey("gms_unknown")) ? str : "gms_unknown";
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f10710g);
        ArrayList arrayList = new ArrayList();
        for (String next : this.f10711h.keySet()) {
            arrayList.add(new zac(next, this.f10711h.get(next).intValue()));
        }
        C3315b.m14326r(parcel, 2, arrayList, false);
        C3315b.m14310b(parcel, a);
    }

    StringToIntConverter(int i, ArrayList<zac> arrayList) {
        this.f10710g = i;
        this.f10711h = new HashMap<>();
        this.f10712i = new SparseArray<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zac zac = arrayList.get(i2);
            mo11925Y(zac.f10716h, zac.f10717i);
        }
    }
}
