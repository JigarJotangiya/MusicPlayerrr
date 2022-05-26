package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0171g;
import androidx.appcompat.view.menu.C0175i;

/* renamed from: com.google.android.material.navigation.b */
/* compiled from: NavigationBarMenu */
public final class C6118b extends C0171g {

    /* renamed from: B */
    private final Class<?> f28601B;

    /* renamed from: C */
    private final int f28602C;

    public C6118b(Context context, Class<?> cls, int i) {
        super(context);
        this.f28601B = cls;
        this.f28602C = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo906a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= this.f28602C) {
            mo932h0();
            MenuItem a = super.mo906a(i, i2, i3, charSequence);
            if (a instanceof C0175i) {
                ((C0175i) a).mo1013t(true);
            }
            mo929g0();
            return a;
        }
        String simpleName = this.f28601B.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.f28602C + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f28601B.getSimpleName() + " does not support submenus");
    }
}
