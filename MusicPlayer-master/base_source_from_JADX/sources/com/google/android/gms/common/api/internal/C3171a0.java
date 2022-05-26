package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.C3289k;

/* renamed from: com.google.android.gms.common.api.internal.a0 */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C3171a0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3173b<?> f10351a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Feature f10352b;

    /* synthetic */ C3171a0(C3173b bVar, Feature feature, C3214u uVar) {
        this.f10351a = bVar;
        this.f10352b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C3171a0)) {
            C3171a0 a0Var = (C3171a0) obj;
            if (!C3289k.m14227a(this.f10351a, a0Var.f10351a) || !C3289k.m14227a(this.f10352b, a0Var.f10352b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C3289k.m14228b(this.f10351a, this.f10352b);
    }

    public final String toString() {
        C3289k.C3290a c = C3289k.m14229c(this);
        c.mo11856a("key", this.f10351a);
        c.mo11856a("feature", this.f10352b);
        return c.toString();
    }
}
