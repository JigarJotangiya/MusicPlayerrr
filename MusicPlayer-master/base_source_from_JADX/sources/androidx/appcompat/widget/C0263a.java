package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import p082e.p083a.C3400a;
import p082e.p083a.C3409j;
import p082e.p109h.p119p.C3706a0;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.C3790z;

/* renamed from: androidx.appcompat.widget.a */
/* compiled from: AbsActionBarView */
abstract class C0263a extends ViewGroup {

    /* renamed from: g */
    protected final C0264a f1225g;

    /* renamed from: h */
    protected final Context f1226h;

    /* renamed from: i */
    protected ActionMenuView f1227i;

    /* renamed from: j */
    protected ActionMenuPresenter f1228j;

    /* renamed from: k */
    protected int f1229k;

    /* renamed from: l */
    protected C3790z f1230l;

    /* renamed from: m */
    private boolean f1231m;

    /* renamed from: n */
    private boolean f1232n;

    /* renamed from: androidx.appcompat.widget.a$a */
    /* compiled from: AbsActionBarView */
    protected class C0264a implements C3706a0 {

        /* renamed from: a */
        private boolean f1233a = false;

        /* renamed from: b */
        int f1234b;

        protected C0264a() {
        }

        /* renamed from: a */
        public void mo1916a(View view) {
            this.f1233a = true;
        }

        /* renamed from: b */
        public void mo585b(View view) {
            if (!this.f1233a) {
                C0263a aVar = C0263a.this;
                aVar.f1230l = null;
                C0263a.super.setVisibility(this.f1234b);
            }
        }

        /* renamed from: c */
        public void mo586c(View view) {
            C0263a.super.setVisibility(0);
            this.f1233a = false;
        }

        /* renamed from: d */
        public C0264a mo1917d(C3790z zVar, int i) {
            C0263a.this.f1230l = zVar;
            this.f1234b = i;
            return this;
        }
    }

    C0263a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: d */
    protected static int m1539d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo1910c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo1911e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: f */
    public C3790z mo1912f(int i, long j) {
        C3790z zVar = this.f1230l;
        if (zVar != null) {
            zVar.mo13224b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C3790z d = C3774v.m16194d(this);
            d.mo13223a(1.0f);
            d.mo13228f(j);
            C0264a aVar = this.f1225g;
            aVar.mo1917d(d, i);
            d.mo13230h(aVar);
            return d;
        }
        C3790z d2 = C3774v.m16194d(this);
        d2.mo13223a(0.0f);
        d2.mo13228f(j);
        C0264a aVar2 = this.f1225g;
        aVar2.mo1917d(d2, i);
        d2.mo13230h(aVar2);
        return d2;
    }

    public int getAnimatedVisibility() {
        if (this.f1230l != null) {
            return this.f1225g.f1234b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1229k;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C3409j.ActionBar, C3400a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C3409j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f1228j;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1268z(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1232n = false;
        }
        if (!this.f1232n) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1232n = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1232n = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1231m = false;
        }
        if (!this.f1231m) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1231m = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1231m = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C3790z zVar = this.f1230l;
            if (zVar != null) {
                zVar.mo13224b();
            }
            super.setVisibility(i);
        }
    }

    C0263a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1225g = new C0264a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C3400a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1226h = context;
        } else {
            this.f1226h = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
