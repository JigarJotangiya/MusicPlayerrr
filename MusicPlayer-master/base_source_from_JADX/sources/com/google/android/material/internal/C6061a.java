package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.material.internal.C6085i;
import p082e.p109h.p113j.C3641a;
import p082e.p109h.p117n.C3687e;
import p082e.p109h.p118o.C3703i;
import p082e.p109h.p119p.C3733e;
import p082e.p109h.p119p.C3774v;
import p159f.p243f.p245b.p304b.p305m.C7501a;
import p159f.p243f.p245b.p304b.p312t.C7519a;
import p159f.p243f.p245b.p304b.p312t.C7523d;

/* renamed from: com.google.android.material.internal.a */
/* compiled from: CollapsingTextHelper */
public final class C6061a {

    /* renamed from: j0 */
    private static final boolean f28405j0 = (Build.VERSION.SDK_INT < 18);

    /* renamed from: k0 */
    private static final Paint f28406k0;

    /* renamed from: A */
    private C7519a f28407A;

    /* renamed from: B */
    private CharSequence f28408B;

    /* renamed from: C */
    private CharSequence f28409C;

    /* renamed from: D */
    private boolean f28410D;

    /* renamed from: E */
    private boolean f28411E = true;

    /* renamed from: F */
    private boolean f28412F;

    /* renamed from: G */
    private Bitmap f28413G;

    /* renamed from: H */
    private Paint f28414H;

    /* renamed from: I */
    private float f28415I;

    /* renamed from: J */
    private float f28416J;

    /* renamed from: K */
    private int[] f28417K;

    /* renamed from: L */
    private boolean f28418L;

    /* renamed from: M */
    private final TextPaint f28419M;

    /* renamed from: N */
    private final TextPaint f28420N;

    /* renamed from: O */
    private TimeInterpolator f28421O;

    /* renamed from: P */
    private TimeInterpolator f28422P;

    /* renamed from: Q */
    private float f28423Q;

    /* renamed from: R */
    private float f28424R;

    /* renamed from: S */
    private float f28425S;

    /* renamed from: T */
    private ColorStateList f28426T;

    /* renamed from: U */
    private float f28427U;

    /* renamed from: V */
    private float f28428V;

    /* renamed from: W */
    private float f28429W;

    /* renamed from: X */
    private ColorStateList f28430X;

    /* renamed from: Y */
    private float f28431Y;

    /* renamed from: Z */
    private float f28432Z;

    /* renamed from: a */
    private final View f28433a;

    /* renamed from: a0 */
    private StaticLayout f28434a0;

    /* renamed from: b */
    private boolean f28435b;

    /* renamed from: b0 */
    private float f28436b0;

    /* renamed from: c */
    private float f28437c;

    /* renamed from: c0 */
    private float f28438c0;

    /* renamed from: d */
    private boolean f28439d;

    /* renamed from: d0 */
    private float f28440d0;

    /* renamed from: e */
    private float f28441e;

    /* renamed from: e0 */
    private CharSequence f28442e0;

    /* renamed from: f */
    private float f28443f;

    /* renamed from: f0 */
    private int f28444f0 = 1;

    /* renamed from: g */
    private int f28445g;

    /* renamed from: g0 */
    private float f28446g0 = 0.0f;

    /* renamed from: h */
    private final Rect f28447h;

    /* renamed from: h0 */
    private float f28448h0 = 1.0f;

    /* renamed from: i */
    private final Rect f28449i;

    /* renamed from: i0 */
    private int f28450i0 = C6085i.f28511n;

    /* renamed from: j */
    private final RectF f28451j;

    /* renamed from: k */
    private int f28452k = 16;

    /* renamed from: l */
    private int f28453l = 16;

    /* renamed from: m */
    private float f28454m = 15.0f;

    /* renamed from: n */
    private float f28455n = 15.0f;

    /* renamed from: o */
    private ColorStateList f28456o;

    /* renamed from: p */
    private ColorStateList f28457p;

    /* renamed from: q */
    private float f28458q;

    /* renamed from: r */
    private float f28459r;

    /* renamed from: s */
    private float f28460s;

    /* renamed from: t */
    private float f28461t;

    /* renamed from: u */
    private float f28462u;

    /* renamed from: v */
    private float f28463v;

    /* renamed from: w */
    private Typeface f28464w;

    /* renamed from: x */
    private Typeface f28465x;

    /* renamed from: y */
    private Typeface f28466y;

    /* renamed from: z */
    private C7519a f28467z;

    /* renamed from: com.google.android.material.internal.a$a */
    /* compiled from: CollapsingTextHelper */
    class C6062a implements C7519a.C7520a {
        C6062a() {
        }

        /* renamed from: a */
        public void mo24162a(Typeface typeface) {
            C6061a.this.mo24135d0(typeface);
        }
    }

    /* renamed from: com.google.android.material.internal.a$b */
    /* compiled from: CollapsingTextHelper */
    class C6063b implements C7519a.C7520a {
        C6063b() {
        }

        /* renamed from: a */
        public void mo24162a(Typeface typeface) {
            C6061a.this.mo24144n0(typeface);
        }
    }

    static {
        Paint paint = null;
        f28406k0 = paint;
        if (paint != null) {
            paint.setAntiAlias(true);
            paint.setColor(-65281);
        }
    }

    public C6061a(View view) {
        this.f28433a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f28419M = textPaint;
        this.f28420N = new TextPaint(textPaint);
        this.f28449i = new Rect();
        this.f28447h = new Rect();
        this.f28451j = new RectF();
        this.f28443f = m36395f();
    }

    /* renamed from: D0 */
    private boolean m36380D0() {
        return this.f28444f0 > 1 && (!this.f28410D || this.f28439d) && !this.f28412F;
    }

    /* renamed from: L */
    private void m36381L(TextPaint textPaint) {
        textPaint.setTextSize(this.f28455n);
        textPaint.setTypeface(this.f28464w);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.f28431Y);
        }
    }

    /* renamed from: M */
    private void m36382M(TextPaint textPaint) {
        textPaint.setTextSize(this.f28454m);
        textPaint.setTypeface(this.f28465x);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.f28432Z);
        }
    }

    /* renamed from: N */
    private void m36383N(float f) {
        if (this.f28439d) {
            this.f28451j.set(f < this.f28443f ? this.f28447h : this.f28449i);
            return;
        }
        this.f28451j.left = m36387S((float) this.f28447h.left, (float) this.f28449i.left, f, this.f28421O);
        this.f28451j.top = m36387S(this.f28458q, this.f28459r, f, this.f28421O);
        this.f28451j.right = m36387S((float) this.f28447h.right, (float) this.f28449i.right, f, this.f28421O);
        this.f28451j.bottom = m36387S((float) this.f28447h.bottom, (float) this.f28449i.bottom, f, this.f28421O);
    }

    /* renamed from: O */
    private static boolean m36384O(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    /* renamed from: P */
    private boolean m36385P() {
        return C3774v.m16151B(this.f28433a) == 1;
    }

    /* renamed from: R */
    private boolean m36386R(CharSequence charSequence, boolean z) {
        return (z ? C3687e.f11703d : C3687e.f11702c).mo12991a(charSequence, 0, charSequence.length());
    }

    /* renamed from: S */
    private static float m36387S(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C7501a.m41940a(f, f2, f3);
    }

    /* renamed from: W */
    private static boolean m36388W(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: a */
    private static int m36389a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: a0 */
    private void m36390a0(float f) {
        this.f28436b0 = f;
        C3774v.m16197e0(this.f28433a);
    }

    /* renamed from: b */
    private void m36391b(boolean z) {
        StaticLayout staticLayout;
        float f = this.f28416J;
        m36399j(this.f28455n, z);
        CharSequence charSequence = this.f28409C;
        if (!(charSequence == null || (staticLayout = this.f28434a0) == null)) {
            this.f28442e0 = TextUtils.ellipsize(charSequence, this.f28419M, (float) staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f28442e0;
        float f2 = 0.0f;
        float measureText = charSequence2 != null ? this.f28419M.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int b = C3733e.m15972b(this.f28453l, this.f28410D ? 1 : 0);
        int i = b & 112;
        if (i == 48) {
            this.f28459r = (float) this.f28449i.top;
        } else if (i != 80) {
            this.f28459r = ((float) this.f28449i.centerY()) - ((this.f28419M.descent() - this.f28419M.ascent()) / 2.0f);
        } else {
            this.f28459r = ((float) this.f28449i.bottom) + this.f28419M.ascent();
        }
        int i2 = b & 8388615;
        if (i2 == 1) {
            this.f28461t = ((float) this.f28449i.centerX()) - (measureText / 2.0f);
        } else if (i2 != 5) {
            this.f28461t = (float) this.f28449i.left;
        } else {
            this.f28461t = ((float) this.f28449i.right) - measureText;
        }
        m36399j(this.f28454m, z);
        StaticLayout staticLayout2 = this.f28434a0;
        float height = staticLayout2 != null ? (float) staticLayout2.getHeight() : 0.0f;
        CharSequence charSequence3 = this.f28409C;
        float measureText2 = charSequence3 != null ? this.f28419M.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout3 = this.f28434a0;
        if (staticLayout3 != null && this.f28444f0 > 1) {
            measureText2 = (float) staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f28434a0;
        if (staticLayout4 != null) {
            f2 = this.f28444f0 > 1 ? (float) staticLayout4.getLineStart(0) : staticLayout4.getLineLeft(0);
        }
        this.f28440d0 = f2;
        int b2 = C3733e.m15972b(this.f28452k, this.f28410D ? 1 : 0);
        int i3 = b2 & 112;
        if (i3 == 48) {
            this.f28458q = (float) this.f28447h.top;
        } else if (i3 != 80) {
            this.f28458q = ((float) this.f28447h.centerY()) - (height / 2.0f);
        } else {
            this.f28458q = (((float) this.f28447h.bottom) - height) + this.f28419M.descent();
        }
        int i4 = b2 & 8388615;
        if (i4 == 1) {
            this.f28460s = ((float) this.f28447h.centerX()) - (measureText2 / 2.0f);
        } else if (i4 != 5) {
            this.f28460s = (float) this.f28447h.left;
        } else {
            this.f28460s = ((float) this.f28447h.right) - measureText2;
        }
        m36401k();
        m36407t0(f);
    }

    /* renamed from: d */
    private void m36392d() {
        m36397h(this.f28437c);
    }

    /* renamed from: e */
    private float m36393e(float f) {
        float f2 = this.f28443f;
        if (f <= f2) {
            return C7501a.m41941b(1.0f, 0.0f, this.f28441e, f2, f);
        }
        return C7501a.m41941b(0.0f, 1.0f, f2, 1.0f, f);
    }

    /* renamed from: e0 */
    private boolean m36394e0(Typeface typeface) {
        C7519a aVar = this.f28407A;
        if (aVar != null) {
            aVar.mo28412c();
        }
        if (this.f28464w == typeface) {
            return false;
        }
        this.f28464w = typeface;
        return true;
    }

    /* renamed from: f */
    private float m36395f() {
        float f = this.f28441e;
        return f + ((1.0f - f) * 0.5f);
    }

    /* renamed from: g */
    private boolean m36396g(CharSequence charSequence) {
        boolean P = m36385P();
        return this.f28411E ? m36386R(charSequence, P) : P;
    }

    /* renamed from: h */
    private void m36397h(float f) {
        float f2;
        m36383N(f);
        if (!this.f28439d) {
            this.f28462u = m36387S(this.f28460s, this.f28461t, f, this.f28421O);
            this.f28463v = m36387S(this.f28458q, this.f28459r, f, this.f28421O);
            m36407t0(m36387S(this.f28454m, this.f28455n, f, this.f28422P));
            f2 = f;
        } else if (f < this.f28443f) {
            this.f28462u = this.f28460s;
            this.f28463v = this.f28458q;
            m36407t0(this.f28454m);
            f2 = 0.0f;
        } else {
            this.f28462u = this.f28461t;
            this.f28463v = this.f28459r - ((float) Math.max(0, this.f28445g));
            m36407t0(this.f28455n);
            f2 = 1.0f;
        }
        TimeInterpolator timeInterpolator = C7501a.f32700b;
        m36390a0(1.0f - m36387S(0.0f, 1.0f, 1.0f - f, timeInterpolator));
        m36400j0(m36387S(1.0f, 0.0f, f, timeInterpolator));
        if (this.f28457p != this.f28456o) {
            this.f28419M.setColor(m36389a(m36410y(), mo24156w(), f2));
        } else {
            this.f28419M.setColor(mo24156w());
        }
        if (Build.VERSION.SDK_INT >= 21) {
            float f3 = this.f28431Y;
            float f4 = this.f28432Z;
            if (f3 != f4) {
                this.f28419M.setLetterSpacing(m36387S(f4, f3, f, timeInterpolator));
            } else {
                this.f28419M.setLetterSpacing(f3);
            }
        }
        this.f28419M.setShadowLayer(m36387S(this.f28427U, this.f28423Q, f, (TimeInterpolator) null), m36387S(this.f28428V, this.f28424R, f, (TimeInterpolator) null), m36387S(this.f28429W, this.f28425S, f, (TimeInterpolator) null), m36389a(m36409x(this.f28430X), m36409x(this.f28426T), f));
        if (this.f28439d) {
            this.f28419M.setAlpha((int) (m36393e(f) * 255.0f));
        }
        C3774v.m16197e0(this.f28433a);
    }

    /* renamed from: i */
    private void m36398i(float f) {
        m36399j(f, false);
    }

    /* renamed from: j */
    private void m36399j(float f, boolean z) {
        boolean z2;
        float f2;
        boolean z3;
        if (this.f28408B != null) {
            float width = (float) this.f28449i.width();
            float width2 = (float) this.f28447h.width();
            boolean z4 = false;
            int i = 1;
            if (m36384O(f, this.f28455n)) {
                f2 = this.f28455n;
                this.f28415I = 1.0f;
                Typeface typeface = this.f28466y;
                Typeface typeface2 = this.f28464w;
                if (typeface != typeface2) {
                    this.f28466y = typeface2;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                float f3 = this.f28454m;
                Typeface typeface3 = this.f28466y;
                Typeface typeface4 = this.f28465x;
                if (typeface3 != typeface4) {
                    this.f28466y = typeface4;
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (m36384O(f, f3)) {
                    this.f28415I = 1.0f;
                } else {
                    this.f28415I = f / this.f28454m;
                }
                float f4 = this.f28455n / this.f28454m;
                float f5 = width2 * f4;
                if (!z && f5 > width) {
                    width = Math.min(width / f4, width2);
                } else {
                    width = width2;
                }
                f2 = f3;
                z2 = z3;
            }
            if (width > 0.0f) {
                z2 = this.f28416J != f2 || this.f28418L || z2;
                this.f28416J = f2;
                this.f28418L = false;
            }
            if (this.f28409C == null || z2) {
                this.f28419M.setTextSize(this.f28416J);
                this.f28419M.setTypeface(this.f28466y);
                TextPaint textPaint = this.f28419M;
                if (this.f28415I != 1.0f) {
                    z4 = true;
                }
                textPaint.setLinearText(z4);
                this.f28410D = m36396g(this.f28408B);
                if (m36380D0()) {
                    i = this.f28444f0;
                }
                StaticLayout l = m36402l(i, width, this.f28410D);
                this.f28434a0 = l;
                this.f28409C = l.getText();
            }
        }
    }

    /* renamed from: j0 */
    private void m36400j0(float f) {
        this.f28438c0 = f;
        C3774v.m16197e0(this.f28433a);
    }

    /* renamed from: k */
    private void m36401k() {
        Bitmap bitmap = this.f28413G;
        if (bitmap != null) {
            bitmap.recycle();
            this.f28413G = null;
        }
    }

    /* renamed from: l */
    private StaticLayout m36402l(int i, float f, boolean z) {
        StaticLayout staticLayout;
        try {
            C6085i c = C6085i.m36530c(this.f28408B, this.f28419M, (int) f);
            c.mo24209e(TextUtils.TruncateAt.END);
            c.mo24212h(z);
            c.mo24208d(Layout.Alignment.ALIGN_NORMAL);
            c.mo24211g(false);
            c.mo24214j(i);
            c.mo24213i(this.f28446g0, this.f28448h0);
            c.mo24210f(this.f28450i0);
            staticLayout = c.mo24207a();
        } catch (C6085i.C6086a e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
            staticLayout = null;
        }
        C3703i.m15827d(staticLayout);
        return staticLayout;
    }

    /* renamed from: n */
    private void m36403n(Canvas canvas, float f, float f2) {
        int alpha = this.f28419M.getAlpha();
        canvas.translate(f, f2);
        float f3 = (float) alpha;
        this.f28419M.setAlpha((int) (this.f28438c0 * f3));
        this.f28434a0.draw(canvas);
        this.f28419M.setAlpha((int) (this.f28436b0 * f3));
        int lineBaseline = this.f28434a0.getLineBaseline(0);
        CharSequence charSequence = this.f28442e0;
        float f4 = (float) lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, this.f28419M);
        if (!this.f28439d) {
            String trim = this.f28442e0.toString().trim();
            if (trim.endsWith("…")) {
                trim = trim.substring(0, trim.length() - 1);
            }
            String str = trim;
            this.f28419M.setAlpha(alpha);
            canvas.drawText(str, 0, Math.min(this.f28434a0.getLineEnd(0), str.length()), 0.0f, f4, this.f28419M);
        }
    }

    /* renamed from: o */
    private void m36404o() {
        if (this.f28413G == null && !this.f28447h.isEmpty() && !TextUtils.isEmpty(this.f28409C)) {
            m36397h(0.0f);
            int width = this.f28434a0.getWidth();
            int height = this.f28434a0.getHeight();
            if (width > 0 && height > 0) {
                this.f28413G = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f28434a0.draw(new Canvas(this.f28413G));
                if (this.f28414H == null) {
                    this.f28414H = new Paint(3);
                }
            }
        }
    }

    /* renamed from: o0 */
    private boolean m36405o0(Typeface typeface) {
        C7519a aVar = this.f28467z;
        if (aVar != null) {
            aVar.mo28412c();
        }
        if (this.f28465x == typeface) {
            return false;
        }
        this.f28465x = typeface;
        return true;
    }

    /* renamed from: t */
    private float m36406t(int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (((float) i) / 2.0f) - (mo24133c() / 2.0f);
        }
        return ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.f28410D ? (float) this.f28449i.left : ((float) this.f28449i.right) - mo24133c() : this.f28410D ? ((float) this.f28449i.right) - mo24133c() : (float) this.f28449i.left;
    }

    /* renamed from: t0 */
    private void m36407t0(float f) {
        m36398i(f);
        boolean z = f28405j0 && this.f28415I != 1.0f;
        this.f28412F = z;
        if (z) {
            m36404o();
        }
        C3774v.m16197e0(this.f28433a);
    }

    /* renamed from: u */
    private float m36408u(RectF rectF, int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (((float) i) / 2.0f) + (mo24133c() / 2.0f);
        }
        return ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.f28410D ? rectF.left + mo24133c() : (float) this.f28449i.right : this.f28410D ? (float) this.f28449i.right : rectF.left + mo24133c();
    }

    /* renamed from: x */
    private int m36409x(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f28417K;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    /* renamed from: y */
    private int m36410y() {
        return m36409x(this.f28456o);
    }

    /* renamed from: A */
    public int mo24111A() {
        return this.f28452k;
    }

    /* renamed from: A0 */
    public void mo24112A0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f28408B, charSequence)) {
            this.f28408B = charSequence;
            this.f28409C = null;
            m36401k();
            mo24127U();
        }
    }

    /* renamed from: B */
    public float mo24113B() {
        m36382M(this.f28420N);
        return -this.f28420N.ascent();
    }

    /* renamed from: B0 */
    public void mo24114B0(TimeInterpolator timeInterpolator) {
        this.f28422P = timeInterpolator;
        mo24127U();
    }

    /* renamed from: C */
    public Typeface mo24115C() {
        Typeface typeface = this.f28465x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    /* renamed from: C0 */
    public void mo24116C0(Typeface typeface) {
        boolean e0 = m36394e0(typeface);
        boolean o0 = m36405o0(typeface);
        if (e0 || o0) {
            mo24127U();
        }
    }

    /* renamed from: D */
    public float mo24117D() {
        return this.f28437c;
    }

    /* renamed from: E */
    public float mo24118E() {
        return this.f28443f;
    }

    /* renamed from: F */
    public int mo24119F() {
        return this.f28450i0;
    }

    /* renamed from: G */
    public int mo24120G() {
        StaticLayout staticLayout = this.f28434a0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    /* renamed from: H */
    public float mo24121H() {
        return this.f28434a0.getSpacingAdd();
    }

    /* renamed from: I */
    public float mo24122I() {
        return this.f28434a0.getSpacingMultiplier();
    }

    /* renamed from: J */
    public int mo24123J() {
        return this.f28444f0;
    }

    /* renamed from: K */
    public CharSequence mo24124K() {
        return this.f28408B;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f28456o;
     */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo24125Q() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f28457p
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0014
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f28456o
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C6061a.mo24125Q():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo24126T() {
        this.f28435b = this.f28449i.width() > 0 && this.f28449i.height() > 0 && this.f28447h.width() > 0 && this.f28447h.height() > 0;
    }

    /* renamed from: U */
    public void mo24127U() {
        mo24128V(false);
    }

    /* renamed from: V */
    public void mo24128V(boolean z) {
        if ((this.f28433a.getHeight() > 0 && this.f28433a.getWidth() > 0) || z) {
            m36391b(z);
            m36392d();
        }
    }

    /* renamed from: X */
    public void mo24129X(int i, int i2, int i3, int i4) {
        if (!m36388W(this.f28449i, i, i2, i3, i4)) {
            this.f28449i.set(i, i2, i3, i4);
            this.f28418L = true;
            mo24126T();
        }
    }

    /* renamed from: Y */
    public void mo24130Y(Rect rect) {
        mo24129X(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: Z */
    public void mo24131Z(int i) {
        C7523d dVar = new C7523d(this.f28433a.getContext(), i);
        ColorStateList colorStateList = dVar.f32732a;
        if (colorStateList != null) {
            this.f28457p = colorStateList;
        }
        float f = dVar.f32742k;
        if (f != 0.0f) {
            this.f28455n = f;
        }
        ColorStateList colorStateList2 = dVar.f32733b;
        if (colorStateList2 != null) {
            this.f28426T = colorStateList2;
        }
        this.f28424R = dVar.f32737f;
        this.f28425S = dVar.f32738g;
        this.f28423Q = dVar.f32739h;
        this.f28431Y = dVar.f32741j;
        C7519a aVar = this.f28407A;
        if (aVar != null) {
            aVar.mo28412c();
        }
        this.f28407A = new C7519a(new C6062a(), dVar.mo28413e());
        dVar.mo28416h(this.f28433a.getContext(), this.f28407A);
        mo24127U();
    }

    /* renamed from: b0 */
    public void mo24132b0(ColorStateList colorStateList) {
        if (this.f28457p != colorStateList) {
            this.f28457p = colorStateList;
            mo24127U();
        }
    }

    /* renamed from: c */
    public float mo24133c() {
        if (this.f28408B == null) {
            return 0.0f;
        }
        m36381L(this.f28420N);
        TextPaint textPaint = this.f28420N;
        CharSequence charSequence = this.f28408B;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: c0 */
    public void mo24134c0(int i) {
        if (this.f28453l != i) {
            this.f28453l = i;
            mo24127U();
        }
    }

    /* renamed from: d0 */
    public void mo24135d0(Typeface typeface) {
        if (m36394e0(typeface)) {
            mo24127U();
        }
    }

    /* renamed from: f0 */
    public void mo24136f0(int i) {
        this.f28445g = i;
    }

    /* renamed from: g0 */
    public void mo24137g0(int i, int i2, int i3, int i4) {
        if (!m36388W(this.f28447h, i, i2, i3, i4)) {
            this.f28447h.set(i, i2, i3, i4);
            this.f28418L = true;
            mo24126T();
        }
    }

    /* renamed from: h0 */
    public void mo24138h0(Rect rect) {
        mo24137g0(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: i0 */
    public void mo24139i0(int i) {
        C7523d dVar = new C7523d(this.f28433a.getContext(), i);
        ColorStateList colorStateList = dVar.f32732a;
        if (colorStateList != null) {
            this.f28456o = colorStateList;
        }
        float f = dVar.f32742k;
        if (f != 0.0f) {
            this.f28454m = f;
        }
        ColorStateList colorStateList2 = dVar.f32733b;
        if (colorStateList2 != null) {
            this.f28430X = colorStateList2;
        }
        this.f28428V = dVar.f32737f;
        this.f28429W = dVar.f32738g;
        this.f28427U = dVar.f32739h;
        this.f28432Z = dVar.f32741j;
        C7519a aVar = this.f28467z;
        if (aVar != null) {
            aVar.mo28412c();
        }
        this.f28467z = new C7519a(new C6063b(), dVar.mo28413e());
        dVar.mo28416h(this.f28433a.getContext(), this.f28467z);
        mo24127U();
    }

    /* renamed from: k0 */
    public void mo24140k0(ColorStateList colorStateList) {
        if (this.f28456o != colorStateList) {
            this.f28456o = colorStateList;
            mo24127U();
        }
    }

    /* renamed from: l0 */
    public void mo24141l0(int i) {
        if (this.f28452k != i) {
            this.f28452k = i;
            mo24127U();
        }
    }

    /* renamed from: m */
    public void mo24142m(Canvas canvas) {
        int save = canvas.save();
        if (this.f28409C != null && this.f28435b) {
            boolean z = true;
            float lineStart = (this.f28462u + (this.f28444f0 > 1 ? (float) this.f28434a0.getLineStart(0) : this.f28434a0.getLineLeft(0))) - (this.f28440d0 * 2.0f);
            this.f28419M.setTextSize(this.f28416J);
            float f = this.f28462u;
            float f2 = this.f28463v;
            if (!this.f28412F || this.f28413G == null) {
                z = false;
            }
            float f3 = this.f28415I;
            if (f3 != 1.0f && !this.f28439d) {
                canvas.scale(f3, f3, f, f2);
            }
            if (z) {
                canvas.drawBitmap(this.f28413G, f, f2, this.f28414H);
                canvas.restoreToCount(save);
                return;
            }
            if (!m36380D0() || (this.f28439d && this.f28437c <= this.f28443f)) {
                canvas.translate(f, f2);
                this.f28434a0.draw(canvas);
            } else {
                m36403n(canvas, lineStart, f2);
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: m0 */
    public void mo24143m0(float f) {
        if (this.f28454m != f) {
            this.f28454m = f;
            mo24127U();
        }
    }

    /* renamed from: n0 */
    public void mo24144n0(Typeface typeface) {
        if (m36405o0(typeface)) {
            mo24127U();
        }
    }

    /* renamed from: p */
    public void mo24145p(RectF rectF, int i, int i2) {
        this.f28410D = m36396g(this.f28408B);
        rectF.left = m36406t(i, i2);
        rectF.top = (float) this.f28449i.top;
        rectF.right = m36408u(rectF, i, i2);
        rectF.bottom = ((float) this.f28449i.top) + mo24151s();
    }

    /* renamed from: p0 */
    public void mo24146p0(float f) {
        float a = C3641a.m15693a(f, 0.0f, 1.0f);
        if (a != this.f28437c) {
            this.f28437c = a;
            m36392d();
        }
    }

    /* renamed from: q */
    public ColorStateList mo24147q() {
        return this.f28457p;
    }

    /* renamed from: q0 */
    public void mo24148q0(boolean z) {
        this.f28439d = z;
    }

    /* renamed from: r */
    public int mo24149r() {
        return this.f28453l;
    }

    /* renamed from: r0 */
    public void mo24150r0(float f) {
        this.f28441e = f;
        this.f28443f = m36395f();
    }

    /* renamed from: s */
    public float mo24151s() {
        m36381L(this.f28420N);
        return -this.f28420N.ascent();
    }

    /* renamed from: s0 */
    public void mo24152s0(int i) {
        this.f28450i0 = i;
    }

    /* renamed from: u0 */
    public void mo24153u0(float f) {
        this.f28446g0 = f;
    }

    /* renamed from: v */
    public Typeface mo24154v() {
        Typeface typeface = this.f28464w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    /* renamed from: v0 */
    public void mo24155v0(float f) {
        this.f28448h0 = f;
    }

    /* renamed from: w */
    public int mo24156w() {
        return m36409x(this.f28457p);
    }

    /* renamed from: w0 */
    public void mo24157w0(int i) {
        if (i != this.f28444f0) {
            this.f28444f0 = i;
            m36401k();
            mo24127U();
        }
    }

    /* renamed from: x0 */
    public void mo24158x0(TimeInterpolator timeInterpolator) {
        this.f28421O = timeInterpolator;
        mo24127U();
    }

    /* renamed from: y0 */
    public void mo24159y0(boolean z) {
        this.f28411E = z;
    }

    /* renamed from: z */
    public float mo24160z() {
        m36382M(this.f28420N);
        return (-this.f28420N.ascent()) + this.f28420N.descent();
    }

    /* renamed from: z0 */
    public final boolean mo24161z0(int[] iArr) {
        this.f28417K = iArr;
        if (!mo24125Q()) {
            return false;
        }
        mo24127U();
        return true;
    }
}
