package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.lo */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5307lo implements Comparator<C4899ao> {
    public C5307lo(C5344mo moVar) {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C4899ao aoVar = (C4899ao) obj;
        C4899ao aoVar2 = (C4899ao) obj2;
        if (aoVar.mo15901d() >= aoVar2.mo15901d()) {
            if (aoVar.mo15901d() > aoVar2.mo15901d()) {
                return 1;
            }
            if (aoVar.mo15899b() >= aoVar2.mo15899b()) {
                if (aoVar.mo15899b() > aoVar2.mo15899b()) {
                    return 1;
                }
                float a = (aoVar.mo15898a() - aoVar.mo15901d()) * (aoVar.mo15900c() - aoVar.mo15899b());
                float a2 = (aoVar2.mo15898a() - aoVar2.mo15901d()) * (aoVar2.mo15900c() - aoVar2.mo15899b());
                if (a <= a2) {
                    if (a < a2) {
                        return 1;
                    }
                    return 0;
                }
            }
        }
        return -1;
    }
}
