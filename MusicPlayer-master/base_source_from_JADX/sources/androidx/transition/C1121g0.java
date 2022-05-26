package androidx.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import p082e.p109h.p119p.C3774v;

/* renamed from: androidx.transition.g0 */
/* compiled from: ViewOverlayApi14 */
class C1121g0 implements C1127i0 {

    /* renamed from: a */
    protected C1122a f4676a;

    /* renamed from: androidx.transition.g0$a */
    /* compiled from: ViewOverlayApi14 */
    static class C1122a extends ViewGroup {

        /* renamed from: g */
        ViewGroup f4677g;

        /* renamed from: h */
        View f4678h;

        /* renamed from: i */
        ArrayList<Drawable> f4679i = null;

        /* renamed from: j */
        C1121g0 f4680j;

        /* renamed from: k */
        private boolean f4681k;

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{cls2, cls2, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        C1122a(Context context, ViewGroup viewGroup, View view, C1121g0 g0Var) {
            super(context);
            this.f4677g = viewGroup;
            this.f4678h = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f4680j = g0Var;
        }

        /* renamed from: c */
        private void m6408c() {
            if (this.f4681k) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        /* renamed from: d */
        private void m6409d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f4679i;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f4681k = true;
                    this.f4677g.removeView(this);
                }
            }
        }

        /* renamed from: e */
        private void m6410e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f4677g.getLocationOnScreen(iArr2);
            this.f4678h.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* renamed from: a */
        public void mo6045a(Drawable drawable) {
            m6408c();
            if (this.f4679i == null) {
                this.f4679i = new ArrayList<>();
            }
            if (!this.f4679i.contains(drawable)) {
                this.f4679i.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: b */
        public void mo6046b(View view) {
            m6408c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f4677g || viewGroup.getParent() == null || !C3774v.m16180S(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f4677g.getLocationOnScreen(iArr2);
                    C3774v.m16186Y(view, iArr[0] - iArr2[0]);
                    C3774v.m16187Z(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f4677g.getLocationOnScreen(iArr);
            this.f4678h.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f4678h.getWidth(), this.f4678h.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f4679i;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f4679i.get(i).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: f */
        public void mo6049f(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f4679i;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback((Drawable.Callback) null);
                m6409d();
            }
        }

        /* renamed from: g */
        public void mo6050g(View view) {
            super.removeView(view);
            m6409d();
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f4677g == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f4677g instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                m6410e(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f4679i;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            /*
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L_0x0013
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f4679i
                if (r0 == 0) goto L_0x0011
                boolean r2 = r0.contains(r2)
                if (r2 == 0) goto L_0x0011
                goto L_0x0013
            L_0x0011:
                r2 = 0
                goto L_0x0014
            L_0x0013:
                r2 = 1
            L_0x0014:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C1121g0.C1122a.verifyDrawable(android.graphics.drawable.Drawable):boolean");
        }
    }

    C1121g0(Context context, ViewGroup viewGroup, View view) {
        this.f4676a = new C1122a(context, viewGroup, view, this);
    }

    /* renamed from: e */
    static C1121g0 m6404e(View view) {
        ViewGroup f = m6405f(view);
        if (f == null) {
            return null;
        }
        int childCount = f.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = f.getChildAt(i);
            if (childAt instanceof C1122a) {
                return ((C1122a) childAt).f4680j;
            }
        }
        return new C1106b0(f.getContext(), f, view);
    }

    /* renamed from: f */
    static ViewGroup m6405f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo6034a(Drawable drawable) {
        this.f4676a.mo6045a(drawable);
    }

    /* renamed from: b */
    public void mo6035b(Drawable drawable) {
        this.f4676a.mo6049f(drawable);
    }
}
