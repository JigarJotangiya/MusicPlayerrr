package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class hh0 extends C5481qd implements ih0 {
    public hh0() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: com.google.android.gms.internal.ads.gh0} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.lh0] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11115d7(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
        /*
            r2 = this;
            r6 = 1
            if (r3 == r6) goto L_0x0127
            r0 = 2
            if (r3 == r0) goto L_0x0120
            r0 = 3
            r1 = 0
            if (r3 == r0) goto L_0x00ff
            r0 = 34
            if (r3 == r0) goto L_0x00f4
            switch(r3) {
                case 5: goto L_0x00e9;
                case 6: goto L_0x00e2;
                case 7: goto L_0x00db;
                case 8: goto L_0x00d4;
                case 9: goto L_0x00c5;
                case 10: goto L_0x00b5;
                case 11: goto L_0x00a5;
                case 12: goto L_0x0099;
                case 13: goto L_0x008d;
                case 14: goto L_0x007d;
                case 15: goto L_0x0071;
                case 16: goto L_0x004f;
                case 17: goto L_0x0047;
                case 18: goto L_0x0037;
                case 19: goto L_0x002b;
                case 20: goto L_0x001f;
                case 21: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            r3 = 0
            return r3
        L_0x0013:
            com.google.android.gms.internal.ads.lx r3 = r2.mo18339b()
            r5.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30064f(r5, r3)
            goto L_0x0135
        L_0x001f:
            boolean r3 = r2.mo18345n()
            r5.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30061c(r5, r3)
            goto L_0x0135
        L_0x002b:
            java.lang.String r3 = r4.readString()
            r2.mo18347o0(r3)
            r5.writeNoException()
            goto L_0x0135
        L_0x0037:
            android.os.IBinder r3 = r4.readStrongBinder()
            f.f.b.a.b.a r3 = p159f.p243f.p245b.p246a.p248b.C4863a.C4864a.m20501C0(r3)
            r2.mo18334A0(r3)
            r5.writeNoException()
            goto L_0x0135
        L_0x0047:
            r4.readString()
            r5.writeNoException()
            goto L_0x0135
        L_0x004f:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0056
            goto L_0x0069
        L_0x0056:
            java.lang.String r4 = "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.gh0
            if (r0 == 0) goto L_0x0064
            r1 = r4
            com.google.android.gms.internal.ads.gh0 r1 = (com.google.android.gms.internal.ads.gh0) r1
            goto L_0x0069
        L_0x0064:
            com.google.android.gms.internal.ads.gh0 r1 = new com.google.android.gms.internal.ads.gh0
            r1.<init>(r3)
        L_0x0069:
            r2.mo18344m2(r1)
            r5.writeNoException()
            goto L_0x0135
        L_0x0071:
            android.os.Bundle r3 = r2.mo18338a()
            r5.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30063e(r5, r3)
            goto L_0x0135
        L_0x007d:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.internal.ads.dw r3 = com.google.android.gms.internal.ads.C4981cw.m22191e7(r3)
            r2.mo18350t3(r3)
            r5.writeNoException()
            goto L_0x0135
        L_0x008d:
            java.lang.String r3 = r4.readString()
            r2.mo18348p0(r3)
            r5.writeNoException()
            goto L_0x0135
        L_0x0099:
            java.lang.String r3 = r2.mo18342f()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x0135
        L_0x00a5:
            android.os.IBinder r3 = r4.readStrongBinder()
            f.f.b.a.b.a r3 = p159f.p243f.p245b.p246a.p248b.C4863a.C4864a.m20501C0(r3)
            r2.mo18340c0(r3)
            r5.writeNoException()
            goto L_0x0135
        L_0x00b5:
            android.os.IBinder r3 = r4.readStrongBinder()
            f.f.b.a.b.a r3 = p159f.p243f.p245b.p246a.p248b.C4863a.C4864a.m20501C0(r3)
            r2.mo18351u0(r3)
            r5.writeNoException()
            goto L_0x0135
        L_0x00c5:
            android.os.IBinder r3 = r4.readStrongBinder()
            f.f.b.a.b.a r3 = p159f.p243f.p245b.p246a.p248b.C4863a.C4864a.m20501C0(r3)
            r2.mo18337X(r3)
            r5.writeNoException()
            goto L_0x0135
        L_0x00d4:
            r2.zze()
            r5.writeNoException()
            goto L_0x0135
        L_0x00db:
            r2.mo18343h()
            r5.writeNoException()
            goto L_0x0135
        L_0x00e2:
            r2.mo18341e()
            r5.writeNoException()
            goto L_0x0135
        L_0x00e9:
            boolean r3 = r2.zzs()
            r5.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30061c(r5, r3)
            goto L_0x0135
        L_0x00f4:
            boolean r3 = com.google.android.gms.internal.ads.C5518rd.m30065g(r4)
            r2.mo18336W1(r3)
            r5.writeNoException()
            goto L_0x0135
        L_0x00ff:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0106
            goto L_0x0119
        L_0x0106:
            java.lang.String r4 = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.lh0
            if (r0 == 0) goto L_0x0114
            r1 = r4
            com.google.android.gms.internal.ads.lh0 r1 = (com.google.android.gms.internal.ads.lh0) r1
            goto L_0x0119
        L_0x0114:
            com.google.android.gms.internal.ads.jh0 r1 = new com.google.android.gms.internal.ads.jh0
            r1.<init>(r3)
        L_0x0119:
            r2.mo18349s3(r1)
            r5.writeNoException()
            goto L_0x0135
        L_0x0120:
            r2.mo18346o()
            r5.writeNoException()
            goto L_0x0135
        L_0x0127:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzcen> r3 = com.google.android.gms.internal.ads.zzcen.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.C5518rd.m30059a(r4, r3)
            com.google.android.gms.internal.ads.zzcen r3 = (com.google.android.gms.internal.ads.zzcen) r3
            r2.mo18335H2(r3)
            r5.writeNoException()
        L_0x0135:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hh0.mo11115d7(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
