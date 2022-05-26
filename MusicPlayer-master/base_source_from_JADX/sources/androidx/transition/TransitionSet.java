package androidx.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.p003d.C0533g;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Iterator;

public class TransitionSet extends Transition {

    /* renamed from: P */
    private ArrayList<Transition> f4615P = new ArrayList<>();

    /* renamed from: Q */
    private boolean f4616Q = true;

    /* renamed from: R */
    int f4617R;

    /* renamed from: S */
    boolean f4618S = false;

    /* renamed from: T */
    private int f4619T = 0;

    /* renamed from: androidx.transition.TransitionSet$a */
    class C1096a extends C1153u {

        /* renamed from: a */
        final /* synthetic */ Transition f4620a;

        C1096a(TransitionSet transitionSet, Transition transition) {
            this.f4620a = transition;
        }

        /* renamed from: c */
        public void mo5921c(Transition transition) {
            this.f4620a.mo5976c0();
            transition.mo5971X(this);
        }
    }

    /* renamed from: androidx.transition.TransitionSet$b */
    static class C1097b extends C1153u {

        /* renamed from: a */
        TransitionSet f4621a;

        C1097b(TransitionSet transitionSet) {
            this.f4621a = transitionSet;
        }

        /* renamed from: a */
        public void mo6006a(Transition transition) {
            TransitionSet transitionSet = this.f4621a;
            if (!transitionSet.f4618S) {
                transitionSet.mo5988k0();
                this.f4621a.f4618S = true;
            }
        }

        /* renamed from: c */
        public void mo5921c(Transition transition) {
            TransitionSet transitionSet = this.f4621a;
            int i = transitionSet.f4617R - 1;
            transitionSet.f4617R = i;
            if (i == 0) {
                transitionSet.f4618S = false;
                transitionSet.mo5994s();
            }
            transition.mo5971X(this);
        }
    }

    public TransitionSet() {
    }

    /* renamed from: p0 */
    private void m6284p0(Transition transition) {
        this.f4615P.add(transition);
        transition.f4604x = this;
    }

    /* renamed from: y0 */
    private void m6285y0() {
        C1097b bVar = new C1097b(this);
        Iterator<Transition> it = this.f4615P.iterator();
        while (it.hasNext()) {
            it.next().mo5973a(bVar);
        }
        this.f4617R = this.f4615P.size();
    }

    /* renamed from: V */
    public void mo5969V(View view) {
        super.mo5969V(view);
        int size = this.f4615P.size();
        for (int i = 0; i < size; i++) {
            this.f4615P.get(i).mo5969V(view);
        }
    }

    /* renamed from: a0 */
    public void mo5974a0(View view) {
        super.mo5974a0(view);
        int size = this.f4615P.size();
        for (int i = 0; i < size; i++) {
            this.f4615P.get(i).mo5974a0(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public void mo5976c0() {
        if (this.f4615P.isEmpty()) {
            mo5988k0();
            mo5994s();
            return;
        }
        m6285y0();
        if (!this.f4616Q) {
            for (int i = 1; i < this.f4615P.size(); i++) {
                this.f4615P.get(i - 1).mo5973a(new C1096a(this, this.f4615P.get(i)));
            }
            Transition transition = this.f4615P.get(0);
            if (transition != null) {
                transition.mo5976c0();
                return;
            }
            return;
        }
        Iterator<Transition> it = this.f4615P.iterator();
        while (it.hasNext()) {
            it.next().mo5976c0();
        }
    }

    /* renamed from: d0 */
    public /* bridge */ /* synthetic */ Transition mo5978d0(long j) {
        mo6014u0(j);
        return this;
    }

    /* renamed from: e0 */
    public void mo5979e0(Transition.C1094e eVar) {
        super.mo5979e0(eVar);
        this.f4619T |= 8;
        int size = this.f4615P.size();
        for (int i = 0; i < size; i++) {
            this.f4615P.get(i).mo5979e0(eVar);
        }
    }

    /* renamed from: h0 */
    public void mo5984h0(PathMotion pathMotion) {
        super.mo5984h0(pathMotion);
        this.f4619T |= 4;
        if (this.f4615P != null) {
            for (int i = 0; i < this.f4615P.size(); i++) {
                this.f4615P.get(i).mo5984h0(pathMotion);
            }
        }
    }

    /* renamed from: i */
    public void mo5889i(C1160y yVar) {
        if (mo5968M(yVar.f4752b)) {
            Iterator<Transition> it = this.f4615P.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.mo5968M(yVar.f4752b)) {
                    next.mo5889i(yVar);
                    yVar.f4753c.add(next);
                }
            }
        }
    }

    /* renamed from: i0 */
    public void mo5985i0(C1157w wVar) {
        super.mo5985i0(wVar);
        this.f4619T |= 2;
        int size = this.f4615P.size();
        for (int i = 0; i < size; i++) {
            this.f4615P.get(i).mo5985i0(wVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo5987k(C1160y yVar) {
        super.mo5987k(yVar);
        int size = this.f4615P.size();
        for (int i = 0; i < size; i++) {
            this.f4615P.get(i).mo5987k(yVar);
        }
    }

    /* renamed from: l */
    public void mo5890l(C1160y yVar) {
        if (mo5968M(yVar.f4752b)) {
            Iterator<Transition> it = this.f4615P.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.mo5968M(yVar.f4752b)) {
                    next.mo5890l(yVar);
                    yVar.f4753c.add(next);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public String mo5989l0(String str) {
        String l0 = super.mo5989l0(str);
        for (int i = 0; i < this.f4615P.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(l0);
            sb.append("\n");
            sb.append(this.f4615P.get(i).mo5989l0(str + "  "));
            l0 = sb.toString();
        }
        return l0;
    }

    /* renamed from: m0 */
    public TransitionSet mo5973a(Transition.C1095f fVar) {
        super.mo5973a(fVar);
        return this;
    }

    /* renamed from: n0 */
    public TransitionSet mo5975b(View view) {
        for (int i = 0; i < this.f4615P.size(); i++) {
            this.f4615P.get(i).mo5975b(view);
        }
        super.mo5975b(view);
        return this;
    }

    /* renamed from: o */
    public Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.f4615P = new ArrayList<>();
        int size = this.f4615P.size();
        for (int i = 0; i < size; i++) {
            transitionSet.m6284p0(this.f4615P.get(i).clone());
        }
        return transitionSet;
    }

    /* renamed from: o0 */
    public TransitionSet mo6009o0(Transition transition) {
        m6284p0(transition);
        long j = this.f4589i;
        if (j >= 0) {
            transition.mo5978d0(j);
        }
        if ((this.f4619T & 1) != 0) {
            transition.mo5980f0(mo5999w());
        }
        if ((this.f4619T & 2) != 0) {
            transition.mo5985i0(mo5960B());
        }
        if ((this.f4619T & 4) != 0) {
            transition.mo5984h0(mo5959A());
        }
        if ((this.f4619T & 8) != 0) {
            transition.mo5979e0(mo5998v());
        }
        return this;
    }

    /* renamed from: q0 */
    public Transition mo6010q0(int i) {
        if (i < 0 || i >= this.f4615P.size()) {
            return null;
        }
        return this.f4615P.get(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo5993r(ViewGroup viewGroup, C1161z zVar, C1161z zVar2, ArrayList<C1160y> arrayList, ArrayList<C1160y> arrayList2) {
        long D = mo5961D();
        int size = this.f4615P.size();
        for (int i = 0; i < size; i++) {
            Transition transition = this.f4615P.get(i);
            if (D > 0 && (this.f4616Q || i == 0)) {
                long D2 = transition.mo5961D();
                if (D2 > 0) {
                    transition.mo5986j0(D2 + D);
                } else {
                    transition.mo5986j0(D);
                }
            }
            transition.mo5993r(viewGroup, zVar, zVar2, arrayList, arrayList2);
        }
    }

    /* renamed from: r0 */
    public int mo6011r0() {
        return this.f4615P.size();
    }

    /* renamed from: s0 */
    public TransitionSet mo5971X(Transition.C1095f fVar) {
        super.mo5971X(fVar);
        return this;
    }

    /* renamed from: t0 */
    public TransitionSet mo5972Z(View view) {
        for (int i = 0; i < this.f4615P.size(); i++) {
            this.f4615P.get(i).mo5972Z(view);
        }
        super.mo5972Z(view);
        return this;
    }

    /* renamed from: u0 */
    public TransitionSet mo6014u0(long j) {
        ArrayList<Transition> arrayList;
        super.mo5978d0(j);
        if (this.f4589i >= 0 && (arrayList = this.f4615P) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f4615P.get(i).mo5978d0(j);
            }
        }
        return this;
    }

    /* renamed from: v0 */
    public TransitionSet mo5980f0(TimeInterpolator timeInterpolator) {
        this.f4619T |= 1;
        ArrayList<Transition> arrayList = this.f4615P;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f4615P.get(i).mo5980f0(timeInterpolator);
            }
        }
        super.mo5980f0(timeInterpolator);
        return this;
    }

    /* renamed from: w0 */
    public TransitionSet mo6016w0(int i) {
        if (i == 0) {
            this.f4616Q = true;
        } else if (i == 1) {
            this.f4616Q = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    /* renamed from: x0 */
    public TransitionSet mo5986j0(long j) {
        super.mo5986j0(j);
        return this;
    }

    @SuppressLint({"RestrictedApi"})
    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1151t.f4735g);
        mo6016w0(C0533g.m3248g(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }
}
