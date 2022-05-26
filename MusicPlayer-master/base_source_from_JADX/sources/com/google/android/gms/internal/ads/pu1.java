package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class pu1 extends t60 {

    /* renamed from: g */
    private final su1 f21521g;

    /* renamed from: h */
    private final nu1 f21522h;

    /* renamed from: i */
    private final Map<Long, gu1> f21523i = new HashMap();

    pu1(su1 su1, nu1 nu1) {
        this.f21521g = su1;
        this.f21522h = nu1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: e7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzbfd m29168e7(java.util.Map<java.lang.String, java.lang.String> r30) {
        /*
            com.google.android.gms.internal.ads.au r0 = new com.google.android.gms.internal.ads.au
            r0.<init>()
            java.lang.String r1 = "ad_request"
            r2 = r30
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0016
            com.google.android.gms.internal.ads.zzbfd r0 = r0.mo15950a()
            return r0
        L_0x0016:
            java.lang.String r1 = android.net.Uri.decode(r1)
            android.util.JsonReader r2 = new android.util.JsonReader
            java.io.StringReader r3 = new java.io.StringReader
            r3.<init>(r1)
            r2.<init>(r3)
            r2.beginObject()     // Catch:{ IOException -> 0x010e }
        L_0x0027:
            boolean r1 = r2.hasNext()     // Catch:{ IOException -> 0x010e }
            if (r1 == 0) goto L_0x010a
            java.lang.String r1 = r2.nextName()     // Catch:{ IOException -> 0x010e }
            int r3 = r1.hashCode()     // Catch:{ IOException -> 0x010e }
            r4 = 1
            r5 = 0
            switch(r3) {
                case -1289032093: goto L_0x0077;
                case -839117230: goto L_0x006d;
                case -733436947: goto L_0x0063;
                case -99890337: goto L_0x0059;
                case 523149226: goto L_0x004f;
                case 597632527: goto L_0x0045;
                case 1411582723: goto L_0x003b;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0081
        L_0x003b:
            java.lang.String r3 = "tagForChildDirectedTreatment"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0081
            r1 = 3
            goto L_0x0082
        L_0x0045:
            java.lang.String r3 = "maxAdContentRating"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0081
            r1 = 5
            goto L_0x0082
        L_0x004f:
            java.lang.String r3 = "keywords"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0081
            r1 = 1
            goto L_0x0082
        L_0x0059:
            java.lang.String r3 = "httpTimeoutMillis"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0081
            r1 = 6
            goto L_0x0082
        L_0x0063:
            java.lang.String r3 = "tagForUnderAgeOfConsent"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0081
            r1 = 4
            goto L_0x0082
        L_0x006d:
            java.lang.String r3 = "isTestDevice"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0081
            r1 = 2
            goto L_0x0082
        L_0x0077:
            java.lang.String r3 = "extras"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0081
            r1 = 0
            goto L_0x0082
        L_0x0081:
            r1 = -1
        L_0x0082:
            switch(r1) {
                case 0: goto L_0x00e8;
                case 1: goto L_0x00ca;
                case 2: goto L_0x00c1;
                case 3: goto L_0x00b1;
                case 4: goto L_0x00a1;
                case 5: goto L_0x0091;
                case 6: goto L_0x0089;
                default: goto L_0x0085;
            }
        L_0x0085:
            r2.skipValue()     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x0089:
            int r1 = r2.nextInt()     // Catch:{ IOException -> 0x010e }
            r0.mo15952c(r1)     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x0091:
            java.lang.String r1 = r2.nextString()     // Catch:{ IOException -> 0x010e }
            java.util.List<java.lang.String> r3 = com.google.android.gms.ads.C3110r.f10196e     // Catch:{ IOException -> 0x010e }
            boolean r3 = r3.contains(r1)     // Catch:{ IOException -> 0x010e }
            if (r3 == 0) goto L_0x0027
            r0.mo15955f(r1)     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x00a1:
            boolean r1 = r2.nextBoolean()     // Catch:{ IOException -> 0x010e }
            if (r1 == 0) goto L_0x00ac
            r0.mo15957h(r4)     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x00ac:
            r0.mo15957h(r5)     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x00b1:
            boolean r1 = r2.nextBoolean()     // Catch:{ IOException -> 0x010e }
            if (r1 == 0) goto L_0x00bc
            r0.mo15956g(r4)     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x00bc:
            r0.mo15956g(r5)     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x00c1:
            boolean r1 = r2.nextBoolean()     // Catch:{ IOException -> 0x010e }
            r0.mo15953d(r1)     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x00ca:
            r2.beginArray()     // Catch:{ IOException -> 0x010e }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ IOException -> 0x010e }
            r1.<init>()     // Catch:{ IOException -> 0x010e }
        L_0x00d2:
            boolean r3 = r2.hasNext()     // Catch:{ IOException -> 0x010e }
            if (r3 == 0) goto L_0x00e0
            java.lang.String r3 = r2.nextString()     // Catch:{ IOException -> 0x010e }
            r1.add(r3)     // Catch:{ IOException -> 0x010e }
            goto L_0x00d2
        L_0x00e0:
            r2.endArray()     // Catch:{ IOException -> 0x010e }
            r0.mo15954e(r1)     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x00e8:
            r2.beginObject()     // Catch:{ IOException -> 0x010e }
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ IOException -> 0x010e }
            r1.<init>()     // Catch:{ IOException -> 0x010e }
        L_0x00f0:
            boolean r3 = r2.hasNext()     // Catch:{ IOException -> 0x010e }
            if (r3 == 0) goto L_0x0102
            java.lang.String r3 = r2.nextName()     // Catch:{ IOException -> 0x010e }
            java.lang.String r4 = r2.nextString()     // Catch:{ IOException -> 0x010e }
            r1.putString(r3, r4)     // Catch:{ IOException -> 0x010e }
            goto L_0x00f0
        L_0x0102:
            r2.endObject()     // Catch:{ IOException -> 0x010e }
            r0.mo15951b(r1)     // Catch:{ IOException -> 0x010e }
            goto L_0x0027
        L_0x010a:
            r2.endObject()     // Catch:{ IOException -> 0x010e }
            goto L_0x0113
        L_0x010e:
            java.lang.String r1 = "Ad Request json was malformed, parsing ended early."
            com.google.android.gms.internal.ads.ul0.m31857b(r1)
        L_0x0113:
            com.google.android.gms.internal.ads.zzbfd r0 = r0.mo15950a()
            android.os.Bundle r1 = r0.f27207s
            java.lang.String r2 = "com.google.ads.mediation.admob.AdMobAdapter"
            android.os.Bundle r1 = r1.getBundle(r2)
            if (r1 != 0) goto L_0x0128
            android.os.Bundle r1 = r0.f27197i
            android.os.Bundle r3 = r0.f27207s
            r3.putBundle(r2, r1)
        L_0x0128:
            r8 = r1
            com.google.android.gms.internal.ads.zzbfd r1 = new com.google.android.gms.internal.ads.zzbfd
            r4 = r1
            int r5 = r0.f27195g
            long r6 = r0.f27196h
            int r9 = r0.f27198j
            java.util.List<java.lang.String> r10 = r0.f27199k
            boolean r11 = r0.f27200l
            int r12 = r0.f27201m
            boolean r13 = r0.f27202n
            java.lang.String r14 = r0.f27203o
            com.google.android.gms.internal.ads.zzbkm r15 = r0.f27204p
            android.location.Location r2 = r0.f27205q
            r16 = r2
            java.lang.String r2 = r0.f27206r
            r17 = r2
            android.os.Bundle r2 = r0.f27207s
            r18 = r2
            android.os.Bundle r2 = r0.f27208t
            r19 = r2
            java.util.List<java.lang.String> r2 = r0.f27209u
            r20 = r2
            java.lang.String r2 = r0.f27210v
            r21 = r2
            java.lang.String r2 = r0.f27211w
            r22 = r2
            boolean r2 = r0.f27212x
            r23 = r2
            com.google.android.gms.internal.ads.zzbeu r2 = r0.f27213y
            r24 = r2
            int r2 = r0.f27214z
            r25 = r2
            java.lang.String r2 = r0.f27191A
            r26 = r2
            java.util.List<java.lang.String> r2 = r0.f27192B
            r27 = r2
            int r2 = r0.f27193C
            r28 = r2
            java.lang.String r0 = r0.f27194D
            r29 = r0
            r4.<init>(r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pu1.m29168e7(java.util.Map):com.google.android.gms.internal.ads.zzbfd");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b1, code lost:
        if (r0.equals("create_interstitial_ad") != false) goto L_0x00d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20318v(java.lang.String r12) throws android.os.RemoteException {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22575m6
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r0 = r1.mo20153b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0013
            return
        L_0x0013:
            java.lang.String r0 = java.lang.String.valueOf(r12)
            java.lang.String r1 = "Received H5 gmsg: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0024
            java.lang.String r0 = r1.concat(r0)
            goto L_0x0029
        L_0x0024:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x0029:
            com.google.android.gms.ads.internal.util.C3018m1.m13388k(r0)
            android.net.Uri r12 = android.net.Uri.parse(r12)
            com.google.android.gms.ads.internal.C2971s.m13214q()
            java.util.Map r12 = com.google.android.gms.ads.internal.util.C2979b2.m13271s(r12)
            java.lang.String r0 = "action"
            java.lang.Object r0 = r12.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x004b
            java.lang.String r12 = "H5 gmsg did not contain an action"
            com.google.android.gms.internal.ads.ul0.m31857b(r12)
            return
        L_0x004b:
            int r1 = r0.hashCode()
            r2 = 579053441(0x2283a781, float:3.5684973E-18)
            r3 = 0
            r4 = -1
            r5 = 1
            if (r1 == r2) goto L_0x0067
            r2 = 871091088(0x33ebcb90, float:1.0980068E-7)
            if (r1 == r2) goto L_0x005d
            goto L_0x0071
        L_0x005d:
            java.lang.String r1 = "initialize"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0071
            r1 = 0
            goto L_0x0072
        L_0x0067:
            java.lang.String r1 = "dispose_all"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0071
            r1 = 1
            goto L_0x0072
        L_0x0071:
            r1 = -1
        L_0x0072:
            if (r1 == 0) goto L_0x02fd
            if (r1 == r5) goto L_0x02dd
            java.lang.String r1 = "obj_id"
            java.lang.Object r1 = r12.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()     // Catch:{ NullPointerException | NumberFormatException -> 0x02c2 }
            long r1 = java.lang.Long.parseLong(r1)     // Catch:{ NullPointerException | NumberFormatException -> 0x02c2 }
            int r6 = r0.hashCode()
            switch(r6) {
                case -1790951212: goto L_0x00c8;
                case -1266374734: goto L_0x00be;
                case -257098725: goto L_0x00b4;
                case 393881811: goto L_0x00ab;
                case 585513149: goto L_0x00a1;
                case 1671767583: goto L_0x0097;
                case 2109237041: goto L_0x008d;
                default: goto L_0x008c;
            }
        L_0x008c:
            goto L_0x00d2
        L_0x008d:
            java.lang.String r3 = "create_rewarded_ad"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00d2
            r3 = 3
            goto L_0x00d3
        L_0x0097:
            java.lang.String r3 = "dispose"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00d2
            r3 = 6
            goto L_0x00d3
        L_0x00a1:
            java.lang.String r3 = "load_interstitial_ad"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00d2
            r3 = 1
            goto L_0x00d3
        L_0x00ab:
            java.lang.String r5 = "create_interstitial_ad"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x00d2
            goto L_0x00d3
        L_0x00b4:
            java.lang.String r3 = "load_rewarded_ad"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00d2
            r3 = 4
            goto L_0x00d3
        L_0x00be:
            java.lang.String r3 = "show_rewarded_ad"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00d2
            r3 = 5
            goto L_0x00d3
        L_0x00c8:
            java.lang.String r3 = "show_interstitial_ad"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00d2
            r3 = 2
            goto L_0x00d3
        L_0x00d2:
            r3 = -1
        L_0x00d3:
            java.lang.String r4 = "Could not create H5 ad, missing ad unit id"
            java.lang.String r5 = " with ad unit "
            java.lang.String r6 = "Could not create H5 ad, object ID already exists"
            java.lang.String r7 = "ad_unit"
            java.lang.String r8 = "Could not show H5 ad, object ID does not exist"
            java.lang.String r9 = "Could not load H5 ad, object ID does not exist"
            java.lang.String r10 = "Could not create H5 ad, too many existing objects"
            switch(r3) {
                case 0: goto L_0x022b;
                case 1: goto L_0x020c;
                case 2: goto L_0x01f1;
                case 3: goto L_0x0163;
                case 4: goto L_0x0144;
                case 5: goto L_0x0129;
                case 6: goto L_0x00f6;
                default: goto L_0x00e4;
            }
        L_0x00e4:
            java.lang.String r12 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "H5 gmsg contained invalid action: "
            int r1 = r12.length()
            if (r1 == 0) goto L_0x02b9
            java.lang.String r12 = r0.concat(r12)
            goto L_0x02be
        L_0x00f6:
            java.util.Map<java.lang.Long, com.google.android.gms.internal.ads.gu1> r12 = r11.f21523i
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            java.lang.Object r12 = r12.get(r0)
            com.google.android.gms.internal.ads.gu1 r12 = (com.google.android.gms.internal.ads.gu1) r12
            if (r12 != 0) goto L_0x010a
            java.lang.String r12 = "Could not dispose H5 ad, object ID does not exist"
            com.google.android.gms.internal.ads.ul0.m31857b(r12)
            return
        L_0x010a:
            r12.zza()
            java.util.Map<java.lang.Long, com.google.android.gms.internal.ads.gu1> r12 = r11.f21523i
            r12.remove(r0)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r0 = 36
            r12.<init>(r0)
            java.lang.String r0 = "Disposed H5 ad #"
            r12.append(r0)
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            com.google.android.gms.ads.internal.util.C3018m1.m13388k(r12)
            return
        L_0x0129:
            java.util.Map<java.lang.Long, com.google.android.gms.internal.ads.gu1> r12 = r11.f21523i
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            java.lang.Object r12 = r12.get(r0)
            com.google.android.gms.internal.ads.gu1 r12 = (com.google.android.gms.internal.ads.gu1) r12
            if (r12 != 0) goto L_0x0140
            com.google.android.gms.internal.ads.ul0.m31857b(r8)
            com.google.android.gms.internal.ads.nu1 r12 = r11.f21522h
            r12.mo19842q(r1)
            return
        L_0x0140:
            r12.mo18027b()
            return
        L_0x0144:
            java.util.Map<java.lang.Long, com.google.android.gms.internal.ads.gu1> r0 = r11.f21523i
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.internal.ads.gu1 r0 = (com.google.android.gms.internal.ads.gu1) r0
            if (r0 != 0) goto L_0x015b
            com.google.android.gms.internal.ads.ul0.m31857b(r9)
            com.google.android.gms.internal.ads.nu1 r12 = r11.f21522h
            r12.mo19842q(r1)
            return
        L_0x015b:
            com.google.android.gms.internal.ads.zzbfd r12 = m29168e7(r12)
            r0.mo18026a(r12)
            return
        L_0x0163:
            java.util.Map<java.lang.Long, com.google.android.gms.internal.ads.gu1> r0 = r11.f21523i
            int r0 = r0.size()
            com.google.android.gms.internal.ads.iz<java.lang.Integer> r3 = com.google.android.gms.internal.ads.C5503qz.f22583n6
            com.google.android.gms.internal.ads.oz r8 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r3 = r8.mo20153b(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r0 < r3) goto L_0x0184
            com.google.android.gms.internal.ads.ul0.m31862g(r10)
            com.google.android.gms.internal.ads.nu1 r12 = r11.f21522h
            r12.mo19834i(r1)
            return
        L_0x0184:
            java.util.Map<java.lang.Long, com.google.android.gms.internal.ads.gu1> r0 = r11.f21523i
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x0199
            com.google.android.gms.internal.ads.ul0.m31857b(r6)
            com.google.android.gms.internal.ads.nu1 r12 = r11.f21522h
            r12.mo19834i(r1)
            return
        L_0x0199:
            java.lang.Object r12 = r12.get(r7)
            java.lang.String r12 = (java.lang.String) r12
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L_0x01ae
            com.google.android.gms.internal.ads.ul0.m31862g(r4)
            com.google.android.gms.internal.ads.nu1 r12 = r11.f21522h
            r12.mo19834i(r1)
            return
        L_0x01ae:
            com.google.android.gms.internal.ads.su1 r0 = r11.f21521g
            com.google.android.gms.internal.ads.hu1 r0 = r0.mo18752a()
            r0.mo17022a(r1)
            r0.mo17024p(r12)
            com.google.android.gms.internal.ads.ku1 r0 = r0.mo17023b()
            com.google.android.gms.internal.ads.yu1 r0 = r0.mo17760a()
            java.util.Map<java.lang.Long, com.google.android.gms.internal.ads.gu1> r4 = r11.f21523i
            r4.put(r3, r0)
            com.google.android.gms.internal.ads.nu1 r0 = r11.f21522h
            r0.mo19833h(r1)
            java.lang.String r0 = java.lang.String.valueOf(r12)
            int r0 = r0.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r0 = r0 + 55
            r3.<init>(r0)
            java.lang.String r0 = "Created H5 rewarded #"
            r3.append(r0)
            r3.append(r1)
            r3.append(r5)
            r3.append(r12)
            java.lang.String r12 = r3.toString()
            com.google.android.gms.ads.internal.util.C3018m1.m13388k(r12)
            return
        L_0x01f1:
            java.util.Map<java.lang.Long, com.google.android.gms.internal.ads.gu1> r12 = r11.f21523i
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            java.lang.Object r12 = r12.get(r0)
            com.google.android.gms.internal.ads.gu1 r12 = (com.google.android.gms.internal.ads.gu1) r12
            if (r12 != 0) goto L_0x0208
            com.google.android.gms.internal.ads.ul0.m31857b(r8)
            com.google.android.gms.internal.ads.nu1 r12 = r11.f21522h
            r12.mo19831f(r1)
            return
        L_0x0208:
            r12.mo18027b()
            return
        L_0x020c:
            java.util.Map<java.lang.Long, com.google.android.gms.internal.ads.gu1> r0 = r11.f21523i
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.internal.ads.gu1 r0 = (com.google.android.gms.internal.ads.gu1) r0
            if (r0 != 0) goto L_0x0223
            com.google.android.gms.internal.ads.ul0.m31857b(r9)
            com.google.android.gms.internal.ads.nu1 r12 = r11.f21522h
            r12.mo19831f(r1)
            return
        L_0x0223:
            com.google.android.gms.internal.ads.zzbfd r12 = m29168e7(r12)
            r0.mo18026a(r12)
            return
        L_0x022b:
            java.util.Map<java.lang.Long, com.google.android.gms.internal.ads.gu1> r0 = r11.f21523i
            int r0 = r0.size()
            com.google.android.gms.internal.ads.iz<java.lang.Integer> r3 = com.google.android.gms.internal.ads.C5503qz.f22583n6
            com.google.android.gms.internal.ads.oz r8 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r3 = r8.mo20153b(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r0 < r3) goto L_0x024c
            com.google.android.gms.internal.ads.ul0.m31862g(r10)
            com.google.android.gms.internal.ads.nu1 r12 = r11.f21522h
            r12.mo19834i(r1)
            return
        L_0x024c:
            java.util.Map<java.lang.Long, com.google.android.gms.internal.ads.gu1> r0 = r11.f21523i
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x0261
            com.google.android.gms.internal.ads.ul0.m31857b(r6)
            com.google.android.gms.internal.ads.nu1 r12 = r11.f21522h
            r12.mo19834i(r1)
            return
        L_0x0261:
            java.lang.Object r12 = r12.get(r7)
            java.lang.String r12 = (java.lang.String) r12
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L_0x0276
            com.google.android.gms.internal.ads.ul0.m31862g(r4)
            com.google.android.gms.internal.ads.nu1 r12 = r11.f21522h
            r12.mo19834i(r1)
            return
        L_0x0276:
            com.google.android.gms.internal.ads.su1 r0 = r11.f21521g
            com.google.android.gms.internal.ads.hu1 r0 = r0.mo18752a()
            r0.mo17022a(r1)
            r0.mo17024p(r12)
            com.google.android.gms.internal.ads.ku1 r0 = r0.mo17023b()
            com.google.android.gms.internal.ads.uu1 r0 = r0.zza()
            java.util.Map<java.lang.Long, com.google.android.gms.internal.ads.gu1> r4 = r11.f21523i
            r4.put(r3, r0)
            com.google.android.gms.internal.ads.nu1 r0 = r11.f21522h
            r0.mo19833h(r1)
            java.lang.String r0 = java.lang.String.valueOf(r12)
            int r0 = r0.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r0 = r0 + 59
            r3.<init>(r0)
            java.lang.String r0 = "Created H5 interstitial #"
            r3.append(r0)
            r3.append(r1)
            r3.append(r5)
            r3.append(r12)
            java.lang.String r12 = r3.toString()
            com.google.android.gms.ads.internal.util.C3018m1.m13388k(r12)
            return
        L_0x02b9:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r0)
        L_0x02be:
            com.google.android.gms.internal.ads.ul0.m31857b(r12)
            return
        L_0x02c2:
            java.lang.String r12 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "H5 gmsg did not contain a valid object id: "
            int r1 = r12.length()
            if (r1 == 0) goto L_0x02d4
            java.lang.String r12 = r0.concat(r12)
            goto L_0x02d9
        L_0x02d4:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r0)
        L_0x02d9:
            com.google.android.gms.internal.ads.ul0.m31857b(r12)
            return
        L_0x02dd:
            java.util.Map<java.lang.Long, com.google.android.gms.internal.ads.gu1> r12 = r11.f21523i
            java.util.Collection r12 = r12.values()
            java.util.Iterator r12 = r12.iterator()
        L_0x02e7:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x02f7
            java.lang.Object r0 = r12.next()
            com.google.android.gms.internal.ads.gu1 r0 = (com.google.android.gms.internal.ads.gu1) r0
            r0.zza()
            goto L_0x02e7
        L_0x02f7:
            java.util.Map<java.lang.Long, com.google.android.gms.internal.ads.gu1> r12 = r11.f21523i
            r12.clear()
            return
        L_0x02fd:
            java.util.Map<java.lang.Long, com.google.android.gms.internal.ads.gu1> r12 = r11.f21523i
            r12.clear()
            com.google.android.gms.internal.ads.nu1 r12 = r11.f21522h
            r12.mo19826a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pu1.mo20318v(java.lang.String):void");
    }

    public final void zze() {
        this.f21523i.clear();
    }
}
