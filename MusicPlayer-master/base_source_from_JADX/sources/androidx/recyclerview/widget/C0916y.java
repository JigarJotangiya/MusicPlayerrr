package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.y */
/* compiled from: SimpleItemAnimator */
public abstract class C0916y extends RecyclerView.C0803m {

    /* renamed from: g */
    boolean f4062g = true;

    /* renamed from: B */
    public abstract boolean mo5238B(RecyclerView.C0792c0 c0Var);

    /* renamed from: C */
    public abstract boolean mo5239C(RecyclerView.C0792c0 c0Var, RecyclerView.C0792c0 c0Var2, int i, int i2, int i3, int i4);

    /* renamed from: D */
    public abstract boolean mo5240D(RecyclerView.C0792c0 c0Var, int i, int i2, int i3, int i4);

    /* renamed from: E */
    public abstract boolean mo5241E(RecyclerView.C0792c0 c0Var);

    /* renamed from: F */
    public final void mo5412F(RecyclerView.C0792c0 c0Var) {
        mo5420N(c0Var);
        mo4850h(c0Var);
    }

    /* renamed from: G */
    public final void mo5413G(RecyclerView.C0792c0 c0Var) {
        mo5421O(c0Var);
    }

    /* renamed from: H */
    public final void mo5414H(RecyclerView.C0792c0 c0Var, boolean z) {
        mo5422P(c0Var, z);
        mo4850h(c0Var);
    }

    /* renamed from: I */
    public final void mo5415I(RecyclerView.C0792c0 c0Var, boolean z) {
        mo5423Q(c0Var, z);
    }

    /* renamed from: J */
    public final void mo5416J(RecyclerView.C0792c0 c0Var) {
        mo5424R(c0Var);
        mo4850h(c0Var);
    }

    /* renamed from: K */
    public final void mo5417K(RecyclerView.C0792c0 c0Var) {
        mo5425S(c0Var);
    }

    /* renamed from: L */
    public final void mo5418L(RecyclerView.C0792c0 c0Var) {
        mo5426T(c0Var);
        mo4850h(c0Var);
    }

    /* renamed from: M */
    public final void mo5419M(RecyclerView.C0792c0 c0Var) {
        mo5427U(c0Var);
    }

    /* renamed from: N */
    public void mo5420N(RecyclerView.C0792c0 c0Var) {
    }

    /* renamed from: O */
    public void mo5421O(RecyclerView.C0792c0 c0Var) {
    }

    /* renamed from: P */
    public void mo5422P(RecyclerView.C0792c0 c0Var, boolean z) {
    }

    /* renamed from: Q */
    public void mo5423Q(RecyclerView.C0792c0 c0Var, boolean z) {
    }

    /* renamed from: R */
    public void mo5424R(RecyclerView.C0792c0 c0Var) {
    }

    /* renamed from: S */
    public void mo5425S(RecyclerView.C0792c0 c0Var) {
    }

    /* renamed from: T */
    public void mo5426T(RecyclerView.C0792c0 c0Var) {
    }

    /* renamed from: U */
    public void mo5427U(RecyclerView.C0792c0 c0Var) {
    }

    /* renamed from: V */
    public void mo5428V(boolean z) {
        this.f4062g = z;
    }

    /* renamed from: a */
    public boolean mo4844a(RecyclerView.C0792c0 c0Var, RecyclerView.C0803m.C0806c cVar, RecyclerView.C0803m.C0806c cVar2) {
        int i;
        int i2;
        if (cVar == null || ((i = cVar.f3650a) == (i2 = cVar2.f3650a) && cVar.f3651b == cVar2.f3651b)) {
            return mo5238B(c0Var);
        }
        return mo5240D(c0Var, i, cVar.f3651b, i2, cVar2.f3651b);
    }

    /* renamed from: b */
    public boolean mo4845b(RecyclerView.C0792c0 c0Var, RecyclerView.C0792c0 c0Var2, RecyclerView.C0803m.C0806c cVar, RecyclerView.C0803m.C0806c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f3650a;
        int i4 = cVar.f3651b;
        if (c0Var2.shouldIgnore()) {
            int i5 = cVar.f3650a;
            i = cVar.f3651b;
            i2 = i5;
        } else {
            i2 = cVar2.f3650a;
            i = cVar2.f3651b;
        }
        return mo5239C(c0Var, c0Var2, i3, i4, i2, i);
    }

    /* renamed from: c */
    public boolean mo4846c(RecyclerView.C0792c0 c0Var, RecyclerView.C0803m.C0806c cVar, RecyclerView.C0803m.C0806c cVar2) {
        int i = cVar.f3650a;
        int i2 = cVar.f3651b;
        View view = c0Var.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f3650a;
        int top = cVar2 == null ? view.getTop() : cVar2.f3651b;
        if (c0Var.isRemoved() || (i == left && i2 == top)) {
            return mo5241E(c0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo5240D(c0Var, i, i2, left, top);
    }

    /* renamed from: d */
    public boolean mo4847d(RecyclerView.C0792c0 c0Var, RecyclerView.C0803m.C0806c cVar, RecyclerView.C0803m.C0806c cVar2) {
        int i = cVar.f3650a;
        int i2 = cVar2.f3650a;
        if (i == i2 && cVar.f3651b == cVar2.f3651b) {
            mo5416J(c0Var);
            return false;
        }
        return mo5240D(c0Var, i, cVar.f3651b, i2, cVar2.f3651b);
    }

    /* renamed from: f */
    public boolean mo4848f(RecyclerView.C0792c0 c0Var) {
        return !this.f4062g || c0Var.isInvalid();
    }
}
