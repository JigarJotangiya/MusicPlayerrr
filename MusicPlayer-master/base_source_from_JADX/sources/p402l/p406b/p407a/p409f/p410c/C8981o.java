package p402l.p406b.p407a.p409f.p410c;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p402l.p406b.p407a.p409f.p411d.C9010w;
import p402l.p406b.p407a.p409f.p412e.C9014c;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.a.f.c.o */
/* compiled from: MetadataContainer */
public class C8981o extends C8970d implements C9010w {

    /* renamed from: d */
    private final C8972f f35417d;

    /* renamed from: e */
    private final Map<C8982a, List<C8984q>> f35418e;

    /* renamed from: f */
    private final C8982a f35419f;

    /* renamed from: l.b.a.f.c.o$a */
    /* compiled from: MetadataContainer */
    private static final class C8982a {

        /* renamed from: a */
        private C8984q f35420a;

        public C8982a(C8984q qVar) {
            mo31396a(qVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C8982a mo31396a(C8984q qVar) {
            this.f35420a = qVar;
            return this;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            boolean z2 = obj == this;
            if (!(obj instanceof C8982a) || z2) {
                return z2;
            }
            C8984q qVar = ((C8982a) obj).f35420a;
            boolean equals = this.f35420a.mo31423r().equals(qVar.mo31423r()) & (this.f35420a.mo31422q() == qVar.mo31422q());
            if (this.f35420a.mo31428v() != qVar.mo31428v()) {
                z = false;
            }
            return equals & z;
        }

        public int hashCode() {
            return (((this.f35420a.mo31423r().hashCode() * 31) + this.f35420a.mo31422q()) * 31) + this.f35420a.mo31428v();
        }
    }

    public C8981o(C8972f fVar, long j, BigInteger bigInteger) {
        super(fVar.getContainerGUID(), j, bigInteger);
        this.f35418e = new Hashtable();
        this.f35419f = new C8982a(new C8984q(BuildConfig.FLAVOR));
        this.f35417d = fVar;
    }

    /* renamed from: j */
    private static C8972f m48026j(C8978l lVar) throws IllegalArgumentException {
        C8972f fVar = null;
        C8972f[] values = C8972f.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            C8972f fVar2 = values[i];
            if (fVar2.getContainerGUID().equals(lVar)) {
                fVar = fVar2;
                break;
            }
            i++;
        }
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalArgumentException("Unknown metadata container specified by GUID (" + lVar.toString() + ")");
    }

    /* renamed from: a */
    public long mo31347a(OutputStream outputStream) throws IOException {
        long l = mo31348l();
        List<C8984q> n = mo31390n();
        outputStream.write(mo31326b().mo31375b());
        C9014c.m48184r(l, outputStream);
        C9014c.m48182p(n.size(), outputStream);
        for (C8984q J : n) {
            J.mo31411J(outputStream, this.f35417d);
        }
        return l;
    }

    /* renamed from: e */
    public String mo31303e(String str) {
        StringBuilder sb = new StringBuilder(super.mo31303e(str));
        for (C8984q append : mo31390n()) {
            sb.append(str);
            sb.append("  |-> ");
            sb.append(append);
            sb.append(C9014c.f35470a);
        }
        return sb.toString();
    }

    /* renamed from: g */
    public final void mo31384g(C8984q qVar) throws IllegalArgumentException {
        List list;
        this.f35417d.assertConstraints(qVar.mo31423r(), qVar.mo31425t(), qVar.mo31430y(), qVar.mo31428v(), qVar.mo31422q());
        if (mo31349r(qVar)) {
            synchronized (this.f35419f) {
                Map<C8982a, List<C8984q>> map = this.f35418e;
                C8982a aVar = this.f35419f;
                aVar.mo31396a(qVar);
                list = map.get(aVar);
            }
            if (list == null) {
                list = new ArrayList();
                this.f35418e.put(new C8982a(qVar), list);
            } else if (!list.isEmpty() && !this.f35417d.isMultiValued()) {
                throw new IllegalArgumentException("Container does not allow multiple values of descriptors with same name, language index and stream number");
            }
            list.add(qVar);
            return;
        }
        throw new IllegalArgumentException("Descriptor cannot be added, see isAddSupported(...)");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C8984q mo31385h(String str) {
        return mo31386i(str, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C8984q mo31386i(String str, int i) {
        List<C8984q> o = mo31391o(str);
        if (o != null && !o.isEmpty()) {
            return o.get(0);
        }
        C8984q qVar = new C8984q(mo31388k(), str, i);
        mo31384g(qVar);
        return qVar;
    }

    public final boolean isEmpty() {
        boolean z = true;
        if (mo31389m() != 0) {
            Iterator<C8984q> it = mo31390n().iterator();
            while (z && it.hasNext()) {
                z &= it.next().mo31431z();
            }
        }
        return z;
    }

    /* renamed from: k */
    public final C8972f mo31388k() {
        return this.f35417d;
    }

    /* renamed from: l */
    public long mo31348l() {
        long j = 26;
        for (C8984q l : mo31390n()) {
            j += (long) l.mo31420l(this.f35417d);
        }
        return j;
    }

    /* renamed from: m */
    public final int mo31389m() {
        return mo31390n().size();
    }

    /* renamed from: n */
    public final List<C8984q> mo31390n() {
        ArrayList arrayList = new ArrayList();
        for (List<C8984q> addAll : this.f35418e.values()) {
            arrayList.addAll(addAll);
        }
        return arrayList;
    }

    /* renamed from: o */
    public final List<C8984q> mo31391o(String str) {
        ArrayList arrayList = new ArrayList();
        for (List next : this.f35418e.values()) {
            if (!next.isEmpty() && ((C8984q) next.get(0)).mo31423r().equals(str)) {
                arrayList.addAll(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final String mo31392p(String str) {
        List<C8984q> o = mo31391o(str);
        return (o == null || o.isEmpty()) ? BuildConfig.FLAVOR : o.get(0).mo31429w();
    }

    /* renamed from: q */
    public final boolean mo31393q(String str) {
        return !mo31391o(str).isEmpty();
    }

    /* renamed from: r */
    public boolean mo31349r(C8984q qVar) {
        boolean z = mo31388k().checkConstraints(qVar.mo31423r(), qVar.mo31425t(), qVar.mo31430y(), qVar.mo31428v(), qVar.mo31422q()) == null;
        if (z && !mo31388k().isMultiValued()) {
            synchronized (this.f35419f) {
                Map<C8982a, List<C8984q>> map = this.f35418e;
                C8982a aVar = this.f35419f;
                aVar.mo31396a(qVar);
                List list = map.get(aVar);
                if (list != null) {
                    z = list.isEmpty();
                }
            }
        }
        return z;
    }

    /* renamed from: s */
    public final void mo31394s(String str) {
        Iterator<List<C8984q>> it = this.f35418e.values().iterator();
        while (it.hasNext()) {
            List next = it.next();
            if (!next.isEmpty() && ((C8984q) next.get(0)).mo31423r().equals(str)) {
                it.remove();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo31395t(String str, String str2) {
        mo31385h(str).mo31409H(str2);
    }

    public C8981o(C8978l lVar, long j, BigInteger bigInteger) {
        this(m48026j(lVar), j, bigInteger);
    }
}
