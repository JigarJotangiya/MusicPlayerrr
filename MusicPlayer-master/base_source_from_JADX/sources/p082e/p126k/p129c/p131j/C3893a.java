package p082e.p126k.p129c.p131j;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p082e.p126k.p129c.p131j.C3893a;
import p082e.p126k.p129c.p131j.C3893a.C3894a;
import p082e.p126k.p129c.p131j.C3934i;
import p082e.p126k.p129c.p131j.C4012s0;

/* renamed from: e.k.c.j.a */
/* compiled from: AbstractMessageLite */
public abstract class C3893a<MessageType extends C3893a<MessageType, BuilderType>, BuilderType extends C3894a<MessageType, BuilderType>> implements C4012s0 {
    protected int memoizedHashCode = 0;

    /* renamed from: e.k.c.j.a$a */
    /* compiled from: AbstractMessageLite */
    public static abstract class C3894a<MessageType extends C3893a<MessageType, BuilderType>, BuilderType extends C3894a<MessageType, BuilderType>> implements C4012s0.C4013a {
        /* renamed from: j */
        protected static <T> void m16620j(Iterable<T> iterable, List<? super T> list) {
            C3899b0.m16645a(iterable);
            if (iterable instanceof C3932h0) {
                List<?> k = ((C3932h0) iterable).mo13570k();
                C3932h0 h0Var = (C3932h0) list;
                int size = list.size();
                for (Object next : k) {
                    if (next == null) {
                        String str = "Element at index " + (h0Var.size() - size) + " is null.";
                        for (int size2 = h0Var.size() - 1; size2 >= size; size2--) {
                            h0Var.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (next instanceof C3934i) {
                        h0Var.mo13569j((C3934i) next);
                    } else {
                        h0Var.add((String) next);
                    }
                }
            } else if (iterable instanceof C3913c1) {
                list.addAll((Collection) iterable);
            } else {
                m16621k(iterable, list);
            }
        }

        /* renamed from: k */
        private static <T> void m16621k(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T next : iterable) {
                if (next == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(next);
            }
        }

        /* renamed from: n */
        protected static C4002p1 m16622n(C4012s0 s0Var) {
            return new C4002p1(s0Var);
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public abstract BuilderType mo13408l(MessageType messagetype);

        /* renamed from: m */
        public BuilderType mo13409m(C4012s0 s0Var) {
            if (mo13975a().getClass().isInstance(s0Var)) {
                mo13408l((C3893a) s0Var);
                return this;
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        /* renamed from: p */
        public /* bridge */ /* synthetic */ C4012s0.C4013a mo13410p(C4012s0 s0Var) {
            mo13409m(s0Var);
            return this;
        }
    }

    /* renamed from: j */
    protected static <T> void m16612j(Iterable<T> iterable, List<? super T> list) {
        C3894a.m16620j(iterable, list);
    }

    /* renamed from: m */
    private String m16613m(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* renamed from: c */
    public C3934i mo13402c() {
        try {
            C3934i.C3942h newCodedBuilder = C3934i.newCodedBuilder(mo13953e());
            mo13954f(newCodedBuilder.mo13618b());
            return newCodedBuilder.mo13617a();
        } catch (IOException e) {
            throw new RuntimeException(m16613m("ByteString"), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo13403k() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo13404l(C3963j1 j1Var) {
        int k = mo13403k();
        if (k != -1) {
            return k;
        }
        int g = j1Var.mo13710g(this);
        mo13406o(g);
        return g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C4002p1 mo13405n() {
        return new C4002p1((C4012s0) this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo13406o(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: q */
    public void mo13407q(OutputStream outputStream) throws IOException {
        C3970l g0 = C3970l.m17150g0(outputStream, C3970l.m17126J(mo13953e()));
        mo13954f(g0);
        g0.mo13746d0();
    }
}
