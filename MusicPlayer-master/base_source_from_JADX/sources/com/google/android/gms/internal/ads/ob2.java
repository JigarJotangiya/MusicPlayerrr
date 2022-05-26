package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ob2 implements sg2<qb2> {

    /* renamed from: a */
    private final e93 f20965a;

    /* renamed from: b */
    private final br1 f20966b;

    /* renamed from: c */
    private final mv1 f20967c;

    /* renamed from: d */
    private final rb2 f20968d;

    public ob2(e93 e93, br1 br1, mv1 mv1, rb2 rb2) {
        this.f20965a = e93;
        this.f20966b = br1;
        this.f20967c = mv1;
        this.f20968d = rb2;
    }

    /* renamed from: a */
    public final d93<qb2> mo15767a() {
        if (d23.m22316d((String) C5054ev.m23225c().mo20153b(C5503qz.f22431U0)) || this.f20968d.mo20621b() || !this.f20967c.mo19562s()) {
            return s83.m30607i(new qb2(new Bundle(), (pb2) null));
        }
        this.f20968d.mo20620a(true);
        return this.f20965a.mo17138A0(new nb2(this));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(14:3|4|5|6|7|(1:9)|10|11|(1:13)|14|15|21|19|1) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x004d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x005c */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053 A[Catch:{ zp2 -> 0x005c }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.qb2 mo19956b() throws java.lang.Exception {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.iz<java.lang.String> r0 = com.google.android.gms.internal.ads.C5503qz.f22431U0
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r0 = r1.mo20153b(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ";"
            java.lang.String[] r0 = r0.split(r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x001f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0062
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.ads.br1 r3 = r7.f20966b     // Catch:{ zp2 -> 0x0060 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ zp2 -> 0x0060 }
            r4.<init>()     // Catch:{ zp2 -> 0x0060 }
            com.google.android.gms.internal.ads.kq2 r3 = r3.mo16361b(r2, r4)     // Catch:{ zp2 -> 0x0060 }
            r3.mo18963a()     // Catch:{ zp2 -> 0x0060 }
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ zp2 -> 0x0060 }
            r4.<init>()     // Catch:{ zp2 -> 0x0060 }
            com.google.android.gms.internal.ads.zzcab r5 = r3.mo18971i()     // Catch:{ zp2 -> 0x004d }
            if (r5 == 0) goto L_0x004d
            java.lang.String r6 = "sdk_version"
            java.lang.String r5 = r5.toString()     // Catch:{ zp2 -> 0x004d }
            r4.putString(r6, r5)     // Catch:{ zp2 -> 0x004d }
        L_0x004d:
            com.google.android.gms.internal.ads.zzcab r3 = r3.mo18970h()     // Catch:{ zp2 -> 0x005c }
            if (r3 == 0) goto L_0x005c
            java.lang.String r5 = "adapter_version"
            java.lang.String r3 = r3.toString()     // Catch:{ zp2 -> 0x005c }
            r4.putString(r5, r3)     // Catch:{ zp2 -> 0x005c }
        L_0x005c:
            r1.putBundle(r2, r4)     // Catch:{ zp2 -> 0x0060 }
            goto L_0x001f
        L_0x0060:
            goto L_0x001f
        L_0x0062:
            com.google.android.gms.internal.ads.qb2 r0 = new com.google.android.gms.internal.ads.qb2
            r2 = 0
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ob2.mo19956b():com.google.android.gms.internal.ads.qb2");
    }
}
