package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import com.google.android.material.internal.C6093m;
import com.google.android.material.progressindicator.C6129c;
import com.google.android.material.theme.p249a.C6260a;
import java.util.Arrays;
import p082e.p109h.p119p.C3774v;
import p082e.p154x.p155a.p156a.C4236b;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.C7500l;
import p159f.p243f.p245b.p304b.p307o.C7513a;

/* renamed from: com.google.android.material.progressindicator.b */
/* compiled from: BaseProgressIndicator */
public abstract class C6124b<S extends C6129c> extends ProgressBar {

    /* renamed from: t */
    static final int f28637t = C7499k.Widget_MaterialComponents_ProgressIndicator;

    /* renamed from: g */
    S f28638g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f28639h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f28640i;

    /* renamed from: j */
    private boolean f28641j;

    /* renamed from: k */
    private final int f28642k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public long f28643l;

    /* renamed from: m */
    C6123a f28644m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f28645n = false;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f28646o = 4;

    /* renamed from: p */
    private final Runnable f28647p = new C6125a();

    /* renamed from: q */
    private final Runnable f28648q = new C6126b();

    /* renamed from: r */
    private final C4236b f28649r = new C6127c();

    /* renamed from: s */
    private final C4236b f28650s = new C6128d();

    /* renamed from: com.google.android.material.progressindicator.b$a */
    /* compiled from: BaseProgressIndicator */
    class C6125a implements Runnable {
        C6125a() {
        }

        public void run() {
            C6124b.this.m36697k();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.b$b */
    /* compiled from: BaseProgressIndicator */
    class C6126b implements Runnable {
        C6126b() {
        }

        public void run() {
            C6124b.this.m36696j();
            long unused = C6124b.this.f28643l = -1;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.b$c */
    /* compiled from: BaseProgressIndicator */
    class C6127c extends C4236b {
        C6127c() {
        }

        /* renamed from: a */
        public void mo14425a(Drawable drawable) {
            C6124b.this.setIndeterminate(false);
            C6124b.this.mo24409o(0, false);
            C6124b bVar = C6124b.this;
            bVar.mo24409o(bVar.f28639h, C6124b.this.f28640i);
        }
    }

    /* renamed from: com.google.android.material.progressindicator.b$d */
    /* compiled from: BaseProgressIndicator */
    class C6128d extends C4236b {
        C6128d() {
        }

        /* renamed from: a */
        public void mo14425a(Drawable drawable) {
            super.mo14425a(drawable);
            if (!C6124b.this.f28645n) {
                C6124b bVar = C6124b.this;
                bVar.setVisibility(bVar.f28646o);
            }
        }
    }

    protected C6124b(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C6260a.m37386c(context, attributeSet, i, f28637t), attributeSet, i);
        Context context2 = getContext();
        this.f28638g = mo24400i(context2, attributeSet);
        TypedArray h = C6093m.m36563h(context2, attributeSet, C7500l.BaseProgressIndicator, i, i2, new int[0]);
        h.getInt(C7500l.BaseProgressIndicator_showDelay, -1);
        this.f28642k = Math.min(h.getInt(C7500l.BaseProgressIndicator_minHideDelay, -1), 1000);
        h.recycle();
        this.f28644m = new C6123a();
        this.f28641j = true;
    }

    private C6142h<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().mo24514v();
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().mo24480w();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m36696j() {
        ((C6138g) getCurrentDrawable()).mo24493p(false, false, true);
        if (m36698m()) {
            setVisibility(4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m36697k() {
        if (this.f28642k > 0) {
            SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    /* renamed from: m */
    private boolean m36698m() {
        return (getProgressDrawable() == null || !getProgressDrawable().isVisible()) && (getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible());
    }

    /* renamed from: n */
    private void m36699n() {
        if (!(getProgressDrawable() == null || getIndeterminateDrawable() == null)) {
            getIndeterminateDrawable().mo24513u().mo24457d(this.f28649r);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo24491l(this.f28650s);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo24491l(this.f28650s);
        }
    }

    /* renamed from: p */
    private void m36700p() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo24494r(this.f28650s);
            getIndeterminateDrawable().mo24513u().mo24460h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo24494r(this.f28650s);
        }
    }

    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f28638g.f28660f;
    }

    public int[] getIndicatorColor() {
        return this.f28638g.f28657c;
    }

    public int getShowAnimationBehavior() {
        return this.f28638g.f28659e;
    }

    public int getTrackColor() {
        return this.f28638g.f28658d;
    }

    public int getTrackCornerRadius() {
        return this.f28638g.f28656b;
    }

    public int getTrackThickness() {
        return this.f28638g.f28655a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo24427h(boolean z) {
        if (this.f28641j) {
            ((C6138g) getCurrentDrawable()).mo24493p(mo24436q(), false, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract S mo24400i(Context context, AttributeSet attributeSet);

    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo24429l() {
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                if (getWindowVisibility() == 0) {
                    return true;
                }
                return false;
            } else if (!(parent instanceof View)) {
                return true;
            } else {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: o */
    public void mo24409o(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null && !z) {
                getProgressDrawable().jumpToCurrentState();
            }
        } else if (getProgressDrawable() != null) {
            this.f28639h = i;
            this.f28640i = z;
            this.f28645n = true;
            if (!getIndeterminateDrawable().isVisible() || this.f28644m.mo24417a(getContext().getContentResolver()) == 0.0f) {
                this.f28649r.mo14425a(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().mo24513u().mo24458f();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m36699n();
        if (mo24436q()) {
            m36697k();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f28648q);
        removeCallbacks(this.f28647p);
        ((C6138g) getCurrentDrawable()).mo24487h();
        m36700p();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (!(getPaddingLeft() == 0 && getPaddingTop() == 0)) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        }
        if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        C6142h currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate != null) {
            int e = currentDrawingDelegate.mo24454e();
            int d = currentDrawingDelegate.mo24453d();
            if (e < 0) {
                i3 = getMeasuredWidth();
            } else {
                i3 = e + getPaddingLeft() + getPaddingRight();
            }
            if (d < 0) {
                i4 = getMeasuredHeight();
            } else {
                i4 = d + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        mo24427h(i == 0);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        mo24427h(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo24436q() {
        return C3774v.m16180S(this) && getWindowVisibility() == 0 && mo24429l();
    }

    public void setAnimatorDurationScaleProvider(C6123a aVar) {
        this.f28644m = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f28689i = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f28689i = aVar;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f28638g.f28660f = i;
        invalidate();
    }

    public synchronized void setIndeterminate(boolean z) {
        if (z != isIndeterminate()) {
            if (mo24436q()) {
                if (z) {
                    throw new IllegalStateException("Cannot switch to indeterminate mode while the progress indicator is visible.");
                }
            }
            C6138g gVar = (C6138g) getCurrentDrawable();
            if (gVar != null) {
                gVar.mo24487h();
            }
            super.setIndeterminate(z);
            C6138g gVar2 = (C6138g) getCurrentDrawable();
            if (gVar2 != null) {
                gVar2.mo24493p(mo24436q(), false, false);
            }
            this.f28645n = false;
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable((Drawable) null);
        } else if (drawable instanceof C6144j) {
            ((C6138g) drawable).mo24487h();
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{C7513a.m41978b(getContext(), C7490b.colorPrimary, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.f28638g.f28657c = iArr;
            getIndeterminateDrawable().mo24513u().mo24456c();
            invalidate();
        }
    }

    public synchronized void setProgress(int i) {
        if (!isIndeterminate()) {
            mo24409o(i, false);
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable((Drawable) null);
        } else if (drawable instanceof C6136f) {
            C6136f fVar = (C6136f) drawable;
            fVar.mo24487h();
            super.setProgressDrawable(fVar);
            fVar.mo24473A(((float) getProgress()) / ((float) getMax()));
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f28638g.f28659e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        S s = this.f28638g;
        if (s.f28658d != i) {
            s.f28658d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        S s = this.f28638g;
        if (s.f28656b != i) {
            s.f28656b = Math.min(i, s.f28655a / 2);
        }
    }

    public void setTrackThickness(int i) {
        S s = this.f28638g;
        if (s.f28655a != i) {
            s.f28655a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.f28646o = i;
            return;
        }
        throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
    }

    public C6144j<S> getIndeterminateDrawable() {
        return (C6144j) super.getIndeterminateDrawable();
    }

    public C6136f<S> getProgressDrawable() {
        return (C6136f) super.getProgressDrawable();
    }
}
