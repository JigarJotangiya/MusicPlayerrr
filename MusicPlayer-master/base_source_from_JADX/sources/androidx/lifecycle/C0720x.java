package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.C0697n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p082e.p091b.p092a.p093a.C3445a;
import p082e.p091b.p092a.p094b.C3450a;
import p082e.p091b.p092a.p094b.C3451b;

/* renamed from: androidx.lifecycle.x */
/* compiled from: LifecycleRegistry */
public class C0720x extends C0697n {

    /* renamed from: b */
    private C3450a<C0717u, C0721a> f3336b;

    /* renamed from: c */
    private C0697n.C0700c f3337c;

    /* renamed from: d */
    private final WeakReference<C0718v> f3338d;

    /* renamed from: e */
    private int f3339e;

    /* renamed from: f */
    private boolean f3340f;

    /* renamed from: g */
    private boolean f3341g;

    /* renamed from: h */
    private ArrayList<C0697n.C0700c> f3342h;

    /* renamed from: i */
    private final boolean f3343i;

    /* renamed from: androidx.lifecycle.x$a */
    /* compiled from: LifecycleRegistry */
    static class C0721a {

        /* renamed from: a */
        C0697n.C0700c f3344a;

        /* renamed from: b */
        C0715s f3345b;

        C0721a(C0717u uVar, C0697n.C0700c cVar) {
            this.f3345b = C0723z.m4306f(uVar);
            this.f3344a = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4271a(C0718v vVar, C0697n.C0699b bVar) {
            C0697n.C0700c targetState = bVar.getTargetState();
            this.f3344a = C0720x.m4288k(this.f3344a, targetState);
            this.f3345b.mo393c(vVar, bVar);
            this.f3344a = targetState;
        }
    }

    public C0720x(C0718v vVar) {
        this(vVar, true);
    }

    /* renamed from: d */
    private void m4283d(C0718v vVar) {
        Iterator<Map.Entry<C0717u, C0721a>> descendingIterator = this.f3336b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f3341g) {
            Map.Entry next = descendingIterator.next();
            C0721a aVar = (C0721a) next.getValue();
            while (aVar.f3344a.compareTo(this.f3337c) > 0 && !this.f3341g && this.f3336b.contains(next.getKey())) {
                C0697n.C0699b downFrom = C0697n.C0699b.downFrom(aVar.f3344a);
                if (downFrom != null) {
                    m4291n(downFrom.getTargetState());
                    aVar.mo4271a(vVar, downFrom);
                    m4290m();
                } else {
                    throw new IllegalStateException("no event down from " + aVar.f3344a);
                }
            }
        }
    }

    /* renamed from: e */
    private C0697n.C0700c m4284e(C0717u uVar) {
        Map.Entry<C0717u, C0721a> y = this.f3336b.mo12238y(uVar);
        C0697n.C0700c cVar = null;
        C0697n.C0700c cVar2 = y != null ? y.getValue().f3344a : null;
        if (!this.f3342h.isEmpty()) {
            ArrayList<C0697n.C0700c> arrayList = this.f3342h;
            cVar = arrayList.get(arrayList.size() - 1);
        }
        return m4288k(m4288k(this.f3337c, cVar2), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: f */
    private void m4285f(String str) {
        if (this.f3343i && !C3445a.m14718f().mo12229c()) {
            throw new IllegalStateException("Method " + str + " must be called on the main thread");
        }
    }

    /* renamed from: g */
    private void m4286g(C0718v vVar) {
        C3451b<K, V>.d s = this.f3336b.mo12244s();
        while (s.hasNext() && !this.f3341g) {
            Map.Entry entry = (Map.Entry) s.next();
            C0721a aVar = (C0721a) entry.getValue();
            while (aVar.f3344a.compareTo(this.f3337c) < 0 && !this.f3341g && this.f3336b.contains(entry.getKey())) {
                m4291n(aVar.f3344a);
                C0697n.C0699b upFrom = C0697n.C0699b.upFrom(aVar.f3344a);
                if (upFrom != null) {
                    aVar.mo4271a(vVar, upFrom);
                    m4290m();
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f3344a);
                }
            }
        }
    }

    /* renamed from: i */
    private boolean m4287i() {
        if (this.f3336b.size() == 0) {
            return true;
        }
        C0697n.C0700c cVar = this.f3336b.mo12239d().getValue().f3344a;
        C0697n.C0700c cVar2 = this.f3336b.mo12246t().getValue().f3344a;
        if (cVar == cVar2 && this.f3337c == cVar2) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    static C0697n.C0700c m4288k(C0697n.C0700c cVar, C0697n.C0700c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    /* renamed from: l */
    private void m4289l(C0697n.C0700c cVar) {
        if (this.f3337c != cVar) {
            this.f3337c = cVar;
            if (this.f3340f || this.f3339e != 0) {
                this.f3341g = true;
                return;
            }
            this.f3340f = true;
            m4292p();
            this.f3340f = false;
        }
    }

    /* renamed from: m */
    private void m4290m() {
        ArrayList<C0697n.C0700c> arrayList = this.f3342h;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: n */
    private void m4291n(C0697n.C0700c cVar) {
        this.f3342h.add(cVar);
    }

    /* renamed from: p */
    private void m4292p() {
        C0718v vVar = (C0718v) this.f3338d.get();
        if (vVar != null) {
            while (!m4287i()) {
                this.f3341g = false;
                if (this.f3337c.compareTo(this.f3336b.mo12239d().getValue().f3344a) < 0) {
                    m4283d(vVar);
                }
                Map.Entry<C0717u, C0721a> t = this.f3336b.mo12246t();
                if (!this.f3341g && t != null && this.f3337c.compareTo(t.getValue().f3344a) > 0) {
                    m4286g(vVar);
                }
            }
            this.f3341g = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    /* renamed from: a */
    public void mo4256a(C0717u uVar) {
        C0718v vVar;
        m4285f("addObserver");
        C0697n.C0700c cVar = this.f3337c;
        C0697n.C0700c cVar2 = C0697n.C0700c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = C0697n.C0700c.INITIALIZED;
        }
        C0721a aVar = new C0721a(uVar, cVar2);
        if (this.f3336b.mo12236v(uVar, aVar) == null && (vVar = (C0718v) this.f3338d.get()) != null) {
            boolean z = this.f3339e != 0 || this.f3340f;
            C0697n.C0700c e = m4284e(uVar);
            this.f3339e++;
            while (aVar.f3344a.compareTo(e) < 0 && this.f3336b.contains(uVar)) {
                m4291n(aVar.f3344a);
                C0697n.C0699b upFrom = C0697n.C0699b.upFrom(aVar.f3344a);
                if (upFrom != null) {
                    aVar.mo4271a(vVar, upFrom);
                    m4290m();
                    e = m4284e(uVar);
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f3344a);
                }
            }
            if (!z) {
                m4292p();
            }
            this.f3339e--;
        }
    }

    /* renamed from: b */
    public C0697n.C0700c mo4257b() {
        return this.f3337c;
    }

    /* renamed from: c */
    public void mo4258c(C0717u uVar) {
        m4285f("removeObserver");
        this.f3336b.mo12237x(uVar);
    }

    /* renamed from: h */
    public void mo4268h(C0697n.C0699b bVar) {
        m4285f("handleLifecycleEvent");
        m4289l(bVar.getTargetState());
    }

    @Deprecated
    /* renamed from: j */
    public void mo4269j(C0697n.C0700c cVar) {
        m4285f("markState");
        mo4270o(cVar);
    }

    /* renamed from: o */
    public void mo4270o(C0697n.C0700c cVar) {
        m4285f("setCurrentState");
        m4289l(cVar);
    }

    private C0720x(C0718v vVar, boolean z) {
        this.f3336b = new C3450a<>();
        this.f3339e = 0;
        this.f3340f = false;
        this.f3341g = false;
        this.f3342h = new ArrayList<>();
        this.f3338d = new WeakReference<>(vVar);
        this.f3337c = C0697n.C0700c.INITIALIZED;
        this.f3343i = z;
    }
}
