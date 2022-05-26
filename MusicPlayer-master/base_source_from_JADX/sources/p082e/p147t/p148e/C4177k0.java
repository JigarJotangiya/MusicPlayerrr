package p082e.p147t.p148e;

import android.os.Parcelable;
import p082e.p109h.p118o.C3703i;

/* renamed from: e.t.e.k0 */
/* compiled from: StorageStrategy */
public abstract class C4177k0<K> {

    /* renamed from: e.t.e.k0$a */
    /* compiled from: StorageStrategy */
    private static class C4178a<K extends Parcelable> extends C4177k0<K> {
        C4178a(Class<K> cls) {
            super(cls);
            C3703i.m15824a(Parcelable.class.isAssignableFrom(cls));
        }
    }

    /* renamed from: e.t.e.k0$b */
    /* compiled from: StorageStrategy */
    private static class C4179b extends C4177k0<String> {
        C4179b() {
            super(String.class);
        }
    }

    public C4177k0(Class<K> cls) {
        C3703i.m15824a(cls != null);
    }

    /* renamed from: a */
    public static <K extends Parcelable> C4177k0<K> m18418a(Class<K> cls) {
        return new C4178a(cls);
    }

    /* renamed from: b */
    public static C4177k0<String> m18419b() {
        return new C4179b();
    }
}
