package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p082e.p083a.C3409j;

public final class ViewStubCompat extends View {

    /* renamed from: g */
    private int f1220g;

    /* renamed from: h */
    private int f1221h;

    /* renamed from: i */
    private WeakReference<View> f1222i;

    /* renamed from: j */
    private LayoutInflater f1223j;

    /* renamed from: k */
    private C0262a f1224k;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface C0262a {
        /* renamed from: a */
        void mo1909a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public View mo1897a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f1220g != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f1223j;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f1220g, viewGroup, false);
            int i = this.f1221h;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f1222i = new WeakReference<>(inflate);
            C0262a aVar = this.f1224k;
            if (aVar != null) {
                aVar.mo1909a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1221h;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1223j;
    }

    public int getLayoutResource() {
        return this.f1220g;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1221h = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1223j = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1220g = i;
    }

    public void setOnInflateListener(C0262a aVar) {
        this.f1224k = aVar;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f1222i;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo1897a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1220g = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3409j.ViewStubCompat, i, 0);
        this.f1221h = obtainStyledAttributes.getResourceId(C3409j.ViewStubCompat_android_inflatedId, -1);
        this.f1220g = obtainStyledAttributes.getResourceId(C3409j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C3409j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
