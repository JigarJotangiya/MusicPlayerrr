package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class va4 extends xa4 {

    /* renamed from: b */
    private long f24668b = -9223372036854775807L;

    /* renamed from: c */
    private long[] f24669c = new long[0];

    /* renamed from: d */
    private long[] f24670d = new long[0];

    public va4() {
        super(new x84());
    }

    /* renamed from: g */
    private static Double m32258g(no2 no2) {
        return Double.valueOf(Double.longBitsToDouble(no2.mo19799z()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v4, types: [int] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object m32259h(com.google.android.gms.internal.ads.no2 r4, int r5) {
        /*
            if (r5 == 0) goto L_0x007a
            r0 = 0
            r1 = 1
            if (r5 == r1) goto L_0x006e
            r1 = 2
            if (r5 == r1) goto L_0x0069
            r2 = 3
            if (r5 == r2) goto L_0x004d
            r2 = 8
            if (r5 == r2) goto L_0x0048
            r2 = 10
            if (r5 == r2) goto L_0x002c
            r0 = 11
            if (r5 == r0) goto L_0x001a
            r4 = 0
            return r4
        L_0x001a:
            java.util.Date r5 = new java.util.Date
            java.lang.Double r0 = m32258g(r4)
            double r2 = r0.doubleValue()
            long r2 = (long) r2
            r5.<init>(r2)
            r4.mo19780g(r1)
            return r5
        L_0x002c:
            int r5 = r4.mo19795v()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r5)
        L_0x0035:
            if (r0 >= r5) goto L_0x0047
            int r2 = r4.mo19792s()
            java.lang.Object r2 = m32259h(r4, r2)
            if (r2 == 0) goto L_0x0044
            r1.add(r2)
        L_0x0044:
            int r0 = r0 + 1
            goto L_0x0035
        L_0x0047:
            return r1
        L_0x0048:
            java.util.HashMap r4 = m32261j(r4)
            return r4
        L_0x004d:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
        L_0x0052:
            java.lang.String r0 = m32260i(r4)
            int r1 = r4.mo19792s()
            r2 = 9
            if (r1 != r2) goto L_0x005f
            return r5
        L_0x005f:
            java.lang.Object r1 = m32259h(r4, r1)
            if (r1 == 0) goto L_0x0052
            r5.put(r0, r1)
            goto L_0x0052
        L_0x0069:
            java.lang.String r4 = m32260i(r4)
            return r4
        L_0x006e:
            int r4 = r4.mo19792s()
            if (r4 != r1) goto L_0x0075
            r0 = 1
        L_0x0075:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x007a:
            java.lang.Double r4 = m32258g(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.va4.m32259h(com.google.android.gms.internal.ads.no2, int):java.lang.Object");
    }

    /* renamed from: i */
    private static String m32260i(no2 no2) {
        int w = no2.mo19796w();
        int k = no2.mo19784k();
        no2.mo19780g(w);
        return new String(no2.mo19781h(), k, w);
    }

    /* renamed from: j */
    private static HashMap<String, Object> m32261j(no2 no2) {
        int v = no2.mo19795v();
        HashMap<String, Object> hashMap = new HashMap<>(v);
        for (int i = 0; i < v; i++) {
            String i2 = m32260i(no2);
            Object h = m32259h(no2, no2.mo19792s());
            if (h != null) {
                hashMap.put(i2, h);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20817a(no2 no2) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo20818b(no2 no2, long j) {
        if (no2.mo19792s() != 2 || !"onMetaData".equals(m32260i(no2)) || no2.mo19792s() != 8) {
            return false;
        }
        HashMap<String, Object> j2 = m32261j(no2);
        Object obj = j2.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f24668b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = j2.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f24669c = new long[size];
                this.f24670d = new long[size];
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f24669c = new long[0];
                        this.f24670d = new long[0];
                    } else {
                        this.f24669c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f24670d[i] = ((Double) obj5).longValue();
                        i++;
                    }
                }
                this.f24669c = new long[0];
                this.f24670d = new long[0];
            }
        }
        return false;
    }

    /* renamed from: d */
    public final long mo21458d() {
        return this.f24668b;
    }

    /* renamed from: e */
    public final long[] mo21459e() {
        return this.f24670d;
    }

    /* renamed from: f */
    public final long[] mo21460f() {
        return this.f24669c;
    }
}
