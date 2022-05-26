package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class s33 extends v33 {
    s33() {
        super((u33) null);
    }

    /* renamed from: j */
    static final v33 m30541j(int i) {
        return i < 0 ? v33.f24568b : i > 0 ? v33.f24569c : v33.f24567a;
    }

    /* renamed from: a */
    public final int mo20762a() {
        return 0;
    }

    /* renamed from: b */
    public final v33 mo20763b(int i, int i2) {
        return m30541j(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    /* renamed from: c */
    public final <T> v33 mo20764c(T t, T t2, Comparator<T> comparator) {
        return m30541j(comparator.compare(t, t2));
    }

    /* renamed from: d */
    public final v33 mo20765d(boolean z, boolean z2) {
        return m30541j(o63.m28302a(z, z2));
    }

    /* renamed from: e */
    public final v33 mo20766e(boolean z, boolean z2) {
        return m30541j(o63.m28302a(false, false));
    }
}
