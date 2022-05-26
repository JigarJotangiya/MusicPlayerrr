package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class m20 extends C5481qd implements n20 {
    public m20() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
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
                case 2: goto L_0x006e;
                case 3: goto L_0x005f;
                case 4: goto L_0x0054;
                case 5: goto L_0x0049;
                case 6: goto L_0x003e;
                case 7: goto L_0x0033;
                case 8: goto L_0x0028;
                case 9: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x000d
            r1 = 0
            goto L_0x0021
        L_0x000d:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.x30
            if (r4 == 0) goto L_0x001b
            r1 = r2
            com.google.android.gms.internal.ads.x30 r1 = (com.google.android.gms.internal.ads.x30) r1
            goto L_0x0021
        L_0x001b:
            com.google.android.gms.internal.ads.x30 r2 = new com.google.android.gms.internal.ads.x30
            r2.<init>(r1)
            r1 = r2
        L_0x0021:
            r0.mo19396l1(r1)
            r3.writeNoException()
            goto L_0x0078
        L_0x0028:
            boolean r1 = r0.mo19395i()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30061c(r3, r1)
            goto L_0x0078
        L_0x0033:
            com.google.android.gms.internal.ads.ox r1 = r0.mo19394e()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30064f(r3, r1)
            goto L_0x0078
        L_0x003e:
            float r1 = r0.mo19392c()
            r3.writeNoException()
            r3.writeFloat(r1)
            goto L_0x0078
        L_0x0049:
            float r1 = r0.mo19393d()
            r3.writeNoException()
            r3.writeFloat(r1)
            goto L_0x0078
        L_0x0054:
            f.f.b.a.b.a r1 = r0.mo19048g()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30064f(r3, r1)
            goto L_0x0078
        L_0x005f:
            android.os.IBinder r1 = r2.readStrongBinder()
            f.f.b.a.b.a r1 = p159f.p243f.p245b.p246a.p248b.C4863a.C4864a.m20501C0(r1)
            r0.mo19391Y(r1)
            r3.writeNoException()
            goto L_0x0078
        L_0x006e:
            float r1 = r0.zze()
            r3.writeNoException()
            r3.writeFloat(r1)
        L_0x0078:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m20.mo11115d7(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
