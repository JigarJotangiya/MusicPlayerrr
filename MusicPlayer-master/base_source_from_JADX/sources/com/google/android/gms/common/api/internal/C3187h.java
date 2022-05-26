package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.h */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3187h<L> {

    /* renamed from: a */
    private final L f10404a;

    /* renamed from: b */
    private final String f10405b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3187h)) {
            return false;
        }
        C3187h hVar = (C3187h) obj;
        return this.f10404a == hVar.f10404a && this.f10405b.equals(hVar.f10405b);
    }

    public int hashCode() {
        return (System.identityHashCode(this.f10404a) * 31) + this.f10405b.hashCode();
    }
}
