package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class f40 extends C5481qd implements g40 {
    /* renamed from: e7 */
    public static g40 m23459e7(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return queryLocalInterface instanceof g40 ? (g40) queryLocalInterface : new e40(iBinder);
    }
}
