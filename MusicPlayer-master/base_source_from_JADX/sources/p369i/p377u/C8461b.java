package p369i.p377u;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.p390y.C8607a;

/* renamed from: i.u.b */
/* compiled from: AbstractList.kt */
public abstract class C8461b<E> extends C8458a<E> implements List<E>, C8607a {

    /* renamed from: g */
    public static final C8462a f34901g = new C8462a((C8589g) null);

    /* renamed from: i.u.b$a */
    /* compiled from: AbstractList.kt */
    public static final class C8462a {
        private C8462a() {
        }

        /* renamed from: a */
        public final void mo30460a(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* renamed from: b */
        public final void mo30461b(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* renamed from: c */
        public final void mo30462c(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
            } else if (i > i2) {
                throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
            }
        }

        /* renamed from: d */
        public final boolean mo30463d(Collection<?> collection, Collection<?> collection2) {
            C8594l.m46771e(collection, "c");
            C8594l.m46771e(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            for (Object a : collection) {
                if (!C8594l.m46767a(a, it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: e */
        public final int mo30464e(Collection<?> collection) {
            C8594l.m46771e(collection, "c");
            Iterator<?> it = collection.iterator();
            int i = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i = (i * 31) + (next != null ? next.hashCode() : 0);
            }
            return i;
        }

        public /* synthetic */ C8462a(C8589g gVar) {
            this();
        }
    }

    /* renamed from: i.u.b$b */
    /* compiled from: AbstractList.kt */
    private class C8463b implements Iterator<E>, C8607a {

        /* renamed from: g */
        private int f34902g;

        public C8463b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final int mo30465a() {
            return this.f34902g;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo30466b(int i) {
            this.f34902g = i;
        }

        public boolean hasNext() {
            return this.f34902g < C8461b.this.size();
        }

        public E next() {
            if (hasNext()) {
                C8461b bVar = C8461b.this;
                int i = this.f34902g;
                this.f34902g = i + 1;
                return bVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: i.u.b$c */
    /* compiled from: AbstractList.kt */
    private class C8464c extends C8461b<E>.C1427b implements ListIterator<E>, C8607a {
        public C8464c(int i) {
            super();
            C8461b.f34901g.mo30461b(i, C8461b.this.size());
            mo30466b(i);
        }

        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return mo30465a() > 0;
        }

        public int nextIndex() {
            return mo30465a();
        }

        public E previous() {
            if (hasPrevious()) {
                C8461b bVar = C8461b.this;
                mo30466b(mo30465a() - 1);
                return bVar.get(mo30465a());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return mo30465a() - 1;
        }

        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: i.u.b$d */
    /* compiled from: AbstractList.kt */
    private static final class C8465d<E> extends C8461b<E> implements RandomAccess {

        /* renamed from: h */
        private int f34905h;

        /* renamed from: i */
        private final C8461b<E> f34906i;

        /* renamed from: j */
        private final int f34907j;

        public C8465d(C8461b<? extends E> bVar, int i, int i2) {
            C8594l.m46771e(bVar, "list");
            this.f34906i = bVar;
            this.f34907j = i;
            C8461b.f34901g.mo30462c(i, i2, bVar.size());
            this.f34905h = i2 - i;
        }

        /* renamed from: d */
        public int mo30438d() {
            return this.f34905h;
        }

        public E get(int i) {
            C8461b.f34901g.mo30460a(i, this.f34905h);
            return this.f34906i.get(this.f34907j + i);
        }
    }

    protected C8461b() {
    }

    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return f34901g.mo30463d(this, (Collection) obj);
    }

    public abstract E get(int i);

    public int hashCode() {
        return f34901g.mo30464e(this);
    }

    public int indexOf(Object obj) {
        int i = 0;
        for (Object a : this) {
            if (C8594l.m46767a(a, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Iterator<E> iterator() {
        return new C8463b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C8594l.m46767a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new C8464c(0);
    }

    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i, int i2) {
        return new C8465d(this, i, i2);
    }

    public ListIterator<E> listIterator(int i) {
        return new C8464c(i);
    }
}
