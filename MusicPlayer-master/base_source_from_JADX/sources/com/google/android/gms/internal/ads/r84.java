package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class r84 implements z94 {

    /* renamed from: a */
    public final int f22780a;

    /* renamed from: b */
    public final int[] f22781b;

    /* renamed from: c */
    public final long[] f22782c;

    /* renamed from: d */
    public final long[] f22783d;

    /* renamed from: e */
    public final long[] f22784e;

    /* renamed from: f */
    private final long f22785f;

    public r84(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f22781b = iArr;
        this.f22782c = jArr;
        this.f22783d = jArr2;
        this.f22784e = jArr3;
        int length = iArr.length;
        this.f22780a = length;
        if (length > 0) {
            int i = length - 1;
            this.f22785f = jArr2[i] + jArr3[i];
            return;
        }
        this.f22785f = 0;
    }

    /* renamed from: c */
    public final x94 mo15607c(long j) {
        int J = wy2.m33415J(this.f22784e, j, true, true);
        aa4 aa4 = new aa4(this.f22784e[J], this.f22782c[J]);
        if (aa4.f13832a >= j || J == this.f22780a - 1) {
            return new x94(aa4, aa4);
        }
        int i = J + 1;
        return new x94(aa4, new aa4(this.f22784e[i], this.f22782c[i]));
    }

    /* renamed from: e */
    public final boolean mo15608e() {
        return true;
    }

    public final String toString() {
        int i = this.f22780a;
        String arrays = Arrays.toString(this.f22781b);
        String arrays2 = Arrays.toString(this.f22782c);
        String arrays3 = Arrays.toString(this.f22784e);
        String arrays4 = Arrays.toString(this.f22783d);
        int length = String.valueOf(arrays).length();
        int length2 = String.valueOf(arrays2).length();
        StringBuilder sb = new StringBuilder(length + 71 + length2 + String.valueOf(arrays3).length() + String.valueOf(arrays4).length());
        sb.append("ChunkIndex(length=");
        sb.append(i);
        sb.append(", sizes=");
        sb.append(arrays);
        sb.append(", offsets=");
        sb.append(arrays2);
        sb.append(", timeUs=");
        sb.append(arrays3);
        sb.append(", durationsUs=");
        sb.append(arrays4);
        sb.append(")");
        return sb.toString();
    }

    public final long zze() {
        return this.f22785f;
    }
}
