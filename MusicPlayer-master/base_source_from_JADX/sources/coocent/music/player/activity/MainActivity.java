package coocent.music.player.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.C0133c;
import androidx.core.app.C0466a;
import androidx.core.content.p003d.C0524f;
import androidx.viewpager.widget.ViewPager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.coocent.marquee.MarqueeSmallCircleView;
import com.coocent.marquee.view.MarqueeView;
import com.coocent.music.base.data.entity.Music;
import com.google.android.material.tabs.TabLayout;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.mode.SoundEffect;
import coocent.music.player.skin.p274c.C7109e;
import coocent.music.player.widget.IconOnlyTabLayout;
import coocent.music.player.widget.MainViewPager;
import coocent.music.player.widget.p275k.C7229n0;
import coocent.music.player.widget.p275k.C7238p0;
import coocent.musiclibrary.music.p283d.C7327b;
import coocent.musiclibrary.music.p284e.C7332e;
import coocent.musiclibrary.music.p292j.C7382d;
import coocent.musiclibrary.music.p292j.C7393h;
import coocent.musiclibrary.music.p292j.C7397j;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.C9502v;
import net.coocent.android.xmlparser.ads.AdHelper;
import net.coocent.android.xmlparser.p461z.C9566f;
import p159f.p166c.p181e.p182a.p183a.p184a.C4362b;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p342g.p343a.p344a.p346c.C7948a;
import p342g.p343a.p344a.p346c.C7954g;
import p342g.p343a.p344a.p346c.C7956i;
import p342g.p343a.p344a.p346c.C7958k;
import p342g.p343a.p344a.p346c.C7963p;
import p342g.p343a.p344a.p346c.C7969v;
import p342g.p343a.p344a.p347d.C7973c;
import p342g.p343a.p344a.p349f.p353e.p354d.C8270o;
import p342g.p343a.p344a.p355g.C8284c;
import p342g.p343a.p344a.p355g.C8285d;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8311c;
import p342g.p343a.p344a.p358i.C8314f;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8335m;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8340q;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8344t;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.C9317b;
import p443m.p444a.p447e.p448a.C9332d;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class MainActivity extends AppCompatActivity implements C7969v, C7963p, C7956i, C7948a, C7958k, C4362b {

    /* renamed from: q0 */
    public static boolean f30715q0 = false;

    /* renamed from: A */
    private ImageView f30716A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public ImageView f30717B;

    /* renamed from: C */
    private ImageView f30718C;

    /* renamed from: D */
    private ImageView f30719D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public MainViewPager f30720E;

    /* renamed from: F */
    private ImageView f30721F;

    /* renamed from: G */
    private List<Music> f30722G;

    /* renamed from: H */
    private TextView f30723H;

    /* renamed from: I */
    private TextView f30724I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public TextView f30725J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public TextView f30726K;

    /* renamed from: L */
    private C6890f f30727L;

    /* renamed from: M */
    private Timer f30728M;

    /* renamed from: N */
    private TimerTask f30729N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public SeekBar f30730O;

    /* renamed from: P */
    private C7238p0 f30731P;

    /* renamed from: Q */
    private C7229n0 f30732Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public C7393h f30733R;

    /* renamed from: S */
    private C8337n f30734S;

    /* renamed from: T */
    private C7973c f30735T;

    /* renamed from: U */
    private boolean f30736U = false;

    /* renamed from: V */
    private boolean f30737V = false;

    /* renamed from: W */
    private boolean f30738W = false;

    /* renamed from: X */
    private boolean f30739X = false;

    /* renamed from: Y */
    private C6889e f30740Y;

    /* renamed from: Z */
    private Handler f30741Z;

    /* renamed from: a0 */
    private int f30742a0;

    /* renamed from: b0 */
    private long f30743b0 = 0;

    /* renamed from: c0 */
    private boolean f30744c0 = false;

    /* renamed from: d0 */
    private ViewGroup f30745d0;

    /* renamed from: e0 */
    private C7109e f30746e0;

    /* renamed from: f0 */
    private RelativeLayout f30747f0;

    /* renamed from: g0 */
    private ViewGroup f30748g0;

    /* renamed from: h0 */
    private ImageView f30749h0;

    /* renamed from: i0 */
    private ImageView f30750i0;

    /* renamed from: j0 */
    private RelativeLayout f30751j0;

    /* renamed from: k0 */
    private RelativeLayout f30752k0;

    /* renamed from: l0 */
    private ImageView f30753l0;

    /* renamed from: m0 */
    private IconOnlyTabLayout f30754m0;

    /* renamed from: n0 */
    private final ViewPager.C1180i f30755n0 = new C6885a();

    /* renamed from: o0 */
    private final C7954g f30756o0 = new C6887c();

    /* renamed from: p0 */
    private final SeekBar.OnSeekBarChangeListener f30757p0 = new C6888d(this);
    /* access modifiers changed from: private */

    /* renamed from: z */
    public MarqueeView f30758z;

    /* renamed from: coocent.music.player.activity.MainActivity$a */
    class C6885a implements ViewPager.C1180i {
        C6885a() {
        }

        /* renamed from: d */
        public void mo6207d(int i, float f, int i2) {
        }

        /* renamed from: r */
        public void mo6209r(int i) {
        }

        /* renamed from: s */
        public void mo6210s(int i) {
            C8337n.m46065k0(MainActivity.this).mo30121L2(i);
        }
    }

    /* renamed from: coocent.music.player.activity.MainActivity$b */
    class C6886b implements C7332e.C7334b {

        /* renamed from: a */
        final /* synthetic */ C7332e f30760a;

        C6886b(C7332e eVar) {
            this.f30760a = eVar;
        }

        /* renamed from: a */
        public void mo26720a() {
            MainActivity mainActivity = MainActivity.this;
            long k = C8287e.m45873v().mo9215k();
            int q = C8287e.m45863q();
            C8314f.m45976e(mainActivity, 0, k, q, C8287e.m45875w() + " " + C8287e.m45861p());
            this.f30760a.dismiss();
        }

        /* renamed from: b */
        public void mo26721b() {
            C8314f.m45974c(MainActivity.this, C8287e.m45873v().mo9215k(), C8287e.m45863q(), 0);
            this.f30760a.dismiss();
        }

        /* renamed from: c */
        public void mo26722c() {
            C8314f.m45978g((BaseQuickAdapter) null, 0, C8287e.m45873v().mo9215k());
            this.f30760a.dismiss();
        }
    }

    /* renamed from: coocent.music.player.activity.MainActivity$c */
    class C6887c extends C7954g {
        C6887c() {
        }

        /* renamed from: a */
        public void mo26723a() {
            super.mo26723a();
            MainActivity.this.m39336B3();
        }

        /* renamed from: b */
        public void mo26724b() {
            super.mo26724b();
            MainActivity.this.m39334A3();
        }

        /* renamed from: c */
        public void mo26725c() {
            super.mo26725c();
            MainActivity.this.m39336B3();
        }
    }

    /* renamed from: coocent.music.player.activity.MainActivity$d */
    class C6888d implements SeekBar.OnSeekBarChangeListener {
        C6888d(MainActivity mainActivity) {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            C8287e.m45856m0(seekBar.getProgress());
            C8287e.m45820Z();
        }
    }

    /* renamed from: coocent.music.player.activity.MainActivity$e */
    private class C6889e extends BroadcastReceiver {
        private C6889e() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void mo26729b() {
            Drawable drawable;
            if (MainActivity.this.f30758z != null) {
                C8335m.m46064j(MainActivity.this, C8287e.m45812V(), MainActivity.this.f30758z);
            }
            ImageView q2 = MainActivity.this.f30717B;
            if (C8287e.m45812V()) {
                drawable = C9332d.m49407d(MainActivity.this, R.drawable.home_button17_pause_selector);
            } else {
                drawable = C9332d.m49407d(MainActivity.this, R.drawable.home_button17_play_selector);
            }
            q2.setImageDrawable(drawable);
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action == null) {
                return;
            }
            if (action.equals("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.state.action")) {
                MainActivity.this.mo26719i3();
            } else if ("media.musicplayer.audioplayer.videoplayer.notify_ui".equals(action)) {
                MainActivity.this.m39365e2(true);
            } else if ("media.musicplayer.audioplayer.videoplayer.clean_list".equals(action)) {
                MainActivity.this.finish();
            } else if ("media.musicplayer.audioplayer.videoplayer.update_page".equals(action)) {
                MainActivity.this.m39369g3(0);
                MainActivity.this.m39371h3();
                MainActivity.this.m39346G3();
            } else if ("media.musicplayer.audioplayer.videoplayer.remove_ad".equals(action)) {
                MainActivity.this.m39396u3();
            } else if ("media.musicplayer.audioplayer.videoplayer.artwork_update_page".equals(action)) {
                MainActivity.this.m39341E2();
            } else if ("media.musicplayer.audioplayer.videoplayer.detail_update_page".equals(action)) {
                MainActivity.this.m39369g3(0);
                MainActivity.this.m39371h3();
                MainActivity.this.m39346G3();
                MainActivity.this.m39404y3();
            } else if ("media.musicplayer.audioplayer.videoplayer.filter_notify_list".equals(action)) {
                MainActivity.this.m39349J2();
            } else if (C8311c.f34737d.equals(action)) {
                MainActivity.this.m39347H2();
            } else if ("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.playlist.fragment.action".equals(action)) {
                MainActivity.this.m39339D2(intent);
            } else if ("media.musicplayer.audioplayer.videoplayer.sound_effect_notify".equals(action)) {
                MainActivity.this.m39374j3();
            } else if ("media.musicplayer.audioplayer.videoplayer.sound_effect_notify_select".equals(action)) {
                MainActivity.this.m39376k3();
            } else if (C8311c.f34738e.equals(action)) {
                if (MainActivity.this.f30717B != null) {
                    new Handler().postDelayed(new C6976j0(this), 800);
                    MainActivity.this.f30733R.mo28189k(true);
                }
            } else if ("media.musicplayer.audioplayer.videoplayer.main_page_tempo_val".equals(action)) {
                MainActivity.this.m39378l3();
            } else if ("media.musicplayer.audioplayer.videoplayer.call_artwork".equals(action)) {
                MainActivity.this.m39338C3();
            } else if (action.equals("media.musicplayer.audioplayer.videoplayer.WAKEUP.EXIT")) {
                MainActivity.this.finish();
            }
        }

        /* synthetic */ C6889e(MainActivity mainActivity, C6885a aVar) {
            this();
        }
    }

    /* renamed from: coocent.music.player.activity.MainActivity$f */
    public static class C6890f extends Handler {

        /* renamed from: a */
        private final WeakReference<MainActivity> f30764a;

        /* renamed from: b */
        private C8270o f30765b;

        public C6890f(MainActivity mainActivity) {
            WeakReference<MainActivity> weakReference = new WeakReference<>(mainActivity);
            this.f30764a = weakReference;
            try {
                MainActivity mainActivity2 = (MainActivity) weakReference.get();
                if (mainActivity2 != null) {
                    this.f30765b = (C8270o) mainActivity2.f30720E.getAdapter().mo4041j(mainActivity2.f30720E, 0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void handleMessage(Message message) {
            MainActivity mainActivity;
            Bundle data;
            WeakReference<MainActivity> weakReference = this.f30764a;
            if (weakReference != null && (mainActivity = (MainActivity) weakReference.get()) != null && message.what == 1 && (data = message.getData()) != null) {
                String string = data.getString("total");
                String string2 = data.getString("currentProgress");
                int i = data.getInt("progress");
                if (i >= 0) {
                    if (mainActivity.f30726K != null) {
                        mainActivity.f30726K.setText(string);
                    }
                    if (mainActivity.f30725J != null) {
                        mainActivity.f30725J.setText(string2);
                    }
                    if (mainActivity.f30730O != null) {
                        mainActivity.f30730O.setProgress(i);
                    }
                }
                try {
                    C8270o oVar = this.f30765b;
                    if (oVar != null) {
                        oVar.mo29970j4();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public void m39334A3() {
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public void m39336B3() {
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public void m39338C3() {
        if (C8287e.m45873v() != null) {
            C7332e eVar = new C7332e(this, getResources().getString(R.string.button1), getResources().getString(R.string.button2), getResources().getString(R.string.button3), getResources().getString(R.string.artist_work), getResources().getString(R.string.artist_work_tip), C8343s.m46300h(), C8345u.m46326g(R.color.color_bbb), getResources().getColor(R.color.white), false, true);
            eVar.requestWindowFeature(1);
            eVar.show();
            eVar.mo28071c(new C6886b(eVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public void m39339D2(Intent intent) {
        if (intent != null && intent.getBooleanExtra("favorite_opption", false)) {
            sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.add_to_favorite_list").setPackage(C8345u.m46327h().getPackageName()));
        }
    }

    /* renamed from: D3 */
    private void m39340D3() {
        this.f30731P.mo27759j(this);
        this.f30731P.mo27743k(this.f30721F);
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public void m39341E2() {
        if (this.f30734S == null || this.f30716A == null || C8287e.m45873v() == null) {
            C8321j.m45999e(BuildConfig.FLAVOR, R.drawable.home_intermediate1_speaker04_01, this.f30716A, 50, 10);
        } else {
            C8321j.m45999e(C8314f.m45973b(this, 0, C8287e.m45873v().mo9215k(), C8287e.m45859o()), R.drawable.home_intermediate1_speaker04_01, this.f30716A, 50, 10);
        }
        C7238p0 p0Var = this.f30731P;
        if (p0Var != null) {
            p0Var.mo27804L();
        }
        C7229n0 n0Var = this.f30732Q;
        if (n0Var != null) {
            n0Var.mo27783z();
        }
    }

    /* renamed from: E3 */
    public static void m39342E3(Activity activity, int i) {
        m39344F3(activity, i, 0);
    }

    /* renamed from: F2 */
    private void m39343F2(boolean z) {
        Drawable drawable;
        if (C8287e.m45873v() != null) {
            m39341E2();
            ImageView imageView = this.f30717B;
            if (imageView != null) {
                if (C8287e.m45812V()) {
                    drawable = C9332d.m49407d(this, R.drawable.home_button17_pause_selector);
                } else {
                    drawable = C9332d.m49407d(this, R.drawable.home_button17_play_selector);
                }
                imageView.setImageDrawable(drawable);
            }
            m39404y3();
            SeekBar seekBar = this.f30730O;
            if (seekBar != null) {
                seekBar.setMax((int) Math.round(C8287e.m45871u()));
            }
            m39365e2(false);
            C7238p0 p0Var = this.f30731P;
            if (p0Var != null) {
                if (p0Var.mo27811y().size() == 0) {
                    m39346G3();
                } else {
                    this.f30731P.mo27804L();
                }
                this.f30731P.mo27803K(C8287e.m45873v().mo9261a() == 7);
            }
            if ((z && this.f30743b0 != C8287e.m45873v().mo9215k()) || this.f30744c0) {
                m39345G2();
                this.f30744c0 = false;
            }
            this.f30743b0 = C8287e.m45873v().mo9215k();
        }
    }

    /* renamed from: F3 */
    public static void m39344F3(Activity activity, int i, int i2) {
        if (!f30715q0) {
            Intent intent = new Intent(activity, MainActivity.class);
            intent.putExtra("tab_position", i2);
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: G2 */
    private void m39345G2() {
        if (this.f30736U) {
            m39369g3(0);
        }
        m39384o3();
        m39371h3();
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public void m39346G3() {
        C7238p0 p0Var = this.f30731P;
        if (p0Var != null) {
            p0Var.mo27802J();
            this.f30731P.mo27799G();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public void m39347H2() {
        recreate();
    }

    /* renamed from: I2 */
    private void m39348I2() {
        new Thread(new C6982l0(this)).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public void m39349J2() {
        try {
            if (BaseApplication.f31150n < C8287e.m45881z() && C8287e.m45867s() != null) {
                List<Music> A = C8287e.m45770A();
                List<Music> s = C8287e.m45867s();
                for (int i = 0; i < A.size(); i++) {
                    int i2 = 0;
                    boolean z = false;
                    while (true) {
                        if (i2 < s.size()) {
                            if (s.get(i2).mo9215k() == A.get(i).mo9215k()) {
                                z = false;
                                break;
                            } else {
                                i2++;
                                z = true;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z && A.get(i).mo9214j() / 1000 >= BaseApplication.f31150n) {
                        C8287e.m45831d(A.get(i), false);
                    }
                }
            } else if (BaseApplication.f31150n > C8287e.m45881z() && C8287e.m45867s() != null && this.f30731P != null && C8287e.m45867s() != null) {
                List<Music> s2 = C8287e.m45867s();
                int size = s2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (s2.get(i3) != null && s2.get(i3).mo9214j() / 1000 < BaseApplication.f31150n) {
                        this.f30731P.mo27801I(i3);
                    }
                }
            }
        } catch (Exception unused) {
            C8344t.m46316d(this, R.string.error);
        }
    }

    /* renamed from: K2 */
    private void m39350K2(int i, Intent intent) {
        if (i == -1) {
            Cursor cursor = null;
            try {
                Uri data = intent.getData();
                String[] strArr = {"_data"};
                Cursor query = getContentResolver().query(data, strArr, (String) null, (String[]) null, (String) null);
                query.moveToFirst();
                String string = query.getString(query.getColumnIndex(strArr[0]));
                query.close();
                if (C8287e.m45873v() != null) {
                    m39386p3(string, 0, C8287e.m45873v().mo9215k(), C8287e.m45863q());
                }
                if (query != null) {
                    try {
                        query.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
                throw th;
            }
        }
    }

    /* renamed from: L2 */
    private void m39351L2(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("artwork_url");
            int intExtra = intent.getIntExtra("artwork_type", -1);
            long longExtra = intent.getLongExtra("artwork_id", -1);
            int intExtra2 = intent.getIntExtra("artwork_position", -1);
            if (stringExtra.isEmpty() || intExtra == -1 || longExtra == -1 || intExtra2 == -1) {
                C8344t.m46314b(this, R.string.page_error);
            } else {
                m39386p3(stringExtra, intExtra, longExtra, intExtra2);
            }
        }
    }

    /* renamed from: N2 */
    private void m39352N2() {
        this.f30742a0 = this.f30733R.mo28183d();
        C8287e.m45781F0(this.f30733R.mo28186h(), this.f30750i0, 2, false);
        if (this.f30731P == null) {
            C7238p0 p0Var = new C7238p0(this, true, C7238p0.f31964G);
            this.f30731P = p0Var;
            p0Var.mo27806P(this);
            this.f30731P.mo27800H();
        }
        if (this.f30732Q == null) {
            C7229n0 n0Var = new C7229n0(this);
            this.f30732Q = n0Var;
            n0Var.mo27759j(this);
        }
        C7973c d = C7973c.m43649d(this);
        this.f30735T = d;
        List<Music> e = d.mo29507e();
        this.f30722G = e;
        if (e.size() <= 0) {
            this.f30736U = true;
            this.f30722G = C7327b.m41493a(this, BaseApplication.f31150n);
        }
        m39394t3();
        this.f30727L = new C6890f(this);
        m39392s3();
        if (this.f30722G.size() <= 0) {
            m39380m3();
        }
    }

    /* renamed from: O2 */
    private void m39353O2() {
        C6991o0 o0Var = new C6991o0(this);
        this.f30717B.setOnClickListener(o0Var);
        this.f30718C.setOnClickListener(o0Var);
        this.f30719D.setOnClickListener(o0Var);
        this.f30721F.setOnClickListener(o0Var);
        this.f30750i0.setOnClickListener(o0Var);
        this.f30753l0.setOnClickListener(o0Var);
        this.f30730O.setOnSeekBarChangeListener(this.f30757p0);
        C8285d.m45765b().mo29986e(this.f30756o0);
        this.f30720E.setOnPageChangeListener(this.f30755n0);
    }

    /* renamed from: P2 */
    private void m39354P2() {
        this.f30740Y = new C6889e(this, (C6885a) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.state.action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.notify_ui");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.clean_list");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.auto_ad_cancel");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.auto_ad_start");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.update_page");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.artwork_update_page");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.detail_update_page");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.remove_ad");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.filter_notify_list");
        intentFilter.addAction(C8311c.f34737d);
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.playlist.fragment.action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.sound_effect_notify");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.sound_effect_notify_select");
        intentFilter.addAction(C8311c.f34738e);
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.main_page_tempo_val");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.call_artwork");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.WAKEUP.EXIT");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.onwindowfocuschanged");
        registerReceiver(this.f30740Y, intentFilter);
    }

    /* renamed from: Q2 */
    private void m39355Q2() {
        this.f30716A = (ImageView) findViewById(R.id.ivmianbg);
        this.f30717B = (ImageView) findViewById(R.id.ivplaypause);
        this.f30718C = (ImageView) findViewById(R.id.ivnext);
        this.f30719D = (ImageView) findViewById(R.id.ivprevious);
        this.f30721F = (ImageView) findViewById(R.id.ivplaylist);
        ((RelativeLayout.LayoutParams) ((LinearLayout) findViewById(R.id.ll_info)).getLayoutParams()).width = (int) (((double) C9566f.f36725a) * 0.88d);
        TextView textView = (TextView) findViewById(R.id.tvsongtitle);
        this.f30723H = textView;
        textView.requestFocus();
        this.f30724I = (TextView) findViewById(R.id.tvsongartist);
        this.f30725J = (TextView) findViewById(R.id.tvstarttime);
        this.f30726K = (TextView) findViewById(R.id.tvendtime);
        this.f30745d0 = (ViewGroup) findViewById(R.id.bottomcontrol);
        this.f30749h0 = (ImageView) findViewById(R.id.ivhomgbg);
        MainViewPager mainViewPager = new MainViewPager(this);
        this.f30720E = mainViewPager;
        mainViewPager.mo27513Z(this);
        ((RelativeLayout) findViewById(R.id.rltabviewpager)).addView(this.f30720E);
        this.f30747f0 = (RelativeLayout) findViewById(R.id.varlseekbarlayout);
        this.f30751j0 = (RelativeLayout) findViewById(R.id.rl_search);
        View inflate = View.inflate(this, R.layout.play_seekbar, (ViewGroup) null);
        this.f30730O = (SeekBar) inflate.findViewById(R.id.progress);
        m39398v3(inflate);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.rl_bottom_control);
        this.f30748g0 = viewGroup;
        viewGroup.setLayoutDirection(0);
        this.f30750i0 = (ImageView) findViewById(R.id.iv_mode_shuffle);
        this.f30752k0 = (RelativeLayout) findViewById(R.id.rl_sound_effect);
        this.f30753l0 = (ImageView) findViewById(R.id.iv_back);
        MarqueeView marqueeView = new MarqueeView(this);
        this.f30758z = marqueeView;
        ((RelativeLayout) findViewById(R.id.play_view_root)).addView(marqueeView);
        IconOnlyTabLayout iconOnlyTabLayout = (IconOnlyTabLayout) findViewById(R.id.tabLayout);
        this.f30754m0 = iconOnlyTabLayout;
        iconOnlyTabLayout.mo27509S(this, this.f30720E);
        this.f30720E.setOnPageChangeListener(new TabLayout.C6204h(this.f30754m0));
        this.f30754m0.setTabRippleColor(ColorStateList.valueOf(C8343s.m46295c(R.color.ripple_color)));
        this.f30754m0.mo27508Q(this.f30720E);
        m39402x3();
    }

    /* renamed from: R2 */
    private void m39356R2() {
        m39341E2();
        m39396u3();
        m39378l3();
        m39400w3();
    }

    /* renamed from: S2 */
    private void m39357S2() {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setNavigationBarColor(C0524f.m3223d(getResources(), R.color.sound_effect_bg_color, (Resources.Theme) null));
        }
        C7397j.m41734d(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public /* synthetic */ void mo26713U2() {
        try {
            C7382d.m41670a(getApplicationContext(), getResources().getString(R.string.favorites));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public /* synthetic */ void mo26714W2() {
        C8284c.m45737B(this, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public /* synthetic */ void mo26715Y2(View view) {
        if (view.getId() == R.id.ivplaypause) {
            C8287e.m45830c1(C8287e.m45863q(), this.f30722G);
        } else if (view.getId() == R.id.ivnext) {
            if (!C8345u.m46336q()) {
                C8287e.m45832d0();
            } else {
                C8287e.m45835e0();
            }
        } else if (view.getId() == R.id.ivprevious) {
            if (!C8345u.m46336q()) {
                C8287e.m45835e0();
            } else {
                C8287e.m45832d0();
            }
        } else if (view.getId() == R.id.ivplaylist) {
            m39340D3();
        } else if (view.getId() == R.id.iv_mode_shuffle) {
            C8287e.m45783G0(this, this.f30750i0, false);
        } else if (view.getId() == R.id.iv_back) {
            onBackPressed();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public /* synthetic */ void mo26716a3(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", getPackageName(), (String) null));
        startActivityForResult(intent, 45);
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public /* synthetic */ void mo26717d3(int i) {
        if (i == 1) {
            m39388q3(BaseApplication.f31157u);
        } else {
            m39388q3(C9566f.m50190a(this, 5));
        }
    }

    /* renamed from: d2 */
    private void m39364d2() {
    }

    /* access modifiers changed from: private */
    /* renamed from: e2 */
    public void m39365e2(boolean z) {
        if (C8287e.m45812V() || z) {
            C8287e.m45819Y0(this.f30728M, this.f30729N, this.f30727L, this);
        } else {
            C8287e.m45827b1(this.f30728M, this.f30729N);
        }
    }

    /* renamed from: e3 */
    private void m39366e3() {
        m39364d2();
    }

    /* renamed from: f3 */
    private void m39367f3() {
        C8345u.m46338s(this);
        sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.update_widget").setPackage(C8345u.m46327h().getPackageName()));
        m39352N2();
        m39356R2();
        m39353O2();
        m39348I2();
        m39354P2();
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public void m39369g3(int i) {
        this.f30737V = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public void m39371h3() {
        if (this.f30737V) {
            this.f30737V = false;
            this.f30736U = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public void m39374j3() {
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public void m39376k3() {
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SetTextI18n"})
    /* renamed from: l3 */
    public void m39378l3() {
        int i;
        if (C8337n.m46065k0(this).mo30119L0() == -1) {
            i = C8337n.m46065k0(this).mo30139Q0();
        } else {
            i = (int) (C8337n.m46065k0(this).mo30135P0() + 30.0f);
        }
        int i2 = (new BigDecimal((double) ((((float) i) * 2.0f) / 60.0f)).setScale(1, 4).floatValue() > 0.1f ? 1 : (new BigDecimal((double) ((((float) i) * 2.0f) / 60.0f)).setScale(1, 4).floatValue() == 0.1f ? 0 : -1));
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: m3 */
    private void m39380m3() {
        m39390r3();
        C8287e.m45821Z0();
        m39406z3();
        this.f30730O.setProgress(0);
        this.f30726K.setText("0:00");
        this.f30725J.setText("0:00");
        this.f30717B.setImageDrawable(C9332d.m49407d(this, R.drawable.homepage_button09_play_on_select));
        C8287e.m45846i();
        C8287e.m45864q0((Music) null);
        C8287e.m45862p0(0);
        C8287e.m45882z0(new long[0]);
        C7238p0 p0Var = this.f30731P;
        if (p0Var != null) {
            p0Var.mo27804L();
        }
        this.f30744c0 = true;
        this.f30736U = true;
        MarqueeView marqueeView = this.f30758z;
        if (marqueeView != null) {
            C8335m.m46064j(this, false, marqueeView);
        }
        m39343F2(true);
    }

    /* renamed from: n3 */
    private void m39382n3() {
        if (!(this.f30733R == null || C8287e.m45873v() == null)) {
            this.f30733R.mo28195q(C8287e.m45792L());
            this.f30733R.mo28193o(C8287e.m45863q());
            this.f30733R.mo28192n(C8287e.m45873v().mo9215k());
            this.f30733R.mo28190l(C8287e.m45865r());
            this.f30733R.mo28191m(C8287e.m45871u());
        }
        C7973c cVar = this.f30735T;
        if (cVar != null) {
            cVar.mo29505b();
            this.f30735T.mo29504a(C8287e.m45867s());
        }
    }

    /* renamed from: o3 */
    private void m39384o3() {
        if (this.f30739X && !this.f30738W) {
            this.f30739X = false;
            m39369g3(0);
        }
        if (this.f30738W) {
            m39369g3(1);
            this.f30738W = false;
            this.f30739X = true;
        }
        m39371h3();
    }

    /* renamed from: p3 */
    private void m39386p3(String str, int i, long j, int i2) {
        new C8337n(this).mo30261u1(C8311c.m45963b(i), j, str);
        if (!(i == 0 || i == 1)) {
            Intent intent = new Intent(C8311c.m45962a(i));
            intent.putExtra("artwork_position", i2);
            sendBroadcast(intent.setPackage(C8345u.m46327h().getPackageName()));
        }
        sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.track_artwork_item_notify").setPackage(C8345u.m46327h().getPackageName()));
        sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.recent_artwork_item_notify").setPackage(C8345u.m46327h().getPackageName()));
        if (C8287e.m45873v() != null && j == C8287e.m45873v().mo9215k()) {
            sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.artwork_update_page").setPackage(C8345u.m46327h().getPackageName()));
            sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.update_widget").setPackage(C8345u.m46327h().getPackageName()));
        }
    }

    /* renamed from: q3 */
    private void m39388q3(int i) {
        ViewGroup viewGroup = this.f30745d0;
        if (viewGroup != null) {
            viewGroup.setPadding(viewGroup.getPaddingLeft(), this.f30745d0.getPaddingTop(), this.f30745d0.getPaddingRight(), i);
        }
    }

    /* renamed from: r3 */
    private void m39390r3() {
        m39341E2();
    }

    /* renamed from: s3 */
    private void m39392s3() {
        this.f30730O.setProgress(this.f30742a0);
        if (!C8287e.m45812V()) {
            C8287e.m45856m0(this.f30742a0);
        }
        m39365e2(true);
    }

    /* renamed from: t3 */
    private void m39394t3() {
        m39343F2(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public void m39396u3() {
        C9502v.m49954y(this);
    }

    /* renamed from: v3 */
    private void m39398v3(View view) {
        ((ViewGroup) this.f30730O.getParent()).removeAllViews();
        this.f30747f0.addView((ImageView) view.findViewById(R.id.seekbar_bg));
        this.f30747f0.addView(this.f30730O);
        ViewGroup.LayoutParams layoutParams = this.f30730O.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -2;
        this.f30730O.setLayoutParams(layoutParams);
    }

    /* renamed from: w3 */
    private void m39400w3() {
    }

    /* renamed from: x3 */
    private void m39402x3() {
        int intExtra = getIntent().getIntExtra("tab_position", 0);
        this.f30720E.setCurrentItem(intExtra);
        this.f30754m0.mo24783x(intExtra).mo24805f().setColorFilter(C8343s.m46300h(), PorterDuff.Mode.SRC_IN);
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public void m39404y3() {
        TextView textView = this.f30723H;
        if (textView != null) {
            textView.setText(C8287e.m45875w());
        }
        TextView textView2 = this.f30724I;
        if (textView2 != null) {
            textView2.setText(C8287e.m45861p());
        }
    }

    /* renamed from: z3 */
    private void m39406z3() {
        TextView textView = this.f30723H;
        if (textView != null) {
            textView.setText(getResources().getString(R.string.defualt_song_title));
        }
        TextView textView2 = this.f30724I;
        if (textView2 != null) {
            textView2.setText(getResources().getString(R.string.defualt_song_artist));
        }
    }

    /* renamed from: A */
    public void mo26484A() {
        this.f30738W = true;
    }

    /* renamed from: A0 */
    public void mo26500A0() {
    }

    /* renamed from: A1 */
    public void mo26485A1(int i) {
        if (this.f30737V) {
            this.f30737V = false;
        }
        m39369g3(0);
        m39371h3();
        C8287e.m45781F0(i, this.f30750i0, 2, false);
        C7238p0 p0Var = this.f30731P;
        if (p0Var != null) {
            p0Var.mo27808s(i);
        }
    }

    /* renamed from: B1 */
    public void mo26501B1() {
    }

    /* renamed from: E0 */
    public void mo26502E0(boolean z) {
        m39369g3(0);
        m39371h3();
    }

    /* renamed from: G */
    public void mo26503G() {
    }

    /* renamed from: H */
    public void mo26504H(Timer timer, TimerTask timerTask) {
        this.f30728M = timer;
        this.f30729N = timerTask;
    }

    /* renamed from: H0 */
    public void mo14800H0(boolean z, long j, String str, int i, int i2) {
        if (z) {
            m39386p3(str, i, j, i2);
        }
    }

    /* renamed from: M0 */
    public void mo26486M0() {
    }

    /* renamed from: M2 */
    public void mo26712M2(ArrayList<SoundEffect> arrayList) {
        if (!AdHelper.m49536p().mo32459v(this, new C6985m0(this))) {
            C8284c.m45737B(this, false);
        }
    }

    /* renamed from: O */
    public void mo26505O(int i) {
    }

    /* renamed from: Q */
    public void mo26506Q() {
    }

    /* renamed from: R */
    public void mo26507R() {
        m39338C3();
    }

    /* renamed from: U */
    public void mo26508U() {
    }

    /* renamed from: W0 */
    public void mo26509W0() {
    }

    /* renamed from: X */
    public void mo26510X(boolean z) {
    }

    /* renamed from: Z */
    public void mo26487Z() {
    }

    /* renamed from: a1 */
    public void mo26511a1() {
        m39369g3(0);
        m39382n3();
    }

    /* renamed from: b1 */
    public void mo26512b1() {
    }

    /* renamed from: e0 */
    public void mo26513e0() {
        sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.clean_list").setPackage(C8345u.m46327h().getPackageName()));
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.exit);
    }

    /* renamed from: i1 */
    public void mo26514i1() {
    }

    /* renamed from: i3 */
    public void mo26719i3() {
        m39346G3();
        m39369g3(0);
        m39343F2(true);
    }

    /* renamed from: j0 */
    public void mo26493j0(boolean z) {
        m39343F2(z);
        C8335m.m46064j(this, C8287e.m45812V(), this.f30758z);
        sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.music_state_change").setPackage(C8345u.m46327h().getPackageName()));
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
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1020) {
            try {
                m39350K2(i2, intent);
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        } else if (i == 1021 && i2 == 1022) {
            m39351L2(intent);
        }
        if (i == 1029 && i2 == 1002) {
            if (intent != null) {
                boolean booleanExtra = intent.getBooleanExtra("save_sound_effect", false);
                int intExtra = intent.getIntExtra("addId", -1);
                boolean booleanExtra2 = intent.getBooleanExtra("sideBar", false);
                if (booleanExtra) {
                    C8337n.m46065k0(this).mo30101G2(intExtra);
                }
                m39378l3();
                if (booleanExtra2) {
                    mo26712M2((ArrayList<SoundEffect>) null);
                }
            }
        } else if (i == 1029 && i2 == 1003) {
            if (intent != null) {
                if (intent.getBooleanExtra("hadChange", false)) {
                    C8337n.m46065k0(this).mo30101G2(Integer.MAX_VALUE);
                }
                m39378l3();
            }
        } else if (i == 45) {
            sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.audio_permission_change").setPackage(C8345u.m46327h().getPackageName()));
        }
        C4477c.m19608a0(this, i, i2, intent);
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f30715q0 = true;
        m39357S2();
        C9317b.m49316A(BaseApplication.m40039j());
        if (C8287e.m45802Q() != null) {
            C8287e.m45802Q().mo27195p0(this);
        }
        this.f30733R = C7393h.m41695f(this);
        this.f30734S = new C8337n(this);
        this.f30741Z = new Handler();
        setContentView((int) R.layout.activity_play);
        this.f30746e0 = C7109e.m40466a(this);
        m39355Q2();
        m39366e3();
        m39367f3();
    }

    public void onDestroy() {
        super.onDestroy();
        m39382n3();
        C6889e eVar = this.f30740Y;
        if (eVar != null) {
            unregisterReceiver(eVar);
            this.f30740Y = null;
        }
        C8321j.m45995a(this.f30716A);
        C8321j.m45995a(this.f30749h0);
        C8321j.m45995a(this.f30750i0);
        C8321j.m45995a(this.f30721F);
        C8321j.m45995a(this.f30752k0);
        C8321j.m45995a(this.f30717B);
        C8321j.m45995a(this.f30718C);
        C8321j.m45995a(this.f30719D);
        C7238p0 p0Var = this.f30731P;
        if (p0Var != null) {
            p0Var.mo27810w();
            this.f30731P = null;
        }
        C7229n0 n0Var = this.f30732Q;
        if (n0Var != null) {
            n0Var.mo27778o();
            this.f30732Q = null;
        }
        if (this.f30720E != null) {
            this.f30720E = null;
        }
        TextView textView = this.f30723H;
        if (textView != null) {
            textView.setText(BuildConfig.FLAVOR);
            this.f30723H = null;
        }
        TextView textView2 = this.f30724I;
        if (textView2 != null) {
            textView2.setText(BuildConfig.FLAVOR);
            this.f30724I = null;
        }
        TextView textView3 = this.f30725J;
        if (textView3 != null) {
            textView3.setText(BuildConfig.FLAVOR);
            this.f30725J = null;
        }
        TextView textView4 = this.f30726K;
        if (textView4 != null) {
            textView4.setText(BuildConfig.FLAVOR);
            this.f30726K = null;
        }
        if (this.f30730O != null) {
            this.f30730O = null;
        }
        if (this.f30735T != null) {
            this.f30735T = null;
        }
        Handler handler = this.f30741Z;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f30741Z = null;
        }
        if (this.f30745d0 != null) {
            this.f30745d0 = null;
        }
        if (this.f30746e0 != null) {
            this.f30746e0 = null;
        }
        if (this.f30747f0 != null) {
            this.f30747f0 = null;
        }
        if (this.f30748g0 != null) {
            this.f30748g0 = null;
        }
        C8321j.m45995a(this.f30749h0);
        if (this.f30751j0 != null) {
            this.f30751j0 = null;
        }
        C8287e.m45827b1(this.f30728M, this.f30729N);
        if (this.f30728M != null) {
            this.f30728M = null;
        }
        if (this.f30729N != null) {
            this.f30729N = null;
        }
        C6890f fVar = this.f30727L;
        if (fVar != null) {
            fVar.removeCallbacksAndMessages((Object) null);
            this.f30727L = null;
        }
        C8335m.m46055a(this.f30758z, (MarqueeSmallCircleView) null);
        f30715q0 = false;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 25) {
            C8287e.m45845h1();
            return true;
        } else if (i != 24) {
            return super.onKeyDown(i, keyEvent);
        } else {
            C8287e.m45848i1();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 44) {
            try {
                if (iArr[0] == 0) {
                    sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.audio_permission_change").setPackage(C8345u.m46327h().getPackageName()));
                } else if (!C0466a.m2987n(this, "android.permission.RECORD_AUDIO")) {
                    C0133c.C0134a aVar = new C0133c.C0134a(this);
                    aVar.mo644o(R.string.requet_permission);
                    aVar.mo636g(R.string.request_record_permission);
                    aVar.mo641l(17039370, new C6994p0(this));
                    aVar.mo638i(17039360, C6988n0.f31051g);
                    C0133c a = aVar.mo630a();
                    a.show();
                    a.mo624e(-1).setTextColor(C8343s.m46300h());
                    a.mo624e(-2).setTextColor(C8343s.m46300h());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C8335m.m46060f(this, this.f30758z);
        C8340q.m46288b(this, new C6979k0(this));
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        f30715q0 = false;
    }

    /* renamed from: r1 */
    public void mo26518r1() {
    }

    /* renamed from: u1 */
    public void mo26499u1() {
        m39346G3();
        m39382n3();
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
