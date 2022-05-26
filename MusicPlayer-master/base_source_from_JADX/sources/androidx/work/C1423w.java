package androidx.work;

import android.os.Build;
import androidx.work.impl.p012n.C1340p;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* renamed from: androidx.work.w */
/* compiled from: WorkRequest */
public abstract class C1423w {

    /* renamed from: a */
    private UUID f5473a;

    /* renamed from: b */
    private C1340p f5474b;

    /* renamed from: c */
    private Set<String> f5475c;

    /* renamed from: androidx.work.w$a */
    /* compiled from: WorkRequest */
    public static abstract class C1424a<B extends C1424a<?, ?>, W extends C1423w> {

        /* renamed from: a */
        boolean f5476a = false;

        /* renamed from: b */
        UUID f5477b = UUID.randomUUID();

        /* renamed from: c */
        C1340p f5478c;

        /* renamed from: d */
        Set<String> f5479d = new HashSet();

        C1424a(Class<? extends ListenableWorker> cls) {
            this.f5478c = new C1340p(this.f5477b.toString(), cls.getName());
            mo6834a(cls.getName());
        }

        /* renamed from: a */
        public final B mo6834a(String str) {
            this.f5479d.add(str);
            mo6822d();
            return this;
        }

        /* renamed from: b */
        public final W mo6835b() {
            W c = mo6821c();
            C1232c cVar = this.f5478c.f5322j;
            int i = Build.VERSION.SDK_INT;
            boolean z = (i >= 24 && cVar.mo6477e()) || cVar.mo6479f() || cVar.mo6480g() || (i >= 23 && cVar.mo6481h());
            if (!this.f5478c.f5329q || !z) {
                this.f5477b = UUID.randomUUID();
                C1340p pVar = new C1340p(this.f5478c);
                this.f5478c = pVar;
                pVar.f5313a = this.f5477b.toString();
                return c;
            }
            throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract W mo6821c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract B mo6822d();

        /* renamed from: e */
        public final B mo6836e(C1232c cVar) {
            this.f5478c.f5322j = cVar;
            mo6822d();
            return this;
        }

        /* renamed from: f */
        public final B mo6837f(C1236e eVar) {
            this.f5478c.f5317e = eVar;
            mo6822d();
            return this;
        }
    }

    protected C1423w(UUID uuid, C1340p pVar, Set<String> set) {
        this.f5473a = uuid;
        this.f5474b = pVar;
        this.f5475c = set;
    }

    /* renamed from: a */
    public String mo6831a() {
        return this.f5473a.toString();
    }

    /* renamed from: b */
    public Set<String> mo6832b() {
        return this.f5475c;
    }

    /* renamed from: c */
    public C1340p mo6833c() {
        return this.f5474b;
    }
}
