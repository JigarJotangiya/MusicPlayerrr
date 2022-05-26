package p369i.p371b0;

import java.io.Serializable;
import p369i.p383x.C8542b;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.b0.c */
/* compiled from: Random.kt */
public abstract class C8379c {
    public static final C8380a Default = new C8380a((C8589g) null);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8379c f34869g = C8542b.f34924a.mo30607b();

    /* renamed from: i.b0.c$a */
    /* compiled from: Random.kt */
    public static final class C8380a extends C8379c implements Serializable {

        /* renamed from: i.b0.c$a$a */
        /* compiled from: Random.kt */
        private static final class C8381a implements Serializable {
            public static final C8381a INSTANCE = new C8381a();
            private static final long serialVersionUID = 0;

            private C8381a() {
            }

            private final Object readResolve() {
                return C8379c.Default;
            }
        }

        private C8380a() {
        }

        private final Object writeReplace() {
            return C8381a.INSTANCE;
        }

        public int nextBits(int i) {
            return C8379c.f34869g.nextBits(i);
        }

        public boolean nextBoolean() {
            return C8379c.f34869g.nextBoolean();
        }

        public byte[] nextBytes(byte[] bArr) {
            C8594l.m46771e(bArr, "array");
            return C8379c.f34869g.nextBytes(bArr);
        }

        public double nextDouble() {
            return C8379c.f34869g.nextDouble();
        }

        public float nextFloat() {
            return C8379c.f34869g.nextFloat();
        }

        public int nextInt() {
            return C8379c.f34869g.nextInt();
        }

        public long nextLong() {
            return C8379c.f34869g.nextLong();
        }

        public /* synthetic */ C8380a(C8589g gVar) {
            this();
        }

        public byte[] nextBytes(int i) {
            return C8379c.f34869g.nextBytes(i);
        }

        public double nextDouble(double d) {
            return C8379c.f34869g.nextDouble(d);
        }

        public int nextInt(int i) {
            return C8379c.f34869g.nextInt(i);
        }

        public long nextLong(long j) {
            return C8379c.f34869g.nextLong(j);
        }

        public byte[] nextBytes(byte[] bArr, int i, int i2) {
            C8594l.m46771e(bArr, "array");
            return C8379c.f34869g.nextBytes(bArr, i, i2);
        }

        public double nextDouble(double d, double d2) {
            return C8379c.f34869g.nextDouble(d, d2);
        }

        public int nextInt(int i, int i2) {
            return C8379c.f34869g.nextInt(i, i2);
        }

        public long nextLong(long j, long j2) {
            return C8379c.f34869g.nextLong(j, j2);
        }
    }

    public static /* synthetic */ byte[] nextBytes$default(C8379c cVar, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return cVar.nextBytes(bArr, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
    }

    public abstract int nextBits(int i);

    public abstract boolean nextBoolean();

    public abstract byte[] nextBytes(byte[] bArr);

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] nextBytes(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            java.lang.String r0 = "array"
            p369i.p387z.p389d.C8594l.m46771e(r7, r0)
            int r0 = r7.length
            r1 = 0
            r2 = 1
            if (r8 >= 0) goto L_0x000b
            goto L_0x0015
        L_0x000b:
            if (r0 < r8) goto L_0x0015
            int r0 = r7.length
            if (r9 >= 0) goto L_0x0011
            goto L_0x0015
        L_0x0011:
            if (r0 < r9) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            java.lang.String r3 = "fromIndex ("
            if (r0 == 0) goto L_0x0084
            if (r8 > r9) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            if (r2 == 0) goto L_0x005e
            int r0 = r9 - r8
            int r0 = r0 / 4
            r2 = 0
        L_0x0025:
            if (r2 >= r0) goto L_0x0048
            int r3 = r6.nextInt()
            byte r4 = (byte) r3
            r7[r8] = r4
            int r4 = r8 + 1
            int r5 = r3 >>> 8
            byte r5 = (byte) r5
            r7[r4] = r5
            int r4 = r8 + 2
            int r5 = r3 >>> 16
            byte r5 = (byte) r5
            r7[r4] = r5
            int r4 = r8 + 3
            int r3 = r3 >>> 24
            byte r3 = (byte) r3
            r7[r4] = r3
            int r8 = r8 + 4
            int r2 = r2 + 1
            goto L_0x0025
        L_0x0048:
            int r9 = r9 - r8
            int r0 = r9 * 8
            int r0 = r6.nextBits(r0)
        L_0x004f:
            if (r1 >= r9) goto L_0x005d
            int r2 = r8 + r1
            int r3 = r1 * 8
            int r3 = r0 >>> r3
            byte r3 = (byte) r3
            r7[r2] = r3
            int r1 = r1 + 1
            goto L_0x004f
        L_0x005d:
            return r7
        L_0x005e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            r7.append(r8)
            java.lang.String r8 = ") must be not greater than toIndex ("
            r7.append(r8)
            r7.append(r9)
            java.lang.String r8 = ")."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L_0x0084:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r8)
            java.lang.String r8 = ") or toIndex ("
            r0.append(r8)
            r0.append(r9)
            java.lang.String r8 = ") are out of range: 0.."
            r0.append(r8)
            int r7 = r7.length
            r0.append(r7)
            r7 = 46
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p369i.p371b0.C8379c.nextBytes(byte[], int, int):byte[]");
    }

    public abstract double nextDouble();

    public double nextDouble(double d) {
        return nextDouble(0.0d, d);
    }

    public abstract float nextFloat();

    public abstract int nextInt();

    public abstract int nextInt(int i);

    public int nextInt(int i, int i2) {
        int i3;
        int nextInt;
        int i4;
        C8382d.m46429c(i, i2);
        int i5 = i2 - i;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                i3 = nextBits(C8382d.m46431e(i5));
            } else {
                do {
                    nextInt = nextInt() >>> 1;
                    i4 = nextInt % i5;
                } while ((nextInt - i4) + (i5 - 1) < 0);
                i3 = i4;
            }
            return i + i3;
        }
        while (true) {
            int nextInt2 = nextInt();
            if (i <= nextInt2 && i2 > nextInt2) {
                return nextInt2;
            }
        }
    }

    public abstract long nextLong();

    public long nextLong(long j) {
        return nextLong(0, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public double nextDouble(double r7, double r9) {
        /*
            r6 = this;
            p369i.p371b0.C8382d.m46428b(r7, r9)
            double r0 = r9 - r7
            boolean r2 = java.lang.Double.isInfinite(r0)
            if (r2 == 0) goto L_0x003e
            boolean r2 = java.lang.Double.isInfinite(r7)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x001b
            boolean r2 = java.lang.Double.isNaN(r7)
            if (r2 != 0) goto L_0x001b
            r2 = 1
            goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            if (r2 == 0) goto L_0x003e
            boolean r2 = java.lang.Double.isInfinite(r9)
            if (r2 != 0) goto L_0x002b
            boolean r2 = java.lang.Double.isNaN(r9)
            if (r2 != 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            if (r3 == 0) goto L_0x003e
            double r0 = r6.nextDouble()
            r2 = 2
            double r2 = (double) r2
            double r4 = r9 / r2
            double r2 = r7 / r2
            double r4 = r4 - r2
            double r0 = r0 * r4
            double r7 = r7 + r0
            double r7 = r7 + r0
            goto L_0x0045
        L_0x003e:
            double r2 = r6.nextDouble()
            double r2 = r2 * r0
            double r7 = r7 + r2
        L_0x0045:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x004f
            r7 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r7 = java.lang.Math.nextAfter(r9, r7)
        L_0x004f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p369i.p371b0.C8379c.nextDouble(double, double):double");
    }

    public long nextLong(long j, long j2) {
        long j3;
        long nextLong;
        long j4;
        int nextInt;
        C8382d.m46430d(j, j2);
        long j5 = j2 - j;
        if (j5 > 0) {
            if (((-j5) & j5) == j5) {
                int i = (int) j5;
                int i2 = (int) (j5 >>> 32);
                if (i != 0) {
                    nextInt = nextBits(C8382d.m46431e(i));
                } else if (i2 == 1) {
                    nextInt = nextInt();
                } else {
                    j3 = (((long) nextBits(C8382d.m46431e(i2))) << 32) + ((long) nextInt());
                }
                j3 = ((long) nextInt) & 4294967295L;
            } else {
                do {
                    nextLong = nextLong() >>> 1;
                    j4 = nextLong % j5;
                } while ((nextLong - j4) + (j5 - 1) < 0);
                j3 = j4;
            }
            return j + j3;
        }
        while (true) {
            long nextLong2 = nextLong();
            if (j <= nextLong2 && j2 > nextLong2) {
                return nextLong2;
            }
        }
    }

    public byte[] nextBytes(int i) {
        return nextBytes(new byte[i]);
    }
}
