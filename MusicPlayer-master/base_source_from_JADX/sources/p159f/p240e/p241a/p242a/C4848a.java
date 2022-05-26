package p159f.p240e.p241a.p242a;

import java.util.Comparator;
import java.util.List;
import p402l.p403a.p405b.C8940a;
import p402l.p403a.p405b.C8941b;

/* renamed from: f.e.a.a.a */
/* compiled from: Engine */
final class C4848a {

    /* renamed from: a */
    static final C4849a f13665a = new C4849a();

    /* renamed from: f.e.a.a.a$a */
    /* compiled from: Engine */
    static final class C4849a implements Comparator<C8940a> {
        C4849a() {
        }

        /* renamed from: a */
        public int compare(C8940a aVar, C8940a aVar2) {
            if (aVar.mo31259g() == aVar2.mo31259g()) {
                if (aVar.mo31256c() < aVar2.mo31256c()) {
                    return 1;
                }
                if (aVar.mo31256c() == aVar2.mo31256c()) {
                    return 0;
                }
                return -1;
            } else if (aVar.mo31259g() < aVar2.mo31259g()) {
                return -1;
            } else {
                if (aVar.mo31259g() == aVar2.mo31259g()) {
                    return 0;
                }
                return 1;
            }
        }
    }

    /* renamed from: a */
    static String m20492a(String str, C8941b bVar, List<Object> list, String str2, C4855g gVar) {
        if (str == null || str.length() == 0) {
            return str;
        }
        if (bVar == null || gVar == null) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < str.length(); i++) {
                stringBuffer.append(C4850b.m20497d(str.charAt(i)));
                if (i != str.length() - 1) {
                    stringBuffer.append(str2);
                }
            }
            return stringBuffer.toString();
        }
        bVar.mo31263a(str);
        throw null;
    }
}
