package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.xk */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5747xk {

    /* renamed from: a */
    public final Uri f25862a;

    /* renamed from: b */
    public final long f25863b;

    /* renamed from: c */
    public final long f25864c;

    /* renamed from: d */
    public final long f25865d;

    public C5747xk(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = false;
        C5304ll.m26774c(j >= 0);
        C5304ll.m26774c(j2 >= 0);
        C5304ll.m26774c((j3 > 0 || j3 == -1) ? true : z);
        this.f25862a = uri;
        this.f25863b = j;
        this.f25864c = j2;
        this.f25865d = j3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f25862a);
        String arrays = Arrays.toString((byte[]) null);
        long j = this.f25863b;
        long j2 = this.f25864c;
        long j3 = this.f25865d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 93 + String.valueOf(arrays).length() + 4);
        sb.append("DataSpec[");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(arrays);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", null, 0]");
        return sb.toString();
    }
}
