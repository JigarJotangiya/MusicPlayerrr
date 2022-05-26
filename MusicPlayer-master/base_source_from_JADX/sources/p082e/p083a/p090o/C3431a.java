package p082e.p083a.p090o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import p082e.p083a.C3400a;
import p082e.p083a.C3401b;
import p082e.p083a.C3403d;
import p082e.p083a.C3409j;

/* renamed from: e.a.o.a */
/* compiled from: ActionBarPolicy */
public class C3431a {

    /* renamed from: a */
    private Context f10898a;

    private C3431a(Context context) {
        this.f10898a = context;
    }

    /* renamed from: b */
    public static C3431a m14635b(Context context) {
        return new C3431a(context);
    }

    /* renamed from: a */
    public boolean mo12158a() {
        return this.f10898a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int mo12159c() {
        return this.f10898a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int mo12160d() {
        Configuration configuration = this.f10898a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: e */
    public int mo12161e() {
        return this.f10898a.getResources().getDimensionPixelSize(C3403d.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: f */
    public int mo12162f() {
        TypedArray obtainStyledAttributes = this.f10898a.obtainStyledAttributes((AttributeSet) null, C3409j.ActionBar, C3400a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C3409j.ActionBar_height, 0);
        Resources resources = this.f10898a.getResources();
        if (!mo12163g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C3403d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: g */
    public boolean mo12163g() {
        return this.f10898a.getResources().getBoolean(C3401b.abc_action_bar_embed_tabs);
    }

    /* renamed from: h */
    public boolean mo12164h() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f10898a).hasPermanentMenuKey();
    }
}
