package p402l.p406b.p407a.p409f.p411d;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p402l.p406b.p407a.p409f.p410c.C8978l;
import p402l.p406b.p407a.p409f.p412e.C9014c;

/* renamed from: l.b.a.f.d.a */
/* compiled from: AsfExtHeaderModifier */
public class C8988a implements C8994g {

    /* renamed from: a */
    private final List<C8994g> f35441a;

    public C8988a(List<C8994g> list) {
        this.f35441a = new ArrayList(list);
    }

    /* renamed from: c */
    private void m48093c(C8978l lVar, InputStream inputStream, OutputStream outputStream) throws IOException {
        long o = C9014c.m48181o(inputStream);
        outputStream.write(lVar.mo31375b());
        C9014c.m48184r(o, outputStream);
        C9014c.m48167a(inputStream, outputStream, o - 24);
    }

    /* renamed from: a */
    public boolean mo31450a(C8978l lVar) {
        return C8978l.f35401m.equals(lVar);
    }

    /* renamed from: b */
    public C9005r mo31451b(C8978l lVar, InputStream inputStream, OutputStream outputStream) throws IOException {
        OutputStream outputStream2 = outputStream;
        long j = 0;
        ArrayList<C8994g> arrayList = new ArrayList<>(this.f35441a);
        HashSet hashSet = new HashSet();
        hashSet.add(lVar);
        BigInteger h = C9014c.m48174h(inputStream);
        C8978l l = C9014c.m48178l(inputStream);
        int m = C9014c.m48179m(inputStream);
        long n = C9014c.m48180n(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C8998k kVar = new C8998k(inputStream);
        while (true) {
            if (kVar.mo31464d() >= n) {
                break;
            }
            C8978l l2 = C9014c.m48178l(kVar);
            long j2 = n;
            boolean z = false;
            for (int i = 0; i < arrayList.size() && !z; i++) {
                if (((C8994g) arrayList.get(i)).mo31450a(l2)) {
                    C9005r b = ((C8994g) arrayList.get(i)).mo31451b(l2, kVar, byteArrayOutputStream);
                    j += b.mo31473a();
                    hashSet.addAll(b.mo31475c());
                    arrayList.remove(i);
                    z = true;
                }
            }
            if (!z) {
                hashSet.add(l2);
                m48093c(l2, kVar, byteArrayOutputStream);
            }
            n = j2;
        }
        long j3 = n;
        for (C8994g b2 : arrayList) {
            C9005r b3 = b2.mo31451b((C8978l) null, (InputStream) null, byteArrayOutputStream);
            j += b3.mo31473a();
            hashSet.addAll(b3.mo31475c());
        }
        outputStream2.write(C8978l.f35401m.mo31375b());
        C9014c.m48184r(h.add(BigInteger.valueOf(j)).longValue(), outputStream2);
        outputStream2.write(l.mo31375b());
        C9014c.m48182p(m, outputStream2);
        C9014c.m48183q(j3 + j, outputStream2);
        outputStream2.write(byteArrayOutputStream.toByteArray());
        return new C9005r(0, j, (Set<C8978l>) hashSet);
    }
}
