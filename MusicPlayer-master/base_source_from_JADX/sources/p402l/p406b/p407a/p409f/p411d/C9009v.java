package p402l.p406b.p407a.p409f.p411d;

import p402l.p406b.p407a.p409f.p410c.C8978l;

/* renamed from: l.b.a.f.d.v */
/* compiled from: StreamChunkReader */
public class C9009v implements C8995h {

    /* renamed from: a */
    private static final C8978l[] f35468a = {C8978l.f35406r};

    protected C9009v() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: l.b.a.f.c.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: l.b.a.f.c.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: l.b.a.f.c.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: l.b.a.f.c.t} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p402l.p406b.p407a.p409f.p410c.C8970d mo31459a(p402l.p406b.p407a.p409f.p410c.C8978l r25, java.io.InputStream r26, long r27) throws java.io.IOException {
        /*
            r24 = this;
            r0 = r26
            java.math.BigInteger r1 = p402l.p406b.p407a.p409f.p412e.C9014c.m48174h(r26)
            l.b.a.f.c.l r2 = p402l.p406b.p407a.p409f.p412e.C9014c.m48178l(r26)
            l.b.a.f.c.l r3 = p402l.p406b.p407a.p409f.p410c.C8978l.f35393e
            boolean r4 = r3.equals(r2)
            if (r4 != 0) goto L_0x001e
            l.b.a.f.c.l r4 = p402l.p406b.p407a.p409f.p410c.C8978l.f35410v
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x001b
            goto L_0x001e
        L_0x001b:
            r0 = 0
            goto L_0x0107
        L_0x001e:
            l.b.a.f.c.l r4 = p402l.p406b.p407a.p409f.p412e.C9014c.m48178l(r26)
            long r5 = p402l.p406b.p407a.p409f.p412e.C9014c.m48181o(r26)
            long r7 = p402l.p406b.p407a.p409f.p412e.C9014c.m48180n(r26)
            long r9 = p402l.p406b.p407a.p409f.p412e.C9014c.m48180n(r26)
            int r11 = p402l.p406b.p407a.p409f.p412e.C9014c.m48179m(r26)
            r12 = r11 & 127(0x7f, float:1.78E-43)
            r13 = 32768(0x8000, float:4.5918E-41)
            r11 = r11 & r13
            if (r11 == 0) goto L_0x003c
            r11 = 1
            goto L_0x003d
        L_0x003c:
            r11 = 0
        L_0x003d:
            r13 = 4
            r0.skip(r13)
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x009f
            l.b.a.f.c.c r2 = new l.b.a.f.c.c
            r2.<init>(r1)
            int r3 = p402l.p406b.p407a.p409f.p412e.C9014c.m48179m(r26)
            long r13 = (long) r3
            int r3 = p402l.p406b.p407a.p409f.p412e.C9014c.m48179m(r26)
            r15 = r5
            long r5 = (long) r3
            r17 = r7
            long r7 = p402l.p406b.p407a.p409f.p412e.C9014c.m48180n(r26)
            r19 = r9
            long r9 = p402l.p406b.p407a.p409f.p412e.C9014c.m48180n(r26)
            int r3 = p402l.p406b.p407a.p409f.p412e.C9014c.m48179m(r26)
            r21 = r11
            r25 = r12
            long r11 = (long) r3
            int r3 = p402l.p406b.p407a.p409f.p412e.C9014c.m48179m(r26)
            r22 = r15
            int r15 = p402l.p406b.p407a.p409f.p412e.C9014c.m48179m(r26)
            r16 = r1
            byte[] r1 = new byte[r15]
            r0.read(r1)
            r2.mo31313C(r13)
            r2.mo31311A(r5)
            r2.mo31315E(r7)
            r2.mo31323x(r9)
            r2.mo31314D(r4)
            r2.mo31325z(r11)
            r2.mo31324y(r3)
            r2.mo31312B(r1)
            int r15 = r15 + 18
            long r3 = (long) r15
            r5 = r25
            r1 = r2
            r2 = r16
            goto L_0x00dc
        L_0x009f:
            r16 = r1
            r22 = r5
            r17 = r7
            r19 = r9
            r21 = r11
            r25 = r12
            l.b.a.f.c.t r1 = new l.b.a.f.c.t
            r2 = r16
            r1.<init>(r2)
            long r3 = p402l.p406b.p407a.p409f.p412e.C9014c.m48180n(r26)
            long r5 = p402l.p406b.p407a.p409f.p412e.C9014c.m48180n(r26)
            r7 = 1
            r0.skip(r7)
            r7 = 2
            r0.skip(r7)
            r7 = 16
            r0.skip(r7)
            r7 = 4
            byte[] r7 = new byte[r7]
            r0.read(r7)
            r1.mo31449w(r3)
            r1.mo31448v(r5)
            r1.mo31447u(r7)
            r3 = 31
            r5 = r25
        L_0x00dc:
            r1.mo31439m(r5)
            r5 = r19
            r1.mo31440n(r5)
            r5 = r17
            r1.mo31442p(r5)
            r5 = r22
            r1.mo31441o(r5)
            r11 = r21
            r1.mo31438l(r11)
            r5 = r27
            r1.mo31329f(r5)
            long r5 = r2.longValue()
            r7 = 24
            long r5 = r5 - r7
            long r5 = r5 - r3
            r2 = 54
            long r5 = r5 - r2
            r0.skip(r5)
            r0 = r1
        L_0x0107:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p402l.p406b.p407a.p409f.p411d.C9009v.mo31459a(l.b.a.f.c.l, java.io.InputStream, long):l.b.a.f.c.d");
    }

    /* renamed from: b */
    public C8978l[] mo31452b() {
        return (C8978l[]) f35468a.clone();
    }

    /* renamed from: c */
    public boolean mo31453c() {
        return true;
    }
}
