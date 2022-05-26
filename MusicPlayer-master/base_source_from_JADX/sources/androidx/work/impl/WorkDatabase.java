package androidx.work.impl;

import android.content.Context;
import androidx.room.C0992r0;
import androidx.room.C0994s0;
import androidx.work.impl.C1274h;
import androidx.work.impl.p012n.C1318b;
import androidx.work.impl.p012n.C1322e;
import androidx.work.impl.p012n.C1326h;
import androidx.work.impl.p012n.C1331k;
import androidx.work.impl.p012n.C1335n;
import androidx.work.impl.p012n.C1342q;
import androidx.work.impl.p012n.C1354t;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p082e.p149u.p150a.C4214b;
import p082e.p149u.p150a.C4215c;
import p082e.p149u.p150a.p151g.C4229c;

public abstract class WorkDatabase extends C0994s0 {

    /* renamed from: n */
    private static final long f5052n = TimeUnit.DAYS.toMillis(1);

    /* renamed from: androidx.work.impl.WorkDatabase$a */
    class C1242a implements C4215c.C4219c {

        /* renamed from: a */
        final /* synthetic */ Context f5053a;

        C1242a(Context context) {
            this.f5053a = context;
        }

        /* renamed from: a */
        public C4215c mo5440a(C4215c.C4217b bVar) {
            C4215c.C4217b.C4218a a = C4215c.C4217b.m18575a(this.f5053a);
            a.mo14408c(bVar.f12597b);
            a.mo14407b(bVar.f12598c);
            a.mo14409d(true);
            return new C4229c().mo5440a(a.mo14406a());
        }
    }

    /* renamed from: androidx.work.impl.WorkDatabase$b */
    class C1243b extends C0994s0.C0996b {
        C1243b() {
        }

        /* renamed from: c */
        public void mo5604c(C4214b bVar) {
            super.mo5604c(bVar);
            bVar.mo5539m();
            try {
                bVar.mo5543q(WorkDatabase.m6921I());
                bVar.mo5527M();
            } finally {
                bVar.mo5533a0();
            }
        }
    }

    /* renamed from: E */
    public static WorkDatabase m6918E(Context context, Executor executor, boolean z) {
        C0994s0.C0995a<WorkDatabase> aVar;
        Class<WorkDatabase> cls = WorkDatabase.class;
        if (z) {
            aVar = C0992r0.m5829c(context, cls);
            aVar.mo5597c();
        } else {
            aVar = C0992r0.m5827a(context, cls, C1284i.m7095d());
            aVar.mo5600f(new C1242a(context));
        }
        aVar.mo5601g(executor);
        aVar.mo5595a(m6919G());
        aVar.mo5596b(C1274h.f5178a);
        aVar.mo5596b(new C1274h.C1282h(context, 2, 3));
        aVar.mo5596b(C1274h.f5179b);
        aVar.mo5596b(C1274h.f5180c);
        aVar.mo5596b(new C1274h.C1282h(context, 5, 6));
        aVar.mo5596b(C1274h.f5181d);
        aVar.mo5596b(C1274h.f5182e);
        aVar.mo5596b(C1274h.f5183f);
        aVar.mo5596b(new C1274h.C1283i(context));
        aVar.mo5596b(new C1274h.C1282h(context, 10, 11));
        aVar.mo5596b(C1274h.f5184g);
        aVar.mo5599e();
        return aVar.mo5598d();
    }

    /* renamed from: G */
    static C0994s0.C0996b m6919G() {
        return new C1243b();
    }

    /* renamed from: H */
    static long m6920H() {
        return System.currentTimeMillis() - f5052n;
    }

    /* renamed from: I */
    static String m6921I() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + m6920H() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    /* renamed from: F */
    public abstract C1318b mo6522F();

    /* renamed from: J */
    public abstract C1322e mo6523J();

    /* renamed from: K */
    public abstract C1326h mo6524K();

    /* renamed from: L */
    public abstract C1331k mo6525L();

    /* renamed from: M */
    public abstract C1335n mo6526M();

    /* renamed from: N */
    public abstract C1342q mo6527N();

    /* renamed from: O */
    public abstract C1354t mo6528O();
}
