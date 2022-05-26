package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class l40 extends C5481qd implements m40 {
    public l40() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
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
                case 2: goto L_0x0188;
                case 3: goto L_0x017d;
                case 4: goto L_0x0172;
                case 5: goto L_0x0167;
                case 6: goto L_0x015c;
                case 7: goto L_0x0151;
                case 8: goto L_0x0146;
                case 9: goto L_0x013b;
                case 10: goto L_0x0130;
                case 11: goto L_0x0125;
                case 12: goto L_0x0119;
                case 13: goto L_0x0111;
                case 14: goto L_0x0105;
                case 15: goto L_0x00f5;
                case 16: goto L_0x00e1;
                case 17: goto L_0x00d1;
                case 18: goto L_0x00c5;
                case 19: goto L_0x00b9;
                case 20: goto L_0x00ad;
                case 21: goto L_0x0089;
                case 22: goto L_0x0081;
                case 23: goto L_0x0075;
                case 24: goto L_0x0069;
                case 25: goto L_0x0059;
                case 26: goto L_0x0049;
                case 27: goto L_0x0041;
                case 28: goto L_0x0039;
                case 29: goto L_0x002d;
                case 30: goto L_0x0021;
                case 31: goto L_0x0015;
                case 32: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.ix r1 = com.google.android.gms.internal.ads.C5168hx.m24955e7(r1)
            r0.mo18950w4(r1)
            r3.writeNoException()
            goto L_0x0192
        L_0x0015:
            com.google.android.gms.internal.ads.lx r1 = r0.mo18948d()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30064f(r3, r1)
            goto L_0x0192
        L_0x0021:
            boolean r1 = r0.mo18937C()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30061c(r3, r1)
            goto L_0x0192
        L_0x002d:
            com.google.android.gms.internal.ads.n20 r1 = r0.mo18805h()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30064f(r3, r1)
            goto L_0x0192
        L_0x0039:
            r0.mo18936B()
            r3.writeNoException()
            goto L_0x0192
        L_0x0041:
            r0.mo18949j5()
            r3.writeNoException()
            goto L_0x0192
        L_0x0049:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.vw r1 = com.google.android.gms.internal.ads.C5648uw.m32075e7(r1)
            r0.mo18945a3(r1)
            r3.writeNoException()
            goto L_0x0192
        L_0x0059:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.yw r1 = com.google.android.gms.internal.ads.C5759xw.m33857e7(r1)
            r0.mo18943Y5(r1)
            r3.writeNoException()
            goto L_0x0192
        L_0x0069:
            boolean r1 = r0.mo18944Z()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30061c(r3, r1)
            goto L_0x0192
        L_0x0075:
            java.util.List r1 = r0.mo18813t()
            r3.writeNoException()
            r3.writeList(r1)
            goto L_0x0192
        L_0x0081:
            r0.mo18940R()
            r3.writeNoException()
            goto L_0x0192
        L_0x0089:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0091
            r1 = 0
            goto L_0x00a5
        L_0x0091:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.j40
            if (r4 == 0) goto L_0x009f
            r1 = r2
            com.google.android.gms.internal.ads.j40 r1 = (com.google.android.gms.internal.ads.j40) r1
            goto L_0x00a5
        L_0x009f:
            com.google.android.gms.internal.ads.i40 r2 = new com.google.android.gms.internal.ads.i40
            r2.<init>(r1)
            r1 = r2
        L_0x00a5:
            r0.mo18946a4(r1)
            r3.writeNoException()
            goto L_0x0192
        L_0x00ad:
            android.os.Bundle r1 = r0.mo18947c()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30063e(r3, r1)
            goto L_0x0192
        L_0x00b9:
            f.f.b.a.b.a r1 = r0.mo18807j()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30064f(r3, r1)
            goto L_0x0192
        L_0x00c5:
            f.f.b.a.b.a r1 = r0.mo18810m()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30064f(r3, r1)
            goto L_0x0192
        L_0x00d1:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C5518rd.m30059a(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.mo18941V2(r1)
            r3.writeNoException()
            goto L_0x0192
        L_0x00e1:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C5518rd.m30059a(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            boolean r1 = r0.mo18942Y4(r1)
            r3.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30061c(r3, r1)
            goto L_0x0192
        L_0x00f5:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C5518rd.m30059a(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.mo18939H6(r1)
            r3.writeNoException()
            goto L_0x0192
        L_0x0105:
            com.google.android.gms.internal.ads.j20 r1 = r0.mo18804g()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30064f(r3, r1)
            goto L_0x0192
        L_0x0111:
            r0.mo18938G()
            r3.writeNoException()
            goto L_0x0192
        L_0x0119:
            java.lang.String r1 = r0.zzr()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x0192
        L_0x0125:
            com.google.android.gms.internal.ads.ox r1 = r0.mo18803e()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30064f(r3, r1)
            goto L_0x0192
        L_0x0130:
            java.lang.String r1 = r0.zzs()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x0192
        L_0x013b:
            java.lang.String r1 = r0.mo18811n()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x0192
        L_0x0146:
            double r1 = r0.zze()
            r3.writeNoException()
            r3.writeDouble(r1)
            goto L_0x0192
        L_0x0151:
            java.lang.String r1 = r0.mo18808k()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x0192
        L_0x015c:
            java.lang.String r1 = r0.zzp()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x0192
        L_0x0167:
            com.google.android.gms.internal.ads.q20 r1 = r0.mo18806i()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30064f(r3, r1)
            goto L_0x0192
        L_0x0172:
            java.lang.String r1 = r0.mo18809l()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x0192
        L_0x017d:
            java.util.List r1 = r0.mo18814u()
            r3.writeNoException()
            r3.writeList(r1)
            goto L_0x0192
        L_0x0188:
            java.lang.String r1 = r0.mo18812o()
            r3.writeNoException()
            r3.writeString(r1)
        L_0x0192:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l40.mo11115d7(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
