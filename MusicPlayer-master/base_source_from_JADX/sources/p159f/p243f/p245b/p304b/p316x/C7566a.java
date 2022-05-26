package p159f.p243f.p245b.p304b.p316x;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.internal.C6087j;
import com.google.android.material.internal.C6093m;
import p082e.p109h.p110h.C3621a;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7492d;
import p159f.p243f.p245b.p304b.C7500l;
import p159f.p243f.p245b.p304b.p305m.C7501a;
import p159f.p243f.p245b.p304b.p307o.C7513a;
import p159f.p243f.p245b.p304b.p312t.C7522c;
import p159f.p243f.p245b.p304b.p312t.C7523d;
import p159f.p243f.p245b.p304b.p315w.C7539f;
import p159f.p243f.p245b.p304b.p315w.C7540g;
import p159f.p243f.p245b.p304b.p315w.C7541h;
import p159f.p243f.p245b.p304b.p315w.C7546j;
import p159f.p243f.p245b.p304b.p315w.C7549m;

/* renamed from: f.f.b.b.x.a */
/* compiled from: TooltipDrawable */
public class C7566a extends C7541h implements C6087j.C6089b {

    /* renamed from: E */
    private CharSequence f32905E;

    /* renamed from: F */
    private final Context f32906F;

    /* renamed from: G */
    private final Paint.FontMetrics f32907G = new Paint.FontMetrics();

    /* renamed from: H */
    private final C6087j f32908H;

    /* renamed from: I */
    private final View.OnLayoutChangeListener f32909I;

    /* renamed from: J */
    private final Rect f32910J;

    /* renamed from: K */
    private int f32911K;

    /* renamed from: L */
    private int f32912L;

    /* renamed from: M */
    private int f32913M;

    /* renamed from: N */
    private int f32914N;

    /* renamed from: O */
    private int f32915O;

    /* renamed from: P */
    private int f32916P;

    /* renamed from: Q */
    private float f32917Q;

    /* renamed from: R */
    private float f32918R;

    /* renamed from: S */
    private float f32919S;

    /* renamed from: T */
    private float f32920T;

    /* renamed from: f.f.b.b.x.a$a */
    /* compiled from: TooltipDrawable */
    class C7567a implements View.OnLayoutChangeListener {
        C7567a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C7566a.this.m42277E0(view);
        }
    }

    private C7566a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C6087j jVar = new C6087j(this);
        this.f32908H = jVar;
        this.f32909I = new C7567a();
        this.f32910J = new Rect();
        this.f32917Q = 1.0f;
        this.f32918R = 1.0f;
        this.f32919S = 0.5f;
        this.f32920T = 1.0f;
        this.f32906F = context;
        jVar.mo24216e().density = context.getResources().getDisplayMetrics().density;
        jVar.mo24216e().setTextAlign(Paint.Align.CENTER);
    }

    /* access modifiers changed from: private */
    /* renamed from: E0 */
    public void m42277E0(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f32916P = iArr[0];
        view.getWindowVisibleDisplayFrame(this.f32910J);
    }

    /* renamed from: r0 */
    private float m42279r0() {
        int i;
        if (((this.f32910J.right - getBounds().right) - this.f32916P) - this.f32914N < 0) {
            i = ((this.f32910J.right - getBounds().right) - this.f32916P) - this.f32914N;
        } else if (((this.f32910J.left - getBounds().left) - this.f32916P) + this.f32914N <= 0) {
            return 0.0f;
        } else {
            i = ((this.f32910J.left - getBounds().left) - this.f32916P) + this.f32914N;
        }
        return (float) i;
    }

    /* renamed from: s0 */
    private float m42280s0() {
        this.f32908H.mo24216e().getFontMetrics(this.f32907G);
        Paint.FontMetrics fontMetrics = this.f32907G;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: t0 */
    private float m42281t0(Rect rect) {
        return ((float) rect.centerY()) - m42280s0();
    }

    /* renamed from: u0 */
    public static C7566a m42282u0(Context context, AttributeSet attributeSet, int i, int i2) {
        C7566a aVar = new C7566a(context, attributeSet, i, i2);
        aVar.m42286z0(attributeSet, i, i2);
        return aVar;
    }

    /* renamed from: v0 */
    private C7539f m42283v0() {
        float width = ((float) (((double) getBounds().width()) - (((double) this.f32915O) * Math.sqrt(2.0d)))) / 2.0f;
        return new C7546j(new C7540g((float) this.f32915O), Math.min(Math.max(-m42279r0(), -width), width));
    }

    /* renamed from: x0 */
    private void m42284x0(Canvas canvas) {
        if (this.f32905E != null) {
            Rect bounds = getBounds();
            int t0 = (int) m42281t0(bounds);
            if (this.f32908H.mo24215d() != null) {
                this.f32908H.mo24216e().drawableState = getState();
                this.f32908H.mo24221j(this.f32906F);
                this.f32908H.mo24216e().setAlpha((int) (this.f32920T * 255.0f));
            }
            CharSequence charSequence = this.f32905E;
            canvas.drawText(charSequence, 0, charSequence.length(), (float) bounds.centerX(), (float) t0, this.f32908H.mo24216e());
        }
    }

    /* renamed from: y0 */
    private float m42285y0() {
        CharSequence charSequence = this.f32905E;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f32908H.mo24217f(charSequence.toString());
    }

    /* renamed from: z0 */
    private void m42286z0(AttributeSet attributeSet, int i, int i2) {
        TypedArray h = C6093m.m36563h(this.f32906F, attributeSet, C7500l.Tooltip, i, i2, new int[0]);
        this.f32915O = this.f32906F.getResources().getDimensionPixelSize(C7492d.mtrl_tooltip_arrowSize);
        C7549m.C7551b v = mo28448D().mo28512v();
        v.mo28531s(m42283v0());
        setShapeAppearanceModel(v.mo28526m());
        mo28558C0(h.getText(C7500l.Tooltip_android_text));
        mo28559D0(C7522c.m42019f(this.f32906F, h, C7500l.Tooltip_android_textAppearance));
        mo28463a0(ColorStateList.valueOf(h.getColor(C7500l.Tooltip_backgroundTint, C7513a.m41982f(C3621a.m15595m(C7513a.m41979c(this.f32906F, 16842801, C7566a.class.getCanonicalName()), 229), C3621a.m15595m(C7513a.m41979c(this.f32906F, C7490b.colorOnBackground, C7566a.class.getCanonicalName()), 153)))));
        mo28480l0(ColorStateList.valueOf(C7513a.m41979c(this.f32906F, C7490b.colorSurface, C7566a.class.getCanonicalName())));
        this.f32911K = h.getDimensionPixelSize(C7500l.Tooltip_android_padding, 0);
        this.f32912L = h.getDimensionPixelSize(C7500l.Tooltip_android_minWidth, 0);
        this.f32913M = h.getDimensionPixelSize(C7500l.Tooltip_android_minHeight, 0);
        this.f32914N = h.getDimensionPixelSize(C7500l.Tooltip_android_layout_margin, 0);
        h.recycle();
    }

    /* renamed from: A0 */
    public void mo28556A0(View view) {
        if (view != null) {
            m42277E0(view);
            view.addOnLayoutChangeListener(this.f32909I);
        }
    }

    /* renamed from: B0 */
    public void mo28557B0(float f) {
        this.f32919S = 1.2f;
        this.f32917Q = f;
        this.f32918R = f;
        this.f32920T = C7501a.m41941b(0.0f, 1.0f, 0.19f, 1.0f, f);
        invalidateSelf();
    }

    /* renamed from: C0 */
    public void mo28558C0(CharSequence charSequence) {
        if (!TextUtils.equals(this.f32905E, charSequence)) {
            this.f32905E = charSequence;
            this.f32908H.mo24220i(true);
            invalidateSelf();
        }
    }

    /* renamed from: D0 */
    public void mo28559D0(C7523d dVar) {
        this.f32908H.mo24219h(dVar, this.f32906F);
    }

    /* renamed from: a */
    public void mo22928a() {
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        canvas.save();
        canvas.scale(this.f32917Q, this.f32918R, ((float) getBounds().left) + (((float) getBounds().width()) * 0.5f), ((float) getBounds().top) + (((float) getBounds().height()) * this.f32919S));
        canvas.translate(m42279r0(), (float) (-((((double) this.f32915O) * Math.sqrt(2.0d)) - ((double) this.f32915O))));
        super.draw(canvas);
        m42284x0(canvas);
        canvas.restore();
    }

    public int getIntrinsicHeight() {
        return (int) Math.max(this.f32908H.mo24216e().getTextSize(), (float) this.f32913M);
    }

    public int getIntrinsicWidth() {
        return (int) Math.max(((float) (this.f32911K * 2)) + m42285y0(), (float) this.f32912L);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        C7549m.C7551b v = mo28448D().mo28512v();
        v.mo28531s(m42283v0());
        setShapeAppearanceModel(v.mo28526m());
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* renamed from: w0 */
    public void mo28562w0(View view) {
        if (view != null) {
            view.removeOnLayoutChangeListener(this.f32909I);
        }
    }
}
