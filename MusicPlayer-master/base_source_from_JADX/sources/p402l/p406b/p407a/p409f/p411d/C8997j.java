package p402l.p406b.p407a.p409f.p411d;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import p402l.p406b.p407a.p409f.p410c.C8970d;
import p402l.p406b.p407a.p409f.p410c.C8974h;
import p402l.p406b.p407a.p409f.p410c.C8978l;
import p402l.p406b.p407a.p409f.p412e.C9014c;

/* renamed from: l.b.a.f.d.j */
/* compiled from: ContentDescriptionReader */
public class C8997j implements C8995h {

    /* renamed from: a */
    private static final C8978l[] f35454a = {C8978l.f35396h};

    protected C8997j() {
    }

    /* renamed from: d */
    private int[] m48130d(InputStream inputStream) throws IOException {
        int[] iArr = new int[5];
        for (int i = 0; i < 5; i++) {
            iArr[i] = C9014c.m48179m(inputStream);
        }
        return iArr;
    }

    /* renamed from: a */
    public C8970d mo31459a(C8978l lVar, InputStream inputStream, long j) throws IOException {
        BigInteger h = C9014c.m48174h(inputStream);
        int[] d = m48130d(inputStream);
        int length = d.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            if (d[i] > 0) {
                strArr[i] = C9014c.m48177k(inputStream, d[i]);
            }
        }
        C8974h hVar = new C8974h(j, h);
        if (d[0] > 0) {
            hVar.mo31359D(strArr[0]);
        }
        if (d[1] > 0) {
            hVar.mo31365z(strArr[1]);
        }
        if (d[2] > 0) {
            hVar.mo31357B(strArr[2]);
        }
        if (d[3] > 0) {
            hVar.mo31356A(strArr[3]);
        }
        if (d[4] > 0) {
            hVar.mo31358C(strArr[4]);
        }
        return hVar;
    }

    /* renamed from: b */
    public C8978l[] mo31452b() {
        return (C8978l[]) f35454a.clone();
    }

    /* renamed from: c */
    public boolean mo31453c() {
        return false;
    }
}
