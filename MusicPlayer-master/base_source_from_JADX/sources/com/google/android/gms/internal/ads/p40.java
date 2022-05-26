package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import p159f.p243f.p245b.p246a.p248b.C4866c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class p40 extends C4866c<b30> {
    public p40() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo11842a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof b30 ? (b30) queryLocalInterface : new a30(iBinder);
    }
}
