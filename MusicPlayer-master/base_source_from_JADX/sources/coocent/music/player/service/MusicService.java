package coocent.music.player.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.p001v4.media.MediaBrowserCompat;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;
import androidx.media.MediaBrowserServiceCompat;
import com.bumptech.glide.C1719b;
import com.bumptech.glide.p047q.C2153h;
import com.bumptech.glide.p047q.p048l.C2164g;
import com.bumptech.glide.p047q.p049m.C2172b;
import com.coocent.music.base.data.entity.Music;
import com.coocent.musiceffect.service.SoundEffectService;
import coocent.music.player.activity.LibraryActivity;
import coocent.music.player.activity.ScreenLockActivity;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.widget.desktop.Widget2x2Grid;
import coocent.music.player.widget.desktop.Widget4x1;
import coocent.music.player.widget.desktop.Widget4x4Grid;
import coocent.musiclibrary.music.p289g.C7366c;
import coocent.musiclibrary.music.p290h.C7367a;
import coocent.musiclibrary.music.p290h.C7368b;
import coocent.musiclibrary.music.p290h.C7369c;
import coocent.musiclibrary.music.p292j.C7393h;
import coocent.musiclibrary.music.p292j.C7398k;
import coocent.musiclibrary.music.p292j.C7401l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.p461z.C9566f;
import p159f.p166c.p177d.C4341a;
import p159f.p166c.p177d.p178h.C4348a;
import p159f.p166c.p177d.p179i.C4350a;
import p159f.p166c.p177d.p180j.C4359c;
import p159f.p166c.p181e.p182a.p183a.p189f.C4442f;
import p159f.p166c.p181e.p182a.p190b.p192i.C4461a;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p159f.p166c.p181e.p182a.p190b.p197l.C4482f;
import p342g.p343a.p344a.p346c.C7958k;
import p342g.p343a.p344a.p346c.C7965r;
import p342g.p343a.p344a.p346c.C7969v;
import p342g.p343a.p344a.p347d.C7973c;
import p342g.p343a.p344a.p355g.C8284c;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8311c;
import p342g.p343a.p344a.p358i.C8314f;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8338o;
import p342g.p343a.p344a.p358i.C8342r;
import p342g.p343a.p344a.p358i.C8345u;
import p369i.C8446k;

public class MusicService extends SoundEffectService implements C7965r, C7969v, C7368b, C7401l, C7369c.C7370a {

    /* renamed from: S */
    public static int f31280S;

    /* renamed from: A */
    private Widget2x2Grid f31281A;

    /* renamed from: B */
    private Widget4x1 f31282B;

    /* renamed from: C */
    private boolean f31283C = true;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public long f31284D;

    /* renamed from: E */
    private int f31285E;

    /* renamed from: F */
    private HeadSetReceiver f31286F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public AudioManager f31287G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public int f31288H;

    /* renamed from: I */
    private Timer f31289I;

    /* renamed from: J */
    private TimerTask f31290J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public C7071g f31291K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C7367a f31292L;

    /* renamed from: M */
    List<C7401l> f31293M = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: N */
    public C8446k<Boolean, Boolean> f31294N;

    /* renamed from: O */
    private boolean f31295O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public int f31296P;

    /* renamed from: Q */
    private C7369c f31297Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public boolean f31298R;

    /* renamed from: w */
    private C7069e f31299w;

    /* renamed from: x */
    public C7064c f31300x = new C7064c();

    /* renamed from: y */
    private C7973c f31301y;

    /* renamed from: z */
    private Widget4x4Grid f31302z;

    public class HeadSetReceiver extends BroadcastReceiver {
        public HeadSetReceiver() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void mo27126b() {
            MusicService.this.m40230c1();
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                try {
                    new Handler().postDelayed(new C7077c(this), 2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                MusicService.this.m40259z1();
            } else if (!action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                if ("android.intent.action.HEADSET_PLUG".equals(action)) {
                    if (!intent.hasExtra("state")) {
                        return;
                    }
                    if (intent.getIntExtra("state", 0) == 0) {
                        MusicService.this.m40257y1();
                    } else if (intent.getIntExtra("state", 0) == 1) {
                        MusicService.this.m40259z1();
                    }
                } else if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
                    intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0);
                }
            }
        }
    }

    /* renamed from: coocent.music.player.service.MusicService$a */
    class C7062a extends C2164g<Drawable> {
        C7062a() {
        }

        /* renamed from: d */
        public void mo8222c(Drawable drawable, C2172b<? super Drawable> bVar) {
            MusicService.this.m40200E1(((BitmapDrawable) drawable).getBitmap());
        }

        /* renamed from: f */
        public void mo8430f(Drawable drawable) {
            super.mo8430f(drawable);
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable != null) {
                MusicService.this.m40200E1(bitmapDrawable.getBitmap());
            }
        }
    }

    /* renamed from: coocent.music.player.service.MusicService$b */
    class C7063b extends TimerTask {

        /* renamed from: g */
        final /* synthetic */ Handler f31305g;

        C7063b(Handler handler) {
            this.f31305g = handler;
        }

        public void run() {
            MusicService.this.mo27107a1(this.f31305g);
        }
    }

    /* renamed from: coocent.music.player.service.MusicService$c */
    public class C7064c extends Binder {

        /* renamed from: g */
        public List<C4348a> f31307g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public Music f31308h = null;

        /* renamed from: i */
        private List<Music> f31309i = new ArrayList();

        /* renamed from: j */
        private final List<Music> f31310j = new ArrayList();

        /* renamed from: k */
        private long[] f31311k = new long[0];

        /* renamed from: l */
        private int f31312l = 0;

        /* renamed from: m */
        private int f31313m = 1;

        /* renamed from: n */
        private int f31314n = 0;

        /* renamed from: o */
        private int f31315o = 0;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public final List<C7958k> f31316p = new ArrayList();

        /* renamed from: q */
        private int f31317q;

        /* renamed from: r */
        private boolean f31318r = false;

        /* renamed from: s */
        private boolean f31319s;

        /* renamed from: t */
        private List<Music> f31320t = new ArrayList();

        /* renamed from: u */
        private boolean f31321u;

        /* renamed from: v */
        private int f31322v;

        /* renamed from: w */
        private List<Music> f31323w;

        /* renamed from: x */
        private int f31324x = BaseApplication.f31151o;
        /* access modifiers changed from: private */

        /* renamed from: y */
        public boolean f31325y = false;

        /* renamed from: coocent.music.player.service.MusicService$c$a */
        class C7065a implements C4482f.C4483a {
            C7065a() {
            }

            /* renamed from: f */
            public void mo15192f() {
                MusicService.this.mo9539f0();
            }

            /* renamed from: g */
            public void mo15193g(float f) {
                if (MusicService.this.f31292L != null) {
                    MusicService.this.f31292L.mo28140p(f);
                }
            }
        }

        /* renamed from: coocent.music.player.service.MusicService$c$b */
        class C7066b implements C4482f.C4483a {
            C7066b() {
            }

            /* renamed from: f */
            public void mo15192f() {
                C7064c.this.m40313m();
                MusicService.this.mo9539f0();
            }

            /* renamed from: g */
            public void mo15193g(float f) {
                if (MusicService.this.f31292L != null) {
                    MusicService.this.f31292L.mo28140p(f);
                }
            }
        }

        /* renamed from: coocent.music.player.service.MusicService$c$c */
        class C7067c implements C4350a {
            C7067c() {
            }

            /* renamed from: a */
            public boolean mo14764a() {
                C7064c cVar = MusicService.this.f31300x;
                return cVar != null && cVar.mo27162Q();
            }

            /* renamed from: b */
            public List<C4348a> mo14765b() {
                C7064c cVar = MusicService.this.f31300x;
                return cVar == null ? new ArrayList() : cVar.f31307g;
            }

            /* renamed from: c */
            public void mo14766c() {
                Intent intent = new Intent(MusicService.this, LibraryActivity.class);
                intent.setFlags(268435456);
                MusicService.this.startActivity(intent);
            }

            /* renamed from: d */
            public long mo14767d() {
                C7064c cVar = MusicService.this.f31300x;
                if (cVar != null) {
                    return ((long) cVar.mo27198r()) * 1000;
                }
                return 0;
            }

            /* renamed from: e */
            public int mo14768e() {
                return C8337n.m46065k0(C8345u.m46327h()).mo30114K();
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
                r0 = r0.mo27200s();
             */
            /* renamed from: f */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.String mo14769f() {
                /*
                    r1 = this;
                    coocent.music.player.service.MusicService$c r0 = coocent.music.player.service.MusicService.C7064c.this
                    coocent.music.player.service.MusicService r0 = coocent.music.player.service.MusicService.this
                    coocent.music.player.service.MusicService$c r0 = r0.f31300x
                    if (r0 == 0) goto L_0x0013
                    com.coocent.music.base.data.entity.Music r0 = r0.mo27200s()
                    if (r0 == 0) goto L_0x0013
                    java.lang.String r0 = r0.mo9218n()
                    return r0
                L_0x0013:
                    java.lang.String r0 = ""
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: coocent.music.player.service.MusicService.C7064c.C7067c.mo14769f():java.lang.String");
            }

            /* renamed from: g */
            public long mo14770g() {
                C7064c cVar = MusicService.this.f31300x;
                if (cVar == null || cVar.mo27209x() == null) {
                    return 0;
                }
                return (long) (MusicService.this.f31300x.mo27209x().mo28127f() * 1000.0d);
            }

            /* renamed from: h */
            public String mo14771h() {
                return "coocent.musiclibrary.music.utils.LyricUtils_UPDATE_REPLACE_LYRIC";
            }

            /* renamed from: i */
            public void mo14772i() {
                C8337n.m46065k0(MusicService.this).mo30128N1(false);
                MusicService.this.mo27104U1();
                C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.desktop_lyric_action_close"));
            }

            /* renamed from: j */
            public void mo14773j(float f) {
                C8337n.m46065k0(MusicService.this).mo30140Q1((int) f);
            }

            /* renamed from: k */
            public String mo14774k() {
                return "media.musicplayer.audioplayer.videoplayer.music_change_update_title";
            }

            /* renamed from: l */
            public void mo14775l(boolean z) {
                C7064c cVar = MusicService.this.f31300x;
                if (cVar == null) {
                    return;
                }
                if (z) {
                    cVar.mo27173Y();
                } else {
                    cVar.mo27174Z();
                }
            }

            /* renamed from: m */
            public String mo14776m() {
                return "media.musicplayer.audioplayer.videoplayer.music_change_update_state";
            }

            /* renamed from: n */
            public float mo14777n() {
                return (float) C8337n.m46065k0(C8345u.m46327h()).mo30118L();
            }

            /* renamed from: o */
            public void mo14778o() {
                C8337n.m46065k0(MusicService.this).mo30132O1(true);
                MusicService.this.mo27104U1();
            }

            /* renamed from: p */
            public void mo14779p(int i) {
                C8337n.m46065k0(MusicService.this).mo30136P1(i);
            }

            /* renamed from: q */
            public void mo14780q() {
                C7064c cVar = MusicService.this.f31300x;
                if (cVar == null) {
                    return;
                }
                if (cVar.mo27162Q()) {
                    MusicService.this.f31300x.mo27171W();
                } else {
                    MusicService.this.f31300x.mo27172X();
                }
            }
        }

        public C7064c() {
        }

        /* renamed from: S */
        private void m40302S(int i, List<Music> list, boolean z) {
            int i2 = z ? i + 1 : i - 1;
            if (i2 >= 0 && i2 < list.size()) {
                mo27169U(i2, list);
            } else if (mo27140F() == 5 && list.size() > 0) {
                mo27169U(Math.abs(list.size() % i2), list);
            } else if (!m40314u() || list.size() <= 0) {
                MusicService.this.sendBroadcast(new Intent(C8311c.f34738e));
                MusicService.this.mo27104U1();
                if (z) {
                    Toast.makeText(C8345u.m46327h(), R.string.last_music, 0).show();
                } else {
                    Toast.makeText(C8345u.m46327h(), R.string.first_music, 0).show();
                }
            } else {
                mo27169U(0, list);
                mo27188l0(false);
            }
        }

        /* renamed from: f */
        private void m40308f(int i, List<Music> list, boolean z) {
            try {
                if (mo27146I().size() > 0 && ((mo27140F() == 4 || mo27140F() == 5 || (mo27140F() == 6 && !MusicService.this.f31298R)) && !mo27158O())) {
                    m40311i0(m40310i(i, mo27146I()), mo27146I().get(mo27194p()), 1, z);
                } else if (((MusicService.this.f31300x.mo27140F() != 3 || !MusicService.this.f31298R) && (mo27140F() != 6 || !MusicService.this.f31298R)) || mo27158O()) {
                    m40311i0(m40310i(i, list), list.get(mo27194p()), 0, z);
                } else if (mo27144H().size() > 0 && mo27136D() == 0) {
                    m40311i0(m40310i(i, mo27144H()), mo27144H().get(mo27194p()), 0, z);
                } else if (mo27146I().size() > 0 && mo27136D() == 1) {
                    m40311i0(m40310i(i, mo27146I()), mo27146I().get(mo27194p()), 1, z);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: g */
        private void m40309g(int i, List<Music> list, boolean z, boolean z2) {
            if (list != null && list.size() > 0) {
                if (z2) {
                    MusicService.this.m40225V0(list, mo27154M(list));
                }
                mo27185j0(i);
                m40308f(i, list, z);
            }
        }

        /* renamed from: i */
        private int m40310i(int i, List<Music> list) {
            if (mo27194p() < list.size() && mo27194p() >= 0) {
                return i;
            }
            mo27185j0(0);
            return 0;
        }

        /* renamed from: i0 */
        private void m40311i0(int i, Music music, int i2, boolean z) {
            mo27187k0(music);
            mo27197q0(i2);
            if (z) {
                try {
                    MusicService.this.m40255x1(music);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public void m40312l(boolean z) {
            List<Music> H = mo27144H();
            if (H != null && H.size() > 0) {
                if (z) {
                    mo27212y0(mo27144H());
                    Collections.shuffle(mo27146I());
                    if (this.f31316p != null) {
                        for (int i = 0; i < this.f31316p.size(); i++) {
                            if (this.f31316p.get(i) != null) {
                                this.f31316p.get(i).mo26499u1();
                            }
                        }
                    }
                } else if (this.f31310j.size() == 0) {
                    mo27212y0(mo27144H());
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public void m40313m() {
            if (MusicService.this.f31292L != null) {
                MusicService.this.f31292L.mo28132k();
            }
        }

        /* renamed from: u */
        private boolean m40314u() {
            return this.f31319s;
        }

        /* renamed from: A */
        public int mo27130A() {
            if (MusicService.this.f31287G != null) {
                MusicService musicService = MusicService.this;
                AudioManager unused = musicService.f31287G = (AudioManager) musicService.getSystemService("audio");
            }
            return MusicService.this.f31287G.getStreamVolume(3);
        }

        /* renamed from: A0 */
        public void mo27131A0(float f) {
        }

        /* renamed from: B */
        public int mo27132B() {
            return MusicService.this.f31288H;
        }

        /* renamed from: B0 */
        public void mo27133B0(int i) {
            this.f31322v = i;
        }

        /* renamed from: C */
        public List<Music> mo27134C() {
            int D = mo27136D();
            if (D == 0) {
                return mo27144H();
            }
            if (D == 1) {
                return mo27146I();
            }
            return null;
        }

        /* renamed from: C0 */
        public void mo27135C0(boolean z) {
            this.f31321u = z;
        }

        /* renamed from: D */
        public int mo27136D() {
            return this.f31317q;
        }

        /* renamed from: D0 */
        public void mo27137D0(float f) {
            C8337n.m46065k0(C8345u.m46327h()).mo30089D2(f);
        }

        /* renamed from: E */
        public int mo27138E() {
            return this.f31315o;
        }

        /* renamed from: E0 */
        public void mo27139E0(C7401l lVar) {
            MusicService.this.f31293M.add(lVar);
        }

        /* renamed from: F */
        public int mo27140F() {
            return this.f31313m;
        }

        /* renamed from: F0 */
        public void mo27141F0(int i) {
            if (MusicService.this.f31287G != null) {
                try {
                    MusicService.this.f31287G.setStreamVolume(3, i, 0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        /* renamed from: G */
        public int mo27142G() {
            return this.f31314n;
        }

        /* renamed from: G0 */
        public void mo27143G0(float f) {
            C8337n.m46065k0(C8345u.m46327h()).mo30125M2(f);
        }

        /* renamed from: H */
        public List<Music> mo27144H() {
            return this.f31309i;
        }

        /* renamed from: H0 */
        public void mo27145H0(C8446k<Boolean, Boolean> kVar) {
            C8446k unused = MusicService.this.f31294N = kVar;
        }

        /* renamed from: I */
        public List<Music> mo27146I() {
            return this.f31310j;
        }

        /* renamed from: I0 */
        public void mo27147I0(float f) {
            if (MusicService.this.f31300x.mo27209x() != null) {
                MusicService.this.f31300x.mo27209x().mo28140p(f);
            }
        }

        /* renamed from: J */
        public int mo27148J() {
            return this.f31322v;
        }

        /* renamed from: J0 */
        public void mo27149J0(float f) {
            if (f <= 100.0f) {
                mo27141F0((int) (((double) ((((float) mo27132B()) * f) / 100.0f)) + 0.5d));
                MusicService.this.m40198D1();
                return;
            }
            mo27141F0((int) (((double) ((float) mo27132B())) + 0.5d));
            C8284c.m45758u((int) (f / 2.0f));
            C8284c.m45751n(C8345u.m46327h(), ((int) f) / 2);
        }

        /* renamed from: K */
        public List<Music> mo27150K() {
            return this.f31320t;
        }

        /* renamed from: K0 */
        public void mo27151K0(boolean z) {
            this.f31325y = z;
        }

        /* renamed from: L */
        public boolean mo27152L() {
            return this.f31321u;
        }

        /* renamed from: L0 */
        public void mo27153L0() {
            MusicService musicService = MusicService.this;
            C4341a.m18954d(musicService, C8337n.m46065k0(musicService).mo30110J(), new C7067c());
        }

        /* renamed from: M */
        public long[] mo27154M(List<Music> list) {
            long[] jArr = new long[list.size()];
            for (int i = 0; i < list.size(); i++) {
                jArr[i] = list.get(i).mo9215k();
            }
            return jArr;
        }

        /* renamed from: M0 */
        public void mo27155M0(Long l) {
            C7398k.m41739d(l.longValue(), MusicService.this);
        }

        /* renamed from: N */
        public void mo27156N() {
            C4341a.m18952b();
        }

        /* renamed from: N0 */
        public void mo27157N0() {
            if (MusicService.this.f31292L != null) {
                MusicService.this.f31292L.mo28141q();
                MusicService.this.mo27104U1();
            }
        }

        /* renamed from: O */
        public boolean mo27158O() {
            return this.f31318r;
        }

        /* renamed from: O0 */
        public void mo27159O0() {
            C7398k.m41740e();
        }

        /* renamed from: P */
        public boolean mo27160P() {
            return MusicService.this.f31292L == null || MusicService.this.f31292L.mo28129h();
        }

        /* renamed from: P0 */
        public void mo27161P0() {
            C4341a.m18955e();
        }

        /* renamed from: Q */
        public boolean mo27162Q() {
            return MusicService.this.f31292L != null && MusicService.this.f31292L.mo28130i();
        }

        /* renamed from: Q0 */
        public void mo27163Q0(int i, float f) {
        }

        /* renamed from: R */
        public boolean mo27164R() {
            if (MusicService.this.f31292L != null) {
                return MusicService.this.f31292L.mo28131j();
            }
            return false;
        }

        /* renamed from: R0 */
        public void mo27165R0() {
        }

        /* renamed from: S0 */
        public void mo27166S0() {
            MusicService.this.mo27101P1();
        }

        /* renamed from: T */
        public void mo27167T() {
            MusicService.this.m40206I1();
        }

        /* renamed from: T0 */
        public void mo27168T0() {
            MusicService.this.mo27102Q1();
        }

        /* renamed from: U */
        public void mo27169U(int i, List<Music> list) {
            m40309g(i, list, true, true);
        }

        /* renamed from: V */
        public List<C4348a> mo27170V(Context context, String str, long j, String str2) {
            List<C4348a> f = C4359c.m19015f(context, j, str2, str);
            this.f31307g = f;
            return f;
        }

        /* renamed from: W */
        public void mo27171W() {
            if (MusicService.this.f31292L != null && MusicService.this.f31292L.mo28130i()) {
                if (C8337n.m46065k0(MusicService.this).mo30154U() && MusicService.f31280S != 1) {
                    C4482f.m19680c().mo15190b(new C7066b());
                } else if (MusicService.this.f31292L != null) {
                    MusicService.this.f31292L.mo28140p(1.0f);
                    m40313m();
                    MusicService.this.mo9539f0();
                }
            }
        }

        /* renamed from: X */
        public void mo27172X() {
            if (MusicService.this.f31292L != null && MusicService.this.f31292L.mo28129h()) {
                try {
                    if (C8337n.m46065k0(MusicService.this).mo30154U()) {
                        C4482f.m19680c().mo15189a(new C7065a());
                    } else if (MusicService.this.f31292L != null) {
                        MusicService.this.f31292L.mo28140p(1.0f);
                    }
                    if (MusicService.this.f31292L != null) {
                        MusicService.this.f31292L.mo28133l(false);
                    }
                    MusicService.this.mo9539f0();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        /* renamed from: Y */
        public void mo27173Y() {
            Boolean bool = (Boolean) MusicService.this.f31294N.getSecond();
            if (!((Boolean) MusicService.this.f31294N.getFirst()).booleanValue() || !bool.booleanValue()) {
                if (mo27144H() != null) {
                    if (MusicService.this.f31300x.mo27140F() == 1) {
                        m40302S(mo27194p(), mo27144H(), true);
                    } else if (MusicService.this.f31300x.mo27140F() == 2 || (MusicService.this.f31300x.mo27140F() == 3 && !MusicService.this.f31298R)) {
                        if (MusicService.this.f31300x.mo27194p() >= mo27144H().size() - 1) {
                            mo27169U(0, mo27144H());
                        } else {
                            m40302S(mo27194p(), mo27144H(), true);
                        }
                    } else if ((MusicService.this.f31300x.mo27140F() != 3 || !MusicService.this.f31298R) && (MusicService.this.f31300x.mo27140F() != 6 || !MusicService.this.f31298R)) {
                        if (MusicService.this.f31300x.mo27140F() == 4) {
                            m40302S(mo27194p(), mo27144H(), true);
                        } else if (MusicService.this.f31300x.mo27140F() == 5 || (MusicService.this.f31300x.mo27140F() == 6 && !MusicService.this.f31298R)) {
                            m40302S(mo27194p(), mo27144H(), true);
                        }
                    } else if (!m40314u()) {
                        mo27169U(mo27194p(), mo27144H());
                    } else {
                        mo27169U(mo27194p() + 1, mo27144H());
                        mo27188l0(false);
                    }
                }
                if (MusicService.this.f31300x.mo27200s() != null) {
                    C7393h.m41695f(C8345u.m46327h()).mo28192n(MusicService.this.f31300x.mo27200s().mo9215k());
                    return;
                }
                return;
            }
            m40313m();
            MusicService.this.mo27104U1();
            MusicService musicService = MusicService.this;
            Boolean bool2 = Boolean.FALSE;
            C8446k unused = musicService.f31294N = new C8446k(bool2, bool2);
            C7393h.m41695f(MusicService.this).mo28190l(C8287e.m45865r());
            C7393h.m41695f(MusicService.this).mo28191m(C8287e.m45871u());
        }

        /* renamed from: Z */
        public void mo27174Z() {
            if (mo27144H() != null && mo27144H().size() >= 0) {
                if (MusicService.this.f31300x.mo27140F() == 1) {
                    m40302S(mo27194p(), mo27144H(), false);
                } else if (MusicService.this.f31300x.mo27140F() == 2 || (MusicService.this.f31300x.mo27140F() == 3 && !MusicService.this.f31298R)) {
                    if (MusicService.this.f31300x.mo27194p() == 0) {
                        mo27169U(mo27144H().size() - 1, mo27144H());
                    } else {
                        m40302S(mo27194p(), mo27144H(), false);
                    }
                } else if (MusicService.this.f31300x.mo27140F() == 3 && MusicService.this.f31298R) {
                    mo27169U(mo27194p(), mo27144H());
                } else if (MusicService.this.f31300x.mo27140F() == 4) {
                    m40302S(mo27194p(), mo27144H(), false);
                } else if (MusicService.this.f31300x.mo27140F() == 5 || (MusicService.this.f31300x.mo27140F() == 6 && !MusicService.this.f31298R)) {
                    m40302S(mo27194p(), mo27144H(), false);
                }
            }
        }

        /* renamed from: a0 */
        public void mo27175a0() {
            if (MusicService.f31280S != 0) {
                return;
            }
            if (mo27194p() < 0 || mo27194p() >= mo27134C().size()) {
                MusicService.f31280S = 2;
            } else if (MusicService.this.f31284D == mo27134C().get(mo27194p()).mo9215k()) {
                MusicService.f31280S = 1;
                try {
                    MusicService.this.m40255x1(mo27134C().get(mo27194p()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                MusicService.f31280S = 2;
            }
        }

        /* renamed from: b0 */
        public void mo27176b0(C7958k kVar) {
            this.f31316p.remove(kVar);
        }

        /* renamed from: c0 */
        public void mo27177c0(C7401l lVar) {
            MusicService.this.f31293M.remove(lVar);
        }

        /* renamed from: d0 */
        public void mo27178d0() {
        }

        /* renamed from: e0 */
        public void mo27179e0() {
        }

        /* renamed from: f0 */
        public void mo27180f0() {
        }

        /* renamed from: g0 */
        public void mo27181g0(int i) {
            if (MusicService.this.f31292L != null) {
                MusicService.this.f31292L.mo28134m((long) i);
            }
        }

        /* renamed from: h */
        public void mo27182h(int i, List<Music> list, boolean z) {
            m40309g(i, list, false, z);
        }

        /* renamed from: h0 */
        public void mo27183h0(boolean z) {
            this.f31318r = z;
        }

        /* renamed from: j */
        public void mo27184j() {
            if (mo27144H() != null && mo27144H().size() > 0) {
                mo27144H().clear();
            }
        }

        /* renamed from: j0 */
        public void mo27185j0(int i) {
            this.f31312l = i;
        }

        /* renamed from: k */
        public void mo27186k() {
            if (mo27146I() != null && mo27146I().size() > 0) {
                mo27146I().clear();
            }
        }

        /* renamed from: k0 */
        public void mo27187k0(Music music) {
            this.f31308h = music;
        }

        /* renamed from: l0 */
        public void mo27188l0(boolean z) {
            this.f31319s = z;
        }

        /* renamed from: m0 */
        public void mo27189m0(int i) {
            this.f31324x = i;
        }

        /* renamed from: n */
        public long mo27190n() {
            if (mo27200s() == null) {
                return 0;
            }
            return mo27200s().mo9205d();
        }

        /* renamed from: n0 */
        public void mo27191n0(List<Music> list) {
            if (this.f31323w == null) {
                this.f31323w = new ArrayList();
            }
            this.f31323w.clear();
            this.f31323w.addAll(list);
        }

        /* renamed from: o */
        public String mo27192o() {
            return mo27200s() == null ? "Unknow Artist" : mo27200s().mo9210g();
        }

        /* renamed from: o0 */
        public void mo27193o0(long[] jArr) {
            this.f31311k = jArr;
        }

        /* renamed from: p */
        public int mo27194p() {
            return this.f31312l;
        }

        /* renamed from: p0 */
        public List<C7958k> mo27195p0(C7958k kVar) {
            this.f31316p.add(kVar);
            return this.f31316p;
        }

        /* renamed from: q */
        public double mo27196q() {
            if (MusicService.this.f31292L == null) {
                return 0.0d;
            }
            double f = MusicService.this.f31292L.mo28127f();
            if (f > mo27198r()) {
                return 0.0d;
            }
            return f;
        }

        /* renamed from: q0 */
        public void mo27197q0(int i) {
            this.f31317q = i;
        }

        /* renamed from: r */
        public double mo27198r() {
            try {
                C7064c cVar = MusicService.this.f31300x;
                if (cVar == null || cVar.mo27200s() == null) {
                    return 0.0d;
                }
                return ((double) MusicService.this.f31300x.mo27200s().mo9214j()) / 1000.0d;
            } catch (Exception e) {
                e.printStackTrace();
                return 0.0d;
            }
        }

        /* renamed from: r0 */
        public void mo27199r0(float f) {
            MusicService.this.f31300x.mo27209x();
        }

        /* renamed from: s */
        public Music mo27200s() {
            return this.f31308h;
        }

        /* renamed from: s0 */
        public void mo27201s0(int i, float f) {
        }

        /* renamed from: t */
        public String mo27202t() {
            return mo27200s() == null ? "Unknow Track" : mo27200s().mo9218n();
        }

        /* renamed from: t0 */
        public void mo27203t0(float f) {
        }

        /* renamed from: u0 */
        public void mo27204u0(int i) {
            this.f31315o = i;
        }

        /* renamed from: v */
        public int mo27205v() {
            return this.f31324x;
        }

        /* renamed from: v0 */
        public void mo27206v0(int i) {
            if (this.f31313m == 5 && i != 5) {
                try {
                    List<Music> H = mo27144H();
                    if (H != null && H.size() > 0) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= H.size()) {
                                break;
                            } else if (C8287e.m45873v().mo9215k() == H.get(i2).mo9215k()) {
                                mo27185j0(i2);
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                C7064c cVar = MusicService.this.f31300x;
                if (cVar != null) {
                    cVar.mo27197q0(0);
                }
            }
            this.f31313m = i;
            if (this.f31316p != null) {
                for (int i3 = 0; i3 < this.f31316p.size(); i3++) {
                    if (this.f31316p.get(i3) != null) {
                        this.f31316p.get(i3).mo26485A1(this.f31313m);
                    }
                }
            }
        }

        /* renamed from: w */
        public List<Music> mo27207w() {
            return this.f31323w;
        }

        /* renamed from: w0 */
        public void mo27208w0(int i) {
            this.f31314n = i;
        }

        /* renamed from: x */
        public C7367a mo27209x() {
            return MusicService.this.f31292L;
        }

        /* renamed from: x0 */
        public void mo27210x0(List<Music> list) {
            this.f31309i = list;
        }

        /* renamed from: y */
        public long[] mo27211y() {
            return this.f31311k;
        }

        /* renamed from: y0 */
        public void mo27212y0(List<Music> list) {
            this.f31310j.clear();
            this.f31310j.addAll(list);
        }

        /* renamed from: z */
        public List<C4348a> mo27213z() {
            return this.f31307g;
        }

        /* renamed from: z0 */
        public void mo27214z0(float f) {
        }
    }

    /* renamed from: coocent.music.player.service.MusicService$d */
    public class C7068d extends PhoneStateListener {

        /* renamed from: a */
        private boolean f31330a = false;

        public C7068d() {
        }

        /* renamed from: a */
        private void m40421a() {
            C7064c cVar = MusicService.this.f31300x;
            if (cVar != null && cVar.mo27162Q()) {
                this.f31330a = true;
                MusicService.this.f31300x.mo27171W();
            }
        }

        /* renamed from: b */
        private void m40422b() {
            C7064c cVar = MusicService.this.f31300x;
            if (cVar != null && cVar.mo27160P() && this.f31330a) {
                this.f31330a = false;
                MusicService.this.f31300x.mo27172X();
            }
        }

        public void onCallStateChanged(int i, String str) {
            super.onCallStateChanged(i, str);
            if (i == 0) {
                m40422b();
            } else if (i == 1) {
                m40421a();
            } else if (i == 2) {
                m40421a();
            }
        }
    }

    /* renamed from: coocent.music.player.service.MusicService$e */
    private class C7069e extends BroadcastReceiver {
        private C7069e() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                char c = 65535;
                switch (action.hashCode()) {
                    case -2128145023:
                        if (action.equals("android.intent.action.SCREEN_OFF")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -2127113824:
                        if (action.equals("media.musicplayer.audioplayer.videoplayer.toggle.openMusic.pause.action")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1940635523:
                        if (action.equals("android.media.VOLUME_CHANGED_ACTION")) {
                            c = 10;
                            break;
                        }
                        break;
                    case -1638257612:
                        if (action.equals("media.musicplayer.audioplayer.videoplayer.desktop_lyric_action")) {
                            c = 8;
                            break;
                        }
                        break;
                    case -1552997131:
                        if (action.equals("media.musicplayer.audioplayer.videoplayer.sensor_share")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1546763265:
                        if (action.equals("media.musicplayer.audioplayer.videoplayer.update_widget")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -1028213598:
                        if (action.equals("media.musicplayer.audioplayer.videoplayer.desktop_un_lock_lyric_action")) {
                            c = 9;
                            break;
                        }
                        break;
                    case -527218796:
                        if (action.equals("media.musicplayer.audioplayer.videoplayer.notification_clear")) {
                            c = 12;
                            break;
                        }
                        break;
                    case -462410905:
                        if (action.equals("media.musicplayer.audioplayer.videoplayer.notify_add_to_favorite")) {
                            c = 11;
                            break;
                        }
                        break;
                    case -258348501:
                        if (action.equals("media.musicplayer.audioplayer.videoplayer.prve.openMusic.action")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -87637478:
                        if (action.equals("media.musicplayer.audioplayer.videoplayer.parser_lyric")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 125494578:
                        if (action.equals("media.musicplayer.audioplayer.videoplayer.WAKEUP.EXIT")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 873537449:
                        if (action.equals("media.musicplayer.audioplayer.videoplayer.next.openMusic.action")) {
                            c = 1;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        MusicService musicService = MusicService.this;
                        C7064c cVar = musicService.f31300x;
                        if (cVar != null) {
                            musicService.mo27103T1(cVar.mo27194p(), MusicService.this.f31300x.mo27134C());
                            MusicService.this.m40253w1();
                            return;
                        }
                        return;
                    case 1:
                        MusicService.this.m40220R1();
                        MusicService.this.m40253w1();
                        return;
                    case 2:
                        MusicService.this.m40222S1();
                        MusicService.this.m40253w1();
                        return;
                    case 3:
                        MusicService.this.m40234g1();
                        return;
                    case 4:
                        MusicService.this.m40228Z0();
                        return;
                    case 5:
                        if (C8337n.m46065k0(C8345u.m46327h()).mo30232n0()) {
                            MusicService.this.m40208J1();
                            return;
                        }
                        return;
                    case 6:
                        MusicService.this.mo27104U1();
                        return;
                    case 7:
                        MusicService.this.m40192A1();
                        return;
                    case 8:
                        MusicService.this.m40249u1();
                        return;
                    case 9:
                        MusicService.this.m40251v1();
                        return;
                    case 10:
                        C7064c cVar2 = MusicService.this.f31300x;
                        if (cVar2 != null && !cVar2.f31325y) {
                            MusicService.this.m40198D1();
                            return;
                        }
                        return;
                    case 11:
                        C7064c cVar3 = MusicService.this.f31300x;
                        if (cVar3 != null && cVar3.mo27200s() != null) {
                            C4477c.m19596R0(MusicService.this, MusicService.this.f31300x.mo27200s().mo9215k());
                            MusicService.this.sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.add_to_favorite_notifiy").setPackage(C8345u.m46327h().getPackageName()));
                            MusicService.this.mo27104U1();
                            MusicService.this.sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.add_to_favorite_list").setPackage(C8345u.m46327h().getPackageName()));
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }

        /* synthetic */ C7069e(MusicService musicService, C7062a aVar) {
            this();
        }
    }

    /* renamed from: coocent.music.player.service.MusicService$f */
    private class C7070f extends Thread {

        /* renamed from: g */
        private final Music f31333g;

        /* synthetic */ C7070f(MusicService musicService, Music music, C7062a aVar) {
            this(music);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void mo27217c() {
            C8345u.m46340u(R.string.too_short);
            try {
                C7064c cVar = MusicService.this.f31300x;
                if (cVar != null && cVar.f31316p != null) {
                    for (int i = 0; i < MusicService.this.f31300x.f31316p.size(); i++) {
                        if (MusicService.this.f31300x.f31316p.get(i) != null) {
                            ((C7958k) MusicService.this.f31300x.f31316p.get(i)).mo26487Z();
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void run() {
            try {
                int unused = MusicService.this.f31296P = 0;
                Music music = this.f31333g;
                if (!(music == null || music.mo9211h() == null)) {
                    if (!this.f31333g.mo9211h().isEmpty()) {
                        if (this.f31333g.mo9214j() <= 0) {
                            MusicService musicService = MusicService.this;
                            if (musicService.f31300x != null) {
                                boolean unused2 = musicService.f31298R = false;
                                MusicService.this.f31300x.mo27173Y();
                                C8345u.m46339t(new C7081g(this));
                                return;
                            }
                            return;
                        } else if (MusicService.this.f31292L != null) {
                            MusicService.this.f31292L.mo28135o(this.f31333g.mo9219o());
                            try {
                                MusicService.this.m40216O1();
                                MusicService.this.m40214N1();
                                return;
                            } catch (Exception e) {
                                e.printStackTrace();
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                C8345u.m46339t(C7080f.f31354g);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        private C7070f(Music music) {
            this.f31333g = music;
        }
    }

    /* renamed from: coocent.music.player.service.MusicService$g */
    public class C7071g extends Handler {

        /* renamed from: a */
        private final WeakReference<Context> f31335a;

        /* renamed from: coocent.music.player.service.MusicService$g$a */
        class C7072a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ int f31337g;

            /* renamed from: h */
            final /* synthetic */ int f31338h;

            C7072a(int i, int i2) {
                this.f31337g = i;
                this.f31338h = i2;
            }

            public void run() {
                if (this.f31337g >= this.f31338h && MusicService.this.f31300x.mo27164R()) {
                    MusicService.this.mo27105Y0();
                    int unused = MusicService.this.f31296P = 0;
                }
            }
        }

        public C7071g(Context context) {
            this.f31335a = new WeakReference<>(context.getApplicationContext());
        }

        public void handleMessage(Message message) {
            Bundle data;
            List<C4348a> list;
            WeakReference<Context> weakReference = this.f31335a;
            if (weakReference != null && ((Context) weakReference.get()) != null && message.what == 2222 && (data = message.getData()) != null) {
                int i = (int) data.getDouble("cTime");
                int i2 = (int) data.getDouble("aTime");
                try {
                    C7064c cVar = MusicService.this.f31300x;
                    if (!(cVar == null || (list = cVar.f31307g) == null || list.size() <= 0)) {
                        MusicService.this.mo27098H1(MusicService.this.f31300x.f31307g.get(C4359c.m19012c(MusicService.this.f31300x.f31307g, (long) (C8287e.m45865r() * 1000.0d))).mo14756h());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (i >= 0) {
                    MusicService musicService = MusicService.this;
                    if (musicService.f31300x != null && musicService.f31296P == 0 && MusicService.this.f31291K != null && i >= i2 && MusicService.this.f31300x.mo27164R()) {
                        MusicService.m40248u0(MusicService.this);
                        MusicService.this.f31291K.postDelayed(new C7072a(i, i2), 3000);
                    }
                }
            }
        }
    }

    public MusicService() {
        Boolean bool = Boolean.FALSE;
        this.f31294N = new C8446k<>(bool, bool);
        this.f31295O = false;
        this.f31298R = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public void m40192A1() {
        Music s;
        C7064c cVar = this.f31300x;
        if (cVar != null && (s = cVar.mo27200s()) != null) {
            new Thread(new C7078d(this, s)).start();
        }
    }

    /* renamed from: B1 */
    private void m40194B1() {
        C7068d dVar = new C7068d();
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService("phone");
        if (telephonyManager != null) {
            telephonyManager.listen(dVar, 32);
        }
    }

    /* renamed from: C1 */
    private void m40196C1() {
        this.f31299w = new C7069e(this, (C7062a) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.toggle.openMusic.pause.action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.prve.openMusic.action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.next.openMusic.action");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.intent.action.NEW_OUTGOING_CALL");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.android.intent.action.PHONE_STATE");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.WAKEUP.EXIT");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.update_widget");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.sensor_share");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.parser_lyric");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.desktop_lyric_action");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.desktop_un_lock_lyric_action");
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.notify_add_to_favorite");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.notification_clear");
        registerReceiver(this.f31299w, intentFilter);
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public void m40198D1() {
        C8284c.m45758u(0);
        C8284c.m45751n(C8345u.m46327h(), 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public void m40200E1(Bitmap bitmap) {
        try {
            C7064c cVar = this.f31300x;
            if (cVar == null || cVar.mo27209x() == null) {
                C7064c cVar2 = this.f31300x;
                if (cVar2 != null && cVar2.mo27209x() == null) {
                    C8338o.m46277e().mo30285i(this, bitmap, true, this.f31300x.mo27200s(), false);
                    return;
                }
                return;
            }
            C8338o.m46277e().mo30285i(this, bitmap, true, this.f31300x.mo27200s(), this.f31300x.mo27209x().mo28130i());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: F1 */
    private void m40202F1() {
        mo9536c0(false, true);
        mo9538d0(false);
        if (C8337n.m46065k0(this).mo30174Z()) {
            C8284c.m45758u(0);
            C8284c.m45751n(this, 0);
            C8337n.m46065k0(this).mo30172Y1(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public void m40206I1() {
        C7064c cVar = this.f31300x;
        if (cVar == null || cVar.mo27200s() == null) {
            C8338o.m46277e().mo30285i(this, (Bitmap) null, false, this.f31300x.mo27200s(), this.f31300x.mo27162Q());
        } else {
            C1719b.m8597t(C8345u.m46327h()).mo7665u(C8314f.m45973b(this, 0, this.f31300x.mo27200s().mo9215k(), this.f31300x.mo27200s().mo9205d())).mo7637a((C2153h) ((C2153h) ((C2153h) ((C2153h) new C2153h().mo8386h()).mo8374X(C8345u.m46323d(50), C8345u.m46323d(50))).mo8379c()).mo8391j(R.drawable.homepage_album_cover_default2)).mo7643w0(new C7062a());
        }
        m40216O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public void m40208J1() {
        try {
            new Handler().postDelayed(new C7076b(this), 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: M1 */
    private void m40212M1() {
        sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.music_change_update_title").setPackage(C8345u.m46327h().getPackageName()));
        sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.music_change_update_state").setPackage(C8345u.m46327h().getPackageName()));
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public void m40214N1() {
        C7064c cVar = this.f31300x;
        if (cVar != null && cVar.f31316p != null) {
            for (int i = 0; i < this.f31300x.f31316p.size(); i++) {
                if (this.f31300x.f31316p.get(i) != null) {
                    C8345u.m46339t(new C7082h(this, i));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public void m40216O1() {
        C7064c cVar;
        if (this.f31297Q != null && (cVar = this.f31300x) != null) {
            if (cVar.mo27200s() != null) {
                this.f31297Q.mo28142b(this.f31300x.mo27202t(), this.f31300x.mo27192o(), ((long) this.f31300x.mo27196q()) * 1000, ((long) this.f31300x.mo27198r()) * 1000, this.f31300x.mo27162Q());
                return;
            }
            this.f31297Q.mo28142b(C8345u.m46333n(R.string.no_track), C8345u.m46333n(R.string.music_eq_tab_artist_no_artist), 0, 0, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R1 */
    public void m40220R1() {
        C7064c cVar = this.f31300x;
        if (cVar != null) {
            cVar.mo27173Y();
            if (this.f31300x.mo27200s() != null) {
                C7393h.m41695f(C8345u.m46327h()).mo28192n(this.f31300x.mo27200s().mo9215k());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public void m40222S1() {
        C7064c cVar = this.f31300x;
        if (cVar != null) {
            cVar.mo27174Z();
            if (this.f31300x.mo27200s() != null) {
                C7393h.m41695f(C8345u.m46327h()).mo28192n(this.f31300x.mo27200s().mo9215k());
            }
        }
    }

    /* renamed from: U0 */
    private boolean m40224U0() {
        if (C4461a.m19525b(this)) {
            return true;
        }
        C4477c.m19582K0(this);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: V0 */
    public void m40225V0(List<Music> list, long[] jArr) {
        if (!Arrays.equals(jArr, this.f31300x.mo27211y())) {
            this.f31300x.mo27193o0(jArr);
            this.f31300x.mo27210x0(list);
            this.f31300x.mo27191n0(list);
            this.f31300x.m40312l(true);
            Log.e("wigetTogglePlay", "checkPlaylist-----------------!!!!!!");
        }
    }

    /* renamed from: W0 */
    private void m40226W0() {
    }

    /* renamed from: X0 */
    private void m40227X0(int i, List<Music> list) {
        this.f31300x.mo27210x0(list);
        this.f31300x.m40312l(true);
        C7064c cVar = this.f31300x;
        cVar.mo27193o0(cVar.mo27154M(list));
        this.f31300x.mo27169U(C7393h.m41695f(C8345u.m46327h()).mo28180a(i, this.f31300x.mo27146I()), list);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z0 */
    public void m40228Z0() {
        C8287e.m45826b0();
        C8338o.m46277e().mo30284c();
        sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.WAKEUP.EXIT").setPackage(C8345u.m46327h().getPackageName()));
        new Handler().postDelayed(new C7079e(this), 500);
    }

    /* renamed from: b1 */
    private void m40229b1() {
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        this.f31287G = audioManager;
        this.f31288H = audioManager.getStreamMaxVolume(3);
    }

    /* access modifiers changed from: private */
    /* renamed from: c1 */
    public void m40230c1() {
        if (this.f31300x.mo27200s() != null) {
            m40216O1();
        }
    }

    /* renamed from: d1 */
    private void m40231d1() {
        this.f31302z = Widget4x4Grid.m40854b();
        this.f31281A = Widget2x2Grid.m40838b();
        this.f31282B = Widget4x1.m40846b();
    }

    /* renamed from: e1 */
    private void m40232e1() {
    }

    /* renamed from: f1 */
    private void m40233f1() {
        this.f31286F = new HeadSetReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        registerReceiver(this.f31286F, intentFilter);
    }

    /* access modifiers changed from: private */
    /* renamed from: g1 */
    public void m40234g1() {
        if (C8337n.m46065k0(this).mo30158V()) {
            C8342r.m46289b().mo30288c(this, this);
        } else {
            C8342r.m46289b().mo30287a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h1 */
    public /* synthetic */ void mo27113i1() {
        stopSelf();
        System.exit(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: j1 */
    public /* synthetic */ void mo27115l1() {
        sendBroadcast(new Intent("coocent.musiclibrary.music.utils.LyricUtils_UPDATE_REPLACE_LYRIC").setPackage(C8345u.m46327h().getPackageName()));
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public /* synthetic */ void mo27116n1(Music music) {
        C7064c cVar = this.f31300x;
        cVar.f31307g = cVar.mo27170V(this, C4477c.m19579J(), music.mo9215k(), music.mo9218n());
        C8345u.m46339t(new C7083i(this));
    }

    /* renamed from: n0 */
    private void m40238n0(boolean z) {
        C7064c cVar = this.f31300x;
        if (cVar == null) {
            return;
        }
        if (cVar.mo27162Q() || z) {
            mo27099K1(this.f31289I, this.f31290J, this.f31291K, this);
        } else {
            mo27100L1(this.f31289I, this.f31290J);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public /* synthetic */ void mo27119p1() {
        C7064c cVar = this.f31300x;
        if (cVar != null && cVar.mo27162Q()) {
            C9566f.m50207r(this);
            Intent intent = new Intent(this, ScreenLockActivity.class);
            intent.addFlags(268435456);
            startActivity(intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public /* synthetic */ void mo27121r1(int i) {
        try {
            C7064c cVar = this.f31300x;
            if (cVar != null && cVar.f31316p != null) {
                ((C7958k) this.f31300x.f31316p.get(i)).mo26486M0();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public /* synthetic */ void mo27122t1() {
        Widget4x4Grid widget4x4Grid = this.f31302z;
        if (widget4x4Grid != null) {
            widget4x4Grid.mo27702d(this);
        }
        Widget2x2Grid widget2x2Grid = this.f31281A;
        if (widget2x2Grid != null) {
            widget2x2Grid.mo27692d(this);
        }
        Widget4x1 widget4x1 = this.f31282B;
        if (widget4x1 != null) {
            widget4x1.mo27697d(this);
        }
        if (this.f31300x != null) {
            C7393h.m41695f(C8345u.m46327h()).mo28193o(this.f31300x.mo27194p());
        }
        if (this.f31283C) {
            m40206I1();
        }
    }

    /* renamed from: u0 */
    static /* synthetic */ int m40248u0(MusicService musicService) {
        int i = musicService.f31296P;
        musicService.f31296P = i + 1;
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public void m40249u1() {
        if (m40224U0()) {
            boolean I = C8337n.m46065k0(this).mo30106I();
            C8337n.m46065k0(this).mo30128N1(!I);
            mo27104U1();
            C7064c cVar = this.f31300x;
            if (cVar == null) {
                return;
            }
            if (!I) {
                cVar.mo27153L0();
            } else {
                cVar.mo27156N();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public void m40251v1() {
        if (m40224U0()) {
            C8337n.m46065k0(this).mo30132O1(false);
            mo27104U1();
            C7064c cVar = this.f31300x;
            if (cVar != null) {
                cVar.mo27161P0();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w1 */
    public void m40253w1() {
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public synchronized void m40255x1(Music music) {
        m40226W0();
        new C7070f(this, music, (C7062a) null).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public void m40257y1() {
        C7064c cVar;
        if (C8337n.m46065k0(C8345u.m46327h()).mo30213i0() && (cVar = this.f31300x) != null && cVar.mo27162Q()) {
            this.f31300x.mo27171W();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public void m40259z1() {
        C7064c cVar;
        if (C8337n.m46065k0(C8345u.m46327h()).mo30209h0() && (cVar = this.f31300x) != null && !cVar.mo27162Q()) {
            this.f31300x.mo27172X();
        }
    }

    /* renamed from: A */
    public void mo27095A(long j) {
        C7064c cVar = this.f31300x;
        if (cVar != null) {
            cVar.mo27181g0((int) (j / 1000));
            m40216O1();
        }
    }

    /* renamed from: D */
    public void mo15320D(int i) {
        if (this.f31300x.mo27209x() != null) {
            mo9533Z(this.f31300x.mo27209x().mo28128g(), i);
        }
    }

    /* renamed from: E */
    public void mo27096E() {
        C7064c cVar = this.f31300x;
        if (cVar != null) {
            cVar.mo27171W();
        }
    }

    /* renamed from: G1 */
    public void mo27097G1(int i) {
        try {
            this.f31287G.setStreamVolume(3, i, 8);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: H */
    public void mo26504H(Timer timer, TimerTask timerTask) {
        this.f31289I = timer;
        this.f31290J = timerTask;
    }

    /* renamed from: H1 */
    public void mo27098H1(String str) {
    }

    /* renamed from: K1 */
    public void mo27099K1(Timer timer, TimerTask timerTask, Handler handler, C7969v vVar) {
        C7064c cVar = this.f31300x;
        if (cVar != null && cVar.mo27200s() != null) {
            if (!(timer == null || timerTask == null)) {
                timerTask.cancel();
            }
            if (timer == null) {
                timer = new Timer();
            }
            Timer timer2 = timer;
            C7063b bVar = new C7063b(handler);
            vVar.mo26504H(timer2, bVar);
            timer2.schedule(bVar, 0, 1000);
        }
    }

    /* renamed from: L */
    public MediaBrowserServiceCompat.C0733e mo4310L(String str, int i, Bundle bundle) {
        return null;
    }

    /* renamed from: L1 */
    public void mo27100L1(Timer timer, TimerTask timerTask) {
        if (timer != null && timerTask != null) {
            timerTask.cancel();
        }
    }

    /* renamed from: M */
    public void mo4311M(String str, MediaBrowserServiceCompat.C0750m<List<MediaBrowserCompat.MediaItem>> mVar) {
    }

    /* renamed from: P1 */
    public void mo27101P1() {
        try {
            int A = this.f31300x.mo27130A();
            if (A > 0) {
                int i = A - 1;
                if (i < 0) {
                    i = 0;
                }
                mo27097G1(i);
                m40198D1();
                sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.volume_down").setPackage(C8345u.m46327h().getPackageName()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: Q1 */
    public void mo27102Q1() {
        try {
            int A = this.f31300x.mo27130A();
            if (A == this.f31300x.mo27132B()) {
                sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.max_system_volume").setPackage(C8345u.m46327h().getPackageName()));
            } else if (A >= 0) {
                int i = A + 1;
                int i2 = this.f31288H;
                if (i > i2) {
                    i = i2;
                }
                mo27097G1(i);
                m40198D1();
                sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.volume_up").setPackage(C8345u.m46327h().getPackageName()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: T1 */
    public void mo27103T1(int i, List<Music> list) {
        C7064c cVar = this.f31300x;
        if (cVar == null) {
            return;
        }
        if (cVar.mo27164R()) {
            if (C7393h.m41695f(C8345u.m46327h()).mo28182c()) {
                this.f31300x.mo27169U(i, C7973c.m43649d(C8345u.m46327h()).mo29507e());
                C7393h.m41695f(C8345u.m46327h()).mo28189k(false);
                return;
            }
            this.f31300x.mo27169U(i, C4477c.m19585M(C8345u.m46327h()));
        } else if (this.f31300x.mo27162Q()) {
            this.f31300x.mo27171W();
            C7393h.m41695f(this).mo28190l(C8287e.m45865r());
            C7393h.m41695f(this).mo28191m(C8287e.m45871u());
        } else if (this.f31300x.mo27200s() != null) {
            if (!this.f31300x.mo27160P() || this.f31300x.mo27209x() == null) {
                this.f31300x.mo27169U(i, list);
            } else {
                this.f31300x.mo27172X();
            }
        } else if (this.f31300x.mo27160P()) {
            m40227X0(i, list);
        } else {
            this.f31300x.mo27169U(i, C4477c.m19585M(C8345u.m46327h()));
        }
    }

    /* renamed from: U1 */
    public void mo27104U1() {
        new Handler().postDelayed(new C7075a(this), 500);
    }

    /* renamed from: Y0 */
    public void mo27105Y0() {
        C7064c cVar = this.f31300x;
        if (cVar != null) {
            cVar.mo27173Y();
        }
    }

    /* renamed from: a */
    public void mo27106a() {
        if (C8337n.m46065k0(C8345u.m46327h()).mo30201f0()) {
            m40220R1();
        }
    }

    /* renamed from: a1 */
    public void mo27107a1(Handler handler) {
        if (handler != null) {
            try {
                C7064c cVar = this.f31300x;
                if (cVar != null) {
                    double q = cVar.mo27196q();
                    double j = ((double) this.f31300x.mo27200s().mo9214j()) / 1000.0d;
                    if (q > j) {
                        q = 0.0d;
                    }
                    handler.removeCallbacksAndMessages((Object) null);
                    Message message = new Message();
                    Bundle bundle = new Bundle();
                    bundle.putDouble("cTime", q);
                    bundle.putDouble("aTime", j);
                    message.what = 2222;
                    message.setData(bundle);
                    handler.sendMessage(message);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public void mo27108b() {
        if (C8337n.m46065k0(C8345u.m46327h()).mo30205g0()) {
            mo27103T1(this.f31300x.mo27194p(), this.f31300x.mo27134C());
        }
    }

    /* renamed from: c */
    public void mo27109c() {
        if (C8337n.m46065k0(C8345u.m46327h()).mo30217j0()) {
            m40222S1();
        }
    }

    /* renamed from: e */
    public int mo15321e() {
        if (this.f31300x.mo27209x() != null) {
            return this.f31300x.mo27209x().mo28126e();
        }
        return 0;
    }

    /* renamed from: f */
    public void mo26664f() {
        this.f31295O = false;
        this.f31296P++;
        C8337n.m46065k0(this).mo30093E2(0);
        C7064c cVar = this.f31300x;
        if (cVar != null && cVar.mo27162Q()) {
            if (C8337n.m46065k0(this).mo30236o0()) {
                this.f31294N = new C8446k<>(this.f31294N.getFirst(), Boolean.TRUE);
            } else {
                C7064c cVar2 = this.f31300x;
                if (cVar2 != null) {
                    cVar2.mo27171W();
                }
                C7393h.m41695f(this).mo28190l(C8287e.m45865r());
                C7393h.m41695f(this).mo28191m(C8287e.m45871u());
            }
        }
        for (int i = 0; i < this.f31293M.size(); i++) {
            if (this.f31293M.get(i) != null) {
                this.f31293M.get(i).mo26664f();
            }
        }
    }

    /* renamed from: f0 */
    public void mo9539f0() {
        Music a;
        C7064c cVar = this.f31300x;
        if (cVar != null && (a = cVar.f31308h) != null) {
            C8284c.m45755r(this, a.mo9218n(), a.mo9210g(), this.f31300x.mo27209x().mo28126e(), this.f31300x.mo27209x().mo28130i());
        }
    }

    /* renamed from: g */
    public void mo27110g() {
        C7064c cVar = this.f31300x;
        if (cVar != null && cVar.mo27162Q()) {
            m40220R1();
        }
    }

    /* renamed from: h */
    public void mo27111h(int i) {
        boolean z;
        if (i == 2) {
            z = false;
        } else if (i == 3 || i == 7) {
            z = true;
        } else {
            return;
        }
        if (this.f31300x != null) {
            for (int i2 = 0; i2 < this.f31300x.f31316p.size(); i2++) {
                if (this.f31300x.f31316p.get(i2) != null) {
                    ((C7958k) this.f31300x.f31316p.get(i2)).mo26493j0(z);
                    m40238n0(false);
                }
            }
            m40212M1();
        }
        mo27104U1();
    }

    /* renamed from: i */
    public void mo27112i() {
        C7064c cVar = this.f31300x;
        if (cVar != null) {
            cVar.mo27173Y();
        }
    }

    /* renamed from: k */
    public void mo27114k() {
        Log.e("player", getResources().getString(R.string.error));
    }

    /* renamed from: k1 */
    public void mo26670k1(long j) {
        this.f31295O = true;
        for (int i = 0; i < this.f31293M.size(); i++) {
            if (this.f31293M.get(i) != null) {
                this.f31293M.get(i).mo26670k1(j);
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f31300x;
    }

    public void onCreate() {
        super.onCreate();
        this.f31297Q = new C7369c(this, this);
        m40206I1();
        f31280S = 0;
        this.f31301y = new C7973c(this);
        this.f31284D = C7393h.m41695f(C8345u.m46327h()).mo28184e();
        this.f31285E = C7393h.m41695f(C8345u.m46327h()).mo28183d();
        this.f31291K = new C7071g(this);
        m40238n0(true);
        if (!this.f31295O) {
            C8337n.m46065k0(this).mo30093E2(0);
        }
        m40229b1();
        m40196C1();
        m40233f1();
        m40231d1();
        m40232e1();
        m40234g1();
        m40194B1();
        m40230c1();
        this.f31292L = new C7367a(this, this);
        m40202F1();
    }

    public void onDestroy() {
        super.onDestroy();
        try {
            C7069e eVar = this.f31299w;
            if (eVar != null) {
                unregisterReceiver(eVar);
            }
            HeadSetReceiver headSetReceiver = this.f31286F;
            if (headSetReceiver != null) {
                unregisterReceiver(headSetReceiver);
            }
            C8342r.m46289b().mo30287a();
            C8338o.m46277e().mo30283a(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        m40206I1();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        m40206I1();
        if (intent != null) {
            String action = intent.getAction();
            C7064c cVar = this.f31300x;
            if (cVar != null) {
                cVar.mo27206v0(C7393h.m41695f(C8345u.m46327h()).mo28186h());
                int g = C7393h.m41695f(C8345u.m46327h()).mo28185g();
                this.f31300x.mo27185j0(g);
                if (action != null) {
                    action.hashCode();
                    char c = 65535;
                    switch (action.hashCode()) {
                        case -2127113824:
                            if (action.equals("media.musicplayer.audioplayer.videoplayer.toggle.openMusic.pause.action")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -258348501:
                            if (action.equals("media.musicplayer.audioplayer.videoplayer.prve.openMusic.action")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 873537449:
                            if (action.equals("media.musicplayer.audioplayer.videoplayer.next.openMusic.action")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            mo27103T1(g, this.f31301y.mo29507e());
                            f31280S = 2;
                            break;
                        case 1:
                            m40222S1();
                            f31280S = 2;
                            break;
                        case 2:
                            m40220R1();
                            f31280S = 2;
                            break;
                    }
                    C7393h.m41695f(C8345u.m46327h()).mo28193o(this.f31300x.mo27194p());
                }
            }
        }
        if (Build.VERSION.SDK_INT < 23) {
            mo27104U1();
        } else if (C7366c.m41592d(C7366c.f32436d)) {
            mo27104U1();
        }
        return 1;
    }

    /* renamed from: q */
    public void mo27120q() {
        this.f31298R = true;
        this.f31300x.mo27173Y();
    }

    /* renamed from: u */
    public void mo27123u() {
        int i;
        if (this.f31292L == null) {
            return;
        }
        if (f31280S != 1) {
            if (this.f31285E > 0) {
                if ((C4442f.m19495d() || C4442f.m19496e() || C4442f.m19494c()) && Build.VERSION.SDK_INT >= 31) {
                    i = 0;
                } else {
                    i = this.f31285E;
                }
                C8287e.m45856m0(i);
                this.f31285E = 0;
                C7393h.m41695f(this).mo28190l((double) this.f31285E);
            }
            this.f31292L.mo28140p(1.0f);
            if (this.f31300x.mo27158O()) {
                if (this.f31300x.f31316p != null) {
                    for (int i2 = 0; i2 < this.f31300x.f31316p.size(); i2++) {
                        if (this.f31300x.f31316p.get(i2) != null) {
                            ((C7958k) this.f31300x.f31316p.get(i2)).mo26484A();
                        }
                    }
                }
                C8287e.m45858n0(false);
            }
            this.f31292L.mo28133l(true);
            this.f31298R = false;
            return;
        }
        if ((C4442f.m19495d() || C4442f.m19496e() || C4442f.m19494c()) && Build.VERSION.SDK_INT >= 31) {
            this.f31292L.mo28133l(true);
        }
        C8287e.m45856m0(this.f31285E);
        C8287e.m45826b0();
        f31280S = 2;
        sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.notify_ui").setPackage(C8345u.m46327h().getPackageName()));
    }

    /* renamed from: v */
    public void mo27124v() {
        C7064c cVar = this.f31300x;
        if (cVar != null) {
            cVar.mo27174Z();
        }
    }

    /* renamed from: w */
    public void mo27125w() {
        if (this.f31300x != null) {
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.toggle.openMusic.pause.action").setPackage(C8345u.m46327h().getPackageName()));
        }
    }
}
