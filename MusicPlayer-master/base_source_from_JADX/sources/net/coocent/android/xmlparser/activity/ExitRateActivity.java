package net.coocent.android.xmlparser.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageSwitcher;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.app.C0466a;
import androidx.core.content.C0506a;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.ads.AdView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.coocent.android.xmlparser.C9454k;
import net.coocent.android.xmlparser.C9483n;
import net.coocent.android.xmlparser.C9502v;
import net.coocent.android.xmlparser.ads.AdHelper;
import net.coocent.android.xmlparser.gift.C9447g;
import net.coocent.android.xmlparser.gift.GiftConfig;
import net.coocent.android.xmlparser.p461z.C9564d;
import net.coocent.android.xmlparser.p461z.C9566f;
import net.coocent.android.xmlparser.widget.view.MarqueeButton;
import p082e.p109h.p110h.C3621a;
import p082e.p109h.p118o.C3699e;
import p391j.p392a.p393a.C8608a;
import p391j.p392a.p393a.C8611d;
import p391j.p392a.p393a.C8613f;
import p391j.p392a.p393a.C8614g;
import p391j.p392a.p393a.C8615h;
import p391j.p392a.p393a.C8616i;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class ExitRateActivity extends AppCompatActivity implements View.OnClickListener {

    /* renamed from: A */
    private Group f36149A;

    /* renamed from: B */
    private RecyclerView f36150B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public LottieAnimationView f36151C;

    /* renamed from: D */
    private ImageSwitcher f36152D;

    /* renamed from: E */
    private AppCompatTextView f36153E;

    /* renamed from: F */
    private AppCompatTextView f36154F;

    /* renamed from: G */
    private MarqueeButton f36155G;

    /* renamed from: H */
    private MarqueeButton f36156H;

    /* renamed from: I */
    private ArrayList<C9483n> f36157I;

    /* renamed from: J */
    private List<View> f36158J;

    /* renamed from: K */
    private SparseIntArray f36159K;

    /* renamed from: L */
    private C9483n f36160L;

    /* renamed from: M */
    private SharedPreferences f36161M;

    /* renamed from: N */
    private AdView f36162N;

    /* renamed from: O */
    private boolean f36163O = false;

    /* renamed from: z */
    private View f36164z;

    /* renamed from: net.coocent.android.xmlparser.activity.ExitRateActivity$a */
    class C9359a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ Group f36165a;

        C9359a(Group group) {
            this.f36165a = group;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ExitRateActivity.this.f36151C.setVisibility(4);
            this.f36165a.setVisibility(0);
        }
    }

    /* renamed from: net.coocent.android.xmlparser.activity.ExitRateActivity$b */
    class C9360b extends GridLayoutManager {
        C9360b(ExitRateActivity exitRateActivity, Context context, int i, int i2, boolean z) {
            super(context, i, i2, z);
        }

        /* renamed from: m */
        public boolean mo4496m() {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e2 */
    public /* synthetic */ View mo32431g2() {
        AppCompatImageView appCompatImageView = new AppCompatImageView(this);
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return appCompatImageView;
    }

    /* renamed from: h2 */
    static /* synthetic */ void m49526h2(AppCompatImageView appCompatImageView, String str, Bitmap bitmap) {
        if (bitmap != null) {
            appCompatImageView.setImageBitmap(bitmap);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public /* synthetic */ void mo32432j2(C9483n nVar) {
        String g = nVar.mo32695g();
        C9502v.m49947r(this, g, "&referrer=utm_source%3Dcoocent_exit_activity_ad_" + C9502v.m49941l() + "%26utm_medium%3Dclick_download");
    }

    /* renamed from: k2 */
    private void m49528k2() {
        ((ConstraintLayout.LayoutParams) this.f36164z.getLayoutParams()).topMargin = 0;
        this.f36149A.setVisibility(4);
        this.f36150B.setVisibility(0);
        this.f36153E.setVisibility(0);
        this.f36154F.setText(getString(C8616i.popular_apps));
        this.f36155G.setBackground(C0506a.m3152d(this, C8613f.drawable_bg_exit_activity_exit_btn));
        this.f36155G.setTextColor(C0506a.m3150b(this, C8611d.promotion_exit_dialog_text_color_secondary));
        this.f36155G.setText(17039360);
        this.f36155G.setEnabled(true);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f36156H.getLayoutParams();
        layoutParams.f2226i = C8614g.rv_gift;
        layoutParams.topMargin = 0;
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C8614g.iv_1_star || id == C8614g.iv_2_star || id == C8614g.iv_3_star || id == C8614g.iv_4_star || id == C8614g.iv_5_star) {
            this.f36155G.setEnabled(true);
            if (this.f36151C.mo6922B()) {
                this.f36151C.setVisibility(4);
                this.f36151C.mo6981t();
            }
            int indexOf = this.f36158J.indexOf(view);
            int i = 0;
            while (i < this.f36158J.size()) {
                this.f36158J.get(i).setSelected(i <= indexOf);
                i++;
            }
            this.f36152D.setImageResource(this.f36159K.get(indexOf));
            this.f36155G.setTag(Integer.valueOf(indexOf));
        } else if (id == C8614g.layout_gift || id == C8614g.btn_install) {
            C9483n nVar = this.f36160L;
            if (nVar != null) {
                String g = nVar.mo32695g();
                C9502v.m49947r(this, g, "&referrer=utm_source%3Dcoocent_exit_activity_ad_" + C9502v.m49941l() + "%26utm_medium%3Dclick_download");
            }
        } else if (id == C8614g.btn_rate) {
            if (!this.f36163O) {
                if (this.f36155G.getTag() != null) {
                    int intValue = ((Integer) this.f36155G.getTag()).intValue();
                    C9502v.m49917L(this, "rate_star", new C3699e("rate_star_with_anim", (intValue + 1) + BuildConfig.FLAVOR));
                    if (intValue < this.f36158J.size() - 1) {
                        this.f36163O = true;
                        Toast.makeText(getApplicationContext(), C8616i.rate_submitted, 0).show();
                        this.f36161M.edit().putBoolean("APP_RATE", true).apply();
                    } else if (intValue == this.f36158J.size() - 1) {
                        this.f36163O = true;
                        C9564d.m50177c(this);
                        Toast.makeText(this, C8616i.coocent_rate_feedback_message, 0).show();
                        this.f36161M.edit().putBoolean("APP_RATE", true).apply();
                    }
                }
                ArrayList<C9483n> arrayList = this.f36157I;
                if (arrayList == null || arrayList.isEmpty() || C9502v.m49952w(this)) {
                    C0466a.m2983j(this);
                } else {
                    m49528k2();
                }
            } else {
                finish();
            }
        } else if (id == C8614g.btn_exit) {
            C0466a.m2983j(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C8615h.activity_exit_rate);
        Window window = getWindow();
        window.setBackgroundDrawable((Drawable) null);
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            window.addFlags(Integer.MIN_VALUE);
            int b = C0506a.m3150b(this, C8611d.promotion_exit_dialog_background_color);
            window.setStatusBarColor(C3621a.m15595m(b, 51));
            window.setNavigationBarColor(C3621a.m15595m(b, 51));
            if (i >= 23) {
                window.setStatusBarColor(b);
            }
            if (i >= 26) {
                window.setNavigationBarColor(b);
            }
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        this.f36161M = defaultSharedPreferences;
        this.f36163O = defaultSharedPreferences.getBoolean("APP_RATE", false);
        this.f36157I = C9502v.m49930a();
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(C8614g.iv_logo);
        AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById(C8614g.tv_app_name);
        this.f36149A = (Group) findViewById(C8614g.group_rate);
        Group group = (Group) findViewById(C8614g.group_star);
        this.f36164z = findViewById(C8614g.view_bg);
        this.f36152D = (ImageSwitcher) findViewById(C8614g.is_star);
        this.f36154F = (AppCompatTextView) findViewById(C8614g.tv_rate_for_us);
        this.f36153E = (AppCompatTextView) findViewById(C8614g.tv_popular_ads);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) findViewById(C8614g.iv_1_star);
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) findViewById(C8614g.iv_2_star);
        AppCompatImageView appCompatImageView4 = (AppCompatImageView) findViewById(C8614g.iv_3_star);
        AppCompatImageView appCompatImageView5 = (AppCompatImageView) findViewById(C8614g.iv_4_star);
        AppCompatImageView appCompatImageView6 = (AppCompatImageView) findViewById(C8614g.iv_5_star);
        this.f36151C = (LottieAnimationView) findViewById(C8614g.animation_view);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(C8614g.layout_gift);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) findViewById(C8614g.tv_title);
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) findViewById(C8614g.tv_description);
        AppCompatImageView appCompatImageView7 = (AppCompatImageView) findViewById(C8614g.iv_icon);
        this.f36155G = (MarqueeButton) findViewById(C8614g.btn_rate);
        this.f36156H = (MarqueeButton) findViewById(C8614g.btn_exit);
        this.f36150B = (RecyclerView) findViewById(C8614g.rv_gift);
        this.f36162N = AdHelper.m49536p().mo32443d(this, (FrameLayout) findViewById(C8614g.layout_ads));
        Drawable b2 = C9566f.m50191b(this);
        String c = C9566f.m50192c(this);
        MarqueeButton marqueeButton = (MarqueeButton) findViewById(C8614g.btn_install);
        int i2 = 8;
        if (b2 != null) {
            appCompatImageView.setImageDrawable(C9566f.m50191b(this));
        } else {
            appCompatImageView.setVisibility(8);
        }
        if (TextUtils.isEmpty(c)) {
            c = getString(C8616i.coocent_exit);
        }
        appCompatTextView.setText(c);
        if (this.f36163O) {
            m49528k2();
        } else {
            this.f36149A.setVisibility(0);
            this.f36150B.setVisibility(8);
            if (C9566f.m50205p(this)) {
                this.f36151C.setScaleX(-1.0f);
            }
            ArrayList<C9483n> arrayList = this.f36157I;
            if (arrayList != null && !arrayList.isEmpty()) {
                i2 = 0;
            }
            constraintLayout.setVisibility(i2);
            this.f36152D.setFactory(new C9364b(this));
            ImageSwitcher imageSwitcher = this.f36152D;
            int i3 = C8613f.ic_rating_5_star;
            imageSwitcher.setImageResource(i3);
            this.f36152D.setInAnimation(this, C8608a.anim_exit_dialog_enter_switch_image);
            this.f36152D.setOutAnimation(this, C8608a.anim_exit_dialog_exit_switch_image);
            this.f36158J = new ArrayList(Arrays.asList(new AppCompatImageView[]{appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, appCompatImageView6}));
            SparseIntArray sparseIntArray = new SparseIntArray();
            this.f36159K = sparseIntArray;
            sparseIntArray.put(0, C8613f.ic_rating_1_star);
            this.f36159K.put(1, C8613f.ic_rating_2_star);
            this.f36159K.put(2, C8613f.ic_rating_3_star);
            this.f36159K.put(3, C8613f.ic_rating_4_star);
            this.f36159K.put(4, i3);
            ArrayList<C9483n> arrayList2 = this.f36157I;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                this.f36160L = this.f36157I.get(0);
                GiftConfig.m49723h(appCompatTextView2, GiftConfig.m49721d(this), this.f36160L.mo32696h(), this.f36160L.mo32696h());
                GiftConfig.m49722g(appCompatTextView3, GiftConfig.m49720b(this), this.f36160L.mo32689a(), this.f36160L.mo32690b());
                Bitmap h = new C9454k().mo32585h(C9502v.f36501e, this.f36160L, new C9365c(appCompatImageView7));
                if (h != null) {
                    appCompatImageView7.setImageBitmap(h);
                }
            }
            this.f36151C.mo6947q(new C9359a(group));
            for (View onClickListener : this.f36158J) {
                onClickListener.setOnClickListener(this);
            }
            constraintLayout.setOnClickListener(this);
            marqueeButton.setOnClickListener(this);
        }
        this.f36150B.setHasFixedSize(true);
        this.f36150B.setLayoutManager(new C9360b(this, this, 4, 1, false));
        C9447g gVar = new C9447g(this, this.f36157I, C8615h.item_exit_fullscreen_gift, 8, false);
        this.f36150B.setAdapter(gVar);
        gVar.mo32578h(new C9366d(this));
        this.f36155G.setOnClickListener(this);
        this.f36156H.setOnClickListener(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        AdView adView = this.f36162N;
        if (adView != null) {
            adView.mo11151a();
            this.f36162N = null;
        }
    }
}
