package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class un3 {
    un3() {
    }

    /* renamed from: a */
    public static final int m31933a(int i, Object obj, Object obj2) {
        tn3 tn3 = (tn3) obj;
        sn3 sn3 = (sn3) obj2;
        if (tn3.isEmpty()) {
            return 0;
        }
        Iterator it = tn3.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final boolean m31934b(Object obj) {
        return !((tn3) obj).zze();
    }

    /* renamed from: c */
    public static final Object m31935c(Object obj, Object obj2) {
        tn3 tn3 = (tn3) obj;
        tn3 tn32 = (tn3) obj2;
        if (!tn32.isEmpty()) {
            if (!tn3.zze()) {
                tn3 = tn3.zzb();
            }
            tn3.zzd(tn32);
        }
        return tn3;
    }
}
