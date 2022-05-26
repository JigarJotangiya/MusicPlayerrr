package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0637s;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RestrictedApi"})
/* renamed from: androidx.transition.e */
/* compiled from: FragmentTransitionSupport */
public class C1111e extends C0637s {

    /* renamed from: androidx.transition.e$a */
    /* compiled from: FragmentTransitionSupport */
    class C1112a extends Transition.C1094e {

        /* renamed from: a */
        final /* synthetic */ Rect f4655a;

        C1112a(C1111e eVar, Rect rect) {
            this.f4655a = rect;
        }

        /* renamed from: a */
        public Rect mo6005a(Transition transition) {
            return this.f4655a;
        }
    }

    /* renamed from: androidx.transition.e$b */
    /* compiled from: FragmentTransitionSupport */
    class C1113b implements Transition.C1095f {

        /* renamed from: a */
        final /* synthetic */ View f4656a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f4657b;

        C1113b(C1111e eVar, View view, ArrayList arrayList) {
            this.f4656a = view;
            this.f4657b = arrayList;
        }

        /* renamed from: a */
        public void mo6006a(Transition transition) {
        }

        /* renamed from: b */
        public void mo5920b(Transition transition) {
        }

        /* renamed from: c */
        public void mo5921c(Transition transition) {
            transition.mo5971X(this);
            this.f4656a.setVisibility(8);
            int size = this.f4657b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f4657b.get(i)).setVisibility(0);
            }
        }

        /* renamed from: d */
        public void mo5922d(Transition transition) {
        }

        /* renamed from: e */
        public void mo5923e(Transition transition) {
        }
    }

    /* renamed from: androidx.transition.e$c */
    /* compiled from: FragmentTransitionSupport */
    class C1114c extends C1153u {

        /* renamed from: a */
        final /* synthetic */ Object f4658a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f4659b;

        /* renamed from: c */
        final /* synthetic */ Object f4660c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f4661d;

        /* renamed from: e */
        final /* synthetic */ Object f4662e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f4663f;

        C1114c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f4658a = obj;
            this.f4659b = arrayList;
            this.f4660c = obj2;
            this.f4661d = arrayList2;
            this.f4662e = obj3;
            this.f4663f = arrayList3;
        }

        /* renamed from: a */
        public void mo6006a(Transition transition) {
            Object obj = this.f4658a;
            if (obj != null) {
                C1111e.this.mo4094q(obj, this.f4659b, (ArrayList<View>) null);
            }
            Object obj2 = this.f4660c;
            if (obj2 != null) {
                C1111e.this.mo4094q(obj2, this.f4661d, (ArrayList<View>) null);
            }
            Object obj3 = this.f4662e;
            if (obj3 != null) {
                C1111e.this.mo4094q(obj3, this.f4663f, (ArrayList<View>) null);
            }
        }

        /* renamed from: c */
        public void mo5921c(Transition transition) {
            transition.mo5971X(this);
        }
    }

    /* renamed from: androidx.transition.e$d */
    /* compiled from: FragmentTransitionSupport */
    class C1115d extends Transition.C1094e {

        /* renamed from: a */
        final /* synthetic */ Rect f4665a;

        C1115d(C1111e eVar, Rect rect) {
            this.f4665a = rect;
        }

        /* renamed from: a */
        public Rect mo6005a(Transition transition) {
            Rect rect = this.f4665a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f4665a;
        }
    }

    /* renamed from: C */
    private static boolean m6364C(Transition transition) {
        return !C0637s.m4097l(transition.mo5962E()) || !C0637s.m4097l(transition.mo5963F()) || !C0637s.m4097l(transition.mo5964G());
    }

    /* renamed from: A */
    public void mo4084A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.mo5965H().clear();
            transitionSet.mo5965H().addAll(arrayList2);
            mo4094q(transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: B */
    public Object mo4085B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.mo6009o0((Transition) obj);
        return transitionSet;
    }

    /* renamed from: a */
    public void mo4086a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo5975b(view);
        }
    }

    /* renamed from: b */
    public void mo4087b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int r0 = transitionSet.mo6011r0();
                while (i < r0) {
                    mo4087b(transitionSet.mo6010q0(i), arrayList);
                    i++;
                }
            } else if (!m6364C(transition) && C0637s.m4097l(transition.mo5965H())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.mo5975b(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo4088c(ViewGroup viewGroup, Object obj) {
        C1154v.m6502a(viewGroup, (Transition) obj);
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
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.mo6009o0(transition);
            transitionSet.mo6009o0(transition2);
            transitionSet.mo6016w0(1);
            transition = transitionSet;
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet2 = new TransitionSet();
        if (transition != null) {
            transitionSet2.mo6009o0(transition);
        }
        transitionSet2.mo6009o0(transition3);
        return transitionSet2;
    }

    /* renamed from: n */
    public Object mo4092n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.mo6009o0((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.mo6009o0((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.mo6009o0((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: p */
    public void mo4093p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo5972Z(view);
        }
    }

    /* renamed from: q */
    public void mo4094q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int r0 = transitionSet.mo6011r0();
            while (i2 < r0) {
                mo4094q(transitionSet.mo6010q0(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m6364C(transition)) {
            List<View> H = transition.mo5965H();
            if (H.size() == arrayList.size() && H.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    transition.mo5975b(arrayList2.get(i2));
                    i2++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    transition.mo5972Z(arrayList.get(size));
                }
            }
        }
    }

    /* renamed from: r */
    public void mo4095r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).mo5973a(new C1113b(this, view, arrayList));
    }

    /* renamed from: t */
    public void mo4096t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).mo5973a(new C1114c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: u */
    public void mo4097u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).mo5979e0(new C1115d(this, rect));
        }
    }

    /* renamed from: v */
    public void mo4098v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo4120k(view, rect);
            ((Transition) obj).mo5979e0(new C1112a(this, rect));
        }
    }

    /* renamed from: z */
    public void mo4100z(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> H = transitionSet.mo5965H();
        H.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0637s.m4094d(H, arrayList.get(i));
        }
        H.add(view);
        arrayList.add(view);
        mo4087b(transitionSet, arrayList);
    }
}
