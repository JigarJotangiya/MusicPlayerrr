package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class r54 {

    /* renamed from: a */
    private final d54[] f22741a = new d54[1];

    /* renamed from: b */
    private int f22742b;

    /* renamed from: c */
    private int f22743c;

    /* renamed from: d */
    private int f22744d = 0;

    /* renamed from: e */
    private d54[] f22745e = new d54[100];

    public r54(boolean z, int i) {
    }

    /* renamed from: a */
    public final synchronized int mo20587a() {
        return this.f22743c * 65536;
    }

    /* renamed from: b */
    public final synchronized d54 mo20588b() {
        d54 d54;
        this.f22743c++;
        int i = this.f22744d;
        if (i > 0) {
            d54[] d54Arr = this.f22745e;
            int i2 = i - 1;
            this.f22744d = i2;
            d54 = d54Arr[i2];
            Objects.requireNonNull(d54);
            d54Arr[i2] = null;
        } else {
            d54 = new d54(new byte[65536], 0);
        }
        return d54;
    }

    /* renamed from: c */
    public final synchronized void mo20589c(d54 d54) {
        d54[] d54Arr = this.f22741a;
        d54Arr[0] = d54;
        mo20590d(d54Arr);
    }

    /* renamed from: d */
    public final synchronized void mo20590d(d54[] d54Arr) {
        int i = this.f22744d;
        int i2 = i + r1;
        d54[] d54Arr2 = this.f22745e;
        int length = d54Arr2.length;
        if (i2 >= length) {
            this.f22745e = (d54[]) Arrays.copyOf(d54Arr2, Math.max(length + length, i2));
        }
        for (d54 d54 : d54Arr) {
            d54[] d54Arr3 = this.f22745e;
            int i3 = this.f22744d;
            this.f22744d = i3 + 1;
            d54Arr3[i3] = d54;
        }
        this.f22743c -= d54Arr.length;
        notifyAll();
    }

    /* renamed from: e */
    public final synchronized void mo20591e() {
        mo20592f(0);
    }

    /* renamed from: f */
    public final synchronized void mo20592f(int i) {
        int i2 = this.f22742b;
        this.f22742b = i;
        if (i < i2) {
            mo20593g();
        }
    }

    /* renamed from: g */
    public final synchronized void mo20593g() {
        int max = Math.max(0, wy2.m33416K(this.f22742b, 65536) - this.f22743c);
        int i = this.f22744d;
        if (max < i) {
            Arrays.fill(this.f22745e, max, i, (Object) null);
            this.f22744d = max;
        }
    }
}
