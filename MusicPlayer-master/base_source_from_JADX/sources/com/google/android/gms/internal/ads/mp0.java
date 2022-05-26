package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class mp0 implements C5673vk {

    /* renamed from: a */
    private final C5673vk f20114a;

    /* renamed from: b */
    private final long f20115b;

    /* renamed from: c */
    private final C5673vk f20116c;

    /* renamed from: d */
    private long f20117d;

    /* renamed from: e */
    private Uri f20118e;

    mp0(C5673vk vkVar, int i, C5673vk vkVar2) {
        this.f20114a = vkVar;
        this.f20115b = (long) i;
        this.f20116c = vkVar2;
    }

    /* renamed from: a */
    public final int mo15842a(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.f20117d;
        long j2 = this.f20115b;
        if (j < j2) {
            int a = this.f20114a.mo15842a(bArr, i, (int) Math.min((long) i2, j2 - j));
            long j3 = this.f20117d + ((long) a);
            this.f20117d = j3;
            i3 = a;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < this.f20115b) {
            return i3;
        }
        int a2 = this.f20116c.mo15842a(bArr, i + i3, i2 - i3);
        this.f20117d += (long) a2;
        return i3 + a2;
    }

    /* renamed from: b */
    public final Uri mo15843b() {
        return this.f20118e;
    }

    /* renamed from: c */
    public final long mo15844c(C5747xk xkVar) throws IOException {
        C5747xk xkVar2;
        C5747xk xkVar3 = xkVar;
        this.f20118e = xkVar3.f25862a;
        long j = xkVar3.f25864c;
        long j2 = this.f20115b;
        C5747xk xkVar4 = null;
        if (j >= j2) {
            xkVar2 = null;
        } else {
            long j3 = xkVar3.f25865d;
            xkVar2 = new C5747xk(xkVar3.f25862a, (byte[]) null, j, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, (String) null, 0);
        }
        long j4 = xkVar3.f25865d;
        if (j4 == -1 || xkVar3.f25864c + j4 > this.f20115b) {
            long max = Math.max(this.f20115b, xkVar3.f25864c);
            long j5 = xkVar3.f25865d;
            xkVar4 = new C5747xk(xkVar3.f25862a, (byte[]) null, max, max, j5 != -1 ? Math.min(j5, (xkVar3.f25864c + j5) - this.f20115b) : -1, (String) null, 0);
        }
        long j6 = 0;
        long c = xkVar2 != null ? this.f20114a.mo15844c(xkVar2) : 0;
        if (xkVar4 != null) {
            j6 = this.f20116c.mo15844c(xkVar4);
        }
        this.f20117d = xkVar3.f25864c;
        if (j6 == -1) {
            return -1;
        }
        return c + j6;
    }

    /* renamed from: f */
    public final void mo15845f() throws IOException {
        this.f20114a.mo15845f();
        this.f20116c.mo15845f();
    }
}
