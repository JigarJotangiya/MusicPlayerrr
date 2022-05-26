package coocent.music.player.activity;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import coocent.musiclibrary.music.p292j.C7397j;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p346c.C7958k;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8311c;
import p342g.p343a.p344a.p358i.C8314f;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.p447e.p448a.C9332d;

public class ScreenLockActivity extends BaseActivity implements C7958k {

    /* renamed from: B */
    private ImageView f30777B;

    /* renamed from: C */
    private ImageView f30778C;

    /* renamed from: D */
    private ImageView f30779D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public ImageView f30780E;

    /* renamed from: F */
    private ImageView f30781F;

    /* renamed from: G */
    private TextView f30782G;

    /* renamed from: H */
    private TextView f30783H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public TextView f30784I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public TextView f30785J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public DateFormat f30786K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public DateFormat f30787L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public SimpleDateFormat f30788M;

    /* renamed from: N */
    private Handler f30789N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public Calendar f30790O;

    /* renamed from: P */
    private C8337n f30791P;

    /* renamed from: Q */
    private C6899b f30792Q;

    /* renamed from: R */
    private final Runnable f30793R = new C6898a();

    /* renamed from: coocent.music.player.activity.ScreenLockActivity$a */
    class C6898a implements Runnable {
        C6898a() {
        }

        @SuppressLint({"SetTextI18n"})
        public void run() {
            Calendar unused = ScreenLockActivity.this.f30790O = Calendar.getInstance();
            ScreenLockActivity.this.f30784I.setText(ScreenLockActivity.this.f30787L.format(ScreenLockActivity.this.f30790O.getTime()));
            TextView u2 = ScreenLockActivity.this.f30785J;
            u2.setText(ScreenLockActivity.this.f30786K.format(ScreenLockActivity.this.f30790O.getTime()) + " " + ScreenLockActivity.this.f30788M.format(ScreenLockActivity.this.f30790O.getTime()));
            ScreenLockActivity.this.m39465K2();
        }
    }

    /* renamed from: coocent.music.player.activity.ScreenLockActivity$b */
    private class C6899b extends BroadcastReceiver {
        private C6899b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void mo26755b() {
            Drawable drawable;
            ImageView w2 = ScreenLockActivity.this.f30780E;
            if (C8287e.m45812V()) {
                drawable = C9332d.m49407d(ScreenLockActivity.this, R.drawable.lock_screen_pause_button_selector);
            } else {
                drawable = C9332d.m49407d(ScreenLockActivity.this, R.drawable.lock_screen_play_button_selector);
            }
            w2.setImageDrawable(drawable);
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if (action.equals("media.musicplayer.audioplayer.videoplayer.WAKEUP.EXIT")) {
                    ScreenLockActivity.this.finish();
                } else if (C8311c.f34738e.equals(action) && ScreenLockActivity.this.f30780E != null) {
                    new Handler().postDelayed(new C7000r0(this), 800);
                }
            }
        }

        /* synthetic */ C6899b(ScreenLockActivity screenLockActivity, C6898a aVar) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public /* synthetic */ void mo26753B2(View view) {
        int id = view.getId();
        if (id == R.id.next_btn) {
            m39457C2();
        } else if (id == R.id.play_btn) {
            m39458D2();
        } else if (id == R.id.pre_btn) {
            m39459E2();
        }
    }

    /* renamed from: C2 */
    private void m39457C2() {
        C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.next.openMusic.action").setPackage(C8345u.m46327h().getPackageName()));
    }

    /* renamed from: D2 */
    private void m39458D2() {
        C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.toggle.openMusic.pause.action").setPackage(C8345u.m46327h().getPackageName()));
    }

    /* renamed from: E2 */
    private void m39459E2() {
        C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.prve.openMusic.action").setPackage(C8345u.m46327h().getPackageName()));
    }

    /* renamed from: F2 */
    private void m39460F2() {
        if (C8287e.m45873v() != null) {
            if (this.f30791P != null) {
                C8321j.m46002h(C8314f.m45973b(this, 0, C8287e.m45873v().mo9215k(), C8287e.m45859o()), R.color.library_backgroud_color, this.f30777B);
            }
            this.f30780E.setImageDrawable(C8345u.m46329j(C8287e.m45812V() ? R.drawable.lock_screen_pause_button_selector : R.drawable.lock_screen_play_button_selector));
            this.f30782G.setText(C8287e.m45875w());
            this.f30783H.setText(C8287e.m45861p());
        }
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    /* renamed from: G2 */
    private void m39461G2() {
        this.f30778C.setImageDrawable(getResources().getDrawable(R.drawable.lock_screen_left_tips));
        ((AnimationDrawable) this.f30778C.getDrawable()).start();
    }

    /* renamed from: H2 */
    private void m39462H2() {
        m39460F2();
        m39461G2();
    }

    /* renamed from: I2 */
    private void m39463I2() {
        C6997q0 q0Var = new C6997q0(this);
        this.f30779D.setOnClickListener(q0Var);
        this.f30780E.setOnClickListener(q0Var);
        this.f30781F.setOnClickListener(q0Var);
        C8287e.m45773B0(this);
    }

    /* renamed from: J2 */
    private void m39464J2() {
        getWindow().setFlags(4718592, 4718592);
        setContentView((int) R.layout.lockscreen_activity);
        C7397j.m41734d(this);
        m39478z2();
        m39476x2();
        m39462H2();
        m39463I2();
        m39477y2();
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public void m39465K2() {
        Handler handler = this.f30789N;
        if (handler != null) {
            handler.postDelayed(this.f30793R, 1000);
        }
    }

    /* renamed from: L2 */
    private void m39466L2() {
        Handler handler = this.f30789N;
        if (handler != null) {
            handler.removeCallbacks(this.f30793R);
            this.f30789N.removeCallbacksAndMessages((Object) null);
        }
    }

    @SuppressLint({"SimpleDateFormat"})
    /* renamed from: x2 */
    private void m39476x2() {
        this.f30786K = android.text.format.DateFormat.getLongDateFormat(this);
        this.f30787L = android.text.format.DateFormat.getTimeFormat(this);
        this.f30788M = new SimpleDateFormat("E");
        if (this.f30786K == null) {
            this.f30786K = new SimpleDateFormat("MM/dd/yyyy");
        }
        this.f30789N = new Handler();
    }

    /* renamed from: y2 */
    private void m39477y2() {
        this.f30792Q = new C6899b(this, (C6898a) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.WAKEUP.EXIT");
        intentFilter.addAction(C8311c.f34738e);
        registerReceiver(this.f30792Q, intentFilter);
    }

    /* renamed from: z2 */
    private void m39478z2() {
        this.f30777B = (ImageView) findViewById(R.id.lock_screen_bg);
        this.f30784I = (TextView) findViewById(R.id.time);
        this.f30785J = (TextView) findViewById(R.id.day);
        this.f30778C = (ImageView) findViewById(R.id.img);
        this.f30779D = (ImageView) findViewById(R.id.pre_btn);
        this.f30780E = (ImageView) findViewById(R.id.play_btn);
        this.f30781F = (ImageView) findViewById(R.id.next_btn);
        this.f30782G = (TextView) findViewById(R.id.title);
        this.f30783H = (TextView) findViewById(R.id.artist);
    }

    /* renamed from: A */
    public void mo26484A() {
    }

    /* renamed from: A1 */
    public void mo26485A1(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h2 */
    public boolean mo26491h2() {
        return true;
    }

    /* renamed from: i2 */
    public Fragment mo26492i2() {
        return null;
    }

    /* renamed from: j0 */
    public void mo26493j0(boolean z) {
        m39460F2();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30791P = C8337n.m46065k0(this);
    }

    public void onDestroy() {
        super.onDestroy();
        m39466L2();
        C8321j.m45995a(this.f30777B);
        C8321j.m45995a(this.f30778C);
        C8321j.m45995a(this.f30779D);
        C8321j.m45995a(this.f30780E);
        C8321j.m45995a(this.f30781F);
        if (this.f30790O != null) {
            this.f30790O = null;
        }
        if (this.f30789N != null) {
            this.f30789N = null;
        }
        C6899b bVar = this.f30792Q;
        if (bVar != null) {
            unregisterReceiver(bVar);
            this.f30792Q = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        m39466L2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        mo26494j2();
        m39465K2();
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        super.onServiceConnected(componentName, iBinder);
        m39464J2();
        m39465K2();
    }

    /* renamed from: u1 */
    public void mo26499u1() {
    }
}
