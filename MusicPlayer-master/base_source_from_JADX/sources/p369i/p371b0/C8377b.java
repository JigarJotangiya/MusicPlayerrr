package p369i.p371b0;

import java.util.Random;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.b0.b */
/* compiled from: PlatformRandom.kt */
public final class C8377b extends C8376a {

    /* renamed from: h */
    private final C8378a f34868h = new C8378a();

    /* renamed from: i.b0.b$a */
    /* compiled from: PlatformRandom.kt */
    public static final class C8378a extends ThreadLocal<Random> {
        C8378a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    public Random getImpl() {
        Object obj = this.f34868h.get();
        C8594l.m46770d(obj, "implStorage.get()");
        return (Random) obj;
    }
}
