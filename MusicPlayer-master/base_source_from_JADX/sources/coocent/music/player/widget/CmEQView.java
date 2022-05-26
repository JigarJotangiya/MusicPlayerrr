package coocent.music.player.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import coocent.musiclibrary.music.p292j.C7397j;

public class CmEQView extends View {

    /* renamed from: g */
    private Paint f31470g;

    /* renamed from: h */
    private int f31471h = (C7397j.f32504a / 11);

    /* renamed from: i */
    private Point[] f31472i = new Point[12];

    /* renamed from: j */
    Path f31473j;

    /* renamed from: k */
    Point f31474k;

    /* renamed from: l */
    Point f31475l;

    /* renamed from: m */
    Point f31476m;

    /* renamed from: n */
    Point f31477n;

    /* renamed from: o */
    int f31478o = 0;

    /* renamed from: p */
    private boolean f31479p = true;

    /* renamed from: q */
    private float f31480q = 0.0f;

    public CmEQView(Context context) {
        super(context);
        m40557a();
    }

    /* renamed from: a */
    private void m40557a() {
        Paint paint = new Paint();
        this.f31470g = paint;
        paint.setAntiAlias(true);
        this.f31470g.setStyle(Paint.Style.STROKE);
        this.f31470g.setColor(-1);
        this.f31470g.setStrokeWidth(6.0f);
        new PaintFlagsDrawFilter(0, 3);
        this.f31473j = new Path();
        this.f31474k = new Point();
        this.f31475l = new Point();
        this.f31478o = (int) (C7397j.f32506c * 2.0f);
    }

    private Path getPointCurvePath() {
        this.f31473j.reset();
        Point[] pointArr = this.f31472i;
        if (pointArr == null || pointArr.length == 0) {
            return this.f31473j;
        }
        int i = 0;
        Point point = pointArr[0];
        this.f31476m = point;
        this.f31473j.moveTo((float) point.x, (float) point.y);
        while (true) {
            Point[] pointArr2 = this.f31472i;
            if (i >= pointArr2.length - 1) {
                return this.f31473j;
            }
            Point point2 = pointArr2[i];
            this.f31476m = point2;
            i++;
            Point point3 = pointArr2[i];
            this.f31477n = point3;
            Point point4 = this.f31474k;
            point4.y = point2.y;
            int i2 = (int) (((float) (point2.x + point3.x)) / 2.0f);
            point4.x = i2;
            Point point5 = this.f31475l;
            point5.y = point3.y;
            point5.x = i2;
            int i3 = point4.y;
            int i4 = this.f31478o;
            if (i3 < i4) {
                point4.y = i4;
            }
            if (point5.y < i4) {
                point5.y = i4;
            }
            if (point3.y < i4) {
                point3.y = i4;
            }
            this.f31473j.cubicTo((float) point4.x, (float) point4.y, (float) i2, (float) point5.y, (float) point3.x, (float) point3.y);
        }
    }

    /* renamed from: b */
    public void mo27392b(int i, int i2) {
        if (i2 >= 100) {
            i2 = 99;
        }
        if (i2 <= 0) {
            i2 = 1;
        }
        Point[] pointArr = this.f31472i;
        if (i < pointArr.length && pointArr[i] != null) {
            pointArr[i].y = (getHeight() - this.f31478o) - ((int) (((float) i2) * this.f31480q));
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(getPointCurvePath(), this.f31470g);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = i2 - this.f31478o;
        this.f31480q = (((float) i5) * 1.0f) / 100.0f;
        Point point = new Point();
        point.x = 0;
        int i6 = i5 / 2;
        point.y = i6;
        this.f31472i[0] = point;
        Point point2 = new Point();
        point2.x = i;
        point2.y = i6;
        Point[] pointArr = this.f31472i;
        pointArr[pointArr.length - 1] = point2;
        this.f31471h = i / (this.f31479p ? 11 : 6);
        for (int i7 = 1; i7 < this.f31472i.length - 1; i7++) {
            Point point3 = new Point();
            point3.x = this.f31471h * i7;
            point3.y = i6;
            this.f31472i[i7] = point3;
        }
    }

    public void setTenBand(boolean z) {
        if (z) {
            this.f31472i = new Point[12];
            this.f31471h = C7397j.f32504a / 11;
        } else {
            this.f31472i = new Point[7];
            this.f31471h = C7397j.f32504a / 6;
        }
        this.f31479p = z;
    }

    public CmEQView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m40557a();
    }

    public CmEQView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m40557a();
    }
}
