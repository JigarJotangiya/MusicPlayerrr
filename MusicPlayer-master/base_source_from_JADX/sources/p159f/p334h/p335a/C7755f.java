package p159f.p334h.p335a;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import p159f.p334h.p335a.p336v.C7800a;
import p394k.C8637g;

/* renamed from: f.h.a.f */
/* compiled from: JsonAdapter */
public abstract class C7755f<T> {

    /* renamed from: f.h.a.f$a */
    /* compiled from: JsonAdapter */
    public interface C7756a {
        /* renamed from: a */
        C7755f<?> mo15565a(Type type, Set<? extends Annotation> set, C7781s sVar);
    }

    /* renamed from: a */
    public abstract T mo15563a(C7761k kVar) throws IOException;

    /* renamed from: b */
    public final T mo28953b(C8637g gVar) throws IOException {
        return mo15563a(C7761k.m42645n0(gVar));
    }

    /* renamed from: c */
    public final C7755f<T> mo28954c() {
        if (this instanceof C7800a) {
            return this;
        }
        return new C7800a(this);
    }
}
