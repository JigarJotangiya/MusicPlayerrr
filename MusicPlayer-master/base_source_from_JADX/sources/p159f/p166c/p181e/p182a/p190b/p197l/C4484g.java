package p159f.p166c.p181e.p182a.p190b.p197l;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import com.un4seen.bass.BASS;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.b.l.g */
/* compiled from: WindowUtils.kt */
public final class C4484g {

    /* renamed from: a */
    public static final C4484g f13081a = new C4484g();

    /* renamed from: b */
    public static int f13082b;

    private C4484g() {
    }

    /* renamed from: a */
    public static final void m19687a(Activity activity) {
        C8594l.m46771e(activity, "activity");
        if (Build.VERSION.SDK_INT >= 19) {
            f13081a.m19688b(activity, true);
            C4478d dVar = new C4478d(activity);
            dVar.mo15182d(true);
            dVar.mo15181c(17170445);
            f13082b = dVar.mo15180b().mo15185g(false);
        }
    }

    @TargetApi(19)
    /* renamed from: b */
    private final void m19688b(Activity activity, boolean z) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (z) {
            attributes.flags |= BASS.BASS_SPEAKER_REAR2;
        } else {
            attributes.flags &= -67108865;
        }
        try {
            window.setAttributes(attributes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
