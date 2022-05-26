package net.coocent.android.xmlparser.widget.dialog;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.C0506a;
import androidx.fragment.app.C0584b;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.ads.C3060l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import net.coocent.android.xmlparser.C9454k;
import net.coocent.android.xmlparser.C9483n;
import net.coocent.android.xmlparser.C9490s;
import net.coocent.android.xmlparser.C9502v;
import net.coocent.android.xmlparser.ads.AdHelper;
import net.coocent.android.xmlparser.gift.C9447g;
import net.coocent.android.xmlparser.gift.GiftConfig;
import net.coocent.android.xmlparser.p461z.C9564d;
import net.coocent.android.xmlparser.p461z.C9566f;
import net.coocent.android.xmlparser.widget.view.MarqueeButton;
import p082e.p109h.p110h.C3621a;
import p082e.p109h.p118o.C3699e;
import p391j.p392a.p393a.C8611d;
import p391j.p392a.p393a.C8613f;
import p391j.p392a.p393a.C8614g;
import p391j.p392a.p393a.C8615h;
import p391j.p392a.p393a.C8616i;
import p391j.p392a.p393a.C8617j;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: net.coocent.android.xmlparser.widget.dialog.k */
/* compiled from: ExitBottomRandomDialog */
public class C9530k extends C0584b implements View.OnClickListener {

    /* renamed from: F0 */
    public static final String f36568F0 = C9530k.class.getCanonicalName();

    /* renamed from: A0 */
    private C9483n f36569A0;

    /* renamed from: B0 */
    private SharedPreferences f36570B0;

    /* renamed from: C0 */
    private BroadcastReceiver f36571C0;

    /* renamed from: D0 */
    private int f36572D0;

    /* renamed from: E0 */
    private boolean f36573E0 = false;

    /* renamed from: q0 */
    private ConstraintLayout f36574q0;

    /* renamed from: r0 */
    private ConstraintLayout f36575r0;

    /* renamed from: s0 */
    private ConstraintLayout f36576s0;

    /* renamed from: t0 */
    private ConstraintLayout f36577t0;

    /* renamed from: u0 */
    private Group f36578u0;
    /* access modifiers changed from: private */

    /* renamed from: v0 */
    public LottieAnimationView f36579v0;

    /* renamed from: w0 */
    private MarqueeButton f36580w0;

    /* renamed from: x0 */
    private ArrayList<C9483n> f36581x0;

    /* renamed from: y0 */
    private List<View> f36582y0;

    /* renamed from: z0 */
    private SparseIntArray f36583z0;

    /* renamed from: net.coocent.android.xmlparser.widget.dialog.k$a */
    /* compiled from: ExitBottomRandomDialog */
    class C9531a extends GridLayoutManager {
        C9531a(C9530k kVar, Context context, int i, int i2, boolean z) {
            super(context, i, i2, z);
        }

        /* renamed from: m */
        public boolean mo4496m() {
            return false;
        }
    }

    /* renamed from: net.coocent.android.xmlparser.widget.dialog.k$b */
    /* compiled from: ExitBottomRandomDialog */
    class C9532b extends BroadcastReceiver {

        /* renamed from: a */
        final /* synthetic */ String f36584a;

        C9532b(String str) {
            this.f36584a = str;
        }

        public void onReceive(Context context, Intent intent) {
            if (TextUtils.equals(intent.getAction(), this.f36584a)) {
                C9530k.this.mo3832Y2();
            }
        }
    }

    /* renamed from: net.coocent.android.xmlparser.widget.dialog.k$c */
    /* compiled from: ExitBottomRandomDialog */
    class C9533c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ Group f36586a;

        C9533c(Group group) {
            this.f36586a = group;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C9530k.this.f36579v0.setVisibility(4);
            this.f36586a.setVisibility(0);
        }
    }

    /* renamed from: net.coocent.android.xmlparser.widget.dialog.k$d */
    /* compiled from: ExitBottomRandomDialog */
    class C9534d extends C9490s {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f36588a;

        C9534d(ViewGroup viewGroup) {
            this.f36588a = viewGroup;
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void mo32800i(ViewGroup viewGroup) {
            if (AdHelper.m49536p().mo32454o() != null) {
                C9530k.this.m50017k3(viewGroup);
            }
        }

        /* renamed from: c */
        public void mo29984c(C3060l lVar) {
            super.mo29984c(lVar);
            AdHelper.m49536p().mo32453n();
        }

        /* renamed from: e */
        public void mo26768e() {
            super.mo26768e();
            new Handler(Looper.getMainLooper()).post(new C9527h(this, this.f36588a));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public void m50017k3(ViewGroup viewGroup) {
        if (mo3651a0() != null) {
            FrameLayout o = AdHelper.m49536p().mo32454o();
            if (o.getChildCount() != 0) {
                if (o.getParent() != null) {
                    ((ViewGroup) o.getParent()).removeView(o);
                }
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
                layoutParams.f2230k = 0;
                layoutParams.f2246s = 0;
                layoutParams.f2250u = 0;
                viewGroup.addView(o, layoutParams);
                viewGroup.setBackgroundColor(C0506a.m3150b(mo3651a0(), C8611d.promotion_exit_dialog_background_color));
                viewGroup.setVisibility(0);
            }
        }
    }

    /* renamed from: l3 */
    static /* synthetic */ void m50018l3(AppCompatImageView appCompatImageView, String str, Bitmap bitmap) {
        if (bitmap != null) {
            appCompatImageView.setImageBitmap(bitmap);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public /* synthetic */ void mo32796n3(C9483n nVar) {
        C9502v.m49919N(true);
        FragmentActivity u2 = mo3705u2();
        String g = nVar.mo32695g();
        C9502v.m49947r(u2, g, "&referrer=utm_source%3Dcoocent_exit_bottom_ad_" + C9502v.m49941l() + "%26utm_medium%3Dclick_download");
    }

    /* renamed from: o3 */
    public static C9530k m50020o3(boolean z) {
        C9530k kVar = new C9530k();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_rated", z);
        kVar.mo3581C2(bundle);
        return kVar;
    }

    /* renamed from: p3 */
    private void m50021p3() {
        this.f36580w0.setBackground(C0506a.m3152d(mo3708v2(), C8613f.drawable_bg_exit_activity_exit_btn));
        this.f36580w0.setTextColor(C0506a.m3150b(mo3708v2(), C8611d.promotion_exit_dialog_text_color_secondary));
        this.f36580w0.setText(17039360);
        this.f36580w0.setContentDescription(mo3582D0(17039360));
        this.f36580w0.setEnabled(true);
    }

    /* renamed from: q3 */
    private void m50022q3(ViewGroup viewGroup) {
        if (C9502v.m49954y(mo3708v2())) {
            return;
        }
        if (AdHelper.m49536p().mo32454o() != null) {
            m50017k3(viewGroup);
        } else {
            AdHelper.m49536p().mo32448i(mo3705u2(), new C9534d(viewGroup));
        }
    }

    /* renamed from: r3 */
    private void m50023r3(Group group, List<View> list) {
        this.f36578u0.setVisibility(0);
        if (C9566f.m50205p(mo3708v2())) {
            this.f36579v0.setScaleX(-1.0f);
        }
        this.f36582y0 = new ArrayList(list);
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.f36583z0 = sparseIntArray;
        sparseIntArray.put(0, C8613f.ic_rating_1_star);
        this.f36583z0.put(1, C8613f.ic_rating_2_star);
        this.f36583z0.put(2, C8613f.ic_rating_3_star);
        this.f36583z0.put(3, C8613f.ic_rating_4_star);
        this.f36583z0.put(4, C8613f.ic_rating_5_star);
        this.f36579v0.mo6947q(new C9533c(group));
        for (View onClickListener : this.f36582y0) {
            onClickListener.setOnClickListener(this);
        }
    }

    /* renamed from: U1 */
    public void mo3636U1(View view, Bundle bundle) {
        RecyclerView recyclerView;
        int i;
        View view2 = view;
        super.mo3636U1(view, bundle);
        this.f36574q0 = (ConstraintLayout) view2.findViewById(C8614g.layout_rate);
        this.f36578u0 = (Group) view2.findViewById(C8614g.group_rate);
        Group group = (Group) view2.findViewById(C8614g.group_star);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C8614g.iv_1_star);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) view2.findViewById(C8614g.iv_2_star);
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) view2.findViewById(C8614g.iv_3_star);
        AppCompatImageView appCompatImageView4 = (AppCompatImageView) view2.findViewById(C8614g.iv_4_star);
        AppCompatImageView appCompatImageView5 = (AppCompatImageView) view2.findViewById(C8614g.iv_5_star);
        this.f36579v0 = (LottieAnimationView) view2.findViewById(C8614g.animation_view);
        this.f36575r0 = (ConstraintLayout) view2.findViewById(C8614g.layout_gift);
        AppCompatTextView appCompatTextView = (AppCompatTextView) view2.findViewById(C8614g.tv_title);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) view2.findViewById(C8614g.tv_description);
        AppCompatImageView appCompatImageView6 = (AppCompatImageView) view2.findViewById(C8614g.iv_icon);
        MarqueeButton marqueeButton = (MarqueeButton) view2.findViewById(C8614g.btn_install);
        this.f36580w0 = (MarqueeButton) view2.findViewById(C8614g.btn_rate);
        this.f36576s0 = (ConstraintLayout) view2.findViewById(C8614g.layout_rated_gift);
        RecyclerView recyclerView2 = (RecyclerView) view2.findViewById(C8614g.rv_gift);
        MarqueeButton marqueeButton2 = (MarqueeButton) view2.findViewById(C8614g.btn_exit);
        this.f36572D0 = mo3698s0().getConfiguration().orientation;
        boolean w = C9502v.m49952w(mo3708v2());
        FrameLayout frameLayout = (FrameLayout) view2.findViewById(C8614g.layout_content);
        this.f36570B0 = PreferenceManager.getDefaultSharedPreferences(mo3708v2());
        ArrayList<C9483n> a = C9502v.m49930a();
        this.f36581x0 = a;
        ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(C8614g.layout_exit);
        if (w) {
            this.f36575r0.setVisibility(8);
            this.f36576s0.setVisibility(8);
            m50023r3(group, Arrays.asList(new View[]{appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5}));
        } else if (a == null || a.isEmpty()) {
            if (this.f36573E0) {
                m50021p3();
                this.f36578u0.setVisibility(8);
            } else {
                m50023r3(group, Arrays.asList(new View[]{appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5}));
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) view2.findViewById(C8614g.rate_ad_layout);
            this.f36577t0 = constraintLayout2;
            m50022q3(constraintLayout2);
            this.f36575r0.setVisibility(8);
            this.f36576s0.setVisibility(8);
        } else {
            if (this.f36573E0) {
                m50021p3();
                this.f36578u0.setVisibility(8);
                m50022q3(this.f36574q0);
                recyclerView = recyclerView2;
            } else {
                int i2 = C9502v.f36520x;
                if (i2 > 5) {
                    if (C9502v.f36522z == -1) {
                        recyclerView = recyclerView2;
                        C9502v.f36522z = new Random(System.currentTimeMillis()).nextInt(10) + 1;
                    } else {
                        recyclerView = recyclerView2;
                    }
                    if (C9502v.f36522z > 2) {
                        m50021p3();
                        this.f36578u0.setVisibility(8);
                        m50022q3(this.f36574q0);
                    } else {
                        m50023r3(group, Arrays.asList(new View[]{appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5}));
                    }
                } else {
                    recyclerView = recyclerView2;
                    if (i2 % 2 == 1) {
                        m50023r3(group, Arrays.asList(new View[]{appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5}));
                    } else {
                        m50021p3();
                        this.f36578u0.setVisibility(8);
                        m50022q3(this.f36574q0);
                    }
                }
            }
            if (C9502v.f36521y == -1) {
                C9502v.f36521y = new Random(System.currentTimeMillis()).nextInt(10) + 1;
            }
            if (C9502v.f36521y >= 4) {
                i = 0;
                this.f36575r0.setVisibility(0);
                this.f36576s0.setVisibility(8);
            } else {
                i = 0;
                this.f36575r0.setVisibility(8);
                this.f36576s0.setVisibility(0);
            }
            this.f36569A0 = this.f36581x0.get(i);
            GiftConfig.m49723h(appCompatTextView, GiftConfig.m49721d(mo3708v2()), this.f36569A0.mo32696h(), this.f36569A0.mo32696h());
            GiftConfig.m49722g(appCompatTextView2, GiftConfig.m49720b(mo3708v2()), this.f36569A0.mo32689a(), this.f36569A0.mo32690b());
            Bitmap h = new C9454k().mo32585h(C9502v.f36501e, this.f36569A0, new C9529j(appCompatImageView6));
            if (h != null) {
                appCompatImageView6.setImageBitmap(h);
            }
            this.f36575r0.setOnClickListener(this);
            marqueeButton.setOnClickListener(this);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new C9531a(this, mo3708v2(), 4, 1, false));
            C9447g gVar = new C9447g(mo3708v2(), this.f36581x0, C8615h.item_exit_fullscreen_gift, 8, false, false);
            recyclerView.setAdapter(gVar);
            gVar.mo32578h(new C9528i(this));
        }
        constraintLayout.setOnClickListener(this);
        frameLayout.setOnClickListener(this);
        this.f36580w0.setOnClickListener(this);
        marqueeButton2.setOnClickListener(this);
        String str = mo3708v2().getPackageName() + "." + "DISMISS_RATE";
        this.f36571C0 = new C9532b(str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(str);
        mo3708v2().registerReceiver(this.f36571C0, intentFilter);
    }

    /* renamed from: l1 */
    public void mo3679l1(Bundle bundle) {
        super.mo3679l1(bundle);
        if (bundle != null) {
            mo3832Y2();
            return;
        }
        Bundle V = mo3638V();
        if (V != null) {
            this.f36573E0 = V.getBoolean("is_rated");
        }
        mo3839f3(0, C8617j.Promotion_Dialog_Bottom_Exit);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C8614g.iv_1_star || id == C8614g.iv_2_star || id == C8614g.iv_3_star || id == C8614g.iv_4_star || id == C8614g.iv_5_star) {
            this.f36580w0.setEnabled(true);
            if (this.f36579v0.mo6922B()) {
                this.f36579v0.setVisibility(4);
                this.f36579v0.mo6981t();
            }
            int indexOf = this.f36582y0.indexOf(view);
            int i = 0;
            while (i < this.f36582y0.size()) {
                this.f36582y0.get(i).setSelected(i <= indexOf);
                i++;
            }
            this.f36580w0.setTag(Integer.valueOf(indexOf));
        } else if (id == C8614g.layout_gift || id == C8614g.btn_install) {
            if (this.f36569A0 != null) {
                C9502v.m49919N(true);
                FragmentActivity u2 = mo3705u2();
                String g = this.f36569A0.mo32695g();
                C9502v.m49947r(u2, g, "&referrer=utm_source%3Dcoocent_exit_bottom_ad_" + C9502v.m49941l() + "%26utm_medium%3Dclick_download");
            }
        } else if (id == C8614g.btn_rate) {
            if (!this.f36573E0) {
                if (this.f36580w0.getTag() != null) {
                    int intValue = ((Integer) this.f36580w0.getTag()).intValue();
                    Context v2 = mo3708v2();
                    C9502v.m49917L(v2, "rate_star", new C3699e("rate_star_with_anim", (intValue + 1) + BuildConfig.FLAVOR));
                    if (intValue < this.f36582y0.size() - 1) {
                        this.f36573E0 = true;
                        Toast.makeText(mo3708v2(), C8616i.rate_submitted, 0).show();
                        this.f36570B0.edit().putBoolean("APP_RATE", true).apply();
                    } else if (intValue == this.f36582y0.size() - 1) {
                        C9502v.m49919N(true);
                        this.f36573E0 = true;
                        C9564d.m50177c(mo3708v2());
                        Toast.makeText(mo3708v2(), C8616i.coocent_rate_feedback_message, 0).show();
                        this.f36570B0.edit().putBoolean("APP_RATE", true).apply();
                    }
                }
                FrameLayout o = AdHelper.m49536p().mo32454o();
                if (o == null || o.getChildCount() == 0) {
                    mo3832Y2();
                } else if (this.f36578u0.getVisibility() == 0) {
                    m50021p3();
                    this.f36578u0.setVisibility(8);
                    ArrayList<C9483n> arrayList = this.f36581x0;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        m50022q3(this.f36574q0);
                    }
                } else {
                    mo3832Y2();
                }
            } else {
                mo3832Y2();
            }
        } else if (id == C8614g.layout_content) {
            mo3832Y2();
        } else if (id == C8614g.btn_exit) {
            mo3832Y2();
            mo3705u2().finish();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation != this.f36572D0) {
            mo3832Y2();
        }
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21 && mo3834a3() != null) {
            mo3834a3().setCanceledOnTouchOutside(true);
            Window window = mo3834a3().getWindow();
            if (window != null) {
                int b = C0506a.m3150b(mo3834a3().getContext(), C8611d.promotion_exit_dialog_background_color);
                window.setNavigationBarColor(C3621a.m15595m(b, 51));
                if (i >= 23) {
                    window.setNavigationBarColor(b);
                }
            }
        }
        return layoutInflater.inflate(C8615h.layout_dialog_bottom_exit_rate_random, viewGroup, false);
    }

    /* renamed from: v1 */
    public void mo3707v1() {
        super.mo3707v1();
        if (!(this.f36571C0 == null || mo3606L() == null)) {
            mo3606L().unregisterReceiver(this.f36571C0);
            this.f36571C0 = null;
        }
        ConstraintLayout constraintLayout = this.f36574q0;
        if (constraintLayout != null) {
            constraintLayout.removeAllViews();
        }
        ConstraintLayout constraintLayout2 = this.f36577t0;
        if (constraintLayout2 != null) {
            constraintLayout2.removeAllViews();
        }
    }
}
