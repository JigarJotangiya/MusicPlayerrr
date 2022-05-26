package p159f.p166c.p201g.p208p;

import android.content.Context;
import android.os.Build;
import androidx.core.content.C0506a;
import p159f.p166c.p171b.p172a.C4314b;
import p159f.p166c.p171b.p174c.C4320c;
import p159f.p166c.p201g.C4509d;

/* renamed from: f.c.g.p.a */
/* compiled from: EffectConfig */
public class C4565a {

    /* renamed from: l */
    private static C4565a f13257l;

    /* renamed from: a */
    public boolean f13258a;

    /* renamed from: b */
    public boolean f13259b;

    /* renamed from: c */
    public boolean f13260c;

    /* renamed from: d */
    public boolean f13261d;

    /* renamed from: e */
    public boolean f13262e;

    /* renamed from: f */
    public boolean f13263f;

    /* renamed from: g */
    public int f13264g;

    /* renamed from: h */
    public int f13265h;

    /* renamed from: i */
    public int f13266i;

    /* renamed from: j */
    public int f13267j;

    /* renamed from: k */
    public int f13268k;

    /* renamed from: a */
    public static C4565a m19902a() {
        if (f13257l == null) {
            synchronized (C4565a.class) {
                f13257l = new C4565a();
            }
        }
        return f13257l;
    }

    /* renamed from: c */
    private boolean m19903c() {
        return Build.VERSION.SDK_INT >= 29;
    }

    /* renamed from: b */
    public void mo15292b(Context context, boolean z) {
        if (z && m19903c()) {
            this.f13258a = C4568c.m19949h(context);
        }
        this.f13259b = C4568c.m19947f(context);
        this.f13260c = C4568c.m19944c(context);
        this.f13261d = C4568c.m19954m(context);
        this.f13262e = C4568c.m19950i(context);
        this.f13263f = C4568c.m19952k(context);
        this.f13264g = C4568c.m19953l(context);
        C4320c cVar = C4320c.f12910c;
        cVar.mo14742c();
        cVar.mo14744e(new C4314b(0));
        cVar.mo14743d(this.f13258a);
        cVar.mo14740a();
        this.f13265h = C0506a.m3150b(context, C4509d.black);
        int i = C4509d.white;
        this.f13266i = C0506a.m3150b(context, i);
        this.f13267j = C0506a.m3150b(context, C4509d.effect_accent);
        this.f13268k = C0506a.m3150b(context, i);
    }

    /* renamed from: d */
    public void mo15293d(Context context, boolean z) {
        if (this.f13260c != z) {
            this.f13260c = z;
            C4568c.m19963v(context, z);
        }
    }

    /* renamed from: e */
    public void mo15294e(Context context, boolean z) {
        if (this.f13259b != z) {
            this.f13259b = z;
            C4568c.m19964w(context, z);
        }
    }

    /* renamed from: f */
    public void mo15295f(Context context, boolean z) {
        if (m19903c()) {
            this.f13258a = z;
            C4568c.m19965x(context, z);
            C4320c cVar = C4320c.f12910c;
            cVar.mo14743d(z);
            cVar.mo14740a();
        }
    }

    /* renamed from: g */
    public void mo15296g(Context context, boolean z) {
        if (this.f13262e != z) {
            this.f13262e = z;
            C4568c.m19966y(context, z);
        }
    }

    /* renamed from: h */
    public void mo15297h(Context context, boolean z) {
        if (this.f13263f != z) {
            this.f13263f = z;
            C4568c.m19967z(context, z);
        }
    }

    /* renamed from: i */
    public void mo15298i(Context context, int i) {
        if (this.f13264g != i) {
            this.f13264g = i;
            C4568c.m19940A(context, i);
        }
    }

    /* renamed from: j */
    public void mo15299j(Context context, boolean z) {
        if (this.f13261d != z) {
            this.f13261d = z;
            C4568c.m19941B(context, z);
        }
    }
}
