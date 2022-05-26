package p159f.p334h.p335a.p336v;

import java.io.IOException;
import p159f.p334h.p335a.C7755f;
import p159f.p334h.p335a.C7761k;

/* renamed from: f.h.a.v.a */
/* compiled from: NullSafeJsonAdapter */
public final class C7800a<T> extends C7755f<T> {

    /* renamed from: a */
    private final C7755f<T> f33198a;

    public C7800a(C7755f<T> fVar) {
        this.f33198a = fVar;
    }

    /* renamed from: a */
    public T mo15563a(C7761k kVar) throws IOException {
        if (kVar.mo28973o0() == C7761k.C7763b.NULL) {
            return kVar.mo28971i0();
        }
        return this.f33198a.mo15563a(kVar);
    }

    public String toString() {
        return this.f33198a + ".nullSafe()";
    }
}
