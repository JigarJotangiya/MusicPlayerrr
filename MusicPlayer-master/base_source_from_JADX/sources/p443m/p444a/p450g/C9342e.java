package p443m.p444a.p450g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import p443m.p444a.C9317b;
import p443m.p444a.p447e.p448a.C9332d;
import p443m.p444a.p452i.C9346b;

/* renamed from: m.a.g.e */
/* compiled from: SkinSDCardLoader */
public abstract class C9342e implements C9317b.C9320c {
    /* renamed from: a */
    public ColorStateList mo32295a(Context context, String str, int i) {
        return null;
    }

    /* renamed from: c */
    public Drawable mo32296c(Context context, String str, int i) {
        return null;
    }

    /* renamed from: d */
    public ColorStateList mo32297d(Context context, String str, int i) {
        return null;
    }

    /* renamed from: e */
    public String mo32298e(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String g = mo27298g(context, str);
        if (!C9346b.m49494c(g)) {
            return null;
        }
        String n = C9317b.m49321m().mo32276n(g);
        Resources o = C9317b.m49321m().mo32277o(g);
        if (o == null || TextUtils.isEmpty(n)) {
            return null;
        }
        C9332d.m49408e().mo32329s(o, n, str, this);
        return str;
    }

    /* renamed from: f */
    public String mo32299f(Context context, String str, int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract String mo27298g(Context context, String str);
}
