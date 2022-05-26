package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;
import p159f.p243f.p245b.p246a.p303f.C7470h;
import p159f.p243f.p245b.p246a.p303f.C7471i;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dy2 {

    /* renamed from: e */
    private static volatile int f15777e = 1;

    /* renamed from: f */
    public static final /* synthetic */ int f15778f = 0;

    /* renamed from: a */
    private final Context f15779a;

    /* renamed from: b */
    private final Executor f15780b;

    /* renamed from: c */
    private final C7470h<c03> f15781c;

    /* renamed from: d */
    private final boolean f15782d;

    dy2(Context context, Executor executor, C7470h<c03> hVar, boolean z) {
        this.f15779a = context;
        this.f15780b = executor;
        this.f15781c = hVar;
        this.f15782d = z;
    }

    /* renamed from: a */
    public static dy2 m22747a(Context context, Executor executor, boolean z) {
        C7471i iVar = new C7471i();
        if (z) {
            executor.execute(new by2(context, iVar));
        } else {
            executor.execute(new cy2(iVar));
        }
        return new dy2(context, executor, iVar.mo28352a(), z);
    }

    /* renamed from: g */
    static void m22748g(int i) {
        f15777e = i;
    }

    /* renamed from: h */
    private final C7470h<Boolean> m22749h(int i, long j, Exception exc, String str, Map<String, String> map, String str2) {
        if (!this.f15782d) {
            return this.f15781c.mo28336f(this.f15780b, ay2.f14218a);
        }
        C5364n7 D = C5512r7.m29884D();
        D.mo19619r(this.f15779a.getPackageName());
        D.mo19623v(j);
        D.mo19625y(f15777e);
        if (exc != null) {
            D.mo19624w(f23.m23431a(exc));
            D.mo19622u(exc.getClass().getName());
        }
        if (str2 != null) {
            D.mo19620s(str2);
        }
        if (str != null) {
            D.mo19621t(str);
        }
        return this.f15781c.mo28336f(this.f15780b, new zx2(D, i));
    }

    /* renamed from: b */
    public final C7470h<Boolean> mo17047b(int i, String str) {
        return m22749h(i, 0, (Exception) null, (String) null, (Map<String, String>) null, str);
    }

    /* renamed from: c */
    public final C7470h<Boolean> mo17048c(int i, long j, Exception exc) {
        return m22749h(i, j, exc, (String) null, (Map<String, String>) null, (String) null);
    }

    /* renamed from: d */
    public final C7470h<Boolean> mo17049d(int i, long j) {
        return m22749h(i, j, (Exception) null, (String) null, (Map<String, String>) null, (String) null);
    }

    /* renamed from: e */
    public final C7470h<Boolean> mo17050e(int i, long j, String str) {
        return m22749h(i, j, (Exception) null, (String) null, (Map<String, String>) null, str);
    }

    /* renamed from: f */
    public final C7470h<Boolean> mo17051f(int i, long j, String str, Map<String, String> map) {
        return m22749h(i, j, (Exception) null, str, (Map<String, String>) null, (String) null);
    }
}
