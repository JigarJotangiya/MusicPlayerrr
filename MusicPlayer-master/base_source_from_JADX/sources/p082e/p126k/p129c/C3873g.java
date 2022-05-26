package p082e.p126k.p129c;

import java.util.List;
import p082e.p126k.p129c.p131j.C3893a;
import p082e.p126k.p129c.p131j.C3899b0;
import p082e.p126k.p129c.p131j.C3909b1;
import p082e.p126k.p129c.p131j.C4056z;

/* renamed from: e.k.c.g */
/* compiled from: PreferencesProto */
public final class C3873g extends C4056z<C3873g, C3874a> implements Object {
    /* access modifiers changed from: private */
    public static final C3873g DEFAULT_INSTANCE;
    private static volatile C3909b1<C3873g> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private C3899b0.C3908i<String> strings_ = C4056z.m17972y();

    /* renamed from: e.k.c.g$a */
    /* compiled from: PreferencesProto */
    public static final class C3874a extends C4056z.C4057a<C3873g, C3874a> implements Object {
        /* synthetic */ C3874a(C3869e eVar) {
            this();
        }

        /* renamed from: y */
        public C3874a mo13359y(Iterable<String> iterable) {
            mo14100s();
            ((C3873g) this.f12233h).m16536N(iterable);
            return this;
        }

        private C3874a() {
            super(C3873g.DEFAULT_INSTANCE);
        }
    }

    static {
        C3873g gVar = new C3873g();
        DEFAULT_INSTANCE = gVar;
        C4056z.m17970J(C3873g.class, gVar);
    }

    private C3873g() {
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m16536N(Iterable<String> iterable) {
        m16537O();
        C3893a.m16612j(iterable, this.strings_);
    }

    /* renamed from: O */
    private void m16537O() {
        if (!this.strings_.mo13464r()) {
            this.strings_ = C4056z.m17966E(this.strings_);
        }
    }

    /* renamed from: P */
    public static C3873g m16538P() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: R */
    public static C3874a m16539R() {
        return (C3874a) DEFAULT_INSTANCE.mo14092t();
    }

    /* renamed from: Q */
    public List<String> mo13358Q() {
        return this.strings_;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo13356w(C4056z.C4062f fVar, Object obj, Object obj2) {
        switch (C3869e.f11964a[fVar.ordinal()]) {
            case 1:
                return new C3873g();
            case 2:
                return new C3874a((C3869e) null);
            case 3:
                return C4056z.m17967G(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C3909b1<C3873g> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (C3873g.class) {
                        b1Var = PARSER;
                        if (b1Var == null) {
                            b1Var = new C4056z.C4058b<>(DEFAULT_INSTANCE);
                            PARSER = b1Var;
                        }
                    }
                }
                return b1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
