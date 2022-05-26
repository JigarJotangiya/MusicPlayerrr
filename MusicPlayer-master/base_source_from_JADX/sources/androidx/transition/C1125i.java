package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import p082e.p109h.p119p.C3774v;

@SuppressLint({"ViewConstructor"})
/* renamed from: androidx.transition.i */
/* compiled from: GhostViewPort */
class C1125i extends ViewGroup implements C1117f {

    /* renamed from: g */
    ViewGroup f4690g;

    /* renamed from: h */
    View f4691h;

    /* renamed from: i */
    final View f4692i;

    /* renamed from: j */
    int f4693j;

    /* renamed from: k */
    private Matrix f4694k;

    /* renamed from: l */
    private final ViewTreeObserver.OnPreDrawListener f4695l = new C1126a();

    /* renamed from: androidx.transition.i$a */
    /* compiled from: GhostViewPort */
    class C1126a implements ViewTreeObserver.OnPreDrawListener {
        C1126a() {
        }

        public boolean onPreDraw() {
            View view;
            C3774v.m16197e0(C1125i.this);
            C1125i iVar = C1125i.this;
            ViewGroup viewGroup = iVar.f4690g;
            if (viewGroup == null || (view = iVar.f4691h) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            C3774v.m16197e0(C1125i.this.f4690g);
            C1125i iVar2 = C1125i.this;
            iVar2.f4690g = null;
            iVar2.f4691h = null;
            return true;
        }
    }

    C1125i(View view) {
        super(view.getContext());
        this.f4692i = view;
        setWillNotDraw(false);
        setLayerType(2, (Paint) null);
    }

    /* renamed from: b */
    static C1125i m6423b(View view, ViewGroup viewGroup, Matrix matrix) {
        C1120g gVar;
        if (view.getParent() instanceof ViewGroup) {
            C1120g b = C1120g.m6397b(viewGroup);
            C1125i e = m6426e(view);
            int i = 0;
            if (!(e == null || (gVar = (C1120g) e.getParent()) == b)) {
                i = e.f4693j;
                gVar.removeView(e);
                e = null;
            }
            if (e == null) {
                if (matrix == null) {
                    matrix = new Matrix();
                    m6424c(view, viewGroup, matrix);
                }
                e = new C1125i(view);
                e.mo6055h(matrix);
                if (b == null) {
                    b = new C1120g(viewGroup);
                } else {
                    b.mo6042g();
                }
                m6425d(viewGroup, b);
                m6425d(viewGroup, e);
                b.mo6041a(e);
                e.f4693j = i;
            } else if (matrix != null) {
                e.mo6055h(matrix);
            }
            e.f4693j++;
            return e;
        }
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }

    /* renamed from: c */
    static void m6424c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        C1129j0.m6444j(viewGroup2, matrix);
        matrix.preTranslate((float) (-viewGroup2.getScrollX()), (float) (-viewGroup2.getScrollY()));
        C1129j0.m6445k(viewGroup, matrix);
    }

    /* renamed from: d */
    static void m6425d(View view, View view2) {
        C1129j0.m6441g(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    /* renamed from: e */
    static C1125i m6426e(View view) {
        return (C1125i) view.getTag(C1143p.ghost_view);
    }

    /* renamed from: f */
    static void m6427f(View view) {
        C1125i e = m6426e(view);
        if (e != null) {
            int i = e.f4693j - 1;
            e.f4693j = i;
            if (i <= 0) {
                ((C1120g) e.getParent()).removeView(e);
            }
        }
    }

    /* renamed from: g */
    static void m6428g(View view, C1125i iVar) {
        view.setTag(C1143p.ghost_view, iVar);
    }

    /* renamed from: a */
    public void mo6038a(ViewGroup viewGroup, View view) {
        this.f4690g = viewGroup;
        this.f4691h = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo6055h(Matrix matrix) {
        this.f4694k = matrix;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m6428g(this.f4692i, this);
        this.f4692i.getViewTreeObserver().addOnPreDrawListener(this.f4695l);
        C1129j0.m6443i(this.f4692i, 4);
        if (this.f4692i.getParent() != null) {
            ((View) this.f4692i.getParent()).invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f4692i.getViewTreeObserver().removeOnPreDrawListener(this.f4695l);
        C1129j0.m6443i(this.f4692i, 0);
        m6428g(this.f4692i, (C1125i) null);
        if (this.f4692i.getParent() != null) {
            ((View) this.f4692i.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C1105b.m6351a(canvas, true);
        canvas.setMatrix(this.f4694k);
        C1129j0.m6443i(this.f4692i, 0);
        this.f4692i.invalidate();
        C1129j0.m6443i(this.f4692i, 4);
        drawChild(canvas, this.f4692i, getDrawingTime());
        C1105b.m6351a(canvas, false);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (m6426e(this.f4692i) == this) {
            C1129j0.m6443i(this.f4692i, i == 0 ? 4 : 0);
        }
    }
}
