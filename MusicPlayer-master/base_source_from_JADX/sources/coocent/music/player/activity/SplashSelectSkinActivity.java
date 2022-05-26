package coocent.music.player.activity;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.p003d.C0524f;
import androidx.fragment.app.C0620p;
import coocent.music.player.base.BaseApplication;
import coocent.musiclibrary.music.p292j.C7397j;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.p461z.C9566f;
import p342g.p343a.p344a.p349f.p352d.C8242b;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8340q;

public class SplashSelectSkinActivity extends AppCompatActivity {

    /* renamed from: coocent.music.player.activity.SplashSelectSkinActivity$a */
    class C6920a implements View.OnSystemUiVisibilityChangeListener {
        C6920a() {
        }

        public void onSystemUiVisibilityChange(int i) {
            if (i == 1) {
                SplashSelectSkinActivity.this.m39650j2(BaseApplication.f31157u);
                return;
            }
            SplashSelectSkinActivity splashSelectSkinActivity = SplashSelectSkinActivity.this;
            splashSelectSkinActivity.m39650j2(C9566f.m50190a(splashSelectSkinActivity, 5));
        }
    }

    /* renamed from: e2 */
    private void m39646e2() {
    }

    /* renamed from: g2 */
    private void m39647g2() {
        C0620p i = mo3730H1().mo3957i();
        i.mo4069c(R.id.fragment, C8242b.m45525h3(), C8242b.f34557G0);
        i.mo3816j();
    }

    /* renamed from: h2 */
    private void m39648h2() {
    }

    /* renamed from: i2 */
    private void m39649i2() {
        setContentView((int) R.layout.activity_splash_select_skin);
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public void m39650j2(int i) {
        try {
            C8242b bVar = (C8242b) mo3730H1().mo3938Y(C8242b.f34557G0);
            ViewGroup.LayoutParams layoutParams = bVar.f34586z0.getLayoutParams();
            layoutParams.height = i;
            bVar.f34586z0.setLayoutParams(layoutParams);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: k2 */
    private void m39651k2() {
        C8340q.m46288b(this, new C6920a());
    }

    /* renamed from: l2 */
    private void m39652l2() {
    }

    /* renamed from: m2 */
    private void m39653m2() {
    }

    /* renamed from: n2 */
    private void m39654n2() {
        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= 21) {
            window.setNavigationBarColor(C0524f.m3223d(getResources(), R.color.sound_effect_bg_color, (Resources.Theme) null));
        }
        C7397j.m41734d(this);
    }

    public void onBackPressed() {
        if (C8337n.m46065k0(this).mo30155U0()) {
            try {
                C8242b bVar = (C8242b) mo3730H1().mo3938Y(C8242b.f34557G0);
                if (bVar != null) {
                    bVar.mo29932q3();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m39654n2();
        m39646e2();
        m39649i2();
        m39652l2();
        m39653m2();
        m39647g2();
        m39648h2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m39651k2();
    }
}
