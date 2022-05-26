package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class jr3 implements Iterator<C5142h7>, Closeable, C5179i7 {

    /* renamed from: m */
    private static final C5142h7 f18570m = new ir3("eof ");

    /* renamed from: g */
    protected C5030e7 f18571g;

    /* renamed from: h */
    protected kr3 f18572h;

    /* renamed from: i */
    C5142h7 f18573i = null;

    /* renamed from: j */
    long f18574j = 0;

    /* renamed from: k */
    long f18575k = 0;

    /* renamed from: l */
    private final List<C5142h7> f18576l = new ArrayList();

    static {
        qr3.m29672b(jr3.class);
    }

    /* renamed from: E */
    public final List<C5142h7> mo18706E() {
        return (this.f18572h == null || this.f18573i == f18570m) ? this.f18576l : new pr3(this.f18576l, this);
    }

    /* renamed from: H */
    public final void mo18707H(kr3 kr3, long j, C5030e7 e7Var) throws IOException {
        this.f18572h = kr3;
        this.f18574j = kr3.mo19005a();
        kr3.mo19007g(kr3.mo19005a() + j);
        this.f18575k = kr3.mo19005a();
        this.f18571g = e7Var;
    }

    public void close() throws IOException {
    }

    public final boolean hasNext() {
        C5142h7 h7Var = this.f18573i;
        if (h7Var == f18570m) {
            return false;
        }
        if (h7Var != null) {
            return true;
        }
        try {
            this.f18573i = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f18573i = f18570m;
            return false;
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.f18576l.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(this.f18576l.get(i).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: x */
    public final C5142h7 next() {
        C5142h7 a;
        C5142h7 h7Var = this.f18573i;
        if (h7Var == null || h7Var == f18570m) {
            kr3 kr3 = this.f18572h;
            if (kr3 == null || this.f18574j >= this.f18575k) {
                this.f18573i = f18570m;
                throw new NoSuchElementException();
            }
            try {
                synchronized (kr3) {
                    this.f18572h.mo19007g(this.f18574j);
                    a = this.f18571g.mo16872a(this.f18572h, this);
                    this.f18574j = this.f18572h.mo19005a();
                }
                return a;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        } else {
            this.f18573i = null;
            return h7Var;
        }
    }
}
