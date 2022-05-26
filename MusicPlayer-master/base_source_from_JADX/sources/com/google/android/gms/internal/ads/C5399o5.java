package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.C0885l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.o5 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5399o5 {

    /* renamed from: a */
    public final int f20921a;

    /* renamed from: b */
    public final byte[] f20922b;

    /* renamed from: c */
    public final Map<String, String> f20923c;

    /* renamed from: d */
    public final List<C5251k5> f20924d;

    /* renamed from: e */
    public final boolean f20925e;

    private C5399o5(int i, byte[] bArr, Map<String, String> map, List<C5251k5> list, boolean z, long j) {
        this.f20921a = i;
        this.f20922b = bArr;
        this.f20923c = map;
        this.f20924d = list == null ? null : Collections.unmodifiableList(list);
        this.f20925e = z;
    }

    /* renamed from: a */
    private static List<C5251k5> m28291a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(new C5251k5((String) next.getKey(), (String) next.getValue()));
        }
        return arrayList;
    }

    @Deprecated
    public C5399o5(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this(i, bArr, map, m28291a(map), z, j);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5399o5(int r9, byte[] r10, boolean r11, long r12, java.util.List<com.google.android.gms.internal.ads.C5251k5> r14) {
        /*
            r8 = this;
            if (r14 != 0) goto L_0x0005
            r0 = 0
        L_0x0003:
            r3 = r0
            goto L_0x0033
        L_0x0005:
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x0010
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L_0x0003
        L_0x0010:
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            r0.<init>(r1)
            java.util.Iterator r1 = r14.iterator()
        L_0x001b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0003
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.ads.k5 r2 = (com.google.android.gms.internal.ads.C5251k5) r2
            java.lang.String r3 = r2.mo18836a()
            java.lang.String r2 = r2.mo18837b()
            r0.put(r3, r2)
            goto L_0x001b
        L_0x0033:
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r14
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5399o5.<init>(int, byte[], boolean, long, java.util.List):void");
    }

    @Deprecated
    public C5399o5(byte[] bArr, Map<String, String> map) {
        this(C0885l.C0891f.DEFAULT_DRAG_ANIMATION_DURATION, bArr, map, m28291a(map), false, 0);
    }
}
