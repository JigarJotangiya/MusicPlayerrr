package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class s64 {

    /* renamed from: g */
    private static final Comparator<r64> f23351g = o64.f20937g;

    /* renamed from: h */
    private static final Comparator<r64> f23352h = p64.f21355g;

    /* renamed from: a */
    private final ArrayList<r64> f23353a = new ArrayList<>();

    /* renamed from: b */
    private final r64[] f23354b = new r64[5];

    /* renamed from: c */
    private int f23355c = -1;

    /* renamed from: d */
    private int f23356d;

    /* renamed from: e */
    private int f23357e;

    /* renamed from: f */
    private int f23358f;

    public s64(int i) {
    }

    /* renamed from: a */
    public final float mo20798a(float f) {
        if (this.f23355c != 0) {
            Collections.sort(this.f23353a, f23352h);
            this.f23355c = 0;
        }
        float f2 = ((float) this.f23357e) * 0.5f;
        int i = 0;
        for (int i2 = 0; i2 < this.f23353a.size(); i2++) {
            r64 r64 = this.f23353a.get(i2);
            i += r64.f22756b;
            if (((float) i) >= f2) {
                return r64.f22757c;
            }
        }
        if (this.f23353a.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<r64> arrayList = this.f23353a;
        return arrayList.get(arrayList.size() - 1).f22757c;
    }

    /* renamed from: b */
    public final void mo20799b(int i, float f) {
        r64 r64;
        if (this.f23355c != 1) {
            Collections.sort(this.f23353a, f23351g);
            this.f23355c = 1;
        }
        int i2 = this.f23358f;
        if (i2 > 0) {
            r64[] r64Arr = this.f23354b;
            int i3 = i2 - 1;
            this.f23358f = i3;
            r64 = r64Arr[i3];
        } else {
            r64 = new r64((q64) null);
        }
        int i4 = this.f23356d;
        this.f23356d = i4 + 1;
        r64.f22755a = i4;
        r64.f22756b = i;
        r64.f22757c = f;
        this.f23353a.add(r64);
        this.f23357e += i;
        while (true) {
            int i5 = this.f23357e;
            if (i5 > 2000) {
                int i6 = i5 - 2000;
                r64 r642 = this.f23353a.get(0);
                int i7 = r642.f22756b;
                if (i7 <= i6) {
                    this.f23357e -= i7;
                    this.f23353a.remove(0);
                    int i8 = this.f23358f;
                    if (i8 < 5) {
                        r64[] r64Arr2 = this.f23354b;
                        this.f23358f = i8 + 1;
                        r64Arr2[i8] = r642;
                    }
                } else {
                    r642.f22756b = i7 - i6;
                    this.f23357e -= i6;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo20800c() {
        this.f23353a.clear();
        this.f23355c = -1;
        this.f23356d = 0;
        this.f23357e = 0;
    }
}
