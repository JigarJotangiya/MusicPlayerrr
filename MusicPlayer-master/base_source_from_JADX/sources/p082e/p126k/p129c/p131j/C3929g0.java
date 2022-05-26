package p082e.p126k.p129c.p131j;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: e.k.c.j.g0 */
/* compiled from: LazyStringArrayList */
public class C3929g0 extends C3910c<String> implements C3932h0, RandomAccess {

    /* renamed from: i */
    private static final C3929g0 f12015i;

    /* renamed from: h */
    private final List<Object> f12016h;

    static {
        C3929g0 g0Var = new C3929g0();
        f12015i = g0Var;
        g0Var.mo13463g();
    }

    public C3929g0() {
        this(10);
    }

    /* renamed from: s */
    private static String m16774s(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C3934i) {
            return ((C3934i) obj).toStringUtf8();
        }
        return C3899b0.m16654j((byte[]) obj);
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public void clear() {
        mo13468d();
        this.f12016h.clear();
        this.modCount++;
    }

    /* renamed from: j */
    public void mo13569j(C3934i iVar) {
        mo13468d();
        this.f12016h.add(iVar);
        this.modCount++;
    }

    /* renamed from: k */
    public List<?> mo13570k() {
        return Collections.unmodifiableList(this.f12016h);
    }

    /* renamed from: o */
    public C3932h0 mo13571o() {
        return mo13464r() ? new C4017t1(this) : this;
    }

    /* renamed from: p */
    public void add(int i, String str) {
        mo13468d();
        this.f12016h.add(i, str);
        this.modCount++;
    }

    /* renamed from: q */
    public Object mo13573q(int i) {
        return this.f12016h.get(i);
    }

    public int size() {
        return this.f12016h.size();
    }

    /* renamed from: t */
    public String get(int i) {
        Object obj = this.f12016h.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C3934i) {
            C3934i iVar = (C3934i) obj;
            String stringUtf8 = iVar.toStringUtf8();
            if (iVar.isValidUtf8()) {
                this.f12016h.set(i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String j = C3899b0.m16654j(bArr);
        if (C3899b0.m16651g(bArr)) {
            this.f12016h.set(i, j);
        }
        return j;
    }

    /* renamed from: u */
    public C3929g0 mo13421i(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f12016h);
            return new C3929g0((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: v */
    public String remove(int i) {
        mo13468d();
        Object remove = this.f12016h.remove(i);
        this.modCount++;
        return m16774s(remove);
    }

    /* renamed from: x */
    public String set(int i, String str) {
        mo13468d();
        return m16774s(this.f12016h.set(i, str));
    }

    public C3929g0(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        mo13468d();
        if (collection instanceof C3932h0) {
            collection = ((C3932h0) collection).mo13570k();
        }
        boolean addAll = this.f12016h.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    private C3929g0(ArrayList<Object> arrayList) {
        this.f12016h = arrayList;
    }
}
