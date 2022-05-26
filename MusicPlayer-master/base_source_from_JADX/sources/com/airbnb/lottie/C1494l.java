package com.airbnb.lottie;

import java.util.Arrays;

/* renamed from: com.airbnb.lottie.l */
/* compiled from: LottieResult */
public final class C1494l<V> {

    /* renamed from: a */
    private final V f5751a;

    /* renamed from: b */
    private final Throwable f5752b;

    public C1494l(V v) {
        this.f5751a = v;
        this.f5752b = null;
    }

    /* renamed from: a */
    public Throwable mo7117a() {
        return this.f5752b;
    }

    /* renamed from: b */
    public V mo7118b() {
        return this.f5751a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1494l)) {
            return false;
        }
        C1494l lVar = (C1494l) obj;
        if (mo7118b() != null && mo7118b().equals(lVar.mo7118b())) {
            return true;
        }
        if (mo7117a() == null || lVar.mo7117a() == null) {
            return false;
        }
        return mo7117a().toString().equals(mo7117a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{mo7118b(), mo7117a()});
    }

    public C1494l(Throwable th) {
        this.f5752b = th;
        this.f5751a = null;
    }
}
