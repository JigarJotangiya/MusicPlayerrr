package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.C1405l;
import androidx.work.impl.C1246b;
import androidx.work.impl.background.systemalarm.C1252e;
import androidx.work.impl.p009m.C1295c;
import androidx.work.impl.p009m.C1296d;
import androidx.work.impl.p012n.C1340p;
import androidx.work.impl.utils.C1372j;
import androidx.work.impl.utils.C1380n;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.work.impl.background.systemalarm.d */
/* compiled from: DelayMetCommandHandler */
public class C1251d implements C1295c, C1246b, C1380n.C1382b {

    /* renamed from: p */
    private static final String f5082p = C1405l.m7462f("DelayMetCommandHandler");

    /* renamed from: g */
    private final Context f5083g;

    /* renamed from: h */
    private final int f5084h;

    /* renamed from: i */
    private final String f5085i;

    /* renamed from: j */
    private final C1252e f5086j;

    /* renamed from: k */
    private final C1296d f5087k;

    /* renamed from: l */
    private final Object f5088l = new Object();

    /* renamed from: m */
    private int f5089m = 0;

    /* renamed from: n */
    private PowerManager.WakeLock f5090n;

    /* renamed from: o */
    private boolean f5091o = false;

    C1251d(Context context, int i, String str, C1252e eVar) {
        this.f5083g = context;
        this.f5084h = i;
        this.f5086j = eVar;
        this.f5085i = str;
        this.f5087k = new C1296d(context, eVar.mo6547f(), this);
    }

    /* renamed from: c */
    private void m6986c() {
        synchronized (this.f5088l) {
            this.f5087k.mo6645e();
            this.f5086j.mo6549h().mo6776c(this.f5085i);
            PowerManager.WakeLock wakeLock = this.f5090n;
            if (wakeLock != null && wakeLock.isHeld()) {
                C1405l.m7460c().mo6816a(f5082p, String.format("Releasing wakelock %s for WorkSpec %s", new Object[]{this.f5090n, this.f5085i}), new Throwable[0]);
                this.f5090n.release();
            }
        }
    }

    /* renamed from: g */
    private void m6987g() {
        synchronized (this.f5088l) {
            if (this.f5089m < 2) {
                this.f5089m = 2;
                C1405l c = C1405l.m7460c();
                String str = f5082p;
                c.mo6816a(str, String.format("Stopping work for WorkSpec %s", new Object[]{this.f5085i}), new Throwable[0]);
                Intent g = C1249b.m6974g(this.f5083g, this.f5085i);
                C1252e eVar = this.f5086j;
                eVar.mo6551k(new C1252e.C1254b(eVar, g, this.f5084h));
                if (this.f5086j.mo6546e().mo6570g(this.f5085i)) {
                    C1405l.m7460c().mo6816a(str, String.format("WorkSpec %s needs to be rescheduled", new Object[]{this.f5085i}), new Throwable[0]);
                    Intent f = C1249b.m6973f(this.f5083g, this.f5085i);
                    C1252e eVar2 = this.f5086j;
                    eVar2.mo6551k(new C1252e.C1254b(eVar2, f, this.f5084h));
                } else {
                    C1405l.m7460c().mo6816a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.f5085i}), new Throwable[0]);
                }
            } else {
                C1405l.m7460c().mo6816a(f5082p, String.format("Already stopped work for %s", new Object[]{this.f5085i}), new Throwable[0]);
            }
        }
    }

    /* renamed from: a */
    public void mo6540a(String str) {
        C1405l.m7460c().mo6816a(f5082p, String.format("Exceeded time limits on execution for %s", new Object[]{str}), new Throwable[0]);
        m6987g();
    }

    /* renamed from: b */
    public void mo6541b(List<String> list) {
        m6987g();
    }

    /* renamed from: d */
    public void mo6531d(String str, boolean z) {
        C1405l.m7460c().mo6816a(f5082p, String.format("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)}), new Throwable[0]);
        m6986c();
        if (z) {
            Intent f = C1249b.m6973f(this.f5083g, this.f5085i);
            C1252e eVar = this.f5086j;
            eVar.mo6551k(new C1252e.C1254b(eVar, f, this.f5084h));
        }
        if (this.f5091o) {
            Intent a = C1249b.m6969a(this.f5083g);
            C1252e eVar2 = this.f5086j;
            eVar2.mo6551k(new C1252e.C1254b(eVar2, a, this.f5084h));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo6542e() {
        this.f5090n = C1372j.m7391b(this.f5083g, String.format("%s (%s)", new Object[]{this.f5085i, Integer.valueOf(this.f5084h)}));
        C1405l c = C1405l.m7460c();
        String str = f5082p;
        c.mo6816a(str, String.format("Acquiring wakelock %s for WorkSpec %s", new Object[]{this.f5090n, this.f5085i}), new Throwable[0]);
        this.f5090n.acquire();
        C1340p n = this.f5086j.mo6548g().mo6611o().mo6527N().mo6728n(this.f5085i);
        if (n == null) {
            m6987g();
            return;
        }
        boolean b = n.mo6707b();
        this.f5091o = b;
        if (!b) {
            C1405l.m7460c().mo6816a(str, String.format("No constraints for %s", new Object[]{this.f5085i}), new Throwable[0]);
            mo6543f(Collections.singletonList(this.f5085i));
            return;
        }
        this.f5087k.mo6644d(Collections.singletonList(n));
    }

    /* renamed from: f */
    public void mo6543f(List<String> list) {
        if (list.contains(this.f5085i)) {
            synchronized (this.f5088l) {
                if (this.f5089m == 0) {
                    this.f5089m = 1;
                    C1405l.m7460c().mo6816a(f5082p, String.format("onAllConstraintsMet for %s", new Object[]{this.f5085i}), new Throwable[0]);
                    if (this.f5086j.mo6546e().mo6573j(this.f5085i)) {
                        this.f5086j.mo6549h().mo6775b(this.f5085i, 600000, this);
                    } else {
                        m6986c();
                    }
                } else {
                    C1405l.m7460c().mo6816a(f5082p, String.format("Already started work for %s", new Object[]{this.f5085i}), new Throwable[0]);
                }
            }
        }
    }
}
