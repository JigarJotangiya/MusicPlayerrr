package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class q54 extends n81 {

    /* renamed from: e */
    private uf1 f21829e;

    /* renamed from: f */
    private byte[] f21830f;

    /* renamed from: g */
    private int f21831g;

    /* renamed from: h */
    private int f21832h;

    public q54() {
        super(false);
    }

    /* renamed from: c */
    public final int mo15695c(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f21832h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.f21830f;
        wy2.m33436c(bArr2);
        System.arraycopy(bArr2, this.f21831g, bArr, i, min);
        this.f21831g += min;
        this.f21832h -= min;
        mo19649n(min);
        return min;
    }

    /* renamed from: g */
    public final Uri mo15696g() {
        uf1 uf1 = this.f21829e;
        if (uf1 != null) {
            return uf1.f24320a;
        }
        return null;
    }

    /* renamed from: h */
    public final void mo15697h() {
        if (this.f21830f != null) {
            this.f21830f = null;
            mo19650o();
        }
        this.f21829e = null;
    }

    /* renamed from: m */
    public final long mo15698m(uf1 uf1) throws IOException {
        String str;
        mo19651p(uf1);
        this.f21829e = uf1;
        Uri uri = uf1.f24320a;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        String valueOf = String.valueOf(scheme);
        if (valueOf.length() != 0) {
            str = "Unsupported scheme: ".concat(valueOf);
        } else {
            str = new String("Unsupported scheme: ");
        }
        gs1.m24487e(equals, str);
        String[] D = wy2.m33409D(uri.getSchemeSpecificPart(), ",");
        if (D.length == 2) {
            String str2 = D[1];
            if (D[0].contains(";base64")) {
                try {
                    this.f21830f = Base64.decode(str2, 0);
                } catch (IllegalArgumentException e) {
                    String valueOf2 = String.valueOf(str2);
                    throw C5464px.zzb(valueOf2.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(valueOf2) : new String("Error while parsing Base64 encoded string: "), e);
                }
            } else {
                this.f21830f = wy2.m33460w(URLDecoder.decode(str2, g13.f16856a.name()));
            }
            long j = uf1.f24325f;
            int length = this.f21830f.length;
            if (j <= ((long) length)) {
                int i = (int) j;
                this.f21831g = i;
                int i2 = length - i;
                this.f21832h = i2;
                long j2 = uf1.f24326g;
                if (j2 != -1) {
                    this.f21832h = (int) Math.min((long) i2, j2);
                }
                mo19652q(uf1);
                long j3 = uf1.f24326g;
                return j3 != -1 ? j3 : (long) this.f21832h;
            }
            this.f21830f = null;
            throw new rc1(2008);
        }
        String valueOf3 = String.valueOf(uri);
        String.valueOf(valueOf3).length();
        throw C5464px.zzb("Unexpected URI format: ".concat(String.valueOf(valueOf3)), (Throwable) null);
    }
}
