package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0534a;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.C6093m;
import com.google.android.material.internal.C6100s;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C6190b;
import com.google.android.material.theme.p249a.C6260a;
import java.util.List;
import p082e.p109h.p119p.C3704a;
import p082e.p109h.p119p.C3718d0;
import p082e.p109h.p119p.C3769q;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.p120e0.C3736c;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7492d;
import p159f.p243f.p245b.p304b.C7496h;
import p159f.p243f.p245b.p304b.C7500l;
import p159f.p243f.p245b.p304b.p305m.C7501a;
import p159f.p243f.p245b.p304b.p307o.C7513a;
import p159f.p243f.p245b.p304b.p312t.C7522c;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: t */
    static final Handler f28808t = new Handler(Looper.getMainLooper(), new C6173j());
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final boolean f28809u;

    /* renamed from: v */
    private static final int[] f28810v = {C7490b.snackbarStyle};
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final String f28811w = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: a */
    private final ViewGroup f28812a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f28813b;

    /* renamed from: c */
    protected final C6186v f28814c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C6189a f28815d;

    /* renamed from: e */
    private int f28816e;

    /* renamed from: f */
    private boolean f28817f;

    /* renamed from: g */
    private View f28818g;

    /* renamed from: h */
    private boolean f28819h = false;

    /* renamed from: i */
    private final Runnable f28820i = new C6174k();

    /* renamed from: j */
    private Rect f28821j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f28822k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f28823l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f28824m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f28825n;

    /* renamed from: o */
    private int f28826o;

    /* renamed from: p */
    private List<C6182r<B>> f28827p;

    /* renamed from: q */
    private Behavior f28828q;

    /* renamed from: r */
    private final AccessibilityManager f28829r;

    /* renamed from: s */
    C6190b.C6192b f28830s = new C6177n();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k */
        private final C6183s f28831k = new C6183s(this);

        /* access modifiers changed from: private */
        /* renamed from: P */
        public void m36982P(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f28831k.mo24671c(baseTransientBottomBar);
        }

        /* renamed from: E */
        public boolean mo22964E(View view) {
            return this.f28831k.mo24669a(view);
        }

        /* renamed from: k */
        public boolean mo3061k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f28831k.mo24670b(coordinatorLayout, view, motionEvent);
            return super.mo3061k(coordinatorLayout, view, motionEvent);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    class C6164a implements Runnable {
        C6164a() {
        }

        public void run() {
            C6186v vVar = BaseTransientBottomBar.this.f28814c;
            if (vVar != null) {
                if (vVar.getParent() != null) {
                    BaseTransientBottomBar.this.f28814c.setVisibility(0);
                }
                if (BaseTransientBottomBar.this.f28814c.getAnimationMode() == 1) {
                    BaseTransientBottomBar.this.m36940Q();
                } else {
                    BaseTransientBottomBar.this.m36942S();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    class C6165b extends AnimatorListenerAdapter {
        C6165b() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo24637I();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    class C6166c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f28834a;

        C6166c(int i) {
            this.f28834a = i;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo24636H(this.f28834a);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    class C6167d implements ValueAnimator.AnimatorUpdateListener {
        C6167d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f28814c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    class C6168e implements ValueAnimator.AnimatorUpdateListener {
        C6168e() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f28814c.setScaleX(floatValue);
            BaseTransientBottomBar.this.f28814c.setScaleY(floatValue);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$f */
    class C6169f extends AnimatorListenerAdapter {
        C6169f() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo24637I();
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f28815d.mo24692a(70, 180);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$g */
    class C6170g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f28839a;

        /* renamed from: b */
        final /* synthetic */ int f28840b;

        C6170g(int i) {
            this.f28840b = i;
            this.f28839a = i;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f28809u) {
                C3774v.m16187Z(BaseTransientBottomBar.this.f28814c, intValue - this.f28839a);
            } else {
                BaseTransientBottomBar.this.f28814c.setTranslationY((float) intValue);
            }
            this.f28839a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$h */
    class C6171h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f28842a;

        C6171h(int i) {
            this.f28842a = i;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo24636H(this.f28842a);
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f28815d.mo24693b(0, 180);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$i */
    class C6172i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f28844a = 0;

        C6172i() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f28809u) {
                C3774v.m16187Z(BaseTransientBottomBar.this.f28814c, intValue - this.f28844a);
            } else {
                BaseTransientBottomBar.this.f28814c.setTranslationY((float) intValue);
            }
            this.f28844a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$j */
    static class C6173j implements Handler.Callback {
        C6173j() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).mo24641O();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).mo24634E(message.arg1);
                return true;
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$k */
    class C6174k implements Runnable {
        C6174k() {
        }

        public void run() {
            int j;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f28814c != null && baseTransientBottomBar.f28813b != null && (j = (BaseTransientBottomBar.this.m36964y() - BaseTransientBottomBar.this.m36935C()) + ((int) BaseTransientBottomBar.this.f28814c.getTranslationY())) < BaseTransientBottomBar.this.f28825n) {
                ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f28814c.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(BaseTransientBottomBar.f28811w, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f28825n - j;
                BaseTransientBottomBar.this.f28814c.requestLayout();
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$l */
    class C6175l implements C3769q {
        C6175l() {
        }

        /* renamed from: a */
        public C3718d0 mo580a(View view, C3718d0 d0Var) {
            int unused = BaseTransientBottomBar.this.f28822k = d0Var.mo13035i();
            int unused2 = BaseTransientBottomBar.this.f28823l = d0Var.mo13036j();
            int unused3 = BaseTransientBottomBar.this.f28824m = d0Var.mo13037k();
            BaseTransientBottomBar.this.m36944U();
            return d0Var;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$m */
    class C6176m extends C3704a {
        C6176m() {
        }

        /* renamed from: g */
        public void mo3427g(View view, C3736c cVar) {
            super.mo3427g(view, cVar);
            cVar.mo13109a(1048576);
            cVar.mo13122h0(true);
        }

        /* renamed from: j */
        public boolean mo3428j(View view, int i, Bundle bundle) {
            if (i != 1048576) {
                return super.mo3428j(view, i, bundle);
            }
            BaseTransientBottomBar.this.mo24643s();
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n */
    class C6177n implements C6190b.C6192b {
        C6177n() {
        }

        /* renamed from: a */
        public void mo24661a(int i) {
            Handler handler = BaseTransientBottomBar.f28808t;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }

        /* renamed from: b */
        public void mo24662b() {
            Handler handler = BaseTransientBottomBar.f28808t;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$o */
    class C6178o implements C6184t {

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$o$a */
        class C6179a implements Runnable {
            C6179a() {
            }

            public void run() {
                BaseTransientBottomBar.this.mo24636H(3);
            }
        }

        C6178o() {
        }

        public void onViewAttachedToWindow(View view) {
            WindowInsets rootWindowInsets;
            if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = BaseTransientBottomBar.this.f28814c.getRootWindowInsets()) != null) {
                int unused = BaseTransientBottomBar.this.f28825n = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                BaseTransientBottomBar.this.m36944U();
            }
        }

        public void onViewDetachedFromWindow(View view) {
            if (BaseTransientBottomBar.this.mo24635F()) {
                BaseTransientBottomBar.f28808t.post(new C6179a());
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$p */
    class C6180p implements C6185u {
        C6180p() {
        }

        /* renamed from: a */
        public void mo24666a(View view, int i, int i2, int i3, int i4) {
            BaseTransientBottomBar.this.f28814c.setOnLayoutChangeListener((C6185u) null);
            BaseTransientBottomBar.this.m36939P();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$q */
    class C6181q implements SwipeDismissBehavior.C5912c {
        C6181q() {
        }

        /* renamed from: a */
        public void mo22969a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.mo24644t(0);
        }

        /* renamed from: b */
        public void mo22970b(int i) {
            if (i == 0) {
                C6190b.m37018c().mo24706k(BaseTransientBottomBar.this.f28830s);
            } else if (i == 1 || i == 2) {
                C6190b.m37018c().mo24705j(BaseTransientBottomBar.this.f28830s);
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$r */
    public static abstract class C6182r<B> {
        /* renamed from: a */
        public void mo24667a(B b, int i) {
        }

        /* renamed from: b */
        public void mo24668b(B b) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$s */
    public static class C6183s {

        /* renamed from: a */
        private C6190b.C6192b f28854a;

        public C6183s(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.mo22967L(0.1f);
            swipeDismissBehavior.mo22965J(0.6f);
            swipeDismissBehavior.mo22968M(0);
        }

        /* renamed from: a */
        public boolean mo24669a(View view) {
            return view instanceof C6186v;
        }

        /* renamed from: b */
        public void mo24670b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    C6190b.m37018c().mo24706k(this.f28854a);
                }
            } else if (coordinatorLayout.mo2998F(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C6190b.m37018c().mo24705j(this.f28854a);
            }
        }

        /* renamed from: c */
        public void mo24671c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f28854a = baseTransientBottomBar.f28830s;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$t */
    protected interface C6184t {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$u */
    protected interface C6185u {
        /* renamed from: a */
        void mo24666a(View view, int i, int i2, int i3, int i4);
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$v */
    protected static class C6186v extends FrameLayout {

        /* renamed from: n */
        private static final View.OnTouchListener f28855n = new C6187a();

        /* renamed from: g */
        private C6185u f28856g;

        /* renamed from: h */
        private C6184t f28857h;

        /* renamed from: i */
        private int f28858i;

        /* renamed from: j */
        private final float f28859j;

        /* renamed from: k */
        private final float f28860k;

        /* renamed from: l */
        private ColorStateList f28861l;

        /* renamed from: m */
        private PorterDuff.Mode f28862m;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$v$a */
        static class C6187a implements View.OnTouchListener {
            C6187a() {
            }

            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected C6186v(Context context) {
            this(context, (AttributeSet) null);
        }

        /* renamed from: a */
        private Drawable m36999a() {
            float dimension = getResources().getDimension(C7492d.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(C7513a.m41984h(this, C7490b.colorSurface, C7490b.colorOnSurface, getBackgroundOverlayColorAlpha()));
            if (this.f28861l == null) {
                return C0534a.m3292r(gradientDrawable);
            }
            Drawable r = C0534a.m3292r(gradientDrawable);
            C0534a.m3289o(r, this.f28861l);
            return r;
        }

        /* access modifiers changed from: package-private */
        public float getActionTextColorAlpha() {
            return this.f28860k;
        }

        /* access modifiers changed from: package-private */
        public int getAnimationMode() {
            return this.f28858i;
        }

        /* access modifiers changed from: package-private */
        public float getBackgroundOverlayColorAlpha() {
            return this.f28859j;
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            C6184t tVar = this.f28857h;
            if (tVar != null) {
                tVar.onViewAttachedToWindow(this);
            }
            C3774v.m16211l0(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            C6184t tVar = this.f28857h;
            if (tVar != null) {
                tVar.onViewDetachedFromWindow(this);
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            C6185u uVar = this.f28856g;
            if (uVar != null) {
                uVar.mo24666a(this, i, i2, i3, i4);
            }
        }

        /* access modifiers changed from: package-private */
        public void setAnimationMode(int i) {
            this.f28858i = i;
        }

        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.f28861l == null)) {
                drawable = C0534a.m3292r(drawable.mutate());
                C0534a.m3289o(drawable, this.f28861l);
                C0534a.m3290p(drawable, this.f28862m);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f28861l = colorStateList;
            if (getBackground() != null) {
                Drawable r = C0534a.m3292r(getBackground().mutate());
                C0534a.m3289o(r, colorStateList);
                C0534a.m3290p(r, this.f28862m);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f28862m = mode;
            if (getBackground() != null) {
                Drawable r = C0534a.m3292r(getBackground().mutate());
                C0534a.m3290p(r, mode);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void setOnAttachStateChangeListener(C6184t tVar) {
            this.f28857h = tVar;
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f28855n);
            super.setOnClickListener(onClickListener);
        }

        /* access modifiers changed from: package-private */
        public void setOnLayoutChangeListener(C6185u uVar) {
            this.f28856g = uVar;
        }

        protected C6186v(Context context, AttributeSet attributeSet) {
            super(C6260a.m37386c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C7500l.SnackbarLayout);
            int i = C7500l.SnackbarLayout_elevation;
            if (obtainStyledAttributes.hasValue(i)) {
                C3774v.m16231v0(this, (float) obtainStyledAttributes.getDimensionPixelSize(i, 0));
            }
            this.f28858i = obtainStyledAttributes.getInt(C7500l.SnackbarLayout_animationMode, 0);
            this.f28859j = obtainStyledAttributes.getFloat(C7500l.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(C7522c.m42014a(context2, obtainStyledAttributes, C7500l.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(C6100s.m36588i(obtainStyledAttributes.getInt(C7500l.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f28860k = obtainStyledAttributes.getFloat(C7500l.SnackbarLayout_actionTextColorAlpha, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f28855n);
            setFocusable(true);
            if (getBackground() == null) {
                C3774v.m16223r0(this, m36999a());
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f28809u = i >= 16 && i <= 19;
    }

    protected BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, C6189a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (aVar != null) {
            this.f28812a = viewGroup;
            this.f28815d = aVar;
            this.f28813b = context;
            C6093m.m36556a(context);
            C6186v vVar = (C6186v) LayoutInflater.from(context).inflate(mo24647z(), viewGroup, false);
            this.f28814c = vVar;
            if (view instanceof SnackbarContentLayout) {
                ((SnackbarContentLayout) view).mo24694c(vVar.getActionTextColorAlpha());
            }
            vVar.addView(view);
            ViewGroup.LayoutParams layoutParams = vVar.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f28821j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            C3774v.m16221q0(vVar, 1);
            C3774v.m16237y0(vVar, 1);
            C3774v.m16233w0(vVar, true);
            C3774v.m16154C0(vVar, new C6175l());
            C3774v.m16217o0(vVar, new C6176m());
            this.f28829r = (AccessibilityManager) context.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    /* renamed from: A */
    private int m36934A() {
        int height = this.f28814c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f28814c.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public int m36935C() {
        int[] iArr = new int[2];
        this.f28814c.getLocationOnScreen(iArr);
        return iArr[1] + this.f28814c.getHeight();
    }

    /* renamed from: G */
    private boolean m36936G() {
        ViewGroup.LayoutParams layoutParams = this.f28814c.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.C0450e) && (((CoordinatorLayout.C0450e) layoutParams).mo3092f() instanceof SwipeDismissBehavior);
    }

    /* renamed from: K */
    private void m36937K(CoordinatorLayout.C0450e eVar) {
        SwipeDismissBehavior swipeDismissBehavior = this.f28828q;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = mo24646w();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).m36982P(this);
        }
        swipeDismissBehavior.mo22966K(new C6181q());
        eVar.mo3100o(swipeDismissBehavior);
        if (this.f28818g == null) {
            eVar.f2499g = 80;
        }
    }

    /* renamed from: M */
    private boolean m36938M() {
        return this.f28825n > 0 && !this.f28817f && m36936G();
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m36939P() {
        if (mo24639L()) {
            mo24642p();
            return;
        }
        if (this.f28814c.getParent() != null) {
            this.f28814c.setVisibility(0);
        }
        mo24637I();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public void m36940Q() {
        ValueAnimator u = m36962u(0.0f, 1.0f);
        ValueAnimator x = m36963x(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{u, x});
        animatorSet.setDuration(150);
        animatorSet.addListener(new C6165b());
        animatorSet.start();
    }

    /* renamed from: R */
    private void m36941R(int i) {
        ValueAnimator u = m36962u(1.0f, 0.0f);
        u.setDuration(75);
        u.addListener(new C6166c(i));
        u.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public void m36942S() {
        int A = m36934A();
        if (f28809u) {
            C3774v.m16187Z(this.f28814c, A);
        } else {
            this.f28814c.setTranslationY((float) A);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{A, 0});
        valueAnimator.setInterpolator(C7501a.f32700b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new C6169f());
        valueAnimator.addUpdateListener(new C6170g(A));
        valueAnimator.start();
    }

    /* renamed from: T */
    private void m36943T(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, m36934A()});
        valueAnimator.setInterpolator(C7501a.f32700b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new C6171h(i));
        valueAnimator.addUpdateListener(new C6172i());
        valueAnimator.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public void m36944U() {
        Rect rect;
        ViewGroup.LayoutParams layoutParams = this.f28814c.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (rect = this.f28821j) == null) {
            Log.w(f28811w, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = rect.bottom + (this.f28818g != null ? this.f28826o : this.f28822k);
        marginLayoutParams.leftMargin = rect.left + this.f28823l;
        marginLayoutParams.rightMargin = rect.right + this.f28824m;
        this.f28814c.requestLayout();
        if (Build.VERSION.SDK_INT >= 29 && m36938M()) {
            this.f28814c.removeCallbacks(this.f28820i);
            this.f28814c.post(this.f28820i);
        }
    }

    /* renamed from: q */
    private void m36960q(int i) {
        if (this.f28814c.getAnimationMode() == 1) {
            m36941R(i);
        } else {
            m36943T(i);
        }
    }

    /* renamed from: r */
    private int m36961r() {
        View view = this.f28818g;
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        this.f28812a.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f28812a.getHeight()) - i;
    }

    /* renamed from: u */
    private ValueAnimator m36962u(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C7501a.f32699a);
        ofFloat.addUpdateListener(new C6167d());
        return ofFloat;
    }

    /* renamed from: x */
    private ValueAnimator m36963x(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C7501a.f32702d);
        ofFloat.addUpdateListener(new C6168e());
        return ofFloat;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public int m36964y() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f28813b.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: B */
    public View mo24632B() {
        return this.f28814c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public boolean mo24633D() {
        TypedArray obtainStyledAttributes = this.f28813b.obtainStyledAttributes(f28810v);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo24634E(int i) {
        if (!mo24639L() || this.f28814c.getVisibility() != 0) {
            mo24636H(i);
        } else {
            m36960q(i);
        }
    }

    /* renamed from: F */
    public boolean mo24635F() {
        return C6190b.m37018c().mo24702e(this.f28830s);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo24636H(int i) {
        C6190b.m37018c().mo24703h(this.f28830s);
        List<C6182r<B>> list = this.f28827p;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f28827p.get(size).mo24667a(this, i);
            }
        }
        ViewParent parent = this.f28814c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f28814c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo24637I() {
        C6190b.m37018c().mo24704i(this.f28830s);
        List<C6182r<B>> list = this.f28827p;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f28827p.get(size).mo24668b(this);
            }
        }
    }

    /* renamed from: J */
    public B mo24638J(int i) {
        this.f28816e = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public boolean mo24639L() {
        AccessibilityManager accessibilityManager = this.f28829r;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: N */
    public void mo24640N() {
        C6190b.m37018c().mo24707m(mo24645v(), this.f28830s);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final void mo24641O() {
        this.f28814c.setOnAttachStateChangeListener(new C6178o());
        if (this.f28814c.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f28814c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0450e) {
                m36937K((CoordinatorLayout.C0450e) layoutParams);
            }
            this.f28826o = m36961r();
            m36944U();
            this.f28814c.setVisibility(4);
            this.f28812a.addView(this.f28814c);
        }
        if (C3774v.m16181T(this.f28814c)) {
            m36939P();
        } else {
            this.f28814c.setOnLayoutChangeListener(new C6180p());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo24642p() {
        this.f28814c.post(new C6164a());
    }

    /* renamed from: s */
    public void mo24643s() {
        mo24644t(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo24644t(int i) {
        C6190b.m37018c().mo24700b(this.f28830s, i);
    }

    /* renamed from: v */
    public int mo24645v() {
        return this.f28816e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public SwipeDismissBehavior<? extends View> mo24646w() {
        return new Behavior();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo24647z() {
        return mo24633D() ? C7496h.mtrl_layout_snackbar : C7496h.design_layout_snackbar;
    }
}
