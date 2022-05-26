package p082e.p126k.p129c;

import java.util.Objects;
import p082e.p126k.p129c.C3873g;
import p082e.p126k.p129c.p131j.C3909b1;
import p082e.p126k.p129c.p131j.C4056z;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: e.k.c.h */
/* compiled from: PreferencesProto */
public final class C3875h extends C4056z<C3875h, C3876a> implements Object {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final C3875h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile C3909b1<C3875h> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    /* renamed from: e.k.c.h$a */
    /* compiled from: PreferencesProto */
    public static final class C3876a extends C4056z.C4057a<C3875h, C3876a> implements Object {
        /* synthetic */ C3876a(C3869e eVar) {
            this();
        }

        /* renamed from: A */
        public C3876a mo13368A(float f) {
            mo14100s();
            ((C3875h) this.f12233h).m16555f0(f);
            return this;
        }

        /* renamed from: B */
        public C3876a mo13369B(int i) {
            mo14100s();
            ((C3875h) this.f12233h).m16556g0(i);
            return this;
        }

        /* renamed from: C */
        public C3876a mo13370C(long j) {
            mo14100s();
            ((C3875h) this.f12233h).m16557h0(j);
            return this;
        }

        /* renamed from: D */
        public C3876a mo13371D(String str) {
            mo14100s();
            ((C3875h) this.f12233h).m16558i0(str);
            return this;
        }

        /* renamed from: E */
        public C3876a mo13372E(C3873g.C3874a aVar) {
            mo14100s();
            ((C3875h) this.f12233h).m16559j0(aVar);
            return this;
        }

        /* renamed from: y */
        public C3876a mo13373y(boolean z) {
            mo14100s();
            ((C3875h) this.f12233h).m16553d0(z);
            return this;
        }

        /* renamed from: z */
        public C3876a mo13374z(double d) {
            mo14100s();
            ((C3875h) this.f12233h).m16554e0(d);
            return this;
        }

        private C3876a() {
            super(C3875h.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: e.k.c.h$b */
    /* compiled from: PreferencesProto */
    public enum C3877b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        VALUE_NOT_SET(0);
        
        private final int value;

        private C3877b(int i) {
            this.value = i;
        }

        public static C3877b forNumber(int i) {
            switch (i) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static C3877b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        C3875h hVar = new C3875h();
        DEFAULT_INSTANCE = hVar;
        C4056z.m17970J(C3875h.class, hVar);
    }

    private C3875h() {
    }

    /* renamed from: U */
    public static C3875h m16551U() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: c0 */
    public static C3876a m16552c0() {
        return (C3876a) DEFAULT_INSTANCE.mo14092t();
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m16553d0(boolean z) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m16554e0(double d) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d);
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public void m16555f0(float f) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f);
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m16556g0(int i) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void m16557h0(long j) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j);
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m16558i0(String str) {
        Objects.requireNonNull(str);
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public void m16559j0(C3873g.C3874a aVar) {
        this.value_ = aVar.mo13957d();
        this.valueCase_ = 6;
    }

    /* renamed from: T */
    public boolean mo13360T() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    /* renamed from: V */
    public double mo13361V() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    /* renamed from: W */
    public float mo13362W() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    /* renamed from: X */
    public int mo13363X() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    /* renamed from: Y */
    public long mo13364Y() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0;
    }

    /* renamed from: Z */
    public String mo13365Z() {
        return this.valueCase_ == 5 ? (String) this.value_ : BuildConfig.FLAVOR;
    }

    /* renamed from: a0 */
    public C3873g mo13366a0() {
        if (this.valueCase_ == 6) {
            return (C3873g) this.value_;
        }
        return C3873g.m16538P();
    }

    /* renamed from: b0 */
    public C3877b mo13367b0() {
        return C3877b.forNumber(this.valueCase_);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo13356w(C4056z.C4062f fVar, Object obj, Object obj2) {
        switch (C3869e.f11964a[fVar.ordinal()]) {
            case 1:
                return new C3875h();
            case 2:
                return new C3876a((C3869e) null);
            case 3:
                return C4056z.m17967G(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", C3873g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C3909b1<C3875h> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (C3875h.class) {
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
