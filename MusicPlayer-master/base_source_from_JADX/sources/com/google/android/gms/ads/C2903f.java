package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.search.C3113a;
import com.google.android.gms.internal.ads.C5649ux;
import com.google.android.gms.internal.ads.C5686vx;
import java.util.Date;

/* renamed from: com.google.android.gms.ads.f */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class C2903f {

    /* renamed from: a */
    protected final C5686vx f9771a;

    /* renamed from: com.google.android.gms.ads.f$a */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public static class C2904a {

        /* renamed from: a */
        protected final C5649ux f9772a;

        public C2904a() {
            C5649ux uxVar = new C5649ux();
            this.f9772a = uxVar;
            uxVar.mo21393z("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        @RecentlyNonNull
        /* renamed from: a */
        public C2904a mo10734a(@RecentlyNonNull String str) {
            this.f9772a.mo21391x(str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C2904a mo10735b(@RecentlyNonNull Class<? extends Object> cls, @RecentlyNonNull Bundle bundle) {
            this.f9772a.mo21392y(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.f9772a.mo21385A("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public C2903f mo10736c() {
            return new C2903f(this);
        }

        @RecentlyNonNull
        /* renamed from: d */
        public C2904a mo10737d(@RecentlyNonNull Location location) {
            this.f9772a.mo21389d(location);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        /* renamed from: e */
        public final C2904a mo10738e(@RecentlyNonNull String str) {
            this.f9772a.mo21393z(str);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        /* renamed from: f */
        public final C2904a mo10739f(@RecentlyNonNull Date date) {
            this.f9772a.mo21386a(date);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        /* renamed from: g */
        public final C2904a mo10740g(int i) {
            this.f9772a.mo21387b(i);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        /* renamed from: h */
        public final C2904a mo10741h(boolean z) {
            this.f9772a.mo21388c(z);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        /* renamed from: i */
        public final C2904a mo10742i(boolean z) {
            this.f9772a.mo21390e(z);
            return this;
        }
    }

    protected C2903f(@RecentlyNonNull C2904a aVar) {
        this.f9771a = new C5686vx(aVar.f9772a, (C3113a) null);
    }

    /* renamed from: a */
    public C5686vx mo10733a() {
        return this.f9771a;
    }
}
