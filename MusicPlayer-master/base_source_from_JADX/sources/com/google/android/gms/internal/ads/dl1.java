package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class dl1 implements y50 {

    /* renamed from: a */
    public final /* synthetic */ el1 f15650a;

    /* renamed from: b */
    public final /* synthetic */ j40 f15651b;

    public /* synthetic */ dl1(el1 el1, j40 j40) {
        this.f15650a = el1;
        this.f15651b = j40;
    }

    /* renamed from: a */
    public final void mo15685a(Object obj, Map map) {
        el1 el1 = this.f15650a;
        j40 j40 = this.f15651b;
        try {
            el1.f15994l = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
        } catch (NumberFormatException unused) {
            ul0.m31859d("Failed to call parse unconfirmedClickTimestamp.");
        }
        el1.f15993k = (String) map.get("id");
        String str = (String) map.get("asset_id");
        if (j40 == null) {
            ul0.m31857b("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            j40.mo18290v(str);
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }
}
