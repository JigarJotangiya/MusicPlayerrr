package androidx.percentlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.percentlayout.widget.C0776a;

@Deprecated
public class PercentFrameLayout extends FrameLayout {

    /* renamed from: g */
    private final C0776a f3470g = new C0776a(this);

    public PercentFrameLayout(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* renamed from: b */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f3470g.mo4419e();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f3470g.mo4417a(i, i2);
        super.onMeasure(i, i2);
        if (this.f3470g.mo4418d()) {
            super.onMeasure(i, i2);
        }
    }

    @Deprecated
    public static class LayoutParams extends FrameLayout.LayoutParams implements C0776a.C0778b {

        /* renamed from: g */
        private C0776a.C0777a f3471g;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3471g = C0776a.m4460c(context, attributeSet);
        }

        /* renamed from: a */
        public C0776a.C0777a mo4408a() {
            if (this.f3471g == null) {
                this.f3471g = new C0776a.C0777a();
            }
            return this.f3471g;
        }

        /* access modifiers changed from: protected */
        public void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            C0776a.m4459b(this, typedArray, i, i2);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }
    }

    public PercentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PercentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
