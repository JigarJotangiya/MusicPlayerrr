package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.nx */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C5390nx extends C5481qd implements C5427ox {
    public C5390nx() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* renamed from: e7 */
    public static C5427ox m28127e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof C5427ox ? (C5427ox) queryLocalInterface : new C5353mx(iBinder);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11115d7(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            switch(r1) {
                case 1: goto L_0x009e;
                case 2: goto L_0x0097;
                case 3: goto L_0x008c;
                case 4: goto L_0x0081;
                case 5: goto L_0x0076;
                case 6: goto L_0x006b;
                case 7: goto L_0x0060;
                case 8: goto L_0x003d;
                case 9: goto L_0x0031;
                case 10: goto L_0x0025;
                case 11: goto L_0x0019;
                case 12: goto L_0x000d;
                case 13: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            r0.mo15835k()
            r3.writeNoException()
            goto L_0x00a4
        L_0x000d:
            boolean r1 = r0.mo15836l()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30061c(r3, r1)
            goto L_0x00a4
        L_0x0019:
            com.google.android.gms.internal.ads.sx r1 = r0.mo15832g()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30064f(r3, r1)
            goto L_0x00a4
        L_0x0025:
            boolean r1 = r0.zzp()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30061c(r3, r1)
            goto L_0x00a4
        L_0x0031:
            float r1 = r0.zze()
            r3.writeNoException()
            r3.writeFloat(r1)
            goto L_0x00a4
        L_0x003d:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0045
            r1 = 0
            goto L_0x0059
        L_0x0045:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C5575sx
            if (r4 == 0) goto L_0x0053
            r1 = r2
            com.google.android.gms.internal.ads.sx r1 = (com.google.android.gms.internal.ads.C5575sx) r1
            goto L_0x0059
        L_0x0053:
            com.google.android.gms.internal.ads.qx r2 = new com.google.android.gms.internal.ads.qx
            r2.<init>(r1)
            r1 = r2
        L_0x0059:
            r0.mo15838o3(r1)
            r3.writeNoException()
            goto L_0x00a4
        L_0x0060:
            float r1 = r0.mo15829c()
            r3.writeNoException()
            r3.writeFloat(r1)
            goto L_0x00a4
        L_0x006b:
            float r1 = r0.mo15830d()
            r3.writeNoException()
            r3.writeFloat(r1)
            goto L_0x00a4
        L_0x0076:
            int r1 = r0.mo15831e()
            r3.writeNoException()
            r3.writeInt(r1)
            goto L_0x00a4
        L_0x0081:
            boolean r1 = r0.mo15837o()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30061c(r3, r1)
            goto L_0x00a4
        L_0x008c:
            boolean r1 = com.google.android.gms.internal.ads.C5518rd.m30065g(r2)
            r0.mo15828b2(r1)
            r3.writeNoException()
            goto L_0x00a4
        L_0x0097:
            r0.mo15833i()
            r3.writeNoException()
            goto L_0x00a4
        L_0x009e:
            r0.mo15834j()
            r3.writeNoException()
        L_0x00a4:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5390nx.mo11115d7(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
