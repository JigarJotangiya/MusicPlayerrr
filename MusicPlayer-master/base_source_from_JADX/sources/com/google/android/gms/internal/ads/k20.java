package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.C2906a;
import com.google.android.gms.ads.formats.C2907b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class k20 extends C2906a {

    /* renamed from: a */
    private final j20 f18720a;

    /* renamed from: b */
    private final List<C2907b> f18721b = new ArrayList();

    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k20(com.google.android.gms.internal.ads.j20 r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            r4.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.f18721b = r1
            r4.f18720a = r5
            r5.mo15649d()     // Catch:{ RemoteException -> 0x0012 }
            goto L_0x0016
        L_0x0012:
            r1 = move-exception
            com.google.android.gms.internal.ads.ul0.m31860e(r0, r1)
        L_0x0016:
            java.util.List r5 = r5.mo15650e()     // Catch:{ RemoteException -> 0x0053 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ RemoteException -> 0x0053 }
        L_0x001e:
            boolean r1 = r5.hasNext()     // Catch:{ RemoteException -> 0x0053 }
            if (r1 == 0) goto L_0x0052
            java.lang.Object r1 = r5.next()     // Catch:{ RemoteException -> 0x0053 }
            boolean r2 = r1 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0053 }
            r3 = 0
            if (r2 == 0) goto L_0x0045
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch:{ RemoteException -> 0x0053 }
            if (r1 != 0) goto L_0x0032
            goto L_0x0045
        L_0x0032:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch:{ RemoteException -> 0x0053 }
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.q20     // Catch:{ RemoteException -> 0x0053 }
            if (r3 == 0) goto L_0x0040
            r3 = r2
            com.google.android.gms.internal.ads.q20 r3 = (com.google.android.gms.internal.ads.q20) r3     // Catch:{ RemoteException -> 0x0053 }
            goto L_0x0045
        L_0x0040:
            com.google.android.gms.internal.ads.o20 r3 = new com.google.android.gms.internal.ads.o20     // Catch:{ RemoteException -> 0x0053 }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x0053 }
        L_0x0045:
            if (r3 == 0) goto L_0x001e
            java.util.List<com.google.android.gms.ads.formats.b> r1 = r4.f18721b     // Catch:{ RemoteException -> 0x0053 }
            com.google.android.gms.internal.ads.r20 r2 = new com.google.android.gms.internal.ads.r20     // Catch:{ RemoteException -> 0x0053 }
            r2.<init>(r3)     // Catch:{ RemoteException -> 0x0053 }
            r1.add(r2)     // Catch:{ RemoteException -> 0x0053 }
            goto L_0x001e
        L_0x0052:
            return
        L_0x0053:
            r5 = move-exception
            com.google.android.gms.internal.ads.ul0.m31860e(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k20.<init>(com.google.android.gms.internal.ads.j20):void");
    }
}
