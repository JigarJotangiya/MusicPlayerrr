package com.google.android.gms.ads.nativead;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.ads.C3116u;

/* renamed from: com.google.android.gms.ads.nativead.b */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C3102b {

    /* renamed from: a */
    private final boolean f10182a;

    /* renamed from: b */
    private final int f10183b;

    /* renamed from: c */
    private final boolean f10184c;

    /* renamed from: d */
    private final int f10185d;

    /* renamed from: e */
    private final C3116u f10186e;

    /* renamed from: f */
    private final boolean f10187f;

    /* renamed from: com.google.android.gms.ads.nativead.b$a */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public static final class C3103a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f10188a = false;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f10189b = 0;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f10190c = false;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C3116u f10191d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f10192e = 1;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f10193f = false;

        @RecentlyNonNull
        /* renamed from: a */
        public C3102b mo11331a() {
            return new C3102b(this, (C3104c) null);
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C3103a mo11332b(int i) {
            this.f10192e = i;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public C3103a mo11333c(int i) {
            this.f10189b = i;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: d */
        public C3103a mo11334d(boolean z) {
            this.f10193f = z;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: e */
        public C3103a mo11335e(boolean z) {
            this.f10190c = z;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: f */
        public C3103a mo11336f(boolean z) {
            this.f10188a = z;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: g */
        public C3103a mo11337g(@RecentlyNonNull C3116u uVar) {
            this.f10191d = uVar;
            return this;
        }
    }

    /* synthetic */ C3102b(C3103a aVar, C3104c cVar) {
        this.f10182a = aVar.f10188a;
        this.f10183b = aVar.f10189b;
        this.f10184c = aVar.f10190c;
        this.f10185d = aVar.f10192e;
        this.f10186e = aVar.f10191d;
        this.f10187f = aVar.f10193f;
    }

    /* renamed from: a */
    public int mo11325a() {
        return this.f10185d;
    }

    /* renamed from: b */
    public int mo11326b() {
        return this.f10183b;
    }

    @RecentlyNullable
    /* renamed from: c */
    public C3116u mo11327c() {
        return this.f10186e;
    }

    /* renamed from: d */
    public boolean mo11328d() {
        return this.f10184c;
    }

    /* renamed from: e */
    public boolean mo11329e() {
        return this.f10182a;
    }

    /* renamed from: f */
    public final boolean mo11330f() {
        return this.f10187f;
    }
}
