package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C3147a;
import com.google.android.gms.common.api.C3147a.C3151d;
import com.google.android.gms.common.internal.C3289k;

/* renamed from: com.google.android.gms.common.api.internal.b */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3173b<O extends C3147a.C3151d> {

    /* renamed from: a */
    private final int f10354a;

    /* renamed from: b */
    private final C3147a<O> f10355b;

    /* renamed from: c */
    private final O f10356c;

    /* renamed from: d */
    private final String f10357d;

    private C3173b(C3147a<O> aVar, O o, String str) {
        this.f10355b = aVar;
        this.f10356c = o;
        this.f10357d = str;
        this.f10354a = C3289k.m14228b(aVar, o, str);
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static <O extends C3147a.C3151d> C3173b<O> m13831a(@RecentlyNonNull C3147a<O> aVar, O o, String str) {
        return new C3173b<>(aVar, o, str);
    }

    @RecentlyNonNull
    /* renamed from: b */
    public final String mo11552b() {
        return this.f10355b.mo11498b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3173b)) {
            return false;
        }
        C3173b bVar = (C3173b) obj;
        return C3289k.m14227a(this.f10355b, bVar.f10355b) && C3289k.m14227a(this.f10356c, bVar.f10356c) && C3289k.m14227a(this.f10357d, bVar.f10357d);
    }

    public final int hashCode() {
        return this.f10354a;
    }
}
