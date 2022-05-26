package p082e.p126k.p129c.p131j;

/* renamed from: e.k.c.j.k0 */
/* compiled from: ManifestSchemaFactory */
final class C3966k0 implements C3969k1 {

    /* renamed from: b */
    private static final C4008r0 f12089b = new C3967a();

    /* renamed from: a */
    private final C4008r0 f12090a;

    /* renamed from: e.k.c.j.k0$a */
    /* compiled from: ManifestSchemaFactory */
    static class C3967a implements C4008r0 {
        C3967a() {
        }

        /* renamed from: a */
        public C4005q0 mo13715a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        /* renamed from: b */
        public boolean mo13716b(Class<?> cls) {
            return false;
        }
    }

    /* renamed from: e.k.c.j.k0$b */
    /* compiled from: ManifestSchemaFactory */
    private static class C3968b implements C4008r0 {

        /* renamed from: a */
        private C4008r0[] f12091a;

        C3968b(C4008r0... r0VarArr) {
            this.f12091a = r0VarArr;
        }

        /* renamed from: a */
        public C4005q0 mo13715a(Class<?> cls) {
            for (C4008r0 r0Var : this.f12091a) {
                if (r0Var.mo13716b(cls)) {
                    return r0Var.mo13715a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        /* renamed from: b */
        public boolean mo13716b(Class<?> cls) {
            for (C4008r0 b : this.f12091a) {
                if (b.mo13716b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C3966k0() {
        this(m17107b());
    }

    /* renamed from: b */
    private static C4008r0 m17107b() {
        return new C3968b(C4054y.m17960c(), m17108c());
    }

    /* renamed from: c */
    private static C4008r0 m17108c() {
        try {
            return (C4008r0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f12089b;
        }
    }

    /* renamed from: d */
    private static boolean m17109d(C4005q0 q0Var) {
        return q0Var.mo13583c() == C3916d1.PROTO2;
    }

    /* renamed from: e */
    private static <T> C3963j1<T> m17110e(Class<T> cls, C4005q0 q0Var) {
        if (C4056z.class.isAssignableFrom(cls)) {
            if (m17109d(q0Var)) {
                return C4031v0.m17759N(cls, q0Var, C4063z0.m18021b(), C3947i0.m16853b(), C3978l1.m17306M(), C4015t.m17591b(), C4001p0.m17479b());
            }
            return C4031v0.m17759N(cls, q0Var, C4063z0.m18021b(), C3947i0.m16853b(), C3978l1.m17306M(), (C4007r<?>) null, C4001p0.m17479b());
        } else if (m17109d(q0Var)) {
            return C4031v0.m17759N(cls, q0Var, C4063z0.m18020a(), C3947i0.m16852a(), C3978l1.m17301H(), C4015t.m17590a(), C4001p0.m17478a());
        } else {
            return C4031v0.m17759N(cls, q0Var, C4063z0.m18020a(), C3947i0.m16852a(), C3978l1.m17302I(), (C4007r<?>) null, C4001p0.m17478a());
        }
    }

    /* renamed from: a */
    public <T> C3963j1<T> mo13714a(Class<T> cls) {
        C3978l1.m17303J(cls);
        C4005q0 a = this.f12090a.mo13715a(cls);
        if (!a.mo13581a()) {
            return m17110e(cls, a);
        }
        if (C4056z.class.isAssignableFrom(cls)) {
            return C4041w0.m17890l(C3978l1.m17306M(), C4015t.m17591b(), a.mo13582b());
        }
        return C4041w0.m17890l(C3978l1.m17301H(), C4015t.m17590a(), a.mo13582b());
    }

    private C3966k0(C4008r0 r0Var) {
        C3899b0.m16646b(r0Var, "messageInfoFactory");
        this.f12090a = r0Var;
    }
}
