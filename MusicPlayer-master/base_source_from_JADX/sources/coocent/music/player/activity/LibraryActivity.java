package coocent.music.player.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
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
import android.os.StrictMode;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.C0125a;
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
import com.coocent.videoplayer.bean.VideoConfigBean;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import coocent.music.player.adapter.C7025h;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.mode.SoundEffect;
import coocent.music.player.visualizer.SquareMusicImageView;
import coocent.music.player.widget.AlbumArtViewPager;
import coocent.music.player.widget.DeepDefaultTitle;
import coocent.music.player.widget.DeepSelectTitle;
import coocent.music.player.widget.NoScrollTabLayout;
import coocent.music.player.widget.NoScrollViewPager;
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

public class LibraryActivity extends BaseActivity implements C7966s, C7962o, C9488q, C7956i, C7963p, C7961n, C7364a, C7969v, PermissionRequestDetailView.C7412b, C4362b, C7401l {

    /* renamed from: A0 */
    private RelativeLayout f30615A0;

    /* renamed from: B */
    public DeepDefaultTitle f30616B;

    /* renamed from: B0 */
    private RelativeLayout f30617B0;

    /* renamed from: C */
    private ImageView f30618C;

    /* renamed from: C0 */
    private RelativeLayout f30619C0;

    /* renamed from: D */
    public NoScrollViewPager f30620D;

    /* renamed from: D0 */
    private RelativeLayout f30621D0;

    /* renamed from: E */
    private C7025h f30622E;

    /* renamed from: E0 */
    private TextView f30623E0;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public NoScrollTabLayout f30624F;

    /* renamed from: F0 */
    private PermissionRequestDetailView f30625F0;

    /* renamed from: G */
    private RelativeLayout f30626G;

    /* renamed from: G0 */
    private boolean f30627G0 = false;

    /* renamed from: H */
    private FrameLayout f30628H;

    /* renamed from: H0 */
    private RelativeLayout f30629H0;

    /* renamed from: I */
    private DeepSelectTitle f30630I;

    /* renamed from: I0 */
    private SquareMusicImageView f30631I0;

    /* renamed from: J */
    private C6882l f30632J;

    /* renamed from: J0 */
    private RelativeLayout f30633J0;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public boolean f30634K = false;

    /* renamed from: K0 */
    private LinearLayout f30635K0;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public long f30636L = 0;

    /* renamed from: L0 */
    private LinearLayout f30637L0;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public C8337n f30638M;

    /* renamed from: M0 */
    private ImageView f30639M0;

    /* renamed from: N */
    private RelativeLayout f30640N;

    /* renamed from: N0 */
    private TextView f30641N0;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public View f30642O;

    /* renamed from: O0 */
    private LinearLayout f30643O0;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public ImageView f30644P;

    /* renamed from: P0 */
    private ImageView f30645P0;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public TextView f30646Q;

    /* renamed from: Q0 */
    private TextView f30647Q0;

    /* renamed from: R */
    private C0125a f30648R;

    /* renamed from: R0 */
    private LinearLayout f30649R0;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public boolean f30650S = false;

    /* renamed from: S0 */
    private ImageView f30651S0;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public boolean f30652T = false;

    /* renamed from: T0 */
    private TextView f30653T0;

    /* renamed from: U */
    private RelativeLayout f30654U;

    /* renamed from: U0 */
    private DrawerLayout f30655U0;

    /* renamed from: V */
    private RelativeLayout f30656V;
    /* access modifiers changed from: private */

    /* renamed from: V0 */
    public RoundProgressView f30657V0;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public ImageView f30658W;

    /* renamed from: W0 */
    private ImageView f30659W0;

    /* renamed from: X */
    private ImageView f30660X;

    /* renamed from: X0 */
    private ViewGroup f30661X0;

    /* renamed from: Y */
    private int f30662Y;

    /* renamed from: Y0 */
    private NavigationView f30663Y0;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public C7393h f30664Z;

    /* renamed from: Z0 */
    private LinearLayout f30665Z0;

    /* renamed from: a0 */
    private C7973c f30666a0;

    /* renamed from: a1 */
    private ImageView f30667a1;

    /* renamed from: b0 */
    private C7238p0 f30668b0;

    /* renamed from: b1 */
    private TextView f30669b1;

    /* renamed from: c0 */
    private List<Music> f30670c0;

    /* renamed from: c1 */
    private RelativeLayout f30671c1;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public C7974d f30672d0;

    /* renamed from: d1 */
    private C7344h f30673d1;

    /* renamed from: e0 */
    private RelativeLayout f30674e0;

    /* renamed from: e1 */
    private TextView f30675e1;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public AlbumArtViewPager f30676f0;

    /* renamed from: f1 */
    private RelativeLayout f30677f1;

    /* renamed from: g0 */
    private Handler f30678g0;

    /* renamed from: g1 */
    private RelativeLayout f30679g1;

    /* renamed from: h0 */
    private boolean f30680h0 = false;

    /* renamed from: i0 */
    private boolean f30681i0 = false;

    /* renamed from: j0 */
    private boolean f30682j0 = false;

    /* renamed from: k0 */
    private boolean f30683k0 = false;

    /* renamed from: l0 */
    private boolean f30684l0 = false;

    /* renamed from: m0 */
    private LinearLayout f30685m0;

    /* renamed from: n0 */
    private C6884m f30686n0;

    /* renamed from: o0 */
    private Timer f30687o0;

    /* renamed from: p0 */
    private TimerTask f30688p0;

    /* renamed from: q0 */
    private RelativeLayout f30689q0;

    /* renamed from: r0 */
    private RelativeLayout f30690r0;

    /* renamed from: s0 */
    private RelativeLayout f30691s0;

    /* renamed from: t0 */
    private RelativeLayout f30692t0;

    /* renamed from: u0 */
    private RelativeLayout f30693u0;

    /* renamed from: v0 */
    private RelativeLayout f30694v0;

    /* renamed from: w0 */
    private RelativeLayout f30695w0;
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public MarqueeView f30696x0;

    /* renamed from: y0 */
    private MarqueeSmallCircleView f30697y0;

    /* renamed from: z0 */
    private RelativeLayout f30698z0;

    /* renamed from: coocent.music.player.activity.LibraryActivity$a */
    class C6870a implements Runnable {
        C6870a() {
        }

        public void run() {
            LibraryActivity.this.f30676f0.mo26325f();
        }
    }

    /* renamed from: coocent.music.player.activity.LibraryActivity$b */
    class C6871b implements C7322a {
        C6871b() {
        }

        /* renamed from: a */
        public void mo26686a(DialogInterface dialogInterface) {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", LibraryActivity.this.getPackageName(), (String) null));
            LibraryActivity.this.startActivityForResult(intent, 12306);
        }

        /* renamed from: b */
        public void mo26687b(DialogInterface dialogInterface) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: coocent.music.player.activity.LibraryActivity$c */
    class C6872c extends C0125a {
        C6872c(Activity activity, DrawerLayout drawerLayout, int i, int i2) {
            super(activity, drawerLayout, i, i2);
        }

        /* renamed from: a */
        public void mo616a(View view) {
            super.mo616a(view);
            try {
                LibraryActivity libraryActivity = LibraryActivity.this;
                C9502v.m49929X(libraryActivity, libraryActivity.f30642O, LibraryActivity.this.f30644P, LibraryActivity.this.f30646Q);
            } catch (Exception e) {
                e.printStackTrace();
            }
            LibraryActivity.this.m39220z4();
            boolean unused = LibraryActivity.this.f30650S = true;
        }

        /* renamed from: b */
        public void mo617b(View view) {
            super.mo617b(view);
            boolean unused = LibraryActivity.this.f30650S = false;
            DeepDefaultTitle deepDefaultTitle = LibraryActivity.this.f30616B;
            if (deepDefaultTitle != null) {
                deepDefaultTitle.mo27434G();
            }
        }
    }

    /* renamed from: coocent.music.player.activity.LibraryActivity$d */
    class C6873d implements Runnable {
        C6873d() {
        }

        public void run() {
            if (LibraryActivity.this.f30672d0 != null && C8287e.m45873v() != null) {
                LibraryActivity.this.f30672d0.mo29509a(C8287e.m45873v());
            }
        }
    }

    /* renamed from: coocent.music.player.activity.LibraryActivity$e */
    class C6874e extends C7970w {
        C6874e() {
        }

        /* renamed from: A */
        public void mo26689A() {
            super.mo26689A();
            LibraryActivity.this.mo26659b5(5);
        }

        /* renamed from: B */
        public void mo26690B() {
            super.mo26690B();
            LibraryActivity.this.mo26659b5(1);
        }

        /* renamed from: D */
        public void mo26691D() {
            super.mo26691D();
            LibraryActivity.this.mo26677q5();
        }

        /* renamed from: E */
        public void mo26692E() {
            super.mo26692E();
            LibraryActivity.this.mo26680r5();
        }

        /* renamed from: b */
        public void mo26693b() {
            super.mo26693b();
            LibraryActivity.this.mo26657Z4(0);
            LibraryActivity.this.mo26676p2(false, 0);
        }

        /* renamed from: o */
        public void mo26694o() {
            super.mo26694o();
            LibraryActivity.this.m39186n4();
        }

        /* renamed from: p */
        public void mo26695p() {
            super.mo26695p();
            LibraryActivity.this.m39192p4();
        }

        /* renamed from: s */
        public void mo26696s(GiftBadgeActionView giftBadgeActionView) {
            super.mo26696s(giftBadgeActionView);
        }

        /* renamed from: t */
        public void mo26591t() {
            LibraryActivity.this.mo26675o5();
        }

        /* renamed from: u */
        public void mo26697u() {
            super.mo26697u();
            LibraryActivity.this.mo26659b5(0);
        }

        /* renamed from: v */
        public void mo26698v() {
            super.mo26698v();
            LibraryActivity.this.mo26659b5(2);
        }

        /* renamed from: w */
        public void mo26699w() {
            super.mo26699w();
            LibraryActivity.this.mo26659b5(7);
        }

        /* renamed from: x */
        public void mo26700x() {
            super.mo26700x();
            LibraryActivity.this.mo26659b5(3);
        }

        /* renamed from: y */
        public void mo26701y() {
            super.mo26701y();
            LibraryActivity.this.mo26659b5(4);
        }

        /* renamed from: z */
        public void mo26702z() {
            super.mo26702z();
            LibraryActivity.this.mo26659b5(6);
        }
    }

    /* renamed from: coocent.music.player.activity.LibraryActivity$f */
    class C6875f implements TabLayout.C6198d {
        C6875f() {
        }

        /* renamed from: a */
        public void mo24788a(TabLayout.C6203g gVar) {
        }

        /* renamed from: b */
        public void mo24789b(TabLayout.C6203g gVar) {
            LibraryActivity.this.f30624F.setSelectTab(gVar.mo24806g());
            LibraryActivity.this.m39121L4(gVar.mo24806g());
            LibraryActivity.this.f30638M.mo30222k2(gVar.mo24806g());
            LibraryActivity.this.f30620D.setCurrentItem(gVar.mo24806g());
        }

        /* renamed from: c */
        public void mo24790c(TabLayout.C6203g gVar) {
        }
    }

    /* renamed from: coocent.music.player.activity.LibraryActivity$g */
    class C6876g extends C9492u {
        C6876g() {
        }

        /* renamed from: a */
        public void mo15335a() {
            LibraryActivity.this.m39151X4();
        }

        /* renamed from: c */
        public void mo15337c() {
            C4590a.m20018b(this);
            if (LibraryActivity.this.f30652T) {
                boolean unused = LibraryActivity.this.f30652T = false;
                if (C8287e.m45810U()) {
                    C8287e.m45829c0();
                }
            }
        }
    }

    /* renamed from: coocent.music.player.activity.LibraryActivity$h */
    class C6877h extends C7970w {
        C6877h() {
        }

        /* renamed from: C */
        public void mo26703C() {
            super.mo26703C();
            LibraryActivity.this.mo26657Z4(1);
        }

        /* renamed from: k */
        public void mo26704k() {
            super.mo26704k();
            LibraryActivity.this.mo26663e4();
        }

        /* renamed from: l */
        public void mo26705l() {
            super.mo26705l();
            LibraryActivity.this.mo26667f4();
        }

        /* renamed from: m */
        public void mo26706m() {
            super.mo26706m();
            LibraryActivity.this.m39165d4();
        }

        /* renamed from: n */
        public void mo26707n() {
            super.mo26707n();
            LibraryActivity.this.m39171g4();
        }

        /* renamed from: t */
        public void mo26591t() {
            LibraryActivity.this.mo26657Z4(0);
        }
    }

    /* renamed from: coocent.music.player.activity.LibraryActivity$i */
    class C6878i implements C4269f.C4283m {
        C6878i() {
        }

        /* renamed from: a */
        public void mo6880a(C4269f fVar, C4264b bVar) {
            fVar.dismiss();
            LibraryActivity.this.mo26657Z4(0);
        }
    }

    /* renamed from: coocent.music.player.activity.LibraryActivity$j */
    class C6879j implements C4269f.C4283m {
        C6879j() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void mo26708c() {
            LibraryActivity.this.mo26657Z4(0);
        }

        /* renamed from: a */
        public void mo6880a(C4269f fVar, C4264b bVar) {
            long[] E = C8287e.m45778E(C8287e.m45798O());
            LibraryActivity libraryActivity = LibraryActivity.this;
            C4477c.m19624i0(libraryActivity, E, libraryActivity.f30636L);
            LibraryActivity.this.sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.playlist_detail_remove_notify"));
            new Handler().postDelayed(new C7005u(this), 500);
        }
    }

    /* renamed from: coocent.music.player.activity.LibraryActivity$k */
    class C6880k implements C7322a {

        /* renamed from: a */
        final /* synthetic */ long[] f30709a;

        /* renamed from: coocent.music.player.activity.LibraryActivity$k$a */
        class C6881a implements C4379d.C4380a {
            C6881a() {
            }

            /* renamed from: a */
            public void mo14943a() {
            }

            /* renamed from: b */
            public void mo14944b(List<Long> list) {
                C8287e.m45855m(C8345u.m46327h(), C8287e.m45798O());
                LibraryActivity.this.mo26657Z4(0);
                C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.detail_update_page"));
            }

            /* renamed from: c */
            public void mo14945c(int i, int i2, long j) {
            }
        }

        C6880k(long[] jArr) {
            this.f30709a = jArr;
        }

        /* renamed from: a */
        public void mo26686a(DialogInterface dialogInterface) {
            long[] jArr = this.f30709a;
            if (jArr != null) {
                C4477c.m19627k(LibraryActivity.this, jArr, new C6881a());
            }
        }

        /* renamed from: b */
        public void mo26687b(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: coocent.music.player.activity.LibraryActivity$l */
    private class C6882l extends BroadcastReceiver {

        /* renamed from: coocent.music.player.activity.LibraryActivity$l$a */
        class C6883a implements Runnable {
            C6883a() {
            }

            public void run() {
                Drawable drawable;
                if (LibraryActivity.this.f30696x0 != null) {
                    LibraryActivity libraryActivity = LibraryActivity.this;
                    C8335m.m46064j(libraryActivity, false, libraryActivity.f30696x0);
                }
                ImageView F2 = LibraryActivity.this.f30658W;
                if (C8287e.m45812V()) {
                    drawable = C9332d.m49407d(LibraryActivity.this, R.drawable.ic_home07_play2);
                } else {
                    drawable = C9332d.m49407d(LibraryActivity.this, R.drawable.ic_home05_pause);
                }
                F2.setImageDrawable(drawable);
            }
        }

        private C6882l() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action == null) {
                return;
            }
            if (action.equals("media.musicplayer.audioplayer.videoplayer.select_track_to_updata_ui")) {
                LibraryActivity.this.m39102D4(intent);
            } else if (action.equals("media.musicplayer.audioplayer.videoplayer.select_track_to_updata_num")) {
                if (intent != null) {
                    LibraryActivity.this.mo26676p2(intent.getBooleanExtra("isClickTitleToSelectAll", false), intent.getIntExtra("listSize", 0));
                }
            } else if (action.equals("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.playlist.fragment.action")) {
                if (LibraryActivity.this.f30634K) {
                    LibraryActivity.this.mo26657Z4(0);
                    boolean unused = LibraryActivity.this.f30634K = false;
                }
            } else if (action.equals("media.musicplayer.audioplayer.videoplayer.WAKEUP.EXIT")) {
                LibraryActivity.this.finish();
            } else if (action.equals(C8311c.f34738e)) {
                if (LibraryActivity.this.f30658W != null) {
                    new Handler().postDelayed(new C6883a(), 800);
                    LibraryActivity.this.f30664Z.mo28189k(true);
                }
                LibraryActivity.this.m39153Y3();
            } else if ("media.musicplayer.audioplayer.videoplayer.clean_list".equals(action)) {
                LibraryActivity.this.m39094A4();
            } else if (action.equals("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.state.action")) {
                LibraryActivity.this.mo26669j4(false);
            } else if (action.equals("media.musicplayer.audioplayer.videoplayer.detail_update_page")) {
                LibraryActivity.this.m39174h4(0);
                LibraryActivity.this.m39176i4(false);
                LibraryActivity.this.m39193p5();
            } else if (action.equals("media.musicplayer.audioplayer.videoplayer.artwork_update_page")) {
                LibraryActivity.this.m39174h4(0);
                LibraryActivity.this.m39176i4(false);
                LibraryActivity.this.m39107F4();
            } else if ("media.musicplayer.audioplayer.videoplayer.update_page".equals(action)) {
                LibraryActivity.this.m39174h4(0);
                LibraryActivity.this.m39176i4(false);
                LibraryActivity.this.m39193p5();
            } else if ("media.musicplayer.audioplayer.videoplayer.notify_ui".equals(action)) {
                LibraryActivity.this.m39188o2(true);
            } else if (!"media.musicplayer.audioplayer.videoplayer.eq_switch".equals(action)) {
                if ("media.musicplayer.audioplayer.videoplayer.filter_notify_list".equals(action)) {
                    LibraryActivity.this.m39178j3();
                    LibraryActivity.this.sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.recent_filter_notifiy"));
                    LibraryActivity.this.sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.track_filter_notifiy"));
                } else if ("media.musicplayer.audioplayer.videoplayer.remove_ad".equals(action)) {
                    LibraryActivity.this.m39151X4();
                } else if ("media.musicplayer.audioplayer.videoplayer.sound_effect_notify".equals(action)) {
                    LibraryActivity.this.m39181k4();
                } else if ("media.musicplayer.audioplayer.videoplayer.sound_effect_notify_select".equals(action)) {
                    LibraryActivity.this.m39182l4(intent.getIntExtra("id", -1), intent.getBooleanExtra("needToRefresh", true));
                } else if (C8311c.f34737d.equals(action)) {
                    LibraryActivity.this.m39166e3();
                } else {
                    if (action.equals(LibraryActivity.this.getPackageName() + C8311c.f34734a)) {
                        LibraryActivity.this.m39185n3(context);
                    } else if (action.equals("media.musicplayer.audioplayer.videoplayer.update_video_list")) {
                        LibraryActivity.this.mo26669j4(false);
                        C8287e.m45820Z();
                    }
                }
            }
        }

        /* synthetic */ C6882l(LibraryActivity libraryActivity, C6872c cVar) {
            this();
        }
    }

    /* renamed from: coocent.music.player.activity.LibraryActivity$m */
    public static class C6884m extends Handler {

        /* renamed from: a */
        private final WeakReference<LibraryActivity> f30714a;

        C6884m(LibraryActivity libraryActivity) {
            this.f30714a = new WeakReference<>(libraryActivity);
        }

        public void handleMessage(Message message) {
            LibraryActivity libraryActivity = (LibraryActivity) this.f30714a.get();
            if (libraryActivity != null && message.what == 1 && message.getData() != null) {
                double r = C8287e.m45865r();
                if (r >= 0.0d) {
                    double u = C8287e.m45871u();
                    float f = u == 0.0d ? 0.0f : ((float) ((r * 100.0d) / u)) / 100.0f;
                    if (C8287e.m45812V()) {
                        libraryActivity.f30657V0.setPercentage(f);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"UseCompatLoadingForDrawables"})
    /* renamed from: A4 */
    public void m39094A4() {
        C8287e.m45821Z0();
        m39163c5();
        this.f30685m0.setVisibility(0);
        this.f30676f0.setVisibility(8);
        this.f30658W.setImageDrawable(getResources().getDrawable(R.drawable.ic_home05_pause));
        C8287e.m45846i();
        C8287e.m45864q0((Music) null);
        C8287e.m45862p0(0);
        C8287e.m45882z0(new long[0]);
        m39107F4();
        this.f30684l0 = true;
        this.f30681i0 = true;
        m39193p5();
        this.f30657V0.setPercentage(0.0f);
        MarqueeView marqueeView = this.f30696x0;
        if (marqueeView != null) {
            C8335m.m46064j(this, false, marqueeView);
        }
        m39161c3(true, true);
        C8287e.m45820Z();
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void mo26643C3() {
        if (!AdHelper.m49536p().mo32459v(this, new C6964f0(this))) {
            m39206u4();
        }
    }

    /* renamed from: B4 */
    private void m39097B4() {
        if (!(this.f30664Z == null || C8287e.m45873v() == null)) {
            this.f30664Z.mo28195q(C8287e.m45792L());
            this.f30664Z.mo28193o(C8287e.m45863q());
            this.f30664Z.mo28192n(C8287e.m45873v().mo9215k());
            this.f30664Z.mo28190l(C8287e.m45865r());
            this.f30664Z.mo28191m(C8287e.m45871u());
        }
        C7973c cVar = this.f30666a0;
        if (cVar != null) {
            cVar.mo29505b();
            this.f30666a0.mo29504a(C8287e.m45867s());
        }
    }

    /* renamed from: C4 */
    private void m39099C4() {
        if (this.f30683k0 && !this.f30682j0) {
            this.f30683k0 = false;
            m39174h4(0);
        }
        if (this.f30682j0) {
            m39174h4(1);
            this.f30682j0 = false;
            this.f30683k0 = true;
        }
        m39176i4(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: D4 */
    public void m39102D4(Intent intent) {
        if (intent != null) {
            m39210w3();
            Bundle extras = intent.getExtras();
            boolean z = extras.getBoolean("disPlaySelectTitle");
            boolean z2 = extras.getBoolean("isPlaylistDetail");
            this.f30636L = 0;
            if (z2) {
                this.f30636L = extras.getLong("currentPlaylistId");
            }
            mo26496m2(!z2);
            NoScrollViewPager noScrollViewPager = this.f30620D;
            if (noScrollViewPager != null) {
                noScrollViewPager.setScroll(z);
            }
            if (z) {
                if (this.f30654U.getVisibility() != 8) {
                    this.f30654U.setVisibility(8);
                }
                if (this.f30626G.getVisibility() != 8) {
                    this.f30626G.setVisibility(8);
                }
                if (this.f30661X0.getVisibility() != 8) {
                    this.f30661X0.setVisibility(8);
                }
                if (this.f30635K0.getVisibility() != 0) {
                    this.f30635K0.setVisibility(0);
                }
                if (this.f30616B.getVisibility() != 4) {
                    this.f30616B.setVisibility(4);
                }
                DeepSelectTitle deepSelectTitle = this.f30630I;
                if (deepSelectTitle != null && deepSelectTitle.getVisibility() != 0) {
                    this.f30630I.setVisibility(0);
                    return;
                }
                return;
            }
            if (this.f30654U.getVisibility() != 0) {
                this.f30654U.setVisibility(0);
            }
            if (this.f30628H.getChildCount() == 0 && this.f30626G.getVisibility() != 0) {
                this.f30626G.setVisibility(0);
            }
            if (this.f30628H.getChildCount() > 0 && this.f30661X0.getVisibility() != 0) {
                this.f30661X0.setVisibility(0);
            }
            if (this.f30635K0.getVisibility() != 8) {
                this.f30635K0.setVisibility(8);
            }
            if (this.f30616B.getVisibility() != 0) {
                this.f30616B.setVisibility(0);
            }
            DeepSelectTitle deepSelectTitle2 = this.f30630I;
            if (deepSelectTitle2 != null && deepSelectTitle2.getVisibility() != 8) {
                this.f30630I.setVisibility(8);
            }
        }
    }

    /* renamed from: E4 */
    private void m39104E4() {
        RelativeLayout relativeLayout;
        if (C9502v.m49954y(this) && (relativeLayout = this.f30692t0) != null) {
            relativeLayout.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public /* synthetic */ void mo26645G3() {
        m39185n3(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: F4 */
    public void m39107F4() {
        Music v = C8287e.m45873v();
        if (v != null) {
            C8321j.m46009o(C4477c.m19603W(this, v.mo9215k(), C8287e.m45859o(), 0), R.drawable.home08_bg2, this.f30631I0, C8345u.m46323d(60), C8345u.m46323d(60), new C6970h0(this));
            return;
        }
        C8321j.m46006l(BuildConfig.FLAVOR, R.drawable.home08_bg2, this.f30631I0, C8345u.m46323d(60), C8345u.m46323d(60));
        if (C8343s.f34787b || C8343s.f34788c == 2) {
            ((GradientDrawable) this.f30629H0.getBackground()).setColor(C8345u.m46326g(R.color.custom_bottom_play_bar));
        } else {
            ((GradientDrawable) this.f30629H0.getBackground()).setColor(C8343s.m46295c(R.color.bottom_play_bar_light));
        }
    }

    /* renamed from: G4 */
    private void m39109G4() {
        SquareMusicImageView squareMusicImageView = this.f30631I0;
        if (squareMusicImageView != null && (squareMusicImageView instanceof SquareMusicImageView)) {
            squareMusicImageView.mo27358k();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public /* synthetic */ void mo26647I3(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.bottom_play_bar:
                if (!C8315g.m45979a()) {
                    m39140T3();
                    return;
                }
                return;
            case R.id.iv_playlist:
                m39177i5();
                return;
            case R.id.iv_playpause:
            case R.id.rl_play_pause:
                C8287e.m45830c1(C8287e.m45863q(), this.f30670c0);
                return;
            case R.id.nav_widget:
                m39195q3();
                return;
            default:
                switch (id) {
                    case R.id.ll_add_to_playlist:
                        mo26667f4();
                        return;
                    case R.id.ll_add_to_queue:
                        mo26663e4();
                        return;
                    default:
                        switch (id) {
                            case R.id.ll_multi_delete:
                                m39165d4();
                                return;
                            case R.id.ll_multi_remove:
                                m39171g4();
                                return;
                            default:
                                switch (id) {
                                    case R.id.nav_car_mode:
                                        m39187n5();
                                        return;
                                    case R.id.nav_equalizer:
                                        m39203t4();
                                        return;
                                    case R.id.nav_marquee:
                                        C8287e.m45771A0();
                                        m39168f3();
                                        C8335m.m46058d(this);
                                        return;
                                    case R.id.nav_rate_for_us:
                                        m39217y4();
                                        return;
                                    case R.id.nav_recommend:
                                        startActivityForResult(new Intent(this, GiftWithGameActivity.class), 122);
                                        return;
                                    case R.id.nav_remove_ads:
                                        m39179j5();
                                        return;
                                    case R.id.nav_ringtone_cutter:
                                        this.f30655U0.mo3512h();
                                        if (!AdHelper.m49536p().mo32459v(this, new C7009w(this))) {
                                            m39185n3(this);
                                            return;
                                        }
                                        return;
                                    case R.id.nav_setting:
                                        m39198r4();
                                        return;
                                    case R.id.nav_share:
                                        m39172g5();
                                        return;
                                    case R.id.nav_theme:
                                        m39191p3();
                                        return;
                                    case R.id.nav_time_sleep:
                                        m39183l5();
                                        return;
                                    case R.id.nav_video:
                                        mo26683v4();
                                        return;
                                    default:
                                        return;
                                }
                        }
                }
        }
    }

    /* renamed from: I4 */
    private void m39113I4() {
        PermissionRequestDetailView permissionRequestDetailView = this.f30625F0;
        if (permissionRequestDetailView != null) {
            permissionRequestDetailView.setDetail(R.string.music_eq_lbl_alert_storage_permission_denied);
            this.f30625F0.setAllowButtonText(R.string.music_eq_access_granted);
            this.f30625F0.setIcon(R.drawable.ic_lists_no_song_no);
            this.f30625F0.setViewBg(C9332d.m49407d(this, R.drawable.splash_skin_1_bg_shape));
        }
    }

    /* renamed from: J4 */
    private void m39116J4() {
        RelativeLayout relativeLayout = this.f30656V;
        boolean z = C8343s.f34787b;
        int i = R.color.custom_bottom_bar_color;
        relativeLayout.setBackgroundColor(C8343s.m46295c(z ? R.color.custom_bottom_bar_color : R.color.custom_bottom_play_bar));
        NoScrollTabLayout noScrollTabLayout = this.f30624F;
        if (!C8343s.f34787b) {
            i = R.color.custom_bottom_play_bar;
        }
        noScrollTabLayout.setBackgroundColor(C8343s.m46295c(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: L3 */
    public /* synthetic */ void mo26649M3() {
        C9502v.m49939j(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: L4 */
    public void m39121L4(int i) {
        DeepDefaultTitle deepDefaultTitle = this.f30616B;
        if (deepDefaultTitle != null) {
            deepDefaultTitle.setViewPagerPosition(i);
        }
    }

    /* renamed from: M4 */
    private void m39123M4(int i) {
        RelativeLayout relativeLayout = this.f30656V;
        if (relativeLayout != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.height = i;
            this.f30656V.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public /* synthetic */ void mo26650O3(int i) {
        if (i == 1) {
            m39123M4(BaseApplication.f31157u);
        } else {
            m39123M4(C9566f.m50190a(this, 5));
        }
    }

    /* renamed from: N4 */
    private void m39126N4() {
        RelativeLayout relativeLayout = (RelativeLayout) this.f30663Y0.mo24288f(0);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        ViewGroup.LayoutParams layoutParams = this.f30663Y0.getLayoutParams();
        layoutParams.width = (int) (((double) defaultDisplay.getWidth()) * 0.8d);
        this.f30663Y0.setLayoutParams(layoutParams);
        ((RelativeLayout) relativeLayout.findViewById(R.id.navigation_layout)).setBackgroundColor(C8343s.m46295c(R.color.nav_header_bg_color));
        View findViewById = findViewById(R.id.nav_bg_cover);
        ((ImageView) relativeLayout.findViewById(R.id.iv_ads)).setImageDrawable(C8343s.m46298f(R.drawable.ad_white));
        C8343s.m46307o((ImageView) findViewById(R.id.nav_bg), false);
        int i = 8;
        findViewById.setVisibility(C8343s.f34787b ? 0 : 8);
        this.f30642O = relativeLayout.findViewById(R.id.promotion_play_icon_layout);
        this.f30644P = (ImageView) relativeLayout.findViewById(R.id.promotion_play_icon_layout_icon);
        this.f30646Q = (TextView) relativeLayout.findViewById(R.id.promotion_play_icon_layout_app_info);
        LinearLayout linearLayout = (LinearLayout) relativeLayout.findViewById(R.id.nav_bg_3);
        ((LinearLayout.LayoutParams) linearLayout.getLayoutParams()).setMargins(0, C8345u.m46323d(10), 0, BaseApplication.f31157u);
        ((LinearLayout) relativeLayout.findViewById(R.id.nav_bg_1)).setBackground(C8343s.m46298f(R.drawable.slider_shape));
        ((LinearLayout) relativeLayout.findViewById(R.id.nav_bg_2)).setBackground(C8343s.m46298f(R.drawable.slider_shape));
        linearLayout.setBackground(C8343s.m46298f(R.drawable.slider_shape));
        this.f30689q0 = (RelativeLayout) relativeLayout.findViewById(R.id.nav_equalizer);
        this.f30690r0 = (RelativeLayout) relativeLayout.findViewById(R.id.nav_widget);
        this.f30691s0 = (RelativeLayout) relativeLayout.findViewById(R.id.nav_theme);
        this.f30692t0 = (RelativeLayout) relativeLayout.findViewById(R.id.nav_remove_ads);
        m39151X4();
        this.f30693u0 = (RelativeLayout) relativeLayout.findViewById(R.id.nav_rate_for_us);
        this.f30694v0 = (RelativeLayout) relativeLayout.findViewById(R.id.nav_share);
        this.f30695w0 = (RelativeLayout) relativeLayout.findViewById(R.id.nav_setting);
        this.f30619C0 = (RelativeLayout) relativeLayout.findViewById(R.id.nav_recommend);
        this.f30623E0 = (TextView) relativeLayout.findViewById(R.id.tv_badge);
        RelativeLayout relativeLayout2 = this.f30619C0;
        if (C9564d.m50184j(this)) {
            i = 0;
        }
        relativeLayout2.setVisibility(i);
        m39168f3();
        this.f30698z0 = (RelativeLayout) relativeLayout.findViewById(R.id.nav_marquee);
        this.f30615A0 = (RelativeLayout) relativeLayout.findViewById(R.id.nav_car_mode);
        this.f30697y0 = (MarqueeSmallCircleView) relativeLayout.findViewById(R.id.smallCircleView);
        this.f30617B0 = (RelativeLayout) relativeLayout.findViewById(R.id.nav_video);
        this.f30671c1 = (RelativeLayout) relativeLayout.findViewById(R.id.nav_time_sleep);
        this.f30675e1 = (TextView) relativeLayout.findViewById(R.id.tv_time);
        C8335m.m46061g(this, this.f30697y0);
        this.f30621D0 = (RelativeLayout) relativeLayout.findViewById(R.id.nav_ringtone_cutter);
        ((TextView) relativeLayout.findViewById(R.id.sidebar_ringtone_cutter_text)).setTextColor(C9332d.m49405b(this, R.color.default_text_color));
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f30642O.getLayoutParams();
        layoutParams2.topMargin = C8345u.m46323d(20);
        layoutParams2.height = C8345u.m46323d(40);
        this.f30642O.setLayoutParams(layoutParams2);
        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) this.f30644P.getLayoutParams();
        this.f30644P.getLayoutParams().width = (int) (getResources().getDisplayMetrics().density * 20.0f);
        this.f30644P.getLayoutParams().height = (int) (getResources().getDisplayMetrics().density * 20.0f);
        layoutParams3.setMargins((int) (getResources().getDisplayMetrics().density * 20.0f), 0, 0, 0);
        layoutParams3.setMarginStart((int) (getResources().getDisplayMetrics().density * 20.0f));
        this.f30646Q.setTextSize(14.0f);
        this.f30646Q.setTextColor(C8343s.m46295c(R.color.default_text_color));
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) this.f30646Q.getLayoutParams();
        layoutParams4.setMargins((int) (getResources().getDisplayMetrics().density * 30.0f), 0, 0, 0);
        layoutParams4.setMarginStart((int) (getResources().getDisplayMetrics().density * 30.0f));
        m39136R4();
        m39138S4(relativeLayout);
    }

    /* renamed from: O4 */
    private void m39128O4() {
        this.f30657V0.setPercentage(((float) (((double) (((float) this.f30662Y) * 100.0f)) / C8287e.m45871u())) / 100.0f);
        if (!C8287e.m45812V()) {
            C8287e.m45856m0(this.f30662Y);
        }
        m39188o2(true);
    }

    /* renamed from: P4 */
    private void m39131P4(Intent intent, int i) {
        m39180k3(intent);
        NoScrollViewPager noScrollViewPager = this.f30620D;
        if (noScrollViewPager != null) {
            noScrollViewPager.setCurrentItem(i);
        }
        this.f30624F.setSelectTab(i);
        m39121L4(i);
    }

    /* renamed from: Q4 */
    private void m39133Q4() {
        this.f30686n0 = new C6884m(this);
        m39128O4();
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public /* synthetic */ void mo26653S3(boolean z, int i) {
        if (C8343s.f34787b || C8343s.f34788c == 2) {
            ((GradientDrawable) this.f30629H0.getBackground()).setColor(C8345u.m46326g(R.color.custom_bottom_play_bar));
        } else {
            ((GradientDrawable) this.f30629H0.getBackground()).setColor(i);
        }
    }

    /* renamed from: R4 */
    private void m39136R4() {
        new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{16842912}}, new int[]{C9332d.m49405b(this, R.color.default_text_color), C9332d.m49405b(this, R.color.default_text_color)});
        this.f30646Q.setTextColor(C8343s.m46295c(R.color.default_text_color));
    }

    /* renamed from: S4 */
    private void m39138S4(RelativeLayout relativeLayout) {
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
        this.f30675e1.setTextColor(C8343s.m46295c(R.color.default_text_color));
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

    /* renamed from: T4 */
    private void m39141T4() {
        List<Music> O = C8287e.m45798O();
        boolean z = true;
        this.f30647Q0.setEnabled((O == null || O.size() == 0) ? false : true);
        this.f30641N0.setEnabled((O == null || O.size() == 0) ? false : true);
        this.f30653T0.setEnabled((O == null || O.size() == 0) ? false : true);
        this.f30669b1.setEnabled((O == null || O.size() == 0) ? false : true);
        this.f30645P0.setEnabled((O == null || O.size() == 0) ? false : true);
        this.f30639M0.setEnabled((O == null || O.size() == 0) ? false : true);
        this.f30651S0.setEnabled((O == null || O.size() == 0) ? false : true);
        this.f30667a1.setEnabled((O == null || O.size() == 0) ? false : true);
        this.f30643O0.setEnabled((O == null || O.size() == 0) ? false : true);
        this.f30637L0.setEnabled((O == null || O.size() == 0) ? false : true);
        this.f30649R0.setEnabled((O == null || O.size() == 0) ? false : true);
        LinearLayout linearLayout = this.f30665Z0;
        if (O == null || O.size() == 0) {
            z = false;
        }
        linearLayout.setEnabled(z);
    }

    /* renamed from: U4 */
    private void m39143U4() {
        SquareMusicImageView squareMusicImageView = this.f30631I0;
        if (squareMusicImageView != null && (squareMusicImageView instanceof SquareMusicImageView)) {
            squareMusicImageView.mo27359l();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V3 */
    public /* synthetic */ void mo26656W3(View view, int i) {
        if (!AdHelper.m49536p().mo32459v(this, new C6958d0(this))) {
            m39140T3();
        }
    }

    /* renamed from: V4 */
    private void m39146V4(int i) {
        PermissionRequestDetailView permissionRequestDetailView = this.f30625F0;
        if (permissionRequestDetailView != null) {
            permissionRequestDetailView.setVisibility(i);
        }
        if (i == 8) {
            this.f30625F0 = null;
        }
    }

    /* renamed from: W4 */
    private void m39148W4() {
        C8287e.m45843h(this.f30664Z, this.f30670c0, true);
        this.f30676f0.mo27363r(0, new C7015z(this));
        m39161c3(true, true);
    }

    /* renamed from: X3 */
    static /* synthetic */ C8457t m39150X3(Integer num, Long l, C8446k kVar) {
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
    /* renamed from: X4 */
    public void m39151X4() {
        try {
            m39104E4();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y3 */
    public void m39153Y3() {
        m39156Z3();
    }

    /* renamed from: Y4 */
    private void m39154Y4() {
        SquareMusicImageView squareMusicImageView = this.f30631I0;
        if (squareMusicImageView != null && (squareMusicImageView instanceof SquareMusicImageView)) {
            squareMusicImageView.mo27360m();
        }
    }

    /* renamed from: Z3 */
    private void m39156Z3() {
        SquareMusicImageView squareMusicImageView = this.f30631I0;
        if (squareMusicImageView != null && (squareMusicImageView instanceof SquareMusicImageView)) {
            squareMusicImageView.mo27357j();
        }
    }

    /* renamed from: a5 */
    private void m39158a5(boolean z) {
        if (!BaseApplication.f31142E) {
            if (z) {
                BaseApplication.f31142E = true;
                C8337n.m46065k0(this).mo30097F2(true);
            }
            if (this.f30674e0 != null) {
                new Handler().postDelayed(new C6870a(), 700);
            }
        }
    }

    /* renamed from: b3 */
    private void m39159b3() {
        new Thread(new C6873d()).start();
    }

    /* renamed from: b4 */
    private void m39160b4() {
        RelativeLayout relativeLayout = this.f30679g1;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
            this.f30679g1.setBackground((Drawable) null);
        }
        m39146V4(8);
        this.f30633J0.setVisibility(0);
        m39202t3();
        m39205u3();
        m39208v3();
        m39175i3();
        C8287e.m45799O0(this);
        m39141T4();
    }

    /* renamed from: c3 */
    private void m39161c3(boolean z, boolean z2) {
        Drawable drawable;
        if (C8287e.m45873v() != null) {
            this.f30685m0.setVisibility(8);
            boolean z3 = false;
            this.f30676f0.setVisibility(0);
            this.f30631I0.setVisibility(0);
            this.f30659W0.setVisibility(0);
            ImageView imageView = this.f30658W;
            if (imageView != null) {
                if (C8287e.m45812V()) {
                    drawable = C9332d.m49407d(this, R.drawable.ic_home07_play2);
                } else {
                    drawable = C9332d.m49407d(this, R.drawable.ic_home05_pause);
                }
                imageView.setImageDrawable(drawable);
            }
            C7238p0 p0Var = this.f30668b0;
            if (p0Var != null && p0Var.mo27811y().size() == 0) {
                m39193p5();
            }
            if (z || this.f30684l0) {
                m39164d3(this.f30684l0);
                this.f30684l0 = false;
            }
            double r = C8287e.m45865r();
            double u = C8287e.m45871u();
            if (u == 0.0d || r == 0.0d) {
                this.f30657V0.setPercentage(0.0f);
            } else {
                this.f30657V0.setPercentage(((float) ((r * 100.0d) / u)) / 100.0f);
            }
            m39188o2(false);
            if (z2) {
                m39159b3();
            }
            C8287e.m45873v().mo9215k();
            C7238p0 p0Var2 = this.f30668b0;
            if (p0Var2 != null) {
                if (C8287e.m45873v().mo9261a() == 7) {
                    z3 = true;
                }
                p0Var2.mo27803K(z3);
            }
        }
    }

    /* renamed from: c4 */
    private void m39162c4() {
        if (Build.VERSION.SDK_INT >= 18) {
            StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
            StrictMode.setVmPolicy(builder.build());
            builder.detectFileUriExposure();
        }
    }

    /* renamed from: c5 */
    private void m39163c5() {
        SquareMusicImageView squareMusicImageView = this.f30631I0;
        if (squareMusicImageView != null && (squareMusicImageView instanceof SquareMusicImageView)) {
            squareMusicImageView.mo27361n();
        }
    }

    /* renamed from: d3 */
    private void m39164d3(boolean z) {
        if (this.f30681i0 || z) {
            m39174h4(0);
        }
        m39099C4();
        m39176i4(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: d4 */
    public void m39165d4() {
        if (C8287e.m45798O() == null || C8287e.m45798O().size() <= 0) {
            C8344t.m46317e(C8345u.m46327h(), C8345u.m46333n(R.string.please_select_track));
            return;
        }
        long[] E = C8287e.m45778E(C8287e.m45798O());
        C7382d.m41679j(this, getString(R.string.mutil_track), E, C8343s.m46300h(), C8345u.m46326g(R.color.white), C8345u.m46326g(R.color.color_bbb), new C6880k(E));
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public void m39166e3() {
        C8343s.m46307o(this.f30618C, false);
        this.f30668b0.mo27809t();
        recreate();
    }

    /* renamed from: e5 */
    private void m39167e5() {
        this.f30616B.setHomeIcon(true);
        this.f30616B.setMutilIcon(true);
        this.f30616B.setSort(0);
        this.f30616B.setTitleText(C8345u.m46333n(R.string.music_eq_app_name));
        this.f30616B.setMenuIcon(false);
        this.f30616B.setTitleBackgroundColor(C8345u.m46326g(R.color.library_title_backgroud_color));
        this.f30616B.mo27431B(true, true);
        C8343s.m46307o(this.f30618C, false);
        this.f30618C.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    /* renamed from: f3 */
    private void m39168f3() {
    }

    /* renamed from: f5 */
    private void m39169f5() {
        if (C8343s.f34788c == BaseApplication.f31162z) {
            Window window = getWindow();
            window.getDecorView().setSystemUiVisibility(8208);
            if (Build.VERSION.SDK_INT >= 21) {
                window.setNavigationBarColor(-1);
            }
        }
    }

    /* renamed from: g3 */
    private void m39170g3() {
        if (Build.VERSION.SDK_INT < 23) {
            m39160b4();
        } else if (C7366c.m41592d(C7366c.f32436d)) {
            m39160b4();
        } else {
            m39146V4(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g4 */
    public void m39171g4() {
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
        dVar.mo14616C(new C6879j());
        dVar.mo14615B(new C6878i());
        dVar.mo14621H();
    }

    /* renamed from: g5 */
    private void m39172g5() {
        try {
            C7382d.m41675f(this, "Music Player", C8345u.m46333n(R.string.share_txt));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: h3 */
    private void m39173h3() {
    }

    /* access modifiers changed from: private */
    /* renamed from: h4 */
    public void m39174h4(int i) {
        AlbumArtViewPager albumArtViewPager = this.f30676f0;
        if (albumArtViewPager != null) {
            albumArtViewPager.mo27362q(i);
        }
        this.f30680h0 = true;
    }

    /* renamed from: i3 */
    private void m39175i3() {
        C8287e.m45793L0(false);
        C8287e.m45791K0(-1);
        C8287e.m45849j();
    }

    /* access modifiers changed from: private */
    /* renamed from: i4 */
    public void m39176i4(boolean z) {
        if (this.f30680h0) {
            AlbumArtViewPager albumArtViewPager = this.f30676f0;
            if (albumArtViewPager != null) {
                albumArtViewPager.mo26325f();
            }
            this.f30680h0 = false;
            this.f30681i0 = false;
        }
        AlbumArtViewPager albumArtViewPager2 = this.f30676f0;
        if (albumArtViewPager2 != null) {
            albumArtViewPager2.setCurrentItem(z);
        }
    }

    /* renamed from: i5 */
    private void m39177i5() {
        this.f30668b0.mo27759j(this);
        this.f30668b0.mo27743k(this.f30660X);
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public void m39178j3() {
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
            } else if (BaseApplication.f31150n > C8287e.m45881z() && C8287e.m45867s() != null && this.f30668b0 != null && C8287e.m45867s() != null) {
                List<Music> s2 = C8287e.m45867s();
                int size = s2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (s2.get(i3) != null && s2.get(i3).mo9214j() / 1000 < BaseApplication.f31150n) {
                        this.f30668b0.mo27801I(i3);
                    }
                }
            }
        } catch (Exception unused) {
            C8344t.m46316d(this, R.string.error);
        }
    }

    /* renamed from: j5 */
    private void m39179j5() {
        C8282b.m45731c().mo29983d(this, new C6876g());
    }

    /* renamed from: k3 */
    private boolean m39180k3(Intent intent) {
        if (intent == null) {
            return false;
        }
        boolean booleanExtra = intent.getBooleanExtra("fromCutter", false);
        boolean booleanExtra2 = intent.getBooleanExtra("slider", false);
        if (booleanExtra) {
            FrameLayout frameLayout = this.f30628H;
            if (frameLayout != null && frameLayout.getChildCount() == 1) {
                mo3730H1().mo3913F0();
            }
            String str = C7397j.f32507d;
            C8216w2.m45360d(this, (C8200u2) null, str.substring(0, str.length() - 1), C8345u.m46333n(R.string.music_eq_ringtone_cutter), booleanExtra2);
        }
        return booleanExtra;
    }

    /* access modifiers changed from: private */
    /* renamed from: k4 */
    public void m39181k4() {
    }

    /* access modifiers changed from: private */
    /* renamed from: l4 */
    public void m39182l4(int i, boolean z) {
    }

    /* renamed from: l5 */
    private void m39183l5() {
        C7344h i = C7344h.m41524i(this, C8337n.m46065k0(C8345u.m46327h()).mo30111J0(), C8337n.m46065k0(C8345u.m46327h()).mo30236o0(), C6967g0.f31029g);
        this.f30673d1 = i;
        i.show();
    }

    /* renamed from: m5 */
    private void m39184m5() {
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public void m39185n3(Context context) {
        new C8337n(this).mo30222k2(this.f30620D.getCurrentItem());
        Intent intent = new Intent(context, LibraryActivity.class);
        intent.putExtra("fromCutter", true);
        intent.putExtra("slider", true);
        startActivity(intent);
        mo26681s3();
    }

    /* access modifiers changed from: private */
    /* renamed from: n4 */
    public void m39186n4() {
    }

    /* renamed from: n5 */
    private void m39187n5() {
        CarModeActivity.m38778A2(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public void m39188o2(boolean z) {
        if (C8287e.m45812V() || z) {
            C8287e.m45819Y0(this.f30687o0, this.f30688p0, this.f30686n0, this);
        } else {
            C8287e.m45827b1(this.f30687o0, this.f30688p0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public void m39140T3() {
        if (C8287e.m45873v() != null) {
            m39097B4();
            MainActivity.m39342E3(this, 109);
            overridePendingTransition(R.anim.entry, R.anim.hold);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o4 */
    public void m39190o4() {
        m39097B4();
        C8337n.m46065k0(this).mo30121L2(1);
        MainActivity.m39344F3(this, 109, 1);
        overridePendingTransition(R.anim.entry, R.anim.hold);
    }

    /* renamed from: p3 */
    private void m39191p3() {
        this.f30655U0.mo3512h();
        new Handler().postDelayed(new C6973i0(this), 400);
    }

    /* access modifiers changed from: private */
    /* renamed from: p4 */
    public void m39192p4() {
        m39196q4();
    }

    /* access modifiers changed from: private */
    /* renamed from: p5 */
    public void m39193p5() {
        C7238p0 p0Var = this.f30668b0;
        if (p0Var != null) {
            p0Var.mo27802J();
            this.f30668b0.mo27799G();
        }
    }

    /* renamed from: q3 */
    private void m39195q3() {
        if (!AdHelper.m49536p().mo32459v(this, new C6949a0(this))) {
            m39101D3();
        }
    }

    /* renamed from: q4 */
    private void m39196q4() {
        C8090e3 x3 = C8090e3.m44548x3(2);
        C0620p i = mo3730H1().mo3957i();
        i.mo4068b(R.id.fragment, x3);
        i.mo4073g(C8090e3.f34149t0);
        i.mo3816j();
    }

    /* renamed from: r4 */
    private void m39198r4() {
        if (!AdHelper.m49536p().mo32459v(this, new C7013y(this))) {
            m39130P3();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s4 */
    public void m39130P3() {
        startActivity(new Intent(this, SettingActivity.class));
    }

    /* renamed from: t3 */
    private void m39202t3() {
        this.f30654U.setVisibility(0);
        C7025h hVar = new C7025h(mo3730H1());
        this.f30622E = hVar;
        this.f30620D.setAdapter(hVar);
        this.f30620D.setOffscreenPageLimit(5);
        m39131P4(getIntent(), this.f30638M.mo30228m0());
        this.f30664Z.mo28184e();
        this.f30662Y = this.f30664Z.mo28183d();
        C8287e.m45781F0(this.f30664Z.mo28186h(), (ImageView) null, 1, true);
        if (this.f30668b0 == null) {
            C7238p0 p0Var = new C7238p0(this, false, C7238p0.f31962E);
            this.f30668b0 = p0Var;
            p0Var.mo27806P(this);
        }
        this.f30666a0 = C7973c.m43649d(this);
        this.f30672d0 = C7974d.m43656d(this);
        List<Music> e = this.f30666a0.mo29507e();
        this.f30670c0 = e;
        if (e.size() <= 0) {
            this.f30681i0 = true;
            this.f30670c0 = C4477c.m19585M(C8345u.m46327h());
        }
        m39148W4();
        if (this.f30670c0.size() <= 0) {
            m39094A4();
        }
        m39133Q4();
    }

    /* renamed from: t4 */
    private void m39203t4() {
        if (!C8315g.m45979a() && C8287e.m45873v() != null && !AdHelper.m49536p().mo32459v(this, new C7007v(this))) {
            m39190o4();
        }
    }

    /* renamed from: u3 */
    private void m39205u3() {
        C6952b0 b0Var = new C6952b0(this);
        this.f30658W.setOnClickListener(b0Var);
        this.f30677f1.setOnClickListener(b0Var);
        this.f30660X.setOnClickListener(b0Var);
        this.f30654U.setOnClickListener(b0Var);
        this.f30689q0.setOnClickListener(b0Var);
        this.f30690r0.setOnClickListener(b0Var);
        this.f30691s0.setOnClickListener(b0Var);
        this.f30692t0.setOnClickListener(b0Var);
        this.f30693u0.setOnClickListener(b0Var);
        this.f30694v0.setOnClickListener(b0Var);
        this.f30695w0.setOnClickListener(b0Var);
        this.f30671c1.setOnClickListener(b0Var);
        this.f30698z0.setOnClickListener(b0Var);
        this.f30615A0.setOnClickListener(b0Var);
        this.f30617B0.setOnClickListener(b0Var);
        this.f30619C0.setOnClickListener(b0Var);
        this.f30621D0.setOnClickListener(b0Var);
        this.f30649R0.setOnClickListener(b0Var);
        this.f30665Z0.setOnClickListener(b0Var);
        this.f30637L0.setOnClickListener(b0Var);
        this.f30643O0.setOnClickListener(b0Var);
        this.f30616B.setTitleOnClickListener(new C6874e());
        this.f30676f0.setOnPagerChangeListener(this);
        this.f30620D.setOnPageChangeListener(new TabLayout.C6204h(this.f30624F));
        this.f30624F.mo24736d(new C6875f());
    }

    /* access modifiers changed from: private */
    /* renamed from: u4 */
    public void m39206u4() {
        SkinChangeActivity.m39519D2(this);
    }

    /* renamed from: v3 */
    private void m39208v3() {
        this.f30632J = new C6882l(this, (C6872c) null);
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
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.update_video_list");
        intentFilter.addAction(getPackageName() + C8311c.f34734a);
        registerReceiver(this.f30632J, intentFilter);
    }

    /* renamed from: w3 */
    private void m39210w3() {
        if (this.f30630I == null) {
            DeepSelectTitle deepSelectTitle = (DeepSelectTitle) findViewById(R.id.select_title);
            this.f30630I = deepSelectTitle;
            deepSelectTitle.setAddStatusHeight(true);
            this.f30630I.setSelectTitleOnClickListener(new C6877h());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w4 */
    public void m39211w4() {
        Intent intent = new Intent(this, ContentActivity.class);
        VideoConfigBean.C2691a aVar = new VideoConfigBean.C2691a();
        aVar.mo10225c(true);
        intent.putExtra("video_config_bean", aVar.mo10223a());
        startActivity(intent);
    }

    /* renamed from: x3 */
    private void m39213x3() {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.loading_cover);
        this.f30679g1 = relativeLayout;
        if (!C8343s.f34787b) {
            relativeLayout.setBackgroundColor(C8343s.f34788c == 1 ? C8345u.m46326g(R.color.white) : C8345u.m46326g(R.color.theme_black_load_bg));
        } else if (C8343s.m46297e().mo27075h()) {
            this.f30679g1.setBackgroundColor(C8343s.m46297e().mo27071d());
        } else {
            this.f30679g1.setBackgroundColor(C8345u.m46326g(R.color.theme_black_load_bg));
        }
        this.f30616B = (DeepDefaultTitle) findViewById(R.id.defualt_title);
        this.f30618C = (ImageView) findViewById(R.id.library_bg);
        findViewById(R.id.bg_cover).setVisibility(C8343s.f34787b ? 0 : 8);
        this.f30625F0 = (PermissionRequestDetailView) findViewById(R.id.permissionRequestDetailView);
        if (C0506a.m3149a(this, C7366c.f32436d) != 0) {
            m39146V4(0);
        }
        ((TextView) this.f30625F0.findViewById(R.id.tv_title)).setTextColor(C8343s.m46295c(R.color.default_text_color));
        ((TextView) this.f30625F0.findViewById(R.id.tv_detail)).setTextColor(C8343s.m46295c(R.color.default_text_color));
        ((TextView) this.f30625F0.findViewById(R.id.button_allow)).setTextColor(C8345u.m46326g(R.color.white));
        ((ImageView) this.f30625F0.findViewById(R.id.iv_icon)).setImageDrawable(C8343s.m46303k(R.drawable.ic_request_icon, R.color.colorAccent));
        this.f30625F0.setAllowPermissionListener(this);
        this.f30620D = (NoScrollViewPager) findViewById(R.id.viewpager);
        this.f30624F = (NoScrollTabLayout) findViewById(R.id.tabs);
        this.f30626G = (RelativeLayout) findViewById(R.id.tabs_root);
        this.f30624F.setSelectedTabIndicatorHeight(0);
        this.f30628H = (FrameLayout) findViewById(R.id.fragment);
        this.f30640N = (RelativeLayout) findViewById(R.id.bottomcontrol);
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(R.id.bottom_play_bar);
        this.f30654U = relativeLayout2;
        relativeLayout2.getLayoutTransition().enableTransitionType(4);
        this.f30658W = (ImageView) findViewById(R.id.iv_playpause);
        this.f30677f1 = (RelativeLayout) findViewById(R.id.rl_play_pause);
        this.f30660X = (ImageView) findViewById(R.id.iv_playlist);
        this.f30656V = (RelativeLayout) findViewById(R.id.temp_view);
        m39116J4();
        this.f30685m0 = (LinearLayout) findViewById(R.id.rl_bottom_no_track);
        this.f30674e0 = (RelativeLayout) findViewById(R.id.rl_bottom_viewpager);
        AlbumArtViewPager albumArtViewPager = new AlbumArtViewPager(this);
        this.f30676f0 = albumArtViewPager;
        albumArtViewPager.mo26322c();
        this.f30674e0.addView(this.f30676f0);
        this.f30696x0 = (MarqueeView) findViewById(R.id.am_sweepView);
        RelativeLayout relativeLayout3 = (RelativeLayout) findViewById(R.id.rl_v_root);
        this.f30629H0 = (RelativeLayout) findViewById(R.id.iv_play_bar_bg);
        this.f30631I0 = (SquareMusicImageView) findViewById(R.id.iv_album);
        this.f30659W0 = (ImageView) findViewById(R.id.iv_album_bg);
        m39107F4();
        RelativeLayout relativeLayout4 = (RelativeLayout) findViewById(R.id.rl_bottom_layout);
        this.f30633J0 = relativeLayout4;
        relativeLayout4.getLayoutTransition().enableTransitionType(4);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.bottom_multi_option_layout);
        this.f30635K0 = linearLayout;
        linearLayout.getLayoutTransition().enableTransitionType(4);
        this.f30635K0.setBackgroundColor(C8343s.m46295c(R.color.bottom_multi_option_layout_bg));
        this.f30637L0 = (LinearLayout) findViewById(R.id.ll_add_to_queue);
        this.f30639M0 = (ImageView) findViewById(R.id.iv_add_to_queue);
        TextView textView = (TextView) findViewById(R.id.tv_add_to_queue);
        this.f30641N0 = textView;
        textView.setTextColor(C9332d.m49406c(C8345u.m46327h(), R.drawable.bottom_option_text_color_selector));
        this.f30639M0.setImageDrawable(C8343s.m46298f(R.drawable.add_to_queue_icon_selector));
        this.f30643O0 = (LinearLayout) findViewById(R.id.ll_add_to_playlist);
        this.f30645P0 = (ImageView) findViewById(R.id.iv_add_to_playlist);
        TextView textView2 = (TextView) findViewById(R.id.tv_add_to_playlist);
        this.f30647Q0 = textView2;
        textView2.setTextColor(C9332d.m49406c(C8345u.m46327h(), R.drawable.bottom_option_text_color_selector));
        this.f30645P0.setImageDrawable(C8343s.m46298f(R.drawable.add_to_playlist_icon_selector));
        this.f30649R0 = (LinearLayout) findViewById(R.id.ll_multi_delete);
        this.f30651S0 = (ImageView) findViewById(R.id.iv_multi_delete);
        TextView textView3 = (TextView) findViewById(R.id.tv_multi_delete);
        this.f30653T0 = textView3;
        textView3.setTextColor(C9332d.m49406c(C8345u.m46327h(), R.drawable.bottom_option_text_color_selector));
        this.f30651S0.setImageDrawable(C8343s.m46298f(R.drawable.delete_track_icon_selector));
        this.f30665Z0 = (LinearLayout) findViewById(R.id.ll_multi_remove);
        this.f30667a1 = (ImageView) findViewById(R.id.iv_multi_remove);
        TextView textView4 = (TextView) findViewById(R.id.tv_multi_remove);
        this.f30669b1 = textView4;
        textView4.setTextColor(C9332d.m49406c(C8345u.m46327h(), R.drawable.bottom_option_text_color_selector));
        this.f30667a1.setImageDrawable(C8343s.m46298f(R.drawable.remove_track_icon_selector));
        RoundProgressView roundProgressView = (RoundProgressView) findViewById(R.id.progress);
        this.f30657V0 = roundProgressView;
        roundProgressView.setRadius(6);
        this.f30657V0.setProgressColor(C8343s.m46300h());
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        this.f30663Y0 = navigationView;
        navigationView.setBackgroundColor(C8343s.m46295c(R.color.nav_header_bg_color));
        this.f30655U0 = (DrawerLayout) findViewById(R.id.drawerLayout);
        m39126N4();
        this.f30661X0 = (ViewGroup) findViewById(R.id.adlayout);
    }

    /* access modifiers changed from: private */
    /* renamed from: x4 */
    public void m39101D3() {
        startActivity(new Intent(this, WidgetActivity.class));
    }

    /* renamed from: y4 */
    private void m39217y4() {
        C9502v.m49945p(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void mo26641A3() {
        startActivityForResult(C8333k.m46053d(this), SoundEffectListActivity.f30849U);
    }

    /* access modifiers changed from: private */
    /* renamed from: z4 */
    public void m39220z4() {
        try {
            if (!C9502v.m49948s() && C9502v.m49943n() > 0) {
                TextView textView = this.f30623E0;
                textView.setText(C9502v.m49943n() + BuildConfig.FLAVOR);
                this.f30623E0.setVisibility(0);
            } else if (!C9502v.m49948s() && C9502v.m49943n() == 0) {
                this.f30623E0.setVisibility(8);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: A */
    public void mo26484A() {
        super.mo26484A();
        this.f30682j0 = true;
    }

    /* renamed from: A0 */
    public void mo26500A0() {
        mo26659b5(0);
    }

    /* renamed from: A1 */
    public void mo26485A1(int i) {
        super.mo26485A1(i);
        if (this.f30680h0) {
            this.f30680h0 = false;
        }
        m39174h4(0);
        m39176i4(false);
        C8287e.m45781F0(i, (ImageView) null, 2, true);
        C7238p0 p0Var = this.f30668b0;
        if (p0Var != null) {
            p0Var.mo27808s(i);
        }
    }

    /* renamed from: B1 */
    public void mo26501B1() {
        mo26659b5(3);
    }

    /* renamed from: C */
    public void mo26642C() {
        if (C7366c.m41598j(this, C7366c.f32436d)) {
            m39170g3();
        } else {
            C7387e.m41685a(this, new C6871b());
        }
    }

    /* renamed from: E0 */
    public void mo26502E0(boolean z) {
        m39174h4(0);
        m39176i4(z);
    }

    /* renamed from: G */
    public void mo26503G() {
        mo26659b5(11);
    }

    /* renamed from: H */
    public void mo26504H(Timer timer, TimerTask timerTask) {
        this.f30687o0 = timer;
        this.f30688p0 = timerTask;
    }

    /* renamed from: H0 */
    public void mo14800H0(boolean z, long j, String str, int i, int i2) {
        if (z) {
            mo26646H4(str, i, j, i2);
        }
    }

    /* renamed from: H4 */
    public void mo26646H4(String str, int i, long j, int i2) {
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
        m39173h3();
    }

    /* renamed from: K4 */
    public void mo26648K4() {
    }

    /* renamed from: Q */
    public void mo26506Q() {
        mo26659b5(9);
    }

    /* renamed from: Q0 */
    public void mo26651Q0() {
        m39160b4();
    }

    /* renamed from: Q1 */
    public C0136e mo470Q1() {
        return C0142i.m793R0(this, this);
    }

    /* renamed from: R */
    public void mo26507R() {
    }

    /* renamed from: T0 */
    public void mo26654T0() {
        m39170g3();
    }

    /* renamed from: U */
    public void mo26508U() {
    }

    /* renamed from: W0 */
    public void mo26509W0() {
        mo26659b5(10);
    }

    /* renamed from: Z */
    public void mo26487Z() {
        super.mo26487Z();
        AlbumArtViewPager albumArtViewPager = this.f30676f0;
        if (albumArtViewPager != null) {
            albumArtViewPager.setCurrentItem(false);
        }
    }

    /* renamed from: Z4 */
    public void mo26657Z4(int i) {
        mo26490g2(0, i);
    }

    /* renamed from: a1 */
    public void mo26511a1() {
        m39174h4(0);
        m39097B4();
    }

    /* renamed from: a4 */
    public void mo26658a4() {
        C8282b.m45731c().mo29982b(this, this.f30661X0);
    }

    /* renamed from: b1 */
    public void mo26512b1() {
        mo26659b5(4);
    }

    /* renamed from: b5 */
    public void mo26659b5(int i) {
        mo26490g2(1, i);
    }

    /* renamed from: d */
    public void mo26660d(int i, float f, int i2) {
        if (f == 0.0f) {
            mo26662d5(1.0f);
        }
    }

    /* renamed from: d0 */
    public void mo26661d0() {
        try {
            C8287e.m45832d0();
            m39158a5(true);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d2 */
    public void mo26488d2() {
        super.mo26488d2();
        m39097B4();
        C8282b.m45730a();
    }

    /* renamed from: d5 */
    public void mo26662d5(float f) {
    }

    /* renamed from: e0 */
    public void mo26513e0() {
        sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.clean_list"));
    }

    /* renamed from: e4 */
    public void mo26663e4() {
        if (C8287e.m45834e(C8287e.m45798O())) {
            mo26657Z4(0);
        }
    }

    /* renamed from: f */
    public void mo26664f() {
        TextView textView = this.f30675e1;
        if (textView != null) {
            textView.setText(BuildConfig.FLAVOR);
        }
    }

    /* renamed from: f0 */
    public boolean mo26665f0(ArrayList<C9483n> arrayList) {
        C9502v.m49931b(arrayList);
        C9502v.m49933d(this);
        DeepDefaultTitle deepDefaultTitle = this.f30616B;
        if (deepDefaultTitle == null) {
            return true;
        }
        deepDefaultTitle.mo27434G();
        this.f30616B.setUpGiftBadgeActionView(this);
        return true;
    }

    /* renamed from: f1 */
    public void mo26666f1() {
    }

    /* renamed from: f4 */
    public void mo26667f4() {
        this.f30634K = true;
        C8287e.m45828c(this, C8287e.m45798O(), true);
    }

    /* renamed from: h5 */
    public void mo26668h5() {
        if (this.f30633J0.getVisibility() != 0) {
            this.f30633J0.setVisibility(0);
            if (this.f30628H.getChildCount() > 0 && this.f30661X0.getVisibility() != 0) {
                this.f30661X0.setVisibility(0);
            }
        }
    }

    /* renamed from: i1 */
    public void mo26514i1() {
        mo26659b5(6);
    }

    /* renamed from: i2 */
    public Fragment mo26492i2() {
        if (this.f30628H.getChildCount() == 0) {
            return this.f30622E.mo26930w();
        }
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
        m39109G4();
        if (z) {
            m39107F4();
        }
        m39161c3(z, true);
        sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.list_notifiy.action").setPackage(C8345u.m46327h().getPackageName()));
        sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.detail_list_notifiy.action").setPackage(C8345u.m46327h().getPackageName()));
        if (z) {
            sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.add_to_recent_notify_action").setPackage(C8345u.m46327h().getPackageName()));
        }
        C8335m.m46064j(this, C8287e.m45812V(), this.f30696x0);
        m39158a5(false);
    }

    /* renamed from: j4 */
    public void mo26669j4(boolean z) {
        m39193p5();
        m39174h4(0);
        m39161c3(true, z);
    }

    /* renamed from: k1 */
    public void mo26670k1(long j) {
        C7344h hVar = this.f30673d1;
        if (hVar != null) {
            hVar.mo28087r(j / 1000);
        }
        TextView textView = this.f30675e1;
        if (textView != null) {
            textView.setText(C8345u.m46324e((int) (j / 1000)));
        }
    }

    /* renamed from: k5 */
    public void mo26671k5() {
        if (this.f30628H.getChildCount() == 0) {
            if (this.f30626G.getVisibility() != 0) {
                this.f30626G.setVisibility(0);
            }
            if (this.f30661X0.getVisibility() != 8) {
                this.f30661X0.setVisibility(8);
            }
        }
    }

    /* renamed from: l0 */
    public void mo26515l0() {
        mo26659b5(8);
    }

    /* renamed from: l3 */
    public int mo26672l3() {
        return C8287e.m45798O().size();
    }

    /* renamed from: m1 */
    public void mo26516m1(ArrayList<SoundEffect> arrayList) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m2 */
    public void mo26496m2(boolean z) {
        super.mo26496m2(z);
        LinearLayout linearLayout = this.f30649R0;
        int i = 0;
        if (linearLayout != null) {
            linearLayout.setVisibility(z ? 0 : 8);
        }
        LinearLayout linearLayout2 = this.f30665Z0;
        if (linearLayout2 != null) {
            if (z) {
                i = 8;
            }
            linearLayout2.setVisibility(i);
        }
    }

    /* renamed from: m3 */
    public void mo26673m3(ArrayList<SoundEffect> arrayList) {
        if (!AdHelper.m49536p().mo32459v(this, new C7003t(this))) {
            startActivityForResult(C8333k.m46053d(this), SoundEffectListActivity.f30849U);
        }
    }

    /* renamed from: m4 */
    public void mo26674m4() {
    }

    /* renamed from: n1 */
    public void mo26517n1() {
        mo26659b5(5);
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: o5 */
    public void mo26675o5() {
        try {
            DrawerLayout drawerLayout = this.f30655U0;
            if (drawerLayout != null) {
                drawerLayout.mo3485J(8388611);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        super.onActivityResult(i, i2, intent);
        if (i3 == 12306) {
            m39170g3();
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
                    mo26673m3((ArrayList<SoundEffect>) null);
                }
            }
        } else if (i3 == 1029 && i4 == 1003) {
            if (intent2 != null && intent2.getBooleanExtra("hadChange", false)) {
                C8337n.m46065k0(this).mo30101G2(Integer.MAX_VALUE);
            }
        } else if (i3 == 1013) {
            C8335m.m46061g(this, this.f30697y0);
            C8335m.m46062h(this, this.f30696x0);
        } else if (i3 == 122) {
            m39220z4();
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
                    mo26673m3((ArrayList<SoundEffect>) null);
                    m39184m5();
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
        m39188o2(true);
        C4477c.m19608a0(this, i, i2, intent);
    }

    public void onBackPressed() {
        if (C8287e.m45800P()) {
            mo26657Z4(0);
        } else if (this.f30650S) {
            DrawerLayout drawerLayout = this.f30655U0;
            if (drawerLayout != null) {
                drawerLayout.mo3512h();
            }
        } else if (mo3730H1().mo3946c0() > 0) {
            super.onBackPressed();
            if (mo3730H1().mo3946c0() == 0) {
                mo26671k5();
            } else {
                mo26668h5();
            }
        } else {
            C2280j.m10625k(this, new C6955c0(this));
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
        m39169f5();
        C9502v.m49946q(this, "/MediaAppList.xml");
        C9502v.m49926U(this, this);
        setContentView((int) R.layout.activity_library);
        this.f30664Z = C7393h.m41695f(this);
        this.f30638M = C8337n.m46065k0(this);
        this.f30678g0 = new Handler();
        m39213x3();
        m39113I4();
        BaseApplication.f31141D = false;
        m39162c4();
        AdHelper.m49536p().mo32449j(this, 4);
        C6872c cVar = new C6872c(this, this.f30655U0, R.string.about, R.string.about);
        this.f30648R = cVar;
        this.f30655U0.setDrawerListener(cVar);
    }

    public void onDestroy() {
        super.onDestroy();
        C6882l lVar = this.f30632J;
        if (lVar != null) {
            unregisterReceiver(lVar);
            this.f30632J = null;
        }
        m39175i3();
        this.f30634K = false;
        DeepDefaultTitle deepDefaultTitle = this.f30616B;
        if (deepDefaultTitle != null) {
            deepDefaultTitle.mo27439V();
            this.f30616B = null;
        }
        C8321j.m45995a(this.f30618C);
        if (this.f30620D != null) {
            this.f30620D = null;
        }
        if (this.f30622E != null) {
            this.f30622E = null;
        }
        if (this.f30624F != null) {
            this.f30624F = null;
        }
        if (this.f30628H != null) {
            this.f30628H = null;
        }
        if (this.f30630I != null) {
            this.f30630I = null;
        }
        if (this.f30640N != null) {
            this.f30640N = null;
        }
        Handler handler = this.f30678g0;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f30678g0 = null;
        }
        if (this.f30625F0 != null) {
            this.f30625F0 = null;
        }
        C8287e.m45844h0(this);
        C8335m.m46055a(this.f30696x0, this.f30697y0);
        MainActivity.f30715q0 = false;
        C8282b.m45730a();
        C8287e.m45847i0(this);
        C9502v.m49916K();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            m39131P4(intent, C8337n.m46065k0(C8345u.m46327h()).mo30228m0());
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        m39143U4();
        C8287e.m45827b1(this.f30687o0, this.f30688p0);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C7366c.m41596h(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        mo26495k2();
        m39154Y4();
        if (C8287e.m45812V()) {
            C8287e.m45819Y0(this.f30687o0, this.f30688p0, this.f30686n0, this);
        }
        C8335m.m46060f(this, this.f30696x0);
        DeepDefaultTitle deepDefaultTitle = this.f30616B;
        if (deepDefaultTitle != null) {
            deepDefaultTitle.setUpGiftBadgeActionViewResume(this);
        }
        C8340q.m46288b(this, new C7011x(this));
        if (C9502v.m49949t()) {
            C9502v.m49940k(this);
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        super.onServiceConnected(componentName, iBinder);
        C4588a.m20010c(this);
        this.f30627G0 = true;
        m39167e5();
        m39170g3();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C9502v.m49937h(this);
    }

    /* renamed from: p2 */
    public void mo26676p2(boolean z, int i) {
        if (C8287e.m45798O() != null) {
            m39210w3();
            if (z) {
                if (C8287e.m45798O() == null || C8287e.m45798O().size() != 0) {
                    DeepSelectTitle deepSelectTitle = this.f30630I;
                    deepSelectTitle.mo27476e(true, C8345u.m46333n(R.string.selected) + "(" + mo26672l3() + ")");
                } else {
                    DeepSelectTitle deepSelectTitle2 = this.f30630I;
                    deepSelectTitle2.mo27476e(false, C8345u.m46333n(R.string.selected) + "(" + 0 + ")");
                }
            } else if (C8287e.m45798O() != null) {
                if (C8287e.m45798O().size() != i) {
                    DeepSelectTitle deepSelectTitle3 = this.f30630I;
                    deepSelectTitle3.mo27476e(false, C8345u.m46333n(R.string.selected) + "(" + mo26672l3() + ")");
                    StringBuilder sb = new StringBuilder();
                    sb.append("size:");
                    sb.append(mo26672l3());
                    Log.e("UpdateSelectNum", sb.toString());
                } else if (i == 0) {
                    DeepSelectTitle deepSelectTitle4 = this.f30630I;
                    deepSelectTitle4.mo27476e(false, C8345u.m46333n(R.string.selected) + "(" + mo26672l3() + ")");
                } else {
                    DeepSelectTitle deepSelectTitle5 = this.f30630I;
                    deepSelectTitle5.mo27476e(true, C8345u.m46333n(R.string.selected) + "(" + mo26672l3() + ")");
                }
            }
            m39141T4();
        }
    }

    /* renamed from: q5 */
    public void mo26677q5() {
        mo26490g2(2, 0);
    }

    /* renamed from: r */
    public void mo26678r(int i) {
        if (i == 1) {
            mo26662d5(0.0f);
        }
    }

    /* renamed from: r1 */
    public void mo26518r1() {
    }

    /* renamed from: r3 */
    public void mo26679r3() {
        if (this.f30626G.getVisibility() != 8) {
            this.f30626G.setVisibility(8);
        }
        if (this.f30633J0.getVisibility() != 8) {
            this.f30633J0.setVisibility(8);
        }
    }

    /* renamed from: r5 */
    public void mo26680r5() {
        mo26490g2(2, 1);
    }

    /* renamed from: s3 */
    public void mo26681s3() {
        if (this.f30626G.getVisibility() != 8) {
            this.f30626G.setVisibility(8);
        }
        if (this.f30661X0.getVisibility() != 0) {
            this.f30661X0.setVisibility(0);
        }
    }

    /* renamed from: u0 */
    public void mo26682u0() {
        if (this.f30627G0) {
            C7366c.m41591c(this, this);
        } else {
            Toast.makeText(this, R.string.wait_for_connect, 0).show();
        }
    }

    /* renamed from: u1 */
    public void mo26499u1() {
        super.mo26499u1();
        m39193p5();
        m39097B4();
    }

    /* renamed from: v4 */
    public void mo26683v4() {
        if (!AdHelper.m49536p().mo32459v(this, new C6961e0(this))) {
            m39211w4();
        }
    }

    /* renamed from: w */
    public void mo26684w() {
        try {
            C8287e.m45835e0();
            m39158a5(true);
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
        mo26659b5(0);
    }
}
