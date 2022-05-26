package coocent.music.player.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.coocent.music.base.data.entity.Music;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.widget.NoScrollTabLayout;
import coocent.musiclibrary.music.p283d.C7327b;
import java.util.ArrayList;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p355g.C8287e;

public class TestActivity extends BaseActivity {

    /* renamed from: B */
    ArrayList<Music> f30879B;

    /* renamed from: C */
    int f30880C = 20;

    /* renamed from: coocent.music.player.activity.TestActivity$a */
    class C6921a implements View.OnClickListener {
        C6921a(TestActivity testActivity) {
        }

        public void onClick(View view) {
            C8287e.m45835e0();
        }
    }

    /* renamed from: coocent.music.player.activity.TestActivity$b */
    class C6922b implements View.OnClickListener {
        C6922b() {
        }

        public void onClick(View view) {
            TestActivity testActivity = TestActivity.this;
            C8287e.m45830c1(testActivity.f30880C, testActivity.f30879B);
        }
    }

    /* renamed from: coocent.music.player.activity.TestActivity$c */
    class C6923c implements View.OnClickListener {
        C6923c(TestActivity testActivity) {
        }

        public void onClick(View view) {
            C8287e.m45832d0();
        }
    }

    /* renamed from: coocent.music.player.activity.TestActivity$d */
    class C6924d implements View.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ NoScrollTabLayout f30882g;

        C6924d(TestActivity testActivity, NoScrollTabLayout noScrollTabLayout) {
            this.f30882g = noScrollTabLayout;
        }

        public void onClick(View view) {
            if (this.f30882g.getVisibility() == 8) {
                this.f30882g.setVisibility(0);
            } else if (this.f30882g.getVisibility() == 0) {
                this.f30882g.setVisibility(8);
            }
        }
    }

    /* renamed from: i2 */
    public Fragment mo26492i2() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_test);
        this.f30879B = C7327b.m41493a(this, BaseApplication.f31150n);
        findViewById(R.id.prev).setOnClickListener(new C6921a(this));
        findViewById(R.id.playorpause).setOnClickListener(new C6922b());
        findViewById(R.id.next).setOnClickListener(new C6923c(this));
        ((RelativeLayout) findViewById(R.id.rl_bottom_bar_group)).getLayoutTransition().enableTransitionType(4);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.bottom_play_bar);
        findViewById(R.id.animation).setOnClickListener(new C6924d(this, (NoScrollTabLayout) findViewById(R.id.tabs)));
    }
}
