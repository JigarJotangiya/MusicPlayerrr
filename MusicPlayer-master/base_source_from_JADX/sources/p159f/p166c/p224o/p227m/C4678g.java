package p159f.p166c.p224o.p227m;

import android.util.Log;
import androidx.lifecycle.C0670e0;
import androidx.lifecycle.C0672f0;
import androidx.lifecycle.C0718v;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: f.c.o.m.g */
/* compiled from: SingleLiveEvent */
public class C4678g<T> extends C0670e0<T> {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final AtomicBoolean f13461l = new AtomicBoolean(false);

    /* renamed from: f.c.o.m.g$a */
    /* compiled from: SingleLiveEvent */
    class C4679a implements C0672f0<T> {

        /* renamed from: a */
        final /* synthetic */ C0672f0 f13462a;

        C4679a(C0672f0 f0Var) {
            this.f13462a = f0Var;
        }

        public void onChanged(T t) {
            if (C4678g.this.f13461l.compareAndSet(true, false)) {
                this.f13462a.onChanged(t);
            }
        }
    }

    /* renamed from: h */
    public void mo4149h(C0718v vVar, C0672f0<? super T> f0Var) {
        if (mo4148g()) {
            Log.w("SingleLiveEvent", "Multiple observers registered but only one will be notified of changes.");
        }
        super.mo4149h(vVar, new C4679a(f0Var));
    }

    /* renamed from: o */
    public void mo4156o(T t) {
        this.f13461l.set(true);
        super.mo4156o(t);
    }
}
