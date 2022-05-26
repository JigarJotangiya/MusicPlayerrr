package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C3147a;

/* renamed from: com.google.android.gms.common.internal.p */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C3300p implements C3147a.C3151d {
    @RecentlyNonNull

    /* renamed from: h */
    public static final C3300p f10646h = m14253a().mo11869a();

    /* renamed from: g */
    private final String f10647g;

    /* renamed from: com.google.android.gms.common.internal.p$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static class C3301a {

        /* renamed from: a */
        private String f10648a;

        /* synthetic */ C3301a(C3316t tVar) {
        }

        @RecentlyNonNull
        /* renamed from: a */
        public C3300p mo11869a() {
            return new C3300p(this.f10648a, (C3316t) null);
        }
    }

    /* synthetic */ C3300p(String str, C3316t tVar) {
        this.f10647g = str;
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static C3301a m14253a() {
        return new C3301a((C3316t) null);
    }

    @RecentlyNonNull
    /* renamed from: b */
    public final Bundle mo11866b() {
        Bundle bundle = new Bundle();
        String str = this.f10647g;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3300p)) {
            return false;
        }
        return C3289k.m14227a(this.f10647g, ((C3300p) obj).f10647g);
    }

    public final int hashCode() {
        return C3289k.m14228b(this.f10647g);
    }
}
