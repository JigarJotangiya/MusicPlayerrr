package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.C3147a;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p082e.p098e.C3467b;
import p159f.p243f.p245b.p246a.p302e.C7453a;

/* renamed from: com.google.android.gms.common.internal.e */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3269e {

    /* renamed from: a */
    private final Account f10608a;

    /* renamed from: b */
    private final Set<Scope> f10609b;

    /* renamed from: c */
    private final Set<Scope> f10610c;

    /* renamed from: d */
    private final Map<C3147a<?>, C3318u> f10611d;

    /* renamed from: e */
    private final View f10612e;

    /* renamed from: f */
    private final String f10613f;

    /* renamed from: g */
    private final String f10614g;

    /* renamed from: h */
    private final C7453a f10615h;

    /* renamed from: i */
    private Integer f10616i;

    /* renamed from: com.google.android.gms.common.internal.e$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static final class C3270a {

        /* renamed from: a */
        private Account f10617a;

        /* renamed from: b */
        private C3467b<Scope> f10618b;

        /* renamed from: c */
        private String f10619c;

        /* renamed from: d */
        private String f10620d;

        /* renamed from: e */
        private C7453a f10621e = C7453a.f32621p;

        @RecentlyNonNull
        /* renamed from: a */
        public C3269e mo11827a() {
            return new C3269e(this.f10617a, this.f10618b, (Map<C3147a<?>, C3318u>) null, 0, (View) null, this.f10619c, this.f10620d, this.f10621e, false);
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C3270a mo11828b(@RecentlyNonNull String str) {
            this.f10619c = str;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public final C3270a mo11829c(Account account) {
            this.f10617a = account;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: d */
        public final C3270a mo11830d(@RecentlyNonNull Collection<Scope> collection) {
            if (this.f10618b == null) {
                this.f10618b = new C3467b<>();
            }
            this.f10618b.addAll(collection);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: e */
        public final C3270a mo11831e(@RecentlyNonNull String str) {
            this.f10620d = str;
            return this;
        }
    }

    public C3269e(Account account, @RecentlyNonNull Set<Scope> set, @RecentlyNonNull Map<C3147a<?>, C3318u> map, int i, View view, @RecentlyNonNull String str, @RecentlyNonNull String str2, C7453a aVar, boolean z) {
        this.f10608a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f10609b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f10611d = map;
        this.f10612e = view;
        this.f10613f = str;
        this.f10614g = str2;
        this.f10615h = aVar == null ? C7453a.f32621p : aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (C3318u uVar : map.values()) {
            hashSet.addAll(uVar.f10665a);
        }
        this.f10610c = Collections.unmodifiableSet(hashSet);
    }

    @RecentlyNullable
    /* renamed from: a */
    public Account mo11818a() {
        return this.f10608a;
    }

    @RecentlyNonNull
    /* renamed from: b */
    public Account mo11819b() {
        Account account = this.f10608a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    @RecentlyNonNull
    /* renamed from: c */
    public Set<Scope> mo11820c() {
        return this.f10610c;
    }

    @RecentlyNonNull
    /* renamed from: d */
    public String mo11821d() {
        return this.f10613f;
    }

    @RecentlyNonNull
    /* renamed from: e */
    public Set<Scope> mo11822e() {
        return this.f10609b;
    }

    @RecentlyNullable
    /* renamed from: f */
    public final String mo11823f() {
        return this.f10614g;
    }

    @RecentlyNonNull
    /* renamed from: g */
    public final C7453a mo11824g() {
        return this.f10615h;
    }

    @RecentlyNullable
    /* renamed from: h */
    public final Integer mo11825h() {
        return this.f10616i;
    }

    /* renamed from: i */
    public final void mo11826i(@RecentlyNonNull Integer num) {
        this.f10616i = num;
    }
}
