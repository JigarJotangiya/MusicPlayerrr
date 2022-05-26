package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class t94 {

    /* renamed from: a */
    public int f23798a;

    /* renamed from: b */
    public String f23799b;

    /* renamed from: c */
    public int f23800c;

    /* renamed from: d */
    public int f23801d;

    /* renamed from: e */
    public int f23802e;

    /* renamed from: f */
    public int f23803f;

    /* renamed from: g */
    public int f23804g;

    /* renamed from: a */
    public final boolean mo21043a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (!u94.m31722m(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.f23798a = i2;
        this.f23799b = u94.f24237a[3 - i3];
        int i8 = u94.f24238b[i5];
        this.f23801d = i8;
        int i9 = 2;
        if (i2 == 2) {
            this.f23801d = i8 / 2;
        } else if (i2 == 0) {
            this.f23801d = i8 / 4;
        }
        int i10 = (i >>> 9) & 1;
        this.f23804g = u94.m31721l(i2, i3);
        if (i3 == 3) {
            if (i2 == 3) {
                i7 = u94.f24239c[i4 - 1];
            } else {
                i7 = u94.f24240d[i4 - 1];
            }
            this.f23803f = i7;
            this.f23800c = (((i7 * 12) / this.f23801d) + i10) * 4;
        } else {
            int i11 = 144;
            if (i2 == 3) {
                if (i3 == 2) {
                    i6 = u94.f24241e[i4 - 1];
                } else {
                    i6 = u94.f24242f[i4 - 1];
                }
                this.f23803f = i6;
                this.f23800c = ((i6 * 144) / this.f23801d) + i10;
            } else {
                int i12 = u94.f24243g[i4 - 1];
                this.f23803f = i12;
                if (i3 == 1) {
                    i11 = 72;
                }
                this.f23800c = ((i11 * i12) / this.f23801d) + i10;
            }
        }
        if (((i >> 6) & 3) == 3) {
            i9 = 1;
        }
        this.f23802e = i9;
        return true;
    }
}
