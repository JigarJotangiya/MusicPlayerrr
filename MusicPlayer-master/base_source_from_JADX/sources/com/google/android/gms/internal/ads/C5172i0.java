package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.i0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5172i0 extends C5246k0 {

    /* renamed from: b */
    public final long f17827b;

    /* renamed from: c */
    public final List<C5209j0> f17828c = new ArrayList();

    /* renamed from: d */
    public final List<C5172i0> f17829d = new ArrayList();

    public C5172i0(int i, long j) {
        super(i);
        this.f17827b = j;
    }

    /* renamed from: c */
    public final C5172i0 mo18244c(int i) {
        int size = this.f17829d.size();
        for (int i2 = 0; i2 < size; i2++) {
            C5172i0 i0Var = this.f17829d.get(i2);
            if (i0Var.f18688a == i) {
                return i0Var;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final C5209j0 mo18245d(int i) {
        int size = this.f17828c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C5209j0 j0Var = this.f17828c.get(i2);
            if (j0Var.f18688a == i) {
                return j0Var;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void mo18246e(C5172i0 i0Var) {
        this.f17829d.add(i0Var);
    }

    /* renamed from: f */
    public final void mo18247f(C5209j0 j0Var) {
        this.f17828c.add(j0Var);
    }

    public final String toString() {
        String b = C5246k0.m26040b(this.f18688a);
        String arrays = Arrays.toString(this.f17828c.toArray());
        String arrays2 = Arrays.toString(this.f17829d.toArray());
        int length = String.valueOf(arrays).length();
        StringBuilder sb = new StringBuilder(b.length() + 22 + length + String.valueOf(arrays2).length());
        sb.append(b);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
