package p159f.p334h.p335a;

import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Objects;
import p159f.p334h.p335a.C7761k;
import p394k.C8633e;
import p394k.C8637g;
import p394k.C8638h;

/* renamed from: f.h.a.m */
/* compiled from: JsonUtf8Reader */
final class C7765m extends C7761k {

    /* renamed from: t */
    private static final C8638h f33127t = C8638h.encodeUtf8("'\\");

    /* renamed from: u */
    private static final C8638h f33128u = C8638h.encodeUtf8("\"\\");

    /* renamed from: v */
    private static final C8638h f33129v = C8638h.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: w */
    private static final C8638h f33130w = C8638h.encodeUtf8("\n\r");

    /* renamed from: x */
    private static final C8638h f33131x = C8638h.encodeUtf8("*/");

    /* renamed from: m */
    private final C8637g f33132m;

    /* renamed from: n */
    private final C8633e f33133n;

    /* renamed from: o */
    private int f33134o = 0;

    /* renamed from: p */
    private long f33135p;

    /* renamed from: q */
    private int f33136q;

    /* renamed from: r */
    private String f33137r;

    /* renamed from: s */
    private C7767o f33138s;

    C7765m(C8637g gVar) {
        Objects.requireNonNull(gVar, "source == null");
        this.f33132m = gVar;
        this.f33133n = gVar.mo30710h();
        mo28956A0(6);
    }

    /* renamed from: P0 */
    private void m42669P0() throws IOException {
        if (!this.f33122k) {
            mo28964O0("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    /* renamed from: Q0 */
    private int m42670Q0() throws IOException {
        int[] iArr = this.f33119h;
        int i = this.f33118g;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int V0 = m42674V0(true);
            this.f33133n.readByte();
            if (V0 != 44) {
                if (V0 == 59) {
                    m42669P0();
                } else if (V0 == 93) {
                    this.f33134o = 4;
                    return 4;
                } else {
                    mo28964O0("Unterminated array");
                    throw null;
                }
            }
        } else if (i2 == 3 || i2 == 5) {
            iArr[i - 1] = 4;
            if (i2 == 5) {
                int V02 = m42674V0(true);
                this.f33133n.readByte();
                if (V02 != 44) {
                    if (V02 == 59) {
                        m42669P0();
                    } else if (V02 == 125) {
                        this.f33134o = 2;
                        return 2;
                    } else {
                        mo28964O0("Unterminated object");
                        throw null;
                    }
                }
            }
            int V03 = m42674V0(true);
            if (V03 == 34) {
                this.f33133n.readByte();
                this.f33134o = 13;
                return 13;
            } else if (V03 == 39) {
                this.f33133n.readByte();
                m42669P0();
                this.f33134o = 12;
                return 12;
            } else if (V03 != 125) {
                m42669P0();
                if (m42673T0((char) V03)) {
                    this.f33134o = 14;
                    return 14;
                }
                mo28964O0("Expected name");
                throw null;
            } else if (i2 != 5) {
                this.f33133n.readByte();
                this.f33134o = 2;
                return 2;
            } else {
                mo28964O0("Expected name");
                throw null;
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int V04 = m42674V0(true);
            this.f33133n.readByte();
            if (V04 != 58) {
                if (V04 == 61) {
                    m42669P0();
                    if (this.f33132m.mo30708g0(1) && this.f33133n.mo30718n0(0) == 62) {
                        this.f33133n.readByte();
                    }
                } else {
                    mo28964O0("Expected ':'");
                    throw null;
                }
            }
        } else if (i2 == 6) {
            iArr[i - 1] = 7;
        } else if (i2 == 7) {
            if (m42674V0(false) == -1) {
                this.f33134o = 18;
                return 18;
            }
            m42669P0();
        } else if (i2 == 9) {
            this.f33138s.mo28981c();
            throw null;
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int V05 = m42674V0(true);
        if (V05 == 34) {
            this.f33133n.readByte();
            this.f33134o = 9;
            return 9;
        } else if (V05 != 39) {
            if (!(V05 == 44 || V05 == 59)) {
                if (V05 == 91) {
                    this.f33133n.readByte();
                    this.f33134o = 3;
                    return 3;
                } else if (V05 != 93) {
                    if (V05 != 123) {
                        int Y0 = m42677Y0();
                        if (Y0 != 0) {
                            return Y0;
                        }
                        int Z0 = m42678Z0();
                        if (Z0 != 0) {
                            return Z0;
                        }
                        if (m42673T0(this.f33133n.mo30718n0(0))) {
                            m42669P0();
                            this.f33134o = 10;
                            return 10;
                        }
                        mo28964O0("Expected value");
                        throw null;
                    }
                    this.f33133n.readByte();
                    this.f33134o = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.f33133n.readByte();
                    this.f33134o = 4;
                    return 4;
                }
            }
            if (i2 == 1 || i2 == 2) {
                m42669P0();
                this.f33134o = 7;
                return 7;
            }
            mo28964O0("Unexpected value");
            throw null;
        } else {
            m42669P0();
            this.f33133n.readByte();
            this.f33134o = 8;
            return 8;
        }
    }

    /* renamed from: R0 */
    private int m42671R0(String str, C7761k.C7762a aVar) {
        int length = aVar.f33124a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f33124a[i])) {
                this.f33134o = 0;
                this.f33120i[this.f33118g - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: S0 */
    private int m42672S0(String str, C7761k.C7762a aVar) {
        int length = aVar.f33124a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f33124a[i])) {
                this.f33134o = 0;
                int[] iArr = this.f33121j;
                int i2 = this.f33118g - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: T0 */
    private boolean m42673T0(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m42669P0();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r6.f33133n.mo30715j((long) (r3 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r1 != 47) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r6.f33132m.mo30708g0(2) != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        m42669P0();
        r3 = r6.f33133n.mo30718n0(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r3 == 42) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r3 == 47) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        r6.f33133n.readByte();
        r6.f33133n.readByte();
        m42682d1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r6.f33133n.readByte();
        r6.f33133n.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (m42681c1() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        mo28964O0("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r1 != 35) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        m42669P0();
        m42682d1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        return r1;
     */
    /* renamed from: V0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m42674V0(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            r1 = 0
        L_0x0002:
            k.g r2 = r6.f33132m
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.mo30708g0(r4)
            if (r2 == 0) goto L_0x0082
            k.e r2 = r6.f33133n
            long r4 = (long) r1
            byte r1 = r2.mo30718n0(r4)
            r2 = 10
            if (r1 == r2) goto L_0x0080
            r2 = 32
            if (r1 == r2) goto L_0x0080
            r2 = 13
            if (r1 == r2) goto L_0x0080
            r2 = 9
            if (r1 != r2) goto L_0x0025
            goto L_0x0080
        L_0x0025:
            k.e r2 = r6.f33133n
            int r3 = r3 + -1
            long r3 = (long) r3
            r2.mo30715j(r3)
            r2 = 47
            if (r1 != r2) goto L_0x0074
            k.g r3 = r6.f33132m
            r4 = 2
            boolean r3 = r3.mo30708g0(r4)
            if (r3 != 0) goto L_0x003c
            return r1
        L_0x003c:
            r6.m42669P0()
            k.e r3 = r6.f33133n
            r4 = 1
            byte r3 = r3.mo30718n0(r4)
            r4 = 42
            if (r3 == r4) goto L_0x005c
            if (r3 == r2) goto L_0x004e
            return r1
        L_0x004e:
            k.e r1 = r6.f33133n
            r1.readByte()
            k.e r1 = r6.f33133n
            r1.readByte()
            r6.m42682d1()
            goto L_0x0001
        L_0x005c:
            k.e r1 = r6.f33133n
            r1.readByte()
            k.e r1 = r6.f33133n
            r1.readByte()
            boolean r1 = r6.m42681c1()
            if (r1 == 0) goto L_0x006d
            goto L_0x0001
        L_0x006d:
            java.lang.String r7 = "Unterminated comment"
            r6.mo28964O0(r7)
            r7 = 0
            throw r7
        L_0x0074:
            r2 = 35
            if (r1 != r2) goto L_0x007f
            r6.m42669P0()
            r6.m42682d1()
            goto L_0x0001
        L_0x007f:
            return r1
        L_0x0080:
            r1 = r3
            goto L_0x0002
        L_0x0082:
            if (r7 != 0) goto L_0x0086
            r7 = -1
            return r7
        L_0x0086:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p334h.p335a.C7765m.m42674V0(boolean):int");
    }

    /* renamed from: W0 */
    private String m42675W0(C8638h hVar) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long I = this.f33132m.mo30672I(hVar);
            if (I == -1) {
                mo28964O0("Unterminated string");
                throw null;
            } else if (this.f33133n.mo30718n0(I) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f33133n.mo30683R0(I));
                this.f33133n.readByte();
                sb.append(m42679a1());
            } else if (sb == null) {
                String R0 = this.f33133n.mo30683R0(I);
                this.f33133n.readByte();
                return R0;
            } else {
                sb.append(this.f33133n.mo30683R0(I));
                this.f33133n.readByte();
                return sb.toString();
            }
        }
    }

    /* renamed from: X0 */
    private String m42676X0() throws IOException {
        long I = this.f33132m.mo30672I(f33129v);
        return I != -1 ? this.f33133n.mo30683R0(I) : this.f33133n.mo30682Q0();
    }

    /* renamed from: Y0 */
    private int m42677Y0() throws IOException {
        String str;
        String str2;
        int i;
        byte n0 = this.f33133n.mo30718n0(0);
        if (n0 == 116 || n0 == 84) {
            i = 5;
            str2 = "true";
            str = "TRUE";
        } else if (n0 == 102 || n0 == 70) {
            i = 6;
            str2 = "false";
            str = "FALSE";
        } else if (n0 != 110 && n0 != 78) {
            return 0;
        } else {
            i = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.f33132m.mo30708g0((long) i3)) {
                return 0;
            }
            byte n02 = this.f33133n.mo30718n0((long) i2);
            if (n02 != str2.charAt(i2) && n02 != str.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.f33132m.mo30708g0((long) (length + 1)) && m42673T0(this.f33133n.mo30718n0((long) length))) {
            return 0;
        }
        this.f33133n.mo30715j((long) length);
        this.f33134o = i;
        return i;
    }

    /* renamed from: Z0 */
    private int m42678Z0() throws IOException {
        byte n0;
        boolean z = true;
        int i = 0;
        long j = 0;
        int i2 = 0;
        char c = 0;
        boolean z2 = true;
        boolean z3 = false;
        while (true) {
            int i3 = i2 + 1;
            if (!this.f33132m.mo30708g0((long) i3)) {
                break;
            }
            n0 = this.f33133n.mo30718n0((long) i2);
            if (n0 != 43) {
                if (n0 != 69 && n0 != 101) {
                    if (n0 != 45) {
                        if (n0 != 46) {
                            if (n0 >= 48 && n0 <= 57) {
                                if (c == z || c == 0) {
                                    j = (long) (-(n0 - 48));
                                    i = 0;
                                    c = 2;
                                } else {
                                    if (c == 2) {
                                        if (j == 0) {
                                            return i;
                                        }
                                        long j2 = (10 * j) - ((long) (n0 - 48));
                                        int i4 = (j > -922337203685477580L ? 1 : (j == -922337203685477580L ? 0 : -1));
                                        z2 &= i4 > 0 || (i4 == 0 && j2 < j);
                                        j = j2;
                                    } else if (c == 3) {
                                        i = 0;
                                        c = 4;
                                    } else if (c == 5 || c == 6) {
                                        i = 0;
                                        c = 7;
                                    }
                                    i = 0;
                                }
                            }
                        } else if (c != 2) {
                            return i;
                        } else {
                            c = 3;
                        }
                    } else if (c == 0) {
                        c = 1;
                        z3 = true;
                    } else if (c != 5) {
                        return i;
                    }
                    i2 = i3;
                    z = true;
                } else if (c != 2 && c != 4) {
                    return i;
                } else {
                    c = 5;
                    i2 = i3;
                    z = true;
                }
            } else if (c != 5) {
                return i;
            }
            c = 6;
            i2 = i3;
            z = true;
        }
        if (m42673T0(n0)) {
            return 0;
        }
        if (c == 2 && z2 && ((j != Long.MIN_VALUE || z3) && (j != 0 || !z3))) {
            if (!z3) {
                j = -j;
            }
            this.f33135p = j;
            this.f33133n.mo30715j((long) i2);
            this.f33134o = 16;
            return 16;
        } else if (c != 2 && c != 4 && c != 7) {
            return 0;
        } else {
            this.f33136q = i2;
            this.f33134o = 17;
            return 17;
        }
    }

    /* renamed from: a1 */
    private char m42679a1() throws IOException {
        int i;
        int i2;
        if (this.f33132m.mo30708g0(1)) {
            byte readByte = this.f33133n.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return 8;
            }
            if (readByte == 102) {
                return 12;
            }
            if (readByte == 110) {
                return 10;
            }
            if (readByte == 114) {
                return 13;
            }
            if (readByte == 116) {
                return 9;
            }
            if (readByte != 117) {
                if (this.f33122k) {
                    return (char) readByte;
                }
                mo28964O0("Invalid escape sequence: \\" + ((char) readByte));
                throw null;
            } else if (this.f33132m.mo30708g0(4)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte n0 = this.f33133n.mo30718n0((long) i3);
                    char c2 = (char) (c << 4);
                    if (n0 < 48 || n0 > 57) {
                        if (n0 >= 97 && n0 <= 102) {
                            i = n0 - 97;
                        } else if (n0 < 65 || n0 > 70) {
                            mo28964O0("\\u" + this.f33133n.mo30683R0(4));
                            throw null;
                        } else {
                            i = n0 - 65;
                        }
                        i2 = i + 10;
                    } else {
                        i2 = n0 - 48;
                    }
                    c = (char) (c2 + i2);
                }
                this.f33133n.mo30715j(4);
                return c;
            } else {
                throw new EOFException("Unterminated escape sequence at path " + getPath());
            }
        } else {
            mo28964O0("Unterminated escape sequence");
            throw null;
        }
    }

    /* renamed from: b1 */
    private void m42680b1(C8638h hVar) throws IOException {
        while (true) {
            long I = this.f33132m.mo30672I(hVar);
            if (I == -1) {
                mo28964O0("Unterminated string");
                throw null;
            } else if (this.f33133n.mo30718n0(I) == 92) {
                this.f33133n.mo30715j(I + 1);
                m42679a1();
            } else {
                this.f33133n.mo30715j(I + 1);
                return;
            }
        }
    }

    /* renamed from: c1 */
    private boolean m42681c1() throws IOException {
        C8637g gVar = this.f33132m;
        C8638h hVar = f33131x;
        long z = gVar.mo30735z(hVar);
        boolean z2 = z != -1;
        C8633e eVar = this.f33133n;
        eVar.mo30715j(z2 ? z + ((long) hVar.size()) : eVar.mo30688U0());
        return z2;
    }

    /* renamed from: d1 */
    private void m42682d1() throws IOException {
        long I = this.f33132m.mo30672I(f33130w);
        C8633e eVar = this.f33133n;
        eVar.mo30715j(I != -1 ? I + 1 : eVar.mo30688U0());
    }

    /* renamed from: e1 */
    private void m42683e1() throws IOException {
        long I = this.f33132m.mo30672I(f33129v);
        C8633e eVar = this.f33133n;
        if (I == -1) {
            I = eVar.mo30688U0();
        }
        eVar.mo30715j(I);
    }

    /* renamed from: E */
    public boolean mo28957E() throws IOException {
        int i = this.f33134o;
        if (i == 0) {
            i = m42670Q0();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    /* renamed from: F0 */
    public int mo28958F0(C7761k.C7762a aVar) throws IOException {
        int i = this.f33134o;
        if (i == 0) {
            i = m42670Q0();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return m42671R0(this.f33137r, aVar);
        }
        int M0 = this.f33132m.mo30678M0(aVar.f33125b);
        if (M0 != -1) {
            this.f33134o = 0;
            this.f33120i[this.f33118g - 1] = aVar.f33124a[M0];
            return M0;
        }
        String str = this.f33120i[this.f33118g - 1];
        String U0 = mo28978U0();
        int R0 = m42671R0(U0, aVar);
        if (R0 == -1) {
            this.f33134o = 15;
            this.f33137r = U0;
            this.f33120i[this.f33118g - 1] = str;
        }
        return R0;
    }

    /* renamed from: H0 */
    public int mo28960H0(C7761k.C7762a aVar) throws IOException {
        int i = this.f33134o;
        if (i == 0) {
            i = m42670Q0();
        }
        if (i < 8 || i > 11) {
            return -1;
        }
        if (i == 11) {
            return m42672S0(this.f33137r, aVar);
        }
        int M0 = this.f33132m.mo30678M0(aVar.f33125b);
        if (M0 != -1) {
            this.f33134o = 0;
            int[] iArr = this.f33121j;
            int i2 = this.f33118g - 1;
            iArr[i2] = iArr[i2] + 1;
            return M0;
        }
        String m0 = mo28972m0();
        int S0 = m42672S0(m0, aVar);
        if (S0 == -1) {
            this.f33134o = 11;
            this.f33137r = m0;
            int[] iArr2 = this.f33121j;
            int i3 = this.f33118g - 1;
            iArr2[i3] = iArr2[i3] - 1;
        }
        return S0;
    }

    /* renamed from: K */
    public boolean mo28961K() throws IOException {
        int i = this.f33134o;
        if (i == 0) {
            i = m42670Q0();
        }
        if (i == 5) {
            this.f33134o = 0;
            int[] iArr = this.f33121j;
            int i2 = this.f33118g - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f33134o = 0;
            int[] iArr2 = this.f33121j;
            int i3 = this.f33118g - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new C7758h("Expected a boolean but was " + mo28973o0() + " at path " + getPath());
        }
    }

    /* renamed from: L0 */
    public void mo28962L0() throws IOException {
        if (!this.f33123l) {
            int i = this.f33134o;
            if (i == 0) {
                i = m42670Q0();
            }
            if (i == 14) {
                m42683e1();
            } else if (i == 13) {
                m42680b1(f33128u);
            } else if (i == 12) {
                m42680b1(f33127t);
            } else if (i != 15) {
                throw new C7758h("Expected a name but was " + mo28973o0() + " at path " + getPath());
            }
            this.f33134o = 0;
            this.f33120i[this.f33118g - 1] = "null";
            return;
        }
        C7761k.C7763b o0 = mo28973o0();
        mo28978U0();
        throw new C7758h("Cannot skip unexpected " + o0 + " at " + getPath());
    }

    /* renamed from: N0 */
    public void mo28963N0() throws IOException {
        if (!this.f33123l) {
            int i = 0;
            do {
                int i2 = this.f33134o;
                if (i2 == 0) {
                    i2 = m42670Q0();
                }
                if (i2 == 3) {
                    mo28956A0(1);
                } else if (i2 == 1) {
                    mo28956A0(3);
                } else {
                    if (i2 == 4) {
                        i--;
                        if (i >= 0) {
                            this.f33118g--;
                        } else {
                            throw new C7758h("Expected a value but was " + mo28973o0() + " at path " + getPath());
                        }
                    } else if (i2 == 2) {
                        i--;
                        if (i >= 0) {
                            this.f33118g--;
                        } else {
                            throw new C7758h("Expected a value but was " + mo28973o0() + " at path " + getPath());
                        }
                    } else if (i2 == 14 || i2 == 10) {
                        m42683e1();
                    } else if (i2 == 9 || i2 == 13) {
                        m42680b1(f33128u);
                    } else if (i2 == 8 || i2 == 12) {
                        m42680b1(f33127t);
                    } else if (i2 == 17) {
                        this.f33133n.mo30715j((long) this.f33136q);
                    } else if (i2 == 18) {
                        throw new C7758h("Expected a value but was " + mo28973o0() + " at path " + getPath());
                    }
                    this.f33134o = 0;
                }
                i++;
                this.f33134o = 0;
            } while (i != 0);
            int[] iArr = this.f33121j;
            int i3 = this.f33118g;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f33120i[i3 - 1] = "null";
            return;
        }
        throw new C7758h("Cannot skip unexpected " + mo28973o0() + " at " + getPath());
    }

    /* renamed from: Q */
    public double mo28965Q() throws IOException {
        int i = this.f33134o;
        if (i == 0) {
            i = m42670Q0();
        }
        if (i == 16) {
            this.f33134o = 0;
            int[] iArr = this.f33121j;
            int i2 = this.f33118g - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f33135p;
        }
        if (i == 17) {
            this.f33137r = this.f33133n.mo30683R0((long) this.f33136q);
        } else if (i == 9) {
            this.f33137r = m42675W0(f33128u);
        } else if (i == 8) {
            this.f33137r = m42675W0(f33127t);
        } else if (i == 10) {
            this.f33137r = m42676X0();
        } else if (i != 11) {
            throw new C7758h("Expected a double but was " + mo28973o0() + " at path " + getPath());
        }
        this.f33134o = 11;
        try {
            double parseDouble = Double.parseDouble(this.f33137r);
            if (this.f33122k || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
                this.f33137r = null;
                this.f33134o = 0;
                int[] iArr2 = this.f33121j;
                int i3 = this.f33118g - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseDouble;
            }
            throw new C7759i("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new C7758h("Expected a double but was " + this.f33137r + " at path " + getPath());
        }
    }

    /* renamed from: T */
    public int mo28966T() throws IOException {
        String str;
        int i = this.f33134o;
        if (i == 0) {
            i = m42670Q0();
        }
        if (i == 16) {
            long j = this.f33135p;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f33134o = 0;
                int[] iArr = this.f33121j;
                int i3 = this.f33118g - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new C7758h("Expected an int but was " + this.f33135p + " at path " + getPath());
        }
        if (i == 17) {
            this.f33137r = this.f33133n.mo30683R0((long) this.f33136q);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                str = m42675W0(f33128u);
            } else {
                str = m42675W0(f33127t);
            }
            this.f33137r = str;
            try {
                int parseInt = Integer.parseInt(str);
                this.f33134o = 0;
                int[] iArr2 = this.f33121j;
                int i4 = this.f33118g - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new C7758h("Expected an int but was " + mo28973o0() + " at path " + getPath());
        }
        this.f33134o = 11;
        try {
            double parseDouble = Double.parseDouble(this.f33137r);
            int i5 = (int) parseDouble;
            if (((double) i5) == parseDouble) {
                this.f33137r = null;
                this.f33134o = 0;
                int[] iArr3 = this.f33121j;
                int i6 = this.f33118g - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new C7758h("Expected an int but was " + this.f33137r + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new C7758h("Expected an int but was " + this.f33137r + " at path " + getPath());
        }
    }

    /* renamed from: U0 */
    public String mo28978U0() throws IOException {
        String str;
        int i = this.f33134o;
        if (i == 0) {
            i = m42670Q0();
        }
        if (i == 14) {
            str = m42676X0();
        } else if (i == 13) {
            str = m42675W0(f33128u);
        } else if (i == 12) {
            str = m42675W0(f33127t);
        } else if (i == 15) {
            str = this.f33137r;
            this.f33137r = null;
        } else {
            throw new C7758h("Expected a name but was " + mo28973o0() + " at path " + getPath());
        }
        this.f33134o = 0;
        this.f33120i[this.f33118g - 1] = str;
        return str;
    }

    /* renamed from: Y */
    public long mo28967Y() throws IOException {
        String str;
        int i = this.f33134o;
        if (i == 0) {
            i = m42670Q0();
        }
        if (i == 16) {
            this.f33134o = 0;
            int[] iArr = this.f33121j;
            int i2 = this.f33118g - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f33135p;
        }
        if (i == 17) {
            this.f33137r = this.f33133n.mo30683R0((long) this.f33136q);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                str = m42675W0(f33128u);
            } else {
                str = m42675W0(f33127t);
            }
            this.f33137r = str;
            try {
                long parseLong = Long.parseLong(str);
                this.f33134o = 0;
                int[] iArr2 = this.f33121j;
                int i3 = this.f33118g - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new C7758h("Expected a long but was " + mo28973o0() + " at path " + getPath());
        }
        this.f33134o = 11;
        try {
            long longValueExact = new BigDecimal(this.f33137r).longValueExact();
            this.f33137r = null;
            this.f33134o = 0;
            int[] iArr3 = this.f33121j;
            int i4 = this.f33118g - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return longValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new C7758h("Expected a long but was " + this.f33137r + " at path " + getPath());
        }
    }

    /* renamed from: c */
    public void mo28968c() throws IOException {
        int i = this.f33134o;
        if (i == 0) {
            i = m42670Q0();
        }
        if (i == 3) {
            mo28956A0(1);
            this.f33121j[this.f33118g - 1] = 0;
            this.f33134o = 0;
            return;
        }
        throw new C7758h("Expected BEGIN_ARRAY but was " + mo28973o0() + " at path " + getPath());
    }

    public void close() throws IOException {
        this.f33134o = 0;
        this.f33119h[0] = 8;
        this.f33118g = 1;
        this.f33133n.mo30697c();
        this.f33132m.close();
    }

    /* renamed from: d */
    public void mo28969d() throws IOException {
        int i = this.f33134o;
        if (i == 0) {
            i = m42670Q0();
        }
        if (i == 1) {
            mo28956A0(3);
            this.f33134o = 0;
            return;
        }
        throw new C7758h("Expected BEGIN_OBJECT but was " + mo28973o0() + " at path " + getPath());
    }

    /* renamed from: i0 */
    public <T> T mo28971i0() throws IOException {
        int i = this.f33134o;
        if (i == 0) {
            i = m42670Q0();
        }
        if (i == 7) {
            this.f33134o = 0;
            int[] iArr = this.f33121j;
            int i2 = this.f33118g - 1;
            iArr[i2] = iArr[i2] + 1;
            return null;
        }
        throw new C7758h("Expected null but was " + mo28973o0() + " at path " + getPath());
    }

    /* renamed from: m0 */
    public String mo28972m0() throws IOException {
        String str;
        int i = this.f33134o;
        if (i == 0) {
            i = m42670Q0();
        }
        if (i == 10) {
            str = m42676X0();
        } else if (i == 9) {
            str = m42675W0(f33128u);
        } else if (i == 8) {
            str = m42675W0(f33127t);
        } else if (i == 11) {
            str = this.f33137r;
            this.f33137r = null;
        } else if (i == 16) {
            str = Long.toString(this.f33135p);
        } else if (i == 17) {
            str = this.f33133n.mo30683R0((long) this.f33136q);
        } else {
            throw new C7758h("Expected a string but was " + mo28973o0() + " at path " + getPath());
        }
        this.f33134o = 0;
        int[] iArr = this.f33121j;
        int i2 = this.f33118g - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: o0 */
    public C7761k.C7763b mo28973o0() throws IOException {
        int i = this.f33134o;
        if (i == 0) {
            i = m42670Q0();
        }
        switch (i) {
            case 1:
                return C7761k.C7763b.BEGIN_OBJECT;
            case 2:
                return C7761k.C7763b.END_OBJECT;
            case 3:
                return C7761k.C7763b.BEGIN_ARRAY;
            case 4:
                return C7761k.C7763b.END_ARRAY;
            case 5:
            case 6:
                return C7761k.C7763b.BOOLEAN;
            case 7:
                return C7761k.C7763b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C7761k.C7763b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return C7761k.C7763b.NAME;
            case 16:
            case 17:
                return C7761k.C7763b.NUMBER;
            case 18:
                return C7761k.C7763b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: p */
    public void mo28974p() throws IOException {
        int i = this.f33134o;
        if (i == 0) {
            i = m42670Q0();
        }
        if (i == 4) {
            int i2 = this.f33118g - 1;
            this.f33118g = i2;
            int[] iArr = this.f33121j;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f33134o = 0;
            return;
        }
        throw new C7758h("Expected END_ARRAY but was " + mo28973o0() + " at path " + getPath());
    }

    public String toString() {
        return "JsonReader(" + this.f33132m + ")";
    }

    /* renamed from: v0 */
    public C7761k mo28975v0() {
        return new C7765m(this);
    }

    /* renamed from: x */
    public void mo28976x() throws IOException {
        int i = this.f33134o;
        if (i == 0) {
            i = m42670Q0();
        }
        if (i == 2) {
            int i2 = this.f33118g - 1;
            this.f33118g = i2;
            this.f33120i[i2] = null;
            int[] iArr = this.f33121j;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f33134o = 0;
            return;
        }
        throw new C7758h("Expected END_OBJECT but was " + mo28973o0() + " at path " + getPath());
    }

    /* renamed from: z0 */
    public void mo28977z0() throws IOException {
        if (mo28957E()) {
            this.f33137r = mo28978U0();
            this.f33134o = 11;
        }
    }

    C7765m(C7765m mVar) {
        super(mVar);
        C8637g peek = mVar.f33132m.peek();
        this.f33132m = peek;
        this.f33133n = peek.mo30710h();
        this.f33134o = mVar.f33134o;
        this.f33135p = mVar.f33135p;
        this.f33136q = mVar.f33136q;
        this.f33137r = mVar.f33137r;
        try {
            peek.mo30668E0(mVar.f33133n.mo30688U0());
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }
}
