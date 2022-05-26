package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class ChangeScroll extends Transition {

    /* renamed from: P */
    private static final String[] f4524P = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll() {
    }

    /* renamed from: m0 */
    private void m6155m0(C1160y yVar) {
        yVar.f4751a.put("android:changeScroll:x", Integer.valueOf(yVar.f4752b.getScrollX()));
        yVar.f4751a.put("android:changeScroll:y", Integer.valueOf(yVar.f4752b.getScrollY()));
    }

    /* renamed from: I */
    public String[] mo5888I() {
        return f4524P;
    }

    /* renamed from: i */
    public void mo5889i(C1160y yVar) {
        m6155m0(yVar);
    }

    /* renamed from: l */
    public void mo5890l(C1160y yVar) {
        m6155m0(yVar);
    }

    /* renamed from: q */
    public Animator mo5892q(ViewGroup viewGroup, C1160y yVar, C1160y yVar2) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (yVar == null || yVar2 == null) {
            return null;
        }
        View view = yVar2.f4752b;
        int intValue = ((Integer) yVar.f4751a.get("android:changeScroll:x")).intValue();
        int intValue2 = ((Integer) yVar2.f4751a.get("android:changeScroll:x")).intValue();
        int intValue3 = ((Integer) yVar.f4751a.get("android:changeScroll:y")).intValue();
        int intValue4 = ((Integer) yVar2.f4751a.get("android:changeScroll:y")).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", new int[]{intValue, intValue2});
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", new int[]{intValue3, intValue4});
        }
        return C1158x.m6513c(objectAnimator, objectAnimator2);
    }

    public ChangeScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
