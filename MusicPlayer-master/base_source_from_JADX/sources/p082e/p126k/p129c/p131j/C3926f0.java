package p082e.p126k.p129c.p131j;

/* renamed from: e.k.c.j.f0 */
/* compiled from: LazyFieldLite */
public class C3926f0 {

    /* renamed from: a */
    private C3934i f12005a;

    /* renamed from: b */
    private C4003q f12006b;

    /* renamed from: c */
    protected volatile C4012s0 f12007c;

    /* renamed from: d */
    private volatile C3934i f12008d;

    static {
        C4003q.m17482b();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r3.f12007c = r4;
        r3.f12008d = p082e.p126k.p129c.p131j.C3934i.EMPTY;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13556a(p082e.p126k.p129c.p131j.C4012s0 r4) {
        /*
            r3 = this;
            e.k.c.j.s0 r0 = r3.f12007c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            e.k.c.j.s0 r0 = r3.f12007c     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            return
        L_0x000c:
            e.k.c.j.i r0 = r3.f12005a     // Catch:{ c0 -> 0x002c }
            if (r0 == 0) goto L_0x0025
            e.k.c.j.b1 r0 = r4.mo13956h()     // Catch:{ c0 -> 0x002c }
            e.k.c.j.i r1 = r3.f12005a     // Catch:{ c0 -> 0x002c }
            e.k.c.j.q r2 = r3.f12006b     // Catch:{ c0 -> 0x002c }
            java.lang.Object r0 = r0.mo13457a(r1, r2)     // Catch:{ c0 -> 0x002c }
            e.k.c.j.s0 r0 = (p082e.p126k.p129c.p131j.C4012s0) r0     // Catch:{ c0 -> 0x002c }
            r3.f12007c = r0     // Catch:{ c0 -> 0x002c }
            e.k.c.j.i r0 = r3.f12005a     // Catch:{ c0 -> 0x002c }
            r3.f12008d = r0     // Catch:{ c0 -> 0x002c }
            goto L_0x0032
        L_0x0025:
            r3.f12007c = r4     // Catch:{ c0 -> 0x002c }
            e.k.c.j.i r0 = p082e.p126k.p129c.p131j.C3934i.EMPTY     // Catch:{ c0 -> 0x002c }
            r3.f12008d = r0     // Catch:{ c0 -> 0x002c }
            goto L_0x0032
        L_0x002c:
            r3.f12007c = r4     // Catch:{ all -> 0x0034 }
            e.k.c.j.i r4 = p082e.p126k.p129c.p131j.C3934i.EMPTY     // Catch:{ all -> 0x0034 }
            r3.f12008d = r4     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C3926f0.mo13556a(e.k.c.j.s0):void");
    }

    /* renamed from: b */
    public int mo13557b() {
        if (this.f12008d != null) {
            return this.f12008d.size();
        }
        C3934i iVar = this.f12005a;
        if (iVar != null) {
            return iVar.size();
        }
        if (this.f12007c != null) {
            return this.f12007c.mo13953e();
        }
        return 0;
    }

    /* renamed from: c */
    public C4012s0 mo13558c(C4012s0 s0Var) {
        mo13556a(s0Var);
        return this.f12007c;
    }

    /* renamed from: d */
    public C4012s0 mo13559d(C4012s0 s0Var) {
        C4012s0 s0Var2 = this.f12007c;
        this.f12005a = null;
        this.f12008d = null;
        this.f12007c = s0Var;
        return s0Var2;
    }

    /* renamed from: e */
    public C3934i mo13560e() {
        if (this.f12008d != null) {
            return this.f12008d;
        }
        C3934i iVar = this.f12005a;
        if (iVar != null) {
            return iVar;
        }
        synchronized (this) {
            if (this.f12008d != null) {
                C3934i iVar2 = this.f12008d;
                return iVar2;
            }
            if (this.f12007c == null) {
                this.f12008d = C3934i.EMPTY;
            } else {
                this.f12008d = this.f12007c.mo13402c();
            }
            C3934i iVar3 = this.f12008d;
            return iVar3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3926f0)) {
            return false;
        }
        C3926f0 f0Var = (C3926f0) obj;
        C4012s0 s0Var = this.f12007c;
        C4012s0 s0Var2 = f0Var.f12007c;
        if (s0Var == null && s0Var2 == null) {
            return mo13560e().equals(f0Var.mo13560e());
        }
        if (s0Var != null && s0Var2 != null) {
            return s0Var.equals(s0Var2);
        }
        if (s0Var != null) {
            return s0Var.equals(f0Var.mo13558c(s0Var.mo13975a()));
        }
        return mo13558c(s0Var2.mo13975a()).equals(s0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
