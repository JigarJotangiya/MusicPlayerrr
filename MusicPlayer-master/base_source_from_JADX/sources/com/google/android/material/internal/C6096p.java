package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.p */
/* compiled from: ViewOverlayApi14 */
class C6096p implements C6099r {

    /* renamed from: a */
    protected C6097a f28538a;

    @SuppressLint({"ViewConstructor", "PrivateApi"})
    /* renamed from: com.google.android.material.internal.p$a */
    /* compiled from: ViewOverlayApi14 */
    static class C6097a extends ViewGroup {

        /* renamed from: g */
        ViewGroup f28539g;

        /* renamed from: h */
        View f28540h;

        /* renamed from: i */
        ArrayList<Drawable> f28541i = null;

        /* renamed from: j */
        C6096p f28542j;

        /* renamed from: k */
        private boolean f28543k;

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{cls2, cls2, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        C6097a(Context context, ViewGroup viewGroup, View view, C6096p pVar) {
            super(context);
            this.f28539g = viewGroup;
            this.f28540h = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f28542j = pVar;
        }

        /* renamed from: b */
        private void m36571b() {
            if (this.f28543k) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        /* renamed from: c */
        private void m36572c() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f28541i;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f28543k = true;
                    this.f28539g.removeView(this);
                }
            }
        }

        /* renamed from: d */
        private void m36573d(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f28539g.getLocationOnScreen(iArr2);
            this.f28540h.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* renamed from: a */
        public void mo24229a(Drawable drawable) {
            m36571b();
            if (this.f28541i == null) {
                this.f28541i = new ArrayList<>();
            }
            if (!this.f28541i.contains(drawable)) {
                this.f28541i.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f28539g.getLocationOnScreen(iArr);
            this.f28540h.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f28540h.getWidth(), this.f28540h.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f28541i;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f28541i.get(i).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: e */
        public void mo24232e(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f28541i;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback((Drawable.Callback) null);
                m36572c();
            }
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f28539g == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f28539g != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                m36573d(iArr2);
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
            r0 = r1.f28541i;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            /*
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L_0x0013
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f28541i
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C6096p.C6097a.verifyDrawable(android.graphics.drawable.Drawable):boolean");
        }
    }

    C6096p(Context context, ViewGroup viewGroup, View view) {
        this.f28538a = new C6097a(context, viewGroup, view, this);
    }

    /* renamed from: c */
    static C6096p m36568c(View view) {
        ViewGroup d = C6100s.m36583d(view);
        if (d == null) {
            return null;
        }
        int childCount = d.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = d.getChildAt(i);
            if (childAt instanceof C6097a) {
                return ((C6097a) childAt).f28542j;
            }
        }
        return new C6095o(d.getContext(), d, view);
    }

    /* renamed from: a */
    public void mo24227a(Drawable drawable) {
        this.f28538a.mo24229a(drawable);
    }

    /* renamed from: b */
    public void mo24228b(Drawable drawable) {
        this.f28538a.mo24232e(drawable);
    }
}
