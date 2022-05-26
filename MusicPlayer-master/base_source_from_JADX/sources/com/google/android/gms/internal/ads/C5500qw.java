package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qw */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C5500qw extends C5481qd implements C5537rw {
    public C5500qw() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11115d7(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            switch(r1) {
                case 1: goto L_0x00e1;
                case 2: goto L_0x00d6;
                case 3: goto L_0x00cb;
                case 4: goto L_0x00c0;
                case 5: goto L_0x00ad;
                case 6: goto L_0x009a;
                case 7: goto L_0x008f;
                case 8: goto L_0x0084;
                case 9: goto L_0x0079;
                case 10: goto L_0x006d;
                case 11: goto L_0x005d;
                case 12: goto L_0x004d;
                case 13: goto L_0x0041;
                case 14: goto L_0x0031;
                case 15: goto L_0x0029;
                case 16: goto L_0x0005;
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
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C4982cx
            if (r4 == 0) goto L_0x001b
            r1 = r2
            com.google.android.gms.internal.ads.cx r1 = (com.google.android.gms.internal.ads.C4982cx) r1
            goto L_0x0021
        L_0x001b:
            com.google.android.gms.internal.ads.ax r2 = new com.google.android.gms.internal.ads.ax
            r2.<init>(r1)
            r1 = r2
        L_0x0021:
            r0.mo20335A5(r1)
            r3.writeNoException()
            goto L_0x00e7
        L_0x0029:
            r0.mo20340g()
            r3.writeNoException()
            goto L_0x00e7
        L_0x0031:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbkk> r1 = com.google.android.gms.internal.ads.zzbkk.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C5518rd.m30059a(r2, r1)
            com.google.android.gms.internal.ads.zzbkk r1 = (com.google.android.gms.internal.ads.zzbkk) r1
            r0.mo20134T0(r1)
            r3.writeNoException()
            goto L_0x00e7
        L_0x0041:
            java.util.List r1 = r0.mo20136d()
            r3.writeNoException()
            r3.writeTypedList(r1)
            goto L_0x00e7
        L_0x004d:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.o70 r1 = com.google.android.gms.internal.ads.n70.m27720e7(r1)
            r0.mo20137g2(r1)
            r3.writeNoException()
            goto L_0x00e7
        L_0x005d:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.cb0 r1 = com.google.android.gms.internal.ads.bb0.m21200e7(r1)
            r0.mo20132D5(r1)
            r3.writeNoException()
            goto L_0x00e7
        L_0x006d:
            java.lang.String r1 = r2.readString()
            r0.mo20337V(r1)
            r3.writeNoException()
            goto L_0x00e7
        L_0x0079:
            java.lang.String r1 = r0.mo20135c()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x00e7
        L_0x0084:
            boolean r1 = r0.mo20342n()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C5518rd.m30061c(r3, r1)
            goto L_0x00e7
        L_0x008f:
            float r1 = r0.zze()
            r3.writeNoException()
            r3.writeFloat(r1)
            goto L_0x00e7
        L_0x009a:
            java.lang.String r1 = r2.readString()
            android.os.IBinder r2 = r2.readStrongBinder()
            f.f.b.a.b.a r2 = p159f.p243f.p245b.p246a.p248b.C4863a.C4864a.m20501C0(r2)
            r0.mo20139t4(r1, r2)
            r3.writeNoException()
            goto L_0x00e7
        L_0x00ad:
            android.os.IBinder r1 = r2.readStrongBinder()
            f.f.b.a.b.a r1 = p159f.p243f.p245b.p246a.p248b.C4863a.C4864a.m20501C0(r1)
            java.lang.String r2 = r2.readString()
            r0.mo20336S4(r1, r2)
            r3.writeNoException()
            goto L_0x00e7
        L_0x00c0:
            boolean r1 = com.google.android.gms.internal.ads.C5518rd.m30065g(r2)
            r0.mo20133I0(r1)
            r3.writeNoException()
            goto L_0x00e7
        L_0x00cb:
            java.lang.String r1 = r2.readString()
            r0.mo20341k6(r1)
            r3.writeNoException()
            goto L_0x00e7
        L_0x00d6:
            float r1 = r2.readFloat()
            r0.mo20339d6(r1)
            r3.writeNoException()
            goto L_0x00e7
        L_0x00e1:
            r0.mo20138h()
            r3.writeNoException()
        L_0x00e7:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5500qw.mo11115d7(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
