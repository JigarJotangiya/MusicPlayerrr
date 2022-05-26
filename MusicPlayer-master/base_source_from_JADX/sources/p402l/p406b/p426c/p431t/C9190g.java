package p402l.p406b.p426c.p431t;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import p402l.p406b.p426c.p429r.C9146a;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.t.g */
/* compiled from: AbstractTagFrameBody */
public abstract class C9190g extends C9192h {

    /* renamed from: h */
    private C9188f f35859h;

    /* renamed from: i */
    protected ArrayList<C9146a> f35860i = new ArrayList<>();

    protected C9190g() {
        mo31948t();
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C9190g) && this.f35860i.equals(((C9190g) obj).f35860i) && super.equals(obj)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public int mo31919h() {
        ListIterator<C9146a> listIterator = this.f35860i.listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            i += listIterator.next().mo31776c();
        }
        return i;
    }

    /* renamed from: j */
    public String mo31938j() {
        Iterator<C9146a> it = this.f35860i.iterator();
        String str = BuildConfig.FLAVOR;
        while (it.hasNext()) {
            C9146a next = it.next();
            if (next.toString() != null && next.toString().length() > 0) {
                str = str + next.mo31775b() + "=\"" + next.toString() + "\"; ";
            }
        }
        return str;
    }

    /* renamed from: k */
    public C9188f mo31939k() {
        return this.f35859h;
    }

    /* renamed from: l */
    public final C9146a mo31940l(String str) {
        ListIterator<C9146a> listIterator = this.f35860i.listIterator();
        while (listIterator.hasNext()) {
            C9146a next = listIterator.next();
            if (next.mo31775b().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: m */
    public final Object mo31941m(String str) {
        return mo31940l(str).mo31777d();
    }

    /* renamed from: n */
    public final byte mo31942n() {
        C9146a l = mo31940l("TextEncoding");
        if (l != null) {
            return ((Long) l.mo31777d()).byteValue();
        }
        return 0;
    }

    /* renamed from: o */
    public String mo31943o() {
        return toString();
    }

    /* renamed from: p */
    public Iterator mo31944p() {
        return this.f35860i.iterator();
    }

    /* renamed from: q */
    public void mo31945q(C9188f fVar) {
        this.f35859h = fVar;
    }

    /* renamed from: r */
    public final void mo31946r(String str, Object obj) {
        ListIterator<C9146a> listIterator = this.f35860i.listIterator();
        while (listIterator.hasNext()) {
            C9146a next = listIterator.next();
            if (next.mo31775b().equals(str)) {
                next.mo31781g(obj);
            }
        }
    }

    /* renamed from: s */
    public final void mo31947s(byte b) {
        mo31946r("TextEncoding", Byte.valueOf(b));
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract void mo31948t();

    public String toString() {
        return mo31938j();
    }

    protected C9190g(C9190g gVar) {
        for (int i = 0; i < gVar.f35860i.size(); i++) {
            C9146a aVar = (C9146a) C9238m.m49067f(gVar.f35860i.get(i));
            aVar.mo31780f(this);
            this.f35860i.add(aVar);
        }
    }
}
