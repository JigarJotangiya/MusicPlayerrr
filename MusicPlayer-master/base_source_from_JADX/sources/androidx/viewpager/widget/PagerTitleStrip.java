package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.widget.C0556l;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.Locale;

@ViewPager.C1176e
public class PagerTitleStrip extends ViewGroup {

    /* renamed from: u */
    private static final int[] f4788u = {16842804, 16842901, 16842904, 16842927};

    /* renamed from: v */
    private static final int[] f4789v = {16843660};

    /* renamed from: g */
    ViewPager f4790g;

    /* renamed from: h */
    TextView f4791h;

    /* renamed from: i */
    TextView f4792i;

    /* renamed from: j */
    TextView f4793j;

    /* renamed from: k */
    private int f4794k;

    /* renamed from: l */
    float f4795l;

    /* renamed from: m */
    private int f4796m;

    /* renamed from: n */
    private int f4797n;

    /* renamed from: o */
    private boolean f4798o;

    /* renamed from: p */
    private boolean f4799p;

    /* renamed from: q */
    private final C1169a f4800q;

    /* renamed from: r */
    private WeakReference<C1184a> f4801r;

    /* renamed from: s */
    private int f4802s;

    /* renamed from: t */
    int f4803t;

    /* renamed from: androidx.viewpager.widget.PagerTitleStrip$a */
    private class C1169a extends DataSetObserver implements ViewPager.C1180i, ViewPager.C1179h {

        /* renamed from: a */
        private int f4804a;

        C1169a() {
        }

        /* renamed from: a */
        public void mo6206a(ViewPager viewPager, C1184a aVar, C1184a aVar2) {
            PagerTitleStrip.this.mo6195b(aVar, aVar2);
        }

        /* renamed from: d */
        public void mo6207d(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            PagerTitleStrip.this.mo6178d(i, f, false);
        }

        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.mo6196c(pagerTitleStrip.f4790g.getCurrentItem(), PagerTitleStrip.this.f4790g.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f = pagerTitleStrip2.f4795l;
            if (f < 0.0f) {
                f = 0.0f;
            }
            pagerTitleStrip2.mo6178d(pagerTitleStrip2.f4790g.getCurrentItem(), f, true);
        }

        /* renamed from: r */
        public void mo6209r(int i) {
            this.f4804a = i;
        }

        /* renamed from: s */
        public void mo6210s(int i) {
            if (this.f4804a == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.mo6196c(pagerTitleStrip.f4790g.getCurrentItem(), PagerTitleStrip.this.f4790g.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f = pagerTitleStrip2.f4795l;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                pagerTitleStrip2.mo6178d(pagerTitleStrip2.f4790g.getCurrentItem(), f, true);
            }
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTitleStrip$b */
    private static class C1170b extends SingleLineTransformationMethod {

        /* renamed from: g */
        private Locale f4806g;

        C1170b(Context context) {
            this.f4806g = context.getResources().getConfiguration().locale;
        }

        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f4806g);
            }
            return null;
        }
    }

    public PagerTitleStrip(Context context) {
        this(context, (AttributeSet) null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new C1170b(textView.getContext()));
    }

    /* renamed from: a */
    public void mo6194a(int i, float f) {
        this.f4791h.setTextSize(i, f);
        this.f4792i.setTextSize(i, f);
        this.f4793j.setTextSize(i, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6195b(C1184a aVar, C1184a aVar2) {
        if (aVar != null) {
            aVar.mo6305u(this.f4800q);
            this.f4801r = null;
        }
        if (aVar2 != null) {
            aVar2.mo6301m(this.f4800q);
            this.f4801r = new WeakReference<>(aVar2);
        }
        ViewPager viewPager = this.f4790g;
        if (viewPager != null) {
            this.f4794k = -1;
            this.f4795l = -1.0f;
            mo6196c(viewPager.getCurrentItem(), aVar2);
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo6196c(int i, C1184a aVar) {
        int e = aVar != null ? aVar.mo6295e() : 0;
        this.f4798o = true;
        CharSequence charSequence = null;
        this.f4791h.setText((i < 1 || aVar == null) ? null : aVar.mo6297g(i - 1));
        this.f4792i.setText((aVar == null || i >= e) ? null : aVar.mo6297g(i));
        int i2 = i + 1;
        if (i2 < e && aVar != null) {
            charSequence = aVar.mo6297g(i2);
        }
        this.f4793j.setText(charSequence);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f4791h.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f4792i.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f4793j.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f4794k = i;
        if (!this.f4799p) {
            mo6178d(i, this.f4795l, false);
        }
        this.f4798o = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo6178d(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i;
        float f2 = f;
        if (i6 != this.f4794k) {
            mo6196c(i6, this.f4790g.getAdapter());
        } else if (!z && f2 == this.f4795l) {
            return;
        }
        this.f4799p = true;
        int measuredWidth = this.f4791h.getMeasuredWidth();
        int measuredWidth2 = this.f4792i.getMeasuredWidth();
        int measuredWidth3 = this.f4793j.getMeasuredWidth();
        int i7 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i8 = paddingRight + i7;
        int i9 = (width - (paddingLeft + i7)) - i8;
        float f3 = 0.5f + f2;
        if (f3 > 1.0f) {
            f3 -= 1.0f;
        }
        int i10 = ((width - i8) - ((int) (((float) i9) * f3))) - i7;
        int i11 = measuredWidth2 + i10;
        int baseline = this.f4791h.getBaseline();
        int baseline2 = this.f4792i.getBaseline();
        int baseline3 = this.f4793j.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i12 = max - baseline;
        int i13 = max - baseline2;
        int i14 = max - baseline3;
        int i15 = measuredWidth3;
        int max2 = Math.max(Math.max(this.f4791h.getMeasuredHeight() + i12, this.f4792i.getMeasuredHeight() + i13), this.f4793j.getMeasuredHeight() + i14);
        int i16 = this.f4797n & 112;
        if (i16 == 16) {
            i5 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else if (i16 != 80) {
            i4 = i12 + paddingTop;
            i2 = i13 + paddingTop;
            i3 = paddingTop + i14;
            TextView textView = this.f4792i;
            textView.layout(i10, i2, i11, textView.getMeasuredHeight() + i2);
            int min = Math.min(paddingLeft, (i10 - this.f4796m) - measuredWidth);
            TextView textView2 = this.f4791h;
            textView2.layout(min, i4, measuredWidth + min, textView2.getMeasuredHeight() + i4);
            int max3 = Math.max((width - paddingRight) - i15, i11 + this.f4796m);
            TextView textView3 = this.f4793j;
            textView3.layout(max3, i3, max3 + i15, textView3.getMeasuredHeight() + i3);
            this.f4795l = f;
            this.f4799p = false;
        } else {
            i5 = (height - paddingBottom) - max2;
        }
        i4 = i12 + i5;
        i2 = i13 + i5;
        i3 = i5 + i14;
        TextView textView4 = this.f4792i;
        textView4.layout(i10, i2, i11, textView4.getMeasuredHeight() + i2);
        int min2 = Math.min(paddingLeft, (i10 - this.f4796m) - measuredWidth);
        TextView textView22 = this.f4791h;
        textView22.layout(min2, i4, measuredWidth + min2, textView22.getMeasuredHeight() + i4);
        int max32 = Math.max((width - paddingRight) - i15, i11 + this.f4796m);
        TextView textView32 = this.f4793j;
        textView32.layout(max32, i3, max32 + i15, textView32.getMeasuredHeight() + i3);
        this.f4795l = f;
        this.f4799p = false;
    }

    /* access modifiers changed from: package-private */
    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f4796m;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            C1184a adapter = viewPager.getAdapter();
            viewPager.mo6221Q(this.f4800q);
            viewPager.mo6229b(this.f4800q);
            this.f4790g = viewPager;
            WeakReference<C1184a> weakReference = this.f4801r;
            mo6195b(weakReference != null ? (C1184a) weakReference.get() : null, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f4790g;
        if (viewPager != null) {
            mo6195b(viewPager.getAdapter(), (C1184a) null);
            this.f4790g.mo6221Q((ViewPager.C1180i) null);
            this.f4790g.mo6216I(this.f4800q);
            this.f4790g = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f4790g != null) {
            float f = this.f4795l;
            if (f < 0.0f) {
                f = 0.0f;
            }
            mo6178d(this.f4794k, f, true);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
            int size = View.MeasureSpec.getSize(i);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (((float) size) * 0.2f), -2);
            this.f4791h.measure(childMeasureSpec2, childMeasureSpec);
            this.f4792i.measure(childMeasureSpec2, childMeasureSpec);
            this.f4793j.measure(childMeasureSpec2, childMeasureSpec);
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                i3 = View.MeasureSpec.getSize(i2);
            } else {
                i3 = Math.max(getMinHeight(), this.f4792i.getMeasuredHeight() + paddingTop);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(i3, i2, this.f4792i.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    public void requestLayout() {
        if (!this.f4798o) {
            super.requestLayout();
        }
    }

    public void setGravity(int i) {
        this.f4797n = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f) {
        int i = ((int) (f * 255.0f)) & 255;
        this.f4802s = i;
        int i2 = (i << 24) | (this.f4803t & 16777215);
        this.f4791h.setTextColor(i2);
        this.f4793j.setTextColor(i2);
    }

    public void setTextColor(int i) {
        this.f4803t = i;
        this.f4792i.setTextColor(i);
        int i2 = (this.f4802s << 24) | (this.f4803t & 16777215);
        this.f4791h.setTextColor(i2);
        this.f4793j.setTextColor(i2);
    }

    public void setTextSpacing(int i) {
        this.f4796m = i;
        requestLayout();
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4794k = -1;
        this.f4795l = -1.0f;
        this.f4800q = new C1169a();
        TextView textView = new TextView(context);
        this.f4791h = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f4792i = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f4793j = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4788u);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            C0556l.m3435q(this.f4791h, resourceId);
            C0556l.m3435q(this.f4792i, resourceId);
            C0556l.m3435q(this.f4793j, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            mo6194a(0, (float) dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.f4791h.setTextColor(color);
            this.f4792i.setTextColor(color);
            this.f4793j.setTextColor(color);
        }
        this.f4797n = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f4803t = this.f4792i.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f4791h.setEllipsize(TextUtils.TruncateAt.END);
        this.f4792i.setEllipsize(TextUtils.TruncateAt.END);
        this.f4793j.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f4789v);
            z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.f4791h);
            setSingleLineAllCaps(this.f4792i);
            setSingleLineAllCaps(this.f4793j);
        } else {
            this.f4791h.setSingleLine();
            this.f4792i.setSingleLine();
            this.f4793j.setSingleLine();
        }
        this.f4796m = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
