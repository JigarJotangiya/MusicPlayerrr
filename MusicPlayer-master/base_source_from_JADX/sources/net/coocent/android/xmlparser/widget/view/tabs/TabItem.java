package net.coocent.android.xmlparser.widget.view.tabs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.C0279g0;
import p391j.p392a.p393a.C8618k;

public class TabItem extends View {

    /* renamed from: g */
    public final CharSequence f36609g;

    /* renamed from: h */
    public final Drawable f36610h;

    /* renamed from: i */
    public final int f36611i;

    public TabItem(Context context) {
        this(context, (AttributeSet) null);
    }

    @SuppressLint({"RestrictedApi"})
    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0279g0 u = C0279g0.m1626u(context, attributeSet, C8618k.TabItem);
        this.f36609g = u.mo1991p(C8618k.TabItem_android_text);
        this.f36610h = u.mo1982g(C8618k.TabItem_android_icon);
        this.f36611i = u.mo1989n(C8618k.TabItem_android_layout, 0);
        u.mo1995w();
    }
}
