package p369i.p377u;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8588f;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8595m;
import p369i.p387z.p389d.p390y.C8607a;

/* renamed from: i.u.a */
/* compiled from: AbstractCollection.kt */
public abstract class C8458a<E> implements Collection<E>, C8607a {

    /* renamed from: i.u.a$a */
    /* compiled from: AbstractCollection.kt */
    static final class C8459a extends C8595m implements C8570l<E, CharSequence> {
        final /* synthetic */ C8458a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8459a(C8458a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        public final CharSequence invoke(E e) {
            return e == this.this$0 ? "(this Collection)" : String.valueOf(e);
        }
    }

    protected C8458a() {
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (Object a : this) {
            if (C8594l.m46767a(a, obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C8594l.m46771e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public abstract int mo30438d();

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo30438d();
    }

    public Object[] toArray() {
        return C8588f.m46764a(this);
    }

    public String toString() {
        return C8490t.m46683t(this, ", ", "[", "]", 0, (CharSequence) null, new C8459a(this), 24, (Object) null);
    }

    public <T> T[] toArray(T[] tArr) {
        C8594l.m46771e(tArr, "array");
        T[] b = C8588f.m46765b(this, tArr);
        Objects.requireNonNull(b, "null cannot be cast to non-null type kotlin.Array<T>");
        return b;
    }
}
