package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.internal.C6092l;
import com.google.android.material.textfield.TextInputLayout;
import p082e.p083a.p084k.p085a.C3410a;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.p120e0.C3736c;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7492d;
import p159f.p243f.p245b.p304b.C7493e;
import p159f.p243f.p245b.p304b.C7498j;
import p159f.p243f.p245b.p304b.p305m.C7501a;
import p159f.p243f.p245b.p304b.p307o.C7513a;
import p159f.p243f.p245b.p304b.p315w.C7541h;
import p159f.p243f.p245b.p304b.p315w.C7549m;

/* renamed from: com.google.android.material.textfield.d */
/* compiled from: DropdownMenuEndIconDelegate */
class C6237d extends C6250e {
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final boolean f29115q = (Build.VERSION.SDK_INT >= 21);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f29116d = new C6238a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final View.OnFocusChangeListener f29117e = new C6241c();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final TextInputLayout.C6221e f29118f = new C6242d(this.f29144a);

    /* renamed from: g */
    private final TextInputLayout.C6222f f29119g = new C6243e();
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: h */
    private final TextInputLayout.C6223g f29120h = new C6244f();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f29121i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f29122j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public long f29123k = Long.MAX_VALUE;

    /* renamed from: l */
    private StateListDrawable f29124l;

    /* renamed from: m */
    private C7541h f29125m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public AccessibilityManager f29126n;

    /* renamed from: o */
    private ValueAnimator f29127o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public ValueAnimator f29128p;

    /* renamed from: com.google.android.material.textfield.d$a */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C6238a extends C6092l {

        /* renamed from: com.google.android.material.textfield.d$a$a */
        /* compiled from: DropdownMenuEndIconDelegate */
        class C6239a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ AutoCompleteTextView f29130g;

            C6239a(AutoCompleteTextView autoCompleteTextView) {
                this.f29130g = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.f29130g.isPopupShowing();
                C6237d.this.m37288E(isPopupShowing);
                boolean unused = C6237d.this.f29121i = isPopupShowing;
            }
        }

        C6238a() {
        }

        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView e = C6237d.m37312y(C6237d.this.f29144a.getEditText());
            if (C6237d.this.f29126n.isTouchExplorationEnabled() && C6237d.m37287D(e) && !C6237d.this.f29146c.hasFocus()) {
                e.dismissDropDown();
            }
            e.post(new C6239a(e));
        }
    }

    /* renamed from: com.google.android.material.textfield.d$b */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C6240b implements ValueAnimator.AnimatorUpdateListener {
        C6240b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C6237d.this.f29146c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.d$c */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C6241c implements View.OnFocusChangeListener {
        C6241c() {
        }

        public void onFocusChange(View view, boolean z) {
            C6237d.this.f29144a.setEndIconActivated(z);
            if (!z) {
                C6237d.this.m37288E(false);
                boolean unused = C6237d.this.f29121i = false;
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C6242d extends TextInputLayout.C6221e {
        C6242d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        /* renamed from: g */
        public void mo3427g(View view, C3736c cVar) {
            super.mo3427g(view, cVar);
            if (!C6237d.m37287D(C6237d.this.f29144a.getEditText())) {
                cVar.mo13114c0(Spinner.class.getName());
            }
            if (cVar.mo13100M()) {
                cVar.mo13133n0((CharSequence) null);
            }
        }

        /* renamed from: h */
        public void mo5407h(View view, AccessibilityEvent accessibilityEvent) {
            super.mo5407h(view, accessibilityEvent);
            AutoCompleteTextView e = C6237d.m37312y(C6237d.this.f29144a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C6237d.this.f29126n.isTouchExplorationEnabled() && !C6237d.m37287D(C6237d.this.f29144a.getEditText())) {
                C6237d.this.m37291H(e);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$e */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C6243e implements TextInputLayout.C6222f {
        C6243e() {
        }

        /* renamed from: a */
        public void mo25025a(TextInputLayout textInputLayout) {
            AutoCompleteTextView e = C6237d.m37312y(textInputLayout.getEditText());
            C6237d.this.m37289F(e);
            C6237d.this.m37309v(e);
            C6237d.this.m37290G(e);
            e.setThreshold(0);
            e.removeTextChangedListener(C6237d.this.f29116d);
            e.addTextChangedListener(C6237d.this.f29116d);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!C6237d.m37287D(e)) {
                C3774v.m16237y0(C6237d.this.f29146c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(C6237d.this.f29118f);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$f */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C6244f implements TextInputLayout.C6223g {

        /* renamed from: com.google.android.material.textfield.d$f$a */
        /* compiled from: DropdownMenuEndIconDelegate */
        class C6245a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ AutoCompleteTextView f29137g;

            C6245a(AutoCompleteTextView autoCompleteTextView) {
                this.f29137g = autoCompleteTextView;
            }

            public void run() {
                this.f29137g.removeTextChangedListener(C6237d.this.f29116d);
            }
        }

        C6244f() {
        }

        /* renamed from: a */
        public void mo25026a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i == 3) {
                autoCompleteTextView.post(new C6245a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == C6237d.this.f29117e) {
                    autoCompleteTextView.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
                if (C6237d.f29115q) {
                    autoCompleteTextView.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$g */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C6246g implements View.OnClickListener {
        C6246g() {
        }

        public void onClick(View view) {
            C6237d.this.m37291H((AutoCompleteTextView) C6237d.this.f29144a.getEditText());
        }
    }

    /* renamed from: com.google.android.material.textfield.d$h */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C6247h implements View.OnTouchListener {

        /* renamed from: g */
        final /* synthetic */ AutoCompleteTextView f29140g;

        C6247h(AutoCompleteTextView autoCompleteTextView) {
            this.f29140g = autoCompleteTextView;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (C6237d.this.m37286C()) {
                    boolean unused = C6237d.this.f29121i = false;
                }
                C6237d.this.m37291H(this.f29140g);
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.textfield.d$i */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C6248i implements AutoCompleteTextView.OnDismissListener {
        C6248i() {
        }

        public void onDismiss() {
            boolean unused = C6237d.this.f29121i = true;
            long unused2 = C6237d.this.f29123k = System.currentTimeMillis();
            C6237d.this.m37288E(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$j */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C6249j extends AnimatorListenerAdapter {
        C6249j() {
        }

        public void onAnimationEnd(Animator animator) {
            C6237d dVar = C6237d.this;
            dVar.f29146c.setChecked(dVar.f29122j);
            C6237d.this.f29128p.start();
        }
    }

    C6237d(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: A */
    private C7541h m37284A(float f, float f2, float f3, int i) {
        C7549m.C7551b a = C7549m.m42145a();
        a.mo28520E(f);
        a.mo28524I(f);
        a.mo28534v(f2);
        a.mo28538z(f2);
        C7549m m = a.mo28526m();
        C7541h m2 = C7541h.m42082m(this.f29145b, f3);
        m2.setShapeAppearanceModel(m);
        m2.mo28465c0(0, i, 0, i);
        return m2;
    }

    /* renamed from: B */
    private void m37285B() {
        this.f29128p = m37313z(67, 0.0f, 1.0f);
        ValueAnimator z = m37313z(50, 1.0f, 0.0f);
        this.f29127o = z;
        z.addListener(new C6249j());
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public boolean m37286C() {
        long currentTimeMillis = System.currentTimeMillis() - this.f29123k;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static boolean m37287D(EditText editText) {
        return editText.getKeyListener() != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m37288E(boolean z) {
        if (this.f29122j != z) {
            this.f29122j = z;
            this.f29128p.cancel();
            this.f29127o.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m37289F(AutoCompleteTextView autoCompleteTextView) {
        if (f29115q) {
            int boxBackgroundMode = this.f29144a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f29125m);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f29124l);
            }
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: G */
    public void m37290G(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new C6247h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f29117e);
        if (f29115q) {
            autoCompleteTextView.setOnDismissListener(new C6248i());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void m37291H(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (m37286C()) {
                this.f29121i = false;
            }
            if (!this.f29121i) {
                if (f29115q) {
                    m37288E(!this.f29122j);
                } else {
                    this.f29122j = !this.f29122j;
                    this.f29146c.toggle();
                }
                if (this.f29122j) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            this.f29121i = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m37309v(AutoCompleteTextView autoCompleteTextView) {
        if (!m37287D(autoCompleteTextView)) {
            int boxBackgroundMode = this.f29144a.getBoxBackgroundMode();
            C7541h boxBackground = this.f29144a.getBoxBackground();
            int d = C7513a.m41980d(autoCompleteTextView, C7490b.colorControlHighlight);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                m37311x(autoCompleteTextView, d, iArr, boxBackground);
            } else if (boxBackgroundMode == 1) {
                m37310w(autoCompleteTextView, d, iArr, boxBackground);
            }
        }
    }

    /* renamed from: w */
    private void m37310w(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C7541h hVar) {
        int boxBackgroundColor = this.f29144a.getBoxBackgroundColor();
        int[] iArr2 = {C7513a.m41983g(i, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f29115q) {
            C3774v.m16223r0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), hVar, hVar));
            return;
        }
        C7541h hVar2 = new C7541h(hVar.mo28448D());
        hVar2.mo28463a0(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{hVar, hVar2});
        int G = C3774v.m16161G(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int F = C3774v.m16159F(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        C3774v.m16223r0(autoCompleteTextView, layerDrawable);
        C3774v.m16156D0(autoCompleteTextView, G, paddingTop, F, paddingBottom);
    }

    /* renamed from: x */
    private void m37311x(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C7541h hVar) {
        LayerDrawable layerDrawable;
        int d = C7513a.m41980d(autoCompleteTextView, C7490b.colorSurface);
        C7541h hVar2 = new C7541h(hVar.mo28448D());
        int g = C7513a.m41983g(i, d, 0.1f);
        hVar2.mo28463a0(new ColorStateList(iArr, new int[]{g, 0}));
        if (f29115q) {
            hVar2.setTint(d);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{g, d});
            C7541h hVar3 = new C7541h(hVar.mo28448D());
            hVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, hVar2, hVar3), hVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{hVar2, hVar});
        }
        C3774v.m16223r0(autoCompleteTextView, layerDrawable);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static AutoCompleteTextView m37312y(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: z */
    private ValueAnimator m37313z(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C7501a.f32699a);
        ofFloat.setDuration((long) i);
        ofFloat.addUpdateListener(new C6240b());
        return ofFloat;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo25027a() {
        float dimensionPixelOffset = (float) this.f29145b.getResources().getDimensionPixelOffset(C7492d.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f29145b.getResources().getDimensionPixelOffset(C7492d.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f29145b.getResources().getDimensionPixelOffset(C7492d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C7541h A = m37284A(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C7541h A2 = m37284A(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f29125m = A;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f29124l = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, A);
        this.f29124l.addState(new int[0], A2);
        this.f29144a.setEndIconDrawable(C3410a.m14543d(this.f29145b, f29115q ? C7493e.mtrl_dropdown_arrow : C7493e.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.f29144a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C7498j.exposed_dropdown_menu_content_description));
        this.f29144a.setEndIconOnClickListener(new C6246g());
        this.f29144a.mo24867e(this.f29119g);
        this.f29144a.mo24869f(this.f29120h);
        m37285B();
        this.f29126n = (AccessibilityManager) this.f29145b.getSystemService("accessibility");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo25043b(int i) {
        return i != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo25044d() {
        return true;
    }
}
