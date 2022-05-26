package p402l.p406b.p426c.p429r;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p402l.p406b.p426c.p431t.C9190g;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.r.u */
/* compiled from: TCONString */
public class C9168u extends C9170w {

    /* renamed from: f */
    private boolean f35805f = true;

    public C9168u(String str, C9190g gVar) {
        super(str, gVar);
    }

    /* renamed from: w */
    public static List<String> m48709w(String str) {
        List<String> asList = Arrays.asList(str.replaceAll("(\\(\\d+\\)|\\(RX\\)|\\(CR\\)\\w*)", "$1\u0000").split("\u0000"));
        if (asList.size() != 0) {
            return asList;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(BuildConfig.FLAVOR);
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9168u) && super.equals(obj);
    }

    /* renamed from: m */
    public String mo31838m(int i) {
        return mo31840t().get(i);
    }

    /* renamed from: n */
    public String mo31839n() {
        List<String> t = mo31840t();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < t.size(); i++) {
            if (i != 0) {
                stringBuffer.append("\u0000");
            }
            stringBuffer.append(t.get(i));
        }
        return stringBuffer.toString();
    }

    /* renamed from: t */
    public List<String> mo31840t() {
        if (mo31841u()) {
            return C9170w.m48719o((String) this.f35771a);
        }
        return m48709w((String) this.f35771a);
    }

    /* renamed from: u */
    public boolean mo31841u() {
        return this.f35805f;
    }

    /* renamed from: v */
    public void mo31842v(boolean z) {
        this.f35805f = z;
    }
}
