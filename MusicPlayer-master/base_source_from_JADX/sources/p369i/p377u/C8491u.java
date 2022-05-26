package p369i.p377u;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p369i.p387z.p389d.p390y.C8607a;

/* renamed from: i.u.u */
/* compiled from: Collections.kt */
public final class C8491u implements ListIterator, C8607a {

    /* renamed from: g */
    public static final C8491u f34910g = new C8491u();

    private C8491u() {
    }

    /* renamed from: a */
    public Void mo30490a() {
        throw new NoSuchElementException();
    }

    public /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public Void mo30492b() {
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public /* bridge */ /* synthetic */ Object next() {
        mo30490a();
        throw null;
    }

    public int nextIndex() {
        return 0;
    }

    public /* bridge */ /* synthetic */ Object previous() {
        mo30492b();
        throw null;
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
