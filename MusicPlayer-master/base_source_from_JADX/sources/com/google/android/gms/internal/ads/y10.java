package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class y10 {

    /* renamed from: a */
    private final Context f26196a;

    public y10(Context context) {
        this.f26196a = context;
    }

    /* renamed from: a */
    public final void mo22128a(cg0 cg0) {
        String str;
        String str2;
        try {
            ((z10) zl0.m34659b(this.f26196a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", x10.f25617a)).mo22319l3(cg0);
        } catch (yl0 e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str = "Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(valueOf);
            } else {
                str = new String("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:");
            }
            ul0.m31862g(str);
        } catch (RemoteException e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Error calling setFlagsAccessedBeforeInitializedListener: ".concat(valueOf2);
            } else {
                str2 = new String("Error calling setFlagsAccessedBeforeInitializedListener: ");
            }
            ul0.m31862g(str2);
        }
    }
}
