package androidx.work.impl.utils;

import android.content.Context;
import androidx.work.C1239g;
import androidx.work.C1240h;
import androidx.work.C1405l;
import androidx.work.C1421u;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C1269a;
import androidx.work.impl.foreground.C1270b;
import androidx.work.impl.p012n.C1342q;
import androidx.work.impl.utils.p013o.C1396c;
import androidx.work.impl.utils.p014p.C1397a;
import java.util.UUID;
import p159f.p243f.p327d.p330c.p331a.C7738a;

/* renamed from: androidx.work.impl.utils.l */
/* compiled from: WorkForegroundUpdater */
public class C1376l implements C1240h {

    /* renamed from: a */
    private final C1397a f5397a;

    /* renamed from: b */
    final C1269a f5398b;

    /* renamed from: c */
    final C1342q f5399c;

    /* renamed from: androidx.work.impl.utils.l$a */
    /* compiled from: WorkForegroundUpdater */
    class C1377a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ C1396c f5400g;

        /* renamed from: h */
        final /* synthetic */ UUID f5401h;

        /* renamed from: i */
        final /* synthetic */ C1239g f5402i;

        /* renamed from: j */
        final /* synthetic */ Context f5403j;

        C1377a(C1396c cVar, UUID uuid, C1239g gVar, Context context) {
            this.f5400g = cVar;
            this.f5401h = uuid;
            this.f5402i = gVar;
            this.f5403j = context;
        }

        public void run() {
            try {
                if (!this.f5400g.isCancelled()) {
                    String uuid = this.f5401h.toString();
                    C1421u m = C1376l.this.f5399c.mo6727m(uuid);
                    if (m == null || m.isFinished()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    C1376l.this.f5398b.mo6566a(uuid, this.f5402i);
                    this.f5403j.startService(C1270b.m7055a(this.f5403j, uuid, this.f5402i));
                }
                this.f5400g.mo6788q(null);
            } catch (Throwable th) {
                this.f5400g.mo6789r(th);
            }
        }
    }

    static {
        C1405l.m7462f("WMFgUpdater");
    }

    public C1376l(WorkDatabase workDatabase, C1269a aVar, C1397a aVar2) {
        this.f5398b = aVar;
        this.f5397a = aVar2;
        this.f5399c = workDatabase.mo6527N();
    }

    /* renamed from: a */
    public C7738a<Void> mo6520a(Context context, UUID uuid, C1239g gVar) {
        C1396c u = C1396c.m7435u();
        this.f5397a.mo6804b(new C1377a(u, uuid, gVar, context));
        return u;
    }
}
