package androidx.work.impl.p012n;

import androidx.room.C0955g0;
import androidx.room.C0994s0;
import androidx.room.C1025z0;
import androidx.work.C1236e;
import p082e.p149u.p150a.C4222f;

/* renamed from: androidx.work.impl.n.o */
/* compiled from: WorkProgressDao_Impl */
public final class C1336o implements C1335n {

    /* renamed from: a */
    private final C0994s0 f5309a;

    /* renamed from: b */
    private final C0955g0<C1334m> f5310b;

    /* renamed from: c */
    private final C1025z0 f5311c;

    /* renamed from: d */
    private final C1025z0 f5312d;

    /* renamed from: androidx.work.impl.n.o$a */
    /* compiled from: WorkProgressDao_Impl */
    class C1337a extends C0955g0<C1334m> {
        C1337a(C1336o oVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void mo5478g(C4222f fVar, C1334m mVar) {
            String str = mVar.f5307a;
            if (str == null) {
                fVar.mo5561k0(1);
            } else {
                fVar.mo5562r(1, str);
            }
            byte[] k = C1236e.m6904k(mVar.f5308b);
            if (k == null) {
                fVar.mo5561k0(2);
            } else {
                fVar.mo5558S(2, k);
            }
        }
    }

    /* renamed from: androidx.work.impl.n.o$b */
    /* compiled from: WorkProgressDao_Impl */
    class C1338b extends C1025z0 {
        C1338b(C1336o oVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* renamed from: androidx.work.impl.n.o$c */
    /* compiled from: WorkProgressDao_Impl */
    class C1339c extends C1025z0 {
        C1339c(C1336o oVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public C1336o(C0994s0 s0Var) {
        this.f5309a = s0Var;
        this.f5310b = new C1337a(this, s0Var);
        this.f5311c = new C1338b(this, s0Var);
        this.f5312d = new C1339c(this, s0Var);
    }

    /* renamed from: a */
    public void mo6702a(String str) {
        this.f5309a.mo5575b();
        C4222f a = this.f5311c.mo5690a();
        if (str == null) {
            a.mo5561k0(1);
        } else {
            a.mo5562r(1, str);
        }
        this.f5309a.mo5576c();
        try {
            a.mo5568u();
            this.f5309a.mo5573C();
        } finally {
            this.f5309a.mo5580g();
            this.f5311c.mo5693f(a);
        }
    }

    /* renamed from: b */
    public void mo6703b() {
        this.f5309a.mo5575b();
        C4222f a = this.f5312d.mo5690a();
        this.f5309a.mo5576c();
        try {
            a.mo5568u();
            this.f5309a.mo5573C();
        } finally {
            this.f5309a.mo5580g();
            this.f5312d.mo5693f(a);
        }
    }

    /* renamed from: c */
    public void mo6704c(C1334m mVar) {
        this.f5309a.mo5575b();
        this.f5309a.mo5576c();
        try {
            this.f5310b.mo5479h(mVar);
            this.f5309a.mo5573C();
        } finally {
            this.f5309a.mo5580g();
        }
    }
}
