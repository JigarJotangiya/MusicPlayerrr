package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.C1405l;
import androidx.work.impl.C1264e;
import androidx.work.impl.p012n.C1340p;

/* renamed from: androidx.work.impl.background.systemalarm.f */
/* compiled from: SystemAlarmScheduler */
public class C1257f implements C1264e {

    /* renamed from: h */
    private static final String f5108h = C1405l.m7462f("SystemAlarmScheduler");

    /* renamed from: g */
    private final Context f5109g;

    public C1257f(Context context) {
        this.f5109g = context.getApplicationContext();
    }

    /* renamed from: b */
    private void m7007b(C1340p pVar) {
        C1405l.m7460c().mo6816a(f5108h, String.format("Scheduling work with workSpecId %s", new Object[]{pVar.f5313a}), new Throwable[0]);
        this.f5109g.startService(C1249b.m6973f(this.f5109g, pVar.f5313a));
    }

    /* renamed from: a */
    public void mo6556a(C1340p... pVarArr) {
        for (C1340p b : pVarArr) {
            m7007b(b);
        }
    }

    /* renamed from: c */
    public boolean mo6557c() {
        return true;
    }

    /* renamed from: e */
    public void mo6558e(String str) {
        this.f5109g.startService(C1249b.m6974g(this.f5109g, str));
    }
}
