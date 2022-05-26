package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import com.google.android.material.navigation.C6116a;
import p159f.p243f.p245b.p304b.C7492d;
import p159f.p243f.p245b.p304b.C7496h;

/* renamed from: com.google.android.material.navigationrail.a */
/* compiled from: NavigationRailItemView */
final class C6121a extends C6116a {
    public C6121a(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public int getItemDefaultMarginResId() {
        return C7492d.mtrl_navigation_rail_icon_margin;
    }

    /* access modifiers changed from: protected */
    public int getItemLayoutResId() {
        return C7496h.mtrl_navigation_rail_item;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), View.resolveSizeAndState(Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i2)), i2, 0));
        }
    }
}
