package p402l.p406b.p407a.p409f.p410c;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p402l.p406b.p407a.p409f.p412e.C9012a;
import p402l.p406b.p407a.p409f.p412e.C9014c;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.a.f.c.e */
/* compiled from: ChunkContainer */
public class C8971e extends C8970d {

    /* renamed from: e */
    private static final Set<C8978l> f35378e;

    /* renamed from: d */
    private final Map<C8978l, List<C8970d>> f35379d = new Hashtable();

    static {
        HashSet hashSet = new HashSet();
        f35378e = hashSet;
        hashSet.add(C8978l.f35406r);
    }

    public C8971e(C8978l lVar, long j, BigInteger bigInteger) {
        super(lVar, j, bigInteger);
    }

    /* renamed from: e */
    public String mo31303e(String str) {
        return mo31336l(str, BuildConfig.FLAVOR);
    }

    /* renamed from: g */
    public void mo31331g(C8970d dVar) {
        List<C8970d> h = mo31332h(dVar.mo31326b());
        if (h.isEmpty() || f35378e.contains(dVar.mo31326b())) {
            h.add(dVar);
            return;
        }
        throw new IllegalArgumentException("The GUID of the given chunk indicates, that there is no more instance allowed.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public List<C8970d> mo31332h(C8978l lVar) {
        List<C8970d> list = this.f35379d.get(lVar);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.f35379d.put(lVar, arrayList);
        return arrayList;
    }

    /* renamed from: i */
    public Collection<C8970d> mo31333i() {
        ArrayList arrayList = new ArrayList();
        for (List<C8970d> addAll : this.f35379d.values()) {
            arrayList.addAll(addAll);
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C8970d mo31334j(C8978l lVar, Class<? extends C8970d> cls) {
        List list = this.f35379d.get(lVar);
        if (list != null && !list.isEmpty()) {
            C8970d dVar = (C8970d) list.get(0);
            if (cls.isAssignableFrom(dVar.getClass())) {
                return dVar;
            }
        }
        return null;
    }

    /* renamed from: k */
    public boolean mo31335k(C8978l lVar) {
        return this.f35379d.containsKey(lVar);
    }

    /* renamed from: l */
    public String mo31336l(String str, String str2) {
        StringBuilder sb = new StringBuilder(super.mo31303e(str));
        sb.append(str2);
        sb.append(str);
        sb.append("  |");
        sb.append(C9014c.f35470a);
        ArrayList arrayList = new ArrayList(mo31333i());
        Collections.sort(arrayList, new C9012a());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append(((C8970d) it.next()).mo31303e(str + "  |"));
            sb.append(str);
            sb.append("  |");
            sb.append(C9014c.f35470a);
        }
        return sb.toString();
    }
}
