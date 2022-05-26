package com.google.android.gms.auth.api.signin.internal;

import androidx.annotation.RecentlyNonNull;

/* renamed from: com.google.android.gms.auth.api.signin.internal.a */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C3142a {

    /* renamed from: b */
    static int f10289b = 31;

    /* renamed from: a */
    private int f10290a = 1;

    @RecentlyNonNull
    /* renamed from: a */
    public C3142a mo11436a(Object obj) {
        this.f10290a = (f10289b * this.f10290a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* renamed from: b */
    public int mo11437b() {
        return this.f10290a;
    }

    @RecentlyNonNull
    /* renamed from: c */
    public final C3142a mo11438c(boolean z) {
        this.f10290a = (f10289b * this.f10290a) + (z ? 1 : 0);
        return this;
    }
}
