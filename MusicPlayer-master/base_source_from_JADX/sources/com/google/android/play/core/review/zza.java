package com.google.android.play.core.review;

import android.app.PendingIntent;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.2 */
final class zza extends ReviewInfo {

    /* renamed from: g */
    private final PendingIntent f29755g;

    /* renamed from: h */
    private final boolean f29756h;

    zza(PendingIntent pendingIntent, boolean z) {
        Objects.requireNonNull(pendingIntent, "Null pendingIntent");
        this.f29755g = pendingIntent;
        this.f29756h = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final PendingIntent mo25395a() {
        return this.f29755g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo25396b() {
        return this.f29756h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            return this.f29755g.equals(reviewInfo.mo25395a()) && this.f29756h == reviewInfo.mo25396b();
        }
    }

    public final int hashCode() {
        return ((this.f29755g.hashCode() ^ 1000003) * 1000003) ^ (true != this.f29756h ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f29755g);
        boolean z = this.f29756h;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
        sb.append("ReviewInfo{pendingIntent=");
        sb.append(valueOf);
        sb.append(", isNoOp=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
