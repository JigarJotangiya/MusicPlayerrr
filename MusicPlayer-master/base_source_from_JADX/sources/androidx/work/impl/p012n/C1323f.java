package androidx.work.impl.p012n;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C0955g0;
import androidx.room.C0994s0;
import androidx.room.C1008v0;
import androidx.room.p006d1.C0941c;
import p082e.p149u.p150a.C4222f;

/* renamed from: androidx.work.impl.n.f */
/* compiled from: PreferenceDao_Impl */
public final class C1323f implements C1322e {

    /* renamed from: a */
    private final C0994s0 f5296a;

    /* renamed from: b */
    private final C0955g0<C1321d> f5297b;

    /* renamed from: androidx.work.impl.n.f$a */
    /* compiled from: PreferenceDao_Impl */
    class C1324a extends C0955g0<C1321d> {
        C1324a(C1323f fVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void mo5478g(C4222f fVar, C1321d dVar) {
            String str = dVar.f5294a;
            if (str == null) {
                fVar.mo5561k0(1);
            } else {
                fVar.mo5562r(1, str);
            }
            Long l = dVar.f5295b;
            if (l == null) {
                fVar.mo5561k0(2);
            } else {
                fVar.mo5557L(2, l.longValue());
            }
        }
    }

    public C1323f(C0994s0 s0Var) {
        this.f5296a = s0Var;
        this.f5297b = new C1324a(this, s0Var);
    }

    /* renamed from: a */
    public Long mo6689a(String str) {
        C1008v0 p = C1008v0.m5896p("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            p.mo5561k0(1);
        } else {
            p.mo5562r(1, str);
        }
        this.f5296a.mo5575b();
        Long l = null;
        Cursor c = C0941c.m5704c(this.f5296a, p, false, (CancellationSignal) null);
        try {
            if (c.moveToFirst()) {
                if (!c.isNull(0)) {
                    l = Long.valueOf(c.getLong(0));
                }
            }
            return l;
        } finally {
            c.close();
            p.mo5622H();
        }
    }

    /* renamed from: b */
    public void mo6690b(C1321d dVar) {
        this.f5296a.mo5575b();
        this.f5296a.mo5576c();
        try {
            this.f5297b.mo5479h(dVar);
            this.f5296a.mo5573C();
        } finally {
            this.f5296a.mo5580g();
        }
    }
}
