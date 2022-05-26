package coocent.music.player.activity;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.C0136e;
import androidx.appcompat.app.C0142i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0506a;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.C0602j;
import androidx.fragment.app.C0620p;
import androidx.fragment.app.Fragment;
import com.coocent.marquee.C2280j;
import com.coocent.marquee.MarqueeSmallCircleView;
import com.coocent.marquee.view.MarqueeView;
import com.coocent.music.base.data.entity.Music;
import com.coocent.roundprogressview.RoundProgressView;
import com.coocent.videolibrary.p058ui.ContentActivity;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.mode.SoundEffect;
import coocent.music.player.visualizer.SquareMusicImageView;
import coocent.music.player.widget.AlbumArtViewPager;
import coocent.music.player.widget.DeepDefaultTitle;
import coocent.music.player.widget.DeepSelectTitle;
import coocent.music.player.widget.NoScrollTabLayout;
import coocent.music.player.widget.p275k.C7238p0;
import coocent.musiclibrary.music.p281b.C7322a;
import coocent.musiclibrary.music.p284e.C7344h;
import coocent.musiclibrary.music.p289g.C7364a;
import coocent.musiclibrary.music.p289g.C7366c;
import coocent.musiclibrary.music.p292j.C7382d;
import coocent.musiclibrary.music.p292j.C7387e;
import coocent.musiclibrary.music.p292j.C7393h;
import coocent.musiclibrary.music.p292j.C7397j;
import coocent.musiclibrary.music.p292j.C7401l;
import coocent.musiclibrary.music.view.PermissionRequestDetailView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.C9483n;
import net.coocent.android.xmlparser.C9488q;
import net.coocent.android.xmlparser.C9492u;
import net.coocent.android.xmlparser.C9502v;
import net.coocent.android.xmlparser.ads.AdHelper;
import net.coocent.android.xmlparser.gift.GiftWithGameActivity;
import net.coocent.android.xmlparser.p461z.C9564d;
import net.coocent.android.xmlparser.p461z.C9566f;
import net.coocent.android.xmlparser.widget.view.GiftBadgeActionView;
import p159f.p160a.p161a.C4264b;
import p159f.p160a.p161a.C4269f;
import p159f.p166c.p181e.p182a.p183a.p184a.C4362b;
import p159f.p166c.p181e.p182a.p183a.p187d.C4379d;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p159f.p166c.p210i.p211a.p212f.C4588a;
import p159f.p166c.p213j.p214a.C4590a;
import p342g.p343a.p344a.p346c.C7956i;
import p342g.p343a.p344a.p346c.C7961n;
import p342g.p343a.p344a.p346c.C7962o;
import p342g.p343a.p344a.p346c.C7963p;
import p342g.p343a.p344a.p346c.C7966s;
import p342g.p343a.p344a.p346c.C7969v;
import p342g.p343a.p344a.p346c.C7970w;
import p342g.p343a.p344a.p347d.C7973c;
import p342g.p343a.p344a.p347d.C7974d;
import p342g.p343a.p344a.p349f.p351c.C8090e3;
import p342g.p343a.p344a.p349f.p351c.C8194t2;
import p342g.p343a.p344a.p349f.p351c.C8200u2;
import p342g.p343a.p344a.p349f.p351c.C8216w2;
import p342g.p343a.p344a.p355g.C8282b;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8311c;
import p342g.p343a.p344a.p358i.C8315g;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8333k;
import p342g.p343a.p344a.p358i.C8335m;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8340q;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8344t;
import p342g.p343a.p344a.p358i.C8345u;
import p369i.C8446k;
import p369i.C8457t;
import p443m.p444a.C9317b;
import p443m.p444a.p447e.p448a.C9332d;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class TestActivity2 extends BaseActivity implements C7966s, C7962o, C9488q, C7956i, C7963p, C7961n, C7364a, C7969v, PermissionRequestDetailView.C7412b, C4362b, C7401l {

    /* renamed from: A0 */
    private PermissionRequestDetailView f30883A0;

    /* renamed from: B */
    public DeepDefaultTitle f30884B;

    /* renamed from: B0 */
    private boolean f30885B0 = false;

    /* renamed from: C */
    private ImageView f30886C;

    /* renamed from: C0 */
    private RelativeLayout f30887C0;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public NoScrollTabLayout f30888D;

    /* renamed from: D0 */
    private SquareMusicImageView f30889D0;

    /* renamed from: E */
    private DeepSelectTitle f30890E;

    /* renamed from: E0 */
    private RelativeLayout f30891E0;

    /* renamed from: F */
    private C6938m f30892F;

    /* renamed from: F0 */
    private DrawerLayout f30893F0;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f30894G = false;
    /* access modifiers changed from: private */

    /* renamed from: G0 */
    public RoundProgressView f30895G0;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public long f30896H = 0;

    /* renamed from: H0 */
    private ImageView f30897H0;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C8337n f30898I;

    /* renamed from: I0 */
    private NavigationView f30899I0;

    /* renamed from: J */
    private RelativeLayout f30900J;

    /* renamed from: J0 */
    private RelativeLayout f30901J0;

    /* renamed from: K */
    private View f30902K;

    /* renamed from: K0 */
    private C7344h f30903K0;

    /* renamed from: L */
    private ImageView f30904L;

    /* renamed from: L0 */
    private TextView f30905L0;

    /* renamed from: M */
    private TextView f30906M;

    /* renamed from: M0 */
    private RelativeLayout f30907M0;

    /* renamed from: N */
    private boolean f30908N = false;

    /* renamed from: N0 */
    private RelativeLayout f30909N0;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public boolean f30910O = false;

    /* renamed from: P */
    private RelativeLayout f30911P;

    /* renamed from: Q */
    private RelativeLayout f30912Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public ImageView f30913R;

    /* renamed from: S */
    private ImageView f30914S;

    /* renamed from: T */
    private int f30915T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public C7393h f30916U;

    /* renamed from: V */
    private C7973c f30917V;

    /* renamed from: W */
    private C7238p0 f30918W;

    /* renamed from: X */
    private List<Music> f30919X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public C7974d f30920Y;

    /* renamed from: Z */
    private RelativeLayout f30921Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public AlbumArtViewPager f30922a0;

    /* renamed from: b0 */
    private Handler f30923b0;

    /* renamed from: c0 */
    private boolean f30924c0 = false;

    /* renamed from: d0 */
    private boolean f30925d0 = false;

    /* renamed from: e0 */
    private boolean f30926e0 = false;

    /* renamed from: f0 */
    private boolean f30927f0 = false;

    /* renamed from: g0 */
    private boolean f30928g0 = false;

    /* renamed from: h0 */
    private LinearLayout f30929h0;

    /* renamed from: i0 */
    private C6940n f30930i0;

    /* renamed from: j0 */
    private Timer f30931j0;

    /* renamed from: k0 */
    private TimerTask f30932k0;

    /* renamed from: l0 */
    private RelativeLayout f30933l0;

    /* renamed from: m0 */
    private RelativeLayout f30934m0;

    /* renamed from: n0 */
    private RelativeLayout f30935n0;

    /* renamed from: o0 */
    private RelativeLayout f30936o0;

    /* renamed from: p0 */
    private RelativeLayout f30937p0;

    /* renamed from: q0 */
    private RelativeLayout f30938q0;

    /* renamed from: r0 */
    private RelativeLayout f30939r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public MarqueeView f30940s0;

    /* renamed from: t0 */
    private MarqueeSmallCircleView f30941t0;

    /* renamed from: u0 */
    private RelativeLayout f30942u0;

    /* renamed from: v0 */
    private RelativeLayout f30943v0;

    /* renamed from: w0 */
    private RelativeLayout f30944w0;

    /* renamed from: x0 */
    private RelativeLayout f30945x0;

    /* renamed from: y0 */
    private RelativeLayout f30946y0;

    /* renamed from: z0 */
    private TextView f30947z0;

    /* renamed from: coocent.music.player.activity.TestActivity2$a */
    class C6925a implements Runnable {
        C6925a() {
        }

        public void run() {
            TestActivity2.this.f30922a0.mo26325f();
        }
    }

    /* renamed from: coocent.music.player.activity.TestActivity2$b */
    class C6926b implements Runnable {
        C6926b(TestActivity2 testActivity2) {
        }

        public void run() {
            C8287e.m45835e0();
        }
    }

    /* renamed from: coocent.music.player.activity.TestActivity2$c */
    class C6927c implements C7322a {
        C6927c() {
        }

        /* renamed from: a */
        public void mo26686a(DialogInterface dialogInterface) {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", TestActivity2.this.getPackageName(), (String) null));
            TestActivity2.this.startActivityForResult(intent, 12306);
        }

        /* renamed from: b */
        public void mo26687b(DialogInterface dialogInterface) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: coocent.music.player.activity.TestActivity2$d */
    class C6928d implements Runnable {
        C6928d() {
        }

        public void run() {
            if (TestActivity2.this.f30920Y != null && C8287e.m45873v() != null) {
                TestActivity2.this.f30920Y.mo29509a(C8287e.m45873v());
            }
        }
    }

    /* renamed from: coocent.music.player.activity.TestActivity2$e */
    class C6929e extends C7970w {
        C6929e() {
        }

        /* renamed from: A */
        public void mo26689A() {
            super.mo26689A();
            TestActivity2.this.mo26807R4(5);
        }

        /* renamed from: B */
        public void mo26690B() {
            super.mo26690B();
            TestActivity2.this.mo26807R4(1);
        }

        /* renamed from: D */
        public void mo26691D() {
            super.mo26691D();
            TestActivity2.this.mo26817g5();
        }

        /* renamed from: E */
        public void mo26692E() {
            super.mo26692E();
            TestActivity2.this.mo26819h5();
        }

        /* renamed from: b */
        public void mo26693b() {
            super.mo26693b();
            TestActivity2.this.mo26805P4(0);
            TestActivity2.this.mo26822p2(false, 0);
        }

        /* renamed from: o */
        public void mo26694o() {
            super.mo26694o();
            TestActivity2.this.m39733g4();
        }

        /* renamed from: p */
        public void mo26695p() {
            super.mo26695p();
            TestActivity2.this.m39736i4();
        }

        /* renamed from: s */
        public void mo26696s(GiftBadgeActionView giftBadgeActionView) {
            super.mo26696s(giftBadgeActionView);
        }

        /* renamed from: t */
        public void mo26591t() {
            TestActivity2.this.mo26815e5();
        }

        /* renamed from: u */
        public void mo26697u() {
            super.mo26697u();
            TestActivity2.this.mo26807R4(0);
        }

        /* renamed from: v */
        public void mo26698v() {
            super.mo26698v();
            TestActivity2.this.mo26807R4(2);
        }

        /* renamed from: w */
        public void mo26699w() {
            super.mo26699w();
            TestActivity2.this.mo26807R4(7);
        }

        /* renamed from: x */
        public void mo26700x() {
            super.mo26700x();
            TestActivity2.this.mo26807R4(3);
        }

        /* renamed from: y */
        public void mo26701y() {
            super.mo26701y();
            TestActivity2.this.mo26807R4(4);
        }

        /* renamed from: z */
        public void mo26702z() {
            super.mo26702z();
            TestActivity2.this.mo26807R4(6);
        }
    }

    /* renamed from: coocent.music.player.activity.TestActivity2$f */
    class C6930f implements TabLayout.C6198d {
        C6930f() {
        }

        /* renamed from: a */
        public void mo24788a(TabLayout.C6203g gVar) {
        }

        /* renamed from: b */
        public void mo24789b(TabLayout.C6203g gVar) {
            TestActivity2.this.f30888D.setSelectTab(gVar.mo24806g());
            TestActivity2.this.m39660B4(gVar.mo24806g());
            TestActivity2.this.f30898I.mo30222k2(gVar.mo24806g());
        }

        /* renamed from: c */
        public void mo24790c(TabLayout.C6203g gVar) {
        }
    }

    /* renamed from: coocent.music.player.activity.TestActivity2$g */
    class C6931g extends C9492u {
        C6931g() {
        }

        /* renamed from: a */
        public void mo15335a() {
            TestActivity2.this.m39690N4();
        }

        /* renamed from: c */
        public void mo15337c() {
            C4590a.m20018b(this);
            if (TestActivity2.this.f30910O) {
                boolean unused = TestActivity2.this.f30910O = false;
                if (C8287e.m45810U()) {
                    C8287e.m45829c0();
                }
            }
        }
    }

    /* renamed from: coocent.music.player.activity.TestActivity2$h */
    class C6932h extends C7970w {
        C6932h() {
        }

        /* renamed from: C */
        public void mo26703C() {
            super.mo26703C();
            TestActivity2.this.mo26805P4(1);
        }

        /* renamed from: k */
        public void mo26704k() {
            super.mo26704k();
            TestActivity2.this.mo26811Y3();
        }

        /* renamed from: l */
        public void mo26705l() {
            super.mo26705l();
            TestActivity2.this.mo26812Z3();
        }

        /* renamed from: m */
        public void mo26706m() {
            super.mo26706m();
            TestActivity2.this.m39713X3();
        }

        /* renamed from: n */
        public void mo26707n() {
            super.mo26707n();
            TestActivity2.this.m39719a4();
        }

        /* renamed from: t */
        public void mo26591t() {
            TestActivity2.this.mo26805P4(0);
        }
    }

    /* renamed from: coocent.music.player.activity.TestActivity2$i */
    class C6933i implements C4269f.C4283m {
        C6933i() {
        }

        /* renamed from: a */
        public void mo6880a(C4269f fVar, C4264b bVar) {
            fVar.dismiss();
            TestActivity2.this.mo26805P4(0);
        }
    }

    /* renamed from: coocent.music.player.activity.TestActivity2$j */
    class C6934j implements C4269f.C4283m {
        C6934j() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void mo26829c() {
            TestActivity2.this.mo26805P4(0);
        }

        /* renamed from: a */
        public void mo6880a(C4269f fVar, C4264b bVar) {
            long[] E = C8287e.m45778E(C8287e.m45798O());
            TestActivity2 testActivity2 = TestActivity2.this;
            C4477c.m19624i0(testActivity2, E, testActivity2.f30896H);
            TestActivity2.this.sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.playlist_detail_remove_notify"));
            new Handler().postDelayed(new C6959d1(this), 500);
        }
    }

    /* renamed from: coocent.music.player.activity.TestActivity2$k */
    class C6935k implements C7322a {

        /* renamed from: a */
        final /* synthetic */ long[] f30957a;

        /* renamed from: coocent.music.player.activity.TestActivity2$k$a */
        class C6936a implements C4379d.C4380a {
            C6936a() {
            }

            /* renamed from: a */
            public void mo14943a() {
            }

            /* renamed from: b */
            public void mo14944b(List<Long> list) {
                C8287e.m45855m(C8345u.m46327h(), C8287e.m45798O());
                TestActivity2.this.mo26805P4(0);
                C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.detail_update_page"));
            }

            /* renamed from: c */
            public void mo14945c(int i, int i2, long j) {
            }
        }

        C6935k(long[] jArr) {
            this.f30957a = jArr;
        }

        /* renamed from: a */
        public void mo26686a(DialogInterface dialogInterface) {
            long[] jArr = this.f30957a;
            if (jArr != null) {
                C4477c.m19627k(TestActivity2.this, jArr, new C6936a());
            }
        }

        /* renamed from: b */
        public void mo26687b(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: coocent.music.player.activity.TestActivity2$l */
    class C6937l implements Runnable {
        C6937l(TestActivity2 testActivity2) {
        }

        public void run() {
            C8287e.m45832d0();
        }
    }

    /* renamed from: coocent.music.player.activity.TestActivity2$m */
    private class C6938m extends BroadcastReceiver {

        /* renamed from: coocent.music.player.activity.TestActivity2$m$a */
        class C6939a implements Runnable {
            C6939a() {
            }

            public void run() {
                Drawable drawable;
                if (TestActivity2.this.f30940s0 != null) {
                    TestActivity2 testActivity2 = TestActivity2.this;
                    C8335m.m46064j(testActivity2, false, testActivity2.f30940s0);
                }
                ImageView y2 = TestActivity2.this.f30913R;
                if (C8287e.m45812V()) {
                    drawable = C9332d.m49407d(TestActivity2.this, R.drawable.ic_home07_play2);
                } else {
                    drawable = C9332d.m49407d(TestActivity2.this, R.drawable.ic_home05_pause);
                }
                y2.setImageDrawable(drawable);
            }
        }

        private C6938m() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action == null) {
                return;
            }
            if (action.equals("media.musicplayer.audioplayer.videoplayer.select_track_to_updata_ui")) {
                TestActivity2.this.m39769w4(intent);
            } else if (action.equals("media.musicplayer.audioplayer.videoplayer.select_track_to_updata_num")) {
                if (intent != null) {
                    TestActivity2.this.mo26822p2(intent.getBooleanExtra("isClickTitleToSelectAll", false), intent.getIntExtra("listSize", 0));
                }
            } else if (action.equals("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.playlist.fragment.action")) {
                if (TestActivity2.this.f30894G) {
                    TestActivity2.this.mo26805P4(0);
                    boolean unused = TestActivity2.this.f30894G = false;
                }
            } else if (action.equals("media.musicplayer.audioplayer.videoplayer.WAKEUP.EXIT")) {
                TestActivity2.this.finish();
            } else if (action.equals(C8311c.f34738e)) {
                if (TestActivity2.this.f30913R != null) {
                    new Handler().postDelayed(new C6939a(), 800);
                    TestActivity2.this.f30916U.mo28189k(true);
                }
                TestActivity2.this.m39704U3();
            } else if ("media.musicplayer.audioplayer.videoplayer.clean_list".equals(action)) {
                TestActivity2.this.m39761t4();
            } else if (action.equals("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.state.action")) {
                TestActivity2.this.mo26814d4(false);
            } else if (action.equals("media.musicplayer.audioplayer.videoplayer.detail_update_page")) {
                TestActivity2.this.m39721b4(0);
                TestActivity2.this.m39724c4(false);
                TestActivity2.this.m39732f5();
            } else if (action.equals("media.musicplayer.audioplayer.videoplayer.artwork_update_page")) {
                TestActivity2.this.m39721b4(0);
                TestActivity2.this.m39724c4(false);
                TestActivity2.this.m39774y4();
            } else if ("media.musicplayer.audioplayer.videoplayer.update_page".equals(action)) {
                TestActivity2.this.m39721b4(0);
                TestActivity2.this.m39724c4(false);
                TestActivity2.this.m39732f5();
            } else if ("media.musicplayer.audioplayer.videoplayer.notify_ui".equals(action)) {
                TestActivity2.this.m39746o2(true);
            } else if (!"media.musicplayer.audioplayer.videoplayer.eq_switch".equals(action)) {
                if ("media.musicplayer.audioplayer.videoplayer.filter_notify_list".equals(action)) {
                    TestActivity2.this.m39728e3();
                    TestActivity2.this.sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.recent_filter_notifiy"));
                    TestActivity2.this.sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.track_filter_notifiy"));
                } else if ("media.musicplayer.audioplayer.videoplayer.remove_ad".equals(action)) {
                    TestActivity2.this.m39690N4();
                } else if ("media.musicplayer.audioplayer.videoplayer.sound_effect_notify".equals(action)) {
                    TestActivity2.this.m39729e4();
                } else if ("media.musicplayer.audioplayer.videoplayer.sound_effect_notify_select".equals(action)) {
                    TestActivity2.this.m39731f4(intent.getIntExtra("id", -1), intent.getBooleanExtra("needToRefresh", true));
                } else if (C8311c.f34737d.equals(action)) {
                    TestActivity2.this.m39716Z2();
                } else {
                    if (action.equals(TestActivity2.this.getPackageName() + C8311c.f34734a)) {
                        TestActivity2.this.m39735i3(context);
                    }
                }
            }
        }

        /* synthetic */ C6938m(TestActivity2 testActivity2, C6928d dVar) {
            this();
        }
    }

    /* renamed from: coocent.music.player.activity.TestActivity2$n */
    public static class C6940n extends Handler {

        /* renamed from: a */
        private final WeakReference<TestActivity2> f30962a;

        C6940n(TestActivity2 testActivity2) {
            this.f30962a = new WeakReference<>(testActivity2);
        }

        public void handleMessage(Message message) {
            Bundle data;
            int i;
            TestActivity2 testActivity2 = (TestActivity2) this.f30962a.get();
            if (testActivity2 != null && message.what == 1 && (data = message.getData()) != null && (i = data.getInt("progress")) >= 0) {
                double u = C8287e.m45871u();
                testActivity2.f30895G0.setPercentage(u == 0.0d ? 0.0f : ((float) (((double) (((float) i) * 100.0f)) / u)) / 100.0f);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void mo26798C3() {
        m39735i3(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: B4 */
    public void m39660B4(int i) {
        DeepDefaultTitle deepDefaultTitle = this.f30884B;
        if (deepDefaultTitle != null) {
            deepDefaultTitle.setViewPagerPosition(i);
        }
    }

    /* renamed from: C4 */
    private void m39662C4(int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public /* synthetic */ void mo26799E3(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.bottom_play_bar:
                m39737j3();
                return;
            case R.id.iv_playlist:
                m39715Y4();
                return;
            case R.id.iv_playpause:
            case R.id.rl_play_pause:
                C8287e.m45830c1(C8287e.m45863q(), this.f30919X);
                return;
            case R.id.nav_widget:
                m39741l3();
                return;
            default:
                switch (id) {
                    case R.id.ll_add_to_playlist:
                        mo26812Z3();
                        return;
                    case R.id.ll_add_to_queue:
                        mo26811Y3();
                        return;
                    default:
                        switch (id) {
                            case R.id.ll_multi_delete:
                                m39713X3();
                                return;
                            case R.id.ll_multi_remove:
                                m39719a4();
                                return;
                            default:
                                switch (id) {
                                    case R.id.nav_car_mode:
                                        m39727d5();
                                        return;
                                    case R.id.nav_equalizer:
                                        m39743m4();
                                        return;
                                    case R.id.nav_marquee:
                                        C8287e.m45771A0();
                                        m39718a3();
                                        C8335m.m46058d(this);
                                        return;
                                    case R.id.nav_rate_for_us:
                                        m39755r4();
                                        return;
                                    case R.id.nav_recommend:
                                        startActivityForResult(new Intent(this, GiftWithGameActivity.class), 122);
                                        return;
                                    case R.id.nav_remove_ads:
                                        m39717Z4();
                                        return;
                                    case R.id.nav_ringtone_cutter:
                                        this.f30893F0.mo3512h();
                                        if (!AdHelper.m49536p().mo32459v(this, new C6974i1(this))) {
                                            m39735i3(this);
                                            return;
                                        }
                                        return;
                                    case R.id.nav_setting:
                                        m39740k4();
                                        return;
                                    case R.id.nav_share:
                                        m39711W4();
                                        return;
                                    case R.id.nav_theme:
                                        m39739k3();
                                        return;
                                    case R.id.nav_time_sleep:
                                        m39722b5();
                                        return;
                                    case R.id.nav_video:
                                        mo26821o4();
                                        return;
                                    default:
                                        return;
                                }
                        }
                }
        }
    }

    /* renamed from: D4 */
    private void m39665D4() {
        RelativeLayout relativeLayout = (RelativeLayout) this.f30899I0.mo24288f(0);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        ViewGroup.LayoutParams layoutParams = this.f30899I0.getLayoutParams();
        layoutParams.width = (int) (((double) defaultDisplay.getWidth()) * 0.8d);
        this.f30899I0.setLayoutParams(layoutParams);
        ((RelativeLayout) relativeLayout.findViewById(R.id.navigation_layout)).setBackgroundColor(C8343s.m46295c(R.color.nav_header_bg_color));
        View findViewById = findViewById(R.id.nav_bg_cover);
        LinearLayout linearLayout = (LinearLayout) relativeLayout.findViewById(R.id.ll_root);
        ((ImageView) relativeLayout.findViewById(R.id.iv_ads)).setImageDrawable(C8343s.m46298f(R.drawable.ad_white));
        C8343s.m46307o((ImageView) findViewById(R.id.nav_bg), false);
        int i = 8;
        findViewById.setVisibility(C8343s.f34787b ? 0 : 8);
        this.f30902K = relativeLayout.findViewById(R.id.promotion_play_icon_layout);
        this.f30904L = (ImageView) relativeLayout.findViewById(R.id.promotion_play_icon_layout_icon);
        this.f30906M = (TextView) relativeLayout.findViewById(R.id.promotion_play_icon_layout_app_info);
        LinearLayout linearLayout2 = (LinearLayout) relativeLayout.findViewById(R.id.nav_bg_3);
        ((LinearLayout.LayoutParams) linearLayout2.getLayoutParams()).setMargins(0, C8345u.m46323d(10), 0, BaseApplication.f31157u);
        ((LinearLayout) relativeLayout.findViewById(R.id.nav_bg_1)).setBackground(C8343s.m46298f(R.drawable.slider_shape));
        ((LinearLayout) relativeLayout.findViewById(R.id.nav_bg_2)).setBackground(C8343s.m46298f(R.drawable.slider_shape));
        linearLayout2.setBackground(C8343s.m46298f(R.drawable.slider_shape));
        this.f30933l0 = (RelativeLayout) relativeLayout.findViewById(R.id.nav_equalizer);
        this.f30934m0 = (RelativeLayout) relativeLayout.findViewById(R.id.nav_widget);
        this.f30935n0 = (RelativeLayout) relativeLayout.findViewById(R.id.nav_theme);
        this.f30936o0 = (RelativeLayout) relativeLayout.findViewById(R.id.nav_remove_ads);
        m39690N4();
        this.f30937p0 = (RelativeLayout) relativeLayout.findViewById(R.id.nav_rate_for_us);
        this.f30938q0 = (RelativeLayout) relativeLayout.findViewById(R.id.nav_share);
        this.f30939r0 = (RelativeLayout) relativeLayout.findViewById(R.id.nav_setting);
        this.f30945x0 = (RelativeLayout) relativeLayout.findViewById(R.id.nav_recommend);
        this.f30947z0 = (TextView) relativeLayout.findViewById(R.id.tv_badge);
        RelativeLayout relativeLayout2 = this.f30945x0;
        if (C9564d.m50184j(this)) {
            i = 0;
        }
        relativeLayout2.setVisibility(i);
        m39718a3();
        this.f30942u0 = (RelativeLayout) relativeLayout.findViewById(R.id.nav_marquee);
        this.f30943v0 = (RelativeLayout) relativeLayout.findViewById(R.id.nav_car_mode);
        this.f30941t0 = (MarqueeSmallCircleView) relativeLayout.findViewById(R.id.smallCircleView);
        this.f30944w0 = (RelativeLayout) relativeLayout.findViewById(R.id.nav_video);
        this.f30901J0 = (RelativeLayout) relativeLayout.findViewById(R.id.nav_time_sleep);
        this.f30905L0 = (TextView) relativeLayout.findViewById(R.id.tv_time);
        C8335m.m46061g(this, this.f30941t0);
        this.f30946y0 = (RelativeLayout) relativeLayout.findViewById(R.id.nav_ringtone_cutter);
        ((TextView) relativeLayout.findViewById(R.id.sidebar_ringtone_cutter_text)).setTextColor(C9332d.m49405b(this, R.color.default_text_color));
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f30902K.getLayoutParams();
        layoutParams2.topMargin = C8345u.m46323d(20);
        layoutParams2.height = C8345u.m46323d(40);
        this.f30902K.setLayoutParams(layoutParams2);
        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) this.f30904L.getLayoutParams();
        this.f30904L.getLayoutParams().width = (int) (getResources().getDisplayMetrics().density * 20.0f);
        this.f30904L.getLayoutParams().height = (int) (getResources().getDisplayMetrics().density * 20.0f);
        layoutParams3.setMargins((int) (getResources().getDisplayMetrics().density * 20.0f), 0, 0, 0);
        layoutParams3.setMarginStart((int) (getResources().getDisplayMetrics().density * 20.0f));
        this.f30906M.setTextSize(14.0f);
        this.f30906M.setTextColor(C8343s.m46295c(R.color.default_text_color));
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) this.f30906M.getLayoutParams();
        layoutParams4.setMargins((int) (getResources().getDisplayMetrics().density * 30.0f), 0, 0, 0);
        layoutParams4.setMarginStart((int) (getResources().getDisplayMetrics().density * 30.0f));
        m39675H4();
        m39677I4(relativeLayout);
    }

    /* renamed from: E4 */
    private void m39667E4() {
        this.f30895G0.setPercentage((float) this.f30915T);
        if (!C8287e.m45812V()) {
            C8287e.m45856m0(this.f30915T);
        }
        m39746o2(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public /* synthetic */ void mo26800G3(View view) {
        if (this.f30909N0.getVisibility() == 8) {
            this.f30909N0.setVisibility(0);
        } else if (this.f30909N0.getVisibility() == 0) {
            this.f30909N0.setVisibility(8);
        }
    }

    /* renamed from: F4 */
    private void m39670F4(Intent intent, int i) {
        m39730f3(intent);
        this.f30888D.setSelectTab(i);
        m39660B4(i);
    }

    /* renamed from: G4 */
    private void m39672G4() {
        this.f30930i0 = new C6940n(this);
        m39667E4();
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public /* synthetic */ void mo26801I3() {
        C9502v.m49939j(this);
    }

    /* renamed from: H4 */
    private void m39675H4() {
        new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{16842912}}, new int[]{C9332d.m49405b(this, R.color.default_text_color), C9332d.m49405b(this, R.color.default_text_color)});
        this.f30906M.setTextColor(C8343s.m46295c(R.color.default_text_color));
    }

    /* renamed from: I4 */
    private void m39677I4(RelativeLayout relativeLayout) {
        RelativeLayout relativeLayout2 = relativeLayout;
        TextView textView = (TextView) relativeLayout2.findViewById(R.id.sidebar_eq_text);
        TextView textView2 = (TextView) relativeLayout2.findViewById(R.id.sidebar_theme_text);
        TextView textView3 = (TextView) relativeLayout2.findViewById(R.id.sidebar_car_mode_text);
        TextView textView4 = (TextView) relativeLayout2.findViewById(R.id.sidebar_video_text);
        TextView textView5 = (TextView) relativeLayout2.findViewById(R.id.sidebar_ringtone_cutter_text);
        TextView textView6 = (TextView) relativeLayout2.findViewById(R.id.sidebar_widget_text);
        TextView textView7 = (TextView) relativeLayout2.findViewById(R.id.sidebar_marquee_text);
        TextView textView8 = (TextView) relativeLayout2.findViewById(R.id.sidebar_setting_text);
        TextView textView9 = (TextView) relativeLayout2.findViewById(R.id.sidebar_remove_text);
        TextView textView10 = (TextView) relativeLayout2.findViewById(R.id.sidebar_top_free_text);
        TextView textView11 = (TextView) relativeLayout2.findViewById(R.id.sidebar_rate_us_text);
        TextView textView12 = (TextView) relativeLayout2.findViewById(R.id.sidebar_share_text);
        TextView textView13 = (TextView) relativeLayout2.findViewById(R.id.sidebar_time_sleep);
        textView.setTextColor(C8343s.m46295c(R.color.default_text_color));
        textView2.setTextColor(C8343s.m46295c(R.color.default_text_color));
        textView3.setTextColor(C8343s.m46295c(R.color.default_text_color));
        textView4.setTextColor(C8343s.m46295c(R.color.default_text_color));
        textView5.setTextColor(C8343s.m46295c(R.color.default_text_color));
        textView6.setTextColor(C8343s.m46295c(R.color.default_text_color));
        textView7.setTextColor(C8343s.m46295c(R.color.default_text_color));
        textView8.setTextColor(C8343s.m46295c(R.color.default_text_color));
        textView9.setTextColor(C8343s.m46295c(R.color.default_text_color));
        textView10.setTextColor(C8343s.m46295c(R.color.default_text_color));
        textView11.setTextColor(C8343s.m46295c(R.color.default_text_color));
        textView12.setTextColor(C8343s.m46295c(R.color.default_text_color));
        textView13.setTextColor(C8343s.m46295c(R.color.default_text_color));
        this.f30905L0.setTextColor(C8343s.m46295c(R.color.default_text_color));
        Drawable l = C8343s.m46304l(R.drawable.ic_sidebar_ic01_eq, R.color.default_text_color);
        l.setBounds(0, 0, l.getMinimumWidth(), l.getMinimumHeight());
        textView.setCompoundDrawablesRelative(l, (Drawable) null, (Drawable) null, (Drawable) null);
        Drawable l2 = C8343s.m46304l(R.drawable.ic_sidebar_ic02_themes, R.color.default_text_color);
        l2.setBounds(0, 0, l2.getMinimumWidth(), l2.getMinimumHeight());
        textView2.setCompoundDrawablesRelative(l2, (Drawable) null, (Drawable) null, (Drawable) null);
        Drawable l3 = C8343s.m46304l(R.drawable.ic_sidebar_ic03_car_mode, R.color.default_text_color);
        l3.setBounds(0, 0, l3.getMinimumWidth(), l3.getMinimumHeight());
        textView3.setCompoundDrawablesRelative(l3, (Drawable) null, (Drawable) null, (Drawable) null);
        Drawable l4 = C8343s.m46304l(R.drawable.ic_sidebar_ic05_video, R.color.default_text_color);
        l4.setBounds(0, 0, l4.getMinimumWidth(), l4.getMinimumHeight());
        textView4.setCompoundDrawablesRelative(l4, (Drawable) null, (Drawable) null, (Drawable) null);
        Drawable l5 = C8343s.m46304l(R.drawable.ic_sidebar_ic14_ringtone_cut, R.color.default_text_color);
        l5.setBounds(0, 0, l5.getMinimumWidth(), l5.getMinimumHeight());
        textView5.setCompoundDrawablesRelative(l5, (Drawable) null, (Drawable) null, (Drawable) null);
        Drawable l6 = C8343s.m46304l(R.drawable.ic_sidebar_ic06_widget, R.color.default_text_color);
        l6.setBounds(0, 0, l6.getMinimumWidth(), l6.getMinimumHeight());
        textView6.setCompoundDrawablesRelative(l6, (Drawable) null, (Drawable) null, (Drawable) null);
        Drawable l7 = C8343s.m46304l(R.drawable.ic_sidebar_ic07_el, R.color.default_text_color);
        l7.setBounds(0, 0, l7.getMinimumWidth(), l7.getMinimumHeight());
        textView7.setCompoundDrawablesRelative(l7, (Drawable) null, (Drawable) null, (Drawable) null);
        Drawable l8 = C8343s.m46304l(R.drawable.ic_sidebar_ic04_sleep_timer, R.color.default_text_color);
        l8.setBounds(0, 0, l8.getMinimumWidth(), l8.getMinimumHeight());
        textView13.setCompoundDrawablesRelative(l8, (Drawable) null, (Drawable) null, (Drawable) null);
        Drawable l9 = C8343s.m46304l(R.drawable.ic_sidebar_ic09_setting, R.color.default_text_color);
        l9.setBounds(0, 0, l9.getMinimumWidth(), l9.getMinimumHeight());
        textView8.setCompoundDrawablesRelative(l9, (Drawable) null, (Drawable) null, (Drawable) null);
        Drawable l10 = C8343s.m46304l(R.drawable.ic_sidebar_ic10_rd, R.color.default_text_color);
        l10.setBounds(0, 0, l10.getMinimumWidth(), l10.getMinimumHeight());
        textView9.setCompoundDrawablesRelative(l10, (Drawable) null, (Drawable) null, (Drawable) null);
        Drawable l11 = C8343s.m46304l(R.drawable.ic_sidebar_ic11_ha, R.color.default_text_color);
        l11.setBounds(0, 0, l11.getMinimumWidth(), l11.getMinimumHeight());
        textView10.setCompoundDrawablesRelative(l11, (Drawable) null, (Drawable) null, (Drawable) null);
        Drawable l12 = C8343s.m46304l(R.drawable.ic_sidebar_ic12_rfu, R.color.default_text_color);
        l12.setBounds(0, 0, l12.getMinimumWidth(), l12.getMinimumHeight());
        textView11.setCompoundDrawablesRelative(l12, (Drawable) null, (Drawable) null, (Drawable) null);
        Drawable l13 = C8343s.m46304l(R.drawable.ic_sidebar_ic13_share, R.color.default_text_color);
        l13.setBounds(0, 0, l13.getMinimumWidth(), l13.getMinimumHeight());
        textView12.setCompoundDrawablesRelative(l13, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public /* synthetic */ void mo26802K3(int i) {
        if (i == 1) {
            m39662C4(BaseApplication.f31157u);
        } else {
            m39662C4(C9566f.m50190a(this, 5));
        }
    }

    /* renamed from: J4 */
    private void m39680J4() {
    }

    /* renamed from: K4 */
    private void m39682K4() {
        SquareMusicImageView squareMusicImageView = this.f30889D0;
        if (squareMusicImageView != null && (squareMusicImageView instanceof SquareMusicImageView)) {
            squareMusicImageView.mo27359l();
        }
    }

    /* renamed from: L4 */
    private void m39685L4(int i) {
        PermissionRequestDetailView permissionRequestDetailView = this.f30883A0;
        if (permissionRequestDetailView != null) {
            permissionRequestDetailView.setVisibility(i);
        }
        if (i == 8) {
            this.f30883A0 = null;
        }
    }

    /* renamed from: M4 */
    private void m39687M4() {
        C8287e.m45843h(this.f30916U, this.f30919X, true);
        this.f30922a0.mo27363r(0, new C6983l1(this));
        m39712X2(true, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: N4 */
    public void m39690N4() {
        try {
            m39771x4();
        } catch (Exception unused) {
        }
    }

    /* renamed from: O4 */
    private void m39692O4() {
        SquareMusicImageView squareMusicImageView = this.f30889D0;
        if (squareMusicImageView != null && (squareMusicImageView instanceof SquareMusicImageView)) {
            squareMusicImageView.mo27360m();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P3 */
    public /* synthetic */ void mo26806Q3(boolean z, int i) {
        if (C8343s.f34787b || C8343s.f34788c == 2) {
            ((GradientDrawable) this.f30887C0.getBackground()).setColor(C8345u.m46326g(R.color.custom_bottom_play_bar));
        } else {
            ((GradientDrawable) this.f30887C0.getBackground()).setColor(i);
        }
    }

    /* renamed from: Q4 */
    private void m39696Q4(boolean z) {
        if (!BaseApplication.f31142E) {
            if (z) {
                BaseApplication.f31142E = true;
                C8337n.m46065k0(this).mo30097F2(true);
            }
            if (this.f30921Z != null) {
                new Handler().postDelayed(new C6925a(), 700);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public /* synthetic */ void mo26808S3(View view, int i) {
        if (!AdHelper.m49536p().mo32459v(this, new C6968g1(this))) {
            m39737j3();
        }
    }

    /* renamed from: S4 */
    private void m39700S4() {
        SquareMusicImageView squareMusicImageView = this.f30889D0;
        if (squareMusicImageView != null && (squareMusicImageView instanceof SquareMusicImageView)) {
            squareMusicImageView.mo27361n();
        }
    }

    /* renamed from: T3 */
    static /* synthetic */ C8457t m39702T3(Integer num, Long l, C8446k kVar) {
        if (num.intValue() == 0) {
            C8287e.m45824a1();
        } else if (num.intValue() == 6) {
            C8287e.m45817X0(l);
        } else {
            C8287e.m45817X0(Long.valueOf(((long) (num.intValue() * 15 * 60)) * 1000));
        }
        C8337n.m46065k0(C8345u.m46327h()).mo30093E2(num.intValue());
        C8337n.m46065k0(C8345u.m46327h()).mo30230m2(((Boolean) kVar.getFirst()).booleanValue());
        C8287e.m45805R0(kVar);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: U3 */
    public void m39704U3() {
        m39707V3();
    }

    /* renamed from: U4 */
    private void m39705U4() {
        this.f30884B.setHomeIcon(true);
        this.f30884B.setMutilIcon(true);
        this.f30884B.setSort(0);
        this.f30884B.setTitleText(C8345u.m46333n(R.string.music_eq_app_name));
        this.f30884B.setMenuIcon(false);
        this.f30884B.setTitleBackgroundColor(C8345u.m46326g(R.color.library_title_backgroud_color));
        this.f30884B.mo27431B(true, true);
        C8343s.m46307o(this.f30886C, false);
        this.f30886C.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    /* renamed from: V3 */
    private void m39707V3() {
        SquareMusicImageView squareMusicImageView = this.f30889D0;
        if (squareMusicImageView != null && (squareMusicImageView instanceof SquareMusicImageView)) {
            squareMusicImageView.mo27357j();
        }
    }

    /* renamed from: V4 */
    private void m39708V4() {
        if (C8343s.f34788c == BaseApplication.f31162z) {
            Window window = getWindow();
            window.getDecorView().setSystemUiVisibility(8208);
            if (Build.VERSION.SDK_INT >= 21) {
                window.setNavigationBarColor(-1);
            }
        }
    }

    /* renamed from: W2 */
    private void m39709W2() {
        new Thread(new C6928d()).start();
    }

    /* renamed from: W3 */
    private void m39710W3() {
        m39685L4(8);
        this.f30891E0.setVisibility(0);
        m39744n3();
        m39747o3();
        m39748p3();
        m39726d3();
        C8287e.m45799O0(this);
        m39680J4();
    }

    /* renamed from: W4 */
    private void m39711W4() {
        try {
            C7382d.m41675f(this, "Music Player", C8345u.m46333n(R.string.share_txt));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: X2 */
    private void m39712X2(boolean z, boolean z2) {
        Drawable drawable;
        if (C8287e.m45873v() != null) {
            this.f30929h0.setVisibility(8);
            this.f30922a0.setVisibility(0);
            this.f30889D0.setVisibility(0);
            this.f30897H0.setVisibility(0);
            ImageView imageView = this.f30913R;
            if (imageView != null) {
                if (C8287e.m45812V()) {
                    drawable = C9332d.m49407d(this, R.drawable.ic_home07_play2);
                } else {
                    drawable = C9332d.m49407d(this, R.drawable.ic_home05_pause);
                }
                imageView.setImageDrawable(drawable);
            }
            C7238p0 p0Var = this.f30918W;
            if (p0Var != null && p0Var.mo27811y().size() == 0) {
                m39732f5();
            }
            if (z || this.f30928g0) {
                m39714Y2(this.f30928g0);
                this.f30928g0 = false;
            }
            double r = C8287e.m45865r();
            double u = C8287e.m45871u();
            if (u == 0.0d || r == 0.0d) {
                this.f30895G0.setPercentage(0.0f);
            } else {
                this.f30895G0.mo9710d((int) r, (int) u);
            }
            m39746o2(false);
            if (z2) {
                m39709W2();
            }
            C8287e.m45873v().mo9215k();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X3 */
    public void m39713X3() {
        if (C8287e.m45798O() == null || C8287e.m45798O().size() <= 0) {
            C8344t.m46317e(C8345u.m46327h(), C8345u.m46333n(R.string.please_select_track));
            return;
        }
        long[] E = C8287e.m45778E(C8287e.m45798O());
        C7382d.m41679j(this, getString(R.string.mutil_track), E, C8343s.m46300h(), C8345u.m46326g(R.color.white), C8345u.m46326g(R.color.color_bbb), new C6935k(E));
    }

    /* renamed from: Y2 */
    private void m39714Y2(boolean z) {
        if (this.f30925d0 || z) {
            m39721b4(0);
        }
        m39766v4();
        m39724c4(false);
    }

    /* renamed from: Y4 */
    private void m39715Y4() {
        this.f30918W.mo27759j(this);
        this.f30918W.mo27743k(this.f30914S);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public void m39716Z2() {
        C8343s.m46307o(this.f30886C, false);
        this.f30918W.mo27809t();
        recreate();
    }

    /* renamed from: Z4 */
    private void m39717Z4() {
        C8282b.m45731c().mo29983d(this, new C6931g());
    }

    /* renamed from: a3 */
    private void m39718a3() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a4 */
    public void m39719a4() {
        if (C8287e.m45798O() == null || C8287e.m45798O().size() <= 0) {
            C8344t.m46317e(C8345u.m46327h(), C8345u.m46333n(R.string.please_select_track));
            return;
        }
        C4269f.C4274d dVar = new C4269f.C4274d(this);
        dVar.mo14622I(R.string.remove_song_tips);
        dVar.mo14624K(C8345u.m46326g(R.color.black));
        dVar.mo14631f(getString(R.string.remove_song_tip) + " " + getString(R.string.mutil_remove_track) + " ?");
        dVar.mo14628b(C8345u.m46326g(R.color.white));
        dVar.mo14632g(C8345u.m46326g(R.color.color_bbb));
        dVar.mo14620G(getString(R.string.remove));
        dVar.mo14649x(getString(R.string.cancel));
        dVar.mo14617D(C8343s.m46300h());
        dVar.mo14646u(C8343s.m46300h());
        dVar.mo14616C(new C6934j());
        dVar.mo14615B(new C6933i());
        dVar.mo14621H();
    }

    /* renamed from: b3 */
    private void m39720b3() {
        if (Build.VERSION.SDK_INT < 23) {
            m39710W3();
        } else if (C7366c.m41592d(C7366c.f32436d)) {
            m39710W3();
        } else {
            m39685L4(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b4 */
    public void m39721b4(int i) {
        AlbumArtViewPager albumArtViewPager = this.f30922a0;
        if (albumArtViewPager != null) {
            albumArtViewPager.mo27362q(i);
        }
        this.f30924c0 = true;
    }

    /* renamed from: b5 */
    private void m39722b5() {
        C7344h i = C7344h.m41524i(this, C8337n.m46065k0(C8345u.m46327h()).mo30111J0(), C8337n.m46065k0(C8345u.m46327h()).mo30236o0(), C6995p1.f31058g);
        this.f30903K0 = i;
        i.show();
    }

    /* renamed from: c3 */
    private void m39723c3() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c4 */
    public void m39724c4(boolean z) {
        if (this.f30924c0) {
            AlbumArtViewPager albumArtViewPager = this.f30922a0;
            if (albumArtViewPager != null) {
                albumArtViewPager.mo26325f();
            }
            this.f30924c0 = false;
            this.f30925d0 = false;
        }
        AlbumArtViewPager albumArtViewPager2 = this.f30922a0;
        if (albumArtViewPager2 != null) {
            albumArtViewPager2.setCurrentItem(z);
        }
    }

    /* renamed from: c5 */
    private void m39725c5() {
    }

    /* renamed from: d3 */
    private void m39726d3() {
        C8287e.m45793L0(false);
        C8287e.m45791K0(-1);
        C8287e.m45849j();
    }

    /* renamed from: d5 */
    private void m39727d5() {
        CarModeActivity.m38778A2(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public void m39728e3() {
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
            } else if (BaseApplication.f31150n > C8287e.m45881z() && C8287e.m45867s() != null && this.f30918W != null && C8287e.m45867s() != null) {
                List<Music> s2 = C8287e.m45867s();
                int size = s2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (s2.get(i3) != null && s2.get(i3).mo9214j() / 1000 < BaseApplication.f31150n) {
                        this.f30918W.mo27801I(i3);
                    }
                }
            }
        } catch (Exception unused) {
            C8344t.m46316d(this, R.string.error);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e4 */
    public void m39729e4() {
    }

    /* renamed from: f3 */
    private boolean m39730f3(Intent intent) {
        if (intent == null) {
            return false;
        }
        boolean booleanExtra = intent.getBooleanExtra("fromCutter", false);
        boolean booleanExtra2 = intent.getBooleanExtra("slider", false);
        if (booleanExtra) {
            String str = C7397j.f32507d;
            C8216w2.m45360d(this, (C8200u2) null, str.substring(0, str.length() - 1), "Music Cutter", booleanExtra2);
        }
        return booleanExtra;
    }

    /* access modifiers changed from: private */
    /* renamed from: f4 */
    public void m39731f4(int i, boolean z) {
    }

    /* access modifiers changed from: private */
    /* renamed from: f5 */
    public void m39732f5() {
        C7238p0 p0Var = this.f30918W;
        if (p0Var != null) {
            p0Var.mo27802J();
            this.f30918W.mo27799G();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g4 */
    public void m39733g4() {
    }

    /* access modifiers changed from: private */
    /* renamed from: h4 */
    public void m39689N3() {
        if (!C8315g.m45979a() && C8287e.m45873v() != null) {
            m39764u4();
            C8337n.m46065k0(this).mo30121L2(1);
            MainActivity.m39344F3(this, 109, 1);
            overridePendingTransition(R.anim.entry, R.anim.hold);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public void m39735i3(Context context) {
        new C8337n(this);
        Intent intent = new Intent(context, TestActivity2.class);
        intent.putExtra("fromCutter", true);
        intent.putExtra("slider", true);
        startActivity(intent);
        mo26820m3();
    }

    /* access modifiers changed from: private */
    /* renamed from: i4 */
    public void m39736i4() {
        m39738j4();
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public void m39737j3() {
        startActivity(new Intent(this, TestActivity.class));
    }

    /* renamed from: j4 */
    private void m39738j4() {
        C8090e3 x3 = C8090e3.m44548x3(2);
        C0620p i = mo3730H1().mo3957i();
        i.mo4068b(R.id.fragment, x3);
        i.mo4073g(C8090e3.f34149t0);
        i.mo3816j();
    }

    /* renamed from: k3 */
    private void m39739k3() {
        this.f30893F0.mo3512h();
        new Handler().postDelayed(new C6953b1(this), 400);
    }

    /* renamed from: k4 */
    private void m39740k4() {
        if (!AdHelper.m49536p().mo32459v(this, new C6992o1(this))) {
            m39684L3();
        }
    }

    /* renamed from: l3 */
    private void m39741l3() {
        if (!AdHelper.m49536p().mo32459v(this, new C6977j1(this))) {
            m39773y3();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l4 */
    public void m39684L3() {
        startActivity(new Intent(this, SettingActivity.class));
    }

    /* renamed from: m4 */
    private void m39743m4() {
        if (!AdHelper.m49536p().mo32459v(this, new C6980k1(this))) {
            m39689N3();
        }
    }

    /* renamed from: n3 */
    private void m39744n3() {
        this.f30911P.setVisibility(0);
        m39670F4(getIntent(), this.f30898I.mo30228m0());
        this.f30916U.mo28184e();
        this.f30915T = this.f30916U.mo28183d();
        C8287e.m45781F0(this.f30916U.mo28186h(), (ImageView) null, 1, true);
        if (this.f30918W == null) {
            C7238p0 p0Var = new C7238p0(this, false, C7238p0.f31962E);
            this.f30918W = p0Var;
            p0Var.mo27806P(this);
        }
        this.f30917V = C7973c.m43649d(this);
        this.f30920Y = C7974d.m43656d(this);
        List<Music> e = this.f30917V.mo29507e();
        this.f30919X = e;
        if (e.size() <= 0) {
            this.f30925d0 = true;
            this.f30919X = C4477c.m19585M(C8345u.m46327h());
        }
        m39687M4();
        if (this.f30919X.size() <= 0) {
            m39761t4();
        }
        m39672G4();
    }

    /* access modifiers changed from: private */
    /* renamed from: n4 */
    public void m39745n4() {
        SkinChangeActivity.m39519D2(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public void m39746o2(boolean z) {
        if (C8287e.m45812V() || z) {
            C8287e.m45819Y0(this.f30931j0, this.f30932k0, this.f30930i0, this);
        } else {
            C8287e.m45827b1(this.f30931j0, this.f30932k0);
        }
    }

    /* renamed from: o3 */
    private void m39747o3() {
        C6956c1 c1Var = new C6956c1(this);
        this.f30913R.setOnClickListener(c1Var);
        this.f30907M0.setOnClickListener(c1Var);
        this.f30914S.setOnClickListener(c1Var);
        this.f30911P.setOnClickListener(c1Var);
        this.f30933l0.setOnClickListener(c1Var);
        this.f30934m0.setOnClickListener(c1Var);
        this.f30935n0.setOnClickListener(c1Var);
        this.f30936o0.setOnClickListener(c1Var);
        this.f30937p0.setOnClickListener(c1Var);
        this.f30938q0.setOnClickListener(c1Var);
        this.f30939r0.setOnClickListener(c1Var);
        this.f30901J0.setOnClickListener(c1Var);
        this.f30942u0.setOnClickListener(c1Var);
        this.f30943v0.setOnClickListener(c1Var);
        this.f30944w0.setOnClickListener(c1Var);
        this.f30945x0.setOnClickListener(c1Var);
        this.f30946y0.setOnClickListener(c1Var);
        this.f30884B.setTitleOnClickListener(new C6929e());
        this.f30922a0.setOnPagerChangeListener(this);
        this.f30888D.mo24736d(new C6930f());
    }

    /* renamed from: p3 */
    private void m39748p3() {
        this.f30892F = new C6938m(this, (C6928d) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.select_track_to_updata_num");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.select_track_to_updata_ui");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.playlist.fragment.action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.WAKEUP.EXIT");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.clean_list");
        intentFilter.addAction(C8311c.f34738e);
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.state.action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.detail_update_page");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.artwork_update_page");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.update_page");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.notify_ui");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.eq_switch");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.filter_notify_list");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.remove_ad");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.onwindowfocuschanged");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.sound_effect_notify");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.sound_effect_notify_select");
        intentFilter.addAction(C8311c.f34737d);
        intentFilter.addAction(getPackageName() + C8311c.f34734a);
        registerReceiver(this.f30892F, intentFilter);
    }

    /* access modifiers changed from: private */
    /* renamed from: p4 */
    public void m39749p4() {
        startActivity(new Intent(this, ContentActivity.class));
    }

    /* renamed from: q3 */
    private void m39751q3() {
        if (this.f30890E == null) {
            DeepSelectTitle deepSelectTitle = (DeepSelectTitle) findViewById(R.id.select_title);
            this.f30890E = deepSelectTitle;
            deepSelectTitle.setAddStatusHeight(true);
            this.f30890E.setSelectTitleOnClickListener(new C6932h());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q4 */
    public void m39773y3() {
        startActivity(new Intent(this, WidgetActivity.class));
    }

    /* renamed from: r3 */
    private void m39754r3() {
        this.f30884B = (DeepDefaultTitle) findViewById(R.id.defualt_title);
        this.f30886C = (ImageView) findViewById(R.id.library_bg);
        findViewById(R.id.bg_cover).setVisibility(C8343s.f34787b ? 0 : 8);
        this.f30883A0 = (PermissionRequestDetailView) findViewById(R.id.permissionRequestDetailView);
        if (C0506a.m3149a(this, C7366c.f32436d) != 0) {
            m39685L4(0);
        }
        ((TextView) this.f30883A0.findViewById(R.id.tv_title)).setTextColor(C8345u.m46326g(R.color.default_text_color));
        ((TextView) this.f30883A0.findViewById(R.id.tv_detail)).setTextColor(C8345u.m46326g(R.color.default_text_color));
        ((TextView) this.f30883A0.findViewById(R.id.button_allow)).setTextColor(C8345u.m46326g(R.color.white));
        ((ImageView) this.f30883A0.findViewById(R.id.iv_icon)).setImageDrawable(C8343s.m46304l(R.drawable.ic_request_icon, R.color.colorAccent));
        this.f30883A0.setAllowPermissionListener(this);
        NoScrollTabLayout noScrollTabLayout = (NoScrollTabLayout) findViewById(R.id.tabs);
        this.f30888D = noScrollTabLayout;
        noScrollTabLayout.setSelectedTabIndicatorHeight(0);
        this.f30900J = (RelativeLayout) findViewById(R.id.bottomcontrol);
        this.f30911P = (RelativeLayout) findViewById(R.id.bottom_play_bar);
        this.f30912Q = (RelativeLayout) findViewById(R.id.rl_bottom_bar_group);
        this.f30913R = (ImageView) findViewById(R.id.iv_playpause);
        this.f30907M0 = (RelativeLayout) findViewById(R.id.rl_play_pause);
        this.f30914S = (ImageView) findViewById(R.id.iv_playlist);
        this.f30929h0 = (LinearLayout) findViewById(R.id.rl_bottom_no_track);
        this.f30921Z = (RelativeLayout) findViewById(R.id.rl_bottom_viewpager);
        AlbumArtViewPager albumArtViewPager = new AlbumArtViewPager(this);
        this.f30922a0 = albumArtViewPager;
        albumArtViewPager.mo26322c();
        this.f30921Z.addView(this.f30922a0);
        this.f30940s0 = (MarqueeView) findViewById(R.id.am_sweepView);
        this.f30887C0 = (RelativeLayout) findViewById(R.id.iv_play_bar_bg);
        this.f30889D0 = (SquareMusicImageView) findViewById(R.id.iv_album);
        this.f30897H0 = (ImageView) findViewById(R.id.iv_album_bg);
        m39774y4();
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_bottom_layout);
        this.f30891E0 = relativeLayout;
        relativeLayout.getLayoutTransition().enableTransitionType(4);
        RoundProgressView roundProgressView = (RoundProgressView) findViewById(R.id.progress);
        this.f30895G0 = roundProgressView;
        roundProgressView.setRadius(6);
        this.f30895G0.setProgressColor(C8343s.m46300h());
        this.f30899I0 = (NavigationView) findViewById(R.id.nav_view);
        this.f30893F0 = (DrawerLayout) findViewById(R.id.drawerLayout);
        m39665D4();
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(R.id.tv_red);
        this.f30909N0 = (RelativeLayout) findViewById(R.id.tv_blue);
        ((Button) findViewById(R.id.animation)).setOnClickListener(new C6998q1(this));
    }

    /* renamed from: r4 */
    private void m39755r4() {
        C9502v.m49945p(this);
    }

    /* renamed from: s4 */
    private void m39758s4() {
        try {
            if (!C9502v.m49948s() && C9502v.m49943n() > 0) {
                TextView textView = this.f30947z0;
                textView.setText(C9502v.m49943n() + BuildConfig.FLAVOR);
                this.f30947z0.setVisibility(0);
            } else if (!C9502v.m49948s() && C9502v.m49943n() == 0) {
                this.f30947z0.setVisibility(8);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"UseCompatLoadingForDrawables"})
    /* renamed from: t4 */
    public void m39761t4() {
        C8287e.m45821Z0();
        m39700S4();
        this.f30929h0.setVisibility(0);
        this.f30922a0.setVisibility(8);
        this.f30913R.setImageDrawable(getResources().getDrawable(R.drawable.ic_home05_pause));
        C8287e.m45846i();
        C8287e.m45864q0((Music) null);
        C8287e.m45862p0(0);
        C8287e.m45882z0(new long[0]);
        m39774y4();
        this.f30928g0 = true;
        this.f30925d0 = true;
        m39732f5();
        this.f30895G0.setPercentage(0.0f);
        MarqueeView marqueeView = this.f30940s0;
        if (marqueeView != null) {
            C8335m.m46064j(this, false, marqueeView);
        }
        m39712X2(true, true);
        C8287e.m45820Z();
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public /* synthetic */ void mo26823v3() {
        startActivityForResult(C8333k.m46053d(this), SoundEffectListActivity.f30849U);
    }

    /* renamed from: u4 */
    private void m39764u4() {
        if (!(this.f30916U == null || C8287e.m45873v() == null)) {
            this.f30916U.mo28195q(C8287e.m45792L());
            this.f30916U.mo28193o(C8287e.m45863q());
            this.f30916U.mo28192n(C8287e.m45873v().mo9215k());
            this.f30916U.mo28190l(C8287e.m45865r());
            this.f30916U.mo28191m(C8287e.m45871u());
        }
        C7973c cVar = this.f30917V;
        if (cVar != null) {
            cVar.mo29505b();
            this.f30917V.mo29504a(C8287e.m45867s());
        }
    }

    /* renamed from: v4 */
    private void m39766v4() {
        if (this.f30927f0 && !this.f30926e0) {
            this.f30927f0 = false;
            m39721b4(0);
        }
        if (this.f30926e0) {
            m39721b4(1);
            this.f30926e0 = false;
            this.f30927f0 = true;
        }
        m39724c4(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ void mo26824x3() {
        if (!AdHelper.m49536p().mo32459v(this, new C6950a1(this))) {
            m39745n4();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w4 */
    public void m39769w4(Intent intent) {
        if (intent != null) {
            m39751q3();
            Bundle extras = intent.getExtras();
            boolean z = extras.getBoolean("disPlaySelectTitle");
            boolean z2 = extras.getBoolean("isPlaylistDetail");
            this.f30896H = 0;
            if (z2) {
                this.f30896H = extras.getLong("currentPlaylistId");
            }
            mo26496m2(!z2);
            if (z) {
                if (this.f30911P.getVisibility() != 8) {
                    this.f30911P.setVisibility(8);
                }
                if (this.f30888D.getVisibility() != 8) {
                    this.f30888D.setVisibility(8);
                }
                if (this.f30884B.getVisibility() != 4) {
                    this.f30884B.setVisibility(4);
                }
                DeepSelectTitle deepSelectTitle = this.f30890E;
                if (deepSelectTitle != null && deepSelectTitle.getVisibility() != 0) {
                    this.f30890E.setVisibility(0);
                    return;
                }
                return;
            }
            if (this.f30911P.getVisibility() != 0) {
                this.f30911P.setVisibility(0);
            }
            if (this.f30888D.getVisibility() != 0) {
                this.f30888D.setVisibility(0);
            }
            if (this.f30884B.getVisibility() != 0) {
                this.f30884B.setVisibility(0);
            }
            DeepSelectTitle deepSelectTitle2 = this.f30890E;
            if (deepSelectTitle2 != null && deepSelectTitle2.getVisibility() != 8) {
                this.f30890E.setVisibility(8);
            }
        }
    }

    /* renamed from: x4 */
    private void m39771x4() {
        RelativeLayout relativeLayout;
        if (C9502v.m49954y(this) && (relativeLayout = this.f30936o0) != null) {
            relativeLayout.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y4 */
    public void m39774y4() {
        Music v = C8287e.m45873v();
        if (v != null) {
            C8321j.m46009o(C4477c.m19603W(this, v.mo9215k(), C8287e.m45859o(), 0), R.drawable.home08_bg2, this.f30889D0, C8345u.m46323d(60), C8345u.m46323d(60), new C6965f1(this));
            return;
        }
        C8321j.m46006l(BuildConfig.FLAVOR, R.drawable.home08_bg2, this.f30889D0, C8345u.m46323d(60), C8345u.m46323d(60));
        if (C8343s.f34787b || C8343s.f34788c == 2) {
            ((GradientDrawable) this.f30887C0.getBackground()).setColor(C8345u.m46326g(R.color.custom_bottom_play_bar));
        } else {
            ((GradientDrawable) this.f30887C0.getBackground()).setColor(C8343s.m46295c(R.color.bottom_play_bar_light));
        }
    }

    /* renamed from: z4 */
    private void m39776z4() {
        SquareMusicImageView squareMusicImageView = this.f30889D0;
        if (squareMusicImageView != null && (squareMusicImageView instanceof SquareMusicImageView)) {
            squareMusicImageView.mo27358k();
        }
    }

    /* renamed from: A */
    public void mo26484A() {
        super.mo26484A();
        this.f30926e0 = true;
    }

    /* renamed from: A0 */
    public void mo26500A0() {
        mo26807R4(0);
    }

    /* renamed from: A1 */
    public void mo26485A1(int i) {
        super.mo26485A1(i);
        if (this.f30924c0) {
            this.f30924c0 = false;
        }
        m39721b4(0);
        m39724c4(false);
        C8287e.m45781F0(i, (ImageView) null, 2, true);
        C7238p0 p0Var = this.f30918W;
        if (p0Var != null) {
            p0Var.mo27808s(i);
        }
    }

    /* renamed from: A4 */
    public void mo26797A4(String str, int i, long j, int i2) {
        new C8337n(this).mo30261u1(C8311c.m45963b(i), j, str);
        if (!(i == 0 || i == 1)) {
            Intent intent = new Intent(C8311c.m45962a(i));
            intent.putExtra("artwork_position", i2);
            sendBroadcast(intent);
        }
        sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.track_artwork_item_notify"));
        sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.recent_artwork_item_notify"));
        if (C8287e.m45873v() != null && j == C8287e.m45873v().mo9215k()) {
            sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.artwork_update_page"));
            sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.update_widget"));
        }
        m39723c3();
    }

    /* renamed from: B1 */
    public void mo26501B1() {
        mo26807R4(3);
    }

    /* renamed from: C */
    public void mo26642C() {
        if (C7366c.m41598j(this, C7366c.f32436d)) {
            m39720b3();
        } else {
            C7387e.m41685a(this, new C6927c());
        }
    }

    /* renamed from: E0 */
    public void mo26502E0(boolean z) {
        m39721b4(0);
        m39724c4(z);
    }

    /* renamed from: G */
    public void mo26503G() {
        mo26807R4(11);
    }

    /* renamed from: H */
    public void mo26504H(Timer timer, TimerTask timerTask) {
        this.f30931j0 = timer;
        this.f30932k0 = timerTask;
    }

    /* renamed from: H0 */
    public void mo14800H0(boolean z, long j, String str, int i, int i2) {
        if (z) {
            mo26797A4(str, i, j, i2);
        }
    }

    /* renamed from: P4 */
    public void mo26805P4(int i) {
        mo26490g2(0, i);
    }

    /* renamed from: Q */
    public void mo26506Q() {
        mo26807R4(9);
    }

    /* renamed from: Q0 */
    public void mo26651Q0() {
        m39710W3();
    }

    /* renamed from: Q1 */
    public C0136e mo470Q1() {
        return C0142i.m793R0(this, this);
    }

    /* renamed from: R */
    public void mo26507R() {
    }

    /* renamed from: R4 */
    public void mo26807R4(int i) {
        mo26490g2(1, i);
    }

    /* renamed from: T0 */
    public void mo26654T0() {
        m39720b3();
    }

    /* renamed from: T4 */
    public void mo26809T4(float f) {
        ImageView imageView = this.f30913R;
        if (imageView != null) {
            imageView.setAlpha(f);
        }
        ImageView imageView2 = this.f30914S;
        if (imageView2 != null) {
            imageView2.setAlpha(f);
        }
        RoundProgressView roundProgressView = this.f30895G0;
        if (roundProgressView != null) {
            roundProgressView.setAlpha(f);
        }
    }

    /* renamed from: U */
    public void mo26508U() {
    }

    /* renamed from: W0 */
    public void mo26509W0() {
        mo26807R4(10);
    }

    /* renamed from: X4 */
    public void mo26810X4() {
        if (this.f30912Q.getVisibility() != 0) {
            this.f30912Q.setVisibility(0);
        }
    }

    /* renamed from: Y3 */
    public void mo26811Y3() {
        if (C8287e.m45834e(C8287e.m45798O())) {
            mo26805P4(0);
        }
    }

    /* renamed from: Z */
    public void mo26487Z() {
        super.mo26487Z();
        AlbumArtViewPager albumArtViewPager = this.f30922a0;
        if (albumArtViewPager != null) {
            albumArtViewPager.setCurrentItem(false);
        }
    }

    /* renamed from: Z3 */
    public void mo26812Z3() {
        this.f30894G = true;
        C8287e.m45828c(this, C8287e.m45798O(), true);
    }

    /* renamed from: a1 */
    public void mo26511a1() {
        m39721b4(0);
        m39764u4();
    }

    /* renamed from: a5 */
    public void mo26813a5() {
        if (this.f30888D.getVisibility() != 0) {
            this.f30888D.setVisibility(0);
        }
    }

    /* renamed from: b1 */
    public void mo26512b1() {
        mo26807R4(4);
    }

    /* renamed from: d */
    public void mo26660d(int i, float f, int i2) {
        if (f == 0.0f) {
            mo26809T4(1.0f);
        }
    }

    /* renamed from: d0 */
    public void mo26661d0() {
        try {
            this.f30923b0.postDelayed(new C6937l(this), 800);
            m39696Q4(true);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d2 */
    public void mo26488d2() {
        super.mo26488d2();
        m39764u4();
        C8282b.m45730a();
    }

    /* renamed from: d4 */
    public void mo26814d4(boolean z) {
        m39732f5();
        m39721b4(0);
        m39712X2(true, z);
    }

    /* renamed from: e0 */
    public void mo26513e0() {
        sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.clean_list"));
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: e5 */
    public void mo26815e5() {
        try {
            DrawerLayout drawerLayout = this.f30893F0;
            if (drawerLayout != null) {
                drawerLayout.mo3485J(8388611);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    public void mo26664f() {
        TextView textView = this.f30905L0;
        if (textView != null) {
            textView.setText(BuildConfig.FLAVOR);
        }
    }

    /* renamed from: f0 */
    public boolean mo26665f0(ArrayList<C9483n> arrayList) {
        C9502v.m49931b(arrayList);
        C9502v.m49933d(this);
        DeepDefaultTitle deepDefaultTitle = this.f30884B;
        if (deepDefaultTitle == null) {
            return true;
        }
        deepDefaultTitle.mo27434G();
        this.f30884B.setUpGiftBadgeActionView(this);
        return true;
    }

    /* renamed from: f1 */
    public void mo26666f1() {
    }

    /* renamed from: g3 */
    public int mo26816g3() {
        return C8287e.m45798O().size();
    }

    /* renamed from: g5 */
    public void mo26817g5() {
        mo26490g2(2, 0);
    }

    /* renamed from: h3 */
    public void mo26818h3(ArrayList<SoundEffect> arrayList) {
        if (!AdHelper.m49536p().mo32459v(this, new C6962e1(this))) {
            startActivityForResult(C8333k.m46053d(this), SoundEffectListActivity.f30849U);
        }
    }

    /* renamed from: h5 */
    public void mo26819h5() {
        mo26490g2(2, 1);
    }

    /* renamed from: i1 */
    public void mo26514i1() {
        mo26807R4(6);
    }

    /* renamed from: i2 */
    public Fragment mo26492i2() {
        Fragment X = mo3730H1().mo3936X(R.id.fragment);
        if (!(X instanceof C8194t2)) {
            return X;
        }
        int k3 = ((C8194t2) X).mo29862k3();
        C0602j H1 = mo3730H1();
        return H1.mo3938Y("f" + k3);
    }

    /* renamed from: j0 */
    public void mo26493j0(boolean z) {
        super.mo26493j0(z);
        m39776z4();
        if (z) {
            m39774y4();
        }
        m39712X2(z, true);
        sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.list_notifiy.action"));
        sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.detail_list_notifiy.action"));
        if (z) {
            sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.add_to_recent_notify_action"));
        }
        C8335m.m46064j(this, C8287e.m45812V(), this.f30940s0);
        m39696Q4(false);
    }

    /* renamed from: k1 */
    public void mo26670k1(long j) {
        C7344h hVar = this.f30903K0;
        if (hVar != null) {
            hVar.mo28087r(j / 1000);
        }
        TextView textView = this.f30905L0;
        if (textView != null) {
            textView.setText(C8345u.m46324e((int) (j / 1000)));
        }
    }

    /* renamed from: l0 */
    public void mo26515l0() {
        mo26807R4(8);
    }

    /* renamed from: m1 */
    public void mo26516m1(ArrayList<SoundEffect> arrayList) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m2 */
    public void mo26496m2(boolean z) {
        super.mo26496m2(z);
    }

    /* renamed from: m3 */
    public void mo26820m3() {
        if (this.f30888D.getVisibility() != 8) {
            this.f30888D.setVisibility(8);
        }
    }

    /* renamed from: n1 */
    public void mo26517n1() {
        mo26807R4(5);
    }

    /* renamed from: o4 */
    public void mo26821o4() {
        if (!AdHelper.m49536p().mo32459v(this, new C6986m1(this))) {
            m39749p4();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        super.onActivityResult(i, i2, intent);
        if (i3 == 12306) {
            m39720b3();
        } else if (i3 == 1029 && i4 == 1002) {
            if (intent2 != null) {
                boolean booleanExtra = intent2.getBooleanExtra("save_sound_effect", false);
                intent2.getIntExtra("pageType", -1);
                int intExtra = intent2.getIntExtra("addId", -1);
                boolean booleanExtra2 = intent2.getBooleanExtra("sideBar", false);
                if (booleanExtra) {
                    C8337n.m46065k0(this).mo30101G2(intExtra);
                }
                if (booleanExtra2) {
                    mo26818h3((ArrayList<SoundEffect>) null);
                }
            }
        } else if (i3 == 1029 && i4 == 1003) {
            if (intent2 != null && intent2.getBooleanExtra("hadChange", false)) {
                C8337n.m46065k0(this).mo30101G2(Integer.MAX_VALUE);
            }
        } else if (i3 == 1013) {
            C8335m.m46061g(this, this.f30941t0);
            C8335m.m46062h(this, this.f30940s0);
        } else if (i3 == 122) {
            m39758s4();
        } else if (i3 == SoundEffectListActivity.f30849U && intent2 != null) {
            intent2.getIntExtra("selectId", -1);
            intent2.getBooleanExtra("needToNotify", false);
        }
        if (i3 == 1029 && i4 == 1002) {
            if (intent2 != null) {
                boolean booleanExtra3 = intent2.getBooleanExtra("save_sound_effect", false);
                intent2.getIntExtra("pageType", -1);
                int intExtra2 = intent2.getIntExtra("addId", -1);
                boolean booleanExtra4 = intent2.getBooleanExtra("sideBar", false);
                if (booleanExtra3) {
                    C8337n.m46065k0(this).mo30101G2(intExtra2);
                }
                if (booleanExtra4) {
                    mo26818h3((ArrayList<SoundEffect>) null);
                    m39725c5();
                }
            }
        } else if (i3 == 1029 && i4 == 1003 && intent2 != null && intent2.getBooleanExtra("hadChange", false)) {
            C8337n.m46065k0(this).mo30101G2(Integer.MAX_VALUE);
        }
        C8335m.m46059e(this, i);
        C9502v.m49918M(this, i, i2);
        if (C4588a.m20008a(this, i)) {
            C8287e.m45820Z();
        }
        m39746o2(true);
        C4477c.m19608a0(this, i, i2, intent);
    }

    public void onBackPressed() {
        if (C8287e.m45800P()) {
            mo26805P4(0);
        } else if (this.f30908N) {
            DrawerLayout drawerLayout = this.f30893F0;
            if (drawerLayout != null) {
                drawerLayout.mo3512h();
            }
        } else if (mo3730H1().mo3946c0() > 0) {
            super.onBackPressed();
            if (mo3730H1().mo3946c0() == 0) {
                mo26813a5();
            } else {
                mo26810X4();
            }
        } else {
            C2280j.m10625k(this, new C6971h1(this));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C9317b.m49316A(BaseApplication.m40039j());
        C8335m.m46056b(this);
        C8335m.m46063i(this);
        BaseApplication.f31158v = C8345u.m46335p(this);
        C7397j.m41734d(this);
        m39708V4();
        C9502v.m49946q(this, "/MediaAppList.xml");
        C9502v.m49926U(this, this);
        setContentView((int) R.layout.activity_library2);
        this.f30916U = C7393h.m41695f(this);
        this.f30898I = C8337n.m46065k0(this);
        this.f30923b0 = new Handler();
        m39754r3();
    }

    public void onDestroy() {
        super.onDestroy();
        C6938m mVar = this.f30892F;
        if (mVar != null) {
            unregisterReceiver(mVar);
            this.f30892F = null;
        }
        m39726d3();
        this.f30894G = false;
        DeepDefaultTitle deepDefaultTitle = this.f30884B;
        if (deepDefaultTitle != null) {
            deepDefaultTitle.mo27439V();
            this.f30884B = null;
        }
        C8321j.m45995a(this.f30886C);
        if (this.f30888D != null) {
            this.f30888D = null;
        }
        if (this.f30890E != null) {
            this.f30890E = null;
        }
        if (this.f30900J != null) {
            this.f30900J = null;
        }
        Handler handler = this.f30923b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f30923b0 = null;
        }
        if (this.f30883A0 != null) {
            this.f30883A0 = null;
        }
        C8287e.m45844h0(this);
        C8335m.m46055a(this.f30940s0, this.f30941t0);
        C8282b.m45730a();
        C8287e.m45847i0(this);
        C9502v.m49916K();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            m39670F4(intent, C8337n.m46065k0(C8345u.m46327h()).mo30228m0());
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        m39682K4();
        C8287e.m45827b1(this.f30931j0, this.f30932k0);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C7366c.m41596h(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m39692O4();
        if (C8287e.m45812V()) {
            C8287e.m45819Y0(this.f30931j0, this.f30932k0, this.f30930i0, this);
        }
        C8335m.m46060f(this, this.f30940s0);
        DeepDefaultTitle deepDefaultTitle = this.f30884B;
        if (deepDefaultTitle != null) {
            deepDefaultTitle.setUpGiftBadgeActionViewResume(this);
        }
        C8340q.m46288b(this, new C6989n1(this));
        if (C9502v.m49949t()) {
            C9502v.m49940k(this);
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        super.onServiceConnected(componentName, iBinder);
        C4588a.m20010c(this);
        this.f30885B0 = true;
        m39705U4();
        m39720b3();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C9502v.m49937h(this);
    }

    /* renamed from: p2 */
    public void mo26822p2(boolean z, int i) {
        if (C8287e.m45798O() != null) {
            m39751q3();
            if (z) {
                if (C8287e.m45798O() == null || C8287e.m45798O().size() != 0) {
                    DeepSelectTitle deepSelectTitle = this.f30890E;
                    deepSelectTitle.mo27476e(true, C8345u.m46333n(R.string.selected) + "(" + mo26816g3() + ")");
                } else {
                    DeepSelectTitle deepSelectTitle2 = this.f30890E;
                    deepSelectTitle2.mo27476e(false, C8345u.m46333n(R.string.selected) + "(" + 0 + ")");
                }
            } else if (C8287e.m45798O() != null) {
                if (C8287e.m45798O().size() != i) {
                    DeepSelectTitle deepSelectTitle3 = this.f30890E;
                    deepSelectTitle3.mo27476e(false, C8345u.m46333n(R.string.selected) + "(" + mo26816g3() + ")");
                    StringBuilder sb = new StringBuilder();
                    sb.append("size:");
                    sb.append(mo26816g3());
                    Log.e("UpdateSelectNum", sb.toString());
                } else if (i == 0) {
                    DeepSelectTitle deepSelectTitle4 = this.f30890E;
                    deepSelectTitle4.mo27476e(false, C8345u.m46333n(R.string.selected) + "(" + mo26816g3() + ")");
                } else {
                    DeepSelectTitle deepSelectTitle5 = this.f30890E;
                    deepSelectTitle5.mo27476e(true, C8345u.m46333n(R.string.selected) + "(" + mo26816g3() + ")");
                }
            }
            m39680J4();
        }
    }

    /* renamed from: r */
    public void mo26678r(int i) {
    }

    /* renamed from: r1 */
    public void mo26518r1() {
    }

    /* renamed from: u0 */
    public void mo26682u0() {
        if (this.f30885B0) {
            C7366c.m41591c(this, this);
        } else {
            Toast.makeText(this, R.string.wait_for_connect, 0).show();
        }
    }

    /* renamed from: u1 */
    public void mo26499u1() {
        super.mo26499u1();
        m39732f5();
        m39764u4();
    }

    /* renamed from: w */
    public void mo26684w() {
        try {
            this.f30923b0.postDelayed(new C6926b(this), 800);
            m39696Q4(true);
        } catch (Exception unused) {
        }
    }

    /* renamed from: x1 */
    public void mo26519x1(float f) {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.alpha = f;
        getWindow().setAttributes(attributes);
    }

    /* renamed from: y1 */
    public void mo26520y1() {
        mo26807R4(0);
    }
}
