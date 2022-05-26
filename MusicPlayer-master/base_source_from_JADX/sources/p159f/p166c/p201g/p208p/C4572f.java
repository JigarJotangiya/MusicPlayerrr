package p159f.p166c.p201g.p208p;

import p159f.p166c.p201g.p207o.C4564b;

/* renamed from: f.c.g.p.f */
/* compiled from: SoundEffectManager */
public class C4572f {

    /* renamed from: b */
    private static C4572f f13282b;

    /* renamed from: a */
    private C4564b f13283a;

    /* renamed from: a */
    public static void m19974a() {
        f13282b = null;
    }

    /* renamed from: b */
    public static C4572f m19975b() {
        if (f13282b == null) {
            synchronized (C4572f.class) {
                f13282b = new C4572f();
            }
        }
        return f13282b;
    }

    /* renamed from: c */
    public C4564b mo15324c() {
        return this.f13283a;
    }

    /* renamed from: d */
    public void mo15325d(C4564b bVar) {
        this.f13283a = bVar;
    }
}
