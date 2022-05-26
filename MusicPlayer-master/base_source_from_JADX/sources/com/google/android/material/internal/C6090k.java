package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.C1160y;
import androidx.transition.Transition;
import java.util.Map;

/* renamed from: com.google.android.material.internal.k */
/* compiled from: TextScale */
public class C6090k extends Transition {

    /* renamed from: com.google.android.material.internal.k$a */
    /* compiled from: TextScale */
    class C6091a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ TextView f28535a;

        C6091a(C6090k kVar, TextView textView) {
            this.f28535a = textView;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f28535a.setScaleX(floatValue);
            this.f28535a.setScaleY(floatValue);
        }
    }

    /* renamed from: m0 */
    private void m36552m0(C1160y yVar) {
        View view = yVar.f4752b;
        if (view instanceof TextView) {
            yVar.f4751a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    /* renamed from: i */
    public void mo5889i(C1160y yVar) {
        m36552m0(yVar);
    }

    /* renamed from: l */
    public void mo5890l(C1160y yVar) {
        m36552m0(yVar);
    }

    /* renamed from: q */
    public Animator mo5892q(ViewGroup viewGroup, C1160y yVar, C1160y yVar2) {
        if (yVar == null || yVar2 == null || !(yVar.f4752b instanceof TextView)) {
            return null;
        }
        View view = yVar2.f4752b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = yVar.f4751a;
        Map<String, Object> map2 = yVar2.f4751a;
        float f = 1.0f;
        float floatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        if (map2.get("android:textscale:scale") != null) {
            f = ((Float) map2.get("android:textscale:scale")).floatValue();
        }
        if (floatValue == f) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{floatValue, f});
        ofFloat.addUpdateListener(new C6091a(this, textView));
        return ofFloat;
    }
}
