package androidx.work.impl.p009m.p010e;

import android.content.Context;
import android.os.Build;
import androidx.work.C1405l;
import androidx.work.C1407m;
import androidx.work.impl.p009m.C1294b;
import androidx.work.impl.p009m.p011f.C1316g;
import androidx.work.impl.p012n.C1340p;
import androidx.work.impl.utils.p014p.C1397a;

/* renamed from: androidx.work.impl.m.e.f */
/* compiled from: NetworkNotRoamingController */
public class C1303f extends C1299c<C1294b> {

    /* renamed from: e */
    private static final String f5264e = C1405l.m7462f("NetworkNotRoamingCtrlr");

    public C1303f(Context context, C1397a aVar) {
        super(C1316g.m7222c(context, aVar).mo6680d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo6646b(C1340p pVar) {
        return pVar.f5322j.mo6474b() == C1407m.NOT_ROAMING;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo6647c(C1294b bVar) {
        if (Build.VERSION.SDK_INT < 24) {
            C1405l.m7460c().mo6816a(f5264e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !bVar.mo6634a();
        } else if (!bVar.mo6634a() || !bVar.mo6636c()) {
            return true;
        } else {
            return false;
        }
    }
}
