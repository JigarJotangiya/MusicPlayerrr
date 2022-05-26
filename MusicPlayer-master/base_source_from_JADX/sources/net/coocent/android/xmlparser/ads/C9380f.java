package net.coocent.android.xmlparser.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C2894c;
import com.google.android.gms.ads.C2903f;
import com.google.android.gms.ads.C2921g;
import com.google.android.gms.ads.C3060l;
import java.lang.ref.WeakReference;
import net.coocent.android.xmlparser.C9490s;
import net.coocent.android.xmlparser.C9502v;
import net.coocent.android.xmlparser.application.AbstractApplication;
import net.coocent.android.xmlparser.p461z.C9564d;
import p391j.p392a.p393a.C8612e;
import p391j.p392a.p393a.C8613f;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: net.coocent.android.xmlparser.ads.f */
/* compiled from: BannerAdCreator */
class C9380f {

    /* renamed from: net.coocent.android.xmlparser.ads.f$a */
    /* compiled from: BannerAdCreator */
    class C9381a extends C2894c {

        /* renamed from: a */
        final /* synthetic */ C9490s f36223a;

        /* renamed from: b */
        final /* synthetic */ int f36224b;

        /* renamed from: c */
        final /* synthetic */ String f36225c;

        /* renamed from: d */
        final /* synthetic */ WeakReference f36226d;

        /* renamed from: e */
        final /* synthetic */ Context f36227e;

        /* renamed from: f */
        final /* synthetic */ int f36228f;

        /* renamed from: g */
        final /* synthetic */ boolean f36229g;

        /* renamed from: h */
        final /* synthetic */ int f36230h;

        /* renamed from: i */
        final /* synthetic */ C2921g f36231i;

        /* renamed from: j */
        final /* synthetic */ boolean f36232j;

        /* renamed from: k */
        final /* synthetic */ AdView f36233k;

        C9381a(C9490s sVar, int i, String str, WeakReference weakReference, Context context, int i2, boolean z, int i3, C2921g gVar, boolean z2, AdView adView) {
            this.f36223a = sVar;
            this.f36224b = i;
            this.f36225c = str;
            this.f36226d = weakReference;
            this.f36227e = context;
            this.f36228f = i2;
            this.f36229g = z;
            this.f36230h = i3;
            this.f36231i = gVar;
            this.f36232j = z2;
            this.f36233k = adView;
        }

        /* renamed from: e */
        public void mo10628e() {
            super.mo10628e();
            C9490s sVar = this.f36223a;
            if (sVar != null) {
                sVar.mo32716b();
            }
        }

        /* renamed from: g */
        public void mo10629g(C3060l lVar) {
            super.mo10629g(lVar);
            int i = this.f36224b;
            if (i == 0) {
                Log.i("PromotionGmsAds", this.f36225c + "load low banner failed " + lVar.mo10665a());
                C9490s sVar = this.f36223a;
                if (sVar != null) {
                    sVar.mo29984c(lVar);
                }
            } else if (i == 2) {
                Log.i("PromotionGmsAds", this.f36225c + "load high banner failed ");
                ViewGroup viewGroup = (ViewGroup) this.f36226d.get();
                if (viewGroup != null) {
                    AdView unused = C9380f.m49597d(this.f36227e, viewGroup, 1, this.f36228f, this.f36229g, this.f36230h, this.f36231i, this.f36232j, this.f36223a);
                }
            } else {
                Log.i("PromotionGmsAds", this.f36225c + "load common banner failed ");
                ViewGroup viewGroup2 = (ViewGroup) this.f36226d.get();
                if (viewGroup2 != null) {
                    AdView unused2 = C9380f.m49597d(this.f36227e, viewGroup2, 0, this.f36228f, this.f36229g, this.f36230h, this.f36231i, this.f36232j, this.f36223a);
                }
            }
        }

        /* renamed from: k */
        public void mo10640k() {
            super.mo10640k();
            C9490s sVar = this.f36223a;
            if (sVar != null) {
                sVar.mo32717d();
            }
        }

        /* renamed from: n */
        public void mo10630n() {
            super.mo10630n();
            int i = this.f36224b;
            if (i == 2) {
                Log.i("PromotionGmsAds", this.f36225c + "high banner loaded successful ");
            } else if (i == 1) {
                Log.i("PromotionGmsAds", this.f36225c + "common banner loaded successful ");
            } else {
                Log.i("PromotionGmsAds", this.f36225c + "low banner loaded successful ");
            }
            C9490s sVar = this.f36223a;
            if (sVar != null) {
                sVar.mo26768e();
            }
            ViewGroup viewGroup = (ViewGroup) this.f36226d.get();
            if (viewGroup != null) {
                viewGroup.setBackgroundColor(this.f36228f);
                if (this.f36232j) {
                    LinearLayout linearLayout = (LinearLayout) C9380f.m49599f(viewGroup.getContext(), this.f36223a).get();
                    if (linearLayout != null) {
                        linearLayout.addView(this.f36233k, new LinearLayout.LayoutParams(-1, -2));
                        viewGroup.removeAllViews();
                        viewGroup.addView(linearLayout);
                        return;
                    }
                    viewGroup.removeAllViews();
                    viewGroup.addView(this.f36233k);
                    return;
                }
                viewGroup.removeAllViews();
                viewGroup.addView(this.f36233k);
            }
        }

        /* renamed from: o */
        public void mo10631o() {
            super.mo10631o();
            C9490s sVar = this.f36223a;
            if (sVar != null) {
                sVar.mo32718f();
            }
        }

        /* renamed from: u0 */
        public void mo10632u0() {
            super.mo10632u0();
            C9490s sVar = this.f36223a;
            if (sVar != null) {
                sVar.mo32715a();
            }
        }
    }

    /* renamed from: c */
    public static AdView m49596c(Context context, ViewGroup viewGroup, int i, int i2, C2921g gVar, boolean z, C9490s sVar) {
        return m49598e(context, viewGroup, i, i2, gVar, z, sVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static AdView m49597d(Context context, ViewGroup viewGroup, int i, int i2, boolean z, int i3, C2921g gVar, boolean z2, C9490s sVar) {
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        int i4 = i3;
        AdView adView = new AdView(context);
        adView.setAdSize(gVar);
        adView.setAdUnitId(m49601h(context, i, i4));
        m49603j(context, viewGroup, adView, z);
        WeakReference weakReference = new WeakReference(viewGroup);
        String str = i4 == 3 ? "Exit " : i4 == 2 ? "Large " : i4 == 1 ? "Game " : BuildConfig.FLAVOR;
        adView.mo10657e().mo11359a(true);
        adView.setAdListener(new C9381a(sVar, i, str, weakReference, context, i2, z, i3, gVar, z2, adView));
        return adView;
    }

    /* renamed from: e */
    public static AdView m49598e(Context context, ViewGroup viewGroup, int i, int i2, C2921g gVar, boolean z, C9490s sVar) {
        return m49597d(context, viewGroup, 2, i, true, i2, gVar, z, sVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static WeakReference<ViewGroup> m49599f(Context context, C9490s sVar) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(C8613f.start_ad_close_button01);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(C8612e.promotion_banner_ads_close_image_padding);
        imageView.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        linearLayout.removeAllViews();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388629;
        linearLayout.addView(imageView, layoutParams);
        imageView.setOnClickListener(new C9377c(sVar));
        return new WeakReference<>(linearLayout);
    }

    /* renamed from: g */
    public static C2921g m49600g(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return C2921g.m13016a(context, (int) (((float) displayMetrics.widthPixels) / displayMetrics.density));
    }

    /* renamed from: h */
    private static String m49601h(Context context, int i, int i2) {
        if (i == 2) {
            if (i2 == 1) {
                try {
                    return AbstractApplication.get(4335);
                } catch (UnsatisfiedLinkError unused) {
                    C9564d.m50188n(context);
                    return BuildConfig.FLAVOR;
                }
            } else if (i2 == 2) {
                return AbstractApplication.get(4344);
            } else {
                if (i2 == 3) {
                    return AbstractApplication.get(4350);
                }
                return AbstractApplication.get(4320);
            }
        } else if (i == 1) {
            if (i2 == 1) {
                return AbstractApplication.get(4334);
            }
            if (i2 == 2) {
                return AbstractApplication.get(4343);
            }
            if (i2 == 3) {
                return AbstractApplication.get(4349);
            }
            return AbstractApplication.get(4319);
        } else if (i2 == 1) {
            return AbstractApplication.get(4333);
        } else {
            if (i2 == 2) {
                return AbstractApplication.get(4342);
            }
            if (i2 == 3) {
                return AbstractApplication.get(4348);
            }
            return AbstractApplication.get(4318);
        }
    }

    /* renamed from: i */
    static /* synthetic */ void m49602i(C9490s sVar, View view) {
        if (sVar != null) {
            sVar.mo32719g();
        }
    }

    /* renamed from: j */
    private static void m49603j(Context context, ViewGroup viewGroup, AdView adView, boolean z) {
        try {
            if (!C9502v.m49954y(context)) {
                if (!z && viewGroup != null) {
                    viewGroup.addView(adView);
                }
                C2903f.C2904a aVar = new C2903f.C2904a();
                Bundle bundle = new Bundle();
                bundle.putString("npa", "1");
                aVar.mo10735b(AdMobAdapter.class, bundle);
                adView.mo11152b(aVar.mo10736c());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
