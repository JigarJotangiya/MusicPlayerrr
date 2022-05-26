package p369i.p387z.p389d;

import p369i.p374d0.C8396c;
import p369i.p374d0.C8397d;
import p369i.p374d0.C8398e;
import p369i.p374d0.C8401g;

/* renamed from: i.z.d.v */
/* compiled from: ReflectionFactory */
public class C8604v {
    /* renamed from: a */
    public C8398e mo30639a(C8591i iVar) {
        return iVar;
    }

    /* renamed from: b */
    public C8396c mo30640b(Class cls) {
        return new C8587e(cls);
    }

    /* renamed from: c */
    public C8397d mo30641c(Class cls, String str) {
        return new C8596n(cls, str);
    }

    /* renamed from: d */
    public C8401g mo30642d(C8597o oVar) {
        return oVar;
    }

    /* renamed from: e */
    public String mo30643e(C8590h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    /* renamed from: f */
    public String mo30644f(C8595m mVar) {
        return mo30643e(mVar);
    }
}
