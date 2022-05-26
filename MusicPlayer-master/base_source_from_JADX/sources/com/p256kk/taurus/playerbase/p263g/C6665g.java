package com.p256kk.taurus.playerbase.p263g;

import com.p256kk.taurus.playerbase.p263g.C6668j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.kk.taurus.playerbase.g.g */
/* compiled from: GroupValue */
public final class C6665g {

    /* renamed from: a */
    private Map<String, Object> f30066a = new ConcurrentHashMap();

    /* renamed from: b */
    private Map<C6668j.C6669a, String[]> f30067b = new ConcurrentHashMap();

    /* renamed from: c */
    private List<C6668j.C6669a> f30068c = new CopyOnWriteArrayList();

    /* renamed from: a */
    private void m38314a(String str, Object obj) {
        ArrayList<C6668j.C6669a> arrayList = new ArrayList<>();
        for (C6668j.C6669a next : this.f30068c) {
            if (m38316c(this.f30067b.get(next), str)) {
                arrayList.add(next);
            }
        }
        for (C6668j.C6669a a : arrayList) {
            a.mo10289a(str, obj);
        }
    }

    /* renamed from: b */
    private void m38315b(C6668j.C6669a aVar) {
        for (String next : this.f30066a.keySet()) {
            if (m38316c(this.f30067b.get(aVar), next)) {
                aVar.mo10289a(next, this.f30066a.get(next));
            }
        }
    }

    /* renamed from: c */
    private boolean m38316c(String[] strArr, String str) {
        if (strArr == null || strArr.length <= 0 || Arrays.binarySearch(strArr, str) < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private void m38317f(String str, Object obj) {
        m38318g(str, obj, true);
    }

    /* renamed from: g */
    private void m38318g(String str, Object obj, boolean z) {
        this.f30066a.put(str, obj);
        if (z) {
            m38314a(str, obj);
        }
    }

    /* renamed from: d */
    public <T> T mo25999d(String str) {
        T t = this.f30066a.get(str);
        if (t != null) {
            return t;
        }
        return null;
    }

    /* renamed from: e */
    public boolean mo26000e(String str, boolean z) {
        Boolean bool = (Boolean) mo25999d(str);
        if (bool == null) {
            return z;
        }
        return bool.booleanValue();
    }

    /* renamed from: h */
    public void mo26001h(String str, boolean z) {
        m38317f(str, Boolean.valueOf(z));
    }

    /* renamed from: i */
    public void mo26002i(String str, Object obj) {
        m38317f(str, obj);
    }

    /* renamed from: j */
    public void mo26003j(C6668j.C6669a aVar) {
        if (!this.f30068c.contains(aVar)) {
            this.f30068c.add(aVar);
            String[] b = aVar.mo10290b();
            Arrays.sort(b);
            this.f30067b.put(aVar, b);
            m38315b(aVar);
        }
    }

    /* renamed from: k */
    public void mo26004k(C6668j.C6669a aVar) {
        this.f30067b.remove(aVar);
        this.f30068c.remove(aVar);
    }
}
