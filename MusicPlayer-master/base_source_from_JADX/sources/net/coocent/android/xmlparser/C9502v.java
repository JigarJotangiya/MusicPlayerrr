package net.coocent.android.xmlparser;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import net.coocent.android.xmlparser.C9454k;
import net.coocent.android.xmlparser.C9459l;
import net.coocent.android.xmlparser.ads.AdHelper;
import net.coocent.android.xmlparser.ads.AppOpenAdManager;
import net.coocent.android.xmlparser.application.AbstractApplication;
import net.coocent.android.xmlparser.feedback.C9424o;
import net.coocent.android.xmlparser.gift.GiftConfig;
import net.coocent.android.xmlparser.p459x.C9558a;
import net.coocent.android.xmlparser.p461z.C9564d;
import net.coocent.android.xmlparser.p461z.C9566f;
import net.coocent.android.xmlparser.update.UpdateManager;
import net.coocent.android.xmlparser.widget.view.GiftSwitchView;
import p082e.p109h.p118o.C3699e;
import p159f.p166c.p213j.p214a.C4592c;
import p391j.p392a.p393a.C8608a;
import p391j.p392a.p393a.C8613f;
import p391j.p392a.p393a.C8614g;
import p391j.p392a.p393a.C8615h;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: net.coocent.android.xmlparser.v */
/* compiled from: PromotionSDK */
public class C9502v {

    /* renamed from: A */
    private static int f36495A = 0;

    /* renamed from: B */
    private static boolean f36496B = false;

    /* renamed from: a */
    public static String f36497a = "https://app.coocent.net/";

    /* renamed from: b */
    public static String f36498b = "https://coocentpromotion.oss-us-west-1.aliyuncs.com/";

    /* renamed from: c */
    private static int f36499c = 0;

    /* renamed from: d */
    public static String f36500d = null;

    /* renamed from: e */
    public static String f36501e = null;

    /* renamed from: f */
    public static String f36502f = null;

    /* renamed from: g */
    private static String f36503g = "";

    /* renamed from: h */
    public static boolean f36504h = false;

    /* renamed from: i */
    private static boolean f36505i = true;

    /* renamed from: j */
    private static boolean f36506j = false;

    /* renamed from: k */
    private static boolean f36507k;

    /* renamed from: l */
    private static boolean f36508l;

    /* renamed from: m */
    public static int f36509m;

    /* renamed from: n */
    private static int f36510n;

    /* renamed from: o */
    public static int f36511o;

    /* renamed from: p */
    public static C9483n f36512p;

    /* renamed from: q */
    private static ArrayList<C9483n> f36513q;

    /* renamed from: r */
    private static ArrayList<C9483n> f36514r;

    /* renamed from: s */
    private static ArrayList<C9483n> f36515s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static ArrayList<C9483n> f36516t;

    /* renamed from: u */
    private static SharedPreferences f36517u;

    /* renamed from: v */
    private static UpdateManager f36518v;

    /* renamed from: w */
    private static final C9424o f36519w = new C9424o();

    /* renamed from: x */
    public static int f36520x = 0;

    /* renamed from: y */
    public static int f36521y = -1;

    /* renamed from: z */
    public static int f36522z = -1;

    /* renamed from: net.coocent.android.xmlparser.v$a */
    /* compiled from: PromotionSDK */
    class C9503a implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ View f36523a;

        /* renamed from: b */
        final /* synthetic */ ScaleAnimation f36524b;

        C9503a(View view, ScaleAnimation scaleAnimation) {
            this.f36523a = view;
            this.f36524b = scaleAnimation;
        }

        public void onAnimationEnd(Animation animation) {
            this.f36523a.startAnimation(this.f36524b);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: net.coocent.android.xmlparser.v$b */
    /* compiled from: PromotionSDK */
    class C9504b implements C9459l.C9460a {

        /* renamed from: a */
        final /* synthetic */ C9558a f36525a;

        C9504b(C9558a aVar) {
            this.f36525a = aVar;
        }

        /* renamed from: a */
        public void mo32567a(Bitmap bitmap) {
            if (bitmap != null) {
                this.f36525a.mo32938g(C8614g.iv_icon, bitmap);
            }
        }
    }

    /* renamed from: net.coocent.android.xmlparser.v$c */
    /* compiled from: PromotionSDK */
    class C9505c implements C9459l.C9460a {

        /* renamed from: a */
        final /* synthetic */ C9558a f36526a;

        C9505c(C9558a aVar) {
            this.f36526a = aVar;
        }

        /* renamed from: a */
        public void mo32567a(Bitmap bitmap) {
            if (bitmap != null) {
                this.f36526a.mo32938g(C8614g.iv_cover, bitmap);
                this.f36526a.mo32939h(C8614g.iv_close, 0);
            }
        }
    }

    /* renamed from: net.coocent.android.xmlparser.v$d */
    /* compiled from: PromotionSDK */
    class C9506d implements View.OnKeyListener {
        C9506d() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return true;
        }
    }

    /* renamed from: net.coocent.android.xmlparser.v$e */
    /* compiled from: PromotionSDK */
    class C9507e implements View.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ GiftSwitchView f36527g;

        /* renamed from: h */
        final /* synthetic */ Activity f36528h;

        C9507e(GiftSwitchView giftSwitchView, Activity activity) {
            this.f36527g = giftSwitchView;
            this.f36528h = activity;
        }

        public void onClick(View view) {
            if (this.f36527g.getCurrentGift() != null && !TextUtils.isEmpty(this.f36527g.getCurrentGift().mo32695g())) {
                C9564d.m50176b(this.f36528h, this.f36527g.getCurrentGift().mo32695g(), "coocent_toolbar");
            }
        }
    }

    /* renamed from: A */
    static /* synthetic */ void m49906A(Activity activity) {
        UpdateManager updateManager = f36518v;
        if (updateManager != null) {
            updateManager.checkInAppUpdateState(activity);
        }
    }

    /* renamed from: B */
    static /* synthetic */ void m49907B(C9558a aVar, String str, C9483n nVar, boolean z, Activity activity, View view) {
        int id = view.getId();
        if (id == C8614g.iv_close) {
            aVar.dismiss();
        } else if (id == C8614g.iv_cover || id == C8614g.rl_ad || id == C8614g.btn_install) {
            String str2 = TextUtils.equals(str, nVar.mo32691c()) ? "1" : "2";
            if (TextUtils.isEmpty(str) || z) {
                str2 = "no_banner";
            }
            String g = nVar.mo32695g();
            m49947r(activity, g, "&referrer=utm_source%3Dcoocent_StartDialog" + (str2 + "_" + m49941l()) + "%26utm_medium%3Dclick_download");
        }
    }

    /* renamed from: D */
    static /* synthetic */ void m49909D(PopupWindow popupWindow) {
        if (popupWindow != null && popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
    }

    /* renamed from: E */
    static /* synthetic */ void m49910E(Activity activity, C9483n nVar, View view, ImageView imageView, TextView textView, int i) {
        m49944o();
        m49921P(activity, nVar, view, imageView, textView, i);
    }

    /* renamed from: F */
    static /* synthetic */ void m49911F(Activity activity, int i, C9483n nVar, View view, ImageView imageView, TextView textView, View view2) {
        if (activity == null) {
            return;
        }
        if (i == 1) {
            try {
                if (C9564d.m50176b(activity, nVar.mo32695g(), "coocent_drawer")) {
                    new Handler(Looper.getMainLooper()).postDelayed(new C9451i(activity, nVar, view, imageView, textView, i), 300);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (i == 2) {
            C9564d.m50176b(activity, nVar.mo32695g(), "coocent_rotation");
        }
    }

    /* renamed from: G */
    static /* synthetic */ boolean m49912G(ArrayList arrayList) {
        int i;
        if (arrayList == null || arrayList.isEmpty() || arrayList.size() <= (i = f36499c) || i <= -1) {
            return true;
        }
        f36514r = arrayList;
        C9483n nVar = (C9483n) arrayList.get(i);
        if (nVar == null || TextUtils.isEmpty(nVar.mo32695g())) {
            return true;
        }
        if (!TextUtils.isEmpty(nVar.mo32693e())) {
            String e = nVar.mo32693e();
            C9459l.m49807b(e, f36501e + nVar.mo32695g(), (C9459l.C9460a) null);
        }
        if (!TextUtils.isEmpty(nVar.mo32691c())) {
            String c = nVar.mo32691c();
            C9459l.m49807b(c, f36501e + nVar.mo32695g() + ".icon_bannerPath", (C9459l.C9460a) null);
        }
        if (TextUtils.isEmpty(nVar.mo32692d())) {
            return true;
        }
        String d = nVar.mo32692d();
        C9459l.m49807b(d, f36501e + nVar.mo32695g() + ".icon_bannerPath2", (C9459l.C9460a) null);
        return true;
    }

    /* renamed from: H */
    static /* synthetic */ boolean m49913H(ArrayList arrayList) {
        return true;
    }

    /* renamed from: J */
    static /* synthetic */ void m49915J(String str, Application application, C9488q qVar, C4592c cVar) {
        String str2 = str;
        if (!f36504h) {
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(str + "/gift.xml"));
                f36513q = new C9484o(application.getApplicationContext(), 1).mo32706c(fileInputStream);
                fileInputStream.close();
                FileInputStream fileInputStream2 = new FileInputStream(new File(str + "/dialog.xml"));
                f36514r = new C9484o(application.getApplicationContext(), 0).mo32706c(fileInputStream2);
                fileInputStream2.close();
                FileInputStream fileInputStream3 = new FileInputStream(new File(str + "/EQ.xml"));
                new C9484o(application.getApplicationContext(), 2).mo32706c(fileInputStream3);
                fileInputStream3.close();
                FileInputStream fileInputStream4 = new FileInputStream(new File(str + "/GiftGame.xml"));
                f36516t = new C9484o(application.getApplicationContext(), 1).mo32706c(fileInputStream4);
                fileInputStream4.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Application application2 = application;
        String str3 = str;
        C9489r rVar = new C9489r(application2, str3, f36501e, qVar, cVar);
        C9482m mVar = new C9482m(application2, str3, f36501e, "/dialog.xml", 0, C9453j.f36408g);
        C9482m mVar2 = new C9482m(application2, str3, f36501e, "/EQ.xml", 2, C9393c.f36260g);
        C9482m mVar3 = new C9482m(application2, str3, f36501e, "/GiftGame.xml", 1, C9392b.f36259g);
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        rVar.executeOnExecutor(newCachedThreadPool, new String[]{f36497a + f36500d});
        ExecutorService newCachedThreadPool2 = Executors.newCachedThreadPool();
        mVar.executeOnExecutor(newCachedThreadPool2, new String[]{f36497a + "V3" + f36503g + "/DialogApp.xml"});
        ExecutorService newCachedThreadPool3 = Executors.newCachedThreadPool();
        mVar2.executeOnExecutor(newCachedThreadPool3, new String[]{f36497a + "V3" + "/EQ.xml"});
        ExecutorService newCachedThreadPool4 = Executors.newCachedThreadPool();
        mVar3.executeOnExecutor(newCachedThreadPool4, new String[]{f36497a + "V3" + "/GameAndroid.xml"});
    }

    /* renamed from: K */
    public static void m49916K() {
        f36504h = false;
        SharedPreferences sharedPreferences = f36517u;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt("exit_dialog_showed_count", f36520x + 1);
            edit.putInt("PLAY_ICON_INDEX", f36510n);
            edit.apply();
        }
        f36496B = false;
        f36507k = false;
        f36508l = false;
        f36513q = null;
        f36515s = null;
        f36514r = null;
        f36511o = 0;
        f36495A = 0;
        f36518v = null;
        f36520x = 0;
        f36521y = -1;
        f36522z = -1;
        AdHelper.m49536p().mo32452m();
    }

    /* renamed from: L */
    public static void m49917L(Context context, String str, C3699e<String, String> eVar) {
        if (!TextUtils.isEmpty(str)) {
            f36519w.mo32541k(context.getApplicationContext(), str, eVar);
            return;
        }
        throw new IllegalArgumentException("Event name is not allowed to be empty!");
    }

    /* renamed from: M */
    public static void m49918M(Activity activity, int i, int i2) {
        UpdateManager updateManager = f36518v;
        if (updateManager != null) {
            updateManager.onActivityResult(activity, i, i2);
        }
    }

    /* renamed from: N */
    public static void m49919N(boolean z) {
        f36496B = z;
    }

    /* renamed from: O */
    public static void m49920O(Context context) {
        if (f36517u == null) {
            f36517u = PreferenceManager.getDefaultSharedPreferences(context);
        }
        f36517u.edit().putBoolean("is_check_gift", true).apply();
    }

    /* renamed from: P */
    private static void m49921P(Activity activity, C9483n nVar, View view, ImageView imageView, TextView textView, int i) {
        if (nVar != null) {
            Map<String, String> d = GiftConfig.m49721d(activity);
            view.setVisibility(0);
            view.setOnClickListener(new C9357a(activity, i, nVar, view, imageView, textView));
            Bitmap bitmap = null;
            if (nVar != null && (bitmap = new C9454k().mo32585h(f36501e, nVar, (C9454k.C9457c) null)) == null) {
                bitmap = BitmapFactory.decodeResource(activity.getResources(), C8613f.gift_default_icon);
            }
            if (bitmap == null) {
                imageView.setImageResource(C8613f.gift_default_icon);
            } else {
                imageView.setImageBitmap(bitmap);
            }
            GiftConfig.m49723h(textView, d, nVar.mo32696h(), nVar.mo32696h());
            return;
        }
        view.setVisibility(8);
    }

    /* renamed from: Q */
    public static void m49922Q(Context context, boolean z) {
        C9508w.m49959b(context, "is_splash_show_again", Boolean.valueOf(z));
    }

    /* renamed from: R */
    public static void m49923R(Activity activity, GiftSwitchView giftSwitchView) {
        if (activity != null && !activity.isFinishing() && giftSwitchView != null && !giftSwitchView.mo32808j()) {
            giftSwitchView.setGift(f36513q);
            giftSwitchView.mo32811o();
            giftSwitchView.setOnClickListener(new C9507e(giftSwitchView, activity));
        }
    }

    /* renamed from: S */
    private static boolean m49924S() {
        int i = f36509m;
        return i < 10 && i % 2 == 0;
    }

    /* renamed from: T */
    public static void m49925T(View view) {
        View view2 = view;
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.8f, 1.0f, 1.8f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(200);
        scaleAnimation.setFillAfter(true);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.8f, 1.0f, 1.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(200);
        scaleAnimation2.setFillAfter(true);
        scaleAnimation.setAnimationListener(new C9503a(view2, scaleAnimation2));
        view2.startAnimation(scaleAnimation);
    }

    /* renamed from: U */
    public static void m49926U(Activity activity, C9488q qVar) {
        m49927V(activity, qVar, (C4592c) null);
    }

    /* renamed from: V */
    public static void m49927V(Activity activity, C9488q qVar, C4592c cVar) {
        m49934e(activity);
        AdHelper.m49536p().mo32446g(activity);
        f36519w.mo32542l(activity);
        m49928W(activity.getApplication(), activity.getFilesDir().getPath(), qVar, cVar);
    }

    /* renamed from: W */
    static void m49928W(Application application, String str, C9488q qVar, C4592c cVar) {
        if ((application instanceof AbstractApplication) && ((AbstractApplication) application).mo26945h() == 0 && C9564d.m50184j(application.getApplicationContext())) {
            try {
                new Thread(new C9394d(str, application, qVar, cVar)).start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: X */
    public static void m49929X(Activity activity, View view, ImageView imageView, TextView textView) {
        int i = f36511o;
        f36511o = i + 1;
        if (i % 2 == 0) {
            ArrayList<C9483n> arrayList = f36513q;
            if (arrayList == null || arrayList.isEmpty()) {
                view.setVisibility(8);
                return;
            }
            ArrayList<C9483n> arrayList2 = f36513q;
            int i2 = f36510n;
            f36510n = i2 + 1;
            m49921P(activity, arrayList2.get(i2 % arrayList2.size()), view, imageView, textView, 1);
            m49925T(imageView);
        }
    }

    /* renamed from: a */
    public static ArrayList<C9483n> m49930a() {
        return f36513q;
    }

    /* renamed from: b */
    public static void m49931b(ArrayList<C9483n> arrayList) {
        if (arrayList != null) {
            if (f36513q != null) {
                f36513q = null;
            }
            f36513q = arrayList;
            if (!arrayList.isEmpty()) {
                for (int i = 0; i < f36513q.size(); i++) {
                    if (m49951v(f36513q.get(i).mo32695g())) {
                        f36510n = 0;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static void m49932c(ArrayList<C9483n> arrayList) {
        boolean z;
        if (f36515s != null) {
            f36515s = null;
        }
        f36515s = arrayList;
        File[] listFiles = new File(f36502f).listFiles();
        if (listFiles != null) {
            for (int i = 0; i < listFiles.length; i++) {
                String name = listFiles[i].getName();
                int i2 = 0;
                while (true) {
                    if (i2 >= f36515s.size()) {
                        z = false;
                        break;
                    } else if (name.equals(f36515s.get(i2).mo32695g())) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z) {
                    listFiles[i].delete();
                }
            }
        }
    }

    /* renamed from: d */
    public static void m49933d(Activity activity) {
        try {
            if (f36505i) {
                TextView textView = (TextView) activity.findViewById(C8614g.newcount_tv);
                int n = m49943n();
                if (n > 0) {
                    activity.findViewById(C8614g.promotion_icon).setVisibility(0);
                    if (n > 9) {
                        textView.setBackgroundResource(C8613f.newcount_bg_little);
                        textView.setText(BuildConfig.FLAVOR + n);
                        textView.setTextSize(2, 9.0f);
                    } else {
                        textView.setBackgroundResource(C8613f.newcount_bg);
                        textView.setText(BuildConfig.FLAVOR + n);
                        textView.setTextSize(2, 11.0f);
                    }
                    textView.setVisibility(0);
                    textView.startAnimation(AnimationUtils.loadAnimation(activity, C8608a.newcount_in));
                } else if (!f36506j) {
                    activity.findViewById(C8614g.promotion_icon).setVisibility(8);
                } else {
                    textView.setVisibility(8);
                    activity.findViewById(C8614g.promotion_icon).setVisibility(0);
                }
            } else {
                activity.findViewById(C8614g.newcount_tv).setVisibility(4);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    static void m49934e(Activity activity) {
        UpdateManager updateManager = new UpdateManager();
        f36518v = updateManager;
        updateManager.checkForUpdate(activity);
        new Handler(Looper.getMainLooper()).postDelayed(new C9430g(activity), 300);
    }

    /* renamed from: f */
    public static void m49935f(Activity activity) {
        new UpdateManager().checkInAppUpdate(activity);
    }

    /* renamed from: g */
    public static PopupWindow m49936g(Context context, String str) {
        View inflate = LayoutInflater.from(context).inflate(C8615h.loading_dialog, (ViewGroup) null);
        int i = C8614g.dialog_view;
        ((ImageView) inflate.findViewById(C8614g.img)).startAnimation(AnimationUtils.loadAnimation(context, C8608a.load_animation));
        ((TextView) inflate.findViewById(C8614g.tipTextView)).setText(str);
        PopupWindow popupWindow = new PopupWindow(inflate, -1, -1);
        popupWindow.setFocusable(true);
        popupWindow.setClippingEnabled(false);
        ((LinearLayout) inflate.findViewById(i)).findViewById(i).setOnKeyListener(new C9506d());
        return popupWindow;
    }

    /* renamed from: h */
    public static void m49937h(Activity activity) {
        m49938i(activity, 0);
    }

    /* renamed from: i */
    public static void m49938i(Activity activity, int i) {
        C9483n nVar;
        boolean z;
        int i2;
        int i3;
        String str;
        if ((activity.getApplication() instanceof AbstractApplication) && ((AbstractApplication) activity.getApplication()).mo26945h() == 0) {
            AppOpenAdManager c = ((AbstractApplication) activity.getApplication()).mo32493c();
            if (f36496B || (c != null && c.mo32467r())) {
                f36496B = false;
                return;
            }
            f36495A++;
            ArrayList<C9483n> arrayList = f36514r;
            if (arrayList != null && !arrayList.isEmpty() && C9564d.m50184j(activity) && !f36508l && !f36507k) {
                int size = f36514r.size();
                int i4 = f36499c;
                if (size <= i4) {
                    nVar = f36514r.get(0);
                } else {
                    nVar = f36514r.get(i4);
                }
                C9483n nVar2 = nVar;
                if (nVar2 != null && !TextUtils.isEmpty(nVar2.mo32695g()) && !C9564d.m50182h(activity, nVar2.mo32695g())) {
                    if (f36517u == null) {
                        f36517u = PreferenceManager.getDefaultSharedPreferences(activity);
                    }
                    if (!nVar2.mo32695g().equals(f36517u.getString("start_dialog_packagename", BuildConfig.FLAVOR))) {
                        f36509m = 0;
                        f36517u.edit().putInt("open_times", 0).apply();
                        f36517u.edit().putInt("start_dialog_times", f36509m).apply();
                        f36517u.edit().putString("start_dialog_packagename", nVar2.mo32695g()).apply();
                    }
                    if (f36517u.getInt("open_times", 0) - f36509m != 1) {
                        f36517u.edit().putInt("open_times", f36509m + 1).apply();
                    }
                    if (m49924S() && f36495A >= 2) {
                        if (TextUtils.isEmpty(nVar2.mo32691c()) && TextUtils.isEmpty(nVar2.mo32692d())) {
                            i2 = 0;
                            z = true;
                        } else if (TextUtils.isEmpty(nVar2.mo32691c()) || TextUtils.isEmpty(nVar2.mo32692d())) {
                            boolean[] zArr = {false, !TextUtils.isEmpty(nVar2.mo32694f())};
                            int nextInt = new Random(System.currentTimeMillis()).nextInt(2);
                            z = zArr[nextInt];
                            i2 = nextInt;
                        } else {
                            int i5 = 3;
                            boolean[] zArr2 = {false, false, !TextUtils.isEmpty(nVar2.mo32694f())};
                            Random random = new Random(System.currentTimeMillis());
                            if (TextUtils.isEmpty(nVar2.mo32694f())) {
                                i5 = 2;
                            }
                            i2 = random.nextInt(i5);
                            z = zArr2[i2];
                        }
                        C9558a.C9559a aVar = new C9558a.C9559a(activity, i);
                        if (z) {
                            i3 = C8615h.layout_dialog_start_up_without_banner;
                        } else {
                            i3 = C8615h.layout_dialog_start_up;
                        }
                        aVar.mo32944i(i3);
                        aVar.mo32945j(z ? 0.9f : 0.96f);
                        aVar.mo32942g(true);
                        aVar.mo32943h(false);
                        C9558a f = aVar.mo32941f();
                        GiftConfig.m49723h((TextView) f.mo32937f().findViewById(C8614g.tv_title), GiftConfig.m49721d(activity), nVar2.mo32696h(), nVar2.mo32696h());
                        GiftConfig.m49722g((TextView) f.mo32937f().findViewById(C8614g.tv_description), GiftConfig.m49720b(activity), nVar2.mo32689a(), nVar2.mo32690b());
                        String str2 = nVar2.mo32695g() + ".icon_bannerPath";
                        String c2 = nVar2.mo32691c();
                        if (!z) {
                            String[] strArr = {nVar2.mo32691c(), nVar2.mo32692d()};
                            String[] strArr2 = {nVar2.mo32695g() + ".icon_bannerPath", nVar2.mo32695g() + ".icon_bannerPath2"};
                            if (TextUtils.isEmpty(strArr[i2])) {
                                i2 = i2 == 0 ? i2 + 1 : i2 - 1;
                            }
                            str = strArr[i2];
                            str2 = strArr2[i2];
                        } else {
                            str = c2;
                        }
                        if (!new File(f36501e + str2).exists()) {
                            f36509m = 0;
                            return;
                        }
                        C9459l.m49807b(nVar2.mo32693e(), f36501e + nVar2.mo32695g(), new C9504b(f));
                        if (!z) {
                            C9459l.m49807b(str, f36501e + str2, new C9505c(f));
                        }
                        if (!activity.isFinishing()) {
                            f.show();
                            f36508l = true;
                        }
                        C9396f fVar = new C9396f(f, str, nVar2, z, activity);
                        f.mo32936e(C8614g.iv_close, fVar);
                        f.mo32936e(C8614g.rl_ad, fVar);
                        f.mo32936e(C8614g.btn_install, fVar);
                        if (!z) {
                            f.mo32936e(C8614g.iv_cover, fVar);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0079 A[LOOP:0: B:33:0x0079->B:36:0x008d, LOOP_START, PHI: r2 
      PHI: (r2v2 boolean) = (r2v0 boolean), (r2v6 boolean) binds: [B:32:0x0075, B:36:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m49939j(android.app.Activity r5) {
        /*
            android.content.res.Resources r0 = r5.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            r1 = 2
            if (r0 != r1) goto L_0x0011
            r5.finish()
            return
        L_0x0011:
            boolean r0 = r5 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L_0x00a5
            android.content.SharedPreferences r0 = f36517u
            if (r0 != 0) goto L_0x001f
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r5)
            f36517u = r0
        L_0x001f:
            android.content.SharedPreferences r0 = f36517u
            java.lang.String r1 = "APP_RATE"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            android.app.Application r1 = r5.getApplication()
            net.coocent.android.xmlparser.application.AbstractApplication r1 = (net.coocent.android.xmlparser.application.AbstractApplication) r1
            int r1 = r1.mo26945h()
            if (r1 != 0) goto L_0x0036
            r1 = 1
            goto L_0x0037
        L_0x0036:
            r1 = 0
        L_0x0037:
            java.util.ArrayList r3 = m49930a()
            if (r0 == 0) goto L_0x0073
            boolean r4 = m49952w(r5)
            if (r4 == 0) goto L_0x0047
            r5.finish()
            return
        L_0x0047:
            if (r1 == 0) goto L_0x0057
            boolean r1 = net.coocent.android.xmlparser.p461z.C9564d.m50184j(r5)
            if (r1 == 0) goto L_0x0057
            if (r3 == 0) goto L_0x0057
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x0073
        L_0x0057:
            net.coocent.android.xmlparser.ads.AdHelper r1 = net.coocent.android.xmlparser.ads.AdHelper.m49536p()
            android.widget.FrameLayout r1 = r1.mo32454o()
            if (r1 == 0) goto L_0x006f
            net.coocent.android.xmlparser.ads.AdHelper r1 = net.coocent.android.xmlparser.ads.AdHelper.m49536p()
            android.widget.FrameLayout r1 = r1.mo32454o()
            int r1 = r1.getChildCount()
            if (r1 != 0) goto L_0x0073
        L_0x006f:
            r5.finish()
            return
        L_0x0073:
            if (r3 == 0) goto L_0x008f
            java.util.Iterator r1 = r3.iterator()
        L_0x0079:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x008f
            java.lang.Object r2 = r1.next()
            net.coocent.android.xmlparser.n r2 = (net.coocent.android.xmlparser.C9483n) r2
            java.lang.String r2 = r2.mo32695g()
            boolean r2 = net.coocent.android.xmlparser.p461z.C9564d.m50182h(r5, r2)
            if (r2 != 0) goto L_0x0079
        L_0x008f:
            if (r2 == 0) goto L_0x0095
            r5.finish()
            return
        L_0x0095:
            net.coocent.android.xmlparser.widget.dialog.k r0 = net.coocent.android.xmlparser.widget.dialog.C9530k.m50020o3(r0)
            androidx.appcompat.app.AppCompatActivity r5 = (androidx.appcompat.app.AppCompatActivity) r5
            androidx.fragment.app.j r5 = r5.mo3730H1()
            java.lang.String r1 = net.coocent.android.xmlparser.widget.dialog.C9530k.f36568F0
            r0.mo3841h3(r5, r1)
            goto L_0x00a8
        L_0x00a5:
            r5.finish()
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.coocent.android.xmlparser.C9502v.m49939j(android.app.Activity):void");
    }

    /* renamed from: k */
    public static void m49940k(Activity activity) {
        try {
            if (!activity.isFinishing()) {
                String charSequence = activity.getPackageManager().getPackageInfo(activity.getApplication().getPackageName(), 0).applicationInfo.loadLabel(activity.getPackageManager()).toString();
                PopupWindow g = m49936g(activity, "You're leaving " + charSequence);
                g.showAtLocation(activity.getWindow().getDecorView(), 8388659, 0, 0);
                g.setOnDismissListener(new C9395e(activity));
                new Handler(Looper.getMainLooper()).postDelayed(new C9450h(g), 1500);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: l */
    public static String m49941l() {
        int i = f36499c;
        if (i == 0) {
            return "photos";
        }
        if (i == 1) {
            return "media";
        }
        return i == 2 ? "tools" : BuildConfig.FLAVOR;
    }

    /* renamed from: m */
    public static ArrayList<C9483n> m49942m() {
        return f36516t;
    }

    /* renamed from: n */
    public static int m49943n() {
        int i;
        ArrayList<C9483n> arrayList = f36513q;
        if (arrayList == null || arrayList.isEmpty()) {
            i = 0;
        } else {
            int min = Math.min(f36513q.size(), 3);
            i = 0;
            for (int i2 = 0; i2 < min; i2++) {
                if (m49951v(f36513q.get(i2).mo32695g())) {
                    i++;
                }
            }
        }
        ArrayList<C9483n> arrayList2 = f36516t;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int min2 = Math.min(f36516t.size(), 3);
            for (int i3 = 0; i3 < min2; i3++) {
                if (m49951v(f36516t.get(i3).mo32695g())) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: o */
    public static C9483n m49944o() {
        ArrayList<C9483n> arrayList = f36513q;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                f36512p = null;
            } else {
                ArrayList<C9483n> arrayList2 = f36513q;
                int i = f36510n;
                f36510n = i + 1;
                f36512p = arrayList2.get(i % arrayList2.size());
            }
        }
        return f36512p;
    }

    @Deprecated
    /* renamed from: p */
    public static void m49945p(Context context) {
        C9564d.m50177c(context);
    }

    /* renamed from: q */
    public static void m49946q(Context context, String str) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        f36517u = defaultSharedPreferences;
        f36509m = defaultSharedPreferences.getInt("open_times", 0);
        if (str != null) {
            if (str.equals("/PhotoAppList.xml")) {
                f36499c = 0;
            } else if (str.equals("/MediaAppList.xml")) {
                f36499c = 1;
            } else if (str.equals("/ToolAppList.xml")) {
                f36499c = 2;
            }
        }
        if (C9564d.m50184j(context)) {
            String j = C9566f.m50199j(context);
            f36503g = j;
            if (!TextUtils.isEmpty(j)) {
                f36503g = "/" + f36503g;
                f36500d = "V3" + f36503g + str;
            } else {
                f36503g = BuildConfig.FLAVOR;
                f36500d = "V3" + str;
            }
            f36501e = context.getFilesDir() + "/icon/";
            f36502f = context.getFilesDir() + "/flashimg/";
            File file = new File(f36501e);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(f36502f);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            f36517u.getInt("start_dialog_times", 0);
            f36510n = f36517u.getInt("PLAY_ICON_INDEX", 0);
            f36520x = f36517u.getInt("exit_dialog_showed_count", 0);
        }
    }

    @Deprecated
    /* renamed from: r */
    public static void m49947r(Activity activity, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Intent action = activity.getPackageManager().getLaunchIntentForPackage("com.android.vending").setAction("android.intent.action.VIEW");
                action.setData(Uri.parse(("market://details?id=" + str) + str2));
                C9566f.m50207r(activity);
                activity.startActivity(action);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: s */
    public static boolean m49948s() {
        ArrayList<C9483n> arrayList = f36513q;
        return arrayList == null || arrayList.isEmpty();
    }

    /* renamed from: t */
    public static boolean m49949t() {
        return f36507k;
    }

    @Deprecated
    /* renamed from: u */
    public static boolean m49950u(Context context) {
        return C9564d.m50184j(context);
    }

    /* renamed from: v */
    public static boolean m49951v(String str) {
        SharedPreferences sharedPreferences = f36517u;
        return sharedPreferences == null || !sharedPreferences.contains(str);
    }

    /* renamed from: w */
    public static boolean m49952w(Context context) {
        if (f36517u == null) {
            f36517u = PreferenceManager.getDefaultSharedPreferences(context);
        }
        return f36517u.getBoolean("is_purchased", false);
    }

    /* renamed from: x */
    public static boolean m49953x() {
        SharedPreferences sharedPreferences = f36517u;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("APP_RATE", false);
        }
        return false;
    }

    /* renamed from: y */
    public static boolean m49954y(Context context) {
        return ((Boolean) C9508w.m49958a(context, "is_remove_ads", Boolean.FALSE)).booleanValue();
    }

    /* renamed from: z */
    public static boolean m49955z(Context context) {
        return ((Boolean) C9508w.m49958a(context, "is_splash_show_again", Boolean.TRUE)).booleanValue();
    }
}
