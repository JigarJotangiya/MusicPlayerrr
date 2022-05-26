package p159f.p243f.p245b.p318c.p319a.p320a;

import p159f.p243f.p245b.p318c.p319a.p323d.C7643p;

/* renamed from: f.f.b.c.a.a.b */
/* compiled from: com.google.android.play:core@@1.10.2 */
public abstract class C7579b implements Runnable {

    /* renamed from: g */
    private final C7643p<?> f32948g;

    C7579b() {
        this.f32948g = null;
    }

    public C7579b(C7643p<?> pVar) {
        this.f32948g = pVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25173a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C7643p<?> mo28579b() {
        return this.f32948g;
    }

    /* renamed from: c */
    public final void mo28580c(Exception exc) {
        C7643p<?> pVar = this.f32948g;
        if (pVar != null) {
            pVar.mo28635d(exc);
        }
    }

    public final void run() {
        try {
            mo25173a();
        } catch (Exception e) {
            mo28580c(e);
        }
    }
}
