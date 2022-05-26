package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.tk */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5599tk implements C5673vk {

    /* renamed from: a */
    private final byte[] f23909a;

    /* renamed from: b */
    private Uri f23910b;

    /* renamed from: c */
    private int f23911c;

    /* renamed from: d */
    private int f23912d;

    public C5599tk(byte[] bArr) {
        Objects.requireNonNull(bArr);
        C5304ll.m26774c(bArr.length > 0);
        this.f23909a = bArr;
    }

    /* renamed from: a */
    public final int mo15842a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f23912d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.f23909a, this.f23911c, bArr, i, min);
        this.f23911c += min;
        this.f23912d -= min;
        return min;
    }

    /* renamed from: b */
    public final Uri mo15843b() {
        return this.f23910b;
    }

    /* renamed from: c */
    public final long mo15844c(C5747xk xkVar) throws IOException {
        this.f23910b = xkVar.f25862a;
        long j = xkVar.f25864c;
        int i = (int) j;
        this.f23911c = i;
        long j2 = xkVar.f25865d;
        int length = (int) (j2 == -1 ? ((long) this.f23909a.length) - j : j2);
        this.f23912d = length;
        if (length > 0 && i + length <= this.f23909a.length) {
            return (long) length;
        }
        int length2 = this.f23909a.length;
        StringBuilder sb = new StringBuilder(77);
        sb.append("Unsatisfiable range: [");
        sb.append(i);
        sb.append(", ");
        sb.append(j2);
        sb.append("], length: ");
        sb.append(length2);
        throw new IOException(sb.toString());
    }

    /* renamed from: f */
    public final void mo15845f() throws IOException {
        this.f23910b = null;
    }
}
