package com.google.android.play.core.install;

import java.util.Objects;

/* renamed from: com.google.android.play.core.install.d */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6463d extends InstallState {

    /* renamed from: a */
    private final int f29750a;

    /* renamed from: b */
    private final long f29751b;

    /* renamed from: c */
    private final long f29752c;

    /* renamed from: d */
    private final int f29753d;

    /* renamed from: e */
    private final String f29754e;

    C6463d(int i, long j, long j2, int i2, String str) {
        this.f29750a = i;
        this.f29751b = j;
        this.f29752c = j2;
        this.f29753d = i2;
        Objects.requireNonNull(str, "Null packageName");
        this.f29754e = str;
    }

    /* renamed from: a */
    public final long mo25385a() {
        return this.f29751b;
    }

    /* renamed from: b */
    public final int mo25386b() {
        return this.f29753d;
    }

    /* renamed from: c */
    public final int mo25387c() {
        return this.f29750a;
    }

    /* renamed from: d */
    public final String mo25388d() {
        return this.f29754e;
    }

    /* renamed from: e */
    public final long mo25389e() {
        return this.f29752c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            return this.f29750a == installState.mo25387c() && this.f29751b == installState.mo25385a() && this.f29752c == installState.mo25389e() && this.f29753d == installState.mo25386b() && this.f29754e.equals(installState.mo25388d());
        }
    }

    public final int hashCode() {
        int i = this.f29750a;
        long j = this.f29751b;
        long j2 = this.f29752c;
        return ((((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f29753d) * 1000003) ^ this.f29754e.hashCode();
    }

    public final String toString() {
        int i = this.f29750a;
        long j = this.f29751b;
        long j2 = this.f29752c;
        int i2 = this.f29753d;
        String str = this.f29754e;
        StringBuilder sb = new StringBuilder(str.length() + 164);
        sb.append("InstallState{installStatus=");
        sb.append(i);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", installErrorCode=");
        sb.append(i2);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
