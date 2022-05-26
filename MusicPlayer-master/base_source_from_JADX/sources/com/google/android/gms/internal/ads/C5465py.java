package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.py */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5465py extends C5500qw {

    /* renamed from: g */
    private o70 f21754g;

    /* renamed from: A5 */
    public final void mo20335A5(C4982cx cxVar) {
    }

    /* renamed from: D5 */
    public final void mo20132D5(cb0 cb0) throws RemoteException {
    }

    /* renamed from: I0 */
    public final void mo20133I0(boolean z) throws RemoteException {
    }

    /* renamed from: S4 */
    public final void mo20336S4(C4863a aVar, String str) throws RemoteException {
    }

    /* renamed from: T0 */
    public final void mo20134T0(zzbkk zzbkk) throws RemoteException {
    }

    /* renamed from: V */
    public final void mo20337V(String str) throws RemoteException {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo20338a() {
        o70 o70 = this.f21754g;
        if (o70 != null) {
            try {
                o70.mo16424d5(Collections.emptyList());
            } catch (RemoteException e) {
                ul0.m31863h("Could not notify onComplete event.", e);
            }
        }
    }

    /* renamed from: c */
    public final String mo20135c() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: d */
    public final List<zzbtn> mo20136d() throws RemoteException {
        return Collections.emptyList();
    }

    /* renamed from: d6 */
    public final void mo20339d6(float f) throws RemoteException {
    }

    /* renamed from: g */
    public final void mo20340g() {
    }

    /* renamed from: g2 */
    public final void mo20137g2(o70 o70) throws RemoteException {
        this.f21754g = o70;
    }

    /* renamed from: h */
    public final void mo20138h() throws RemoteException {
        ul0.m31859d("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        nl0.f20646b.post(new C5428oy(this));
    }

    /* renamed from: k6 */
    public final void mo20341k6(String str) throws RemoteException {
    }

    /* renamed from: n */
    public final boolean mo20342n() throws RemoteException {
        return false;
    }

    /* renamed from: t4 */
    public final void mo20139t4(String str, C4863a aVar) throws RemoteException {
    }

    public final float zze() throws RemoteException {
        return 1.0f;
    }
}
