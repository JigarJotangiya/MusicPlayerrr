package com.airbnb.lottie.p024x.p025n0;

import com.airbnb.lottie.p024x.p025n0.C1657c;
import java.io.EOFException;
import java.io.IOException;
import java.util.Objects;
import p394k.C8633e;
import p394k.C8637g;
import p394k.C8638h;

/* renamed from: com.airbnb.lottie.x.n0.e */
/* compiled from: JsonUtf8Reader */
final class C1661e extends C1657c {

    /* renamed from: t */
    private static final C8638h f6277t = C8638h.encodeUtf8("'\\");

    /* renamed from: u */
    private static final C8638h f6278u = C8638h.encodeUtf8("\"\\");

    /* renamed from: v */
    private static final C8638h f6279v = C8638h.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: w */
    private static final C8638h f6280w = C8638h.encodeUtf8("\n\r");

    /* renamed from: x */
    private static final C8638h f6281x = C8638h.encodeUtf8("*/");

    /* renamed from: n */
    private final C8637g f6282n;

    /* renamed from: o */
    private final C8633e f6283o;

    /* renamed from: p */
    private int f6284p = 0;

    /* renamed from: q */
    private long f6285q;

    /* renamed from: r */
    private int f6286r;

    /* renamed from: s */
    private String f6287s;

    C1661e(C8637g gVar) {
        Objects.requireNonNull(gVar, "source == null");
        this.f6282n = gVar;
        this.f6283o = gVar.mo30702e();
        mo7437o0(6);
    }

    /* renamed from: L0 */
    private void m8337L0() throws IOException {
        if (!this.f6272k) {
            mo7428H0("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    /* renamed from: N0 */
    private int m8338N0() throws IOException {
        int[] iArr = this.f6269h;
        int i = this.f6268g;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int Q0 = m8341Q0(true);
            this.f6283o.readByte();
            if (Q0 != 44) {
                if (Q0 == 59) {
                    m8337L0();
                } else if (Q0 == 93) {
                    this.f6284p = 4;
                    return 4;
                } else {
                    mo7428H0("Unterminated array");
                    throw null;
                }
            }
        } else if (i2 == 3 || i2 == 5) {
            iArr[i - 1] = 4;
            if (i2 == 5) {
                int Q02 = m8341Q0(true);
                this.f6283o.readByte();
                if (Q02 != 44) {
                    if (Q02 == 59) {
                        m8337L0();
                    } else if (Q02 == 125) {
                        this.f6284p = 2;
                        return 2;
                    } else {
                        mo7428H0("Unterminated object");
                        throw null;
                    }
                }
            }
            int Q03 = m8341Q0(true);
            if (Q03 == 34) {
                this.f6283o.readByte();
                this.f6284p = 13;
                return 13;
            } else if (Q03 == 39) {
                this.f6283o.readByte();
                m8337L0();
                this.f6284p = 12;
                return 12;
            } else if (Q03 != 125) {
                m8337L0();
                if (m8340P0((char) Q03)) {
                    this.f6284p = 14;
                    return 14;
                }
                mo7428H0("Expected name");
                throw null;
            } else if (i2 != 5) {
                this.f6283o.readByte();
                this.f6284p = 2;
                return 2;
            } else {
                mo7428H0("Expected name");
                throw null;
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int Q04 = m8341Q0(true);
            this.f6283o.readByte();
            if (Q04 != 58) {
                if (Q04 == 61) {
                    m8337L0();
                    if (this.f6282n.mo30708g0(1) && this.f6283o.mo30718n0(0) == 62) {
                        this.f6283o.readByte();
                    }
                } else {
                    mo7428H0("Expected ':'");
                    throw null;
                }
            }
        } else if (i2 == 6) {
            iArr[i - 1] = 7;
        } else if (i2 == 7) {
            if (m8341Q0(false) == -1) {
                this.f6284p = 18;
                return 18;
            }
            m8337L0();
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int Q05 = m8341Q0(true);
        if (Q05 == 34) {
            this.f6283o.readByte();
            this.f6284p = 9;
            return 9;
        } else if (Q05 != 39) {
            if (!(Q05 == 44 || Q05 == 59)) {
                if (Q05 == 91) {
                    this.f6283o.readByte();
                    this.f6284p = 3;
                    return 3;
                } else if (Q05 != 93) {
                    if (Q05 != 123) {
                        int T0 = m8344T0();
                        if (T0 != 0) {
                            return T0;
                        }
                        int U0 = m8345U0();
                        if (U0 != 0) {
                            return U0;
                        }
                        if (m8340P0(this.f6283o.mo30718n0(0))) {
                            m8337L0();
                            this.f6284p = 10;
                            return 10;
                        }
                        mo7428H0("Expected value");
                        throw null;
                    }
                    this.f6283o.readByte();
                    this.f6284p = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.f6283o.readByte();
                    this.f6284p = 4;
                    return 4;
                }
            }
            if (i2 == 1 || i2 == 2) {
                m8337L0();
                this.f6284p = 7;
                return 7;
            }
            mo7428H0("Unexpected value");
            throw null;
        } else {
            m8337L0();
            this.f6283o.readByte();
            this.f6284p = 8;
            return 8;
        }
    }

    /* renamed from: O0 */
    private int m8339O0(String str, C1657c.C1658a aVar) {
        int length = aVar.f6274a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f6274a[i])) {
                this.f6284p = 0;
                this.f6270i[this.f6268g - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: P0 */
    private boolean m8340P0(int i) throws IOException {
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
        m8337L0();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r6.f6283o.mo30715j((long) (r3 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r1 != 47) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r6.f6282n.mo30708g0(2) != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        m8337L0();
        r3 = r6.f6283o.mo30718n0(1);
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
        r6.f6283o.readByte();
        r6.f6283o.readByte();
        m8349Y0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r6.f6283o.readByte();
        r6.f6283o.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (m8348X0() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        mo7428H0("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r1 != 35) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        m8337L0();
        m8349Y0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        return r1;
     */
    /* renamed from: Q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m8341Q0(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            r1 = 0
        L_0x0002:
            k.g r2 = r6.f6282n
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.mo30708g0(r4)
            if (r2 == 0) goto L_0x0082
            k.e r2 = r6.f6283o
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
            k.e r2 = r6.f6283o
            int r3 = r3 + -1
            long r3 = (long) r3
            r2.mo30715j(r3)
            r2 = 47
            if (r1 != r2) goto L_0x0074
            k.g r3 = r6.f6282n
            r4 = 2
            boolean r3 = r3.mo30708g0(r4)
            if (r3 != 0) goto L_0x003c
            return r1
        L_0x003c:
            r6.m8337L0()
            k.e r3 = r6.f6283o
            r4 = 1
            byte r3 = r3.mo30718n0(r4)
            r4 = 42
            if (r3 == r4) goto L_0x005c
            if (r3 == r2) goto L_0x004e
            return r1
        L_0x004e:
            k.e r1 = r6.f6283o
            r1.readByte()
            k.e r1 = r6.f6283o
            r1.readByte()
            r6.m8349Y0()
            goto L_0x0001
        L_0x005c:
            k.e r1 = r6.f6283o
            r1.readByte()
            k.e r1 = r6.f6283o
            r1.readByte()
            boolean r1 = r6.m8348X0()
            if (r1 == 0) goto L_0x006d
            goto L_0x0001
        L_0x006d:
            java.lang.String r7 = "Unterminated comment"
            r6.mo7428H0(r7)
            r7 = 0
            throw r7
        L_0x0074:
            r2 = 35
            if (r1 != r2) goto L_0x007f
            r6.m8337L0()
            r6.m8349Y0()
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
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p024x.p025n0.C1661e.m8341Q0(boolean):int");
    }

    /* renamed from: R0 */
    private String m8342R0(C8638h hVar) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long I = this.f6282n.mo30672I(hVar);
            if (I == -1) {
                mo7428H0("Unterminated string");
                throw null;
            } else if (this.f6283o.mo30718n0(I) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f6283o.mo30683R0(I));
                this.f6283o.readByte();
                sb.append(m8346V0());
            } else if (sb == null) {
                String R0 = this.f6283o.mo30683R0(I);
                this.f6283o.readByte();
                return R0;
            } else {
                sb.append(this.f6283o.mo30683R0(I));
                this.f6283o.readByte();
                return sb.toString();
            }
        }
    }

    /* renamed from: S0 */
    private String m8343S0() throws IOException {
        long I = this.f6282n.mo30672I(f6279v);
        return I != -1 ? this.f6283o.mo30683R0(I) : this.f6283o.mo30682Q0();
    }

    /* renamed from: T0 */
    private int m8344T0() throws IOException {
        String str;
        String str2;
        int i;
        byte n0 = this.f6283o.mo30718n0(0);
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
            if (!this.f6282n.mo30708g0((long) i3)) {
                return 0;
            }
            byte n02 = this.f6283o.mo30718n0((long) i2);
            if (n02 != str2.charAt(i2) && n02 != str.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.f6282n.mo30708g0((long) (length + 1)) && m8340P0(this.f6283o.mo30718n0((long) length))) {
            return 0;
        }
        this.f6283o.mo30715j((long) length);
        this.f6284p = i;
        return i;
    }

    /* renamed from: U0 */
    private int m8345U0() throws IOException {
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
            if (!this.f6282n.mo30708g0((long) i3)) {
                break;
            }
            n0 = this.f6283o.mo30718n0((long) i2);
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
        if (m8340P0(n0)) {
            return 0;
        }
        if (c == 2 && z2 && ((j != Long.MIN_VALUE || z3) && (j != 0 || !z3))) {
            if (!z3) {
                j = -j;
            }
            this.f6285q = j;
            this.f6283o.mo30715j((long) i2);
            this.f6284p = 16;
            return 16;
        } else if (c != 2 && c != 4 && c != 7) {
            return 0;
        } else {
            this.f6286r = i2;
            this.f6284p = 17;
            return 17;
        }
    }

    /* renamed from: V0 */
    private char m8346V0() throws IOException {
        int i;
        int i2;
        if (this.f6282n.mo30708g0(1)) {
            byte readByte = this.f6283o.readByte();
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
                if (this.f6272k) {
                    return (char) readByte;
                }
                mo7428H0("Invalid escape sequence: \\" + ((char) readByte));
                throw null;
            } else if (this.f6282n.mo30708g0(4)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte n0 = this.f6283o.mo30718n0((long) i3);
                    char c2 = (char) (c << 4);
                    if (n0 < 48 || n0 > 57) {
                        if (n0 >= 97 && n0 <= 102) {
                            i = n0 - 97;
                        } else if (n0 < 65 || n0 > 70) {
                            mo7428H0("\\u" + this.f6283o.mo30683R0(4));
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
                this.f6283o.mo30715j(4);
                return c;
            } else {
                throw new EOFException("Unterminated escape sequence at path " + getPath());
            }
        } else {
            mo7428H0("Unterminated escape sequence");
            throw null;
        }
    }

    /* renamed from: W0 */
    private void m8347W0(C8638h hVar) throws IOException {
        while (true) {
            long I = this.f6282n.mo30672I(hVar);
            if (I == -1) {
                mo7428H0("Unterminated string");
                throw null;
            } else if (this.f6283o.mo30718n0(I) == 92) {
                this.f6283o.mo30715j(I + 1);
                m8346V0();
            } else {
                this.f6283o.mo30715j(I + 1);
                return;
            }
        }
    }

    /* renamed from: X0 */
    private boolean m8348X0() throws IOException {
        C8637g gVar = this.f6282n;
        C8638h hVar = f6281x;
        long z = gVar.mo30735z(hVar);
        boolean z2 = z != -1;
        C8633e eVar = this.f6283o;
        eVar.mo30715j(z2 ? z + ((long) hVar.size()) : eVar.mo30688U0());
        return z2;
    }

    /* renamed from: Y0 */
    private void m8349Y0() throws IOException {
        long I = this.f6282n.mo30672I(f6280w);
        C8633e eVar = this.f6283o;
        eVar.mo30715j(I != -1 ? I + 1 : eVar.mo30688U0());
    }

    /* renamed from: Z0 */
    private void m8350Z0() throws IOException {
        long I = this.f6282n.mo30672I(f6279v);
        C8633e eVar = this.f6283o;
        if (I == -1) {
            I = eVar.mo30688U0();
        }
        eVar.mo30715j(I);
    }

    /* renamed from: A0 */
    public void mo7425A0() throws IOException {
        if (!this.f6273l) {
            int i = 0;
            do {
                int i2 = this.f6284p;
                if (i2 == 0) {
                    i2 = m8338N0();
                }
                if (i2 == 3) {
                    mo7437o0(1);
                } else if (i2 == 1) {
                    mo7437o0(3);
                } else {
                    if (i2 == 4) {
                        i--;
                        if (i >= 0) {
                            this.f6268g--;
                        } else {
                            throw new C1655a("Expected a value but was " + mo7436n0() + " at path " + getPath());
                        }
                    } else if (i2 == 2) {
                        i--;
                        if (i >= 0) {
                            this.f6268g--;
                        } else {
                            throw new C1655a("Expected a value but was " + mo7436n0() + " at path " + getPath());
                        }
                    } else if (i2 == 14 || i2 == 10) {
                        m8350Z0();
                    } else if (i2 == 9 || i2 == 13) {
                        m8347W0(f6278u);
                    } else if (i2 == 8 || i2 == 12) {
                        m8347W0(f6277t);
                    } else if (i2 == 17) {
                        this.f6283o.mo30715j((long) this.f6286r);
                    } else if (i2 == 18) {
                        throw new C1655a("Expected a value but was " + mo7436n0() + " at path " + getPath());
                    }
                    this.f6284p = 0;
                }
                i++;
                this.f6284p = 0;
            } while (i != 0);
            int[] iArr = this.f6271j;
            int i3 = this.f6268g;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f6270i[i3 - 1] = "null";
            return;
        }
        throw new C1655a("Cannot skip unexpected " + mo7436n0() + " at " + getPath());
    }

    /* renamed from: E */
    public void mo7426E() throws IOException {
        int i = this.f6284p;
        if (i == 0) {
            i = m8338N0();
        }
        if (i == 2) {
            int i2 = this.f6268g - 1;
            this.f6268g = i2;
            this.f6270i[i2] = null;
            int[] iArr = this.f6271j;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f6284p = 0;
            return;
        }
        throw new C1655a("Expected END_OBJECT but was " + mo7436n0() + " at path " + getPath());
    }

    /* renamed from: H */
    public boolean mo7427H() throws IOException {
        int i = this.f6284p;
        if (i == 0) {
            i = m8338N0();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    /* renamed from: K */
    public boolean mo7429K() throws IOException {
        int i = this.f6284p;
        if (i == 0) {
            i = m8338N0();
        }
        if (i == 5) {
            this.f6284p = 0;
            int[] iArr = this.f6271j;
            int i2 = this.f6268g - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f6284p = 0;
            int[] iArr2 = this.f6271j;
            int i3 = this.f6268g - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new C1655a("Expected a boolean but was " + mo7436n0() + " at path " + getPath());
        }
    }

    /* renamed from: Q */
    public double mo7430Q() throws IOException {
        int i = this.f6284p;
        if (i == 0) {
            i = m8338N0();
        }
        if (i == 16) {
            this.f6284p = 0;
            int[] iArr = this.f6271j;
            int i2 = this.f6268g - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f6285q;
        }
        if (i == 17) {
            this.f6287s = this.f6283o.mo30683R0((long) this.f6286r);
        } else if (i == 9) {
            this.f6287s = m8342R0(f6278u);
        } else if (i == 8) {
            this.f6287s = m8342R0(f6277t);
        } else if (i == 10) {
            this.f6287s = m8343S0();
        } else if (i != 11) {
            throw new C1655a("Expected a double but was " + mo7436n0() + " at path " + getPath());
        }
        this.f6284p = 11;
        try {
            double parseDouble = Double.parseDouble(this.f6287s);
            if (this.f6272k || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
                this.f6287s = null;
                this.f6284p = 0;
                int[] iArr2 = this.f6271j;
                int i3 = this.f6268g - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseDouble;
            }
            throw new C1656b("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new C1655a("Expected a double but was " + this.f6287s + " at path " + getPath());
        }
    }

    /* renamed from: T */
    public int mo7431T() throws IOException {
        String str;
        int i = this.f6284p;
        if (i == 0) {
            i = m8338N0();
        }
        if (i == 16) {
            long j = this.f6285q;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f6284p = 0;
                int[] iArr = this.f6271j;
                int i3 = this.f6268g - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new C1655a("Expected an int but was " + this.f6285q + " at path " + getPath());
        }
        if (i == 17) {
            this.f6287s = this.f6283o.mo30683R0((long) this.f6286r);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                str = m8342R0(f6278u);
            } else {
                str = m8342R0(f6277t);
            }
            this.f6287s = str;
            try {
                int parseInt = Integer.parseInt(str);
                this.f6284p = 0;
                int[] iArr2 = this.f6271j;
                int i4 = this.f6268g - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new C1655a("Expected an int but was " + mo7436n0() + " at path " + getPath());
        }
        this.f6284p = 11;
        try {
            double parseDouble = Double.parseDouble(this.f6287s);
            int i5 = (int) parseDouble;
            if (((double) i5) == parseDouble) {
                this.f6287s = null;
                this.f6284p = 0;
                int[] iArr3 = this.f6271j;
                int i6 = this.f6268g - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new C1655a("Expected an int but was " + this.f6287s + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new C1655a("Expected an int but was " + this.f6287s + " at path " + getPath());
        }
    }

    /* renamed from: Y */
    public String mo7432Y() throws IOException {
        String str;
        int i = this.f6284p;
        if (i == 0) {
            i = m8338N0();
        }
        if (i == 14) {
            str = m8343S0();
        } else if (i == 13) {
            str = m8342R0(f6278u);
        } else if (i == 12) {
            str = m8342R0(f6277t);
        } else if (i == 15) {
            str = this.f6287s;
        } else {
            throw new C1655a("Expected a name but was " + mo7436n0() + " at path " + getPath());
        }
        this.f6284p = 0;
        this.f6270i[this.f6268g - 1] = str;
        return str;
    }

    public void close() throws IOException {
        this.f6284p = 0;
        this.f6269h[0] = 8;
        this.f6268g = 1;
        this.f6283o.mo30697c();
        this.f6282n.close();
    }

    /* renamed from: d */
    public void mo7433d() throws IOException {
        int i = this.f6284p;
        if (i == 0) {
            i = m8338N0();
        }
        if (i == 3) {
            mo7437o0(1);
            this.f6271j[this.f6268g - 1] = 0;
            this.f6284p = 0;
            return;
        }
        throw new C1655a("Expected BEGIN_ARRAY but was " + mo7436n0() + " at path " + getPath());
    }

    /* renamed from: i0 */
    public String mo7435i0() throws IOException {
        String str;
        int i = this.f6284p;
        if (i == 0) {
            i = m8338N0();
        }
        if (i == 10) {
            str = m8343S0();
        } else if (i == 9) {
            str = m8342R0(f6278u);
        } else if (i == 8) {
            str = m8342R0(f6277t);
        } else if (i == 11) {
            str = this.f6287s;
            this.f6287s = null;
        } else if (i == 16) {
            str = Long.toString(this.f6285q);
        } else if (i == 17) {
            str = this.f6283o.mo30683R0((long) this.f6286r);
        } else {
            throw new C1655a("Expected a string but was " + mo7436n0() + " at path " + getPath());
        }
        this.f6284p = 0;
        int[] iArr = this.f6271j;
        int i2 = this.f6268g - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: n0 */
    public C1657c.C1659b mo7436n0() throws IOException {
        int i = this.f6284p;
        if (i == 0) {
            i = m8338N0();
        }
        switch (i) {
            case 1:
                return C1657c.C1659b.BEGIN_OBJECT;
            case 2:
                return C1657c.C1659b.END_OBJECT;
            case 3:
                return C1657c.C1659b.BEGIN_ARRAY;
            case 4:
                return C1657c.C1659b.END_ARRAY;
            case 5:
            case 6:
                return C1657c.C1659b.BOOLEAN;
            case 7:
                return C1657c.C1659b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C1657c.C1659b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return C1657c.C1659b.NAME;
            case 16:
            case 17:
                return C1657c.C1659b.NUMBER;
            case 18:
                return C1657c.C1659b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: p */
    public void mo7438p() throws IOException {
        int i = this.f6284p;
        if (i == 0) {
            i = m8338N0();
        }
        if (i == 1) {
            mo7437o0(3);
            this.f6284p = 0;
            return;
        }
        throw new C1655a("Expected BEGIN_OBJECT but was " + mo7436n0() + " at path " + getPath());
    }

    public String toString() {
        return "JsonReader(" + this.f6282n + ")";
    }

    /* renamed from: v0 */
    public int mo7439v0(C1657c.C1658a aVar) throws IOException {
        int i = this.f6284p;
        if (i == 0) {
            i = m8338N0();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return m8339O0(this.f6287s, aVar);
        }
        int M0 = this.f6282n.mo30678M0(aVar.f6275b);
        if (M0 != -1) {
            this.f6284p = 0;
            this.f6270i[this.f6268g - 1] = aVar.f6274a[M0];
            return M0;
        }
        String str = this.f6270i[this.f6268g - 1];
        String Y = mo7432Y();
        int O0 = m8339O0(Y, aVar);
        if (O0 == -1) {
            this.f6284p = 15;
            this.f6287s = Y;
            this.f6270i[this.f6268g - 1] = str;
        }
        return O0;
    }

    /* renamed from: x */
    public void mo7440x() throws IOException {
        int i = this.f6284p;
        if (i == 0) {
            i = m8338N0();
        }
        if (i == 4) {
            int i2 = this.f6268g - 1;
            this.f6268g = i2;
            int[] iArr = this.f6271j;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f6284p = 0;
            return;
        }
        throw new C1655a("Expected END_ARRAY but was " + mo7436n0() + " at path " + getPath());
    }

    /* renamed from: z0 */
    public void mo7441z0() throws IOException {
        if (!this.f6273l) {
            int i = this.f6284p;
            if (i == 0) {
                i = m8338N0();
            }
            if (i == 14) {
                m8350Z0();
            } else if (i == 13) {
                m8347W0(f6278u);
            } else if (i == 12) {
                m8347W0(f6277t);
            } else if (i != 15) {
                throw new C1655a("Expected a name but was " + mo7436n0() + " at path " + getPath());
            }
            this.f6284p = 0;
            this.f6270i[this.f6268g - 1] = "null";
            return;
        }
        throw new C1655a("Cannot skip unexpected " + mo7436n0() + " at " + getPath());
    }
}
