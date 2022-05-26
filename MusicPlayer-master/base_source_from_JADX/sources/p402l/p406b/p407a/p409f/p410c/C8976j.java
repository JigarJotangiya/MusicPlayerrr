package p402l.p406b.p407a.p409f.p410c;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import p402l.p406b.p407a.p409f.p412e.C9014c;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.a.f.c.j */
/* compiled from: EncryptionChunk */
public class C8976j extends C8970d {

    /* renamed from: d */
    private String f35384d = BuildConfig.FLAVOR;

    /* renamed from: e */
    private String f35385e = BuildConfig.FLAVOR;

    /* renamed from: f */
    private String f35386f = BuildConfig.FLAVOR;

    /* renamed from: g */
    private String f35387g = BuildConfig.FLAVOR;

    /* renamed from: h */
    private final ArrayList<String> f35388h = new ArrayList<>();

    public C8976j(BigInteger bigInteger) {
        super(C8978l.f35395g, bigInteger);
    }

    /* renamed from: e */
    public String mo31303e(String str) {
        StringBuilder sb = new StringBuilder(super.mo31303e(str));
        StringBuilder sb2 = new StringBuilder();
        String str2 = C9014c.f35470a;
        sb2.append(str2);
        sb2.append(str);
        sb2.append(" Encryption:");
        sb2.append(str2);
        sb.insert(0, sb2.toString());
        sb.append(str);
        sb.append("\t|->keyID ");
        sb.append(this.f35384d);
        sb.append(str2);
        sb.append(str);
        sb.append("\t|->secretData ");
        sb.append(this.f35387g);
        sb.append(str2);
        sb.append(str);
        sb.append("\t|->protectionType ");
        sb.append(this.f35386f);
        sb.append(str2);
        sb.append(str);
        sb.append("\t|->licenseURL ");
        sb.append(this.f35385e);
        sb.append(str2);
        this.f35388h.iterator();
        Iterator<String> it = this.f35388h.iterator();
        while (it.hasNext()) {
            sb.append(str);
            sb.append("   |->");
            sb.append(it.next());
            sb.append(C9014c.f35470a);
        }
        return sb.toString();
    }

    /* renamed from: g */
    public void mo31367g(String str) {
        this.f35384d = str;
    }

    /* renamed from: h */
    public void mo31368h(String str) {
        this.f35385e = str;
    }

    /* renamed from: i */
    public void mo31369i(String str) {
        this.f35386f = str;
    }

    /* renamed from: j */
    public void mo31370j(String str) {
        this.f35387g = str;
    }
}
