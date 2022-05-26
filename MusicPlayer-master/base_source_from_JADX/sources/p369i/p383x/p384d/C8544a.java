package p369i.p383x.p384d;

import p369i.p383x.C8540a;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.x.d.a */
/* compiled from: JDK7PlatformImplementations.kt */
public class C8544a extends C8540a {
    /* renamed from: a */
    public void mo30606a(Throwable th, Throwable th2) {
        C8594l.m46771e(th, "cause");
        C8594l.m46771e(th2, "exception");
        th.addSuppressed(th2);
    }
}
