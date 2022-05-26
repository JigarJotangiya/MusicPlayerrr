package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.hm3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class im3<T extends hm3<T>> {

    /* renamed from: d */
    private static final im3 f18095d = new im3(true);

    /* renamed from: a */
    final hp3<T, Object> f18096a = new wo3(16);

    /* renamed from: b */
    private boolean f18097b;

    /* renamed from: c */
    private boolean f18098c;

    private im3() {
    }

    /* renamed from: a */
    public static <T extends hm3<T>> im3<T> m25292a() {
        throw null;
    }

    /* renamed from: d */
    private static final void m25293d(T t, Object obj) {
        boolean z;
        bq3 a = t.mo18171a();
        zm3.m34700e(obj);
        bq3 bq3 = bq3.DOUBLE;
        cq3 cq3 = cq3.INT;
        switch (a.zza().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof kl3) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof sm3)) {
                    return;
                }
            case 8:
                if (obj instanceof zn3) {
                    return;
                }
                break;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.zza()), t.mo18171a().zza(), obj.getClass().getName()}));
    }

    /* renamed from: b */
    public final void mo18411b() {
        if (!this.f18097b) {
            this.f18096a.mo18182a();
            this.f18097b = true;
        }
    }

    /* renamed from: c */
    public final void mo18412c(T t, Object obj) {
        if (!t.mo18172b()) {
            m25293d(t, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m25293d(t, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f18096a.put(t, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        im3 im3 = new im3();
        for (int i = 0; i < this.f18096a.mo18183b(); i++) {
            Map.Entry<T, Object> g = this.f18096a.mo18190g(i);
            im3.mo18412c((hm3) g.getKey(), g.getValue());
        }
        for (Map.Entry next : this.f18096a.mo18184c()) {
            im3.mo18412c((hm3) next.getKey(), next.getValue());
        }
        im3.f18098c = this.f18098c;
        return im3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im3)) {
            return false;
        }
        return this.f18096a.equals(((im3) obj).f18096a);
    }

    public final int hashCode() {
        return this.f18096a.hashCode();
    }

    private im3(boolean z) {
        mo18411b();
        mo18411b();
    }
}
