package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ap3 implements Map.Entry, Comparable<ap3> {

    /* renamed from: g */
    private final Comparable f14037g;

    /* renamed from: h */
    private Object f14038h;

    /* renamed from: i */
    final /* synthetic */ hp3 f14039i;

    ap3(hp3 hp3, Comparable comparable, Object obj) {
        this.f14039i = hp3;
        this.f14037g = comparable;
        this.f14038h = obj;
    }

    /* renamed from: d */
    private static final boolean m20909d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: c */
    public final Comparable mo15923c() {
        return this.f14037g;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f14037g.compareTo(((ap3) obj).f14037g);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m20909d(this.f14037g, entry.getKey()) && m20909d(this.f14038h, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f14037g;
    }

    public final Object getValue() {
        return this.f14038h;
    }

    public final int hashCode() {
        Comparable comparable = this.f14037g;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f14038h;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f14039i.m24873n();
        Object obj2 = this.f14038h;
        this.f14038h = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f14037g);
        String valueOf2 = String.valueOf(this.f14038h);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
