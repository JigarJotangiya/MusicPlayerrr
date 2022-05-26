package p369i.p387z.p389d;

import p369i.p374d0.C8395b;
import p369i.p374d0.C8398e;

/* renamed from: i.z.d.i */
/* compiled from: FunctionReference */
public class C8591i extends C8584c implements C8590h, C8398e {
    private final int arity;
    private final int flags;

    public C8591i(int i) {
        this(i, C8584c.NO_RECEIVER, (Class) null, (String) null, (String) null, 0);
    }

    /* access modifiers changed from: protected */
    public C8395b computeReflected() {
        C8603u.m46785a(this);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8591i) {
            C8591i iVar = (C8591i) obj;
            if (!C8594l.m46767a(getOwner(), iVar.getOwner()) || !getName().equals(iVar.getName()) || !getSignature().equals(iVar.getSignature()) || this.flags != iVar.flags || this.arity != iVar.arity || !C8594l.m46767a(getBoundReceiver(), iVar.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof C8398e) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public boolean isExternal() {
        return getReflected().isExternal();
    }

    public boolean isInfix() {
        return getReflected().isInfix();
    }

    public boolean isInline() {
        return getReflected().isInline();
    }

    public boolean isOperator() {
        return getReflected().isOperator();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        C8395b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public C8591i(int i, Object obj) {
        this(i, obj, (Class) null, (String) null, (String) null, 0);
    }

    /* access modifiers changed from: protected */
    public C8398e getReflected() {
        return (C8398e) super.getReflected();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8591i(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
