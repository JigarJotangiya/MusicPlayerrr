package p159f.p334h.p337b.p338z.p340k;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p394k.C8620a0;
import p394k.C8633e;
import p394k.C8637g;
import p394k.C8638h;
import p394k.C8641j;
import p394k.C8643l;
import p394k.C8645n;

/* renamed from: f.h.b.z.k.j */
/* compiled from: NameValueBlockReader */
class C7911j {

    /* renamed from: a */
    private final C8643l f33552a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f33553b;

    /* renamed from: c */
    private final C8637g f33554c;

    /* renamed from: f.h.b.z.k.j$a */
    /* compiled from: NameValueBlockReader */
    class C7912a extends C8641j {
        C7912a(C8620a0 a0Var) {
            super(a0Var);
        }

        /* renamed from: w0 */
        public long mo29326w0(C8633e eVar, long j) throws IOException {
            if (C7911j.this.f33553b == 0) {
                return -1;
            }
            long w0 = super.mo29326w0(eVar, Math.min(j, (long) C7911j.this.f33553b));
            if (w0 == -1) {
                return -1;
            }
            C7911j jVar = C7911j.this;
            int unused = jVar.f33553b = (int) (((long) jVar.f33553b) - w0);
            return w0;
        }
    }

    /* renamed from: f.h.b.z.k.j$b */
    /* compiled from: NameValueBlockReader */
    class C7913b extends Inflater {
        C7913b(C7911j jVar) {
        }

        public int inflate(byte[] bArr, int i, int i2) throws DataFormatException {
            int inflate = super.inflate(bArr, i, i2);
            if (inflate != 0 || !needsDictionary()) {
                return inflate;
            }
            setDictionary(C7918n.f33564a);
            return super.inflate(bArr, i, i2);
        }
    }

    public C7911j(C8637g gVar) {
        C8643l lVar = new C8643l((C8620a0) new C7912a(gVar), (Inflater) new C7913b(this));
        this.f33552a = lVar;
        this.f33554c = C8645n.m46985b(lVar);
    }

    /* renamed from: d */
    private void m43360d() throws IOException {
        if (this.f33553b > 0) {
            this.f33552a.mo30813d();
            if (this.f33553b != 0) {
                throw new IOException("compressedLimit > 0: " + this.f33553b);
            }
        }
    }

    /* renamed from: e */
    private C8638h m43361e() throws IOException {
        return this.f33554c.mo30719o((long) this.f33554c.readInt());
    }

    /* renamed from: c */
    public void mo29408c() throws IOException {
        this.f33554c.close();
    }

    /* renamed from: f */
    public List<C7897d> mo29409f(int i) throws IOException {
        this.f33553b += i;
        int readInt = this.f33554c.readInt();
        if (readInt < 0) {
            throw new IOException("numberOfPairs < 0: " + readInt);
        } else if (readInt <= 1024) {
            ArrayList arrayList = new ArrayList(readInt);
            int i2 = 0;
            while (i2 < readInt) {
                C8638h asciiLowercase = m43361e().toAsciiLowercase();
                C8638h e = m43361e();
                if (asciiLowercase.size() != 0) {
                    arrayList.add(new C7897d(asciiLowercase, e));
                    i2++;
                } else {
                    throw new IOException("name.size == 0");
                }
            }
            m43360d();
            return arrayList;
        } else {
            throw new IOException("numberOfPairs > 1024: " + readInt);
        }
    }
}
