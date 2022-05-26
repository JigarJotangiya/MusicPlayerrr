package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.C3147a;
import com.google.android.gms.common.api.C3147a.C3151d;
import com.google.android.gms.common.api.internal.C3170a;
import com.google.android.gms.common.api.internal.C3173b;
import com.google.android.gms.common.api.internal.C3181e;
import com.google.android.gms.common.api.internal.C3189i;
import com.google.android.gms.common.api.internal.C3197m;
import com.google.android.gms.common.api.internal.C3199n;
import com.google.android.gms.common.api.internal.C3203o0;
import com.google.android.gms.common.api.internal.C3224z;
import com.google.android.gms.common.internal.C3261d;
import com.google.android.gms.common.internal.C3269e;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.common.util.C3369n;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import p159f.p243f.p245b.p246a.p303f.C7470h;
import p159f.p243f.p245b.p246a.p303f.C7471i;

/* renamed from: com.google.android.gms.common.api.e */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C3161e<O extends C3147a.C3151d> implements C3166h<O> {

    /* renamed from: a */
    private final Context f10326a;

    /* renamed from: b */
    private final String f10327b;

    /* renamed from: c */
    private final C3147a<O> f10328c;

    /* renamed from: d */
    private final O f10329d;

    /* renamed from: e */
    private final C3173b<O> f10330e;

    /* renamed from: f */
    private final int f10331f;

    /* renamed from: g */
    private final C3197m f10332g;
    @RecentlyNonNull

    /* renamed from: h */
    protected final C3181e f10333h;

    /* renamed from: com.google.android.gms.common.api.e$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static class C3162a {
        @RecentlyNonNull

        /* renamed from: c */
        public static final C3162a f10334c = new C3163a().mo11531a();
        @RecentlyNonNull

        /* renamed from: a */
        public final C3197m f10335a;
        @RecentlyNonNull

        /* renamed from: b */
        public final Looper f10336b;

        /* renamed from: com.google.android.gms.common.api.e$a$a */
        /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
        public static class C3163a {

            /* renamed from: a */
            private C3197m f10337a;

            /* renamed from: b */
            private Looper f10338b;

            @RecentlyNonNull
            /* renamed from: a */
            public C3162a mo11531a() {
                if (this.f10337a == null) {
                    this.f10337a = new C3170a();
                }
                if (this.f10338b == null) {
                    this.f10338b = Looper.getMainLooper();
                }
                return new C3162a(this.f10337a, this.f10338b);
            }
        }

        private C3162a(C3197m mVar, Account account, Looper looper) {
            this.f10335a = mVar;
            this.f10336b = looper;
        }
    }

    public C3161e(@RecentlyNonNull Context context, @RecentlyNonNull C3147a<O> aVar, @RecentlyNonNull O o, @RecentlyNonNull C3162a aVar2) {
        C3292l.m14241i(context, "Null context is not permitted.");
        C3292l.m14241i(aVar, "Api must not be null.");
        C3292l.m14241i(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        this.f10326a = applicationContext;
        String l = m13799l(context);
        this.f10327b = l;
        this.f10328c = aVar;
        this.f10329d = o;
        Looper looper = aVar2.f10336b;
        this.f10330e = C3173b.m13831a(aVar, o, l);
        C3181e m = C3181e.m13868m(applicationContext);
        this.f10333h = m;
        this.f10331f = m.mo11578n();
        this.f10332g = aVar2.f10335a;
        m.mo11579o(this);
    }

    /* renamed from: k */
    private final <TResult, A extends C3147a.C3149b> C7470h<TResult> m13798k(int i, C3199n<A, TResult> nVar) {
        C7471i iVar = new C7471i();
        this.f10333h.mo11582r(this, i, nVar, iVar, this.f10332g);
        return iVar.mo28352a();
    }

    /* renamed from: l */
    private static String m13799l(Object obj) {
        if (!C3369n.m14479k()) {
            return null;
        }
        try {
            return (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @RecentlyNonNull
    /* renamed from: c */
    public final C3173b<O> mo11523c() {
        return this.f10330e;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: d */
    public C3269e.C3270a mo11524d() {
        Account account;
        Set<Scope> set;
        GoogleSignInAccount p;
        C3269e.C3270a aVar = new C3269e.C3270a();
        O o = this.f10329d;
        if (!(o instanceof C3147a.C3151d.C3153b) || (p = ((C3147a.C3151d.C3153b) o).mo11502p()) == null) {
            O o2 = this.f10329d;
            account = o2 instanceof C3147a.C3151d.C3152a ? ((C3147a.C3151d.C3152a) o2).mo11501x() : null;
        } else {
            account = p.mo11413x();
        }
        aVar.mo11829c(account);
        O o3 = this.f10329d;
        if (o3 instanceof C3147a.C3151d.C3153b) {
            GoogleSignInAccount p2 = ((C3147a.C3151d.C3153b) o3).mo11502p();
            if (p2 == null) {
                set = Collections.emptySet();
            } else {
                set = p2.mo11403F0();
            }
        } else {
            set = Collections.emptySet();
        }
        aVar.mo11830d(set);
        aVar.mo11831e(this.f10326a.getClass().getName());
        aVar.mo11828b(this.f10326a.getPackageName());
        return aVar;
    }

    @RecentlyNonNull
    /* renamed from: e */
    public <TResult, A extends C3147a.C3149b> C7470h<TResult> mo11525e(@RecentlyNonNull C3199n<A, TResult> nVar) {
        return m13798k(2, nVar);
    }

    @RecentlyNonNull
    /* renamed from: f */
    public <TResult, A extends C3147a.C3149b> C7470h<TResult> mo11526f(@RecentlyNonNull C3199n<A, TResult> nVar) {
        return m13798k(0, nVar);
    }

    /* access modifiers changed from: protected */
    @RecentlyNullable
    /* renamed from: g */
    public String mo11527g() {
        return this.f10327b;
    }

    /* renamed from: h */
    public final C3147a.C3156f mo11528h(Looper looper, C3224z<O> zVar) {
        C3269e a = mo11524d().mo11827a();
        C3147a.C3148a<?, O> a2 = this.f10328c.mo11497a();
        C3292l.m14240h(a2);
        C3147a.C3156f a3 = a2.mo11499a(this.f10326a, looper, a, this.f10329d, zVar, zVar);
        String g = mo11527g();
        if (g != null && (a3 instanceof C3261d)) {
            ((C3261d) a3).mo11784O(g);
        }
        if (g != null && (a3 instanceof C3189i)) {
            ((C3189i) a3).mo11594q(g);
        }
        return a3;
    }

    /* renamed from: i */
    public final int mo11529i() {
        return this.f10331f;
    }

    /* renamed from: j */
    public final C3203o0 mo11530j(Context context, Handler handler) {
        return new C3203o0(context, handler, mo11524d().mo11827a());
    }
}
