package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0285i0;
import androidx.core.graphics.drawable.C0534a;
import androidx.core.widget.C0556l;
import androidx.viewpager.widget.C1184a;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.C5908a;
import com.google.android.material.internal.C6100s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p082e.p083a.p084k.p085a.C3410a;
import p082e.p109h.p118o.C3700f;
import p082e.p109h.p118o.C3702h;
import p082e.p109h.p119p.C3760h;
import p082e.p109h.p119p.C3771s;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.p120e0.C3736c;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7496h;
import p159f.p243f.p245b.p304b.C7498j;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.p305m.C7501a;
import p159f.p243f.p245b.p304b.p315w.C7545i;

@ViewPager.C1176e
public class TabLayout extends HorizontalScrollView {

    /* renamed from: W */
    private static final int f28891W = C7499k.Widget_Design_TabLayout;

    /* renamed from: a0 */
    private static final C3700f<C6203g> f28892a0 = new C3702h(16);

    /* renamed from: A */
    private final int f28893A;

    /* renamed from: B */
    private int f28894B;

    /* renamed from: C */
    int f28895C;

    /* renamed from: D */
    int f28896D;

    /* renamed from: E */
    int f28897E;

    /* renamed from: F */
    int f28898F;

    /* renamed from: G */
    boolean f28899G;

    /* renamed from: H */
    boolean f28900H;

    /* renamed from: I */
    int f28901I;

    /* renamed from: J */
    boolean f28902J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public C6209b f28903K;

    /* renamed from: L */
    private C6197c f28904L;

    /* renamed from: M */
    private final ArrayList<C6197c> f28905M;

    /* renamed from: N */
    private C6197c f28906N;

    /* renamed from: O */
    private ValueAnimator f28907O;

    /* renamed from: P */
    ViewPager f28908P;

    /* renamed from: Q */
    private C1184a f28909Q;

    /* renamed from: R */
    private DataSetObserver f28910R;

    /* renamed from: S */
    private C6204h f28911S;

    /* renamed from: T */
    private C6196b f28912T;

    /* renamed from: U */
    private boolean f28913U;

    /* renamed from: V */
    private final C3700f<C6205i> f28914V;

    /* renamed from: g */
    private final ArrayList<C6203g> f28915g;

    /* renamed from: h */
    private C6203g f28916h;

    /* renamed from: i */
    final C6200f f28917i;

    /* renamed from: j */
    int f28918j;

    /* renamed from: k */
    int f28919k;

    /* renamed from: l */
    int f28920l;

    /* renamed from: m */
    int f28921m;

    /* renamed from: n */
    int f28922n;

    /* renamed from: o */
    ColorStateList f28923o;

    /* renamed from: p */
    ColorStateList f28924p;

    /* renamed from: q */
    ColorStateList f28925q;

    /* renamed from: r */
    Drawable f28926r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f28927s;

    /* renamed from: t */
    PorterDuff.Mode f28928t;

    /* renamed from: u */
    float f28929u;

    /* renamed from: v */
    float f28930v;

    /* renamed from: w */
    final int f28931w;

    /* renamed from: x */
    int f28932x;

    /* renamed from: y */
    private final int f28933y;

    /* renamed from: z */
    private final int f28934z;

    /* renamed from: com.google.android.material.tabs.TabLayout$a */
    class C6195a implements ValueAnimator.AnimatorUpdateListener {
        C6195a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$b */
    private class C6196b implements ViewPager.C1179h {

        /* renamed from: a */
        private boolean f28936a;

        C6196b() {
        }

        /* renamed from: a */
        public void mo6206a(ViewPager viewPager, C1184a aVar, C1184a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f28908P == viewPager) {
                tabLayout.mo24725H(aVar2, this.f28936a);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo24787b(boolean z) {
            this.f28936a = z;
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.tabs.TabLayout$c */
    public interface C6197c<T extends C6203g> {
        /* renamed from: a */
        void mo24788a(T t);

        /* renamed from: b */
        void mo24789b(T t);

        /* renamed from: c */
        void mo24790c(T t);
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$d */
    public interface C6198d extends C6197c<C6203g> {
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$e */
    private class C6199e extends DataSetObserver {
        C6199e() {
        }

        public void onChanged() {
            TabLayout.this.mo24719A();
        }

        public void onInvalidated() {
            TabLayout.this.mo24719A();
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$f */
    class C6200f extends LinearLayout {

        /* renamed from: g */
        ValueAnimator f28939g;

        /* renamed from: h */
        int f28940h = -1;

        /* renamed from: i */
        float f28941i;

        /* renamed from: j */
        private int f28942j = -1;

        /* renamed from: com.google.android.material.tabs.TabLayout$f$a */
        class C6201a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ View f28944a;

            /* renamed from: b */
            final /* synthetic */ View f28945b;

            C6201a(View view, View view2) {
                this.f28944a = view;
                this.f28945b = view2;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C6200f.this.m37086g(this.f28944a, this.f28945b, valueAnimator.getAnimatedFraction());
            }
        }

        /* renamed from: com.google.android.material.tabs.TabLayout$f$b */
        class C6202b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ int f28947a;

            C6202b(int i) {
                this.f28947a = i;
            }

            public void onAnimationEnd(Animator animator) {
                C6200f.this.f28940h = this.f28947a;
            }

            public void onAnimationStart(Animator animator) {
                C6200f.this.f28940h = this.f28947a;
            }
        }

        C6200f(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        /* renamed from: d */
        private void m37085d() {
            View childAt = getChildAt(this.f28940h);
            C6209b a = TabLayout.this.f28903K;
            TabLayout tabLayout = TabLayout.this;
            a.mo24835d(tabLayout, childAt, tabLayout.f28926r);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public void m37086g(View view, View view2, float f) {
            if (view != null && view.getWidth() > 0) {
                C6209b a = TabLayout.this.f28903K;
                TabLayout tabLayout = TabLayout.this;
                a.mo24834c(tabLayout, view, view2, f, tabLayout.f28926r);
            } else {
                Drawable drawable = TabLayout.this.f28926r;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f28926r.getBounds().bottom);
            }
            C3774v.m16197e0(this);
        }

        /* renamed from: h */
        private void m37087h(boolean z, int i, int i2) {
            View childAt = getChildAt(this.f28940h);
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                m37085d();
                return;
            }
            C6201a aVar = new C6201a(childAt, childAt2);
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f28939g = valueAnimator;
                valueAnimator.setInterpolator(C7501a.f32700b);
                valueAnimator.setDuration((long) i2);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                valueAnimator.addUpdateListener(aVar);
                valueAnimator.addListener(new C6202b(i));
                valueAnimator.start();
                return;
            }
            this.f28939g.removeAllUpdateListeners();
            this.f28939g.addUpdateListener(aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo24793b(int i, int i2) {
            ValueAnimator valueAnimator = this.f28939g;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f28939g.cancel();
            }
            m37087h(true, i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo24794c() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        public void draw(Canvas canvas) {
            int height = TabLayout.this.f28926r.getBounds().height();
            if (height < 0) {
                height = TabLayout.this.f28926r.getIntrinsicHeight();
            }
            int i = TabLayout.this.f28897E;
            int i2 = 0;
            if (i == 0) {
                i2 = getHeight() - height;
                height = getHeight();
            } else if (i == 1) {
                i2 = (getHeight() - height) / 2;
                height = (getHeight() + height) / 2;
            } else if (i != 2) {
                if (i != 3) {
                    height = 0;
                } else {
                    height = getHeight();
                }
            }
            if (TabLayout.this.f28926r.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f28926r.getBounds();
                TabLayout.this.f28926r.setBounds(bounds.left, i2, bounds.right, height);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawable = tabLayout.f28926r;
                if (tabLayout.f28927s != 0) {
                    drawable = C0534a.m3292r(drawable);
                    if (Build.VERSION.SDK_INT == 21) {
                        drawable.setColorFilter(TabLayout.this.f28927s, PorterDuff.Mode.SRC_IN);
                    } else {
                        C0534a.m3288n(drawable, TabLayout.this.f28927s);
                    }
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo24796e(int i, float f) {
            ValueAnimator valueAnimator = this.f28939g;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f28939g.cancel();
            }
            this.f28940h = i;
            this.f28941i = f;
            m37086g(getChildAt(i), getChildAt(this.f28940h + 1), this.f28941i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo24797f(int i) {
            Rect bounds = TabLayout.this.f28926r.getBounds();
            TabLayout.this.f28926r.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f28939g;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m37085d();
            } else {
                m37087h(false, this.f28940h, -1);
            }
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z = true;
                if (tabLayout.f28895C == 1 || tabLayout.f28898F == 2) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (((int) C6100s.m36582c(getContext(), 16)) * 2)) {
                            boolean z2 = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.f28895C = 0;
                            tabLayout2.mo24730P(false);
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT < 23 && this.f28942j != i) {
                requestLayout();
                this.f28942j = i;
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$g */
    public static class C6203g {

        /* renamed from: a */
        private Drawable f28949a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public CharSequence f28950b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public CharSequence f28951c;

        /* renamed from: d */
        private int f28952d = -1;

        /* renamed from: e */
        private View f28953e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f28954f = 1;

        /* renamed from: g */
        public TabLayout f28955g;

        /* renamed from: h */
        public C6205i f28956h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f28957i = -1;

        /* renamed from: e */
        public View mo24804e() {
            return this.f28953e;
        }

        /* renamed from: f */
        public Drawable mo24805f() {
            return this.f28949a;
        }

        /* renamed from: g */
        public int mo24806g() {
            return this.f28952d;
        }

        /* renamed from: h */
        public int mo24807h() {
            return this.f28954f;
        }

        /* renamed from: i */
        public CharSequence mo24808i() {
            return this.f28950b;
        }

        /* renamed from: j */
        public boolean mo24809j() {
            TabLayout tabLayout = this.f28955g;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.f28952d;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo24810k() {
            this.f28955g = null;
            this.f28956h = null;
            this.f28949a = null;
            this.f28957i = -1;
            this.f28950b = null;
            this.f28951c = null;
            this.f28952d = -1;
            this.f28953e = null;
        }

        /* renamed from: l */
        public void mo24811l() {
            TabLayout tabLayout = this.f28955g;
            if (tabLayout != null) {
                tabLayout.mo24723F(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: m */
        public C6203g mo24812m(CharSequence charSequence) {
            this.f28951c = charSequence;
            mo24819t();
            return this;
        }

        /* renamed from: n */
        public C6203g mo24813n(int i) {
            mo24814o(LayoutInflater.from(this.f28956h.getContext()).inflate(i, this.f28956h, false));
            return this;
        }

        /* renamed from: o */
        public C6203g mo24814o(View view) {
            this.f28953e = view;
            mo24819t();
            return this;
        }

        /* renamed from: p */
        public C6203g mo24815p(int i) {
            TabLayout tabLayout = this.f28955g;
            if (tabLayout != null) {
                mo24816q(C3410a.m14543d(tabLayout.getContext(), i));
                return this;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: q */
        public C6203g mo24816q(Drawable drawable) {
            this.f28949a = drawable;
            TabLayout tabLayout = this.f28955g;
            if (tabLayout.f28895C == 1 || tabLayout.f28898F == 2) {
                tabLayout.mo24730P(true);
            }
            mo24819t();
            if (C5908a.f27741a && this.f28956h.m37127l() && this.f28956h.f28965k.isVisible()) {
                this.f28956h.invalidate();
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo24817r(int i) {
            this.f28952d = i;
        }

        /* renamed from: s */
        public C6203g mo24818s(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f28951c) && !TextUtils.isEmpty(charSequence)) {
                this.f28956h.setContentDescription(charSequence);
            }
            this.f28950b = charSequence;
            mo24819t();
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo24819t() {
            C6205i iVar = this.f28956h;
            if (iVar != null) {
                iVar.mo24831t();
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$h */
    public static class C6204h implements ViewPager.C1180i {

        /* renamed from: a */
        private final WeakReference<TabLayout> f28958a;

        /* renamed from: b */
        private int f28959b;

        /* renamed from: c */
        private int f28960c;

        public C6204h(TabLayout tabLayout) {
            this.f28958a = new WeakReference<>(tabLayout);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo24820a() {
            this.f28960c = 0;
            this.f28959b = 0;
        }

        /* renamed from: d */
        public void mo6207d(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.f28958a.get();
            if (tabLayout != null) {
                int i3 = this.f28960c;
                boolean z = false;
                boolean z2 = i3 != 2 || this.f28959b == 1;
                if (!(i3 == 2 && this.f28959b == 0)) {
                    z = true;
                }
                tabLayout.mo24727J(i, f, z2, z);
            }
        }

        /* renamed from: r */
        public void mo6209r(int i) {
            this.f28959b = this.f28960c;
            this.f28960c = i;
        }

        /* renamed from: s */
        public void mo6210s(int i) {
            TabLayout tabLayout = (TabLayout) this.f28958a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f28960c;
                tabLayout.mo24724G(tabLayout.mo24783x(i), i2 == 0 || (i2 == 2 && this.f28959b == 0));
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$i */
    public final class C6205i extends LinearLayout {

        /* renamed from: g */
        private C6203g f28961g;

        /* renamed from: h */
        private TextView f28962h;

        /* renamed from: i */
        private ImageView f28963i;

        /* renamed from: j */
        private View f28964j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public BadgeDrawable f28965k;

        /* renamed from: l */
        private View f28966l;

        /* renamed from: m */
        private TextView f28967m;

        /* renamed from: n */
        private ImageView f28968n;

        /* renamed from: o */
        private Drawable f28969o;

        /* renamed from: p */
        private int f28970p = 2;

        /* renamed from: com.google.android.material.tabs.TabLayout$i$a */
        class C6206a implements View.OnLayoutChangeListener {

            /* renamed from: a */
            final /* synthetic */ View f28972a;

            C6206a(View view) {
                this.f28972a = view;
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.f28972a.getVisibility() == 0) {
                    C6205i.this.m37133s(this.f28972a);
                }
            }
        }

        public C6205i(Context context) {
            super(context);
            m37134u(context);
            C3774v.m16156D0(this, TabLayout.this.f28918j, TabLayout.this.f28919k, TabLayout.this.f28920l, TabLayout.this.f28921m);
            setGravity(17);
            setOrientation(TabLayout.this.f28899G ^ true ? 1 : 0);
            setClickable(true);
            C3774v.m16158E0(this, C3771s.m16145b(getContext(), 1002));
        }

        /* renamed from: f */
        private void m37121f(View view) {
            if (view != null) {
                view.addOnLayoutChangeListener(new C6206a(view));
            }
        }

        /* renamed from: g */
        private float m37122g(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        private BadgeDrawable getBadge() {
            return this.f28965k;
        }

        private BadgeDrawable getOrCreateBadge() {
            if (this.f28965k == null) {
                this.f28965k = BadgeDrawable.m35303c(getContext());
            }
            m37132r();
            BadgeDrawable badgeDrawable = this.f28965k;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* renamed from: h */
        private void m37123h(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        /* renamed from: i */
        private FrameLayout m37124i() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public void m37125j(Canvas canvas) {
            Drawable drawable = this.f28969o;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f28969o.draw(canvas);
            }
        }

        /* renamed from: k */
        private FrameLayout m37126k(View view) {
            if ((view == this.f28963i || view == this.f28962h) && C5908a.f27741a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public boolean m37127l() {
            return this.f28965k != null;
        }

        /* renamed from: m */
        private void m37128m() {
            ViewGroup viewGroup;
            if (C5908a.f27741a) {
                viewGroup = m37124i();
                addView(viewGroup, 0);
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(C7496h.design_layout_tab_icon, viewGroup, false);
            this.f28963i = imageView;
            viewGroup.addView(imageView, 0);
        }

        /* renamed from: n */
        private void m37129n() {
            ViewGroup viewGroup;
            if (C5908a.f27741a) {
                viewGroup = m37124i();
                addView(viewGroup);
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C7496h.design_layout_tab_text, viewGroup, false);
            this.f28962h = textView;
            viewGroup.addView(textView);
        }

        /* renamed from: p */
        private void m37130p(View view) {
            if (m37127l() && view != null) {
                m37123h(false);
                C5908a.m35358a(this.f28965k, view, m37126k(view));
                this.f28964j = view;
            }
        }

        /* renamed from: q */
        private void m37131q() {
            if (m37127l()) {
                m37123h(true);
                View view = this.f28964j;
                if (view != null) {
                    C5908a.m35361d(this.f28965k, view);
                    this.f28964j = null;
                }
            }
        }

        /* renamed from: r */
        private void m37132r() {
            C6203g gVar;
            C6203g gVar2;
            if (m37127l()) {
                if (this.f28966l != null) {
                    m37131q();
                } else if (this.f28963i != null && (gVar2 = this.f28961g) != null && gVar2.mo24805f() != null) {
                    View view = this.f28964j;
                    ImageView imageView = this.f28963i;
                    if (view != imageView) {
                        m37131q();
                        m37130p(this.f28963i);
                        return;
                    }
                    m37133s(imageView);
                } else if (this.f28962h == null || (gVar = this.f28961g) == null || gVar.mo24807h() != 1) {
                    m37131q();
                } else {
                    View view2 = this.f28964j;
                    TextView textView = this.f28962h;
                    if (view2 != textView) {
                        m37131q();
                        m37130p(this.f28962h);
                        return;
                    }
                    m37133s(textView);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public void m37133s(View view) {
            if (m37127l() && view == this.f28964j) {
                C5908a.m35362e(this.f28965k, view, m37126k(view));
            }
        }

        /* JADX WARNING: type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable] */
        /* JADX WARNING: type inference failed for: r0v3, types: [android.graphics.drawable.RippleDrawable] */
        /* access modifiers changed from: private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: u */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m37134u(android.content.Context r7) {
            /*
                r6 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.f28931w
                r1 = 0
                if (r0 == 0) goto L_0x001f
                android.graphics.drawable.Drawable r7 = p082e.p083a.p084k.p085a.C3410a.m14543d(r7, r0)
                r6.f28969o = r7
                if (r7 == 0) goto L_0x0021
                boolean r7 = r7.isStateful()
                if (r7 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r7 = r6.f28969o
                int[] r0 = r6.getDrawableState()
                r7.setState(r0)
                goto L_0x0021
            L_0x001f:
                r6.f28969o = r1
            L_0x0021:
                android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
                r7.<init>()
                r0 = 0
                r7.setColor(r0)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f28925q
                if (r2 == 0) goto L_0x0074
                android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
                r2.<init>()
                r3 = 925353388(0x3727c5ac, float:1.0E-5)
                r2.setCornerRadius(r3)
                r3 = -1
                r2.setColor(r3)
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r3 = r3.f28925q
                android.content.res.ColorStateList r3 = p159f.p243f.p245b.p304b.p313u.C7531b.m42043a(r3)
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 21
                if (r4 < r5) goto L_0x005f
                android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.f28902J
                if (r4 == 0) goto L_0x0056
                r7 = r1
            L_0x0056:
                if (r4 == 0) goto L_0x0059
                goto L_0x005a
            L_0x0059:
                r1 = r2
            L_0x005a:
                r0.<init>(r3, r7, r1)
                r7 = r0
                goto L_0x0074
            L_0x005f:
                android.graphics.drawable.Drawable r1 = androidx.core.graphics.drawable.C0534a.m3292r(r2)
                androidx.core.graphics.drawable.C0534a.m3289o(r1, r3)
                android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
                r3 = 2
                android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[r3]
                r3[r0] = r7
                r7 = 1
                r3[r7] = r1
                r2.<init>(r3)
                r7 = r2
            L_0x0074:
                p082e.p109h.p119p.C3774v.m16223r0(r6, r7)
                com.google.android.material.tabs.TabLayout r7 = com.google.android.material.tabs.TabLayout.this
                r7.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.C6205i.m37134u(android.content.Context):void");
        }

        /* renamed from: w */
        private void m37135w(TextView textView, ImageView imageView) {
            C6203g gVar = this.f28961g;
            CharSequence charSequence = null;
            Drawable mutate = (gVar == null || gVar.mo24805f() == null) ? null : C0534a.m3292r(this.f28961g.mo24805f()).mutate();
            C6203g gVar2 = this.f28961g;
            CharSequence i = gVar2 != null ? gVar2.mo24808i() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(i);
            if (textView != null) {
                if (z) {
                    textView.setText(i);
                    if (this.f28961g.f28954f == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int c = (!z || imageView.getVisibility() != 0) ? 0 : (int) C6100s.m36582c(getContext(), 8);
                if (TabLayout.this.f28899G) {
                    if (c != C3760h.m16093a(marginLayoutParams)) {
                        C3760h.m16096d(marginLayoutParams, c);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (c != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = c;
                    C3760h.m16096d(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            C6203g gVar3 = this.f28961g;
            if (gVar3 != null) {
                charSequence = gVar3.f28951c;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 21 || i2 > 23) {
                if (!z) {
                    i = charSequence;
                }
                C0285i0.m1700a(this, i);
            }
        }

        /* access modifiers changed from: protected */
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f28969o;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.f28969o.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* access modifiers changed from: package-private */
        public int getContentHeight() {
            View[] viewArr = {this.f28962h, this.f28963i, this.f28966l};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getTop()) : view.getTop();
                    i = z ? Math.max(i, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return i - i2;
        }

        /* access modifiers changed from: package-private */
        public int getContentWidth() {
            View[] viewArr = {this.f28962h, this.f28963i, this.f28966l};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i - i2;
        }

        public C6203g getTab() {
            return this.f28961g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo24825o() {
            setTab((C6203g) null);
            setSelected(false);
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.f28965k;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(contentDescription + ", " + this.f28965k.mo22934h());
            }
            C3736c I0 = C3736c.m15976I0(accessibilityNodeInfo);
            I0.mo13120f0(C3736c.C3739c.m16068a(0, 1, this.f28961g.mo24806g(), 1, false, isSelected()));
            if (isSelected()) {
                I0.mo13116d0(false);
                I0.mo13104T(C3736c.C3737a.f11794g);
            }
            I0.mo13149w0(getResources().getString(C7498j.item_view_role_description));
        }

        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f28932x, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f28962h != null) {
                float f = TabLayout.this.f28929u;
                int i3 = this.f28970p;
                ImageView imageView = this.f28963i;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f28962h;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.f28930v;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f28962h.getTextSize();
                int lineCount = this.f28962h.getLineCount();
                int d = C0556l.m3422d(this.f28962h);
                int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i4 != 0 || (d >= 0 && i3 != d)) {
                    if (TabLayout.this.f28898F == 1 && i4 > 0 && lineCount == 1 && ((layout = this.f28962h.getLayout()) == null || m37122g(layout, 0, f) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                        z = false;
                    }
                    if (z) {
                        this.f28962h.setTextSize(0, f);
                        this.f28962h.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f28961g == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f28961g.mo24811l();
            return true;
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.f28962h;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f28963i;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f28966l;
            if (view != null) {
                view.setSelected(z);
            }
        }

        /* access modifiers changed from: package-private */
        public void setTab(C6203g gVar) {
            if (gVar != this.f28961g) {
                this.f28961g = gVar;
                mo24831t();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public final void mo24831t() {
            C6203g gVar = this.f28961g;
            Drawable drawable = null;
            View e = gVar != null ? gVar.mo24804e() : null;
            if (e != null) {
                ViewParent parent = e.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(e);
                    }
                    addView(e);
                }
                this.f28966l = e;
                TextView textView = this.f28962h;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f28963i;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f28963i.setImageDrawable((Drawable) null);
                }
                TextView textView2 = (TextView) e.findViewById(16908308);
                this.f28967m = textView2;
                if (textView2 != null) {
                    this.f28970p = C0556l.m3422d(textView2);
                }
                this.f28968n = (ImageView) e.findViewById(16908294);
            } else {
                View view = this.f28966l;
                if (view != null) {
                    removeView(view);
                    this.f28966l = null;
                }
                this.f28967m = null;
                this.f28968n = null;
            }
            if (this.f28966l == null) {
                if (this.f28963i == null) {
                    m37128m();
                }
                if (!(gVar == null || gVar.mo24805f() == null)) {
                    drawable = C0534a.m3292r(gVar.mo24805f()).mutate();
                }
                if (drawable != null) {
                    C0534a.m3289o(drawable, TabLayout.this.f28924p);
                    PorterDuff.Mode mode = TabLayout.this.f28928t;
                    if (mode != null) {
                        C0534a.m3290p(drawable, mode);
                    }
                }
                if (this.f28962h == null) {
                    m37129n();
                    this.f28970p = C0556l.m3422d(this.f28962h);
                }
                C0556l.m3435q(this.f28962h, TabLayout.this.f28922n);
                ColorStateList colorStateList = TabLayout.this.f28923o;
                if (colorStateList != null) {
                    this.f28962h.setTextColor(colorStateList);
                }
                m37135w(this.f28962h, this.f28963i);
                m37132r();
                m37121f(this.f28963i);
                m37121f(this.f28962h);
            } else {
                TextView textView3 = this.f28967m;
                if (!(textView3 == null && this.f28968n == null)) {
                    m37135w(textView3, this.f28968n);
                }
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.f28951c)) {
                setContentDescription(gVar.f28951c);
            }
            setSelected(gVar != null && gVar.mo24809j());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public final void mo24832v() {
            setOrientation(TabLayout.this.f28899G ^ true ? 1 : 0);
            TextView textView = this.f28967m;
            if (textView == null && this.f28968n == null) {
                m37135w(this.f28962h, this.f28963i);
            } else {
                m37135w(textView, this.f28968n);
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$j */
    public static class C6207j implements C6198d {

        /* renamed from: a */
        private final ViewPager f28974a;

        public C6207j(ViewPager viewPager) {
            this.f28974a = viewPager;
        }

        /* renamed from: a */
        public void mo24788a(C6203g gVar) {
        }

        /* renamed from: b */
        public void mo24789b(C6203g gVar) {
            this.f28974a.setCurrentItem(gVar.mo24806g());
        }

        /* renamed from: c */
        public void mo24790c(C6203g gVar) {
        }
    }

    public TabLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: E */
    private void m37037E(int i) {
        C6205i iVar = (C6205i) this.f28917i.getChildAt(i);
        this.f28917i.removeViewAt(i);
        if (iVar != null) {
            iVar.mo24825o();
            this.f28914V.mo8512a(iVar);
        }
        requestLayout();
    }

    /* renamed from: M */
    private void m37038M(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.f28908P;
        if (viewPager2 != null) {
            C6204h hVar = this.f28911S;
            if (hVar != null) {
                viewPager2.mo6217J(hVar);
            }
            C6196b bVar = this.f28912T;
            if (bVar != null) {
                this.f28908P.mo6216I(bVar);
            }
        }
        C6197c cVar = this.f28906N;
        if (cVar != null) {
            mo24722D(cVar);
            this.f28906N = null;
        }
        if (viewPager != null) {
            this.f28908P = viewPager;
            if (this.f28911S == null) {
                this.f28911S = new C6204h(this);
            }
            this.f28911S.mo24820a();
            viewPager.mo6230c(this.f28911S);
            C6207j jVar = new C6207j(viewPager);
            this.f28906N = jVar;
            mo24735c(jVar);
            C1184a adapter = viewPager.getAdapter();
            if (adapter != null) {
                mo24725H(adapter, z);
            }
            if (this.f28912T == null) {
                this.f28912T = new C6196b();
            }
            this.f28912T.mo24787b(z);
            viewPager.mo6229b(this.f28912T);
            mo24726I(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f28908P = null;
            mo24725H((C1184a) null, false);
        }
        this.f28913U = z2;
    }

    /* renamed from: N */
    private void m37039N() {
        int size = this.f28915g.size();
        for (int i = 0; i < size; i++) {
            this.f28915g.get(i).mo24819t();
        }
    }

    /* renamed from: O */
    private void m37040O(LinearLayout.LayoutParams layoutParams) {
        if (this.f28898F == 1 && this.f28895C == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    private int getDefaultHeight() {
        int size = this.f28915g.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                C6203g gVar = this.f28915g.get(i);
                if (gVar != null && gVar.mo24805f() != null && !TextUtils.isEmpty(gVar.mo24808i())) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return (!z || this.f28899G) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i = this.f28933y;
        if (i != -1) {
            return i;
        }
        int i2 = this.f28898F;
        if (i2 == 0 || i2 == 2) {
            return this.f28893A;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f28917i.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: h */
    private void m37043h(TabItem tabItem) {
        C6203g z = mo24785z();
        CharSequence charSequence = tabItem.f28888g;
        if (charSequence != null) {
            z.mo24818s(charSequence);
        }
        Drawable drawable = tabItem.f28889h;
        if (drawable != null) {
            z.mo24816q(drawable);
        }
        int i = tabItem.f28890i;
        if (i != 0) {
            z.mo24813n(i);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            z.mo24812m(tabItem.getContentDescription());
        }
        mo24737e(z);
    }

    /* renamed from: i */
    private void m37044i(C6203g gVar) {
        C6205i iVar = gVar.f28956h;
        iVar.setSelected(false);
        iVar.setActivated(false);
        this.f28917i.addView(iVar, gVar.mo24806g(), m37052q());
    }

    /* renamed from: j */
    private void m37045j(View view) {
        if (view instanceof TabItem) {
            m37043h((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: k */
    private void m37046k(int i) {
        if (i != -1) {
            if (getWindowToken() == null || !C3774v.m16181T(this) || this.f28917i.mo24794c()) {
                mo24726I(i, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int n = m37049n(i, 0.0f);
            if (scrollX != n) {
                m37057w();
                this.f28907O.setIntValues(new int[]{scrollX, n});
                this.f28907O.start();
            }
            this.f28917i.mo24793b(i, this.f28896D);
        }
    }

    /* renamed from: l */
    private void m37047l(int i) {
        if (i == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i == 1) {
            this.f28917i.setGravity(1);
            return;
        } else if (i != 2) {
            return;
        }
        this.f28917i.setGravity(8388611);
    }

    /* renamed from: m */
    private void m37048m() {
        int i;
        int i2 = this.f28898F;
        if (i2 == 0 || i2 == 2) {
            i = Math.max(0, this.f28894B - this.f28918j);
        } else {
            i = 0;
        }
        C3774v.m16156D0(this.f28917i, i, 0, 0, 0);
        int i3 = this.f28898F;
        if (i3 == 0) {
            m37047l(this.f28895C);
        } else if (i3 == 1 || i3 == 2) {
            if (this.f28895C == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f28917i.setGravity(1);
        }
        mo24730P(true);
    }

    /* renamed from: n */
    private int m37049n(int i, float f) {
        int i2 = this.f28898F;
        int i3 = 0;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        View childAt = this.f28917i.getChildAt(i);
        int i4 = i + 1;
        View childAt2 = i4 < this.f28917i.getChildCount() ? this.f28917i.getChildAt(i4) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i3 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) (((float) (width + i3)) * 0.5f * f);
        return C3774v.m16151B(this) == 0 ? left + i5 : left - i5;
    }

    /* renamed from: o */
    private void m37050o(C6203g gVar, int i) {
        gVar.mo24817r(i);
        this.f28915g.add(i, gVar);
        int size = this.f28915g.size();
        while (true) {
            i++;
            if (i < size) {
                this.f28915g.get(i).mo24817r(i);
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    private static ColorStateList m37051p(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    /* renamed from: q */
    private LinearLayout.LayoutParams m37052q() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m37040O(layoutParams);
        return layoutParams;
    }

    /* renamed from: s */
    private C6205i m37053s(C6203g gVar) {
        C3700f<C6205i> fVar = this.f28914V;
        C6205i b = fVar != null ? fVar.mo8513b() : null;
        if (b == null) {
            b = new C6205i(getContext());
        }
        b.setTab(gVar);
        b.setFocusable(true);
        b.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f28951c)) {
            b.setContentDescription(gVar.f28950b);
        } else {
            b.setContentDescription(gVar.f28951c);
        }
        return b;
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f28917i.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f28917i.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    /* renamed from: t */
    private void m37054t(C6203g gVar) {
        for (int size = this.f28905M.size() - 1; size >= 0; size--) {
            this.f28905M.get(size).mo24788a(gVar);
        }
    }

    /* renamed from: u */
    private void m37055u(C6203g gVar) {
        for (int size = this.f28905M.size() - 1; size >= 0; size--) {
            this.f28905M.get(size).mo24789b(gVar);
        }
    }

    /* renamed from: v */
    private void m37056v(C6203g gVar) {
        for (int size = this.f28905M.size() - 1; size >= 0; size--) {
            this.f28905M.get(size).mo24790c(gVar);
        }
    }

    /* renamed from: w */
    private void m37057w() {
        if (this.f28907O == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f28907O = valueAnimator;
            valueAnimator.setInterpolator(C7501a.f32700b);
            this.f28907O.setDuration((long) this.f28896D);
            this.f28907O.addUpdateListener(new C6195a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo24719A() {
        int currentItem;
        mo24721C();
        C1184a aVar = this.f28909Q;
        if (aVar != null) {
            int e = aVar.mo6295e();
            for (int i = 0; i < e; i++) {
                C6203g z = mo24785z();
                z.mo24818s(this.f28909Q.mo6297g(i));
                mo24739g(z, false);
            }
            ViewPager viewPager = this.f28908P;
            if (viewPager != null && e > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                mo24723F(mo24783x(currentItem));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public boolean mo24720B(C6203g gVar) {
        return f28892a0.mo8512a(gVar);
    }

    /* renamed from: C */
    public void mo24721C() {
        for (int childCount = this.f28917i.getChildCount() - 1; childCount >= 0; childCount--) {
            m37037E(childCount);
        }
        Iterator<C6203g> it = this.f28915g.iterator();
        while (it.hasNext()) {
            C6203g next = it.next();
            it.remove();
            next.mo24810k();
            mo24720B(next);
        }
        this.f28916h = null;
    }

    @Deprecated
    /* renamed from: D */
    public void mo24722D(C6197c cVar) {
        this.f28905M.remove(cVar);
    }

    /* renamed from: F */
    public void mo24723F(C6203g gVar) {
        mo24724G(gVar, true);
    }

    /* renamed from: G */
    public void mo24724G(C6203g gVar, boolean z) {
        C6203g gVar2 = this.f28916h;
        if (gVar2 != gVar) {
            int g = gVar != null ? gVar.mo24806g() : -1;
            if (z) {
                if ((gVar2 == null || gVar2.mo24806g() == -1) && g != -1) {
                    mo24726I(g, 0.0f, true);
                } else {
                    m37046k(g);
                }
                if (g != -1) {
                    setSelectedTabView(g);
                }
            }
            this.f28916h = gVar;
            if (gVar2 != null) {
                m37056v(gVar2);
            }
            if (gVar != null) {
                m37055u(gVar);
            }
        } else if (gVar2 != null) {
            m37054t(gVar);
            m37046k(gVar.mo24806g());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo24725H(C1184a aVar, boolean z) {
        DataSetObserver dataSetObserver;
        C1184a aVar2 = this.f28909Q;
        if (!(aVar2 == null || (dataSetObserver = this.f28910R) == null)) {
            aVar2.mo6305u(dataSetObserver);
        }
        this.f28909Q = aVar;
        if (z && aVar != null) {
            if (this.f28910R == null) {
                this.f28910R = new C6199e();
            }
            aVar.mo6301m(this.f28910R);
        }
        mo24719A();
    }

    /* renamed from: I */
    public void mo24726I(int i, float f, boolean z) {
        mo24727J(i, f, z, true);
    }

    /* renamed from: J */
    public void mo24727J(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f28917i.getChildCount()) {
            if (z2) {
                this.f28917i.mo24796e(i, f);
            }
            ValueAnimator valueAnimator = this.f28907O;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f28907O.cancel();
            }
            scrollTo(m37049n(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    /* renamed from: K */
    public void mo24728K(int i, int i2) {
        setTabTextColors(m37051p(i, i2));
    }

    /* renamed from: L */
    public void mo24729L(ViewPager viewPager, boolean z) {
        m37038M(viewPager, z, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo24730P(boolean z) {
        for (int i = 0; i < this.f28917i.getChildCount(); i++) {
            View childAt = this.f28917i.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m37040O((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public void addView(View view) {
        m37045j(view);
    }

    @Deprecated
    /* renamed from: c */
    public void mo24735c(C6197c cVar) {
        if (!this.f28905M.contains(cVar)) {
            this.f28905M.add(cVar);
        }
    }

    /* renamed from: d */
    public void mo24736d(C6198d dVar) {
        mo24735c(dVar);
    }

    /* renamed from: e */
    public void mo24737e(C6203g gVar) {
        mo24739g(gVar, this.f28915g.isEmpty());
    }

    /* renamed from: f */
    public void mo24738f(C6203g gVar, int i, boolean z) {
        if (gVar.f28955g == this) {
            m37050o(gVar, i);
            m37044i(gVar);
            if (z) {
                gVar.mo24811l();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* renamed from: g */
    public void mo24739g(C6203g gVar, boolean z) {
        mo24738f(gVar, this.f28915g.size(), z);
    }

    public int getSelectedTabPosition() {
        C6203g gVar = this.f28916h;
        if (gVar != null) {
            return gVar.mo24806g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f28915g.size();
    }

    public int getTabGravity() {
        return this.f28895C;
    }

    public ColorStateList getTabIconTint() {
        return this.f28924p;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f28901I;
    }

    public int getTabIndicatorGravity() {
        return this.f28897E;
    }

    /* access modifiers changed from: package-private */
    public int getTabMaxWidth() {
        return this.f28932x;
    }

    public int getTabMode() {
        return this.f28898F;
    }

    public ColorStateList getTabRippleColor() {
        return this.f28925q;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f28926r;
    }

    public ColorStateList getTabTextColors() {
        return this.f28923o;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C7545i.m42139e(this);
        if (this.f28908P == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m37038M((ViewPager) parent, true, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f28913U) {
            setupWithViewPager((ViewPager) null);
            this.f28913U = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        for (int i = 0; i < this.f28917i.getChildCount(); i++) {
            View childAt = this.f28917i.getChildAt(i);
            if (childAt instanceof C6205i) {
                ((C6205i) childAt).m37125j(canvas);
            }
        }
        super.onDraw(canvas);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C3736c.m15976I0(accessibilityNodeInfo).mo13117e0(C3736c.C3738b.m16067b(1, getTabCount(), false, 1));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r0 != 2) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.C6100s.m36582c(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x002e
            if (r1 == 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x0041
        L_0x002e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L_0x0041
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L_0x0041
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L_0x0041:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L_0x005f
            int r1 = r6.f28934z
            if (r1 <= 0) goto L_0x0050
            goto L_0x005d
        L_0x0050:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.C6100s.m36582c(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L_0x005d:
            r6.f28932x = r1
        L_0x005f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto L_0x00ad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.f28898F
            if (r0 == 0) goto L_0x0082
            if (r0 == r5) goto L_0x0076
            r1 = 2
            if (r0 == r1) goto L_0x0082
            goto L_0x008d
        L_0x0076:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L_0x008d
        L_0x0080:
            r4 = 1
            goto L_0x008d
        L_0x0082:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L_0x008d
            goto L_0x0080
        L_0x008d:
            if (r4 == 0) goto L_0x00ad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C6203g mo24757r() {
        C6203g b = f28892a0.mo8513b();
        return b == null ? new C6203g() : b;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C7545i.m42138d(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.f28899G != z) {
            this.f28899G = z;
            for (int i = 0; i < this.f28917i.getChildCount(); i++) {
                View childAt = this.f28917i.getChildAt(i);
                if (childAt instanceof C6205i) {
                    ((C6205i) childAt).mo24832v();
                }
            }
            m37048m();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(C6198d dVar) {
        setOnTabSelectedListener((C6197c) dVar);
    }

    /* access modifiers changed from: package-private */
    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m37057w();
        this.f28907O.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f28926r != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f28926r = drawable;
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f28927s = i;
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f28897E != i) {
            this.f28897E = i;
            C3774v.m16197e0(this.f28917i);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f28917i.mo24797f(i);
    }

    public void setTabGravity(int i) {
        if (this.f28895C != i) {
            this.f28895C = i;
            m37048m();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f28924p != colorStateList) {
            this.f28924p = colorStateList;
            m37039N();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C3410a.m14542c(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.f28901I = i;
        if (i == 0) {
            this.f28903K = new C6209b();
        } else if (i == 1) {
            this.f28903K = new C6208a();
        } else {
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f28900H = z;
        C3774v.m16197e0(this.f28917i);
    }

    public void setTabMode(int i) {
        if (i != this.f28898F) {
            this.f28898F = i;
            m37048m();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f28925q != colorStateList) {
            this.f28925q = colorStateList;
            for (int i = 0; i < this.f28917i.getChildCount(); i++) {
                View childAt = this.f28917i.getChildAt(i);
                if (childAt instanceof C6205i) {
                    ((C6205i) childAt).m37134u(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C3410a.m14542c(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f28923o != colorStateList) {
            this.f28923o = colorStateList;
            m37039N();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(C1184a aVar) {
        mo24725H(aVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f28902J != z) {
            this.f28902J = z;
            for (int i = 0; i < this.f28917i.getChildCount(); i++) {
                View childAt = this.f28917i.getChildAt(i);
                if (childAt instanceof C6205i) {
                    ((C6205i) childAt).m37134u(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        mo24729L(viewPager, true);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* renamed from: x */
    public C6203g mo24783x(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f28915g.get(i);
    }

    /* renamed from: y */
    public boolean mo24784y() {
        return this.f28900H;
    }

    /* renamed from: z */
    public C6203g mo24785z() {
        C6203g r = mo24757r();
        r.f28955g = this;
        r.f28956h = m37053s(r);
        if (r.f28957i != -1) {
            r.f28956h.setId(r.f28957i);
        }
        return r;
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.tabStyle);
    }

    public void addView(View view, int i) {
        m37045j(view);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(C6197c cVar) {
        C6197c cVar2 = this.f28904L;
        if (cVar2 != null) {
            mo24722D(cVar2);
        }
        this.f28904L = cVar;
        if (cVar != null) {
            mo24735c(cVar);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TabLayout(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            int r4 = f28891W
            android.content.Context r12 = com.google.android.material.theme.p249a.C6260a.m37386c(r12, r13, r14, r4)
            r11.<init>(r12, r13, r14)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r11.f28915g = r12
            android.graphics.drawable.GradientDrawable r12 = new android.graphics.drawable.GradientDrawable
            r12.<init>()
            r11.f28926r = r12
            r12 = 0
            r11.f28927s = r12
            r0 = 2147483647(0x7fffffff, float:NaN)
            r11.f28932x = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.f28905M = r0
            e.h.o.g r0 = new e.h.o.g
            r1 = 12
            r0.<init>(r1)
            r11.f28914V = r0
            android.content.Context r6 = r11.getContext()
            r11.setHorizontalScrollBarEnabled(r12)
            com.google.android.material.tabs.TabLayout$f r7 = new com.google.android.material.tabs.TabLayout$f
            r7.<init>(r6)
            r11.f28917i = r7
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r8 = -1
            r0.<init>(r1, r8)
            super.addView(r7, r12, r0)
            int[] r2 = p159f.p243f.p245b.p304b.C7500l.TabLayout
            r9 = 1
            int[] r5 = new int[r9]
            int r10 = p159f.p243f.p245b.p304b.C7500l.TabLayout_tabTextAppearance
            r5[r12] = r10
            r0 = r6
            r1 = r13
            r3 = r14
            android.content.res.TypedArray r13 = com.google.android.material.internal.C6093m.m36563h(r0, r1, r2, r3, r4, r5)
            android.graphics.drawable.Drawable r14 = r11.getBackground()
            boolean r14 = r14 instanceof android.graphics.drawable.ColorDrawable
            if (r14 == 0) goto L_0x0082
            android.graphics.drawable.Drawable r14 = r11.getBackground()
            android.graphics.drawable.ColorDrawable r14 = (android.graphics.drawable.ColorDrawable) r14
            f.f.b.b.w.h r0 = new f.f.b.b.w.h
            r0.<init>()
            int r14 = r14.getColor()
            android.content.res.ColorStateList r14 = android.content.res.ColorStateList.valueOf(r14)
            r0.mo28463a0(r14)
            r0.mo28456P(r6)
            float r14 = p082e.p109h.p119p.C3774v.m16232w(r11)
            r0.mo28462Z(r14)
            p082e.p109h.p119p.C3774v.m16223r0(r11, r0)
        L_0x0082:
            int r14 = p159f.p243f.p245b.p304b.C7500l.TabLayout_tabIndicator
            android.graphics.drawable.Drawable r14 = p159f.p243f.p245b.p304b.p312t.C7522c.m42017d(r6, r13, r14)
            r11.setSelectedTabIndicator((android.graphics.drawable.Drawable) r14)
            int r14 = p159f.p243f.p245b.p304b.C7500l.TabLayout_tabIndicatorColor
            int r14 = r13.getColor(r14, r12)
            r11.setSelectedTabIndicatorColor(r14)
            int r14 = p159f.p243f.p245b.p304b.C7500l.TabLayout_tabIndicatorHeight
            int r14 = r13.getDimensionPixelSize(r14, r8)
            r7.mo24797f(r14)
            int r14 = p159f.p243f.p245b.p304b.C7500l.TabLayout_tabIndicatorGravity
            int r14 = r13.getInt(r14, r12)
            r11.setSelectedTabIndicatorGravity(r14)
            int r14 = p159f.p243f.p245b.p304b.C7500l.TabLayout_tabIndicatorFullWidth
            boolean r14 = r13.getBoolean(r14, r9)
            r11.setTabIndicatorFullWidth(r14)
            int r14 = p159f.p243f.p245b.p304b.C7500l.TabLayout_tabIndicatorAnimationMode
            int r14 = r13.getInt(r14, r12)
            r11.setTabIndicatorAnimationMode(r14)
            int r14 = p159f.p243f.p245b.p304b.C7500l.TabLayout_tabPadding
            int r14 = r13.getDimensionPixelSize(r14, r12)
            r11.f28921m = r14
            r11.f28920l = r14
            r11.f28919k = r14
            r11.f28918j = r14
            int r0 = p159f.p243f.p245b.p304b.C7500l.TabLayout_tabPaddingStart
            int r14 = r13.getDimensionPixelSize(r0, r14)
            r11.f28918j = r14
            int r14 = p159f.p243f.p245b.p304b.C7500l.TabLayout_tabPaddingTop
            int r0 = r11.f28919k
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.f28919k = r14
            int r14 = p159f.p243f.p245b.p304b.C7500l.TabLayout_tabPaddingEnd
            int r0 = r11.f28920l
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.f28920l = r14
            int r14 = p159f.p243f.p245b.p304b.C7500l.TabLayout_tabPaddingBottom
            int r0 = r11.f28921m
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.f28921m = r14
            int r14 = p159f.p243f.p245b.p304b.C7499k.TextAppearance_Design_Tab
            int r14 = r13.getResourceId(r10, r14)
            r11.f28922n = r14
            int[] r0 = p082e.p083a.C3409j.TextAppearance
            android.content.res.TypedArray r14 = r6.obtainStyledAttributes(r14, r0)
            int r0 = p082e.p083a.C3409j.TextAppearance_android_textSize     // Catch:{ all -> 0x01b7 }
            int r0 = r14.getDimensionPixelSize(r0, r12)     // Catch:{ all -> 0x01b7 }
            float r0 = (float) r0     // Catch:{ all -> 0x01b7 }
            r11.f28929u = r0     // Catch:{ all -> 0x01b7 }
            int r0 = p082e.p083a.C3409j.TextAppearance_android_textColor     // Catch:{ all -> 0x01b7 }
            android.content.res.ColorStateList r0 = p159f.p243f.p245b.p304b.p312t.C7522c.m42014a(r6, r14, r0)     // Catch:{ all -> 0x01b7 }
            r11.f28923o = r0     // Catch:{ all -> 0x01b7 }
            r14.recycle()
            int r14 = p159f.p243f.p245b.p304b.C7500l.TabLayout_tabTextColor
            boolean r0 = r13.hasValue(r14)
            if (r0 == 0) goto L_0x011c
            android.content.res.ColorStateList r14 = p159f.p243f.p245b.p304b.p312t.C7522c.m42014a(r6, r13, r14)
            r11.f28923o = r14
        L_0x011c:
            int r14 = p159f.p243f.p245b.p304b.C7500l.TabLayout_tabSelectedTextColor
            boolean r0 = r13.hasValue(r14)
            if (r0 == 0) goto L_0x0134
            int r14 = r13.getColor(r14, r12)
            android.content.res.ColorStateList r0 = r11.f28923o
            int r0 = r0.getDefaultColor()
            android.content.res.ColorStateList r14 = m37051p(r0, r14)
            r11.f28923o = r14
        L_0x0134:
            int r14 = p159f.p243f.p245b.p304b.C7500l.TabLayout_tabIconTint
            android.content.res.ColorStateList r14 = p159f.p243f.p245b.p304b.p312t.C7522c.m42014a(r6, r13, r14)
            r11.f28924p = r14
            int r14 = p159f.p243f.p245b.p304b.C7500l.TabLayout_tabIconTintMode
            int r14 = r13.getInt(r14, r8)
            r0 = 0
            android.graphics.PorterDuff$Mode r14 = com.google.android.material.internal.C6100s.m36588i(r14, r0)
            r11.f28928t = r14
            int r14 = p159f.p243f.p245b.p304b.C7500l.TabLayout_tabRippleColor
            android.content.res.ColorStateList r14 = p159f.p243f.p245b.p304b.p312t.C7522c.m42014a(r6, r13, r14)
            r11.f28925q = r14
            int r14 = p159f.p243f.p245b.p304b.C7500l.TabLayout_tabIndicatorAnimationDuration
            r0 = 300(0x12c, float:4.2E-43)
            int r14 = r13.getInt(r14, r0)
            r11.f28896D = r14
            int r14 = p159f.p243f.p245b.p304b.C7500l.TabLayout_tabMinWidth
            int r14 = r13.getDimensionPixelSize(r14, r8)
            r11.f28933y = r14
            int r14 = p159f.p243f.p245b.p304b.C7500l.TabLayout_tabMaxWidth
            int r14 = r13.getDimensionPixelSize(r14, r8)
            r11.f28934z = r14
            int r14 = p159f.p243f.p245b.p304b.C7500l.TabLayout_tabBackground
            int r14 = r13.getResourceId(r14, r12)
            r11.f28931w = r14
            int r14 = p159f.p243f.p245b.p304b.C7500l.TabLayout_tabContentStart
            int r14 = r13.getDimensionPixelSize(r14, r12)
            r11.f28894B = r14
            int r14 = p159f.p243f.p245b.p304b.C7500l.TabLayout_tabMode
            int r14 = r13.getInt(r14, r9)
            r11.f28898F = r14
            int r14 = p159f.p243f.p245b.p304b.C7500l.TabLayout_tabGravity
            int r14 = r13.getInt(r14, r12)
            r11.f28895C = r14
            int r14 = p159f.p243f.p245b.p304b.C7500l.TabLayout_tabInlineLabel
            boolean r14 = r13.getBoolean(r14, r12)
            r11.f28899G = r14
            int r14 = p159f.p243f.p245b.p304b.C7500l.TabLayout_tabUnboundedRipple
            boolean r12 = r13.getBoolean(r14, r12)
            r11.f28902J = r12
            r13.recycle()
            android.content.res.Resources r12 = r11.getResources()
            int r13 = p159f.p243f.p245b.p304b.C7492d.design_tab_text_size_2line
            int r13 = r12.getDimensionPixelSize(r13)
            float r13 = (float) r13
            r11.f28930v = r13
            int r13 = p159f.p243f.p245b.p304b.C7492d.design_tab_scrollable_min_width
            int r12 = r12.getDimensionPixelSize(r13)
            r11.f28893A = r12
            r11.m37048m()
            return
        L_0x01b7:
            r12 = move-exception
            r14.recycle()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m37045j(view);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(C3410a.m14543d(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m37045j(view);
    }
}
