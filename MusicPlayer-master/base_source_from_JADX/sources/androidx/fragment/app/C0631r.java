package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p082e.p109h.p115l.C3644b;

/* renamed from: androidx.fragment.app.r */
/* compiled from: FragmentTransitionCompat21 */
class C0631r extends C0637s {

    /* renamed from: androidx.fragment.app.r$a */
    /* compiled from: FragmentTransitionCompat21 */
    class C0632a extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f3203a;

        C0632a(C0631r rVar, Rect rect) {
            this.f3203a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f3203a;
        }
    }

    /* renamed from: androidx.fragment.app.r$b */
    /* compiled from: FragmentTransitionCompat21 */
    class C0633b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f3204a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f3205b;

        C0633b(C0631r rVar, View view, ArrayList arrayList) {
            this.f3204a = view;
            this.f3205b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f3204a.setVisibility(8);
            int size = this.f3205b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f3205b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* renamed from: androidx.fragment.app.r$c */
    /* compiled from: FragmentTransitionCompat21 */
    class C0634c implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f3206a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f3207b;

        /* renamed from: c */
        final /* synthetic */ Object f3208c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f3209d;

        /* renamed from: e */
        final /* synthetic */ Object f3210e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f3211f;

        C0634c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f3206a = obj;
            this.f3207b = arrayList;
            this.f3208c = obj2;
            this.f3209d = arrayList2;
            this.f3210e = obj3;
            this.f3211f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f3206a;
            if (obj != null) {
                C0631r.this.mo4094q(obj, this.f3207b, (ArrayList<View>) null);
            }
            Object obj2 = this.f3208c;
            if (obj2 != null) {
                C0631r.this.mo4094q(obj2, this.f3209d, (ArrayList<View>) null);
            }
            Object obj3 = this.f3210e;
            if (obj3 != null) {
                C0631r.this.mo4094q(obj3, this.f3211f, (ArrayList<View>) null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.r$d */
    /* compiled from: FragmentTransitionCompat21 */
    class C0635d implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f3213a;

        C0635d(C0631r rVar, Runnable runnable) {
            this.f3213a = runnable;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f3213a.run();
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.r$e */
    /* compiled from: FragmentTransitionCompat21 */
    class C0636e extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f3214a;

        C0636e(C0631r rVar, Rect rect) {
            this.f3214a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f3214a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f3214a;
        }
    }

    C0631r() {
    }

    /* renamed from: C */
    private static boolean m4076C(Transition transition) {
        return !C0637s.m4097l(transition.getTargetIds()) || !C0637s.m4097l(transition.getTargetNames()) || !C0637s.m4097l(transition.getTargetTypes());
    }

    /* renamed from: A */
    public void mo4084A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo4094q(transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: B */
    public Object mo4085B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: a */
    public void mo4086a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: b */
    public void mo4087b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo4087b(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m4076C(transition) && C0637s.m4097l(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo4088c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: e */
    public boolean mo4089e(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: g */
    public Object mo4090g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: m */
    public Object mo4091m(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    /* renamed from: n */
    public Object mo4092n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: p */
    public void mo4093p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    /* renamed from: q */
    public void mo4094q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                mo4094q(transitionSet.getTransitionAt(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m4076C(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                i = 0;
            } else {
                i = arrayList2.size();
            }
            while (i2 < i) {
                transition.addTarget(arrayList2.get(i2));
                i2++;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                transition.removeTarget(arrayList.get(size));
            }
        }
    }

    /* renamed from: r */
    public void mo4095r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C0633b(this, view, arrayList));
    }

    /* renamed from: t */
    public void mo4096t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C0634c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: u */
    public void mo4097u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C0636e(this, rect));
        }
    }

    /* renamed from: v */
    public void mo4098v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo4120k(view, rect);
            ((Transition) obj).setEpicenterCallback(new C0632a(this, rect));
        }
    }

    /* renamed from: w */
    public void mo4099w(Fragment fragment, Object obj, C3644b bVar, Runnable runnable) {
        ((Transition) obj).addListener(new C0635d(this, runnable));
    }

    /* renamed from: z */
    public void mo4100z(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0637s.m4094d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo4087b(transitionSet, arrayList);
    }
}
