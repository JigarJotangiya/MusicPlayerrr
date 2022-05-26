package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.ads.C3061m;
import com.google.android.gms.internal.ads.C4980cv;
import com.google.android.gms.internal.ads.C5054ev;
import com.google.android.gms.internal.ads.C5095fy;
import com.google.android.gms.internal.ads.C5503qz;
import com.google.android.gms.internal.ads.n20;
import com.google.android.gms.internal.ads.u20;
import com.google.android.gms.internal.ads.ul0;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class NativeAdView extends FrameLayout {

    /* renamed from: g */
    private final FrameLayout f10180g;

    /* renamed from: h */
    private final u20 f10181h = m13623e();

    public NativeAdView(@RecentlyNonNull Context context) {
        super(context);
        this.f10180g = m13622d(context);
    }

    /* renamed from: d */
    private final FrameLayout m13622d(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    /* renamed from: e */
    private final u20 m13623e() {
        if (isInEditMode()) {
            return null;
        }
        return C4980cv.m22122a().mo15968g(this.f10180g.getContext(), this, this.f10180g);
    }

    /* renamed from: f */
    private final void m13624f(String str, View view) {
        u20 u20 = this.f10181h;
        if (u20 != null) {
            try {
                u20.mo20529C3(str, C4865b.m20503f2(view));
            } catch (RemoteException e) {
                ul0.m31860e("Unable to call setAssetView on delegate", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    @RecentlyNullable
    /* renamed from: a */
    public final View mo11280a(@RecentlyNonNull String str) {
        u20 u20 = this.f10181h;
        if (u20 != null) {
            try {
                C4863a p = u20.mo20537p(str);
                if (p != null) {
                    return (View) C4865b.m20502K0(p);
                }
            } catch (RemoteException e) {
                ul0.m31860e("Unable to call getAssetView on delegate", e);
            }
        }
        return null;
    }

    public final void addView(@RecentlyNonNull View view, int i, @RecentlyNonNull ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f10180g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo11282b(C3061m mVar) {
        u20 u20 = this.f10181h;
        if (u20 != null) {
            try {
                if (mVar instanceof C5095fy) {
                    u20.mo20533Y2(((C5095fy) mVar).mo17767a());
                } else if (mVar == null) {
                    u20.mo20533Y2((n20) null);
                } else {
                    ul0.m31857b("Use MediaContent provided by NativeAd.getMediaContent");
                }
            } catch (RemoteException e) {
                ul0.m31860e("Unable to call setMediaContent on delegate", e);
            }
        }
    }

    public final void bringChildToFront(@RecentlyNonNull View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f10180g;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo11284c(ImageView.ScaleType scaleType) {
        u20 u20 = this.f10181h;
        if (u20 != null && scaleType != null) {
            try {
                u20.mo20535c1(C4865b.m20503f2(scaleType));
            } catch (RemoteException e) {
                ul0.m31860e("Unable to call setMediaViewImageScaleType on delegate", e);
            }
        }
    }

    public final boolean dispatchTouchEvent(@RecentlyNonNull MotionEvent motionEvent) {
        u20 u20;
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22425T1)).booleanValue() && (u20 = this.f10181h) != null) {
            try {
                u20.mo20530E0(C4865b.m20503f2(motionEvent));
            } catch (RemoteException e) {
                ul0.m31860e("Unable to call handleTouchEvent on delegate", e);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @RecentlyNullable
    public AdChoicesView getAdChoicesView() {
        View a = mo11280a("3011");
        if (a instanceof AdChoicesView) {
            return (AdChoicesView) a;
        }
        return null;
    }

    @RecentlyNullable
    public final View getAdvertiserView() {
        return mo11280a("3005");
    }

    @RecentlyNullable
    public final View getBodyView() {
        return mo11280a("3004");
    }

    @RecentlyNullable
    public final View getCallToActionView() {
        return mo11280a("3002");
    }

    @RecentlyNullable
    public final View getHeadlineView() {
        return mo11280a("3001");
    }

    @RecentlyNullable
    public final View getIconView() {
        return mo11280a("3003");
    }

    @RecentlyNullable
    public final View getImageView() {
        return mo11280a("3008");
    }

    @RecentlyNullable
    public final MediaView getMediaView() {
        View a = mo11280a("3010");
        if (a instanceof MediaView) {
            return (MediaView) a;
        }
        if (a == null) {
            return null;
        }
        ul0.m31857b("View is not an instance of MediaView");
        return null;
    }

    @RecentlyNullable
    public final View getPriceView() {
        return mo11280a("3007");
    }

    @RecentlyNullable
    public final View getStarRatingView() {
        return mo11280a("3009");
    }

    @RecentlyNullable
    public final View getStoreView() {
        return mo11280a("3006");
    }

    public final void onVisibilityChanged(@RecentlyNonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        u20 u20 = this.f10181h;
        if (u20 != null) {
            try {
                u20.mo20536n2(C4865b.m20503f2(view), i);
            } catch (RemoteException e) {
                ul0.m31860e("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f10180g);
    }

    public final void removeView(@RecentlyNonNull View view) {
        if (this.f10180g != view) {
            super.removeView(view);
        }
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        m13624f("3011", adChoicesView);
    }

    public final void setAdvertiserView(View view) {
        m13624f("3005", view);
    }

    public final void setBodyView(View view) {
        m13624f("3004", view);
    }

    public final void setCallToActionView(View view) {
        m13624f("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        u20 u20 = this.f10181h;
        if (u20 != null) {
            try {
                u20.mo20531P2(C4865b.m20503f2(view));
            } catch (RemoteException e) {
                ul0.m31860e("Unable to call setClickConfirmingView on delegate", e);
            }
        }
    }

    public final void setHeadlineView(View view) {
        m13624f("3001", view);
    }

    public final void setIconView(View view) {
        m13624f("3003", view);
    }

    public final void setImageView(View view) {
        m13624f("3008", view);
    }

    public final void setMediaView(MediaView mediaView) {
        m13624f("3010", mediaView);
        if (mediaView != null) {
            mediaView.mo11276a(new C3105d(this));
            mediaView.mo11277b(new C3106e(this));
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [f.f.b.a.b.a, java.lang.Object] */
    public void setNativeAd(@RecentlyNonNull C3098a aVar) {
        u20 u20 = this.f10181h;
        if (u20 != null) {
            try {
                u20.mo20532V1(aVar.mo11322j());
            } catch (RemoteException e) {
                ul0.m31860e("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public final void setPriceView(View view) {
        m13624f("3007", view);
    }

    public final void setStarRatingView(View view) {
        m13624f("3009", view);
    }

    public final void setStoreView(View view) {
        m13624f("3006", view);
    }

    public NativeAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10180g = m13622d(context);
    }

    public NativeAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10180g = m13622d(context);
    }
}
