package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.C0506a;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p082e.p109h.p119p.C3704a;
import p082e.p109h.p119p.C3718d0;
import p082e.p109h.p119p.C3769q;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.p120e0.C3736c;

public class ViewPager extends ViewGroup {

    /* renamed from: l0 */
    static final int[] f4807l0 = {16842931};

    /* renamed from: m0 */
    private static final Comparator<C1177f> f4808m0 = new C1172a();

    /* renamed from: n0 */
    private static final Interpolator f4809n0 = new C1173b();

    /* renamed from: o0 */
    private static final C1183l f4810o0 = new C1183l();

    /* renamed from: A */
    private boolean f4811A;

    /* renamed from: B */
    private boolean f4812B;

    /* renamed from: C */
    private int f4813C = 1;

    /* renamed from: D */
    private boolean f4814D;

    /* renamed from: E */
    private boolean f4815E;

    /* renamed from: F */
    private int f4816F;

    /* renamed from: G */
    private int f4817G;

    /* renamed from: H */
    private int f4818H;

    /* renamed from: I */
    private float f4819I;

    /* renamed from: J */
    private float f4820J;

    /* renamed from: K */
    private float f4821K;

    /* renamed from: L */
    private float f4822L;

    /* renamed from: M */
    private int f4823M = -1;

    /* renamed from: N */
    private VelocityTracker f4824N;

    /* renamed from: O */
    private int f4825O;

    /* renamed from: P */
    private int f4826P;

    /* renamed from: Q */
    private int f4827Q;

    /* renamed from: R */
    private int f4828R;

    /* renamed from: S */
    private boolean f4829S;

    /* renamed from: T */
    private EdgeEffect f4830T;

    /* renamed from: U */
    private EdgeEffect f4831U;

    /* renamed from: V */
    private boolean f4832V = true;

    /* renamed from: W */
    private boolean f4833W;

    /* renamed from: a0 */
    private int f4834a0;

    /* renamed from: b0 */
    private List<C1180i> f4835b0;

    /* renamed from: c0 */
    private C1180i f4836c0;

    /* renamed from: d0 */
    private C1180i f4837d0;

    /* renamed from: e0 */
    private List<C1179h> f4838e0;

    /* renamed from: f0 */
    private C1181j f4839f0;

    /* renamed from: g */
    private int f4840g;

    /* renamed from: g0 */
    private int f4841g0;

    /* renamed from: h */
    private final ArrayList<C1177f> f4842h = new ArrayList<>();

    /* renamed from: h0 */
    private int f4843h0;

    /* renamed from: i */
    private final C1177f f4844i = new C1177f();

    /* renamed from: i0 */
    private ArrayList<View> f4845i0;

    /* renamed from: j */
    private final Rect f4846j = new Rect();

    /* renamed from: j0 */
    private final Runnable f4847j0 = new C1174c();

    /* renamed from: k */
    C1184a f4848k;

    /* renamed from: k0 */
    private int f4849k0 = 0;

    /* renamed from: l */
    int f4850l;

    /* renamed from: m */
    private int f4851m = -1;

    /* renamed from: n */
    private Parcelable f4852n = null;

    /* renamed from: o */
    private ClassLoader f4853o = null;

    /* renamed from: p */
    private Scroller f4854p;

    /* renamed from: q */
    private boolean f4855q;

    /* renamed from: r */
    private C1182k f4856r;

    /* renamed from: s */
    private int f4857s;

    /* renamed from: t */
    private Drawable f4858t;

    /* renamed from: u */
    private int f4859u;

    /* renamed from: v */
    private int f4860v;

    /* renamed from: w */
    private float f4861w = -3.4028235E38f;

    /* renamed from: x */
    private float f4862x = Float.MAX_VALUE;

    /* renamed from: y */
    private int f4863y;

    /* renamed from: z */
    private boolean f4864z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1171a();

        /* renamed from: i */
        int f4871i;

        /* renamed from: j */
        Parcelable f4872j;

        /* renamed from: k */
        ClassLoader f4873k;

        /* renamed from: androidx.viewpager.widget.ViewPager$SavedState$a */
        static class C1171a implements Parcelable.ClassLoaderCreator<SavedState> {
            C1171a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f4871i + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4871i);
            parcel.writeParcelable(this.f4872j, i);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f4871i = parcel.readInt();
            this.f4872j = parcel.readParcelable(classLoader);
            this.f4873k = classLoader;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$a */
    static class C1172a implements Comparator<C1177f> {
        C1172a() {
        }

        /* renamed from: a */
        public int compare(C1177f fVar, C1177f fVar2) {
            return fVar.f4878b - fVar2.f4878b;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$b */
    static class C1173b implements Interpolator {
        C1173b() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$c */
    class C1174c implements Runnable {
        C1174c() {
        }

        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.mo6214E();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$d */
    class C1175d implements C3769q {

        /* renamed from: a */
        private final Rect f4875a = new Rect();

        C1175d() {
        }

        /* renamed from: a */
        public C3718d0 mo580a(View view, C3718d0 d0Var) {
            C3718d0 a0 = C3774v.m16189a0(view, d0Var);
            if (a0.mo13041p()) {
                return a0;
            }
            Rect rect = this.f4875a;
            rect.left = a0.mo13036j();
            rect.top = a0.mo13038l();
            rect.right = a0.mo13037k();
            rect.bottom = a0.mo13035i();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C3718d0 h = C3774v.m16202h(ViewPager.this.getChildAt(i), a0);
                rect.left = Math.min(h.mo13036j(), rect.left);
                rect.top = Math.min(h.mo13038l(), rect.top);
                rect.right = Math.min(h.mo13037k(), rect.right);
                rect.bottom = Math.min(h.mo13035i(), rect.bottom);
            }
            return a0.mo13042q(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.viewpager.widget.ViewPager$e */
    public @interface C1176e {
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$f */
    static class C1177f {

        /* renamed from: a */
        Object f4877a;

        /* renamed from: b */
        int f4878b;

        /* renamed from: c */
        boolean f4879c;

        /* renamed from: d */
        float f4880d;

        /* renamed from: e */
        float f4881e;

        C1177f() {
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$g */
    class C1178g extends C3704a {
        C1178g() {
        }

        /* renamed from: n */
        private boolean m6639n() {
            C1184a aVar = ViewPager.this.f4848k;
            return aVar != null && aVar.mo6295e() > 1;
        }

        /* renamed from: f */
        public void mo3426f(View view, AccessibilityEvent accessibilityEvent) {
            C1184a aVar;
            super.mo3426f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m6639n());
            if (accessibilityEvent.getEventType() == 4096 && (aVar = ViewPager.this.f4848k) != null) {
                accessibilityEvent.setItemCount(aVar.mo6295e());
                accessibilityEvent.setFromIndex(ViewPager.this.f4850l);
                accessibilityEvent.setToIndex(ViewPager.this.f4850l);
            }
        }

        /* renamed from: g */
        public void mo3427g(View view, C3736c cVar) {
            super.mo3427g(view, cVar);
            cVar.mo13114c0(ViewPager.class.getName());
            cVar.mo13153y0(m6639n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                cVar.mo13109a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                cVar.mo13109a(8192);
            }
        }

        /* renamed from: j */
        public boolean mo3428j(View view, int i, Bundle bundle) {
            if (super.mo3428j(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f4850l - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.f4850l + 1);
                return true;
            }
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$h */
    public interface C1179h {
        /* renamed from: a */
        void mo6206a(ViewPager viewPager, C1184a aVar, C1184a aVar2);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$i */
    public interface C1180i {
        /* renamed from: d */
        void mo6207d(int i, float f, int i2);

        /* renamed from: r */
        void mo6209r(int i);

        /* renamed from: s */
        void mo6210s(int i);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$j */
    public interface C1181j {
        /* renamed from: a */
        void mo6288a(View view, float f);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$k */
    private class C1182k extends DataSetObserver {
        C1182k() {
        }

        public void onChanged() {
            ViewPager.this.mo6248h();
        }

        public void onInvalidated() {
            ViewPager.this.mo6248h();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$l */
    static class C1183l implements Comparator<View> {
        C1183l() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z = layoutParams.f4865a;
            if (z != layoutParams2.f4865a) {
                return z ? 1 : -1;
            }
            return layoutParams.f4869e - layoutParams2.f4869e;
        }
    }

    public ViewPager(Context context) {
        super(context);
        mo6274v();
    }

    /* renamed from: C */
    private boolean m6587C(int i) {
        if (this.f4842h.size() != 0) {
            C1177f t = m6604t();
            int clientWidth = getClientWidth();
            int i2 = this.f4857s;
            int i3 = clientWidth + i2;
            float f = (float) clientWidth;
            int i4 = t.f4878b;
            float f2 = ((((float) i) / f) - t.f4881e) / (t.f4880d + (((float) i2) / f));
            this.f4833W = false;
            mo6276y(i4, f2, (int) (((float) i3) * f2));
            if (this.f4833W) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f4832V) {
            return false;
        } else {
            this.f4833W = false;
            mo6276y(0, 0.0f, 0);
            if (this.f4833W) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* renamed from: D */
    private boolean m6588D(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f4819I - f;
        this.f4819I = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.f4861w * clientWidth;
        float f4 = this.f4862x * clientWidth;
        boolean z3 = false;
        C1177f fVar = this.f4842h.get(0);
        ArrayList<C1177f> arrayList = this.f4842h;
        C1177f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f4878b != 0) {
            f3 = fVar.f4881e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.f4878b != this.f4848k.mo6295e() - 1) {
            f4 = fVar2.f4881e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f4830T.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f4831U.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f4819I += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        m6587C(i);
        return z3;
    }

    /* renamed from: G */
    private void m6589G(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f4842h.isEmpty()) {
            C1177f u = mo6273u(this.f4850l);
            int min = (int) ((u != null ? Math.min(u.f4881e, this.f4862x) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m6596g(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.f4854p.isFinished()) {
            this.f4854p.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        }
    }

    /* renamed from: H */
    private void m6590H() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).f4865a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* renamed from: K */
    private void m6591K(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: L */
    private boolean m6592L() {
        this.f4823M = -1;
        m6602o();
        this.f4830T.onRelease();
        this.f4831U.onRelease();
        return this.f4830T.isFinished() || this.f4831U.isFinished();
    }

    /* renamed from: M */
    private void m6593M(int i, boolean z, int i2, boolean z2) {
        C1177f u = mo6273u(i);
        int clientWidth = u != null ? (int) (((float) getClientWidth()) * Math.max(this.f4861w, Math.min(u.f4881e, this.f4862x))) : 0;
        if (z) {
            mo6224T(clientWidth, 0, i2);
            if (z2) {
                m6599k(i);
                return;
            }
            return;
        }
        if (z2) {
            m6599k(i);
        }
        m6596g(false);
        scrollTo(clientWidth, 0);
        m6587C(clientWidth);
    }

    /* renamed from: U */
    private void m6594U() {
        if (this.f4843h0 != 0) {
            ArrayList<View> arrayList = this.f4845i0;
            if (arrayList == null) {
                this.f4845i0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f4845i0.add(getChildAt(i));
            }
            Collections.sort(this.f4845i0, f4810o0);
        }
    }

    /* renamed from: e */
    private void m6595e(C1177f fVar, int i, C1177f fVar2) {
        int i2;
        int i3;
        C1177f fVar3;
        C1177f fVar4;
        int e = this.f4848k.mo6295e();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? ((float) this.f4857s) / ((float) clientWidth) : 0.0f;
        if (fVar2 != null) {
            int i4 = fVar2.f4878b;
            int i5 = fVar.f4878b;
            if (i4 < i5) {
                int i6 = 0;
                float f2 = fVar2.f4881e + fVar2.f4880d + f;
                while (true) {
                    i4++;
                    if (i4 > fVar.f4878b || i6 >= this.f4842h.size()) {
                        break;
                    }
                    Object obj = this.f4842h.get(i6);
                    while (true) {
                        fVar4 = (C1177f) obj;
                        if (i4 > fVar4.f4878b && i6 < this.f4842h.size() - 1) {
                            i6++;
                            obj = this.f4842h.get(i6);
                        }
                    }
                    while (i4 < fVar4.f4878b) {
                        f2 += this.f4848k.mo6298h(i4) + f;
                        i4++;
                    }
                    fVar4.f4881e = f2;
                    f2 += fVar4.f4880d + f;
                }
            } else if (i4 > i5) {
                int size = this.f4842h.size() - 1;
                float f3 = fVar2.f4881e;
                while (true) {
                    int i7 = i4 - 1;
                    if (i7 < fVar.f4878b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f4842h.get(size);
                    while (true) {
                        fVar3 = (C1177f) obj2;
                        if (i7 < fVar3.f4878b && size > 0) {
                            size--;
                            obj2 = this.f4842h.get(size);
                        }
                    }
                    while (i4 > fVar3.f4878b) {
                        f3 -= this.f4848k.mo6298h(i4) + f;
                        i7 = i4 - 1;
                    }
                    f3 -= fVar3.f4880d + f;
                    fVar3.f4881e = f3;
                }
            }
        }
        int size2 = this.f4842h.size();
        float f4 = fVar.f4881e;
        int i8 = fVar.f4878b;
        int i9 = i8 - 1;
        this.f4861w = i8 == 0 ? f4 : -3.4028235E38f;
        int i10 = e - 1;
        this.f4862x = i8 == i10 ? (fVar.f4880d + f4) - 1.0f : Float.MAX_VALUE;
        int i11 = i - 1;
        while (i11 >= 0) {
            C1177f fVar5 = this.f4842h.get(i11);
            while (true) {
                i3 = fVar5.f4878b;
                if (i9 <= i3) {
                    break;
                }
                f4 -= this.f4848k.mo6298h(i9) + f;
                i9--;
            }
            f4 -= fVar5.f4880d + f;
            fVar5.f4881e = f4;
            if (i3 == 0) {
                this.f4861w = f4;
            }
            i11--;
            i9--;
        }
        float f5 = fVar.f4881e + fVar.f4880d + f;
        int i12 = fVar.f4878b + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            C1177f fVar6 = this.f4842h.get(i13);
            while (true) {
                i2 = fVar6.f4878b;
                if (i12 >= i2) {
                    break;
                }
                f5 += this.f4848k.mo6298h(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.f4862x = (fVar6.f4880d + f5) - 1.0f;
            }
            fVar6.f4881e = f5;
            f5 += fVar6.f4880d + f;
            i13++;
            i12++;
        }
    }

    /* renamed from: g */
    private void m6596g(boolean z) {
        boolean z2 = this.f4849k0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f4854p.isFinished()) {
                this.f4854p.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f4854p.getCurrX();
                int currY = this.f4854p.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m6587C(currX);
                    }
                }
            }
        }
        this.f4812B = false;
        for (int i = 0; i < this.f4842h.size(); i++) {
            C1177f fVar = this.f4842h.get(i);
            if (fVar.f4879c) {
                fVar.f4879c = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            C3774v.m16201g0(this, this.f4847j0);
        } else {
            this.f4847j0.run();
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: i */
    private int m6597i(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f4827Q || Math.abs(i2) <= this.f4825O) {
            i += (int) (f + (i >= this.f4850l ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f4842h.size() <= 0) {
            return i;
        }
        ArrayList<C1177f> arrayList = this.f4842h;
        return Math.max(this.f4842h.get(0).f4878b, Math.min(i, arrayList.get(arrayList.size() - 1).f4878b));
    }

    /* renamed from: j */
    private void m6598j(int i, float f, int i2) {
        C1180i iVar = this.f4836c0;
        if (iVar != null) {
            iVar.mo6207d(i, f, i2);
        }
        List<C1180i> list = this.f4835b0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1180i iVar2 = this.f4835b0.get(i3);
                if (iVar2 != null) {
                    iVar2.mo6207d(i, f, i2);
                }
            }
        }
        C1180i iVar3 = this.f4837d0;
        if (iVar3 != null) {
            iVar3.mo6207d(i, f, i2);
        }
    }

    /* renamed from: k */
    private void m6599k(int i) {
        C1180i iVar = this.f4836c0;
        if (iVar != null) {
            iVar.mo6210s(i);
        }
        List<C1180i> list = this.f4835b0;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1180i iVar2 = this.f4835b0.get(i2);
                if (iVar2 != null) {
                    iVar2.mo6210s(i);
                }
            }
        }
        C1180i iVar3 = this.f4837d0;
        if (iVar3 != null) {
            iVar3.mo6210s(i);
        }
    }

    /* renamed from: l */
    private void m6600l(int i) {
        C1180i iVar = this.f4836c0;
        if (iVar != null) {
            iVar.mo6209r(i);
        }
        List<C1180i> list = this.f4835b0;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1180i iVar2 = this.f4835b0.get(i2);
                if (iVar2 != null) {
                    iVar2.mo6209r(i);
                }
            }
        }
        C1180i iVar3 = this.f4837d0;
        if (iVar3 != null) {
            iVar3.mo6209r(i);
        }
    }

    /* renamed from: n */
    private void m6601n(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.f4841g0 : 0, (Paint) null);
        }
    }

    /* renamed from: o */
    private void m6602o() {
        this.f4814D = false;
        this.f4815E = false;
        VelocityTracker velocityTracker = this.f4824N;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4824N = null;
        }
    }

    /* renamed from: q */
    private Rect m6603q(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f4811A != z) {
            this.f4811A = z;
        }
    }

    /* renamed from: t */
    private C1177f m6604t() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f2 = clientWidth > 0 ? ((float) this.f4857s) / ((float) clientWidth) : 0.0f;
        C1177f fVar = null;
        float f3 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.f4842h.size()) {
            C1177f fVar2 = this.f4842h.get(i3);
            if (!z && fVar2.f4878b != (i = i2 + 1)) {
                fVar2 = this.f4844i;
                fVar2.f4881e = f + f3 + f2;
                fVar2.f4878b = i;
                fVar2.f4880d = this.f4848k.mo6298h(i);
                i3--;
            }
            f = fVar2.f4881e;
            float f4 = fVar2.f4880d + f + f2;
            if (!z && scrollX < f) {
                return fVar;
            }
            if (scrollX < f4 || i3 == this.f4842h.size() - 1) {
                return fVar2;
            }
            i2 = fVar2.f4878b;
            f3 = fVar2.f4880d;
            i3++;
            fVar = fVar2;
            z = false;
        }
        return fVar;
    }

    /* renamed from: w */
    private static boolean m6605w(View view) {
        return view.getClass().getAnnotation(C1176e.class) != null;
    }

    /* renamed from: x */
    private boolean m6606x(float f, float f2) {
        return (f < ((float) this.f4817G) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f4817G)) && f2 < 0.0f);
    }

    /* renamed from: z */
    private void m6607z(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4823M) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f4819I = motionEvent.getX(i);
            this.f4823M = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f4824N;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo6212A() {
        int i = this.f4850l;
        if (i <= 0) {
            return false;
        }
        mo6218N(i - 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean mo6213B() {
        C1184a aVar = this.f4848k;
        if (aVar == null || this.f4850l >= aVar.mo6295e() - 1) {
            return false;
        }
        mo6218N(this.f4850l + 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo6214E() {
        mo6215F(this.f4850l);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r9 == r10) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r8 = null;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6215F(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f4850l
            if (r2 == r1) goto L_0x000f
            androidx.viewpager.widget.ViewPager$f r2 = r0.mo6273u(r2)
            r0.f4850l = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            androidx.viewpager.widget.a r1 = r0.f4848k
            if (r1 != 0) goto L_0x0018
            r17.m6594U()
            return
        L_0x0018:
            boolean r1 = r0.f4812B
            if (r1 == 0) goto L_0x0020
            r17.m6594U()
            return
        L_0x0020:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0027
            return
        L_0x0027:
            androidx.viewpager.widget.a r1 = r0.f4848k
            r1.mo4046t(r0)
            int r1 = r0.f4813C
            int r4 = r0.f4850l
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            androidx.viewpager.widget.a r6 = r0.f4848k
            int r6 = r6.mo6295e()
            int r7 = r6 + -1
            int r8 = r0.f4850l
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.f4840g
            if (r6 != r7) goto L_0x020e
            r7 = 0
        L_0x004a:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f4842h
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0066
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f4842h
            java.lang.Object r8 = r8.get(r7)
            androidx.viewpager.widget.ViewPager$f r8 = (androidx.viewpager.widget.ViewPager.C1177f) r8
            int r9 = r8.f4878b
            int r10 = r0.f4850l
            if (r9 < r10) goto L_0x0063
            if (r9 != r10) goto L_0x0066
            goto L_0x0067
        L_0x0063:
            int r7 = r7 + 1
            goto L_0x004a
        L_0x0066:
            r8 = 0
        L_0x0067:
            if (r8 != 0) goto L_0x0071
            if (r6 <= 0) goto L_0x0071
            int r8 = r0.f4850l
            androidx.viewpager.widget.ViewPager$f r8 = r0.mo6225a(r8, r7)
        L_0x0071:
            r9 = 0
            if (r8 == 0) goto L_0x019b
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0081
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r11 = r0.f4842h
            java.lang.Object r11 = r11.get(r10)
            androidx.viewpager.widget.ViewPager$f r11 = (androidx.viewpager.widget.ViewPager.C1177f) r11
            goto L_0x0082
        L_0x0081:
            r11 = 0
        L_0x0082:
            int r12 = r17.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x008c
            r14 = 0
            goto L_0x0098
        L_0x008c:
            float r14 = r8.f4880d
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r14 = r14 + r15
        L_0x0098:
            int r3 = r0.f4850l
            int r3 = r3 + -1
            r15 = 0
        L_0x009d:
            if (r3 < 0) goto L_0x00fd
            int r16 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x00cb
            if (r3 >= r4) goto L_0x00cb
            if (r11 != 0) goto L_0x00a8
            goto L_0x00fd
        L_0x00a8:
            int r5 = r11.f4878b
            if (r3 != r5) goto L_0x00f9
            boolean r5 = r11.f4879c
            if (r5 != 0) goto L_0x00f9
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f4842h
            r5.remove(r10)
            androidx.viewpager.widget.a r5 = r0.f4848k
            java.lang.Object r11 = r11.f4877a
            r5.mo4039b(r0, r3, r11)
            int r10 = r10 + -1
            int r7 = r7 + -1
            if (r10 < 0) goto L_0x00f7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f4842h
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1177f) r5
            goto L_0x00f8
        L_0x00cb:
            if (r11 == 0) goto L_0x00e1
            int r5 = r11.f4878b
            if (r3 != r5) goto L_0x00e1
            float r5 = r11.f4880d
            float r15 = r15 + r5
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x00f7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f4842h
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1177f) r5
            goto L_0x00f8
        L_0x00e1:
            int r5 = r10 + 1
            androidx.viewpager.widget.ViewPager$f r5 = r0.mo6225a(r3, r5)
            float r5 = r5.f4880d
            float r15 = r15 + r5
            int r7 = r7 + 1
            if (r10 < 0) goto L_0x00f7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f4842h
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1177f) r5
            goto L_0x00f8
        L_0x00f7:
            r5 = 0
        L_0x00f8:
            r11 = r5
        L_0x00f9:
            int r3 = r3 + -1
            r5 = 0
            goto L_0x009d
        L_0x00fd:
            float r3 = r8.f4880d
            int r4 = r7 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x018f
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f4842h
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0116
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f4842h
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1177f) r5
            goto L_0x0117
        L_0x0116:
            r5 = 0
        L_0x0117:
            if (r12 > 0) goto L_0x011b
            r10 = 0
            goto L_0x0123
        L_0x011b:
            int r10 = r17.getPaddingRight()
            float r10 = (float) r10
            float r11 = (float) r12
            float r10 = r10 / r11
            float r10 = r10 + r13
        L_0x0123:
            int r11 = r0.f4850l
        L_0x0125:
            int r11 = r11 + 1
            if (r11 >= r6) goto L_0x018f
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0159
            if (r11 <= r1) goto L_0x0159
            if (r5 != 0) goto L_0x0132
            goto L_0x018f
        L_0x0132:
            int r12 = r5.f4878b
            if (r11 != r12) goto L_0x018e
            boolean r12 = r5.f4879c
            if (r12 != 0) goto L_0x018e
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r12 = r0.f4842h
            r12.remove(r4)
            androidx.viewpager.widget.a r12 = r0.f4848k
            java.lang.Object r5 = r5.f4877a
            r12.mo4039b(r0, r11, r5)
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f4842h
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0157
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f4842h
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1177f) r5
            goto L_0x018e
        L_0x0157:
            r5 = 0
            goto L_0x018e
        L_0x0159:
            if (r5 == 0) goto L_0x0175
            int r12 = r5.f4878b
            if (r11 != r12) goto L_0x0175
            float r5 = r5.f4880d
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f4842h
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0157
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f4842h
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1177f) r5
            goto L_0x018e
        L_0x0175:
            androidx.viewpager.widget.ViewPager$f r5 = r0.mo6225a(r11, r4)
            int r4 = r4 + 1
            float r5 = r5.f4880d
            float r3 = r3 + r5
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f4842h
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0157
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f4842h
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1177f) r5
        L_0x018e:
            goto L_0x0125
        L_0x018f:
            r0.m6595e(r8, r7, r2)
            androidx.viewpager.widget.a r1 = r0.f4848k
            int r2 = r0.f4850l
            java.lang.Object r3 = r8.f4877a
            r1.mo4045q(r0, r2, r3)
        L_0x019b:
            androidx.viewpager.widget.a r1 = r0.f4848k
            r1.mo4040d(r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x01a5:
            if (r2 >= r1) goto L_0x01ce
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r4 = (androidx.viewpager.widget.ViewPager.LayoutParams) r4
            r4.f4870f = r2
            boolean r5 = r4.f4865a
            if (r5 != 0) goto L_0x01cb
            float r5 = r4.f4867c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01cb
            androidx.viewpager.widget.ViewPager$f r3 = r0.mo6264s(r3)
            if (r3 == 0) goto L_0x01cb
            float r5 = r3.f4880d
            r4.f4867c = r5
            int r3 = r3.f4878b
            r4.f4869e = r3
        L_0x01cb:
            int r2 = r2 + 1
            goto L_0x01a5
        L_0x01ce:
            r17.m6594U()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x020d
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01e2
            androidx.viewpager.widget.ViewPager$f r3 = r0.mo6262r(r1)
            goto L_0x01e3
        L_0x01e2:
            r3 = 0
        L_0x01e3:
            if (r3 == 0) goto L_0x01eb
            int r1 = r3.f4878b
            int r2 = r0.f4850l
            if (r1 == r2) goto L_0x020d
        L_0x01eb:
            r5 = 0
        L_0x01ec:
            int r1 = r17.getChildCount()
            if (r5 >= r1) goto L_0x020d
            android.view.View r1 = r0.getChildAt(r5)
            androidx.viewpager.widget.ViewPager$f r2 = r0.mo6264s(r1)
            if (r2 == 0) goto L_0x020a
            int r2 = r2.f4878b
            int r3 = r0.f4850l
            if (r2 != r3) goto L_0x020a
            r2 = 2
            boolean r1 = r1.requestFocus(r2)
            if (r1 == 0) goto L_0x020a
            goto L_0x020d
        L_0x020a:
            int r5 = r5 + 1
            goto L_0x01ec
        L_0x020d:
            return
        L_0x020e:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x021b }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x021b }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x021b }
            goto L_0x0223
        L_0x021b:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0223:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.append(r4)
            int r4 = r0.f4840g
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            androidx.viewpager.widget.a r1 = r0.f4848k
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo6215F(int):void");
    }

    /* renamed from: I */
    public void mo6216I(C1179h hVar) {
        List<C1179h> list = this.f4838e0;
        if (list != null) {
            list.remove(hVar);
        }
    }

    /* renamed from: J */
    public void mo6217J(C1180i iVar) {
        List<C1180i> list = this.f4835b0;
        if (list != null) {
            list.remove(iVar);
        }
    }

    /* renamed from: N */
    public void mo6218N(int i, boolean z) {
        this.f4812B = false;
        mo6219O(i, z, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo6219O(int i, boolean z, boolean z2) {
        mo6220P(i, z, z2, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo6220P(int i, boolean z, boolean z2, int i2) {
        C1184a aVar = this.f4848k;
        boolean z3 = false;
        if (aVar == null || aVar.mo6295e() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f4850l != i || this.f4842h.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f4848k.mo6295e()) {
                i = this.f4848k.mo6295e() - 1;
            }
            int i3 = this.f4813C;
            int i4 = this.f4850l;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f4842h.size(); i5++) {
                    this.f4842h.get(i5).f4879c = true;
                }
            }
            if (this.f4850l != i) {
                z3 = true;
            }
            if (this.f4832V) {
                this.f4850l = i;
                if (z3) {
                    m6599k(i);
                }
                requestLayout();
                return;
            }
            mo6215F(i);
            m6593M(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public C1180i mo6221Q(C1180i iVar) {
        C1180i iVar2 = this.f4837d0;
        this.f4837d0 = iVar;
        return iVar2;
    }

    /* renamed from: R */
    public void mo6222R(boolean z, C1181j jVar) {
        mo6223S(z, jVar, 2);
    }

    /* renamed from: S */
    public void mo6223S(boolean z, C1181j jVar, int i) {
        int i2 = 1;
        boolean z2 = jVar != null;
        boolean z3 = z2 != (this.f4839f0 != null);
        this.f4839f0 = jVar;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            if (z) {
                i2 = 2;
            }
            this.f4843h0 = i2;
            this.f4841g0 = i;
        } else {
            this.f4843h0 = 0;
        }
        if (z3) {
            mo6214E();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo6224T(int i, int i2, int i3) {
        int i4;
        int i5;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f4854p;
        if (scroller != null && !scroller.isFinished()) {
            i4 = this.f4855q ? this.f4854p.getCurrX() : this.f4854p.getStartX();
            this.f4854p.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollX();
        }
        int i6 = i4;
        int scrollY = getScrollY();
        int i7 = i - i6;
        int i8 = i2 - scrollY;
        if (i7 == 0 && i8 == 0) {
            m6596g(false);
            mo6214E();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i9 = clientWidth / 2;
        float f = (float) clientWidth;
        float f2 = (float) i9;
        float m = f2 + (mo6249m(Math.min(1.0f, (((float) Math.abs(i7)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(m / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i7)) / ((f * this.f4848k.mo6298h(this.f4850l)) + ((float) this.f4857s))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i5, 600);
        this.f4855q = false;
        this.f4854p.startScroll(i6, scrollY, i7, i8, min);
        C3774v.m16197e0(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1177f mo6225a(int i, int i2) {
        C1177f fVar = new C1177f();
        fVar.f4878b = i;
        fVar.f4877a = this.f4848k.mo4041j(this, i);
        fVar.f4880d = this.f4848k.mo6298h(i);
        if (i2 < 0 || i2 >= this.f4842h.size()) {
            this.f4842h.add(fVar);
        } else {
            this.f4842h.add(i2, fVar);
        }
        return fVar;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C1177f s;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (s = mo6264s(childAt)) != null && s.f4878b == this.f4850l) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        C1177f s;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (s = mo6264s(childAt)) != null && s.f4878b == this.f4850l) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean w = layoutParams2.f4865a | m6605w(view);
        layoutParams2.f4865a = w;
        if (!this.f4864z) {
            super.addView(view, i, layoutParams);
        } else if (layoutParams2 == null || !w) {
            layoutParams2.f4868d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* renamed from: b */
    public void mo6229b(C1179h hVar) {
        if (this.f4838e0 == null) {
            this.f4838e0 = new ArrayList();
        }
        this.f4838e0.add(hVar);
    }

    /* renamed from: c */
    public void mo6230c(C1180i iVar) {
        if (this.f4835b0 == null) {
            this.f4835b0 = new ArrayList();
        }
        this.f4835b0.add(iVar);
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f4848k == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.f4861w))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollX >= ((int) (((float) clientWidth) * this.f4862x))) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.f4855q = true;
        if (this.f4854p.isFinished() || !this.f4854p.computeScrollOffset()) {
            m6596g(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f4854p.getCurrX();
        int currY = this.f4854p.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m6587C(currX)) {
                this.f4854p.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C3774v.m16197e0(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cf  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo6234d(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto L_0x000b
        L_0x0009:
            r0 = r3
            goto L_0x0069
        L_0x000b:
            if (r0 == 0) goto L_0x0069
            android.view.ViewParent r4 = r0.getParent()
        L_0x0011:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x001e
            if (r4 != r6) goto L_0x0019
            r4 = 1
            goto L_0x001f
        L_0x0019:
            android.view.ViewParent r4 = r4.getParent()
            goto L_0x0011
        L_0x001e:
            r4 = 0
        L_0x001f:
            if (r4 != 0) goto L_0x0069
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L_0x0035:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x004e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0035
        L_0x004e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
            goto L_0x0009
        L_0x0069:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L_0x00ba
            if (r3 == r0) goto L_0x00ba
            if (r7 != r5) goto L_0x009a
            android.graphics.Rect r1 = r6.f4846j
            android.graphics.Rect r1 = r6.m6603q(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f4846j
            android.graphics.Rect r2 = r6.m6603q(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x0094
            if (r1 < r2) goto L_0x0094
            boolean r0 = r6.mo6212A()
            goto L_0x0098
        L_0x0094:
            boolean r0 = r3.requestFocus()
        L_0x0098:
            r2 = r0
            goto L_0x00cd
        L_0x009a:
            if (r7 != r4) goto L_0x00cd
            android.graphics.Rect r1 = r6.f4846j
            android.graphics.Rect r1 = r6.m6603q(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f4846j
            android.graphics.Rect r2 = r6.m6603q(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x00b5
            if (r1 > r2) goto L_0x00b5
            boolean r0 = r6.mo6213B()
            goto L_0x0098
        L_0x00b5:
            boolean r0 = r3.requestFocus()
            goto L_0x0098
        L_0x00ba:
            if (r7 == r5) goto L_0x00c9
            if (r7 != r1) goto L_0x00bf
            goto L_0x00c9
        L_0x00bf:
            if (r7 == r4) goto L_0x00c4
            r0 = 2
            if (r7 != r0) goto L_0x00cd
        L_0x00c4:
            boolean r2 = r6.mo6213B()
            goto L_0x00cd
        L_0x00c9:
            boolean r2 = r6.mo6212A()
        L_0x00cd:
            if (r2 == 0) goto L_0x00d6
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00d6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo6234d(int):boolean");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo6261p(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C1177f s;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (s = mo6264s(childAt)) != null && s.f4878b == this.f4850l && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        C1184a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f4848k) != null && aVar.mo6295e() > 1)) {
            if (!this.f4830T.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f4861w * ((float) width));
                this.f4830T.setSize(height, width);
                z = false | this.f4830T.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f4831U.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f4862x + 1.0f)) * ((float) width2));
                this.f4831U.setSize(height2, width2);
                z |= this.f4831U.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f4830T.finish();
            this.f4831U.finish();
        }
        if (z) {
            C3774v.m16197e0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4858t;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo6239f(View view, boolean z, int i, int i2, int i3) {
        int i4;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom()) {
                    if (mo6239f(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public C1184a getAdapter() {
        return this.f4848k;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f4843h0 == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) this.f4845i0.get(i2).getLayoutParams()).f4870f;
    }

    public int getCurrentItem() {
        return this.f4850l;
    }

    public int getOffscreenPageLimit() {
        return this.f4813C;
    }

    public int getPageMargin() {
        return this.f4857s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo6248h() {
        int e = this.f4848k.mo6295e();
        this.f4840g = e;
        boolean z = this.f4842h.size() < (this.f4813C * 2) + 1 && this.f4842h.size() < e;
        int i = this.f4850l;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f4842h.size()) {
            C1177f fVar = this.f4842h.get(i2);
            int f = this.f4848k.mo6296f(fVar.f4877a);
            if (f != -1) {
                if (f == -2) {
                    this.f4842h.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f4848k.mo4046t(this);
                        z2 = true;
                    }
                    this.f4848k.mo4039b(this, fVar.f4878b, fVar.f4877a);
                    int i3 = this.f4850l;
                    if (i3 == fVar.f4878b) {
                        i = Math.max(0, Math.min(i3, e - 1));
                    }
                } else {
                    int i4 = fVar.f4878b;
                    if (i4 != f) {
                        if (i4 == this.f4850l) {
                            i = f;
                        }
                        fVar.f4878b = f;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f4848k.mo4040d(this);
        }
        Collections.sort(this.f4842h, f4808m0);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                if (!layoutParams.f4865a) {
                    layoutParams.f4867c = 0.0f;
                }
            }
            mo6219O(i, false, true);
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public float mo6249m(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4832V = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f4847j0);
        Scroller scroller = this.f4854p;
        if (scroller != null && !scroller.isFinished()) {
            this.f4854p.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            super.onDraw(r18)
            int r1 = r0.f4857s
            if (r1 <= 0) goto L_0x00aa
            android.graphics.drawable.Drawable r1 = r0.f4858t
            if (r1 == 0) goto L_0x00aa
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r1 = r0.f4842h
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00aa
            androidx.viewpager.widget.a r1 = r0.f4848k
            if (r1 == 0) goto L_0x00aa
            int r1 = r17.getScrollX()
            int r2 = r17.getWidth()
            int r3 = r0.f4857s
            float r3 = (float) r3
            float r4 = (float) r2
            float r3 = r3 / r4
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f4842h
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1177f) r5
            float r7 = r5.f4881e
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f4842h
            int r8 = r8.size()
            int r9 = r5.f4878b
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r10 = r0.f4842h
            int r11 = r8 + -1
            java.lang.Object r10 = r10.get(r11)
            androidx.viewpager.widget.ViewPager$f r10 = (androidx.viewpager.widget.ViewPager.C1177f) r10
            int r10 = r10.f4878b
        L_0x0045:
            if (r9 >= r10) goto L_0x00aa
        L_0x0047:
            int r11 = r5.f4878b
            if (r9 <= r11) goto L_0x0058
            if (r6 >= r8) goto L_0x0058
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f4842h
            int r6 = r6 + 1
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1177f) r5
            goto L_0x0047
        L_0x0058:
            if (r9 != r11) goto L_0x0065
            float r7 = r5.f4881e
            float r11 = r5.f4880d
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r7 = r7 + r11
            float r7 = r7 + r3
            goto L_0x0071
        L_0x0065:
            androidx.viewpager.widget.a r11 = r0.f4848k
            float r11 = r11.mo6298h(r9)
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r11 = r11 + r3
            float r7 = r7 + r11
        L_0x0071:
            int r11 = r0.f4857s
            float r11 = (float) r11
            float r11 = r11 + r12
            float r13 = (float) r1
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x0099
            android.graphics.drawable.Drawable r11 = r0.f4858t
            int r13 = java.lang.Math.round(r12)
            int r14 = r0.f4859u
            int r15 = r0.f4857s
            float r15 = (float) r15
            float r15 = r15 + r12
            int r15 = java.lang.Math.round(r15)
            r16 = r3
            int r3 = r0.f4860v
            r11.setBounds(r13, r14, r15, r3)
            android.graphics.drawable.Drawable r3 = r0.f4858t
            r11 = r18
            r3.draw(r11)
            goto L_0x009d
        L_0x0099:
            r11 = r18
            r16 = r3
        L_0x009d:
            int r3 = r1 + r2
            float r3 = (float) r3
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a5
            goto L_0x00aa
        L_0x00a5:
            int r9 = r9 + 1
            r3 = r16
            goto L_0x0045
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onDraw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m6592L();
            return false;
        }
        if (action != 0) {
            if (this.f4814D) {
                return true;
            }
            if (this.f4815E) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f4821K = x;
            this.f4819I = x;
            float y = motionEvent.getY();
            this.f4822L = y;
            this.f4820J = y;
            this.f4823M = motionEvent2.getPointerId(0);
            this.f4815E = false;
            this.f4855q = true;
            this.f4854p.computeScrollOffset();
            if (this.f4849k0 != 2 || Math.abs(this.f4854p.getFinalX() - this.f4854p.getCurrX()) <= this.f4828R) {
                m6596g(false);
                this.f4814D = false;
            } else {
                this.f4854p.abortAnimation();
                this.f4812B = false;
                mo6214E();
                this.f4814D = true;
                m6591K(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f4823M;
            if (i != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i);
                float x2 = motionEvent2.getX(findPointerIndex);
                float f = x2 - this.f4819I;
                float abs = Math.abs(f);
                float y2 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f4822L);
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 != 0 && !m6606x(this.f4819I, f)) {
                    if (mo6239f(this, false, (int) f, (int) x2, (int) y2)) {
                        this.f4819I = x2;
                        this.f4820J = y2;
                        this.f4815E = true;
                        return false;
                    }
                }
                int i3 = this.f4818H;
                if (abs > ((float) i3) && abs * 0.5f > abs2) {
                    this.f4814D = true;
                    m6591K(true);
                    setScrollState(1);
                    float f2 = this.f4821K;
                    float f3 = (float) this.f4818H;
                    this.f4819I = i2 > 0 ? f2 + f3 : f2 - f3;
                    this.f4820J = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) i3)) {
                    this.f4815E = true;
                }
                if (this.f4814D && m6588D(x2)) {
                    C3774v.m16197e0(this);
                }
            }
        } else if (action == 6) {
            m6607z(motionEvent);
        }
        if (this.f4824N == null) {
            this.f4824N = VelocityTracker.obtain();
        }
        this.f4824N.addMovement(motionEvent2);
        return this.f4814D;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b6
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b2
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r12 = (androidx.viewpager.widget.ViewPager.LayoutParams) r12
            boolean r14 = r12.f4865a
            if (r14 == 0) goto L_0x00b2
            int r12 = r12.f4866b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x005c
            r15 = 3
            if (r14 == r15) goto L_0x0056
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006d
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
            goto L_0x0068
        L_0x0056:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006d
        L_0x005c:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
        L_0x0068:
            r17 = r14
            r14 = r4
            r4 = r17
        L_0x006d:
            r15 = 16
            if (r12 == r15) goto L_0x008e
            r15 = 48
            if (r12 == r15) goto L_0x0088
            r15 = 80
            if (r12 == r15) goto L_0x007b
            r12 = r5
            goto L_0x009f
        L_0x007b:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            goto L_0x009a
        L_0x0088:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x009f
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
        L_0x009a:
            r17 = r12
            r12 = r5
            r5 = r17
        L_0x009f:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r5 + r16
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b2:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b6:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00b9:
            if (r6 >= r1) goto L_0x0108
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0105
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.f4865a
            if (r10 != 0) goto L_0x0105
            androidx.viewpager.widget.ViewPager$f r10 = r0.mo6264s(r8)
            if (r10 == 0) goto L_0x0105
            float r13 = (float) r2
            float r10 = r10.f4881e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.f4868d
            if (r14 == 0) goto L_0x00f8
            r14 = 0
            r9.f4868d = r14
            float r9 = r9.f4867c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f8:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0105:
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x0108:
            r0.f4859u = r5
            int r3 = r3 - r7
            r0.f4860v = r3
            r0.f4834a0 = r11
            boolean r1 = r0.f4832V
            if (r1 == 0) goto L_0x011a
            int r1 = r0.f4850l
            r2 = 0
            r0.m6593M(r1, r2, r2, r2)
            goto L_0x011b
        L_0x011a:
            r2 = 0
        L_0x011b:
            r0.f4832V = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            r0 = 0
            int r14 = android.view.ViewGroup.getDefaultSize(r0, r14)
            int r15 = android.view.ViewGroup.getDefaultSize(r0, r15)
            r13.setMeasuredDimension(r14, r15)
            int r14 = r13.getMeasuredWidth()
            int r15 = r14 / 10
            int r1 = r13.f4816F
            int r15 = java.lang.Math.min(r15, r1)
            r13.f4817G = r15
            int r15 = r13.getPaddingLeft()
            int r14 = r14 - r15
            int r15 = r13.getPaddingRight()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredHeight()
            int r1 = r13.getPaddingTop()
            int r15 = r15 - r1
            int r1 = r13.getPaddingBottom()
            int r15 = r15 - r1
            int r1 = r13.getChildCount()
            r2 = 0
        L_0x0037:
            r3 = 8
            r4 = 1
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r1) goto L_0x00b2
            android.view.View r6 = r13.getChildAt(r2)
            int r7 = r6.getVisibility()
            if (r7 == r3) goto L_0x00af
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r3 = (androidx.viewpager.widget.ViewPager.LayoutParams) r3
            if (r3 == 0) goto L_0x00af
            boolean r7 = r3.f4865a
            if (r7 == 0) goto L_0x00af
            int r7 = r3.f4866b
            r8 = r7 & 7
            r7 = r7 & 112(0x70, float:1.57E-43)
            r9 = 48
            if (r7 == r9) goto L_0x0065
            r9 = 80
            if (r7 != r9) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r7 = 0
            goto L_0x0066
        L_0x0065:
            r7 = 1
        L_0x0066:
            r9 = 3
            if (r8 == r9) goto L_0x006e
            r9 = 5
            if (r8 != r9) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r4 = 0
        L_0x006e:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == 0) goto L_0x0075
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x007a
        L_0x0075:
            if (r4 == 0) goto L_0x007a
            r9 = 1073741824(0x40000000, float:2.0)
            goto L_0x007c
        L_0x007a:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x007c:
            int r10 = r3.width
            r11 = -1
            r12 = -2
            if (r10 == r12) goto L_0x0089
            if (r10 == r11) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r10 = r14
        L_0x0086:
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x008a
        L_0x0089:
            r10 = r14
        L_0x008a:
            int r3 = r3.height
            if (r3 == r12) goto L_0x0093
            if (r3 == r11) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            r3 = r15
            goto L_0x0095
        L_0x0093:
            r3 = r15
            r5 = r9
        L_0x0095:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r8)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            r6.measure(r8, r3)
            if (r7 == 0) goto L_0x00a8
            int r3 = r6.getMeasuredHeight()
            int r15 = r15 - r3
            goto L_0x00af
        L_0x00a8:
            if (r4 == 0) goto L_0x00af
            int r3 = r6.getMeasuredWidth()
            int r14 = r14 - r3
        L_0x00af:
            int r2 = r2 + 1
            goto L_0x0037
        L_0x00b2:
            android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r5)
            r13.f4863y = r15
            r13.f4864z = r4
            r13.mo6214E()
            r13.f4864z = r0
            int r15 = r13.getChildCount()
        L_0x00c6:
            if (r0 >= r15) goto L_0x00f0
            android.view.View r1 = r13.getChildAt(r0)
            int r2 = r1.getVisibility()
            if (r2 == r3) goto L_0x00ed
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r2 = (androidx.viewpager.widget.ViewPager.LayoutParams) r2
            if (r2 == 0) goto L_0x00de
            boolean r4 = r2.f4865a
            if (r4 != 0) goto L_0x00ed
        L_0x00de:
            float r4 = (float) r14
            float r2 = r2.f4867c
            float r4 = r4 * r2
            int r2 = (int) r4
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            int r4 = r13.f4863y
            r1.measure(r2, r4)
        L_0x00ed:
            int r0 = r0 + 1
            goto L_0x00c6
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C1177f s;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (s = mo6264s(childAt)) != null && s.f4878b == this.f4850l && childAt.requestFocus(i, rect)) {
                return true;
            }
            i3 += i2;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3471a());
        C1184a aVar = this.f4848k;
        if (aVar != null) {
            aVar.mo4043n(savedState.f4872j, savedState.f4873k);
            mo6219O(savedState.f4871i, false, true);
            return;
        }
        this.f4851m = savedState.f4871i;
        this.f4852n = savedState.f4872j;
        this.f4853o = savedState.f4873k;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4871i = this.f4850l;
        C1184a aVar = this.f4848k;
        if (aVar != null) {
            savedState.f4872j = aVar.mo4044o();
        }
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f4857s;
            m6589G(i, i3, i5, i5);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C1184a aVar;
        if (this.f4829S) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f4848k) == null || aVar.mo6295e() == 0) {
            return false;
        }
        if (this.f4824N == null) {
            this.f4824N = VelocityTracker.obtain();
        }
        this.f4824N.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f4854p.abortAnimation();
            this.f4812B = false;
            mo6214E();
            float x = motionEvent.getX();
            this.f4821K = x;
            this.f4819I = x;
            float y = motionEvent.getY();
            this.f4822L = y;
            this.f4820J = y;
            this.f4823M = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f4814D) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f4823M);
                    if (findPointerIndex == -1) {
                        z = m6592L();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.f4819I);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.f4820J);
                        if (abs > ((float) this.f4818H) && abs > abs2) {
                            this.f4814D = true;
                            m6591K(true);
                            float f = this.f4821K;
                            this.f4819I = x2 - f > 0.0f ? f + ((float) this.f4818H) : f - ((float) this.f4818H);
                            this.f4820J = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f4814D) {
                    z = false | m6588D(motionEvent.getX(motionEvent.findPointerIndex(this.f4823M)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f4819I = motionEvent.getX(actionIndex);
                    this.f4823M = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    m6607z(motionEvent);
                    this.f4819I = motionEvent.getX(motionEvent.findPointerIndex(this.f4823M));
                }
            } else if (this.f4814D) {
                m6593M(this.f4850l, true, 0, false);
                z = m6592L();
            }
        } else if (this.f4814D) {
            VelocityTracker velocityTracker = this.f4824N;
            velocityTracker.computeCurrentVelocity(1000, (float) this.f4826P);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f4823M);
            this.f4812B = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C1177f t = m6604t();
            float f2 = (float) clientWidth;
            mo6220P(m6597i(t.f4878b, ((((float) scrollX) / f2) - t.f4881e) / (t.f4880d + (((float) this.f4857s) / f2)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.f4823M)) - this.f4821K)), true, true, xVelocity);
            z = m6592L();
        }
        if (z) {
            C3774v.m16197e0(this);
        }
        return true;
    }

    /* renamed from: p */
    public boolean mo6261p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return mo6234d(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return mo6234d(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return mo6213B();
                } else {
                    return mo6234d(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                return mo6212A();
            } else {
                return mo6234d(17);
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C1177f mo6262r(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return mo6264s(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public void removeView(View view) {
        if (this.f4864z) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C1177f mo6264s(View view) {
        for (int i = 0; i < this.f4842h.size(); i++) {
            C1177f fVar = this.f4842h.get(i);
            if (this.f4848k.mo4042k(view, fVar.f4877a)) {
                return fVar;
            }
        }
        return null;
    }

    public void setAdapter(C1184a aVar) {
        C1184a aVar2 = this.f4848k;
        if (aVar2 != null) {
            aVar2.mo6303r((DataSetObserver) null);
            this.f4848k.mo4046t(this);
            for (int i = 0; i < this.f4842h.size(); i++) {
                C1177f fVar = this.f4842h.get(i);
                this.f4848k.mo4039b(this, fVar.f4878b, fVar.f4877a);
            }
            this.f4848k.mo4040d(this);
            this.f4842h.clear();
            m6590H();
            this.f4850l = 0;
            scrollTo(0, 0);
        }
        C1184a aVar3 = this.f4848k;
        this.f4848k = aVar;
        this.f4840g = 0;
        if (aVar != null) {
            if (this.f4856r == null) {
                this.f4856r = new C1182k();
            }
            this.f4848k.mo6303r(this.f4856r);
            this.f4812B = false;
            boolean z = this.f4832V;
            this.f4832V = true;
            this.f4840g = this.f4848k.mo6295e();
            if (this.f4851m >= 0) {
                this.f4848k.mo4043n(this.f4852n, this.f4853o);
                mo6219O(this.f4851m, false, true);
                this.f4851m = -1;
                this.f4852n = null;
                this.f4853o = null;
            } else if (!z) {
                mo6214E();
            } else {
                requestLayout();
            }
        }
        List<C1179h> list = this.f4838e0;
        if (list != null && !list.isEmpty()) {
            int size = this.f4838e0.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f4838e0.get(i2).mo6206a(this, aVar3, aVar);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f4812B = false;
        mo6219O(i, !this.f4832V, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to " + 1);
            i = 1;
        }
        if (i != this.f4813C) {
            this.f4813C = i;
            mo6214E();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(C1180i iVar) {
        this.f4836c0 = iVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.f4857s;
        this.f4857s = i;
        int width = getWidth();
        m6589G(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f4858t = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (this.f4849k0 != i) {
            this.f4849k0 = i;
            if (this.f4839f0 != null) {
                m6601n(i != 0);
            }
            m6600l(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public C1177f mo6273u(int i) {
        for (int i2 = 0; i2 < this.f4842h.size(); i2++) {
            C1177f fVar = this.f4842h.get(i2);
            if (fVar.f4878b == i) {
                return fVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo6274v() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f4854p = new Scroller(context, f4809n0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f4818H = viewConfiguration.getScaledPagingTouchSlop();
        this.f4825O = (int) (400.0f * f);
        this.f4826P = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f4830T = new EdgeEffect(context);
        this.f4831U = new EdgeEffect(context);
        this.f4827Q = (int) (25.0f * f);
        this.f4828R = (int) (2.0f * f);
        this.f4816F = (int) (f * 16.0f);
        C3774v.m16217o0(this, new C1178g());
        if (C3774v.m16238z(this) == 0) {
            C3774v.m16237y0(this, 1);
        }
        C3774v.m16154C0(this, new C1175d());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4858t;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6276y(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f4834a0
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L_0x001b:
            if (r7 >= r6) goto L_0x006b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.f4865a
            if (r10 != 0) goto L_0x002c
            goto L_0x0068
        L_0x002c:
            int r9 = r9.f4866b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004d
            r10 = 3
            if (r9 == r10) goto L_0x0047
            r10 = 5
            if (r9 == r10) goto L_0x003a
            r9 = r3
            goto L_0x005c
        L_0x003a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L_0x0059
        L_0x0047:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L_0x005c
        L_0x004d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L_0x0059:
            r11 = r9
            r9 = r3
            r3 = r11
        L_0x005c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L_0x0067
            r8.offsetLeftAndRight(r3)
        L_0x0067:
            r3 = r9
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x006b:
            r12.m6598j(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$j r13 = r12.f4839f0
            if (r13 == 0) goto L_0x009f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x007a:
            if (r1 >= r14) goto L_0x009f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r0 = (androidx.viewpager.widget.ViewPager.LayoutParams) r0
            boolean r0 = r0.f4865a
            if (r0 == 0) goto L_0x008b
            goto L_0x009c
        L_0x008b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$j r3 = r12.f4839f0
            r3.mo6288a(r15, r0)
        L_0x009c:
            int r1 = r1 + 1
            goto L_0x007a
        L_0x009f:
            r12.f4833W = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo6276y(int, float, int):void");
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f4865a;

        /* renamed from: b */
        public int f4866b;

        /* renamed from: c */
        float f4867c = 0.0f;

        /* renamed from: d */
        boolean f4868d;

        /* renamed from: e */
        int f4869e;

        /* renamed from: f */
        int f4870f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f4807l0);
            this.f4866b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C0506a.m3152d(getContext(), i));
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo6274v();
    }
}
