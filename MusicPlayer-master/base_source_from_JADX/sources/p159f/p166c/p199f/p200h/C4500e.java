package p159f.p166c.p199f.p200h;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import com.un4seen.bass.BASS;

/* renamed from: f.c.f.h.e */
/* compiled from: StatusBarUtils */
public class C4500e {
    /* renamed from: a */
    public static void m19715a(Activity activity) {
        Window window = activity.getWindow();
        window.getDecorView().setSystemUiVisibility(1536);
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
}
