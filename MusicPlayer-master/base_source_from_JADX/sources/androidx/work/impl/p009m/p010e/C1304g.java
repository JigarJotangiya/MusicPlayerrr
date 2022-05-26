package androidx.work.impl.p009m.p010e;

import android.content.Context;
import android.os.Build;
import androidx.work.C1407m;
import androidx.work.impl.p009m.C1294b;
import androidx.work.impl.p009m.p011f.C1316g;
import androidx.work.impl.p012n.C1340p;
import androidx.work.impl.utils.p014p.C1397a;

/* renamed from: androidx.work.impl.m.e.g */
/* compiled from: NetworkUnmeteredController */
public class C1304g extends C1299c<C1294b> {
    public C1304g(Context context, C1397a aVar) {
        super(C1316g.m7222c(context, aVar).mo6680d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo6646b(C1340p pVar) {
        return pVar.f5322j.mo6474b() == C1407m.UNMETERED || (Build.VERSION.SDK_INT >= 30 && pVar.f5322j.mo6474b() == C1407m.TEMPORARILY_UNMETERED);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo6647c(C1294b bVar) {
        return !bVar.mo6634a() || bVar.mo6635b();
    }
}
