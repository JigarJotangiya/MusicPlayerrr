package p159f.p166c.p201g.p208p;

import android.content.Context;
import android.os.Build;
import java.util.Arrays;
import p159f.p166c.p201g.C4506a;
import p159f.p166c.p201g.p206n.C4557a;
import p159f.p166c.p201g.p206n.C4558b;
import p159f.p166c.p201g.p206n.C4559c;
import p159f.p166c.p201g.p206n.C4560d;
import p159f.p166c.p201g.p206n.C4561e;
import p159f.p166c.p201g.p206n.C4562f;

/* renamed from: f.c.g.p.b */
/* compiled from: EffectManager */
public class C4566b {

    /* renamed from: a */
    private Context f13269a;

    /* renamed from: b */
    private C4567a f13270b;

    /* renamed from: c */
    private int[] f13271c;

    /* renamed from: d */
    private int f13272d;

    /* renamed from: e */
    private int f13273e;

    /* renamed from: f */
    private int f13274f;

    /* renamed from: g */
    private C4558b f13275g;

    /* renamed from: h */
    private C4559c f13276h;

    /* renamed from: i */
    private C4557a f13277i;

    /* renamed from: j */
    private C4562f f13278j;

    /* renamed from: k */
    private C4561e f13279k;

    /* renamed from: l */
    private C4560d f13280l;

    /* renamed from: f.c.g.p.b$a */
    /* compiled from: EffectManager */
    public interface C4567a {
        /* renamed from: D */
        void mo15320D(int i);

        /* renamed from: e */
        int mo15321e();
    }

    public C4566b(Context context, C4567a aVar) {
        this.f13269a = context;
        this.f13270b = aVar;
        mo15300c();
        m19913b();
        m19915f();
        m19914e();
        if (m19916g()) {
            this.f13275g = new C4558b();
        }
        this.f13276h = new C4559c();
        this.f13277i = new C4557a();
        this.f13278j = new C4562f();
        this.f13279k = new C4561e(aVar);
        this.f13280l = new C4560d();
    }

    /* renamed from: a */
    private int m19912a() {
        C4567a aVar = this.f13270b;
        if (aVar != null) {
            return aVar.mo15321e();
        }
        return 0;
    }

    /* renamed from: b */
    private void m19913b() {
        this.f13272d = C4568c.m19945d(this.f13269a);
    }

    /* renamed from: e */
    private void m19914e() {
        this.f13274f = C4568c.m19951j(this.f13269a);
    }

    /* renamed from: f */
    private void m19915f() {
        this.f13273e = C4568c.m19955n(this.f13269a);
    }

    /* renamed from: g */
    private boolean m19916g() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* renamed from: i */
    private boolean m19917i() {
        return C4565a.m19902a().f13258a && m19916g();
    }

    /* renamed from: c */
    public void mo15300c() {
        int[] g = C4568c.m19948g(this.f13269a);
        this.f13271c = Arrays.copyOf(g, g.length);
    }

    /* renamed from: d */
    public void mo15301d(int i) {
        C4560d dVar = this.f13280l;
        if (dVar != null) {
            dVar.mo15275b(m19912a(), i * 100);
        }
    }

    /* renamed from: h */
    public boolean mo15302h() {
        C4560d dVar = this.f13280l;
        if (dVar != null) {
            return dVar.mo15277d();
        }
        return false;
    }

    /* renamed from: j */
    public void mo15303j(int[] iArr) {
        C4558b bVar;
        if (m19917i()) {
            C4559c cVar = this.f13276h;
            if (cVar != null) {
                cVar.mo15270b();
            }
            C4558b bVar2 = this.f13275g;
            if (bVar2 != null) {
                bVar2.mo15264a(m19912a(), iArr);
                this.f13275g.mo15267d(true);
                return;
            }
            return;
        }
        if (m19916g() && (bVar = this.f13275g) != null) {
            bVar.mo15265b();
        }
        C4559c cVar2 = this.f13276h;
        if (cVar2 != null) {
            cVar2.mo15269a(m19912a(), iArr);
            this.f13276h.mo15272d(true);
        }
    }

    /* renamed from: k */
    public void mo15304k(int i) {
        if (i == 0) {
            mo15303j(C4506a.m19729c());
        } else if (i == 1) {
            mo15305l(888);
        } else if (i == 2) {
            mo15303j(C4506a.m19738l());
        } else if (i == 3) {
            mo15305l(1000);
        } else if (i == 4) {
            mo15303j(C4506a.m19732f());
        } else if (i == 5) {
            mo15303j(C4506a.m19728b());
        }
    }

    /* renamed from: l */
    public void mo15305l(int i) {
        C4562f fVar = this.f13278j;
        if (fVar != null) {
            fVar.mo15288a(m19912a(), (float) i);
            this.f13278j.mo15290c(true);
        }
    }

    /* renamed from: m */
    public void mo15306m() {
        if (this.f13275g != null && m19916g()) {
            this.f13275g.mo15265b();
        }
        C4559c cVar = this.f13276h;
        if (cVar != null) {
            cVar.mo15270b();
        }
        C4557a aVar = this.f13277i;
        if (aVar != null) {
            aVar.mo15261b();
        }
        C4562f fVar = this.f13278j;
        if (fVar != null) {
            fVar.mo15289b();
        }
        C4561e eVar = this.f13279k;
        if (eVar != null) {
            eVar.mo15286d();
        }
    }

    /* renamed from: n */
    public void mo15307n() {
        if (this.f13275g != null && m19916g()) {
            this.f13275g.mo15265b();
        }
        C4559c cVar = this.f13276h;
        if (cVar != null) {
            cVar.mo15270b();
        }
        C4557a aVar = this.f13277i;
        if (aVar != null) {
            aVar.mo15261b();
        }
        C4562f fVar = this.f13278j;
        if (fVar != null) {
            fVar.mo15289b();
        }
    }

    /* renamed from: o */
    public void mo15308o() {
        C4560d dVar = this.f13280l;
        if (dVar != null) {
            dVar.mo15280h();
        }
    }

    /* renamed from: p */
    public void mo15309p(boolean z) {
        C4557a aVar = this.f13277i;
        if (aVar != null) {
            aVar.mo15260a(m19912a(), (float) this.f13272d);
            this.f13277i.mo15262c(z);
        }
    }

    /* renamed from: q */
    public void mo15310q(int i) {
        this.f13272d = i;
        C4557a aVar = this.f13277i;
        if (aVar != null) {
            aVar.mo15263d((float) i);
        }
    }

    /* renamed from: r */
    public void mo15311r(int i) {
        C4560d dVar = this.f13280l;
        if (dVar != null) {
            dVar.mo15282k(i * 100);
        }
    }

    /* renamed from: s */
    public void mo15312s(int i, int i2) {
        try {
            this.f13271c[i] = i2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (m19917i()) {
            C4558b bVar = this.f13275g;
            if (bVar != null) {
                bVar.mo15266c(i, i2);
                return;
            }
            return;
        }
        C4559c cVar = this.f13276h;
        if (cVar != null) {
            cVar.mo15271c(i, i2);
        }
    }

    /* renamed from: t */
    public void mo15313t(boolean z) {
        C4558b bVar;
        if (m19917i()) {
            C4559c cVar = this.f13276h;
            if (cVar != null) {
                cVar.mo15270b();
            }
            C4558b bVar2 = this.f13275g;
            if (bVar2 != null) {
                bVar2.mo15264a(m19912a(), this.f13271c);
                this.f13275g.mo15267d(z);
                return;
            }
            return;
        }
        if (m19916g() && (bVar = this.f13275g) != null) {
            bVar.mo15265b();
        }
        C4559c cVar2 = this.f13276h;
        if (cVar2 != null) {
            cVar2.mo15269a(m19912a(), this.f13271c);
            this.f13276h.mo15272d(z);
        }
    }

    /* renamed from: u */
    public void mo15314u(int[] iArr) {
        this.f13271c = iArr;
        if (m19917i()) {
            C4558b bVar = this.f13275g;
            if (bVar != null) {
                bVar.mo15268e(iArr);
                return;
            }
            return;
        }
        C4559c cVar = this.f13276h;
        if (cVar != null) {
            cVar.mo15273e(iArr);
        }
    }

    /* renamed from: v */
    public boolean mo15315v(boolean z) {
        C4560d dVar = this.f13280l;
        if (dVar != null) {
            return dVar.mo15281j(z);
        }
        return false;
    }

    /* renamed from: w */
    public void mo15316w(boolean z) {
        C4561e eVar = this.f13279k;
        if (eVar == null) {
            return;
        }
        if (z) {
            eVar.mo15287e(this.f13274f);
        } else {
            eVar.mo15287e(0);
        }
    }

    /* renamed from: x */
    public void mo15317x(int i) {
        this.f13274f = i;
        C4561e eVar = this.f13279k;
        if (eVar != null) {
            eVar.mo15287e(i);
        }
    }

    /* renamed from: y */
    public void mo15318y(boolean z) {
        C4562f fVar = this.f13278j;
        if (fVar != null) {
            fVar.mo15288a(m19912a(), (float) this.f13273e);
            this.f13278j.mo15290c(z);
        }
    }

    /* renamed from: z */
    public void mo15319z(int i) {
        this.f13273e = i;
        C4562f fVar = this.f13278j;
        if (fVar != null) {
            fVar.mo15291d((float) i);
        }
    }
}
