package androidx.lifecycle;

import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C8902r0;
import p369i.p379w.C8513g;
import p369i.p387z.p389d.C8594l;

/* renamed from: androidx.lifecycle.d */
/* compiled from: ViewModel.kt */
public final class C0665d implements Closeable, C8902r0 {

    /* renamed from: g */
    private final C8513g f3286g;

    public C0665d(C8513g gVar) {
        C8594l.m46771e(gVar, "context");
        this.f3286g = gVar;
    }

    public void close() {
        C8769g2.m47307d(mo4135x(), (CancellationException) null, 1, (Object) null);
    }

    /* renamed from: x */
    public C8513g mo4135x() {
        return this.f3286g;
    }
}
