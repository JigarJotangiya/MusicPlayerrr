package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C0602j;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.fragment.app.i */
/* compiled from: FragmentLifecycleCallbacksDispatcher */
class C0600i {

    /* renamed from: a */
    private final CopyOnWriteArrayList<C0601a> f3066a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    private final C0602j f3067b;

    /* renamed from: androidx.fragment.app.i$a */
    /* compiled from: FragmentLifecycleCallbacksDispatcher */
    private static final class C0601a {

        /* renamed from: a */
        final C0602j.C0608f f3068a;

        /* renamed from: b */
        final boolean f3069b;

        C0601a(C0602j.C0608f fVar, boolean z) {
            this.f3068a = fVar;
            this.f3069b = z;
        }
    }

    C0600i(C0602j jVar) {
        this.f3067b = jVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3887a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment k0 = this.f3067b.mo3961k0();
        if (k0 != null) {
            k0.mo3693q0().mo3959j0().mo3887a(fragment, bundle, true);
        }
        Iterator<C0601a> it = this.f3066a.iterator();
        while (it.hasNext()) {
            C0601a next = it.next();
            if (!z || next.f3069b) {
                next.f3068a.mo3988a(this.f3067b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3888b(Fragment fragment, Context context, boolean z) {
        Fragment k0 = this.f3067b.mo3961k0();
        if (k0 != null) {
            k0.mo3693q0().mo3959j0().mo3888b(fragment, context, true);
        }
        Iterator<C0601a> it = this.f3066a.iterator();
        while (it.hasNext()) {
            C0601a next = it.next();
            if (!z || next.f3069b) {
                next.f3068a.mo3989b(this.f3067b, fragment, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3889c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment k0 = this.f3067b.mo3961k0();
        if (k0 != null) {
            k0.mo3693q0().mo3959j0().mo3889c(fragment, bundle, true);
        }
        Iterator<C0601a> it = this.f3066a.iterator();
        while (it.hasNext()) {
            C0601a next = it.next();
            if (!z || next.f3069b) {
                next.f3068a.mo3990c(this.f3067b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3890d(Fragment fragment, boolean z) {
        Fragment k0 = this.f3067b.mo3961k0();
        if (k0 != null) {
            k0.mo3693q0().mo3959j0().mo3890d(fragment, true);
        }
        Iterator<C0601a> it = this.f3066a.iterator();
        while (it.hasNext()) {
            C0601a next = it.next();
            if (!z || next.f3069b) {
                next.f3068a.mo3991d(this.f3067b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3891e(Fragment fragment, boolean z) {
        Fragment k0 = this.f3067b.mo3961k0();
        if (k0 != null) {
            k0.mo3693q0().mo3959j0().mo3891e(fragment, true);
        }
        Iterator<C0601a> it = this.f3066a.iterator();
        while (it.hasNext()) {
            C0601a next = it.next();
            if (!z || next.f3069b) {
                next.f3068a.mo3992e(this.f3067b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3892f(Fragment fragment, boolean z) {
        Fragment k0 = this.f3067b.mo3961k0();
        if (k0 != null) {
            k0.mo3693q0().mo3959j0().mo3892f(fragment, true);
        }
        Iterator<C0601a> it = this.f3066a.iterator();
        while (it.hasNext()) {
            C0601a next = it.next();
            if (!z || next.f3069b) {
                next.f3068a.mo3993f(this.f3067b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3893g(Fragment fragment, Context context, boolean z) {
        Fragment k0 = this.f3067b.mo3961k0();
        if (k0 != null) {
            k0.mo3693q0().mo3959j0().mo3893g(fragment, context, true);
        }
        Iterator<C0601a> it = this.f3066a.iterator();
        while (it.hasNext()) {
            C0601a next = it.next();
            if (!z || next.f3069b) {
                next.f3068a.mo3994g(this.f3067b, fragment, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3894h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment k0 = this.f3067b.mo3961k0();
        if (k0 != null) {
            k0.mo3693q0().mo3959j0().mo3894h(fragment, bundle, true);
        }
        Iterator<C0601a> it = this.f3066a.iterator();
        while (it.hasNext()) {
            C0601a next = it.next();
            if (!z || next.f3069b) {
                next.f3068a.mo3995h(this.f3067b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3895i(Fragment fragment, boolean z) {
        Fragment k0 = this.f3067b.mo3961k0();
        if (k0 != null) {
            k0.mo3693q0().mo3959j0().mo3895i(fragment, true);
        }
        Iterator<C0601a> it = this.f3066a.iterator();
        while (it.hasNext()) {
            C0601a next = it.next();
            if (!z || next.f3069b) {
                next.f3068a.mo3996i(this.f3067b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3896j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment k0 = this.f3067b.mo3961k0();
        if (k0 != null) {
            k0.mo3693q0().mo3959j0().mo3896j(fragment, bundle, true);
        }
        Iterator<C0601a> it = this.f3066a.iterator();
        while (it.hasNext()) {
            C0601a next = it.next();
            if (!z || next.f3069b) {
                next.f3068a.mo3997j(this.f3067b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo3897k(Fragment fragment, boolean z) {
        Fragment k0 = this.f3067b.mo3961k0();
        if (k0 != null) {
            k0.mo3693q0().mo3959j0().mo3897k(fragment, true);
        }
        Iterator<C0601a> it = this.f3066a.iterator();
        while (it.hasNext()) {
            C0601a next = it.next();
            if (!z || next.f3069b) {
                next.f3068a.mo3998k(this.f3067b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo3898l(Fragment fragment, boolean z) {
        Fragment k0 = this.f3067b.mo3961k0();
        if (k0 != null) {
            k0.mo3693q0().mo3959j0().mo3898l(fragment, true);
        }
        Iterator<C0601a> it = this.f3066a.iterator();
        while (it.hasNext()) {
            C0601a next = it.next();
            if (!z || next.f3069b) {
                next.f3068a.mo3999l(this.f3067b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo3899m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment k0 = this.f3067b.mo3961k0();
        if (k0 != null) {
            k0.mo3693q0().mo3959j0().mo3899m(fragment, view, bundle, true);
        }
        Iterator<C0601a> it = this.f3066a.iterator();
        while (it.hasNext()) {
            C0601a next = it.next();
            if (!z || next.f3069b) {
                next.f3068a.mo4000m(this.f3067b, fragment, view, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo3900n(Fragment fragment, boolean z) {
        Fragment k0 = this.f3067b.mo3961k0();
        if (k0 != null) {
            k0.mo3693q0().mo3959j0().mo3900n(fragment, true);
        }
        Iterator<C0601a> it = this.f3066a.iterator();
        while (it.hasNext()) {
            C0601a next = it.next();
            if (!z || next.f3069b) {
                next.f3068a.mo4001n(this.f3067b, fragment);
            }
        }
    }

    /* renamed from: o */
    public void mo3901o(C0602j.C0608f fVar, boolean z) {
        this.f3066a.add(new C0601a(fVar, z));
    }

    /* renamed from: p */
    public void mo3902p(C0602j.C0608f fVar) {
        synchronized (this.f3066a) {
            int i = 0;
            int size = this.f3066a.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (this.f3066a.get(i).f3068a == fVar) {
                    this.f3066a.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }
}
