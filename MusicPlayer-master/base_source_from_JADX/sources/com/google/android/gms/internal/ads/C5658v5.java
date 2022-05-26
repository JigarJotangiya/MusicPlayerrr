package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.v5 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5658v5 {

    /* renamed from: a */
    private final AtomicInteger f24584a = new AtomicInteger();

    /* renamed from: b */
    private final Set<C5547s5<?>> f24585b = new HashSet();

    /* renamed from: c */
    private final PriorityBlockingQueue<C5547s5<?>> f24586c = new PriorityBlockingQueue<>();

    /* renamed from: d */
    private final PriorityBlockingQueue<C5547s5<?>> f24587d = new PriorityBlockingQueue<>();

    /* renamed from: e */
    private final C4954c5 f24588e;

    /* renamed from: f */
    private final C5288l5 f24589f;

    /* renamed from: g */
    private final C5325m5[] f24590g;

    /* renamed from: h */
    private C5028e5 f24591h;

    /* renamed from: i */
    private final List<C5621u5> f24592i = new ArrayList();

    /* renamed from: j */
    private final List<C5584t5> f24593j = new ArrayList();

    /* renamed from: k */
    private final C5214j5 f24594k;

    public C5658v5(C4954c5 c5Var, C5288l5 l5Var, int i) {
        C5214j5 j5Var = new C5214j5(new Handler(Looper.getMainLooper()));
        this.f24588e = c5Var;
        this.f24589f = l5Var;
        this.f24590g = new C5325m5[4];
        this.f24594k = j5Var;
    }

    /* renamed from: a */
    public final <T> C5547s5<T> mo21427a(C5547s5<T> s5Var) {
        s5Var.mo20782k(this);
        synchronized (this.f24585b) {
            this.f24585b.add(s5Var);
        }
        s5Var.mo20783l(this.f24584a.incrementAndGet());
        s5Var.mo20786t("add-to-queue");
        mo21429c(s5Var, 0);
        this.f24586c.add(s5Var);
        return s5Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final <T> void mo21428b(C5547s5<T> s5Var) {
        synchronized (this.f24585b) {
            this.f24585b.remove(s5Var);
        }
        synchronized (this.f24592i) {
            for (C5621u5 zza : this.f24592i) {
                zza.zza();
            }
        }
        mo21429c(s5Var, 5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo21429c(C5547s5<?> s5Var, int i) {
        synchronized (this.f24593j) {
            for (C5584t5 zza : this.f24593j) {
                zza.zza();
            }
        }
    }

    /* renamed from: d */
    public final void mo21430d() {
        C5028e5 e5Var = this.f24591h;
        if (e5Var != null) {
            e5Var.mo17118b();
        }
        C5325m5[] m5VarArr = this.f24590g;
        for (int i = 0; i < 4; i++) {
            C5325m5 m5Var = m5VarArr[i];
            if (m5Var != null) {
                m5Var.mo19339a();
            }
        }
        C5028e5 e5Var2 = new C5028e5(this.f24586c, this.f24587d, this.f24588e, this.f24594k, (C5214j5) null);
        this.f24591h = e5Var2;
        e5Var2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            C5325m5 m5Var2 = new C5325m5(this.f24587d, this.f24589f, this.f24588e, this.f24594k, (C5214j5) null);
            this.f24590g[i2] = m5Var2;
            m5Var2.start();
        }
    }
}
