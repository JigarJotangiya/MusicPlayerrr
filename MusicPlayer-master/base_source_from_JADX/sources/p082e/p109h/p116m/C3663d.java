package p082e.p109h.p116m;

import android.util.Base64;
import java.util.List;
import p082e.p109h.p118o.C3703i;

/* renamed from: e.h.m.d */
/* compiled from: FontRequest */
public final class C3663d {

    /* renamed from: a */
    private final String f11633a;

    /* renamed from: b */
    private final String f11634b;

    /* renamed from: c */
    private final String f11635c;

    /* renamed from: d */
    private final List<List<byte[]>> f11636d;

    /* renamed from: e */
    private final int f11637e = 0;

    /* renamed from: f */
    private final String f11638f;

    public C3663d(String str, String str2, String str3, List<List<byte[]>> list) {
        C3703i.m15827d(str);
        this.f11633a = str;
        C3703i.m15827d(str2);
        this.f11634b = str2;
        C3703i.m15827d(str3);
        this.f11635c = str3;
        C3703i.m15827d(list);
        this.f11636d = list;
        this.f11638f = m15730a(str, str2, str3);
    }

    /* renamed from: a */
    private String m15730a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    /* renamed from: b */
    public List<List<byte[]>> mo12930b() {
        return this.f11636d;
    }

    /* renamed from: c */
    public int mo12931c() {
        return this.f11637e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo12932d() {
        return this.f11638f;
    }

    /* renamed from: e */
    public String mo12933e() {
        return this.f11633a;
    }

    /* renamed from: f */
    public String mo12934f() {
        return this.f11634b;
    }

    /* renamed from: g */
    public String mo12935g() {
        return this.f11635c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f11633a + ", mProviderPackage: " + this.f11634b + ", mQuery: " + this.f11635c + ", mCertificates:");
        for (int i = 0; i < this.f11636d.size(); i++) {
            sb.append(" [");
            List list = this.f11636d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f11637e);
        return sb.toString();
    }
}
