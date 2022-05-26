package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.C0697n;
import androidx.lifecycle.C0715s;
import androidx.lifecycle.C0718v;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f224a;

    /* renamed from: b */
    final ArrayDeque<C0084b> f225b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements C0715s, C0083a {

        /* renamed from: g */
        private final C0697n f226g;

        /* renamed from: h */
        private final C0084b f227h;

        /* renamed from: i */
        private C0083a f228i;

        LifecycleOnBackPressedCancellable(C0697n nVar, C0084b bVar) {
            this.f226g = nVar;
            this.f227h = bVar;
            nVar.mo4256a(this);
        }

        /* renamed from: c */
        public void mo393c(C0718v vVar, C0697n.C0699b bVar) {
            if (bVar == C0697n.C0699b.ON_START) {
                this.f228i = OnBackPressedDispatcher.this.mo396b(this.f227h);
            } else if (bVar == C0697n.C0699b.ON_STOP) {
                C0083a aVar = this.f228i;
                if (aVar != null) {
                    aVar.cancel();
                }
            } else if (bVar == C0697n.C0699b.ON_DESTROY) {
                cancel();
            }
        }

        public void cancel() {
            this.f226g.mo4258c(this);
            this.f227h.mo403e(this);
            C0083a aVar = this.f228i;
            if (aVar != null) {
                aVar.cancel();
                this.f228i = null;
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    private class C0082a implements C0083a {

        /* renamed from: g */
        private final C0084b f230g;

        C0082a(C0084b bVar) {
            this.f230g = bVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f225b.remove(this.f230g);
            this.f230g.mo403e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f224a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public void mo395a(C0718v vVar, C0084b bVar) {
        C0697n v = vVar.mo390v();
        if (v.mo4257b() != C0697n.C0700c.DESTROYED) {
            bVar.mo399a(new LifecycleOnBackPressedCancellable(v, bVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0083a mo396b(C0084b bVar) {
        this.f225b.add(bVar);
        C0082a aVar = new C0082a(bVar);
        bVar.mo399a(aVar);
        return aVar;
    }

    /* renamed from: c */
    public void mo397c() {
        Iterator<C0084b> descendingIterator = this.f225b.descendingIterator();
        while (descendingIterator.hasNext()) {
            C0084b next = descendingIterator.next();
            if (next.mo401c()) {
                next.mo400b();
                return;
            }
        }
        Runnable runnable = this.f224a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
