package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.t2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5581t2 {

    /* renamed from: f */
    private static final byte[] f23687f = {0, 0, 1};

    /* renamed from: a */
    private boolean f23688a;

    /* renamed from: b */
    private int f23689b;

    /* renamed from: c */
    public int f23690c;

    /* renamed from: d */
    public int f23691d;

    /* renamed from: e */
    public byte[] f23692e = new byte[128];

    public C5581t2(int i) {
    }

    /* renamed from: a */
    public final void mo20998a(byte[] bArr, int i, int i2) {
        if (this.f23688a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f23692e;
            int length = bArr2.length;
            int i4 = this.f23690c + i3;
            if (length < i4) {
                this.f23692e = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f23692e, this.f23690c, i3);
            this.f23690c += i3;
        }
    }

    /* renamed from: b */
    public final void mo20999b() {
        this.f23688a = false;
        this.f23690c = 0;
        this.f23689b = 0;
    }

    /* renamed from: c */
    public final boolean mo21000c(int i, int i2) {
        int i3 = this.f23689b;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i == 179 || i == 181) {
                            this.f23690c -= i2;
                            this.f23688a = false;
                            return true;
                        }
                    } else if ((i & 240) != 32) {
                        Log.w("H263Reader", "Unexpected start code value");
                        mo20999b();
                    } else {
                        this.f23691d = this.f23690c;
                        this.f23689b = 4;
                    }
                } else if (i > 31) {
                    Log.w("H263Reader", "Unexpected start code value");
                    mo20999b();
                } else {
                    this.f23689b = 3;
                }
            } else if (i != 181) {
                Log.w("H263Reader", "Unexpected start code value");
                mo20999b();
            } else {
                this.f23689b = 2;
            }
        } else if (i == 176) {
            this.f23689b = 1;
            this.f23688a = true;
        }
        mo20998a(f23687f, 0, 3);
        return false;
    }
}
