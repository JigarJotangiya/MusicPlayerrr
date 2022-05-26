package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class h04 {

    /* renamed from: a */
    private int f17480a = 0;

    /* renamed from: b */
    private int f17481b = -1;

    /* renamed from: c */
    private int f17482c = 0;

    /* renamed from: d */
    private int[] f17483d;

    /* renamed from: e */
    private int f17484e;

    public h04() {
        int[] iArr = new int[16];
        this.f17483d = iArr;
        this.f17484e = iArr.length - 1;
    }

    /* renamed from: a */
    public final int mo18055a() {
        int i = this.f17482c;
        if (i != 0) {
            int[] iArr = this.f17483d;
            int i2 = this.f17480a;
            int i3 = iArr[i2];
            this.f17480a = (i2 + 1) & this.f17484e;
            this.f17482c = i - 1;
            return i3;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    public final void mo18056b(int i) {
        int i2 = this.f17482c;
        int[] iArr = this.f17483d;
        int length = iArr.length;
        if (i2 == length) {
            int i3 = length + length;
            if (i3 >= 0) {
                int[] iArr2 = new int[i3];
                int i4 = this.f17480a;
                int i5 = length - i4;
                System.arraycopy(iArr, i4, iArr2, 0, i5);
                System.arraycopy(this.f17483d, 0, iArr2, i5, i4);
                this.f17480a = 0;
                this.f17481b = this.f17482c - 1;
                this.f17483d = iArr2;
                this.f17484e = iArr2.length - 1;
                iArr = iArr2;
            } else {
                throw new IllegalStateException();
            }
        }
        int i6 = (this.f17481b + 1) & this.f17484e;
        this.f17481b = i6;
        iArr[i6] = i;
        this.f17482c++;
    }

    /* renamed from: c */
    public final void mo18057c() {
        this.f17480a = 0;
        this.f17481b = -1;
        this.f17482c = 0;
    }

    /* renamed from: d */
    public final boolean mo18058d() {
        return this.f17482c == 0;
    }
}
