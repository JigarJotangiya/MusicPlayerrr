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

/* renamed from: androidx.work.impl.n.c */
/* compiled from: DependencyDao_Impl */
public final class C1319c implements C1318b {

    /* renamed from: a */
    private final C0994s0 f5292a;

    /* renamed from: b */
    private final C0955g0<C1317a> f5293b;

    /* renamed from: androidx.work.impl.n.c$a */
    /* compiled from: DependencyDao_Impl */
    class C1320a extends C0955g0<C1317a> {
        C1320a(C1319c cVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void mo5478g(C4222f fVar, C1317a aVar) {
            String str = aVar.f5290a;
            if (str == null) {
                fVar.mo5561k0(1);
            } else {
                fVar.mo5562r(1, str);
            }
            String str2 = aVar.f5291b;
            if (str2 == null) {
                fVar.mo5561k0(2);
            } else {
                fVar.mo5562r(2, str2);
            }
        }
    }

    public C1319c(C0994s0 s0Var) {
        this.f5292a = s0Var;
        this.f5293b = new C1320a(this, s0Var);
    }

    /* renamed from: a */
    public void mo6682a(C1317a aVar) {
        this.f5292a.mo5575b();
        this.f5292a.mo5576c();
        try {
            this.f5293b.mo5479h(aVar);
            this.f5292a.mo5573C();
        } finally {
            this.f5292a.mo5580g();
        }
    }

    /* renamed from: b */
    public List<String> mo6683b(String str) {
        C1008v0 p = C1008v0.m5896p("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            p.mo5561k0(1);
        } else {
            p.mo5562r(1, str);
        }
        this.f5292a.mo5575b();
        Cursor c = C0941c.m5704c(this.f5292a, p, false, (CancellationSignal) null);
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

    /* renamed from: c */
    public boolean mo6684c(String str) {
        boolean z = true;
        C1008v0 p = C1008v0.m5896p("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            p.mo5561k0(1);
        } else {
            p.mo5562r(1, str);
        }
        this.f5292a.mo5575b();
        boolean z2 = false;
        Cursor c = C0941c.m5704c(this.f5292a, p, false, (CancellationSignal) null);
        try {
            if (c.moveToFirst()) {
                if (c.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            c.close();
            p.mo5622H();
        }
    }

    /* renamed from: d */
    public boolean mo6685d(String str) {
        boolean z = true;
        C1008v0 p = C1008v0.m5896p("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            p.mo5561k0(1);
        } else {
            p.mo5562r(1, str);
        }
        this.f5292a.mo5575b();
        boolean z2 = false;
        Cursor c = C0941c.m5704c(this.f5292a, p, false, (CancellationSignal) null);
        try {
            if (c.moveToFirst()) {
                if (c.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            c.close();
            p.mo5622H();
        }
    }
}
