package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0171g;
import androidx.appcompat.view.menu.C0175i;

/* renamed from: com.google.android.material.internal.e */
/* compiled from: NavigationMenu */
public class C6067e extends C0171g {
    public C6067e(Context context) {
        super(context);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0175i iVar = (C0175i) mo906a(i, i2, i3, charSequence);
        C6081g gVar = new C6081g(mo954w(), this, iVar);
        iVar.mo1018x(gVar);
        return gVar;
    }
}
