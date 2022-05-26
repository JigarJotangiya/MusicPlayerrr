package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.C3167i;
import com.google.android.gms.common.api.C3226j;
import com.google.android.gms.common.api.C3228l;
import com.google.android.gms.common.api.C3229m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3292l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p159f.p243f.p245b.p246a.p293c.p296c.C7444f;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class BasePendingResult<R extends C3228l> extends C3167i<R> {

    /* renamed from: l */
    public static final /* synthetic */ int f10339l = 0;

    /* renamed from: a */
    private final Object f10340a = new Object();
    @RecentlyNonNull

    /* renamed from: b */
    protected final C3169a<R> f10341b = new C3169a<>(Looper.getMainLooper());

    /* renamed from: c */
    private final CountDownLatch f10342c = new CountDownLatch(1);

    /* renamed from: d */
    private final ArrayList<C3167i.C3168a> f10343d = new ArrayList<>();

    /* renamed from: e */
    private C3229m<? super R> f10344e;

    /* renamed from: f */
    private final AtomicReference<C3209r0> f10345f = new AtomicReference<>();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public R f10346g;

    /* renamed from: h */
    private Status f10347h;

    /* renamed from: i */
    private volatile boolean f10348i;

    /* renamed from: j */
    private boolean f10349j;

    /* renamed from: k */
    private boolean f10350k;
    @KeepName
    private C3172a1 mResultGuardian;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public static class C3169a<R extends C3228l> extends C7444f {
        public C3169a(@RecentlyNonNull Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void mo11537a(@RecentlyNonNull C3229m<? super R> mVar, @RecentlyNonNull R r) {
            int i = BasePendingResult.f10339l;
            C3292l.m14240h(mVar);
            sendMessage(obtainMessage(1, new Pair(mVar, r)));
        }

        public final void handleMessage(@RecentlyNonNull Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                C3229m mVar = (C3229m) pair.first;
                C3228l lVar = (C3228l) pair.second;
                try {
                    mVar.mo11670a(lVar);
                } catch (RuntimeException e) {
                    BasePendingResult.m13813g(lVar);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).mo11534b(Status.f10316m);
            }
        }
    }

    static {
        new C3225z0();
    }

    @Deprecated
    BasePendingResult() {
        new WeakReference((Object) null);
    }

    /* renamed from: e */
    private final R m13811e() {
        R r;
        synchronized (this.f10340a) {
            C3292l.m14243k(!this.f10348i, "Result has already been consumed.");
            C3292l.m14243k(mo11535c(), "Result is not ready.");
            r = this.f10346g;
            this.f10346g = null;
            this.f10344e = null;
            this.f10348i = true;
        }
        C3209r0 andSet = this.f10345f.getAndSet((Object) null);
        if (andSet != null) {
            andSet.f10444a.f10447a.remove(this);
        }
        C3292l.m14240h(r);
        return (C3228l) r;
    }

    /* renamed from: f */
    private final void m13812f(R r) {
        this.f10346g = r;
        this.f10347h = r.mo11486Q();
        this.f10342c.countDown();
        if (this.f10349j) {
            this.f10344e = null;
        } else {
            C3229m<? super R> mVar = this.f10344e;
            if (mVar != null) {
                this.f10341b.removeMessages(2);
                this.f10341b.mo11537a(mVar, m13811e());
            } else if (this.f10346g instanceof C3226j) {
                this.mResultGuardian = new C3172a1(this, (C3225z0) null);
            }
        }
        ArrayList<C3167i.C3168a> arrayList = this.f10343d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).mo11532a(this.f10347h);
        }
        this.f10343d.clear();
    }

    /* renamed from: g */
    public static void m13813g(C3228l lVar) {
        if (lVar instanceof C3226j) {
            try {
                ((C3226j) lVar).mo11667a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(lVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract R mo11533a(@RecentlyNonNull Status status);

    @Deprecated
    /* renamed from: b */
    public final void mo11534b(@RecentlyNonNull Status status) {
        synchronized (this.f10340a) {
            if (!mo11535c()) {
                mo11536d(mo11533a(status));
                this.f10350k = true;
            }
        }
    }

    /* renamed from: c */
    public final boolean mo11535c() {
        return this.f10342c.getCount() == 0;
    }

    /* renamed from: d */
    public final void mo11536d(@RecentlyNonNull R r) {
        synchronized (this.f10340a) {
            if (this.f10350k || this.f10349j) {
                m13813g(r);
                return;
            }
            mo11535c();
            C3292l.m14243k(!mo11535c(), "Results have already been set");
            C3292l.m14243k(!this.f10348i, "Result has already been consumed");
            m13812f(r);
        }
    }
}
