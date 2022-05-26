package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class i33 extends AbstractSet<Map.Entry> {

    /* renamed from: g */
    final /* synthetic */ p33 f17880g;

    i33(p33 p33) {
        this.f17880g = p33;
    }

    public final void clear() {
        this.f17880g.clear();
    }

    public final boolean contains(Object obj) {
        Map zzl = this.f17880g.zzl();
        if (zzl != null) {
            return zzl.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int zzd = this.f17880g.m28876e(entry.getKey());
            if (zzd == -1 || !q13.m29306a(p33.zzj(this.f17880g, zzd), entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Iterator<Map.Entry> iterator() {
        p33 p33 = this.f17880g;
        Map zzl = p33.zzl();
        if (zzl != null) {
            return zzl.entrySet().iterator();
        }
        return new g33(p33);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r0 = r9.f17880g.m28875d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean remove(java.lang.Object r10) {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.p33 r0 = r9.f17880g
            java.util.Map r0 = r0.zzl()
            if (r0 == 0) goto L_0x0011
            java.util.Set r0 = r0.entrySet()
            boolean r10 = r0.remove(r10)
            return r10
        L_0x0011:
            boolean r0 = r10 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L_0x0066
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            com.google.android.gms.internal.ads.p33 r0 = r9.f17880g
            boolean r0 = r0.zzr()
            if (r0 == 0) goto L_0x0021
            return r1
        L_0x0021:
            com.google.android.gms.internal.ads.p33 r0 = r9.f17880g
            int r0 = r0.m28875d()
            java.lang.Object r2 = r10.getKey()
            java.lang.Object r3 = r10.getValue()
            com.google.android.gms.internal.ads.p33 r10 = r9.f17880g
            java.lang.Object r5 = com.google.android.gms.internal.ads.p33.zzi(r10)
            com.google.android.gms.internal.ads.p33 r10 = r9.f17880g
            int[] r6 = r10.m28872a()
            com.google.android.gms.internal.ads.p33 r10 = r9.f17880g
            java.lang.Object[] r7 = r10.m28873b()
            com.google.android.gms.internal.ads.p33 r10 = r9.f17880g
            java.lang.Object[] r8 = r10.m28874c()
            r4 = r0
            int r10 = com.google.android.gms.internal.ads.q33.m29343b(r2, r3, r4, r5, r6, r7, r8)
            r2 = -1
            if (r10 != r2) goto L_0x0050
            return r1
        L_0x0050:
            com.google.android.gms.internal.ads.p33 r1 = r9.f17880g
            r1.zzq(r10, r0)
            com.google.android.gms.internal.ads.p33 r10 = r9.f17880g
            int r0 = r10.f21321i
            int r0 = r0 + r2
            r10.f21321i = r0
            com.google.android.gms.internal.ads.p33 r10 = r9.f17880g
            r10.zzo()
            r10 = 1
            return r10
        L_0x0066:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i33.remove(java.lang.Object):boolean");
    }

    public final int size() {
        return this.f17880g.size();
    }
}
