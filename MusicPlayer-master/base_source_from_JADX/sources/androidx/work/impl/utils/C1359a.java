package androidx.work.impl.utils;

import androidx.work.C1410o;
import androidx.work.C1421u;
import androidx.work.impl.C1261c;
import androidx.work.impl.C1264e;
import androidx.work.impl.C1265f;
import androidx.work.impl.C1285j;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p012n.C1318b;
import androidx.work.impl.p012n.C1342q;
import java.util.LinkedList;
import java.util.UUID;

/* renamed from: androidx.work.impl.utils.a */
/* compiled from: CancelWorkRunnable */
public abstract class C1359a implements Runnable {

    /* renamed from: g */
    private final C1261c f5356g = new C1261c();

    /* renamed from: androidx.work.impl.utils.a$a */
    /* compiled from: CancelWorkRunnable */
    class C1360a extends C1359a {

        /* renamed from: h */
        final /* synthetic */ C1285j f5357h;

        /* renamed from: i */
        final /* synthetic */ UUID f5358i;

        C1360a(C1285j jVar, UUID uuid) {
            this.f5357h = jVar;
            this.f5358i = uuid;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo6751h() {
            WorkDatabase o = this.f5357h.mo6611o();
            o.mo5576c();
            try {
                mo6748a(this.f5357h, this.f5358i.toString());
                o.mo5573C();
                o.mo5580g();
                mo6750g(this.f5357h);
            } catch (Throwable th) {
                o.mo5580g();
                throw th;
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.a$b */
    /* compiled from: CancelWorkRunnable */
    class C1361b extends C1359a {

        /* renamed from: h */
        final /* synthetic */ C1285j f5359h;

        /* renamed from: i */
        final /* synthetic */ String f5360i;

        C1361b(C1285j jVar, String str) {
            this.f5359h = jVar;
            this.f5360i = str;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo6751h() {
            WorkDatabase o = this.f5359h.mo6611o();
            o.mo5576c();
            try {
                for (String a : o.mo6527N().mo6730p(this.f5360i)) {
                    mo6748a(this.f5359h, a);
                }
                o.mo5573C();
                o.mo5580g();
                mo6750g(this.f5359h);
            } catch (Throwable th) {
                o.mo5580g();
                throw th;
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.a$c */
    /* compiled from: CancelWorkRunnable */
    class C1362c extends C1359a {

        /* renamed from: h */
        final /* synthetic */ C1285j f5361h;

        /* renamed from: i */
        final /* synthetic */ String f5362i;

        /* renamed from: j */
        final /* synthetic */ boolean f5363j;

        C1362c(C1285j jVar, String str, boolean z) {
            this.f5361h = jVar;
            this.f5362i = str;
            this.f5363j = z;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo6751h() {
            WorkDatabase o = this.f5361h.mo6611o();
            o.mo5576c();
            try {
                for (String a : o.mo6527N().mo6726l(this.f5362i)) {
                    mo6748a(this.f5361h, a);
                }
                o.mo5573C();
                o.mo5580g();
                if (this.f5363j) {
                    mo6750g(this.f5361h);
                }
            } catch (Throwable th) {
                o.mo5580g();
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static C1359a m7358b(UUID uuid, C1285j jVar) {
        return new C1360a(jVar, uuid);
    }

    /* renamed from: c */
    public static C1359a m7359c(String str, C1285j jVar, boolean z) {
        return new C1362c(jVar, str, z);
    }

    /* renamed from: d */
    public static C1359a m7360d(String str, C1285j jVar) {
        return new C1361b(jVar, str);
    }

    /* renamed from: f */
    private void m7361f(WorkDatabase workDatabase, String str) {
        C1342q N = workDatabase.mo6527N();
        C1318b F = workDatabase.mo6522F();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            C1421u m = N.mo6727m(str2);
            if (!(m == C1421u.SUCCEEDED || m == C1421u.FAILED)) {
                N.mo6716b(C1421u.CANCELLED, str2);
            }
            linkedList.addAll(F.mo6683b(str2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6748a(C1285j jVar, String str) {
        m7361f(jVar.mo6611o(), str);
        jVar.mo6609m().mo6575l(str);
        for (C1264e e : jVar.mo6610n()) {
            e.mo6558e(str);
        }
    }

    /* renamed from: e */
    public C1410o mo6749e() {
        return this.f5356g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo6750g(C1285j jVar) {
        C1265f.m7047b(jVar.mo6607i(), jVar.mo6611o(), jVar.mo6610n());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract void mo6751h();

    public void run() {
        try {
            mo6751h();
            this.f5356g.mo6565a(C1410o.f5468a);
        } catch (Throwable th) {
            this.f5356g.mo6565a(new C1410o.C1412b.C1413a(th));
        }
    }
}
