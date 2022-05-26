package p159f.p166c.p181e.p182a.p183a.p189f;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.a.f.i */
/* compiled from: WindowUtils.kt */
public final class C4446i {

    /* renamed from: a */
    public static final C4446i f13022a = new C4446i();

    private C4446i() {
    }

    /* renamed from: a */
    public final int mo15136a(Context context, int i) {
        C8594l.m46771e(context, "context");
        Resources resources = context.getResources();
        C8594l.m46770d(resources, "context.resources");
        return (int) ((((float) i) * resources.getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    public final int mo15137b(Context context) {
        C8594l.m46771e(context, "context");
        if (context.getResources().getIdentifier("config_showNavigationBar", "bool", "android") == 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    /* renamed from: c */
    public final int mo15138c(Context context) {
        C8594l.m46771e(context, "context");
        new DisplayMetrics();
        Resources resources = context.getResources();
        C8594l.m46770d(resources, "context.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        C8594l.m46770d(displayMetrics, "context.resources.displayMetrics");
        return displayMetrics.widthPixels;
    }
}
