package com.google.android.play.core.assetpacks;

import com.un4seen.bass.BASS;
import java.util.Objects;

/* renamed from: com.google.android.play.core.assetpacks.l0 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6380l0 extends AssetPackState {

    /* renamed from: a */
    private final String f29554a;

    /* renamed from: b */
    private final int f29555b;

    /* renamed from: c */
    private final int f29556c;

    /* renamed from: d */
    private final long f29557d;

    /* renamed from: e */
    private final long f29558e;

    /* renamed from: f */
    private final int f29559f;

    /* renamed from: g */
    private final int f29560g;

    /* renamed from: h */
    private final String f29561h;

    /* renamed from: i */
    private final String f29562i;

    C6380l0(String str, int i, int i2, long j, long j2, int i3, int i4, String str2, String str3) {
        Objects.requireNonNull(str, "Null name");
        this.f29554a = str;
        this.f29555b = i;
        this.f29556c = i2;
        this.f29557d = j;
        this.f29558e = j2;
        this.f29559f = i3;
        this.f29560g = i4;
        Objects.requireNonNull(str2, "Null availableVersionTag");
        this.f29561h = str2;
        Objects.requireNonNull(str3, "Null installedVersionTag");
        this.f29562i = str3;
    }

    /* renamed from: a */
    public final long mo25183a() {
        return this.f29557d;
    }

    /* renamed from: b */
    public final int mo25184b() {
        return this.f29556c;
    }

    /* renamed from: c */
    public final String mo25185c() {
        return this.f29554a;
    }

    /* renamed from: d */
    public final int mo25186d() {
        return this.f29555b;
    }

    /* renamed from: e */
    public final long mo25187e() {
        return this.f29558e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            return this.f29554a.equals(assetPackState.mo25185c()) && this.f29555b == assetPackState.mo25186d() && this.f29556c == assetPackState.mo25184b() && this.f29557d == assetPackState.mo25183a() && this.f29558e == assetPackState.mo25187e() && this.f29559f == assetPackState.mo25188f() && this.f29560g == assetPackState.mo25189g() && this.f29561h.equals(assetPackState.mo25190j()) && this.f29562i.equals(assetPackState.mo25191k());
        }
    }

    /* renamed from: f */
    public final int mo25188f() {
        return this.f29559f;
    }

    /* renamed from: g */
    public final int mo25189g() {
        return this.f29560g;
    }

    public final int hashCode() {
        int hashCode = this.f29554a.hashCode();
        int i = this.f29555b;
        int i2 = this.f29556c;
        long j = this.f29557d;
        long j2 = this.f29558e;
        return ((((((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f29559f) * 1000003) ^ this.f29560g) * 1000003) ^ this.f29561h.hashCode()) * 1000003) ^ this.f29562i.hashCode();
    }

    /* renamed from: j */
    public final String mo25190j() {
        return this.f29561h;
    }

    /* renamed from: k */
    public final String mo25191k() {
        return this.f29562i;
    }

    public final String toString() {
        String str = this.f29554a;
        int i = this.f29555b;
        int i2 = this.f29556c;
        long j = this.f29557d;
        long j2 = this.f29558e;
        int i3 = this.f29559f;
        int i4 = this.f29560g;
        String str2 = this.f29561h;
        String str3 = this.f29562i;
        int length = str.length();
        int length2 = str2.length();
        StringBuilder sb = new StringBuilder(length + BASS.BASS_ATTRIB_MUSIC_VOL_GLOBAL + length2 + str3.length());
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i);
        sb.append(", errorCode=");
        sb.append(i2);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", transferProgressPercentage=");
        sb.append(i3);
        sb.append(", updateAvailability=");
        sb.append(i4);
        sb.append(", availableVersionTag=");
        sb.append(str2);
        sb.append(", installedVersionTag=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}
