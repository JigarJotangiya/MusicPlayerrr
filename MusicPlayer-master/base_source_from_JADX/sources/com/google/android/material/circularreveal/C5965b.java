package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.circularreveal.C5967c;
import p159f.p243f.p245b.p304b.p311s.C7518a;

/* renamed from: com.google.android.material.circularreveal.b */
/* compiled from: CircularRevealHelper */
public class C5965b {

    /* renamed from: j */
    public static final int f28092j;

    /* renamed from: a */
    private final C5966a f28093a;

    /* renamed from: b */
    private final View f28094b;

    /* renamed from: c */
    private final Path f28095c = new Path();

    /* renamed from: d */
    private final Paint f28096d = new Paint(7);

    /* renamed from: e */
    private final Paint f28097e;

    /* renamed from: f */
    private C5967c.C5972e f28098f;

    /* renamed from: g */
    private Drawable f28099g;

    /* renamed from: h */
    private boolean f28100h;

    /* renamed from: i */
    private boolean f28101i;

    /* renamed from: com.google.android.material.circularreveal.b$a */
    /* compiled from: CircularRevealHelper */
    public interface C5966a {
        /* renamed from: c */
        void mo23583c(Canvas canvas);

        /* renamed from: d */
        boolean mo23584d();
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f28092j = 2;
        } else if (i >= 18) {
            f28092j = 1;
        } else {
            f28092j = 0;
        }
    }

    public C5965b(C5966a aVar) {
        this.f28093a = aVar;
        View view = (View) aVar;
        this.f28094b = view;
        view.setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f28097e = paint;
        paint.setColor(0);
    }

    /* renamed from: d */
    private void m35929d(Canvas canvas) {
        if (m35933o()) {
            Rect bounds = this.f28099g.getBounds();
            float width = this.f28098f.f28106a - (((float) bounds.width()) / 2.0f);
            float height = this.f28098f.f28107b - (((float) bounds.height()) / 2.0f);
            canvas.translate(width, height);
            this.f28099g.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    /* renamed from: g */
    private float m35930g(C5967c.C5972e eVar) {
        return C7518a.m42000b(eVar.f28106a, eVar.f28107b, 0.0f, 0.0f, (float) this.f28094b.getWidth(), (float) this.f28094b.getHeight());
    }

    /* renamed from: i */
    private void m35931i() {
        if (f28092j == 1) {
            this.f28095c.rewind();
            C5967c.C5972e eVar = this.f28098f;
            if (eVar != null) {
                this.f28095c.addCircle(eVar.f28106a, eVar.f28107b, eVar.f28108c, Path.Direction.CW);
            }
        }
        this.f28094b.invalidate();
    }

    /* renamed from: n */
    private boolean m35932n() {
        C5967c.C5972e eVar = this.f28098f;
        boolean z = eVar == null || eVar.mo23624a();
        if (f28092j != 0) {
            return !z;
        }
        if (z || !this.f28101i) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    private boolean m35933o() {
        return (this.f28100h || this.f28099g == null || this.f28098f == null) ? false : true;
    }

    /* renamed from: p */
    private boolean m35934p() {
        return !this.f28100h && Color.alpha(this.f28097e.getColor()) != 0;
    }

    /* renamed from: a */
    public void mo23604a() {
        if (f28092j == 0) {
            this.f28100h = true;
            this.f28101i = false;
            this.f28094b.buildDrawingCache();
            Bitmap drawingCache = this.f28094b.getDrawingCache();
            if (!(drawingCache != null || this.f28094b.getWidth() == 0 || this.f28094b.getHeight() == 0)) {
                drawingCache = Bitmap.createBitmap(this.f28094b.getWidth(), this.f28094b.getHeight(), Bitmap.Config.ARGB_8888);
                this.f28094b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f28096d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f28100h = false;
            this.f28101i = true;
        }
    }

    /* renamed from: b */
    public void mo23605b() {
        if (f28092j == 0) {
            this.f28101i = false;
            this.f28094b.destroyDrawingCache();
            this.f28096d.setShader((Shader) null);
            this.f28094b.invalidate();
        }
    }

    /* renamed from: c */
    public void mo23606c(Canvas canvas) {
        if (m35932n()) {
            int i = f28092j;
            if (i == 0) {
                C5967c.C5972e eVar = this.f28098f;
                canvas.drawCircle(eVar.f28106a, eVar.f28107b, eVar.f28108c, this.f28096d);
                if (m35934p()) {
                    C5967c.C5972e eVar2 = this.f28098f;
                    canvas.drawCircle(eVar2.f28106a, eVar2.f28107b, eVar2.f28108c, this.f28097e);
                }
            } else if (i == 1) {
                int save = canvas.save();
                canvas.clipPath(this.f28095c);
                this.f28093a.mo23583c(canvas);
                if (m35934p()) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.f28094b.getWidth(), (float) this.f28094b.getHeight(), this.f28097e);
                }
                canvas.restoreToCount(save);
            } else if (i == 2) {
                this.f28093a.mo23583c(canvas);
                if (m35934p()) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.f28094b.getWidth(), (float) this.f28094b.getHeight(), this.f28097e);
                }
            } else {
                throw new IllegalStateException("Unsupported strategy " + i);
            }
        } else {
            this.f28093a.mo23583c(canvas);
            if (m35934p()) {
                canvas.drawRect(0.0f, 0.0f, (float) this.f28094b.getWidth(), (float) this.f28094b.getHeight(), this.f28097e);
            }
        }
        m35929d(canvas);
    }

    /* renamed from: e */
    public Drawable mo23607e() {
        return this.f28099g;
    }

    /* renamed from: f */
    public int mo23608f() {
        return this.f28097e.getColor();
    }

    /* renamed from: h */
    public C5967c.C5972e mo23609h() {
        C5967c.C5972e eVar = this.f28098f;
        if (eVar == null) {
            return null;
        }
        C5967c.C5972e eVar2 = new C5967c.C5972e(eVar);
        if (eVar2.mo23624a()) {
            eVar2.f28108c = m35930g(eVar2);
        }
        return eVar2;
    }

    /* renamed from: j */
    public boolean mo23610j() {
        return this.f28093a.mo23584d() && !m35932n();
    }

    /* renamed from: k */
    public void mo23611k(Drawable drawable) {
        this.f28099g = drawable;
        this.f28094b.invalidate();
    }

    /* renamed from: l */
    public void mo23612l(int i) {
        this.f28097e.setColor(i);
        this.f28094b.invalidate();
    }

    /* renamed from: m */
    public void mo23613m(C5967c.C5972e eVar) {
        if (eVar == null) {
            this.f28098f = null;
        } else {
            C5967c.C5972e eVar2 = this.f28098f;
            if (eVar2 == null) {
                this.f28098f = new C5967c.C5972e(eVar);
            } else {
                eVar2.mo23626c(eVar);
            }
            if (C7518a.m42001c(eVar.f28108c, m35930g(eVar), 1.0E-4f)) {
                this.f28098f.f28108c = Float.MAX_VALUE;
            }
        }
        m35931i();
    }
}
