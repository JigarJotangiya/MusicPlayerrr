package coocent.music.player.activity;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.p003d.C0524f;
import androidx.recyclerview.widget.C0916y;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemDragListener;
import coocent.music.player.adapter.SoundEffectListAdapter;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.mode.SoundEffect;
import coocent.music.player.widget.C7193j;
import coocent.music.player.widget.DeepDefaultTitle;
import coocent.music.player.widget.p275k.C7247r0;
import coocent.musiclibrary.music.model.C7408a;
import coocent.musiclibrary.music.p284e.C7332e;
import coocent.musiclibrary.music.p292j.C7397j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p346c.C7960m;
import p342g.p343a.p344a.p346c.C7963p;
import p342g.p343a.p344a.p346c.C7970w;
import p342g.p343a.p344a.p347d.C7972b;
import p342g.p343a.p344a.p347d.C7976f;
import p342g.p343a.p344a.p348e.C7998m;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8333k;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class SoundEffectListActivity extends AnimationActivity implements C7963p, C7960m {

    /* renamed from: U */
    public static int f30849U = 90;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public List<SoundEffect> f30850A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public RecyclerView f30851B;

    /* renamed from: C */
    private SoundEffectListAdapter f30852C;

    /* renamed from: D */
    private final float[] f30853D = {-6.5f, -6.5f, -6.5f, -6.5f, -6.5f, 1.2f, 1.2f, 1.2f, 1.2f, 1.2f};

    /* renamed from: E */
    private final float[] f30854E = {1.2f, 1.2f, 1.2f, 1.2f, 1.2f, -6.5f, -6.5f, -6.5f, -6.5f, -6.5f};

    /* renamed from: F */
    private C6918e f30855F;

    /* renamed from: G */
    private RelativeLayout f30856G;

    /* renamed from: H */
    private int f30857H = -1;

    /* renamed from: I */
    private Vibrator f30858I;

    /* renamed from: J */
    private boolean f30859J = false;

    /* renamed from: K */
    private C7247r0 f30860K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public int f30861L = -1;

    /* renamed from: M */
    public List<C7408a> f30862M = null;

    /* renamed from: N */
    private C7972b f30863N;

    /* renamed from: O */
    private C6919f f30864O;

    /* renamed from: P */
    private TextView f30865P;

    /* renamed from: Q */
    private TextView f30866Q;

    /* renamed from: R */
    private ImageView f30867R;

    /* renamed from: S */
    private RelativeLayout f30868S;

    /* renamed from: T */
    OnItemDragListener f30869T = new C6914a();

    /* renamed from: z */
    private DeepDefaultTitle f30870z;

    /* renamed from: coocent.music.player.activity.SoundEffectListActivity$a */
    class C6914a implements OnItemDragListener {
        C6914a() {
        }

        public void onItemDragEnd(RecyclerView.C0792c0 c0Var, int i) {
            SoundEffectListActivity.this.m39607r2();
        }

        public void onItemDragMoving(RecyclerView.C0792c0 c0Var, int i, RecyclerView.C0792c0 c0Var2, int i2) {
            ((C0916y) SoundEffectListActivity.this.f30851B.getItemAnimator()).mo5428V(true);
        }

        public void onItemDragStart(RecyclerView.C0792c0 c0Var, int i) {
        }
    }

    /* renamed from: coocent.music.player.activity.SoundEffectListActivity$b */
    class C6915b implements Runnable {
        C6915b() {
        }

        public void run() {
            C7976f.m43669g(SoundEffectListActivity.this).mo29521d();
            C7976f.m43669g(SoundEffectListActivity.this).mo29519b(SoundEffectListActivity.this.f30850A);
        }
    }

    /* renamed from: coocent.music.player.activity.SoundEffectListActivity$c */
    class C6916c extends C7970w {
        C6916c() {
        }

        /* renamed from: d */
        public void mo26785d() {
            super.mo26785d();
            SoundEffectListActivity.this.m39609t2(0, -1);
        }

        /* renamed from: t */
        public void mo26591t() {
            SoundEffectListActivity.this.m39610u2();
        }
    }

    /* renamed from: coocent.music.player.activity.SoundEffectListActivity$d */
    class C6917d implements C7332e.C7334b {

        /* renamed from: a */
        final /* synthetic */ C7332e f30874a;

        C6917d(C7332e eVar) {
            this.f30874a = eVar;
        }

        /* renamed from: a */
        public void mo26720a() {
            this.f30874a.dismiss();
        }

        /* renamed from: b */
        public void mo26721b() {
            if (SoundEffectListActivity.this.f30850A != null && SoundEffectListActivity.this.f30861L >= 0 && SoundEffectListActivity.this.f30861L < SoundEffectListActivity.this.f30850A.size() && SoundEffectListActivity.this.f30850A.get(SoundEffectListActivity.this.f30861L) != null) {
                int C = ((SoundEffect) SoundEffectListActivity.this.f30850A.get(SoundEffectListActivity.this.f30861L)).mo26991C();
                if (C7976f.m43669g(SoundEffectListActivity.this).mo29520c(C)) {
                    if (C8337n.m46065k0(SoundEffectListActivity.this).mo30123M0() == C) {
                        SoundEffectListActivity.this.m39571E2();
                        C8337n.m46065k0(SoundEffectListActivity.this).mo30105H2(0);
                    }
                    SoundEffectListActivity.this.mo26783q2();
                }
            }
            this.f30874a.dismiss();
        }

        /* renamed from: c */
        public void mo26722c() {
        }
    }

    /* renamed from: coocent.music.player.activity.SoundEffectListActivity$e */
    private static final class C6918e extends AsyncTask<Void, Void, List<SoundEffect>> {

        /* renamed from: a */
        WeakReference<SoundEffectListActivity> f30876a;

        public C6918e(SoundEffectListActivity soundEffectListActivity) {
            this.f30876a = new WeakReference<>(soundEffectListActivity);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<SoundEffect> doInBackground(Void... voidArr) {
            SoundEffectListActivity soundEffectListActivity = (SoundEffectListActivity) this.f30876a.get();
            if (soundEffectListActivity != null) {
                return C7976f.m43669g(soundEffectListActivity).mo29523f();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(List<SoundEffect> list) {
            super.onPostExecute(list);
            SoundEffectListActivity soundEffectListActivity = (SoundEffectListActivity) this.f30876a.get();
            if (soundEffectListActivity != null) {
                soundEffectListActivity.m39592Z2(list);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* renamed from: coocent.music.player.activity.SoundEffectListActivity$f */
    private class C6919f extends BroadcastReceiver {
        private C6919f() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.WAKEUP.EXIT")) {
                SoundEffectListActivity.this.finish();
            }
        }

        /* synthetic */ C6919f(SoundEffectListActivity soundEffectListActivity, C6914a aVar) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public /* synthetic */ void mo26779C2(View view) {
        mo26782p2();
    }

    /* renamed from: D2 */
    private void m39570D2() {
        sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.sound_effect_notify"));
        mo26781d2();
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public void m39571E2() {
        m39572F2(-1);
        for (int i = 0; i < this.f30850A.size(); i++) {
            ((SoundEffect) this.f30852C.getItem(i)).mo27029j0(false);
            ((SoundEffect) this.f30852C.getItem(i)).mo27045r0(false);
        }
        m39582P2((SoundEffect) null, -1);
    }

    /* renamed from: F2 */
    private void m39572F2(int i) {
        if (i != 0) {
            C8287e.m45852k0();
            C8337n.m46065k0(this).mo30270w2(false);
        }
        if (i != 1) {
            C8287e.m45854l0();
            C8337n.m46065k0(this).mo30278y2(false);
        }
        C8287e.m45850j0();
        C8337n.m46065k0(this).mo30229m1(false);
        C8337n.m46065k0(this).mo30144R1(false);
        C8337n.m46065k0(this).mo30246q2(false);
        C8337n.m46065k0(this).mo30238o2(false);
        C8337n.m46065k0(this).mo30148S1(38);
        C8337n.m46065k0(this).mo30101G2(-1);
        C8337n.m46065k0(this).mo30085C2(13230);
        C8337n.m46065k0(this).mo30129N2(30);
        if (C8337n.m46065k0(this).mo30127N0()) {
            C8337n.m46065k0(this).mo30242p2((float) ((int) (((((float) 15) * 0.02f) - 1.0f) * 10.0f)));
            C8287e.m45779E0(0.0f);
        } else if (C8337n.m46065k0(this).mo30131O0()) {
            C8337n.m46065k0(this).mo30242p2((float) ((int) (((((float) 36) * 0.02f) - 1.0f) * 10.0f)));
            C8287e.m45779E0(0.0f);
        }
        C8287e.m45775C0(0.0f);
        C8337n.m46065k0(this).mo30234n2(0.0f);
        C8287e.m45779E0(0.0f);
        C8337n.m46065k0(this).mo30242p2(0.0f);
        C8287e.m45809T0(0.8f);
        C8337n.m46065k0(this).mo30182a3(false);
        this.f30857H = -1;
    }

    /* renamed from: G2 */
    private void m39573G2(SoundEffect soundEffect) {
        int i = this.f30857H;
        if (i == 0) {
            m39576J2();
        } else if (i == 1) {
            m39576J2();
            m39577K2();
        } else if (i == 2) {
            m39574H2();
        } else if (i == 3) {
            m39578L2();
        } else if (i == 4) {
            if (!C8337n.m46065k0(this).mo30127N0()) {
                C8337n.m46065k0(this).mo30148S1(40);
                C8337n.m46065k0(this).mo30144R1(true);
                C8337n.m46065k0(this).mo30148S1(40);
            }
        } else if (i == 5) {
            if (!C8337n.m46065k0(this).mo30131O0()) {
                C8337n.m46065k0(this).mo30148S1(33);
                C8337n.m46065k0(this).mo30144R1(true);
                C8337n.m46065k0(this).mo30148S1(33);
            }
        } else if (i > 5) {
            m39575I2(soundEffect);
        }
        C8337n.m46065k0(this).mo30101G2(i);
    }

    /* renamed from: H2 */
    private void m39574H2() {
        C8337n.m46065k0(this).mo30185b1(this.f30854E[0] * 1000.0f);
        C8337n.m46065k0(this).mo30194d1(this.f30854E[1] * 1000.0f);
        C8337n.m46065k0(this).mo30198e1(this.f30854E[2] * 1000.0f);
        C8337n.m46065k0(this).mo30202f1(this.f30854E[3] * 1000.0f);
        C8337n.m46065k0(this).mo30206g1(this.f30854E[4] * 1000.0f);
        C8337n.m46065k0(this).mo30210h1(this.f30854E[5] * 1000.0f);
        C8337n.m46065k0(this).mo30214i1(this.f30854E[6] * 1000.0f);
        C8337n.m46065k0(this).mo30218j1(this.f30854E[7] * 1000.0f);
        C8337n.m46065k0(this).mo30221k1(this.f30854E[8] * 1000.0f);
        C8337n.m46065k0(this).mo30190c1(this.f30854E[9] * 1000.0f);
        C8337n.m46065k0(this).mo30233n1(-1);
        C8337n.m46065k0(this).mo30229m1(true);
    }

    /* renamed from: I2 */
    private void m39575I2(SoundEffect soundEffect) {
        if (soundEffect.mo26991C() >= 0 && soundEffect.mo26991C() != Integer.MAX_VALUE) {
            C8337n.m46065k0(this).mo30185b1(soundEffect.mo27023g());
            C8337n.m46065k0(this).mo30194d1(soundEffect.mo27027i());
            C8337n.m46065k0(this).mo30198e1(soundEffect.mo27028j());
            C8337n.m46065k0(this).mo30202f1(soundEffect.mo27030k());
            C8337n.m46065k0(this).mo30206g1(soundEffect.mo27032l());
            C8337n.m46065k0(this).mo30210h1(soundEffect.mo27034m());
            C8337n.m46065k0(this).mo30214i1(soundEffect.mo27036n());
            C8337n.m46065k0(this).mo30218j1(soundEffect.mo27038o());
            C8337n.m46065k0(this).mo30221k1(soundEffect.mo27040p());
            C8337n.m46065k0(this).mo30190c1(soundEffect.mo27025h());
            C8337n.m46065k0(this).mo30233n1(soundEffect.mo27048t());
            boolean z = false;
            C8337n.m46065k0(this).mo30229m1(soundEffect.mo27042q() == 1);
            boolean z2 = soundEffect.mo26994G() == 1;
            C8337n.m46065k0(this).mo30144R1(z2);
            if (z2) {
                if (soundEffect.mo26995I() != 54) {
                    C8337n.m46065k0(this).mo30169X2((float) soundEffect.mo26993F());
                    C8337n.m46065k0(this).mo30165W2((float) soundEffect.mo26990B());
                    C8337n.m46065k0(this).mo30148S1(soundEffect.mo26995I());
                } else {
                    C8337n.m46065k0(this).mo30125M2((float) soundEffect.mo26993F());
                    C8337n.m46065k0(this).mo30089D2((float) soundEffect.mo26990B());
                    C8337n.m46065k0(this).mo30148S1(soundEffect.mo26995I());
                }
            }
            boolean z3 = soundEffect.mo26989A() == 1;
            C8337n.m46065k0(this).mo30278y2(z3);
            float z4 = (float) soundEffect.mo27061z();
            if (z3) {
                C8337n.m46065k0(this).mo30249r1(z4);
            }
            boolean z5 = soundEffect.mo27059y() == 1;
            C8337n.m46065k0(this).mo30270w2(z5);
            float x = (float) soundEffect.mo27057x();
            if (z5) {
                C8337n.m46065k0(this).mo30245q1(x);
            }
            boolean z6 = soundEffect.mo27016d() == 1;
            C8337n.m46065k0(this).mo30238o2(z6);
            float b = soundEffect.mo27013b();
            if (z6) {
                C8337n.m46065k0(this).mo30234n2(b);
            }
            boolean z7 = soundEffect.mo27054w() == 1;
            C8337n.m46065k0(this).mo30246q2(z7);
            float v = (float) soundEffect.mo27052v();
            if (z7) {
                C8337n.m46065k0(this).mo30242p2(v);
            }
            if (soundEffect.mo26997L() == 1) {
                z = true;
            }
            if (z) {
                C8337n.m46065k0(this).mo30182a3(z);
            }
        }
    }

    /* renamed from: J2 */
    private void m39576J2() {
        C8337n.m46065k0(this).mo30245q1(60.0f);
        C8337n.m46065k0(this).mo30270w2(true);
    }

    /* renamed from: K2 */
    private void m39577K2() {
        float R = C8337n.m46065k0(this).mo30142R();
        C8337n.m46065k0(this).mo30249r1(R);
        C8337n.m46065k0(this).mo30278y2(true);
        C8337n.m46065k0(this).mo30282z2(R);
    }

    /* renamed from: L2 */
    private void m39578L2() {
        C8337n.m46065k0(this).mo30185b1(this.f30853D[0] * 1000.0f);
        C8337n.m46065k0(this).mo30194d1(this.f30853D[1] * 1000.0f);
        C8337n.m46065k0(this).mo30198e1(this.f30853D[2] * 1000.0f);
        C8337n.m46065k0(this).mo30202f1(this.f30853D[3] * 1000.0f);
        C8337n.m46065k0(this).mo30206g1(this.f30853D[4] * 1000.0f);
        C8337n.m46065k0(this).mo30210h1(this.f30853D[5] * 1000.0f);
        C8337n.m46065k0(this).mo30214i1(this.f30853D[6] * 1000.0f);
        C8337n.m46065k0(this).mo30218j1(this.f30853D[7] * 1000.0f);
        C8337n.m46065k0(this).mo30221k1(this.f30853D[8] * 1000.0f);
        C8337n.m46065k0(this).mo30190c1(this.f30853D[9] * 1000.0f);
        C8337n.m46065k0(this).mo30233n1(-1);
        C8337n.m46065k0(this).mo30229m1(true);
    }

    /* renamed from: M2 */
    private void m39579M2(SoundEffect soundEffect) {
        if ((C8337n.m46065k0(this).mo30119L0() == -1) || this.f30857H != soundEffect.mo26991C()) {
            m39580N2(soundEffect);
            return;
        }
        m39571E2();
        this.f30852C.notifyDataSetChanged();
    }

    /* renamed from: N2 */
    private void m39580N2(SoundEffect soundEffect) {
        m39572F2(soundEffect.mo26991C());
        if (soundEffect.mo26991C() == 0) {
            C8287e.m45787I0(0.1f, true);
            C8337n.m46065k0(this).mo30270w2(true);
        } else if (soundEffect.mo26991C() == 1) {
            C8287e.m45787I0(0.1f, true);
            C8287e.m45789J0((C8337n.m46065k0(this).mo30142R() / 300.0f) * 100.0f * 0.01f, true);
        } else if (soundEffect.mo26991C() == 2) {
            m39581O2();
        } else if (soundEffect.mo26991C() == 3) {
            m39585S2();
        } else if (soundEffect.mo26991C() == 4) {
            if (C8337n.m46065k0(this).mo30127N0()) {
                C8337n.m46065k0(this).mo30113J2(false);
                m39605n2((int) C8337n.m46065k0(this).mo30146S());
            } else {
                C8337n.m46065k0(this).mo30144R1(true);
            }
        } else if (soundEffect.mo26991C() == 5) {
            if (C8337n.m46065k0(this).mo30131O0()) {
                C8337n.m46065k0(this).mo30109I2(false);
                m39606o2((int) C8337n.m46065k0(this).mo30150T());
            } else {
                C8337n.m46065k0(this).mo30144R1(true);
            }
        } else if (soundEffect.mo26991C() > 5) {
            m39587U2(soundEffect);
        }
        this.f30857H = soundEffect.mo26991C();
        for (int i = 0; i < this.f30850A.size(); i++) {
            if (this.f30857H == this.f30850A.get(i).mo26991C()) {
                ((SoundEffect) this.f30852C.getItem(i)).mo27029j0(true);
            } else {
                ((SoundEffect) this.f30852C.getItem(i)).mo27029j0(false);
                ((SoundEffect) this.f30852C.getItem(i)).mo27045r0(false);
            }
        }
        this.f30852C.notifyDataSetChanged();
        m39588V2();
        C8337n.m46065k0(this).mo30101G2(soundEffect.mo26991C());
        C8337n.m46065k0(this).mo30105H2(soundEffect.mo26991C());
        m39573G2(soundEffect);
    }

    /* renamed from: O2 */
    private void m39581O2() {
        for (int i = 0; i < 10; i++) {
            C8287e.m45777D0(i, this.f30854E[i]);
            C8287e.m45836e1(i, this.f30854E[i] * 1000.0f);
        }
        C8287e.m45839f1();
    }

    /* renamed from: P2 */
    private void m39582P2(SoundEffect soundEffect, int i) {
        if (soundEffect != null) {
            i = soundEffect.mo26991C();
        }
        if (i != Integer.MAX_VALUE) {
            switch (i) {
                case -1:
                    this.f30865P.setText(getResources().getString(R.string.music_eq_cast_tracks_chooser_dialog_none));
                    break;
                case 0:
                    this.f30865P.setText(getResources().getString(R.string.reverse3d));
                    break;
                case 1:
                    this.f30865P.setText(getResources().getString(R.string.rotate3d));
                    break;
                case 2:
                    this.f30865P.setText(getResources().getString(R.string.megabass));
                    break;
                case 3:
                    this.f30865P.setText(getResources().getString(R.string.purevvoice));
                    break;
                case 4:
                    this.f30865P.setText(getResources().getString(R.string.tonehigh));
                    break;
                case 5:
                    this.f30865P.setText(getResources().getString(R.string.tonelow));
                    break;
                default:
                    if (soundEffect != null) {
                        this.f30865P.setText(soundEffect.mo26992D());
                        break;
                    }
                    break;
            }
        } else {
            this.f30865P.setText(getResources().getString(R.string.customize));
        }
        if (i == -1) {
            this.f30868S.setBackground(C0524f.m3225f(getResources(), R.drawable.item_sound_bg_shape, (Resources.Theme) null));
        } else {
            this.f30868S.setBackground(C0524f.m3225f(getResources(), R.drawable.item_sound_current_use_bg_shape, (Resources.Theme) null));
        }
    }

    /* renamed from: Q2 */
    private void m39583Q2() {
        boolean z = true;
        if (!(this.f30850A == null || this.f30852C == null)) {
            for (int i = 0; i < this.f30850A.size(); i++) {
                if (this.f30850A.get(i).mo26991C() == this.f30857H) {
                    this.f30850A.get(i).mo27029j0(true);
                    int i2 = this.f30857H;
                    if (i2 == -1 || i2 == Integer.MAX_VALUE) {
                        m39582P2((SoundEffect) null, i2);
                    } else {
                        m39582P2(this.f30850A.get(i), this.f30857H);
                    }
                } else {
                    this.f30850A.get(i).mo27029j0(false);
                    this.f30850A.get(i).mo27045r0(false);
                    m39582P2((SoundEffect) null, this.f30857H);
                }
            }
            this.f30852C.notifyDataSetChanged();
        }
        if (this.f30857H != -1) {
            z = false;
        }
        m39586T2(z);
    }

    /* renamed from: R2 */
    private void m39584R2(float[] fArr) {
        for (int i = 0; i < 10; i++) {
            float f = (((float) ((int) (((fArr[i] / 1000.0f) + 15.0f) / 0.3f))) * 0.3f) - 15.0f;
            C8287e.m45777D0(i, f);
            C8287e.m45836e1(i, f * 1000.0f);
        }
    }

    /* renamed from: S2 */
    private void m39585S2() {
        for (int i = 0; i < 10; i++) {
            C8287e.m45777D0(i, this.f30853D[i]);
            C8287e.m45836e1(i, this.f30853D[i] * 1000.0f);
        }
        C8287e.m45839f1();
    }

    /* renamed from: T2 */
    private void m39586T2(boolean z) {
    }

    /* renamed from: U2 */
    private void m39587U2(SoundEffect soundEffect) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        float f;
        float f2;
        boolean z3 = false;
        boolean z4 = soundEffect.mo27042q() != 0;
        int O = soundEffect.mo26991C() == Integer.MAX_VALUE ? C8337n.m46065k0(this).mo30130O() : soundEffect.mo27048t();
        soundEffect.mo27026h0(O);
        if (z4) {
            float[] fArr = null;
            if (O >= 0) {
                fArr = this.f30862M.get(O).mo28249c();
            }
            m39584R2(new float[]{soundEffect.mo26991C() == Integer.MAX_VALUE ? O >= 0 ? fArr[0] : C8337n.m46065k0(this).mo30208h() : soundEffect.mo27023g(), soundEffect.mo26991C() == Integer.MAX_VALUE ? O >= 0 ? fArr[1] : C8337n.m46065k0(this).mo30216j() : soundEffect.mo27027i(), soundEffect.mo26991C() == Integer.MAX_VALUE ? O >= 0 ? fArr[2] : C8337n.m46065k0(this).mo30220k() : soundEffect.mo27028j(), soundEffect.mo26991C() == Integer.MAX_VALUE ? O >= 0 ? fArr[3] : C8337n.m46065k0(this).mo30223l() : soundEffect.mo27030k(), soundEffect.mo26991C() == Integer.MAX_VALUE ? O >= 0 ? fArr[4] : C8337n.m46065k0(this).mo30227m() : soundEffect.mo27032l(), soundEffect.mo26991C() == Integer.MAX_VALUE ? O >= 0 ? fArr[5] : C8337n.m46065k0(this).mo30231n() : soundEffect.mo27034m(), soundEffect.mo26991C() == Integer.MAX_VALUE ? O >= 0 ? fArr[6] : C8337n.m46065k0(this).mo30235o() : soundEffect.mo27036n(), soundEffect.mo26991C() == Integer.MAX_VALUE ? O >= 0 ? fArr[7] : C8337n.m46065k0(this).mo30239p() : soundEffect.mo27038o(), soundEffect.mo26991C() == Integer.MAX_VALUE ? O >= 0 ? fArr[8] : C8337n.m46065k0(this).mo30243q() : soundEffect.mo27040p(), soundEffect.mo26991C() == Integer.MAX_VALUE ? O >= 0 ? fArr[9] : C8337n.m46065k0(this).mo30212i() : soundEffect.mo27025h()});
        } else {
            C8287e.m45839f1();
        }
        boolean G = soundEffect.mo26991C() == Integer.MAX_VALUE ? C8337n.m46065k0(this).mo30098G() : soundEffect.mo26994G() == 1;
        if (G) {
            boolean z5 = (soundEffect.mo26991C() == Integer.MAX_VALUE ? C8337n.m46065k0(this).mo30151T0() : soundEffect.mo26995I()) != 54;
            if (soundEffect.mo26991C() == Integer.MAX_VALUE) {
                f = z5 ? C8337n.m46065k0(this).mo30135P0() : C8337n.m46065k0(this).mo30163W0();
            } else {
                f = (float) soundEffect.mo26993F();
            }
            if (soundEffect.mo26991C() == Integer.MAX_VALUE) {
                f2 = z5 ? C8337n.m46065k0(this).mo30107I0() : C8337n.m46065k0(this).mo30159V0();
            } else {
                f2 = (float) soundEffect.mo26990B();
            }
            C8287e.m45803Q0(f);
            C8287e.m45797N0(f2);
        }
        C8337n.m46065k0(this).mo30144R1(G);
        boolean x = soundEffect.mo26991C() == Integer.MAX_VALUE ? C8337n.m46065k0(this).mo30271x() : soundEffect.mo26989A() == 1;
        C8337n.m46065k0(this).mo30278y2(x);
        float C0 = soundEffect.mo26991C() == Integer.MAX_VALUE ? C8337n.m46065k0(this).mo30083C0() : (float) soundEffect.mo27061z();
        if (x) {
            i = 1;
            C8287e.m45789J0(((C0 * 100.0f) / 332.0f) * 0.01f, true);
        } else {
            i = 1;
        }
        boolean w = soundEffect.mo26991C() == Integer.MAX_VALUE ? C8337n.m46065k0(this).mo30267w() : soundEffect.mo27059y() == i;
        C8337n.m46065k0(this).mo30270w2(w);
        float z0 = soundEffect.mo26991C() == Integer.MAX_VALUE ? C8337n.m46065k0(this).mo30280z0() : (float) soundEffect.mo27057x();
        if (w) {
            int i3 = (int) ((z0 * 20.0f) / 332.0f);
            i2 = 1;
            C8287e.m45787I0((float) (i3 > 3 ? Math.log(((double) i3) / 20.0d) * 20.0d : -96.0d), true);
        } else {
            i2 = 1;
        }
        if (soundEffect.mo26991C() == Integer.MAX_VALUE) {
            z = C8337n.m46065k0(this).mo30259u();
        } else {
            z = soundEffect.mo27016d() == i2;
        }
        C8337n.m46065k0(this).mo30238o2(z);
        float p0 = soundEffect.mo26991C() == Integer.MAX_VALUE ? C8337n.m46065k0(this).mo30240p0() : soundEffect.mo27013b();
        if (z) {
            C8287e.m45775C0(p0);
        }
        if (soundEffect.mo26991C() == Integer.MAX_VALUE) {
            z2 = C8337n.m46065k0(this).mo30263v();
        } else {
            z2 = soundEffect.mo27054w() == 1;
        }
        C8337n.m46065k0(this).mo30246q2(z2);
        float s0 = soundEffect.mo26991C() == Integer.MAX_VALUE ? C8337n.m46065k0(this).mo30252s0() : (float) soundEffect.mo27052v();
        if (z2) {
            C8287e.m45779E0(s0);
        }
        if (soundEffect.mo26991C() == Integer.MAX_VALUE) {
            z3 = C8337n.m46065k0(this).mo30102H();
        } else if (soundEffect.mo26997L() == 1) {
            z3 = true;
        }
        C8337n.m46065k0(this).mo30182a3(z3);
        if (z3) {
            C8287e.m45809T0(1.0f);
        }
        C8287e.m45839f1();
    }

    /* renamed from: V2 */
    private void m39588V2() {
        if (C8337n.m46065k0(this).mo30167X0()) {
            this.f30858I.vibrate(new long[]{0, 5}, -1);
        }
    }

    /* renamed from: W2 */
    private void m39589W2() {
        this.f30870z.mo27431B(true, true);
        this.f30870z.setHomeIcon(false);
        this.f30870z.setSearchIcon(false);
        this.f30870z.setThemeIcon(false);
        this.f30870z.setMyText(false);
        this.f30870z.setEqIconAdd(true);
        this.f30870z.setTitleText(BuildConfig.FLAVOR);
        this.f30870z.setTitleBackgroundColor(getResources().getColor(R.color.sound_effect_bg_color));
    }

    /* renamed from: X2 */
    private void m39590X2() {
        this.f30870z.setTitleOnClickListener(new C6916c());
        this.f30852C.setOnItemChildClickListener(new C7016z0(this));
        this.f30867R.setOnClickListener(new C7014y0(this));
    }

    /* renamed from: Y2 */
    private void m39591Y2() {
        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= 21) {
            window.setNavigationBarColor(C0524f.m3223d(getResources(), R.color.sound_effect_bg_color, (Resources.Theme) null));
        }
        C7397j.m41734d(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public void m39592Z2(List<SoundEffect> list) {
        if (list != null && list.size() > 0) {
            List<SoundEffect> list2 = this.f30850A;
            if (list2 != null) {
                list2.clear();
                this.f30850A.addAll(list);
            } else {
                this.f30850A = list;
            }
            m39583Q2();
        }
    }

    /* renamed from: a3 */
    private void m39593a3() {
        C7247r0 r0Var = this.f30860K;
        if (r0Var != null) {
            r0Var.dismiss();
        }
        int g = C8345u.m46326g(R.color.color_bbb);
        int g2 = C8345u.m46326g(R.color.white);
        if (C8343s.f34788c == BaseApplication.f31140C) {
            g = C8345u.m46326g(R.color.white);
            g2 = C8345u.m46326g(R.color.skin_card_skin4_style_color);
        }
        C7332e eVar = new C7332e(this, BuildConfig.FLAVOR, getResources().getString(R.string.cancel), getResources().getString(R.string.ok), getResources().getString(R.string.delete_sound_effect), getResources().getString(R.string.delete_sound_effect_tip), C8343s.m46300h(), g, g2, false, true);
        eVar.requestWindowFeature(1);
        eVar.show();
        eVar.mo28071c(new C6917d(eVar));
    }

    /* renamed from: b3 */
    private void m39594b3() {
        int i;
        List<SoundEffect> list = this.f30850A;
        if (list != null && (i = this.f30861L) >= 0 && i < list.size() && this.f30850A.get(this.f30861L) != null) {
            C7998m k3 = C7998m.m43723k3(this.f30850A.get(this.f30861L));
            k3.mo29540l3(this);
            k3.mo3841h3(mo3730H1(), "RENAME_SOUND_EFFECT");
            C7247r0 r0Var = this.f30860K;
            if (r0Var != null) {
                r0Var.dismiss();
            }
            this.f30861L = -1;
        }
    }

    /* renamed from: c3 */
    private void m39595c3(View view, int i) {
        C7247r0 r0Var = this.f30860K;
        if (r0Var != null) {
            this.f30861L = i;
            r0Var.mo27743k(view);
        }
    }

    /* renamed from: d3 */
    private void m39596d3(SoundEffectListAdapter soundEffectListAdapter, int i) {
        boolean z = true;
        this.f30859J = true;
        List data = soundEffectListAdapter.getData();
        SoundEffect soundEffect = (SoundEffect) data.get(i);
        if (soundEffect.mo26991C() >= 0 && !soundEffect.mo26999N()) {
            m39579M2((SoundEffect) data.get(i));
        }
        int L0 = C8337n.m46065k0(this).mo30119L0();
        m39582P2(((SoundEffect) data.get(i)).mo26998M() ? (SoundEffect) data.get(i) : null, L0);
        if (L0 != -1) {
            z = false;
        }
        m39586T2(z);
    }

    /* renamed from: n2 */
    private void m39605n2(int i) {
        if (!C8337n.m46065k0(this).mo30256t0()) {
            C8337n.m46065k0(this).mo30246q2(true);
        }
        Log.e("changeToneLow", "dataDegree:" + i);
        float f = (float) ((int) (((((float) (((i + 150) * 100) / 332)) * 0.02f) - 1.0f) * 10.0f));
        C8287e.m45779E0(f);
        C8337n.m46065k0(this).mo30242p2(f);
        C8337n.m46065k0(this).mo30237o1(i);
    }

    /* renamed from: o2 */
    private void m39606o2(int i) {
        if (!C8337n.m46065k0(this).mo30256t0()) {
            C8337n.m46065k0(this).mo30246q2(true);
        }
        Log.e("changeToneLow", "dataDegree:" + i);
        float f = (float) ((int) (((((float) ((i * 100) / 332)) * 0.02f) - 1.0f) * 10.0f));
        C8287e.m45779E0(f);
        C8337n.m46065k0(this).mo30242p2(f);
        C8337n.m46065k0(this).mo30241p1(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public void m39607r2() {
        this.f30859J = true;
        new Thread(new C6915b()).start();
    }

    /* renamed from: s2 */
    private void m39608s2() {
        mo26781d2();
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public void m39609t2(int i, int i2) {
        startActivityForResult(C8333k.m46050a(this, i, i2, false), 1029);
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public void m39610u2() {
        Intent intent = new Intent();
        intent.putExtra("selectId", this.f30857H);
        intent.putExtra("needToNotify", this.f30859J);
        setResult(-1, intent);
        finish();
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: v2 */
    private void m39611v2() {
        C7972b bVar = new C7972b(C8345u.m46327h());
        this.f30863N = bVar;
        this.f30862M = bVar.mo29501c();
        this.f30858I = (Vibrator) C8345u.m46327h().getSystemService("vibrator");
        this.f30857H = C8337n.m46065k0(this).mo30119L0();
        TextView textView = this.f30866Q;
        textView.setText(this.f30866Q.getText().toString() + " :");
        if (this.f30860K == null) {
            C7247r0 r0Var = new C7247r0(this);
            this.f30860K = r0Var;
            r0Var.mo27824v();
            this.f30860K.mo27759j(this);
        }
    }

    /* renamed from: w2 */
    private void m39612w2() {
        this.f30850A = new ArrayList();
        SoundEffectListAdapter soundEffectListAdapter = new SoundEffectListAdapter(R.layout.item_sound_effect_list, this.f30850A);
        this.f30852C = soundEffectListAdapter;
        soundEffectListAdapter.setHasStableIds(true);
        ((C0916y) this.f30851B.getItemAnimator()).mo5428V(false);
        this.f30852C.setHasStableIds(false);
        this.f30851B.setAdapter(this.f30852C);
        this.f30851B.setLayoutManager(new LinearLayoutManager(this));
        this.f30851B.mo4622h(new C7193j(20));
        this.f30852C.setOnItemDragListener(this.f30869T);
    }

    /* renamed from: x2 */
    private void m39613x2() {
        this.f30864O = new C6919f(this, (C6914a) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.WAKEUP.EXIT");
        registerReceiver(this.f30864O, intentFilter);
    }

    /* renamed from: y2 */
    private void m39614y2() {
        setContentView((int) R.layout.activity_sound_effect_list);
        this.f30870z = (DeepDefaultTitle) findViewById(R.id.defualt_title);
        this.f30851B = (RecyclerView) findViewById(R.id.recylerview);
        this.f30856G = (RelativeLayout) findViewById(R.id.rl_root);
        this.f30865P = (TextView) findViewById(R.id.tv_effect_name);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.bottom_control);
        this.f30866Q = (TextView) findViewById(R.id.tv_effect_text);
        this.f30867R = (ImageView) findViewById(R.id.sound_grid);
        this.f30868S = (RelativeLayout) findViewById(R.id.rl_current_using);
        m39612w2();
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public /* synthetic */ void mo26778A2(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int id = view.getId();
        if (id == R.id.moreBtn) {
            m39595c3(view, i);
        } else if (id == R.id.tv_using) {
            m39596d3((SoundEffectListAdapter) baseQuickAdapter, i);
        }
    }

    /* renamed from: A0 */
    public void mo26500A0() {
    }

    /* renamed from: B1 */
    public void mo26501B1() {
    }

    /* renamed from: D0 */
    public void mo26780D0(int i) {
        m39570D2();
    }

    /* renamed from: G */
    public void mo26503G() {
    }

    /* renamed from: Q */
    public void mo26506Q() {
    }

    /* renamed from: R */
    public void mo26507R() {
    }

    /* renamed from: U */
    public void mo26508U() {
        m39593a3();
    }

    /* renamed from: W0 */
    public void mo26509W0() {
    }

    /* renamed from: b1 */
    public void mo26512b1() {
    }

    /* renamed from: d2 */
    public void mo26781d2() {
        C6918e eVar = this.f30855F;
        if (eVar != null && eVar.getStatus() == AsyncTask.Status.RUNNING) {
            this.f30855F.cancel(true);
            this.f30855F = null;
        }
        C6918e eVar2 = new C6918e(this);
        this.f30855F = eVar2;
        eVar2.executeOnExecutor(Executors.newCachedThreadPool(), new Void[0]);
    }

    /* renamed from: e0 */
    public void mo26513e0() {
    }

    /* renamed from: i1 */
    public void mo26514i1() {
    }

    /* renamed from: l0 */
    public void mo26515l0() {
    }

    /* renamed from: m1 */
    public void mo26516m1(ArrayList<SoundEffect> arrayList) {
        int i;
        List<SoundEffect> list = this.f30850A;
        if (list != null && (i = this.f30861L) >= 0 && i < list.size() && this.f30850A.get(this.f30861L) != null) {
            int C = this.f30850A.get(this.f30861L).mo26991C();
            if (C != this.f30857H) {
                m39580N2(this.f30850A.get(this.f30861L));
                m39582P2(this.f30850A.get(this.f30861L), this.f30850A.get(this.f30861L).mo26991C());
            }
            this.f30859J = true;
            m39609t2(1, C);
        }
    }

    /* renamed from: n1 */
    public void mo26517n1() {
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1029 && i2 == 1002) {
            if (intent != null) {
                boolean booleanExtra = intent.getBooleanExtra("save_sound_effect", false);
                int intExtra = intent.getIntExtra("addId", -1);
                this.f30857H = intExtra;
                C8337n.m46065k0(this).mo30101G2(intExtra);
                C8337n.m46065k0(this).mo30105H2(this.f30857H);
                if (booleanExtra) {
                    this.f30859J = true;
                    mo26781d2();
                    return;
                }
                this.f30859J = false;
            }
        } else if (i == 1029 && i2 == 1003 && intent != null && intent.getBooleanExtra("hadChange", false)) {
            this.f30859J = true;
            this.f30857H = Integer.MAX_VALUE;
            m39582P2((SoundEffect) null, Integer.MAX_VALUE);
            C8337n.m46065k0(this).mo30101G2(this.f30857H);
            C8337n.m46065k0(this).mo30105H2(this.f30857H);
            m39583Q2();
        }
    }

    public void onBackPressed() {
        m39610u2();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m39591Y2();
        m39614y2();
        m39611v2();
        m39589W2();
        m39590X2();
        m39608s2();
        m39613x2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C6918e eVar = this.f30855F;
        if (eVar != null) {
            eVar.cancel(true);
            this.f30855F = null;
        }
        RelativeLayout relativeLayout = this.f30856G;
        if (relativeLayout != null) {
            relativeLayout.setBackground((Drawable) null);
            this.f30856G.setBackgroundDrawable((Drawable) null);
            this.f30856G = null;
        }
        List<SoundEffect> list = this.f30850A;
        if (list != null) {
            list.clear();
            this.f30850A = null;
        }
        if (this.f30852C != null) {
            this.f30852C = null;
        }
        if (this.f30851B != null) {
            this.f30851B = null;
        }
        if (this.f30870z != null) {
            this.f30870z = null;
        }
        C7247r0 r0Var = this.f30860K;
        if (r0Var != null) {
            r0Var.mo27820m();
            this.f30860K = null;
        }
        List<C7408a> list2 = this.f30862M;
        if (list2 != null) {
            list2.clear();
            this.f30862M = null;
        }
        if (this.f30863N != null) {
            this.f30863N = null;
        }
        C6919f fVar = this.f30864O;
        if (fVar != null) {
            unregisterReceiver(fVar);
            this.f30864O = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }

    /* renamed from: p2 */
    public void mo26782p2() {
        SoundEffect soundEffect;
        int i = 0;
        boolean z = C8337n.m46065k0(this).mo30119L0() == -1;
        int M0 = C8337n.m46065k0(this).mo30123M0();
        if (!z || C8337n.m46065k0(this).mo30123M0() != -1) {
            if (z) {
                if (M0 != Integer.MAX_VALUE) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= this.f30850A.size()) {
                            break;
                        } else if (M0 == this.f30850A.get(i2).mo26991C()) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    soundEffect = this.f30850A.get(i);
                } else {
                    SoundEffect soundEffect2 = new SoundEffect();
                    soundEffect2.mo27049t0(Integer.MAX_VALUE);
                    soundEffect2.mo27026h0(C8337n.m46065k0(this).mo30130O());
                    int T0 = C8337n.m46065k0(this).mo30151T0();
                    if (T0 != 54) {
                        i = 1;
                    }
                    if (i != 0) {
                        soundEffect2.mo27053v0((int) C8337n.m46065k0(this).mo30135P0());
                        soundEffect2.mo27047s0((int) C8337n.m46065k0(this).mo30107I0());
                    } else {
                        soundEffect2.mo27053v0((int) C8337n.m46065k0(this).mo30163W0());
                        soundEffect2.mo27047s0((int) C8337n.m46065k0(this).mo30159V0());
                    }
                    soundEffect2.mo27058x0(T0);
                    soundEffect2.mo27043q0(C8337n.m46065k0(this).mo30271x() ? 1 : 0);
                    soundEffect2.mo27041p0((int) C8337n.m46065k0(this).mo30083C0());
                    soundEffect2.mo27039o0(C8337n.m46065k0(this).mo30267w() ? 1 : 0);
                    soundEffect2.mo27037n0((int) C8337n.m46065k0(this).mo30280z0());
                    soundEffect2.mo27002Q(C8337n.m46065k0(this).mo30102H() ? 1 : 0);
                    soundEffect2.mo27035m0(C8337n.m46065k0(this).mo30263v() ? 1 : 0);
                    soundEffect2.mo27033l0((int) C8337n.m46065k0(this).mo30252s0());
                    soundEffect2.mo27004S(C8337n.m46065k0(this).mo30251s());
                    soundEffect2.mo27000O(C8337n.m46065k0(this).mo30204g());
                    soundEffect2.mo27031k0(C8337n.m46065k0(this).mo30248r0());
                    soundEffect2.mo27003R(C8337n.m46065k0(this).mo30247r());
                    soundEffect = soundEffect2;
                }
                m39580N2(soundEffect);
                m39582P2(soundEffect, soundEffect.mo26991C());
            } else {
                m39571E2();
            }
            m39586T2(!z);
            this.f30852C.notifyDataSetChanged();
            sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.main_page_tempo_val"));
        }
    }

    /* renamed from: q2 */
    public void mo26783q2() {
        m39570D2();
    }

    /* renamed from: r1 */
    public void mo26518r1() {
        m39594b3();
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
