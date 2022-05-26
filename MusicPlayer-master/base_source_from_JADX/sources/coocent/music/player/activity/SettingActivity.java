package coocent.music.player.activity;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.content.p003d.C0524f;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.fragment.setting.SettingFragment;
import coocent.music.player.widget.DeepDefaultTitle;
import coocent.musiclibrary.music.p292j.C7397j;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.ads.AdHelper;
import net.coocent.android.xmlparser.p461z.C9566f;
import p342g.p343a.p344a.p346c.C7970w;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8340q;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;

public class SettingActivity extends AnimationActivity {

    /* renamed from: A */
    private DeepDefaultTitle f30796A;

    /* renamed from: B */
    private RelativeLayout f30797B;

    /* renamed from: C */
    private C6902c f30798C;

    /* renamed from: D */
    C7970w f30799D = new C6900a();

    /* renamed from: z */
    private ImageView f30800z;

    /* renamed from: coocent.music.player.activity.SettingActivity$a */
    class C6900a extends C7970w {
        C6900a() {
        }

        /* renamed from: t */
        public void mo26591t() {
            SettingActivity.this.finish();
        }
    }

    /* renamed from: coocent.music.player.activity.SettingActivity$b */
    class C6901b implements View.OnSystemUiVisibilityChangeListener {
        C6901b() {
        }

        public void onSystemUiVisibilityChange(int i) {
            if (i == 1) {
                SettingActivity.this.m39494i2(BaseApplication.f31157u);
                return;
            }
            SettingActivity settingActivity = SettingActivity.this;
            settingActivity.m39494i2(C9566f.m50190a(settingActivity, 5));
        }
    }

    /* renamed from: coocent.music.player.activity.SettingActivity$c */
    private class C6902c extends BroadcastReceiver {
        private C6902c() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.WAKEUP.EXIT")) {
                SettingActivity.this.finish();
            }
        }

        /* synthetic */ C6902c(SettingActivity settingActivity, C6900a aVar) {
            this();
        }
    }

    /* renamed from: e2 */
    private void m39491e2() {
        getFragmentManager().beginTransaction().add(R.id.settting_fragment, new SettingFragment()).commit();
    }

    /* renamed from: g2 */
    private void m39492g2() {
        this.f30798C = new C6902c(this, (C6900a) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.WAKEUP.EXIT");
        registerReceiver(this.f30798C, intentFilter);
    }

    /* renamed from: h2 */
    private void m39493h2() {
        setContentView((int) R.layout.activity_setting);
        findViewById(R.id.bg_cover).setVisibility(C8343s.f34787b ? 0 : 8);
        ImageView imageView = (ImageView) findViewById(R.id.ivmianbg);
        this.f30800z = imageView;
        C8343s.m46307o(imageView, false);
        this.f30797B = (RelativeLayout) findViewById(R.id.bottom_control);
        AdHelper.m49536p().mo32441b(this, (ViewGroup) findViewById(R.id.ad_layout));
        m39495j2();
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public void m39494i2(int i) {
        RelativeLayout relativeLayout = this.f30797B;
        if (relativeLayout != null) {
            relativeLayout.setPadding(relativeLayout.getPaddingLeft(), this.f30797B.getPaddingTop(), this.f30797B.getPaddingRight(), i);
        }
    }

    /* renamed from: j2 */
    private void m39495j2() {
        DeepDefaultTitle deepDefaultTitle = (DeepDefaultTitle) findViewById(R.id.defualt_title);
        this.f30796A = deepDefaultTitle;
        deepDefaultTitle.mo27431B(true, true);
        this.f30796A.setHomeIcon(false);
        this.f30796A.setMenuIcon(false);
        this.f30796A.setSearchIcon(false);
        this.f30796A.setEqIcon(false);
        this.f30796A.setTitleText(C8345u.m46333n(R.string.setting));
        this.f30796A.setTitleOnClickListener(this.f30799D);
        this.f30796A.setUpToolbarGift(this);
    }

    /* renamed from: k2 */
    private void m39496k2() {
        Window window = getWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            window.setNavigationBarColor(C0524f.m3223d(getResources(), R.color.sound_effect_bg_color, (Resources.Theme) null));
        }
        if (C8343s.f34788c == BaseApplication.f31162z) {
            window.getDecorView().setSystemUiVisibility(8208);
            if (i >= 21) {
                window.setNavigationBarColor(-1);
            }
        }
        C7397j.m41734d(this);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m39496k2();
        m39493h2();
        m39491e2();
        m39492g2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C8321j.m45995a(this.f30800z);
        if (this.f30796A != null) {
            this.f30796A = null;
        }
        if (this.f30797B != null) {
            this.f30797B = null;
        }
        C6902c cVar = this.f30798C;
        if (cVar != null) {
            unregisterReceiver(cVar);
            this.f30798C = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C8340q.m46288b(this, new C6901b());
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"MissingSuperCall"})
    public void onSaveInstanceState(Bundle bundle) {
    }
}
