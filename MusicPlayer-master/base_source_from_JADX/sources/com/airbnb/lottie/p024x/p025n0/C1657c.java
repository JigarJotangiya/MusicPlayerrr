package com.airbnb.lottie.p024x.p025n0;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import p394k.C8633e;
import p394k.C8636f;
import p394k.C8637g;
import p394k.C8638h;
import p394k.C8648q;

/* renamed from: com.airbnb.lottie.x.n0.c */
/* compiled from: JsonReader */
public abstract class C1657c implements Closeable {

    /* renamed from: m */
    private static final String[] f6267m = new String[128];

    /* renamed from: g */
    int f6268g;

    /* renamed from: h */
    int[] f6269h = new int[32];

    /* renamed from: i */
    String[] f6270i = new String[32];

    /* renamed from: j */
    int[] f6271j = new int[32];

    /* renamed from: k */
    boolean f6272k;

    /* renamed from: l */
    boolean f6273l;

    /* renamed from: com.airbnb.lottie.x.n0.c$a */
    /* compiled from: JsonReader */
    public static final class C1658a {

        /* renamed from: a */
        final String[] f6274a;

        /* renamed from: b */
        final C8648q f6275b;

        private C1658a(String[] strArr, C8648q qVar) {
            this.f6274a = strArr;
            this.f6275b = qVar;
        }

        /* renamed from: a */
        public static C1658a m8335a(String... strArr) {
            try {
                C8638h[] hVarArr = new C8638h[strArr.length];
                C8633e eVar = new C8633e();
                for (int i = 0; i < strArr.length; i++) {
                    C1657c.m8316F0(eVar, strArr[i]);
                    eVar.readByte();
                    hVarArr[i] = eVar.mo30671H0();
                }
                return new C1658a((String[]) strArr.clone(), C8648q.m46999y(hVarArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: com.airbnb.lottie.x.n0.c$b */
    /* compiled from: JsonReader */
    public enum C1659b {
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

    static {
        for (int i = 0; i <= 31; i++) {
            f6267m[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f6267m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    C1657c() {
    }

    /* access modifiers changed from: private */
    /* renamed from: F0 */
    public static void m8316F0(C8636f fVar, String str) throws IOException {
        String str2;
        String[] strArr = f6267m;
        fVar.mo30666B(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                fVar.mo30700d0(str, i, i2);
            }
            fVar.mo30687U(str2);
            i = i2 + 1;
        }
        if (i < length) {
            fVar.mo30700d0(str, i, length);
        }
        fVar.mo30666B(34);
    }

    /* renamed from: m0 */
    public static C1657c m8318m0(C8637g gVar) {
        return new C1661e(gVar);
    }

    /* renamed from: A0 */
    public abstract void mo7425A0() throws IOException;

    /* renamed from: E */
    public abstract void mo7426E() throws IOException;

    /* renamed from: H */
    public abstract boolean mo7427H() throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: H0 */
    public final C1656b mo7428H0(String str) throws C1656b {
        throw new C1656b(str + " at path " + getPath());
    }

    /* renamed from: K */
    public abstract boolean mo7429K() throws IOException;

    /* renamed from: Q */
    public abstract double mo7430Q() throws IOException;

    /* renamed from: T */
    public abstract int mo7431T() throws IOException;

    /* renamed from: Y */
    public abstract String mo7432Y() throws IOException;

    /* renamed from: d */
    public abstract void mo7433d() throws IOException;

    public final String getPath() {
        return C1660d.m8336a(this.f6268g, this.f6269h, this.f6270i, this.f6271j);
    }

    /* renamed from: i0 */
    public abstract String mo7435i0() throws IOException;

    /* renamed from: n0 */
    public abstract C1659b mo7436n0() throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public final void mo7437o0(int i) {
        int i2 = this.f6268g;
        int[] iArr = this.f6269h;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f6269h = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f6270i;
                this.f6270i = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f6271j;
                this.f6271j = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new C1655a("Nesting too deep at " + getPath());
            }
        }
        int[] iArr3 = this.f6269h;
        int i3 = this.f6268g;
        this.f6268g = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: p */
    public abstract void mo7438p() throws IOException;

    /* renamed from: v0 */
    public abstract int mo7439v0(C1658a aVar) throws IOException;

    /* renamed from: x */
    public abstract void mo7440x() throws IOException;

    /* renamed from: z0 */
    public abstract void mo7441z0() throws IOException;
}
