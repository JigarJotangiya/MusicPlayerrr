package p159f.p243f.p245b.p304b.p315w;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p159f.p243f.p245b.p304b.p314v.C7532a;

/* renamed from: f.f.b.b.w.o */
/* compiled from: ShapePath */
public class C7557o {
    @Deprecated

    /* renamed from: a */
    public float f32879a;
    @Deprecated

    /* renamed from: b */
    public float f32880b;
    @Deprecated

    /* renamed from: c */
    public float f32881c;
    @Deprecated

    /* renamed from: d */
    public float f32882d;
    @Deprecated

    /* renamed from: e */
    public float f32883e;
    @Deprecated

    /* renamed from: f */
    public float f32884f;

    /* renamed from: g */
    private final List<C7563f> f32885g = new ArrayList();

    /* renamed from: h */
    private final List<C7564g> f32886h = new ArrayList();

    /* renamed from: i */
    private boolean f32887i;

    /* renamed from: f.f.b.b.w.o$a */
    /* compiled from: ShapePath */
    class C7558a extends C7564g {

        /* renamed from: b */
        final /* synthetic */ List f32888b;

        /* renamed from: c */
        final /* synthetic */ Matrix f32889c;

        C7558a(C7557o oVar, List list, Matrix matrix) {
            this.f32888b = list;
            this.f32889c = matrix;
        }

        /* renamed from: a */
        public void mo28552a(Matrix matrix, C7532a aVar, int i, Canvas canvas) {
            for (C7564g a : this.f32888b) {
                a.mo28552a(this.f32889c, aVar, i, canvas);
            }
        }
    }

    /* renamed from: f.f.b.b.w.o$b */
    /* compiled from: ShapePath */
    static class C7559b extends C7564g {

        /* renamed from: b */
        private final C7561d f32890b;

        public C7559b(C7561d dVar) {
            this.f32890b = dVar;
        }

        /* renamed from: a */
        public void mo28552a(Matrix matrix, C7532a aVar, int i, Canvas canvas) {
            float h = this.f32890b.m42259m();
            float i2 = this.f32890b.m42260n();
            aVar.mo28433a(canvas, matrix, new RectF(this.f32890b.m42257k(), this.f32890b.m42261o(), this.f32890b.m42258l(), this.f32890b.m42256j()), i, h, i2);
        }
    }

    /* renamed from: f.f.b.b.w.o$c */
    /* compiled from: ShapePath */
    static class C7560c extends C7564g {

        /* renamed from: b */
        private final C7562e f32891b;

        /* renamed from: c */
        private final float f32892c;

        /* renamed from: d */
        private final float f32893d;

        public C7560c(C7562e eVar, float f, float f2) {
            this.f32891b = eVar;
            this.f32892c = f;
            this.f32893d = f2;
        }

        /* renamed from: a */
        public void mo28552a(Matrix matrix, C7532a aVar, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.f32891b.f32902c - this.f32893d), (double) (this.f32891b.f32901b - this.f32892c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f32892c, this.f32893d);
            matrix2.preRotate(mo28553c());
            aVar.mo28434b(canvas, matrix2, rectF, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public float mo28553c() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f32891b.f32902c - this.f32893d) / (this.f32891b.f32901b - this.f32892c))));
        }
    }

    /* renamed from: f.f.b.b.w.o$d */
    /* compiled from: ShapePath */
    public static class C7561d extends C7563f {

        /* renamed from: h */
        private static final RectF f32894h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f32895b;
        @Deprecated

        /* renamed from: c */
        public float f32896c;
        @Deprecated

        /* renamed from: d */
        public float f32897d;
        @Deprecated

        /* renamed from: e */
        public float f32898e;
        @Deprecated

        /* renamed from: f */
        public float f32899f;
        @Deprecated

        /* renamed from: g */
        public float f32900g;

        public C7561d(float f, float f2, float f3, float f4) {
            m42263q(f);
            m42267u(f2);
            m42264r(f3);
            m42262p(f4);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public float m42256j() {
            return this.f32898e;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public float m42257k() {
            return this.f32895b;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public float m42258l() {
            return this.f32897d;
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public float m42259m() {
            return this.f32899f;
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public float m42260n() {
            return this.f32900g;
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public float m42261o() {
            return this.f32896c;
        }

        /* renamed from: p */
        private void m42262p(float f) {
            this.f32898e = f;
        }

        /* renamed from: q */
        private void m42263q(float f) {
            this.f32895b = f;
        }

        /* renamed from: r */
        private void m42264r(float f) {
            this.f32897d = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public void m42265s(float f) {
            this.f32899f = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public void m42266t(float f) {
            this.f32900g = f;
        }

        /* renamed from: u */
        private void m42267u(float f) {
            this.f32896c = f;
        }

        /* renamed from: a */
        public void mo28554a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f32903a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f32894h;
            rectF.set(m42257k(), m42261o(), m42258l(), m42256j());
            path.arcTo(rectF, m42259m(), m42260n(), false);
            path.transform(matrix);
        }
    }

    /* renamed from: f.f.b.b.w.o$e */
    /* compiled from: ShapePath */
    public static class C7562e extends C7563f {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public float f32901b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public float f32902c;

        /* renamed from: a */
        public void mo28554a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f32903a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f32901b, this.f32902c);
            path.transform(matrix);
        }
    }

    /* renamed from: f.f.b.b.w.o$f */
    /* compiled from: ShapePath */
    public static abstract class C7563f {

        /* renamed from: a */
        protected final Matrix f32903a = new Matrix();

        /* renamed from: a */
        public abstract void mo28554a(Matrix matrix, Path path);
    }

    /* renamed from: f.f.b.b.w.o$g */
    /* compiled from: ShapePath */
    static abstract class C7564g {

        /* renamed from: a */
        static final Matrix f32904a = new Matrix();

        C7564g() {
        }

        /* renamed from: a */
        public abstract void mo28552a(Matrix matrix, C7532a aVar, int i, Canvas canvas);

        /* renamed from: b */
        public final void mo28555b(C7532a aVar, int i, Canvas canvas) {
            mo28552a(f32904a, aVar, i, canvas);
        }
    }

    public C7557o() {
        mo28550n(0.0f, 0.0f);
    }

    /* renamed from: b */
    private void m42223b(float f) {
        if (m42225g() != f) {
            float g = ((f - m42225g()) + 360.0f) % 360.0f;
            if (g <= 180.0f) {
                C7561d dVar = new C7561d(mo28545i(), mo28546j(), mo28545i(), mo28546j());
                dVar.m42265s(m42225g());
                dVar.m42266t(g);
                this.f32886h.add(new C7559b(dVar));
                m42227p(f);
            }
        }
    }

    /* renamed from: c */
    private void m42224c(C7564g gVar, float f, float f2) {
        m42223b(f);
        this.f32886h.add(gVar);
        m42227p(f2);
    }

    /* renamed from: g */
    private float m42225g() {
        return this.f32883e;
    }

    /* renamed from: h */
    private float m42226h() {
        return this.f32884f;
    }

    /* renamed from: p */
    private void m42227p(float f) {
        this.f32883e = f;
    }

    /* renamed from: q */
    private void m42228q(float f) {
        this.f32884f = f;
    }

    /* renamed from: r */
    private void m42229r(float f) {
        this.f32881c = f;
    }

    /* renamed from: s */
    private void m42230s(float f) {
        this.f32882d = f;
    }

    /* renamed from: t */
    private void m42231t(float f) {
        this.f32879a = f;
    }

    /* renamed from: u */
    private void m42232u(float f) {
        this.f32880b = f;
    }

    /* renamed from: a */
    public void mo28541a(float f, float f2, float f3, float f4, float f5, float f6) {
        C7561d dVar = new C7561d(f, f2, f3, f4);
        dVar.m42265s(f5);
        dVar.m42266t(f6);
        this.f32885g.add(dVar);
        C7559b bVar = new C7559b(dVar);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        m42224c(bVar, f5, z ? (180.0f + f7) % 360.0f : f7);
        double d = (double) f7;
        m42229r(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        m42230s(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    /* renamed from: d */
    public void mo28542d(Matrix matrix, Path path) {
        int size = this.f32885g.size();
        for (int i = 0; i < size; i++) {
            this.f32885g.get(i).mo28554a(matrix, path);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo28543e() {
        return this.f32887i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C7564g mo28544f(Matrix matrix) {
        m42223b(m42226h());
        return new C7558a(this, new ArrayList(this.f32886h), new Matrix(matrix));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public float mo28545i() {
        return this.f32881c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo28546j() {
        return this.f32882d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public float mo28547k() {
        return this.f32879a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public float mo28548l() {
        return this.f32880b;
    }

    /* renamed from: m */
    public void mo28549m(float f, float f2) {
        C7562e eVar = new C7562e();
        float unused = eVar.f32901b = f;
        float unused2 = eVar.f32902c = f2;
        this.f32885g.add(eVar);
        C7560c cVar = new C7560c(eVar, mo28545i(), mo28546j());
        m42224c(cVar, cVar.mo28553c() + 270.0f, cVar.mo28553c() + 270.0f);
        m42229r(f);
        m42230s(f2);
    }

    /* renamed from: n */
    public void mo28550n(float f, float f2) {
        mo28551o(f, f2, 270.0f, 0.0f);
    }

    /* renamed from: o */
    public void mo28551o(float f, float f2, float f3, float f4) {
        m42231t(f);
        m42232u(f2);
        m42229r(f);
        m42230s(f2);
        m42227p(f3);
        m42228q((f3 + f4) % 360.0f);
        this.f32885g.clear();
        this.f32886h.clear();
        this.f32887i = false;
    }
}
