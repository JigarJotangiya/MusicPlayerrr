package p159f.p243f.p245b.p304b.p315w;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p159f.p243f.p245b.p304b.C7500l;

/* renamed from: f.f.b.b.w.m */
/* compiled from: ShapeAppearanceModel */
public class C7549m {

    /* renamed from: m */
    public static final C7536c f32836m = new C7547k(0.5f);

    /* renamed from: a */
    C7537d f32837a;

    /* renamed from: b */
    C7537d f32838b;

    /* renamed from: c */
    C7537d f32839c;

    /* renamed from: d */
    C7537d f32840d;

    /* renamed from: e */
    C7536c f32841e;

    /* renamed from: f */
    C7536c f32842f;

    /* renamed from: g */
    C7536c f32843g;

    /* renamed from: h */
    C7536c f32844h;

    /* renamed from: i */
    C7539f f32845i;

    /* renamed from: j */
    C7539f f32846j;

    /* renamed from: k */
    C7539f f32847k;

    /* renamed from: l */
    C7539f f32848l;

    /* renamed from: f.f.b.b.w.m$c */
    /* compiled from: ShapeAppearanceModel */
    public interface C7552c {
        /* renamed from: a */
        C7536c mo28494a(C7536c cVar);
    }

    /* renamed from: a */
    public static C7551b m42145a() {
        return new C7551b();
    }

    /* renamed from: b */
    public static C7551b m42146b(Context context, int i, int i2) {
        return m42147c(context, i, i2, 0);
    }

    /* renamed from: c */
    private static C7551b m42147c(Context context, int i, int i2, int i3) {
        return m42148d(context, i, i2, new C7534a((float) i3));
    }

    /* renamed from: d */
    private static C7551b m42148d(Context context, int i, int i2, C7536c cVar) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C7500l.ShapeAppearance);
        try {
            int i3 = obtainStyledAttributes.getInt(C7500l.ShapeAppearance_cornerFamily, 0);
            int i4 = obtainStyledAttributes.getInt(C7500l.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = obtainStyledAttributes.getInt(C7500l.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = obtainStyledAttributes.getInt(C7500l.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = obtainStyledAttributes.getInt(C7500l.ShapeAppearance_cornerFamilyBottomLeft, i3);
            C7536c m = m42152m(obtainStyledAttributes, C7500l.ShapeAppearance_cornerSize, cVar);
            C7536c m2 = m42152m(obtainStyledAttributes, C7500l.ShapeAppearance_cornerSizeTopLeft, m);
            C7536c m3 = m42152m(obtainStyledAttributes, C7500l.ShapeAppearance_cornerSizeTopRight, m);
            C7536c m4 = m42152m(obtainStyledAttributes, C7500l.ShapeAppearance_cornerSizeBottomRight, m);
            C7536c m5 = m42152m(obtainStyledAttributes, C7500l.ShapeAppearance_cornerSizeBottomLeft, m);
            C7551b bVar = new C7551b();
            bVar.mo28518C(i4, m2);
            bVar.mo28522G(i5, m3);
            bVar.mo28536x(i6, m4);
            bVar.mo28532t(i7, m5);
            return bVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static C7551b m42149e(Context context, AttributeSet attributeSet, int i, int i2) {
        return m42150f(context, attributeSet, i, i2, 0);
    }

    /* renamed from: f */
    public static C7551b m42150f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return m42151g(context, attributeSet, i, i2, new C7534a((float) i3));
    }

    /* renamed from: g */
    public static C7551b m42151g(Context context, AttributeSet attributeSet, int i, int i2, C7536c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7500l.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C7500l.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C7500l.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return m42148d(context, resourceId, resourceId2, cVar);
    }

    /* renamed from: m */
    private static C7536c m42152m(TypedArray typedArray, int i, C7536c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cVar;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new C7534a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i2 == 6 ? new C7547k(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    /* renamed from: h */
    public C7539f mo28499h() {
        return this.f32847k;
    }

    /* renamed from: i */
    public C7537d mo28500i() {
        return this.f32840d;
    }

    /* renamed from: j */
    public C7536c mo28501j() {
        return this.f32844h;
    }

    /* renamed from: k */
    public C7537d mo28502k() {
        return this.f32839c;
    }

    /* renamed from: l */
    public C7536c mo28503l() {
        return this.f32843g;
    }

    /* renamed from: n */
    public C7539f mo28504n() {
        return this.f32848l;
    }

    /* renamed from: o */
    public C7539f mo28505o() {
        return this.f32846j;
    }

    /* renamed from: p */
    public C7539f mo28506p() {
        return this.f32845i;
    }

    /* renamed from: q */
    public C7537d mo28507q() {
        return this.f32837a;
    }

    /* renamed from: r */
    public C7536c mo28508r() {
        return this.f32841e;
    }

    /* renamed from: s */
    public C7537d mo28509s() {
        return this.f32838b;
    }

    /* renamed from: t */
    public C7536c mo28510t() {
        return this.f32842f;
    }

    /* renamed from: u */
    public boolean mo28511u(RectF rectF) {
        Class<C7539f> cls = C7539f.class;
        boolean z = this.f32848l.getClass().equals(cls) && this.f32846j.getClass().equals(cls) && this.f32845i.getClass().equals(cls) && this.f32847k.getClass().equals(cls);
        float a = this.f32841e.mo28437a(rectF);
        boolean z2 = this.f32842f.mo28437a(rectF) == a && this.f32844h.mo28437a(rectF) == a && this.f32843g.mo28437a(rectF) == a;
        boolean z3 = (this.f32838b instanceof C7548l) && (this.f32837a instanceof C7548l) && (this.f32839c instanceof C7548l) && (this.f32840d instanceof C7548l);
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public C7551b mo28512v() {
        return new C7551b(this);
    }

    /* renamed from: w */
    public C7549m mo28513w(float f) {
        C7551b v = mo28512v();
        v.mo28527o(f);
        return v.mo28526m();
    }

    /* renamed from: x */
    public C7549m mo28514x(C7536c cVar) {
        C7551b v = mo28512v();
        v.mo28528p(cVar);
        return v.mo28526m();
    }

    /* renamed from: y */
    public C7549m mo28515y(C7552c cVar) {
        C7551b v = mo28512v();
        v.mo28521F(cVar.mo28494a(mo28508r()));
        v.mo28525J(cVar.mo28494a(mo28510t()));
        v.mo28535w(cVar.mo28494a(mo28501j()));
        v.mo28516A(cVar.mo28494a(mo28503l()));
        return v.mo28526m();
    }

    private C7549m(C7551b bVar) {
        this.f32837a = bVar.f32849a;
        this.f32838b = bVar.f32850b;
        this.f32839c = bVar.f32851c;
        this.f32840d = bVar.f32852d;
        this.f32841e = bVar.f32853e;
        this.f32842f = bVar.f32854f;
        this.f32843g = bVar.f32855g;
        this.f32844h = bVar.f32856h;
        this.f32845i = bVar.f32857i;
        this.f32846j = bVar.f32858j;
        this.f32847k = bVar.f32859k;
        this.f32848l = bVar.f32860l;
    }

    /* renamed from: f.f.b.b.w.m$b */
    /* compiled from: ShapeAppearanceModel */
    public static final class C7551b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C7537d f32849a = C7545i.m42136b();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C7537d f32850b = C7545i.m42136b();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C7537d f32851c = C7545i.m42136b();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C7537d f32852d = C7545i.m42136b();
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C7536c f32853e = new C7534a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C7536c f32854f = new C7534a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C7536c f32855g = new C7534a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C7536c f32856h = new C7534a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C7539f f32857i = C7545i.m42137c();
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C7539f f32858j = C7545i.m42137c();
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C7539f f32859k = C7545i.m42137c();
        /* access modifiers changed from: private */

        /* renamed from: l */
        public C7539f f32860l = C7545i.m42137c();

        public C7551b() {
        }

        /* renamed from: n */
        private static float m42182n(C7537d dVar) {
            if (dVar instanceof C7548l) {
                return ((C7548l) dVar).f32835a;
            }
            if (dVar instanceof C7538e) {
                return ((C7538e) dVar).f32782a;
            }
            return -1.0f;
        }

        /* renamed from: A */
        public C7551b mo28516A(C7536c cVar) {
            this.f32855g = cVar;
            return this;
        }

        /* renamed from: B */
        public C7551b mo28517B(C7539f fVar) {
            this.f32857i = fVar;
            return this;
        }

        /* renamed from: C */
        public C7551b mo28518C(int i, C7536c cVar) {
            mo28519D(C7545i.m42135a(i));
            mo28521F(cVar);
            return this;
        }

        /* renamed from: D */
        public C7551b mo28519D(C7537d dVar) {
            this.f32849a = dVar;
            float n = m42182n(dVar);
            if (n != -1.0f) {
                mo28520E(n);
            }
            return this;
        }

        /* renamed from: E */
        public C7551b mo28520E(float f) {
            this.f32853e = new C7534a(f);
            return this;
        }

        /* renamed from: F */
        public C7551b mo28521F(C7536c cVar) {
            this.f32853e = cVar;
            return this;
        }

        /* renamed from: G */
        public C7551b mo28522G(int i, C7536c cVar) {
            mo28523H(C7545i.m42135a(i));
            mo28525J(cVar);
            return this;
        }

        /* renamed from: H */
        public C7551b mo28523H(C7537d dVar) {
            this.f32850b = dVar;
            float n = m42182n(dVar);
            if (n != -1.0f) {
                mo28524I(n);
            }
            return this;
        }

        /* renamed from: I */
        public C7551b mo28524I(float f) {
            this.f32854f = new C7534a(f);
            return this;
        }

        /* renamed from: J */
        public C7551b mo28525J(C7536c cVar) {
            this.f32854f = cVar;
            return this;
        }

        /* renamed from: m */
        public C7549m mo28526m() {
            return new C7549m(this);
        }

        /* renamed from: o */
        public C7551b mo28527o(float f) {
            mo28520E(f);
            mo28524I(f);
            mo28538z(f);
            mo28534v(f);
            return this;
        }

        /* renamed from: p */
        public C7551b mo28528p(C7536c cVar) {
            mo28521F(cVar);
            mo28525J(cVar);
            mo28516A(cVar);
            mo28535w(cVar);
            return this;
        }

        /* renamed from: q */
        public C7551b mo28529q(int i, float f) {
            mo28530r(C7545i.m42135a(i));
            mo28527o(f);
            return this;
        }

        /* renamed from: r */
        public C7551b mo28530r(C7537d dVar) {
            mo28519D(dVar);
            mo28523H(dVar);
            mo28537y(dVar);
            mo28533u(dVar);
            return this;
        }

        /* renamed from: s */
        public C7551b mo28531s(C7539f fVar) {
            this.f32859k = fVar;
            return this;
        }

        /* renamed from: t */
        public C7551b mo28532t(int i, C7536c cVar) {
            mo28533u(C7545i.m42135a(i));
            mo28535w(cVar);
            return this;
        }

        /* renamed from: u */
        public C7551b mo28533u(C7537d dVar) {
            this.f32852d = dVar;
            float n = m42182n(dVar);
            if (n != -1.0f) {
                mo28534v(n);
            }
            return this;
        }

        /* renamed from: v */
        public C7551b mo28534v(float f) {
            this.f32856h = new C7534a(f);
            return this;
        }

        /* renamed from: w */
        public C7551b mo28535w(C7536c cVar) {
            this.f32856h = cVar;
            return this;
        }

        /* renamed from: x */
        public C7551b mo28536x(int i, C7536c cVar) {
            mo28537y(C7545i.m42135a(i));
            mo28516A(cVar);
            return this;
        }

        /* renamed from: y */
        public C7551b mo28537y(C7537d dVar) {
            this.f32851c = dVar;
            float n = m42182n(dVar);
            if (n != -1.0f) {
                mo28538z(n);
            }
            return this;
        }

        /* renamed from: z */
        public C7551b mo28538z(float f) {
            this.f32855g = new C7534a(f);
            return this;
        }

        public C7551b(C7549m mVar) {
            this.f32849a = mVar.f32837a;
            this.f32850b = mVar.f32838b;
            this.f32851c = mVar.f32839c;
            this.f32852d = mVar.f32840d;
            this.f32853e = mVar.f32841e;
            this.f32854f = mVar.f32842f;
            this.f32855g = mVar.f32843g;
            this.f32856h = mVar.f32844h;
            this.f32857i = mVar.f32845i;
            this.f32858j = mVar.f32846j;
            this.f32859k = mVar.f32847k;
            this.f32860l = mVar.f32848l;
        }
    }

    public C7549m() {
        this.f32837a = C7545i.m42136b();
        this.f32838b = C7545i.m42136b();
        this.f32839c = C7545i.m42136b();
        this.f32840d = C7545i.m42136b();
        this.f32841e = new C7534a(0.0f);
        this.f32842f = new C7534a(0.0f);
        this.f32843g = new C7534a(0.0f);
        this.f32844h = new C7534a(0.0f);
        this.f32845i = C7545i.m42137c();
        this.f32846j = C7545i.m42137c();
        this.f32847k = C7545i.m42137c();
        this.f32848l = C7545i.m42137c();
    }
}
