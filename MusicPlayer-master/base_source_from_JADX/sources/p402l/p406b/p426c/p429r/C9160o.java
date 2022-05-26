package p402l.p406b.p426c.p429r;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import p402l.p406b.p426c.p431t.C9190g;
import p402l.p406b.p441d.C9300a;

/* renamed from: l.b.c.r.o */
/* compiled from: PairedTextEncodedStringNullTerminated */
public class C9160o extends C9146a {

    /* renamed from: l.b.c.r.o$a */
    /* compiled from: PairedTextEncodedStringNullTerminated */
    public static class C9161a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public List<C9159n> f35793a = new ArrayList();

        /* renamed from: b */
        public void mo31819b(String str, String str2) {
            this.f35793a.add(new C9159n(str, str2));
        }

        /* renamed from: c */
        public List<C9159n> mo31820c() {
            return this.f35793a;
        }

        /* renamed from: d */
        public int mo31821d() {
            return this.f35793a.size();
        }

        /* renamed from: e */
        public int mo31822e() {
            return this.f35793a.size();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C9161a)) {
                return false;
            }
            return C9300a.m49298a((long) mo31822e(), (long) ((C9161a) obj).mo31822e());
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            for (C9159n next : this.f35793a) {
                stringBuffer.append(next.mo31813a() + ':' + next.mo31814b() + ',');
            }
            return stringBuffer.toString();
        }
    }

    public C9160o(String str, C9190g gVar) {
        super(str, gVar);
        this.f35771a = new C9161a();
    }

    /* renamed from: c */
    public int mo31776c() {
        return this.f35774d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007f, code lost:
        if (r6 >= r5.length) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0082, code lost:
        r1 = new p402l.p406b.p426c.p429r.C9170w(r4.f35772b, r4.f35773c);
        r1.mo31778e(r5, r6);
        r4.f35774d += r1.mo31776c();
        r1.mo31776c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009e, code lost:
        if (r1.mo31776c() == 0) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a1, code lost:
        ((p402l.p406b.p426c.p429r.C9160o.C9161a) r4.f35771a).mo31819b((java.lang.String) r0.mo31777d(), (java.lang.String) r1.mo31777d());
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x007e */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31778e(byte[] r5, int r6) throws p402l.p406b.p426c.C9124d {
        /*
            r4 = this;
            java.util.logging.Logger r0 = p402l.p406b.p426c.p429r.C9146a.f35770e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Reading PairTextEncodedStringNullTerminated from array from offset:"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.finer(r1)
        L_0x0016:
            l.b.c.r.v r0 = new l.b.c.r.v     // Catch:{ d -> 0x00b4 }
            java.lang.String r1 = r4.f35772b     // Catch:{ d -> 0x00b4 }
            l.b.c.t.g r2 = r4.f35773c     // Catch:{ d -> 0x00b4 }
            r0.<init>(r1, r2)     // Catch:{ d -> 0x00b4 }
            r0.mo31778e(r5, r6)     // Catch:{ d -> 0x00b4 }
            int r1 = r4.f35774d     // Catch:{ d -> 0x00b4 }
            int r2 = r0.mo31776c()     // Catch:{ d -> 0x00b4 }
            int r1 = r1 + r2
            r4.f35774d = r1     // Catch:{ d -> 0x00b4 }
            int r1 = r0.mo31776c()     // Catch:{ d -> 0x00b4 }
            int r6 = r6 + r1
            int r1 = r0.mo31776c()     // Catch:{ d -> 0x00b4 }
            if (r1 != 0) goto L_0x0038
            goto L_0x00b4
        L_0x0038:
            l.b.c.r.v r1 = new l.b.c.r.v     // Catch:{ d -> 0x007e }
            java.lang.String r2 = r4.f35772b     // Catch:{ d -> 0x007e }
            l.b.c.t.g r3 = r4.f35773c     // Catch:{ d -> 0x007e }
            r1.<init>(r2, r3)     // Catch:{ d -> 0x007e }
            r1.mo31778e(r5, r6)     // Catch:{ d -> 0x007e }
            int r2 = r4.f35774d     // Catch:{ d -> 0x007e }
            int r3 = r1.mo31776c()     // Catch:{ d -> 0x007e }
            int r2 = r2 + r3
            r4.f35774d = r2     // Catch:{ d -> 0x007e }
            int r2 = r1.mo31776c()     // Catch:{ d -> 0x007e }
            int r6 = r6 + r2
            int r2 = r1.mo31776c()     // Catch:{ d -> 0x007e }
            if (r2 != 0) goto L_0x0059
            goto L_0x00b4
        L_0x0059:
            java.lang.Object r2 = r4.f35771a     // Catch:{ d -> 0x007e }
            l.b.c.r.o$a r2 = (p402l.p406b.p426c.p429r.C9160o.C9161a) r2     // Catch:{ d -> 0x007e }
            java.lang.Object r3 = r0.mo31777d()     // Catch:{ d -> 0x007e }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ d -> 0x007e }
            java.lang.Object r1 = r1.mo31777d()     // Catch:{ d -> 0x007e }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ d -> 0x007e }
            r2.mo31819b(r3, r1)     // Catch:{ d -> 0x007e }
            int r0 = r4.f35774d
            if (r0 == 0) goto L_0x0071
            goto L_0x0016
        L_0x0071:
            java.util.logging.Logger r5 = p402l.p406b.p426c.p429r.C9146a.f35770e
            java.lang.String r6 = "No null terminated Strings found"
            r5.warning(r6)
            l.b.c.d r5 = new l.b.c.d
            r5.<init>((java.lang.String) r6)
            throw r5
        L_0x007e:
            int r1 = r5.length     // Catch:{ d -> 0x00b4 }
            if (r6 < r1) goto L_0x0082
            goto L_0x00b4
        L_0x0082:
            l.b.c.r.w r1 = new l.b.c.r.w     // Catch:{ d -> 0x00b4 }
            java.lang.String r2 = r4.f35772b     // Catch:{ d -> 0x00b4 }
            l.b.c.t.g r3 = r4.f35773c     // Catch:{ d -> 0x00b4 }
            r1.<init>(r2, r3)     // Catch:{ d -> 0x00b4 }
            r1.mo31778e(r5, r6)     // Catch:{ d -> 0x00b4 }
            int r5 = r4.f35774d     // Catch:{ d -> 0x00b4 }
            int r6 = r1.mo31776c()     // Catch:{ d -> 0x00b4 }
            int r5 = r5 + r6
            r4.f35774d = r5     // Catch:{ d -> 0x00b4 }
            r1.mo31776c()     // Catch:{ d -> 0x00b4 }
            int r5 = r1.mo31776c()     // Catch:{ d -> 0x00b4 }
            if (r5 != 0) goto L_0x00a1
            goto L_0x00b4
        L_0x00a1:
            java.lang.Object r5 = r4.f35771a     // Catch:{ d -> 0x00b4 }
            l.b.c.r.o$a r5 = (p402l.p406b.p426c.p429r.C9160o.C9161a) r5     // Catch:{ d -> 0x00b4 }
            java.lang.Object r6 = r0.mo31777d()     // Catch:{ d -> 0x00b4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ d -> 0x00b4 }
            java.lang.Object r0 = r1.mo31777d()     // Catch:{ d -> 0x00b4 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ d -> 0x00b4 }
            r5.mo31819b(r6, r0)     // Catch:{ d -> 0x00b4 }
        L_0x00b4:
            java.util.logging.Logger r5 = p402l.p406b.p426c.p429r.C9146a.f35770e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Read  PairTextEncodedStringNullTerminated:"
            r6.append(r0)
            java.lang.Object r0 = r4.f35771a
            r6.append(r0)
            java.lang.String r0 = " size:"
            r6.append(r0)
            int r0 = r4.f35774d
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.finer(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p402l.p406b.p426c.p429r.C9160o.mo31778e(byte[], int):void");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9160o)) {
            return false;
        }
        return C9300a.m49299b(this.f35771a, ((C9160o) obj).f35771a);
    }

    /* renamed from: h */
    public byte[] mo31782h() {
        C9146a.f35770e.finer("Writing PairTextEncodedStringNullTerminated");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            int i = 0;
            for (C9159n nVar : ((C9161a) this.f35771a).f35793a) {
                C9169v vVar = new C9169v(this.f35772b, this.f35773c, nVar.mo31813a());
                byteArrayOutputStream.write(vVar.mo31782h());
                int c = i + vVar.mo31776c();
                C9169v vVar2 = new C9169v(this.f35772b, this.f35773c, nVar.mo31814b());
                byteArrayOutputStream.write(vVar2.mo31782h());
                i = c + vVar2.mo31776c();
            }
            this.f35774d = i;
            C9146a.f35770e.finer("Written PairTextEncodedStringNullTerminated");
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            C9146a.f35770e.log(Level.SEVERE, "IOException in MultipleTextEncodedStringNullTerminated when writing byte array", e);
            throw new RuntimeException(e);
        }
    }

    /* renamed from: i */
    public boolean mo31817i() {
        for (C9159n b : ((C9161a) this.f35771a).f35793a) {
            if (!new C9169v(this.f35772b, this.f35773c, b.mo31814b()).mo31786i()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public C9161a mo31777d() {
        return (C9161a) this.f35771a;
    }
}
