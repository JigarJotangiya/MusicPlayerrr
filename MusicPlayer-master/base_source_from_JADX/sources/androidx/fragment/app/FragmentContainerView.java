package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import p082e.p136n.C4095c;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public final class FragmentContainerView extends FrameLayout {

    /* renamed from: g */
    private ArrayList<View> f2989g;

    /* renamed from: h */
    private ArrayList<View> f2990h;

    /* renamed from: i */
    private boolean f2991i = true;

    public FragmentContainerView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private void m3703a(View view) {
        ArrayList<View> arrayList;
        if (view.getAnimation() != null || ((arrayList = this.f2990h) != null && arrayList.contains(view))) {
            if (this.f2989g == null) {
                this.f2989g = new ArrayList<>();
            }
            this.f2989g.add(view);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (C0602j.m3850m0(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    /* access modifiers changed from: protected */
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (C0602j.m3850m0(view) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f2991i && this.f2989g != null) {
            for (int i = 0; i < this.f2989g.size(); i++) {
                super.drawChild(canvas, this.f2989g.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList<View> arrayList;
        if (!this.f2991i || (arrayList = this.f2989g) == null || arrayList.size() <= 0 || !this.f2989g.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f2990h;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f2989g;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f2991i = true;
            }
        }
        super.endViewTransition(view);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m3703a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        if (z) {
            m3703a(view);
        }
        super.removeDetachedView(view, z);
    }

    public void removeView(View view) {
        m3703a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        m3703a(getChildAt(i));
        super.removeViewAt(i);
    }

    public void removeViewInLayout(View view) {
        m3703a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m3703a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m3703a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    /* access modifiers changed from: package-private */
    public void setDrawDisappearingViewsLast(boolean z) {
        this.f2991i = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f2990h == null) {
                this.f2990h = new ArrayList<>();
            }
            this.f2990h.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to be instantiated from XML.");
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to be instantiated from XML.");
    }

    FragmentContainerView(Context context, AttributeSet attributeSet, C0602j jVar) {
        super(context, attributeSet);
        String str;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4095c.FragmentContainerView);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(C4095c.FragmentContainerView_android_name) : classAttribute;
        String string = obtainStyledAttributes.getString(C4095c.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment X = jVar.mo3936X(id);
        if (classAttribute != null && X == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = BuildConfig.FLAVOR;
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a = jVar.mo3953g0().mo3881a(context.getClassLoader(), classAttribute);
            a.mo3595H1(context, attributeSet, (Bundle) null);
            C0620p i = jVar.mo3957i();
            i.mo4077u(true);
            i.mo4070d(this, a, string);
            i.mo3818l();
        }
    }
}
