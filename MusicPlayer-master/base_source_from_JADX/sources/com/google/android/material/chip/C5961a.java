package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0534a;
import androidx.core.graphics.drawable.C0535b;
import com.google.android.material.internal.C6087j;
import com.google.android.material.internal.C6093m;
import com.google.android.material.internal.C6100s;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p082e.p083a.p084k.p085a.C3410a;
import p082e.p109h.p110h.C3621a;
import p082e.p109h.p117n.C3679a;
import p159f.p243f.p245b.p304b.C7500l;
import p159f.p243f.p245b.p304b.p305m.C7508h;
import p159f.p243f.p245b.p304b.p306n.C7512a;
import p159f.p243f.p245b.p304b.p308p.C7514a;
import p159f.p243f.p245b.p304b.p312t.C7522c;
import p159f.p243f.p245b.p304b.p312t.C7523d;
import p159f.p243f.p245b.p304b.p313u.C7531b;
import p159f.p243f.p245b.p304b.p315w.C7541h;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.material.chip.a */
/* compiled from: ChipDrawable */
public class C5961a extends C7541h implements C0535b, Drawable.Callback, C6087j.C6089b {

    /* renamed from: O0 */
    private static final int[] f28023O0 = {16842910};

    /* renamed from: P0 */
    private static final ShapeDrawable f28024P0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0 */
    private int f28025A0;

    /* renamed from: B0 */
    private int f28026B0 = 255;

    /* renamed from: C0 */
    private ColorFilter f28027C0;

    /* renamed from: D0 */
    private PorterDuffColorFilter f28028D0;

    /* renamed from: E */
    private ColorStateList f28029E;

    /* renamed from: E0 */
    private ColorStateList f28030E0;

    /* renamed from: F */
    private ColorStateList f28031F;

    /* renamed from: F0 */
    private PorterDuff.Mode f28032F0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: G */
    private float f28033G;

    /* renamed from: G0 */
    private int[] f28034G0;

    /* renamed from: H */
    private float f28035H = -1.0f;

    /* renamed from: H0 */
    private boolean f28036H0;

    /* renamed from: I */
    private ColorStateList f28037I;

    /* renamed from: I0 */
    private ColorStateList f28038I0;

    /* renamed from: J */
    private float f28039J;

    /* renamed from: J0 */
    private WeakReference<C5962a> f28040J0 = new WeakReference<>((Object) null);

    /* renamed from: K */
    private ColorStateList f28041K;

    /* renamed from: K0 */
    private TextUtils.TruncateAt f28042K0;

    /* renamed from: L */
    private CharSequence f28043L;

    /* renamed from: L0 */
    private boolean f28044L0;

    /* renamed from: M */
    private boolean f28045M;

    /* renamed from: M0 */
    private int f28046M0;

    /* renamed from: N */
    private Drawable f28047N;

    /* renamed from: N0 */
    private boolean f28048N0;

    /* renamed from: O */
    private ColorStateList f28049O;

    /* renamed from: P */
    private float f28050P;

    /* renamed from: Q */
    private boolean f28051Q;

    /* renamed from: R */
    private boolean f28052R;

    /* renamed from: S */
    private Drawable f28053S;

    /* renamed from: T */
    private Drawable f28054T;

    /* renamed from: U */
    private ColorStateList f28055U;

    /* renamed from: V */
    private float f28056V;

    /* renamed from: W */
    private CharSequence f28057W;

    /* renamed from: X */
    private boolean f28058X;

    /* renamed from: Y */
    private boolean f28059Y;

    /* renamed from: Z */
    private Drawable f28060Z;

    /* renamed from: a0 */
    private ColorStateList f28061a0;

    /* renamed from: b0 */
    private C7508h f28062b0;

    /* renamed from: c0 */
    private C7508h f28063c0;

    /* renamed from: d0 */
    private float f28064d0;

    /* renamed from: e0 */
    private float f28065e0;

    /* renamed from: f0 */
    private float f28066f0;

    /* renamed from: g0 */
    private float f28067g0;

    /* renamed from: h0 */
    private float f28068h0;

    /* renamed from: i0 */
    private float f28069i0;

    /* renamed from: j0 */
    private float f28070j0;

    /* renamed from: k0 */
    private float f28071k0;

    /* renamed from: l0 */
    private final Context f28072l0;

    /* renamed from: m0 */
    private final Paint f28073m0 = new Paint(1);

    /* renamed from: n0 */
    private final Paint f28074n0;

    /* renamed from: o0 */
    private final Paint.FontMetrics f28075o0 = new Paint.FontMetrics();

    /* renamed from: p0 */
    private final RectF f28076p0 = new RectF();

    /* renamed from: q0 */
    private final PointF f28077q0 = new PointF();

    /* renamed from: r0 */
    private final Path f28078r0 = new Path();

    /* renamed from: s0 */
    private final C6087j f28079s0;

    /* renamed from: t0 */
    private int f28080t0;

    /* renamed from: u0 */
    private int f28081u0;

    /* renamed from: v0 */
    private int f28082v0;

    /* renamed from: w0 */
    private int f28083w0;

    /* renamed from: x0 */
    private int f28084x0;

    /* renamed from: y0 */
    private int f28085y0;

    /* renamed from: z0 */
    private boolean f28086z0;

    /* renamed from: com.google.android.material.chip.a$a */
    /* compiled from: ChipDrawable */
    public interface C5962a {
        /* renamed from: a */
        void mo23279a();
    }

    private C5961a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo28456P(context);
        this.f28072l0 = context;
        C6087j jVar = new C6087j(this);
        this.f28079s0 = jVar;
        this.f28043L = BuildConfig.FLAVOR;
        jVar.mo24216e().density = context.getResources().getDisplayMetrics().density;
        this.f28074n0 = null;
        int[] iArr = f28023O0;
        setState(iArr);
        mo23560r2(iArr);
        this.f28044L0 = true;
        if (C7531b.f32755a) {
            f28024P0.setTint(-1);
        }
    }

    /* renamed from: A0 */
    private boolean m35771A0() {
        return this.f28059Y && this.f28060Z != null && this.f28058X;
    }

    /* renamed from: A1 */
    private void m35772A1(AttributeSet attributeSet, int i, int i2) {
        TypedArray h = C6093m.m36563h(this.f28072l0, attributeSet, C7500l.Chip, i, i2, new int[0]);
        this.f28048N0 = h.hasValue(C7500l.Chip_shapeAppearance);
        m35792h2(C7522c.m42014a(this.f28072l0, h, C7500l.Chip_chipSurfaceColor));
        mo23482L1(C7522c.m42014a(this.f28072l0, h, C7500l.Chip_chipBackgroundColor));
        mo23517Z1(h.getDimension(C7500l.Chip_chipMinHeight, 0.0f));
        int i3 = C7500l.Chip_chipCornerRadius;
        if (h.hasValue(i3)) {
            mo23488N1(h.getDimension(i3, 0.0f));
        }
        mo23525d2(C7522c.m42014a(this.f28072l0, h, C7500l.Chip_chipStrokeColor));
        mo23529f2(h.getDimension(C7500l.Chip_chipStrokeWidth, 0.0f));
        mo23468E2(C7522c.m42014a(this.f28072l0, h, C7500l.Chip_rippleColor));
        mo23478J2(h.getText(C7500l.Chip_android_text));
        C7523d f = C7522c.m42019f(this.f28072l0, h, C7500l.Chip_android_textAppearance);
        f.f32742k = h.getDimension(C7500l.Chip_android_textSize, f.f32742k);
        mo23480K2(f);
        int i4 = h.getInt(C7500l.Chip_android_ellipsize, 0);
        if (i4 == 1) {
            mo23576w2(TextUtils.TruncateAt.START);
        } else if (i4 == 2) {
            mo23576w2(TextUtils.TruncateAt.MIDDLE);
        } else if (i4 == 3) {
            mo23576w2(TextUtils.TruncateAt.END);
        }
        mo23515Y1(h.getBoolean(C7500l.Chip_chipIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
            mo23515Y1(h.getBoolean(C7500l.Chip_chipIconEnabled, false));
        }
        mo23500R1(C7522c.m42017d(this.f28072l0, h, C7500l.Chip_chipIcon));
        int i5 = C7500l.Chip_chipIconTint;
        if (h.hasValue(i5)) {
            mo23509V1(C7522c.m42014a(this.f28072l0, h, i5));
        }
        mo23505T1(h.getDimension(C7500l.Chip_chipIconSize, -1.0f));
        mo23570u2(h.getBoolean(C7500l.Chip_closeIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
            mo23570u2(h.getBoolean(C7500l.Chip_closeIconEnabled, false));
        }
        mo23539i2(C7522c.m42017d(this.f28072l0, h, C7500l.Chip_closeIcon));
        mo23563s2(C7522c.m42014a(this.f28072l0, h, C7500l.Chip_closeIconTint));
        mo23551n2(h.getDimension(C7500l.Chip_closeIconSize, 0.0f));
        mo23465D1(h.getBoolean(C7500l.Chip_android_checkable, false));
        mo23479K1(h.getBoolean(C7500l.Chip_checkedIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
            mo23479K1(h.getBoolean(C7500l.Chip_checkedIconEnabled, false));
        }
        mo23469F1(C7522c.m42017d(this.f28072l0, h, C7500l.Chip_checkedIcon));
        int i6 = C7500l.Chip_checkedIconTint;
        if (h.hasValue(i6)) {
            mo23473H1(C7522c.m42014a(this.f28072l0, h, i6));
        }
        mo23474H2(C7508h.m41955c(this.f28072l0, h, C7500l.Chip_showMotionSpec));
        mo23577x2(C7508h.m41955c(this.f28072l0, h, C7500l.Chip_hideMotionSpec));
        mo23521b2(h.getDimension(C7500l.Chip_chipStartPadding, 0.0f));
        mo23463B2(h.getDimension(C7500l.Chip_iconStartPadding, 0.0f));
        mo23580z2(h.getDimension(C7500l.Chip_iconEndPadding, 0.0f));
        mo23492O2(h.getDimension(C7500l.Chip_textStartPadding, 0.0f));
        mo23486M2(h.getDimension(C7500l.Chip_textEndPadding, 0.0f));
        mo23557p2(h.getDimension(C7500l.Chip_closeIconStartPadding, 0.0f));
        mo23545k2(h.getDimension(C7500l.Chip_closeIconEndPadding, 0.0f));
        mo23494P1(h.getDimension(C7500l.Chip_chipEndPadding, 0.0f));
        mo23466D2(h.getDimensionPixelSize(C7500l.Chip_android_maxWidth, Integer.MAX_VALUE));
        h.recycle();
    }

    /* renamed from: B0 */
    public static C5961a m35773B0(Context context, AttributeSet attributeSet, int i, int i2) {
        C5961a aVar = new C5961a(context, attributeSet, i, i2);
        aVar.m35772A1(attributeSet, i, i2);
        return aVar;
    }

    /* renamed from: C0 */
    private void m35774C0(Canvas canvas, Rect rect) {
        if (m35784S2()) {
            m35794r0(rect, this.f28076p0);
            RectF rectF = this.f28076p0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f28060Z.setBounds(0, 0, (int) this.f28076p0.width(), (int) this.f28076p0.height());
            this.f28060Z.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0152  */
    /* renamed from: C1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m35775C1(int[] r7, int[] r8) {
        /*
            r6 = this;
            boolean r0 = super.onStateChange(r7)
            android.content.res.ColorStateList r1 = r6.f28029E
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r6.f28080t0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r1 = r6.mo28479l(r1)
            int r3 = r6.f28080t0
            r4 = 1
            if (r3 == r1) goto L_0x001d
            r6.f28080t0 = r1
            r0 = 1
        L_0x001d:
            android.content.res.ColorStateList r3 = r6.f28031F
            if (r3 == 0) goto L_0x0028
            int r5 = r6.f28081u0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            int r3 = r6.mo28479l(r3)
            int r5 = r6.f28081u0
            if (r5 == r3) goto L_0x0034
            r6.f28081u0 = r3
            r0 = 1
        L_0x0034:
            int r1 = p159f.p243f.p245b.p304b.p307o.C7513a.m41982f(r1, r3)
            int r3 = r6.f28082v0
            if (r3 == r1) goto L_0x003e
            r3 = 1
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            android.content.res.ColorStateList r5 = r6.mo28489x()
            if (r5 != 0) goto L_0x0047
            r5 = 1
            goto L_0x0048
        L_0x0047:
            r5 = 0
        L_0x0048:
            r3 = r3 | r5
            if (r3 == 0) goto L_0x0055
            r6.f28082v0 = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r6.mo28463a0(r0)
            r0 = 1
        L_0x0055:
            android.content.res.ColorStateList r1 = r6.f28037I
            if (r1 == 0) goto L_0x0060
            int r3 = r6.f28083w0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0061
        L_0x0060:
            r1 = 0
        L_0x0061:
            int r3 = r6.f28083w0
            if (r3 == r1) goto L_0x0068
            r6.f28083w0 = r1
            r0 = 1
        L_0x0068:
            android.content.res.ColorStateList r1 = r6.f28038I0
            if (r1 == 0) goto L_0x007b
            boolean r1 = p159f.p243f.p245b.p304b.p313u.C7531b.m42047e(r7)
            if (r1 == 0) goto L_0x007b
            android.content.res.ColorStateList r1 = r6.f28038I0
            int r3 = r6.f28084x0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x007c
        L_0x007b:
            r1 = 0
        L_0x007c:
            int r3 = r6.f28084x0
            if (r3 == r1) goto L_0x0087
            r6.f28084x0 = r1
            boolean r1 = r6.f28036H0
            if (r1 == 0) goto L_0x0087
            r0 = 1
        L_0x0087:
            com.google.android.material.internal.j r1 = r6.f28079s0
            f.f.b.b.t.d r1 = r1.mo24215d()
            if (r1 == 0) goto L_0x00a8
            com.google.android.material.internal.j r1 = r6.f28079s0
            f.f.b.b.t.d r1 = r1.mo24215d()
            android.content.res.ColorStateList r1 = r1.f32732a
            if (r1 == 0) goto L_0x00a8
            com.google.android.material.internal.j r1 = r6.f28079s0
            f.f.b.b.t.d r1 = r1.mo24215d()
            android.content.res.ColorStateList r1 = r1.f32732a
            int r3 = r6.f28085y0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x00a9
        L_0x00a8:
            r1 = 0
        L_0x00a9:
            int r3 = r6.f28085y0
            if (r3 == r1) goto L_0x00b0
            r6.f28085y0 = r1
            r0 = 1
        L_0x00b0:
            int[] r1 = r6.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            boolean r1 = m35797t1(r1, r3)
            if (r1 == 0) goto L_0x00c3
            boolean r1 = r6.f28058X
            if (r1 == 0) goto L_0x00c3
            r1 = 1
            goto L_0x00c4
        L_0x00c3:
            r1 = 0
        L_0x00c4:
            boolean r3 = r6.f28086z0
            if (r3 == r1) goto L_0x00de
            android.graphics.drawable.Drawable r3 = r6.f28060Z
            if (r3 == 0) goto L_0x00de
            float r0 = r6.mo23561s0()
            r6.f28086z0 = r1
            float r1 = r6.mo23561s0()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00dd
            r0 = 1
            r1 = 1
            goto L_0x00df
        L_0x00dd:
            r0 = 1
        L_0x00de:
            r1 = 0
        L_0x00df:
            android.content.res.ColorStateList r3 = r6.f28030E0
            if (r3 == 0) goto L_0x00ea
            int r5 = r6.f28025A0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x00eb
        L_0x00ea:
            r3 = 0
        L_0x00eb:
            int r5 = r6.f28025A0
            if (r5 == r3) goto L_0x00fc
            r6.f28025A0 = r3
            android.content.res.ColorStateList r0 = r6.f28030E0
            android.graphics.PorterDuff$Mode r3 = r6.f28032F0
            android.graphics.PorterDuffColorFilter r0 = p159f.p243f.p245b.p304b.p308p.C7514a.m41986b(r6, r0, r3)
            r6.f28028D0 = r0
            goto L_0x00fd
        L_0x00fc:
            r4 = r0
        L_0x00fd:
            android.graphics.drawable.Drawable r0 = r6.f28047N
            boolean r0 = m35803y1(r0)
            if (r0 == 0) goto L_0x010c
            android.graphics.drawable.Drawable r0 = r6.f28047N
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x010c:
            android.graphics.drawable.Drawable r0 = r6.f28060Z
            boolean r0 = m35803y1(r0)
            if (r0 == 0) goto L_0x011b
            android.graphics.drawable.Drawable r0 = r6.f28060Z
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x011b:
            android.graphics.drawable.Drawable r0 = r6.f28053S
            boolean r0 = m35803y1(r0)
            if (r0 == 0) goto L_0x0138
            int r0 = r7.length
            int r3 = r8.length
            int r0 = r0 + r3
            int[] r0 = new int[r0]
            int r3 = r7.length
            java.lang.System.arraycopy(r7, r2, r0, r2, r3)
            int r7 = r7.length
            int r3 = r8.length
            java.lang.System.arraycopy(r8, r2, r0, r7, r3)
            android.graphics.drawable.Drawable r7 = r6.f28053S
            boolean r7 = r7.setState(r0)
            r4 = r4 | r7
        L_0x0138:
            boolean r7 = p159f.p243f.p245b.p304b.p313u.C7531b.f32755a
            if (r7 == 0) goto L_0x014b
            android.graphics.drawable.Drawable r7 = r6.f28054T
            boolean r7 = m35803y1(r7)
            if (r7 == 0) goto L_0x014b
            android.graphics.drawable.Drawable r7 = r6.f28054T
            boolean r7 = r7.setState(r8)
            r4 = r4 | r7
        L_0x014b:
            if (r4 == 0) goto L_0x0150
            r6.invalidateSelf()
        L_0x0150:
            if (r1 == 0) goto L_0x0155
            r6.mo23462B1()
        L_0x0155:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C5961a.m35775C1(int[], int[]):boolean");
    }

    /* renamed from: D0 */
    private void m35776D0(Canvas canvas, Rect rect) {
        if (!this.f28048N0) {
            this.f28073m0.setColor(this.f28081u0);
            this.f28073m0.setStyle(Paint.Style.FILL);
            this.f28073m0.setColorFilter(m35795r1());
            this.f28076p0.set(rect);
            canvas.drawRoundRect(this.f28076p0, mo23490O0(), mo23490O0(), this.f28073m0);
        }
    }

    /* renamed from: E0 */
    private void m35777E0(Canvas canvas, Rect rect) {
        if (m35785T2()) {
            m35794r0(rect, this.f28076p0);
            RectF rectF = this.f28076p0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f28047N.setBounds(0, 0, (int) this.f28076p0.width(), (int) this.f28076p0.height());
            this.f28047N.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: F0 */
    private void m35778F0(Canvas canvas, Rect rect) {
        if (this.f28039J > 0.0f && !this.f28048N0) {
            this.f28073m0.setColor(this.f28083w0);
            this.f28073m0.setStyle(Paint.Style.STROKE);
            if (!this.f28048N0) {
                this.f28073m0.setColorFilter(m35795r1());
            }
            RectF rectF = this.f28076p0;
            float f = this.f28039J;
            rectF.set(((float) rect.left) + (f / 2.0f), ((float) rect.top) + (f / 2.0f), ((float) rect.right) - (f / 2.0f), ((float) rect.bottom) - (f / 2.0f));
            float f2 = this.f28035H - (this.f28039J / 2.0f);
            canvas.drawRoundRect(this.f28076p0, f2, f2, this.f28073m0);
        }
    }

    /* renamed from: G0 */
    private void m35779G0(Canvas canvas, Rect rect) {
        if (!this.f28048N0) {
            this.f28073m0.setColor(this.f28080t0);
            this.f28073m0.setStyle(Paint.Style.FILL);
            this.f28076p0.set(rect);
            canvas.drawRoundRect(this.f28076p0, mo23490O0(), mo23490O0(), this.f28073m0);
        }
    }

    /* renamed from: H0 */
    private void m35780H0(Canvas canvas, Rect rect) {
        if (m35786U2()) {
            m35798u0(rect, this.f28076p0);
            RectF rectF = this.f28076p0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f28053S.setBounds(0, 0, (int) this.f28076p0.width(), (int) this.f28076p0.height());
            if (C7531b.f32755a) {
                this.f28054T.setBounds(this.f28053S.getBounds());
                this.f28054T.jumpToCurrentState();
                this.f28054T.draw(canvas);
            } else {
                this.f28053S.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: I0 */
    private void m35781I0(Canvas canvas, Rect rect) {
        this.f28073m0.setColor(this.f28084x0);
        this.f28073m0.setStyle(Paint.Style.FILL);
        this.f28076p0.set(rect);
        if (!this.f28048N0) {
            canvas.drawRoundRect(this.f28076p0, mo23490O0(), mo23490O0(), this.f28073m0);
            return;
        }
        mo28473h(new RectF(rect), this.f28078r0);
        super.mo28484p(canvas, this.f28073m0, this.f28078r0, mo28487u());
    }

    /* renamed from: J0 */
    private void m35782J0(Canvas canvas, Rect rect) {
        Paint paint = this.f28074n0;
        if (paint != null) {
            paint.setColor(C3621a.m15595m(-16777216, 127));
            canvas.drawRect(rect, this.f28074n0);
            if (m35785T2() || m35784S2()) {
                m35794r0(rect, this.f28076p0);
                canvas.drawRect(this.f28076p0, this.f28074n0);
            }
            if (this.f28043L != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f28074n0);
            }
            if (m35786U2()) {
                m35798u0(rect, this.f28076p0);
                canvas.drawRect(this.f28076p0, this.f28074n0);
            }
            this.f28074n0.setColor(C3621a.m15595m(-65536, 127));
            m35796t0(rect, this.f28076p0);
            canvas.drawRect(this.f28076p0, this.f28074n0);
            this.f28074n0.setColor(C3621a.m15595m(-16711936, 127));
            m35799v0(rect, this.f28076p0);
            canvas.drawRect(this.f28076p0, this.f28074n0);
        }
    }

    /* renamed from: K0 */
    private void m35783K0(Canvas canvas, Rect rect) {
        if (this.f28043L != null) {
            Paint.Align z0 = mo23579z0(rect, this.f28077q0);
            m35800x0(rect, this.f28076p0);
            if (this.f28079s0.mo24215d() != null) {
                this.f28079s0.mo24216e().drawableState = getState();
                this.f28079s0.mo24221j(this.f28072l0);
            }
            this.f28079s0.mo24216e().setTextAlign(z0);
            int i = 0;
            boolean z = Math.round(this.f28079s0.mo24217f(mo23550n1().toString())) > Math.round(this.f28076p0.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f28076p0);
            }
            CharSequence charSequence = this.f28043L;
            if (z && this.f28042K0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f28079s0.mo24216e(), this.f28076p0.width(), this.f28042K0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f28077q0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f28079s0.mo24216e());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: S2 */
    private boolean m35784S2() {
        return this.f28059Y && this.f28060Z != null && this.f28086z0;
    }

    /* renamed from: T2 */
    private boolean m35785T2() {
        return this.f28045M && this.f28047N != null;
    }

    /* renamed from: U2 */
    private boolean m35786U2() {
        return this.f28052R && this.f28053S != null;
    }

    /* renamed from: V2 */
    private void m35787V2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    /* renamed from: W2 */
    private void m35788W2() {
        this.f28038I0 = this.f28036H0 ? C7531b.m42046d(this.f28041K) : null;
    }

    @TargetApi(21)
    /* renamed from: X2 */
    private void m35789X2() {
        this.f28054T = new RippleDrawable(C7531b.m42046d(mo23546l1()), this.f28053S, f28024P0);
    }

    /* renamed from: f1 */
    private float m35790f1() {
        Drawable drawable = this.f28086z0 ? this.f28060Z : this.f28047N;
        float f = this.f28050P;
        if (f <= 0.0f && drawable != null) {
            f = (float) Math.ceil((double) C6100s.m36582c(this.f28072l0, 24));
            if (((float) drawable.getIntrinsicHeight()) <= f) {
                return (float) drawable.getIntrinsicHeight();
            }
        }
        return f;
    }

    /* renamed from: g1 */
    private float m35791g1() {
        Drawable drawable = this.f28086z0 ? this.f28060Z : this.f28047N;
        float f = this.f28050P;
        return (f > 0.0f || drawable == null) ? f : (float) drawable.getIntrinsicWidth();
    }

    /* renamed from: h2 */
    private void m35792h2(ColorStateList colorStateList) {
        if (this.f28029E != colorStateList) {
            this.f28029E = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: q0 */
    private void m35793q0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C0534a.m3287m(drawable, C0534a.m3280f(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f28053S) {
                if (drawable.isStateful()) {
                    drawable.setState(mo23522c1());
                }
                C0534a.m3289o(drawable, this.f28055U);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.f28047N;
            if (drawable == drawable2 && this.f28051Q) {
                C0534a.m3289o(drawable2, this.f28049O);
            }
        }
    }

    /* renamed from: r0 */
    private void m35794r0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m35785T2() || m35784S2()) {
            float f = this.f28064d0 + this.f28065e0;
            float g1 = m35791g1();
            if (C0534a.m3280f(this) == 0) {
                float f2 = ((float) rect.left) + f;
                rectF.left = f2;
                rectF.right = f2 + g1;
            } else {
                float f3 = ((float) rect.right) - f;
                rectF.right = f3;
                rectF.left = f3 - g1;
            }
            float f1 = m35790f1();
            float exactCenterY = rect.exactCenterY() - (f1 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f1;
        }
    }

    /* renamed from: r1 */
    private ColorFilter m35795r1() {
        ColorFilter colorFilter = this.f28027C0;
        return colorFilter != null ? colorFilter : this.f28028D0;
    }

    /* renamed from: t0 */
    private void m35796t0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m35786U2()) {
            float f = this.f28071k0 + this.f28070j0 + this.f28056V + this.f28069i0 + this.f28068h0;
            if (C0534a.m3280f(this) == 0) {
                rectF.right = ((float) rect.right) - f;
            } else {
                rectF.left = ((float) rect.left) + f;
            }
        }
    }

    /* renamed from: t1 */
    private static boolean m35797t1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: u0 */
    private void m35798u0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m35786U2()) {
            float f = this.f28071k0 + this.f28070j0;
            if (C0534a.m3280f(this) == 0) {
                float f2 = ((float) rect.right) - f;
                rectF.right = f2;
                rectF.left = f2 - this.f28056V;
            } else {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + this.f28056V;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f28056V;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: v0 */
    private void m35799v0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m35786U2()) {
            float f = this.f28071k0 + this.f28070j0 + this.f28056V + this.f28069i0 + this.f28068h0;
            if (C0534a.m3280f(this) == 0) {
                float f2 = (float) rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: x0 */
    private void m35800x0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f28043L != null) {
            float s0 = this.f28064d0 + mo23561s0() + this.f28067g0;
            float w0 = this.f28071k0 + mo23574w0() + this.f28068h0;
            if (C0534a.m3280f(this) == 0) {
                rectF.left = ((float) rect.left) + s0;
                rectF.right = ((float) rect.right) - w0;
            } else {
                rectF.left = ((float) rect.left) + w0;
                rectF.right = ((float) rect.right) - s0;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: x1 */
    private static boolean m35801x1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: y0 */
    private float m35802y0() {
        this.f28079s0.mo24216e().getFontMetrics(this.f28075o0);
        Paint.FontMetrics fontMetrics = this.f28075o0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: y1 */
    private static boolean m35803y1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r0.f32732a;
     */
    /* renamed from: z1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m35804z1(p159f.p243f.p245b.p304b.p312t.C7523d r0) {
        /*
            if (r0 == 0) goto L_0x000e
            android.content.res.ColorStateList r0 = r0.f32732a
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C5961a.m35804z1(f.f.b.b.t.d):boolean");
    }

    /* renamed from: A2 */
    public void mo23461A2(int i) {
        mo23580z2(this.f28072l0.getResources().getDimension(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: B1 */
    public void mo23462B1() {
        C5962a aVar = (C5962a) this.f28040J0.get();
        if (aVar != null) {
            aVar.mo23279a();
        }
    }

    /* renamed from: B2 */
    public void mo23463B2(float f) {
        if (this.f28065e0 != f) {
            float s0 = mo23561s0();
            this.f28065e0 = f;
            float s02 = mo23561s0();
            invalidateSelf();
            if (s0 != s02) {
                mo23462B1();
            }
        }
    }

    /* renamed from: C2 */
    public void mo23464C2(int i) {
        mo23463B2(this.f28072l0.getResources().getDimension(i));
    }

    /* renamed from: D1 */
    public void mo23465D1(boolean z) {
        if (this.f28058X != z) {
            this.f28058X = z;
            float s0 = mo23561s0();
            if (!z && this.f28086z0) {
                this.f28086z0 = false;
            }
            float s02 = mo23561s0();
            invalidateSelf();
            if (s0 != s02) {
                mo23462B1();
            }
        }
    }

    /* renamed from: D2 */
    public void mo23466D2(int i) {
        this.f28046M0 = i;
    }

    /* renamed from: E1 */
    public void mo23467E1(int i) {
        mo23465D1(this.f28072l0.getResources().getBoolean(i));
    }

    /* renamed from: E2 */
    public void mo23468E2(ColorStateList colorStateList) {
        if (this.f28041K != colorStateList) {
            this.f28041K = colorStateList;
            m35788W2();
            onStateChange(getState());
        }
    }

    /* renamed from: F1 */
    public void mo23469F1(Drawable drawable) {
        if (this.f28060Z != drawable) {
            float s0 = mo23561s0();
            this.f28060Z = drawable;
            float s02 = mo23561s0();
            m35787V2(this.f28060Z);
            m35793q0(this.f28060Z);
            invalidateSelf();
            if (s0 != s02) {
                mo23462B1();
            }
        }
    }

    /* renamed from: F2 */
    public void mo23470F2(int i) {
        mo23468E2(C3410a.m14542c(this.f28072l0, i));
    }

    /* renamed from: G1 */
    public void mo23471G1(int i) {
        mo23469F1(C3410a.m14543d(this.f28072l0, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G2 */
    public void mo23472G2(boolean z) {
        this.f28044L0 = z;
    }

    /* renamed from: H1 */
    public void mo23473H1(ColorStateList colorStateList) {
        if (this.f28061a0 != colorStateList) {
            this.f28061a0 = colorStateList;
            if (m35771A0()) {
                C0534a.m3289o(this.f28060Z, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: H2 */
    public void mo23474H2(C7508h hVar) {
        this.f28062b0 = hVar;
    }

    /* renamed from: I1 */
    public void mo23475I1(int i) {
        mo23473H1(C3410a.m14542c(this.f28072l0, i));
    }

    /* renamed from: I2 */
    public void mo23476I2(int i) {
        mo23474H2(C7508h.m41956d(this.f28072l0, i));
    }

    /* renamed from: J1 */
    public void mo23477J1(int i) {
        mo23479K1(this.f28072l0.getResources().getBoolean(i));
    }

    /* renamed from: J2 */
    public void mo23478J2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        if (!TextUtils.equals(this.f28043L, charSequence)) {
            this.f28043L = charSequence;
            this.f28079s0.mo24220i(true);
            invalidateSelf();
            mo23462B1();
        }
    }

    /* renamed from: K1 */
    public void mo23479K1(boolean z) {
        if (this.f28059Y != z) {
            boolean S2 = m35784S2();
            this.f28059Y = z;
            boolean S22 = m35784S2();
            if (S2 != S22) {
                if (S22) {
                    m35793q0(this.f28060Z);
                } else {
                    m35787V2(this.f28060Z);
                }
                invalidateSelf();
                mo23462B1();
            }
        }
    }

    /* renamed from: K2 */
    public void mo23480K2(C7523d dVar) {
        this.f28079s0.mo24219h(dVar, this.f28072l0);
    }

    /* renamed from: L0 */
    public Drawable mo23481L0() {
        return this.f28060Z;
    }

    /* renamed from: L1 */
    public void mo23482L1(ColorStateList colorStateList) {
        if (this.f28031F != colorStateList) {
            this.f28031F = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: L2 */
    public void mo23483L2(int i) {
        mo23480K2(new C7523d(this.f28072l0, i));
    }

    /* renamed from: M0 */
    public ColorStateList mo23484M0() {
        return this.f28061a0;
    }

    /* renamed from: M1 */
    public void mo23485M1(int i) {
        mo23482L1(C3410a.m14542c(this.f28072l0, i));
    }

    /* renamed from: M2 */
    public void mo23486M2(float f) {
        if (this.f28068h0 != f) {
            this.f28068h0 = f;
            invalidateSelf();
            mo23462B1();
        }
    }

    /* renamed from: N0 */
    public ColorStateList mo23487N0() {
        return this.f28031F;
    }

    @Deprecated
    /* renamed from: N1 */
    public void mo23488N1(float f) {
        if (this.f28035H != f) {
            this.f28035H = f;
            setShapeAppearanceModel(mo28448D().mo28513w(f));
        }
    }

    /* renamed from: N2 */
    public void mo23489N2(int i) {
        mo23486M2(this.f28072l0.getResources().getDimension(i));
    }

    /* renamed from: O0 */
    public float mo23490O0() {
        return this.f28048N0 ? mo28452I() : this.f28035H;
    }

    @Deprecated
    /* renamed from: O1 */
    public void mo23491O1(int i) {
        mo23488N1(this.f28072l0.getResources().getDimension(i));
    }

    /* renamed from: O2 */
    public void mo23492O2(float f) {
        if (this.f28067g0 != f) {
            this.f28067g0 = f;
            invalidateSelf();
            mo23462B1();
        }
    }

    /* renamed from: P0 */
    public float mo23493P0() {
        return this.f28071k0;
    }

    /* renamed from: P1 */
    public void mo23494P1(float f) {
        if (this.f28071k0 != f) {
            this.f28071k0 = f;
            invalidateSelf();
            mo23462B1();
        }
    }

    /* renamed from: P2 */
    public void mo23495P2(int i) {
        mo23492O2(this.f28072l0.getResources().getDimension(i));
    }

    /* renamed from: Q0 */
    public Drawable mo23496Q0() {
        Drawable drawable = this.f28047N;
        if (drawable != null) {
            return C0534a.m3291q(drawable);
        }
        return null;
    }

    /* renamed from: Q1 */
    public void mo23497Q1(int i) {
        mo23494P1(this.f28072l0.getResources().getDimension(i));
    }

    /* renamed from: Q2 */
    public void mo23498Q2(boolean z) {
        if (this.f28036H0 != z) {
            this.f28036H0 = z;
            m35788W2();
            onStateChange(getState());
        }
    }

    /* renamed from: R0 */
    public float mo23499R0() {
        return this.f28050P;
    }

    /* renamed from: R1 */
    public void mo23500R1(Drawable drawable) {
        Drawable Q0 = mo23496Q0();
        if (Q0 != drawable) {
            float s0 = mo23561s0();
            this.f28047N = drawable != null ? C0534a.m3292r(drawable).mutate() : null;
            float s02 = mo23561s0();
            m35787V2(Q0);
            if (m35785T2()) {
                m35793q0(this.f28047N);
            }
            invalidateSelf();
            if (s0 != s02) {
                mo23462B1();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R2 */
    public boolean mo23501R2() {
        return this.f28044L0;
    }

    /* renamed from: S0 */
    public ColorStateList mo23502S0() {
        return this.f28049O;
    }

    /* renamed from: S1 */
    public void mo23503S1(int i) {
        mo23500R1(C3410a.m14543d(this.f28072l0, i));
    }

    /* renamed from: T0 */
    public float mo23504T0() {
        return this.f28033G;
    }

    /* renamed from: T1 */
    public void mo23505T1(float f) {
        if (this.f28050P != f) {
            float s0 = mo23561s0();
            this.f28050P = f;
            float s02 = mo23561s0();
            invalidateSelf();
            if (s0 != s02) {
                mo23462B1();
            }
        }
    }

    /* renamed from: U0 */
    public float mo23506U0() {
        return this.f28064d0;
    }

    /* renamed from: U1 */
    public void mo23507U1(int i) {
        mo23505T1(this.f28072l0.getResources().getDimension(i));
    }

    /* renamed from: V0 */
    public ColorStateList mo23508V0() {
        return this.f28037I;
    }

    /* renamed from: V1 */
    public void mo23509V1(ColorStateList colorStateList) {
        this.f28051Q = true;
        if (this.f28049O != colorStateList) {
            this.f28049O = colorStateList;
            if (m35785T2()) {
                C0534a.m3289o(this.f28047N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: W0 */
    public float mo23510W0() {
        return this.f28039J;
    }

    /* renamed from: W1 */
    public void mo23511W1(int i) {
        mo23509V1(C3410a.m14542c(this.f28072l0, i));
    }

    /* renamed from: X0 */
    public Drawable mo23512X0() {
        Drawable drawable = this.f28053S;
        if (drawable != null) {
            return C0534a.m3291q(drawable);
        }
        return null;
    }

    /* renamed from: X1 */
    public void mo23513X1(int i) {
        mo23515Y1(this.f28072l0.getResources().getBoolean(i));
    }

    /* renamed from: Y0 */
    public CharSequence mo23514Y0() {
        return this.f28057W;
    }

    /* renamed from: Y1 */
    public void mo23515Y1(boolean z) {
        if (this.f28045M != z) {
            boolean T2 = m35785T2();
            this.f28045M = z;
            boolean T22 = m35785T2();
            if (T2 != T22) {
                if (T22) {
                    m35793q0(this.f28047N);
                } else {
                    m35787V2(this.f28047N);
                }
                invalidateSelf();
                mo23462B1();
            }
        }
    }

    /* renamed from: Z0 */
    public float mo23516Z0() {
        return this.f28070j0;
    }

    /* renamed from: Z1 */
    public void mo23517Z1(float f) {
        if (this.f28033G != f) {
            this.f28033G = f;
            invalidateSelf();
            mo23462B1();
        }
    }

    /* renamed from: a */
    public void mo22928a() {
        mo23462B1();
        invalidateSelf();
    }

    /* renamed from: a1 */
    public float mo23518a1() {
        return this.f28056V;
    }

    /* renamed from: a2 */
    public void mo23519a2(int i) {
        mo23517Z1(this.f28072l0.getResources().getDimension(i));
    }

    /* renamed from: b1 */
    public float mo23520b1() {
        return this.f28069i0;
    }

    /* renamed from: b2 */
    public void mo23521b2(float f) {
        if (this.f28064d0 != f) {
            this.f28064d0 = f;
            invalidateSelf();
            mo23462B1();
        }
    }

    /* renamed from: c1 */
    public int[] mo23522c1() {
        return this.f28034G0;
    }

    /* renamed from: c2 */
    public void mo23523c2(int i) {
        mo23521b2(this.f28072l0.getResources().getDimension(i));
    }

    /* renamed from: d1 */
    public ColorStateList mo23524d1() {
        return this.f28055U;
    }

    /* renamed from: d2 */
    public void mo23525d2(ColorStateList colorStateList) {
        if (this.f28037I != colorStateList) {
            this.f28037I = colorStateList;
            if (this.f28048N0) {
                mo28480l0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i = 0;
            int i2 = this.f28026B0;
            if (i2 < 255) {
                i = C7512a.m41976a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i2);
            }
            m35779G0(canvas, bounds);
            m35776D0(canvas, bounds);
            if (this.f28048N0) {
                super.draw(canvas);
            }
            m35778F0(canvas, bounds);
            m35781I0(canvas, bounds);
            m35777E0(canvas, bounds);
            m35774C0(canvas, bounds);
            if (this.f28044L0) {
                m35783K0(canvas, bounds);
            }
            m35780H0(canvas, bounds);
            m35782J0(canvas, bounds);
            if (this.f28026B0 < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: e1 */
    public void mo23527e1(RectF rectF) {
        m35799v0(getBounds(), rectF);
    }

    /* renamed from: e2 */
    public void mo23528e2(int i) {
        mo23525d2(C3410a.m14542c(this.f28072l0, i));
    }

    /* renamed from: f2 */
    public void mo23529f2(float f) {
        if (this.f28039J != f) {
            this.f28039J = f;
            this.f28073m0.setStrokeWidth(f);
            if (this.f28048N0) {
                super.mo28481m0(f);
            }
            invalidateSelf();
        }
    }

    /* renamed from: g2 */
    public void mo23530g2(int i) {
        mo23529f2(this.f28072l0.getResources().getDimension(i));
    }

    public int getAlpha() {
        return this.f28026B0;
    }

    public ColorFilter getColorFilter() {
        return this.f28027C0;
    }

    public int getIntrinsicHeight() {
        return (int) this.f28033G;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f28064d0 + mo23561s0() + this.f28067g0 + this.f28079s0.mo24217f(mo23550n1().toString()) + this.f28068h0 + mo23574w0() + this.f28071k0), this.f28046M0);
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f28048N0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f28035H);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f28035H);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    /* renamed from: h1 */
    public TextUtils.TruncateAt mo23537h1() {
        return this.f28042K0;
    }

    /* renamed from: i1 */
    public C7508h mo23538i1() {
        return this.f28063c0;
    }

    /* renamed from: i2 */
    public void mo23539i2(Drawable drawable) {
        Drawable X0 = mo23512X0();
        if (X0 != drawable) {
            float w0 = mo23574w0();
            this.f28053S = drawable != null ? C0534a.m3292r(drawable).mutate() : null;
            if (C7531b.f32755a) {
                m35789X2();
            }
            float w02 = mo23574w0();
            m35787V2(X0);
            if (m35786U2()) {
                m35793q0(this.f28053S);
            }
            invalidateSelf();
            if (w0 != w02) {
                mo23462B1();
            }
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        return m35801x1(this.f28029E) || m35801x1(this.f28031F) || m35801x1(this.f28037I) || (this.f28036H0 && m35801x1(this.f28038I0)) || m35804z1(this.f28079s0.mo24215d()) || m35771A0() || m35803y1(this.f28047N) || m35803y1(this.f28060Z) || m35801x1(this.f28030E0);
    }

    /* renamed from: j1 */
    public float mo23542j1() {
        return this.f28066f0;
    }

    /* renamed from: j2 */
    public void mo23543j2(CharSequence charSequence) {
        if (this.f28057W != charSequence) {
            this.f28057W = C3679a.m15764c().mo12957h(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: k1 */
    public float mo23544k1() {
        return this.f28065e0;
    }

    /* renamed from: k2 */
    public void mo23545k2(float f) {
        if (this.f28070j0 != f) {
            this.f28070j0 = f;
            invalidateSelf();
            if (m35786U2()) {
                mo23462B1();
            }
        }
    }

    /* renamed from: l1 */
    public ColorStateList mo23546l1() {
        return this.f28041K;
    }

    /* renamed from: l2 */
    public void mo23547l2(int i) {
        mo23545k2(this.f28072l0.getResources().getDimension(i));
    }

    /* renamed from: m1 */
    public C7508h mo23548m1() {
        return this.f28062b0;
    }

    /* renamed from: m2 */
    public void mo23549m2(int i) {
        mo23539i2(C3410a.m14543d(this.f28072l0, i));
    }

    /* renamed from: n1 */
    public CharSequence mo23550n1() {
        return this.f28043L;
    }

    /* renamed from: n2 */
    public void mo23551n2(float f) {
        if (this.f28056V != f) {
            this.f28056V = f;
            invalidateSelf();
            if (m35786U2()) {
                mo23462B1();
            }
        }
    }

    /* renamed from: o1 */
    public C7523d mo23552o1() {
        return this.f28079s0.mo24215d();
    }

    /* renamed from: o2 */
    public void mo23553o2(int i) {
        mo23551n2(this.f28072l0.getResources().getDimension(i));
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m35785T2()) {
            onLayoutDirectionChanged |= C0534a.m3287m(this.f28047N, i);
        }
        if (m35784S2()) {
            onLayoutDirectionChanged |= C0534a.m3287m(this.f28060Z, i);
        }
        if (m35786U2()) {
            onLayoutDirectionChanged |= C0534a.m3287m(this.f28053S, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m35785T2()) {
            onLevelChange |= this.f28047N.setLevel(i);
        }
        if (m35784S2()) {
            onLevelChange |= this.f28060Z.setLevel(i);
        }
        if (m35786U2()) {
            onLevelChange |= this.f28053S.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.f28048N0) {
            super.onStateChange(iArr);
        }
        return m35775C1(iArr, mo23522c1());
    }

    /* renamed from: p1 */
    public float mo23556p1() {
        return this.f28068h0;
    }

    /* renamed from: p2 */
    public void mo23557p2(float f) {
        if (this.f28069i0 != f) {
            this.f28069i0 = f;
            invalidateSelf();
            if (m35786U2()) {
                mo23462B1();
            }
        }
    }

    /* renamed from: q1 */
    public float mo23558q1() {
        return this.f28067g0;
    }

    /* renamed from: q2 */
    public void mo23559q2(int i) {
        mo23557p2(this.f28072l0.getResources().getDimension(i));
    }

    /* renamed from: r2 */
    public boolean mo23560r2(int[] iArr) {
        if (Arrays.equals(this.f28034G0, iArr)) {
            return false;
        }
        this.f28034G0 = iArr;
        if (m35786U2()) {
            return m35775C1(getState(), iArr);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public float mo23561s0() {
        if (m35785T2() || m35784S2()) {
            return this.f28065e0 + m35791g1() + this.f28066f0;
        }
        return 0.0f;
    }

    /* renamed from: s1 */
    public boolean mo23562s1() {
        return this.f28036H0;
    }

    /* renamed from: s2 */
    public void mo23563s2(ColorStateList colorStateList) {
        if (this.f28055U != colorStateList) {
            this.f28055U = colorStateList;
            if (m35786U2()) {
                C0534a.m3289o(this.f28053S, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.f28026B0 != i) {
            this.f28026B0 = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f28027C0 != colorFilter) {
            this.f28027C0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f28030E0 != colorStateList) {
            this.f28030E0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f28032F0 != mode) {
            this.f28032F0 = mode;
            this.f28028D0 = C7514a.m41986b(this, this.f28030E0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m35785T2()) {
            visible |= this.f28047N.setVisible(z, z2);
        }
        if (m35784S2()) {
            visible |= this.f28060Z.setVisible(z, z2);
        }
        if (m35786U2()) {
            visible |= this.f28053S.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t2 */
    public void mo23568t2(int i) {
        mo23563s2(C3410a.m14542c(this.f28072l0, i));
    }

    /* renamed from: u1 */
    public boolean mo23569u1() {
        return this.f28058X;
    }

    /* renamed from: u2 */
    public void mo23570u2(boolean z) {
        if (this.f28052R != z) {
            boolean U2 = m35786U2();
            this.f28052R = z;
            boolean U22 = m35786U2();
            if (U2 != U22) {
                if (U22) {
                    m35793q0(this.f28053S);
                } else {
                    m35787V2(this.f28053S);
                }
                invalidateSelf();
                mo23462B1();
            }
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v1 */
    public boolean mo23572v1() {
        return m35803y1(this.f28053S);
    }

    /* renamed from: v2 */
    public void mo23573v2(C5962a aVar) {
        this.f28040J0 = new WeakReference<>(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public float mo23574w0() {
        if (m35786U2()) {
            return this.f28069i0 + this.f28056V + this.f28070j0;
        }
        return 0.0f;
    }

    /* renamed from: w1 */
    public boolean mo23575w1() {
        return this.f28052R;
    }

    /* renamed from: w2 */
    public void mo23576w2(TextUtils.TruncateAt truncateAt) {
        this.f28042K0 = truncateAt;
    }

    /* renamed from: x2 */
    public void mo23577x2(C7508h hVar) {
        this.f28063c0 = hVar;
    }

    /* renamed from: y2 */
    public void mo23578y2(int i) {
        mo23577x2(C7508h.m41956d(this.f28072l0, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public Paint.Align mo23579z0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f28043L != null) {
            float s0 = this.f28064d0 + mo23561s0() + this.f28067g0;
            if (C0534a.m3280f(this) == 0) {
                pointF.x = ((float) rect.left) + s0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - s0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - m35802y0();
        }
        return align;
    }

    /* renamed from: z2 */
    public void mo23580z2(float f) {
        if (this.f28066f0 != f) {
            float s0 = mo23561s0();
            this.f28066f0 = f;
            float s02 = mo23561s0();
            invalidateSelf();
            if (s0 != s02) {
                mo23462B1();
            }
        }
    }
}
