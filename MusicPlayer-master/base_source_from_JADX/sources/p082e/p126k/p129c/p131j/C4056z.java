package p082e.p126k.p129c.p131j;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p082e.p126k.p129c.p131j.C3893a;
import p082e.p126k.p129c.p131j.C3899b0;
import p082e.p126k.p129c.p131j.C4012s0;
import p082e.p126k.p129c.p131j.C4028v;
import p082e.p126k.p129c.p131j.C4042w1;
import p082e.p126k.p129c.p131j.C4056z;
import p082e.p126k.p129c.p131j.C4056z.C4057a;

/* renamed from: e.k.c.j.z */
/* compiled from: GeneratedMessageLite */
public abstract class C4056z<MessageType extends C4056z<MessageType, BuilderType>, BuilderType extends C4057a<MessageType, BuilderType>> extends C3893a<MessageType, BuilderType> {
    private static Map<Object, C4056z<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize = -1;
    protected C4009r1 unknownFields = C4009r1.m17523e();

    /* renamed from: e.k.c.j.z$a */
    /* compiled from: GeneratedMessageLite */
    public static abstract class C4057a<MessageType extends C4056z<MessageType, BuilderType>, BuilderType extends C4057a<MessageType, BuilderType>> extends C3893a.C3894a<MessageType, BuilderType> {

        /* renamed from: g */
        private final MessageType f12232g;

        /* renamed from: h */
        protected MessageType f12233h;

        /* renamed from: i */
        protected boolean f12234i = false;

        protected C4057a(MessageType messagetype) {
            this.f12232g = messagetype;
            this.f12233h = (C4056z) messagetype.mo14094u(C4062f.NEW_MUTABLE_INSTANCE);
        }

        /* renamed from: w */
        private void m17992w(MessageType messagetype, MessageType messagetype2) {
            C3924e1.m16737a().mo13540e(messagetype).mo13704a(messagetype, messagetype2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public /* bridge */ /* synthetic */ C3893a.C3894a mo13408l(C3893a aVar) {
            mo14102u((C4056z) aVar);
            return this;
        }

        /* renamed from: o */
        public final MessageType mo13957d() {
            MessageType q = mo13958x();
            if (q.mo13976i()) {
                return q;
            }
            throw C3893a.C3894a.m16622n(q);
        }

        /* renamed from: q */
        public MessageType mo13958x() {
            if (this.f12234i) {
                return this.f12233h;
            }
            this.f12233h.mo14086D();
            this.f12234i = true;
            return this.f12233h;
        }

        /* renamed from: r */
        public BuilderType clone() {
            BuilderType F = mo13975a().mo13955g();
            F.mo14103v(mo13958x());
            return F;
        }

        /* access modifiers changed from: protected */
        /* renamed from: s */
        public void mo14100s() {
            if (this.f12234i) {
                MessageType messagetype = (C4056z) this.f12233h.mo14094u(C4062f.NEW_MUTABLE_INSTANCE);
                m17992w(messagetype, this.f12233h);
                this.f12233h = messagetype;
                this.f12234i = false;
            }
        }

        /* renamed from: t */
        public MessageType mo13975a() {
            return this.f12232g;
        }

        /* access modifiers changed from: protected */
        /* renamed from: u */
        public BuilderType mo14102u(MessageType messagetype) {
            mo14103v(messagetype);
            return this;
        }

        /* renamed from: v */
        public BuilderType mo14103v(MessageType messagetype) {
            mo14100s();
            m17992w(this.f12233h, messagetype);
            return this;
        }
    }

    /* renamed from: e.k.c.j.z$b */
    /* compiled from: GeneratedMessageLite */
    protected static class C4058b<T extends C4056z<T, ?>> extends C3898b<T> {

        /* renamed from: a */
        private final T f12235a;

        public C4058b(T t) {
            this.f12235a = t;
        }

        /* renamed from: g */
        public T mo13465b(C3956j jVar, C4003q qVar) throws C3911c0 {
            return C4056z.m17969I(this.f12235a, jVar, qVar);
        }
    }

    /* renamed from: e.k.c.j.z$c */
    /* compiled from: GeneratedMessageLite */
    public static abstract class C4059c<MessageType extends C4059c<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends C4056z<MessageType, BuilderType> implements Object<MessageType, BuilderType> {
        protected C4028v<C4060d> extensions = C4028v.m17720h();

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public C4028v<C4060d> mo14105L() {
            if (this.extensions.mo14033o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C4012s0 mo13975a() {
            return C4056z.super.mo13975a();
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ C4012s0.C4013a mo13952b() {
            return C4056z.super.mo13952b();
        }

        /* renamed from: g */
        public /* bridge */ /* synthetic */ C4012s0.C4013a mo13955g() {
            return C4056z.super.mo13955g();
        }
    }

    /* renamed from: e.k.c.j.z$d */
    /* compiled from: GeneratedMessageLite */
    static final class C4060d implements C4028v.C4030b<C4060d> {

        /* renamed from: g */
        final C3899b0.C3903d<?> f12236g;

        /* renamed from: h */
        final int f12237h;

        /* renamed from: i */
        final C4042w1.C4044b f12238i;

        /* renamed from: j */
        final boolean f12239j;

        /* renamed from: k */
        final boolean f12240k;

        /* renamed from: c */
        public int compareTo(C4060d dVar) {
            return this.f12237h - dVar.f12237h;
        }

        /* renamed from: d */
        public C3899b0.C3903d<?> mo14108d() {
            return this.f12236g;
        }

        /* renamed from: e */
        public boolean mo14039e() {
            return this.f12239j;
        }

        /* renamed from: f */
        public C4042w1.C4044b mo14040f() {
            return this.f12238i;
        }

        public int getNumber() {
            return this.f12237h;
        }

        public boolean isPacked() {
            return this.f12240k;
        }

        /* renamed from: m */
        public C4042w1.C4049c mo14043m() {
            return this.f12238i.getJavaType();
        }

        /* renamed from: n */
        public C4012s0.C4013a mo14044n(C4012s0.C4013a aVar, C4012s0 s0Var) {
            C4057a aVar2 = (C4057a) aVar;
            aVar2.mo14103v((C4056z) s0Var);
            return aVar2;
        }
    }

    /* renamed from: e.k.c.j.z$e */
    /* compiled from: GeneratedMessageLite */
    public static class C4061e<ContainingType extends C4012s0, Type> extends C3995o<ContainingType, Type> {

        /* renamed from: a */
        final C4012s0 f12241a;

        /* renamed from: b */
        final C4060d f12242b;

        /* renamed from: a */
        public C4042w1.C4044b mo14109a() {
            return this.f12242b.mo14040f();
        }

        /* renamed from: b */
        public C4012s0 mo14110b() {
            return this.f12241a;
        }

        /* renamed from: c */
        public int mo14111c() {
            return this.f12242b.getNumber();
        }

        /* renamed from: d */
        public boolean mo14112d() {
            return this.f12242b.f12239j;
        }
    }

    /* renamed from: e.k.c.j.z$f */
    /* compiled from: GeneratedMessageLite */
    public enum C4062f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: B */
    static Object m17964B(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: C */
    protected static final <T extends C4056z<T, ?>> boolean m17965C(T t, boolean z) {
        byte byteValue = ((Byte) t.mo14094u(C4062f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = C3924e1.m16737a().mo13540e(t).mo13707d(t);
        if (z) {
            t.mo14095v(C4062f.SET_MEMOIZED_IS_INITIALIZED, d ? t : null);
        }
        return d;
    }

    /* renamed from: E */
    protected static <E> C3899b0.C3908i<E> m17966E(C3899b0.C3908i<E> iVar) {
        int size = iVar.size();
        return iVar.mo13421i(size == 0 ? 10 : size * 2);
    }

    /* renamed from: G */
    protected static Object m17967G(C4012s0 s0Var, String str, Object[] objArr) {
        return new C3930g1(s0Var, str, objArr);
    }

    /* renamed from: H */
    protected static <T extends C4056z<T, ?>> T m17968H(T t, InputStream inputStream) throws C3911c0 {
        T I = m17969I(t, C3956j.m16883f(inputStream), C4003q.m17482b());
        m17971s(I);
        return I;
    }

    /* renamed from: I */
    static <T extends C4056z<T, ?>> T m17969I(T t, C3956j jVar, C4003q qVar) throws C3911c0 {
        T t2 = (C4056z) t.mo14094u(C4062f.NEW_MUTABLE_INSTANCE);
        try {
            C3963j1 e = C3924e1.m16737a().mo13540e(t2);
            e.mo13705b(t2, C3964k.m17056P(jVar), qVar);
            e.mo13706c(t2);
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof C3911c0) {
                throw ((C3911c0) e2.getCause());
            }
            throw new C3911c0(e2.getMessage()).setUnfinishedMessage(t2);
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof C3911c0) {
                throw ((C3911c0) e3.getCause());
            }
            throw e3;
        }
    }

    /* renamed from: J */
    protected static <T extends C4056z<?, ?>> void m17970J(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    /* renamed from: s */
    private static <T extends C4056z<T, ?>> T m17971s(T t) throws C3911c0 {
        if (t == null || t.mo13976i()) {
            return t;
        }
        throw t.mo13405n().asInvalidProtocolBufferException().setUnfinishedMessage(t);
    }

    /* renamed from: y */
    protected static <E> C3899b0.C3908i<E> m17972y() {
        return C3927f1.m16761s();
    }

    /* renamed from: z */
    static <T extends C4056z<?, ?>> T m17973z(Class<T> cls) {
        T t = (C4056z) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C4056z) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = ((C4056z) C4022u1.m17644j(cls)).mo13975a();
            if (t != null) {
                defaultInstanceMap.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: A */
    public final MessageType mo13975a() {
        return (C4056z) mo14094u(C4062f.GET_DEFAULT_INSTANCE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo14086D() {
        C3924e1.m16737a().mo13540e(this).mo13706c(this);
    }

    /* renamed from: F */
    public final BuilderType mo13955g() {
        return (C4057a) mo14094u(C4062f.NEW_BUILDER);
    }

    /* renamed from: K */
    public final BuilderType mo13952b() {
        BuilderType buildertype = (C4057a) mo14094u(C4062f.NEW_BUILDER);
        buildertype.mo14103v(this);
        return buildertype;
    }

    /* renamed from: e */
    public int mo13953e() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = C3924e1.m16737a().mo13540e(this).mo13710g(this);
        }
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!mo13975a().getClass().isInstance(obj)) {
            return false;
        }
        return C3924e1.m16737a().mo13540e(this).mo13709f(this, (C4056z) obj);
    }

    /* renamed from: f */
    public void mo13954f(C3970l lVar) throws IOException {
        C3924e1.m16737a().mo13540e(this).mo13708e(this, C3979m.m17351P(lVar));
    }

    /* renamed from: h */
    public final C3909b1<MessageType> mo13956h() {
        return (C3909b1) mo14094u(C4062f.GET_PARSER);
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int i2 = C3924e1.m16737a().mo13540e(this).mo13712i(this);
        this.memoizedHashCode = i2;
        return i2;
    }

    /* renamed from: i */
    public final boolean mo13976i() {
        return m17965C(this, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo13403k() {
        return this.memoizedSerializedSize;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo13406o(int i) {
        this.memoizedSerializedSize = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Object mo14091r() throws Exception {
        return mo14094u(C4062f.BUILD_MESSAGE_INFO);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final <MessageType extends C4056z<MessageType, BuilderType>, BuilderType extends C4057a<MessageType, BuilderType>> BuilderType mo14092t() {
        return (C4057a) mo14094u(C4062f.NEW_BUILDER);
    }

    public String toString() {
        return C4021u0.m17612e(this, super.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Object mo14094u(C4062f fVar) {
        return mo13356w(fVar, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Object mo14095v(C4062f fVar, Object obj) {
        return mo13356w(fVar, obj, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract Object mo13356w(C4062f fVar, Object obj, Object obj2);
}
