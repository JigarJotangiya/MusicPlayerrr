package com.google.android.gms.ads;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.zzbkq;

/* renamed from: com.google.android.gms.ads.u */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C3116u {

    /* renamed from: a */
    private final boolean f10211a;

    /* renamed from: b */
    private final boolean f10212b;

    /* renamed from: c */
    private final boolean f10213c;

    /* renamed from: com.google.android.gms.ads.u$a */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public static final class C3117a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f10214a = true;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f10215b = false;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f10216c = false;

        @RecentlyNonNull
        /* renamed from: a */
        public C3116u mo11371a() {
            return new C3116u(this, (C2922g0) null);
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C3117a mo11372b(boolean z) {
            this.f10214a = z;
            return this;
        }
    }

    /* synthetic */ C3116u(C3117a aVar, C2922g0 g0Var) {
        this.f10211a = aVar.f10214a;
        this.f10212b = aVar.f10215b;
        this.f10213c = aVar.f10216c;
    }

    public C3116u(zzbkq zzbkq) {
        this.f10211a = zzbkq.f27245g;
        this.f10212b = zzbkq.f27246h;
        this.f10213c = zzbkq.f27247i;
    }

    /* renamed from: a */
    public boolean mo11368a() {
        return this.f10213c;
    }

    /* renamed from: b */
    public boolean mo11369b() {
        return this.f10212b;
    }

    /* renamed from: c */
    public boolean mo11370c() {
        return this.f10211a;
    }
}
