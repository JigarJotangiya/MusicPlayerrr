package p159f.p243f.p327d.p329b;

import java.util.Collection;
import java.util.Set;
import java.util.function.ObjIntConsumer;

/* renamed from: f.f.d.b.h0 */
/* compiled from: Multiset */
public interface C7683h0<E> extends Collection<E> {

    /* renamed from: f.f.d.b.h0$a */
    /* compiled from: Multiset */
    public interface C7684a<E> {
        /* renamed from: a */
        E mo28712a();

        int getCount();
    }

    int add(E e, int i);

    Set<C7684a<E>> entrySet();

    /* renamed from: h */
    Set<E> mo28705h();

    /* renamed from: l */
    void mo28718l(ObjIntConsumer<? super E> objIntConsumer);

    /* renamed from: m */
    int mo28707m(Object obj);

    int remove(Object obj, int i);

    int setCount(E e, int i);

    boolean setCount(E e, int i, int i2);

    int size();
}
