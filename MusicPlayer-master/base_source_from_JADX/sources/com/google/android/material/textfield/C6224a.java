package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p082e.p083a.p084k.p085a.C3410a;
import p159f.p243f.p245b.p304b.C7493e;
import p159f.p243f.p245b.p304b.C7498j;
import p159f.p243f.p245b.p304b.p305m.C7501a;

/* renamed from: com.google.android.material.textfield.a */
/* compiled from: ClearTextEndIconDelegate */
class C6224a extends C6250e {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f29095d = new C6225a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final View.OnFocusChangeListener f29096e = new C6226b();

    /* renamed from: f */
    private final TextInputLayout.C6222f f29097f = new C6227c();

    /* renamed from: g */
    private final TextInputLayout.C6223g f29098g = new C6228d();

    /* renamed from: h */
    private AnimatorSet f29099h;

    /* renamed from: i */
    private ValueAnimator f29100i;

    /* renamed from: com.google.android.material.textfield.a$a */
    /* compiled from: ClearTextEndIconDelegate */
    class C6225a implements TextWatcher {
        C6225a() {
        }

        public void afterTextChanged(Editable editable) {
            if (C6224a.this.f29144a.getSuffixText() == null) {
                C6224a aVar = C6224a.this;
                aVar.m37265i(aVar.f29144a.hasFocus() && C6224a.m37268l(editable));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    /* compiled from: ClearTextEndIconDelegate */
    class C6226b implements View.OnFocusChangeListener {
        C6226b() {
        }

        public void onFocusChange(View view, boolean z) {
            boolean z2 = true;
            boolean z3 = !TextUtils.isEmpty(((EditText) view).getText());
            C6224a aVar = C6224a.this;
            if (!z3 || !z) {
                z2 = false;
            }
            aVar.m37265i(z2);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    /* compiled from: ClearTextEndIconDelegate */
    class C6227c implements TextInputLayout.C6222f {
        C6227c() {
        }

        /* renamed from: a */
        public void mo25025a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(editText.hasFocus() && C6224a.m37268l(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(C6224a.this.f29096e);
            editText.removeTextChangedListener(C6224a.this.f29095d);
            editText.addTextChangedListener(C6224a.this.f29095d);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$d */
    /* compiled from: ClearTextEndIconDelegate */
    class C6228d implements TextInputLayout.C6223g {

        /* renamed from: com.google.android.material.textfield.a$d$a */
        /* compiled from: ClearTextEndIconDelegate */
        class C6229a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ EditText f29105g;

            C6229a(EditText editText) {
                this.f29105g = editText;
            }

            public void run() {
                this.f29105g.removeTextChangedListener(C6224a.this.f29095d);
            }
        }

        C6228d() {
        }

        /* renamed from: a */
        public void mo25026a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 2) {
                editText.post(new C6229a(editText));
                if (editText.getOnFocusChangeListener() == C6224a.this.f29096e) {
                    editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.a$e */
    /* compiled from: ClearTextEndIconDelegate */
    class C6230e implements View.OnClickListener {
        C6230e() {
        }

        public void onClick(View view) {
            Editable text = C6224a.this.f29144a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            C6224a.this.f29144a.mo24859V();
        }
    }

    /* renamed from: com.google.android.material.textfield.a$f */
    /* compiled from: ClearTextEndIconDelegate */
    class C6231f extends AnimatorListenerAdapter {
        C6231f() {
        }

        public void onAnimationStart(Animator animator) {
            C6224a.this.f29144a.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$g */
    /* compiled from: ClearTextEndIconDelegate */
    class C6232g extends AnimatorListenerAdapter {
        C6232g() {
        }

        public void onAnimationEnd(Animator animator) {
            C6224a.this.f29144a.setEndIconVisible(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$h */
    /* compiled from: ClearTextEndIconDelegate */
    class C6233h implements ValueAnimator.AnimatorUpdateListener {
        C6233h() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C6224a.this.f29146c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.a$i */
    /* compiled from: ClearTextEndIconDelegate */
    class C6234i implements ValueAnimator.AnimatorUpdateListener {
        C6234i() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C6224a.this.f29146c.setScaleX(floatValue);
            C6224a.this.f29146c.setScaleY(floatValue);
        }
    }

    C6224a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m37265i(boolean z) {
        boolean z2 = this.f29144a.mo24854K() == z;
        if (z && !this.f29099h.isRunning()) {
            this.f29100i.cancel();
            this.f29099h.start();
            if (z2) {
                this.f29099h.end();
            }
        } else if (!z) {
            this.f29099h.cancel();
            this.f29100i.start();
            if (z2) {
                this.f29100i.end();
            }
        }
    }

    /* renamed from: j */
    private ValueAnimator m37266j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C7501a.f32699a);
        ofFloat.setDuration(100);
        ofFloat.addUpdateListener(new C6233h());
        return ofFloat;
    }

    /* renamed from: k */
    private ValueAnimator m37267k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(C7501a.f32702d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C6234i());
        return ofFloat;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static boolean m37268l(Editable editable) {
        return editable.length() > 0;
    }

    /* renamed from: m */
    private void m37269m() {
        ValueAnimator k = m37267k();
        ValueAnimator j = m37266j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f29099h = animatorSet;
        animatorSet.playTogether(new Animator[]{k, j});
        this.f29099h.addListener(new C6231f());
        ValueAnimator j2 = m37266j(1.0f, 0.0f);
        this.f29100i = j2;
        j2.addListener(new C6232g());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo25027a() {
        this.f29144a.setEndIconDrawable(C3410a.m14543d(this.f29145b, C7493e.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f29144a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C7498j.clear_text_end_icon_content_description));
        this.f29144a.setEndIconOnClickListener(new C6230e());
        this.f29144a.mo24867e(this.f29097f);
        this.f29144a.mo24869f(this.f29098g);
        m37269m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo25028c(boolean z) {
        if (this.f29144a.getSuffixText() != null) {
            m37265i(z);
        }
    }
}
