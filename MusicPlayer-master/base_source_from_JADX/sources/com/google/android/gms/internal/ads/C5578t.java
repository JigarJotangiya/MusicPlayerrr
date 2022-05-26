package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.t */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5578t {

    /* renamed from: a */
    private final byte[] f23661a = new byte[10];

    /* renamed from: b */
    private boolean f23662b;

    /* renamed from: c */
    private int f23663c;

    /* renamed from: d */
    private long f23664d;

    /* renamed from: e */
    private int f23665e;

    /* renamed from: f */
    private int f23666f;

    /* renamed from: g */
    private int f23667g;

    /* renamed from: a */
    public final void mo20985a(C5541s sVar) {
        if (this.f23663c > 0) {
            sVar.f23252X.mo16889e(this.f23664d, this.f23665e, this.f23666f, this.f23667g, sVar.f23263j);
            this.f23663c = 0;
        }
    }

    /* renamed from: b */
    public final void mo20986b() {
        this.f23662b = false;
        this.f23663c = 0;
    }

    /* renamed from: c */
    public final void mo20987c(C5541s sVar, long j, int i, int i2, int i3) {
        if (this.f23662b) {
            int i4 = this.f23663c;
            int i5 = i4 + 1;
            this.f23663c = i5;
            if (i4 == 0) {
                this.f23664d = j;
                this.f23665e = i;
                this.f23666f = 0;
            }
            this.f23666f += i2;
            this.f23667g = i3;
            if (i5 >= 16) {
                mo20985a(sVar);
            }
        }
    }

    /* renamed from: d */
    public final void mo20988d(z84 z84) throws IOException {
        if (!this.f23662b) {
            ((t84) z84).mo19929i(this.f23661a, 0, 10, false);
            z84.mo19928h();
            byte[] bArr = this.f23661a;
            int i = d84.f15548g;
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
                this.f23662b = true;
            }
        }
    }
}
