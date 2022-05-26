package p159f.p243f.p245b.p304b.p317y;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C1160y;
import androidx.transition.Visibility;
import java.util.ArrayList;
import java.util.List;
import p159f.p243f.p245b.p304b.p305m.C7501a;
import p159f.p243f.p245b.p304b.p305m.C7502b;
import p159f.p243f.p245b.p304b.p317y.C7576f;

/* renamed from: f.f.b.b.y.c */
/* compiled from: MaterialVisibility */
abstract class C7572c<P extends C7576f> extends Visibility {

    /* renamed from: R */
    private final P f32932R;

    /* renamed from: S */
    private C7576f f32933S;

    /* renamed from: T */
    private final List<C7576f> f32934T = new ArrayList();

    protected C7572c(P p, C7576f fVar) {
        this.f32932R = p;
        this.f32933S = fVar;
    }

    /* renamed from: u0 */
    private static void m42300u0(List<Animator> list, C7576f fVar, ViewGroup viewGroup, View view, boolean z) {
        Animator animator;
        if (fVar != null) {
            if (z) {
                animator = fVar.mo28564a(viewGroup, view);
            } else {
                animator = fVar.mo28565b(viewGroup, view);
            }
            if (animator != null) {
                list.add(animator);
            }
        }
    }

    /* renamed from: v0 */
    private Animator m42301v0(ViewGroup viewGroup, View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        m42300u0(arrayList, this.f32932R, viewGroup, view, z);
        m42300u0(arrayList, this.f32933S, viewGroup, view, z);
        for (C7576f u0 : this.f32934T) {
            m42300u0(arrayList, u0, viewGroup, view, z);
        }
        m42302z0(viewGroup.getContext(), z);
        C7502b.m41943a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: z0 */
    private void m42302z0(Context context, boolean z) {
        C7575e.m42319g(this, context, mo28568x0(z));
        C7575e.m42320h(this, context, mo28569y0(z), mo28570w0(z));
    }

    /* renamed from: p0 */
    public Animator mo5951p0(ViewGroup viewGroup, View view, C1160y yVar, C1160y yVar2) {
        return m42301v0(viewGroup, view, true);
    }

    /* renamed from: r0 */
    public Animator mo5952r0(ViewGroup viewGroup, View view, C1160y yVar, C1160y yVar2) {
        return m42301v0(viewGroup, view, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public TimeInterpolator mo28570w0(boolean z) {
        return C7501a.f32700b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public abstract int mo28568x0(boolean z);

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public abstract int mo28569y0(boolean z);
}
