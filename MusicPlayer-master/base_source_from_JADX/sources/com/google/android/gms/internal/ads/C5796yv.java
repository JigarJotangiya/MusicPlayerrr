package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C5796yv extends C5481qd implements C5833zv {
    public C5796yv() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: com.google.android.gms.internal.ads.kw} */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v2, types: [com.google.android.gms.internal.ads.lv] */
    /* JADX WARNING: type inference failed for: r5v7, types: [com.google.android.gms.internal.ads.gw] */
    /* JADX WARNING: type inference failed for: r5v12, types: [com.google.android.gms.internal.ads.iv] */
    /* JADX WARNING: type inference failed for: r5v22, types: [com.google.android.gms.internal.ads.dw] */
    /* JADX WARNING: type inference failed for: r5v27, types: [com.google.android.gms.internal.ads.ix] */
    /* JADX WARNING: type inference failed for: r5v32, types: [com.google.android.gms.internal.ads.pv] */
    /* JADX WARNING: type inference failed for: r5v37, types: [com.google.android.gms.internal.ads.nw] */
    /* JADX WARNING: type inference failed for: r5v42 */
    /* JADX WARNING: type inference failed for: r5v43 */
    /* JADX WARNING: type inference failed for: r5v44 */
    /* JADX WARNING: type inference failed for: r5v45 */
    /* JADX WARNING: type inference failed for: r5v46 */
    /* JADX WARNING: type inference failed for: r5v47 */
    /* JADX WARNING: type inference failed for: r5v48 */
    /* JADX WARNING: type inference failed for: r5v49 */
    /* JADX WARNING: type inference failed for: r5v50 */
    /* JADX WARNING: type inference failed for: r5v51 */
    /* JADX WARNING: type inference failed for: r5v52 */
    /* JADX WARNING: type inference failed for: r5v53 */
    /* JADX WARNING: type inference failed for: r5v54 */
    /* JADX WARNING: type inference failed for: r5v55 */
    /* JADX WARNING: type inference failed for: r5v56 */
    /* JADX WARNING: type inference failed for: r5v57 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11115d7(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            r5 = 0
            switch(r2) {
                case 1: goto L_0x02af;
                case 2: goto L_0x02a8;
                case 3: goto L_0x029d;
                case 4: goto L_0x028a;
                case 5: goto L_0x0283;
                case 6: goto L_0x027c;
                case 7: goto L_0x025b;
                case 8: goto L_0x023a;
                case 9: goto L_0x0232;
                case 10: goto L_0x022d;
                case 11: goto L_0x0225;
                case 12: goto L_0x0219;
                case 13: goto L_0x0209;
                case 14: goto L_0x01f9;
                case 15: goto L_0x01e5;
                case 16: goto L_0x0004;
                case 17: goto L_0x0004;
                case 18: goto L_0x01d9;
                case 19: goto L_0x01c9;
                case 20: goto L_0x01a7;
                case 21: goto L_0x0185;
                case 22: goto L_0x0179;
                case 23: goto L_0x016d;
                case 24: goto L_0x015d;
                case 25: goto L_0x0151;
                case 26: goto L_0x0145;
                case 27: goto L_0x0004;
                case 28: goto L_0x0004;
                case 29: goto L_0x0135;
                case 30: goto L_0x0125;
                case 31: goto L_0x0119;
                case 32: goto L_0x010d;
                case 33: goto L_0x0101;
                case 34: goto L_0x00f5;
                case 35: goto L_0x00e9;
                case 36: goto L_0x00c7;
                case 37: goto L_0x00bb;
                case 38: goto L_0x00af;
                case 39: goto L_0x009f;
                case 40: goto L_0x008f;
                case 41: goto L_0x0083;
                case 42: goto L_0x0061;
                case 43: goto L_0x0038;
                case 44: goto L_0x0028;
                case 45: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r2 = 0
            return r2
        L_0x0006:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x000d
            goto L_0x0020
        L_0x000d:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IFullScreenContentCallback"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.C5389nw
            if (r5 == 0) goto L_0x001b
            r5 = r3
            com.google.android.gms.internal.ads.nw r5 = (com.google.android.gms.internal.ads.C5389nw) r5
            goto L_0x0020
        L_0x001b:
            com.google.android.gms.internal.ads.lw r5 = new com.google.android.gms.internal.ads.lw
            r5.<init>(r2)
        L_0x0020:
            r1.mo10924B1(r5)
            r4.writeNoException()
            goto L_0x02b9
        L_0x0028:
            android.os.IBinder r2 = r3.readStrongBinder()
            f.f.b.a.b.a r2 = p159f.p243f.p245b.p246a.p248b.C4863a.C4864a.m20501C0(r2)
            r1.mo10962x2(r2)
            r4.writeNoException()
            goto L_0x02b9
        L_0x0038:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfd> r2 = com.google.android.gms.internal.ads.zzbfd.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C5518rd.m30059a(r3, r2)
            com.google.android.gms.internal.ads.zzbfd r2 = (com.google.android.gms.internal.ads.zzbfd) r2
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x0047
            goto L_0x0059
        L_0x0047:
            java.lang.String r5 = "com.google.android.gms.ads.internal.client.IAdLoadCallback"
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.C5462pv
            if (r0 == 0) goto L_0x0054
            com.google.android.gms.internal.ads.pv r5 = (com.google.android.gms.internal.ads.C5462pv) r5
            goto L_0x0059
        L_0x0054:
            com.google.android.gms.internal.ads.mv r5 = new com.google.android.gms.internal.ads.mv
            r5.<init>(r3)
        L_0x0059:
            r1.mo10961x1(r2, r5)
            r4.writeNoException()
            goto L_0x02b9
        L_0x0061:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x0068
            goto L_0x007b
        L_0x0068:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IOnPaidEventListener"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.C5205ix
            if (r5 == 0) goto L_0x0076
            r5 = r3
            com.google.android.gms.internal.ads.ix r5 = (com.google.android.gms.internal.ads.C5205ix) r5
            goto L_0x007b
        L_0x0076:
            com.google.android.gms.internal.ads.gx r5 = new com.google.android.gms.internal.ads.gx
            r5.<init>(r2)
        L_0x007b:
            r1.mo10946h3(r5)
            r4.writeNoException()
            goto L_0x02b9
        L_0x0083:
            com.google.android.gms.internal.ads.lx r2 = r1.mo10947i()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30064f(r4, r2)
            goto L_0x02b9
        L_0x008f:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.wo r2 = com.google.android.gms.internal.ads.C5677vo.m32494e7(r2)
            r1.mo10954n6(r2)
            r4.writeNoException()
            goto L_0x02b9
        L_0x009f:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfo> r2 = com.google.android.gms.internal.ads.zzbfo.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C5518rd.m30059a(r3, r2)
            com.google.android.gms.internal.ads.zzbfo r2 = (com.google.android.gms.internal.ads.zzbfo) r2
            r1.mo10939X5(r2)
            r4.writeNoException()
            goto L_0x02b9
        L_0x00af:
            java.lang.String r2 = r3.readString()
            r1.mo10938W0(r2)
            r4.writeNoException()
            goto L_0x02b9
        L_0x00bb:
            android.os.Bundle r2 = r1.mo10942f()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30063e(r4, r2)
            goto L_0x02b9
        L_0x00c7:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x00ce
            goto L_0x00e1
        L_0x00ce:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdMetadataListener"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.C5018dw
            if (r5 == 0) goto L_0x00dc
            r5 = r3
            com.google.android.gms.internal.ads.dw r5 = (com.google.android.gms.internal.ads.C5018dw) r5
            goto L_0x00e1
        L_0x00dc:
            com.google.android.gms.internal.ads.bw r5 = new com.google.android.gms.internal.ads.bw
            r5.<init>(r2)
        L_0x00e1:
            r1.mo10959s6(r5)
            r4.writeNoException()
            goto L_0x02b9
        L_0x00e9:
            java.lang.String r2 = r1.mo10953n()
            r4.writeNoException()
            r4.writeString(r2)
            goto L_0x02b9
        L_0x00f5:
            boolean r2 = com.google.android.gms.internal.ads.C5518rd.m30065g(r3)
            r1.mo10958s5(r2)
            r4.writeNoException()
            goto L_0x02b9
        L_0x0101:
            com.google.android.gms.internal.ads.lv r2 = r1.mo10944g()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30064f(r4, r2)
            goto L_0x02b9
        L_0x010d:
            com.google.android.gms.internal.ads.gw r2 = r1.mo10945h()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30064f(r4, r2)
            goto L_0x02b9
        L_0x0119:
            java.lang.String r2 = r1.zzr()
            r4.writeNoException()
            r4.writeString(r2)
            goto L_0x02b9
        L_0x0125:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbjd> r2 = com.google.android.gms.internal.ads.zzbjd.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C5518rd.m30059a(r3, r2)
            com.google.android.gms.internal.ads.zzbjd r2 = (com.google.android.gms.internal.ads.zzbjd) r2
            r1.mo10925E2(r2)
            r4.writeNoException()
            goto L_0x02b9
        L_0x0135:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbkq> r2 = com.google.android.gms.internal.ads.zzbkq.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C5518rd.m30059a(r3, r2)
            com.google.android.gms.internal.ads.zzbkq r2 = (com.google.android.gms.internal.ads.zzbkq) r2
            r1.mo10937S6(r2)
            r4.writeNoException()
            goto L_0x02b9
        L_0x0145:
            com.google.android.gms.internal.ads.ox r2 = r1.mo10948j()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30064f(r4, r2)
            goto L_0x02b9
        L_0x0151:
            java.lang.String r2 = r3.readString()
            r1.mo10963y2(r2)
            r4.writeNoException()
            goto L_0x02b9
        L_0x015d:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.lh0 r2 = com.google.android.gms.internal.ads.kh0.m26227e7(r2)
            r1.mo10932N4(r2)
            r4.writeNoException()
            goto L_0x02b9
        L_0x016d:
            boolean r2 = r1.mo10931M5()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30061c(r4, r2)
            goto L_0x02b9
        L_0x0179:
            boolean r2 = com.google.android.gms.internal.ads.C5518rd.m30065g(r3)
            r1.mo10936R6(r2)
            r4.writeNoException()
            goto L_0x02b9
        L_0x0185:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x018c
            goto L_0x019f
        L_0x018c:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.C5278kw
            if (r5 == 0) goto L_0x019a
            r5 = r3
            com.google.android.gms.internal.ads.kw r5 = (com.google.android.gms.internal.ads.C5278kw) r5
            goto L_0x019f
        L_0x019a:
            com.google.android.gms.internal.ads.kw r5 = new com.google.android.gms.internal.ads.kw
            r5.<init>(r2)
        L_0x019f:
            r1.mo10929J2(r5)
            r4.writeNoException()
            goto L_0x02b9
        L_0x01a7:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x01ae
            goto L_0x01c1
        L_0x01ae:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdClickListener"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.C5203iv
            if (r5 == 0) goto L_0x01bc
            r5 = r3
            com.google.android.gms.internal.ads.iv r5 = (com.google.android.gms.internal.ads.C5203iv) r5
            goto L_0x01c1
        L_0x01bc:
            com.google.android.gms.internal.ads.gv r5 = new com.google.android.gms.internal.ads.gv
            r5.<init>(r2)
        L_0x01c1:
            r1.mo10935Q0(r5)
            r4.writeNoException()
            goto L_0x02b9
        L_0x01c9:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.m00 r2 = com.google.android.gms.internal.ads.l00.m26496e7(r2)
            r1.mo10930J5(r2)
            r4.writeNoException()
            goto L_0x02b9
        L_0x01d9:
            java.lang.String r2 = r1.zzs()
            r4.writeNoException()
            r4.writeString(r2)
            goto L_0x02b9
        L_0x01e5:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.kf0 r2 = com.google.android.gms.internal.ads.jf0.m25674e7(r2)
            java.lang.String r3 = r3.readString()
            r1.mo10949j4(r2, r3)
            r4.writeNoException()
            goto L_0x02b9
        L_0x01f9:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.hf0 r2 = com.google.android.gms.internal.ads.gf0.m24310e7(r2)
            r1.mo10957q6(r2)
            r4.writeNoException()
            goto L_0x02b9
        L_0x0209:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfi> r2 = com.google.android.gms.internal.ads.zzbfi.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C5518rd.m30059a(r3, r2)
            com.google.android.gms.internal.ads.zzbfi r2 = (com.google.android.gms.internal.ads.zzbfi) r2
            r1.mo10960v5(r2)
            r4.writeNoException()
            goto L_0x02b9
        L_0x0219:
            com.google.android.gms.internal.ads.zzbfi r2 = r1.mo10940d()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30063e(r4, r2)
            goto L_0x02b9
        L_0x0225:
            r1.mo10923B()
            r4.writeNoException()
            goto L_0x02b9
        L_0x022d:
            r4.writeNoException()
            goto L_0x02b9
        L_0x0232:
            r1.mo10943f0()
            r4.writeNoException()
            goto L_0x02b9
        L_0x023a:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x0241
            goto L_0x0254
        L_0x0241:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAppEventListener"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.C5130gw
            if (r5 == 0) goto L_0x024f
            r5 = r3
            com.google.android.gms.internal.ads.gw r5 = (com.google.android.gms.internal.ads.C5130gw) r5
            goto L_0x0254
        L_0x024f:
            com.google.android.gms.internal.ads.ew r5 = new com.google.android.gms.internal.ads.ew
            r5.<init>(r2)
        L_0x0254:
            r1.mo10951k2(r5)
            r4.writeNoException()
            goto L_0x02b9
        L_0x025b:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x0262
            goto L_0x0275
        L_0x0262:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.C5314lv
            if (r5 == 0) goto L_0x0270
            r5 = r3
            com.google.android.gms.internal.ads.lv r5 = (com.google.android.gms.internal.ads.C5314lv) r5
            goto L_0x0275
        L_0x0270:
            com.google.android.gms.internal.ads.jv r5 = new com.google.android.gms.internal.ads.jv
            r5.<init>(r2)
        L_0x0275:
            r1.mo10952k5(r5)
            r4.writeNoException()
            goto L_0x02b9
        L_0x027c:
            r1.mo10927I()
            r4.writeNoException()
            goto L_0x02b9
        L_0x0283:
            r1.mo10933O()
            r4.writeNoException()
            goto L_0x02b9
        L_0x028a:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbfd> r2 = com.google.android.gms.internal.ads.zzbfd.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C5518rd.m30059a(r3, r2)
            com.google.android.gms.internal.ads.zzbfd r2 = (com.google.android.gms.internal.ads.zzbfd) r2
            boolean r2 = r1.mo10934O5(r2)
            r4.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30061c(r4, r2)
            goto L_0x02b9
        L_0x029d:
            boolean r2 = r1.mo10928J0()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30061c(r4, r2)
            goto L_0x02b9
        L_0x02a8:
            r1.mo10926G()
            r4.writeNoException()
            goto L_0x02b9
        L_0x02af:
            f.f.b.a.b.a r2 = r1.mo10950k()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30064f(r4, r2)
        L_0x02b9:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5796yv.mo11115d7(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
