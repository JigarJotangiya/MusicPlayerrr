package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.C3359d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class mu2 {

    /* renamed from: a */
    private final C3359d f20179a;

    /* renamed from: b */
    private final Map<String, List<String>> f20180b = new HashMap();

    /* renamed from: c */
    private final Map<String, Long> f20181c = new HashMap();

    public mu2(C3359d dVar) {
        this.f20179a = dVar;
    }

    /* renamed from: d */
    private final void m27476d(String str, String str2) {
        if (!this.f20180b.containsKey(str)) {
            this.f20180b.put(str, new ArrayList());
        }
        this.f20180b.get(str).add(str2);
    }

    /* renamed from: a */
    public final List<lu2> mo19547a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.f20180b.entrySet()) {
            int i = 0;
            if (((List) next.getValue()).size() > 1) {
                for (String lu2 : (List) next.getValue()) {
                    String str = (String) next.getKey();
                    i++;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                    sb.append(str);
                    sb.append(".");
                    sb.append(i);
                    arrayList.add(new lu2(sb.toString(), lu2));
                }
            } else {
                arrayList.add(new lu2((String) next.getKey(), (String) ((List) next.getValue()).get(0)));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo19548b(String str) {
        if (this.f20181c.containsKey(str)) {
            long b = this.f20179a.mo11989b();
            long longValue = this.f20181c.remove(str).longValue();
            StringBuilder sb = new StringBuilder(20);
            sb.append(b - longValue);
            m27476d(str, sb.toString());
            return;
        }
        this.f20181c.put(str, Long.valueOf(this.f20179a.mo11989b()));
    }

    /* renamed from: c */
    public final void mo19549c(String str, String str2) {
        if (this.f20181c.containsKey(str)) {
            long b = this.f20179a.mo11989b();
            long longValue = this.f20181c.remove(str).longValue();
            StringBuilder sb = new StringBuilder(str2.length() + 20);
            sb.append(str2);
            sb.append(b - longValue);
            m27476d(str, sb.toString());
            return;
        }
        this.f20181c.put(str, Long.valueOf(this.f20179a.mo11989b()));
    }
}
