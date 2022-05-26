package coocent.music.player.widget.ringtone;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import java.io.PrintStream;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: coocent.music.player.widget.ringtone.h */
/* compiled from: SoftKeyBoardListener */
public class C7292h {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public View f32221a;

    /* renamed from: b */
    int f32222b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C7294b f32223c;

    /* renamed from: coocent.music.player.widget.ringtone.h$a */
    /* compiled from: SoftKeyBoardListener */
    class C7293a implements ViewTreeObserver.OnGlobalLayoutListener {
        C7293a() {
        }

        public void onGlobalLayout() {
            Rect rect = new Rect();
            C7292h.this.f32221a.getWindowVisibleDisplayFrame(rect);
            int height = rect.height();
            PrintStream printStream = System.out;
            printStream.println(BuildConfig.FLAVOR + height);
            C7292h hVar = C7292h.this;
            int i = hVar.f32222b;
            if (i == 0) {
                hVar.f32222b = height;
            } else if (i != height) {
                if (i - height > 200) {
                    if (hVar.f32223c != null) {
                        C7292h.this.f32223c.mo26588b(C7292h.this.f32222b - height);
                    }
                    C7292h.this.f32222b = height;
                } else if (height - i > 200) {
                    if (hVar.f32223c != null) {
                        C7292h.this.f32223c.mo26587a(height - C7292h.this.f32222b);
                    }
                    C7292h.this.f32222b = height;
                }
            }
        }
    }

    /* renamed from: coocent.music.player.widget.ringtone.h$b */
    /* compiled from: SoftKeyBoardListener */
    public interface C7294b {
        /* renamed from: a */
        void mo26587a(int i);

        /* renamed from: b */
        void mo26588b(int i);
    }

    public C7292h(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        this.f32221a = decorView;
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(new C7293a());
    }

    /* renamed from: c */
    public static void m41355c(Activity activity, C7294b bVar) {
        new C7292h(activity).m41356d(bVar);
    }

    /* renamed from: d */
    private void m41356d(C7294b bVar) {
        this.f32223c = bVar;
    }
}
