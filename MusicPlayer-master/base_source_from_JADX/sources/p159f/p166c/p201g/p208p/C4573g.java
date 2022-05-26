package p159f.p166c.p201g.p208p;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import com.un4seen.bass.BASS;
import p082e.p109h.p110h.C3621a;

/* renamed from: f.c.g.p.g */
/* compiled from: StatusBarUtils */
public class C4573g {
    /* renamed from: a */
    public static void m19978a(Activity activity, boolean z) {
        Window window = activity.getWindow();
        if (z) {
            window.getDecorView().setSystemUiVisibility(1536);
        } else {
            window.getDecorView().setSystemUiVisibility(9744);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            if (i >= 29) {
                window.setNavigationBarContrastEnforced(false);
                window.setStatusBarContrastEnforced(false);
            }
        } else if (i >= 19) {
            window.addFlags(BASS.BASS_SPEAKER_REAR2);
            window.addFlags(134217728);
        }
    }

    /* renamed from: b */
    public static boolean m19979b(int i) {
        return C3621a.m15586d(i) >= 0.5d;
    }
}
