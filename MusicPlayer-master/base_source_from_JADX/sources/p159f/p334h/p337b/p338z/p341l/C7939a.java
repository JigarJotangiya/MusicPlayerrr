package p159f.p334h.p337b.p338z.p341l;

import javax.security.auth.x500.X500Principal;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.h.b.z.l.a */
/* compiled from: DistinguishedNameParser */
final class C7939a {

    /* renamed from: a */
    private final String f33656a;

    /* renamed from: b */
    private final int f33657b;

    /* renamed from: c */
    private int f33658c;

    /* renamed from: d */
    private int f33659d;

    /* renamed from: e */
    private int f33660e;

    /* renamed from: f */
    private int f33661f;

    /* renamed from: g */
    private char[] f33662g;

    public C7939a(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f33656a = name;
        this.f33657b = name.length();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0097, code lost:
        r1 = r8.f33662g;
        r2 = r8.f33659d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a3, code lost:
        return new java.lang.String(r1, r2, r8.f33661f - r2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m43531a() {
        /*
            r8 = this;
            int r0 = r8.f33658c
            r8.f33659d = r0
            r8.f33660e = r0
        L_0x0006:
            int r0 = r8.f33658c
            int r1 = r8.f33657b
            if (r0 < r1) goto L_0x0019
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f33662g
            int r2 = r8.f33659d
            int r3 = r8.f33660e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0019:
            char[] r1 = r8.f33662g
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L_0x0060
            if (r2 == r5) goto L_0x0053
            r5 = 92
            if (r2 == r5) goto L_0x0040
            if (r2 == r4) goto L_0x0053
            if (r2 == r3) goto L_0x0053
            int r2 = r8.f33660e
            int r3 = r2 + 1
            r8.f33660e = r3
            char r3 = r1[r0]
            r1[r2] = r3
            int r0 = r0 + 1
            r8.f33658c = r0
            goto L_0x0006
        L_0x0040:
            int r0 = r8.f33660e
            int r2 = r0 + 1
            r8.f33660e = r2
            char r2 = r8.m43533d()
            r1[r0] = r2
            int r0 = r8.f33658c
            int r0 = r0 + 1
            r8.f33658c = r0
            goto L_0x0006
        L_0x0053:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f33662g
            int r2 = r8.f33659d
            int r3 = r8.f33660e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0060:
            int r2 = r8.f33660e
            r8.f33661f = r2
            int r0 = r0 + 1
            r8.f33658c = r0
            int r0 = r2 + 1
            r8.f33660e = r0
            r1[r2] = r6
        L_0x006e:
            int r0 = r8.f33658c
            int r1 = r8.f33657b
            if (r0 >= r1) goto L_0x0087
            char[] r2 = r8.f33662g
            char r7 = r2[r0]
            if (r7 != r6) goto L_0x0087
            int r1 = r8.f33660e
            int r7 = r1 + 1
            r8.f33660e = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.f33658c = r0
            goto L_0x006e
        L_0x0087:
            if (r0 == r1) goto L_0x0097
            char[] r1 = r8.f33662g
            char r2 = r1[r0]
            if (r2 == r3) goto L_0x0097
            char r2 = r1[r0]
            if (r2 == r4) goto L_0x0097
            char r0 = r1[r0]
            if (r0 != r5) goto L_0x0006
        L_0x0097:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f33662g
            int r2 = r8.f33659d
            int r3 = r8.f33661f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p334h.p337b.p338z.p341l.C7939a.m43531a():java.lang.String");
    }

    /* renamed from: c */
    private int m43532c(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 < this.f33657b) {
            char[] cArr = this.f33662g;
            char c = cArr[i];
            if (c >= '0' && c <= '9') {
                i2 = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                i2 = c - 'W';
            } else if (c < 'A' || c > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f33656a);
            } else {
                i2 = c - '7';
            }
            char c2 = cArr[i4];
            if (c2 >= '0' && c2 <= '9') {
                i3 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i3 = c2 - 'W';
            } else if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f33656a);
            } else {
                i3 = c2 - '7';
            }
            return (i2 << 4) + i3;
        }
        throw new IllegalStateException("Malformed DN: " + this.f33656a);
    }

    /* renamed from: d */
    private char m43533d() {
        int i = this.f33658c + 1;
        this.f33658c = i;
        if (i != this.f33657b) {
            char[] cArr = this.f33662g;
            char c = cArr[i];
            if (!(c == ' ' || c == '%' || c == '\\' || c == '_' || c == '\"' || c == '#')) {
                switch (c) {
                    case '*':
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                return m43534e();
                        }
                }
            }
            return cArr[i];
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f33656a);
    }

    /* renamed from: e */
    private char m43534e() {
        int i;
        int i2;
        int c = m43532c(this.f33658c);
        this.f33658c++;
        if (c < 128) {
            return (char) c;
        }
        if (c < 192 || c > 247) {
            return '?';
        }
        if (c <= 223) {
            i2 = c & 31;
            i = 1;
        } else if (c <= 239) {
            i = 2;
            i2 = c & 15;
        } else {
            i = 3;
            i2 = c & 7;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = this.f33658c + 1;
            this.f33658c = i4;
            if (i4 == this.f33657b || this.f33662g[i4] != '\\') {
                return '?';
            }
            int i5 = i4 + 1;
            this.f33658c = i5;
            int c2 = m43532c(i5);
            this.f33658c++;
            if ((c2 & 192) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (c2 & 63);
        }
        return (char) i2;
    }

    /* renamed from: f */
    private String m43535f() {
        int i;
        int i2 = this.f33658c;
        if (i2 + 4 < this.f33657b) {
            this.f33659d = i2;
            this.f33658c = i2 + 1;
            while (true) {
                i = this.f33658c;
                if (i == this.f33657b) {
                    break;
                }
                char[] cArr = this.f33662g;
                if (cArr[i] == '+' || cArr[i] == ',' || cArr[i] == ';') {
                    break;
                } else if (cArr[i] == ' ') {
                    this.f33660e = i;
                    this.f33658c = i + 1;
                    while (true) {
                        int i3 = this.f33658c;
                        if (i3 >= this.f33657b || this.f33662g[i3] != ' ') {
                            break;
                        }
                        this.f33658c = i3 + 1;
                    }
                } else {
                    if (cArr[i] >= 'A' && cArr[i] <= 'F') {
                        cArr[i] = (char) (cArr[i] + ' ');
                    }
                    this.f33658c = i + 1;
                }
            }
            this.f33660e = i;
            int i4 = this.f33660e;
            int i5 = this.f33659d;
            int i6 = i4 - i5;
            if (i6 < 5 || (i6 & 1) == 0) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f33656a);
            }
            int i7 = i6 / 2;
            byte[] bArr = new byte[i7];
            int i8 = i5 + 1;
            for (int i9 = 0; i9 < i7; i9++) {
                bArr[i9] = (byte) m43532c(i8);
                i8 += 2;
            }
            return new String(this.f33662g, this.f33659d, i6);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f33656a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m43536g() {
        /*
            r7 = this;
        L_0x0000:
            int r0 = r7.f33658c
            int r1 = r7.f33657b
            r2 = 32
            if (r0 >= r1) goto L_0x0013
            char[] r3 = r7.f33662g
            char r3 = r3[r0]
            if (r3 != r2) goto L_0x0013
            int r0 = r0 + 1
            r7.f33658c = r0
            goto L_0x0000
        L_0x0013:
            if (r0 != r1) goto L_0x0017
            r0 = 0
            return r0
        L_0x0017:
            r7.f33659d = r0
            int r0 = r0 + 1
            r7.f33658c = r0
        L_0x001d:
            int r0 = r7.f33658c
            int r1 = r7.f33657b
            r3 = 61
            if (r0 >= r1) goto L_0x0034
            char[] r4 = r7.f33662g
            char r5 = r4[r0]
            if (r5 == r3) goto L_0x0034
            char r4 = r4[r0]
            if (r4 == r2) goto L_0x0034
            int r0 = r0 + 1
            r7.f33658c = r0
            goto L_0x001d
        L_0x0034:
            java.lang.String r4 = "Unexpected end of DN: "
            if (r0 >= r1) goto L_0x00da
            r7.f33660e = r0
            char[] r1 = r7.f33662g
            char r0 = r1[r0]
            if (r0 != r2) goto L_0x0075
        L_0x0040:
            int r0 = r7.f33658c
            int r1 = r7.f33657b
            if (r0 >= r1) goto L_0x0055
            char[] r5 = r7.f33662g
            char r6 = r5[r0]
            if (r6 == r3) goto L_0x0055
            char r5 = r5[r0]
            if (r5 != r2) goto L_0x0055
            int r0 = r0 + 1
            r7.f33658c = r0
            goto L_0x0040
        L_0x0055:
            char[] r5 = r7.f33662g
            char r5 = r5[r0]
            if (r5 != r3) goto L_0x005e
            if (r0 == r1) goto L_0x005e
            goto L_0x0075
        L_0x005e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = r7.f33656a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0075:
            int r0 = r7.f33658c
            int r0 = r0 + 1
            r7.f33658c = r0
        L_0x007b:
            int r0 = r7.f33658c
            int r1 = r7.f33657b
            if (r0 >= r1) goto L_0x008c
            char[] r1 = r7.f33662g
            char r1 = r1[r0]
            if (r1 != r2) goto L_0x008c
            int r0 = r0 + 1
            r7.f33658c = r0
            goto L_0x007b
        L_0x008c:
            int r0 = r7.f33660e
            int r1 = r7.f33659d
            int r0 = r0 - r1
            r2 = 4
            if (r0 <= r2) goto L_0x00cd
            char[] r0 = r7.f33662g
            int r3 = r1 + 3
            char r3 = r0[r3]
            r4 = 46
            if (r3 != r4) goto L_0x00cd
            char r3 = r0[r1]
            r4 = 79
            if (r3 == r4) goto L_0x00aa
            char r3 = r0[r1]
            r4 = 111(0x6f, float:1.56E-43)
            if (r3 != r4) goto L_0x00cd
        L_0x00aa:
            int r3 = r1 + 1
            char r3 = r0[r3]
            r4 = 73
            if (r3 == r4) goto L_0x00ba
            int r3 = r1 + 1
            char r3 = r0[r3]
            r4 = 105(0x69, float:1.47E-43)
            if (r3 != r4) goto L_0x00cd
        L_0x00ba:
            int r3 = r1 + 2
            char r3 = r0[r3]
            r4 = 68
            if (r3 == r4) goto L_0x00ca
            int r3 = r1 + 2
            char r0 = r0[r3]
            r3 = 100
            if (r0 != r3) goto L_0x00cd
        L_0x00ca:
            int r1 = r1 + r2
            r7.f33659d = r1
        L_0x00cd:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r7.f33662g
            int r2 = r7.f33659d
            int r3 = r7.f33660e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L_0x00da:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = r7.f33656a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p334h.p337b.p338z.p341l.C7939a.m43536g():java.lang.String");
    }

    /* renamed from: h */
    private String m43537h() {
        int i = this.f33658c + 1;
        this.f33658c = i;
        this.f33659d = i;
        this.f33660e = i;
        while (true) {
            int i2 = this.f33658c;
            if (i2 != this.f33657b) {
                char[] cArr = this.f33662g;
                if (cArr[i2] == '\"') {
                    this.f33658c = i2 + 1;
                    while (true) {
                        int i3 = this.f33658c;
                        if (i3 >= this.f33657b || this.f33662g[i3] != ' ') {
                            char[] cArr2 = this.f33662g;
                            int i4 = this.f33659d;
                        } else {
                            this.f33658c = i3 + 1;
                        }
                    }
                    char[] cArr22 = this.f33662g;
                    int i42 = this.f33659d;
                    return new String(cArr22, i42, this.f33660e - i42);
                }
                if (cArr[i2] == '\\') {
                    cArr[this.f33660e] = m43533d();
                } else {
                    cArr[this.f33660e] = cArr[i2];
                }
                this.f33658c++;
                this.f33660e++;
            } else {
                throw new IllegalStateException("Unexpected end of DN: " + this.f33656a);
            }
        }
    }

    /* renamed from: b */
    public String mo29467b(String str) {
        String str2;
        this.f33658c = 0;
        this.f33659d = 0;
        this.f33660e = 0;
        this.f33661f = 0;
        this.f33662g = this.f33656a.toCharArray();
        String g = m43536g();
        if (g == null) {
            return null;
        }
        do {
            int i = this.f33658c;
            if (i == this.f33657b) {
                return null;
            }
            char c = this.f33662g[i];
            if (c == '\"') {
                str2 = m43537h();
            } else if (c != '#') {
                str2 = (c == '+' || c == ',' || c == ';') ? BuildConfig.FLAVOR : m43531a();
            } else {
                str2 = m43535f();
            }
            if (str.equalsIgnoreCase(g)) {
                return str2;
            }
            int i2 = this.f33658c;
            if (i2 >= this.f33657b) {
                return null;
            }
            char[] cArr = this.f33662g;
            if (cArr[i2] == ',' || cArr[i2] == ';' || cArr[i2] == '+') {
                this.f33658c = i2 + 1;
                g = m43536g();
            } else {
                throw new IllegalStateException("Malformed DN: " + this.f33656a);
            }
        } while (g != null);
        throw new IllegalStateException("Malformed DN: " + this.f33656a);
    }
}
