package p402l.p406b.p426c.p434u;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p402l.p406b.p426c.p429r.C9153h;
import p402l.p406b.p426c.p429r.C9154i;
import p402l.p406b.p426c.p429r.C9155j;
import p402l.p406b.p426c.p431t.p432k0.C9211i;
import p402l.p406b.p426c.p431t.p432k0.C9227y;

/* renamed from: l.b.c.u.i */
/* compiled from: FieldFrameBodyLYR */
public class C9264i extends C9257b {

    /* renamed from: j */
    private ArrayList<C9154i> f35961j = new ArrayList<>();

    public C9264i() {
    }

    /* renamed from: x */
    private void m49198x(String str) {
        int indexOf = str.indexOf(C9268m.f35966i);
        this.f35961j = new ArrayList<>();
        int i = 0;
        while (indexOf >= 0) {
            String substring = str.substring(i, indexOf);
            C9154i iVar = new C9154i("Lyric Line", this);
            iVar.mo31801l(substring);
            this.f35961j.add(iVar);
            String str2 = C9268m.f35966i;
            int length = indexOf + str2.length();
            int indexOf2 = str.indexOf(str2, length);
            i = length;
            indexOf = indexOf2;
        }
        if (i < str.length()) {
            String substring2 = str.substring(i);
            C9154i iVar2 = new C9154i("Lyric Line", this);
            iVar2.mo31801l(substring2);
            this.f35961j.add(iVar2);
        }
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C9264i) && this.f35961j.equals(((C9264i) obj).f35961j) && super.equals(obj)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public String mo31857g() {
        return "LYR";
    }

    /* renamed from: h */
    public int mo31919h() {
        Iterator<C9154i> it = this.f35961j.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().mo31776c() + 2;
        }
        return i;
    }

    /* renamed from: p */
    public Iterator<C9154i> mo31944p() {
        return this.f35961j.iterator();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo31948t() {
    }

    public String toString() {
        String str = mo31857g() + " : ";
        Iterator<C9154i> it = this.f35961j.iterator();
        while (it.hasNext()) {
            C9154i next = it.next();
            str = str + next.toString();
        }
        return str;
    }

    /* renamed from: u */
    public void mo32094u(C9211i iVar) {
        Iterator p = iVar.mo31944p();
        HashMap hashMap = new HashMap();
        while (p.hasNext()) {
            C9153h hVar = new C9153h((C9153h) p.next());
            C9155j jVar = new C9155j("Time Stamp", this);
            jVar.mo31808k(hVar.mo31796j(), (byte) iVar.mo31988x());
            if (hashMap.containsKey(hVar.mo31795i())) {
                ((C9154i) hashMap.get(hVar.mo31795i())).mo31798i(jVar);
            } else {
                C9154i iVar2 = new C9154i("Lyric Line", this);
                iVar2.mo31802m(hVar);
                iVar2.mo31803n(jVar);
                hashMap.put(hVar.mo31795i(), iVar2);
                this.f35961j.add(iVar2);
            }
        }
    }

    /* renamed from: v */
    public void mo32095v(C9227y yVar) {
        C9154i iVar = new C9154i("Lyric Line", this);
        iVar.mo31801l(yVar.mo32027A());
        this.f35961j.add(iVar);
    }

    /* renamed from: w */
    public boolean mo32096w() {
        Iterator<C9154i> it = this.f35961j.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().mo31799j()) {
                z = true;
            }
        }
        return z;
    }

    public C9264i(String str) {
        m49198x(str);
    }
}
