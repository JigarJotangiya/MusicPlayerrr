package p402l.p406b.p426c.p429r;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p426c.C9124d;
import p402l.p406b.p426c.p431t.C9190g;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.r.i */
/* compiled from: Lyrics3Line */
public class C9154i extends C9146a {

    /* renamed from: f */
    private LinkedList<C9155j> f35783f = new LinkedList<>();

    /* renamed from: g */
    private String f35784g = BuildConfig.FLAVOR;

    public C9154i(String str, C9190g gVar) {
        super(str, gVar);
    }

    /* renamed from: c */
    public int mo31776c() {
        Iterator it = this.f35783f.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C9155j) it.next()).mo31776c();
        }
        return i + this.f35784g.length();
    }

    /* renamed from: e */
    public void mo31778e(byte[] bArr, int i) throws C9124d {
        mo31800k(bArr.toString(), i);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9154i)) {
            return false;
        }
        C9154i iVar = (C9154i) obj;
        if (this.f35784g.equals(iVar.f35784g) && this.f35783f.equals(iVar.f35783f) && super.equals(obj)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public byte[] mo31782h() {
        return C9057i.m48300c(mo31804o(), "ISO8859-1");
    }

    /* renamed from: i */
    public void mo31798i(C9155j jVar) {
        this.f35783f.add(jVar);
    }

    /* renamed from: j */
    public boolean mo31799j() {
        return !this.f35783f.isEmpty();
    }

    /* renamed from: k */
    public void mo31800k(String str, int i) {
        Objects.requireNonNull(str, "Image is null");
        if (i < 0 || i >= str.length()) {
            throw new IndexOutOfBoundsException("Offset to line is out of bounds: offset = " + i + ", line.length()" + str.length());
        }
        this.f35783f = new LinkedList<>();
        int indexOf = str.indexOf("[", i);
        while (indexOf >= 0) {
            i = str.indexOf("]", indexOf) + 1;
            C9155j jVar = new C9155j("Time Stamp");
            jVar.mo31806i(str.substring(indexOf, i));
            this.f35783f.add(jVar);
            indexOf = str.indexOf("[", i);
        }
        this.f35784g = str.substring(i);
    }

    /* renamed from: l */
    public void mo31801l(String str) {
        this.f35784g = str;
    }

    /* renamed from: m */
    public void mo31802m(C9153h hVar) {
        this.f35784g = hVar.mo31795i();
    }

    /* renamed from: n */
    public void mo31803n(C9155j jVar) {
        this.f35783f.clear();
        this.f35783f.add(jVar);
    }

    /* renamed from: o */
    public String mo31804o() {
        Iterator it = this.f35783f.iterator();
        String str = BuildConfig.FLAVOR;
        while (it.hasNext()) {
            str = str + ((C9155j) it.next()).mo31809l();
        }
        return str + this.f35784g;
    }

    public String toString() {
        Iterator it = this.f35783f.iterator();
        String str = BuildConfig.FLAVOR;
        while (it.hasNext()) {
            Object next = it.next();
            str = str + next.toString();
        }
        return "timeStamp = " + str + ", lyric = " + this.f35784g + "\n";
    }
}
