package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.C1405l;
import androidx.work.impl.background.systemalarm.C1252e;
import androidx.work.impl.p009m.C1295c;
import androidx.work.impl.p009m.C1296d;
import androidx.work.impl.p012n.C1340p;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.background.systemalarm.c */
/* compiled from: ConstraintsCommandHandler */
class C1250c {

    /* renamed from: e */
    private static final String f5077e = C1405l.m7462f("ConstraintsCmdHandler");

    /* renamed from: a */
    private final Context f5078a;

    /* renamed from: b */
    private final int f5079b;

    /* renamed from: c */
    private final C1252e f5080c;

    /* renamed from: d */
    private final C1296d f5081d;

    C1250c(Context context, int i, C1252e eVar) {
        this.f5078a = context;
        this.f5079b = i;
        this.f5080c = eVar;
        this.f5081d = new C1296d(context, eVar.mo6547f(), (C1295c) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6539a() {
        List<C1340p> h = this.f5080c.mo6548g().mo6611o().mo6527N().mo6722h();
        ConstraintProxy.m6961a(this.f5078a, h);
        this.f5081d.mo6644d(h);
        ArrayList<C1340p> arrayList = new ArrayList<>(h.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (C1340p next : h) {
            String str = next.f5313a;
            if (currentTimeMillis >= next.mo6706a() && (!next.mo6707b() || this.f5081d.mo6643c(str))) {
                arrayList.add(next);
            }
        }
        for (C1340p pVar : arrayList) {
            String str2 = pVar.f5313a;
            Intent b = C1249b.m6970b(this.f5078a, str2);
            C1405l.m7460c().mo6816a(f5077e, String.format("Creating a delay_met command for workSpec with id (%s)", new Object[]{str2}), new Throwable[0]);
            C1252e eVar = this.f5080c;
            eVar.mo6551k(new C1252e.C1254b(eVar, b, this.f5079b));
        }
        this.f5081d.mo6645e();
    }
}
