package com.google.android.play.core.assetpacks;

import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.m0 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6385m0 extends C6329c {

    /* renamed from: a */
    private final long f29570a;

    /* renamed from: b */
    private final Map<String, AssetPackState> f29571b;

    C6385m0(long j, Map<String, AssetPackState> map) {
        this.f29570a = j;
        this.f29571b = map;
    }

    /* renamed from: a */
    public final Map<String, AssetPackState> mo25219a() {
        return this.f29571b;
    }

    /* renamed from: b */
    public final long mo25220b() {
        return this.f29570a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6329c) {
            C6329c cVar = (C6329c) obj;
            return this.f29570a == cVar.mo25220b() && this.f29571b.equals(cVar.mo25219a());
        }
    }

    public final int hashCode() {
        long j = this.f29570a;
        return this.f29571b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f29570a;
        String valueOf = String.valueOf(this.f29571b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
        sb.append("AssetPackStates{totalBytes=");
        sb.append(j);
        sb.append(", packStates=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
