package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0171g;
import androidx.appcompat.view.menu.C0175i;
import androidx.appcompat.widget.C0279g0;
import androidx.core.content.C0506a;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.C6064b;
import com.google.android.material.internal.C6067e;
import com.google.android.material.internal.C6068f;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import p082e.p083a.C3400a;
import p082e.p083a.p084k.p085a.C3410a;
import p082e.p083a.p090o.C3439g;
import p082e.p109h.p119p.C3718d0;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.C7500l;
import p159f.p243f.p245b.p304b.p312t.C7522c;
import p159f.p243f.p245b.p304b.p315w.C7541h;
import p159f.p243f.p245b.p304b.p315w.C7545i;
import p159f.p243f.p245b.p304b.p315w.C7549m;

public class NavigationView extends ScrimInsetsFrameLayout {

    /* renamed from: s */
    private static final int[] f28570s = {16842912};

    /* renamed from: t */
    private static final int[] f28571t = {-16842910};

    /* renamed from: u */
    private static final int f28572u = C7499k.Widget_Design_NavigationView;

    /* renamed from: l */
    private final C6067e f28573l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C6068f f28574m;

    /* renamed from: n */
    C6115c f28575n;

    /* renamed from: o */
    private final int f28576o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final int[] f28577p;

    /* renamed from: q */
    private MenuInflater f28578q;

    /* renamed from: r */
    private ViewTreeObserver.OnGlobalLayoutListener f28579r;

    /* renamed from: com.google.android.material.navigation.NavigationView$a */
    class C6113a implements C0171g.C0172a {
        C6113a() {
        }

        /* renamed from: a */
        public boolean mo532a(C0171g gVar, MenuItem menuItem) {
            C6115c cVar = NavigationView.this.f28575n;
            return cVar != null && cVar.mo24326a(menuItem);
        }

        /* renamed from: b */
        public void mo534b(C0171g gVar) {
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$b */
    class C6114b implements ViewTreeObserver.OnGlobalLayoutListener {
        C6114b() {
        }

        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f28577p);
            boolean z = true;
            boolean z2 = NavigationView.this.f28577p[1] == 0;
            NavigationView.this.f28574m.mo24178p(z2);
            NavigationView.this.setDrawTopInsetForeground(z2);
            Activity a = C6064b.m36464a(NavigationView.this.getContext());
            if (a != null && Build.VERSION.SDK_INT >= 21) {
                boolean z3 = a.findViewById(16908290).getHeight() == NavigationView.this.getHeight();
                boolean z4 = Color.alpha(a.getWindow().getNavigationBarColor()) != 0;
                NavigationView navigationView2 = NavigationView.this;
                if (!z3 || !z4) {
                    z = false;
                }
                navigationView2.setDrawBottomInsetForeground(z);
            }
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$c */
    public interface C6115c {
        /* renamed from: a */
        boolean mo24326a(MenuItem menuItem);
    }

    public NavigationView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: d */
    private ColorStateList m36626d(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList c = C3410a.m14542c(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C3400a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = c.getDefaultColor();
        int[] iArr = f28571t;
        return new ColorStateList(new int[][]{iArr, f28570s, FrameLayout.EMPTY_STATE_SET}, new int[]{c.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    /* renamed from: e */
    private final Drawable m36627e(C0279g0 g0Var) {
        C7541h hVar = new C7541h(C7549m.m42146b(getContext(), g0Var.mo1989n(C7500l.NavigationView_itemShapeAppearance, 0), g0Var.mo1989n(C7500l.NavigationView_itemShapeAppearanceOverlay, 0)).mo28526m());
        hVar.mo28463a0(C7522c.m42015b(getContext(), g0Var, C7500l.NavigationView_itemShapeFillColor));
        return new InsetDrawable(hVar, g0Var.mo1981f(C7500l.NavigationView_itemShapeInsetStart, 0), g0Var.mo1981f(C7500l.NavigationView_itemShapeInsetTop, 0), g0Var.mo1981f(C7500l.NavigationView_itemShapeInsetEnd, 0), g0Var.mo1981f(C7500l.NavigationView_itemShapeInsetBottom, 0));
    }

    /* renamed from: g */
    private boolean m36628g(C0279g0 g0Var) {
        return g0Var.mo1994s(C7500l.NavigationView_itemShapeAppearance) || g0Var.mo1994s(C7500l.NavigationView_itemShapeAppearanceOverlay);
    }

    private MenuInflater getMenuInflater() {
        if (this.f28578q == null) {
            this.f28578q = new C3439g(getContext());
        }
        return this.f28578q;
    }

    /* renamed from: j */
    private void m36629j() {
        this.f28579r = new C6114b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f28579r);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo24102a(C3718d0 d0Var) {
        this.f28574m.mo24166d(d0Var);
    }

    /* renamed from: f */
    public View mo24288f(int i) {
        return this.f28574m.mo24169g(i);
    }

    public MenuItem getCheckedItem() {
        return this.f28574m.mo24167e();
    }

    public int getHeaderCount() {
        return this.f28574m.mo24168f();
    }

    public Drawable getItemBackground() {
        return this.f28574m.mo24170h();
    }

    public int getItemHorizontalPadding() {
        return this.f28574m.mo24171i();
    }

    public int getItemIconPadding() {
        return this.f28574m.mo24172j();
    }

    public ColorStateList getItemIconTintList() {
        return this.f28574m.mo24175m();
    }

    public int getItemMaxLines() {
        return this.f28574m.mo24173k();
    }

    public ColorStateList getItemTextColor() {
        return this.f28574m.mo24174l();
    }

    public Menu getMenu() {
        return this.f28573l;
    }

    /* renamed from: h */
    public View mo24298h(int i) {
        return this.f28574m.mo24177o(i);
    }

    /* renamed from: i */
    public void mo24299i(int i) {
        this.f28574m.mo24164B(true);
        getMenuInflater().inflate(i, this.f28573l);
        this.f28574m.mo24164B(false);
        this.f28574m.mo815E(false);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C7545i.m42139e(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 16) {
            getViewTreeObserver().removeGlobalOnLayoutListener(this.f28579r);
        } else {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.f28579r);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.f28576o), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.f28576o, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3471a());
        this.f28573l.mo898S(savedState.f28580i);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f28580i = bundle;
        this.f28573l.mo900U(bundle);
        return savedState;
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.f28573l.findItem(i);
        if (findItem != null) {
            this.f28574m.mo24179q((C0175i) findItem);
        }
    }

    public void setElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f);
        }
        C7545i.m42138d(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.f28574m.mo24181s(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(C0506a.m3152d(getContext(), i));
    }

    public void setItemHorizontalPadding(int i) {
        this.f28574m.mo24182t(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.f28574m.mo24182t(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(int i) {
        this.f28574m.mo24183u(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.f28574m.mo24183u(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(int i) {
        this.f28574m.mo24184v(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f28574m.mo24185w(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.f28574m.mo24186x(i);
    }

    public void setItemTextAppearance(int i) {
        this.f28574m.mo24187y(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f28574m.mo24188z(colorStateList);
    }

    public void setNavigationItemSelectedListener(C6115c cVar) {
        this.f28575n = cVar;
    }

    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        C6068f fVar = this.f28574m;
        if (fVar != null) {
            fVar.mo24163A(i);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6112a();

        /* renamed from: i */
        public Bundle f28580i;

        /* renamed from: com.google.android.material.navigation.NavigationView$SavedState$a */
        static class C6112a implements Parcelable.ClassLoaderCreator<SavedState> {
            C6112a() {
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f28580i = parcel.readBundle(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f28580i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.navigationViewStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NavigationView(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r6 = f28572u
            android.content.Context r11 = com.google.android.material.theme.p249a.C6260a.m37386c(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            com.google.android.material.internal.f r11 = new com.google.android.material.internal.f
            r11.<init>()
            r10.f28574m = r11
            r0 = 2
            int[] r0 = new int[r0]
            r10.f28577p = r0
            android.content.Context r7 = r10.getContext()
            com.google.android.material.internal.e r8 = new com.google.android.material.internal.e
            r8.<init>(r7)
            r10.f28573l = r8
            int[] r2 = p159f.p243f.p245b.p304b.C7500l.NavigationView
            r9 = 0
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r12
            r3 = r13
            r4 = r6
            androidx.appcompat.widget.g0 r0 = com.google.android.material.internal.C6093m.m36564i(r0, r1, r2, r3, r4, r5)
            int r1 = p159f.p243f.p245b.p304b.C7500l.NavigationView_android_background
            boolean r2 = r0.mo1994s(r1)
            if (r2 == 0) goto L_0x003c
            android.graphics.drawable.Drawable r1 = r0.mo1982g(r1)
            p082e.p109h.p119p.C3774v.m16223r0(r10, r1)
        L_0x003c:
            android.graphics.drawable.Drawable r1 = r10.getBackground()
            if (r1 == 0) goto L_0x004a
            android.graphics.drawable.Drawable r1 = r10.getBackground()
            boolean r1 = r1 instanceof android.graphics.drawable.ColorDrawable
            if (r1 == 0) goto L_0x0072
        L_0x004a:
            f.f.b.b.w.m$b r12 = p159f.p243f.p245b.p304b.p315w.C7549m.m42149e(r7, r12, r13, r6)
            f.f.b.b.w.m r12 = r12.mo28526m()
            android.graphics.drawable.Drawable r13 = r10.getBackground()
            f.f.b.b.w.h r1 = new f.f.b.b.w.h
            r1.<init>((p159f.p243f.p245b.p304b.p315w.C7549m) r12)
            boolean r12 = r13 instanceof android.graphics.drawable.ColorDrawable
            if (r12 == 0) goto L_0x006c
            android.graphics.drawable.ColorDrawable r13 = (android.graphics.drawable.ColorDrawable) r13
            int r12 = r13.getColor()
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r12)
            r1.mo28463a0(r12)
        L_0x006c:
            r1.mo28456P(r7)
            p082e.p109h.p119p.C3774v.m16223r0(r10, r1)
        L_0x0072:
            int r12 = p159f.p243f.p245b.p304b.C7500l.NavigationView_elevation
            boolean r13 = r0.mo1994s(r12)
            if (r13 == 0) goto L_0x0082
            int r12 = r0.mo1981f(r12, r9)
            float r12 = (float) r12
            r10.setElevation(r12)
        L_0x0082:
            int r12 = p159f.p243f.p245b.p304b.C7500l.NavigationView_android_fitsSystemWindows
            boolean r12 = r0.mo1976a(r12, r9)
            r10.setFitsSystemWindows(r12)
            int r12 = p159f.p243f.p245b.p304b.C7500l.NavigationView_android_maxWidth
            int r12 = r0.mo1981f(r12, r9)
            r10.f28576o = r12
            int r12 = p159f.p243f.p245b.p304b.C7500l.NavigationView_itemIconTint
            boolean r13 = r0.mo1994s(r12)
            if (r13 == 0) goto L_0x00a0
            android.content.res.ColorStateList r12 = r0.mo1978c(r12)
            goto L_0x00a7
        L_0x00a0:
            r12 = 16842808(0x1010038, float:2.3693715E-38)
            android.content.res.ColorStateList r12 = r10.m36626d(r12)
        L_0x00a7:
            int r13 = p159f.p243f.p245b.p304b.C7500l.NavigationView_itemTextAppearance
            boolean r1 = r0.mo1994s(r13)
            r2 = 1
            if (r1 == 0) goto L_0x00b6
            int r13 = r0.mo1989n(r13, r9)
            r1 = 1
            goto L_0x00b8
        L_0x00b6:
            r13 = 0
            r1 = 0
        L_0x00b8:
            int r3 = p159f.p243f.p245b.p304b.C7500l.NavigationView_itemIconSize
            boolean r4 = r0.mo1994s(r3)
            if (r4 == 0) goto L_0x00c7
            int r3 = r0.mo1981f(r3, r9)
            r10.setItemIconSize(r3)
        L_0x00c7:
            r3 = 0
            int r4 = p159f.p243f.p245b.p304b.C7500l.NavigationView_itemTextColor
            boolean r5 = r0.mo1994s(r4)
            if (r5 == 0) goto L_0x00d4
            android.content.res.ColorStateList r3 = r0.mo1978c(r4)
        L_0x00d4:
            if (r1 != 0) goto L_0x00df
            if (r3 != 0) goto L_0x00df
            r3 = 16842806(0x1010036, float:2.369371E-38)
            android.content.res.ColorStateList r3 = r10.m36626d(r3)
        L_0x00df:
            int r4 = p159f.p243f.p245b.p304b.C7500l.NavigationView_itemBackground
            android.graphics.drawable.Drawable r4 = r0.mo1982g(r4)
            if (r4 != 0) goto L_0x00f1
            boolean r5 = r10.m36628g(r0)
            if (r5 == 0) goto L_0x00f1
            android.graphics.drawable.Drawable r4 = r10.m36627e(r0)
        L_0x00f1:
            int r5 = p159f.p243f.p245b.p304b.C7500l.NavigationView_itemHorizontalPadding
            boolean r6 = r0.mo1994s(r5)
            if (r6 == 0) goto L_0x0100
            int r5 = r0.mo1981f(r5, r9)
            r11.mo24182t(r5)
        L_0x0100:
            int r5 = p159f.p243f.p245b.p304b.C7500l.NavigationView_itemIconPadding
            int r5 = r0.mo1981f(r5, r9)
            int r6 = p159f.p243f.p245b.p304b.C7500l.NavigationView_itemMaxLines
            int r6 = r0.mo1986k(r6, r2)
            r10.setItemMaxLines(r6)
            com.google.android.material.navigation.NavigationView$a r6 = new com.google.android.material.navigation.NavigationView$a
            r6.<init>()
            r8.mo901V(r6)
            r11.mo24180r(r2)
            r11.mo819J(r7, r8)
            r11.mo24185w(r12)
            int r12 = r10.getOverScrollMode()
            r11.mo24163A(r12)
            if (r1 == 0) goto L_0x012c
            r11.mo24187y(r13)
        L_0x012c:
            r11.mo24188z(r3)
            r11.mo24181s(r4)
            r11.mo24183u(r5)
            r8.mo916b(r11)
            androidx.appcompat.view.menu.n r11 = r11.mo24176n(r10)
            android.view.View r11 = (android.view.View) r11
            r10.addView(r11)
            int r11 = p159f.p243f.p245b.p304b.C7500l.NavigationView_menu
            boolean r12 = r0.mo1994s(r11)
            if (r12 == 0) goto L_0x0150
            int r11 = r0.mo1989n(r11, r9)
            r10.mo24299i(r11)
        L_0x0150:
            int r11 = p159f.p243f.p245b.p304b.C7500l.NavigationView_headerLayout
            boolean r12 = r0.mo1994s(r11)
            if (r12 == 0) goto L_0x015f
            int r11 = r0.mo1989n(r11, r9)
            r10.mo24298h(r11)
        L_0x015f:
            r0.mo1995w()
            r10.m36629j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f28573l.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f28574m.mo24179q((C0175i) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
