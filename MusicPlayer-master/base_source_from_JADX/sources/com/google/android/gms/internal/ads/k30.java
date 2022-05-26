package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.C3114t;
import com.google.android.gms.ads.formats.C2910d;
import com.google.android.gms.ads.formats.MediaView;
import p159f.p243f.p245b.p246a.p248b.C4865b;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class k30 implements C2910d {

    /* renamed from: a */
    private final j30 f18741a;

    public k30(j30 j30) {
        Context context;
        new C3114t();
        this.f18741a = j30;
        try {
            context = (Context) C4865b.m20502K0(j30.mo18063d());
        } catch (RemoteException | NullPointerException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
            context = null;
        }
        if (context != null) {
            try {
                boolean k0 = this.f18741a.mo18065k0(C4865b.m20503f2(new MediaView(context)));
            } catch (RemoteException e2) {
                ul0.m31860e(BuildConfig.FLAVOR, e2);
            }
        }
    }

    /* renamed from: a */
    public final String mo10772a() {
        try {
            return this.f18741a.mo18064e();
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    /* renamed from: b */
    public final j30 mo18795b() {
        return this.f18741a;
    }
}
