package p342g.p343a.p344a.p349f.p353e.p354d;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ViewAnimator;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import com.coocent.lyriclibrary.view.LyricView;
import com.coocent.lyriclibrary.view.TwoLyricView;
import com.coocent.music.base.data.entity.Music;
import com.coocent.videoplayer.bean.VideoConfigBean;
import com.coocent.videostore.p067po.Video;
import com.google.android.gms.ads.C3060l;
import coocent.music.player.mode.SoundEffect;
import coocent.music.player.widget.p275k.C7227m0;
import coocent.music.player.widget.p275k.C7229n0;
import coocent.musiclibrary.music.p281b.C7323b;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.C9491t;
import net.coocent.android.xmlparser.ads.AdHelper;
import net.coocent.android.xmlparser.p461z.C9566f;
import p159f.p166c.p177d.p178h.C4348a;
import p159f.p166c.p177d.p179i.C4351b;
import p159f.p166c.p181e.p182a.p183a.p184a.C4361a;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p159f.p166c.p222m.C4613a;
import p159f.p166c.p222m.C4615b;
import p159f.p166c.p222m.C4616c;
import p342g.p343a.p344a.p345b.C7942a;
import p342g.p343a.p344a.p346c.C7948a;
import p342g.p343a.p344a.p346c.C7963p;
import p342g.p343a.p344a.p348e.C7985h;
import p342g.p343a.p344a.p349f.p353e.C8249b;
import p342g.p343a.p344a.p355g.C8284c;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8314f;
import p342g.p343a.p344a.p358i.C8316h;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8344t;
import p342g.p343a.p344a.p358i.C8345u;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: g.a.a.f.e.d.o */
/* compiled from: TabImage2Fragment */
public class C8270o extends C8249b implements C7948a, C4361a, C7963p {
    /* access modifiers changed from: private */

    /* renamed from: A0 */
    public int f34625A0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: B0 */
    public long f34626B0 = 0;

    /* renamed from: C0 */
    private ImageView f34627C0;

    /* renamed from: g0 */
    private ImageView f34628g0;

    /* renamed from: h0 */
    private C8316h f34629h0;

    /* renamed from: i0 */
    private C8275e f34630i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public TwoLyricView f34631j0;

    /* renamed from: k0 */
    private ImageView f34632k0;

    /* renamed from: l0 */
    private ImageView f34633l0;

    /* renamed from: m0 */
    private ImageView f34634m0;

    /* renamed from: n0 */
    private ImageView f34635n0;

    /* renamed from: o0 */
    private ImageView f34636o0;

    /* renamed from: p0 */
    private ImageView f34637p0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public LyricView f34638q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public LinearLayout f34639r0;

    /* renamed from: s0 */
    private ViewAnimator f34640s0;

    /* renamed from: t0 */
    private CardView f34641t0;

    /* renamed from: u0 */
    private LinearLayout f34642u0;

    /* renamed from: v0 */
    private int f34643v0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public boolean f34644w0 = false;
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public Handler f34645x0;
    /* access modifiers changed from: private */

    /* renamed from: y0 */
    public boolean f34646y0 = false;
    /* access modifiers changed from: private */

    /* renamed from: z0 */
    public boolean f34647z0 = true;

    /* renamed from: g.a.a.f.e.d.o$a */
    /* compiled from: TabImage2Fragment */
    class C8271a implements C9491t {
        C8271a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void mo29975f() {
            C8270o.this.m45629p4();
        }

        /* renamed from: a */
        public void mo29971a(C3060l lVar) {
            int unused = C8270o.this.f34625A0 = 3;
        }

        /* renamed from: b */
        public void mo29972b() {
            boolean unused = C8270o.this.f34644w0 = true;
            if (C8270o.this.f34645x0 != null) {
                C8270o.this.f34645x0.removeCallbacksAndMessages((Object) null);
            }
            C8270o.this.m45629p4();
            if (C8270o.this.f34625A0 != 1) {
                C8270o.this.m45616a4();
            }
        }

        /* renamed from: c */
        public void mo29973c() {
        }

        /* renamed from: d */
        public void mo29974d() {
            int unused = C8270o.this.f34625A0 = 2;
            if (C8270o.this.f34647z0) {
                boolean unused2 = C8270o.this.f34646y0 = true;
                boolean unused3 = C8270o.this.f34647z0 = false;
                long abs = Math.abs(System.currentTimeMillis() - C8270o.this.f34626B0);
                if (abs >= 1000) {
                    C8270o.this.m45629p4();
                } else {
                    new Handler().postDelayed(new C8256c(this), 1000 - abs);
                }
            }
        }
    }

    /* renamed from: g.a.a.f.e.d.o$b */
    /* compiled from: TabImage2Fragment */
    class C8272b extends C4351b {
        C8272b() {
        }

        /* renamed from: a */
        public boolean mo14781a(long j) {
            C8287e.m45829c0();
            C8287e.m45856m0((int) (j / 1000));
            return true;
        }

        /* renamed from: b */
        public void mo8880b(boolean z) {
            if (!z) {
                C8270o.this.m45601H3();
                return;
            }
            C8270o.this.f34631j0.setVisibility(0);
            C8270o.this.f34639r0.setVisibility(0);
            C8270o.this.f34638q0.setVisibility(8);
        }
    }

    /* renamed from: g.a.a.f.e.d.o$c */
    /* compiled from: TabImage2Fragment */
    class C8273c implements C7323b {
        C8273c() {
        }

        /* renamed from: a */
        public void mo28059a(int i) {
            if (C8270o.this.f34631j0 != null) {
                C8270o.this.f34631j0.setTextSize((float) i);
            }
            C8337n.m46065k0(C8345u.m46327h()).mo30140Q1(i);
        }

        /* renamed from: b */
        public void mo28060b(int i) {
            if (C8270o.this.f34631j0 != null) {
                C8270o.this.f34631j0.setTextColor(i);
            }
            if (C8270o.this.f34638q0 != null) {
                C8270o.this.f34638q0.setTextColor(i);
            }
            C8337n.m46065k0(C8345u.m46327h()).mo30136P1(i);
        }
    }

    /* renamed from: g.a.a.f.e.d.o$d */
    /* compiled from: TabImage2Fragment */
    class C8274d extends C4351b {
        C8274d() {
        }

        /* renamed from: b */
        public void mo8880b(boolean z) {
            if (!z) {
                C8270o.this.m45601H3();
                return;
            }
            C8270o.this.f34631j0.setVisibility(8);
            C8270o.this.f34639r0.setVisibility(8);
            C8270o.this.f34638q0.setVisibility(0);
        }
    }

    /* renamed from: g.a.a.f.e.d.o$e */
    /* compiled from: TabImage2Fragment */
    private class C8275e extends BroadcastReceiver {
        private C8275e() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                action.hashCode();
                if (action.equals("coocent.musiclibrary.music.utils.LyricUtils_UPDATE_REPLACE_LYRIC")) {
                    C8270o.this.m45623i4();
                }
            }
        }

        /* synthetic */ C8275e(C8270o oVar, C8271a aVar) {
            this();
        }
    }

    /* renamed from: F3 */
    private void m45599F3() {
        Music v = C8287e.m45873v();
        if (v == null) {
            return;
        }
        if (v.mo9261a() == 7) {
            Toast.makeText(C8345u.m46327h(), R.string.video_style_can_not_option, 0).show();
        } else {
            this.f34629h0.mo30045a();
        }
    }

    /* renamed from: G3 */
    private void m45600G3() {
        Music v = C8287e.m45873v();
        if (v == null) {
            return;
        }
        if (v.mo9261a() == 7) {
            Toast.makeText(C8345u.m46327h(), R.string.video_style_can_not_option, 0).show();
        } else {
            C7985h.m43691q3(C8287e.m45873v()).mo3841h3(mo3606L().mo3730H1(), "ADD_PLAYLIST");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public void m45601H3() {
        if (C8287e.m45873v() != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(mo3606L());
            builder.setTitle(R.string.bind_lyric);
            builder.setMessage(R.string.related_lyr_tip);
            builder.setPositiveButton(R.string.local, new C8259f(this));
            builder.setNegativeButton(R.string.button2, C8258e.f34605g);
            builder.setNeutralButton(R.string.button1, new C8257d(this));
            AlertDialog create = builder.create();
            create.show();
            create.getButton(-1).setTextColor(C8343s.m46300h());
            create.getButton(-2).setTextColor(C8343s.m46300h());
            create.getButton(-3).setTextColor(C8343s.m46300h());
        }
    }

    /* renamed from: I3 */
    private void m45602I3() {
        C8316h hVar;
        if (this.f34628g0 != null && (hVar = this.f34629h0) != null) {
            hVar.mo30046b();
        }
    }

    /* renamed from: J3 */
    private void m45603J3() {
        Music v = C8287e.m45873v();
        if (v != null && v.mo9261a() == 7) {
            List<Music> s = C8287e.m45867s();
            ArrayList arrayList = new ArrayList();
            if (s != null) {
                for (int i = 0; i < s.size(); i++) {
                    Video video = new Video();
                    video.mo10525N(s.get(i).mo9215k());
                    video.mo10540b0(s.get(i).mo9219o().toString());
                    video.mo10538a0(s.get(i).mo9218n());
                    video.mo10520G((long) s.get(i).mo9214j());
                    video.mo10536Z(C4477c.m19602V(C8345u.m46327h(), s.get(i).mo9215k(), 0));
                    video.mo10535Y(s.get(i).mo9216l());
                    arrayList.add(video);
                }
                try {
                    C4616c a = C4615b.m20080a();
                    Objects.requireNonNull(a);
                    C4613a a2 = a.mo15370a();
                    Context v2 = mo3708v2();
                    VideoConfigBean.C2691a aVar = new VideoConfigBean.C2691a();
                    aVar.mo10225c(false);
                    aVar.mo10229g(arrayList);
                    aVar.mo10231i(C8287e.m45863q());
                    a2.mo15360f(v2, aVar.mo10223a());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: K3 */
    private void m45604K3() {
        this.f34645x0 = new Handler();
    }

    /* renamed from: L3 */
    private void m45605L3() {
        if (mo3606L() != null) {
            this.f34630i0 = new C8275e(this, (C8271a) null);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("coocent.musiclibrary.music.utils.LyricUtils_UPDATE_REPLACE_LYRIC");
            mo3606L().registerReceiver(this.f34630i0, intentFilter);
        }
    }

    /* renamed from: M3 */
    private void m45606M3(View view) {
        TwoLyricView twoLyricView = (TwoLyricView) view.findViewById(R.id.twoLyricView);
        this.f34631j0 = twoLyricView;
        twoLyricView.setTextColor(-1);
        this.f34631j0.setOnLyricListener(new C8274d());
    }

    /* renamed from: N3 */
    private void m45607N3(View view) {
        this.f34626B0 = System.currentTimeMillis();
        Log.e("onAdsLoadSuccess", "adStartTime:" + this.f34626B0);
        this.f34628g0 = (ImageView) view.findViewById(R.id.iv_favorite);
        this.f34632k0 = (ImageView) view.findViewById(R.id.iv_sound_effect);
        this.f34633l0 = (ImageView) view.findViewById(R.id.iv_add_to_playlist);
        this.f34634m0 = (ImageView) view.findViewById(R.id.iv_option);
        this.f34635n0 = (ImageView) view.findViewById(R.id.lrc);
        this.f34639r0 = (LinearLayout) view.findViewById(R.id.ll_art_tab_layout);
        m45606M3(view);
        this.f34636o0 = (ImageView) view.findViewById(R.id.iv_lyric_set);
        this.f34637p0 = (ImageView) view.findViewById(R.id.iv_share);
        LyricView lyricView = (LyricView) view.findViewById(R.id.lyricView);
        this.f34638q0 = lyricView;
        lyricView.setTextColor(C8337n.m46065k0(C8345u.m46327h()).mo30114K());
        this.f34640s0 = (ViewAnimator) view.findViewById(R.id.view_flipper);
        this.f34641t0 = (CardView) view.findViewById(R.id.cv_ad);
        this.f34642u0 = (LinearLayout) view.findViewById(R.id.ll_native);
        this.f34627C0 = (ImageView) view.findViewById(R.id.iv_mv);
        CardView cardView = (CardView) view.findViewById(R.id.cv_album);
        cardView.post(new C8255b(this, cardView));
    }

    /* access modifiers changed from: private */
    /* renamed from: P3 */
    public /* synthetic */ void mo29964Q3(DialogInterface dialogInterface, int i) {
        C4477c.m19588N0(C8345u.m46327h(), C8287e.m45875w(), this);
    }

    /* access modifiers changed from: private */
    /* renamed from: S3 */
    public /* synthetic */ void mo29965T3(DialogInterface dialogInterface, int i) {
        C4477c.m19632m0(C8287e.m45875w(), this);
    }

    /* access modifiers changed from: private */
    /* renamed from: U3 */
    public /* synthetic */ void mo29966V3(CardView cardView) {
        int height = cardView.getHeight();
        int width = cardView.getWidth();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f34642u0.getLayoutParams();
        layoutParams.height = height;
        layoutParams.width = width;
        m45616a4();
    }

    /* access modifiers changed from: private */
    /* renamed from: W3 */
    public /* synthetic */ void mo29967X3() {
        List<C4348a> G = C8287e.m45782G();
        if (this.f34631j0 != null) {
            if (G == null || G.size() <= 0) {
                this.f34631j0.mo8864k();
                this.f34631j0.setTextColor(-1);
                this.f34638q0.mo8841A();
            } else {
                this.f34631j0.setLyricList(G);
                this.f34638q0.setLyricList(G);
                this.f34631j0.setTextColor(C8337n.m46065k0(C8345u.m46327h()).mo30114K());
                this.f34638q0.setTextColor(C8337n.m46065k0(C8345u.m46327h()).mo30114K());
            }
            this.f34631j0.setTextSize((float) C8337n.m46065k0(C8345u.m46327h()).mo30118L());
            this.f34638q0.setTextSize((float) C8337n.m46065k0(C8345u.m46327h()).mo30118L());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y3 */
    public /* synthetic */ void mo29968Z3(View view) {
        if (view.getId() == R.id.iv_favorite) {
            if (C8287e.m45873v() != null) {
                m45599F3();
            }
        } else if (view.getId() == R.id.iv_sound_effect) {
            if (C8287e.m45873v() != null) {
                m45628o4();
            }
        } else if (view.getId() == R.id.iv_add_to_playlist) {
            m45600G3();
        } else if (view.getId() == R.id.iv_option) {
            m45619d4();
        } else if (view.getId() == R.id.lrc) {
            m45601H3();
        } else if (view.getId() == R.id.iv_lyric_set) {
            m45617b4();
        } else if (view.getId() == R.id.iv_share) {
            m45627n4();
        } else if (view.getId() == R.id.iv_mv) {
            m45603J3();
        }
    }

    /* renamed from: a3 */
    private void m45615a3() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a4 */
    public void m45616a4() {
        this.f34625A0 = 1;
        AdHelper.m49536p().mo32450k(C8345u.m46327h(), this.f34642u0, 2, new C8271a());
    }

    /* renamed from: b4 */
    private void m45617b4() {
        C7227m0 m0Var = new C7227m0(mo3606L(), C8337n.m46065k0(C8345u.m46327h()).mo30118L(), C8337n.m46065k0(C8345u.m46327h()).mo30114K(), new C8273c());
        mo29969g4(m0Var.mo27775l());
        m0Var.mo27759j(this);
        m0Var.mo27743k(this.f34636o0);
    }

    /* renamed from: c4 */
    public static Fragment m45618c4() {
        return new C8270o();
    }

    /* renamed from: d4 */
    private void m45619d4() {
        C7229n0 n0Var = new C7229n0(mo3606L());
        n0Var.mo27777A();
        n0Var.mo27743k(this.f34634m0);
        n0Var.mo27759j(this);
    }

    /* renamed from: e4 */
    private void m45620e4(boolean z) {
        ViewAnimator viewAnimator;
        if (z && this.f34646y0 && (viewAnimator = this.f34640s0) != null && viewAnimator.getCurrentView().getId() != R.id.cv_ad) {
            new Handler().postDelayed(new C8260g(this), 800);
        }
    }

    /* renamed from: f4 */
    private void m45621f4() {
        int i = (int) (((double) C9566f.f36725a) * 0.85d);
        ViewGroup.LayoutParams layoutParams = this.f34594d0.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f34594d0.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f34641t0.getLayoutParams();
        layoutParams2.width = i;
        layoutParams2.height = i;
        this.f34641t0.setLayoutParams(layoutParams2);
    }

    /* renamed from: h4 */
    private void m45622h4(boolean z) {
        Context a0;
        m45624k4();
        if (z && (a0 = mo3651a0()) != null) {
            a0.sendBroadcast(new Intent("coocent.musiclibrary.music.utils.LyricUtils_SHOW_LOADING_LYRIC_TEXT"));
        }
        m45602I3();
    }

    /* access modifiers changed from: private */
    /* renamed from: i4 */
    public void m45623i4() {
        if (mo3606L() != null) {
            mo3606L().runOnUiThread(new C8261h(this));
        }
    }

    /* renamed from: k4 */
    private void m45624k4() {
        Music v = C8287e.m45873v();
        int i = 8;
        if (v != null) {
            ImageView imageView = this.f34627C0;
            if (v.mo9261a() == 7) {
                i = 0;
            }
            imageView.setVisibility(i);
            return;
        }
        this.f34627C0.setVisibility(8);
    }

    /* renamed from: l4 */
    private void m45625l4() {
        m45622h4(true);
        m45615a3();
        this.f34629h0 = new C8316h(this);
        m45621f4();
        m45602I3();
        m45605L3();
    }

    /* renamed from: m4 */
    private void m45626m4() {
        C8262i iVar = new C8262i(this);
        this.f34638q0.setOnPlayClickListener(new C8272b());
        this.f34628g0.setOnClickListener(iVar);
        this.f34632k0.setOnClickListener(iVar);
        this.f34633l0.setOnClickListener(iVar);
        this.f34634m0.setOnClickListener(iVar);
        this.f34635n0.setOnClickListener(iVar);
        this.f34636o0.setOnClickListener(iVar);
        this.f34637p0.setOnClickListener(iVar);
        this.f34627C0.setOnClickListener(iVar);
    }

    /* renamed from: n4 */
    private void m45627n4() {
        Music v = C8287e.m45873v();
        if (v == null) {
            return;
        }
        if (v.mo9261a() == 7) {
            C4477c.m19580J0(C8345u.m46327h(), C8287e.m45873v().mo9215k());
        } else {
            C4477c.m19578I0(C8345u.m46327h(), C8287e.m45873v().mo9215k());
        }
    }

    /* renamed from: o4 */
    private void m45628o4() {
        C8284c.m45737B(mo3651a0(), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: p4 */
    public void m45629p4() {
        ViewAnimator viewAnimator;
        Handler handler;
        if (mo3606L() != null && !mo3606L().isFinishing() && (viewAnimator = this.f34640s0) != null) {
            C7942a.m43547b(viewAnimator, C7942a.C7944b.RIGHT_LEFT);
            int i = this.f34643v0 + 1;
            this.f34643v0 = i;
            if (i < 1 && !this.f34644w0 && (handler = this.f34645x0) != null) {
                handler.postDelayed(new C8260g(this), 6000);
            }
        }
    }

    /* renamed from: A0 */
    public void mo26500A0() {
    }

    /* renamed from: B1 */
    public void mo26501B1() {
    }

    /* renamed from: C1 */
    public void mo3580C1() {
        super.mo3580C1();
        C8321j.m45995a(this.f34594d0);
        if (!(this.f34630i0 == null || mo3606L() == null)) {
            mo3606L().unregisterReceiver(this.f34630i0);
            this.f34630i0 = null;
        }
        Handler handler = this.f34645x0;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f34645x0 = null;
        }
    }

    /* renamed from: G */
    public void mo26503G() {
    }

    /* renamed from: M0 */
    public void mo26486M0() {
        super.mo26486M0();
    }

    /* renamed from: O */
    public void mo26505O(int i) {
        Context a0;
        if (this.f34628g0 != null && (a0 = mo3651a0()) != null) {
            if (i == -4) {
                C8344t.m46316d(a0, R.string.error);
            } else if (i == 2) {
                this.f34628g0.setImageResource(R.drawable.ic_play_page11);
                Toast.makeText(a0, a0.getResources().getString(R.string.remove_from_favorite), 0).show();
            } else if (i == 1) {
                this.f34628g0.setImageResource(R.drawable.ic_play_page11_on);
                Toast.makeText(a0, a0.getResources().getString(R.string.add_to_favorite), 0).show();
            }
            a0.sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.add_to_favorite_notifiy"));
            C8287e.m45820Z();
        }
    }

    /* renamed from: Q */
    public void mo26506Q() {
    }

    /* renamed from: Q1 */
    public void mo3623Q1() {
        super.mo3623Q1();
        m45623i4();
        m45620e4(true);
    }

    /* renamed from: Q2 */
    public void mo3624Q2(boolean z) {
        super.mo3624Q2(z);
        m45620e4(z);
    }

    /* renamed from: R */
    public void mo26507R() {
        mo29938Z2();
    }

    /* renamed from: U */
    public void mo26508U() {
    }

    /* renamed from: W0 */
    public void mo26509W0() {
    }

    /* renamed from: X */
    public void mo26510X(boolean z) {
        ImageView imageView = this.f34628g0;
        if (imageView == null) {
            return;
        }
        if (z) {
            imageView.setImageResource(R.drawable.ic_play_page11_on);
        } else {
            imageView.setImageResource(R.drawable.ic_play_page11);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y2 */
    public void mo29937Y2() {
        super.mo29937Y2();
        if (C8287e.m45873v() != null) {
            m45602I3();
        }
    }

    /* renamed from: b1 */
    public void mo26512b1() {
    }

    /* renamed from: e0 */
    public void mo26513e0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f3 */
    public void mo29939f3() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g3 */
    public void mo29940g3() {
        if (this.f34646y0) {
            m45629p4();
        }
    }

    /* renamed from: g4 */
    public void mo29969g4(ImageView imageView) {
        if (imageView != null) {
            if (C8287e.m45873v() != null) {
                C8321j.m45999e(C8314f.m45973b(C8345u.m46327h(), 0, C8287e.m45873v().mo9215k(), C8287e.m45859o()), R.drawable.home_intermediate1_speaker04_01, imageView, 50, 10);
            } else {
                C8321j.m45999e(BuildConfig.FLAVOR, R.drawable.home_intermediate1_speaker04_01, imageView, 50, 10);
            }
            imageView.setAlpha(C8343s.m46297e().mo27068a());
        }
    }

    /* renamed from: i1 */
    public void mo26514i1() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: i3 */
    public void mo29941i3() {
        super.mo29941i3();
    }

    /* renamed from: j0 */
    public void mo26493j0(boolean z) {
        super.mo26493j0(z);
        m45622h4(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j3 */
    public void mo29942j3() {
        super.mo29942j3();
        m45624k4();
        this.f34628g0.setImageResource(R.drawable.home_button08_favorite);
    }

    /* renamed from: j4 */
    public void mo29970j4() {
        if (C8287e.m45782G() == null || C8287e.m45782G().size() <= 0) {
            this.f34631j0.mo8864k();
            return;
        }
        long r = (long) (C8287e.m45865r() * 1000.0d);
        long u = (long) (C8287e.m45871u() * 1000.0d);
        if (this.f34631j0.getVisibility() == 0) {
            this.f34631j0.mo8865n(r, u);
        }
        if (this.f34638q0.getVisibility() == 0) {
            this.f34638q0.mo8842F(r, u);
        }
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
    /* renamed from: p3 */
    public void mo29944p3() {
        super.mo29944p3();
        m45624k4();
    }

    /* renamed from: r1 */
    public void mo26518r1() {
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_image2_1, (ViewGroup) null);
        m45607N3(inflate);
        mo29943l3(inflate);
        m45604K3();
        m45625l4();
        m45626m4();
        return inflate;
    }

    /* renamed from: x0 */
    public void mo9270x0(boolean z) {
        if (z) {
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.parser_lyric"));
        }
    }

    /* renamed from: x1 */
    public void mo26519x1(float f) {
        if (mo3606L() != null) {
            WindowManager.LayoutParams attributes = mo3606L().getWindow().getAttributes();
            attributes.alpha = f;
            mo3606L().getWindow().setAttributes(attributes);
        }
    }

    /* renamed from: y1 */
    public void mo26520y1() {
    }
}
