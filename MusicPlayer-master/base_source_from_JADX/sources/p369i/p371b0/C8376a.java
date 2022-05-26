package p369i.p371b0;

import java.util.Random;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.b0.a */
/* compiled from: PlatformRandom.kt */
public abstract class C8376a extends C8379c {
    public abstract Random getImpl();

    public int nextBits(int i) {
        return C8382d.m46432f(getImpl().nextInt(), i);
    }

    public boolean nextBoolean() {
        return getImpl().nextBoolean();
    }

    public byte[] nextBytes(byte[] bArr) {
        C8594l.m46771e(bArr, "array");
        getImpl().nextBytes(bArr);
        return bArr;
    }

    public double nextDouble() {
        return getImpl().nextDouble();
    }

    public float nextFloat() {
        return getImpl().nextFloat();
    }

    public int nextInt() {
        return getImpl().nextInt();
    }

    public long nextLong() {
        return getImpl().nextLong();
    }

    public int nextInt(int i) {
        return getImpl().nextInt(i);
    }
}
