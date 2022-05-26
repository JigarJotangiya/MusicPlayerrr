package p369i.p387z.p389d;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p369i.p387z.p389d.p390y.C8607a;

/* renamed from: i.z.d.a */
/* compiled from: ArrayIterator.kt */
final class C8582a<T> implements Iterator<T>, C8607a {

    /* renamed from: g */
    private int f34925g;

    /* renamed from: h */
    private final T[] f34926h;

    public C8582a(T[] tArr) {
        C8594l.m46771e(tArr, "array");
        this.f34926h = tArr;
    }

    public boolean hasNext() {
        return this.f34925g < this.f34926h.length;
    }

    public T next() {
        try {
            T[] tArr = this.f34926h;
            int i = this.f34925g;
            this.f34925g = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f34925g--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
