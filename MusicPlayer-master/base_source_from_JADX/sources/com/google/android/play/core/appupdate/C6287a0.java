package com.google.android.play.core.appupdate;

/* renamed from: com.google.android.play.core.appupdate.a0 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6287a0 extends C6292d {

    /* renamed from: a */
    private final int f29278a;

    /* renamed from: b */
    private final boolean f29279b;

    /* synthetic */ C6287a0(int i, boolean z, C6316z zVar) {
        this.f29278a = i;
        this.f29279b = z;
    }

    /* renamed from: a */
    public final boolean mo25150a() {
        return this.f29279b;
    }

    /* renamed from: b */
    public final int mo25151b() {
        return this.f29278a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6292d) {
            C6292d dVar = (C6292d) obj;
            return this.f29278a == dVar.mo25151b() && this.f29279b == dVar.mo25150a();
        }
    }

    public final int hashCode() {
        return ((this.f29278a ^ 1000003) * 1000003) ^ (true != this.f29279b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f29278a;
        boolean z = this.f29279b;
        StringBuilder sb = new StringBuilder(73);
        sb.append("AppUpdateOptions{appUpdateType=");
        sb.append(i);
        sb.append(", allowAssetPackDeletion=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
