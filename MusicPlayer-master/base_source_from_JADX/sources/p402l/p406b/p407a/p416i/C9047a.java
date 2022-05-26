package p402l.p406b.p407a.p416i;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p402l.p406b.p426c.C9122b;
import p402l.p406b.p426c.C9123c;
import p402l.p406b.p426c.C9128h;
import p402l.p406b.p426c.C9130j;
import p402l.p406b.p426c.C9132l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.a.i.a */
/* compiled from: AbstractTag */
public abstract class C9047a implements C9130j {

    /* renamed from: g */
    protected int f35525g = 0;

    /* renamed from: h */
    protected Map<String, List<C9132l>> f35526h = new LinkedHashMap();

    /* renamed from: l.b.a.i.a$a */
    /* compiled from: AbstractTag */
    class C9048a implements Iterator<C9132l> {

        /* renamed from: g */
        private Iterator<C9132l> f35527g;

        /* renamed from: h */
        final /* synthetic */ Iterator f35528h;

        C9048a(C9047a aVar, Iterator it) {
            this.f35528h = it;
        }

        /* renamed from: a */
        private void m48253a() {
            if (this.f35528h.hasNext()) {
                this.f35527g = ((List) ((Map.Entry) this.f35528h.next()).getValue()).iterator();
            }
        }

        /* renamed from: b */
        public C9132l next() {
            if (!this.f35527g.hasNext()) {
                m48253a();
            }
            return this.f35527g.next();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
            r0 = r1.f35527g;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean hasNext() {
            /*
                r1 = this;
                java.util.Iterator<l.b.c.l> r0 = r1.f35527g
                if (r0 != 0) goto L_0x0007
                r1.m48253a()
            L_0x0007:
                java.util.Iterator r0 = r1.f35528h
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L_0x001c
                java.util.Iterator<l.b.c.l> r0 = r1.f35527g
                if (r0 == 0) goto L_0x001a
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L_0x001a
                goto L_0x001c
            L_0x001a:
                r0 = 0
                goto L_0x001d
            L_0x001c:
                r0 = 1
            L_0x001d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p402l.p406b.p407a.p416i.C9047a.C9048a.hasNext():boolean");
        }

        public void remove() {
            this.f35527g.remove();
        }
    }

    /* renamed from: b */
    public int mo31518b() {
        Iterator<C9132l> d = mo31520d();
        int i = 0;
        while (d.hasNext()) {
            i++;
            d.next();
        }
        return i;
    }

    /* renamed from: c */
    public void mo31519c(C9123c cVar, String str) throws C9128h, C9122b {
        mo31522f(mo31523g(cVar, str));
    }

    /* renamed from: d */
    public Iterator<C9132l> mo31520d() {
        return new C9048a(this, this.f35526h.entrySet().iterator());
    }

    /* renamed from: e */
    public void mo31521e(C9123c cVar, String str) throws C9128h, C9122b {
        mo31528k(mo31523g(cVar, str));
    }

    /* renamed from: f */
    public void mo31522f(C9132l lVar) {
        if (lVar != null) {
            List list = this.f35526h.get(lVar.mo31497D());
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(lVar);
                this.f35526h.put(lVar.mo31497D(), arrayList);
                if (lVar.mo31500f()) {
                    this.f35525g++;
                    return;
                }
                return;
            }
            list.add(lVar);
        }
    }

    /* renamed from: g */
    public abstract C9132l mo31523g(C9123c cVar, String str) throws C9128h, C9122b;

    /* renamed from: h */
    public void mo31524h(String str) {
        this.f35526h.remove(str);
    }

    /* renamed from: i */
    public List<C9132l> mo31525i(String str) {
        List<C9132l> list = this.f35526h.get(str);
        return list == null ? new ArrayList() : list;
    }

    public boolean isEmpty() {
        return this.f35526h.size() == 0;
    }

    /* renamed from: j */
    public String mo31527j(String str) {
        List<C9132l> i = mo31525i(str);
        return i.size() != 0 ? i.get(0).toString() : BuildConfig.FLAVOR;
    }

    /* renamed from: k */
    public void mo31528k(C9132l lVar) {
        if (lVar != null) {
            List list = this.f35526h.get(lVar.mo31497D());
            if (list != null) {
                list.set(0, lVar);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(lVar);
            this.f35526h.put(lVar.mo31497D(), arrayList);
            if (lVar.mo31500f()) {
                this.f35525g++;
            }
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Tag content:\n");
        Iterator<C9132l> d = mo31520d();
        while (d.hasNext()) {
            C9132l next = d.next();
            stringBuffer.append("\t");
            stringBuffer.append(next.mo31497D());
            stringBuffer.append(":");
            stringBuffer.append(next.toString());
            stringBuffer.append("\n");
        }
        return stringBuffer.toString().substring(0, stringBuffer.length() - 1);
    }
}
