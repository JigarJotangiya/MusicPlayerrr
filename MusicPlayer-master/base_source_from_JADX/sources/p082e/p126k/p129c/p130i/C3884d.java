package p082e.p126k.p129c.p130i;

import java.util.Map;
import p369i.p387z.p389d.C8594l;

/* renamed from: e.k.c.i.d */
/* compiled from: Preferences.kt */
public abstract class C3884d {

    /* renamed from: e.k.c.i.d$a */
    /* compiled from: Preferences.kt */
    public static final class C3885a<T> {

        /* renamed from: a */
        private final String f11971a;

        public C3885a(String str) {
            C8594l.m46771e(str, "name");
            this.f11971a = str;
        }

        /* renamed from: a */
        public final String mo13392a() {
            return this.f11971a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C3885a) {
                return C8594l.m46767a(this.f11971a, ((C3885a) obj).f11971a);
            }
            return false;
        }

        public int hashCode() {
            return this.f11971a.hashCode();
        }

        public String toString() {
            return this.f11971a;
        }
    }

    /* renamed from: e.k.c.i.d$b */
    /* compiled from: Preferences.kt */
    public static final class C3886b<T> {

        /* renamed from: a */
        private final C3885a<T> f11972a;

        /* renamed from: b */
        private final T f11973b;

        /* renamed from: a */
        public final C3885a<T> mo13396a() {
            return this.f11972a;
        }

        /* renamed from: b */
        public final T mo13397b() {
            return this.f11973b;
        }
    }

    /* renamed from: a */
    public abstract Map<C3885a<?>, Object> mo13376a();

    /* renamed from: b */
    public abstract <T> T mo13377b(C3885a<T> aVar);

    /* renamed from: c */
    public final C3878a mo13390c() {
        return new C3878a(C8468c0.m46595i(mo13376a()), false);
    }

    /* renamed from: d */
    public final C3884d mo13391d() {
        return new C3878a(C8468c0.m46595i(mo13376a()), true);
    }
}
