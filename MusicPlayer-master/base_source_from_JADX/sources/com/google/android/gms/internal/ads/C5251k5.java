package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.k5 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5251k5 {

    /* renamed from: a */
    private final String f18778a;

    /* renamed from: b */
    private final String f18779b;

    public C5251k5(String str, String str2) {
        this.f18778a = str;
        this.f18779b = str2;
    }

    /* renamed from: a */
    public final String mo18836a() {
        return this.f18778a;
    }

    /* renamed from: b */
    public final String mo18837b() {
        return this.f18779b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5251k5.class == obj.getClass()) {
            C5251k5 k5Var = (C5251k5) obj;
            return TextUtils.equals(this.f18778a, k5Var.f18778a) && TextUtils.equals(this.f18779b, k5Var.f18779b);
        }
    }

    public final int hashCode() {
        return (this.f18778a.hashCode() * 31) + this.f18779b.hashCode();
    }

    public final String toString() {
        String str = this.f18778a;
        String str2 = this.f18779b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
