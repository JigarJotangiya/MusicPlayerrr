package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class t20 extends C5481qd implements u20 {
    public t20() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* renamed from: e7 */
    public static u20 m31028e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return queryLocalInterface instanceof u20 ? (u20) queryLocalInterface : new s20(iBinder);
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11115d7(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            switch(r1) {
                case 1: goto L_0x0089;
                case 2: goto L_0x007a;
                case 3: goto L_0x006b;
                case 4: goto L_0x0064;
                case 5: goto L_0x0056;
                case 6: goto L_0x0047;
                case 7: goto L_0x0038;
                case 8: goto L_0x0015;
                case 9: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            android.os.IBinder r1 = r2.readStrongBinder()
            f.f.b.a.b.a r1 = p159f.p243f.p245b.p246a.p248b.C4863a.C4864a.m20501C0(r1)
            r0.mo20535c1(r1)
            r3.writeNoException()
            goto L_0x009b
        L_0x0015:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x001d
            r1 = 0
            goto L_0x0031
        L_0x001d:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IMediaContent"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.n20
            if (r4 == 0) goto L_0x002b
            r1 = r2
            com.google.android.gms.internal.ads.n20 r1 = (com.google.android.gms.internal.ads.n20) r1
            goto L_0x0031
        L_0x002b:
            com.google.android.gms.internal.ads.l20 r2 = new com.google.android.gms.internal.ads.l20
            r2.<init>(r1)
            r1 = r2
        L_0x0031:
            r0.mo20533Y2(r1)
            r3.writeNoException()
            goto L_0x009b
        L_0x0038:
            android.os.IBinder r1 = r2.readStrongBinder()
            f.f.b.a.b.a r1 = p159f.p243f.p245b.p246a.p248b.C4863a.C4864a.m20501C0(r1)
            r0.mo20530E0(r1)
            r3.writeNoException()
            goto L_0x009b
        L_0x0047:
            android.os.IBinder r1 = r2.readStrongBinder()
            f.f.b.a.b.a r1 = p159f.p243f.p245b.p246a.p248b.C4863a.C4864a.m20501C0(r1)
            r0.mo20531P2(r1)
            r3.writeNoException()
            goto L_0x009b
        L_0x0056:
            android.os.IBinder r1 = r2.readStrongBinder()
            p159f.p243f.p245b.p246a.p248b.C4863a.C4864a.m20501C0(r1)
            r2.readInt()
            r3.writeNoException()
            goto L_0x009b
        L_0x0064:
            r0.mo20534b()
            r3.writeNoException()
            goto L_0x009b
        L_0x006b:
            android.os.IBinder r1 = r2.readStrongBinder()
            f.f.b.a.b.a r1 = p159f.p243f.p245b.p246a.p248b.C4863a.C4864a.m20501C0(r1)
            r0.mo20532V1(r1)
            r3.writeNoException()
            goto L_0x009b
        L_0x007a:
            java.lang.String r1 = r2.readString()
            f.f.b.a.b.a r1 = r0.mo20537p(r1)
            r3.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30064f(r3, r1)
            goto L_0x009b
        L_0x0089:
            java.lang.String r1 = r2.readString()
            android.os.IBinder r2 = r2.readStrongBinder()
            f.f.b.a.b.a r2 = p159f.p243f.p245b.p246a.p248b.C4863a.C4864a.m20501C0(r2)
            r0.mo20529C3(r1, r2)
            r3.writeNoException()
        L_0x009b:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t20.mo11115d7(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
