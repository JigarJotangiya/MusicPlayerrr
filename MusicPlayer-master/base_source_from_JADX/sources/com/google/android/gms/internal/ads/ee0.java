package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.C3098a;
import java.util.ArrayList;
import java.util.List;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class ee0 extends C3098a.C3099a {

    /* renamed from: a */
    private final List<C3098a.C3100b> f15934a = new ArrayList();

    public ee0(j20 j20) {
        try {
            j20.mo15649d();
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
        }
        try {
            for (q20 next : j20.mo15650e()) {
                q20 e7 = next instanceof IBinder ? p20.m28834e7((IBinder) next) : null;
                if (e7 != null) {
                    this.f15934a.add(new fe0(e7));
                }
            }
        } catch (RemoteException e2) {
            ul0.m31860e(BuildConfig.FLAVOR, e2);
        }
    }
}
