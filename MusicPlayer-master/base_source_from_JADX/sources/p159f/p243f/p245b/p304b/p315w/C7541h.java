package p159f.p243f.p245b.p304b.p315w;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.graphics.drawable.C0535b;
import java.util.BitSet;
import p082e.p109h.p118o.C3698d;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.p307o.C7513a;
import p159f.p243f.p245b.p304b.p309q.C7515a;
import p159f.p243f.p245b.p304b.p314v.C7532a;
import p159f.p243f.p245b.p304b.p315w.C7549m;
import p159f.p243f.p245b.p304b.p315w.C7553n;
import p159f.p243f.p245b.p304b.p315w.C7557o;

/* renamed from: f.f.b.b.w.h */
/* compiled from: MaterialShapeDrawable */
public class C7541h extends Drawable implements C0535b, C7565p {

    /* renamed from: C */
    private static final String f32784C = C7541h.class.getSimpleName();

    /* renamed from: D */
    private static final Paint f32785D = new Paint(1);

    /* renamed from: A */
    private final RectF f32786A;

    /* renamed from: B */
    private boolean f32787B;

    /* renamed from: g */
    private C7544c f32788g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C7557o.C7564g[] f32789h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C7557o.C7564g[] f32790i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final BitSet f32791j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f32792k;

    /* renamed from: l */
    private final Matrix f32793l;

    /* renamed from: m */
    private final Path f32794m;

    /* renamed from: n */
    private final Path f32795n;

    /* renamed from: o */
    private final RectF f32796o;

    /* renamed from: p */
    private final RectF f32797p;

    /* renamed from: q */
    private final Region f32798q;

    /* renamed from: r */
    private final Region f32799r;

    /* renamed from: s */
    private C7549m f32800s;

    /* renamed from: t */
    private final Paint f32801t;

    /* renamed from: u */
    private final Paint f32802u;

    /* renamed from: v */
    private final C7532a f32803v;

    /* renamed from: w */
    private final C7553n.C7555b f32804w;

    /* renamed from: x */
    private final C7553n f32805x;

    /* renamed from: y */
    private PorterDuffColorFilter f32806y;

    /* renamed from: z */
    private PorterDuffColorFilter f32807z;

    /* renamed from: f.f.b.b.w.h$a */
    /* compiled from: MaterialShapeDrawable */
    class C7542a implements C7553n.C7555b {
        C7542a() {
        }

        /* renamed from: a */
        public void mo28492a(C7557o oVar, Matrix matrix, int i) {
            C7541h.this.f32791j.set(i, oVar.mo28543e());
            C7541h.this.f32789h[i] = oVar.mo28544f(matrix);
        }

        /* renamed from: b */
        public void mo28493b(C7557o oVar, Matrix matrix, int i) {
            C7541h.this.f32791j.set(i + 4, oVar.mo28543e());
            C7541h.this.f32790i[i] = oVar.mo28544f(matrix);
        }
    }

    /* renamed from: f.f.b.b.w.h$b */
    /* compiled from: MaterialShapeDrawable */
    class C7543b implements C7549m.C7552c {

        /* renamed from: a */
        final /* synthetic */ float f32809a;

        C7543b(C7541h hVar, float f) {
            this.f32809a = f;
        }

        /* renamed from: a */
        public C7536c mo28494a(C7536c cVar) {
            return cVar instanceof C7547k ? cVar : new C7535b(this.f32809a, cVar);
        }
    }

    /* synthetic */ C7541h(C7544c cVar, C7542a aVar) {
        this(cVar);
    }

    /* renamed from: F */
    private float m42065F() {
        if (m42068O()) {
            return this.f32802u.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: M */
    private boolean m42066M() {
        C7544c cVar = this.f32788g;
        int i = cVar.f32826q;
        if (i == 1 || cVar.f32827r <= 0 || (i != 2 && !mo28459W())) {
            return false;
        }
        return true;
    }

    /* renamed from: N */
    private boolean m42067N() {
        Paint.Style style = this.f32788g.f32831v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* renamed from: O */
    private boolean m42068O() {
        Paint.Style style = this.f32788g.f32831v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f32802u.getStrokeWidth() > 0.0f;
    }

    /* renamed from: Q */
    private void m42069Q() {
        super.invalidateSelf();
    }

    /* renamed from: T */
    private void m42070T(Canvas canvas) {
        if (m42066M()) {
            canvas.save();
            m42072V(canvas);
            if (!this.f32787B) {
                m42083n(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f32786A.width() - ((float) getBounds().width()));
            int height = (int) (this.f32786A.height() - ((float) getBounds().height()));
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f32786A.width()) + (this.f32788g.f32827r * 2) + width, ((int) this.f32786A.height()) + (this.f32788g.f32827r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (float) ((getBounds().left - this.f32788g.f32827r) - width);
            float f2 = (float) ((getBounds().top - this.f32788g.f32827r) - height);
            canvas2.translate(-f, -f2);
            m42083n(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    /* renamed from: U */
    private static int m42071U(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    /* renamed from: V */
    private void m42072V(Canvas canvas) {
        int A = mo28445A();
        int B = mo28446B();
        if (Build.VERSION.SDK_INT < 21 && this.f32787B) {
            Rect clipBounds = canvas.getClipBounds();
            int i = this.f32788g.f32827r;
            clipBounds.inset(-i, -i);
            clipBounds.offset(A, B);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate((float) A, (float) B);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r2 = r2.getColor();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.PorterDuffColorFilter m42077f(android.graphics.Paint r2, boolean r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0014
            int r2 = r2.getColor()
            int r3 = r1.mo28479l(r2)
            if (r3 == r2) goto L_0x0014
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r0)
            return r2
        L_0x0014:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p243f.p245b.p304b.p315w.C7541h.m42077f(android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    /* renamed from: g */
    private void m42078g(RectF rectF, Path path) {
        mo28473h(rectF, path);
        if (this.f32788g.f32819j != 1.0f) {
            this.f32793l.reset();
            Matrix matrix = this.f32793l;
            float f = this.f32788g.f32819j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f32793l);
        }
        path.computeBounds(this.f32786A, true);
    }

    /* renamed from: i */
    private void m42079i() {
        C7549m y = mo28448D().mo28515y(new C7543b(this, -m42065F()));
        this.f32800s = y;
        this.f32805x.mo28539d(y, this.f32788g.f32820k, m42090v(), this.f32795n);
    }

    /* renamed from: j */
    private PorterDuffColorFilter m42080j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = mo28479l(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: k */
    private PorterDuffColorFilter m42081k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList == null || mode == null) {
            return m42077f(paint, z);
        }
        return m42080j(colorStateList, mode, z);
    }

    /* renamed from: m */
    public static C7541h m42082m(Context context, float f) {
        int c = C7513a.m41979c(context, C7490b.colorSurface, C7541h.class.getSimpleName());
        C7541h hVar = new C7541h();
        hVar.mo28456P(context);
        hVar.mo28463a0(ColorStateList.valueOf(c));
        hVar.mo28462Z(f);
        return hVar;
    }

    /* renamed from: n */
    private void m42083n(Canvas canvas) {
        if (this.f32791j.cardinality() > 0) {
            Log.w(f32784C, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f32788g.f32828s != 0) {
            canvas.drawPath(this.f32794m, this.f32803v.mo28435c());
        }
        for (int i = 0; i < 4; i++) {
            this.f32789h[i].mo28555b(this.f32803v, this.f32788g.f32827r, canvas);
            this.f32790i[i].mo28555b(this.f32803v, this.f32788g.f32827r, canvas);
        }
        if (this.f32787B) {
            int A = mo28445A();
            int B = mo28446B();
            canvas.translate((float) (-A), (float) (-B));
            canvas.drawPath(this.f32794m, f32785D);
            canvas.translate((float) A, (float) B);
        }
    }

    /* renamed from: n0 */
    private boolean m42084n0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f32788g.f32813d == null || (color2 = this.f32801t.getColor()) == (colorForState2 = this.f32788g.f32813d.getColorForState(iArr, color2))) {
            z = false;
        } else {
            this.f32801t.setColor(colorForState2);
            z = true;
        }
        if (this.f32788g.f32814e == null || (color = this.f32802u.getColor()) == (colorForState = this.f32788g.f32814e.getColorForState(iArr, color))) {
            return z;
        }
        this.f32802u.setColor(colorForState);
        return true;
    }

    /* renamed from: o */
    private void m42085o(Canvas canvas) {
        m42088q(canvas, this.f32801t, this.f32794m, this.f32788g.f32810a, mo28487u());
    }

    /* renamed from: o0 */
    private boolean m42086o0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f32806y;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f32807z;
        C7544c cVar = this.f32788g;
        this.f32806y = m42081k(cVar.f32816g, cVar.f32817h, this.f32801t, true);
        C7544c cVar2 = this.f32788g;
        this.f32807z = m42081k(cVar2.f32815f, cVar2.f32817h, this.f32802u, false);
        C7544c cVar3 = this.f32788g;
        if (cVar3.f32830u) {
            this.f32803v.mo28436d(cVar3.f32816g.getColorForState(getState(), 0));
        }
        if (!C3698d.m15814a(porterDuffColorFilter, this.f32806y) || !C3698d.m15814a(porterDuffColorFilter2, this.f32807z)) {
            return true;
        }
        return false;
    }

    /* renamed from: p0 */
    private void m42087p0() {
        float L = mo28455L();
        this.f32788g.f32827r = (int) Math.ceil((double) (0.75f * L));
        this.f32788g.f32828s = (int) Math.ceil((double) (L * 0.25f));
        m42086o0();
        m42069Q();
    }

    /* renamed from: q */
    private void m42088q(Canvas canvas, Paint paint, Path path, C7549m mVar, RectF rectF) {
        if (mVar.mo28511u(rectF)) {
            float a = mVar.mo28510t().mo28437a(rectF) * this.f32788g.f32820k;
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: r */
    private void m42089r(Canvas canvas) {
        m42088q(canvas, this.f32802u, this.f32795n, this.f32800s, m42090v());
    }

    /* renamed from: v */
    private RectF m42090v() {
        this.f32797p.set(mo28487u());
        float F = m42065F();
        this.f32797p.inset(F, F);
        return this.f32797p;
    }

    /* renamed from: A */
    public int mo28445A() {
        C7544c cVar = this.f32788g;
        return (int) (((double) cVar.f32828s) * Math.sin(Math.toRadians((double) cVar.f32829t)));
    }

    /* renamed from: B */
    public int mo28446B() {
        C7544c cVar = this.f32788g;
        return (int) (((double) cVar.f32828s) * Math.cos(Math.toRadians((double) cVar.f32829t)));
    }

    /* renamed from: C */
    public int mo28447C() {
        return this.f32788g.f32827r;
    }

    /* renamed from: D */
    public C7549m mo28448D() {
        return this.f32788g.f32810a;
    }

    /* renamed from: E */
    public ColorStateList mo28449E() {
        return this.f32788g.f32814e;
    }

    /* renamed from: G */
    public float mo28450G() {
        return this.f32788g.f32821l;
    }

    /* renamed from: H */
    public ColorStateList mo28451H() {
        return this.f32788g.f32816g;
    }

    /* renamed from: I */
    public float mo28452I() {
        return this.f32788g.f32810a.mo28508r().mo28437a(mo28487u());
    }

    /* renamed from: J */
    public float mo28453J() {
        return this.f32788g.f32810a.mo28510t().mo28437a(mo28487u());
    }

    /* renamed from: K */
    public float mo28454K() {
        return this.f32788g.f32825p;
    }

    /* renamed from: L */
    public float mo28455L() {
        return mo28488w() + mo28454K();
    }

    /* renamed from: P */
    public void mo28456P(Context context) {
        this.f32788g.f32811b = new C7515a(context);
        m42087p0();
    }

    /* renamed from: R */
    public boolean mo28457R() {
        C7515a aVar = this.f32788g.f32811b;
        return aVar != null && aVar.mo28406e();
    }

    /* renamed from: S */
    public boolean mo28458S() {
        return this.f32788g.f32810a.mo28511u(mo28487u());
    }

    /* renamed from: W */
    public boolean mo28459W() {
        int i = Build.VERSION.SDK_INT;
        return i < 21 || (!mo28458S() && !this.f32794m.isConvex() && i < 29);
    }

    /* renamed from: X */
    public void mo28460X(float f) {
        setShapeAppearanceModel(this.f32788g.f32810a.mo28513w(f));
    }

    /* renamed from: Y */
    public void mo28461Y(C7536c cVar) {
        setShapeAppearanceModel(this.f32788g.f32810a.mo28514x(cVar));
    }

    /* renamed from: Z */
    public void mo28462Z(float f) {
        C7544c cVar = this.f32788g;
        if (cVar.f32824o != f) {
            cVar.f32824o = f;
            m42087p0();
        }
    }

    /* renamed from: a0 */
    public void mo28463a0(ColorStateList colorStateList) {
        C7544c cVar = this.f32788g;
        if (cVar.f32813d != colorStateList) {
            cVar.f32813d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: b0 */
    public void mo28464b0(float f) {
        C7544c cVar = this.f32788g;
        if (cVar.f32820k != f) {
            cVar.f32820k = f;
            this.f32792k = true;
            invalidateSelf();
        }
    }

    /* renamed from: c0 */
    public void mo28465c0(int i, int i2, int i3, int i4) {
        C7544c cVar = this.f32788g;
        if (cVar.f32818i == null) {
            cVar.f32818i = new Rect();
        }
        this.f32788g.f32818i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    /* renamed from: d0 */
    public void mo28466d0(Paint.Style style) {
        this.f32788g.f32831v = style;
        m42069Q();
    }

    public void draw(Canvas canvas) {
        this.f32801t.setColorFilter(this.f32806y);
        int alpha = this.f32801t.getAlpha();
        this.f32801t.setAlpha(m42071U(alpha, this.f32788g.f32822m));
        this.f32802u.setColorFilter(this.f32807z);
        this.f32802u.setStrokeWidth(this.f32788g.f32821l);
        int alpha2 = this.f32802u.getAlpha();
        this.f32802u.setAlpha(m42071U(alpha2, this.f32788g.f32822m));
        if (this.f32792k) {
            m42079i();
            m42078g(mo28487u(), this.f32794m);
            this.f32792k = false;
        }
        m42070T(canvas);
        if (m42067N()) {
            m42085o(canvas);
        }
        if (m42068O()) {
            m42089r(canvas);
        }
        this.f32801t.setAlpha(alpha);
        this.f32802u.setAlpha(alpha2);
    }

    /* renamed from: e0 */
    public void mo28467e0(float f) {
        C7544c cVar = this.f32788g;
        if (cVar.f32823n != f) {
            cVar.f32823n = f;
            m42087p0();
        }
    }

    /* renamed from: f0 */
    public void mo28468f0(boolean z) {
        this.f32787B = z;
    }

    /* renamed from: g0 */
    public void mo28469g0(int i) {
        this.f32803v.mo28436d(i);
        this.f32788g.f32830u = false;
        m42069Q();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f32788g;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f32788g.f32826q != 2) {
            if (mo28458S()) {
                outline.setRoundRect(getBounds(), mo28452I() * this.f32788g.f32820k);
                return;
            }
            m42078g(mo28487u(), this.f32794m);
            if (this.f32794m.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.f32794m);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f32788g.f32818i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.f32798q.set(getBounds());
        m42078g(mo28487u(), this.f32794m);
        this.f32799r.setPath(this.f32794m, this.f32798q);
        this.f32798q.op(this.f32799r, Region.Op.DIFFERENCE);
        return this.f32798q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo28473h(RectF rectF, Path path) {
        C7553n nVar = this.f32805x;
        C7544c cVar = this.f32788g;
        C7549m mVar = cVar.f32810a;
        float f = cVar.f32820k;
        nVar.mo28540e(mVar, f, rectF, this.f32804w, path);
    }

    /* renamed from: h0 */
    public void mo28474h0(int i) {
        C7544c cVar = this.f32788g;
        if (cVar.f32829t != i) {
            cVar.f32829t = i;
            m42069Q();
        }
    }

    /* renamed from: i0 */
    public void mo28475i0(int i) {
        C7544c cVar = this.f32788g;
        if (cVar.f32826q != i) {
            cVar.f32826q = i;
            m42069Q();
        }
    }

    public void invalidateSelf() {
        this.f32792k = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.f32788g.f32814e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.f32788g.f32813d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f32788g.f32816g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f32788g.f32815f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            f.f.b.b.w.h$c r0 = r1.f32788g
            android.content.res.ColorStateList r0 = r0.f32816g
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            f.f.b.b.w.h$c r0 = r1.f32788g
            android.content.res.ColorStateList r0 = r0.f32815f
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            f.f.b.b.w.h$c r0 = r1.f32788g
            android.content.res.ColorStateList r0 = r0.f32814e
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            f.f.b.b.w.h$c r0 = r1.f32788g
            android.content.res.ColorStateList r0 = r0.f32813d
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p243f.p245b.p304b.p315w.C7541h.isStateful():boolean");
    }

    /* renamed from: j0 */
    public void mo28477j0(float f, int i) {
        mo28481m0(f);
        mo28480l0(ColorStateList.valueOf(i));
    }

    /* renamed from: k0 */
    public void mo28478k0(float f, ColorStateList colorStateList) {
        mo28481m0(f);
        mo28480l0(colorStateList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public int mo28479l(int i) {
        float L = mo28455L() + mo28491z();
        C7515a aVar = this.f32788g.f32811b;
        return aVar != null ? aVar.mo28404c(i, L) : i;
    }

    /* renamed from: l0 */
    public void mo28480l0(ColorStateList colorStateList) {
        C7544c cVar = this.f32788g;
        if (cVar.f32814e != colorStateList) {
            cVar.f32814e = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: m0 */
    public void mo28481m0(float f) {
        this.f32788g.f32821l = f;
        invalidateSelf();
    }

    public Drawable mutate() {
        this.f32788g = new C7544c(this.f32788g);
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f32792k = true;
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z = m42084n0(iArr) || m42086o0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo28484p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m42088q(canvas, paint, path, this.f32788g.f32810a, rectF);
    }

    /* renamed from: s */
    public float mo28485s() {
        return this.f32788g.f32810a.mo28501j().mo28437a(mo28487u());
    }

    public void setAlpha(int i) {
        C7544c cVar = this.f32788g;
        if (cVar.f32822m != i) {
            cVar.f32822m = i;
            m42069Q();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f32788g.f32812c = colorFilter;
        m42069Q();
    }

    public void setShapeAppearanceModel(C7549m mVar) {
        this.f32788g.f32810a = mVar;
        invalidateSelf();
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f32788g.f32816g = colorStateList;
        m42086o0();
        m42069Q();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C7544c cVar = this.f32788g;
        if (cVar.f32817h != mode) {
            cVar.f32817h = mode;
            m42086o0();
            m42069Q();
        }
    }

    /* renamed from: t */
    public float mo28486t() {
        return this.f32788g.f32810a.mo28503l().mo28437a(mo28487u());
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public RectF mo28487u() {
        this.f32796o.set(getBounds());
        return this.f32796o;
    }

    /* renamed from: w */
    public float mo28488w() {
        return this.f32788g.f32824o;
    }

    /* renamed from: x */
    public ColorStateList mo28489x() {
        return this.f32788g.f32813d;
    }

    /* renamed from: y */
    public float mo28490y() {
        return this.f32788g.f32820k;
    }

    /* renamed from: z */
    public float mo28491z() {
        return this.f32788g.f32823n;
    }

    public C7541h() {
        this(new C7549m());
    }

    public C7541h(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C7549m.m42149e(context, attributeSet, i, i2).mo28526m());
    }

    public C7541h(C7549m mVar) {
        this(new C7544c(mVar, (C7515a) null));
    }

    private C7541h(C7544c cVar) {
        this.f32789h = new C7557o.C7564g[4];
        this.f32790i = new C7557o.C7564g[4];
        this.f32791j = new BitSet(8);
        this.f32793l = new Matrix();
        this.f32794m = new Path();
        this.f32795n = new Path();
        this.f32796o = new RectF();
        this.f32797p = new RectF();
        this.f32798q = new Region();
        this.f32799r = new Region();
        Paint paint = new Paint(1);
        this.f32801t = paint;
        Paint paint2 = new Paint(1);
        this.f32802u = paint2;
        this.f32803v = new C7532a();
        this.f32805x = Looper.getMainLooper().getThread() == Thread.currentThread() ? C7553n.m42215k() : new C7553n();
        this.f32786A = new RectF();
        this.f32787B = true;
        this.f32788g = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f32785D;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m42086o0();
        m42084n0(getState());
        this.f32804w = new C7542a();
    }

    /* renamed from: f.f.b.b.w.h$c */
    /* compiled from: MaterialShapeDrawable */
    static final class C7544c extends Drawable.ConstantState {

        /* renamed from: a */
        public C7549m f32810a;

        /* renamed from: b */
        public C7515a f32811b;

        /* renamed from: c */
        public ColorFilter f32812c;

        /* renamed from: d */
        public ColorStateList f32813d = null;

        /* renamed from: e */
        public ColorStateList f32814e = null;

        /* renamed from: f */
        public ColorStateList f32815f = null;

        /* renamed from: g */
        public ColorStateList f32816g = null;

        /* renamed from: h */
        public PorterDuff.Mode f32817h = PorterDuff.Mode.SRC_IN;

        /* renamed from: i */
        public Rect f32818i = null;

        /* renamed from: j */
        public float f32819j = 1.0f;

        /* renamed from: k */
        public float f32820k = 1.0f;

        /* renamed from: l */
        public float f32821l;

        /* renamed from: m */
        public int f32822m = 255;

        /* renamed from: n */
        public float f32823n = 0.0f;

        /* renamed from: o */
        public float f32824o = 0.0f;

        /* renamed from: p */
        public float f32825p = 0.0f;

        /* renamed from: q */
        public int f32826q = 0;

        /* renamed from: r */
        public int f32827r = 0;

        /* renamed from: s */
        public int f32828s = 0;

        /* renamed from: t */
        public int f32829t = 0;

        /* renamed from: u */
        public boolean f32830u = false;

        /* renamed from: v */
        public Paint.Style f32831v = Paint.Style.FILL_AND_STROKE;

        public C7544c(C7549m mVar, C7515a aVar) {
            this.f32810a = mVar;
            this.f32811b = aVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            C7541h hVar = new C7541h(this, (C7542a) null);
            boolean unused = hVar.f32792k = true;
            return hVar;
        }

        public C7544c(C7544c cVar) {
            this.f32810a = cVar.f32810a;
            this.f32811b = cVar.f32811b;
            this.f32821l = cVar.f32821l;
            this.f32812c = cVar.f32812c;
            this.f32813d = cVar.f32813d;
            this.f32814e = cVar.f32814e;
            this.f32817h = cVar.f32817h;
            this.f32816g = cVar.f32816g;
            this.f32822m = cVar.f32822m;
            this.f32819j = cVar.f32819j;
            this.f32828s = cVar.f32828s;
            this.f32826q = cVar.f32826q;
            this.f32830u = cVar.f32830u;
            this.f32820k = cVar.f32820k;
            this.f32823n = cVar.f32823n;
            this.f32824o = cVar.f32824o;
            this.f32825p = cVar.f32825p;
            this.f32827r = cVar.f32827r;
            this.f32829t = cVar.f32829t;
            this.f32815f = cVar.f32815f;
            this.f32831v = cVar.f32831v;
            if (cVar.f32818i != null) {
                this.f32818i = new Rect(cVar.f32818i);
            }
        }
    }
}
