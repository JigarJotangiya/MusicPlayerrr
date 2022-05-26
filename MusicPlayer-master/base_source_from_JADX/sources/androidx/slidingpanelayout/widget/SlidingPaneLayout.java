package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.content.C0506a;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p082e.p109h.p119p.C3704a;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.p120e0.C3736c;
import p082e.p124j.p125a.C3808c;

public class SlidingPaneLayout extends ViewGroup {

    /* renamed from: A */
    private Method f4347A;

    /* renamed from: B */
    private Field f4348B;

    /* renamed from: C */
    private boolean f4349C;

    /* renamed from: g */
    private int f4350g;

    /* renamed from: h */
    private int f4351h;

    /* renamed from: i */
    private Drawable f4352i;

    /* renamed from: j */
    private Drawable f4353j;

    /* renamed from: k */
    private final int f4354k;

    /* renamed from: l */
    private boolean f4355l;

    /* renamed from: m */
    View f4356m;

    /* renamed from: n */
    float f4357n;

    /* renamed from: o */
    private float f4358o;

    /* renamed from: p */
    int f4359p;

    /* renamed from: q */
    boolean f4360q;

    /* renamed from: r */
    private int f4361r;

    /* renamed from: s */
    private float f4362s;

    /* renamed from: t */
    private float f4363t;

    /* renamed from: u */
    private C1036d f4364u;

    /* renamed from: v */
    final C3808c f4365v;

    /* renamed from: w */
    boolean f4366w;

    /* renamed from: x */
    private boolean f4367x;

    /* renamed from: y */
    private final Rect f4368y;

    /* renamed from: z */
    final ArrayList<C1034b> f4369z;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1032a();

        /* renamed from: i */
        boolean f4375i;

        /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState$a */
        static class C1032a implements Parcelable.ClassLoaderCreator<SavedState> {
            C1032a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4375i ? 1 : 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4375i = parcel.readInt() != 0;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$a */
    class C1033a extends C3704a {

        /* renamed from: d */
        private final Rect f4376d = new Rect();

        C1033a() {
        }

        /* renamed from: n */
        private void m6009n(C3736c cVar, C3736c cVar2) {
            Rect rect = this.f4376d;
            cVar2.mo13130m(rect);
            cVar.mo13106X(rect);
            cVar2.mo13132n(rect);
            cVar.mo13107Y(rect);
            cVar.mo13093G0(cVar2.mo13101N());
            cVar.mo13140r0(cVar2.mo13147v());
            cVar.mo13114c0(cVar2.mo13136p());
            cVar.mo13121g0(cVar2.mo13139r());
            cVar.mo13125i0(cVar2.mo13090F());
            cVar.mo13116d0(cVar2.mo13088E());
            cVar.mo13128k0(cVar2.mo13092G());
            cVar.mo13129l0(cVar2.mo13094H());
            cVar.mo13105V(cVar2.mo13082B());
            cVar.mo13154z0(cVar2.mo13099L());
            cVar.mo13135o0(cVar2.mo13096I());
            cVar.mo13109a(cVar2.mo13127k());
            cVar.mo13138q0(cVar2.mo13143t());
        }

        /* renamed from: f */
        public void mo3426f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3426f(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        /* renamed from: g */
        public void mo3427g(View view, C3736c cVar) {
            C3736c Q = C3736c.m15979Q(cVar);
            super.mo3427g(view, Q);
            m6009n(cVar, Q);
            Q.mo13103S();
            cVar.mo13114c0(SlidingPaneLayout.class.getName());
            cVar.mo13083B0(view);
            ViewParent H = C3774v.m16163H(view);
            if (H instanceof View) {
                cVar.mo13144t0((View) H);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!mo5753o(childAt) && childAt.getVisibility() == 0) {
                    C3774v.m16237y0(childAt, 1);
                    cVar.mo13113c(childAt);
                }
            }
        }

        /* renamed from: i */
        public boolean mo3554i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!mo5753o(view)) {
                return super.mo3554i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        /* renamed from: o */
        public boolean mo5753o(View view) {
            return SlidingPaneLayout.this.mo5718h(view);
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$b */
    private class C1034b implements Runnable {

        /* renamed from: g */
        final View f4378g;

        C1034b(View view) {
            this.f4378g = view;
        }

        public void run() {
            if (this.f4378g.getParent() == SlidingPaneLayout.this) {
                this.f4378g.setLayerType(0, (Paint) null);
                SlidingPaneLayout.this.mo5711g(this.f4378g);
            }
            SlidingPaneLayout.this.f4369z.remove(this);
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$c */
    private class C1035c extends C3808c.C3811c {
        C1035c() {
        }

        /* renamed from: a */
        public int mo3555a(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.f4356m.getLayoutParams();
            if (SlidingPaneLayout.this.mo5719i()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin) + SlidingPaneLayout.this.f4356m.getWidth());
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.f4359p);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + layoutParams.leftMargin;
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.f4359p + paddingLeft);
        }

        /* renamed from: b */
        public int mo3556b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: d */
        public int mo3557d(View view) {
            return SlidingPaneLayout.this.f4359p;
        }

        /* renamed from: f */
        public void mo3558f(int i, int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.f4365v.mo13297c(slidingPaneLayout.f4356m, i2);
        }

        /* renamed from: i */
        public void mo3561i(View view, int i) {
            SlidingPaneLayout.this.mo5733p();
        }

        /* renamed from: j */
        public void mo3562j(int i) {
            if (SlidingPaneLayout.this.f4365v.mo13283A() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.f4357n == 0.0f) {
                    slidingPaneLayout.mo5735r(slidingPaneLayout.f4356m);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.mo5706d(slidingPaneLayout2.f4356m);
                    SlidingPaneLayout.this.f4366w = false;
                    return;
                }
                slidingPaneLayout.mo5709e(slidingPaneLayout.f4356m);
                SlidingPaneLayout.this.f4366w = true;
            }
        }

        /* renamed from: k */
        public void mo3563k(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout.this.mo5722l(i);
            SlidingPaneLayout.this.invalidate();
        }

        /* renamed from: l */
        public void mo3564l(View view, float f, float f2) {
            int i;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.mo5719i()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin;
                if (f < 0.0f || (f == 0.0f && SlidingPaneLayout.this.f4357n > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f4359p;
                }
                i = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f4356m.getWidth();
            } else {
                i = layoutParams.leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 > 0 || (i2 == 0 && SlidingPaneLayout.this.f4357n > 0.5f)) {
                    i += SlidingPaneLayout.this.f4359p;
                }
            }
            SlidingPaneLayout.this.f4365v.mo13291N(i, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        /* renamed from: m */
        public boolean mo3565m(View view, int i) {
            if (SlidingPaneLayout.this.f4360q) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).f4372b;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$d */
    public interface C1036d {
        /* renamed from: a */
        void mo5755a(View view, float f);

        /* renamed from: b */
        void mo5756b(View view);

        /* renamed from: c */
        void mo5757c(View view);
    }

    public SlidingPaneLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    private boolean m5987b(View view, int i) {
        if (!this.f4367x && !mo5734q(0.0f, i)) {
            return false;
        }
        this.f4366w = false;
        return true;
    }

    /* renamed from: c */
    private void m5988c(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (i & 16777215);
            if (layoutParams.f4374d == null) {
                layoutParams.f4374d = new Paint();
            }
            layoutParams.f4374d.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, layoutParams.f4374d);
            }
            mo5711g(view);
        } else if (view.getLayerType() != 0) {
            Paint paint = layoutParams.f4374d;
            if (paint != null) {
                paint.setColorFilter((ColorFilter) null);
            }
            C1034b bVar = new C1034b(view);
            this.f4369z.add(bVar);
            C3774v.m16201g0(this, bVar);
        }
    }

    /* renamed from: n */
    private boolean m5989n(View view, int i) {
        if (!this.f4367x && !mo5734q(1.0f, i)) {
            return false;
        }
        this.f4366w = true;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5990o(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.mo5719i()
            android.view.View r1 = r9.f4356m
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r1
            boolean r2 = r1.f4373c
            r3 = 0
            if (r2 == 0) goto L_0x001c
            if (r0 == 0) goto L_0x0016
            int r1 = r1.rightMargin
            goto L_0x0018
        L_0x0016:
            int r1 = r1.leftMargin
        L_0x0018:
            if (r1 > 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            int r2 = r9.getChildCount()
        L_0x0021:
            if (r3 >= r2) goto L_0x0059
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.f4356m
            if (r4 != r5) goto L_0x002c
            goto L_0x0056
        L_0x002c:
            float r5 = r9.f4358o
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.f4361r
            float r8 = (float) r7
            float r5 = r5 * r8
            int r5 = (int) r5
            r9.f4358o = r10
            float r8 = r6 - r10
            float r7 = (float) r7
            float r8 = r8 * r7
            int r7 = (int) r8
            int r5 = r5 - r7
            if (r0 == 0) goto L_0x0044
            int r5 = -r5
        L_0x0044:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L_0x0056
            float r5 = r9.f4358o
            if (r0 == 0) goto L_0x004f
            float r5 = r5 - r6
            goto L_0x0051
        L_0x004f:
            float r5 = r6 - r5
        L_0x0051:
            int r6 = r9.f4351h
            r9.m5988c(r4, r5, r6)
        L_0x0056:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.m5990o(float):void");
    }

    /* renamed from: s */
    private static boolean m5991s(View view) {
        Drawable background;
        if (view.isOpaque()) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 18 && (background = view.getBackground()) != null && background.getOpacity() == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo5703a() {
        return m5987b(this.f4356m, 0);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (!this.f4365v.mo13300n(true)) {
            return;
        }
        if (!this.f4355l) {
            this.f4365v.mo13295a();
        } else {
            C3774v.m16197e0(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo5706d(View view) {
        C1036d dVar = this.f4364u;
        if (dVar != null) {
            dVar.mo5757c(view);
        }
        sendAccessibilityEvent(32);
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        int i;
        int i2;
        super.draw(canvas);
        if (mo5719i()) {
            drawable = this.f4353j;
        } else {
            drawable = this.f4352i;
        }
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && drawable != null) {
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (mo5719i()) {
                i2 = childAt.getRight();
                i = intrinsicWidth + i2;
            } else {
                int left = childAt.getLeft();
                int i3 = left - intrinsicWidth;
                i = left;
                i2 = i3;
            }
            drawable.setBounds(i2, top, i, bottom);
            drawable.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.f4355l && !layoutParams.f4372b && this.f4356m != null) {
            canvas.getClipBounds(this.f4368y);
            if (mo5719i()) {
                Rect rect = this.f4368y;
                rect.left = Math.max(rect.left, this.f4356m.getRight());
            } else {
                Rect rect2 = this.f4368y;
                rect2.right = Math.min(rect2.right, this.f4356m.getLeft());
            }
            canvas.clipRect(this.f4368y);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo5709e(View view) {
        C1036d dVar = this.f4364u;
        if (dVar != null) {
            dVar.mo5756b(view);
        }
        sendAccessibilityEvent(32);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo5710f(View view) {
        C1036d dVar = this.f4364u;
        if (dVar != null) {
            dVar.mo5755a(view, this.f4357n);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo5711g(View view) {
        Field field;
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            C3774v.m16150A0(view, ((LayoutParams) view.getLayoutParams()).f4374d);
            return;
        }
        if (i >= 16) {
            if (!this.f4349C) {
                try {
                    this.f4347A = View.class.getDeclaredMethod("getDisplayList", (Class[]) null);
                } catch (NoSuchMethodException e) {
                    Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", e);
                }
                try {
                    Field declaredField = View.class.getDeclaredField("mRecreateDisplayList");
                    this.f4348B = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", e2);
                }
                this.f4349C = true;
            }
            if (this.f4347A == null || (field = this.f4348B) == null) {
                view.invalidate();
                return;
            }
            try {
                field.setBoolean(view, true);
                this.f4347A.invoke(view, (Object[]) null);
            } catch (Exception e3) {
                Log.e("SlidingPaneLayout", "Error refreshing display list state", e3);
            }
        }
        C3774v.m16199f0(this, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.f4351h;
    }

    public int getParallaxDistance() {
        return this.f4361r;
    }

    public int getSliderFadeColor() {
        return this.f4350g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo5718h(View view) {
        if (view == null) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!this.f4355l || !layoutParams.f4373c || this.f4357n <= 0.0f) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo5719i() {
        return C3774v.m16151B(this) == 1;
    }

    /* renamed from: j */
    public boolean mo5720j() {
        return !this.f4355l || this.f4357n == 1.0f;
    }

    /* renamed from: k */
    public boolean mo5721k() {
        return this.f4355l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo5722l(int i) {
        if (this.f4356m == null) {
            this.f4357n = 0.0f;
            return;
        }
        boolean i2 = mo5719i();
        LayoutParams layoutParams = (LayoutParams) this.f4356m.getLayoutParams();
        int width = this.f4356m.getWidth();
        if (i2) {
            i = (getWidth() - i) - width;
        }
        float paddingRight = ((float) (i - ((i2 ? getPaddingRight() : getPaddingLeft()) + (i2 ? layoutParams.rightMargin : layoutParams.leftMargin)))) / ((float) this.f4359p);
        this.f4357n = paddingRight;
        if (this.f4361r != 0) {
            m5990o(paddingRight);
        }
        if (layoutParams.f4373c) {
            m5988c(this.f4356m, this.f4357n, this.f4350g);
        }
        mo5710f(this.f4356m);
    }

    /* renamed from: m */
    public boolean mo5723m() {
        return m5989n(this.f4356m, 0);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4367x = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4367x = true;
        int size = this.f4369z.size();
        for (int i = 0; i < size; i++) {
            this.f4369z.get(i).run();
        }
        this.f4369z.clear();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f4355l && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f4366w = !this.f4365v.mo13286E(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f4355l || (this.f4360q && actionMasked != 0)) {
            this.f4365v.mo13296b();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.f4365v.mo13296b();
            return false;
        } else {
            if (actionMasked == 0) {
                this.f4360q = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f4362s = x;
                this.f4363t = y;
                if (this.f4365v.mo13286E(this.f4356m, (int) x, (int) y) && mo5718h(this.f4356m)) {
                    z = true;
                    if (this.f4365v.mo13292O(motionEvent) && !z) {
                        return false;
                    }
                }
            } else if (actionMasked == 2) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float abs = Math.abs(x2 - this.f4362s);
                float abs2 = Math.abs(y2 - this.f4363t);
                if (abs > ((float) this.f4365v.mo13304z()) && abs2 > abs) {
                    this.f4365v.mo13296b();
                    this.f4360q = true;
                    return false;
                }
            }
            z = false;
            return this.f4365v.mo13292O(motionEvent) ? true : true;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean i9 = mo5719i();
        if (i9) {
            this.f4365v.mo13289L(2);
        } else {
            this.f4365v.mo13289L(1);
        }
        int i10 = i3 - i;
        int paddingRight = i9 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = i9 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f4367x) {
            this.f4357n = (!this.f4355l || !this.f4366w) ? 0.0f : 1.0f;
        }
        int i11 = paddingRight;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f4372b) {
                    int i13 = i10 - paddingLeft;
                    int min = (Math.min(paddingRight, i13 - this.f4354k) - i11) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.f4359p = min;
                    int i14 = i9 ? layoutParams.rightMargin : layoutParams.leftMargin;
                    layoutParams.f4373c = ((i11 + i14) + min) + (measuredWidth / 2) > i13;
                    int i15 = (int) (((float) min) * this.f4357n);
                    i11 += i14 + i15;
                    this.f4357n = ((float) i15) / ((float) min);
                    i5 = 0;
                } else if (!this.f4355l || (i8 = this.f4361r) == 0) {
                    i11 = paddingRight;
                    i5 = 0;
                } else {
                    i5 = (int) ((1.0f - this.f4357n) * ((float) i8));
                    i11 = paddingRight;
                }
                if (i9) {
                    i6 = (i10 - i11) + i5;
                    i7 = i6 - measuredWidth;
                } else {
                    i7 = i11 - i5;
                    i6 = i7 + measuredWidth;
                }
                childAt.layout(i7, paddingTop, i6, childAt.getMeasuredHeight() + paddingTop);
                paddingRight += childAt.getWidth();
            }
        }
        if (this.f4367x) {
            if (this.f4355l) {
                if (this.f4361r != 0) {
                    m5990o(this.f4357n);
                }
                if (((LayoutParams) this.f4356m.getLayoutParams()).f4373c) {
                    m5988c(this.f4356m, this.f4357n, this.f4350g);
                }
            } else {
                for (int i16 = 0; i16 < childCount; i16++) {
                    m5988c(getChildAt(i16), 0.0f, this.f4350g);
                }
            }
            mo5735r(this.f4356m);
        }
        this.f4367x = false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f;
        int i11;
        int i12;
        int i13;
        int i14;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            } else if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            } else if (mode2 == 0) {
                mode2 = Integer.MIN_VALUE;
                size2 = 300;
            }
        }
        boolean z = false;
        if (mode2 == Integer.MIN_VALUE) {
            i3 = (size2 - getPaddingTop()) - getPaddingBottom();
            i4 = 0;
        } else if (mode2 != 1073741824) {
            i4 = 0;
            i3 = 0;
        } else {
            i4 = (size2 - getPaddingTop()) - getPaddingBottom();
            i3 = i4;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.f4356m = null;
        int i15 = paddingLeft;
        int i16 = 0;
        boolean z2 = false;
        float f2 = 0.0f;
        while (true) {
            i5 = 8;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.f4373c = z;
            } else {
                float f3 = layoutParams.f4371a;
                if (f3 > 0.0f) {
                    f2 += f3;
                    if (layoutParams.width == 0) {
                    }
                }
                int i17 = layoutParams.leftMargin + layoutParams.rightMargin;
                int i18 = layoutParams.width;
                if (i18 == -2) {
                    i11 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i17, Integer.MIN_VALUE);
                    f = f2;
                    i12 = Integer.MIN_VALUE;
                } else {
                    f = f2;
                    i12 = Integer.MIN_VALUE;
                    if (i18 == -1) {
                        i11 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i17, 1073741824);
                    } else {
                        i11 = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                    }
                }
                int i19 = layoutParams.height;
                if (i19 == -2) {
                    i13 = View.MeasureSpec.makeMeasureSpec(i3, i12);
                } else {
                    if (i19 == -1) {
                        i14 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                    } else {
                        i14 = View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
                    }
                    i13 = i14;
                }
                childAt.measure(i11, i13);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (mode2 == i12 && measuredHeight > i4) {
                    i4 = Math.min(measuredHeight, i3);
                }
                i15 -= measuredWidth;
                boolean z3 = i15 < 0;
                layoutParams.f4372b = z3;
                z2 |= z3;
                if (z3) {
                    this.f4356m = childAt;
                }
                f2 = f;
            }
            i16++;
            z = false;
        }
        if (z2 || f2 > 0.0f) {
            int i20 = paddingLeft - this.f4354k;
            int i21 = 0;
            while (i21 < childCount) {
                View childAt2 = getChildAt(i21);
                if (childAt2.getVisibility() != i5) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i5) {
                        boolean z4 = layoutParams2.width == 0 && layoutParams2.f4371a > 0.0f;
                        if (z4) {
                            i7 = 0;
                        } else {
                            i7 = childAt2.getMeasuredWidth();
                        }
                        if (!z2 || childAt2 == this.f4356m) {
                            if (layoutParams2.f4371a > 0.0f) {
                                if (layoutParams2.width == 0) {
                                    int i22 = layoutParams2.height;
                                    if (i22 == -2) {
                                        i8 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                                    } else if (i22 == -1) {
                                        i8 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                                    } else {
                                        i8 = View.MeasureSpec.makeMeasureSpec(i22, 1073741824);
                                    }
                                } else {
                                    i8 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                }
                                if (z2) {
                                    int i23 = paddingLeft - (layoutParams2.leftMargin + layoutParams2.rightMargin);
                                    i6 = i20;
                                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i23, 1073741824);
                                    if (i7 != i23) {
                                        childAt2.measure(makeMeasureSpec, i8);
                                    }
                                    i21++;
                                    i20 = i6;
                                    i5 = 8;
                                } else {
                                    i6 = i20;
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7 + ((int) ((layoutParams2.f4371a * ((float) Math.max(0, i15))) / f2)), 1073741824), i8);
                                    i21++;
                                    i20 = i6;
                                    i5 = 8;
                                }
                            }
                        } else if (layoutParams2.width < 0 && (i7 > i20 || layoutParams2.f4371a > 0.0f)) {
                            if (z4) {
                                int i24 = layoutParams2.height;
                                if (i24 == -2) {
                                    i10 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                                    i9 = 1073741824;
                                } else if (i24 == -1) {
                                    i9 = 1073741824;
                                    i10 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                                } else {
                                    i9 = 1073741824;
                                    i10 = View.MeasureSpec.makeMeasureSpec(i24, 1073741824);
                                }
                            } else {
                                i9 = 1073741824;
                                i10 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            }
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i20, i9), i10);
                        }
                    }
                }
                i6 = i20;
                i21++;
                i20 = i6;
                i5 = 8;
            }
        }
        setMeasuredDimension(size, i4 + getPaddingTop() + getPaddingBottom());
        this.f4355l = z2;
        if (this.f4365v.mo13283A() != 0 && !z2) {
            this.f4365v.mo13295a();
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3471a());
        if (savedState.f4375i) {
            mo5723m();
        } else {
            mo5703a();
        }
        this.f4366w = savedState.f4375i;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4375i = mo5721k() ? mo5720j() : this.f4366w;
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f4367x = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f4355l) {
            return super.onTouchEvent(motionEvent);
        }
        this.f4365v.mo13287F(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f4362s = x;
            this.f4363t = y;
        } else if (actionMasked == 1 && mo5718h(this.f4356m)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.f4362s;
            float f2 = y2 - this.f4363t;
            int z = this.f4365v.mo13304z();
            if ((f * f) + (f2 * f2) < ((float) (z * z)) && this.f4365v.mo13286E(this.f4356m, (int) x2, (int) y2)) {
                m5987b(this.f4356m, 0);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo5733p() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo5734q(float f, int i) {
        int i2;
        if (!this.f4355l) {
            return false;
        }
        boolean i3 = mo5719i();
        LayoutParams layoutParams = (LayoutParams) this.f4356m.getLayoutParams();
        if (i3) {
            i2 = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + layoutParams.rightMargin)) + (f * ((float) this.f4359p))) + ((float) this.f4356m.getWidth())));
        } else {
            i2 = (int) (((float) (getPaddingLeft() + layoutParams.leftMargin)) + (f * ((float) this.f4359p)));
        }
        C3808c cVar = this.f4365v;
        View view = this.f4356m;
        if (!cVar.mo13293P(view, i2, view.getTop())) {
            return false;
        }
        mo5733p();
        C3774v.m16197e0(this);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo5735r(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        View childAt;
        boolean z;
        View view2 = view;
        boolean i5 = mo5719i();
        int width = i5 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = i5 ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !m5991s(view)) {
            i4 = 0;
            i3 = 0;
            i2 = 0;
            i = 0;
        } else {
            i4 = view.getLeft();
            i3 = view.getRight();
            i2 = view.getTop();
            i = view.getBottom();
        }
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 < childCount && (childAt = getChildAt(i6)) != view2) {
                if (childAt.getVisibility() == 8) {
                    z = i5;
                } else {
                    z = i5;
                    childAt.setVisibility((Math.max(i5 ? paddingLeft : width, childAt.getLeft()) < i4 || Math.max(paddingTop, childAt.getTop()) < i2 || Math.min(i5 ? width : paddingLeft, childAt.getRight()) > i3 || Math.min(height, childAt.getBottom()) > i) ? 0 : 4);
                }
                i6++;
                view2 = view;
                i5 = z;
            } else {
                return;
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f4355l) {
            this.f4366w = view == this.f4356m;
        }
    }

    public void setCoveredFadeColor(int i) {
        this.f4351h = i;
    }

    public void setPanelSlideListener(C1036d dVar) {
        this.f4364u = dVar;
    }

    public void setParallaxDistance(int i) {
        this.f4361r = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f4352i = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f4353j = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(C0506a.m3152d(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(C0506a.m3152d(getContext(), i));
    }

    public void setSliderFadeColor(int i) {
        this.f4350g = i;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: e */
        private static final int[] f4370e = {16843137};

        /* renamed from: a */
        public float f4371a = 0.0f;

        /* renamed from: b */
        boolean f4372b;

        /* renamed from: c */
        boolean f4373c;

        /* renamed from: d */
        Paint f4374d;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4370e);
            this.f4371a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4350g = -858993460;
        this.f4367x = true;
        this.f4368y = new Rect();
        this.f4369z = new ArrayList<>();
        float f = context.getResources().getDisplayMetrics().density;
        this.f4354k = (int) ((32.0f * f) + 0.5f);
        setWillNotDraw(false);
        C3774v.m16217o0(this, new C1033a());
        C3774v.m16237y0(this, 1);
        C3808c o = C3808c.m16414o(this, 0.5f, new C1035c());
        this.f4365v = o;
        o.mo13290M(f * 400.0f);
    }
}
