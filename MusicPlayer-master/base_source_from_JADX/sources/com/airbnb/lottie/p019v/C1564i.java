package com.airbnb.lottie.p019v;

import p082e.p109h.p118o.C3699e;

/* renamed from: com.airbnb.lottie.v.i */
/* compiled from: MutablePair */
public class C1564i<T> {

    /* renamed from: a */
    T f6007a;

    /* renamed from: b */
    T f6008b;

    /* renamed from: a */
    private static boolean m7997a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public void mo7241b(T t, T t2) {
        this.f6007a = t;
        this.f6008b = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3699e)) {
            return false;
        }
        C3699e eVar = (C3699e) obj;
        if (!m7997a(eVar.f11713a, this.f6007a) || !m7997a(eVar.f11714b, this.f6008b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        T t = this.f6007a;
        int i = 0;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.f6008b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f6007a) + " " + String.valueOf(this.f6008b) + "}";
    }
}
