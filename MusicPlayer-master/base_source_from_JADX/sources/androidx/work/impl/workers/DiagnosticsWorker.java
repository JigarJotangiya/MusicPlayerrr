package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.recyclerview.widget.C0885l;
import androidx.work.C1405l;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.C1285j;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p012n.C1325g;
import androidx.work.impl.p012n.C1326h;
import androidx.work.impl.p012n.C1331k;
import androidx.work.impl.p012n.C1340p;
import androidx.work.impl.p012n.C1342q;
import androidx.work.impl.p012n.C1354t;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DiagnosticsWorker extends Worker {

    /* renamed from: m */
    private static final String f5462m = C1405l.m7462f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: a */
    private static String m7452a(C1340p pVar, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", new Object[]{pVar.f5313a, pVar.f5315c, num, pVar.f5314b.name(), str, str2});
    }

    /* renamed from: c */
    private static String m7453c(C1331k kVar, C1354t tVar, C1326h hVar, List<C1340p> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", new Object[]{Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"}));
        for (C1340p next : list) {
            Integer num = null;
            C1325g c = hVar.mo6696c(next.f5313a);
            if (c != null) {
                num = Integer.valueOf(c.f5299b);
            }
            sb.append(m7452a(next, TextUtils.join(",", kVar.mo6700b(next.f5313a)), num, TextUtils.join(",", tVar.mo6738b(next.f5313a))));
        }
        return sb.toString();
    }

    public ListenableWorker.C1221a doWork() {
        WorkDatabase o = C1285j.m7100k(getApplicationContext()).mo6611o();
        C1342q N = o.mo6527N();
        C1331k L = o.mo6525L();
        C1354t O = o.mo6528O();
        C1326h K = o.mo6524K();
        List<C1340p> e = N.mo6719e(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1));
        List<C1340p> j = N.mo6724j();
        List<C1340p> t = N.mo6734t(C0885l.C0891f.DEFAULT_DRAG_ANIMATION_DURATION);
        if (e != null && !e.isEmpty()) {
            C1405l c = C1405l.m7460c();
            String str = f5462m;
            c.mo6818d(str, "Recently completed work:\n\n", new Throwable[0]);
            C1405l.m7460c().mo6818d(str, m7453c(L, O, K, e), new Throwable[0]);
        }
        if (j != null && !j.isEmpty()) {
            C1405l c2 = C1405l.m7460c();
            String str2 = f5462m;
            c2.mo6818d(str2, "Running work:\n\n", new Throwable[0]);
            C1405l.m7460c().mo6818d(str2, m7453c(L, O, K, j), new Throwable[0]);
        }
        if (t != null && !t.isEmpty()) {
            C1405l c3 = C1405l.m7460c();
            String str3 = f5462m;
            c3.mo6818d(str3, "Enqueued work:\n\n", new Throwable[0]);
            C1405l.m7460c().mo6818d(str3, m7453c(L, O, K, t), new Throwable[0]);
        }
        return ListenableWorker.C1221a.m6838c();
    }
}
