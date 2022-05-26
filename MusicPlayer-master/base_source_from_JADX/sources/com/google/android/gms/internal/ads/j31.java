package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class j31 {

    /* renamed from: c */
    public static final j31 f18339c = new j31((Object) null, new nd0[0], 0, -9223372036854775807L, 0);

    /* renamed from: d */
    private static final nd0 f18340d = new nd0(0).mo19708b(0);

    /* renamed from: a */
    public final long f18341a = 0;

    /* renamed from: b */
    private final nd0[] f18342b;

    static {
        C4874a aVar = C4874a.f13689a;
    }

    private j31(Object obj, nd0[] nd0Arr, long j, long j2, int i) {
        this.f18342b = nd0Arr;
    }

    /* renamed from: a */
    public final nd0 mo18533a(int i) {
        return i < 0 ? f18340d : this.f18342b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j31.class == obj.getClass()) {
            return wy2.m33453p((Object) null, (Object) null) && Arrays.equals(this.f18342b, ((j31) obj).f18342b);
        }
    }

    public final int hashCode() {
        return (((int) -9223372036854775807L) * 961) + Arrays.hashCode(this.f18342b);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + null + ", adResumePositionUs=0, adGroups=[" + "])";
    }
}
