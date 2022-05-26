package p082e.p126k.p127b;

import p369i.p387z.p389d.C8589g;

/* renamed from: e.k.b.c */
/* compiled from: SingleProcessDataStore.kt */
final class C3815c<T> extends C3858n<T> {

    /* renamed from: a */
    private final T f11921a;

    /* renamed from: b */
    private final int f11922b;

    public C3815c(T t, int i) {
        super((C8589g) null);
        this.f11921a = t;
        this.f11922b = i;
    }

    /* renamed from: a */
    public final void mo13310a() {
        T t = this.f11921a;
        boolean z = false;
        if ((t != null ? t.hashCode() : 0) == this.f11922b) {
            z = true;
        }
        if (!z) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }

    /* renamed from: b */
    public final T mo13311b() {
        return this.f11921a;
    }
}
