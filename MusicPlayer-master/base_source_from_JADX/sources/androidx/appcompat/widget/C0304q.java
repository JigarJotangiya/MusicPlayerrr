package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.graphics.drawable.C0534a;
import androidx.core.widget.C0552h;
import java.lang.reflect.Field;
import p082e.p083a.C3400a;
import p082e.p083a.p086l.p087a.C3424c;
import p082e.p109h.p119p.C3790z;

/* renamed from: androidx.appcompat.widget.q */
/* compiled from: DropDownListView */
class C0304q extends ListView {

    /* renamed from: g */
    private final Rect f1391g = new Rect();

    /* renamed from: h */
    private int f1392h = 0;

    /* renamed from: i */
    private int f1393i = 0;

    /* renamed from: j */
    private int f1394j = 0;

    /* renamed from: k */
    private int f1395k = 0;

    /* renamed from: l */
    private int f1396l;

    /* renamed from: m */
    private Field f1397m;

    /* renamed from: n */
    private C0305a f1398n;

    /* renamed from: o */
    private boolean f1399o;

    /* renamed from: p */
    private boolean f1400p;

    /* renamed from: q */
    private boolean f1401q;

    /* renamed from: r */
    private C3790z f1402r;

    /* renamed from: s */
    private C0552h f1403s;

    /* renamed from: t */
    C0306b f1404t;

    /* renamed from: androidx.appcompat.widget.q$a */
    /* compiled from: DropDownListView */
    private static class C0305a extends C3424c {

        /* renamed from: h */
        private boolean f1405h = true;

        C0305a(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo2118c(boolean z) {
            this.f1405h = z;
        }

        public void draw(Canvas canvas) {
            if (this.f1405h) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f1405h) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1405h) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f1405h) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1405h) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.q$b */
    /* compiled from: DropDownListView */
    private class C0306b implements Runnable {
        C0306b() {
        }

        /* renamed from: a */
        public void mo2124a() {
            C0304q qVar = C0304q.this;
            qVar.f1404t = null;
            qVar.removeCallbacks(this);
        }

        /* renamed from: b */
        public void mo2125b() {
            C0304q.this.post(this);
        }

        public void run() {
            C0304q qVar = C0304q.this;
            qVar.f1404t = null;
            qVar.drawableStateChanged();
        }
    }

    C0304q(Context context, boolean z) {
        super(context, (AttributeSet) null, C3400a.dropDownListViewStyle);
        this.f1400p = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1397m = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m1833a() {
        this.f1401q = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1396l - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C3790z zVar = this.f1402r;
        if (zVar != null) {
            zVar.mo13224b();
            this.f1402r = null;
        }
    }

    /* renamed from: b */
    private void m1834b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: c */
    private void m1835c(Canvas canvas) {
        Drawable selector;
        if (!this.f1391g.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1391g);
            selector.draw(canvas);
        }
    }

    /* renamed from: f */
    private void m1836f(int i, View view) {
        Rect rect = this.f1391g;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1392h;
        rect.top -= this.f1393i;
        rect.right += this.f1394j;
        rect.bottom += this.f1395k;
        try {
            boolean z = this.f1397m.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f1397m.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    private void m1837g(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        m1836f(i, view);
        if (z2) {
            Rect rect = this.f1391g;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C0534a.m3285k(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: h */
    private void m1838h(int i, View view, float f, float f2) {
        m1837g(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0534a.m3285k(selector, f, f2);
        }
    }

    /* renamed from: i */
    private void m1839i(View view, int i, float f, float f2) {
        View childAt;
        this.f1401q = true;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i3 = this.f1396l;
        if (!(i3 == -1 || (childAt = getChildAt(i3 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f1396l = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (i2 >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m1838h(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: j */
    private boolean m1840j() {
        return this.f1401q;
    }

    /* renamed from: k */
    private void m1841k() {
        Drawable selector = getSelector();
        if (selector != null && m1840j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        C0305a aVar = this.f1398n;
        if (aVar != null) {
            aVar.mo2118c(z);
        }
    }

    /* renamed from: d */
    public int mo2105d(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i11 = layoutParams.height;
            if (i11 > 0) {
                i6 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            } else {
                i6 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i6);
            view.forceLayout();
            if (i8 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i4) {
                return (i5 < 0 || i8 <= i5 || i10 <= 0 || i7 == i4) ? i4 : i10;
            }
            if (i5 >= 0 && i8 >= i5) {
                i10 = i7;
            }
            i8++;
        }
        return i7;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m1835c(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f1404t == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m1841k();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2108e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r9 = 0
            r3 = 1
            goto L_0x0046
        L_0x0011:
            r9 = 0
            r3 = 0
            goto L_0x0046
        L_0x0014:
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = 1
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m1839i(r3, r5, r4, r9)
            if (r0 != r2) goto L_0x000e
            r7.m1834b(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.m1833a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            androidx.core.widget.h r9 = r7.f1403s
            if (r9 != 0) goto L_0x005a
            androidx.core.widget.h r9 = new androidx.core.widget.h
            r9.<init>(r7)
            r7.f1403s = r9
        L_0x005a:
            androidx.core.widget.h r9 = r7.f1403s
            r9.mo3442v(r2)
            androidx.core.widget.h r9 = r7.f1403s
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            androidx.core.widget.h r8 = r7.f1403s
            if (r8 == 0) goto L_0x006c
            r8.mo3442v(r1)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0304q.mo2108e(android.view.MotionEvent, int):boolean");
    }

    public boolean hasFocus() {
        return this.f1400p || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f1400p || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f1400p || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f1400p && this.f1399o) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f1404t = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1404t == null) {
            C0306b bVar = new C0306b();
            this.f1404t = bVar;
            bVar.mo2125b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m1841k();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1396l = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C0306b bVar = this.f1404t;
        if (bVar != null) {
            bVar.mo2124a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f1399o = z;
    }

    public void setSelector(Drawable drawable) {
        C0305a aVar = drawable != null ? new C0305a(drawable) : null;
        this.f1398n = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1392h = rect.left;
        this.f1393i = rect.top;
        this.f1394j = rect.right;
        this.f1395k = rect.bottom;
    }
}
