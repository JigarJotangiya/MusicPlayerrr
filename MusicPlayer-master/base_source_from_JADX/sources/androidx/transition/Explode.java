package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class Explode extends Visibility {

    /* renamed from: S */
    private static final TimeInterpolator f4555S = new DecelerateInterpolator();

    /* renamed from: T */
    private static final TimeInterpolator f4556T = new AccelerateInterpolator();

    /* renamed from: R */
    private int[] f4557R = new int[2];

    public Explode() {
        mo5985i0(new C1107c());
    }

    /* renamed from: m0 */
    private void m6184m0(C1160y yVar) {
        View view = yVar.f4752b;
        view.getLocationOnScreen(this.f4557R);
        int[] iArr = this.f4557R;
        int i = iArr[0];
        int i2 = iArr[1];
        yVar.f4751a.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    /* renamed from: u0 */
    private static float m6185u0(float f, float f2) {
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    /* renamed from: v0 */
    private static float m6186v0(View view, int i, int i2) {
        return m6185u0((float) Math.max(i, view.getWidth() - i), (float) Math.max(i2, view.getHeight() - i2));
    }

    /* renamed from: w0 */
    private void m6187w0(View view, Rect rect, int[] iArr) {
        int i;
        int i2;
        View view2 = view;
        view2.getLocationOnScreen(this.f4557R);
        int[] iArr2 = this.f4557R;
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        Rect u = mo5997u();
        if (u == null) {
            i2 = (view.getWidth() / 2) + i3 + Math.round(view.getTranslationX());
            i = (view.getHeight() / 2) + i4 + Math.round(view.getTranslationY());
        } else {
            int centerX = u.centerX();
            i = u.centerY();
            i2 = centerX;
        }
        float centerX2 = (float) (rect.centerX() - i2);
        float centerY = (float) (rect.centerY() - i);
        if (centerX2 == 0.0f && centerY == 0.0f) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float u0 = m6185u0(centerX2, centerY);
        float v0 = m6186v0(view2, i2 - i3, i - i4);
        iArr[0] = Math.round((centerX2 / u0) * v0);
        iArr[1] = Math.round(v0 * (centerY / u0));
    }

    /* renamed from: i */
    public void mo5889i(C1160y yVar) {
        super.mo5889i(yVar);
        m6184m0(yVar);
    }

    /* renamed from: l */
    public void mo5890l(C1160y yVar) {
        super.mo5890l(yVar);
        m6184m0(yVar);
    }

    /* renamed from: p0 */
    public Animator mo5951p0(ViewGroup viewGroup, View view, C1160y yVar, C1160y yVar2) {
        if (yVar2 == null) {
            return null;
        }
        Rect rect = (Rect) yVar2.f4751a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        m6187w0(viewGroup, rect, this.f4557R);
        int[] iArr = this.f4557R;
        return C1103a0.m6345a(view, yVar2, rect.left, rect.top, translationX + ((float) iArr[0]), translationY + ((float) iArr[1]), translationX, translationY, f4555S, this);
    }

    /* renamed from: r0 */
    public Animator mo5952r0(ViewGroup viewGroup, View view, C1160y yVar, C1160y yVar2) {
        float f;
        float f2;
        if (yVar == null) {
            return null;
        }
        Rect rect = (Rect) yVar.f4751a.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) yVar.f4752b.getTag(C1143p.transition_position);
        if (iArr != null) {
            f2 = ((float) (iArr[0] - rect.left)) + translationX;
            f = ((float) (iArr[1] - rect.top)) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f2 = translationX;
            f = translationY;
        }
        m6187w0(viewGroup, rect, this.f4557R);
        int[] iArr2 = this.f4557R;
        return C1103a0.m6345a(view, yVar, i, i2, translationX, translationY, f2 + ((float) iArr2[0]), f + ((float) iArr2[1]), f4556T, this);
    }

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo5985i0(new C1107c());
    }
}
