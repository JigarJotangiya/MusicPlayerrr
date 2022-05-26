package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.C0506a;

public class PagerTabStrip extends PagerTitleStrip {

    /* renamed from: A */
    private int f4770A;

    /* renamed from: B */
    private int f4771B;

    /* renamed from: C */
    private final Paint f4772C;

    /* renamed from: D */
    private final Rect f4773D;

    /* renamed from: E */
    private int f4774E;

    /* renamed from: F */
    private boolean f4775F;

    /* renamed from: G */
    private boolean f4776G;

    /* renamed from: H */
    private int f4777H;

    /* renamed from: I */
    private boolean f4778I;

    /* renamed from: J */
    private float f4779J;

    /* renamed from: K */
    private float f4780K;

    /* renamed from: L */
    private int f4781L;

    /* renamed from: w */
    private int f4782w;

    /* renamed from: x */
    private int f4783x;

    /* renamed from: y */
    private int f4784y;

    /* renamed from: z */
    private int f4785z;

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$a */
    class C1167a implements View.OnClickListener {
        C1167a() {
        }

        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f4790g;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$b */
    class C1168b implements View.OnClickListener {
        C1168b() {
        }

        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f4790g;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo6178d(int i, float f, boolean z) {
        Rect rect = this.f4773D;
        int height = getHeight();
        int left = this.f4792i.getLeft() - this.f4771B;
        int right = this.f4792i.getRight() + this.f4771B;
        int i2 = height - this.f4783x;
        rect.set(left, i2, right, height);
        super.mo6178d(i, f, z);
        this.f4774E = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f4792i.getLeft() - this.f4771B, i2, this.f4792i.getRight() + this.f4771B, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f4775F;
    }

    /* access modifiers changed from: package-private */
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f4770A);
    }

    public int getTabIndicatorColor() {
        return this.f4782w;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f4792i.getLeft() - this.f4771B;
        int right = this.f4792i.getRight() + this.f4771B;
        this.f4772C.setColor((this.f4774E << 24) | (this.f4782w & 16777215));
        float f = (float) height;
        canvas.drawRect((float) left, (float) (height - this.f4783x), (float) right, f, this.f4772C);
        if (this.f4775F) {
            this.f4772C.setColor(-16777216 | (this.f4782w & 16777215));
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.f4777H), (float) (getWidth() - getPaddingRight()), f, this.f4772C);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f4778I) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.f4779J = x;
            this.f4780K = y;
            this.f4778I = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x - this.f4779J) > ((float) this.f4781L) || Math.abs(y - this.f4780K) > ((float) this.f4781L))) {
                this.f4778I = true;
            }
        } else if (x < ((float) (this.f4792i.getLeft() - this.f4771B))) {
            ViewPager viewPager = this.f4790g;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        } else if (x > ((float) (this.f4792i.getRight() + this.f4771B))) {
            ViewPager viewPager2 = this.f4790g;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
        return true;
    }

    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (!this.f4776G) {
            this.f4775F = (i & -16777216) == 0;
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (!this.f4776G) {
            this.f4775F = drawable == null;
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (!this.f4776G) {
            this.f4775F = i == 0;
        }
    }

    public void setDrawFullUnderline(boolean z) {
        this.f4775F = z;
        this.f4776G = true;
        invalidate();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.f4784y;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(int i) {
        this.f4782w = i;
        this.f4772C.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(C0506a.m3150b(getContext(), i));
    }

    public void setTextSpacing(int i) {
        int i2 = this.f4785z;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f4772C = paint;
        this.f4773D = new Rect();
        this.f4774E = 255;
        this.f4775F = false;
        this.f4776G = false;
        int i = this.f4803t;
        this.f4782w = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.f4783x = (int) ((3.0f * f) + 0.5f);
        this.f4784y = (int) ((6.0f * f) + 0.5f);
        this.f4785z = (int) (64.0f * f);
        this.f4771B = (int) ((16.0f * f) + 0.5f);
        this.f4777H = (int) ((1.0f * f) + 0.5f);
        this.f4770A = (int) ((f * 32.0f) + 0.5f);
        this.f4781L = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f4791h.setFocusable(true);
        this.f4791h.setOnClickListener(new C1167a());
        this.f4793j.setFocusable(true);
        this.f4793j.setOnClickListener(new C1168b());
        if (getBackground() == null) {
            this.f4775F = true;
        }
    }
}
