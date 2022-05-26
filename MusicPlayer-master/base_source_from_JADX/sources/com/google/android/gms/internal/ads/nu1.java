package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nu1 {

    /* renamed from: a */
    private final s60 f20729a;

    nu1(s60 s60) {
        this.f20729a = s60;
    }

    /* renamed from: s */
    private final void m28080s(mu1 mu1) throws RemoteException {
        String str;
        String a = mu1.m27470a(mu1);
        if (a.length() != 0) {
            str = "Dispatching AFMA event on publisher webview: ".concat(a);
        } else {
            str = new String("Dispatching AFMA event on publisher webview: ");
        }
        ul0.m31861f(str);
        this.f20729a.mo20399p(a);
    }

    /* renamed from: a */
    public final void mo19826a() throws RemoteException {
        m28080s(new mu1("initialize", (lu1) null));
    }

    /* renamed from: b */
    public final void mo19827b(long j) throws RemoteException {
        mu1 mu1 = new mu1("interstitial", (lu1) null);
        mu1.f20173a = Long.valueOf(j);
        mu1.f20175c = "onAdClicked";
        this.f20729a.mo20399p(mu1.m27470a(mu1));
    }

    /* renamed from: c */
    public final void mo19828c(long j) throws RemoteException {
        mu1 mu1 = new mu1("interstitial", (lu1) null);
        mu1.f20173a = Long.valueOf(j);
        mu1.f20175c = "onAdClosed";
        m28080s(mu1);
    }

    /* renamed from: d */
    public final void mo19829d(long j, int i) throws RemoteException {
        mu1 mu1 = new mu1("interstitial", (lu1) null);
        mu1.f20173a = Long.valueOf(j);
        mu1.f20175c = "onAdFailedToLoad";
        mu1.f20176d = Integer.valueOf(i);
        m28080s(mu1);
    }

    /* renamed from: e */
    public final void mo19830e(long j) throws RemoteException {
        mu1 mu1 = new mu1("interstitial", (lu1) null);
        mu1.f20173a = Long.valueOf(j);
        mu1.f20175c = "onAdLoaded";
        m28080s(mu1);
    }

    /* renamed from: f */
    public final void mo19831f(long j) throws RemoteException {
        mu1 mu1 = new mu1("interstitial", (lu1) null);
        mu1.f20173a = Long.valueOf(j);
        mu1.f20175c = "onNativeAdObjectNotAvailable";
        m28080s(mu1);
    }

    /* renamed from: g */
    public final void mo19832g(long j) throws RemoteException {
        mu1 mu1 = new mu1("interstitial", (lu1) null);
        mu1.f20173a = Long.valueOf(j);
        mu1.f20175c = "onAdOpened";
        m28080s(mu1);
    }

    /* renamed from: h */
    public final void mo19833h(long j) throws RemoteException {
        mu1 mu1 = new mu1("creation", (lu1) null);
        mu1.f20173a = Long.valueOf(j);
        mu1.f20175c = "nativeObjectCreated";
        m28080s(mu1);
    }

    /* renamed from: i */
    public final void mo19834i(long j) throws RemoteException {
        mu1 mu1 = new mu1("creation", (lu1) null);
        mu1.f20173a = Long.valueOf(j);
        mu1.f20175c = "nativeObjectNotCreated";
        m28080s(mu1);
    }

    /* renamed from: j */
    public final void mo19835j(long j) throws RemoteException {
        mu1 mu1 = new mu1("rewarded", (lu1) null);
        mu1.f20173a = Long.valueOf(j);
        mu1.f20175c = "onAdClicked";
        m28080s(mu1);
    }

    /* renamed from: k */
    public final void mo19836k(long j) throws RemoteException {
        mu1 mu1 = new mu1("rewarded", (lu1) null);
        mu1.f20173a = Long.valueOf(j);
        mu1.f20175c = "onRewardedAdClosed";
        m28080s(mu1);
    }

    /* renamed from: l */
    public final void mo19837l(long j, th0 th0) throws RemoteException {
        mu1 mu1 = new mu1("rewarded", (lu1) null);
        mu1.f20173a = Long.valueOf(j);
        mu1.f20175c = "onUserEarnedReward";
        mu1.f20177e = th0.mo19384c();
        mu1.f20178f = Integer.valueOf(th0.zze());
        m28080s(mu1);
    }

    /* renamed from: m */
    public final void mo19838m(long j, int i) throws RemoteException {
        mu1 mu1 = new mu1("rewarded", (lu1) null);
        mu1.f20173a = Long.valueOf(j);
        mu1.f20175c = "onRewardedAdFailedToLoad";
        mu1.f20176d = Integer.valueOf(i);
        m28080s(mu1);
    }

    /* renamed from: n */
    public final void mo19839n(long j, int i) throws RemoteException {
        mu1 mu1 = new mu1("rewarded", (lu1) null);
        mu1.f20173a = Long.valueOf(j);
        mu1.f20175c = "onRewardedAdFailedToShow";
        mu1.f20176d = Integer.valueOf(i);
        m28080s(mu1);
    }

    /* renamed from: o */
    public final void mo19840o(long j) throws RemoteException {
        mu1 mu1 = new mu1("rewarded", (lu1) null);
        mu1.f20173a = Long.valueOf(j);
        mu1.f20175c = "onAdImpression";
        m28080s(mu1);
    }

    /* renamed from: p */
    public final void mo19841p(long j) throws RemoteException {
        mu1 mu1 = new mu1("rewarded", (lu1) null);
        mu1.f20173a = Long.valueOf(j);
        mu1.f20175c = "onRewardedAdLoaded";
        m28080s(mu1);
    }

    /* renamed from: q */
    public final void mo19842q(long j) throws RemoteException {
        mu1 mu1 = new mu1("rewarded", (lu1) null);
        mu1.f20173a = Long.valueOf(j);
        mu1.f20175c = "onNativeAdObjectNotAvailable";
        m28080s(mu1);
    }

    /* renamed from: r */
    public final void mo19843r(long j) throws RemoteException {
        mu1 mu1 = new mu1("rewarded", (lu1) null);
        mu1.f20173a = Long.valueOf(j);
        mu1.f20175c = "onRewardedAdOpened";
        m28080s(mu1);
    }
}
