package net.coocent.android.xmlparser.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C2903f;
import com.google.android.gms.ads.C3059k;
import com.google.android.gms.ads.C3060l;
import com.google.android.gms.ads.p076z.C3130a;
import com.google.android.gms.ads.p076z.C3131b;
import net.coocent.android.xmlparser.C9502v;
import net.coocent.android.xmlparser.application.AbstractApplication;
import net.coocent.android.xmlparser.p461z.C9564d;
import p082e.p098e.C3479h;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: net.coocent.android.xmlparser.ads.g */
/* compiled from: InterstitialAdManager */
class C9382g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3479h<C3130a> f36234a = new C3479h<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3479h<Boolean> f36235b = new C3479h<>();

    /* renamed from: net.coocent.android.xmlparser.ads.g$a */
    /* compiled from: InterstitialAdManager */
    class C9383a extends C3059k {

        /* renamed from: a */
        final /* synthetic */ int f36236a;

        /* renamed from: b */
        final /* synthetic */ C9387i f36237b;

        /* renamed from: c */
        final /* synthetic */ Activity f36238c;

        C9383a(int i, C9387i iVar, Activity activity) {
            this.f36236a = i;
            this.f36237b = iVar;
            this.f36238c = activity;
        }

        /* renamed from: b */
        public void mo10635b() {
            AppOpenAdManager c;
            super.mo10635b();
            C9382g.this.f36234a.mo12415l(this.f36236a);
            C9387i iVar = this.f36237b;
            if (iVar != null) {
                iVar.mo26565a();
            }
            if ((this.f36238c.getApplication() instanceof AbstractApplication) && (c = ((AbstractApplication) this.f36238c.getApplication()).mo32493c()) != null) {
                c.mo32473x(true);
            }
            if (!C9502v.m49949t()) {
                C9382g.this.mo32487c(this.f36238c, 2, this.f36236a);
            }
        }

        /* renamed from: e */
        public void mo10636e() {
            AppOpenAdManager c;
            super.mo10636e();
            if ((this.f36238c.getApplication() instanceof AbstractApplication) && (c = ((AbstractApplication) this.f36238c.getApplication()).mo32493c()) != null) {
                c.mo32473x(false);
            }
        }
    }

    /* renamed from: net.coocent.android.xmlparser.ads.g$b */
    /* compiled from: InterstitialAdManager */
    class C9384b extends C3131b {

        /* renamed from: a */
        final /* synthetic */ int f36240a;

        /* renamed from: b */
        final /* synthetic */ String f36241b;

        /* renamed from: c */
        final /* synthetic */ Context f36242c;

        /* renamed from: d */
        final /* synthetic */ int f36243d;

        C9384b(int i, String str, Context context, int i2) {
            this.f36240a = i;
            this.f36241b = str;
            this.f36242c = context;
            this.f36243d = i2;
        }

        /* renamed from: a */
        public void mo10633a(C3060l lVar) {
            super.mo10633a(lVar);
            int i = this.f36240a;
            if (i == 0) {
                Log.i("PromotionGmsAds", this.f36241b + "load low interstitialAd failed " + lVar.mo10665a());
            } else if (i == 2) {
                Log.i("PromotionGmsAds", this.f36241b + "load high interstitialAd failed " + lVar.mo10665a());
                C9382g.this.mo32487c(this.f36242c, 1, this.f36243d);
            } else {
                Log.i("PromotionGmsAds", this.f36241b + "load common interstitialAd failed " + lVar.mo10665a());
                C9382g.this.mo32487c(this.f36242c, 0, this.f36243d);
            }
            C9382g.this.f36235b.mo12414k(this.f36243d, Boolean.FALSE);
        }

        /* renamed from: c */
        public void mo10634b(C3130a aVar) {
            super.mo10634b(aVar);
            C9382g.this.f36234a.mo12414k(this.f36243d, aVar);
            C9382g.this.f36235b.mo12414k(this.f36243d, Boolean.FALSE);
            int i = this.f36240a;
            if (i == 2) {
                Log.i("PromotionGmsAds", this.f36241b + "load high interstitialAd successful ");
            } else if (i == 1) {
                Log.i("PromotionGmsAds", this.f36241b + "load common interstitialAd successful ");
            } else {
                Log.i("PromotionGmsAds", this.f36241b + "load low interstitialAd successful ");
            }
        }
    }

    C9382g() {
    }

    /* renamed from: d */
    private String m49612d(Context context, int i, int i2) {
        if (i == 2) {
            if (i2 == 2) {
                try {
                    return AbstractApplication.get(4347);
                } catch (UnsatisfiedLinkError unused) {
                    C9564d.m50188n(context);
                    return BuildConfig.FLAVOR;
                }
            } else if (i2 == 1) {
                return AbstractApplication.get(4338);
            } else {
                if (i2 == 3) {
                    return AbstractApplication.get(4353);
                }
                return AbstractApplication.get(4323);
            }
        } else if (i == 1) {
            if (i2 == 2) {
                return AbstractApplication.get(4346);
            }
            if (i2 == 1) {
                return AbstractApplication.get(4337);
            }
            if (i2 == 3) {
                return AbstractApplication.get(4352);
            }
            return AbstractApplication.get(4322);
        } else if (i2 == 2) {
            return AbstractApplication.get(4345);
        } else {
            if (i2 == 1) {
                return AbstractApplication.get(4336);
            }
            if (i2 == 3) {
                return AbstractApplication.get(4351);
            }
            return AbstractApplication.get(4321);
        }
    }

    /* renamed from: f */
    private void m49613f(Context context, String str, C3131b bVar) {
        if (!C9502v.m49954y(context)) {
            C2903f.C2904a aVar = new C2903f.C2904a();
            Bundle bundle = new Bundle();
            bundle.putString("npa", "1");
            aVar.mo10735b(AdMobAdapter.class, bundle);
            C3130a.m13710a(context, str, aVar.mo10736c(), bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo32487c(Context context, int i, int i2) {
        m49613f(context, m49612d(context, i, i2), new C9384b(i, i2 == 2 ? "Launch " : i2 == 1 ? "Game " : BuildConfig.FLAVOR, context, i2));
        this.f36235b.mo12414k(i2, Boolean.TRUE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo32488e(int i) {
        return this.f36234a.mo12409f(i) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo32489g(Activity activity, int i, C9387i iVar) {
        C3130a f = this.f36234a.mo12409f(i);
        if (f != null) {
            f.mo11388b(new C9383a(i, iVar, activity));
            f.mo11390d(activity);
        }
    }
}
