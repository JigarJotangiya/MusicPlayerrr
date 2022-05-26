package coocent.music.player.widget.recyclerview_fastscroll.views;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextUtils;
import androidx.annotation.Keep;
import coocent.music.player.widget.p277m.p279b.C7266a;

public class FastScrollPopup {

    /* renamed from: a */
    private FastScrollRecyclerView f32069a;

    /* renamed from: b */
    private Resources f32070b;

    /* renamed from: c */
    private int f32071c;

    /* renamed from: d */
    private int f32072d;

    /* renamed from: e */
    private Path f32073e = new Path();

    /* renamed from: f */
    private RectF f32074f = new RectF();

    /* renamed from: g */
    private Paint f32075g;

    /* renamed from: h */
    private int f32076h = -16777216;

    /* renamed from: i */
    private Rect f32077i = new Rect();

    /* renamed from: j */
    private Rect f32078j = new Rect();

    /* renamed from: k */
    private Rect f32079k = new Rect();

    /* renamed from: l */
    private String f32080l;

    /* renamed from: m */
    private Paint f32081m;

    /* renamed from: n */
    private Rect f32082n = new Rect();

    /* renamed from: o */
    private float f32083o = 1.0f;

    /* renamed from: p */
    private ObjectAnimator f32084p;

    /* renamed from: q */
    private boolean f32085q;

    /* renamed from: r */
    private int f32086r;

    public FastScrollPopup(Resources resources, FastScrollRecyclerView fastScrollRecyclerView) {
        this.f32070b = resources;
        this.f32069a = fastScrollRecyclerView;
        this.f32075g = new Paint(1);
        Paint paint = new Paint(1);
        this.f32081m = paint;
        paint.setAlpha(0);
        mo27861j(C7266a.m41188c(this.f32070b, 44.0f));
        mo27855e(C7266a.m41187b(this.f32070b, 88.0f));
    }

    /* renamed from: b */
    private float[] m41189b() {
        if (this.f32086r == 1) {
            int i = this.f32072d;
            return new float[]{(float) i, (float) i, (float) i, (float) i, (float) i, (float) i, (float) i, (float) i};
        } else if (C7266a.m41186a(this.f32070b)) {
            int i2 = this.f32072d;
            return new float[]{(float) i2, (float) i2, (float) i2, (float) i2, (float) i2, (float) i2, 0.0f, 0.0f};
        } else {
            int i3 = this.f32072d;
            return new float[]{(float) i3, (float) i3, (float) i3, (float) i3, 0.0f, 0.0f, (float) i3, (float) i3};
        }
    }

    /* renamed from: a */
    public void mo27852a(boolean z) {
        if (this.f32085q != z) {
            this.f32085q = z;
            ObjectAnimator objectAnimator = this.f32084p;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            float[] fArr = new float[1];
            fArr[0] = z ? 1.0f : 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", fArr);
            this.f32084p = ofFloat;
            ofFloat.setDuration(z ? 200 : 150);
            this.f32084p.start();
        }
    }

    /* renamed from: c */
    public void mo27853c(Canvas canvas) {
        if (mo27854d()) {
            int save = canvas.save();
            Rect rect = this.f32079k;
            canvas.translate((float) rect.left, (float) rect.top);
            this.f32078j.set(this.f32079k);
            this.f32078j.offsetTo(0, 0);
            this.f32073e.reset();
            this.f32074f.set(this.f32078j);
            this.f32073e.addRoundRect(this.f32074f, m41189b(), Path.Direction.CW);
            this.f32075g.setAlpha((int) (((float) Color.alpha(this.f32076h)) * this.f32083o));
            this.f32081m.setAlpha((int) (this.f32083o * 255.0f));
            canvas.drawPath(this.f32073e, this.f32075g);
            canvas.drawText(this.f32080l, (float) ((this.f32079k.width() - this.f32082n.width()) / 2), (float) (this.f32079k.height() - ((this.f32079k.height() - this.f32082n.height()) / 2)), this.f32081m);
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: d */
    public boolean mo27854d() {
        return this.f32083o > 0.0f && !TextUtils.isEmpty(this.f32080l);
    }

    /* renamed from: e */
    public void mo27855e(int i) {
        this.f32071c = i;
        this.f32072d = i / 2;
        this.f32069a.invalidate(this.f32079k);
    }

    /* renamed from: f */
    public void mo27856f(int i) {
        this.f32076h = i;
        this.f32075g.setColor(i);
        this.f32069a.invalidate(this.f32079k);
    }

    /* renamed from: g */
    public void mo27857g(int i) {
        this.f32086r = i;
    }

    @Keep
    public float getAlpha() {
        return this.f32083o;
    }

    /* renamed from: h */
    public void mo27859h(String str) {
        if (!str.equals(this.f32080l)) {
            this.f32080l = str;
            this.f32081m.getTextBounds(str, 0, str.length(), this.f32082n);
            Rect rect = this.f32082n;
            rect.right = (int) (((float) rect.left) + this.f32081m.measureText(str));
        }
    }

    /* renamed from: i */
    public void mo27860i(int i) {
        this.f32081m.setColor(i);
        this.f32069a.invalidate(this.f32079k);
    }

    /* renamed from: j */
    public void mo27861j(int i) {
        this.f32081m.setTextSize((float) i);
        this.f32069a.invalidate(this.f32079k);
    }

    /* renamed from: k */
    public void mo27862k(Typeface typeface) {
        this.f32081m.setTypeface(typeface);
        this.f32069a.invalidate(this.f32079k);
    }

    /* renamed from: l */
    public Rect mo27863l(FastScrollRecyclerView fastScrollRecyclerView, int i) {
        this.f32077i.set(this.f32079k);
        if (mo27854d()) {
            int scrollBarWidth = fastScrollRecyclerView.getScrollBarWidth();
            int i2 = this.f32071c;
            int max = Math.max(i2, this.f32082n.width() + (Math.round((float) ((this.f32071c - this.f32082n.height()) / 10)) * 5 * 2));
            if (this.f32086r == 1) {
                this.f32079k.left = (fastScrollRecyclerView.getWidth() - max) / 2;
                Rect rect = this.f32079k;
                rect.right = rect.left + max;
                rect.top = (fastScrollRecyclerView.getHeight() - i2) / 2;
            } else {
                if (C7266a.m41186a(this.f32070b)) {
                    this.f32079k.left = fastScrollRecyclerView.getScrollBarWidth() * 2;
                    Rect rect2 = this.f32079k;
                    rect2.right = rect2.left + max;
                } else {
                    this.f32079k.right = fastScrollRecyclerView.getWidth() - (fastScrollRecyclerView.getScrollBarWidth() * 2);
                    Rect rect3 = this.f32079k;
                    rect3.left = rect3.right - max;
                }
                this.f32079k.top = (i - i2) + (fastScrollRecyclerView.getScrollBarThumbHeight() / 2);
                Rect rect4 = this.f32079k;
                rect4.top = Math.max(scrollBarWidth, Math.min(rect4.top, (fastScrollRecyclerView.getHeight() - scrollBarWidth) - i2));
            }
            Rect rect5 = this.f32079k;
            rect5.bottom = rect5.top + i2;
        } else {
            this.f32079k.setEmpty();
        }
        this.f32077i.union(this.f32079k);
        return this.f32077i;
    }

    @Keep
    public void setAlpha(float f) {
        this.f32083o = f;
        this.f32069a.invalidate(this.f32079k);
    }
}
