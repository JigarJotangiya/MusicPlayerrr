package p082e.p109h.p119p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p082e.p109h.p111i.p112a.C3639b;

/* renamed from: e.h.p.i */
/* compiled from: MenuItemCompat */
public final class C3761i {
    /* renamed from: a */
    public static MenuItem m16098a(MenuItem menuItem, C3707b bVar) {
        if (menuItem instanceof C3639b) {
            return ((C3639b) menuItem).mo755a(bVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: b */
    public static void m16099b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C3639b) {
            ((C3639b) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    /* renamed from: c */
    public static void m16100c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C3639b) {
            ((C3639b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    /* renamed from: d */
    public static void m16101d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C3639b) {
            ((C3639b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: e */
    public static void m16102e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof C3639b) {
            ((C3639b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    /* renamed from: f */
    public static void m16103f(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C3639b) {
            ((C3639b) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    /* renamed from: g */
    public static void m16104g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C3639b) {
            ((C3639b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }
}
