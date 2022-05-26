package p082e.p126k.p129c.p131j;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: e.k.c.j.t1 */
/* compiled from: UnmodifiableLazyStringList */
public class C4017t1 extends AbstractList<String> implements C3932h0, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C3932h0 f12166g;

    /* renamed from: e.k.c.j.t1$a */
    /* compiled from: UnmodifiableLazyStringList */
    class C4018a implements ListIterator<String> {

        /* renamed from: g */
        ListIterator<String> f12167g;

        /* renamed from: h */
        final /* synthetic */ int f12168h;

        C4018a(int i) {
            this.f12168h = i;
            this.f12167g = C4017t1.this.f12166g.listIterator(i);
        }

        /* renamed from: a */
        public void mo13982a(String str) {
            throw new UnsupportedOperationException();
        }

        public /* bridge */ /* synthetic */ void add(Object obj) {
            mo13982a((String) obj);
            throw null;
        }

        /* renamed from: b */
        public String next() {
            return this.f12167g.next();
        }

        /* renamed from: d */
        public String previous() {
            return this.f12167g.previous();
        }

        /* renamed from: e */
        public void mo13986e(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f12167g.hasNext();
        }

        public boolean hasPrevious() {
            return this.f12167g.hasPrevious();
        }

        public int nextIndex() {
            return this.f12167g.nextIndex();
        }

        public int previousIndex() {
            return this.f12167g.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* bridge */ /* synthetic */ void set(Object obj) {
            mo13986e((String) obj);
            throw null;
        }
    }

    /* renamed from: e.k.c.j.t1$b */
    /* compiled from: UnmodifiableLazyStringList */
    class C4019b implements Iterator<String> {

        /* renamed from: g */
        Iterator<String> f12170g;

        C4019b() {
            this.f12170g = C4017t1.this.f12166g.iterator();
        }

        /* renamed from: a */
        public String next() {
            return this.f12170g.next();
        }

        public boolean hasNext() {
            return this.f12170g.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C4017t1(C3932h0 h0Var) {
        this.f12166g = h0Var;
    }

    public Iterator<String> iterator() {
        return new C4019b();
    }

    /* renamed from: j */
    public void mo13569j(C3934i iVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: k */
    public List<?> mo13570k() {
        return this.f12166g.mo13570k();
    }

    public ListIterator<String> listIterator(int i) {
        return new C4018a(i);
    }

    /* renamed from: o */
    public C3932h0 mo13571o() {
        return this;
    }

    /* renamed from: p */
    public String get(int i) {
        return (String) this.f12166g.get(i);
    }

    /* renamed from: q */
    public Object mo13573q(int i) {
        return this.f12166g.mo13573q(i);
    }

    public int size() {
        return this.f12166g.size();
    }
}
