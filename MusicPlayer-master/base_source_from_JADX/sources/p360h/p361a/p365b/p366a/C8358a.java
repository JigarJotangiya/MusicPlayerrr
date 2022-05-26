package p360h.p361a.p365b.p366a;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.C0916y;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p360h.p361a.p365b.p366a.p367c.C8371a;
import p360h.p361a.p365b.p368b.C8372a;
import p369i.p387z.p389d.C8594l;

/* renamed from: h.a.b.a.a */
/* compiled from: BaseItemAnimator.kt */
public abstract class C8358a extends C0916y {

    /* renamed from: h */
    private final ArrayList<RecyclerView.C0792c0> f34822h = new ArrayList<>();

    /* renamed from: i */
    private final ArrayList<RecyclerView.C0792c0> f34823i = new ArrayList<>();

    /* renamed from: j */
    private final ArrayList<C8363e> f34824j = new ArrayList<>();

    /* renamed from: k */
    private final ArrayList<C8360b> f34825k = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final ArrayList<ArrayList<RecyclerView.C0792c0>> f34826l = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final ArrayList<ArrayList<C8363e>> f34827m = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final ArrayList<ArrayList<C8360b>> f34828n = new ArrayList<>();

    /* renamed from: o */
    private ArrayList<RecyclerView.C0792c0> f34829o = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final ArrayList<RecyclerView.C0792c0> f34830p = new ArrayList<>();

    /* renamed from: q */
    private ArrayList<RecyclerView.C0792c0> f34831q = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final ArrayList<RecyclerView.C0792c0> f34832r = new ArrayList<>();

    /* renamed from: h.a.b.a.a$a */
    /* compiled from: BaseItemAnimator.kt */
    public static class C8359a implements Animator.AnimatorListener {
        public void onAnimationCancel(Animator animator) {
            C8594l.m46772f(animator, "animator");
        }

        public void onAnimationRepeat(Animator animator) {
            C8594l.m46772f(animator, "animator");
        }
    }

    /* renamed from: h.a.b.a.a$c */
    /* compiled from: BaseItemAnimator.kt */
    public final class C8361c extends C8359a {

        /* renamed from: a */
        private RecyclerView.C0792c0 f34839a;

        /* renamed from: b */
        final /* synthetic */ C8358a f34840b;

        public C8361c(C8358a aVar, RecyclerView.C0792c0 c0Var) {
            C8594l.m46772f(c0Var, "viewHolder");
            this.f34840b = aVar;
            this.f34839a = c0Var;
        }

        public void onAnimationCancel(Animator animator) {
            C8594l.m46772f(animator, "animator");
            View view = this.f34839a.itemView;
            C8594l.m46768b(view, "viewHolder.itemView");
            C8372a.m46422a(view);
        }

        public void onAnimationEnd(Animator animator) {
            C8594l.m46772f(animator, "animator");
            View view = this.f34839a.itemView;
            C8594l.m46768b(view, "viewHolder.itemView");
            C8372a.m46422a(view);
            this.f34840b.mo5412F(this.f34839a);
            this.f34840b.mo30297q0().remove(this.f34839a);
            this.f34840b.m46377k0();
        }

        public void onAnimationStart(Animator animator) {
            C8594l.m46772f(animator, "animator");
            this.f34840b.mo5413G(this.f34839a);
        }
    }

    /* renamed from: h.a.b.a.a$d */
    /* compiled from: BaseItemAnimator.kt */
    protected final class C8362d extends C8359a {

        /* renamed from: a */
        private RecyclerView.C0792c0 f34841a;

        /* renamed from: b */
        final /* synthetic */ C8358a f34842b;

        public C8362d(C8358a aVar, RecyclerView.C0792c0 c0Var) {
            C8594l.m46772f(c0Var, "viewHolder");
            this.f34842b = aVar;
            this.f34841a = c0Var;
        }

        public void onAnimationCancel(Animator animator) {
            C8594l.m46772f(animator, "animator");
            View view = this.f34841a.itemView;
            C8594l.m46768b(view, "viewHolder.itemView");
            C8372a.m46422a(view);
        }

        public void onAnimationEnd(Animator animator) {
            C8594l.m46772f(animator, "animator");
            View view = this.f34841a.itemView;
            C8594l.m46768b(view, "viewHolder.itemView");
            C8372a.m46422a(view);
            this.f34842b.mo5418L(this.f34841a);
            this.f34842b.mo30299s0().remove(this.f34841a);
            this.f34842b.m46377k0();
        }

        public void onAnimationStart(Animator animator) {
            C8594l.m46772f(animator, "animator");
            this.f34842b.mo5419M(this.f34841a);
        }
    }

    /* renamed from: h.a.b.a.a$e */
    /* compiled from: BaseItemAnimator.kt */
    private static final class C8363e {

        /* renamed from: a */
        private RecyclerView.C0792c0 f34843a;

        /* renamed from: b */
        private int f34844b;

        /* renamed from: c */
        private int f34845c;

        /* renamed from: d */
        private int f34846d;

        /* renamed from: e */
        private int f34847e;

        public C8363e(RecyclerView.C0792c0 c0Var, int i, int i2, int i3, int i4) {
            C8594l.m46772f(c0Var, "holder");
            this.f34843a = c0Var;
            this.f34844b = i;
            this.f34845c = i2;
            this.f34846d = i3;
            this.f34847e = i4;
        }

        /* renamed from: a */
        public final int mo30319a() {
            return this.f34844b;
        }

        /* renamed from: b */
        public final int mo30320b() {
            return this.f34845c;
        }

        /* renamed from: c */
        public final RecyclerView.C0792c0 mo30321c() {
            return this.f34843a;
        }

        /* renamed from: d */
        public final int mo30322d() {
            return this.f34846d;
        }

        /* renamed from: e */
        public final int mo30323e() {
            return this.f34847e;
        }
    }

    /* renamed from: h.a.b.a.a$f */
    /* compiled from: BaseItemAnimator.kt */
    public static final class C8364f extends C8359a {

        /* renamed from: a */
        final /* synthetic */ C8358a f34848a;

        /* renamed from: b */
        final /* synthetic */ C8360b f34849b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f34850c;

        /* renamed from: d */
        final /* synthetic */ View f34851d;

        C8364f(C8358a aVar, C8360b bVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f34848a = aVar;
            this.f34849b = bVar;
            this.f34850c = viewPropertyAnimator;
            this.f34851d = view;
        }

        public void onAnimationEnd(Animator animator) {
            C8594l.m46772f(animator, "animator");
            this.f34850c.setListener((Animator.AnimatorListener) null);
            this.f34851d.setAlpha(1.0f);
            this.f34851d.setTranslationX(0.0f);
            this.f34851d.setTranslationY(0.0f);
            this.f34848a.mo5414H(this.f34849b.mo30309d(), true);
            if (this.f34849b.mo30309d() != null) {
                ArrayList b0 = this.f34848a.f34832r;
                RecyclerView.C0792c0 d = this.f34849b.mo30309d();
                if (d != null) {
                    b0.remove(d);
                } else {
                    C8594l.m46779m();
                    throw null;
                }
            }
            this.f34848a.m46377k0();
        }

        public void onAnimationStart(Animator animator) {
            C8594l.m46772f(animator, "animator");
            this.f34848a.mo5415I(this.f34849b.mo30309d(), true);
        }
    }

    /* renamed from: h.a.b.a.a$g */
    /* compiled from: BaseItemAnimator.kt */
    public static final class C8365g extends C8359a {

        /* renamed from: a */
        final /* synthetic */ C8358a f34852a;

        /* renamed from: b */
        final /* synthetic */ C8360b f34853b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f34854c;

        /* renamed from: d */
        final /* synthetic */ View f34855d;

        C8365g(C8358a aVar, C8360b bVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f34852a = aVar;
            this.f34853b = bVar;
            this.f34854c = viewPropertyAnimator;
            this.f34855d = view;
        }

        public void onAnimationEnd(Animator animator) {
            C8594l.m46772f(animator, "animator");
            this.f34854c.setListener((Animator.AnimatorListener) null);
            this.f34855d.setAlpha(1.0f);
            this.f34855d.setTranslationX(0.0f);
            this.f34855d.setTranslationY(0.0f);
            this.f34852a.mo5414H(this.f34853b.mo30308c(), false);
            if (this.f34853b.mo30308c() != null) {
                ArrayList b0 = this.f34852a.f34832r;
                RecyclerView.C0792c0 c = this.f34853b.mo30308c();
                if (c != null) {
                    b0.remove(c);
                } else {
                    C8594l.m46779m();
                    throw null;
                }
            }
            this.f34852a.m46377k0();
        }

        public void onAnimationStart(Animator animator) {
            C8594l.m46772f(animator, "animator");
            this.f34852a.mo5415I(this.f34853b.mo30308c(), false);
        }
    }

    /* renamed from: h.a.b.a.a$h */
    /* compiled from: BaseItemAnimator.kt */
    public static final class C8366h extends C8359a {

        /* renamed from: a */
        final /* synthetic */ C8358a f34856a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView.C0792c0 f34857b;

        /* renamed from: c */
        final /* synthetic */ int f34858c;

        /* renamed from: d */
        final /* synthetic */ View f34859d;

        /* renamed from: e */
        final /* synthetic */ int f34860e;

        /* renamed from: f */
        final /* synthetic */ ViewPropertyAnimator f34861f;

        C8366h(C8358a aVar, RecyclerView.C0792c0 c0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f34856a = aVar;
            this.f34857b = c0Var;
            this.f34858c = i;
            this.f34859d = view;
            this.f34860e = i2;
            this.f34861f = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            C8594l.m46772f(animator, "animator");
            if (this.f34858c != 0) {
                this.f34859d.setTranslationX(0.0f);
            }
            if (this.f34860e != 0) {
                this.f34859d.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            C8594l.m46772f(animator, "animator");
            this.f34861f.setListener((Animator.AnimatorListener) null);
            this.f34856a.mo5416J(this.f34857b);
            this.f34856a.f34830p.remove(this.f34857b);
            this.f34856a.m46377k0();
        }

        public void onAnimationStart(Animator animator) {
            C8594l.m46772f(animator, "animator");
            this.f34856a.mo5417K(this.f34857b);
        }
    }

    /* renamed from: h.a.b.a.a$i */
    /* compiled from: BaseItemAnimator.kt */
    static final class C8367i implements Runnable {

        /* renamed from: g */
        final /* synthetic */ C8358a f34862g;

        /* renamed from: h */
        final /* synthetic */ ArrayList f34863h;

        C8367i(C8358a aVar, ArrayList arrayList) {
            this.f34862g = aVar;
            this.f34863h = arrayList;
        }

        public final void run() {
            if (this.f34862g.f34826l.remove(this.f34863h)) {
                Iterator it = this.f34863h.iterator();
                while (it.hasNext()) {
                    RecyclerView.C0792c0 c0Var = (RecyclerView.C0792c0) it.next();
                    C8358a aVar = this.f34862g;
                    C8594l.m46768b(c0Var, "holder");
                    aVar.m46378l0(c0Var);
                }
                this.f34863h.clear();
            }
        }
    }

    /* renamed from: h.a.b.a.a$j */
    /* compiled from: BaseItemAnimator.kt */
    static final class C8368j implements Runnable {

        /* renamed from: g */
        final /* synthetic */ C8358a f34864g;

        /* renamed from: h */
        final /* synthetic */ ArrayList f34865h;

        C8368j(C8358a aVar, ArrayList arrayList) {
            this.f34864g = aVar;
            this.f34865h = arrayList;
        }

        public final void run() {
            if (this.f34864g.f34828n.remove(this.f34865h)) {
                Iterator it = this.f34865h.iterator();
                while (it.hasNext()) {
                    C8360b bVar = (C8360b) it.next();
                    C8358a aVar = this.f34864g;
                    C8594l.m46768b(bVar, "change");
                    aVar.m46374g0(bVar);
                }
                this.f34865h.clear();
            }
        }
    }

    /* renamed from: h.a.b.a.a$k */
    /* compiled from: BaseItemAnimator.kt */
    static final class C8369k implements Runnable {

        /* renamed from: g */
        final /* synthetic */ C8358a f34866g;

        /* renamed from: h */
        final /* synthetic */ ArrayList f34867h;

        C8369k(C8358a aVar, ArrayList arrayList) {
            this.f34866g = aVar;
            this.f34867h = arrayList;
        }

        public final void run() {
            if (this.f34866g.f34827m.remove(this.f34867h)) {
                Iterator it = this.f34867h.iterator();
                while (it.hasNext()) {
                    C8363e eVar = (C8363e) it.next();
                    this.f34866g.m46375h0(eVar.mo30321c(), eVar.mo30319a(), eVar.mo30320b(), eVar.mo30322d(), eVar.mo30323e());
                }
                this.f34867h.clear();
            }
        }
    }

    public C8358a() {
        new DecelerateInterpolator();
        mo5428V(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public final void m46374g0(C8360b bVar) {
        RecyclerView.C0792c0 d = bVar.mo30309d();
        View view = d != null ? d.itemView : null;
        RecyclerView.C0792c0 c = bVar.mo30308c();
        View view2 = c != null ? c.itemView : null;
        if (view != null) {
            if (bVar.mo30309d() != null) {
                ArrayList<RecyclerView.C0792c0> arrayList = this.f34832r;
                RecyclerView.C0792c0 d2 = bVar.mo30309d();
                if (d2 != null) {
                    arrayList.add(d2);
                } else {
                    C8594l.m46779m();
                    throw null;
                }
            }
            ViewPropertyAnimator duration = view.animate().setDuration(mo4855m());
            duration.translationX(((float) bVar.mo30310e()) - ((float) bVar.mo30306a()));
            duration.translationY(((float) bVar.mo30311f()) - ((float) bVar.mo30307b()));
            duration.alpha(0.0f).setListener(new C8364f(this, bVar, duration, view)).start();
        }
        if (view2 != null) {
            if (bVar.mo30308c() != null) {
                ArrayList<RecyclerView.C0792c0> arrayList2 = this.f34832r;
                RecyclerView.C0792c0 c2 = bVar.mo30308c();
                if (c2 != null) {
                    arrayList2.add(c2);
                } else {
                    C8594l.m46779m();
                    throw null;
                }
            }
            ViewPropertyAnimator animate = view2.animate();
            animate.translationX(0.0f).translationY(0.0f).setDuration(mo4855m()).alpha(1.0f).setListener(new C8365g(this, bVar, animate, view2)).start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public final void m46375h0(RecyclerView.C0792c0 c0Var, int i, int i2, int i3, int i4) {
        View view = c0Var.itemView;
        C8594l.m46768b(view, "holder.itemView");
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        this.f34830p.add(c0Var);
        ViewPropertyAnimator animate = view.animate();
        animate.setDuration(mo4856n()).setListener(new C8366h(this, c0Var, i5, view, i6, animate)).start();
    }

    /* renamed from: j0 */
    private final void m46376j0(List<? extends RecyclerView.C0792c0> list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((RecyclerView.C0792c0) list.get(size)).itemView.animate().cancel();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public final void m46377k0() {
        if (!mo4858p()) {
            mo4851i();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public final void m46378l0(RecyclerView.C0792c0 c0Var) {
        if (c0Var instanceof C8371a) {
            ((C8371a) c0Var).mo30336d(c0Var, new C8361c(this, c0Var));
        } else {
            mo30295f0(c0Var);
        }
        this.f34829o.add(c0Var);
    }

    /* renamed from: m0 */
    private final void m46379m0(RecyclerView.C0792c0 c0Var) {
        if (c0Var instanceof C8371a) {
            ((C8371a) c0Var).mo30334b(c0Var, new C8362d(this, c0Var));
        } else {
            mo30296i0(c0Var);
        }
        this.f34831q.add(c0Var);
    }

    /* renamed from: n0 */
    private final void m46380n0(List<C8360b> list, RecyclerView.C0792c0 c0Var) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C8360b bVar = list.get(size);
                if (m46382p0(bVar, c0Var) && bVar.mo30309d() == null && bVar.mo30308c() == null) {
                    list.remove(bVar);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: o0 */
    private final void m46381o0(C8360b bVar) {
        if (bVar.mo30309d() != null) {
            m46382p0(bVar, bVar.mo30309d());
        }
        if (bVar.mo30308c() != null) {
            m46382p0(bVar, bVar.mo30308c());
        }
    }

    /* renamed from: p0 */
    private final boolean m46382p0(C8360b bVar, RecyclerView.C0792c0 c0Var) {
        boolean z = false;
        if (bVar.mo30308c() == c0Var) {
            bVar.mo30312g((RecyclerView.C0792c0) null);
        } else if (bVar.mo30309d() != c0Var) {
            return false;
        } else {
            bVar.mo30313h((RecyclerView.C0792c0) null);
            z = true;
        }
        if (c0Var != null) {
            View view = c0Var.itemView;
            C8594l.m46768b(view, "item!!.itemView");
            view.setAlpha(1.0f);
            View view2 = c0Var.itemView;
            C8594l.m46768b(view2, "item.itemView");
            view2.setTranslationX(0.0f);
            View view3 = c0Var.itemView;
            C8594l.m46768b(view3, "item.itemView");
            view3.setTranslationY(0.0f);
            mo5414H(c0Var, z);
            return true;
        }
        C8594l.m46779m();
        throw null;
    }

    /* renamed from: u0 */
    private final void m46383u0(RecyclerView.C0792c0 c0Var) {
        View view = c0Var.itemView;
        C8594l.m46768b(view, "holder.itemView");
        C8372a.m46422a(view);
        if (c0Var instanceof C8371a) {
            ((C8371a) c0Var).mo30333a(c0Var);
        } else {
            mo30301v0(c0Var);
        }
    }

    /* renamed from: w0 */
    private final void m46384w0(RecyclerView.C0792c0 c0Var) {
        View view = c0Var.itemView;
        C8594l.m46768b(view, "holder.itemView");
        C8372a.m46422a(view);
        if (c0Var instanceof C8371a) {
            ((C8371a) c0Var).mo30335c(c0Var);
        } else {
            mo30302x0(c0Var);
        }
    }

    /* renamed from: B */
    public boolean mo5238B(RecyclerView.C0792c0 c0Var) {
        C8594l.m46772f(c0Var, "holder");
        mo4852j(c0Var);
        m46383u0(c0Var);
        this.f34823i.add(c0Var);
        return true;
    }

    /* renamed from: C */
    public boolean mo5239C(RecyclerView.C0792c0 c0Var, RecyclerView.C0792c0 c0Var2, int i, int i2, int i3, int i4) {
        C8594l.m46772f(c0Var, "oldHolder");
        C8594l.m46772f(c0Var2, "newHolder");
        if (c0Var == c0Var2) {
            return mo5240D(c0Var, i, i2, i3, i4);
        }
        View view = c0Var.itemView;
        C8594l.m46768b(view, "oldHolder.itemView");
        float translationX = view.getTranslationX();
        View view2 = c0Var.itemView;
        C8594l.m46768b(view2, "oldHolder.itemView");
        float translationY = view2.getTranslationY();
        View view3 = c0Var.itemView;
        C8594l.m46768b(view3, "oldHolder.itemView");
        float alpha = view3.getAlpha();
        mo4852j(c0Var);
        View view4 = c0Var.itemView;
        C8594l.m46768b(view4, "oldHolder.itemView");
        view4.setTranslationX(translationX);
        View view5 = c0Var.itemView;
        C8594l.m46768b(view5, "oldHolder.itemView");
        view5.setTranslationY(translationY);
        View view6 = c0Var.itemView;
        C8594l.m46768b(view6, "oldHolder.itemView");
        view6.setAlpha(alpha);
        mo4852j(c0Var2);
        View view7 = c0Var2.itemView;
        C8594l.m46768b(view7, "newHolder.itemView");
        view7.setTranslationX(-((float) ((int) (((float) (i3 - i)) - translationX))));
        View view8 = c0Var2.itemView;
        C8594l.m46768b(view8, "newHolder.itemView");
        view8.setTranslationY(-((float) ((int) (((float) (i4 - i2)) - translationY))));
        View view9 = c0Var2.itemView;
        C8594l.m46768b(view9, "newHolder.itemView");
        view9.setAlpha(0.0f);
        this.f34825k.add(new C8360b(c0Var, c0Var2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: D */
    public boolean mo5240D(RecyclerView.C0792c0 c0Var, int i, int i2, int i3, int i4) {
        C8594l.m46772f(c0Var, "holder");
        View view = c0Var.itemView;
        C8594l.m46768b(view, "holder.itemView");
        View view2 = c0Var.itemView;
        C8594l.m46768b(view2, "holder.itemView");
        int translationX = i + ((int) view2.getTranslationX());
        View view3 = c0Var.itemView;
        C8594l.m46768b(view3, "holder.itemView");
        int translationY = i2 + ((int) view3.getTranslationY());
        mo4852j(c0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo5416J(c0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-((float) i5));
        }
        if (i6 != 0) {
            view.setTranslationY(-((float) i6));
        }
        this.f34824j.add(new C8363e(c0Var, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: E */
    public boolean mo5241E(RecyclerView.C0792c0 c0Var) {
        C8594l.m46772f(c0Var, "holder");
        mo4852j(c0Var);
        m46384w0(c0Var);
        this.f34822h.add(c0Var);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public abstract void mo30295f0(RecyclerView.C0792c0 c0Var);

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public abstract void mo30296i0(RecyclerView.C0792c0 c0Var);

    /* renamed from: j */
    public void mo4852j(RecyclerView.C0792c0 c0Var) {
        C8594l.m46772f(c0Var, "item");
        View view = c0Var.itemView;
        C8594l.m46768b(view, "item.itemView");
        view.animate().cancel();
        int size = this.f34824j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C8363e eVar = this.f34824j.get(size);
            C8594l.m46768b(eVar, "pendingMoves[i]");
            if (eVar.mo30321c() == c0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo5416J(c0Var);
                this.f34824j.remove(size);
            }
        }
        m46380n0(this.f34825k, c0Var);
        if (this.f34822h.remove(c0Var)) {
            View view2 = c0Var.itemView;
            C8594l.m46768b(view2, "item.itemView");
            C8372a.m46422a(view2);
            mo5418L(c0Var);
        }
        if (this.f34823i.remove(c0Var)) {
            View view3 = c0Var.itemView;
            C8594l.m46768b(view3, "item.itemView");
            C8372a.m46422a(view3);
            mo5412F(c0Var);
        }
        int size2 = this.f34828n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<C8360b> arrayList = this.f34828n.get(size2);
            C8594l.m46768b(arrayList, "changesList[i]");
            ArrayList arrayList2 = arrayList;
            m46380n0(arrayList2, c0Var);
            if (arrayList2.isEmpty()) {
                this.f34828n.remove(size2);
            }
        }
        int size3 = this.f34827m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<C8363e> arrayList3 = this.f34827m.get(size3);
            C8594l.m46768b(arrayList3, "movesList[i]");
            ArrayList arrayList4 = arrayList3;
            int size4 = arrayList4.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                Object obj = arrayList4.get(size4);
                C8594l.m46768b(obj, "moves[j]");
                if (((C8363e) obj).mo30321c() == c0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo5416J(c0Var);
                    arrayList4.remove(size4);
                    if (arrayList4.isEmpty()) {
                        this.f34827m.remove(size3);
                    }
                }
            }
        }
        int size5 = this.f34826l.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList<RecyclerView.C0792c0> arrayList5 = this.f34826l.get(size5);
                C8594l.m46768b(arrayList5, "additionsList[i]");
                ArrayList arrayList6 = arrayList5;
                if (arrayList6.remove(c0Var)) {
                    View view4 = c0Var.itemView;
                    C8594l.m46768b(view4, "item.itemView");
                    C8372a.m46422a(view4);
                    mo5412F(c0Var);
                    if (arrayList6.isEmpty()) {
                        this.f34826l.remove(size5);
                    }
                }
            } else {
                this.f34831q.remove(c0Var);
                this.f34829o.remove(c0Var);
                this.f34832r.remove(c0Var);
                this.f34830p.remove(c0Var);
                m46377k0();
                return;
            }
        }
    }

    /* renamed from: k */
    public void mo4853k() {
        int size = this.f34824j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C8363e eVar = this.f34824j.get(size);
            C8594l.m46768b(eVar, "pendingMoves[i]");
            C8363e eVar2 = eVar;
            View view = eVar2.mo30321c().itemView;
            C8594l.m46768b(view, "item.holder.itemView");
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo5416J(eVar2.mo30321c());
            this.f34824j.remove(size);
        }
        for (int size2 = this.f34822h.size() - 1; size2 >= 0; size2--) {
            RecyclerView.C0792c0 c0Var = this.f34822h.get(size2);
            C8594l.m46768b(c0Var, "pendingRemovals[i]");
            mo5418L(c0Var);
            this.f34822h.remove(size2);
        }
        int size3 = this.f34823i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C0792c0 c0Var2 = this.f34823i.get(size3);
            C8594l.m46768b(c0Var2, "pendingAdditions[i]");
            RecyclerView.C0792c0 c0Var3 = c0Var2;
            View view2 = c0Var3.itemView;
            C8594l.m46768b(view2, "item.itemView");
            C8372a.m46422a(view2);
            mo5412F(c0Var3);
            this.f34823i.remove(size3);
        }
        for (int size4 = this.f34825k.size() - 1; size4 >= 0; size4--) {
            C8360b bVar = this.f34825k.get(size4);
            C8594l.m46768b(bVar, "pendingChanges[i]");
            m46381o0(bVar);
        }
        this.f34825k.clear();
        if (mo4858p()) {
            for (int size5 = this.f34827m.size() - 1; size5 >= 0; size5--) {
                ArrayList<C8363e> arrayList = this.f34827m.get(size5);
                C8594l.m46768b(arrayList, "movesList[i]");
                ArrayList arrayList2 = arrayList;
                for (int size6 = arrayList2.size() - 1; size6 >= 0; size6--) {
                    Object obj = arrayList2.get(size6);
                    C8594l.m46768b(obj, "moves[j]");
                    C8363e eVar3 = (C8363e) obj;
                    View view3 = eVar3.mo30321c().itemView;
                    C8594l.m46768b(view3, "item.itemView");
                    view3.setTranslationY(0.0f);
                    view3.setTranslationX(0.0f);
                    mo5416J(eVar3.mo30321c());
                    arrayList2.remove(size6);
                    if (arrayList2.isEmpty()) {
                        this.f34827m.remove(arrayList2);
                    }
                }
            }
            for (int size7 = this.f34826l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.C0792c0> arrayList3 = this.f34826l.get(size7);
                C8594l.m46768b(arrayList3, "additionsList[i]");
                ArrayList arrayList4 = arrayList3;
                for (int size8 = arrayList4.size() - 1; size8 >= 0; size8--) {
                    Object obj2 = arrayList4.get(size8);
                    C8594l.m46768b(obj2, "additions[j]");
                    RecyclerView.C0792c0 c0Var4 = (RecyclerView.C0792c0) obj2;
                    View view4 = c0Var4.itemView;
                    C8594l.m46768b(view4, "item.itemView");
                    view4.setAlpha(1.0f);
                    mo5412F(c0Var4);
                    if (size8 < arrayList4.size()) {
                        arrayList4.remove(size8);
                    }
                    if (arrayList4.isEmpty()) {
                        this.f34826l.remove(arrayList4);
                    }
                }
            }
            for (int size9 = this.f34828n.size() - 1; size9 >= 0; size9--) {
                ArrayList<C8360b> arrayList5 = this.f34828n.get(size9);
                C8594l.m46768b(arrayList5, "changesList[i]");
                ArrayList arrayList6 = arrayList5;
                for (int size10 = arrayList6.size() - 1; size10 >= 0; size10--) {
                    Object obj3 = arrayList6.get(size10);
                    C8594l.m46768b(obj3, "changes[j]");
                    m46381o0((C8360b) obj3);
                    if (arrayList6.isEmpty()) {
                        this.f34828n.remove(arrayList6);
                    }
                }
            }
            m46376j0(this.f34831q);
            m46376j0(this.f34830p);
            m46376j0(this.f34829o);
            m46376j0(this.f34832r);
            mo4851i();
        }
    }

    /* renamed from: p */
    public boolean mo4858p() {
        if ((!this.f34823i.isEmpty()) || (!this.f34825k.isEmpty()) || (!this.f34824j.isEmpty()) || (!this.f34822h.isEmpty()) || (!this.f34830p.isEmpty()) || (!this.f34831q.isEmpty()) || (!this.f34829o.isEmpty()) || (!this.f34832r.isEmpty()) || (!this.f34827m.isEmpty()) || (!this.f34826l.isEmpty()) || (!this.f34828n.isEmpty())) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public final ArrayList<RecyclerView.C0792c0> mo30297q0() {
        return this.f34829o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r0 */
    public final long mo30298r0(RecyclerView.C0792c0 c0Var) {
        C8594l.m46772f(c0Var, "holder");
        return Math.abs((((long) c0Var.getAdapterPosition()) * mo4854l()) / ((long) 4));
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public final ArrayList<RecyclerView.C0792c0> mo30299s0() {
        return this.f34831q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t0 */
    public final long mo30300t0(RecyclerView.C0792c0 c0Var) {
        C8594l.m46772f(c0Var, "holder");
        return Math.abs((((long) c0Var.getOldPosition()) * mo4857o()) / ((long) 4));
    }

    /* renamed from: v */
    public void mo4864v() {
        boolean z = !this.f34822h.isEmpty();
        boolean z2 = !this.f34824j.isEmpty();
        boolean z3 = !this.f34825k.isEmpty();
        boolean z4 = !this.f34823i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.C0792c0> it = this.f34822h.iterator();
            while (it.hasNext()) {
                RecyclerView.C0792c0 next = it.next();
                C8594l.m46768b(next, "holder");
                m46379m0(next);
            }
            this.f34822h.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList(this.f34824j);
                this.f34827m.add(arrayList);
                this.f34824j.clear();
                C8369k kVar = new C8369k(this, arrayList);
                if (z) {
                    View view = ((C8363e) arrayList.get(0)).mo30321c().itemView;
                    C8594l.m46768b(view, "moves[0].holder.itemView");
                    view.postOnAnimationDelayed(kVar, mo4857o());
                } else {
                    kVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList(this.f34825k);
                this.f34828n.add(arrayList2);
                this.f34825k.clear();
                C8368j jVar = new C8368j(this, arrayList2);
                if (z) {
                    RecyclerView.C0792c0 d = ((C8360b) arrayList2.get(0)).mo30309d();
                    if (d != null) {
                        d.itemView.postOnAnimationDelayed(jVar, mo4857o());
                    } else {
                        C8594l.m46779m();
                        throw null;
                    }
                } else {
                    jVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList(this.f34823i);
                this.f34826l.add(arrayList3);
                this.f34823i.clear();
                C8367i iVar = new C8367i(this, arrayList3);
                if (z || z2 || z3) {
                    long j = 0;
                    long o = z ? mo4857o() : 0;
                    long n = z2 ? mo4856n() : 0;
                    if (z3) {
                        j = mo4855m();
                    }
                    long b = o + C8392f.m46451b(n, j);
                    View view2 = ((RecyclerView.C0792c0) arrayList3.get(0)).itemView;
                    C8594l.m46768b(view2, "additions[0].itemView");
                    view2.postOnAnimationDelayed(iVar, b);
                    return;
                }
                iVar.run();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public abstract void mo30301v0(RecyclerView.C0792c0 c0Var);

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public void mo30302x0(RecyclerView.C0792c0 c0Var) {
        C8594l.m46772f(c0Var, "holder");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public final void mo30303y0(Interpolator interpolator) {
        C8594l.m46772f(interpolator, "<set-?>");
    }

    /* renamed from: h.a.b.a.a$b */
    /* compiled from: BaseItemAnimator.kt */
    private static final class C8360b {

        /* renamed from: a */
        private RecyclerView.C0792c0 f34833a;

        /* renamed from: b */
        private RecyclerView.C0792c0 f34834b;

        /* renamed from: c */
        private int f34835c;

        /* renamed from: d */
        private int f34836d;

        /* renamed from: e */
        private int f34837e;

        /* renamed from: f */
        private int f34838f;

        private C8360b(RecyclerView.C0792c0 c0Var, RecyclerView.C0792c0 c0Var2) {
            this.f34833a = c0Var;
            this.f34834b = c0Var2;
        }

        /* renamed from: a */
        public final int mo30306a() {
            return this.f34835c;
        }

        /* renamed from: b */
        public final int mo30307b() {
            return this.f34836d;
        }

        /* renamed from: c */
        public final RecyclerView.C0792c0 mo30308c() {
            return this.f34834b;
        }

        /* renamed from: d */
        public final RecyclerView.C0792c0 mo30309d() {
            return this.f34833a;
        }

        /* renamed from: e */
        public final int mo30310e() {
            return this.f34837e;
        }

        /* renamed from: f */
        public final int mo30311f() {
            return this.f34838f;
        }

        /* renamed from: g */
        public final void mo30312g(RecyclerView.C0792c0 c0Var) {
            this.f34834b = c0Var;
        }

        /* renamed from: h */
        public final void mo30313h(RecyclerView.C0792c0 c0Var) {
            this.f34833a = c0Var;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f34833a + ", newHolder=" + this.f34834b + ", fromX=" + this.f34835c + ", fromY=" + this.f34836d + ", toX=" + this.f34837e + ", toY=" + this.f34838f + '}';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C8360b(RecyclerView.C0792c0 c0Var, RecyclerView.C0792c0 c0Var2, int i, int i2, int i3, int i4) {
            this(c0Var, c0Var2);
            C8594l.m46772f(c0Var, "oldHolder");
            C8594l.m46772f(c0Var2, "newHolder");
            this.f34835c = i;
            this.f34836d = i2;
            this.f34837e = i3;
            this.f34838f = i4;
        }
    }
}
