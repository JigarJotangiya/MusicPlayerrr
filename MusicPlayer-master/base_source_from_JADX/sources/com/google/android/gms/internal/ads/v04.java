package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class v04 {

    /* renamed from: a */
    public final String f24536a;

    /* renamed from: b */
    public final boolean f24537b;

    /* renamed from: c */
    public final boolean f24538c;

    public v04(String str, boolean z, boolean z2) {
        this.f24536a = str;
        this.f24537b = z;
        this.f24538c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == v04.class) {
            v04 v04 = (v04) obj;
            return TextUtils.equals(this.f24536a, v04.f24536a) && this.f24537b == v04.f24537b && this.f24538c == v04.f24538c;
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.f24536a.hashCode() + 31) * 31) + (true != this.f24537b ? 1237 : 1231)) * 31;
        if (true == this.f24538c) {
            i = 1231;
        }
        return hashCode + i;
    }
}
