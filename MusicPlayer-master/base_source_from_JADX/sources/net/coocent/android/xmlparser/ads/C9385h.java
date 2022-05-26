package net.coocent.android.xmlparser.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C2894c;
import com.google.android.gms.ads.C2900e;
import com.google.android.gms.ads.C2903f;
import com.google.android.gms.ads.C3060l;
import com.google.android.gms.ads.C3116u;
import com.google.android.gms.ads.nativead.C3098a;
import com.google.android.gms.ads.nativead.C3102b;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import net.coocent.android.xmlparser.C9491t;
import net.coocent.android.xmlparser.C9502v;
import net.coocent.android.xmlparser.application.AbstractApplication;
import net.coocent.android.xmlparser.p461z.C9564d;
import p391j.p392a.p393a.C8614g;
import p391j.p392a.p393a.C8615h;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: net.coocent.android.xmlparser.ads.h */
/* compiled from: NativeAdCreator */
class C9385h {

    /* renamed from: net.coocent.android.xmlparser.ads.h$a */
    /* compiled from: NativeAdCreator */
    class C9386a extends C2894c {

        /* renamed from: a */
        final /* synthetic */ int f36245a;

        /* renamed from: b */
        final /* synthetic */ C9491t f36246b;

        /* renamed from: c */
        final /* synthetic */ Context f36247c;

        /* renamed from: d */
        final /* synthetic */ NativeAdView f36248d;

        /* renamed from: e */
        final /* synthetic */ ViewGroup f36249e;

        /* renamed from: f */
        final /* synthetic */ int f36250f;

        C9386a(int i, C9491t tVar, Context context, NativeAdView nativeAdView, ViewGroup viewGroup, int i2) {
            this.f36245a = i;
            this.f36246b = tVar;
            this.f36247c = context;
            this.f36248d = nativeAdView;
            this.f36249e = viewGroup;
            this.f36250f = i2;
        }

        /* renamed from: g */
        public void mo10629g(C3060l lVar) {
            super.mo10629g(lVar);
            int i = this.f36245a;
            if (i == 0) {
                Log.i("PromotionGmsAds", "load low native failed " + lVar.mo10665a());
                C9491t tVar = this.f36246b;
                if (tVar != null) {
                    tVar.mo29971a(lVar);
                }
            } else if (i == 2) {
                Log.i("PromotionGmsAds", "load high native failed " + lVar.mo10665a());
                C2900e.C2901a unused = C9385h.m49627f(this.f36247c, this.f36248d, this.f36249e, this.f36250f, 1, this.f36246b);
            } else {
                Log.i("PromotionGmsAds", "load common native failed " + lVar.mo10665a());
                C2900e.C2901a unused2 = C9385h.m49627f(this.f36247c, this.f36248d, this.f36249e, this.f36250f, 0, this.f36246b);
            }
        }

        /* renamed from: n */
        public void mo10630n() {
            super.mo10630n();
            int i = this.f36245a;
            if (i == 2) {
                Log.i("PromotionGmsAds", "load high native successful");
            } else if (i == 1) {
                Log.i("PromotionGmsAds", "load common native successful");
            } else {
                Log.i("PromotionGmsAds", "load low native successful");
            }
            C9491t tVar = this.f36246b;
            if (tVar != null) {
                tVar.mo29974d();
            }
        }
    }

    /* renamed from: b */
    private static void m49623b(Context context, C2900e.C2901a aVar, NativeAdView nativeAdView, ViewGroup viewGroup, int i, int i2, C9491t tVar) {
        aVar.mo10730e(new C9386a(i2, tVar, context, nativeAdView, viewGroup, i));
        m49628g(context, aVar.mo10726a());
    }

    /* renamed from: c */
    public static NativeAdView m49624c(Context context, ViewGroup viewGroup, int i, int i2, C9491t tVar) {
        int i3 = 1;
        if (i == 0) {
            i3 = C8615h.layout_native_small;
        } else if (i == 1) {
            i3 = C8615h.layout_native_medium_type_1;
        } else if (i == 2) {
            i3 = C8615h.layout_native_medium_type_2;
        } else if (i == 3) {
            i3 = C8615h.layout_native_fullscreen_type_2;
        }
        NativeAdView nativeAdView = (NativeAdView) LayoutInflater.from(context).inflate(i3, (ViewGroup) null);
        nativeAdView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        if (i == 2) {
            ((ImageView) nativeAdView.findViewById(C8614g.ad_close)).setOnClickListener(new C9378d(tVar));
        }
        m49627f(context, nativeAdView, viewGroup, i, i2, tVar);
        return nativeAdView;
    }

    /* renamed from: d */
    static /* synthetic */ void m49625d(C9491t tVar, View view) {
        if (tVar != null) {
            tVar.mo29972b();
        }
    }

    /* renamed from: e */
    static /* synthetic */ void m49626e(NativeAdView nativeAdView, int i, ViewGroup viewGroup, C9491t tVar, C3098a aVar) {
        m49629h(aVar, nativeAdView, i);
        viewGroup.removeAllViews();
        viewGroup.addView(nativeAdView);
        viewGroup.setVisibility(0);
        if (tVar != null) {
            tVar.mo29973c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static C2900e.C2901a m49627f(Context context, NativeAdView nativeAdView, ViewGroup viewGroup, int i, int i2, C9491t tVar) {
        String str;
        int i3 = i;
        int i4 = i2;
        if (i3 == 3) {
            try {
                str = AbstractApplication.get(4354);
            } catch (UnsatisfiedLinkError unused) {
                C9564d.m50188n(context);
                str = BuildConfig.FLAVOR;
            }
        } else if (i4 == 2) {
            str = AbstractApplication.get(4326);
        } else if (i4 == 1) {
            str = AbstractApplication.get(4325);
        } else {
            str = AbstractApplication.get(4324);
        }
        Context context2 = context;
        C2900e.C2901a aVar = new C2900e.C2901a(context, str);
        NativeAdView nativeAdView2 = nativeAdView;
        ViewGroup viewGroup2 = viewGroup;
        aVar.mo10728c(new C9379e(nativeAdView, i, viewGroup, tVar));
        C3116u.C3117a aVar2 = new C3116u.C3117a();
        aVar2.mo11372b(true);
        C3116u a = aVar2.mo11371a();
        C3102b.C3103a aVar3 = new C3102b.C3103a();
        aVar3.mo11337g(a);
        aVar3.mo11333c(3);
        if (i3 == 2) {
            aVar3.mo11332b(0);
        }
        aVar.mo10732g(aVar3.mo11331a());
        m49623b(context, aVar, nativeAdView, viewGroup, i, i2, tVar);
        return aVar;
    }

    /* renamed from: g */
    private static void m49628g(Context context, C2900e eVar) {
        if (!C9502v.m49954y(context) && !C9502v.m49952w(context)) {
            C2903f.C2904a aVar = new C2903f.C2904a();
            Bundle bundle = new Bundle();
            bundle.putString("npa", "1");
            aVar.mo10735b(AdMobAdapter.class, bundle);
            eVar.mo10724b(aVar.mo10736c());
        }
    }

    /* renamed from: h */
    private static void m49629h(C3098a aVar, NativeAdView nativeAdView, int i) {
        nativeAdView.setMediaView((MediaView) nativeAdView.findViewById(C8614g.ad_media_view));
        nativeAdView.setHeadlineView(nativeAdView.findViewById(C8614g.ad_tv_headline));
        nativeAdView.setBodyView(nativeAdView.findViewById(C8614g.ad_tv_body));
        nativeAdView.setCallToActionView(nativeAdView.findViewById(C8614g.ad_btn_call_to_action));
        if (i == 0) {
            nativeAdView.setAdvertiserView(nativeAdView.findViewById(C8614g.ad_tv_advertiser));
        }
        if (i == 1) {
            nativeAdView.setAdvertiserView(nativeAdView.findViewById(C8614g.ad_tv_advertiser));
            nativeAdView.setStarRatingView(nativeAdView.findViewById(C8614g.ad_stars));
            nativeAdView.setIconView(nativeAdView.findViewById(C8614g.ad_iv_app_icon));
        }
        if (i == 3) {
            nativeAdView.setAdvertiserView(nativeAdView.findViewById(C8614g.ad_tv_advertiser));
            nativeAdView.setStarRatingView(nativeAdView.findViewById(C8614g.ad_stars));
            nativeAdView.setIconView(nativeAdView.findViewById(C8614g.ad_iv_app_icon));
            nativeAdView.setStoreView(nativeAdView.findViewById(C8614g.ad_store));
        }
        if (nativeAdView.getHeadlineView() != null) {
            if (aVar.mo11316d() != null) {
                ((TextView) nativeAdView.getHeadlineView()).setText(aVar.mo11316d());
            } else {
                nativeAdView.getHeadlineView().setVisibility(8);
            }
        }
        if (!(aVar.mo11319g() == null || nativeAdView.getMediaView() == null)) {
            MediaView mediaView = nativeAdView.getMediaView();
            mediaView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            mediaView.setMediaContent(aVar.mo11319g());
        }
        if (nativeAdView.getBodyView() != null) {
            if (aVar.mo11314b() == null) {
                nativeAdView.getBodyView().setVisibility(8);
            } else {
                nativeAdView.getBodyView().setVisibility(0);
                ((TextView) nativeAdView.getBodyView()).setText(aVar.mo11314b());
            }
        }
        if (nativeAdView.getCallToActionView() != null) {
            if (aVar.mo11315c() == null) {
                nativeAdView.getCallToActionView().setVisibility(4);
            } else {
                nativeAdView.getCallToActionView().setVisibility(0);
                ((Button) nativeAdView.getCallToActionView()).setText(aVar.mo11315c());
            }
        }
        if (nativeAdView.getIconView() != null) {
            if (aVar.mo11317e() == null) {
                nativeAdView.getIconView().setVisibility(8);
            } else {
                ((ImageView) nativeAdView.getIconView()).setImageDrawable(aVar.mo11317e().mo11323a());
                nativeAdView.getIconView().setVisibility(0);
            }
        }
        if (nativeAdView.getStarRatingView() != null) {
            if (aVar.mo11320h() == null) {
                nativeAdView.getStarRatingView().setVisibility(4);
            } else {
                ((RatingBar) nativeAdView.getStarRatingView()).setRating(aVar.mo11320h().floatValue());
                nativeAdView.getStarRatingView().setVisibility(0);
            }
        }
        if (nativeAdView.getAdvertiserView() != null) {
            if (aVar.mo11313a() == null) {
                nativeAdView.getAdvertiserView().setVisibility(4);
            } else {
                ((TextView) nativeAdView.getAdvertiserView()).setText(aVar.mo11313a());
                nativeAdView.getAdvertiserView().setVisibility(0);
            }
        }
        if (nativeAdView.getStoreView() != null) {
            if (aVar.mo11321i() == null) {
                nativeAdView.getStoreView().setVisibility(8);
            } else {
                nativeAdView.getStoreView().setVisibility(0);
            }
        }
        nativeAdView.setNativeAd(aVar);
    }
}
