package p360h.p361a.p365b.p366a;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import p360h.p361a.p365b.p366a.C8358a;
import p369i.p387z.p389d.C8594l;

/* renamed from: h.a.b.a.b */
/* compiled from: FadeInUpAnimator.kt */
public class C8370b extends C8358a {
    public C8370b(Interpolator interpolator) {
        C8594l.m46772f(interpolator, "interpolator");
        mo30303y0(interpolator);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public void mo30295f0(RecyclerView.C0792c0 c0Var) {
        C8594l.m46772f(c0Var, "holder");
        ViewPropertyAnimator animate = c0Var.itemView.animate();
        animate.translationY(0.0f);
        animate.alpha(1.0f);
        animate.setDuration(mo4854l());
        animate.setInterpolator(animate.getInterpolator());
        animate.setListener(new C8358a.C8361c(this, c0Var));
        animate.setStartDelay(mo30298r0(c0Var));
        animate.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public void mo30296i0(RecyclerView.C0792c0 c0Var) {
        C8594l.m46772f(c0Var, "holder");
        ViewPropertyAnimator animate = c0Var.itemView.animate();
        View view = c0Var.itemView;
        C8594l.m46768b(view, "holder.itemView");
        animate.translationY(((float) view.getHeight()) * 0.25f);
        animate.alpha(0.0f);
        animate.setDuration(mo4857o());
        animate.setInterpolator(animate.getInterpolator());
        animate.setListener(new C8358a.C8362d(this, c0Var));
        animate.setStartDelay(mo30300t0(c0Var));
        animate.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public void mo30301v0(RecyclerView.C0792c0 c0Var) {
        C8594l.m46772f(c0Var, "holder");
        View view = c0Var.itemView;
        C8594l.m46768b(view, "holder.itemView");
        View view2 = c0Var.itemView;
        C8594l.m46768b(view2, "holder.itemView");
        view.setTranslationY(((float) view2.getHeight()) * 0.25f);
        View view3 = c0Var.itemView;
        C8594l.m46768b(view3, "holder.itemView");
        view3.setAlpha(0.0f);
    }
}
