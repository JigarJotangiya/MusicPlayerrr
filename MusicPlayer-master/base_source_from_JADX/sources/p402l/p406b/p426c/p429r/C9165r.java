package p402l.p406b.p426c.p429r;

import java.util.Map;
import p402l.p406b.p426c.p431t.C9190g;
import p402l.p406b.p426c.p439x.C9292c;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.r.r */
/* compiled from: StringHashMap */
public class C9165r extends C9164q {

    /* renamed from: f */
    Map<String, String> f35802f = null;

    /* renamed from: g */
    Map<String, String> f35803g = null;

    /* renamed from: h */
    boolean f35804h = false;

    public C9165r(String str, C9190g gVar, int i) {
        super(str, gVar, i);
        if (str.equals("Language")) {
            this.f35803g = C9292c.m49281e().mo31792c();
            this.f35802f = C9292c.m49281e().mo31790a();
            return;
        }
        throw new IllegalArgumentException("Hashmap identifier not defined in this class: " + str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9165r)) {
            return false;
        }
        C9165r rVar = (C9165r) obj;
        if (this.f35804h != rVar.f35804h) {
            return false;
        }
        Map<String, String> map = this.f35802f;
        if (map == null) {
            if (rVar.f35802f != null) {
                return false;
            }
        } else if (!map.equals(rVar.f35802f)) {
            return false;
        }
        if (this.f35802f == null) {
            if (rVar.f35802f != null) {
                return false;
            }
        } else if (!this.f35803g.equals(rVar.f35803g)) {
            return false;
        }
        return super.equals(obj);
    }

    /* renamed from: g */
    public void mo31781g(Object obj) {
        if (!(obj instanceof String)) {
            this.f35771a = obj;
        } else if (obj.equals("XXX")) {
            this.f35771a = obj.toString();
        } else {
            this.f35771a = ((String) obj).toLowerCase();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public String mo31835k() {
        return "ISO-8859-1";
    }

    public String toString() {
        Object obj = this.f35771a;
        if (obj == null || this.f35802f.get(obj) == null) {
            return BuildConfig.FLAVOR;
        }
        return this.f35802f.get(this.f35771a);
    }
}
