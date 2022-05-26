package p159f.p166c.p224o.p228n;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.DecelerateInterpolator;

/* renamed from: f.c.o.n.a */
/* compiled from: CircularRevealAnimator */
public class C4711a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4713b f13504a;

    /* renamed from: f.c.o.n.a$a */
    /* compiled from: CircularRevealAnimator */
    class C4712a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f13505a;

        /* renamed from: b */
        final /* synthetic */ View f13506b;

        C4712a(boolean z, View view) {
            this.f13505a = z;
            this.f13506b = view;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f13505a) {
                this.f13506b.setVisibility(0);
                if (C4711a.this.f13504a != null) {
                    C4711a.this.f13504a.mo15437t();
                    return;
                }
                return;
            }
            this.f13506b.setVisibility(8);
            if (C4711a.this.f13504a != null) {
                C4711a.this.f13504a.mo15436o();
            }
        }
    }

    /* renamed from: f.c.o.n.a$b */
    /* compiled from: CircularRevealAnimator */
    public interface C4713b {
        /* renamed from: o */
        void mo15436o();

        /* renamed from: t */
        void mo15437t();
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private void m20234b(boolean z, View view, View view2) {
        if (Build.VERSION.SDK_INT >= 21) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int width = iArr[0] + (view.getWidth() / 2);
            int height = iArr[1] + (view.getHeight() / 2);
            int[] iArr2 = new int[2];
            view2.getLocationInWindow(iArr2);
            int width2 = iArr2[0] + (view2.getWidth() / 2);
            int height2 = iArr2[1] + (view2.getHeight() / 2);
            int width3 = width < width2 ? view2.getWidth() - width : width - iArr2[0];
            int height3 = height < height2 ? view2.getHeight() - height : height - iArr2[1];
            float sqrt = (float) Math.sqrt((double) ((width3 * width3) + (height3 * height3)));
            float f = 0.0f;
            if (z) {
                f = sqrt;
                sqrt = 0.0f;
            }
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view2, width, height, sqrt, f);
            view2.setVisibility(0);
            createCircularReveal.setDuration(200);
            createCircularReveal.setInterpolator(new DecelerateInterpolator());
            createCircularReveal.addListener(new C4712a(z, view2));
            createCircularReveal.start();
        } else if (z) {
            view2.setVisibility(0);
            C4713b bVar = this.f13504a;
            if (bVar != null) {
                bVar.mo15437t();
            }
        } else {
            view2.setVisibility(8);
            C4713b bVar2 = this.f13504a;
            if (bVar2 != null) {
                bVar2.mo15436o();
            }
        }
    }

    /* renamed from: c */
    public void mo15432c(View view, View view2) {
        m20234b(false, view, view2);
    }

    /* renamed from: d */
    public void mo15433d(C4713b bVar) {
        this.f13504a = bVar;
    }

    /* renamed from: e */
    public void mo15434e(View view, View view2) {
        m20234b(true, view, view2);
    }
}
