package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class x94 {

    /* renamed from: a */
    public final aa4 f25724a;

    /* renamed from: b */
    public final aa4 f25725b;

    public x94(aa4 aa4, aa4 aa42) {
        this.f25724a = aa4;
        this.f25725b = aa42;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x94.class == obj.getClass()) {
            x94 x94 = (x94) obj;
            return this.f25724a.equals(x94.f25724a) && this.f25725b.equals(x94.f25725b);
        }
    }

    public final int hashCode() {
        return (this.f25724a.hashCode() * 31) + this.f25725b.hashCode();
    }

    public final String toString() {
        String obj = this.f25724a.toString();
        String concat = this.f25724a.equals(this.f25725b) ? BuildConfig.FLAVOR : ", ".concat(this.f25725b.toString());
        StringBuilder sb = new StringBuilder(obj.length() + 2 + concat.length());
        sb.append("[");
        sb.append(obj);
        sb.append(concat);
        sb.append("]");
        return sb.toString();
    }
}
