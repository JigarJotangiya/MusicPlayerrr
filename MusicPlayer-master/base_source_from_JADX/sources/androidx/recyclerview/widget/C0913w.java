package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
import p082e.p109h.p119p.C3704a;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.p120e0.C3736c;
import p082e.p109h.p119p.p120e0.C3741d;

/* renamed from: androidx.recyclerview.widget.w */
/* compiled from: RecyclerViewAccessibilityDelegate */
public class C0913w extends C3704a {

    /* renamed from: d */
    final RecyclerView f4058d;

    /* renamed from: e */
    private final C0914a f4059e;

    /* renamed from: androidx.recyclerview.widget.w$a */
    /* compiled from: RecyclerViewAccessibilityDelegate */
    public static class C0914a extends C3704a {

        /* renamed from: d */
        final C0913w f4060d;

        /* renamed from: e */
        private Map<View, C3704a> f4061e = new WeakHashMap();

        public C0914a(C0913w wVar) {
            this.f4060d = wVar;
        }

        /* renamed from: a */
        public boolean mo3553a(View view, AccessibilityEvent accessibilityEvent) {
            C3704a aVar = this.f4061e.get(view);
            if (aVar != null) {
                return aVar.mo3553a(view, accessibilityEvent);
            }
            return super.mo3553a(view, accessibilityEvent);
        }

        /* renamed from: b */
        public C3741d mo5406b(View view) {
            C3704a aVar = this.f4061e.get(view);
            if (aVar != null) {
                return aVar.mo5406b(view);
            }
            return super.mo5406b(view);
        }

        /* renamed from: f */
        public void mo3426f(View view, AccessibilityEvent accessibilityEvent) {
            C3704a aVar = this.f4061e.get(view);
            if (aVar != null) {
                aVar.mo3426f(view, accessibilityEvent);
            } else {
                super.mo3426f(view, accessibilityEvent);
            }
        }

        /* renamed from: g */
        public void mo3427g(View view, C3736c cVar) {
            if (this.f4060d.mo5405o() || this.f4060d.f4058d.getLayoutManager() == null) {
                super.mo3427g(view, cVar);
                return;
            }
            this.f4060d.f4058d.getLayoutManager().mo4909P0(view, cVar);
            C3704a aVar = this.f4061e.get(view);
            if (aVar != null) {
                aVar.mo3427g(view, cVar);
            } else {
                super.mo3427g(view, cVar);
            }
        }

        /* renamed from: h */
        public void mo5407h(View view, AccessibilityEvent accessibilityEvent) {
            C3704a aVar = this.f4061e.get(view);
            if (aVar != null) {
                aVar.mo5407h(view, accessibilityEvent);
            } else {
                super.mo5407h(view, accessibilityEvent);
            }
        }

        /* renamed from: i */
        public boolean mo3554i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C3704a aVar = this.f4061e.get(viewGroup);
            if (aVar != null) {
                return aVar.mo3554i(viewGroup, view, accessibilityEvent);
            }
            return super.mo3554i(viewGroup, view, accessibilityEvent);
        }

        /* renamed from: j */
        public boolean mo3428j(View view, int i, Bundle bundle) {
            if (this.f4060d.mo5405o() || this.f4060d.f4058d.getLayoutManager() == null) {
                return super.mo3428j(view, i, bundle);
            }
            C3704a aVar = this.f4061e.get(view);
            if (aVar != null) {
                if (aVar.mo3428j(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo3428j(view, i, bundle)) {
                return true;
            }
            return this.f4060d.f4058d.getLayoutManager().mo4944j1(view, i, bundle);
        }

        /* renamed from: l */
        public void mo5408l(View view, int i) {
            C3704a aVar = this.f4061e.get(view);
            if (aVar != null) {
                aVar.mo5408l(view, i);
            } else {
                super.mo5408l(view, i);
            }
        }

        /* renamed from: m */
        public void mo5409m(View view, AccessibilityEvent accessibilityEvent) {
            C3704a aVar = this.f4061e.get(view);
            if (aVar != null) {
                aVar.mo5409m(view, accessibilityEvent);
            } else {
                super.mo5409m(view, accessibilityEvent);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public C3704a mo5410n(View view) {
            return this.f4061e.remove(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo5411o(View view) {
            C3704a l = C3774v.m16210l(view);
            if (l != null && l != this) {
                this.f4061e.put(view, l);
            }
        }
    }

    public C0913w(RecyclerView recyclerView) {
        this.f4058d = recyclerView;
        C3704a n = mo5404n();
        if (n == null || !(n instanceof C0914a)) {
            this.f4059e = new C0914a(this);
        } else {
            this.f4059e = (C0914a) n;
        }
    }

    /* renamed from: f */
    public void mo3426f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo3426f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !mo5405o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo4477L0(accessibilityEvent);
            }
        }
    }

    /* renamed from: g */
    public void mo3427g(View view, C3736c cVar) {
        super.mo3427g(view, cVar);
        if (!mo5405o() && this.f4058d.getLayoutManager() != null) {
            this.f4058d.getLayoutManager().mo4906N0(cVar);
        }
    }

    /* renamed from: j */
    public boolean mo3428j(View view, int i, Bundle bundle) {
        if (super.mo3428j(view, i, bundle)) {
            return true;
        }
        if (mo5405o() || this.f4058d.getLayoutManager() == null) {
            return false;
        }
        return this.f4058d.getLayoutManager().mo4939h1(i, bundle);
    }

    /* renamed from: n */
    public C3704a mo5404n() {
        return this.f4059e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo5405o() {
        return this.f4058d.mo4663s0();
    }
}
