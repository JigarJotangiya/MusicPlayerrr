package p369i.p371b0.p372e;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import p369i.p371b0.C8376a;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.b0.e.a */
/* compiled from: PlatformThreadLocalRandom.kt */
public final class C8383a extends C8376a {
    public Random getImpl() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        C8594l.m46770d(current, "ThreadLocalRandom.current()");
        return current;
    }

    public double nextDouble(double d) {
        return ThreadLocalRandom.current().nextDouble(d);
    }

    public int nextInt(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    public long nextLong(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    public long nextLong(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }
}
