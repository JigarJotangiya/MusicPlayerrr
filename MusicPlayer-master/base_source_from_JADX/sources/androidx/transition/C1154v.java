package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p082e.p098e.C3465a;
import p082e.p109h.p119p.C3774v;

/* renamed from: androidx.transition.v */
/* compiled from: TransitionManager */
public class C1154v {

    /* renamed from: a */
    private static Transition f4738a = new AutoTransition();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<C3465a<ViewGroup, ArrayList<Transition>>>> f4739b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f4740c = new ArrayList<>();

    /* renamed from: androidx.transition.v$a */
    /* compiled from: TransitionManager */
    private static class C1155a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: g */
        Transition f4741g;

        /* renamed from: h */
        ViewGroup f4742h;

        /* renamed from: androidx.transition.v$a$a */
        /* compiled from: TransitionManager */
        class C1156a extends C1153u {

            /* renamed from: a */
            final /* synthetic */ C3465a f4743a;

            C1156a(C3465a aVar) {
                this.f4743a = aVar;
            }

            /* renamed from: c */
            public void mo5921c(Transition transition) {
                ((ArrayList) this.f4743a.get(C1155a.this.f4742h)).remove(transition);
                transition.mo5971X(this);
            }
        }

        C1155a(Transition transition, ViewGroup viewGroup) {
            this.f4741g = transition;
            this.f4742h = viewGroup;
        }

        /* renamed from: a */
        private void m6506a() {
            this.f4742h.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f4742h.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            m6506a();
            if (!C1154v.f4740c.remove(this.f4742h)) {
                return true;
            }
            C3465a<ViewGroup, ArrayList<Transition>> b = C1154v.m6503b();
            ArrayList arrayList = b.get(this.f4742h);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                b.put(this.f4742h, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f4741g);
            this.f4741g.mo5973a(new C1156a(b));
            this.f4741g.mo5990m(this.f4742h, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).mo5974a0(this.f4742h);
                }
            }
            this.f4741g.mo5970W(this.f4742h);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            m6506a();
            C1154v.f4740c.remove(this.f4742h);
            ArrayList arrayList = C1154v.m6503b().get(this.f4742h);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).mo5974a0(this.f4742h);
                }
            }
            this.f4741g.mo5991n(true);
        }
    }

    /* renamed from: a */
    public static void m6502a(ViewGroup viewGroup, Transition transition) {
        if (!f4740c.contains(viewGroup) && C3774v.m16181T(viewGroup)) {
            f4740c.add(viewGroup);
            if (transition == null) {
                transition = f4738a;
            }
            Transition o = transition.clone();
            m6505d(viewGroup, o);
            C1147r.m6492c(viewGroup, (C1147r) null);
            m6504c(viewGroup, o);
        }
    }

    /* renamed from: b */
    static C3465a<ViewGroup, ArrayList<Transition>> m6503b() {
        C3465a<ViewGroup, ArrayList<Transition>> aVar;
        WeakReference weakReference = f4739b.get();
        if (weakReference != null && (aVar = (C3465a) weakReference.get()) != null) {
            return aVar;
        }
        C3465a<ViewGroup, ArrayList<Transition>> aVar2 = new C3465a<>();
        f4739b.set(new WeakReference(aVar2));
        return aVar2;
    }

    /* renamed from: c */
    private static void m6504c(ViewGroup viewGroup, Transition transition) {
        if (transition != null && viewGroup != null) {
            C1155a aVar = new C1155a(transition, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: d */
    private static void m6505d(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = m6503b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).mo5969V(viewGroup);
            }
        }
        if (transition != null) {
            transition.mo5990m(viewGroup, true);
        }
        C1147r b = C1147r.m6491b(viewGroup);
        if (b != null) {
            b.mo6121a();
        }
    }
}
