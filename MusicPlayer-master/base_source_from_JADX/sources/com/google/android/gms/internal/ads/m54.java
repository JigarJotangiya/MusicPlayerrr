package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class m54 extends n81 {

    /* renamed from: e */
    private final byte[] f19775e;

    /* renamed from: f */
    private Uri f19776f;

    /* renamed from: g */
    private int f19777g;

    /* renamed from: h */
    private int f19778h;

    /* renamed from: i */
    private boolean f19779i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m54(byte[] bArr) {
        super(false);
        boolean z = false;
        Objects.requireNonNull(bArr);
        gs1.m24486d(bArr.length > 0 ? true : z);
        this.f19775e = bArr;
    }

    /* renamed from: c */
    public final int mo15695c(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f19778h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.f19775e, this.f19777g, bArr, i, min);
        this.f19777g += min;
        this.f19778h -= min;
        mo19649n(min);
        return min;
    }

    /* renamed from: g */
    public final Uri mo15696g() {
        return this.f19776f;
    }

    /* renamed from: h */
    public final void mo15697h() {
        if (this.f19779i) {
            this.f19779i = false;
            mo19650o();
        }
        this.f19776f = null;
    }

    /* renamed from: m */
    public final long mo15698m(uf1 uf1) throws IOException {
        this.f19776f = uf1.f24320a;
        mo19651p(uf1);
        long j = uf1.f24325f;
        int length = this.f19775e.length;
        if (j <= ((long) length)) {
            int i = (int) j;
            this.f19777g = i;
            int i2 = length - i;
            this.f19778h = i2;
            long j2 = uf1.f24326g;
            if (j2 != -1) {
                this.f19778h = (int) Math.min((long) i2, j2);
            }
            this.f19779i = true;
            mo19652q(uf1);
            long j3 = uf1.f24326g;
            return j3 != -1 ? j3 : (long) this.f19778h;
        }
        throw new rc1(2008);
    }
}
