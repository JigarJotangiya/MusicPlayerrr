package p369i.p387z.p389d;

import p369i.p374d0.C8395b;
import p369i.p374d0.C8399f;

/* renamed from: i.z.d.q */
/* compiled from: PropertyReference */
public abstract class C8599q extends C8584c implements C8399f {
    public C8599q() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8599q) {
            C8599q qVar = (C8599q) obj;
            if (!getOwner().equals(qVar.getOwner()) || !getName().equals(qVar.getName()) || !getSignature().equals(qVar.getSignature()) || !C8594l.m46767a(getBoundReceiver(), qVar.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof C8399f) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public abstract /* synthetic */ C8399f.C8400a<V> getGetter();

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public boolean isConst() {
        return getReflected().isConst();
    }

    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        C8395b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public C8599q(Object obj) {
        super(obj);
    }

    /* access modifiers changed from: protected */
    public C8399f getReflected() {
        return (C8399f) super.getReflected();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8599q(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
    }
}
