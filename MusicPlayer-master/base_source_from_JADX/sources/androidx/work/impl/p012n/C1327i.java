package androidx.work.impl.p012n;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C0955g0;
import androidx.room.C0994s0;
import androidx.room.C1008v0;
import androidx.room.C1025z0;
import androidx.room.p006d1.C0940b;
import androidx.room.p006d1.C0941c;
import java.util.ArrayList;
import java.util.List;
import p082e.p149u.p150a.C4222f;

/* renamed from: androidx.work.impl.n.i */
/* compiled from: SystemIdInfoDao_Impl */
public final class C1327i implements C1326h {

    /* renamed from: a */
    private final C0994s0 f5300a;

    /* renamed from: b */
    private final C0955g0<C1325g> f5301b;

    /* renamed from: c */
    private final C1025z0 f5302c;

    /* renamed from: androidx.work.impl.n.i$a */
    /* compiled from: SystemIdInfoDao_Impl */
    class C1328a extends C0955g0<C1325g> {
        C1328a(C1327i iVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void mo5478g(C4222f fVar, C1325g gVar) {
            String str = gVar.f5298a;
            if (str == null) {
                fVar.mo5561k0(1);
            } else {
                fVar.mo5562r(1, str);
            }
            fVar.mo5557L(2, (long) gVar.f5299b);
        }
    }

    /* renamed from: androidx.work.impl.n.i$b */
    /* compiled from: SystemIdInfoDao_Impl */
    class C1329b extends C1025z0 {
        C1329b(C1327i iVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public C1327i(C0994s0 s0Var) {
        this.f5300a = s0Var;
        this.f5301b = new C1328a(this, s0Var);
        this.f5302c = new C1329b(this, s0Var);
    }

    /* renamed from: a */
    public List<String> mo6694a() {
        C1008v0 p = C1008v0.m5896p("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f5300a.mo5575b();
        Cursor c = C0941c.m5704c(this.f5300a, p, false, (CancellationSignal) null);
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

    /* renamed from: b */
    public void mo6695b(C1325g gVar) {
        this.f5300a.mo5575b();
        this.f5300a.mo5576c();
        try {
            this.f5301b.mo5479h(gVar);
            this.f5300a.mo5573C();
        } finally {
            this.f5300a.mo5580g();
        }
    }

    /* renamed from: c */
    public C1325g mo6696c(String str) {
        C1008v0 p = C1008v0.m5896p("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            p.mo5561k0(1);
        } else {
            p.mo5562r(1, str);
        }
        this.f5300a.mo5575b();
        C1325g gVar = null;
        Cursor c = C0941c.m5704c(this.f5300a, p, false, (CancellationSignal) null);
        try {
            int e = C0940b.m5701e(c, "work_spec_id");
            int e2 = C0940b.m5701e(c, "system_id");
            if (c.moveToFirst()) {
                gVar = new C1325g(c.getString(e), c.getInt(e2));
            }
            return gVar;
        } finally {
            c.close();
            p.mo5622H();
        }
    }

    /* renamed from: d */
    public void mo6697d(String str) {
        this.f5300a.mo5575b();
        C4222f a = this.f5302c.mo5690a();
        if (str == null) {
            a.mo5561k0(1);
        } else {
            a.mo5562r(1, str);
        }
        this.f5300a.mo5576c();
        try {
            a.mo5568u();
            this.f5300a.mo5573C();
        } finally {
            this.f5300a.mo5580g();
            this.f5302c.mo5693f(a);
        }
    }
}
