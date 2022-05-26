package p082e.p083a.p086l.p087a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0534a;
import p082e.p083a.C3400a;
import p082e.p083a.C3408i;
import p082e.p083a.C3409j;

/* renamed from: e.a.l.a.d */
/* compiled from: DrawerArrowDrawable */
public class C3425d extends Drawable {

    /* renamed from: m */
    private static final float f10881m = ((float) Math.toRadians(45.0d));

    /* renamed from: a */
    private final Paint f10882a;

    /* renamed from: b */
    private float f10883b;

    /* renamed from: c */
    private float f10884c;

    /* renamed from: d */
    private float f10885d;

    /* renamed from: e */
    private float f10886e;

    /* renamed from: f */
    private boolean f10887f;

    /* renamed from: g */
    private final Path f10888g = new Path();

    /* renamed from: h */
    private final int f10889h;

    /* renamed from: i */
    private boolean f10890i = false;

    /* renamed from: j */
    private float f10891j;

    /* renamed from: k */
    private float f10892k;

    /* renamed from: l */
    private int f10893l = 2;

    public C3425d(Context context) {
        Paint paint = new Paint();
        this.f10882a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, C3409j.DrawerArrowToggle, C3400a.drawerArrowStyle, C3408i.Base_Widget_AppCompat_DrawerArrowToggle);
        mo12142c(obtainStyledAttributes.getColor(C3409j.DrawerArrowToggle_color, 0));
        mo12141b(obtainStyledAttributes.getDimension(C3409j.DrawerArrowToggle_thickness, 0.0f));
        mo12146f(obtainStyledAttributes.getBoolean(C3409j.DrawerArrowToggle_spinBars, true));
        mo12143d((float) Math.round(obtainStyledAttributes.getDimension(C3409j.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f10889h = obtainStyledAttributes.getDimensionPixelSize(C3409j.DrawerArrowToggle_drawableSize, 0);
        this.f10884c = (float) Math.round(obtainStyledAttributes.getDimension(C3409j.DrawerArrowToggle_barLength, 0.0f));
        this.f10883b = (float) Math.round(obtainStyledAttributes.getDimension(C3409j.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f10885d = obtainStyledAttributes.getDimension(C3409j.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private static float m14620a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: b */
    public void mo12141b(float f) {
        if (this.f10882a.getStrokeWidth() != f) {
            this.f10882a.setStrokeWidth(f);
            this.f10892k = (float) (((double) (f / 2.0f)) * Math.cos((double) f10881m));
            invalidateSelf();
        }
    }

    /* renamed from: c */
    public void mo12142c(int i) {
        if (i != this.f10882a.getColor()) {
            this.f10882a.setColor(i);
            invalidateSelf();
        }
    }

    /* renamed from: d */
    public void mo12143d(float f) {
        if (f != this.f10886e) {
            this.f10886e = f;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int i = this.f10893l;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? C0534a.m3280f(this) == 0 : C0534a.m3280f(this) == 1))) {
            z = true;
        }
        float f = this.f10883b;
        float a = m14620a(this.f10884c, (float) Math.sqrt((double) (f * f * 2.0f)), this.f10891j);
        float a2 = m14620a(this.f10884c, this.f10885d, this.f10891j);
        float round = (float) Math.round(m14620a(0.0f, this.f10892k, this.f10891j));
        float a3 = m14620a(0.0f, f10881m, this.f10891j);
        double d = (double) a;
        float a4 = m14620a(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.f10891j);
        double d2 = (double) a3;
        boolean z2 = z;
        float round2 = (float) Math.round(Math.cos(d2) * d);
        float round3 = (float) Math.round(d * Math.sin(d2));
        this.f10888g.rewind();
        float a5 = m14620a(this.f10886e + this.f10882a.getStrokeWidth(), -this.f10892k, this.f10891j);
        float f2 = (-a2) / 2.0f;
        this.f10888g.moveTo(f2 + round, 0.0f);
        this.f10888g.rLineTo(a2 - (round * 2.0f), 0.0f);
        this.f10888g.moveTo(f2, a5);
        this.f10888g.rLineTo(round2, round3);
        this.f10888g.moveTo(f2, -a5);
        this.f10888g.rLineTo(round2, -round3);
        this.f10888g.close();
        canvas.save();
        float strokeWidth = this.f10882a.getStrokeWidth();
        float height = ((float) bounds.height()) - (3.0f * strokeWidth);
        float f3 = this.f10886e;
        canvas2.translate((float) bounds.centerX(), ((float) ((((int) (height - (2.0f * f3))) / 4) * 2)) + (strokeWidth * 1.5f) + f3);
        if (this.f10887f) {
            canvas2.rotate(a4 * ((float) (this.f10890i ^ z2 ? -1 : 1)));
        } else if (z2) {
            canvas2.rotate(180.0f);
        }
        canvas2.drawPath(this.f10888g, this.f10882a);
        canvas.restore();
    }

    /* renamed from: e */
    public void mo12145e(float f) {
        if (this.f10891j != f) {
            this.f10891j = f;
            invalidateSelf();
        }
    }

    /* renamed from: f */
    public void mo12146f(boolean z) {
        if (this.f10887f != z) {
            this.f10887f = z;
            invalidateSelf();
        }
    }

    /* renamed from: g */
    public void mo12147g(boolean z) {
        if (this.f10890i != z) {
            this.f10890i = z;
            invalidateSelf();
        }
    }

    public int getIntrinsicHeight() {
        return this.f10889h;
    }

    public int getIntrinsicWidth() {
        return this.f10889h;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        if (i != this.f10882a.getAlpha()) {
            this.f10882a.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f10882a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
