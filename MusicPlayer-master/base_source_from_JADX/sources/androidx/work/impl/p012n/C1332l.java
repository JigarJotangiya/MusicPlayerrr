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

/* renamed from: androidx.work.impl.n.l */
/* compiled from: WorkNameDao_Impl */
public final class C1332l implements C1331k {

    /* renamed from: a */
    private final C0994s0 f5305a;

    /* renamed from: b */
    private final C0955g0<C1330j> f5306b;

    /* renamed from: androidx.work.impl.n.l$a */
    /* compiled from: WorkNameDao_Impl */
    class C1333a extends C0955g0<C1330j> {
        C1333a(C1332l lVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void mo5478g(C4222f fVar, C1330j jVar) {
            String str = jVar.f5303a;
            if (str == null) {
                fVar.mo5561k0(1);
            } else {
                fVar.mo5562r(1, str);
            }
            String str2 = jVar.f5304b;
            if (str2 == null) {
                fVar.mo5561k0(2);
            } else {
                fVar.mo5562r(2, str2);
            }
        }
    }

    public C1332l(C0994s0 s0Var) {
        this.f5305a = s0Var;
        this.f5306b = new C1333a(this, s0Var);
    }

    /* renamed from: a */
    public void mo6699a(C1330j jVar) {
        this.f5305a.mo5575b();
        this.f5305a.mo5576c();
        try {
            this.f5306b.mo5479h(jVar);
            this.f5305a.mo5573C();
        } finally {
            this.f5305a.mo5580g();
        }
    }

    /* renamed from: b */
    public List<String> mo6700b(String str) {
        C1008v0 p = C1008v0.m5896p("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            p.mo5561k0(1);
        } else {
            p.mo5562r(1, str);
        }
        this.f5305a.mo5575b();
        Cursor c = C0941c.m5704c(this.f5305a, p, false, (CancellationSignal) null);
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
