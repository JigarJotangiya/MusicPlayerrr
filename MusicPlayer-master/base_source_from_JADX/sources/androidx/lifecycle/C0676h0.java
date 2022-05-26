package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.C0697n;
import androidx.lifecycle.ReportFragment;

/* renamed from: androidx.lifecycle.h0 */
/* compiled from: ProcessLifecycleOwner */
public class C0676h0 implements C0718v {

    /* renamed from: o */
    private static final C0676h0 f3289o = new C0676h0();

    /* renamed from: g */
    private int f3290g = 0;

    /* renamed from: h */
    private int f3291h = 0;

    /* renamed from: i */
    private boolean f3292i = true;

    /* renamed from: j */
    private boolean f3293j = true;

    /* renamed from: k */
    private Handler f3294k;

    /* renamed from: l */
    private final C0720x f3295l = new C0720x(this);

    /* renamed from: m */
    private Runnable f3296m = new C0677a();

    /* renamed from: n */
    ReportFragment.C0648a f3297n = new C0678b();

    /* renamed from: androidx.lifecycle.h0$a */
    /* compiled from: ProcessLifecycleOwner */
    class C0677a implements Runnable {
        C0677a() {
        }

        public void run() {
            C0676h0.this.mo4222f();
            C0676h0.this.mo4223g();
        }
    }

    /* renamed from: androidx.lifecycle.h0$b */
    /* compiled from: ProcessLifecycleOwner */
    class C0678b implements ReportFragment.C0648a {
        C0678b() {
        }

        /* renamed from: a */
        public void mo4175a() {
            C0676h0.this.mo4219c();
        }

        public void onCreate() {
        }

        public void onResume() {
            C0676h0.this.mo4218b();
        }
    }

    /* renamed from: androidx.lifecycle.h0$c */
    /* compiled from: ProcessLifecycleOwner */
    class C0679c extends C0681i {

        /* renamed from: androidx.lifecycle.h0$c$a */
        /* compiled from: ProcessLifecycleOwner */
        class C0680a extends C0681i {
            C0680a() {
            }

            public void onActivityPostResumed(Activity activity) {
                C0676h0.this.mo4218b();
            }

            public void onActivityPostStarted(Activity activity) {
                C0676h0.this.mo4219c();
            }
        }

        C0679c() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                ReportFragment.m4166f(activity).mo4168h(C0676h0.this.f3297n);
            }
        }

        public void onActivityPaused(Activity activity) {
            C0676h0.this.mo4217a();
        }

        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new C0680a());
        }

        public void onActivityStopped(Activity activity) {
            C0676h0.this.mo4220d();
        }
    }

    private C0676h0() {
    }

    /* renamed from: h */
    public static C0718v m4216h() {
        return f3289o;
    }

    /* renamed from: i */
    static void m4217i(Context context) {
        f3289o.mo4221e(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4217a() {
        int i = this.f3291h - 1;
        this.f3291h = i;
        if (i == 0) {
            this.f3294k.postDelayed(this.f3296m, 700);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4218b() {
        int i = this.f3291h + 1;
        this.f3291h = i;
        if (i != 1) {
            return;
        }
        if (this.f3292i) {
            this.f3295l.mo4268h(C0697n.C0699b.ON_RESUME);
            this.f3292i = false;
            return;
        }
        this.f3294k.removeCallbacks(this.f3296m);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4219c() {
        int i = this.f3290g + 1;
        this.f3290g = i;
        if (i == 1 && this.f3293j) {
            this.f3295l.mo4268h(C0697n.C0699b.ON_START);
            this.f3293j = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4220d() {
        this.f3290g--;
        mo4223g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4221e(Context context) {
        this.f3294k = new Handler();
        this.f3295l.mo4268h(C0697n.C0699b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0679c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4222f() {
        if (this.f3291h == 0) {
            this.f3292i = true;
            this.f3295l.mo4268h(C0697n.C0699b.ON_PAUSE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo4223g() {
        if (this.f3290g == 0 && this.f3292i) {
            this.f3295l.mo4268h(C0697n.C0699b.ON_STOP);
            this.f3293j = true;
        }
    }

    /* renamed from: v */
    public C0697n mo390v() {
        return this.f3295l;
    }
}
