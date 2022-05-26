package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.nq2;
import com.google.android.gms.internal.ads.ul0;
import com.google.android.gms.internal.ads.zzbew;

/* renamed from: com.google.android.gms.ads.internal.l */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C2936l extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ C2970r f9840a;

    C2936l(C2970r rVar) {
        this.f9840a = rVar;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.f9840a.f9936m != null) {
            try {
                this.f9840a.f9936m.mo18750r(nq2.m28048d(1, (String) null, (zzbew) null));
            } catch (RemoteException e) {
                ul0.m31864i("#007 Could not call remote method.", e);
            }
        }
        if (this.f9840a.f9936m != null) {
            try {
                this.f9840a.f9936m.mo18751y(0);
            } catch (RemoteException e2) {
                ul0.m31864i("#007 Could not call remote method.", e2);
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f9840a.mo10955o())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            if (this.f9840a.f9936m != null) {
                try {
                    this.f9840a.f9936m.mo18750r(nq2.m28048d(3, (String) null, (zzbew) null));
                } catch (RemoteException e) {
                    ul0.m31864i("#007 Could not call remote method.", e);
                }
            }
            if (this.f9840a.f9936m != null) {
                try {
                    this.f9840a.f9936m.mo18751y(3);
                } catch (RemoteException e2) {
                    ul0.m31864i("#007 Could not call remote method.", e2);
                }
            }
            this.f9840a.mo10941e7(0);
            return true;
        } else if (str.startsWith("gmsg://scriptLoadFailed")) {
            if (this.f9840a.f9936m != null) {
                try {
                    this.f9840a.f9936m.mo18750r(nq2.m28048d(1, (String) null, (zzbew) null));
                } catch (RemoteException e3) {
                    ul0.m31864i("#007 Could not call remote method.", e3);
                }
            }
            if (this.f9840a.f9936m != null) {
                try {
                    this.f9840a.f9936m.mo18751y(0);
                } catch (RemoteException e4) {
                    ul0.m31864i("#007 Could not call remote method.", e4);
                }
            }
            this.f9840a.mo10941e7(0);
            return true;
        } else if (str.startsWith("gmsg://adResized")) {
            if (this.f9840a.f9936m != null) {
                try {
                    this.f9840a.f9936m.mo18748g();
                } catch (RemoteException e5) {
                    ul0.m31864i("#007 Could not call remote method.", e5);
                }
            }
            this.f9840a.mo10941e7(this.f9840a.mo10956p(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            if (this.f9840a.f9936m != null) {
                try {
                    this.f9840a.f9936m.mo18744b();
                    this.f9840a.f9936m.mo18746e();
                } catch (RemoteException e6) {
                    ul0.m31864i("#007 Could not call remote method.", e6);
                }
            }
            C2970r.m13155n7(this.f9840a, C2970r.m13152k7(this.f9840a, str));
            return true;
        }
    }
}
