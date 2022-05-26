package skin.support.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;
import p443m.p444a.C9316a;
import p443m.p444a.p447e.p448a.C9332d;
import p443m.p444a.p447e.p448a.C9335g;

/* renamed from: skin.support.widget.h */
/* compiled from: SkinCompatTextHelper */
public class C9717h extends C9712c {

    /* renamed from: a */
    final TextView f36814a;

    /* renamed from: b */
    private int f36815b = 0;

    /* renamed from: c */
    private int f36816c = 0;

    /* renamed from: d */
    protected int f36817d = 0;

    /* renamed from: e */
    protected int f36818e = 0;

    /* renamed from: f */
    protected int f36819f = 0;

    /* renamed from: g */
    protected int f36820g = 0;

    public C9717h(TextView textView) {
        this.f36814a = textView;
    }

    /* renamed from: e */
    private void m50300e() {
        int a = C9712c.m50287a(this.f36816c);
        this.f36816c = a;
        if (a != 0) {
            try {
                this.f36814a.setHintTextColor(C9332d.m49406c(this.f36814a.getContext(), this.f36816c));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: f */
    private void m50301f() {
        int a = C9712c.m50287a(this.f36815b);
        this.f36815b = a;
        if (a != 0) {
            try {
                this.f36814a.setTextColor(C9332d.m49406c(this.f36814a.getContext(), this.f36815b));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: g */
    public static C9717h m50302g(TextView textView) {
        if (Build.VERSION.SDK_INT >= 17) {
            return new C9718i(textView);
        }
        return new C9717h(textView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo33880b() {
        mo33881c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo33881c() {
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
        if (a7 != 0) {
            drawable = C9335g.m49448a(this.f36814a.getContext(), this.f36817d);
        }
        if (this.f36818e != 0 || this.f36820g != 0 || this.f36819f != 0 || this.f36817d != 0) {
            this.f36814a.setCompoundDrawablesWithIntrinsicBounds(a2, a4, a6, drawable);
        }
    }

    /* renamed from: d */
    public void mo33882d() {
        mo33880b();
        m50301f();
        m50300e();
    }

    /* renamed from: h */
    public int mo33883h() {
        return this.f36815b;
    }

    /* renamed from: i */
    public void mo33884i(AttributeSet attributeSet, int i) {
        Context context = this.f36814a.getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9316a.SkinCompatTextHelper, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(C9316a.SkinCompatTextHelper_android_textAppearance, 0);
        int i2 = C9316a.SkinCompatTextHelper_android_drawableLeft;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f36818e = obtainStyledAttributes.getResourceId(i2, 0);
        }
        int i3 = C9316a.SkinCompatTextHelper_android_drawableTop;
        if (obtainStyledAttributes.hasValue(i3)) {
            this.f36820g = obtainStyledAttributes.getResourceId(i3, 0);
        }
        int i4 = C9316a.SkinCompatTextHelper_android_drawableRight;
        if (obtainStyledAttributes.hasValue(i4)) {
            this.f36819f = obtainStyledAttributes.getResourceId(i4, 0);
        }
        int i5 = C9316a.SkinCompatTextHelper_android_drawableBottom;
        if (obtainStyledAttributes.hasValue(i5)) {
            this.f36817d = obtainStyledAttributes.getResourceId(i5, 0);
        }
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, C9316a.SkinTextAppearance);
            int i6 = C9316a.SkinTextAppearance_android_textColor;
            if (obtainStyledAttributes2.hasValue(i6)) {
                this.f36815b = obtainStyledAttributes2.getResourceId(i6, 0);
            }
            int i7 = C9316a.SkinTextAppearance_android_textColorHint;
            if (obtainStyledAttributes2.hasValue(i7)) {
                this.f36816c = obtainStyledAttributes2.getResourceId(i7, 0);
            }
            obtainStyledAttributes2.recycle();
        }
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, C9316a.SkinTextAppearance, i, 0);
        int i8 = C9316a.SkinTextAppearance_android_textColor;
        if (obtainStyledAttributes3.hasValue(i8)) {
            this.f36815b = obtainStyledAttributes3.getResourceId(i8, 0);
        }
        int i9 = C9316a.SkinTextAppearance_android_textColorHint;
        if (obtainStyledAttributes3.hasValue(i9)) {
            this.f36816c = obtainStyledAttributes3.getResourceId(i9, 0);
        }
        obtainStyledAttributes3.recycle();
        mo33882d();
    }

    /* renamed from: j */
    public void mo33885j(int i, int i2, int i3, int i4) {
        this.f36818e = i;
        this.f36820g = i2;
        this.f36819f = i3;
        this.f36817d = i4;
        mo33880b();
    }

    /* renamed from: k */
    public void mo33886k(int i, int i2, int i3, int i4) {
        this.f36818e = i;
        this.f36820g = i2;
        this.f36819f = i3;
        this.f36817d = i4;
        mo33881c();
    }

    /* renamed from: l */
    public void mo33887l(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C9316a.SkinTextAppearance);
        int i2 = C9316a.SkinTextAppearance_android_textColor;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f36815b = obtainStyledAttributes.getResourceId(i2, 0);
        }
        int i3 = C9316a.SkinTextAppearance_android_textColorHint;
        if (obtainStyledAttributes.hasValue(i3)) {
            this.f36816c = obtainStyledAttributes.getResourceId(i3, 0);
        }
        obtainStyledAttributes.recycle();
        m50301f();
        m50300e();
    }
}
