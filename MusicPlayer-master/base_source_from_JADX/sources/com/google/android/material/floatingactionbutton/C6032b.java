package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import p082e.p109h.p118o.C3703i;
import p159f.p243f.p245b.p304b.p305m.C7501a;
import p159f.p243f.p245b.p304b.p305m.C7502b;
import p159f.p243f.p245b.p304b.p305m.C7508h;

/* renamed from: com.google.android.material.floatingactionbutton.b */
/* compiled from: BaseMotionStrategy */
abstract class C6032b implements C6052f {

    /* renamed from: a */
    private final Context f28269a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ExtendedFloatingActionButton f28270b;

    /* renamed from: c */
    private final ArrayList<Animator.AnimatorListener> f28271c = new ArrayList<>();

    /* renamed from: d */
    private final C6031a f28272d;

    /* renamed from: e */
    private C7508h f28273e;

    /* renamed from: f */
    private C7508h f28274f;

    /* renamed from: com.google.android.material.floatingactionbutton.b$a */
    /* compiled from: BaseMotionStrategy */
    class C6033a extends Property<ExtendedFloatingActionButton, Float> {
        C6033a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(C7501a.m41940a(0.0f, 1.0f, (((float) Color.alpha(extendedFloatingActionButton.getCurrentTextColor())) / 255.0f) / ((float) Color.alpha(extendedFloatingActionButton.f28224L.getColorForState(extendedFloatingActionButton.getDrawableState(), C6032b.this.f28270b.f28224L.getDefaultColor())))));
        }

        /* renamed from: b */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
            int colorForState = extendedFloatingActionButton.f28224L.getColorForState(extendedFloatingActionButton.getDrawableState(), C6032b.this.f28270b.f28224L.getDefaultColor());
            ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (C7501a.m41940a(0.0f, ((float) Color.alpha(colorForState)) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f.floatValue() == 1.0f) {
                extendedFloatingActionButton.mo23770E(extendedFloatingActionButton.f28224L);
            } else {
                extendedFloatingActionButton.mo23770E(valueOf);
            }
        }
    }

    C6032b(ExtendedFloatingActionButton extendedFloatingActionButton, C6031a aVar) {
        this.f28270b = extendedFloatingActionButton;
        this.f28269a = extendedFloatingActionButton.getContext();
        this.f28272d = aVar;
    }

    /* renamed from: a */
    public void mo23827a() {
        this.f28272d.mo23913b();
    }

    /* renamed from: d */
    public C7508h mo23915d() {
        return this.f28274f;
    }

    /* renamed from: f */
    public void mo23823f() {
        this.f28272d.mo23913b();
    }

    /* renamed from: g */
    public final void mo23916g(C7508h hVar) {
        this.f28274f = hVar;
    }

    /* renamed from: h */
    public AnimatorSet mo23824h() {
        return mo23918l(mo23919m());
    }

    /* renamed from: i */
    public final List<Animator.AnimatorListener> mo23917i() {
        return this.f28271c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public AnimatorSet mo23918l(C7508h hVar) {
        ArrayList arrayList = new ArrayList();
        if (hVar.mo28388j("opacity")) {
            arrayList.add(hVar.mo28383f("opacity", this.f28270b, View.ALPHA));
        }
        if (hVar.mo28388j("scale")) {
            arrayList.add(hVar.mo28383f("scale", this.f28270b, View.SCALE_Y));
            arrayList.add(hVar.mo28383f("scale", this.f28270b, View.SCALE_X));
        }
        if (hVar.mo28388j("width")) {
            arrayList.add(hVar.mo28383f("width", this.f28270b, ExtendedFloatingActionButton.f28209N));
        }
        if (hVar.mo28388j("height")) {
            arrayList.add(hVar.mo28383f("height", this.f28270b, ExtendedFloatingActionButton.f28210O));
        }
        if (hVar.mo28388j("paddingStart")) {
            arrayList.add(hVar.mo28383f("paddingStart", this.f28270b, ExtendedFloatingActionButton.f28211P));
        }
        if (hVar.mo28388j("paddingEnd")) {
            arrayList.add(hVar.mo28383f("paddingEnd", this.f28270b, ExtendedFloatingActionButton.f28212Q));
        }
        if (hVar.mo28388j("labelOpacity")) {
            arrayList.add(hVar.mo28383f("labelOpacity", this.f28270b, new C6033a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        C7502b.m41943a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: m */
    public final C7508h mo23919m() {
        C7508h hVar = this.f28274f;
        if (hVar != null) {
            return hVar;
        }
        if (this.f28273e == null) {
            this.f28273e = C7508h.m41956d(this.f28269a, mo23820b());
        }
        C7508h hVar2 = this.f28273e;
        C3703i.m15827d(hVar2);
        return hVar2;
    }

    public void onAnimationStart(Animator animator) {
        this.f28272d.mo23914c(animator);
    }
}
