package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.work.C1232c;
import androidx.work.C1236e;
import androidx.work.C1405l;
import androidx.work.C1410o;
import androidx.work.impl.C1261c;
import androidx.work.impl.C1264e;
import androidx.work.impl.C1265f;
import androidx.work.impl.C1273g;
import androidx.work.impl.C1285j;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.p012n.C1340p;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.List;

/* renamed from: androidx.work.impl.utils.b */
/* compiled from: EnqueueRunnable */
public class C1363b implements Runnable {

    /* renamed from: i */
    private static final String f5364i = C1405l.m7462f("EnqueueRunnable");

    /* renamed from: g */
    private final C1273g f5365g;

    /* renamed from: h */
    private final C1261c f5366h = new C1261c();

    public C1363b(C1273g gVar) {
        this.f5365g = gVar;
    }

    /* renamed from: b */
    private static boolean m7369b(C1273g gVar) {
        boolean c = m7370c(gVar.mo6598g(), gVar.mo6597f(), (String[]) C1273g.m7072l(gVar).toArray(new String[0]), gVar.mo6595d(), gVar.mo6593b());
        gVar.mo6601k();
        return c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01e1 A[LOOP:7: B:120:0x01db->B:122:0x01e1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x020a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0159  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m7370c(androidx.work.impl.C1285j r19, java.util.List<? extends androidx.work.C1423w> r20, java.lang.String[] r21, java.lang.String r22, androidx.work.C1238f r23) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = r23
            long r4 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r6 = r19.mo6611o()
            r7 = 1
            if (r1 == 0) goto L_0x0018
            int r9 = r1.length
            if (r9 <= 0) goto L_0x0018
            r9 = 1
            goto L_0x0019
        L_0x0018:
            r9 = 0
        L_0x0019:
            if (r9 == 0) goto L_0x005d
            int r10 = r1.length
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
        L_0x0020:
            if (r11 >= r10) goto L_0x0060
            r15 = r1[r11]
            androidx.work.impl.n.q r8 = r6.mo6527N()
            androidx.work.impl.n.p r8 = r8.mo6728n(r15)
            if (r8 != 0) goto L_0x0045
            androidx.work.l r0 = androidx.work.C1405l.m7460c()
            java.lang.String r1 = f5364i
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r3 = 0
            r2[r3] = r15
            java.lang.String r4 = "Prerequisite %s doesn't exist; not enqueuing"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r0.mo6817b(r1, r2, r4)
            return r3
        L_0x0045:
            androidx.work.u r8 = r8.f5314b
            androidx.work.u r15 = androidx.work.C1421u.SUCCEEDED
            if (r8 != r15) goto L_0x004d
            r15 = 1
            goto L_0x004e
        L_0x004d:
            r15 = 0
        L_0x004e:
            r12 = r12 & r15
            androidx.work.u r15 = androidx.work.C1421u.FAILED
            if (r8 != r15) goto L_0x0055
            r14 = 1
            goto L_0x005a
        L_0x0055:
            androidx.work.u r15 = androidx.work.C1421u.CANCELLED
            if (r8 != r15) goto L_0x005a
            r13 = 1
        L_0x005a:
            int r11 = r11 + 1
            goto L_0x0020
        L_0x005d:
            r12 = 1
            r13 = 0
            r14 = 0
        L_0x0060:
            boolean r8 = android.text.TextUtils.isEmpty(r22)
            r8 = r8 ^ r7
            if (r8 == 0) goto L_0x006b
            if (r9 != 0) goto L_0x006b
            r10 = 1
            goto L_0x006c
        L_0x006b:
            r10 = 0
        L_0x006c:
            if (r10 == 0) goto L_0x014e
            androidx.work.impl.n.q r10 = r6.mo6527N()
            java.util.List r10 = r10.mo6718d(r2)
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x014e
            androidx.work.f r11 = androidx.work.C1238f.APPEND
            if (r3 == r11) goto L_0x00ca
            androidx.work.f r11 = androidx.work.C1238f.APPEND_OR_REPLACE
            if (r3 != r11) goto L_0x0085
            goto L_0x00ca
        L_0x0085:
            androidx.work.f r11 = androidx.work.C1238f.KEEP
            if (r3 != r11) goto L_0x00a5
            java.util.Iterator r3 = r10.iterator()
        L_0x008d:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x00a5
            java.lang.Object r11 = r3.next()
            androidx.work.impl.n.p$a r11 = (androidx.work.impl.p012n.C1340p.C1341a) r11
            androidx.work.u r11 = r11.f5332b
            androidx.work.u r15 = androidx.work.C1421u.ENQUEUED
            if (r11 == r15) goto L_0x00a3
            androidx.work.u r15 = androidx.work.C1421u.RUNNING
            if (r11 != r15) goto L_0x008d
        L_0x00a3:
            r11 = 0
            return r11
        L_0x00a5:
            r11 = 0
            androidx.work.impl.utils.a r3 = androidx.work.impl.utils.C1359a.m7359c(r2, r0, r11)
            r3.run()
            androidx.work.impl.n.q r3 = r6.mo6527N()
            java.util.Iterator r10 = r10.iterator()
        L_0x00b5:
            boolean r15 = r10.hasNext()
            if (r15 == 0) goto L_0x00c7
            java.lang.Object r15 = r10.next()
            androidx.work.impl.n.p$a r15 = (androidx.work.impl.p012n.C1340p.C1341a) r15
            java.lang.String r15 = r15.f5331a
            r3.mo6715a(r15)
            goto L_0x00b5
        L_0x00c7:
            r3 = 1
            goto L_0x014f
        L_0x00ca:
            r11 = 0
            androidx.work.impl.n.b r9 = r6.mo6522F()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x00d8:
            boolean r16 = r10.hasNext()
            if (r16 == 0) goto L_0x0113
            java.lang.Object r16 = r10.next()
            r7 = r16
            androidx.work.impl.n.p$a r7 = (androidx.work.impl.p012n.C1340p.C1341a) r7
            java.lang.String r11 = r7.f5331a
            boolean r11 = r9.mo6685d(r11)
            if (r11 != 0) goto L_0x010c
            androidx.work.u r11 = r7.f5332b
            r17 = r9
            androidx.work.u r9 = androidx.work.C1421u.SUCCEEDED
            if (r11 != r9) goto L_0x00f8
            r9 = 1
            goto L_0x00f9
        L_0x00f8:
            r9 = 0
        L_0x00f9:
            r9 = r9 & r12
            androidx.work.u r12 = androidx.work.C1421u.FAILED
            if (r11 != r12) goto L_0x0100
            r14 = 1
            goto L_0x0105
        L_0x0100:
            androidx.work.u r12 = androidx.work.C1421u.CANCELLED
            if (r11 != r12) goto L_0x0105
            r13 = 1
        L_0x0105:
            java.lang.String r7 = r7.f5331a
            r15.add(r7)
            r12 = r9
            goto L_0x010e
        L_0x010c:
            r17 = r9
        L_0x010e:
            r9 = r17
            r7 = 1
            r11 = 0
            goto L_0x00d8
        L_0x0113:
            androidx.work.f r7 = androidx.work.C1238f.APPEND_OR_REPLACE
            if (r3 != r7) goto L_0x0140
            if (r13 != 0) goto L_0x011b
            if (r14 == 0) goto L_0x0140
        L_0x011b:
            androidx.work.impl.n.q r3 = r6.mo6527N()
            java.util.List r7 = r3.mo6718d(r2)
            java.util.Iterator r7 = r7.iterator()
        L_0x0127:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0139
            java.lang.Object r9 = r7.next()
            androidx.work.impl.n.p$a r9 = (androidx.work.impl.p012n.C1340p.C1341a) r9
            java.lang.String r9 = r9.f5331a
            r3.mo6715a(r9)
            goto L_0x0127
        L_0x0139:
            java.util.List r15 = java.util.Collections.emptyList()
            r3 = 0
            r13 = 0
            goto L_0x0141
        L_0x0140:
            r3 = r14
        L_0x0141:
            java.lang.Object[] r1 = r15.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r7 = r1.length
            if (r7 <= 0) goto L_0x014c
            r9 = 1
            goto L_0x014d
        L_0x014c:
            r9 = 0
        L_0x014d:
            r14 = r3
        L_0x014e:
            r3 = 0
        L_0x014f:
            java.util.Iterator r7 = r20.iterator()
        L_0x0153:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0210
            java.lang.Object r10 = r7.next()
            androidx.work.w r10 = (androidx.work.C1423w) r10
            androidx.work.impl.n.p r11 = r10.mo6833c()
            if (r9 == 0) goto L_0x017a
            if (r12 != 0) goto L_0x017a
            if (r14 == 0) goto L_0x016e
            androidx.work.u r15 = androidx.work.C1421u.FAILED
            r11.f5314b = r15
            goto L_0x0182
        L_0x016e:
            if (r13 == 0) goto L_0x0175
            androidx.work.u r15 = androidx.work.C1421u.CANCELLED
            r11.f5314b = r15
            goto L_0x0182
        L_0x0175:
            androidx.work.u r15 = androidx.work.C1421u.BLOCKED
            r11.f5314b = r15
            goto L_0x0182
        L_0x017a:
            boolean r15 = r11.mo6709d()
            if (r15 != 0) goto L_0x0185
            r11.f5326n = r4
        L_0x0182:
            r17 = r4
            goto L_0x018b
        L_0x0185:
            r17 = r4
            r4 = 0
            r11.f5326n = r4
        L_0x018b:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r4 < r5) goto L_0x0199
            r5 = 25
            if (r4 > r5) goto L_0x0199
            m7372g(r11)
            goto L_0x01a8
        L_0x0199:
            r5 = 22
            if (r4 > r5) goto L_0x01a8
            java.lang.String r4 = "androidx.work.impl.background.gcm.GcmScheduler"
            boolean r4 = m7373h(r0, r4)
            if (r4 == 0) goto L_0x01a8
            m7372g(r11)
        L_0x01a8:
            androidx.work.u r4 = r11.f5314b
            androidx.work.u r5 = androidx.work.C1421u.ENQUEUED
            if (r4 != r5) goto L_0x01af
            r3 = 1
        L_0x01af:
            androidx.work.impl.n.q r4 = r6.mo6527N()
            r4.mo6721g(r11)
            if (r9 == 0) goto L_0x01d3
            int r4 = r1.length
            r5 = 0
        L_0x01ba:
            if (r5 >= r4) goto L_0x01d3
            r11 = r1[r5]
            androidx.work.impl.n.a r15 = new androidx.work.impl.n.a
            java.lang.String r0 = r10.mo6831a()
            r15.<init>(r0, r11)
            androidx.work.impl.n.b r0 = r6.mo6522F()
            r0.mo6682a(r15)
            int r5 = r5 + 1
            r0 = r19
            goto L_0x01ba
        L_0x01d3:
            java.util.Set r0 = r10.mo6832b()
            java.util.Iterator r0 = r0.iterator()
        L_0x01db:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x01f8
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            androidx.work.impl.n.t r5 = r6.mo6528O()
            androidx.work.impl.n.s r11 = new androidx.work.impl.n.s
            java.lang.String r15 = r10.mo6831a()
            r11.<init>(r4, r15)
            r5.mo6737a(r11)
            goto L_0x01db
        L_0x01f8:
            if (r8 == 0) goto L_0x020a
            androidx.work.impl.n.k r0 = r6.mo6525L()
            androidx.work.impl.n.j r4 = new androidx.work.impl.n.j
            java.lang.String r5 = r10.mo6831a()
            r4.<init>(r2, r5)
            r0.mo6699a(r4)
        L_0x020a:
            r0 = r19
            r4 = r17
            goto L_0x0153
        L_0x0210:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.C1363b.m7370c(androidx.work.impl.j, java.util.List, java.lang.String[], java.lang.String, androidx.work.f):boolean");
    }

    /* renamed from: e */
    private static boolean m7371e(C1273g gVar) {
        List<C1273g> e = gVar.mo6596e();
        boolean z = false;
        if (e != null) {
            boolean z2 = false;
            for (C1273g next : e) {
                if (!next.mo6600j()) {
                    z2 |= m7371e(next);
                } else {
                    C1405l.m7460c().mo6820h(f5364i, String.format("Already enqueued work ids (%s).", new Object[]{TextUtils.join(", ", next.mo6594c())}), new Throwable[0]);
                }
            }
            z = z2;
        }
        return m7369b(gVar) | z;
    }

    /* renamed from: g */
    private static void m7372g(C1340p pVar) {
        Class<ConstraintTrackingWorker> cls = ConstraintTrackingWorker.class;
        C1232c cVar = pVar.f5322j;
        String str = pVar.f5315c;
        if (str.equals(cls.getName())) {
            return;
        }
        if (cVar.mo6479f() || cVar.mo6483i()) {
            C1236e.C1237a aVar = new C1236e.C1237a();
            aVar.mo6511c(pVar.f5317e);
            aVar.mo6513e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.f5315c = cls.getName();
            pVar.f5317e = aVar.mo6509a();
        }
    }

    /* renamed from: h */
    private static boolean m7373h(C1285j jVar, String str) {
        try {
            Class<?> cls = Class.forName(str);
            for (C1264e eVar : jVar.mo6610n()) {
                if (cls.isAssignableFrom(eVar.getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo6753a() {
        WorkDatabase o = this.f5365g.mo6598g().mo6611o();
        o.mo5576c();
        try {
            boolean e = m7371e(this.f5365g);
            o.mo5573C();
            return e;
        } finally {
            o.mo5580g();
        }
    }

    /* renamed from: d */
    public C1410o mo6754d() {
        return this.f5366h;
    }

    /* renamed from: f */
    public void mo6755f() {
        C1285j g = this.f5365g.mo6598g();
        C1265f.m7047b(g.mo6607i(), g.mo6611o(), g.mo6610n());
    }

    public void run() {
        try {
            if (!this.f5365g.mo6599h()) {
                if (mo6753a()) {
                    C1365d.m7382a(this.f5365g.mo6598g().mo6606h(), RescheduleReceiver.class, true);
                    mo6755f();
                }
                this.f5366h.mo6565a(C1410o.f5468a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[]{this.f5365g}));
        } catch (Throwable th) {
            this.f5366h.mo6565a(new C1410o.C1412b.C1413a(th));
        }
    }
}
