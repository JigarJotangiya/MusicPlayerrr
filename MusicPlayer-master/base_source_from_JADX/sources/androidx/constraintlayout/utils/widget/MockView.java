package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C0439f;
import androidx.recyclerview.widget.C0885l;

public class MockView extends View {

    /* renamed from: g */
    private Paint f2077g = new Paint();

    /* renamed from: h */
    private Paint f2078h = new Paint();

    /* renamed from: i */
    private Paint f2079i = new Paint();

    /* renamed from: j */
    private boolean f2080j = true;

    /* renamed from: k */
    private boolean f2081k = true;

    /* renamed from: l */
    protected String f2082l = null;

    /* renamed from: m */
    private Rect f2083m = new Rect();

    /* renamed from: n */
    private int f2084n = Color.argb(255, 0, 0, 0);

    /* renamed from: o */
    private int f2085o = Color.argb(255, C0885l.C0891f.DEFAULT_DRAG_ANIMATION_DURATION, C0885l.C0891f.DEFAULT_DRAG_ANIMATION_DURATION, C0885l.C0891f.DEFAULT_DRAG_ANIMATION_DURATION);

    /* renamed from: p */
    private int f2086p = Color.argb(255, 50, 50, 50);

    /* renamed from: q */
    private int f2087q = 4;

    public MockView(Context context) {
        super(context);
        m2651a(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m2651a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0439f.MockView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0439f.MockView_mock_label) {
                    this.f2082l = obtainStyledAttributes.getString(index);
                } else if (index == C0439f.MockView_mock_showDiagonals) {
                    this.f2080j = obtainStyledAttributes.getBoolean(index, this.f2080j);
                } else if (index == C0439f.MockView_mock_diagonalsColor) {
                    this.f2084n = obtainStyledAttributes.getColor(index, this.f2084n);
                } else if (index == C0439f.MockView_mock_labelBackgroundColor) {
                    this.f2086p = obtainStyledAttributes.getColor(index, this.f2086p);
                } else if (index == C0439f.MockView_mock_labelColor) {
                    this.f2085o = obtainStyledAttributes.getColor(index, this.f2085o);
                } else if (index == C0439f.MockView_mock_showLabel) {
                    this.f2081k = obtainStyledAttributes.getBoolean(index, this.f2081k);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f2082l == null) {
            try {
                this.f2082l = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f2077g.setColor(this.f2084n);
        this.f2077g.setAntiAlias(true);
        this.f2078h.setColor(this.f2085o);
        this.f2078h.setAntiAlias(true);
        this.f2079i.setColor(this.f2086p);
        this.f2087q = Math.round(((float) this.f2087q) * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f2080j) {
            width--;
            height--;
            float f = (float) width;
            float f2 = (float) height;
            canvas.drawLine(0.0f, 0.0f, f, f2, this.f2077g);
            Canvas canvas2 = canvas;
            float f3 = f;
            canvas2.drawLine(0.0f, f2, f3, 0.0f, this.f2077g);
            canvas2.drawLine(0.0f, 0.0f, f3, 0.0f, this.f2077g);
            float f4 = f;
            float f5 = f2;
            canvas2.drawLine(f4, 0.0f, f3, f5, this.f2077g);
            float f6 = f2;
            canvas2.drawLine(f4, f6, 0.0f, f5, this.f2077g);
            canvas2.drawLine(0.0f, f6, 0.0f, 0.0f, this.f2077g);
        }
        String str = this.f2082l;
        if (str != null && this.f2081k) {
            this.f2078h.getTextBounds(str, 0, str.length(), this.f2083m);
            float width2 = ((float) (width - this.f2083m.width())) / 2.0f;
            float height2 = (((float) (height - this.f2083m.height())) / 2.0f) + ((float) this.f2083m.height());
            this.f2083m.offset((int) width2, (int) height2);
            Rect rect = this.f2083m;
            int i = rect.left;
            int i2 = this.f2087q;
            rect.set(i - i2, rect.top - i2, rect.right + i2, rect.bottom + i2);
            canvas.drawRect(this.f2083m, this.f2079i);
            canvas.drawText(this.f2082l, width2, height2, this.f2078h);
        }
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2651a(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2651a(context, attributeSet);
    }
}
