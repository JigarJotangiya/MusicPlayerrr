package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.work.impl.utils.p014p.C1397a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {

    /* renamed from: a */
    private UUID f4986a;

    /* renamed from: b */
    private C1236e f4987b;

    /* renamed from: c */
    private Set<String> f4988c;

    /* renamed from: d */
    private C1226a f4989d;

    /* renamed from: e */
    private int f4990e;

    /* renamed from: f */
    private Executor f4991f;

    /* renamed from: g */
    private C1397a f4992g;

    /* renamed from: h */
    private C1425x f4993h;

    /* renamed from: i */
    private C1417q f4994i;

    /* renamed from: j */
    private C1240h f4995j;

    /* renamed from: androidx.work.WorkerParameters$a */
    public static class C1226a {

        /* renamed from: a */
        public List<String> f4996a = Collections.emptyList();

        /* renamed from: b */
        public List<Uri> f4997b = Collections.emptyList();

        /* renamed from: c */
        public Network f4998c;
    }

    public WorkerParameters(UUID uuid, C1236e eVar, Collection<String> collection, C1226a aVar, int i, Executor executor, C1397a aVar2, C1425x xVar, C1417q qVar, C1240h hVar) {
        this.f4986a = uuid;
        this.f4987b = eVar;
        this.f4988c = new HashSet(collection);
        this.f4989d = aVar;
        this.f4990e = i;
        this.f4991f = executor;
        this.f4992g = aVar2;
        this.f4993h = xVar;
        this.f4994i = qVar;
        this.f4995j = hVar;
    }

    /* renamed from: a */
    public Executor mo6447a() {
        return this.f4991f;
    }

    /* renamed from: b */
    public C1240h mo6448b() {
        return this.f4995j;
    }

    /* renamed from: c */
    public UUID mo6449c() {
        return this.f4986a;
    }

    /* renamed from: d */
    public C1236e mo6450d() {
        return this.f4987b;
    }

    /* renamed from: e */
    public Network mo6451e() {
        return this.f4989d.f4998c;
    }

    /* renamed from: f */
    public C1417q mo6452f() {
        return this.f4994i;
    }

    /* renamed from: g */
    public int mo6453g() {
        return this.f4990e;
    }

    /* renamed from: h */
    public Set<String> mo6454h() {
        return this.f4988c;
    }

    /* renamed from: i */
    public C1397a mo6455i() {
        return this.f4992g;
    }

    /* renamed from: j */
    public List<String> mo6456j() {
        return this.f4989d.f4996a;
    }

    /* renamed from: k */
    public List<Uri> mo6457k() {
        return this.f4989d.f4997b;
    }

    /* renamed from: l */
    public C1425x mo6458l() {
        return this.f4993h;
    }
}
