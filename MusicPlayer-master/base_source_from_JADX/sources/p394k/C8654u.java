package p394k;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p369i.p387z.p389d.C8594l;
import p394k.p395c0.C8625a;

/* renamed from: k.u */
/* compiled from: RealBufferedSource.kt */
public final class C8654u implements C8637g {

    /* renamed from: g */
    public final C8633e f35008g = new C8633e();

    /* renamed from: h */
    public boolean f35009h;

    /* renamed from: i */
    public final C8620a0 f35010i;

    public C8654u(C8620a0 a0Var) {
        C8594l.m46771e(a0Var, "source");
        this.f35010i = a0Var;
    }

    /* renamed from: A */
    public boolean mo30664A() {
        if (!(!this.f35009h)) {
            throw new IllegalStateException("closed".toString());
        } else if (!this.f35008g.mo30664A() || this.f35010i.mo29326w0(this.f35008g, (long) 8192) != -1) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: E */
    public int mo30831E() {
        mo30668E0(4);
        return this.f35008g.mo30679N0();
    }

    /* renamed from: E0 */
    public void mo30668E0(long j) {
        if (!mo30708g0(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: H */
    public short mo30832H() {
        mo30668E0(2);
        return this.f35008g.mo30680O0();
    }

    /* renamed from: I */
    public long mo30672I(C8638h hVar) {
        C8594l.m46771e(hVar, "targetBytes");
        return mo30840x(hVar, 0);
    }

    /* renamed from: K */
    public String mo30833K(long j) {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            byte b = (byte) 10;
            long d = mo30835d(b, 0, j2);
            if (d != -1) {
                return C8625a.m46830c(this.f35008g, d);
            }
            if (j2 < Long.MAX_VALUE && mo30708g0(j2) && this.f35008g.mo30718n0(j2 - 1) == ((byte) 13) && mo30708g0(1 + j2) && this.f35008g.mo30718n0(j2) == b) {
                return C8625a.m46830c(this.f35008g, j2);
            }
            C8633e eVar = new C8633e();
            C8633e eVar2 = this.f35008g;
            eVar2.mo30685T(eVar, 0, Math.min((long) 32, eVar2.mo30688U0()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f35008g.mo30688U0(), j) + " content=" + eVar.mo30671H0().hex() + "…");
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* renamed from: K0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo30676K0() {
        /*
            r5 = this;
            r0 = 1
            r5.mo30668E0(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.mo30708g0(r2)
            if (r2 == 0) goto L_0x0062
            k.e r2 = r5.f35008g
            long r3 = (long) r0
            byte r2 = r2.mo30718n0(r3)
            r3 = 48
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0020
            r3 = 57
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x0020:
            r3 = 97
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x002a
            r3 = 102(0x66, float:1.43E-43)
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x002a:
            r3 = 65
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0037
            r3 = 70
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = r1
            goto L_0x0006
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            goto L_0x0062
        L_0x003a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r3)
            r3 = 16
            int unused = p369i.p376f0.C8420b.m46471a(r3)
            int unused = p369i.p376f0.C8420b.m46471a(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            p369i.p387z.p389d.C8594l.m46770d(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0062:
            k.e r0 = r5.f35008g
            long r0 = r0.mo30676K0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p394k.C8654u.mo30676K0():long");
    }

    /* renamed from: M0 */
    public int mo30678M0(C8648q qVar) {
        C8594l.m46771e(qVar, "options");
        if (!this.f35009h) {
            while (true) {
                int d = C8625a.m46831d(this.f35008g, qVar, true);
                if (d == -2) {
                    if (this.f35010i.mo29326w0(this.f35008g, (long) 8192) == -1) {
                        break;
                    }
                } else if (d != -1) {
                    this.f35008g.mo30715j((long) qVar.mo30817t()[d].size());
                    return d;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: c */
    public long mo30834c(byte b) {
        return mo30835d(b, 0, Long.MAX_VALUE);
    }

    public void close() {
        if (!this.f35009h) {
            this.f35009h = true;
            this.f35010i.close();
            this.f35008g.mo30697c();
        }
    }

    /* renamed from: d */
    public long mo30835d(byte b, long j, long j2) {
        boolean z = true;
        if (!this.f35009h) {
            if (0 > j || j2 < j) {
                z = false;
            }
            if (z) {
                while (j < j2) {
                    long o0 = this.f35008g.mo30720o0(b, j, j2);
                    if (o0 != -1) {
                        return o0;
                    }
                    long U0 = this.f35008g.mo30688U0();
                    if (U0 >= j2 || this.f35010i.mo29326w0(this.f35008g, (long) 8192) == -1) {
                        return -1;
                    }
                    j = Math.max(j, U0);
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: e */
    public C8633e mo30702e() {
        return this.f35008g;
    }

    /* renamed from: g0 */
    public boolean mo30708g0(long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!this.f35009h) {
            while (this.f35008g.mo30688U0() < j) {
                if (this.f35010i.mo29326w0(this.f35008g, (long) 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: h */
    public C8633e mo30710h() {
        return this.f35008g;
    }

    public InputStream inputStream() {
        return new C8655a(this);
    }

    public boolean isOpen() {
        return !this.f35009h;
    }

    /* renamed from: j */
    public void mo30715j(long j) {
        if (!this.f35009h) {
            while (j > 0) {
                if (this.f35008g.mo30688U0() == 0 && this.f35010i.mo29326w0(this.f35008g, (long) 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f35008g.mo30688U0());
                this.f35008g.mo30715j(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: l0 */
    public String mo30716l0() {
        return mo30833K(Long.MAX_VALUE);
    }

    /* renamed from: o */
    public C8638h mo30719o(long j) {
        mo30668E0(j);
        return this.f35008g.mo30719o(j);
    }

    /* renamed from: p */
    public long mo30837p(C8638h hVar, long j) {
        C8594l.m46771e(hVar, "bytes");
        if (!this.f35009h) {
            while (true) {
                long v0 = this.f35008g.mo30732v0(hVar, j);
                if (v0 != -1) {
                    return v0;
                }
                long U0 = this.f35008g.mo30688U0();
                if (this.f35010i.mo29326w0(this.f35008g, (long) 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, (U0 - ((long) hVar.size())) + 1);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: p0 */
    public byte[] mo30721p0(long j) {
        mo30668E0(j);
        return this.f35008g.mo30721p0(j);
    }

    public C8637g peek() {
        return C8645n.m46985b(new C8651s(this));
    }

    public int read(ByteBuffer byteBuffer) {
        C8594l.m46771e(byteBuffer, "sink");
        if (this.f35008g.mo30688U0() == 0 && this.f35010i.mo29326w0(this.f35008g, (long) 8192) == -1) {
            return -1;
        }
        return this.f35008g.read(byteBuffer);
    }

    public byte readByte() {
        mo30668E0(1);
        return this.f35008g.readByte();
    }

    public int readInt() {
        mo30668E0(4);
        return this.f35008g.readInt();
    }

    public short readShort() {
        mo30668E0(2);
        return this.f35008g.readShort();
    }

    public C8622b0 timeout() {
        return this.f35010i.timeout();
    }

    public String toString() {
        return "buffer(" + this.f35010i + ')';
    }

    /* renamed from: w0 */
    public long mo29326w0(C8633e eVar, long j) {
        C8594l.m46771e(eVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!(true ^ this.f35009h)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.f35008g.mo30688U0() == 0 && this.f35010i.mo29326w0(this.f35008g, (long) 8192) == -1) {
            return -1;
        } else {
            return this.f35008g.mo29326w0(eVar, Math.min(j, this.f35008g.mo30688U0()));
        }
    }

    /* renamed from: x */
    public long mo30840x(C8638h hVar, long j) {
        C8594l.m46771e(hVar, "targetBytes");
        if (!this.f35009h) {
            while (true) {
                long z0 = this.f35008g.mo30736z0(hVar, j);
                if (z0 != -1) {
                    return z0;
                }
                long U0 = this.f35008g.mo30688U0();
                if (this.f35010i.mo29326w0(this.f35008g, (long) 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, U0);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: z */
    public long mo30735z(C8638h hVar) {
        C8594l.m46771e(hVar, "bytes");
        return mo30837p(hVar, 0);
    }

    /* renamed from: k.u$a */
    /* compiled from: RealBufferedSource.kt */
    public static final class C8655a extends InputStream {

        /* renamed from: g */
        final /* synthetic */ C8654u f35011g;

        C8655a(C8654u uVar) {
            this.f35011g = uVar;
        }

        public int available() {
            C8654u uVar = this.f35011g;
            if (!uVar.f35009h) {
                return (int) Math.min(uVar.f35008g.mo30688U0(), (long) Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        public void close() {
            this.f35011g.close();
        }

        public int read() {
            C8654u uVar = this.f35011g;
            if (!uVar.f35009h) {
                if (uVar.f35008g.mo30688U0() == 0) {
                    C8654u uVar2 = this.f35011g;
                    if (uVar2.f35010i.mo29326w0(uVar2.f35008g, (long) 8192) == -1) {
                        return -1;
                    }
                }
                return this.f35011g.f35008g.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return this.f35011g + ".inputStream()";
        }

        public int read(byte[] bArr, int i, int i2) {
            C8594l.m46771e(bArr, "data");
            if (!this.f35011g.f35009h) {
                C8624c.m46824b((long) bArr.length, (long) i, (long) i2);
                if (this.f35011g.f35008g.mo30688U0() == 0) {
                    C8654u uVar = this.f35011g;
                    if (uVar.f35010i.mo29326w0(uVar.f35008g, (long) 8192) == -1) {
                        return -1;
                    }
                }
                return this.f35011g.f35008g.mo30665A0(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }
}
