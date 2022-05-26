package p082e.p099f.p100a.p104m.p105o;

import p082e.p099f.p100a.p104m.C3524d;
import p082e.p099f.p100a.p104m.C3527e;
import p082e.p099f.p100a.p104m.C3535i;
import p082e.p099f.p100a.p104m.p105o.C3548f;
import p082e.p099f.p100a.p104m.p105o.C3562p;

/* renamed from: e.f.a.m.o.l */
/* compiled from: HorizontalWidgetRun */
public class C3555l extends C3562p {

    /* renamed from: k */
    private static int[] f11540k = new int[2];

    /* renamed from: e.f.a.m.o.l$a */
    /* compiled from: HorizontalWidgetRun */
    static /* synthetic */ class C3556a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11541a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                e.f.a.m.o.p$b[] r0 = p082e.p099f.p100a.p104m.p105o.C3562p.C3564b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11541a = r0
                e.f.a.m.o.p$b r1 = p082e.p099f.p100a.p104m.p105o.C3562p.C3564b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11541a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.f.a.m.o.p$b r1 = p082e.p099f.p100a.p104m.p105o.C3562p.C3564b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11541a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.f.a.m.o.p$b r1 = p082e.p099f.p100a.p104m.p105o.C3562p.C3564b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p099f.p100a.p104m.p105o.C3555l.C3556a.<clinit>():void");
        }
    }

    public C3555l(C3527e eVar) {
        super(eVar);
        this.f11562h.f11527e = C3548f.C3549a.LEFT;
        this.f11563i.f11527e = C3548f.C3549a.RIGHT;
        this.f11560f = 0;
    }

    /* renamed from: q */
    private void m15474q(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6 && i7 <= i7) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i6 <= i6 && i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            iArr[0] = i6;
            iArr[1] = (int) ((((float) i6) * f) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02bc, code lost:
        if (r14 != 1) goto L_0x0324;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12819a(p082e.p099f.p100a.p104m.p105o.C3546d r17) {
        /*
            r16 = this;
            r8 = r16
            int[] r0 = p082e.p099f.p100a.p104m.p105o.C3555l.C3556a.f11541a
            e.f.a.m.o.p$b r1 = r8.f11564j
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x0029
            if (r0 == r1) goto L_0x0023
            if (r0 == r2) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            e.f.a.m.e r0 = r8.f11556b
            e.f.a.m.d r1 = r0.f11339M
            e.f.a.m.d r0 = r0.f11343O
            r3 = r17
            r8.mo12860n(r3, r1, r0, r10)
            return
        L_0x0023:
            r3 = r17
            r16.mo12861o(r17)
            goto L_0x002e
        L_0x0029:
            r3 = r17
            r16.mo12862p(r17)
        L_0x002e:
            e.f.a.m.o.g r0 = r8.f11559e
            boolean r0 = r0.f11532j
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x0324
            e.f.a.m.e$b r0 = r8.f11558d
            e.f.a.m.e$b r3 = p082e.p099f.p100a.p104m.C3527e.C3529b.MATCH_CONSTRAINT
            if (r0 != r3) goto L_0x0324
            e.f.a.m.e r0 = r8.f11556b
            int r3 = r0.f11391s
            if (r3 == r1) goto L_0x0306
            if (r3 == r2) goto L_0x0046
            goto L_0x0324
        L_0x0046:
            int r1 = r0.f11393t
            r3 = -1
            if (r1 == 0) goto L_0x008f
            if (r1 != r2) goto L_0x004e
            goto L_0x008f
        L_0x004e:
            int r0 = r0.mo12718y()
            if (r0 == r3) goto L_0x0077
            if (r0 == 0) goto L_0x0068
            if (r0 == r9) goto L_0x005a
            r0 = 0
            goto L_0x0088
        L_0x005a:
            e.f.a.m.e r0 = r8.f11556b
            e.f.a.m.o.n r1 = r0.f11363e
            e.f.a.m.o.g r1 = r1.f11559e
            int r1 = r1.f11529g
            float r1 = (float) r1
            float r0 = r0.mo12716x()
            goto L_0x0084
        L_0x0068:
            e.f.a.m.e r0 = r8.f11556b
            e.f.a.m.o.n r1 = r0.f11363e
            e.f.a.m.o.g r1 = r1.f11559e
            int r1 = r1.f11529g
            float r1 = (float) r1
            float r0 = r0.mo12716x()
            float r1 = r1 / r0
            goto L_0x0086
        L_0x0077:
            e.f.a.m.e r0 = r8.f11556b
            e.f.a.m.o.n r1 = r0.f11363e
            e.f.a.m.o.g r1 = r1.f11559e
            int r1 = r1.f11529g
            float r1 = (float) r1
            float r0 = r0.mo12716x()
        L_0x0084:
            float r1 = r1 * r0
        L_0x0086:
            float r1 = r1 + r11
            int r0 = (int) r1
        L_0x0088:
            e.f.a.m.o.g r1 = r8.f11559e
            r1.mo12837d(r0)
            goto L_0x0324
        L_0x008f:
            e.f.a.m.o.n r1 = r0.f11363e
            e.f.a.m.o.f r12 = r1.f11562h
            e.f.a.m.o.f r13 = r1.f11563i
            e.f.a.m.d r1 = r0.f11339M
            e.f.a.m.d r1 = r1.f11308f
            if (r1 == 0) goto L_0x009d
            r1 = 1
            goto L_0x009e
        L_0x009d:
            r1 = 0
        L_0x009e:
            e.f.a.m.d r2 = r0.f11341N
            e.f.a.m.d r2 = r2.f11308f
            if (r2 == 0) goto L_0x00a6
            r2 = 1
            goto L_0x00a7
        L_0x00a6:
            r2 = 0
        L_0x00a7:
            e.f.a.m.d r4 = r0.f11343O
            e.f.a.m.d r4 = r4.f11308f
            if (r4 == 0) goto L_0x00af
            r4 = 1
            goto L_0x00b0
        L_0x00af:
            r4 = 0
        L_0x00b0:
            e.f.a.m.d r5 = r0.f11344P
            e.f.a.m.d r5 = r5.f11308f
            if (r5 == 0) goto L_0x00b8
            r5 = 1
            goto L_0x00b9
        L_0x00b8:
            r5 = 0
        L_0x00b9:
            int r14 = r0.mo12718y()
            if (r1 == 0) goto L_0x0200
            if (r2 == 0) goto L_0x0200
            if (r4 == 0) goto L_0x0200
            if (r5 == 0) goto L_0x0200
            e.f.a.m.e r0 = r8.f11556b
            float r15 = r0.mo12716x()
            boolean r0 = r12.f11532j
            if (r0 == 0) goto L_0x012e
            boolean r0 = r13.f11532j
            if (r0 == 0) goto L_0x012e
            e.f.a.m.o.f r0 = r8.f11562h
            boolean r1 = r0.f11525c
            if (r1 == 0) goto L_0x012d
            e.f.a.m.o.f r1 = r8.f11563i
            boolean r1 = r1.f11525c
            if (r1 != 0) goto L_0x00e0
            goto L_0x012d
        L_0x00e0:
            java.util.List<e.f.a.m.o.f> r0 = r0.f11534l
            java.lang.Object r0 = r0.get(r10)
            e.f.a.m.o.f r0 = (p082e.p099f.p100a.p104m.p105o.C3548f) r0
            int r0 = r0.f11529g
            e.f.a.m.o.f r1 = r8.f11562h
            int r1 = r1.f11528f
            int r2 = r0 + r1
            e.f.a.m.o.f r0 = r8.f11563i
            java.util.List<e.f.a.m.o.f> r0 = r0.f11534l
            java.lang.Object r0 = r0.get(r10)
            e.f.a.m.o.f r0 = (p082e.p099f.p100a.p104m.p105o.C3548f) r0
            int r0 = r0.f11529g
            e.f.a.m.o.f r1 = r8.f11563i
            int r1 = r1.f11528f
            int r3 = r0 - r1
            int r0 = r12.f11529g
            int r1 = r12.f11528f
            int r4 = r0 + r1
            int r0 = r13.f11529g
            int r1 = r13.f11528f
            int r5 = r0 - r1
            int[] r1 = f11540k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m15474q(r1, r2, r3, r4, r5, r6, r7)
            e.f.a.m.o.g r0 = r8.f11559e
            int[] r1 = f11540k
            r1 = r1[r10]
            r0.mo12837d(r1)
            e.f.a.m.e r0 = r8.f11556b
            e.f.a.m.o.n r0 = r0.f11363e
            e.f.a.m.o.g r0 = r0.f11559e
            int[] r1 = f11540k
            r1 = r1[r9]
            r0.mo12837d(r1)
        L_0x012d:
            return
        L_0x012e:
            e.f.a.m.o.f r0 = r8.f11562h
            boolean r1 = r0.f11532j
            if (r1 == 0) goto L_0x018b
            e.f.a.m.o.f r1 = r8.f11563i
            boolean r2 = r1.f11532j
            if (r2 == 0) goto L_0x018b
            boolean r2 = r12.f11525c
            if (r2 == 0) goto L_0x018a
            boolean r2 = r13.f11525c
            if (r2 != 0) goto L_0x0143
            goto L_0x018a
        L_0x0143:
            int r2 = r0.f11529g
            int r0 = r0.f11528f
            int r2 = r2 + r0
            int r0 = r1.f11529g
            int r1 = r1.f11528f
            int r3 = r0 - r1
            java.util.List<e.f.a.m.o.f> r0 = r12.f11534l
            java.lang.Object r0 = r0.get(r10)
            e.f.a.m.o.f r0 = (p082e.p099f.p100a.p104m.p105o.C3548f) r0
            int r0 = r0.f11529g
            int r1 = r12.f11528f
            int r4 = r0 + r1
            java.util.List<e.f.a.m.o.f> r0 = r13.f11534l
            java.lang.Object r0 = r0.get(r10)
            e.f.a.m.o.f r0 = (p082e.p099f.p100a.p104m.p105o.C3548f) r0
            int r0 = r0.f11529g
            int r1 = r13.f11528f
            int r5 = r0 - r1
            int[] r1 = f11540k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m15474q(r1, r2, r3, r4, r5, r6, r7)
            e.f.a.m.o.g r0 = r8.f11559e
            int[] r1 = f11540k
            r1 = r1[r10]
            r0.mo12837d(r1)
            e.f.a.m.e r0 = r8.f11556b
            e.f.a.m.o.n r0 = r0.f11363e
            e.f.a.m.o.g r0 = r0.f11559e
            int[] r1 = f11540k
            r1 = r1[r9]
            r0.mo12837d(r1)
            goto L_0x018b
        L_0x018a:
            return
        L_0x018b:
            e.f.a.m.o.f r0 = r8.f11562h
            boolean r1 = r0.f11525c
            if (r1 == 0) goto L_0x01ff
            e.f.a.m.o.f r1 = r8.f11563i
            boolean r1 = r1.f11525c
            if (r1 == 0) goto L_0x01ff
            boolean r1 = r12.f11525c
            if (r1 == 0) goto L_0x01ff
            boolean r1 = r13.f11525c
            if (r1 != 0) goto L_0x01a0
            goto L_0x01ff
        L_0x01a0:
            java.util.List<e.f.a.m.o.f> r0 = r0.f11534l
            java.lang.Object r0 = r0.get(r10)
            e.f.a.m.o.f r0 = (p082e.p099f.p100a.p104m.p105o.C3548f) r0
            int r0 = r0.f11529g
            e.f.a.m.o.f r1 = r8.f11562h
            int r1 = r1.f11528f
            int r2 = r0 + r1
            e.f.a.m.o.f r0 = r8.f11563i
            java.util.List<e.f.a.m.o.f> r0 = r0.f11534l
            java.lang.Object r0 = r0.get(r10)
            e.f.a.m.o.f r0 = (p082e.p099f.p100a.p104m.p105o.C3548f) r0
            int r0 = r0.f11529g
            e.f.a.m.o.f r1 = r8.f11563i
            int r1 = r1.f11528f
            int r3 = r0 - r1
            java.util.List<e.f.a.m.o.f> r0 = r12.f11534l
            java.lang.Object r0 = r0.get(r10)
            e.f.a.m.o.f r0 = (p082e.p099f.p100a.p104m.p105o.C3548f) r0
            int r0 = r0.f11529g
            int r1 = r12.f11528f
            int r4 = r0 + r1
            java.util.List<e.f.a.m.o.f> r0 = r13.f11534l
            java.lang.Object r0 = r0.get(r10)
            e.f.a.m.o.f r0 = (p082e.p099f.p100a.p104m.p105o.C3548f) r0
            int r0 = r0.f11529g
            int r1 = r13.f11528f
            int r5 = r0 - r1
            int[] r1 = f11540k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m15474q(r1, r2, r3, r4, r5, r6, r7)
            e.f.a.m.o.g r0 = r8.f11559e
            int[] r1 = f11540k
            r1 = r1[r10]
            r0.mo12837d(r1)
            e.f.a.m.e r0 = r8.f11556b
            e.f.a.m.o.n r0 = r0.f11363e
            e.f.a.m.o.g r0 = r0.f11559e
            int[] r1 = f11540k
            r1 = r1[r9]
            r0.mo12837d(r1)
            goto L_0x0324
        L_0x01ff:
            return
        L_0x0200:
            if (r1 == 0) goto L_0x028b
            if (r4 == 0) goto L_0x028b
            e.f.a.m.o.f r0 = r8.f11562h
            boolean r0 = r0.f11525c
            if (r0 == 0) goto L_0x028a
            e.f.a.m.o.f r0 = r8.f11563i
            boolean r0 = r0.f11525c
            if (r0 != 0) goto L_0x0212
            goto L_0x028a
        L_0x0212:
            e.f.a.m.e r0 = r8.f11556b
            float r0 = r0.mo12716x()
            e.f.a.m.o.f r1 = r8.f11562h
            java.util.List<e.f.a.m.o.f> r1 = r1.f11534l
            java.lang.Object r1 = r1.get(r10)
            e.f.a.m.o.f r1 = (p082e.p099f.p100a.p104m.p105o.C3548f) r1
            int r1 = r1.f11529g
            e.f.a.m.o.f r2 = r8.f11562h
            int r2 = r2.f11528f
            int r1 = r1 + r2
            e.f.a.m.o.f r2 = r8.f11563i
            java.util.List<e.f.a.m.o.f> r2 = r2.f11534l
            java.lang.Object r2 = r2.get(r10)
            e.f.a.m.o.f r2 = (p082e.p099f.p100a.p104m.p105o.C3548f) r2
            int r2 = r2.f11529g
            e.f.a.m.o.f r4 = r8.f11563i
            int r4 = r4.f11528f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x0266
            if (r14 == 0) goto L_0x0266
            if (r14 == r9) goto L_0x0242
            goto L_0x0324
        L_0x0242:
            int r2 = r2 - r1
            int r1 = r8.mo12856g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo12856g(r2, r9)
            if (r2 == r3) goto L_0x0256
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0256:
            e.f.a.m.o.g r0 = r8.f11559e
            r0.mo12837d(r1)
            e.f.a.m.e r0 = r8.f11556b
            e.f.a.m.o.n r0 = r0.f11363e
            e.f.a.m.o.g r0 = r0.f11559e
            r0.mo12837d(r3)
            goto L_0x0324
        L_0x0266:
            int r2 = r2 - r1
            int r1 = r8.mo12856g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo12856g(r2, r9)
            if (r2 == r3) goto L_0x027a
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x027a:
            e.f.a.m.o.g r0 = r8.f11559e
            r0.mo12837d(r1)
            e.f.a.m.e r0 = r8.f11556b
            e.f.a.m.o.n r0 = r0.f11363e
            e.f.a.m.o.g r0 = r0.f11559e
            r0.mo12837d(r3)
            goto L_0x0324
        L_0x028a:
            return
        L_0x028b:
            if (r2 == 0) goto L_0x0324
            if (r5 == 0) goto L_0x0324
            boolean r0 = r12.f11525c
            if (r0 == 0) goto L_0x0305
            boolean r0 = r13.f11525c
            if (r0 != 0) goto L_0x0298
            goto L_0x0305
        L_0x0298:
            e.f.a.m.e r0 = r8.f11556b
            float r0 = r0.mo12716x()
            java.util.List<e.f.a.m.o.f> r1 = r12.f11534l
            java.lang.Object r1 = r1.get(r10)
            e.f.a.m.o.f r1 = (p082e.p099f.p100a.p104m.p105o.C3548f) r1
            int r1 = r1.f11529g
            int r2 = r12.f11528f
            int r1 = r1 + r2
            java.util.List<e.f.a.m.o.f> r2 = r13.f11534l
            java.lang.Object r2 = r2.get(r10)
            e.f.a.m.o.f r2 = (p082e.p099f.p100a.p104m.p105o.C3548f) r2
            int r2 = r2.f11529g
            int r4 = r13.f11528f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x02e2
            if (r14 == 0) goto L_0x02bf
            if (r14 == r9) goto L_0x02e2
            goto L_0x0324
        L_0x02bf:
            int r2 = r2 - r1
            int r1 = r8.mo12856g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo12856g(r2, r10)
            if (r2 == r3) goto L_0x02d3
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02d3:
            e.f.a.m.o.g r0 = r8.f11559e
            r0.mo12837d(r3)
            e.f.a.m.e r0 = r8.f11556b
            e.f.a.m.o.n r0 = r0.f11363e
            e.f.a.m.o.g r0 = r0.f11559e
            r0.mo12837d(r1)
            goto L_0x0324
        L_0x02e2:
            int r2 = r2 - r1
            int r1 = r8.mo12856g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo12856g(r2, r10)
            if (r2 == r3) goto L_0x02f6
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02f6:
            e.f.a.m.o.g r0 = r8.f11559e
            r0.mo12837d(r3)
            e.f.a.m.e r0 = r8.f11556b
            e.f.a.m.o.n r0 = r0.f11363e
            e.f.a.m.o.g r0 = r0.f11559e
            r0.mo12837d(r1)
            goto L_0x0324
        L_0x0305:
            return
        L_0x0306:
            e.f.a.m.e r0 = r0.mo12639M()
            if (r0 == 0) goto L_0x0324
            e.f.a.m.o.l r0 = r0.f11361d
            e.f.a.m.o.g r0 = r0.f11559e
            boolean r1 = r0.f11532j
            if (r1 == 0) goto L_0x0324
            e.f.a.m.e r1 = r8.f11556b
            float r1 = r1.f11401x
            int r0 = r0.f11529g
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
            e.f.a.m.o.g r1 = r8.f11559e
            r1.mo12837d(r0)
        L_0x0324:
            e.f.a.m.o.f r0 = r8.f11562h
            boolean r1 = r0.f11525c
            if (r1 == 0) goto L_0x0446
            e.f.a.m.o.f r1 = r8.f11563i
            boolean r2 = r1.f11525c
            if (r2 != 0) goto L_0x0332
            goto L_0x0446
        L_0x0332:
            boolean r0 = r0.f11532j
            if (r0 == 0) goto L_0x0341
            boolean r0 = r1.f11532j
            if (r0 == 0) goto L_0x0341
            e.f.a.m.o.g r0 = r8.f11559e
            boolean r0 = r0.f11532j
            if (r0 == 0) goto L_0x0341
            return
        L_0x0341:
            e.f.a.m.o.g r0 = r8.f11559e
            boolean r0 = r0.f11532j
            if (r0 != 0) goto L_0x038b
            e.f.a.m.e$b r0 = r8.f11558d
            e.f.a.m.e$b r1 = p082e.p099f.p100a.p104m.C3527e.C3529b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x038b
            e.f.a.m.e r0 = r8.f11556b
            int r1 = r0.f11391s
            if (r1 != 0) goto L_0x038b
            boolean r0 = r0.mo12682h0()
            if (r0 != 0) goto L_0x038b
            e.f.a.m.o.f r0 = r8.f11562h
            java.util.List<e.f.a.m.o.f> r0 = r0.f11534l
            java.lang.Object r0 = r0.get(r10)
            e.f.a.m.o.f r0 = (p082e.p099f.p100a.p104m.p105o.C3548f) r0
            e.f.a.m.o.f r1 = r8.f11563i
            java.util.List<e.f.a.m.o.f> r1 = r1.f11534l
            java.lang.Object r1 = r1.get(r10)
            e.f.a.m.o.f r1 = (p082e.p099f.p100a.p104m.p105o.C3548f) r1
            int r0 = r0.f11529g
            e.f.a.m.o.f r2 = r8.f11562h
            int r3 = r2.f11528f
            int r0 = r0 + r3
            int r1 = r1.f11529g
            e.f.a.m.o.f r3 = r8.f11563i
            int r3 = r3.f11528f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.mo12837d(r0)
            e.f.a.m.o.f r0 = r8.f11563i
            r0.mo12837d(r1)
            e.f.a.m.o.g r0 = r8.f11559e
            r0.mo12837d(r3)
            return
        L_0x038b:
            e.f.a.m.o.g r0 = r8.f11559e
            boolean r0 = r0.f11532j
            if (r0 != 0) goto L_0x03ef
            e.f.a.m.e$b r0 = r8.f11558d
            e.f.a.m.e$b r1 = p082e.p099f.p100a.p104m.C3527e.C3529b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03ef
            int r0 = r8.f11555a
            if (r0 != r9) goto L_0x03ef
            e.f.a.m.o.f r0 = r8.f11562h
            java.util.List<e.f.a.m.o.f> r0 = r0.f11534l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03ef
            e.f.a.m.o.f r0 = r8.f11563i
            java.util.List<e.f.a.m.o.f> r0 = r0.f11534l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03ef
            e.f.a.m.o.f r0 = r8.f11562h
            java.util.List<e.f.a.m.o.f> r0 = r0.f11534l
            java.lang.Object r0 = r0.get(r10)
            e.f.a.m.o.f r0 = (p082e.p099f.p100a.p104m.p105o.C3548f) r0
            e.f.a.m.o.f r1 = r8.f11563i
            java.util.List<e.f.a.m.o.f> r1 = r1.f11534l
            java.lang.Object r1 = r1.get(r10)
            e.f.a.m.o.f r1 = (p082e.p099f.p100a.p104m.p105o.C3548f) r1
            int r0 = r0.f11529g
            e.f.a.m.o.f r2 = r8.f11562h
            int r2 = r2.f11528f
            int r0 = r0 + r2
            int r1 = r1.f11529g
            e.f.a.m.o.f r2 = r8.f11563i
            int r2 = r2.f11528f
            int r1 = r1 + r2
            int r1 = r1 - r0
            e.f.a.m.o.g r0 = r8.f11559e
            int r0 = r0.f11536m
            int r0 = java.lang.Math.min(r1, r0)
            e.f.a.m.e r1 = r8.f11556b
            int r2 = r1.f11399w
            int r1 = r1.f11397v
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03ea
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03ea:
            e.f.a.m.o.g r1 = r8.f11559e
            r1.mo12837d(r0)
        L_0x03ef:
            e.f.a.m.o.g r0 = r8.f11559e
            boolean r0 = r0.f11532j
            if (r0 != 0) goto L_0x03f6
            return
        L_0x03f6:
            e.f.a.m.o.f r0 = r8.f11562h
            java.util.List<e.f.a.m.o.f> r0 = r0.f11534l
            java.lang.Object r0 = r0.get(r10)
            e.f.a.m.o.f r0 = (p082e.p099f.p100a.p104m.p105o.C3548f) r0
            e.f.a.m.o.f r1 = r8.f11563i
            java.util.List<e.f.a.m.o.f> r1 = r1.f11534l
            java.lang.Object r1 = r1.get(r10)
            e.f.a.m.o.f r1 = (p082e.p099f.p100a.p104m.p105o.C3548f) r1
            int r2 = r0.f11529g
            e.f.a.m.o.f r3 = r8.f11562h
            int r3 = r3.f11528f
            int r2 = r2 + r3
            int r3 = r1.f11529g
            e.f.a.m.o.f r4 = r8.f11563i
            int r4 = r4.f11528f
            int r3 = r3 + r4
            e.f.a.m.e r4 = r8.f11556b
            float r4 = r4.mo12615A()
            if (r0 != r1) goto L_0x0426
            int r2 = r0.f11529g
            int r3 = r1.f11529g
            r4 = 1056964608(0x3f000000, float:0.5)
        L_0x0426:
            int r3 = r3 - r2
            e.f.a.m.o.g r0 = r8.f11559e
            int r0 = r0.f11529g
            int r3 = r3 - r0
            e.f.a.m.o.f r0 = r8.f11562h
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.mo12837d(r1)
            e.f.a.m.o.f r0 = r8.f11563i
            e.f.a.m.o.f r1 = r8.f11562h
            int r1 = r1.f11529g
            e.f.a.m.o.g r2 = r8.f11559e
            int r2 = r2.f11529g
            int r1 = r1 + r2
            r0.mo12837d(r1)
        L_0x0446:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p099f.p100a.p104m.p105o.C3555l.mo12819a(e.f.a.m.o.d):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo12820d() {
        C3527e M;
        C3527e M2;
        C3527e eVar = this.f11556b;
        if (eVar.f11355a) {
            this.f11559e.mo12837d(eVar.mo12657V());
        }
        if (!this.f11559e.f11532j) {
            C3527e.C3529b C = this.f11556b.mo12619C();
            this.f11558d = C;
            if (C != C3527e.C3529b.MATCH_CONSTRAINT) {
                C3527e.C3529b bVar = C3527e.C3529b.MATCH_PARENT;
                if (C == bVar && (M2 = this.f11556b.mo12639M()) != null && (M2.mo12619C() == C3527e.C3529b.FIXED || M2.mo12619C() == bVar)) {
                    int V = (M2.mo12657V() - this.f11556b.f11339M.mo12598f()) - this.f11556b.f11343O.mo12598f();
                    mo12854b(this.f11562h, M2.f11361d.f11562h, this.f11556b.f11339M.mo12598f());
                    mo12854b(this.f11563i, M2.f11361d.f11563i, -this.f11556b.f11343O.mo12598f());
                    this.f11559e.mo12837d(V);
                    return;
                } else if (this.f11558d == C3527e.C3529b.FIXED) {
                    this.f11559e.mo12837d(this.f11556b.mo12657V());
                }
            }
        } else {
            C3527e.C3529b bVar2 = this.f11558d;
            C3527e.C3529b bVar3 = C3527e.C3529b.MATCH_PARENT;
            if (bVar2 == bVar3 && (M = this.f11556b.mo12639M()) != null && (M.mo12619C() == C3527e.C3529b.FIXED || M.mo12619C() == bVar3)) {
                mo12854b(this.f11562h, M.f11361d.f11562h, this.f11556b.f11339M.mo12598f());
                mo12854b(this.f11563i, M.f11361d.f11563i, -this.f11556b.f11343O.mo12598f());
                return;
            }
        }
        C3550g gVar = this.f11559e;
        if (gVar.f11532j) {
            C3527e eVar2 = this.f11556b;
            if (eVar2.f11355a) {
                C3524d[] dVarArr = eVar2.f11349U;
                if (dVarArr[0].f11308f == null || dVarArr[1].f11308f == null) {
                    if (dVarArr[0].f11308f != null) {
                        C3548f h = mo12857h(dVarArr[0]);
                        if (h != null) {
                            mo12854b(this.f11562h, h, this.f11556b.f11349U[0].mo12598f());
                            mo12854b(this.f11563i, this.f11562h, this.f11559e.f11529g);
                            return;
                        }
                        return;
                    } else if (dVarArr[1].f11308f != null) {
                        C3548f h2 = mo12857h(dVarArr[1]);
                        if (h2 != null) {
                            mo12854b(this.f11563i, h2, -this.f11556b.f11349U[1].mo12598f());
                            mo12854b(this.f11562h, this.f11563i, -this.f11559e.f11529g);
                            return;
                        }
                        return;
                    } else if (!(eVar2 instanceof C3535i) && eVar2.mo12639M() != null && this.f11556b.mo12702q(C3524d.C3526b.CENTER).f11308f == null) {
                        mo12854b(this.f11562h, this.f11556b.mo12639M().f11361d.f11562h, this.f11556b.mo12659W());
                        mo12854b(this.f11563i, this.f11562h, this.f11559e.f11529g);
                        return;
                    } else {
                        return;
                    }
                } else if (eVar2.mo12682h0()) {
                    this.f11562h.f11528f = this.f11556b.f11349U[0].mo12598f();
                    this.f11563i.f11528f = -this.f11556b.f11349U[1].mo12598f();
                    return;
                } else {
                    C3548f h3 = mo12857h(this.f11556b.f11349U[0]);
                    if (h3 != null) {
                        mo12854b(this.f11562h, h3, this.f11556b.f11349U[0].mo12598f());
                    }
                    C3548f h4 = mo12857h(this.f11556b.f11349U[1]);
                    if (h4 != null) {
                        mo12854b(this.f11563i, h4, -this.f11556b.f11349U[1].mo12598f());
                    }
                    this.f11562h.f11524b = true;
                    this.f11563i.f11524b = true;
                    return;
                }
            }
        }
        if (this.f11558d == C3527e.C3529b.MATCH_CONSTRAINT) {
            C3527e eVar3 = this.f11556b;
            int i = eVar3.f11391s;
            if (i == 2) {
                C3527e M3 = eVar3.mo12639M();
                if (M3 != null) {
                    C3550g gVar2 = M3.f11363e.f11559e;
                    this.f11559e.f11534l.add(gVar2);
                    gVar2.f11533k.add(this.f11559e);
                    C3550g gVar3 = this.f11559e;
                    gVar3.f11524b = true;
                    gVar3.f11533k.add(this.f11562h);
                    this.f11559e.f11533k.add(this.f11563i);
                }
            } else if (i == 3) {
                if (eVar3.f11393t == 3) {
                    this.f11562h.f11523a = this;
                    this.f11563i.f11523a = this;
                    C3558n nVar = eVar3.f11363e;
                    nVar.f11562h.f11523a = this;
                    nVar.f11563i.f11523a = this;
                    gVar.f11523a = this;
                    if (eVar3.mo12687j0()) {
                        this.f11559e.f11534l.add(this.f11556b.f11363e.f11559e);
                        this.f11556b.f11363e.f11559e.f11533k.add(this.f11559e);
                        C3558n nVar2 = this.f11556b.f11363e;
                        nVar2.f11559e.f11523a = this;
                        this.f11559e.f11534l.add(nVar2.f11562h);
                        this.f11559e.f11534l.add(this.f11556b.f11363e.f11563i);
                        this.f11556b.f11363e.f11562h.f11533k.add(this.f11559e);
                        this.f11556b.f11363e.f11563i.f11533k.add(this.f11559e);
                    } else if (this.f11556b.mo12682h0()) {
                        this.f11556b.f11363e.f11559e.f11534l.add(this.f11559e);
                        this.f11559e.f11533k.add(this.f11556b.f11363e.f11559e);
                    } else {
                        this.f11556b.f11363e.f11559e.f11534l.add(this.f11559e);
                    }
                } else {
                    C3550g gVar4 = eVar3.f11363e.f11559e;
                    gVar.f11534l.add(gVar4);
                    gVar4.f11533k.add(this.f11559e);
                    this.f11556b.f11363e.f11562h.f11533k.add(this.f11559e);
                    this.f11556b.f11363e.f11563i.f11533k.add(this.f11559e);
                    C3550g gVar5 = this.f11559e;
                    gVar5.f11524b = true;
                    gVar5.f11533k.add(this.f11562h);
                    this.f11559e.f11533k.add(this.f11563i);
                    this.f11562h.f11534l.add(this.f11559e);
                    this.f11563i.f11534l.add(this.f11559e);
                }
            }
        }
        C3527e eVar4 = this.f11556b;
        C3524d[] dVarArr2 = eVar4.f11349U;
        if (dVarArr2[0].f11308f == null || dVarArr2[1].f11308f == null) {
            if (dVarArr2[0].f11308f != null) {
                C3548f h5 = mo12857h(dVarArr2[0]);
                if (h5 != null) {
                    mo12854b(this.f11562h, h5, this.f11556b.f11349U[0].mo12598f());
                    mo12855c(this.f11563i, this.f11562h, 1, this.f11559e);
                }
            } else if (dVarArr2[1].f11308f != null) {
                C3548f h6 = mo12857h(dVarArr2[1]);
                if (h6 != null) {
                    mo12854b(this.f11563i, h6, -this.f11556b.f11349U[1].mo12598f());
                    mo12855c(this.f11562h, this.f11563i, -1, this.f11559e);
                }
            } else if (!(eVar4 instanceof C3535i) && eVar4.mo12639M() != null) {
                mo12854b(this.f11562h, this.f11556b.mo12639M().f11361d.f11562h, this.f11556b.mo12659W());
                mo12855c(this.f11563i, this.f11562h, 1, this.f11559e);
            }
        } else if (eVar4.mo12682h0()) {
            this.f11562h.f11528f = this.f11556b.f11349U[0].mo12598f();
            this.f11563i.f11528f = -this.f11556b.f11349U[1].mo12598f();
        } else {
            C3548f h7 = mo12857h(this.f11556b.f11349U[0]);
            C3548f h8 = mo12857h(this.f11556b.f11349U[1]);
            if (h7 != null) {
                h7.mo12835b(this);
            }
            if (h8 != null) {
                h8.mo12835b(this);
            }
            this.f11564j = C3562p.C3564b.CENTER;
        }
    }

    /* renamed from: e */
    public void mo12821e() {
        C3548f fVar = this.f11562h;
        if (fVar.f11532j) {
            this.f11556b.mo12688j1(fVar.f11529g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo12822f() {
        this.f11557c = null;
        this.f11562h.mo12836c();
        this.f11563i.mo12836c();
        this.f11559e.mo12836c();
        this.f11561g = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo12824m() {
        if (this.f11558d != C3527e.C3529b.MATCH_CONSTRAINT || this.f11556b.f11391s == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo12839r() {
        this.f11561g = false;
        this.f11562h.mo12836c();
        this.f11562h.f11532j = false;
        this.f11563i.mo12836c();
        this.f11563i.f11532j = false;
        this.f11559e.f11532j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f11556b.mo12712v();
    }
}
