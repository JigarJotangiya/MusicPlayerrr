package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p082e.p097d.C3460a;
import p082e.p097d.C3461b;
import p082e.p097d.C3463d;
import p082e.p097d.C3464e;

public class CardView extends FrameLayout {

    /* renamed from: n */
    private static final int[] f1513n = {16842801};

    /* renamed from: o */
    private static final C0359e f1514o;

    /* renamed from: g */
    private boolean f1515g;

    /* renamed from: h */
    private boolean f1516h;

    /* renamed from: i */
    int f1517i;

    /* renamed from: j */
    int f1518j;

    /* renamed from: k */
    final Rect f1519k;

    /* renamed from: l */
    final Rect f1520l;

    /* renamed from: m */
    private final C0358d f1521m;

    /* renamed from: androidx.cardview.widget.CardView$a */
    class C0352a implements C0358d {

        /* renamed from: a */
        private Drawable f1522a;

        C0352a() {
        }

        /* renamed from: a */
        public void mo2307a(int i, int i2, int i3, int i4) {
            CardView.this.f1520l.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1519k;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        /* renamed from: b */
        public void mo2308b(int i, int i2) {
            CardView cardView = CardView.this;
            if (i > cardView.f1517i) {
                CardView.super.setMinimumWidth(i);
            }
            CardView cardView2 = CardView.this;
            if (i2 > cardView2.f1518j) {
                CardView.super.setMinimumHeight(i2);
            }
        }

        /* renamed from: c */
        public void mo2309c(Drawable drawable) {
            this.f1522a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        /* renamed from: d */
        public boolean mo2310d() {
            return CardView.this.getPreventCornerOverlap();
        }

        /* renamed from: e */
        public boolean mo2311e() {
            return CardView.this.getUseCompatPadding();
        }

        /* renamed from: f */
        public Drawable mo2312f() {
            return this.f1522a;
        }

        /* renamed from: g */
        public View mo2313g() {
            return CardView.this;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f1514o = new C0355b();
        } else if (i >= 17) {
            f1514o = new C0353a();
        } else {
            f1514o = new C0356c();
        }
        f1514o.mo2314j();
    }

    public CardView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ColorStateList getCardBackgroundColor() {
        return f1514o.mo2323h(this.f1521m);
    }

    public float getCardElevation() {
        return f1514o.mo2318c(this.f1521m);
    }

    public int getContentPaddingBottom() {
        return this.f1519k.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1519k.left;
    }

    public int getContentPaddingRight() {
        return this.f1519k.right;
    }

    public int getContentPaddingTop() {
        return this.f1519k.top;
    }

    public float getMaxCardElevation() {
        return f1514o.mo2322g(this.f1521m);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1516h;
    }

    public float getRadius() {
        return f1514o.mo2319d(this.f1521m);
    }

    public boolean getUseCompatPadding() {
        return this.f1515g;
    }

    /* renamed from: h */
    public void mo2294h(int i, int i2, int i3, int i4) {
        this.f1519k.set(i, i2, i3, i4);
        f1514o.mo2324i(this.f1521m);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0359e eVar = f1514o;
        if (!(eVar instanceof C0355b)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) eVar.mo2326l(this.f1521m)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) eVar.mo2325k(this.f1521m)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f1514o.mo2328n(this.f1521m, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        f1514o.mo2321f(this.f1521m, f);
    }

    public void setMaxCardElevation(float f) {
        f1514o.mo2329o(this.f1521m, f);
    }

    public void setMinimumHeight(int i) {
        this.f1518j = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.f1517i = i;
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f1516h) {
            this.f1516h = z;
            f1514o.mo2327m(this.f1521m);
        }
    }

    public void setRadius(float f) {
        f1514o.mo2317b(this.f1521m, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f1515g != z) {
            this.f1515g = z;
            f1514o.mo2320e(this.f1521m);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3460a.cardViewStyle);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1514o.mo2328n(this.f1521m, colorStateList);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f1519k = rect;
        this.f1520l = new Rect();
        C0352a aVar = new C0352a();
        this.f1521m = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3464e.CardView, i, C3463d.CardView);
        int i3 = C3464e.CardView_cardBackgroundColor;
        if (obtainStyledAttributes.hasValue(i3)) {
            valueOf = obtainStyledAttributes.getColorStateList(i3);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1513n);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i2 = getResources().getColor(C3461b.cardview_light_background);
            } else {
                i2 = getResources().getColor(C3461b.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(i2);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(C3464e.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C3464e.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(C3464e.CardView_cardMaxElevation, 0.0f);
        this.f1515g = obtainStyledAttributes.getBoolean(C3464e.CardView_cardUseCompatPadding, false);
        this.f1516h = obtainStyledAttributes.getBoolean(C3464e.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C3464e.CardView_contentPadding, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(C3464e.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(C3464e.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(C3464e.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(C3464e.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1517i = obtainStyledAttributes.getDimensionPixelSize(C3464e.CardView_android_minWidth, 0);
        this.f1518j = obtainStyledAttributes.getDimensionPixelSize(C3464e.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        f1514o.mo2316a(aVar, context, colorStateList, dimension, dimension2, f);
    }
}
