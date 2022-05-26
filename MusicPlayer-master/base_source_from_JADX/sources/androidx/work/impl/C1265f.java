package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.recyclerview.widget.C0885l;
import androidx.work.C1228b;
import androidx.work.C1405l;
import androidx.work.impl.background.systemalarm.C1257f;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.C1260b;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.p012n.C1340p;
import androidx.work.impl.p012n.C1342q;
import androidx.work.impl.utils.C1365d;
import java.util.List;

/* renamed from: androidx.work.impl.f */
/* compiled from: Schedulers */
public class C1265f {

    /* renamed from: a */
    private static final String f5139a = C1405l.m7462f("Schedulers");

    /* renamed from: a */
    static C1264e m7046a(Context context, C1285j jVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            C1260b bVar = new C1260b(context, jVar);
            C1365d.m7382a(context, SystemJobService.class, true);
            C1405l.m7460c().mo6816a(f5139a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return bVar;
        }
        C1264e c = m7048c(context);
        if (c != null) {
            return c;
        }
        C1257f fVar = new C1257f(context);
        C1365d.m7382a(context, SystemAlarmService.class, true);
        C1405l.m7460c().mo6816a(f5139a, "Created SystemAlarmScheduler", new Throwable[0]);
        return fVar;
    }

    /* renamed from: b */
    public static void m7047b(C1228b bVar, WorkDatabase workDatabase, List<C1264e> list) {
        if (list != null && list.size() != 0) {
            C1342q N = workDatabase.mo6527N();
            workDatabase.mo5576c();
            try {
                List<C1340p> f = N.mo6720f(bVar.mo6464h());
                List<C1340p> t = N.mo6734t(C0885l.C0891f.DEFAULT_DRAG_ANIMATION_DURATION);
                if (f != null && f.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (C1340p pVar : f) {
                        N.mo6717c(pVar.f5313a, currentTimeMillis);
                    }
                }
                workDatabase.mo5573C();
                if (f != null && f.size() > 0) {
                    C1340p[] pVarArr = (C1340p[]) f.toArray(new C1340p[f.size()]);
                    for (C1264e next : list) {
                        if (next.mo6557c()) {
                            next.mo6556a(pVarArr);
                        }
                    }
                }
                if (t != null && t.size() > 0) {
                    C1340p[] pVarArr2 = (C1340p[]) t.toArray(new C1340p[t.size()]);
                    for (C1264e next2 : list) {
                        if (!next2.mo6557c()) {
                            next2.mo6556a(pVarArr2);
                        }
                    }
                }
            } finally {
                workDatabase.mo5580g();
            }
        }
    }

    /* renamed from: c */
    private static C1264e m7048c(Context context) {
        try {
            C1264e eVar = (C1264e) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            C1405l.m7460c().mo6816a(f5139a, String.format("Created %s", new Object[]{"androidx.work.impl.background.gcm.GcmScheduler"}), new Throwable[0]);
            return eVar;
        } catch (Throwable th) {
            C1405l.m7460c().mo6816a(f5139a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
