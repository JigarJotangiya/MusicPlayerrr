package p394k;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import p369i.p387z.p389d.C8594l;

/* renamed from: k.k */
/* compiled from: GzipSource.kt */
public final class C8642k implements C8620a0 {

    /* renamed from: g */
    private byte f34981g;

    /* renamed from: h */
    private final C8654u f34982h;

    /* renamed from: i */
    private final Inflater f34983i;

    /* renamed from: j */
    private final C8643l f34984j;

    /* renamed from: k */
    private final CRC32 f34985k = new CRC32();

    public C8642k(C8620a0 a0Var) {
        C8594l.m46771e(a0Var, "source");
        C8654u uVar = new C8654u(a0Var);
        this.f34982h = uVar;
        Inflater inflater = new Inflater(true);
        this.f34983i = inflater;
        this.f34984j = new C8643l((C8637g) uVar, inflater);
    }

    /* renamed from: c */
    private final void m46974c(String str, int i, int i2) {
        if (i2 != i) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
            C8594l.m46770d(format, "java.lang.String.format(this, *args)");
            throw new IOException(format);
        }
    }

    /* renamed from: d */
    private final void m46975d() throws IOException {
        this.f34982h.mo30668E0(10);
        byte n0 = this.f34982h.f35008g.mo30718n0(3);
        boolean z = true;
        boolean z2 = ((n0 >> 1) & 1) == 1;
        if (z2) {
            m46977x(this.f34982h.f35008g, 0, 10);
        }
        m46974c("ID1ID2", 8075, this.f34982h.readShort());
        this.f34982h.mo30715j(8);
        if (((n0 >> 2) & 1) == 1) {
            this.f34982h.mo30668E0(2);
            if (z2) {
                m46977x(this.f34982h.f35008g, 0, 2);
            }
            long O0 = (long) this.f34982h.f35008g.mo30680O0();
            this.f34982h.mo30668E0(O0);
            if (z2) {
                m46977x(this.f34982h.f35008g, 0, O0);
            }
            this.f34982h.mo30715j(O0);
        }
        if (((n0 >> 3) & 1) == 1) {
            long c = this.f34982h.mo30834c((byte) 0);
            if (c != -1) {
                if (z2) {
                    m46977x(this.f34982h.f35008g, 0, c + 1);
                }
                this.f34982h.mo30715j(c + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((n0 >> 4) & 1) != 1) {
            z = false;
        }
        if (z) {
            long c2 = this.f34982h.mo30834c((byte) 0);
            if (c2 != -1) {
                if (z2) {
                    m46977x(this.f34982h.f35008g, 0, c2 + 1);
                }
                this.f34982h.mo30715j(c2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z2) {
            m46974c("FHCRC", this.f34982h.mo30832H(), (short) ((int) this.f34985k.getValue()));
            this.f34985k.reset();
        }
    }

    /* renamed from: p */
    private final void m46976p() throws IOException {
        m46974c("CRC", this.f34982h.mo30831E(), (int) this.f34985k.getValue());
        m46974c("ISIZE", this.f34982h.mo30831E(), (int) this.f34983i.getBytesWritten());
    }

    /* renamed from: x */
    private final void m46977x(C8633e eVar, long j, long j2) {
        C8656v vVar = eVar.f34971g;
        C8594l.m46769c(vVar);
        while (true) {
            int i = vVar.f35014c;
            int i2 = vVar.f35013b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            vVar = vVar.f35017f;
            C8594l.m46769c(vVar);
        }
        while (j2 > 0) {
            int i3 = (int) (((long) vVar.f35013b) + j);
            int min = (int) Math.min((long) (vVar.f35014c - i3), j2);
            this.f34985k.update(vVar.f35012a, i3, min);
            j2 -= (long) min;
            vVar = vVar.f35017f;
            C8594l.m46769c(vVar);
            j = 0;
        }
    }

    public void close() throws IOException {
        this.f34984j.close();
    }

    public C8622b0 timeout() {
        return this.f34982h.timeout();
    }

    /* renamed from: w0 */
    public long mo29326w0(C8633e eVar, long j) throws IOException {
        C8594l.m46771e(eVar, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (i == 0) {
            return 0;
        } else {
            if (this.f34981g == 0) {
                m46975d();
                this.f34981g = 1;
            }
            if (this.f34981g == 1) {
                long U0 = eVar.mo30688U0();
                long w0 = this.f34984j.mo29326w0(eVar, j);
                if (w0 != -1) {
                    m46977x(eVar, U0, w0);
                    return w0;
                }
                this.f34981g = 2;
            }
            if (this.f34981g == 2) {
                m46976p();
                this.f34981g = 3;
                if (!this.f34982h.mo30664A()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }
}
