package androidx.work.impl.p012n;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C0955g0;
import androidx.room.C0994s0;
import androidx.room.C1008v0;
import androidx.room.p006d1.C0941c;
import java.util.ArrayList;
import java.util.List;
import p082e.p149u.p150a.C4222f;

/* renamed from: androidx.work.impl.n.u */
/* compiled from: WorkTagDao_Impl */
public final class C1355u implements C1354t {

    /* renamed from: a */
    private final C0994s0 f5344a;

    /* renamed from: b */
    private final C0955g0<C1353s> f5345b;

    /* renamed from: androidx.work.impl.n.u$a */
    /* compiled from: WorkTagDao_Impl */
    class C1356a extends C0955g0<C1353s> {
        C1356a(C1355u uVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void mo5478g(C4222f fVar, C1353s sVar) {
            String str = sVar.f5342a;
            if (str == null) {
                fVar.mo5561k0(1);
            } else {
                fVar.mo5562r(1, str);
            }
            String str2 = sVar.f5343b;
            if (str2 == null) {
                fVar.mo5561k0(2);
            } else {
                fVar.mo5562r(2, str2);
            }
        }
    }

    public C1355u(C0994s0 s0Var) {
        this.f5344a = s0Var;
        this.f5345b = new C1356a(this, s0Var);
    }

    /* renamed from: a */
    public void mo6737a(C1353s sVar) {
        this.f5344a.mo5575b();
        this.f5344a.mo5576c();
        try {
            this.f5345b.mo5479h(sVar);
            this.f5344a.mo5573C();
        } finally {
            this.f5344a.mo5580g();
        }
    }

    /* renamed from: b */
    public List<String> mo6738b(String str) {
        C1008v0 p = C1008v0.m5896p("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            p.mo5561k0(1);
        } else {
            p.mo5562r(1, str);
        }
        this.f5344a.mo5575b();
        Cursor c = C0941c.m5704c(this.f5344a, p, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(c.getCount());
            while (c.moveToNext()) {
                arrayList.add(c.getString(0));
            }
            return arrayList;
        } finally {
            c.close();
            p.mo5622H();
        }
    }
}
