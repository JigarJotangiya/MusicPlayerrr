package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p082e.p109h.p119p.C3774v;

/* renamed from: androidx.recyclerview.widget.g */
/* compiled from: DefaultItemAnimator */
public class C0854g extends C0916y {

    /* renamed from: s */
    private static TimeInterpolator f3842s;

    /* renamed from: h */
    private ArrayList<RecyclerView.C0792c0> f3843h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<RecyclerView.C0792c0> f3844i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C0864j> f3845j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C0863i> f3846k = new ArrayList<>();

    /* renamed from: l */
    ArrayList<ArrayList<RecyclerView.C0792c0>> f3847l = new ArrayList<>();

    /* renamed from: m */
    ArrayList<ArrayList<C0864j>> f3848m = new ArrayList<>();

    /* renamed from: n */
    ArrayList<ArrayList<C0863i>> f3849n = new ArrayList<>();

    /* renamed from: o */
    ArrayList<RecyclerView.C0792c0> f3850o = new ArrayList<>();

    /* renamed from: p */
    ArrayList<RecyclerView.C0792c0> f3851p = new ArrayList<>();

    /* renamed from: q */
    ArrayList<RecyclerView.C0792c0> f3852q = new ArrayList<>();

    /* renamed from: r */
    ArrayList<RecyclerView.C0792c0> f3853r = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.g$a */
    /* compiled from: DefaultItemAnimator */
    class C0855a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ ArrayList f3854g;

        C0855a(ArrayList arrayList) {
            this.f3854g = arrayList;
        }

        public void run() {
            Iterator it = this.f3854g.iterator();
            while (it.hasNext()) {
                C0864j jVar = (C0864j) it.next();
                C0854g.this.mo5244Y(jVar.f3888a, jVar.f3889b, jVar.f3890c, jVar.f3891d, jVar.f3892e);
            }
            this.f3854g.clear();
            C0854g.this.f3848m.remove(this.f3854g);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$b */
    /* compiled from: DefaultItemAnimator */
    class C0856b implements Runnable {

        /* renamed from: g */
        final /* synthetic */ ArrayList f3856g;

        C0856b(ArrayList arrayList) {
            this.f3856g = arrayList;
        }

        public void run() {
            Iterator it = this.f3856g.iterator();
            while (it.hasNext()) {
                C0854g.this.mo5243X((C0863i) it.next());
            }
            this.f3856g.clear();
            C0854g.this.f3849n.remove(this.f3856g);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$c */
    /* compiled from: DefaultItemAnimator */
    class C0857c implements Runnable {

        /* renamed from: g */
        final /* synthetic */ ArrayList f3858g;

        C0857c(ArrayList arrayList) {
            this.f3858g = arrayList;
        }

        public void run() {
            Iterator it = this.f3858g.iterator();
            while (it.hasNext()) {
                C0854g.this.mo5242W((RecyclerView.C0792c0) it.next());
            }
            this.f3858g.clear();
            C0854g.this.f3847l.remove(this.f3858g);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$d */
    /* compiled from: DefaultItemAnimator */
    class C0858d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.C0792c0 f3860a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3861b;

        /* renamed from: c */
        final /* synthetic */ View f3862c;

        C0858d(RecyclerView.C0792c0 c0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3860a = c0Var;
            this.f3861b = viewPropertyAnimator;
            this.f3862c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3861b.setListener((Animator.AnimatorListener) null);
            this.f3862c.setAlpha(1.0f);
            C0854g.this.mo5418L(this.f3860a);
            C0854g.this.f3852q.remove(this.f3860a);
            C0854g.this.mo5246b0();
        }

        public void onAnimationStart(Animator animator) {
            C0854g.this.mo5419M(this.f3860a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$e */
    /* compiled from: DefaultItemAnimator */
    class C0859e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.C0792c0 f3864a;

        /* renamed from: b */
        final /* synthetic */ View f3865b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f3866c;

        C0859e(RecyclerView.C0792c0 c0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3864a = c0Var;
            this.f3865b = view;
            this.f3866c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f3865b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f3866c.setListener((Animator.AnimatorListener) null);
            C0854g.this.mo5412F(this.f3864a);
            C0854g.this.f3850o.remove(this.f3864a);
            C0854g.this.mo5246b0();
        }

        public void onAnimationStart(Animator animator) {
            C0854g.this.mo5413G(this.f3864a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$f */
    /* compiled from: DefaultItemAnimator */
    class C0860f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.C0792c0 f3868a;

        /* renamed from: b */
        final /* synthetic */ int f3869b;

        /* renamed from: c */
        final /* synthetic */ View f3870c;

        /* renamed from: d */
        final /* synthetic */ int f3871d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f3872e;

        C0860f(RecyclerView.C0792c0 c0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3868a = c0Var;
            this.f3869b = i;
            this.f3870c = view;
            this.f3871d = i2;
            this.f3872e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f3869b != 0) {
                this.f3870c.setTranslationX(0.0f);
            }
            if (this.f3871d != 0) {
                this.f3870c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f3872e.setListener((Animator.AnimatorListener) null);
            C0854g.this.mo5416J(this.f3868a);
            C0854g.this.f3851p.remove(this.f3868a);
            C0854g.this.mo5246b0();
        }

        public void onAnimationStart(Animator animator) {
            C0854g.this.mo5417K(this.f3868a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$g */
    /* compiled from: DefaultItemAnimator */
    class C0861g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0863i f3874a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3875b;

        /* renamed from: c */
        final /* synthetic */ View f3876c;

        C0861g(C0863i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3874a = iVar;
            this.f3875b = viewPropertyAnimator;
            this.f3876c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3875b.setListener((Animator.AnimatorListener) null);
            this.f3876c.setAlpha(1.0f);
            this.f3876c.setTranslationX(0.0f);
            this.f3876c.setTranslationY(0.0f);
            C0854g.this.mo5414H(this.f3874a.f3882a, true);
            C0854g.this.f3853r.remove(this.f3874a.f3882a);
            C0854g.this.mo5246b0();
        }

        public void onAnimationStart(Animator animator) {
            C0854g.this.mo5415I(this.f3874a.f3882a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$h */
    /* compiled from: DefaultItemAnimator */
    class C0862h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0863i f3878a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3879b;

        /* renamed from: c */
        final /* synthetic */ View f3880c;

        C0862h(C0863i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3878a = iVar;
            this.f3879b = viewPropertyAnimator;
            this.f3880c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3879b.setListener((Animator.AnimatorListener) null);
            this.f3880c.setAlpha(1.0f);
            this.f3880c.setTranslationX(0.0f);
            this.f3880c.setTranslationY(0.0f);
            C0854g.this.mo5414H(this.f3878a.f3883b, false);
            C0854g.this.f3853r.remove(this.f3878a.f3883b);
            C0854g.this.mo5246b0();
        }

        public void onAnimationStart(Animator animator) {
            C0854g.this.mo5415I(this.f3878a.f3883b, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$j */
    /* compiled from: DefaultItemAnimator */
    private static class C0864j {

        /* renamed from: a */
        public RecyclerView.C0792c0 f3888a;

        /* renamed from: b */
        public int f3889b;

        /* renamed from: c */
        public int f3890c;

        /* renamed from: d */
        public int f3891d;

        /* renamed from: e */
        public int f3892e;

        C0864j(RecyclerView.C0792c0 c0Var, int i, int i2, int i3, int i4) {
            this.f3888a = c0Var;
            this.f3889b = i;
            this.f3890c = i2;
            this.f3891d = i3;
            this.f3892e = i4;
        }
    }

    /* renamed from: Z */
    private void m5371Z(RecyclerView.C0792c0 c0Var) {
        View view = c0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f3852q.add(c0Var);
        animate.setDuration(mo4857o()).alpha(0.0f).setListener(new C0858d(c0Var, animate, view)).start();
    }

    /* renamed from: c0 */
    private void m5372c0(List<C0863i> list, RecyclerView.C0792c0 c0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0863i iVar = list.get(size);
            if (m5374e0(iVar, c0Var) && iVar.f3882a == null && iVar.f3883b == null) {
                list.remove(iVar);
            }
        }
    }

    /* renamed from: d0 */
    private void m5373d0(C0863i iVar) {
        RecyclerView.C0792c0 c0Var = iVar.f3882a;
        if (c0Var != null) {
            m5374e0(iVar, c0Var);
        }
        RecyclerView.C0792c0 c0Var2 = iVar.f3883b;
        if (c0Var2 != null) {
            m5374e0(iVar, c0Var2);
        }
    }

    /* renamed from: e0 */
    private boolean m5374e0(C0863i iVar, RecyclerView.C0792c0 c0Var) {
        boolean z = false;
        if (iVar.f3883b == c0Var) {
            iVar.f3883b = null;
        } else if (iVar.f3882a != c0Var) {
            return false;
        } else {
            iVar.f3882a = null;
            z = true;
        }
        c0Var.itemView.setAlpha(1.0f);
        c0Var.itemView.setTranslationX(0.0f);
        c0Var.itemView.setTranslationY(0.0f);
        mo5414H(c0Var, z);
        return true;
    }

    /* renamed from: f0 */
    private void m5375f0(RecyclerView.C0792c0 c0Var) {
        if (f3842s == null) {
            f3842s = new ValueAnimator().getInterpolator();
        }
        c0Var.itemView.animate().setInterpolator(f3842s);
        mo4852j(c0Var);
    }

    /* renamed from: B */
    public boolean mo5238B(RecyclerView.C0792c0 c0Var) {
        m5375f0(c0Var);
        c0Var.itemView.setAlpha(0.0f);
        this.f3844i.add(c0Var);
        return true;
    }

    /* renamed from: C */
    public boolean mo5239C(RecyclerView.C0792c0 c0Var, RecyclerView.C0792c0 c0Var2, int i, int i2, int i3, int i4) {
        if (c0Var == c0Var2) {
            return mo5240D(c0Var, i, i2, i3, i4);
        }
        float translationX = c0Var.itemView.getTranslationX();
        float translationY = c0Var.itemView.getTranslationY();
        float alpha = c0Var.itemView.getAlpha();
        m5375f0(c0Var);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        c0Var.itemView.setTranslationX(translationX);
        c0Var.itemView.setTranslationY(translationY);
        c0Var.itemView.setAlpha(alpha);
        if (c0Var2 != null) {
            m5375f0(c0Var2);
            c0Var2.itemView.setTranslationX((float) (-i5));
            c0Var2.itemView.setTranslationY((float) (-i6));
            c0Var2.itemView.setAlpha(0.0f);
        }
        this.f3846k.add(new C0863i(c0Var, c0Var2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: D */
    public boolean mo5240D(RecyclerView.C0792c0 c0Var, int i, int i2, int i3, int i4) {
        View view = c0Var.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) c0Var.itemView.getTranslationY());
        m5375f0(c0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo5416J(c0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.f3845j.add(new C0864j(c0Var, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: E */
    public boolean mo5241E(RecyclerView.C0792c0 c0Var) {
        m5375f0(c0Var);
        this.f3843h.add(c0Var);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo5242W(RecyclerView.C0792c0 c0Var) {
        View view = c0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f3850o.add(c0Var);
        animate.alpha(1.0f).setDuration(mo4854l()).setListener(new C0859e(c0Var, view, animate)).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo5243X(C0863i iVar) {
        View view;
        RecyclerView.C0792c0 c0Var = iVar.f3882a;
        View view2 = null;
        if (c0Var == null) {
            view = null;
        } else {
            view = c0Var.itemView;
        }
        RecyclerView.C0792c0 c0Var2 = iVar.f3883b;
        if (c0Var2 != null) {
            view2 = c0Var2.itemView;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(mo4855m());
            this.f3853r.add(iVar.f3882a);
            duration.translationX((float) (iVar.f3886e - iVar.f3884c));
            duration.translationY((float) (iVar.f3887f - iVar.f3885d));
            duration.alpha(0.0f).setListener(new C0861g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f3853r.add(iVar.f3883b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(mo4855m()).alpha(1.0f).setListener(new C0862h(iVar, animate, view2)).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo5244Y(RecyclerView.C0792c0 c0Var, int i, int i2, int i3, int i4) {
        View view = c0Var.itemView;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f3851p.add(c0Var);
        animate.setDuration(mo4856n()).setListener(new C0860f(c0Var, i5, view, i6, animate)).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void mo5245a0(List<RecyclerView.C0792c0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void mo5246b0() {
        if (!mo4858p()) {
            mo4851i();
        }
    }

    /* renamed from: g */
    public boolean mo4849g(RecyclerView.C0792c0 c0Var, List<Object> list) {
        return !list.isEmpty() || super.mo4849g(c0Var, list);
    }

    /* renamed from: j */
    public void mo4852j(RecyclerView.C0792c0 c0Var) {
        View view = c0Var.itemView;
        view.animate().cancel();
        int size = this.f3845j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f3845j.get(size).f3888a == c0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo5416J(c0Var);
                this.f3845j.remove(size);
            }
        }
        m5372c0(this.f3846k, c0Var);
        if (this.f3843h.remove(c0Var)) {
            view.setAlpha(1.0f);
            mo5418L(c0Var);
        }
        if (this.f3844i.remove(c0Var)) {
            view.setAlpha(1.0f);
            mo5412F(c0Var);
        }
        for (int size2 = this.f3849n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.f3849n.get(size2);
            m5372c0(arrayList, c0Var);
            if (arrayList.isEmpty()) {
                this.f3849n.remove(size2);
            }
        }
        for (int size3 = this.f3848m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.f3848m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C0864j) arrayList2.get(size4)).f3888a == c0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo5416J(c0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3848m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f3847l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f3847l.get(size5);
            if (arrayList3.remove(c0Var)) {
                view.setAlpha(1.0f);
                mo5412F(c0Var);
                if (arrayList3.isEmpty()) {
                    this.f3847l.remove(size5);
                }
            }
        }
        this.f3852q.remove(c0Var);
        this.f3850o.remove(c0Var);
        this.f3853r.remove(c0Var);
        this.f3851p.remove(c0Var);
        mo5246b0();
    }

    /* renamed from: k */
    public void mo4853k() {
        int size = this.f3845j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0864j jVar = this.f3845j.get(size);
            View view = jVar.f3888a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo5416J(jVar.f3888a);
            this.f3845j.remove(size);
        }
        for (int size2 = this.f3843h.size() - 1; size2 >= 0; size2--) {
            mo5418L(this.f3843h.get(size2));
            this.f3843h.remove(size2);
        }
        int size3 = this.f3844i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C0792c0 c0Var = this.f3844i.get(size3);
            c0Var.itemView.setAlpha(1.0f);
            mo5412F(c0Var);
            this.f3844i.remove(size3);
        }
        for (int size4 = this.f3846k.size() - 1; size4 >= 0; size4--) {
            m5373d0(this.f3846k.get(size4));
        }
        this.f3846k.clear();
        if (mo4858p()) {
            for (int size5 = this.f3848m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.f3848m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C0864j jVar2 = (C0864j) arrayList.get(size6);
                    View view2 = jVar2.f3888a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo5416J(jVar2.f3888a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3848m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f3847l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.f3847l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.C0792c0 c0Var2 = (RecyclerView.C0792c0) arrayList2.get(size8);
                    c0Var2.itemView.setAlpha(1.0f);
                    mo5412F(c0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3847l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f3849n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.f3849n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m5373d0((C0863i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f3849n.remove(arrayList3);
                    }
                }
            }
            mo5245a0(this.f3852q);
            mo5245a0(this.f3851p);
            mo5245a0(this.f3850o);
            mo5245a0(this.f3853r);
            mo4851i();
        }
    }

    /* renamed from: p */
    public boolean mo4858p() {
        return !this.f3844i.isEmpty() || !this.f3846k.isEmpty() || !this.f3845j.isEmpty() || !this.f3843h.isEmpty() || !this.f3851p.isEmpty() || !this.f3852q.isEmpty() || !this.f3850o.isEmpty() || !this.f3853r.isEmpty() || !this.f3848m.isEmpty() || !this.f3847l.isEmpty() || !this.f3849n.isEmpty();
    }

    /* renamed from: v */
    public void mo4864v() {
        boolean z = !this.f3843h.isEmpty();
        boolean z2 = !this.f3845j.isEmpty();
        boolean z3 = !this.f3846k.isEmpty();
        boolean z4 = !this.f3844i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.C0792c0> it = this.f3843h.iterator();
            while (it.hasNext()) {
                m5371Z(it.next());
            }
            this.f3843h.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f3845j);
                this.f3848m.add(arrayList);
                this.f3845j.clear();
                C0855a aVar = new C0855a(arrayList);
                if (z) {
                    C3774v.m16203h0(((C0864j) arrayList.get(0)).f3888a.itemView, aVar, mo4857o());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f3846k);
                this.f3849n.add(arrayList2);
                this.f3846k.clear();
                C0856b bVar = new C0856b(arrayList2);
                if (z) {
                    C3774v.m16203h0(((C0863i) arrayList2.get(0)).f3882a.itemView, bVar, mo4857o());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f3844i);
                this.f3847l.add(arrayList3);
                this.f3844i.clear();
                C0857c cVar = new C0857c(arrayList3);
                if (z || z2 || z3) {
                    long j = 0;
                    long o = z ? mo4857o() : 0;
                    long n = z2 ? mo4856n() : 0;
                    if (z3) {
                        j = mo4855m();
                    }
                    C3774v.m16203h0(((RecyclerView.C0792c0) arrayList3.get(0)).itemView, cVar, o + Math.max(n, j));
                    return;
                }
                cVar.run();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$i */
    /* compiled from: DefaultItemAnimator */
    private static class C0863i {

        /* renamed from: a */
        public RecyclerView.C0792c0 f3882a;

        /* renamed from: b */
        public RecyclerView.C0792c0 f3883b;

        /* renamed from: c */
        public int f3884c;

        /* renamed from: d */
        public int f3885d;

        /* renamed from: e */
        public int f3886e;

        /* renamed from: f */
        public int f3887f;

        private C0863i(RecyclerView.C0792c0 c0Var, RecyclerView.C0792c0 c0Var2) {
            this.f3882a = c0Var;
            this.f3883b = c0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f3882a + ", newHolder=" + this.f3883b + ", fromX=" + this.f3884c + ", fromY=" + this.f3885d + ", toX=" + this.f3886e + ", toY=" + this.f3887f + '}';
        }

        C0863i(RecyclerView.C0792c0 c0Var, RecyclerView.C0792c0 c0Var2, int i, int i2, int i3, int i4) {
            this(c0Var, c0Var2);
            this.f3884c = i;
            this.f3885d = i2;
            this.f3886e = i3;
            this.f3887f = i4;
        }
    }
}
