package p159f.p334h.p335a;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import p394k.C8633e;
import p394k.C8637g;
import p394k.C8638h;
import p394k.C8648q;

/* renamed from: f.h.a.k */
/* compiled from: JsonReader */
public abstract class C7761k implements Closeable {

    /* renamed from: g */
    int f33118g;

    /* renamed from: h */
    int[] f33119h;

    /* renamed from: i */
    String[] f33120i;

    /* renamed from: j */
    int[] f33121j;

    /* renamed from: k */
    boolean f33122k;

    /* renamed from: l */
    boolean f33123l;

    /* renamed from: f.h.a.k$a */
    /* compiled from: JsonReader */
    public static final class C7762a {

        /* renamed from: a */
        final String[] f33124a;

        /* renamed from: b */
        final C8648q f33125b;

        private C7762a(String[] strArr, C8648q qVar) {
            this.f33124a = strArr;
            this.f33125b = qVar;
        }

        /* renamed from: a */
        public static C7762a m42667a(String... strArr) {
            try {
                C8638h[] hVarArr = new C8638h[strArr.length];
                C8633e eVar = new C8633e();
                for (int i = 0; i < strArr.length; i++) {
                    C7766n.m42703c(eVar, strArr[i]);
                    eVar.readByte();
                    hVarArr[i] = eVar.mo30671H0();
                }
                return new C7762a((String[]) strArr.clone(), C8648q.m46999y(hVarArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: f.h.a.k$b */
    /* compiled from: JsonReader */
    public enum C7763b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    C7761k() {
        this.f33119h = new int[32];
        this.f33120i = new String[32];
        this.f33121j = new int[32];
    }

    /* renamed from: n0 */
    public static C7761k m42645n0(C8637g gVar) {
        return new C7765m(gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public final void mo28956A0(int i) {
        int i2 = this.f33118g;
        int[] iArr = this.f33119h;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f33119h = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f33120i;
                this.f33120i = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f33121j;
                this.f33121j = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new C7758h("Nesting too deep at " + getPath());
            }
        }
        int[] iArr3 = this.f33119h;
        int i3 = this.f33118g;
        this.f33118g = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: E */
    public abstract boolean mo28957E() throws IOException;

    /* renamed from: F0 */
    public abstract int mo28958F0(C7762a aVar) throws IOException;

    /* renamed from: H */
    public final boolean mo28959H() {
        return this.f33122k;
    }

    /* renamed from: H0 */
    public abstract int mo28960H0(C7762a aVar) throws IOException;

    /* renamed from: K */
    public abstract boolean mo28961K() throws IOException;

    /* renamed from: L0 */
    public abstract void mo28962L0() throws IOException;

    /* renamed from: N0 */
    public abstract void mo28963N0() throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: O0 */
    public final C7759i mo28964O0(String str) throws C7759i {
        throw new C7759i(str + " at path " + getPath());
    }

    /* renamed from: Q */
    public abstract double mo28965Q() throws IOException;

    /* renamed from: T */
    public abstract int mo28966T() throws IOException;

    /* renamed from: Y */
    public abstract long mo28967Y() throws IOException;

    /* renamed from: c */
    public abstract void mo28968c() throws IOException;

    /* renamed from: d */
    public abstract void mo28969d() throws IOException;

    public final String getPath() {
        return C7764l.m42668a(this.f33118g, this.f33119h, this.f33120i, this.f33121j);
    }

    /* renamed from: i0 */
    public abstract <T> T mo28971i0() throws IOException;

    /* renamed from: m0 */
    public abstract String mo28972m0() throws IOException;

    /* renamed from: o0 */
    public abstract C7763b mo28973o0() throws IOException;

    /* renamed from: p */
    public abstract void mo28974p() throws IOException;

    /* renamed from: v0 */
    public abstract C7761k mo28975v0();

    /* renamed from: x */
    public abstract void mo28976x() throws IOException;

    /* renamed from: z0 */
    public abstract void mo28977z0() throws IOException;

    C7761k(C7761k kVar) {
        this.f33118g = kVar.f33118g;
        this.f33119h = (int[]) kVar.f33119h.clone();
        this.f33120i = (String[]) kVar.f33120i.clone();
        this.f33121j = (int[]) kVar.f33121j.clone();
        this.f33122k = kVar.f33122k;
        this.f33123l = kVar.f33123l;
    }
}
