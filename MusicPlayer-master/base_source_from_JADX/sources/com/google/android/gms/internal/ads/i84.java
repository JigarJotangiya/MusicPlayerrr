package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class i84 {

    /* renamed from: a */
    private final SparseBooleanArray f17917a;

    /* synthetic */ i84(SparseBooleanArray sparseBooleanArray, h74 h74) {
        this.f17917a = sparseBooleanArray;
    }

    /* renamed from: a */
    public final int mo18307a(int i) {
        gs1.m24483a(i, 0, this.f17917a.size());
        return this.f17917a.keyAt(i);
    }

    /* renamed from: b */
    public final int mo18308b() {
        return this.f17917a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i84)) {
            return false;
        }
        i84 i84 = (i84) obj;
        if (wy2.f25579a >= 24) {
            return this.f17917a.equals(i84.f17917a);
        }
        if (this.f17917a.size() != i84.f17917a.size()) {
            return false;
        }
        for (int i = 0; i < this.f17917a.size(); i++) {
            if (mo18307a(i) != i84.mo18307a(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (wy2.f25579a >= 24) {
            return this.f17917a.hashCode();
        }
        int size = this.f17917a.size();
        for (int i = 0; i < this.f17917a.size(); i++) {
            size = (size * 31) + mo18307a(i);
        }
        return size;
    }
}
