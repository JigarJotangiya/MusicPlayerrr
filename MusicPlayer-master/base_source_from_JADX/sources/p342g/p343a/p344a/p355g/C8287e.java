package p342g.p343a.p344a.p355g;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.coocent.music.base.data.entity.Music;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.service.MusicService;
import coocent.musiclibrary.music.p290h.C7367a;
import coocent.musiclibrary.music.p292j.C7393h;
import coocent.musiclibrary.music.p292j.C7401l;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.WeakHashMap;
import media.musicplayer.audioplayer.videoplayer.R;
import p159f.p166c.p177d.p178h.C4348a;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p159f.p166c.p199f.p200h.C4494a;
import p342g.p343a.p344a.p346c.C7958k;
import p342g.p343a.p344a.p346c.C7969v;
import p342g.p343a.p344a.p347d.C7973c;
import p342g.p343a.p344a.p347d.C7974d;
import p342g.p343a.p344a.p347d.C7977g;
import p342g.p343a.p344a.p348e.C7985h;
import p342g.p343a.p344a.p358i.C8311c;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8344t;
import p342g.p343a.p344a.p358i.C8345u;
import p369i.C8446k;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: g.a.a.g.e */
/* compiled from: MusicManager */
public class C8287e {

    /* renamed from: a */
    public static MusicService.C7064c f34684a;

    /* renamed from: b */
    private static final WeakHashMap<Context, C8289b> f34685b = new WeakHashMap<>();

    /* renamed from: g.a.a.g.e$a */
    /* compiled from: MusicManager */
    class C8288a extends TimerTask {

        /* renamed from: g */
        final /* synthetic */ Handler f34686g;

        C8288a(Handler handler) {
            this.f34686g = handler;
        }

        public void run() {
            if (C8287e.f34684a != null) {
                C8287e.m45794M(this.f34686g);
            }
        }
    }

    /* renamed from: g.a.a.g.e$b */
    /* compiled from: MusicManager */
    public static final class C8289b implements ServiceConnection {

        /* renamed from: g */
        private final ServiceConnection f34687g;

        public C8289b(ServiceConnection serviceConnection, Context context) {
            this.f34687g = serviceConnection;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C8287e.f34684a = (MusicService.C7064c) iBinder;
            ServiceConnection serviceConnection = this.f34687g;
            if (serviceConnection != null) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            ServiceConnection serviceConnection = this.f34687g;
            if (serviceConnection != null) {
                serviceConnection.onServiceDisconnected(componentName);
            }
        }
    }

    /* renamed from: g.a.a.g.e$c */
    /* compiled from: MusicManager */
    public static final class C8290c {

        /* renamed from: a */
        public ContextWrapper f34688a;

        public C8290c(ContextWrapper contextWrapper) {
            this.f34688a = contextWrapper;
        }
    }

    /* renamed from: A */
    public static List<Music> m45770A() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            return cVar.mo27207w();
        }
        return null;
    }

    /* renamed from: A0 */
    public static void m45771A0() {
        if (C8345u.m46327h() != null && !BaseApplication.f31143F) {
            new C8337n(C8345u.m46327h()).mo30219j2();
            BaseApplication.f31143F = true;
        }
    }

    /* renamed from: B */
    public static C7367a m45772B() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            return cVar.mo27209x();
        }
        return null;
    }

    /* renamed from: B0 */
    public static void m45773B0(C7958k kVar) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27195p0(kVar);
        }
    }

    /* renamed from: C */
    public static boolean m45774C() {
        if (C8345u.m46327h() != null) {
            return new C8337n(C8345u.m46327h()).mo30197e0();
        }
        return false;
    }

    /* renamed from: C0 */
    public static void m45775C0(float f) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27199r0(f);
        }
    }

    /* renamed from: D */
    public static long[] m45776D() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            return cVar.mo27211y();
        }
        return null;
    }

    /* renamed from: D0 */
    public static void m45777D0(int i, float f) {
        if (f34684a != null) {
            Log.e("fmlPlayer", "gain:" + f);
            f34684a.mo27201s0(i, f);
        }
    }

    /* renamed from: E */
    public static long[] m45778E(List<Music> list) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            return cVar.mo27154M(list);
        }
        return null;
    }

    /* renamed from: E0 */
    public static void m45779E0(float f) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27203t0(f);
        }
    }

    /* renamed from: F */
    public static boolean m45780F() {
        if (C8345u.m46327h() != null) {
            return new C8337n(C8345u.m46327h()).mo30224l0();
        }
        return BaseApplication.f31143F;
    }

    /* renamed from: F0 */
    public static void m45781F0(int i, ImageView imageView, int i2, boolean z) {
        if (f34684a != null) {
            if (i == 2) {
                if (!(i2 == 1 || imageView == null)) {
                    if (z) {
                        imageView.setImageDrawable(C8343s.m46304l(R.drawable.ic_playlist01_play_in_order, R.color.default_text_color));
                    } else {
                        imageView.setImageResource(R.drawable.ic_playlist01_play_in_order);
                    }
                }
                f34684a.mo27208w0(0);
                f34684a.mo27204u0(1);
            } else if (i == 1) {
                if (!(i2 == 1 || imageView == null)) {
                    if (z) {
                        imageView.setImageDrawable(C8343s.m46304l(R.drawable.ic_playlist00_order_play, R.color.default_text_color));
                    } else {
                        imageView.setImageResource(R.drawable.ic_playlist00_order_play);
                    }
                }
                f34684a.mo27208w0(0);
                f34684a.mo27204u0(0);
            } else if (i == 5) {
                if (!(i2 == 1 || imageView == null)) {
                    if (z) {
                        imageView.setImageDrawable(C8343s.m46304l(R.drawable.ic_playlist03_shuffle_playback, R.color.default_text_color));
                    } else {
                        imageView.setImageResource(R.drawable.ic_playlist03_shuffle_playback);
                    }
                }
                f34684a.mo27208w0(1);
                f34684a.mo27204u0(1);
            } else if (i == 3) {
                if (!(i2 == 1 || imageView == null)) {
                    if (z) {
                        imageView.setImageDrawable(C8343s.m46304l(R.drawable.ic_playlist02_single_play, R.color.default_text_color));
                    } else {
                        imageView.setImageResource(R.drawable.ic_playlist02_single_play);
                    }
                }
                f34684a.mo27208w0(0);
                f34684a.mo27204u0(2);
            }
            if (i2 != 2) {
                f34684a.mo27206v0(i);
            }
            C7393h.m41695f(C8345u.m46327h()).mo28195q(i);
        }
    }

    /* renamed from: G */
    public static List<C4348a> m45782G() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            return cVar.mo27213z();
        }
        return new ArrayList();
    }

    /* renamed from: G0 */
    public static void m45783G0(Context context, ImageView imageView, boolean z) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            int G = cVar.mo27142G();
            int E = f34684a.mo27138E();
            if (G == 0 && E == 0) {
                if (z) {
                    imageView.setImageDrawable(C8343s.m46304l(R.drawable.ic_playlist03_shuffle_playback, R.color.default_text_color));
                } else {
                    imageView.setImageResource(R.drawable.ic_playlist03_shuffle_playback);
                }
                f34684a.mo27208w0(1);
                f34684a.mo27204u0(1);
                f34684a.mo27206v0(5);
                Toast.makeText(C8345u.m46327h(), R.string.Loop_random_play, 0).show();
            } else if (G == 1 && E == 1) {
                if (z) {
                    imageView.setImageDrawable(C8343s.m46304l(R.drawable.ic_playlist01_play_in_order, R.color.default_text_color));
                } else {
                    imageView.setImageResource(R.drawable.ic_playlist01_play_in_order);
                }
                f34684a.mo27208w0(0);
                f34684a.mo27204u0(1);
                f34684a.mo27206v0(2);
                Toast.makeText(C8345u.m46327h(), R.string.list_romdom_playback_Mode, 0).show();
            } else if (G == 0 && E == 1) {
                if (z) {
                    imageView.setImageDrawable(C8343s.m46304l(R.drawable.ic_playlist02_single_play, R.color.default_text_color));
                } else {
                    imageView.setImageResource(R.drawable.ic_playlist02_single_play);
                }
                f34684a.mo27208w0(0);
                f34684a.mo27204u0(2);
                f34684a.mo27206v0(3);
                Toast.makeText(C8345u.m46327h(), R.string.single_cycle_play_Mode, 0).show();
            } else if (G == 0 && E == 2) {
                if (z) {
                    imageView.setImageDrawable(C8343s.m46304l(R.drawable.ic_playlist00_order_play, R.color.default_text_color));
                } else {
                    imageView.setImageResource(R.drawable.ic_playlist00_order_play);
                }
                f34684a.mo27208w0(0);
                f34684a.mo27204u0(0);
                f34684a.mo27206v0(1);
                Toast.makeText(C8345u.m46327h(), R.string.nomalMode, 0).show();
            }
        }
    }

    /* renamed from: H */
    public static int m45784H() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            return cVar.mo27130A();
        }
        return 15;
    }

    /* renamed from: H0 */
    private static void m45785H0() {
        m45882z0(m45778E(m45867s()));
        long[] D = m45776D();
        if (D != null) {
            for (int i = 0; i < D.length; i++) {
                if (m45873v().mo9215k() == D[i]) {
                    m45860o0(i);
                    return;
                }
            }
        }
    }

    /* renamed from: I */
    public static int m45786I() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            return cVar.mo27132B();
        }
        return 30;
    }

    /* renamed from: I0 */
    public static void m45787I0(float f, boolean z) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27214z0(f);
            if (z) {
                m45839f1();
            }
        }
    }

    /* renamed from: J */
    public static List<Music> m45788J() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            return cVar.mo27134C();
        }
        return null;
    }

    /* renamed from: J0 */
    public static void m45789J0(float f, boolean z) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27131A0(f);
            if (z) {
                m45839f1();
            }
        }
    }

    /* renamed from: K */
    public static int m45790K() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            return cVar.mo27136D();
        }
        return 0;
    }

    /* renamed from: K0 */
    public static void m45791K0(int i) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27133B0(i);
        }
    }

    /* renamed from: L */
    public static int m45792L() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            return cVar.mo27140F();
        }
        return 4;
    }

    /* renamed from: L0 */
    public static void m45793L0(boolean z) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27135C0(z);
        }
    }

    /* renamed from: M */
    public static void m45794M(Handler handler) {
        Object obj;
        Object obj2;
        if (handler != null) {
            double r = m45865r();
            double u = m45871u();
            StringBuilder sb = new StringBuilder();
            int i = (int) r;
            int i2 = i % 60;
            int i3 = (int) u;
            int i4 = i3 / 60;
            int i5 = i3 % 60;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i / 60);
            sb2.append(":");
            if (i2 < 10) {
                obj = "0" + i2;
            } else {
                obj = Integer.valueOf(i2);
            }
            sb2.append(obj.toString());
            String sb3 = sb2.toString();
            sb.append(i4);
            sb.append(":");
            if (i5 >= 10) {
                obj2 = Integer.valueOf(i5);
            } else {
                obj2 = "0" + i5;
            }
            sb.append(obj2);
            handler.removeCallbacksAndMessages((Object) null);
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putString("currentProgress", sb3);
            bundle.putInt("progress", i);
            bundle.putString("total", sb.toString());
            message.what = 1;
            message.setData(bundle);
            handler.sendMessage(message);
        }
    }

    /* renamed from: M0 */
    public static void m45795M0(float f) {
        if (C8345u.m46327h() != null) {
            new C8337n(C8345u.m46327h()).mo30077A2(f);
            BaseApplication.f31155s = f / 10.0f;
        }
    }

    /* renamed from: N */
    public static int m45796N() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            return cVar.mo27148J();
        }
        return -1;
    }

    /* renamed from: N0 */
    public static void m45797N0(float f) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27137D0(f);
        }
    }

    /* renamed from: O */
    public static List<Music> m45798O() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            return cVar.mo27150K();
        }
        return null;
    }

    /* renamed from: O0 */
    public static void m45799O0(C7401l lVar) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27139E0(lVar);
        }
    }

    /* renamed from: P */
    public static boolean m45800P() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            return cVar.mo27152L();
        }
        return false;
    }

    /* renamed from: P0 */
    public static void m45801P0(int i) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27141F0(i);
        }
    }

    /* renamed from: Q */
    public static MusicService.C7064c m45802Q() {
        return f34684a;
    }

    /* renamed from: Q0 */
    public static void m45803Q0(float f) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27143G0(f);
        }
    }

    /* renamed from: R */
    public static float m45804R(float f) {
        float f2;
        if (C8345u.m46327h() != null) {
            f2 = new C8337n(C8345u.m46327h()).mo30095F0(f);
        } else {
            f2 = BaseApplication.f31154r;
        }
        return f2 / 10.0f;
    }

    /* renamed from: R0 */
    public static void m45805R0(C8446k<Boolean, Boolean> kVar) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27145H0(kVar);
        }
    }

    /* renamed from: S */
    public static int m45806S(int i) {
        if (C8345u.m46327h() != null) {
            return C8337n.m46065k0(C8345u.m46327h()).mo30147S0(i);
        }
        return BaseApplication.f31150n;
    }

    /* renamed from: S0 */
    public static void m45807S0(int i) {
        if (C8345u.m46327h() != null) {
            C8337n.m46065k0(C8345u.m46327h()).mo30137P2(i);
            BaseApplication.f31152p = i;
        }
    }

    /* renamed from: T */
    public static void m45808T() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27156N();
        }
    }

    /* renamed from: T0 */
    public static void m45809T0(float f) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27147I0(f);
        }
    }

    /* renamed from: U */
    public static boolean m45810U() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            return cVar.mo27160P();
        }
        return false;
    }

    /* renamed from: U0 */
    public static void m45811U0(float f) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27149J0(f);
        }
    }

    /* renamed from: V */
    public static boolean m45812V() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            return cVar.mo27162Q();
        }
        return false;
    }

    /* renamed from: V0 */
    public static void m45813V0(boolean z) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27151K0(z);
        }
    }

    /* renamed from: W */
    public static boolean m45814W() {
        MusicService.C7064c cVar = f34684a;
        return cVar != null && cVar.mo27142G() == 1;
    }

    /* renamed from: W0 */
    public static void m45815W0() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27153L0();
        }
    }

    /* renamed from: X */
    public static boolean m45816X() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            return cVar.mo27164R();
        }
        return false;
    }

    /* renamed from: X0 */
    public static void m45817X0(Long l) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27155M0(l);
        }
    }

    /* renamed from: Y */
    public static void m45818Y(Music music) {
        boolean z;
        try {
            if (f34684a != null) {
                List<Music> s = m45867s();
                List<Music> t = m45869t();
                if (s == null || s.size() <= 0) {
                    s.add(0, music);
                    t.add(0, music);
                    z = true;
                } else {
                    int q = m45863q();
                    if (m45792L() == 4 || m45792L() == 5 || m45792L() == 6) {
                        int i = 0;
                        while (true) {
                            if (i >= s.size()) {
                                break;
                            } else if (s.get(i).mo9215k() == m45873v().mo9215k()) {
                                q = i;
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    int i2 = q + 1;
                    s.add(i2, music);
                    t.add(i2, music);
                    z = false;
                }
                m45882z0(f34684a.mo27154M(s));
                C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.update_page").setPackage(C8345u.m46327h().getPackageName()));
                if (z) {
                    m45858n0(true);
                    m45823a0(0, new ArrayList(s));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: Y0 */
    public static void m45819Y0(Timer timer, TimerTask timerTask, Handler handler, C7969v vVar) {
        if (m45873v() != null) {
            if (!(timer == null || timerTask == null)) {
                timerTask.cancel();
            }
            if (timer == null) {
                timer = new Timer();
            }
            Timer timer2 = timer;
            C8288a aVar = new C8288a(handler);
            vVar.mo26504H(timer2, aVar);
            timer2.schedule(aVar, 0, 100);
        }
    }

    /* renamed from: Z */
    public static void m45820Z() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27167T();
        }
    }

    /* renamed from: Z0 */
    public static void m45821Z0() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27157N0();
        }
    }

    /* renamed from: a */
    public static void m45822a(Context context, Music music) {
        Activity activity = (Activity) context;
        if (C4494a.m19692a(activity, music.mo9211h())) {
            if (m45812V()) {
                m45826b0();
            }
            C4494a.m19697f(activity, music.mo9215k(), music.mo9211h(), music.mo9218n());
        }
    }

    /* renamed from: a0 */
    public static void m45823a0(int i, List<Music> list) {
        if (f34684a != null && list != null) {
            f34684a.mo27169U(i, new ArrayList(list));
        }
    }

    /* renamed from: a1 */
    public static void m45824a1() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27159O0();
        }
    }

    /* renamed from: b */
    public static void m45825b(Music music) {
        List<Music> O = m45798O();
        if (O != null) {
            O.add(music);
        }
    }

    /* renamed from: b0 */
    public static void m45826b0() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27171W();
        }
    }

    /* renamed from: b1 */
    public static void m45827b1(Timer timer, TimerTask timerTask) {
        if (timer != null && timerTask != null) {
            timerTask.cancel();
        }
    }

    /* renamed from: c */
    public static void m45828c(FragmentActivity fragmentActivity, List<Music> list, boolean z) {
        if (fragmentActivity == null || list == null || list.size() <= 0) {
            C8344t.m46317e(C8345u.m46327h(), C8345u.m46333n(R.string.please_select_track));
        } else {
            C7985h.m43692r3(m45778E(list), z).mo3841h3(fragmentActivity.mo3730H1(), "ADD_PLAYLIST");
        }
    }

    /* renamed from: c0 */
    public static void m45829c0() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27172X();
        }
    }

    /* renamed from: c1 */
    public static void m45830c1(int i, List<Music> list) {
        if (m45816X()) {
            if (C7393h.m41695f(C8345u.m46327h()).mo28182c()) {
                m45823a0(i, C7973c.m43649d(C8345u.m46327h()).mo29507e());
                C7393h.m41695f(C8345u.m46327h()).mo28189k(false);
                return;
            }
            m45823a0(i, C4477c.m19585M(C8345u.m46327h()));
        } else if (m45812V()) {
            m45826b0();
        } else if (m45873v() != null) {
            if (!m45810U() || m45772B() == null) {
                m45823a0(i, list);
            } else {
                m45829c0();
            }
        } else if (m45810U()) {
            m45829c0();
        } else {
            m45823a0(i, C4477c.m19585M(C8345u.m46327h()));
        }
    }

    /* renamed from: d */
    public static void m45831d(Music music, boolean z) {
        if (f34684a != null && music != null) {
            List<Music> s = m45867s();
            List<Music> t = m45869t();
            s.add(s.size(), music);
            t.add(t.size(), music);
            m45882z0(f34684a.mo27154M(s));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.update_page").setPackage(C8345u.m46327h().getPackageName()));
            if (z) {
                Context h = C8345u.m46327h();
                C8344t.m46315c(h, "1 " + C8345u.m46327h().getResources().getString(R.string.mutil_add_to_queue_success_one));
            }
        }
    }

    /* renamed from: d0 */
    public static void m45832d0() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27173Y();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r2 = r2.f34688a;
        r0 = f34685b;
     */
    /* renamed from: d1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m45833d1(p342g.p343a.p344a.p355g.C8287e.C8290c r2) {
        /*
            if (r2 != 0) goto L_0x0003
            return
        L_0x0003:
            android.content.ContextWrapper r2 = r2.f34688a
            java.util.WeakHashMap<android.content.Context, g.a.a.g.e$b> r0 = f34685b
            java.lang.Object r1 = r0.remove(r2)
            g.a.a.g.e$b r1 = (p342g.p343a.p344a.p355g.C8287e.C8289b) r1
            if (r1 != 0) goto L_0x0010
            return
        L_0x0010:
            r2.unbindService(r1)
            r0.isEmpty()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p342g.p343a.p344a.p355g.C8287e.m45833d1(g.a.a.g.e$c):void");
    }

    /* renamed from: e */
    public static boolean m45834e(List<Music> list) {
        if (f34684a == null || list == null || list.size() <= 0) {
            C8344t.m46317e(C8345u.m46327h(), C8345u.m46333n(R.string.please_select_track));
            return false;
        }
        List<Music> s = m45867s();
        List<Music> t = m45869t();
        for (int i = 0; i < list.size(); i++) {
            Music music = list.get(i);
            s.add(s.size(), music);
            t.add(t.size(), music);
        }
        m45882z0(f34684a.mo27154M(s));
        C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.update_page").setPackage(C8345u.m46327h().getPackageName()));
        Context h = C8345u.m46327h();
        StringBuilder sb = new StringBuilder();
        sb.append(list.size());
        sb.append(C8345u.m46333n(list.size() == 1 ? R.string.mutil_add_to_queue_success_one : R.string.mutil_add_to_queue_success));
        C8344t.m46317e(h, sb.toString());
        return true;
    }

    /* renamed from: e0 */
    public static void m45835e0() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27174Z();
        }
    }

    /* renamed from: e1 */
    public static void m45836e1(int i, float f) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27163Q0(i, f);
        }
    }

    /* renamed from: f */
    public static final C8290c m45837f(Context context, ServiceConnection serviceConnection) {
        Activity activity = (Activity) context;
        Activity parent = activity.getParent();
        if (parent != null) {
            activity = parent;
        }
        ContextWrapper contextWrapper = new ContextWrapper(activity);
        contextWrapper.startService(new Intent(contextWrapper, MusicService.class));
        C8289b bVar = new C8289b(serviceConnection, contextWrapper.getApplicationContext());
        if (!contextWrapper.bindService(new Intent().setClass(contextWrapper, MusicService.class), bVar, 0)) {
            return null;
        }
        f34685b.put(contextWrapper, bVar);
        return new C8290c(contextWrapper);
    }

    /* renamed from: f0 */
    public static void m45838f0(long j) {
        m45841g0(j);
        m45785H0();
    }

    /* renamed from: f1 */
    public static void m45839f1() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27165R0();
        }
    }

    /* renamed from: g */
    public static void m45840g(int i, List<Music> list) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27182h(i, list, true);
        }
    }

    /* renamed from: g0 */
    private static void m45841g0(long j) {
        List<Music> s = m45867s();
        List<Music> t = m45869t();
        int i = 0;
        while (true) {
            if (i >= s.size()) {
                break;
            } else if (s.get(i).mo9215k() == j) {
                s.remove(i);
                break;
            } else {
                i++;
            }
        }
        for (int i2 = 0; i2 < t.size(); i2++) {
            if (t.get(i2).mo9215k() == j) {
                t.remove(i2);
                return;
            }
        }
    }

    /* renamed from: g1 */
    public static void m45842g1(Context context, Music music) {
        if (music != null) {
            List<Music> s = m45867s();
            List<Music> t = m45869t();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= s.size()) {
                    break;
                } else if (s.get(i2).mo9215k() == music.mo9215k()) {
                    s.get(i2).mo9202C(music.mo9218n());
                    s.get(i2).mo9224t(music.mo9210g());
                    s.get(i2).mo9223s(music.mo9207e());
                    break;
                } else {
                    i2++;
                }
            }
            while (true) {
                if (i >= t.size()) {
                    break;
                } else if (t.get(i).mo9215k() == music.mo9215k()) {
                    t.get(i).mo9202C(music.mo9218n());
                    t.get(i).mo9224t(music.mo9210g());
                    t.get(i).mo9223s(music.mo9207e());
                    break;
                } else {
                    i++;
                }
            }
            C7973c d = C7973c.m43649d(context);
            C7974d d2 = C7974d.m43656d(context);
            d.mo29508f(music);
            d2.mo29512g(music);
        }
    }

    /* renamed from: h */
    public static void m45843h(C7393h hVar, List<Music> list, boolean z) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27182h(hVar.mo28185g(), list, true);
            if (z) {
                f34684a.mo27182h(hVar.mo28180a(hVar.mo28185g(), m45788J()), m45788J(), false);
                f34684a.mo27175a0();
            }
        }
    }

    /* renamed from: h0 */
    public static void m45844h0(C7958k kVar) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27176b0(kVar);
        }
    }

    /* renamed from: h1 */
    public static void m45845h1() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27166S0();
        }
    }

    /* renamed from: i */
    public static void m45846i() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27184j();
            f34684a.mo27186k();
        }
    }

    /* renamed from: i0 */
    public static void m45847i0(C7401l lVar) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27177c0(lVar);
        }
    }

    /* renamed from: i1 */
    public static void m45848i1() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27168T0();
        }
    }

    /* renamed from: j */
    public static void m45849j() {
        List<Music> K;
        MusicService.C7064c cVar = f34684a;
        if (cVar != null && (K = cVar.mo27150K()) != null) {
            K.clear();
        }
    }

    /* renamed from: j0 */
    public static void m45850j0() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27178d0();
        }
    }

    /* renamed from: k */
    public static int m45851k(String str, String str2) {
        if (str.equals(str2)) {
            return 0;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int min = Math.min(split.length, split2.length);
        int i = 0;
        int i2 = 0;
        while (i < min) {
            i2 = Integer.parseInt(split[i]) - Integer.parseInt(split2[i]);
            if (i2 != 0) {
                break;
            }
            i++;
        }
        if (i2 == 0) {
            for (int i3 = i; i3 < split.length; i3++) {
                if (Integer.parseInt(split[i3]) > 0) {
                    return 1;
                }
            }
            while (i < split2.length) {
                if (Integer.parseInt(split2[i]) > 0) {
                    return -1;
                }
                i++;
            }
            return 0;
        } else if (i2 > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: k0 */
    public static void m45852k0() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27179e0();
        }
    }

    /* renamed from: l */
    public static void m45853l(Context context, long j) {
        C7973c d = C7973c.m43649d(context);
        C7974d d2 = C7974d.m43656d(context);
        C7977g b = C7977g.m43680b(context);
        if (d != null) {
            d.mo29506c(j);
        }
        if (d2 != null) {
            d2.mo29510b(j);
        }
        if (b != null) {
            b.mo29528a(j);
        }
        context.sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.recent.fragment.action").setPackage(C8345u.m46327h().getPackageName()));
        if (d != null) {
            d.mo29506c(j);
        }
        if (d2 != null) {
            d2.mo29510b(j);
        }
        if (m45867s() == null || m45867s().size() != 1 || m45873v() == null || m45873v().mo9215k() != j) {
            if ((m45873v() != null && m45873v().mo9215k() == j) || m45792L() == 3 || m45792L() == 6) {
                m45866r0(true);
            }
            if (m45873v() != null && m45873v().mo9215k() == j) {
                m45832d0();
            }
            m45838f0(j);
        } else {
            context.sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.clean_list").setPackage(C8345u.m46327h().getPackageName()));
            context.sendBroadcast(new Intent(C8311c.f34738e).setPackage(C8345u.m46327h().getPackageName()));
            context.sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.detail_update_page").setPackage(C8345u.m46327h().getPackageName()));
        }
        context.sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.state.action").setPackage(C8345u.m46327h().getPackageName()));
    }

    /* renamed from: l0 */
    public static void m45854l0() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27180f0();
        }
    }

    /* renamed from: m */
    public static boolean m45855m(Context context, List<Music> list) {
        if (list == null) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            C7973c d = C7973c.m43649d(context);
            C7974d d2 = C7974d.m43656d(context);
            C7977g b = C7977g.m43680b(context);
            if (d != null) {
                d.mo29506c(list.get(i).mo9215k());
            }
            if (d2 != null) {
                d2.mo29510b(list.get(i).mo9215k());
            }
            if (b != null) {
                b.mo29528a(16842960);
            }
            if (m45867s() == null || m45867s().size() != 1) {
                if ((m45873v() != null && m45873v().mo9215k() == list.get(i).mo9215k()) || m45792L() == 3 || m45792L() == 6) {
                    m45866r0(true);
                }
                if (m45873v() != null && m45873v().mo9215k() == list.get(i).mo9215k()) {
                    m45832d0();
                }
                m45838f0(list.get(i).mo9215k());
            } else {
                context.sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.clean_list").setPackage(C8345u.m46327h().getPackageName()));
                context.sendBroadcast(new Intent(C8311c.f34738e).setPackage(C8345u.m46327h().getPackageName()));
                context.sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.detail_update_page").setPackage(C8345u.m46327h().getPackageName()));
            }
        }
        context.sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.state.action").setPackage(C8345u.m46327h().getPackageName()));
        context.sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.android.intent.action.ui.recent.fragment.action").setPackage(C8345u.m46327h().getPackageName()));
        return true;
    }

    /* renamed from: m0 */
    public static void m45856m0(int i) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27181g0(i);
        }
    }

    /* renamed from: n */
    public static String m45857n(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            Log.e("VersionInfo", "Exception", e);
            return "0.0.0";
        }
    }

    /* renamed from: n0 */
    public static void m45858n0(boolean z) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27183h0(z);
        }
    }

    /* renamed from: o */
    public static long m45859o() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            return cVar.mo27190n();
        }
        return 0;
    }

    /* renamed from: o0 */
    private static void m45860o0(int i) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27185j0(i);
        }
    }

    /* renamed from: p */
    public static String m45861p() {
        MusicService.C7064c cVar = f34684a;
        return cVar != null ? cVar.mo27192o() : BuildConfig.FLAVOR;
    }

    /* renamed from: p0 */
    public static void m45862p0(int i) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27185j0(i);
        }
    }

    /* renamed from: q */
    public static int m45863q() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            return cVar.mo27194p();
        }
        return 0;
    }

    /* renamed from: q0 */
    public static void m45864q0(Music music) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27187k0(music);
        }
    }

    /* renamed from: r */
    public static double m45865r() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            return cVar.mo27196q();
        }
        return 0.0d;
    }

    /* renamed from: r0 */
    public static void m45866r0(boolean z) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27188l0(z);
        }
    }

    /* renamed from: s */
    public static List<Music> m45867s() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            return cVar.mo27144H();
        }
        return null;
    }

    /* renamed from: s0 */
    public static void m45868s0() {
        if (C8345u.m46327h() != null && !BaseApplication.f31144G) {
            new C8337n(C8345u.m46327h()).mo30164W1();
            BaseApplication.f31144G = true;
        }
    }

    /* renamed from: t */
    public static List<Music> m45869t() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            return cVar.mo27146I();
        }
        return null;
    }

    /* renamed from: t0 */
    public static void m45870t0(C8337n nVar, SeekBar seekBar, SeekBar seekBar2) {
        float P0 = nVar.mo30135P0();
        float I0 = nVar.mo30107I0();
        seekBar.setProgress((int) (P0 + ((float) (seekBar.getMax() / 2))));
        seekBar2.setProgress((int) (I0 - 30870.0f));
    }

    /* renamed from: u */
    public static double m45871u() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            return cVar.mo27198r();
        }
        return 0.0d;
    }

    /* renamed from: u0 */
    public static void m45872u0(int i) {
        if (C8345u.m46327h() != null) {
            C8337n.m46065k0(C8345u.m46327h()).mo30168X1(i);
            BaseApplication.f31150n = i;
        }
    }

    /* renamed from: v */
    public static Music m45873v() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            return cVar.mo27200s();
        }
        return null;
    }

    /* renamed from: v0 */
    public static void m45874v0(int i) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27189m0(i);
        }
    }

    /* renamed from: w */
    public static String m45875w() {
        MusicService.C7064c cVar = f34684a;
        return cVar != null ? cVar.mo27202t() : BuildConfig.FLAVOR;
    }

    /* renamed from: w0 */
    public static void m45876w0(List<Music> list) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27191n0(list);
        }
    }

    /* renamed from: x */
    public static boolean m45877x() {
        if (C8345u.m46327h() != null) {
            return new C8337n(C8345u.m46327h()).mo30166X();
        }
        return BaseApplication.f31144G;
    }

    /* renamed from: x0 */
    public static void m45878x0(boolean z) {
        if (!z) {
            m45850j0();
        } else {
            m45839f1();
        }
    }

    /* renamed from: y */
    public static int m45879y(int i) {
        if (C8345u.m46327h() != null) {
            return C8337n.m46065k0(C8345u.m46327h()).mo30170Y(i);
        }
        return BaseApplication.f31150n;
    }

    /* renamed from: y0 */
    public static void m45880y0(boolean z) {
        if (C8345u.m46327h() != null) {
            new C8337n(C8345u.m46327h()).mo30195d2(z);
            BaseApplication.f31156t = z;
        }
    }

    /* renamed from: z */
    public static int m45881z() {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            return cVar.mo27205v();
        }
        return BaseApplication.f31151o;
    }

    /* renamed from: z0 */
    public static void m45882z0(long[] jArr) {
        MusicService.C7064c cVar = f34684a;
        if (cVar != null) {
            cVar.mo27193o0(jArr);
        }
    }
}
