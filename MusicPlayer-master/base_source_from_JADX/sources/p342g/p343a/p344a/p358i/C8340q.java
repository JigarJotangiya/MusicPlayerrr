package p342g.p343a.p344a.p358i;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: g.a.a.i.q */
/* compiled from: ScreenUtils */
public class C8340q {

    /* renamed from: g.a.a.i.q$a */
    /* compiled from: ScreenUtils */
    class C8341a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a */
        final /* synthetic */ int f34777a;

        /* renamed from: b */
        final /* synthetic */ View.OnSystemUiVisibilityChangeListener f34778b;

        C8341a(int i, View.OnSystemUiVisibilityChangeListener onSystemUiVisibilityChangeListener) {
            this.f34777a = i;
            this.f34778b = onSystemUiVisibilityChangeListener;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            int i;
            int i2 = 0;
            if (windowInsets != null) {
                int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
                if (systemWindowInsetBottom == this.f34777a) {
                    i2 = 1;
                }
                int i3 = systemWindowInsetBottom;
                i = i2;
                i2 = i3;
            } else {
                i = 0;
            }
            View.OnSystemUiVisibilityChangeListener onSystemUiVisibilityChangeListener = this.f34778b;
            if (onSystemUiVisibilityChangeListener != null && i2 <= this.f34777a) {
                onSystemUiVisibilityChangeListener.onSystemUiVisibilityChange(i);
            }
            return windowInsets;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r4 = r4.getResources();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m46287a(android.content.Context r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r1 = "navigation_bar_height"
            java.lang.String r2 = "dimen"
            java.lang.String r3 = "android"
            int r1 = r4.getIdentifier(r1, r2, r3)
            if (r1 <= 0) goto L_0x0018
            int r0 = r4.getDimensionPixelSize(r1)
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p342g.p343a.p344a.p358i.C8340q.m46287a(android.content.Context):int");
    }

    /* renamed from: b */
    public static void m46288b(Activity activity, View.OnSystemUiVisibilityChangeListener onSystemUiVisibilityChangeListener) {
        if (activity != null) {
            int a = m46287a(activity);
            if (Build.VERSION.SDK_INT >= 20) {
                activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new C8341a(a, onSystemUiVisibilityChangeListener));
            }
        }
    }
}
