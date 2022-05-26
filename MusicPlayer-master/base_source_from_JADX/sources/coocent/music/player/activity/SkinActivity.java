package coocent.music.player.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.C0602j;
import androidx.fragment.app.C0620p;
import androidx.fragment.app.Fragment;
import coocent.music.player.adapter.SkinListAdapter;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.widget.DeepDefaultTitle;
import coocent.musiclibrary.music.p292j.C7397j;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.p461z.C9566f;
import p342g.p343a.p344a.p346c.C7970w;
import p342g.p343a.p344a.p349f.p352d.C8240a;
import p342g.p343a.p344a.p358i.C8311c;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8340q;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8344t;
import p342g.p343a.p344a.p358i.C8345u;

public class SkinActivity extends AnimationActivity {

    /* renamed from: A */
    private ImageView f30804A;

    /* renamed from: B */
    private int f30805B;

    /* renamed from: C */
    private View f30806C;

    /* renamed from: D */
    private RelativeLayout f30807D;

    /* renamed from: E */
    private C6905c f30808E;

    /* renamed from: z */
    private DeepDefaultTitle f30809z;

    /* renamed from: coocent.music.player.activity.SkinActivity$a */
    class C6903a implements View.OnSystemUiVisibilityChangeListener {
        C6903a() {
        }

        public void onSystemUiVisibilityChange(int i) {
            if (i == 1) {
                SkinActivity.this.m39509p2(BaseApplication.f31157u);
                return;
            }
            SkinActivity skinActivity = SkinActivity.this;
            skinActivity.m39509p2(C9566f.m50190a(skinActivity, 5));
        }
    }

    /* renamed from: coocent.music.player.activity.SkinActivity$b */
    class C6904b extends C7970w {
        C6904b() {
        }

        /* renamed from: f */
        public void mo26760f() {
            SkinActivity.this.m39504k2();
        }

        /* renamed from: t */
        public void mo26591t() {
            SkinActivity.this.m39503j2();
        }
    }

    /* renamed from: coocent.music.player.activity.SkinActivity$c */
    private class C6905c extends BroadcastReceiver {
        private C6905c() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action == null) {
                return;
            }
            if (action.equals(C8311c.f34737d)) {
                SkinActivity.this.finish();
            } else if (action.equals("media.musicplayer.audioplayer.videoplayer.WAKEUP.EXIT")) {
                SkinActivity.this.finish();
            }
        }

        /* synthetic */ C6905c(SkinActivity skinActivity, C6903a aVar) {
            this();
        }
    }

    /* renamed from: h2 */
    private void m39501h2() {
        C8344t.m46317e(this, getResources().getString(R.string.error));
        finish();
    }

    /* renamed from: i2 */
    private void m39502i2() {
        Intent intent = getIntent();
        if (intent != null) {
            this.f30805B = intent.getIntExtra("pageType", -1);
        } else {
            m39501h2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public void m39503j2() {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public void m39504k2() {
    }

    /* renamed from: l2 */
    private void m39505l2() {
        C8240a h3 = C8240a.m45504h3(this.f30805B, false);
        C0620p i = mo3730H1().mo3957i();
        i.mo4069c(R.id.fragment, h3, C8240a.f34545n0);
        i.mo3816j();
    }

    /* renamed from: m2 */
    private void m39506m2() {
        this.f30808E = new C6905c(this, (C6903a) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(C8311c.f34737d);
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.WAKEUP.EXIT");
        registerReceiver(this.f30808E, intentFilter);
    }

    /* renamed from: n2 */
    private void m39507n2() {
        setContentView((int) R.layout.activity_all_skin);
        this.f30809z = (DeepDefaultTitle) findViewById(R.id.defualt_title);
        this.f30804A = (ImageView) findViewById(R.id.ivmianbg);
        this.f30806C = findViewById(R.id.underline);
        this.f30807D = (RelativeLayout) findViewById(R.id.bottom_control);
    }

    /* renamed from: o2 */
    private void m39508o2() {
        Window window = getWindow();
        if (C8343s.f34788c == BaseApplication.f31138A) {
            window.getDecorView().setSystemUiVisibility(9232);
        } else {
            window.getDecorView().setSystemUiVisibility(1024);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public void m39509p2(int i) {
        RelativeLayout relativeLayout = this.f30807D;
        if (relativeLayout != null) {
            relativeLayout.setPadding(relativeLayout.getPaddingLeft(), this.f30807D.getPaddingTop(), this.f30807D.getPaddingRight(), i);
        }
    }

    /* renamed from: q2 */
    private void m39510q2() {
        Fragment Y;
        SkinListAdapter c3;
        C0602j H1 = mo3730H1();
        if (H1 != null && (Y = H1.mo3938Y(C8240a.f34545n0)) != null && (Y instanceof C8240a) && (c3 = ((C8240a) Y).mo29929c3()) != null) {
            c3.notifyDataSetChanged();
        }
    }

    /* renamed from: r2 */
    private void m39511r2() {
        this.f30809z.mo27431B(true, true);
        this.f30809z.setHomeIcon(false);
        this.f30809z.setSearchIcon(false);
        this.f30809z.setThemeIcon(false);
        int i = this.f30805B;
        if (i == 0) {
            this.f30809z.setTitleText(C8345u.m46333n(R.string.theme));
            this.f30809z.setMyText(true);
        } else if (i == 1) {
            this.f30809z.setTitleText(C8345u.m46333n(R.string.My));
            this.f30809z.setMyText(false);
        }
        if (C8343s.f34788c == BaseApplication.f31138A) {
            this.f30806C.setVisibility(8);
        } else {
            this.f30806C.setVisibility(0);
        }
    }

    /* renamed from: s2 */
    private void m39512s2() {
        this.f30809z.setTitleOnClickListener(new C6904b());
    }

    /* renamed from: t2 */
    private void m39513t2() {
        if (BaseApplication.f31159w && BaseApplication.f31158v) {
            getWindow();
        }
        if (C8343s.f34788c == BaseApplication.f31138A) {
            getWindow().getDecorView().setSystemUiVisibility(9232);
        }
        C7397j.m41734d(this);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m39508o2();
        m39510q2();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m39513t2();
        m39502i2();
        m39507n2();
        m39511r2();
        m39512s2();
        m39505l2();
        m39506m2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f30809z != null) {
            this.f30809z = null;
        }
        C8321j.m45995a(this.f30804A);
        if (this.f30806C != null) {
            this.f30806C = null;
        }
        if (this.f30807D != null) {
            this.f30807D = null;
        }
        C6905c cVar = this.f30808E;
        if (cVar != null) {
            unregisterReceiver(cVar);
            this.f30808E = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C8340q.m46288b(this, new C6903a());
    }
}
