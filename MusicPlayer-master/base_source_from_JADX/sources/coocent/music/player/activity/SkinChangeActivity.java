package coocent.music.player.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.widget.DeepDefaultTitle;
import coocent.musiclibrary.music.p292j.C7397j;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.C9490s;
import net.coocent.android.xmlparser.ads.AdHelper;
import p342g.p343a.p344a.p346c.C7970w;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;

public class SkinChangeActivity extends AnimationActivity {

    /* renamed from: A */
    private ImageView f30813A;

    /* renamed from: B */
    private LinearLayout f30814B;

    /* renamed from: C */
    private LinearLayout f30815C;

    /* renamed from: D */
    private LinearLayout f30816D;

    /* renamed from: E */
    private ImageView[] f30817E;

    /* renamed from: F */
    private ImageView f30818F;

    /* renamed from: G */
    private ImageView f30819G;

    /* renamed from: H */
    private ImageView f30820H;

    /* renamed from: I */
    private CardView f30821I;

    /* renamed from: J */
    private RelativeLayout f30822J;

    /* renamed from: K */
    private TextView f30823K;

    /* renamed from: L */
    private boolean f30824L = true;

    /* renamed from: M */
    C7970w f30825M = new C6907b();

    /* renamed from: z */
    private DeepDefaultTitle f30826z;

    /* renamed from: coocent.music.player.activity.SkinChangeActivity$a */
    class C6906a extends C9490s {
        C6906a() {
        }

        /* renamed from: e */
        public void mo26768e() {
            super.mo26768e();
            SkinChangeActivity.this.m39535z2();
        }
    }

    /* renamed from: coocent.music.player.activity.SkinChangeActivity$b */
    class C6907b extends C7970w {
        C6907b() {
        }

        /* renamed from: t */
        public void mo26591t() {
            SkinChangeActivity.this.m39522g2();
        }
    }

    /* renamed from: A2 */
    private void m39516A2() {
        int i = 0;
        this.f30826z.setOkIcon(false);
        this.f30826z.mo27431B(true, true);
        this.f30826z.setSearchIcon(false);
        if (this.f30824L) {
            this.f30826z.mo27433F();
            this.f30826z.mo27436I();
            this.f30826z.mo27430A(30);
            this.f30826z.mo27437J();
            this.f30826z.mo27438K();
        } else {
            this.f30826z.setHomeIcon(false);
        }
        this.f30826z.mo27432C();
        this.f30826z.mo27435H();
        this.f30826z.setTitleText(getResources().getString(this.f30824L ? R.string.select_skin : R.string.theme));
        this.f30826z.mo27435H();
        this.f30826z.setTitleOnClickListener(this.f30825M);
        m39534y2(C8343s.f34788c);
        TextView textView = this.f30823K;
        if (!this.f30824L) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    /* renamed from: B2 */
    private void m39517B2() {
        C7002s0 s0Var = new C7002s0(this);
        this.f30814B.setOnClickListener(s0Var);
        this.f30815C.setOnClickListener(s0Var);
        this.f30816D.setOnClickListener(s0Var);
        this.f30823K.setOnClickListener(s0Var);
    }

    /* renamed from: C2 */
    private void m39518C2() {
        if (C8343s.f34788c == BaseApplication.f31162z) {
            Window window = getWindow();
            window.getDecorView().setSystemUiVisibility(16);
            if (Build.VERSION.SDK_INT >= 21) {
                window.setNavigationBarColor(-1);
            }
        }
    }

    /* renamed from: D2 */
    public static void m39519D2(Context context) {
        Intent intent = new Intent(context, SkinChangeActivity.class);
        intent.putExtra("user_first_skin", false);
        context.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public void m39522g2() {
        C8337n.m46065k0(this).mo30157U2(false);
        if (this.f30824L) {
            startActivity(new Intent(this, LibraryActivity.class));
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        super.onBackPressed();
    }

    /* renamed from: h2 */
    private void m39523h2() {
        this.f30824L = getIntent().getBooleanExtra("user_first_skin", true);
    }

    /* renamed from: i2 */
    private void m39524i2() {
        CustomThemeActivity.m38995X2(this);
        C8337n.m46065k0(this).mo30157U2(false);
    }

    /* renamed from: j2 */
    private void m39525j2() {
        AdHelper.m49536p().mo32442c(this, (ViewGroup) findViewById(R.id.ad_layout), new C6906a());
    }

    /* renamed from: k2 */
    private void m39526k2() {
        this.f30826z = (DeepDefaultTitle) findViewById(R.id.defualt_title2);
        this.f30813A = (ImageView) findViewById(R.id.iv_theme_icon);
        this.f30814B = (LinearLayout) findViewById(R.id.ll_custom);
        this.f30815C = (LinearLayout) findViewById(R.id.ll_white);
        this.f30816D = (LinearLayout) findViewById(R.id.ll_black);
        this.f30818F = (ImageView) findViewById(R.id.iv_theme_cover1);
        this.f30819G = (ImageView) findViewById(R.id.iv_theme_cover2);
        this.f30820H = (ImageView) findViewById(R.id.rl_theme_bg);
        this.f30821I = (CardView) findViewById(R.id.rl_theme_pic);
        this.f30822J = (RelativeLayout) findViewById(R.id.rl_custom);
        this.f30823K = (TextView) findViewById(R.id.splash_start);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.layout_bottom);
        this.f30817E = new ImageView[]{(ImageView) findViewById(R.id.iv_select1), (ImageView) findViewById(R.id.iv_select2), (ImageView) findViewById(R.id.iv_select3)};
        m39535z2();
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public /* synthetic */ void mo26762m2(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.f30819G.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        this.f30819G.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public /* synthetic */ void mo26763o2(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.f30820H.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        this.f30820H.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public /* synthetic */ void mo26764q2(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.f30821I.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        this.f30821I.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public /* synthetic */ void mo26765s2(int i) {
        ViewGroup.LayoutParams layoutParams = this.f30822J.getLayoutParams();
        layoutParams.width = i + C8345u.m46323d(5);
        this.f30822J.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public /* synthetic */ void mo26766u2() {
        ViewGroup.LayoutParams layoutParams = this.f30818F.getLayoutParams();
        int height = (this.f30822J.getHeight() * 720) / 1280;
        int height2 = this.f30822J.getHeight();
        layoutParams.width = height;
        this.f30818F.setLayoutParams(layoutParams);
        this.f30819G.post(new C7006u0(this, height, height2));
        this.f30820H.post(new C7012x0(this, height, height2));
        this.f30821I.post(new C7008v0(this, height, height2));
        this.f30822J.post(new C7004t0(this, height));
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public /* synthetic */ void mo26767w2(View view) {
        switch (view.getId()) {
            case R.id.ll_black:
                m39533x2(2);
                return;
            case R.id.ll_custom:
                m39524i2();
                return;
            case R.id.ll_white:
                m39533x2(1);
                return;
            case R.id.splash_start:
                m39522g2();
                return;
            default:
                return;
        }
    }

    /* renamed from: x2 */
    private void m39533x2(int i) {
        C8343s.m46308p(i);
        m39534y2(i);
        C8337n.m46065k0(this).mo30157U2(false);
    }

    /* renamed from: y2 */
    private void m39534y2(int i) {
        int i2 = 0;
        while (true) {
            ImageView[] imageViewArr = this.f30817E;
            if (i2 >= imageViewArr.length) {
                break;
            }
            if (i == i2) {
                imageViewArr[i2].setVisibility(0);
            } else {
                imageViewArr[i2].setVisibility(4);
            }
            i2++;
        }
        if (i == 1) {
            C8321j.m46004j(2131230882, this.f30813A);
            this.f30822J.setVisibility(4);
            this.f30813A.setVisibility(0);
        } else if (i == 2) {
            C8321j.m46004j(2131230879, this.f30813A);
            this.f30822J.setVisibility(4);
            this.f30813A.setVisibility(0);
        } else {
            this.f30822J.setVisibility(0);
            this.f30813A.setVisibility(4);
            C8343s.m46307o(this.f30820H, true);
            this.f30819G.setImageDrawable(C8343s.m46312t(C8345u.m46329j(2131230881), C8343s.m46297e().mo27070c()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public void m39535z2() {
        this.f30818F.post(new C7010w0(this));
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 24 && i2 == 23 && intent != null && intent.getBooleanExtra("change_custom_theme", false)) {
            m39534y2(0);
        }
    }

    public void onBackPressed() {
        m39522g2();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C7397j.m41734d(this);
        m39523h2();
        m39518C2();
        setContentView((int) R.layout.activity_change_skin);
        m39526k2();
        m39516A2();
        m39517B2();
        if (!this.f30824L) {
            m39525j2();
        }
    }
}
