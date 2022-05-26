package p369i.p377u;

import java.util.Iterator;
import p369i.p387z.p389d.p390y.C8607a;

/* renamed from: i.u.y */
/* compiled from: Iterators.kt */
public abstract class C8495y implements Iterator<Integer>, C8607a {
    /* renamed from: a */
    public final Integer next() {
        return Integer.valueOf(mo30365b());
    }

    /* renamed from: b */
    public abstract int mo30365b();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
