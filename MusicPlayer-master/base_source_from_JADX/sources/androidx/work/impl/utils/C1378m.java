package androidx.work.impl.utils;

import android.content.Context;
import androidx.work.C1236e;
import androidx.work.C1405l;
import androidx.work.C1417q;
import androidx.work.C1421u;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p012n.C1334m;
import androidx.work.impl.p012n.C1340p;
import androidx.work.impl.utils.p013o.C1396c;
import androidx.work.impl.utils.p014p.C1397a;
import java.util.UUID;
import p159f.p243f.p327d.p330c.p331a.C7738a;

/* renamed from: androidx.work.impl.utils.m */
/* compiled from: WorkProgressUpdater */
public class C1378m implements C1417q {

    /* renamed from: c */
    static final String f5405c = C1405l.m7462f("WorkProgressUpdater");

    /* renamed from: a */
    final WorkDatabase f5406a;

    /* renamed from: b */
    final C1397a f5407b;

    /* renamed from: androidx.work.impl.utils.m$a */
    /* compiled from: WorkProgressUpdater */
    class C1379a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ UUID f5408g;

        /* renamed from: h */
        final /* synthetic */ C1236e f5409h;

        /* renamed from: i */
        final /* synthetic */ C1396c f5410i;

        C1379a(UUID uuid, C1236e eVar, C1396c cVar) {
            this.f5408g = uuid;
            this.f5409h = eVar;
            this.f5410i = cVar;
        }

        public void run() {
            String uuid = this.f5408g.toString();
            C1405l c = C1405l.m7460c();
            String str = C1378m.f5405c;
            c.mo6816a(str, String.format("Updating progress for %s (%s)", new Object[]{this.f5408g, this.f5409h}), new Throwable[0]);
            C1378m.this.f5406a.mo5576c();
            try {
                C1340p n = C1378m.this.f5406a.mo6527N().mo6728n(uuid);
                if (n != null) {
                    if (n.f5314b == C1421u.RUNNING) {
                        C1378m.this.f5406a.mo6526M().mo6704c(new C1334m(uuid, this.f5409h));
                    } else {
                        C1405l.m7460c().mo6820h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", new Object[]{uuid}), new Throwable[0]);
                    }
                    this.f5410i.mo6788q(null);
                    C1378m.this.f5406a.mo5573C();
                    C1378m.this.f5406a.mo5580g();
                    return;
                }
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            } catch (Throwable th) {
                C1378m.this.f5406a.mo5580g();
                throw th;
            }
        }
    }

    public C1378m(WorkDatabase workDatabase, C1397a aVar) {
        this.f5406a = workDatabase;
        this.f5407b = aVar;
    }

    /* renamed from: a */
    public C7738a<Void> mo6772a(Context context, UUID uuid, C1236e eVar) {
        C1396c u = C1396c.m7435u();
        this.f5407b.mo6804b(new C1379a(uuid, eVar, u));
        return u;
    }
}
