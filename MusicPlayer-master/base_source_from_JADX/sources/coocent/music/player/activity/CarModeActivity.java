package coocent.music.player.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.coocent.library.CarModeView;
import coocent.music.player.mode.SoundEffect;
import coocent.music.player.widget.p275k.C7238p0;
import coocent.musiclibrary.music.p292j.C7393h;
import coocent.musiclibrary.music.p292j.C7397j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.ads.AdHelper;
import p342g.p343a.p344a.p346c.C7948a;
import p342g.p343a.p344a.p346c.C7956i;
import p342g.p343a.p344a.p346c.C7958k;
import p342g.p343a.p344a.p346c.C7963p;
import p342g.p343a.p344a.p346c.C7969v;
import p342g.p343a.p344a.p347d.C7973c;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8311c;
import p342g.p343a.p344a.p358i.C8314f;
import p342g.p343a.p344a.p358i.C8316h;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8344t;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class CarModeActivity extends BaseActivity implements CarModeView.C2224a, C7958k, C7969v, C7956i, C7963p, C7948a {
    /* access modifiers changed from: private */

    /* renamed from: B */
    public CarModeView f30397B;

    /* renamed from: C */
    private C6816b f30398C;

    /* renamed from: D */
    private C6817c f30399D;

    /* renamed from: E */
    private Timer f30400E;

    /* renamed from: F */
    private TimerTask f30401F;

    /* renamed from: G */
    private ImageView f30402G;

    /* renamed from: H */
    private C7238p0 f30403H;

    /* renamed from: I */
    private C8316h f30404I;

    /* renamed from: coocent.music.player.activity.CarModeActivity$b */
    private class C6816b extends BroadcastReceiver {
        private C6816b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void mo26521b() {
            CarModeActivity.this.f30397B.setPlaying(C8287e.m45812V());
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action != null && action.equals(C8311c.f34738e) && CarModeActivity.this.f30397B != null) {
                new Handler().postDelayed(new C6948a(this), 800);
                C7393h.m41695f(CarModeActivity.this).mo28189k(true);
            }
        }
    }

    /* renamed from: coocent.music.player.activity.CarModeActivity$c */
    public static class C6817c extends Handler {

        /* renamed from: a */
        private final WeakReference<CarModeActivity> f30406a;

        public C6817c(CarModeActivity carModeActivity) {
            this.f30406a = new WeakReference<>(carModeActivity);
        }

        public void handleMessage(Message message) {
            Bundle data;
            int i;
            CarModeActivity carModeActivity = (CarModeActivity) this.f30406a.get();
            if (carModeActivity != null && message.what == 1 && (data = message.getData()) != null && (i = data.getInt("progress")) >= 0) {
                double u = C8287e.m45871u();
                float f = u == 0.0d ? 0.0f : ((float) (((double) (((float) i) * 100.0f)) / u)) / 100.0f;
                if (carModeActivity.f30397B != null) {
                    carModeActivity.f30397B.setPercentage(f);
                }
            }
        }
    }

    /* renamed from: A2 */
    public static void m38778A2(Context context) {
        context.startActivity(new Intent(context, CarModeActivity.class));
    }

    /* renamed from: B2 */
    private void m38779B2() {
        C7238p0 p0Var = this.f30403H;
        if (p0Var != null) {
            p0Var.mo27802J();
            this.f30403H.mo27799G();
        }
    }

    /* renamed from: o2 */
    private void m38780o2(boolean z) {
        if (C8287e.m45812V() || z) {
            C8287e.m45819Y0(this.f30400E, this.f30401F, this.f30399D, this);
        } else {
            C8287e.m45827b1(this.f30400E, this.f30401F);
        }
    }

    /* renamed from: q2 */
    private void m38782q2() {
        if (this.f30403H == null) {
            C7238p0 p0Var = new C7238p0(this, true, C7238p0.f31963F);
            this.f30403H = p0Var;
            p0Var.mo27806P(this);
        }
        this.f30399D = new C6817c(this);
        m38780o2(true);
        this.f30404I = new C8316h(this);
    }

    /* renamed from: r2 */
    private void m38783r2() {
        this.f30398C = new C6816b();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(C8311c.f34738e);
        registerReceiver(this.f30398C, intentFilter);
    }

    /* renamed from: s2 */
    private void m38784s2() {
        setContentView((int) R.layout.activity_car_mode);
        this.f30397B = (CarModeView) findViewById(R.id.carModeView);
        this.f30402G = (ImageView) findViewById(R.id.iv_bg);
        AdHelper.m49536p().mo32441b(this, (ViewGroup) findViewById(R.id.ad_layout));
    }

    /* renamed from: t2 */
    private void m38785t2() {
        if (C8287e.m45873v() != null) {
            C7393h.m41695f(this).mo28195q(C8287e.m45792L());
            C7393h.m41695f(this).mo28193o(C8287e.m45863q());
            C7393h.m41695f(this).mo28192n(C8287e.m45873v().mo9215k());
            C7393h.m41695f(this).mo28190l(C8287e.m45865r());
            C7393h.m41695f(this).mo28191m(C8287e.m45871u());
        }
        try {
            if (C7973c.m43649d(this) != null) {
                C7973c.m43649d(this).mo29505b();
                C7973c.m43649d(this).mo29504a(C8287e.m45867s());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: u2 */
    private void m38786u2() {
        int i = 8;
        if (C8287e.m45873v() != null) {
            this.f30397B.setPlaying(C8287e.m45812V());
            this.f30397B.mo8811d(C8287e.m45875w(), C8287e.m45861p());
            double r = C8287e.m45865r();
            double u = C8287e.m45871u();
            if (u == 0.0d || r == 0.0d) {
                this.f30397B.setPercentage(0.0f);
            } else {
                this.f30397B.mo8812f((int) r, (int) u);
            }
            C8321j.m45999e(C8314f.m45973b(this, 0, C8287e.m45873v().mo9215k(), C8287e.m45859o()), R.drawable.homepage_album_cover_default, this.f30402G, 50, 3);
            CarModeView carModeView = this.f30397B;
            if (C8287e.m45873v().mo9261a() != 7) {
                i = 0;
            }
            carModeView.mo8813n(R.id.iv_favorite, i);
        } else {
            this.f30397B.setPlaying(false);
            this.f30397B.setPercentage(0.0f);
            this.f30397B.mo8811d(getResources().getString(R.string.defualt_song_title), getResources().getString(R.string.defualt_song_artist));
            C8321j.m45999e(BuildConfig.FLAVOR, R.drawable.homepage_album_cover_default, this.f30402G, 50, 3);
            this.f30397B.mo8813n(R.id.iv_favorite, 8);
        }
        m38787v2();
        C7238p0 p0Var = this.f30403H;
        if (p0Var != null && p0Var.mo27811y().size() == 0) {
            m38779B2();
        }
        m38780o2(false);
        C8316h hVar = this.f30404I;
        if (hVar != null) {
            hVar.mo30046b();
        }
    }

    /* renamed from: v2 */
    private void m38787v2() {
        int h = C7393h.m41695f(this).mo28186h();
        this.f30397B.setPlayMode(h == 5 ? 3 : h - 1);
    }

    /* renamed from: w2 */
    private void m38788w2() {
        m38786u2();
    }

    /* renamed from: x2 */
    private void m38789x2() {
        this.f30397B.setOnCarModeListener(this);
    }

    /* renamed from: y2 */
    private void m38790y2() {
        C7397j.m41734d(this);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setNavigationBarColor(0);
        }
    }

    /* renamed from: z2 */
    private void m38791z2() {
        this.f30403H.mo27759j(this);
        this.f30403H.mo27743k(this.f30402G);
    }

    /* renamed from: A0 */
    public void mo26500A0() {
    }

    /* renamed from: A1 */
    public void mo26485A1(int i) {
        super.mo26485A1(i);
        m38787v2();
    }

    /* renamed from: B1 */
    public void mo26501B1() {
    }

    /* renamed from: D */
    public void mo8821D() {
        C8287e.m45832d0();
    }

    /* renamed from: E0 */
    public void mo26502E0(boolean z) {
    }

    /* renamed from: F */
    public void mo8822F() {
        finish();
    }

    /* renamed from: G */
    public void mo26503G() {
    }

    /* renamed from: H */
    public void mo26504H(Timer timer, TimerTask timerTask) {
        this.f30400E = timer;
        this.f30401F = timerTask;
    }

    /* renamed from: M */
    public void mo8823M() {
        C8287e.m45835e0();
    }

    /* renamed from: N0 */
    public void mo8824N0(int i) {
        C8287e.m45781F0(i == 3 ? 5 : i + 1, (ImageView) null, 1, false);
        C7393h.m41695f(this).mo28195q(C8287e.m45792L());
    }

    /* renamed from: O */
    public void mo26505O(int i) {
        if (i == -4) {
            C8344t.m46316d(this, R.string.error);
        } else if (i == 2) {
            this.f30397B.setFavorite(false);
            Toast.makeText(this, getResources().getString(R.string.remove_from_favorite), 0).show();
        } else if (i == 1) {
            this.f30397B.setFavorite(true);
            Toast.makeText(this, getResources().getString(R.string.add_to_favorite), 0).show();
        }
        sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.add_to_favorite_notifiy"));
    }

    /* renamed from: P0 */
    public void mo8825P0() {
        C8287e.m45830c1(C8287e.m45863q(), C8287e.m45788J());
    }

    /* renamed from: Q */
    public void mo26506Q() {
    }

    /* renamed from: R */
    public void mo26507R() {
    }

    /* renamed from: U */
    public void mo26508U() {
    }

    /* renamed from: U0 */
    public void mo8826U0() {
        if (C8287e.m45873v() != null) {
            this.f30404I.mo30045a();
        }
    }

    /* renamed from: W0 */
    public void mo26509W0() {
    }

    /* renamed from: X */
    public void mo26510X(boolean z) {
        this.f30397B.setFavorite(z);
    }

    /* renamed from: a1 */
    public void mo26511a1() {
    }

    /* renamed from: b1 */
    public void mo26512b1() {
    }

    /* renamed from: c0 */
    public void mo8827c0() {
        m38791z2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d2 */
    public void mo26488d2() {
        super.mo26488d2();
        m38785t2();
        C8287e.m45844h0(this);
    }

    /* renamed from: e0 */
    public void mo26513e0() {
    }

    /* renamed from: i1 */
    public void mo26514i1() {
    }

    /* renamed from: i2 */
    public Fragment mo26492i2() {
        return null;
    }

    /* renamed from: j0 */
    public void mo26493j0(boolean z) {
        super.mo26493j0(z);
        m38786u2();
    }

    /* renamed from: l0 */
    public void mo26515l0() {
    }

    /* renamed from: m1 */
    public void mo26516m1(ArrayList<SoundEffect> arrayList) {
    }

    /* renamed from: n1 */
    public void mo26517n1() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m38790y2();
        m38784s2();
        m38782q2();
        m38788w2();
        m38789x2();
        m38783r2();
    }

    public void onDestroy() {
        super.onDestroy();
        Timer timer = this.f30400E;
        if (timer != null) {
            timer.cancel();
            this.f30400E = null;
        }
        TimerTask timerTask = this.f30401F;
        if (timerTask != null) {
            timerTask.cancel();
            this.f30401F = null;
        }
        C6817c cVar = this.f30399D;
        if (cVar != null) {
            cVar.removeCallbacksAndMessages((Object) null);
            this.f30399D = null;
        }
        C6816b bVar = this.f30398C;
        if (bVar != null) {
            unregisterReceiver(bVar);
            this.f30398C = null;
        }
    }

    /* renamed from: r1 */
    public void mo26518r1() {
    }

    /* renamed from: x1 */
    public void mo26519x1(float f) {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.alpha = f;
        getWindow().setAttributes(attributes);
    }

    /* renamed from: y1 */
    public void mo26520y1() {
    }
}
