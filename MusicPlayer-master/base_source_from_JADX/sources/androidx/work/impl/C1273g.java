package androidx.work.impl;

import android.text.TextUtils;
import androidx.work.C1238f;
import androidx.work.C1405l;
import androidx.work.C1410o;
import androidx.work.C1420t;
import androidx.work.C1423w;
import androidx.work.impl.utils.C1363b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.work.impl.g */
/* compiled from: WorkContinuationImpl */
public class C1273g extends C1420t {

    /* renamed from: j */
    private static final String f5168j = C1405l.m7462f("WorkContinuationImpl");

    /* renamed from: a */
    private final C1285j f5169a;

    /* renamed from: b */
    private final String f5170b;

    /* renamed from: c */
    private final C1238f f5171c;

    /* renamed from: d */
    private final List<? extends C1423w> f5172d;

    /* renamed from: e */
    private final List<String> f5173e;

    /* renamed from: f */
    private final List<String> f5174f;

    /* renamed from: g */
    private final List<C1273g> f5175g;

    /* renamed from: h */
    private boolean f5176h;

    /* renamed from: i */
    private C1410o f5177i;

    public C1273g(C1285j jVar, List<? extends C1423w> list) {
        this(jVar, (String) null, C1238f.KEEP, list, (List<C1273g>) null);
    }

    /* renamed from: i */
    private static boolean m7071i(C1273g gVar, Set<String> set) {
        set.addAll(gVar.mo6594c());
        Set<String> l = m7072l(gVar);
        for (String contains : set) {
            if (l.contains(contains)) {
                return true;
            }
        }
        List<C1273g> e = gVar.mo6596e();
        if (e != null && !e.isEmpty()) {
            for (C1273g i : e) {
                if (m7071i(i, set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.mo6594c());
        return false;
    }

    /* renamed from: l */
    public static Set<String> m7072l(C1273g gVar) {
        HashSet hashSet = new HashSet();
        List<C1273g> e = gVar.mo6596e();
        if (e != null && !e.isEmpty()) {
            for (C1273g c : e) {
                hashSet.addAll(c.mo6594c());
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public C1410o mo6592a() {
        if (!this.f5176h) {
            C1363b bVar = new C1363b(this);
            this.f5169a.mo6612p().mo6804b(bVar);
            this.f5177i = bVar.mo6754d();
        } else {
            C1405l.m7460c().mo6820h(f5168j, String.format("Already enqueued work ids (%s)", new Object[]{TextUtils.join(", ", this.f5173e)}), new Throwable[0]);
        }
        return this.f5177i;
    }

    /* renamed from: b */
    public C1238f mo6593b() {
        return this.f5171c;
    }

    /* renamed from: c */
    public List<String> mo6594c() {
        return this.f5173e;
    }

    /* renamed from: d */
    public String mo6595d() {
        return this.f5170b;
    }

    /* renamed from: e */
    public List<C1273g> mo6596e() {
        return this.f5175g;
    }

    /* renamed from: f */
    public List<? extends C1423w> mo6597f() {
        return this.f5172d;
    }

    /* renamed from: g */
    public C1285j mo6598g() {
        return this.f5169a;
    }

    /* renamed from: h */
    public boolean mo6599h() {
        return m7071i(this, new HashSet());
    }

    /* renamed from: j */
    public boolean mo6600j() {
        return this.f5176h;
    }

    /* renamed from: k */
    public void mo6601k() {
        this.f5176h = true;
    }

    public C1273g(C1285j jVar, String str, C1238f fVar, List<? extends C1423w> list, List<C1273g> list2) {
        this.f5169a = jVar;
        this.f5170b = str;
        this.f5171c = fVar;
        this.f5172d = list;
        this.f5175g = list2;
        this.f5173e = new ArrayList(list.size());
        this.f5174f = new ArrayList();
        if (list2 != null) {
            for (C1273g gVar : list2) {
                this.f5174f.addAll(gVar.f5174f);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String a = ((C1423w) list.get(i)).mo6831a();
            this.f5173e.add(a);
            this.f5174f.add(a);
        }
    }
}
