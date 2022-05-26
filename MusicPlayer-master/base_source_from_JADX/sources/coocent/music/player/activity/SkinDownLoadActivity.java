package coocent.music.player.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.un4seen.bass.BASS;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.skin.net.C7118c;
import coocent.music.player.skin.net.MySkinEntity;
import coocent.music.player.skin.p272a.C7100b;
import coocent.music.player.widget.DeepDefaultTitle;
import coocent.musiclibrary.music.p292j.C7397j;
import java.util.concurrent.Executors;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.p461z.C9566f;
import p342g.p343a.p344a.p346c.C7970w;
import p342g.p343a.p344a.p347d.C7975e;
import p342g.p343a.p344a.p348e.C7987i;
import p342g.p343a.p344a.p348e.C7989j;
import p342g.p343a.p344a.p348e.C8007o;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8311c;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8334l;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8340q;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8344t;

public class SkinDownLoadActivity extends AnimationActivity implements C7100b {

    /* renamed from: A */
    private ImageView f30829A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public ImageView f30830B;

    /* renamed from: C */
    private MySkinEntity f30831C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public TextView f30832D;

    /* renamed from: E */
    private RelativeLayout f30833E;

    /* renamed from: F */
    private C7118c f30834F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public ProgressBar f30835G;

    /* renamed from: H */
    private boolean f30836H = false;

    /* renamed from: I */
    private TextView f30837I;

    /* renamed from: J */
    private View f30838J;

    /* renamed from: K */
    private RelativeLayout f30839K;

    /* renamed from: L */
    private C6913f f30840L;

    /* renamed from: z */
    private DeepDefaultTitle f30841z;

    /* renamed from: coocent.music.player.activity.SkinDownLoadActivity$a */
    class C6908a implements View.OnSystemUiVisibilityChangeListener {
        C6908a() {
        }

        public void onSystemUiVisibilityChange(int i) {
            if (i == 1) {
                SkinDownLoadActivity.this.m39558t2(BaseApplication.f31157u);
                return;
            }
            SkinDownLoadActivity skinDownLoadActivity = SkinDownLoadActivity.this;
            skinDownLoadActivity.m39558t2(C9566f.m50190a(skinDownLoadActivity, 5));
        }
    }

    /* renamed from: coocent.music.player.activity.SkinDownLoadActivity$b */
    class C6909b extends C7970w {
        C6909b() {
        }

        /* renamed from: t */
        public void mo26591t() {
            SkinDownLoadActivity.this.m39553o2();
        }
    }

    /* renamed from: coocent.music.player.activity.SkinDownLoadActivity$c */
    class C6910c implements ViewTreeObserver.OnGlobalLayoutListener {
        C6910c() {
        }

        public void onGlobalLayout() {
            SkinDownLoadActivity.this.f30830B.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ViewGroup.LayoutParams layoutParams = SkinDownLoadActivity.this.f30830B.getLayoutParams();
            layoutParams.width = (SkinDownLoadActivity.this.f30830B.getHeight() * BASS.BASS_ERROR_JAVA_CLASS) / 889;
            SkinDownLoadActivity.this.f30830B.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: coocent.music.player.activity.SkinDownLoadActivity$d */
    class C6911d implements View.OnClickListener {
        C6911d() {
        }

        public void onClick(View view) {
            if (view.getId() == R.id.rl_progress) {
                SkinDownLoadActivity.this.m39559u2();
            }
        }
    }

    /* renamed from: coocent.music.player.activity.SkinDownLoadActivity$e */
    class C6912e implements Runnable {

        /* renamed from: g */
        final /* synthetic */ int f30846g;

        C6912e(int i) {
            this.f30846g = i;
        }

        public void run() {
            if (SkinDownLoadActivity.this.f30835G != null && this.f30846g >= 0) {
                SkinDownLoadActivity.this.f30835G.setProgress(this.f30846g);
            } else if (SkinDownLoadActivity.this.f30835G != null) {
                SkinDownLoadActivity.this.f30835G.setProgress(0);
            }
            if (SkinDownLoadActivity.this.f30832D != null) {
                int i = this.f30846g;
                if (i >= 100) {
                    SkinDownLoadActivity.this.mo26772v2(true);
                    SkinDownLoadActivity.this.f30832D.setText(SkinDownLoadActivity.this.getResources().getString(R.string.apply));
                } else if (i < 0 || i >= 100) {
                    SkinDownLoadActivity.this.mo26772v2(true);
                    SkinDownLoadActivity.this.f30832D.setText(SkinDownLoadActivity.this.getResources().getString(R.string.load_failed));
                } else {
                    SkinDownLoadActivity.this.mo26772v2(false);
                    TextView j2 = SkinDownLoadActivity.this.f30832D;
                    j2.setText(SkinDownLoadActivity.this.getResources().getString(R.string.loading_skin) + " " + this.f30846g + "%");
                }
            }
        }
    }

    /* renamed from: coocent.music.player.activity.SkinDownLoadActivity$f */
    private class C6913f extends BroadcastReceiver {
        private C6913f() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.WAKEUP.EXIT")) {
                SkinDownLoadActivity.this.finish();
            }
        }

        /* synthetic */ C6913f(SkinDownLoadActivity skinDownLoadActivity, C6908a aVar) {
            this();
        }
    }

    /* renamed from: l2 */
    private void m39550l2() {
        C8344t.m46317e(this, getResources().getString(R.string.error));
        finish();
    }

    /* renamed from: m2 */
    private void m39551m2() {
        MySkinEntity mySkinEntity = (MySkinEntity) getIntent().getParcelableExtra("skinEntity");
        this.f30831C = mySkinEntity;
        if (mySkinEntity == null) {
            m39550l2();
        }
    }

    /* renamed from: n2 */
    private void m39552n2() {
        if (C8334l.m46054a(this)) {
            C7118c cVar = this.f30834F;
            if (cVar != null && cVar.getStatus() == AsyncTask.Status.RUNNING) {
                this.f30834F.cancel(true);
                this.f30834F = null;
            }
            C7118c cVar2 = new C7118c(this.f30831C);
            this.f30834F = cVar2;
            cVar2.mo27340e(this);
            this.f30834F.executeOnExecutor(Executors.newCachedThreadPool(), new Void[0]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public void m39553o2() {
        finish();
    }

    /* renamed from: p2 */
    private void m39554p2() {
        mo26772v2(true);
    }

    /* renamed from: q2 */
    private void m39555q2() {
        this.f30840L = new C6913f(this, (C6908a) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.WAKEUP.EXIT");
        registerReceiver(this.f30840L, intentFilter);
    }

    /* renamed from: r2 */
    private void m39556r2() {
        setContentView((int) R.layout.activity_skin_download);
        this.f30841z = (DeepDefaultTitle) findViewById(R.id.defualt_title);
        this.f30829A = (ImageView) findViewById(R.id.ivmianbg);
        this.f30830B = (ImageView) findViewById(R.id.iv_skin);
        this.f30832D = (TextView) findViewById(R.id.tv_progress);
        this.f30833E = (RelativeLayout) findViewById(R.id.rl_progress);
        this.f30835G = (ProgressBar) findViewById(R.id.progress);
        this.f30837I = (TextView) findViewById(R.id.tv_flow);
        this.f30838J = findViewById(R.id.underline);
        this.f30839K = (RelativeLayout) findViewById(R.id.bottom_control);
    }

    /* renamed from: s2 */
    private void m39557s2() {
        Window window = getWindow();
        if (C8343s.f34788c == BaseApplication.f31138A) {
            window.getDecorView().setSystemUiVisibility(9232);
        } else {
            window.getDecorView().setSystemUiVisibility(1024);
        }
        DeepDefaultTitle deepDefaultTitle = this.f30841z;
        if (deepDefaultTitle != null) {
            deepDefaultTitle.mo27432C();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public void m39558t2(int i) {
        RelativeLayout relativeLayout = this.f30839K;
        if (relativeLayout != null) {
            relativeLayout.setPadding(relativeLayout.getPaddingLeft(), this.f30839K.getPaddingTop(), this.f30839K.getPaddingRight(), i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public void m39559u2() {
        if (!this.f30836H) {
            return;
        }
        if (C7975e.m43662d(this).mo29514b(this.f30831C.mo27305a())) {
            mo26772v2(false);
            MySkinEntity f = C7975e.m43662d(this).mo29517f(this.f30831C.mo27305a());
            if (f != null) {
                int k = C8287e.m45851k(C8287e.m45857n(this), this.f30831C.mo27306b());
                if (this.f30831C.mo27305a() == BaseApplication.f31162z || (f.mo27307d().equals(this.f30831C.mo27307d()) && k >= 0)) {
                    mo26769A2();
                } else if (k < 0) {
                    C7989j.m43705j3(getResources().getString(R.string.update_skin_title), getResources().getString(R.string.user_theme_need_update_app_tip)).mo3841h3(mo3730H1(), "UPDATE_SKIN");
                } else if (!f.mo27307d().equals(this.f30831C.mo27307d())) {
                    String string = getResources().getString(R.string.update_skin_title);
                    C8007o.m43739i3(string, getResources().getString(R.string.use_theme_need_update_skin_tip) + "(" + this.f30831C.mo27312h() + ")").mo3841h3(mo3730H1(), "UPDATE_SKIN");
                }
            } else {
                Toast.makeText(this, R.string.not_found_skin, 1);
                mo26771k2();
            }
        } else if (C8287e.m45851k(C8287e.m45857n(this), this.f30831C.mo27306b()) >= 0) {
            mo26772v2(false);
            mo26771k2();
        } else {
            C7987i.m43701j3(getResources().getString(R.string.update_title), getResources().getString(R.string.download_theme_need_update_app_tip)).mo3841h3(mo3730H1(), "UPDATE_TIP");
        }
    }

    /* renamed from: w2 */
    private void m39560w2() {
        if (C7975e.m43662d(this).mo29514b(this.f30831C.mo27305a())) {
            this.f30832D.setText(R.string.apply);
        } else {
            this.f30832D.setText(R.string.download_skin);
        }
    }

    /* renamed from: x2 */
    private void m39561x2() {
        this.f30841z.mo27431B(true, true);
        this.f30841z.setHomeIcon(false);
        this.f30841z.setSearchIcon(false);
        this.f30841z.setThemeIcon(false);
        this.f30841z.setTitleText(this.f30831C.mo27309e());
        this.f30841z.setMyText(false);
        if (C8343s.f34788c == BaseApplication.f31138A) {
            this.f30838J.setVisibility(8);
        } else {
            this.f30838J.setVisibility(0);
        }
        C8321j.m45998d(this, this.f30831C.mo27310f(), R.drawable.theme_img_default, this.f30830B);
        m39560w2();
        this.f30835G.setMax(100);
        this.f30837I.setText(this.f30831C.mo27312h());
    }

    /* renamed from: y2 */
    private void m39562y2() {
        this.f30841z.setTitleOnClickListener(new C6909b());
        this.f30830B.getViewTreeObserver().addOnGlobalLayoutListener(new C6910c());
        this.f30833E.setOnClickListener(new C6911d());
    }

    /* renamed from: z2 */
    private void m39563z2() {
        if (BaseApplication.f31159w && BaseApplication.f31158v) {
            getWindow();
        }
        m39557s2();
        C7397j.m41734d(this);
    }

    /* renamed from: A2 */
    public void mo26769A2() {
        MySkinEntity mySkinEntity = this.f30831C;
        if (mySkinEntity != null) {
            BaseApplication.f31141D = true;
            C8343s.m46306n(mySkinEntity.mo27305a());
            C8337n.m46065k0(this).mo30277y1(this.f30831C.mo27305a());
            sendBroadcast(new Intent(C8311c.f34737d));
            this.f30832D.setText(getResources().getString(R.string.apply));
            m39557s2();
            finish();
            return;
        }
        C8344t.m46316d(this, R.string.error);
    }

    /* renamed from: L0 */
    public void mo26770L0(int i) {
        runOnUiThread(new C6912e(i));
    }

    /* renamed from: k2 */
    public void mo26771k2() {
        TextView textView = this.f30832D;
        textView.setText(getResources().getString(R.string.loading_skin) + " " + 0 + "%");
        m39552n2();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m39563z2();
        m39551m2();
        m39556r2();
        m39554p2();
        m39561x2();
        m39562y2();
        m39555q2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C7118c cVar = this.f30834F;
        if (cVar != null) {
            cVar.cancel(true);
            this.f30834F = null;
        }
        if (this.f30841z != null) {
            this.f30841z = null;
        }
        C8321j.m45995a(this.f30829A);
        C8321j.m45995a(this.f30830B);
        if (this.f30831C != null) {
            this.f30831C = null;
        }
        if (this.f30833E != null) {
            this.f30833E = null;
        }
        if (this.f30835G != null) {
            this.f30835G = null;
        }
        if (this.f30839K != null) {
            this.f30839K = null;
        }
        C6913f fVar = this.f30840L;
        if (fVar != null) {
            unregisterReceiver(fVar);
            this.f30840L = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C8340q.m46288b(this, new C6908a());
    }

    /* renamed from: v2 */
    public void mo26772v2(boolean z) {
        this.f30836H = z;
    }
}
