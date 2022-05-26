package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.C0279g0;
import p159f.p243f.p245b.p304b.C7500l;

public class TabItem extends View {

    /* renamed from: g */
    public final CharSequence f28888g;

    /* renamed from: h */
    public final Drawable f28889h;

    /* renamed from: i */
    public final int f28890i;

    public TabItem(Context context) {
        this(context, (AttributeSet) null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0279g0 u = C0279g0.m1626u(context, attributeSet, C7500l.TabItem);
        this.f28888g = u.mo1991p(C7500l.TabItem_android_text);
        this.f28889h = u.mo1982g(C7500l.TabItem_android_icon);
        this.f28890i = u.mo1989n(C7500l.TabItem_android_layout, 0);
        u.mo1995w();
    }
}
