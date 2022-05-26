package net.coocent.android.xmlparser.widget.view.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import net.coocent.android.xmlparser.widget.view.tabs.p454a.C9553a;
import net.coocent.android.xmlparser.widget.view.tabs.p455b.C9554a;
import net.coocent.android.xmlparser.widget.view.tabs.p456c.C9555a;
import net.coocent.android.xmlparser.widget.view.tabs.p458e.C9557a;
import p082e.p083a.C3409j;
import p082e.p083a.p084k.p085a.C3410a;
import p082e.p109h.p118o.C3700f;
import p082e.p109h.p118o.C3701g;
import p082e.p109h.p118o.C3702h;
import p082e.p109h.p119p.C3760h;
import p082e.p109h.p119p.C3771s;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.p120e0.C3736c;
import p391j.p392a.p393a.C8610c;
import p391j.p392a.p393a.C8612e;
import p391j.p392a.p393a.C8615h;
import p391j.p392a.p393a.C8617j;
import p391j.p392a.p393a.C8618k;

@ViewPager.C1176e
public class TabLayout extends HorizontalScrollView {

    /* renamed from: W */
    private static final int f36612W = C8617j.Widget_Design_TabLayout;

    /* renamed from: a0 */
    private static final C3700f<C9549g> f36613a0 = new C3702h(16);

    /* renamed from: A */
    private final int f36614A;

    /* renamed from: B */
    private int f36615B;

    /* renamed from: C */
    int f36616C;

    /* renamed from: D */
    int f36617D;

    /* renamed from: E */
    int f36618E;

    /* renamed from: F */
    int f36619F;

    /* renamed from: G */
    boolean f36620G;

    /* renamed from: H */
    boolean f36621H;

    /* renamed from: I */
    boolean f36622I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public int f36623J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public int f36624K;

    /* renamed from: L */
    private C9543c f36625L;

    /* renamed from: M */
    private final ArrayList<C9543c> f36626M;

    /* renamed from: N */
    private C9543c f36627N;

    /* renamed from: O */
    private ValueAnimator f36628O;

    /* renamed from: P */
    ViewPager f36629P;

    /* renamed from: Q */
    private C1184a f36630Q;

    /* renamed from: R */
    private DataSetObserver f36631R;

    /* renamed from: S */
    private C9550h f36632S;

    /* renamed from: T */
    private C9542b f36633T;

    /* renamed from: U */
    private boolean f36634U;

    /* renamed from: V */
    private final C3700f<C9551i> f36635V;

    /* renamed from: g */
    private final ArrayList<C9549g> f36636g;

    /* renamed from: h */
    private C9549g f36637h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final RectF f36638i;

    /* renamed from: j */
    final C9546f f36639j;

    /* renamed from: k */
    int f36640k;

    /* renamed from: l */
    int f36641l;

    /* renamed from: m */
    int f36642m;

    /* renamed from: n */
    int f36643n;

    /* renamed from: o */
    int f36644o;

    /* renamed from: p */
    ColorStateList f36645p;

    /* renamed from: q */
    ColorStateList f36646q;

    /* renamed from: r */
    ColorStateList f36647r;

    /* renamed from: s */
    Drawable f36648s;

    /* renamed from: t */
    PorterDuff.Mode f36649t;

    /* renamed from: u */
    float f36650u;

    /* renamed from: v */
    float f36651v;

    /* renamed from: w */
    final int f36652w;

    /* renamed from: x */
    int f36653x;

    /* renamed from: y */
    private final int f36654y;

    /* renamed from: z */
    private final int f36655z;

    /* renamed from: net.coocent.android.xmlparser.widget.view.tabs.TabLayout$a */
    class C9541a implements ValueAnimator.AnimatorUpdateListener {
        C9541a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* renamed from: net.coocent.android.xmlparser.widget.view.tabs.TabLayout$b */
    private class C9542b implements ViewPager.C1179h {

        /* renamed from: a */
        private boolean f36657a;

        C9542b() {
        }

        /* renamed from: a */
        public void mo6206a(ViewPager viewPager, C1184a aVar, C1184a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f36629P == viewPager) {
                tabLayout.mo32829G(aVar2, this.f36657a);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo32892b(boolean z) {
            this.f36657a = z;
        }
    }

    @Deprecated
    /* renamed from: net.coocent.android.xmlparser.widget.view.tabs.TabLayout$c */
    public interface C9543c<T extends C9549g> {
        /* renamed from: a */
        void mo32893a(T t);

        /* renamed from: b */
        void mo32894b(T t);

        /* renamed from: c */
        void mo32895c(T t);
    }

    /* renamed from: net.coocent.android.xmlparser.widget.view.tabs.TabLayout$d */
    public interface C9544d extends C9543c<C9549g> {
    }

    /* renamed from: net.coocent.android.xmlparser.widget.view.tabs.TabLayout$e */
    private class C9545e extends DataSetObserver {
        C9545e() {
        }

        public void onChanged() {
            TabLayout.this.mo32890z();
        }

        public void onInvalidated() {
            TabLayout.this.mo32890z();
        }
    }

    /* renamed from: net.coocent.android.xmlparser.widget.view.tabs.TabLayout$f */
    class C9546f extends LinearLayout {

        /* renamed from: g */
        private int f36660g;

        /* renamed from: h */
        private final Paint f36661h;

        /* renamed from: i */
        private final GradientDrawable f36662i;

        /* renamed from: j */
        int f36663j = -1;

        /* renamed from: k */
        float f36664k;

        /* renamed from: l */
        private int f36665l = -1;

        /* renamed from: m */
        int f36666m = -1;

        /* renamed from: n */
        int f36667n = -1;

        /* renamed from: o */
        ValueAnimator f36668o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public int f36669p = -1;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public int f36670q = -1;

        /* renamed from: net.coocent.android.xmlparser.widget.view.tabs.TabLayout$f$a */
        class C9547a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ int f36672a;

            /* renamed from: b */
            final /* synthetic */ int f36673b;

            C9547a(int i, int i2) {
                this.f36672a = i;
                this.f36673b = i2;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                C9546f fVar = C9546f.this;
                fVar.mo32901h(C9553a.m50143a(fVar.f36669p, this.f36672a, animatedFraction), C9553a.m50143a(C9546f.this.f36670q, this.f36673b, animatedFraction));
            }
        }

        /* renamed from: net.coocent.android.xmlparser.widget.view.tabs.TabLayout$f$b */
        class C9548b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ int f36675a;

            C9548b(int i) {
                this.f36675a = i;
            }

            public void onAnimationEnd(Animator animator) {
                C9546f fVar = C9546f.this;
                fVar.f36663j = this.f36675a;
                fVar.f36664k = 0.0f;
            }

            public void onAnimationStart(Animator animator) {
                C9546f.this.f36663j = this.f36675a;
            }
        }

        C9546f(Context context) {
            super(context);
            setWillNotDraw(false);
            this.f36661h = new Paint();
            this.f36662i = new GradientDrawable();
        }

        /* renamed from: d */
        private int m50096d(int i, int i2, int i3) {
            return i == 0 ? i : i > 0 ? i > i3 ? i3 : i : (-i) > i2 ? -i2 : i;
        }

        /* renamed from: e */
        private int m50097e(int i, int i2, int i3) {
            return i == 0 ? i : i < 0 ? (-i) > i3 ? -i3 : i : i > i2 ? i2 : i;
        }

        /* renamed from: f */
        private void m50098f(C9551i iVar, RectF rectF) {
            int c = iVar.getContentWidth();
            int a = (int) C9557a.m50156a(getContext(), 24);
            if (c < a) {
                c = a;
            }
            int left = (iVar.getLeft() + iVar.getRight()) / 2;
            int i = c / 2;
            int i2 = left - i;
            int i3 = left + i;
            int measuredWidth = iVar.getMeasuredWidth();
            if (measuredWidth != 0) {
                int i4 = (measuredWidth - c) / 2;
                i2 += m50096d(-TabLayout.this.f36623J, i4, i);
                i3 += m50097e(TabLayout.this.f36624K, i4, i);
            }
            rectF.set((float) i2, 0.0f, (float) i3, 0.0f);
        }

        /* renamed from: l */
        private void m50099l() {
            int i;
            int i2;
            View childAt = getChildAt(this.f36663j);
            if (childAt == null || childAt.getWidth() <= 0) {
                i2 = -1;
                i = -1;
            } else {
                i2 = childAt.getLeft();
                i = childAt.getRight();
                TabLayout tabLayout = TabLayout.this;
                if (!tabLayout.f36621H && (childAt instanceof C9551i)) {
                    m50098f((C9551i) childAt, tabLayout.f36638i);
                    i2 = (int) TabLayout.this.f36638i.left;
                    i = (int) TabLayout.this.f36638i.right;
                }
                if (this.f36664k > 0.0f && this.f36663j < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f36663j + 1);
                    int left = childAt2.getLeft();
                    int right = childAt2.getRight();
                    TabLayout tabLayout2 = TabLayout.this;
                    if (!tabLayout2.f36621H && (childAt2 instanceof C9551i)) {
                        m50098f((C9551i) childAt2, tabLayout2.f36638i);
                        left = (int) TabLayout.this.f36638i.left;
                        right = (int) TabLayout.this.f36638i.right;
                    }
                    float f = this.f36664k;
                    i2 = (int) ((((float) left) * f) + ((1.0f - f) * ((float) i2)));
                    i = (int) ((((float) right) * f) + ((1.0f - f) * ((float) i)));
                }
            }
            mo32901h(i2, i);
        }

        /* renamed from: m */
        private void m50100m(boolean z, int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt == null) {
                m50099l();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            TabLayout tabLayout = TabLayout.this;
            if (!tabLayout.f36621H && (childAt instanceof C9551i)) {
                m50098f((C9551i) childAt, tabLayout.f36638i);
                left = (int) TabLayout.this.f36638i.left;
                right = (int) TabLayout.this.f36638i.right;
            }
            int i3 = this.f36666m;
            int i4 = this.f36667n;
            if (i3 != left || i4 != right) {
                if (z) {
                    this.f36669p = i3;
                    this.f36670q = i4;
                }
                C9547a aVar = new C9547a(left, right);
                if (z) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.f36668o = valueAnimator;
                    valueAnimator.setInterpolator(C9553a.f36698a);
                    valueAnimator.setDuration((long) i2);
                    valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                    valueAnimator.addUpdateListener(aVar);
                    valueAnimator.addListener(new C9548b(i));
                    valueAnimator.start();
                    return;
                }
                this.f36668o.removeAllUpdateListeners();
                this.f36668o.addUpdateListener(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo32898c(int i, int i2) {
            ValueAnimator valueAnimator = this.f36668o;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f36668o.cancel();
            }
            m50100m(true, i, i2);
        }

        public void draw(Canvas canvas) {
            Drawable drawable = TabLayout.this.f36648s;
            int i = 0;
            int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
            int i2 = this.f36660g;
            if (i2 >= 0) {
                intrinsicHeight = i2;
            }
            int i3 = TabLayout.this.f36618E;
            if (i3 == 0) {
                i = getHeight() - intrinsicHeight;
                intrinsicHeight = getHeight();
            } else if (i3 == 1) {
                i = (getHeight() - intrinsicHeight) / 2;
                intrinsicHeight = (getHeight() + intrinsicHeight) / 2;
            } else if (i3 != 2) {
                if (i3 != 3) {
                    intrinsicHeight = 0;
                } else {
                    intrinsicHeight = getHeight();
                }
            }
            int i4 = this.f36666m;
            if (i4 >= 0 && this.f36667n > i4) {
                Drawable drawable2 = TabLayout.this.f36648s;
                if (drawable2 == null) {
                    drawable2 = this.f36662i;
                }
                Drawable r = C0534a.m3292r(drawable2);
                r.setBounds(this.f36666m, i, this.f36667n, intrinsicHeight);
                Paint paint = this.f36661h;
                if (paint != null) {
                    if (Build.VERSION.SDK_INT == 21) {
                        r.setColorFilter(paint.getColor(), PorterDuff.Mode.SRC_IN);
                    } else {
                        C0534a.m3288n(r, paint.getColor());
                    }
                }
                r.draw(canvas);
            }
            super.draw(canvas);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public boolean mo32900g() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo32901h(int i, int i2) {
            if (i != this.f36666m || i2 != this.f36667n) {
                this.f36666m = i;
                this.f36667n = i2;
                C3774v.m16197e0(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo32902i(int i, float f) {
            ValueAnimator valueAnimator = this.f36668o;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f36668o.cancel();
            }
            this.f36663j = i;
            this.f36664k = f;
            m50099l();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo32903j(int i) {
            if (this.f36661h.getColor() != i) {
                this.f36661h.setColor(i);
                C3774v.m16197e0(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo32904k(int i) {
            if (this.f36660g != i) {
                this.f36660g = i;
                C3774v.m16197e0(this);
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f36668o;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m50099l();
            } else {
                m50100m(false, this.f36663j, -1);
            }
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z = true;
                if (tabLayout.f36616C == 1 || tabLayout.f36619F == 2) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (((int) C9557a.m50156a(getContext(), 16)) * 2)) {
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
                            tabLayout2.f36616C = 0;
                            tabLayout2.mo32833N(false);
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
            if (Build.VERSION.SDK_INT < 23 && this.f36665l != i) {
                requestLayout();
                this.f36665l = i;
            }
        }
    }

    /* renamed from: net.coocent.android.xmlparser.widget.view.tabs.TabLayout$g */
    public static class C9549g {

        /* renamed from: a */
        private Drawable f36677a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public CharSequence f36678b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public CharSequence f36679c;

        /* renamed from: d */
        private int f36680d = -1;

        /* renamed from: e */
        private View f36681e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f36682f = 1;

        /* renamed from: g */
        public TabLayout f36683g;

        /* renamed from: h */
        public C9551i f36684h;

        /* renamed from: d */
        public View mo32911d() {
            return this.f36681e;
        }

        /* renamed from: e */
        public Drawable mo32912e() {
            return this.f36677a;
        }

        /* renamed from: f */
        public int mo32913f() {
            return this.f36680d;
        }

        /* renamed from: g */
        public CharSequence mo32914g() {
            return this.f36678b;
        }

        /* renamed from: h */
        public boolean mo32915h() {
            TabLayout tabLayout = this.f36683g;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.f36680d;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo32916i() {
            this.f36683g = null;
            this.f36684h = null;
            this.f36677a = null;
            this.f36678b = null;
            this.f36679c = null;
            this.f36680d = -1;
            this.f36681e = null;
        }

        /* renamed from: j */
        public void mo32917j() {
            TabLayout tabLayout = this.f36683g;
            if (tabLayout != null) {
                tabLayout.mo32827E(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: k */
        public C9549g mo32918k(CharSequence charSequence) {
            this.f36679c = charSequence;
            mo32924q();
            return this;
        }

        /* renamed from: l */
        public C9549g mo32919l(int i) {
            mo32920m(LayoutInflater.from(this.f36684h.getContext()).inflate(i, this.f36684h, false));
            return this;
        }

        /* renamed from: m */
        public C9549g mo32920m(View view) {
            this.f36681e = view;
            mo32924q();
            return this;
        }

        /* renamed from: n */
        public C9549g mo32921n(Drawable drawable) {
            this.f36677a = drawable;
            TabLayout tabLayout = this.f36683g;
            if (tabLayout.f36616C == 1 || tabLayout.f36619F == 2) {
                tabLayout.mo32833N(true);
            }
            mo32924q();
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo32922o(int i) {
            this.f36680d = i;
        }

        /* renamed from: p */
        public C9549g mo32923p(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f36679c) && !TextUtils.isEmpty(charSequence)) {
                this.f36684h.setContentDescription(charSequence);
            }
            this.f36678b = charSequence;
            mo32924q();
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo32924q() {
            C9551i iVar = this.f36684h;
            if (iVar != null) {
                iVar.mo32929i();
            }
        }
    }

    /* renamed from: net.coocent.android.xmlparser.widget.view.tabs.TabLayout$h */
    public static class C9550h implements ViewPager.C1180i {

        /* renamed from: a */
        private final WeakReference<TabLayout> f36685a;

        /* renamed from: b */
        private int f36686b;

        /* renamed from: c */
        private int f36687c;

        public C9550h(TabLayout tabLayout) {
            this.f36685a = new WeakReference<>(tabLayout);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo32925a() {
            this.f36687c = 0;
            this.f36686b = 0;
        }

        /* renamed from: d */
        public void mo6207d(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.f36685a.get();
            if (tabLayout != null) {
                int i3 = this.f36687c;
                boolean z = false;
                boolean z2 = i3 != 2 || this.f36686b == 1;
                if (!(i3 == 2 && this.f36686b == 0)) {
                    z = true;
                }
                tabLayout.mo32831I(i, f, z2, z);
            }
        }

        /* renamed from: r */
        public void mo6209r(int i) {
            this.f36686b = this.f36687c;
            this.f36687c = i;
        }

        /* renamed from: s */
        public void mo6210s(int i) {
            TabLayout tabLayout = (TabLayout) this.f36685a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f36687c;
                tabLayout.mo32828F(tabLayout.mo32888x(i), i2 == 0 || (i2 == 2 && this.f36686b == 0));
            }
        }
    }

    /* renamed from: net.coocent.android.xmlparser.widget.view.tabs.TabLayout$i */
    public final class C9551i extends LinearLayout {

        /* renamed from: g */
        private C9549g f36688g;

        /* renamed from: h */
        private TextView f36689h;

        /* renamed from: i */
        private ImageView f36690i;

        /* renamed from: j */
        private View f36691j;

        /* renamed from: k */
        private TextView f36692k;

        /* renamed from: l */
        private ImageView f36693l;

        /* renamed from: m */
        private Drawable f36694m;

        /* renamed from: n */
        private int f36695n = 1;

        public C9551i(Context context) {
            super(context);
            m50135j(context);
            C3774v.m16156D0(this, TabLayout.this.f36640k, TabLayout.this.f36641l, TabLayout.this.f36642m, TabLayout.this.f36643n);
            setGravity(17);
            setOrientation(TabLayout.this.f36620G ^ true ? 1 : 0);
            setClickable(true);
            C3774v.m16158E0(this, C3771s.m16145b(getContext(), 1002));
        }

        /* renamed from: d */
        private float m50131d(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public void m50132e(Canvas canvas) {
            Drawable drawable = this.f36694m;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f36694m.draw(canvas);
            }
        }

        /* renamed from: f */
        private void m50133f() {
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(C8615h.design_layout_tab_icon, this, false);
            this.f36690i = imageView;
            addView(imageView, 0);
        }

        /* renamed from: g */
        private void m50134g() {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C8615h.design_layout_tab_text, this, false);
            this.f36689h = textView;
            addView(textView);
        }

        /* access modifiers changed from: private */
        public int getContentWidth() {
            View[] viewArr = {this.f36689h, this.f36690i, this.f36691j};
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

        /* JADX WARNING: type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable] */
        /* JADX WARNING: type inference failed for: r0v3, types: [android.graphics.drawable.RippleDrawable] */
        /* access modifiers changed from: private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m50135j(android.content.Context r7) {
            /*
                r6 = this;
                net.coocent.android.xmlparser.widget.view.tabs.TabLayout r0 = net.coocent.android.xmlparser.widget.view.tabs.TabLayout.this
                int r0 = r0.f36652w
                r1 = 0
                if (r0 == 0) goto L_0x001f
                android.graphics.drawable.Drawable r7 = p082e.p083a.p084k.p085a.C3410a.m14543d(r7, r0)
                r6.f36694m = r7
                if (r7 == 0) goto L_0x0021
                boolean r7 = r7.isStateful()
                if (r7 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r7 = r6.f36694m
                int[] r0 = r6.getDrawableState()
                r7.setState(r0)
                goto L_0x0021
            L_0x001f:
                r6.f36694m = r1
            L_0x0021:
                android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
                r7.<init>()
                r0 = 0
                r7.setColor(r0)
                net.coocent.android.xmlparser.widget.view.tabs.TabLayout r2 = net.coocent.android.xmlparser.widget.view.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f36647r
                if (r2 == 0) goto L_0x0074
                android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
                r2.<init>()
                r3 = 925353388(0x3727c5ac, float:1.0E-5)
                r2.setCornerRadius(r3)
                r3 = -1
                r2.setColor(r3)
                net.coocent.android.xmlparser.widget.view.tabs.TabLayout r3 = net.coocent.android.xmlparser.widget.view.tabs.TabLayout.this
                android.content.res.ColorStateList r3 = r3.f36647r
                android.content.res.ColorStateList r3 = net.coocent.android.xmlparser.widget.view.tabs.p457d.C9556a.m50153a(r3)
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 21
                if (r4 < r5) goto L_0x005f
                android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
                net.coocent.android.xmlparser.widget.view.tabs.TabLayout r4 = net.coocent.android.xmlparser.widget.view.tabs.TabLayout.this
                boolean r4 = r4.f36622I
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
                net.coocent.android.xmlparser.widget.view.tabs.TabLayout r7 = net.coocent.android.xmlparser.widget.view.tabs.TabLayout.this
                r7.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.coocent.android.xmlparser.widget.view.tabs.TabLayout.C9551i.m50135j(android.content.Context):void");
        }

        /* renamed from: l */
        private void m50136l(TextView textView, ImageView imageView) {
            C9549g gVar = this.f36688g;
            CharSequence charSequence = null;
            Drawable mutate = (gVar == null || gVar.mo32912e() == null) ? null : C0534a.m3292r(this.f36688g.mo32912e()).mutate();
            C9549g gVar2 = this.f36688g;
            CharSequence g = gVar2 != null ? gVar2.mo32914g() : null;
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
            boolean z = !TextUtils.isEmpty(g);
            if (textView != null) {
                if (z) {
                    textView.setText(g);
                    if (this.f36688g.f36682f == 1) {
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
                int a = (!z || imageView.getVisibility() != 0) ? 0 : (int) C9557a.m50156a(getContext(), 8);
                if (TabLayout.this.f36620G) {
                    if (a != C3760h.m16093a(marginLayoutParams)) {
                        C3760h.m16096d(marginLayoutParams, a);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (a != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = a;
                    C3760h.m16096d(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            C9549g gVar3 = this.f36688g;
            CharSequence a2 = gVar3 != null ? gVar3.f36679c : null;
            if (!z) {
                charSequence = a2;
            }
            C0285i0.m1700a(this, charSequence);
        }

        /* access modifiers changed from: protected */
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f36694m;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.f36694m.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public C9549g getTab() {
            return this.f36688g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo32928h() {
            setTab((C9549g) null);
            setSelected(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public final void mo32929i() {
            C9549g gVar = this.f36688g;
            Drawable drawable = null;
            View d = gVar != null ? gVar.mo32911d() : null;
            if (d != null) {
                ViewParent parent = d.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(d);
                    }
                    addView(d);
                }
                this.f36691j = d;
                TextView textView = this.f36689h;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f36690i;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f36690i.setImageDrawable((Drawable) null);
                }
                TextView textView2 = (TextView) d.findViewById(16908308);
                this.f36692k = textView2;
                if (textView2 != null) {
                    this.f36695n = C0556l.m3422d(textView2);
                }
                this.f36693l = (ImageView) d.findViewById(16908294);
            } else {
                View view = this.f36691j;
                if (view != null) {
                    removeView(view);
                    this.f36691j = null;
                }
                this.f36692k = null;
                this.f36693l = null;
            }
            if (this.f36691j == null) {
                if (this.f36690i == null) {
                    m50133f();
                }
                if (!(gVar == null || gVar.mo32912e() == null)) {
                    drawable = C0534a.m3292r(gVar.mo32912e()).mutate();
                }
                if (drawable != null) {
                    C0534a.m3289o(drawable, TabLayout.this.f36646q);
                    PorterDuff.Mode mode = TabLayout.this.f36649t;
                    if (mode != null) {
                        C0534a.m3290p(drawable, mode);
                    }
                }
                if (this.f36689h == null) {
                    m50134g();
                    this.f36695n = C0556l.m3422d(this.f36689h);
                }
                C0556l.m3435q(this.f36689h, TabLayout.this.f36644o);
                ColorStateList colorStateList = TabLayout.this.f36645p;
                if (colorStateList != null) {
                    this.f36689h.setTextColor(colorStateList);
                }
                m50136l(this.f36689h, this.f36690i);
            } else {
                TextView textView3 = this.f36692k;
                if (!(textView3 == null && this.f36693l == null)) {
                    m50136l(textView3, this.f36693l);
                }
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.f36679c)) {
                setContentDescription(gVar.f36679c);
            }
            setSelected(gVar != null && gVar.mo32915h());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public final void mo32930k() {
            setOrientation(TabLayout.this.f36620G ^ true ? 1 : 0);
            TextView textView = this.f36692k;
            if (textView == null && this.f36693l == null) {
                m50136l(this.f36689h, this.f36690i);
            } else {
                m50136l(textView, this.f36693l);
            }
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            C3736c I0 = C3736c.m15976I0(accessibilityNodeInfo);
            I0.mo13120f0(C3736c.C3739c.m16068a(0, 1, this.f36688g.mo32913f(), 1, false, isSelected()));
            if (isSelected()) {
                I0.mo13116d0(false);
                I0.mo13104T(C3736c.C3737a.f11794g);
            }
            I0.mo13149w0("Tab");
        }

        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f36653x, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f36689h != null) {
                float f = TabLayout.this.f36650u;
                int i3 = this.f36695n;
                ImageView imageView = this.f36690i;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f36689h;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.f36651v;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f36689h.getTextSize();
                int lineCount = this.f36689h.getLineCount();
                int d = C0556l.m3422d(this.f36689h);
                int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i4 != 0 || (d >= 0 && i3 != d)) {
                    if (TabLayout.this.f36619F == 1 && i4 > 0 && lineCount == 1 && ((layout = this.f36689h.getLayout()) == null || m50131d(layout, 0, f) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                        z = false;
                    }
                    if (z) {
                        this.f36689h.setTextSize(0, f);
                        this.f36689h.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f36688g == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f36688g.mo32917j();
            return true;
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.f36689h;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f36690i;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f36691j;
            if (view != null) {
                view.setSelected(z);
            }
        }

        /* access modifiers changed from: package-private */
        public void setTab(C9549g gVar) {
            if (gVar != this.f36688g) {
                this.f36688g = gVar;
                mo32929i();
            }
        }
    }

    /* renamed from: net.coocent.android.xmlparser.widget.view.tabs.TabLayout$j */
    public static class C9552j implements C9544d {

        /* renamed from: a */
        private final ViewPager f36697a;

        public C9552j(ViewPager viewPager) {
            this.f36697a = viewPager;
        }

        /* renamed from: a */
        public void mo32893a(C9549g gVar) {
        }

        /* renamed from: b */
        public void mo32894b(C9549g gVar) {
            this.f36697a.setCurrentItem(gVar.mo32913f());
        }

        /* renamed from: c */
        public void mo32895c(C9549g gVar) {
        }
    }

    public TabLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: D */
    private void m50049D(int i) {
        C9551i iVar = (C9551i) this.f36639j.getChildAt(i);
        this.f36639j.removeViewAt(i);
        if (iVar != null) {
            iVar.mo32928h();
            this.f36635V.mo8512a(iVar);
        }
        requestLayout();
    }

    /* renamed from: K */
    private void m50050K(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.f36629P;
        if (viewPager2 != null) {
            C9550h hVar = this.f36632S;
            if (hVar != null) {
                viewPager2.mo6217J(hVar);
            }
            C9542b bVar = this.f36633T;
            if (bVar != null) {
                this.f36629P.mo6216I(bVar);
            }
        }
        C9543c cVar = this.f36627N;
        if (cVar != null) {
            mo32826C(cVar);
            this.f36627N = null;
        }
        if (viewPager != null) {
            this.f36629P = viewPager;
            if (this.f36632S == null) {
                this.f36632S = new C9550h(this);
            }
            this.f36632S.mo32925a();
            viewPager.mo6230c(this.f36632S);
            C9552j jVar = new C9552j(viewPager);
            this.f36627N = jVar;
            mo32838d(jVar);
            C1184a adapter = viewPager.getAdapter();
            if (adapter != null) {
                mo32829G(adapter, z);
            }
            if (this.f36633T == null) {
                this.f36633T = new C9542b();
            }
            this.f36633T.mo32892b(z);
            viewPager.mo6229b(this.f36633T);
            mo32830H(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f36629P = null;
            mo32829G((C1184a) null, false);
        }
        this.f36634U = z2;
    }

    /* renamed from: L */
    private void m50051L() {
        int size = this.f36636g.size();
        for (int i = 0; i < size; i++) {
            this.f36636g.get(i).mo32924q();
        }
    }

    /* renamed from: M */
    private void m50052M(LinearLayout.LayoutParams layoutParams) {
        if (this.f36619F == 1 && this.f36616C == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    private int getDefaultHeight() {
        int size = this.f36636g.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                C9549g gVar = this.f36636g.get(i);
                if (gVar != null && gVar.mo32912e() != null && !TextUtils.isEmpty(gVar.mo32914g())) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return (!z || this.f36620G) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i = this.f36654y;
        if (i != -1) {
            return i;
        }
        int i2 = this.f36619F;
        if (i2 == 0 || i2 == 2) {
            return this.f36614A;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f36639j.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: h */
    private void m50056h(TabItem tabItem) {
        C9549g y = mo32889y();
        CharSequence charSequence = tabItem.f36609g;
        if (charSequence != null) {
            y.mo32923p(charSequence);
        }
        Drawable drawable = tabItem.f36610h;
        if (drawable != null) {
            y.mo32921n(drawable);
        }
        int i = tabItem.f36611i;
        if (i != 0) {
            y.mo32919l(i);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            y.mo32918k(tabItem.getContentDescription());
        }
        mo32839e(y);
    }

    /* renamed from: i */
    private void m50057i(C9549g gVar) {
        C9551i iVar = gVar.f36684h;
        iVar.setSelected(false);
        iVar.setActivated(false);
        this.f36639j.addView(iVar, gVar.mo32913f(), m50065q());
    }

    /* renamed from: j */
    private void m50058j(View view) {
        if (view instanceof TabItem) {
            m50056h((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: k */
    private void m50059k(int i) {
        if (i != -1) {
            if (getWindowToken() == null || !C3774v.m16181T(this) || this.f36639j.mo32900g()) {
                mo32830H(i, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int n = m50062n(i, 0.0f);
            if (scrollX != n) {
                m50070w();
                this.f36628O.setIntValues(new int[]{scrollX, n});
                this.f36628O.start();
            }
            this.f36639j.mo32898c(i, this.f36617D);
        }
    }

    /* renamed from: l */
    private void m50060l(int i) {
        if (i == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i == 1) {
            this.f36639j.setGravity(1);
            return;
        } else if (i != 2) {
            return;
        }
        this.f36639j.setGravity(8388611);
    }

    /* renamed from: m */
    private void m50061m() {
        int i;
        int i2 = this.f36619F;
        if (i2 == 0 || i2 == 2) {
            i = Math.max(0, this.f36615B - this.f36640k);
        } else {
            i = 0;
        }
        C3774v.m16156D0(this.f36639j, i, 0, 0, 0);
        int i3 = this.f36619F;
        if (i3 == 0) {
            m50060l(this.f36616C);
        } else if (i3 == 1 || i3 == 2) {
            if (this.f36616C == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f36639j.setGravity(1);
        }
        mo32833N(true);
    }

    /* renamed from: n */
    private int m50062n(int i, float f) {
        int i2 = this.f36619F;
        int i3 = 0;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        View childAt = this.f36639j.getChildAt(i);
        int i4 = i + 1;
        View childAt2 = i4 < this.f36639j.getChildCount() ? this.f36639j.getChildAt(i4) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i3 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) (((float) (width + i3)) * 0.5f * f);
        return C3774v.m16151B(this) == 0 ? left + i5 : left - i5;
    }

    /* renamed from: o */
    private void m50063o(C9549g gVar, int i) {
        gVar.mo32922o(i);
        this.f36636g.add(i, gVar);
        int size = this.f36636g.size();
        while (true) {
            i++;
            if (i < size) {
                this.f36636g.get(i).mo32922o(i);
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    private static ColorStateList m50064p(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    /* renamed from: q */
    private LinearLayout.LayoutParams m50065q() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m50052M(layoutParams);
        return layoutParams;
    }

    /* renamed from: s */
    private C9551i m50066s(C9549g gVar) {
        C3700f<C9551i> fVar = this.f36635V;
        C9551i b = fVar != null ? fVar.mo8513b() : null;
        if (b == null) {
            b = new C9551i(getContext());
        }
        b.setTab(gVar);
        b.setFocusable(true);
        b.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f36679c)) {
            b.setContentDescription(gVar.f36678b);
        } else {
            b.setContentDescription(gVar.f36679c);
        }
        return b;
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f36639j.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f36639j.getChildAt(i2);
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
    private void m50067t(C9549g gVar) {
        for (int size = this.f36626M.size() - 1; size >= 0; size--) {
            this.f36626M.get(size).mo32895c(gVar);
        }
    }

    /* renamed from: u */
    private void m50068u(C9549g gVar) {
        for (int size = this.f36626M.size() - 1; size >= 0; size--) {
            this.f36626M.get(size).mo32894b(gVar);
        }
    }

    /* renamed from: v */
    private void m50069v(C9549g gVar) {
        for (int size = this.f36626M.size() - 1; size >= 0; size--) {
            this.f36626M.get(size).mo32893a(gVar);
        }
    }

    /* renamed from: w */
    private void m50070w() {
        if (this.f36628O == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f36628O = valueAnimator;
            valueAnimator.setInterpolator(C9553a.f36698a);
            this.f36628O.setDuration((long) this.f36617D);
            this.f36628O.addUpdateListener(new C9541a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public boolean mo32824A(C9549g gVar) {
        return f36613a0.mo8512a(gVar);
    }

    /* renamed from: B */
    public void mo32825B() {
        for (int childCount = this.f36639j.getChildCount() - 1; childCount >= 0; childCount--) {
            m50049D(childCount);
        }
        Iterator<C9549g> it = this.f36636g.iterator();
        while (it.hasNext()) {
            C9549g next = it.next();
            it.remove();
            next.mo32916i();
            mo32824A(next);
        }
        this.f36637h = null;
    }

    @Deprecated
    /* renamed from: C */
    public void mo32826C(C9543c cVar) {
        this.f36626M.remove(cVar);
    }

    /* renamed from: E */
    public void mo32827E(C9549g gVar) {
        mo32828F(gVar, true);
    }

    /* renamed from: F */
    public void mo32828F(C9549g gVar, boolean z) {
        C9549g gVar2 = this.f36637h;
        if (gVar2 != gVar) {
            int f = gVar != null ? gVar.mo32913f() : -1;
            if (z) {
                if ((gVar2 == null || gVar2.mo32913f() == -1) && f != -1) {
                    mo32830H(f, 0.0f, true);
                } else {
                    m50059k(f);
                }
                if (f != -1) {
                    setSelectedTabView(f);
                }
            }
            this.f36637h = gVar;
            if (gVar2 != null) {
                m50069v(gVar2);
            }
            if (gVar != null) {
                m50068u(gVar);
            }
        } else if (gVar2 != null) {
            m50067t(gVar);
            m50059k(gVar.mo32913f());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo32829G(C1184a aVar, boolean z) {
        DataSetObserver dataSetObserver;
        C1184a aVar2 = this.f36630Q;
        if (!(aVar2 == null || (dataSetObserver = this.f36631R) == null)) {
            aVar2.mo6305u(dataSetObserver);
        }
        this.f36630Q = aVar;
        if (z && aVar != null) {
            if (this.f36631R == null) {
                this.f36631R = new C9545e();
            }
            aVar.mo6301m(this.f36631R);
        }
        mo32890z();
    }

    /* renamed from: H */
    public void mo32830H(int i, float f, boolean z) {
        mo32831I(i, f, z, true);
    }

    /* renamed from: I */
    public void mo32831I(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f36639j.getChildCount()) {
            if (z2) {
                this.f36639j.mo32902i(i, f);
            }
            ValueAnimator valueAnimator = this.f36628O;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f36628O.cancel();
            }
            scrollTo(m50062n(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    /* renamed from: J */
    public void mo32832J(ViewPager viewPager, boolean z) {
        m50050K(viewPager, z, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo32833N(boolean z) {
        for (int i = 0; i < this.f36639j.getChildCount(); i++) {
            View childAt = this.f36639j.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m50052M((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public void addView(View view) {
        m50058j(view);
    }

    @Deprecated
    /* renamed from: d */
    public void mo32838d(C9543c cVar) {
        if (!this.f36626M.contains(cVar)) {
            this.f36626M.add(cVar);
        }
    }

    /* renamed from: e */
    public void mo32839e(C9549g gVar) {
        mo32841g(gVar, this.f36636g.isEmpty());
    }

    /* renamed from: f */
    public void mo32840f(C9549g gVar, int i, boolean z) {
        if (gVar.f36683g == this) {
            m50063o(gVar, i);
            m50057i(gVar);
            if (z) {
                gVar.mo32917j();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* renamed from: g */
    public void mo32841g(C9549g gVar, boolean z) {
        mo32840f(gVar, this.f36636g.size(), z);
    }

    public int getSelectedTabPosition() {
        C9549g gVar = this.f36637h;
        if (gVar != null) {
            return gVar.mo32913f();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f36636g.size();
    }

    public int getTabGravity() {
        return this.f36616C;
    }

    public ColorStateList getTabIconTint() {
        return this.f36646q;
    }

    public int getTabIndicatorDiffOfLeft() {
        return this.f36623J;
    }

    public int getTabIndicatorDiffOfRight() {
        return this.f36624K;
    }

    public int getTabIndicatorGravity() {
        return this.f36618E;
    }

    /* access modifiers changed from: package-private */
    public int getTabMaxWidth() {
        return this.f36653x;
    }

    public int getTabMode() {
        return this.f36619F;
    }

    public ColorStateList getTabRippleColor() {
        return this.f36647r;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f36648s;
    }

    public ColorStateList getTabTextColors() {
        return this.f36645p;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f36629P == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m50050K((ViewPager) parent, true, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f36634U) {
            setupWithViewPager((ViewPager) null);
            this.f36634U = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        for (int i = 0; i < this.f36639j.getChildCount(); i++) {
            View childAt = this.f36639j.getChildAt(i);
            if (childAt instanceof C9551i) {
                ((C9551i) childAt).m50132e(canvas);
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
            float r0 = net.coocent.android.xmlparser.widget.view.tabs.p458e.C9557a.m50156a(r0, r1)
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
            int r1 = r6.f36655z
            if (r1 <= 0) goto L_0x0050
            goto L_0x005d
        L_0x0050:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = net.coocent.android.xmlparser.widget.view.tabs.p458e.C9557a.m50156a(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L_0x005d:
            r6.f36653x = r1
        L_0x005f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto L_0x00ad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.f36619F
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
        throw new UnsupportedOperationException("Method not decompiled: net.coocent.android.xmlparser.widget.view.tabs.TabLayout.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C9549g mo32860r() {
        C9549g b = f36613a0.mo8513b();
        return b == null ? new C9549g() : b;
    }

    public void setElevation(float f) {
        super.setElevation(f);
    }

    public void setInlineLabel(boolean z) {
        if (this.f36620G != z) {
            this.f36620G = z;
            for (int i = 0; i < this.f36639j.getChildCount(); i++) {
                View childAt = this.f36639j.getChildAt(i);
                if (childAt instanceof C9551i) {
                    ((C9551i) childAt).mo32930k();
                }
            }
            m50061m();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(C9544d dVar) {
        setOnTabSelectedListener((C9543c) dVar);
    }

    /* access modifiers changed from: package-private */
    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m50070w();
        this.f36628O.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f36648s != drawable) {
            this.f36648s = drawable;
            C3774v.m16197e0(this.f36639j);
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f36639j.mo32903j(i);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f36618E != i) {
            this.f36618E = i;
            C3774v.m16197e0(this.f36639j);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f36639j.mo32904k(i);
    }

    public void setTabGravity(int i) {
        if (this.f36616C != i) {
            this.f36616C = i;
            m50061m();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f36646q != colorStateList) {
            this.f36646q = colorStateList;
            m50051L();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C3410a.m14542c(getContext(), i));
    }

    public void setTabIndicatorDiffOfLeft(int i) {
        this.f36623J = i;
        m50061m();
    }

    public void setTabIndicatorDiffOfRight(int i) {
        this.f36624K = i;
        m50061m();
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f36621H = z;
        C3774v.m16197e0(this.f36639j);
    }

    public void setTabMode(int i) {
        if (i != this.f36619F) {
            this.f36619F = i;
            m50061m();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f36647r != colorStateList) {
            this.f36647r = colorStateList;
            for (int i = 0; i < this.f36639j.getChildCount(); i++) {
                View childAt = this.f36639j.getChildAt(i);
                if (childAt instanceof C9551i) {
                    ((C9551i) childAt).m50135j(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C3410a.m14542c(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f36645p != colorStateList) {
            this.f36645p = colorStateList;
            m50051L();
        }
    }

    public void setTabTextSize(float f) {
        this.f36650u = C9557a.m50156a(getContext(), (int) f);
        m50061m();
    }

    @Deprecated
    public void setTabsFromPagerAdapter(C1184a aVar) {
        mo32829G(aVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f36622I != z) {
            this.f36622I = z;
            for (int i = 0; i < this.f36639j.getChildCount(); i++) {
                View childAt = this.f36639j.getChildAt(i);
                if (childAt instanceof C9551i) {
                    ((C9551i) childAt).m50135j(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        mo32832J(viewPager, true);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* renamed from: x */
    public C9549g mo32888x(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f36636g.get(i);
    }

    /* renamed from: y */
    public C9549g mo32889y() {
        C9549g r = mo32860r();
        r.f36683g = this;
        r.f36684h = m50066s(r);
        return r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo32890z() {
        int currentItem;
        mo32825B();
        C1184a aVar = this.f36630Q;
        if (aVar != null) {
            int e = aVar.mo6295e();
            for (int i = 0; i < e; i++) {
                C9549g y = mo32889y();
                y.mo32923p(this.f36630Q.mo6297g(i));
                mo32841g(y, false);
            }
            ViewPager viewPager = this.f36629P;
            if (viewPager != null && e > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                mo32827E(mo32888x(currentItem));
            }
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8610c.tabStyle);
    }

    public void addView(View view, int i) {
        m50058j(view);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(C9543c cVar) {
        C9543c cVar2 = this.f36625L;
        if (cVar2 != null) {
            mo32826C(cVar2);
        }
        this.f36625L = cVar;
        if (cVar != null) {
            mo32838d(cVar);
        }
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36636g = new ArrayList<>();
        this.f36638i = new RectF();
        this.f36653x = Integer.MAX_VALUE;
        this.f36626M = new ArrayList<>();
        this.f36635V = new C3701g(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        C9546f fVar = new C9546f(context2);
        this.f36639j = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        int[] iArr = C8618k.TabLayout;
        int i2 = f36612W;
        int i3 = C8618k.TabLayout_tabTextAppearance;
        TypedArray g = C9554a.m50150g(context2, attributeSet, iArr, i, i2, i3);
        fVar.mo32904k(g.getDimensionPixelSize(C8618k.TabLayout_tabIndicatorHeight, -1));
        fVar.mo32903j(g.getColor(C8618k.TabLayout_tabIndicatorColor, 0));
        setSelectedTabIndicator(C9555a.m50152b(context2, g, C8618k.TabLayout_tabIndicator));
        setSelectedTabIndicatorGravity(g.getInt(C8618k.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorFullWidth(g.getBoolean(C8618k.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = g.getDimensionPixelSize(C8618k.TabLayout_tabPadding, 0);
        this.f36643n = dimensionPixelSize;
        this.f36642m = dimensionPixelSize;
        this.f36641l = dimensionPixelSize;
        this.f36640k = dimensionPixelSize;
        this.f36640k = g.getDimensionPixelSize(C8618k.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.f36641l = g.getDimensionPixelSize(C8618k.TabLayout_tabPaddingTop, this.f36641l);
        this.f36642m = g.getDimensionPixelSize(C8618k.TabLayout_tabPaddingEnd, this.f36642m);
        this.f36643n = g.getDimensionPixelSize(C8618k.TabLayout_tabPaddingBottom, this.f36643n);
        int resourceId = g.getResourceId(i3, C8617j.TextAppearance_Design_Tab);
        this.f36644o = resourceId;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, C3409j.TextAppearance);
        try {
            this.f36650u = (float) obtainStyledAttributes.getDimensionPixelSize(C3409j.TextAppearance_android_textSize, 0);
            this.f36645p = C9555a.m50151a(context2, obtainStyledAttributes, C3409j.TextAppearance_android_textColor);
            obtainStyledAttributes.recycle();
            int i4 = C8618k.TabLayout_tabTextColor;
            if (g.hasValue(i4)) {
                this.f36645p = C9555a.m50151a(context2, g, i4);
            }
            int i5 = C8618k.TabLayout_tabSelectedTextColor;
            if (g.hasValue(i5)) {
                this.f36645p = m50064p(this.f36645p.getDefaultColor(), g.getColor(i5, 0));
            }
            this.f36646q = C9555a.m50151a(context2, g, C8618k.TabLayout_tabIconTint);
            this.f36649t = C9557a.m50157b(g.getInt(C8618k.TabLayout_tabIconTintMode, -1), (PorterDuff.Mode) null);
            this.f36647r = C9555a.m50151a(context2, g, C8618k.TabLayout_tabRippleColor);
            this.f36617D = g.getInt(C8618k.TabLayout_tabIndicatorAnimationDuration, 300);
            this.f36654y = g.getDimensionPixelSize(C8618k.TabLayout_tabMinWidth, -1);
            this.f36655z = g.getDimensionPixelSize(C8618k.TabLayout_tabMaxWidth, -1);
            this.f36652w = g.getResourceId(C8618k.TabLayout_tabBackground, 0);
            this.f36615B = g.getDimensionPixelSize(C8618k.TabLayout_tabContentStart, 0);
            this.f36619F = g.getInt(C8618k.TabLayout_tabMode, 1);
            this.f36616C = g.getInt(C8618k.TabLayout_tabGravity, 0);
            this.f36620G = g.getBoolean(C8618k.TabLayout_tabInlineLabel, false);
            this.f36622I = g.getBoolean(C8618k.TabLayout_tabUnboundedRipple, false);
            this.f36623J = g.getDimensionPixelSize(C8618k.TabLayout_tabIndicatorDiffOfLeft, 0);
            this.f36624K = g.getDimensionPixelSize(C8618k.TabLayout_tabIndicatorDiffOfRight, 0);
            g.recycle();
            Resources resources = getResources();
            this.f36651v = (float) resources.getDimensionPixelSize(C8612e.design_tab_text_size_2line);
            this.f36614A = resources.getDimensionPixelSize(C8612e.design_tab_scrollable_min_width);
            m50061m();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m50058j(view);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m50058j(view);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(C3410a.m14543d(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
