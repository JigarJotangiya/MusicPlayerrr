package com.p256kk.taurus.playerbase.p263g;

import com.p256kk.taurus.playerbase.p263g.C6668j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.kk.taurus.playerbase.g.m */
/* compiled from: ReceiverGroup */
public final class C6675m implements C6668j {

    /* renamed from: a */
    private Map<String, C6667i> f30069a;

    /* renamed from: b */
    private List<C6667i> f30070b;

    /* renamed from: c */
    private List<C6668j.C6672d> f30071c;

    /* renamed from: d */
    private C6665g f30072d;

    public C6675m() {
        this((C6665g) null);
    }

    /* renamed from: j */
    private void m38355j(String str, C6667i iVar) {
        if (iVar != null) {
            mo26016i(str, iVar);
            iVar.mo10283p();
        }
    }

    /* renamed from: a */
    public C6665g mo26005a() {
        return this.f30072d;
    }

    /* renamed from: b */
    public void mo26006b(C6668j.C6672d dVar) {
        this.f30071c.remove(dVar);
    }

    /* renamed from: c */
    public void mo26007c(C6668j.C6671c cVar, C6668j.C6670b bVar) {
        for (C6667i next : this.f30070b) {
            if (cVar == null || cVar.mo25934a(next)) {
                bVar.mo25933a(next);
            }
        }
    }

    /* renamed from: d */
    public void mo26008d(C6668j.C6672d dVar) {
        if (!this.f30071c.contains(dVar)) {
            this.f30071c.add(dVar);
        }
    }

    /* renamed from: e */
    public <T extends C6667i> T mo26009e(String str) {
        Map<String, C6667i> map = this.f30069a;
        if (map != null) {
            return (C6667i) map.get(str);
        }
        return null;
    }

    /* renamed from: f */
    public void mo26010f(C6668j.C6670b bVar) {
        mo26007c((C6668j.C6671c) null, bVar);
    }

    /* renamed from: g */
    public void mo26014g(String str, C6667i iVar) {
        ((C6662d) iVar).mo25988B(str);
        iVar.mo25992s(this);
        iVar.mo10284t();
        this.f30069a.put(str, iVar);
        this.f30070b.add(iVar);
        mo26015h(str, iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo26015h(String str, C6667i iVar) {
        for (C6668j.C6672d b : this.f30071c) {
            b.mo26013b(str, iVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo26016i(String str, C6667i iVar) {
        for (C6668j.C6672d a : this.f30071c) {
            a.mo26012a(str, iVar);
        }
    }

    /* renamed from: k */
    public void mo26017k(String str) {
        C6667i remove = this.f30069a.remove(str);
        this.f30070b.remove(remove);
        m38355j(str, remove);
    }

    public void sort(Comparator<C6667i> comparator) {
        Collections.sort(this.f30070b, comparator);
    }

    public C6675m(C6665g gVar) {
        this.f30069a = new ConcurrentHashMap(16);
        this.f30070b = Collections.synchronizedList(new ArrayList());
        this.f30071c = new CopyOnWriteArrayList();
        if (gVar == null) {
            this.f30072d = new C6665g();
        } else {
            this.f30072d = gVar;
        }
    }
}
