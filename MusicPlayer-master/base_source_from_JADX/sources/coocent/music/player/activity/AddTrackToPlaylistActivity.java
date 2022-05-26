package coocent.music.player.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.C0620p;
import coocent.music.player.base.BaseApplication;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p349f.p351c.C8127k2;
import p342g.p343a.p344a.p358i.C8343s;

public class AddTrackToPlaylistActivity extends AnimationActivity {
    /* renamed from: d2 */
    private void m38755d2() {
        C0620p i = mo3730H1().mo3957i();
        i.mo4068b(R.id.fragment, C8127k2.m44717Q3(0));
        i.mo3816j();
    }

    /* renamed from: e2 */
    private void m38756e2() {
        findViewById(R.id.statusView).getLayoutParams().height = BaseApplication.f31145H;
    }

    /* renamed from: g2 */
    private void m38757g2() {
        if (C8343s.f34788c == BaseApplication.f31162z) {
            Window window = getWindow();
            window.getDecorView().setSystemUiVisibility(8208);
            if (Build.VERSION.SDK_INT >= 21) {
                window.setNavigationBarColor(-1);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m38757g2();
        setContentView((int) R.layout.activity_add_track_to_playlist);
        m38756e2();
        m38755d2();
    }
}
