package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4865b;
import p159f.p243f.p245b.p246a.p248b.C4866c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class ue0 extends C4866c<af0> {
    public ue0() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo11842a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof af0 ? (af0) queryLocalInterface : new ye0(iBinder);
    }

    /* renamed from: c */
    public final xe0 mo21255c(Activity activity) {
        try {
            IBinder zze = ((af0) mo15605b(activity)).zze(C4865b.m20503f2(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof xe0 ? (xe0) queryLocalInterface : new ve0(zze);
        } catch (RemoteException e) {
            ul0.m31863h("Could not create remote AdOverlay.", e);
            return null;
        } catch (C4866c.C4867a e2) {
            ul0.m31863h("Could not create remote AdOverlay.", e2);
            return null;
        }
    }
}
