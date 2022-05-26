package p082e.p126k.p129c;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import p082e.p126k.p129c.p131j.C3909b1;
import p082e.p126k.p129c.p131j.C3976l0;
import p082e.p126k.p129c.p131j.C3981m0;
import p082e.p126k.p129c.p131j.C4042w1;
import p082e.p126k.p129c.p131j.C4056z;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: e.k.c.f */
/* compiled from: PreferencesProto */
public final class C3870f extends C4056z<C3870f, C3871a> implements Object {
    /* access modifiers changed from: private */
    public static final C3870f DEFAULT_INSTANCE;
    private static volatile C3909b1<C3870f> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private C3981m0<String, C3875h> preferences_ = C3981m0.emptyMapField();

    /* renamed from: e.k.c.f$a */
    /* compiled from: PreferencesProto */
    public static final class C3871a extends C4056z.C4057a<C3870f, C3871a> implements Object {
        /* synthetic */ C3871a(C3869e eVar) {
            this();
        }

        /* renamed from: y */
        public C3871a mo13357y(String str, C3875h hVar) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(hVar);
            mo14100s();
            ((C3870f) this.f12233h).m16526N().put(str, hVar);
            return this;
        }

        private C3871a() {
            super(C3870f.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: e.k.c.f$b */
    /* compiled from: PreferencesProto */
    private static final class C3872b {

        /* renamed from: a */
        static final C3976l0<String, C3875h> f11965a = C3976l0.m17290d(C4042w1.C4044b.STRING, BuildConfig.FLAVOR, C4042w1.C4044b.MESSAGE, C3875h.m16551U());
    }

    static {
        C3870f fVar = new C3870f();
        DEFAULT_INSTANCE = fVar;
        C4056z.m17970J(C3870f.class, fVar);
    }

    private C3870f() {
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public Map<String, C3875h> m16526N() {
        return m16527P();
    }

    /* renamed from: P */
    private C3981m0<String, C3875h> m16527P() {
        if (!this.preferences_.isMutable()) {
            this.preferences_ = this.preferences_.mutableCopy();
        }
        return this.preferences_;
    }

    /* renamed from: Q */
    private C3981m0<String, C3875h> m16528Q() {
        return this.preferences_;
    }

    /* renamed from: R */
    public static C3871a m16529R() {
        return (C3871a) DEFAULT_INSTANCE.mo14092t();
    }

    /* renamed from: S */
    public static C3870f m16530S(InputStream inputStream) throws IOException {
        return (C3870f) C4056z.m17968H(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: O */
    public Map<String, C3875h> mo13355O() {
        return Collections.unmodifiableMap(m16528Q());
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo13356w(C4056z.C4062f fVar, Object obj, Object obj2) {
        switch (C3869e.f11964a[fVar.ordinal()]) {
            case 1:
                return new C3870f();
            case 2:
                return new C3871a((C3869e) null);
            case 3:
                return C4056z.m17967G(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", C3872b.f11965a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C3909b1<C3870f> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (C3870f.class) {
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
