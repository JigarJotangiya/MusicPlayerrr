package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.C0556l;
import java.util.ArrayList;
import java.util.List;
import p082e.p109h.p119p.C3774v;
import p159f.p243f.p245b.p304b.C7492d;
import p159f.p243f.p245b.p304b.C7494f;
import p159f.p243f.p245b.p304b.p305m.C7501a;
import p159f.p243f.p245b.p304b.p305m.C7502b;
import p159f.p243f.p245b.p304b.p312t.C7522c;

/* renamed from: com.google.android.material.textfield.f */
/* compiled from: IndicatorViewController */
final class C6251f {

    /* renamed from: a */
    private final Context f29147a;

    /* renamed from: b */
    private final TextInputLayout f29148b;

    /* renamed from: c */
    private LinearLayout f29149c;

    /* renamed from: d */
    private int f29150d;

    /* renamed from: e */
    private FrameLayout f29151e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Animator f29152f;

    /* renamed from: g */
    private final float f29153g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f29154h;

    /* renamed from: i */
    private int f29155i;

    /* renamed from: j */
    private CharSequence f29156j;

    /* renamed from: k */
    private boolean f29157k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public TextView f29158l;

    /* renamed from: m */
    private CharSequence f29159m;

    /* renamed from: n */
    private int f29160n;

    /* renamed from: o */
    private ColorStateList f29161o;

    /* renamed from: p */
    private CharSequence f29162p;

    /* renamed from: q */
    private boolean f29163q;

    /* renamed from: r */
    private TextView f29164r;

    /* renamed from: s */
    private int f29165s;

    /* renamed from: t */
    private ColorStateList f29166t;

    /* renamed from: u */
    private Typeface f29167u;

    /* renamed from: com.google.android.material.textfield.f$a */
    /* compiled from: IndicatorViewController */
    class C6252a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f29168a;

        /* renamed from: b */
        final /* synthetic */ TextView f29169b;

        /* renamed from: c */
        final /* synthetic */ int f29170c;

        /* renamed from: d */
        final /* synthetic */ TextView f29171d;

        C6252a(int i, TextView textView, int i2, TextView textView2) {
            this.f29168a = i;
            this.f29169b = textView;
            this.f29170c = i2;
            this.f29171d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C6251f.this.f29154h = this.f29168a;
            Animator unused2 = C6251f.this.f29152f = null;
            TextView textView = this.f29169b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f29170c == 1 && C6251f.this.f29158l != null) {
                    C6251f.this.f29158l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f29171d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f29171d.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f29171d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C6251f(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f29147a = context;
        this.f29148b = textInputLayout;
        this.f29153g = (float) context.getResources().getDimensionPixelSize(C7492d.design_textinput_caption_translate_y);
    }

    /* renamed from: A */
    private void m37325A(int i, int i2) {
        TextView l;
        TextView l2;
        if (i != i2) {
            if (!(i2 == 0 || (l2 = m37337l(i2)) == null)) {
                l2.setVisibility(0);
                l2.setAlpha(1.0f);
            }
            if (!(i == 0 || (l = m37337l(i)) == null)) {
                l.setVisibility(4);
                if (i == 1) {
                    l.setText((CharSequence) null);
                }
            }
            this.f29154h = i2;
        }
    }

    /* renamed from: I */
    private void m37326I(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: K */
    private void m37327K(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: L */
    private boolean m37328L(TextView textView, CharSequence charSequence) {
        return C3774v.m16181T(this.f29148b) && this.f29148b.isEnabled() && (this.f29155i != this.f29154h || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: O */
    private void m37329O(int i, int i2, boolean z) {
        boolean z2 = z;
        if (i != i2) {
            if (z2) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f29152f = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i3 = i;
                int i4 = i2;
                m37334h(arrayList2, this.f29163q, this.f29164r, 2, i3, i4);
                m37334h(arrayList2, this.f29157k, this.f29158l, 1, i3, i4);
                C7502b.m41943a(animatorSet, arrayList);
                animatorSet.addListener(new C6252a(i2, m37337l(i), i, m37337l(i2)));
                animatorSet.start();
            } else {
                m37325A(i, i2);
            }
            this.f29148b.mo24925s0();
            this.f29148b.mo25011v0(z2);
            this.f29148b.mo24853F0();
        }
    }

    /* renamed from: f */
    private boolean m37333f() {
        return (this.f29149c == null || this.f29148b.getEditText() == null) ? false : true;
    }

    /* renamed from: h */
    private void m37334h(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                list.add(m37335i(textView, i3 == i));
                if (i3 == i) {
                    list.add(m37336j(textView));
                }
            }
        }
    }

    /* renamed from: i */
    private ObjectAnimator m37335i(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z ? 1.0f : 0.0f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(C7501a.f32699a);
        return ofFloat;
    }

    /* renamed from: j */
    private ObjectAnimator m37336j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f29153g, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(C7501a.f32702d);
        return ofFloat;
    }

    /* renamed from: l */
    private TextView m37337l(int i) {
        if (i == 1) {
            return this.f29158l;
        }
        if (i != 2) {
            return null;
        }
        return this.f29164r;
    }

    /* renamed from: s */
    private int m37338s(boolean z, int i, int i2) {
        return z ? this.f29147a.getResources().getDimensionPixelSize(i) : i2;
    }

    /* renamed from: v */
    private boolean m37339v(int i) {
        if (i != 1 || this.f29158l == null || TextUtils.isEmpty(this.f29156j)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo25053B(CharSequence charSequence) {
        this.f29159m = charSequence;
        TextView textView = this.f29158l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo25054C(boolean z) {
        if (this.f29157k != z) {
            mo25065g();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f29147a);
                this.f29158l = appCompatTextView;
                appCompatTextView.setId(C7494f.textinput_error);
                if (Build.VERSION.SDK_INT >= 17) {
                    this.f29158l.setTextAlignment(5);
                }
                Typeface typeface = this.f29167u;
                if (typeface != null) {
                    this.f29158l.setTypeface(typeface);
                }
                mo25055D(this.f29160n);
                mo25056E(this.f29161o);
                mo25053B(this.f29159m);
                this.f29158l.setVisibility(4);
                C3774v.m16221q0(this.f29158l, 1);
                mo25063d(this.f29158l, 0);
            } else {
                mo25073t();
                mo25078z(this.f29158l, 0);
                this.f29158l = null;
                this.f29148b.mo24925s0();
                this.f29148b.mo24853F0();
            }
            this.f29157k = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo25055D(int i) {
        this.f29160n = i;
        TextView textView = this.f29158l;
        if (textView != null) {
            this.f29148b.mo24868e0(textView, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo25056E(ColorStateList colorStateList) {
        this.f29161o = colorStateList;
        TextView textView = this.f29158l;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo25057F(int i) {
        this.f29165s = i;
        TextView textView = this.f29164r;
        if (textView != null) {
            C0556l.m3435q(textView, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo25058G(boolean z) {
        if (this.f29163q != z) {
            mo25065g();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f29147a);
                this.f29164r = appCompatTextView;
                appCompatTextView.setId(C7494f.textinput_helper_text);
                if (Build.VERSION.SDK_INT >= 17) {
                    this.f29164r.setTextAlignment(5);
                }
                Typeface typeface = this.f29167u;
                if (typeface != null) {
                    this.f29164r.setTypeface(typeface);
                }
                this.f29164r.setVisibility(4);
                C3774v.m16221q0(this.f29164r, 1);
                mo25057F(this.f29165s);
                mo25059H(this.f29166t);
                mo25063d(this.f29164r, 1);
            } else {
                mo25074u();
                mo25078z(this.f29164r, 1);
                this.f29164r = null;
                this.f29148b.mo24925s0();
                this.f29148b.mo24853F0();
            }
            this.f29163q = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo25059H(ColorStateList colorStateList) {
        this.f29166t = colorStateList;
        TextView textView = this.f29164r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo25060J(Typeface typeface) {
        if (typeface != this.f29167u) {
            this.f29167u = typeface;
            m37326I(this.f29158l, typeface);
            m37326I(this.f29164r, typeface);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo25061M(CharSequence charSequence) {
        mo25065g();
        this.f29156j = charSequence;
        this.f29158l.setText(charSequence);
        int i = this.f29154h;
        if (i != 1) {
            this.f29155i = 1;
        }
        m37329O(i, this.f29155i, m37328L(this.f29158l, charSequence));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo25062N(CharSequence charSequence) {
        mo25065g();
        this.f29162p = charSequence;
        this.f29164r.setText(charSequence);
        int i = this.f29154h;
        if (i != 2) {
            this.f29155i = 2;
        }
        m37329O(i, this.f29155i, m37328L(this.f29164r, charSequence));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo25063d(TextView textView, int i) {
        if (this.f29149c == null && this.f29151e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f29147a);
            this.f29149c = linearLayout;
            linearLayout.setOrientation(0);
            this.f29148b.addView(this.f29149c, -1, -2);
            this.f29151e = new FrameLayout(this.f29147a);
            this.f29149c.addView(this.f29151e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f29148b.getEditText() != null) {
                mo25064e();
            }
        }
        if (mo25075w(i)) {
            this.f29151e.setVisibility(0);
            this.f29151e.addView(textView);
        } else {
            this.f29149c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f29149c.setVisibility(0);
        this.f29150d++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo25064e() {
        if (m37333f()) {
            EditText editText = this.f29148b.getEditText();
            boolean g = C7522c.m42020g(this.f29147a);
            LinearLayout linearLayout = this.f29149c;
            int i = C7492d.material_helper_text_font_1_3_padding_horizontal;
            C3774v.m16156D0(linearLayout, m37338s(g, i, C3774v.m16161G(editText)), m37338s(g, C7492d.material_helper_text_font_1_3_padding_top, this.f29147a.getResources().getDimensionPixelSize(C7492d.material_helper_text_default_padding_top)), m37338s(g, i, C3774v.m16159F(editText)), 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo25065g() {
        Animator animator = this.f29152f;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo25066k() {
        return m37339v(this.f29155i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public CharSequence mo25067m() {
        return this.f29159m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public CharSequence mo25068n() {
        return this.f29156j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo25069o() {
        TextView textView = this.f29158l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public ColorStateList mo25070p() {
        TextView textView = this.f29158l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public CharSequence mo25071q() {
        return this.f29162p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public int mo25072r() {
        TextView textView = this.f29164r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo25073t() {
        this.f29156j = null;
        mo25065g();
        if (this.f29154h == 1) {
            if (!this.f29163q || TextUtils.isEmpty(this.f29162p)) {
                this.f29155i = 0;
            } else {
                this.f29155i = 2;
            }
        }
        m37329O(this.f29154h, this.f29155i, m37328L(this.f29158l, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo25074u() {
        mo25065g();
        int i = this.f29154h;
        if (i == 2) {
            this.f29155i = 0;
        }
        m37329O(i, this.f29155i, m37328L(this.f29164r, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo25075w(int i) {
        return i == 0 || i == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo25076x() {
        return this.f29157k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo25077y() {
        return this.f29163q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo25078z(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f29149c != null) {
            if (!mo25075w(i) || (frameLayout = this.f29151e) == null) {
                this.f29149c.removeView(textView);
            } else {
                frameLayout.removeView(textView);
            }
            int i2 = this.f29150d - 1;
            this.f29150d = i2;
            m37327K(this.f29149c, i2);
        }
    }
}
