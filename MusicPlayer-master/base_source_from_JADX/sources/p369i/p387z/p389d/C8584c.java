package p369i.p387z.p389d;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import p369i.p374d0.C8395b;
import p369i.p374d0.C8397d;
import p369i.p374d0.C8403h;
import p369i.p374d0.C8404i;
import p369i.p387z.C8558b;

/* renamed from: i.z.d.c */
/* compiled from: CallableReference */
public abstract class C8584c implements C8395b, Serializable {
    public static final Object NO_RECEIVER = C8585a.f34928g;

    /* renamed from: g */
    private transient C8395b f34927g;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    /* renamed from: i.z.d.c$a */
    /* compiled from: CallableReference */
    private static class C8585a implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C8585a f34928g = new C8585a();

        private C8585a() {
        }

        private Object readResolve() throws ObjectStreamException {
            return f34928g;
        }
    }

    public C8584c() {
        this(NO_RECEIVER);
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public C8395b compute() {
        C8395b bVar = this.f34927g;
        if (bVar != null) {
            return bVar;
        }
        C8395b computeReflected = computeReflected();
        this.f34927g = computeReflected;
        return computeReflected;
    }

    /* access modifiers changed from: protected */
    public abstract C8395b computeReflected();

    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public C8397d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? C8603u.m46787c(cls) : C8603u.m46786b(cls);
    }

    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    /* access modifiers changed from: protected */
    public C8395b getReflected() {
        C8395b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new C8558b();
    }

    public C8403h getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    public C8404i getVisibility() {
        return getReflected().getVisibility();
    }

    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    public boolean isFinal() {
        return getReflected().isFinal();
    }

    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    protected C8584c(Object obj) {
        this(obj, (Class) null, (String) null, (String) null, false);
    }

    protected C8584c(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}
