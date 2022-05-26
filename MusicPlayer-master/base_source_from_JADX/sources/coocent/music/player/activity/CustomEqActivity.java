package coocent.music.player.activity;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.core.content.p003d.C0524f;
import androidx.fragment.app.C0620p;
import androidx.fragment.app.Fragment;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.mode.SoundEffect;
import coocent.music.player.widget.DeepDefaultTitle;
import coocent.musiclibrary.music.p292j.C7397j;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.ads.AdHelper;
import net.coocent.android.xmlparser.p461z.C9566f;
import p342g.p343a.p344a.p346c.C7970w;
import p342g.p343a.p344a.p347d.C7976f;
import p342g.p343a.p344a.p348e.C7993l;
import p342g.p343a.p344a.p348e.C8002n;
import p342g.p343a.p344a.p349f.p350b.C8012b;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8340q;

public class CustomEqActivity extends AnimationActivity {

    /* renamed from: A */
    private int f30537A = -1;

    /* renamed from: B */
    private int f30538B = -1;

    /* renamed from: C */
    private boolean f30539C = false;

    /* renamed from: D */
    private View f30540D;

    /* renamed from: E */
    private ImageView f30541E;

    /* renamed from: F */
    private RelativeLayout f30542F;

    /* renamed from: G */
    private boolean f30543G = false;

    /* renamed from: H */
    private C6859c f30544H;

    /* renamed from: I */
    private View f30545I;

    /* renamed from: z */
    public DeepDefaultTitle f30546z;

    /* renamed from: coocent.music.player.activity.CustomEqActivity$a */
    class C6857a implements View.OnSystemUiVisibilityChangeListener {
        C6857a() {
        }

        public void onSystemUiVisibilityChange(int i) {
            if (i == 1) {
                CustomEqActivity.this.m38965s2(BaseApplication.f31157u);
                return;
            }
            CustomEqActivity customEqActivity = CustomEqActivity.this;
            customEqActivity.m38965s2(C9566f.m50190a(customEqActivity, 5));
        }
    }

    /* renamed from: coocent.music.player.activity.CustomEqActivity$b */
    class C6858b extends C7970w {
        C6858b() {
        }

        /* renamed from: g */
        public void mo26596g() {
            super.mo26596g();
            CustomEqActivity.this.m38962p2();
        }

        /* renamed from: h */
        public void mo26597h() {
            super.mo26597h();
            CustomEqActivity.this.m38964r2();
        }

        /* renamed from: t */
        public void mo26591t() {
            super.mo26591t();
            CustomEqActivity.this.m38956i2();
        }
    }

    /* renamed from: coocent.music.player.activity.CustomEqActivity$c */
    private class C6859c extends BroadcastReceiver {
        private C6859c() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.WAKEUP.EXIT")) {
                CustomEqActivity.this.finish();
            }
        }

        /* synthetic */ C6859c(CustomEqActivity customEqActivity, C6857a aVar) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public void m38956i2() {
        Fragment Y = mo3730H1().mo3938Y(C8012b.f33740H2);
        boolean z = false;
        if (Y != null && (Y instanceof C8012b)) {
            C8012b bVar = (C8012b) Y;
            boolean z2 = bVar.f33862v2;
            SoundEffect G4 = bVar.mo29558G4();
            C8337n.m46065k0(this).mo30225l1(G4.mo27042q() == 1);
            C8337n k0 = C8337n.m46065k0(this);
            if (G4.mo26994G() == 1) {
                z = true;
            }
            k0.mo30120L1(z);
            C8337n.m46065k0(this).mo30141Q2(G4.mo27011a());
            C8337n.m46065k0(this).mo30149S2(G4.mo27021f());
            C8337n.m46065k0(this).mo30161V2(G4.mo27050u());
            C8337n.m46065k0(this).mo30145R2(G4.mo27019e());
            z = z2;
        }
        Intent intent = new Intent();
        intent.putExtra("hadChange", z);
        setResult(1003, intent);
        finish();
    }

    /* renamed from: k2 */
    private void m38957k2(SoundEffect soundEffect) {
        C7993l.m43718i3(soundEffect, this.f30537A, this.f30538B, this.f30543G).mo3841h3(mo3730H1(), "EDIT_SOUND_EFFECT");
    }

    /* renamed from: l2 */
    private void m38958l2() {
        Intent intent = getIntent();
        if (intent != null) {
            this.f30537A = intent.getIntExtra("pageType", -1);
            this.f30538B = intent.getIntExtra("editSoundEffectId", -1);
            this.f30539C = intent.getBooleanExtra("isSystem", false);
            this.f30543G = intent.getBooleanExtra("sideBar", false);
            if (this.f30537A == -1) {
                Toast.makeText(this, R.string.error, 0).show();
                finish();
            }
        }
    }

    /* renamed from: m2 */
    private void m38959m2() {
        C8012b O4 = C8012b.m43796O4(this.f30537A, this.f30538B, this.f30539C, this.f30543G);
        C0620p i = mo3730H1().mo3957i();
        i.mo4069c(R.id.fragment, O4, C8012b.f33740H2);
        i.mo3816j();
    }

    /* renamed from: n2 */
    private void m38960n2() {
        this.f30544H = new C6859c(this, (C6857a) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.WAKEUP.EXIT");
        registerReceiver(this.f30544H, intentFilter);
    }

    /* renamed from: o2 */
    private void m38961o2() {
        setContentView((int) R.layout.activity_customeq);
        this.f30546z = (DeepDefaultTitle) findViewById(R.id.defualt_title);
        this.f30540D = findViewById(R.id.underline);
        this.f30541E = (ImageView) findViewById(R.id.ivmianbg);
        this.f30545I = findViewById(R.id.color_bg);
        this.f30542F = (RelativeLayout) findViewById(R.id.bottom_control);
        AdHelper.m49536p().mo32441b(this, (ViewGroup) findViewById(R.id.ad_layout));
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public void m38962p2() {
        Fragment Y = mo3730H1().mo3938Y(C8012b.f33740H2);
        if (Y != null && (Y instanceof C8012b)) {
            ((C8012b) Y).mo29560S4();
        }
        m38966t2(true);
    }

    /* renamed from: q2 */
    private void m38963q2(SoundEffect soundEffect) {
        C8002n.m43731i3(soundEffect, this.f30537A, this.f30543G).mo3841h3(mo3730H1(), "SAVE_SOUND_EFFECT");
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public void m38964r2() {
        Fragment Y = mo3730H1().mo3938Y(C8012b.f33740H2);
        if (Y != null && (Y instanceof C8012b)) {
            SoundEffect G4 = ((C8012b) Y).mo29558G4();
            if (G4 == null) {
                Toast.makeText(this, R.string.error, 0).show();
            } else if (!this.f30539C) {
                int i = this.f30538B;
                if (i < 0) {
                    m38963q2(G4);
                } else if (i != Integer.MAX_VALUE) {
                    m38957k2(G4);
                } else {
                    m38963q2(G4);
                }
            } else {
                m38963q2(G4);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public void m38965s2(int i) {
        RelativeLayout relativeLayout = this.f30542F;
        if (relativeLayout != null) {
            relativeLayout.setPadding(relativeLayout.getPaddingLeft(), this.f30542F.getPaddingTop(), this.f30542F.getPaddingRight(), i);
        }
    }

    /* renamed from: t2 */
    private void m38966t2(boolean z) {
        DeepDefaultTitle deepDefaultTitle = this.f30546z;
        if (deepDefaultTitle != null) {
            deepDefaultTitle.setEqSaveIcon(z);
        }
    }

    /* renamed from: u2 */
    private void m38967u2(int i) {
        Fragment Y = mo3730H1().mo3938Y(C8012b.f33740H2);
        if (Y != null && (Y instanceof C8012b)) {
            ((C8012b) Y).mo29561S5(i);
        }
    }

    /* renamed from: v2 */
    private void m38968v2() {
        if (!this.f30539C) {
            int i = this.f30538B;
            if (i < 0) {
                this.f30546z.setTitleText(getResources().getString(R.string.customize));
                m38966t2(true);
            } else if (i != Integer.MAX_VALUE) {
                SoundEffect i2 = C7976f.m43669g(this).mo29525i((long) this.f30538B);
                if (i2 != null) {
                    this.f30546z.setTitleText(i2.mo26992D());
                    m38966t2(false);
                }
            } else {
                this.f30546z.setTitleText(getResources().getString(R.string.customize));
                m38966t2(true);
            }
        } else {
            String string = getResources().getString(R.string.sound_effect);
            int i3 = this.f30538B;
            if (i3 == 0) {
                string = getResources().getString(R.string.reverse3d);
            } else if (i3 == 1) {
                string = getResources().getString(R.string.rotate3d);
            } else if (i3 == 2) {
                string = getResources().getString(R.string.megabass);
            } else if (i3 == 3) {
                string = getResources().getString(R.string.purevvoice);
            } else if (i3 == 4) {
                string = getResources().getString(R.string.tonehigh);
            } else if (i3 == 5) {
                string = getResources().getString(R.string.tonelow);
            }
            this.f30546z.setTitleText(string);
            m38966t2(false);
        }
    }

    /* renamed from: w2 */
    private void m38969w2() {
        this.f30546z.mo27431B(true, true);
        this.f30546z.setHomeIcon(false);
        this.f30546z.setSearchIcon(false);
        this.f30546z.setThemeIcon(false);
        this.f30546z.setMyText(false);
        this.f30546z.setEqIconAdd(false);
        this.f30546z.setEqResetIcon(true);
        m38968v2();
        this.f30541E.setBackgroundColor(getResources().getColor(R.color.customeqcolor));
    }

    /* renamed from: x2 */
    private void m38970x2() {
        this.f30546z.setTitleOnClickListener(new C6858b());
    }

    /* renamed from: y2 */
    private void m38971y2() {
        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= 21) {
            window.setNavigationBarColor(C0524f.m3223d(getResources(), R.color.sound_effect_bg_color, (Resources.Theme) null));
        }
        C7397j.m41734d(this);
    }

    public void finish() {
        super.finish();
        Fragment Y = mo3730H1().mo3938Y(C8012b.f33740H2);
        if (Y != null && (Y instanceof C8012b)) {
            ((C8012b) Y).mo29556D4();
        }
    }

    /* renamed from: j2 */
    public void mo26594j2(boolean z) {
        DeepDefaultTitle deepDefaultTitle;
        if (this.f30539C && z && (deepDefaultTitle = this.f30546z) != null) {
            deepDefaultTitle.setTitleText(getResources().getString(R.string.customize));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m38971y2();
        m38958l2();
        m38961o2();
        m38969w2();
        m38970x2();
        m38959m2();
        m38960n2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f30546z != null) {
            this.f30546z = null;
        }
        if (this.f30540D != null) {
            this.f30540D = null;
        }
        C8321j.m45995a(this.f30541E);
        if (this.f30542F != null) {
            this.f30542F = null;
        }
        C6859c cVar = this.f30544H;
        if (cVar != null) {
            unregisterReceiver(cVar);
            this.f30544H = null;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 25) {
            int H = C8287e.m45784H() - 1;
            if (H <= 0) {
                H = 0;
            }
            C8287e.m45801P0(H);
            m38967u2(H);
            return true;
        } else if (i == 24) {
            int H2 = C8287e.m45784H() + 1;
            if (H2 >= C8287e.m45786I()) {
                H2 = C8287e.m45786I();
            }
            C8287e.m45801P0(H2);
            m38967u2(H2);
            return true;
        } else if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        } else {
            m38956i2();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C8340q.m46288b(this, new C6857a());
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"MissingSuperCall"})
    public void onSaveInstanceState(Bundle bundle) {
    }
}
