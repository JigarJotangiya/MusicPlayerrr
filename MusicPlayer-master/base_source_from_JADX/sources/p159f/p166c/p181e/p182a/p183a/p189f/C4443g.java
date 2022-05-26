package p159f.p166c.p181e.p182a.p183a.p189f;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.a.f.g */
/* compiled from: ScreenUtils.kt */
public final class C4443g {

    /* renamed from: a */
    public static final C4443g f13019a = new C4443g();

    /* renamed from: f.c.e.a.a.f.g$a */
    /* compiled from: ScreenUtils.kt */
    static final class C4444a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a */
        final /* synthetic */ int f13020a;

        /* renamed from: b */
        final /* synthetic */ View.OnSystemUiVisibilityChangeListener f13021b;

        C4444a(int i, View.OnSystemUiVisibilityChangeListener onSystemUiVisibilityChangeListener) {
            this.f13020a = i;
            this.f13021b = onSystemUiVisibilityChangeListener;
        }

        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            int i;
            int i2 = 0;
            if (windowInsets != null) {
                int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
                if (systemWindowInsetBottom == this.f13020a) {
                    i2 = 1;
                }
                int i3 = systemWindowInsetBottom;
                i = i2;
                i2 = i3;
            } else {
                i = 0;
            }
            View.OnSystemUiVisibilityChangeListener onSystemUiVisibilityChangeListener = this.f13021b;
            if (onSystemUiVisibilityChangeListener != null && i2 <= this.f13020a) {
                onSystemUiVisibilityChangeListener.onSystemUiVisibilityChange(i);
            }
            return windowInsets;
        }
    }

    private C4443g() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r5 = r5.getResources();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo15133a(android.content.Context r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r1 = "navigation_bar_height"
            java.lang.String r2 = "dimen"
            java.lang.String r3 = "android"
            int r1 = r5.getIdentifier(r1, r2, r3)
            if (r1 <= 0) goto L_0x0018
            int r0 = r5.getDimensionPixelSize(r1)
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4443g.mo15133a(android.content.Context):int");
    }

    /* renamed from: b */
    public final void mo15134b(Activity activity, View.OnSystemUiVisibilityChangeListener onSystemUiVisibilityChangeListener) {
        if (activity != null) {
            int a = mo15133a(activity);
            if (Build.VERSION.SDK_INT >= 20) {
                Window window = activity.getWindow();
                C8594l.m46770d(window, "activity.window");
                window.getDecorView().setOnApplyWindowInsetsListener(new C4444a(a, onSystemUiVisibilityChangeListener));
            }
        }
    }
}
