package com.google.android.gms.ads.p068a0.p069a;

import android.util.Pair;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.internal.ads.C5054ev;
import com.google.android.gms.internal.ads.C5503qz;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.a0.a.l */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C2873l {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f9744a = ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22372L4)).intValue();

    /* renamed from: b */
    private final long f9745b = ((Long) C5054ev.m23225c().mo20153b(C5503qz.f22379M4)).longValue();

    /* renamed from: c */
    private final Map<String, Pair<Long, String>> f9746c = Collections.synchronizedMap(new C2854b(this));

    /* renamed from: e */
    private final void m12904e() {
        long a = C2971s.m13198a().mo11988a();
        try {
            Iterator<Map.Entry<String, Pair<Long, String>>> it = this.f9746c.entrySet().iterator();
            while (it.hasNext() && a - ((Long) ((Pair) it.next().getValue()).first).longValue() > this.f9745b) {
                it.remove();
            }
        } catch (ConcurrentModificationException e) {
            C2971s.m13213p().mo17571s(e, "QueryJsonMap.removeExpiredEntries");
        }
    }

    /* renamed from: b */
    public final synchronized String mo10701b(String str) {
        Pair pair = this.f9746c.get(str);
        if (pair == null) {
            return null;
        }
        String str2 = (String) pair.second;
        this.f9746c.remove(str);
        return str2;
    }

    /* renamed from: c */
    public final synchronized void mo10702c(String str, String str2) {
        this.f9746c.put(str, new Pair(Long.valueOf(C2971s.m13198a().mo11988a()), str2));
        m12904e();
    }

    /* renamed from: d */
    public final synchronized void mo10703d(String str) {
        this.f9746c.remove(str);
    }
}
