package androidx.percentlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import p082e.p109h.p119p.C3760h;
import p082e.p109h.p119p.C3774v;
import p082e.p146s.C4131a;

@Deprecated
/* renamed from: androidx.percentlayout.widget.a */
/* compiled from: PercentLayoutHelper */
public class C0776a {

    /* renamed from: a */
    private final ViewGroup f3474a;

    @Deprecated
    /* renamed from: androidx.percentlayout.widget.a$a */
    /* compiled from: PercentLayoutHelper */
    public static class C0777a {

        /* renamed from: a */
        public float f3475a = -1.0f;

        /* renamed from: b */
        public float f3476b = -1.0f;

        /* renamed from: c */
        public float f3477c = -1.0f;

        /* renamed from: d */
        public float f3478d = -1.0f;

        /* renamed from: e */
        public float f3479e = -1.0f;

        /* renamed from: f */
        public float f3480f = -1.0f;

        /* renamed from: g */
        public float f3481g = -1.0f;

        /* renamed from: h */
        public float f3482h = -1.0f;

        /* renamed from: i */
        public float f3483i;

        /* renamed from: j */
        final C0779c f3484j = new C0779c(0, 0);

        /* renamed from: a */
        public void mo4420a(ViewGroup.LayoutParams layoutParams, int i, int i2) {
            C0779c cVar = this.f3484j;
            int i3 = layoutParams.width;
            cVar.width = i3;
            int i4 = layoutParams.height;
            cVar.height = i4;
            boolean z = false;
            boolean z2 = (cVar.f3486b || i3 == 0) && this.f3475a < 0.0f;
            if ((cVar.f3485a || i4 == 0) && this.f3476b < 0.0f) {
                z = true;
            }
            float f = this.f3475a;
            if (f >= 0.0f) {
                layoutParams.width = Math.round(((float) i) * f);
            }
            float f2 = this.f3476b;
            if (f2 >= 0.0f) {
                layoutParams.height = Math.round(((float) i2) * f2);
            }
            float f3 = this.f3483i;
            if (f3 >= 0.0f) {
                if (z2) {
                    layoutParams.width = Math.round(((float) layoutParams.height) * f3);
                    this.f3484j.f3486b = true;
                }
                if (z) {
                    layoutParams.height = Math.round(((float) layoutParams.width) / this.f3483i);
                    this.f3484j.f3485a = true;
                }
            }
        }

        /* renamed from: b */
        public void mo4421b(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
            mo4420a(marginLayoutParams, i, i2);
            C0779c cVar = this.f3484j;
            cVar.leftMargin = marginLayoutParams.leftMargin;
            cVar.topMargin = marginLayoutParams.topMargin;
            cVar.rightMargin = marginLayoutParams.rightMargin;
            cVar.bottomMargin = marginLayoutParams.bottomMargin;
            C3760h.m16097e(cVar, C3760h.m16094b(marginLayoutParams));
            C3760h.m16096d(this.f3484j, C3760h.m16093a(marginLayoutParams));
            float f = this.f3477c;
            if (f >= 0.0f) {
                marginLayoutParams.leftMargin = Math.round(((float) i) * f);
            }
            float f2 = this.f3478d;
            if (f2 >= 0.0f) {
                marginLayoutParams.topMargin = Math.round(((float) i2) * f2);
            }
            float f3 = this.f3479e;
            if (f3 >= 0.0f) {
                marginLayoutParams.rightMargin = Math.round(((float) i) * f3);
            }
            float f4 = this.f3480f;
            if (f4 >= 0.0f) {
                marginLayoutParams.bottomMargin = Math.round(((float) i2) * f4);
            }
            boolean z = false;
            float f5 = this.f3481g;
            boolean z2 = true;
            if (f5 >= 0.0f) {
                C3760h.m16097e(marginLayoutParams, Math.round(((float) i) * f5));
                z = true;
            }
            float f6 = this.f3482h;
            if (f6 >= 0.0f) {
                C3760h.m16096d(marginLayoutParams, Math.round(((float) i) * f6));
            } else {
                z2 = z;
            }
            if (z2 && view != null) {
                C3760h.m16095c(marginLayoutParams, C3774v.m16151B(view));
            }
        }

        /* renamed from: c */
        public void mo4422c(ViewGroup.LayoutParams layoutParams) {
            C0779c cVar = this.f3484j;
            if (!cVar.f3486b) {
                layoutParams.width = cVar.width;
            }
            if (!cVar.f3485a) {
                layoutParams.height = cVar.height;
            }
            cVar.f3486b = false;
            cVar.f3485a = false;
        }

        /* renamed from: d */
        public void mo4423d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            mo4422c(marginLayoutParams);
            C0779c cVar = this.f3484j;
            marginLayoutParams.leftMargin = cVar.leftMargin;
            marginLayoutParams.topMargin = cVar.topMargin;
            marginLayoutParams.rightMargin = cVar.rightMargin;
            marginLayoutParams.bottomMargin = cVar.bottomMargin;
            C3760h.m16097e(marginLayoutParams, C3760h.m16094b(cVar));
            C3760h.m16096d(marginLayoutParams, C3760h.m16093a(this.f3484j));
        }

        public String toString() {
            return String.format("PercentLayoutInformation width: %f height %f, margins (%f, %f,  %f, %f, %f, %f)", new Object[]{Float.valueOf(this.f3475a), Float.valueOf(this.f3476b), Float.valueOf(this.f3477c), Float.valueOf(this.f3478d), Float.valueOf(this.f3479e), Float.valueOf(this.f3480f), Float.valueOf(this.f3481g), Float.valueOf(this.f3482h)});
        }
    }

    @Deprecated
    /* renamed from: androidx.percentlayout.widget.a$b */
    /* compiled from: PercentLayoutHelper */
    public interface C0778b {
        /* renamed from: a */
        C0777a mo4408a();
    }

    /* renamed from: androidx.percentlayout.widget.a$c */
    /* compiled from: PercentLayoutHelper */
    static class C0779c extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        boolean f3485a;

        /* renamed from: b */
        boolean f3486b;

        public C0779c(int i, int i2) {
            super(i, i2);
        }
    }

    public C0776a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            this.f3474a = viewGroup;
            return;
        }
        throw new IllegalArgumentException("host must be non-null");
    }

    /* renamed from: b */
    public static void m4459b(ViewGroup.LayoutParams layoutParams, TypedArray typedArray, int i, int i2) {
        layoutParams.width = typedArray.getLayoutDimension(i, 0);
        layoutParams.height = typedArray.getLayoutDimension(i2, 0);
    }

    /* renamed from: c */
    public static C0777a m4460c(Context context, AttributeSet attributeSet) {
        C0777a aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4131a.PercentLayout_Layout);
        float fraction = obtainStyledAttributes.getFraction(C4131a.PercentLayout_Layout_layout_widthPercent, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            aVar = new C0777a();
            aVar.f3475a = fraction;
        } else {
            aVar = null;
        }
        float fraction2 = obtainStyledAttributes.getFraction(C4131a.PercentLayout_Layout_layout_heightPercent, 1, 1, -1.0f);
        if (fraction2 != -1.0f) {
            if (aVar == null) {
                aVar = new C0777a();
            }
            aVar.f3476b = fraction2;
        }
        float fraction3 = obtainStyledAttributes.getFraction(C4131a.PercentLayout_Layout_layout_marginPercent, 1, 1, -1.0f);
        if (fraction3 != -1.0f) {
            if (aVar == null) {
                aVar = new C0777a();
            }
            aVar.f3477c = fraction3;
            aVar.f3478d = fraction3;
            aVar.f3479e = fraction3;
            aVar.f3480f = fraction3;
        }
        float fraction4 = obtainStyledAttributes.getFraction(C4131a.PercentLayout_Layout_layout_marginLeftPercent, 1, 1, -1.0f);
        if (fraction4 != -1.0f) {
            if (aVar == null) {
                aVar = new C0777a();
            }
            aVar.f3477c = fraction4;
        }
        float fraction5 = obtainStyledAttributes.getFraction(C4131a.PercentLayout_Layout_layout_marginTopPercent, 1, 1, -1.0f);
        if (fraction5 != -1.0f) {
            if (aVar == null) {
                aVar = new C0777a();
            }
            aVar.f3478d = fraction5;
        }
        float fraction6 = obtainStyledAttributes.getFraction(C4131a.PercentLayout_Layout_layout_marginRightPercent, 1, 1, -1.0f);
        if (fraction6 != -1.0f) {
            if (aVar == null) {
                aVar = new C0777a();
            }
            aVar.f3479e = fraction6;
        }
        float fraction7 = obtainStyledAttributes.getFraction(C4131a.PercentLayout_Layout_layout_marginBottomPercent, 1, 1, -1.0f);
        if (fraction7 != -1.0f) {
            if (aVar == null) {
                aVar = new C0777a();
            }
            aVar.f3480f = fraction7;
        }
        float fraction8 = obtainStyledAttributes.getFraction(C4131a.PercentLayout_Layout_layout_marginStartPercent, 1, 1, -1.0f);
        if (fraction8 != -1.0f) {
            if (aVar == null) {
                aVar = new C0777a();
            }
            aVar.f3481g = fraction8;
        }
        float fraction9 = obtainStyledAttributes.getFraction(C4131a.PercentLayout_Layout_layout_marginEndPercent, 1, 1, -1.0f);
        if (fraction9 != -1.0f) {
            if (aVar == null) {
                aVar = new C0777a();
            }
            aVar.f3482h = fraction9;
        }
        float fraction10 = obtainStyledAttributes.getFraction(C4131a.PercentLayout_Layout_layout_aspectRatio, 1, 1, -1.0f);
        if (fraction10 != -1.0f) {
            if (aVar == null) {
                aVar = new C0777a();
            }
            aVar.f3483i = fraction10;
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: f */
    private static boolean m4461f(View view, C0777a aVar) {
        return (view.getMeasuredHeightAndState() & -16777216) == 16777216 && aVar.f3476b >= 0.0f && aVar.f3484j.height == -2;
    }

    /* renamed from: g */
    private static boolean m4462g(View view, C0777a aVar) {
        return (view.getMeasuredWidthAndState() & -16777216) == 16777216 && aVar.f3475a >= 0.0f && aVar.f3484j.width == -2;
    }

    /* renamed from: a */
    public void mo4417a(int i, int i2) {
        C0777a a;
        int size = (View.MeasureSpec.getSize(i) - this.f3474a.getPaddingLeft()) - this.f3474a.getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - this.f3474a.getPaddingTop()) - this.f3474a.getPaddingBottom();
        int childCount = this.f3474a.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.f3474a.getChildAt(i3);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C0778b) && (a = ((C0778b) layoutParams).mo4408a()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    a.mo4421b(childAt, (ViewGroup.MarginLayoutParams) layoutParams, size, size2);
                } else {
                    a.mo4420a(layoutParams, size, size2);
                }
            }
        }
    }

    /* renamed from: d */
    public boolean mo4418d() {
        C0777a a;
        int childCount = this.f3474a.getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f3474a.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C0778b) && (a = ((C0778b) layoutParams).mo4408a()) != null) {
                if (m4462g(childAt, a)) {
                    layoutParams.width = -2;
                    z = true;
                }
                if (m4461f(childAt, a)) {
                    layoutParams.height = -2;
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: e */
    public void mo4419e() {
        C0777a a;
        int childCount = this.f3474a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup.LayoutParams layoutParams = this.f3474a.getChildAt(i).getLayoutParams();
            if ((layoutParams instanceof C0778b) && (a = ((C0778b) layoutParams).mo4408a()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    a.mo4423d((ViewGroup.MarginLayoutParams) layoutParams);
                } else {
                    a.mo4422c(layoutParams);
                }
            }
        }
    }
}
