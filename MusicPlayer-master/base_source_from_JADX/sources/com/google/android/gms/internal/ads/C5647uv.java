package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C5647uv extends C5481qd implements C5684vv {
    public C5647uv() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: com.google.android.gms.internal.ads.kw} */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [com.google.android.gms.internal.ads.lv] */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11115d7(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            r4 = 0
            switch(r1) {
                case 1: goto L_0x00f9;
                case 2: goto L_0x00d8;
                case 3: goto L_0x00c9;
                case 4: goto L_0x00ba;
                case 5: goto L_0x009f;
                case 6: goto L_0x0090;
                case 7: goto L_0x006e;
                case 8: goto L_0x0056;
                case 9: goto L_0x0046;
                case 10: goto L_0x0036;
                case 11: goto L_0x0004;
                case 12: goto L_0x0004;
                case 13: goto L_0x0026;
                case 14: goto L_0x0016;
                case 15: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r1 = 0
            return r1
        L_0x0006:
            android.os.Parcelable$Creator<com.google.android.gms.ads.formats.AdManagerAdViewOptions> r1 = com.google.android.gms.ads.formats.AdManagerAdViewOptions.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C5518rd.m30059a(r2, r1)
            com.google.android.gms.ads.formats.AdManagerAdViewOptions r1 = (com.google.android.gms.ads.formats.AdManagerAdViewOptions) r1
            r0.mo19025L6(r1)
            r3.writeNoException()
            goto L_0x0103
        L_0x0016:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.b80 r1 = com.google.android.gms.internal.ads.a80.m20623e7(r1)
            r0.mo19029a2(r1)
            r3.writeNoException()
            goto L_0x0103
        L_0x0026:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbtz> r1 = com.google.android.gms.internal.ads.zzbtz.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C5518rd.m30059a(r2, r1)
            com.google.android.gms.internal.ads.zzbtz r1 = (com.google.android.gms.internal.ads.zzbtz) r1
            r0.mo19031r1(r1)
            r3.writeNoException()
            goto L_0x0103
        L_0x0036:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.d40 r1 = com.google.android.gms.internal.ads.c40.m21661e7(r1)
            r0.mo19026T2(r1)
            r3.writeNoException()
            goto L_0x0103
        L_0x0046:
            android.os.Parcelable$Creator<com.google.android.gms.ads.formats.PublisherAdViewOptions> r1 = com.google.android.gms.ads.formats.PublisherAdViewOptions.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C5518rd.m30059a(r2, r1)
            com.google.android.gms.ads.formats.PublisherAdViewOptions r1 = (com.google.android.gms.ads.formats.PublisherAdViewOptions) r1
            r0.mo19023G6(r1)
            r3.writeNoException()
            goto L_0x0103
        L_0x0056:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.a40 r1 = com.google.android.gms.internal.ads.z30.m34407e7(r1)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfi> r4 = com.google.android.gms.internal.ads.zzbfi.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C5518rd.m30059a(r2, r4)
            com.google.android.gms.internal.ads.zzbfi r2 = (com.google.android.gms.internal.ads.zzbfi) r2
            r0.mo19024J3(r1, r2)
            r3.writeNoException()
            goto L_0x0103
        L_0x006e:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0075
            goto L_0x0088
        L_0x0075:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C5278kw
            if (r4 == 0) goto L_0x0083
            r4 = r2
            com.google.android.gms.internal.ads.kw r4 = (com.google.android.gms.internal.ads.C5278kw) r4
            goto L_0x0088
        L_0x0083:
            com.google.android.gms.internal.ads.kw r4 = new com.google.android.gms.internal.ads.kw
            r4.<init>(r1)
        L_0x0088:
            r0.mo19034w6(r4)
            r3.writeNoException()
            goto L_0x0103
        L_0x0090:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbnw> r1 = com.google.android.gms.internal.ads.zzbnw.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C5518rd.m30059a(r2, r1)
            com.google.android.gms.internal.ads.zzbnw r1 = (com.google.android.gms.internal.ads.zzbnw) r1
            r0.mo19022D2(r1)
            r3.writeNoException()
            goto L_0x0103
        L_0x009f:
            java.lang.String r1 = r2.readString()
            android.os.IBinder r4 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.w30 r4 = com.google.android.gms.internal.ads.v30.m32130e7(r4)
            android.os.IBinder r2 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.t30 r2 = com.google.android.gms.internal.ads.s30.m30537e7(r2)
            r0.mo19033w2(r1, r4, r2)
            r3.writeNoException()
            goto L_0x0103
        L_0x00ba:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.q30 r1 = com.google.android.gms.internal.ads.p30.m28860e7(r1)
            r0.mo19027U2(r1)
            r3.writeNoException()
            goto L_0x0103
        L_0x00c9:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.n30 r1 = com.google.android.gms.internal.ads.m30.m27107e7(r1)
            r0.mo19028U6(r1)
            r3.writeNoException()
            goto L_0x0103
        L_0x00d8:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x00df
            goto L_0x00f2
        L_0x00df:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C5314lv
            if (r4 == 0) goto L_0x00ed
            r4 = r2
            com.google.android.gms.internal.ads.lv r4 = (com.google.android.gms.internal.ads.C5314lv) r4
            goto L_0x00f2
        L_0x00ed:
            com.google.android.gms.internal.ads.jv r4 = new com.google.android.gms.internal.ads.jv
            r4.<init>(r1)
        L_0x00f2:
            r0.mo19032v6(r4)
            r3.writeNoException()
            goto L_0x0103
        L_0x00f9:
            com.google.android.gms.internal.ads.sv r1 = r0.zze()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30064f(r3, r1)
        L_0x0103:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5647uv.mo11115d7(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
