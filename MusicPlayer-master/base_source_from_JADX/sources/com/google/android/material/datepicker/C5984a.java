package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import p082e.p109h.p118o.C3703i;
import p082e.p109h.p119p.C3774v;
import p159f.p243f.p245b.p304b.C7500l;
import p159f.p243f.p245b.p304b.p312t.C7522c;
import p159f.p243f.p245b.p304b.p315w.C7541h;
import p159f.p243f.p245b.p304b.p315w.C7549m;

/* renamed from: com.google.android.material.datepicker.a */
/* compiled from: CalendarItemStyle */
final class C5984a {

    /* renamed from: a */
    private final Rect f28134a;

    /* renamed from: b */
    private final ColorStateList f28135b;

    /* renamed from: c */
    private final ColorStateList f28136c;

    /* renamed from: d */
    private final ColorStateList f28137d;

    /* renamed from: e */
    private final int f28138e;

    /* renamed from: f */
    private final C7549m f28139f;

    private C5984a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C7549m mVar, Rect rect) {
        C3703i.m15826c(rect.left);
        C3703i.m15826c(rect.top);
        C3703i.m15826c(rect.right);
        C3703i.m15826c(rect.bottom);
        this.f28134a = rect;
        this.f28135b = colorStateList2;
        this.f28136c = colorStateList;
        this.f28137d = colorStateList3;
        this.f28138e = i;
        this.f28139f = mVar;
    }

    /* renamed from: a */
    static C5984a m36032a(Context context, int i) {
        C3703i.m15825b(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C7500l.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C7500l.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(C7500l.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(C7500l.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(C7500l.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList a = C7522c.m42014a(context, obtainStyledAttributes, C7500l.MaterialCalendarItem_itemFillColor);
        ColorStateList a2 = C7522c.m42014a(context, obtainStyledAttributes, C7500l.MaterialCalendarItem_itemTextColor);
        ColorStateList a3 = C7522c.m42014a(context, obtainStyledAttributes, C7500l.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C7500l.MaterialCalendarItem_itemStrokeWidth, 0);
        C7549m m = C7549m.m42146b(context, obtainStyledAttributes.getResourceId(C7500l.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(C7500l.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).mo28526m();
        obtainStyledAttributes.recycle();
        return new C5984a(a, a2, a3, dimensionPixelSize, m, rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo23720b() {
        return this.f28134a.bottom;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo23721c() {
        return this.f28134a.top;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo23722d(TextView textView) {
        C7541h hVar = new C7541h();
        C7541h hVar2 = new C7541h();
        hVar.setShapeAppearanceModel(this.f28139f);
        hVar2.setShapeAppearanceModel(this.f28139f);
        hVar.mo28463a0(this.f28136c);
        hVar.mo28478k0((float) this.f28138e, this.f28137d);
        textView.setTextColor(this.f28135b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f28135b.withAlpha(30), hVar, hVar2) : hVar;
        Rect rect = this.f28134a;
        C3774v.m16223r0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
