package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new C3343a();

    /* renamed from: g */
    final int f10713g;

    /* renamed from: h */
    private final StringToIntConverter f10714h;

    zaa(int i, StringToIntConverter stringToIntConverter) {
        this.f10713g = i;
        this.f10714h = stringToIntConverter;
    }

    /* renamed from: Y */
    public static zaa m14376Y(FastJsonResponse.C3346a<?, ?> aVar) {
        if (aVar instanceof StringToIntConverter) {
            return new zaa((StringToIntConverter) aVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    /* renamed from: m0 */
    public final FastJsonResponse.C3346a<?, ?> mo11934m0() {
        StringToIntConverter stringToIntConverter = this.f10714h;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f10713g);
        C3315b.m14321m(parcel, 2, this.f10714h, i, false);
        C3315b.m14310b(parcel, a);
    }

    private zaa(StringToIntConverter stringToIntConverter) {
        this.f10713g = 1;
        this.f10714h = stringToIntConverter;
    }
}
