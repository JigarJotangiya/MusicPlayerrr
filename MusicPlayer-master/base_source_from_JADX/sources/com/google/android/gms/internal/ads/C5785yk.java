package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.yk */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5785yk {

    /* renamed from: a */
    private final C5562sk[] f26384a = new C5562sk[1];

    /* renamed from: b */
    private int f26385b;

    /* renamed from: c */
    private int f26386c;

    /* renamed from: d */
    private int f26387d = 0;

    /* renamed from: e */
    private C5562sk[] f26388e = new C5562sk[100];

    public C5785yk(boolean z, int i) {
    }

    /* renamed from: a */
    public final synchronized int mo22205a() {
        return this.f26386c * 65536;
    }

    /* renamed from: b */
    public final synchronized C5562sk mo22206b() {
        C5562sk skVar;
        this.f26386c++;
        int i = this.f26387d;
        if (i > 0) {
            C5562sk[] skVarArr = this.f26388e;
            int i2 = i - 1;
            this.f26387d = i2;
            skVar = skVarArr[i2];
            skVarArr[i2] = null;
        } else {
            skVar = new C5562sk(new byte[65536], 0);
        }
        return skVar;
    }

    /* renamed from: c */
    public final synchronized void mo22207c(C5562sk skVar) {
        C5562sk[] skVarArr = this.f26384a;
        skVarArr[0] = skVar;
        mo22208d(skVarArr);
    }

    /* renamed from: d */
    public final synchronized void mo22208d(C5562sk[] skVarArr) {
        int i = this.f26387d;
        int i2 = i + r1;
        C5562sk[] skVarArr2 = this.f26388e;
        int length = skVarArr2.length;
        if (i2 >= length) {
            this.f26388e = (C5562sk[]) Arrays.copyOf(skVarArr2, Math.max(length + length, i2));
        }
        for (C5562sk skVar : skVarArr) {
            byte[] bArr = skVar.f23520a;
            C5562sk[] skVarArr3 = this.f26388e;
            int i3 = this.f26387d;
            this.f26387d = i3 + 1;
            skVarArr3[i3] = skVar;
        }
        this.f26386c -= skVarArr.length;
        notifyAll();
    }

    /* renamed from: e */
    public final synchronized void mo22209e() {
        mo22210f(0);
    }

    /* renamed from: f */
    public final synchronized void mo22210f(int i) {
        int i2 = this.f26385b;
        this.f26385b = i;
        if (i < i2) {
            mo22211g();
        }
    }

    /* renamed from: g */
    public final synchronized void mo22211g() {
        int max = Math.max(0, C4934bm.m21434d(this.f26385b, 65536) - this.f26386c);
        int i = this.f26387d;
        if (max < i) {
            Arrays.fill(this.f26388e, max, i, (Object) null);
            this.f26387d = max;
        }
    }
}
