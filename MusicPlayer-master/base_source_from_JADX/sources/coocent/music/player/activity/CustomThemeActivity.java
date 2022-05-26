package coocent.music.player.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.skin.p274c.C7105c;
import coocent.music.player.widget.ColorPickerView;
import coocent.musiclibrary.music.p292j.C7397j;
import java.io.File;
import java.util.ArrayList;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.p461z.C9566f;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8340q;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8344t;
import p342g.p343a.p344a.p358i.C8345u;

public class CustomThemeActivity extends AnimationActivity {

    /* renamed from: A */
    private LinearLayout f30550A;

    /* renamed from: B */
    private LinearLayout f30551B;

    /* renamed from: C */
    private final int[] f30552C = {0, R.color.accent1, R.color.accent2, R.color.accent3, R.color.accent4, R.color.accent5, R.color.accent6, R.color.accent7, R.color.accent8, R.color.accent9, R.color.accent10, R.color.accent11, R.color.accent12, R.color.accent13, R.color.accent14, R.color.accent15, R.color.accent16, R.color.accent17, R.color.accent18};

    /* renamed from: D */
    private final int[] f30553D = {0, R.color.bg_color1, R.color.bg_color2, R.color.bg_color3, R.color.bg_color4, R.color.bg_color5};
    /* access modifiers changed from: private */

    /* renamed from: E */
    public ImageView f30554E;

    /* renamed from: F */
    private ImageView f30555F;

    /* renamed from: G */
    private ColorPickerView f30556G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public SeekBar f30557H;

    /* renamed from: I */
    float[] f30558I = new float[3];

    /* renamed from: J */
    private View f30559J;

    /* renamed from: K */
    private TextView f30560K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public ImageView f30561L;

    /* renamed from: M */
    private ImageView f30562M;

    /* renamed from: N */
    private ConstraintLayout f30563N;

    /* renamed from: O */
    private ConstraintLayout f30564O;

    /* renamed from: P */
    private SeekBar f30565P;

    /* renamed from: Q */
    private SeekBar f30566Q;

    /* renamed from: R */
    private RelativeLayout f30567R;

    /* renamed from: S */
    private ImageView f30568S;

    /* renamed from: T */
    private ImageView f30569T;

    /* renamed from: U */
    private ImageView f30570U;

    /* renamed from: V */
    private RelativeLayout f30571V;

    /* renamed from: z */
    private ImageView f30572z;

    /* renamed from: coocent.music.player.activity.CustomThemeActivity$a */
    class C6860a implements ColorPickerView.C7130a {
        C6860a() {
        }

        /* renamed from: a */
        public void mo26611a(int i) {
            Color.colorToHSV(i, CustomThemeActivity.this.f30558I);
            float f = C8343s.m46297e().mo27073f();
            float[] fArr = CustomThemeActivity.this.f30558I;
            fArr[1] = f;
            CustomThemeActivity.this.f30554E.setImageDrawable(C8343s.m46312t(C8345u.m46329j(2131230881), Color.HSVToColor(fArr)));
            CustomThemeActivity customThemeActivity = CustomThemeActivity.this;
            customThemeActivity.mo26602P2(customThemeActivity.f30557H, i);
        }

        /* renamed from: b */
        public void mo26612b(ColorPickerView colorPickerView, float f) {
            C8343s.m46297e().mo27081n(f);
        }

        /* renamed from: c */
        public void mo26613c(ColorPickerView colorPickerView, int i) {
            C8343s.m46297e().mo27078k(i);
            Color.colorToHSV(i, CustomThemeActivity.this.f30558I);
            CustomThemeActivity customThemeActivity = CustomThemeActivity.this;
            customThemeActivity.mo26602P2(customThemeActivity.f30557H, i);
            CustomThemeActivity.this.f30554E.setImageDrawable(C8343s.m46312t(C8345u.m46329j(2131230881), i));
        }

        /* renamed from: d */
        public void mo26614d(ColorPickerView colorPickerView) {
            CustomThemeActivity.this.f30557H.setProgress(CustomThemeActivity.this.f30557H.getMax());
            C8343s.m46297e().mo27082o(100.0f);
        }
    }

    /* renamed from: coocent.music.player.activity.CustomThemeActivity$b */
    class C6861b implements SeekBar.OnSeekBarChangeListener {
        C6861b() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                CustomThemeActivity.this.f30558I[1] = ((float) i) / 100.0f;
                C8343s.m46297e().mo27082o(CustomThemeActivity.this.f30558I[1]);
                int HSVToColor = Color.HSVToColor(CustomThemeActivity.this.f30558I);
                C8343s.m46297e().mo27078k(HSVToColor);
                CustomThemeActivity.this.f30554E.setImageDrawable(C8343s.m46312t(C8345u.m46329j(2131230881), HSVToColor));
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: coocent.music.player.activity.CustomThemeActivity$c */
    class C6862c implements SeekBar.OnSeekBarChangeListener {
        C6862c() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            float f = ((float) i) / 1000.0f;
            CustomThemeActivity.this.f30561L.setAlpha(f);
            C8343s.m46297e().mo27076i(f);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: coocent.music.player.activity.CustomThemeActivity$d */
    class C6863d implements SeekBar.OnSeekBarChangeListener {
        C6863d() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (!CustomThemeActivity.this.isFinishing() && C8343s.m46297e().mo27074g() != null) {
                if (i <= 1) {
                    i = 1;
                }
                C8321j.m46005k(C8343s.m46297e().mo27074g(), CustomThemeActivity.this.f30561L, CustomThemeActivity.this.f30561L.getWidth(), CustomThemeActivity.this.f30561L.getHeight(), i, 1);
                C8343s.m46297e().mo27077j((float) i);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public /* synthetic */ void mo26600C2() {
        ViewGroup.LayoutParams layoutParams = this.f30555F.getLayoutParams();
        int height = (this.f30555F.getHeight() * 720) / 1280;
        int height2 = this.f30555F.getHeight();
        layoutParams.width = height;
        this.f30555F.setLayoutParams(layoutParams);
        this.f30554E.post(new C6963f(this, height, height2));
        this.f30561L.post(new C6966g(this, height, height2));
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public /* synthetic */ void mo26601E2(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                m38994W2(false);
                return;
            case R.id.iv_close:
                m38999h2();
                return;
            case R.id.iv_done:
                m38979G2();
                return;
            case R.id.iv_reset:
                m38978F2();
                return;
            case R.id.iv_select:
            case R.id.tv_select:
                m38980H2();
                return;
            default:
                return;
        }
    }

    /* renamed from: F2 */
    private void m38978F2() {
        C8343s.m46294b();
        m38991T2();
    }

    /* renamed from: G2 */
    private void m38979G2() {
        if (C8343s.m46297e().mo27075h()) {
            Intent intent = new Intent();
            C8343s.m46309q();
            C8344t.m46316d(C8345u.m46327h(), R.string.coocent_results_page_save_complete);
            intent.putExtra("change_custom_theme", true);
            C8343s.m46308p(0);
            setResult(23, intent);
            finish();
            return;
        }
        new Thread(new C6972i(this)).start();
    }

    /* renamed from: H2 */
    private void m38980H2() {
        try {
            Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            intent.addFlags(1);
            intent.addFlags(64);
            startActivityForResult(intent, 22);
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.error, 0).show();
        }
    }

    /* renamed from: I2 */
    private void m38981I2() {
        for (int i = 0; i < this.f30552C.length; i++) {
            ImageView imageView = new ImageView(this);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C8345u.m46323d(40), C8345u.m46323d(40));
            layoutParams.setMargins(C8345u.m46323d(15), 0, 0, 0);
            layoutParams.setMarginStart(C8345u.m46323d(15));
            imageView.setLayoutParams(layoutParams);
            imageView.setOnClickListener(new C6954c(this, i));
            if (i == 0) {
                imageView.setBackground(C8345u.m46329j(2131230890));
            } else {
                imageView.setBackground(C8343s.m46312t(C8345u.m46329j(R.drawable.accent_color_shape), C8345u.m46326g(this.f30552C[i])));
            }
            this.f30550A.addView(imageView);
        }
    }

    /* renamed from: J2 */
    private void m38982J2() {
        this.f30565P.setProgress((int) (C8343s.m46297e().mo27068a() * 1000.0f));
    }

    /* renamed from: K2 */
    private void m38983K2() {
        for (int i = 0; i < this.f30553D.length; i++) {
            ImageView imageView = new ImageView(this);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C8345u.m46323d(40), C8345u.m46323d(40));
            layoutParams.setMargins(C8345u.m46323d(15), 0, 0, 0);
            layoutParams.setMarginStart(C8345u.m46323d(15));
            imageView.setLayoutParams(layoutParams);
            imageView.setOnClickListener(new C6951b(this, i));
            if (i == 0) {
                imageView.setBackgroundResource(R.drawable.accent_color_shape);
                imageView.setImageResource(R.drawable.ic_bg_add_background);
            } else {
                imageView.setBackground(C8343s.m46312t(C8345u.m46329j(R.drawable.accent_color_shape), C8345u.m46326g(this.f30553D[i])));
            }
            this.f30551B.addView(imageView);
        }
    }

    /* renamed from: L2 */
    private void m38984L2() {
        C8343s.m46307o(this.f30561L, true);
        this.f30567R.setVisibility(0);
        this.f30568S.setVisibility(4);
        this.f30554E.setImageDrawable(C8343s.m46312t(C8345u.m46329j(2131230881), C8343s.m46297e().mo27070c()));
    }

    /* renamed from: M2 */
    private void m38985M2() {
        this.f30566Q.setProgress((int) C8343s.m46297e().mo27069b());
    }

    /* renamed from: N2 */
    private void m38986N2() {
        this.f30557H.setProgress((int) (C8343s.m46297e().mo27073f() * 100.0f));
        this.f30556G.post(new C6975j(this));
    }

    /* renamed from: O2 */
    private void m38987O2(int i) {
        RelativeLayout relativeLayout = this.f30571V;
        if (relativeLayout != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.height = i;
            this.f30571V.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: Q2 */
    private void m38988Q2(int i) {
        for (int i2 = 0; i2 < this.f30552C.length; i2++) {
            ImageView imageView = (ImageView) this.f30550A.getChildAt(i2);
            if (i2 == 0) {
                if (i == 0) {
                    imageView.setImageDrawable(C8345u.m46329j(2131230891));
                } else {
                    ArrayList arrayList = new ArrayList();
                    int i3 = 1;
                    while (true) {
                        int[] iArr = this.f30552C;
                        if (i3 >= iArr.length) {
                            break;
                        }
                        arrayList.add(Integer.valueOf(C8345u.m46326g(iArr[i3])));
                        i3++;
                    }
                    if (!arrayList.contains(Integer.valueOf(i))) {
                        imageView.setImageDrawable(C8345u.m46329j(2131230891));
                    } else {
                        imageView.setImageDrawable((Drawable) null);
                    }
                }
            } else if (i == C8345u.m46326g(this.f30552C[i2])) {
                imageView.setImageDrawable(C8345u.m46329j(2131230891));
            } else {
                imageView.setImageDrawable((Drawable) null);
            }
        }
    }

    /* renamed from: R2 */
    private void m38989R2(int i) {
        for (int i2 = 0; i2 < this.f30553D.length; i2++) {
            ImageView imageView = (ImageView) this.f30551B.getChildAt(i2);
            if (i2 == 0) {
                if (C8343s.m46297e().mo27075h()) {
                    imageView.setBackgroundResource(R.drawable.accent_color_shape);
                    imageView.setImageResource(R.drawable.ic_bg_add_background);
                } else {
                    C8321j.m46003i(C8343s.m46297e().mo27074g(), imageView, C8345u.m46323d(50), C8345u.m46323d(50));
                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    imageView.setImageResource(2131230891);
                }
            } else if (!C8343s.m46297e().mo27075h()) {
                imageView.setImageDrawable((Drawable) null);
            } else if (i == C8345u.m46326g(this.f30553D[i2])) {
                imageView.setImageDrawable(C8345u.m46329j(2131230891));
            } else {
                imageView.setImageDrawable((Drawable) null);
            }
        }
        this.f30566Q.setEnabled(!C8343s.m46297e().mo27075h());
    }

    /* renamed from: S2 */
    private void m38990S2() {
        this.f30555F.post(new C6978k(this));
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    /* renamed from: T2 */
    private void m38991T2() {
        m38988Q2(C8343s.m46297e().mo27070c());
        m38989R2(C8343s.m46297e().mo27071d());
        m38990S2();
        m38982J2();
        m38985M2();
        m38986N2();
    }

    /* renamed from: U2 */
    private void m38992U2() {
        C6957d dVar = new C6957d(this);
        this.f30572z.setOnClickListener(dVar);
        this.f30560K.setOnClickListener(dVar);
        this.f30562M.setOnClickListener(dVar);
        this.f30569T.setOnClickListener(dVar);
        this.f30570U.setOnClickListener(dVar);
        this.f30568S.setOnClickListener(dVar);
        this.f30556G.setOnColorPickerChangeListener(new C6860a());
        this.f30557H.setOnSeekBarChangeListener(new C6861b());
        this.f30565P.setOnSeekBarChangeListener(new C6862c());
        this.f30566Q.setOnSeekBarChangeListener(new C6863d());
    }

    /* renamed from: V2 */
    private void m38993V2() {
        Window window = getWindow();
        window.getDecorView().setSystemUiVisibility(8208);
        if (Build.VERSION.SDK_INT >= 21) {
            window.setNavigationBarColor(-1);
        }
    }

    /* renamed from: W2 */
    private void m38994W2(boolean z) {
        int i = 4;
        this.f30563N.setVisibility(z ? 4 : 0);
        ConstraintLayout constraintLayout = this.f30564O;
        if (z) {
            i = 0;
        }
        constraintLayout.setVisibility(i);
    }

    /* renamed from: X2 */
    public static void m38995X2(Activity activity) {
        activity.startActivityForResult(new Intent(activity, CustomThemeActivity.class), 24);
    }

    /* renamed from: h2 */
    private void m38999h2() {
        C8343s.m46305m();
        finish();
    }

    /* renamed from: j2 */
    private void m39000j2() {
        C8343s.m46305m();
    }

    /* renamed from: k2 */
    private void m39001k2() {
        C8345u.m46320a((ConstraintLayout) findViewById(R.id.ll_custom_title), (LinearLayout) findViewById(R.id.ll_temp));
        this.f30572z = (ImageView) findViewById(R.id.iv_close);
        this.f30550A = (LinearLayout) findViewById(R.id.ll_accent_color);
        this.f30551B = (LinearLayout) findViewById(R.id.ll_bg_color);
        this.f30554E = (ImageView) findViewById(R.id.iv_theme_cover2);
        this.f30555F = (ImageView) findViewById(R.id.iv_theme_cover1);
        this.f30556G = (ColorPickerView) findViewById(R.id.sk_color);
        this.f30557H = (SeekBar) findViewById(R.id.sk_color_hsb);
        this.f30559J = findViewById(R.id.sk_color_hsb_bg);
        this.f30560K = (TextView) findViewById(R.id.tv_select);
        this.f30561L = (ImageView) findViewById(R.id.rl_theme_bg);
        this.f30562M = (ImageView) findViewById(R.id.iv_back);
        this.f30563N = (ConstraintLayout) findViewById(R.id.cl_color_control);
        this.f30564O = (ConstraintLayout) findViewById(R.id.cl_custom_color_control);
        this.f30565P = (SeekBar) findViewById(R.id.sb_opacity);
        this.f30566Q = (SeekBar) findViewById(R.id.sb_blur);
        this.f30567R = (RelativeLayout) findViewById(R.id.rl_theme_pic);
        this.f30568S = (ImageView) findViewById(R.id.iv_select);
        this.f30569T = (ImageView) findViewById(R.id.iv_reset);
        this.f30570U = (ImageView) findViewById(R.id.iv_done);
        this.f30571V = (RelativeLayout) findViewById(R.id.temp_view);
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public /* synthetic */ void mo26604m2(int i) {
        if (i == 1) {
            m38987O2(BaseApplication.f31157u);
        } else {
            m38987O2(C9566f.m50190a(this, 5));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public /* synthetic */ void mo26605o2(int i) {
        Intent intent = new Intent();
        if (i == 0) {
            C8343s.m46297e().mo27083p(Uri.fromFile(new File(getCacheDir(), "custom_theme_bg")));
            C8343s.m46309q();
            C8344t.m46316d(C8345u.m46327h(), R.string.coocent_results_page_save_complete);
            intent.putExtra("change_custom_theme", true);
            C8343s.m46308p(0);
        } else if (i == 1) {
            C8344t.m46316d(C8345u.m46327h(), R.string.fail);
            C8343s.m46305m();
        }
        setResult(23, intent);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public /* synthetic */ void mo26606q2() {
        runOnUiThread(new C6969h(this, C7105c.m40458b(this, C8343s.m46297e().mo27074g(), "custom_theme_bg")));
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public /* synthetic */ void mo26607s2(int i, View view) {
        m38988Q2(i == 0 ? 0 : C8345u.m46326g(this.f30552C[i]));
        if (i == 0) {
            m38994W2(true);
            this.f30556G.mo27410i();
            return;
        }
        this.f30554E.setImageDrawable(C8343s.m46312t(C8345u.m46329j(2131230881), C8345u.m46326g(this.f30552C[i])));
        C8343s.m46297e().mo27081n(-1.0f);
        C8343s.m46297e().mo27078k(C8345u.m46326g(this.f30552C[i]));
        C8343s.m46297e().mo27082o(100.0f);
        this.f30557H.setProgress(100);
        this.f30556G.mo27406g();
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public /* synthetic */ void mo26608u2(int i, View view) {
        if (i == 0) {
            m38980H2();
            return;
        }
        C8343s.m46297e().mo27080m(true);
        C8343s.m46297e().mo27079l(C8345u.m46326g(this.f30553D[i]));
        C8343s.m46297e().mo27076i(1.0f);
        SeekBar seekBar = this.f30565P;
        seekBar.setProgress(seekBar.getMax());
        m38989R2(C8345u.m46326g(this.f30553D[i]));
        C8343s.m46307o(this.f30561L, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public /* synthetic */ void mo26609w2() {
        int d = C8345u.m46323d(this.f30556G.getIndicatorRadius() * 2);
        this.f30557H.setThumb(mo26603i2(R.drawable.ic_them_progress_point, d, d));
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public /* synthetic */ void mo26610y2(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.f30554E.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        this.f30554E.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public /* synthetic */ void mo26599A2(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.f30561L.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        this.f30561L.setLayoutParams(layoutParams);
        m38984L2();
    }

    /* renamed from: P2 */
    public void mo26602P2(SeekBar seekBar, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-1, i});
        gradientDrawable.setGradientType(0);
        gradientDrawable.setCornerRadius(5.0f);
        ((LayerDrawable) seekBar.getProgressDrawable()).setDrawableByLayerId(16908301, gradientDrawable);
        seekBar.invalidate();
    }

    /* renamed from: i2 */
    public BitmapDrawable mo26603i2(int i, int i2, int i3) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), i), i2, i3, true));
        if (bitmapDrawable.getBitmap().getDensity() == 0) {
            bitmapDrawable.setTargetDensity(getResources().getDisplayMetrics());
        }
        return bitmapDrawable;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        super.onActivityResult(i, i2, intent);
        if (intent != null && i == 22 && (data = intent.getData()) != null) {
            C8343s.m46310r(false);
            C8343s.m46297e().mo27083p(data);
            m38991T2();
        }
    }

    public void onBackPressed() {
        if (this.f30564O.getVisibility() == 0) {
            this.f30563N.setVisibility(0);
            this.f30564O.setVisibility(4);
            return;
        }
        m38999h2();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C7397j.m41734d(this);
        m38993V2();
        setContentView((int) R.layout.activity_custom_theme);
        m39001k2();
        m39000j2();
        m38981I2();
        m38983K2();
        m38991T2();
        m38992U2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C8340q.m46288b(this, new C6960e(this));
    }
}
