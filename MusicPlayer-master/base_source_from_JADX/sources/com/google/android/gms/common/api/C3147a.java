package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C3147a.C3151d;
import com.google.android.gms.common.api.internal.C3179d;
import com.google.android.gms.common.api.internal.C3191j;
import com.google.android.gms.common.internal.C3261d;
import com.google.android.gms.common.internal.C3269e;
import com.google.android.gms.common.internal.C3279h;
import com.google.android.gms.common.internal.C3292l;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.a */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3147a<O extends C3151d> {

    /* renamed from: a */
    private final C3148a<?, O> f10323a;

    /* renamed from: b */
    private final String f10324b;

    /* renamed from: com.google.android.gms.common.api.a$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static abstract class C3148a<T extends C3156f, O> extends C3155e<T, O> {
        @RecentlyNonNull
        @Deprecated
        /* renamed from: a */
        public T mo11499a(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull C3269e eVar, @RecentlyNonNull O o, @RecentlyNonNull C3164f fVar, @RecentlyNonNull C3165g gVar) {
            return mo11500b(context, looper, eVar, o, fVar, gVar);
        }

        @RecentlyNonNull
        /* renamed from: b */
        public T mo11500b(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull C3269e eVar, @RecentlyNonNull O o, @RecentlyNonNull C3179d dVar, @RecentlyNonNull C3191j jVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$b */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public interface C3149b {
    }

    /* renamed from: com.google.android.gms.common.api.a$c */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static class C3150c<C extends C3149b> {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public interface C3151d {
        @RecentlyNonNull

        /* renamed from: b */
        public static final C3154c f10325b = new C3154c((C3231o) null);

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
        public interface C3152a extends C3151d {
            @RecentlyNonNull
            /* renamed from: x */
            Account mo11501x();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
        public interface C3153b extends C3151d {
            @RecentlyNullable
            /* renamed from: p */
            GoogleSignInAccount mo11502p();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$c */
        /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
        public static final class C3154c implements C3151d {
            private C3154c() {
            }

            /* synthetic */ C3154c(C3231o oVar) {
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$e */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static abstract class C3155e<T extends C3149b, O> {
    }

    /* renamed from: com.google.android.gms.common.api.a$f */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public interface C3156f extends C3149b {
        /* renamed from: a */
        Set<Scope> mo11503a();

        /* renamed from: b */
        void mo11504b(C3279h hVar, Set<Scope> set);

        /* renamed from: c */
        void mo11505c();

        /* renamed from: d */
        void mo11506d(@RecentlyNonNull String str);

        /* renamed from: e */
        boolean mo11507e();

        @RecentlyNonNull
        /* renamed from: f */
        String mo11508f();

        /* renamed from: g */
        void mo11509g(@RecentlyNonNull C3261d.C3264c cVar);

        /* renamed from: h */
        void mo11510h(@RecentlyNonNull C3261d.C3266e eVar);

        /* renamed from: i */
        boolean mo11511i();

        /* renamed from: j */
        boolean mo11512j();

        /* renamed from: l */
        int mo11513l();

        @RecentlyNonNull
        /* renamed from: m */
        Feature[] mo11514m();

        @RecentlyNullable
        /* renamed from: n */
        String mo11515n();

        /* renamed from: p */
        boolean mo11516p();
    }

    /* renamed from: com.google.android.gms.common.api.a$g */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static final class C3157g<C extends C3156f> extends C3150c<C> {
    }

    public <C extends C3156f> C3147a(@RecentlyNonNull String str, @RecentlyNonNull C3148a<C, O> aVar, @RecentlyNonNull C3157g<C> gVar) {
        C3292l.m14241i(aVar, "Cannot construct an Api with a null ClientBuilder");
        C3292l.m14241i(gVar, "Cannot construct an Api with a null ClientKey");
        this.f10324b = str;
        this.f10323a = aVar;
    }

    @RecentlyNonNull
    /* renamed from: a */
    public final C3148a<?, O> mo11497a() {
        return this.f10323a;
    }

    @RecentlyNonNull
    /* renamed from: b */
    public final String mo11498b() {
        return this.f10324b;
    }
}
