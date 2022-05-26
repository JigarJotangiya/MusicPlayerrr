package p394k;

import p369i.p387z.p389d.C8594l;

/* renamed from: k.s */
/* compiled from: PeekSource.kt */
public final class C8651s implements C8620a0 {

    /* renamed from: g */
    private final C8633e f34998g;

    /* renamed from: h */
    private C8656v f34999h;

    /* renamed from: i */
    private int f35000i;

    /* renamed from: j */
    private boolean f35001j;

    /* renamed from: k */
    private long f35002k;

    /* renamed from: l */
    private final C8637g f35003l;

    public C8651s(C8637g gVar) {
        C8594l.m46771e(gVar, "upstream");
        this.f35003l = gVar;
        C8633e h = gVar.mo30710h();
        this.f34998g = h;
        C8656v vVar = h.f34971g;
        this.f34999h = vVar;
        this.f35000i = vVar != null ? vVar.f35013b : -1;
    }

    public void close() {
        this.f35001j = true;
    }

    public C8622b0 timeout() {
        return this.f35003l.timeout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r5 == r6.f35013b) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo29326w0(p394k.C8633e r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            p369i.p387z.p389d.C8594l.m46771e(r9, r0)
            r0 = 0
            r1 = 0
            r3 = 1
            int r4 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r4 < 0) goto L_0x000f
            r5 = 1
            goto L_0x0010
        L_0x000f:
            r5 = 0
        L_0x0010:
            if (r5 == 0) goto L_0x0087
            boolean r5 = r8.f35001j
            r5 = r5 ^ r3
            if (r5 == 0) goto L_0x007b
            k.v r5 = r8.f34999h
            if (r5 == 0) goto L_0x002a
            k.e r6 = r8.f34998g
            k.v r6 = r6.f34971g
            if (r5 != r6) goto L_0x002b
            int r5 = r8.f35000i
            p369i.p387z.p389d.C8594l.m46769c(r6)
            int r6 = r6.f35013b
            if (r5 != r6) goto L_0x002b
        L_0x002a:
            r0 = 1
        L_0x002b:
            if (r0 == 0) goto L_0x006f
            if (r4 != 0) goto L_0x0030
            return r1
        L_0x0030:
            k.g r0 = r8.f35003l
            long r1 = r8.f35002k
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.mo30708g0(r1)
            if (r0 != 0) goto L_0x0040
            r9 = -1
            return r9
        L_0x0040:
            k.v r0 = r8.f34999h
            if (r0 != 0) goto L_0x0053
            k.e r0 = r8.f34998g
            k.v r0 = r0.f34971g
            if (r0 == 0) goto L_0x0053
            r8.f34999h = r0
            p369i.p387z.p389d.C8594l.m46769c(r0)
            int r0 = r0.f35013b
            r8.f35000i = r0
        L_0x0053:
            k.e r0 = r8.f34998g
            long r0 = r0.mo30688U0()
            long r2 = r8.f35002k
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            k.e r2 = r8.f34998g
            long r4 = r8.f35002k
            r3 = r9
            r6 = r10
            r2.mo30685T(r3, r4, r6)
            long r0 = r8.f35002k
            long r0 = r0 + r10
            r8.f35002k = r0
            return r10
        L_0x006f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x007b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0087:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p394k.C8651s.mo29326w0(k.e, long):long");
    }
}
