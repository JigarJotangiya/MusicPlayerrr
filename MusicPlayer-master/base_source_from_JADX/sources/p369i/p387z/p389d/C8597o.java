package p369i.p387z.p389d;

import p369i.p374d0.C8395b;
import p369i.p374d0.C8401g;

/* renamed from: i.z.d.o */
/* compiled from: PropertyReference1 */
public abstract class C8597o extends C8599q implements C8401g {
    public C8597o() {
    }

    /* access modifiers changed from: protected */
    public C8395b computeReflected() {
        C8603u.m46788d(this);
        return this;
    }

    /* JADX WARN: Failed to parse method signature: (TT)TV */
    public abstract /* synthetic */ Object get(Object obj);

    public Object getDelegate(Object obj) {
        return ((C8401g) getReflected()).getDelegate(obj);
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    public C8597o(Object obj) {
        super(obj);
    }

    public C8401g.C8402a getGetter() {
        return ((C8401g) getReflected()).getGetter();
    }

    public C8597o(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
