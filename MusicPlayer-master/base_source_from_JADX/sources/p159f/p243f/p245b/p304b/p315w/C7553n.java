package p159f.p243f.p245b.p304b.p315w;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;

/* renamed from: f.f.b.b.w.n */
/* compiled from: ShapeAppearancePathProvider */
public class C7553n {

    /* renamed from: a */
    private final C7557o[] f32861a = new C7557o[4];

    /* renamed from: b */
    private final Matrix[] f32862b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f32863c = new Matrix[4];

    /* renamed from: d */
    private final PointF f32864d = new PointF();

    /* renamed from: e */
    private final Path f32865e = new Path();

    /* renamed from: f */
    private final Path f32866f = new Path();

    /* renamed from: g */
    private final C7557o f32867g = new C7557o();

    /* renamed from: h */
    private final float[] f32868h = new float[2];

    /* renamed from: i */
    private final float[] f32869i = new float[2];

    /* renamed from: j */
    private final Path f32870j = new Path();

    /* renamed from: k */
    private final Path f32871k = new Path();

    /* renamed from: l */
    private boolean f32872l = true;

    /* renamed from: f.f.b.b.w.n$a */
    /* compiled from: ShapeAppearancePathProvider */
    private static class C7554a {

        /* renamed from: a */
        static final C7553n f32873a = new C7553n();
    }

    /* renamed from: f.f.b.b.w.n$b */
    /* compiled from: ShapeAppearancePathProvider */
    public interface C7555b {
        /* renamed from: a */
        void mo28492a(C7557o oVar, Matrix matrix, int i);

        /* renamed from: b */
        void mo28493b(C7557o oVar, Matrix matrix, int i);
    }

    /* renamed from: f.f.b.b.w.n$c */
    /* compiled from: ShapeAppearancePathProvider */
    static final class C7556c {

        /* renamed from: a */
        public final C7549m f32874a;

        /* renamed from: b */
        public final Path f32875b;

        /* renamed from: c */
        public final RectF f32876c;

        /* renamed from: d */
        public final C7555b f32877d;

        /* renamed from: e */
        public final float f32878e;

        C7556c(C7549m mVar, float f, RectF rectF, C7555b bVar, Path path) {
            this.f32877d = bVar;
            this.f32874a = mVar;
            this.f32878e = f;
            this.f32876c = rectF;
            this.f32875b = path;
        }
    }

    public C7553n() {
        for (int i = 0; i < 4; i++) {
            this.f32861a[i] = new C7557o();
            this.f32862b[i] = new Matrix();
            this.f32863c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    private float m42207a(int i) {
        return (float) ((i + 1) * 90);
    }

    /* renamed from: b */
    private void m42208b(C7556c cVar, int i) {
        this.f32868h[0] = this.f32861a[i].mo28547k();
        this.f32868h[1] = this.f32861a[i].mo28548l();
        this.f32862b[i].mapPoints(this.f32868h);
        if (i == 0) {
            Path path = cVar.f32875b;
            float[] fArr = this.f32868h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f32875b;
            float[] fArr2 = this.f32868h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f32861a[i].mo28542d(this.f32862b[i], cVar.f32875b);
        C7555b bVar = cVar.f32877d;
        if (bVar != null) {
            bVar.mo28492a(this.f32861a[i], this.f32862b[i], i);
        }
    }

    /* renamed from: c */
    private void m42209c(C7556c cVar, int i) {
        int i2 = (i + 1) % 4;
        this.f32868h[0] = this.f32861a[i].mo28545i();
        this.f32868h[1] = this.f32861a[i].mo28546j();
        this.f32862b[i].mapPoints(this.f32868h);
        this.f32869i[0] = this.f32861a[i2].mo28547k();
        this.f32869i[1] = this.f32861a[i2].mo28548l();
        this.f32862b[i2].mapPoints(this.f32869i);
        float[] fArr = this.f32868h;
        float f = fArr[0];
        float[] fArr2 = this.f32869i;
        float max = Math.max(((float) Math.hypot((double) (f - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float i3 = m42213i(cVar.f32876c, i);
        this.f32867g.mo28550n(0.0f, 0.0f);
        C7539f j = m42214j(i, cVar.f32874a);
        j.mo23021b(max, i3, cVar.f32878e, this.f32867g);
        this.f32870j.reset();
        this.f32867g.mo28542d(this.f32863c[i], this.f32870j);
        if (!this.f32872l || Build.VERSION.SDK_INT < 19 || (!j.mo28444a() && !m42216l(this.f32870j, i) && !m42216l(this.f32870j, i2))) {
            this.f32867g.mo28542d(this.f32863c[i], cVar.f32875b);
        } else {
            Path path = this.f32870j;
            path.op(path, this.f32866f, Path.Op.DIFFERENCE);
            this.f32868h[0] = this.f32867g.mo28547k();
            this.f32868h[1] = this.f32867g.mo28548l();
            this.f32863c[i].mapPoints(this.f32868h);
            Path path2 = this.f32865e;
            float[] fArr3 = this.f32868h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f32867g.mo28542d(this.f32863c[i], this.f32865e);
        }
        C7555b bVar = cVar.f32877d;
        if (bVar != null) {
            bVar.mo28493b(this.f32867g, this.f32863c[i], i);
        }
    }

    /* renamed from: f */
    private void m42210f(int i, RectF rectF, PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    /* renamed from: g */
    private C7536c m42211g(int i, C7549m mVar) {
        if (i == 1) {
            return mVar.mo28503l();
        }
        if (i == 2) {
            return mVar.mo28501j();
        }
        if (i != 3) {
            return mVar.mo28510t();
        }
        return mVar.mo28508r();
    }

    /* renamed from: h */
    private C7537d m42212h(int i, C7549m mVar) {
        if (i == 1) {
            return mVar.mo28502k();
        }
        if (i == 2) {
            return mVar.mo28500i();
        }
        if (i != 3) {
            return mVar.mo28509s();
        }
        return mVar.mo28507q();
    }

    /* renamed from: i */
    private float m42213i(RectF rectF, int i) {
        float[] fArr = this.f32868h;
        C7557o[] oVarArr = this.f32861a;
        fArr[0] = oVarArr[i].f32881c;
        fArr[1] = oVarArr[i].f32882d;
        this.f32862b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            return Math.abs(rectF.centerX() - this.f32868h[0]);
        }
        return Math.abs(rectF.centerY() - this.f32868h[1]);
    }

    /* renamed from: j */
    private C7539f m42214j(int i, C7549m mVar) {
        if (i == 1) {
            return mVar.mo28499h();
        }
        if (i == 2) {
            return mVar.mo28504n();
        }
        if (i != 3) {
            return mVar.mo28505o();
        }
        return mVar.mo28506p();
    }

    /* renamed from: k */
    public static C7553n m42215k() {
        return C7554a.f32873a;
    }

    /* renamed from: l */
    private boolean m42216l(Path path, int i) {
        this.f32871k.reset();
        this.f32861a[i].mo28542d(this.f32862b[i], this.f32871k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f32871k.computeBounds(rectF, true);
        path.op(this.f32871k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private void m42217m(C7556c cVar, int i) {
        m42212h(i, cVar.f32874a).mo28443b(this.f32861a[i], 90.0f, cVar.f32878e, cVar.f32876c, m42211g(i, cVar.f32874a));
        float a = m42207a(i);
        this.f32862b[i].reset();
        m42210f(i, cVar.f32876c, this.f32864d);
        Matrix matrix = this.f32862b[i];
        PointF pointF = this.f32864d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f32862b[i].preRotate(a);
    }

    /* renamed from: n */
    private void m42218n(int i) {
        this.f32868h[0] = this.f32861a[i].mo28545i();
        this.f32868h[1] = this.f32861a[i].mo28546j();
        this.f32862b[i].mapPoints(this.f32868h);
        float a = m42207a(i);
        this.f32863c[i].reset();
        Matrix matrix = this.f32863c[i];
        float[] fArr = this.f32868h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f32863c[i].preRotate(a);
    }

    /* renamed from: d */
    public void mo28539d(C7549m mVar, float f, RectF rectF, Path path) {
        mo28540e(mVar, f, rectF, (C7555b) null, path);
    }

    /* renamed from: e */
    public void mo28540e(C7549m mVar, float f, RectF rectF, C7555b bVar, Path path) {
        path.rewind();
        this.f32865e.rewind();
        this.f32866f.rewind();
        this.f32866f.addRect(rectF, Path.Direction.CW);
        C7556c cVar = new C7556c(mVar, f, rectF, bVar, path);
        for (int i = 0; i < 4; i++) {
            m42217m(cVar, i);
            m42218n(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m42208b(cVar, i2);
            m42209c(cVar, i2);
        }
        path.close();
        this.f32865e.close();
        if (Build.VERSION.SDK_INT >= 19 && !this.f32865e.isEmpty()) {
            path.op(this.f32865e, Path.Op.UNION);
        }
    }
}
