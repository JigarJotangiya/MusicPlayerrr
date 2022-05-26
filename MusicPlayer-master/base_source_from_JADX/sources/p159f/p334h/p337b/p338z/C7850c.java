package p159f.p334h.p337b.p338z;

/* renamed from: f.h.b.z.c */
/* compiled from: NamedRunnable */
public abstract class C7850c implements Runnable {

    /* renamed from: g */
    protected final String f33369g;

    public C7850c(String str, Object... objArr) {
        this.f33369g = String.format(str, objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo29277a();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f33369g);
        try {
            mo29277a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
