package com.coocent.musiceffect.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0506a;
import p159f.p166c.p201g.C4509d;
import p159f.p166c.p201g.C4510e;
import p159f.p166c.p201g.p208p.C4569d;
import p159f.p166c.p201g.p208p.C4574h;

public class PresetTextView extends AppCompatTextView {

    /* renamed from: k */
    private int f8744k;

    /* renamed from: l */
    private int f8745l;

    /* renamed from: m */
    private int f8746m;

    /* renamed from: n */
    private int f8747n;

    public PresetTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: p */
    private void m11604p() {
        int b = C0506a.m3150b(getContext(), this.f8746m);
        int b2 = C0506a.m3150b(getContext(), this.f8747n);
        setTextColor(isEnabled() ? b : b2);
        Drawable a = C4574h.m19980a(getContext(), this.f8744k, C4569d.m19968a(getContext(), 20.0f), C4569d.m19968a(getContext(), 20.0f), isEnabled() ? b : b2);
        Context context = getContext();
        int i = this.f8745l;
        int a2 = C4569d.m19968a(getContext(), 20.0f);
        int a3 = C4569d.m19968a(getContext(), 20.0f);
        if (!isEnabled()) {
            b = b2;
        }
        setCompoundDrawablesRelative(a, (Drawable) null, C4574h.m19980a(context, i, a2, a3, b), (Drawable) null);
    }

    /* renamed from: q */
    public void mo9595q(int i, int i2) {
        this.f8744k = i;
        this.f8745l = i2;
        m11604p();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        m11604p();
    }

    public PresetTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PresetTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8744k = C4510e.icon_custom;
        this.f8745l = C4510e.ic_arrow_down;
        this.f8746m = C4509d.effect_textcolor;
        this.f8747n = C4509d.effect_default;
        m11604p();
    }
}
