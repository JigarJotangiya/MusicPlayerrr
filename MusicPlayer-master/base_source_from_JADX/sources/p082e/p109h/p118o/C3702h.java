package p082e.p109h.p118o;

/* renamed from: e.h.o.h */
/* compiled from: Pools */
public class C3702h<T> extends C3701g<T> {

    /* renamed from: c */
    private final Object f11717c = new Object();

    public C3702h(int i) {
        super(i);
    }

    /* renamed from: a */
    public boolean mo8512a(T t) {
        boolean a;
        synchronized (this.f11717c) {
            a = super.mo8512a(t);
        }
        return a;
    }

    /* renamed from: b */
    public T mo8513b() {
        T b;
        synchronized (this.f11717c) {
            b = super.mo8513b();
        }
        return b;
    }
}
