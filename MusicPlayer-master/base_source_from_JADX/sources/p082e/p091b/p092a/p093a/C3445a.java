package p082e.p091b.p092a.p093a;

import java.util.concurrent.Executor;

/* renamed from: e.b.a.a.a */
/* compiled from: ArchTaskExecutor */
public class C3445a extends C3449c {

    /* renamed from: c */
    private static volatile C3445a f10969c;

    /* renamed from: d */
    private static final Executor f10970d = new C3446a();

    /* renamed from: a */
    private C3449c f10971a;

    /* renamed from: b */
    private C3449c f10972b;

    /* renamed from: e.b.a.a.a$a */
    /* compiled from: ArchTaskExecutor */
    static class C3446a implements Executor {
        C3446a() {
        }

        public void execute(Runnable runnable) {
            C3445a.m14718f().mo12228a(runnable);
        }
    }

    private C3445a() {
        C3447b bVar = new C3447b();
        this.f10972b = bVar;
        this.f10971a = bVar;
    }

    /* renamed from: e */
    public static Executor m14717e() {
        return f10970d;
    }

    /* renamed from: f */
    public static C3445a m14718f() {
        if (f10969c != null) {
            return f10969c;
        }
        synchronized (C3445a.class) {
            if (f10969c == null) {
                f10969c = new C3445a();
            }
        }
        return f10969c;
    }

    /* renamed from: a */
    public void mo12228a(Runnable runnable) {
        this.f10971a.mo12228a(runnable);
    }

    /* renamed from: c */
    public boolean mo12229c() {
        return this.f10971a.mo12229c();
    }

    /* renamed from: d */
    public void mo12230d(Runnable runnable) {
        this.f10971a.mo12230d(runnable);
    }
}
