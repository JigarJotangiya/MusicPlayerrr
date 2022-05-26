package p159f.p243f.p245b.p304b.p314v;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p082e.p109h.p110h.C3621a;

/* renamed from: f.f.b.b.v.a */
/* compiled from: ShadowRenderer */
public class C7532a {

    /* renamed from: i */
    private static final int[] f32767i = new int[3];

    /* renamed from: j */
    private static final float[] f32768j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    private static final int[] f32769k = new int[4];

    /* renamed from: l */
    private static final float[] f32770l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    private final Paint f32771a;

    /* renamed from: b */
    private final Paint f32772b;

    /* renamed from: c */
    private final Paint f32773c;

    /* renamed from: d */
    private int f32774d;

    /* renamed from: e */
    private int f32775e;

    /* renamed from: f */
    private int f32776f;

    /* renamed from: g */
    private final Path f32777g;

    /* renamed from: h */
    private Paint f32778h;

    public C7532a() {
        this(-16777216);
    }

    /* renamed from: a */
    public void mo28433a(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        int i2 = i;
        float f3 = f2;
        boolean z = f3 < 0.0f;
        Path path = this.f32777g;
        if (z) {
            int[] iArr = f32769k;
            iArr[0] = 0;
            iArr[1] = this.f32776f;
            iArr[2] = this.f32775e;
            iArr[3] = this.f32774d;
            float f4 = f;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF2, f, f3);
            path.close();
            float f5 = (float) (-i2);
            rectF2.inset(f5, f5);
            int[] iArr2 = f32769k;
            iArr2[0] = 0;
            iArr2[1] = this.f32774d;
            iArr2[2] = this.f32775e;
            iArr2[3] = this.f32776f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f6 = 1.0f - (((float) i2) / width);
            float[] fArr = f32770l;
            fArr[1] = f6;
            fArr[2] = ((1.0f - f6) / 2.0f) + f6;
            this.f32772b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f32769k, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            canvas2.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, this.f32778h);
            }
            canvas.drawArc(rectF, f, f2, true, this.f32772b);
            canvas.restore();
        }
    }

    /* renamed from: b */
    public void mo28434b(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += (float) i;
        rectF.offset(0.0f, (float) (-i));
        int[] iArr = f32767i;
        iArr[0] = this.f32776f;
        iArr[1] = this.f32775e;
        iArr[2] = this.f32774d;
        Paint paint = this.f32773c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, f32768j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f32773c);
        canvas.restore();
    }

    /* renamed from: c */
    public Paint mo28435c() {
        return this.f32771a;
    }

    /* renamed from: d */
    public void mo28436d(int i) {
        this.f32774d = C3621a.m15595m(i, 68);
        this.f32775e = C3621a.m15595m(i, 20);
        this.f32776f = C3621a.m15595m(i, 0);
        this.f32771a.setColor(this.f32774d);
    }

    public C7532a(int i) {
        this.f32777g = new Path();
        this.f32778h = new Paint();
        this.f32771a = new Paint();
        mo28436d(i);
        this.f32778h.setColor(0);
        Paint paint = new Paint(4);
        this.f32772b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f32773c = new Paint(paint);
    }
}
