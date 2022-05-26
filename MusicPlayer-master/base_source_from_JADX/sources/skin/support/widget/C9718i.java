package skin.support.widget;

import android.annotation.TargetApi;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import p443m.p444a.C9316a;
import p443m.p444a.p447e.p448a.C9335g;

@TargetApi(17)
/* renamed from: skin.support.widget.i */
/* compiled from: SkinCompatTextHelperV17 */
public class C9718i extends C9717h {

    /* renamed from: h */
    private int f36821h = 0;

    /* renamed from: i */
    private int f36822i = 0;

    public C9718i(TextView textView) {
        super(textView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo33880b() {
        int a = C9712c.m50287a(this.f36818e);
        this.f36818e = a;
        Drawable drawable = null;
        Drawable a2 = a != 0 ? C9335g.m49448a(this.f36814a.getContext(), this.f36818e) : null;
        int a3 = C9712c.m50287a(this.f36820g);
        this.f36820g = a3;
        Drawable a4 = a3 != 0 ? C9335g.m49448a(this.f36814a.getContext(), this.f36820g) : null;
        int a5 = C9712c.m50287a(this.f36819f);
        this.f36819f = a5;
        Drawable a6 = a5 != 0 ? C9335g.m49448a(this.f36814a.getContext(), this.f36819f) : null;
        int a7 = C9712c.m50287a(this.f36817d);
        this.f36817d = a7;
        Drawable a8 = a7 != 0 ? C9335g.m49448a(this.f36814a.getContext(), this.f36817d) : null;
        Drawable a9 = this.f36821h != 0 ? C9335g.m49448a(this.f36814a.getContext(), this.f36821h) : null;
        if (a9 != null) {
            a2 = a9;
        }
        if (this.f36822i != 0) {
            drawable = C9335g.m49448a(this.f36814a.getContext(), this.f36822i);
        }
        if (drawable != null) {
            a6 = drawable;
        }
        if (this.f36818e != 0 || this.f36820g != 0 || this.f36819f != 0 || this.f36817d != 0 || this.f36821h != 0 || this.f36822i != 0) {
            this.f36814a.setCompoundDrawablesWithIntrinsicBounds(a2, a4, a6, a8);
        }
    }

    /* renamed from: i */
    public void mo33884i(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f36814a.getContext().obtainStyledAttributes(attributeSet, C9316a.SkinCompatTextHelper, i, 0);
        int i2 = C9316a.SkinCompatTextHelper_android_drawableStart;
        if (obtainStyledAttributes.hasValue(i2)) {
            int resourceId = obtainStyledAttributes.getResourceId(i2, 0);
            this.f36821h = resourceId;
            this.f36821h = C9712c.m50287a(resourceId);
        }
        int i3 = C9316a.SkinCompatTextHelper_android_drawableEnd;
        if (obtainStyledAttributes.hasValue(i3)) {
            int resourceId2 = obtainStyledAttributes.getResourceId(i3, 0);
            this.f36822i = resourceId2;
            this.f36822i = C9712c.m50287a(resourceId2);
        }
        obtainStyledAttributes.recycle();
        super.mo33884i(attributeSet, i);
    }

    /* renamed from: j */
    public void mo33885j(int i, int i2, int i3, int i4) {
        this.f36821h = i;
        this.f36820g = i2;
        this.f36822i = i3;
        this.f36817d = i4;
        mo33880b();
    }
}
