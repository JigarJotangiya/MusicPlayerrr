package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.p003d.C0524f;
import p082e.p083a.p084k.p085a.C3410a;

/* renamed from: androidx.appcompat.widget.g0 */
/* compiled from: TintTypedArray */
public class C0279g0 {

    /* renamed from: a */
    private final Context f1293a;

    /* renamed from: b */
    private final TypedArray f1294b;

    /* renamed from: c */
    private TypedValue f1295c;

    private C0279g0(Context context, TypedArray typedArray) {
        this.f1293a = context;
        this.f1294b = typedArray;
    }

    /* renamed from: t */
    public static C0279g0 m1625t(Context context, int i, int[] iArr) {
        return new C0279g0(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: u */
    public static C0279g0 m1626u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0279g0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: v */
    public static C0279g0 m1627v(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0279g0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public boolean mo1976a(int i, boolean z) {
        return this.f1294b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int mo1977b(int i, int i2) {
        return this.f1294b.getColor(i, i2);
    }

    /* renamed from: c */
    public ColorStateList mo1978c(int i) {
        int resourceId;
        ColorStateList c;
        if (!this.f1294b.hasValue(i) || (resourceId = this.f1294b.getResourceId(i, 0)) == 0 || (c = C3410a.m14542c(this.f1293a, resourceId)) == null) {
            return this.f1294b.getColorStateList(i);
        }
        return c;
    }

    /* renamed from: d */
    public float mo1979d(int i, float f) {
        return this.f1294b.getDimension(i, f);
    }

    /* renamed from: e */
    public int mo1980e(int i, int i2) {
        return this.f1294b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: f */
    public int mo1981f(int i, int i2) {
        return this.f1294b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: g */
    public Drawable mo1982g(int i) {
        int resourceId;
        if (!this.f1294b.hasValue(i) || (resourceId = this.f1294b.getResourceId(i, 0)) == 0) {
            return this.f1294b.getDrawable(i);
        }
        return C3410a.m14543d(this.f1293a, resourceId);
    }

    /* renamed from: h */
    public Drawable mo1983h(int i) {
        int resourceId;
        if (!this.f1294b.hasValue(i) || (resourceId = this.f1294b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0275f.m1604b().mo1967d(this.f1293a, resourceId, true);
    }

    /* renamed from: i */
    public float mo1984i(int i, float f) {
        return this.f1294b.getFloat(i, f);
    }

    /* renamed from: j */
    public Typeface mo1985j(int i, int i2, C0524f.C0527c cVar) {
        int resourceId = this.f1294b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1295c == null) {
            this.f1295c = new TypedValue();
        }
        return C0524f.m3227h(this.f1293a, resourceId, this.f1295c, i2, cVar);
    }

    /* renamed from: k */
    public int mo1986k(int i, int i2) {
        return this.f1294b.getInt(i, i2);
    }

    /* renamed from: l */
    public int mo1987l(int i, int i2) {
        return this.f1294b.getInteger(i, i2);
    }

    /* renamed from: m */
    public int mo1988m(int i, int i2) {
        return this.f1294b.getLayoutDimension(i, i2);
    }

    /* renamed from: n */
    public int mo1989n(int i, int i2) {
        return this.f1294b.getResourceId(i, i2);
    }

    /* renamed from: o */
    public String mo1990o(int i) {
        return this.f1294b.getString(i);
    }

    /* renamed from: p */
    public CharSequence mo1991p(int i) {
        return this.f1294b.getText(i);
    }

    /* renamed from: q */
    public CharSequence[] mo1992q(int i) {
        return this.f1294b.getTextArray(i);
    }

    /* renamed from: r */
    public TypedArray mo1993r() {
        return this.f1294b;
    }

    /* renamed from: s */
    public boolean mo1994s(int i) {
        return this.f1294b.hasValue(i);
    }

    /* renamed from: w */
    public void mo1995w() {
        this.f1294b.recycle();
    }
}
