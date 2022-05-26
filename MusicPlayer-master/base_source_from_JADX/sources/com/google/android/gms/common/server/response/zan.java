package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new C3349c();

    /* renamed from: g */
    final int f10742g;

    /* renamed from: h */
    private final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> f10743h;

    /* renamed from: i */
    private final String f10744i;

    zan(int i, ArrayList<zal> arrayList, String str) {
        this.f10742g = i;
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zal = arrayList.get(i2);
            String str2 = zal.f10737h;
            HashMap hashMap2 = new HashMap();
            ArrayList<zam> arrayList2 = zal.f10738i;
            C3292l.m14240h(arrayList2);
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zam = zal.f10738i.get(i3);
                hashMap2.put(zam.f10740h, zam.f10741i);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f10743h = hashMap;
        C3292l.m14240h(str);
        this.f10744i = str;
        mo11969Y();
    }

    /* renamed from: Y */
    public final void mo11969Y() {
        for (String str : this.f10743h.keySet()) {
            Map map = this.f10743h.get(str);
            for (String str2 : map.keySet()) {
                ((FastJsonResponse.Field) map.get(str2)).mo11947o0(this);
            }
        }
    }

    /* renamed from: m0 */
    public final Map<String, FastJsonResponse.Field<?, ?>> mo11970m0(String str) {
        return this.f10743h.get(str);
    }

    /* renamed from: n0 */
    public final String mo11971n0() {
        return this.f10744i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String next : this.f10743h.keySet()) {
            sb.append(next);
            sb.append(":\n");
            Map map = this.f10743h.get(next);
            for (String str : map.keySet()) {
                sb.append("  ");
                sb.append(str);
                sb.append(": ");
                sb.append(map.get(str));
            }
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f10742g);
        ArrayList arrayList = new ArrayList();
        for (String next : this.f10743h.keySet()) {
            arrayList.add(new zal(next, this.f10743h.get(next)));
        }
        C3315b.m14326r(parcel, 2, arrayList, false);
        C3315b.m14322n(parcel, 3, this.f10744i, false);
        C3315b.m14310b(parcel, a);
    }
}
