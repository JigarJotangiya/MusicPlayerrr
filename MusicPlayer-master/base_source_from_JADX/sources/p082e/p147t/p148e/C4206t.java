package p082e.p147t.p148e;

import p082e.p109h.p118o.C3703i;

/* renamed from: e.t.e.t */
/* compiled from: ItemKeyProvider */
public abstract class C4206t<K> {

    /* renamed from: a */
    private final int f12583a;

    protected C4206t(int i) {
        boolean z = true;
        if (!(i == 0 || i == 1)) {
            z = false;
        }
        C3703i.m15824a(z);
        this.f12583a = i;
    }

    /* renamed from: a */
    public abstract K mo10099a(int i);

    /* renamed from: b */
    public abstract int mo10100b(K k);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo14394c(int i) {
        return i == this.f12583a;
    }
}
