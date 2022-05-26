package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.C1405l;
import androidx.work.C1416p;
import androidx.work.C1421u;
import androidx.work.impl.C1264e;
import androidx.work.impl.C1285j;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p012n.C1325g;
import androidx.work.impl.p012n.C1340p;
import androidx.work.impl.p012n.C1342q;
import androidx.work.impl.utils.C1364c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.work.impl.background.systemjob.b */
/* compiled from: SystemJobScheduler */
public class C1260b implements C1264e {

    /* renamed from: k */
    private static final String f5116k = C1405l.m7462f("SystemJobScheduler");

    /* renamed from: g */
    private final Context f5117g;

    /* renamed from: h */
    private final JobScheduler f5118h;

    /* renamed from: i */
    private final C1285j f5119i;

    /* renamed from: j */
    private final C1258a f5120j;

    public C1260b(Context context, C1285j jVar) {
        this(context, jVar, (JobScheduler) context.getSystemService("jobscheduler"), new C1258a(context));
    }

    /* renamed from: b */
    public static void m7017b(Context context) {
        List<JobInfo> g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (g = m7020g(context, jobScheduler)) != null && !g.isEmpty()) {
            for (JobInfo id : g) {
                m7018d(jobScheduler, id.getId());
            }
        }
    }

    /* renamed from: d */
    private static void m7018d(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            C1405l.m7460c().mo6817b(f5116k, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)}), th);
        }
    }

    /* renamed from: f */
    private static List<Integer> m7019f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g = m7020g(context, jobScheduler);
        if (g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo next : g) {
            if (str.equals(m7021h(next))) {
                arrayList.add(Integer.valueOf(next.getId()));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private static List<JobInfo> m7020g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            C1405l.m7460c().mo6817b(f5116k, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    private static String m7021h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static boolean m7022i(Context context, C1285j jVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g = m7020g(context, jobScheduler);
        List<String> a = jVar.mo6611o().mo6524K().mo6694a();
        boolean z = false;
        HashSet hashSet = new HashSet(g != null ? g.size() : 0);
        if (g != null && !g.isEmpty()) {
            for (JobInfo next : g) {
                String h = m7021h(next);
                if (!TextUtils.isEmpty(h)) {
                    hashSet.add(h);
                } else {
                    m7018d(jobScheduler, next.getId());
                }
            }
        }
        Iterator<String> it = a.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    C1405l.m7460c().mo6816a(f5116k, "Reconciling jobs", new Throwable[0]);
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            WorkDatabase o = jVar.mo6611o();
            o.mo5576c();
            try {
                C1342q N = o.mo6527N();
                for (String c : a) {
                    N.mo6717c(c, -1);
                }
                o.mo5573C();
            } finally {
                o.mo5580g();
            }
        }
        return z;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo6556a(C1340p... pVarArr) {
        int i;
        List<Integer> f;
        int i2;
        WorkDatabase o = this.f5119i.mo6611o();
        C1364c cVar = new C1364c(o);
        int length = pVarArr.length;
        int i3 = 0;
        while (i3 < length) {
            C1340p pVar = pVarArr[i3];
            o.mo5576c();
            try {
                C1340p n = o.mo6527N().mo6728n(pVar.f5313a);
                if (n == null) {
                    C1405l c = C1405l.m7460c();
                    String str = f5116k;
                    c.mo6820h(str, "Skipping scheduling " + pVar.f5313a + " because it's no longer in the DB", new Throwable[0]);
                    o.mo5573C();
                } else if (n.f5314b != C1421u.ENQUEUED) {
                    C1405l c2 = C1405l.m7460c();
                    String str2 = f5116k;
                    c2.mo6820h(str2, "Skipping scheduling " + pVar.f5313a + " because it is no longer enqueued", new Throwable[0]);
                    o.mo5573C();
                } else {
                    C1325g c3 = o.mo6524K().mo6696c(pVar.f5313a);
                    if (c3 != null) {
                        i = c3.f5299b;
                    } else {
                        i = cVar.mo6758d(this.f5119i.mo6607i().mo6465i(), this.f5119i.mo6607i().mo6463g());
                    }
                    if (c3 == null) {
                        this.f5119i.mo6611o().mo6524K().mo6695b(new C1325g(pVar.f5313a, i));
                    }
                    mo6564j(pVar, i);
                    if (Build.VERSION.SDK_INT == 23 && (f = m7019f(this.f5117g, this.f5118h, pVar.f5313a)) != null) {
                        int indexOf = f.indexOf(Integer.valueOf(i));
                        if (indexOf >= 0) {
                            f.remove(indexOf);
                        }
                        if (!f.isEmpty()) {
                            i2 = f.get(0).intValue();
                        } else {
                            i2 = cVar.mo6758d(this.f5119i.mo6607i().mo6465i(), this.f5119i.mo6607i().mo6463g());
                        }
                        mo6564j(pVar, i2);
                    }
                    o.mo5573C();
                }
                o.mo5580g();
                i3++;
            } catch (Throwable th) {
                o.mo5580g();
                throw th;
            }
        }
    }

    /* renamed from: c */
    public boolean mo6557c() {
        return true;
    }

    /* renamed from: e */
    public void mo6558e(String str) {
        List<Integer> f = m7019f(this.f5117g, this.f5118h, str);
        if (f != null && !f.isEmpty()) {
            for (Integer intValue : f) {
                m7018d(this.f5118h, intValue.intValue());
            }
            this.f5119i.mo6611o().mo6524K().mo6697d(str);
        }
    }

    /* renamed from: j */
    public void mo6564j(C1340p pVar, int i) {
        JobInfo a = this.f5120j.mo6563a(pVar, i);
        C1405l c = C1405l.m7460c();
        String str = f5116k;
        c.mo6816a(str, String.format("Scheduling work ID %s Job ID %s", new Object[]{pVar.f5313a, Integer.valueOf(i)}), new Throwable[0]);
        try {
            if (this.f5118h.schedule(a) == 0) {
                C1405l.m7460c().mo6820h(str, String.format("Unable to schedule work ID %s", new Object[]{pVar.f5313a}), new Throwable[0]);
                if (pVar.f5329q && pVar.f5330r == C1416p.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f5329q = false;
                    C1405l.m7460c().mo6816a(str, String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{pVar.f5313a}), new Throwable[0]);
                    mo6564j(pVar, i);
                }
            }
        } catch (IllegalStateException e) {
            List<JobInfo> g = m7020g(this.f5117g, this.f5118h);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(g != null ? g.size() : 0), Integer.valueOf(this.f5119i.mo6611o().mo6527N().mo6722h().size()), Integer.valueOf(this.f5119i.mo6607i().mo6464h())});
            C1405l.m7460c().mo6817b(f5116k, format, new Throwable[0]);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            C1405l.m7460c().mo6817b(f5116k, String.format("Unable to schedule %s", new Object[]{pVar}), th);
        }
    }

    public C1260b(Context context, C1285j jVar, JobScheduler jobScheduler, C1258a aVar) {
        this.f5117g = context;
        this.f5119i = jVar;
        this.f5118h = jobScheduler;
        this.f5120j = aVar;
    }
}
