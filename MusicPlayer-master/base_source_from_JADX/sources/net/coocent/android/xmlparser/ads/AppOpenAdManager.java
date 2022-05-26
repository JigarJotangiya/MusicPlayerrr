package net.coocent.android.xmlparser.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.lifecycle.C0674g0;
import androidx.lifecycle.C0676h0;
import androidx.lifecycle.C0697n;
import androidx.lifecycle.C0717u;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.C2851a;
import com.google.android.gms.ads.C2903f;
import com.google.android.gms.ads.C3059k;
import com.google.android.gms.ads.C3060l;
import com.google.android.gms.ads.p072v.C3118a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import net.coocent.android.xmlparser.C9502v;
import net.coocent.android.xmlparser.activity.AbstractLaunchActivity;
import net.coocent.android.xmlparser.activity.ExitRateActivity;
import net.coocent.android.xmlparser.application.AbstractApplication;
import net.coocent.android.xmlparser.feedback.FeedbackActivity;
import net.coocent.android.xmlparser.gift.GiftWithGameActivity;
import net.coocent.android.xmlparser.p461z.C9564d;

public class AppOpenAdManager implements C0717u {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Application f36190g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public WeakReference<Activity> f36191h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C3118a f36192i;

    /* renamed from: j */
    private final List<Class<? extends Activity>> f36193j;

    /* renamed from: k */
    private final Class<? extends Activity> f36194k = AbstractLaunchActivity.class;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f36195l = 2;

    /* renamed from: m */
    private final SparseArray<String> f36196m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f36197n = 0;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f36198o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f36199p;

    /* renamed from: q */
    private boolean f36200q = false;

    /* renamed from: r */
    private boolean f36201r = true;

    /* renamed from: s */
    private final C3118a.C3119a f36202s = new C9371a();

    /* renamed from: net.coocent.android.xmlparser.ads.AppOpenAdManager$a */
    class C9371a extends C3118a.C3119a {
        C9371a() {
        }

        /* renamed from: a */
        public void mo10633a(C3060l lVar) {
            super.mo10633a(lVar);
            boolean unused = AppOpenAdManager.this.f36198o = false;
            if (AppOpenAdManager.this.f36195l == 2) {
                int unused2 = AppOpenAdManager.this.f36195l = 1;
                AppOpenAdManager.this.mo32470u();
            } else if (AppOpenAdManager.this.f36195l == 1) {
                int unused3 = AppOpenAdManager.this.f36195l = 0;
                AppOpenAdManager.this.mo32470u();
            } else {
                int unused4 = AppOpenAdManager.this.f36195l = 2;
                if ((AppOpenAdManager.this.f36190g instanceof AbstractApplication) && ((AbstractApplication) AppOpenAdManager.this.f36190g).mo26944f()) {
                    Log.d("PromotionGmsAds", "AppOpenAd load failed. Quality: " + lVar.mo11169f());
                }
            }
        }

        /* renamed from: c */
        public void mo10634b(C3118a aVar) {
            super.mo10634b(aVar);
            C3118a unused = AppOpenAdManager.this.f36192i = aVar;
            boolean unused2 = AppOpenAdManager.this.f36198o = false;
            long unused3 = AppOpenAdManager.this.f36197n = new Date().getTime();
            if ((AppOpenAdManager.this.f36190g instanceof AbstractApplication) && ((AbstractApplication) AppOpenAdManager.this.f36190g).mo26944f()) {
                Log.d("PromotionGmsAds", "AppOpenAd loaded. Quality: " + AppOpenAdManager.this.f36195l);
            }
        }
    }

    /* renamed from: net.coocent.android.xmlparser.ads.AppOpenAdManager$b */
    class C9372b extends C9374d {
        C9372b() {
            super((C9371a) null);
        }

        public void onActivityStarted(Activity activity) {
            super.onActivityStarted(activity);
            if (!AppOpenAdManager.this.f36199p) {
                WeakReference unused = AppOpenAdManager.this.f36191h = new WeakReference(activity);
            }
        }
    }

    /* renamed from: net.coocent.android.xmlparser.ads.AppOpenAdManager$c */
    class C9373c extends C3059k {

        /* renamed from: a */
        final /* synthetic */ C9388j f36205a;

        C9373c(C9388j jVar) {
            this.f36205a = jVar;
        }

        /* renamed from: b */
        public void mo10635b() {
            super.mo10635b();
            C9502v.m49919N(true);
            C3118a unused = AppOpenAdManager.this.f36192i = null;
            boolean unused2 = AppOpenAdManager.this.f36199p = false;
            AppOpenAdManager.this.mo32470u();
            C9388j jVar = this.f36205a;
            if (jVar != null) {
                jVar.mo32437a();
            }
        }

        /* renamed from: c */
        public void mo11167c(C2851a aVar) {
            super.mo11167c(aVar);
            C3118a unused = AppOpenAdManager.this.f36192i = null;
            boolean unused2 = AppOpenAdManager.this.f36199p = false;
            AppOpenAdManager.this.mo32470u();
        }

        /* renamed from: e */
        public void mo10636e() {
            super.mo10636e();
            AdHelper.m49536p().mo32457t();
        }
    }

    /* renamed from: net.coocent.android.xmlparser.ads.AppOpenAdManager$d */
    private static abstract class C9374d implements Application.ActivityLifecycleCallbacks {
        private C9374d() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }

        /* synthetic */ C9374d(C9371a aVar) {
            this();
        }
    }

    public AppOpenAdManager(Application application) {
        this.f36190g = application;
        this.f36193j = new ArrayList();
        SparseArray<String> sparseArray = new SparseArray<>();
        this.f36196m = sparseArray;
        try {
            String str = AbstractApplication.get(4332);
            if (!TextUtils.isEmpty(str)) {
                sparseArray.put(2, str);
            }
            String str2 = AbstractApplication.get(4331);
            if (!TextUtils.isEmpty(str2)) {
                sparseArray.put(1, str2);
            }
            String str3 = AbstractApplication.get(4330);
            if (!TextUtils.isEmpty(str3)) {
                sparseArray.put(0, str3);
            }
        } catch (UnsatisfiedLinkError unused) {
            C9564d.m50188n(application);
        }
        if (this.f36196m.size() != 0) {
            this.f36190g.registerActivityLifecycleCallbacks(new C9372b());
            C0676h0.m4216h().mo390v().mo4256a(this);
            this.f36193j.add(this.f36194k);
            this.f36193j.add(AdActivity.class);
            this.f36193j.add(GiftWithGameActivity.class);
            this.f36193j.add(ExitRateActivity.class);
            this.f36193j.add(FeedbackActivity.class);
            Application application2 = this.f36190g;
            if (application2 instanceof AbstractApplication) {
                List<Class<? extends Activity>> b = ((AbstractApplication) application2).mo26942b();
                if (!b.isEmpty()) {
                    this.f36193j.addAll(b);
                }
            }
        }
    }

    /* renamed from: A */
    private boolean m49565A(int i) {
        return new Date().getTime() - this.f36197n < ((long) i) * 3600000;
    }

    @C0674g0(C0697n.C0699b.ON_START)
    public void moveAppOpenAdToForeground() {
        if (this.f36201r) {
            mo32470u();
            boolean z = false;
            if (this.f36200q) {
                this.f36200q = false;
                return;
            }
            WeakReference<Activity> weakReference = this.f36191h;
            if (weakReference != null && weakReference.get() != null) {
                Activity activity = (Activity) this.f36191h.get();
                Iterator<Class<? extends Activity>> it = this.f36193j.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().isInstance(activity)) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    mo32474y((Activity) this.f36191h.get());
                }
            }
        }
    }

    /* renamed from: q */
    public void mo32466q() {
        this.f36193j.add(this.f36194k);
    }

    /* renamed from: r */
    public boolean mo32467r() {
        return this.f36192i != null && m49565A(4);
    }

    /* renamed from: s */
    public boolean mo32468s() {
        return this.f36198o;
    }

    /* renamed from: t */
    public boolean mo32469t() {
        return C9502v.m49952w(this.f36190g) || C9502v.m49954y(this.f36190g);
    }

    /* renamed from: u */
    public void mo32470u() {
        SparseArray<String> sparseArray;
        if (!mo32469t() && !this.f36198o && !mo32467r() && (sparseArray = this.f36196m) != null && sparseArray.size() != 0) {
            Application application = this.f36190g;
            if ((application instanceof AbstractApplication) && ((AbstractApplication) application).mo26944f()) {
                Log.d("PromotionGmsAds", "The app open ad is not ready yet. Loading app open ad...");
            }
            this.f36198o = true;
            C3118a.m13689a(this.f36190g, this.f36196m.get(this.f36195l, AbstractApplication.get(4331)), new C2903f.C2904a().mo10736c(), 1, this.f36202s);
        }
    }

    /* renamed from: v */
    public void mo32471v() {
        this.f36193j.remove(this.f36194k);
    }

    /* renamed from: w */
    public void mo32472w() {
        this.f36200q = true;
    }

    /* renamed from: x */
    public void mo32473x(boolean z) {
        this.f36201r = z;
    }

    /* renamed from: y */
    public void mo32474y(Activity activity) {
        mo32475z(activity, (C9388j) null);
    }

    /* renamed from: z */
    public void mo32475z(Activity activity, C9388j jVar) {
        if (!this.f36199p && !mo32469t() && mo32467r()) {
            try {
                this.f36199p = true;
                this.f36192i.mo11374c(activity);
                this.f36192i.mo11373b(new C9373c(jVar));
            } catch (Exception unused) {
                this.f36199p = false;
            }
        }
    }
}
