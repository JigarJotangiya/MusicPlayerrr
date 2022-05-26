package com.google.android.gms.ads.formats;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.ads.C3116u;

@Deprecated
/* renamed from: com.google.android.gms.ads.formats.c */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C2908c {

    /* renamed from: a */
    private final boolean f9778a;

    /* renamed from: b */
    private final int f9779b;

    /* renamed from: c */
    private final int f9780c;

    /* renamed from: d */
    private final boolean f9781d;

    /* renamed from: e */
    private final int f9782e;

    /* renamed from: f */
    private final C3116u f9783f;

    /* renamed from: g */
    private final boolean f9784g;

    /* renamed from: com.google.android.gms.ads.formats.c$a */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public static final class C2909a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f9785a = false;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f9786b = -1;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f9787c = 0;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f9788d = false;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C3116u f9789e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f9790f = 1;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public boolean f9791g = false;

        @RecentlyNonNull
        /* renamed from: a */
        public C2908c mo10764a() {
            return new C2908c(this, (C2917h) null);
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C2909a mo10765b(int i) {
            this.f9790f = i;
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        /* renamed from: c */
        public C2909a mo10766c(int i) {
            this.f9786b = i;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: d */
        public C2909a mo10767d(int i) {
            this.f9787c = i;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: e */
        public C2909a mo10768e(boolean z) {
            this.f9791g = z;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: f */
        public C2909a mo10769f(boolean z) {
            this.f9788d = z;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: g */
        public C2909a mo10770g(boolean z) {
            this.f9785a = z;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: h */
        public C2909a mo10771h(@RecentlyNonNull C3116u uVar) {
            this.f9789e = uVar;
            return this;
        }
    }

    /* synthetic */ C2908c(C2909a aVar, C2917h hVar) {
        this.f9778a = aVar.f9785a;
        this.f9779b = aVar.f9786b;
        this.f9780c = aVar.f9787c;
        this.f9781d = aVar.f9788d;
        this.f9782e = aVar.f9790f;
        this.f9783f = aVar.f9789e;
        this.f9784g = aVar.f9791g;
    }

    /* renamed from: a */
    public int mo10757a() {
        return this.f9782e;
    }

    @Deprecated
    /* renamed from: b */
    public int mo10758b() {
        return this.f9779b;
    }

    /* renamed from: c */
    public int mo10759c() {
        return this.f9780c;
    }

    @RecentlyNullable
    /* renamed from: d */
    public C3116u mo10760d() {
        return this.f9783f;
    }

    /* renamed from: e */
    public boolean mo10761e() {
        return this.f9781d;
    }

    /* renamed from: f */
    public boolean mo10762f() {
        return this.f9778a;
    }

    /* renamed from: g */
    public final boolean mo10763g() {
        return this.f9784g;
    }
}
