package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.vj */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5672vj implements C5743xg {

    /* renamed from: a */
    private final C5561sj f24783a = new C5561sj();

    /* renamed from: b */
    private final C5524rj f24784b = new C5524rj();

    /* renamed from: c */
    private final C5600tl f24785c = new C5600tl(32);

    /* renamed from: d */
    private final AtomicInteger f24786d = new AtomicInteger();

    /* renamed from: e */
    private C5598tj f24787e;

    /* renamed from: f */
    private C5598tj f24788f;

    /* renamed from: g */
    private zzapg f24789g;

    /* renamed from: h */
    private long f24790h;

    /* renamed from: i */
    private int f24791i = 65536;

    /* renamed from: j */
    private C5635uj f24792j;

    /* renamed from: k */
    private final C5785yk f24793k;

    public C5672vj(C5785yk ykVar, byte[] bArr) {
        this.f24793k = ykVar;
        C5598tj tjVar = new C5598tj(0, 65536);
        this.f24787e = tjVar;
        this.f24788f = tjVar;
    }

    /* renamed from: o */
    private final int m32394o(int i) {
        if (this.f24791i == 65536) {
            this.f24791i = 0;
            C5598tj tjVar = this.f24788f;
            if (tjVar.f23898c) {
                this.f24788f = tjVar.f23900e;
            }
            C5598tj tjVar2 = this.f24788f;
            C5562sk b = this.f24793k.mo22206b();
            C5598tj tjVar3 = new C5598tj(this.f24788f.f23897b, 65536);
            tjVar2.f23899d = b;
            tjVar2.f23900e = tjVar3;
            tjVar2.f23898c = true;
        }
        return Math.min(i, 65536 - this.f24791i);
    }

    /* renamed from: p */
    private final void m32395p() {
        this.f24783a.mo20854g();
        C5598tj tjVar = this.f24787e;
        if (tjVar.f23898c) {
            C5598tj tjVar2 = this.f24788f;
            int i = (tjVar2.f23898c ? 1 : 0) + (((int) (tjVar2.f23896a - tjVar.f23896a)) / 65536);
            C5562sk[] skVarArr = new C5562sk[i];
            for (int i2 = 0; i2 < i; i2++) {
                skVarArr[i2] = tjVar.f23899d;
                tjVar.f23899d = null;
                tjVar = tjVar.f23900e;
            }
            this.f24793k.mo22208d(skVarArr);
        }
        C5598tj tjVar3 = new C5598tj(0, 65536);
        this.f24787e = tjVar3;
        this.f24788f = tjVar3;
        this.f24790h = 0;
        this.f24791i = 65536;
        this.f24793k.mo22211g();
    }

    /* renamed from: q */
    private final void m32396q(long j) {
        while (true) {
            C5598tj tjVar = this.f24787e;
            if (j >= tjVar.f23897b) {
                this.f24793k.mo22207c(tjVar.f23899d);
                C5598tj tjVar2 = this.f24787e;
                tjVar2.f23899d = null;
                this.f24787e = tjVar2.f23900e;
            } else {
                return;
            }
        }
    }

    /* renamed from: r */
    private final void m32397r() {
        if (!this.f24786d.compareAndSet(1, 0)) {
            m32395p();
        }
    }

    /* renamed from: s */
    private final void m32398s(long j, byte[] bArr, int i) {
        m32396q(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.f24787e.f23896a);
            int min = Math.min(i - i2, 65536 - i3);
            C5562sk skVar = this.f24787e.f23899d;
            System.arraycopy(skVar.f23520a, i3, bArr, i2, min);
            j += (long) min;
            i2 += min;
            if (j == this.f24787e.f23897b) {
                this.f24793k.mo22207c(skVar);
                C5598tj tjVar = this.f24787e;
                tjVar.f23899d = null;
                this.f24787e = tjVar.f23900e;
            }
        }
    }

    /* renamed from: t */
    private final boolean m32399t() {
        return this.f24786d.compareAndSet(0, 1);
    }

    /* renamed from: a */
    public final void mo21512a(zzapg zzapg) {
        if (zzapg == null) {
            zzapg = null;
        }
        boolean k = this.f24783a.mo20858k(zzapg);
        C5635uj ujVar = this.f24792j;
        if (ujVar != null && k) {
            ujVar.mo17945n(zzapg);
        }
    }

    /* renamed from: b */
    public final void mo21513b(C5600tl tlVar, int i) {
        if (m32399t()) {
            while (i > 0) {
                int o = m32394o(i);
                tlVar.mo21098q(this.f24788f.f23899d.f23520a, this.f24791i, o);
                this.f24791i += o;
                this.f24790h += (long) o;
                i -= o;
            }
            m32397r();
            return;
        }
        tlVar.mo21104w(i);
    }

    /* renamed from: c */
    public final void mo21514c(long j, int i, int i2, int i3, C5706wg wgVar) {
        if (m32399t()) {
            try {
                this.f24783a.mo20855h(j, i, this.f24790h - ((long) i2), i2, wgVar);
            } finally {
                m32397r();
            }
        } else {
            long j2 = j;
            this.f24783a.mo20856i(j);
        }
    }

    /* renamed from: d */
    public final int mo21515d(C5410og ogVar, int i, boolean z) throws IOException, InterruptedException {
        if (!m32399t()) {
            int b = ogVar.mo19982b(i);
            if (b != -1) {
                return b;
            }
            throw new EOFException();
        }
        try {
            int a = ogVar.mo19981a(this.f24788f.f23899d.f23520a, this.f24791i, m32394o(i));
            if (a != -1) {
                this.f24791i += a;
                this.f24790h += (long) a;
                return a;
            }
            throw new EOFException();
        } finally {
            m32397r();
        }
    }

    /* renamed from: e */
    public final int mo21516e() {
        return this.f24783a.mo20848a();
    }

    /* renamed from: f */
    public final int mo21517f(C5371ne neVar, C5225jg jgVar, boolean z, boolean z2, long j) {
        int i;
        C5225jg jgVar2 = jgVar;
        int b = this.f24783a.mo20849b(neVar, jgVar, z, z2, this.f24789g, this.f24784b);
        if (b == -5) {
            this.f24789g = neVar.f20601a;
            return -5;
        } else if (b != -4) {
            return -3;
        } else {
            if (!jgVar.mo16923f()) {
                if (jgVar2.f18475d < j) {
                    jgVar2.mo16918a(Integer.MIN_VALUE);
                }
                if (jgVar.mo18616i()) {
                    C5524rj rjVar = this.f24784b;
                    long j2 = rjVar.f22867b;
                    this.f24785c.mo21100s(1);
                    m32398s(j2, this.f24785c.f23918a, 1);
                    long j3 = j2 + 1;
                    byte b2 = this.f24785c.f23918a[0];
                    byte b3 = b2 & 128;
                    byte b4 = b2 & Byte.MAX_VALUE;
                    C5114gg ggVar = jgVar2.f18473b;
                    if (ggVar.f17035a == null) {
                        ggVar.f17035a = new byte[16];
                    }
                    m32398s(j3, ggVar.f17035a, b4);
                    long j4 = j3 + ((long) b4);
                    if (b3 != 0) {
                        this.f24785c.mo21100s(2);
                        m32398s(j4, this.f24785c.f23918a, 2);
                        j4 += 2;
                        i = this.f24785c.mo21091j();
                    } else {
                        i = 1;
                    }
                    C5114gg ggVar2 = jgVar2.f18473b;
                    int[] iArr = ggVar2.f17038d;
                    if (iArr == null || iArr.length < i) {
                        iArr = new int[i];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = ggVar2.f17039e;
                    if (iArr3 == null || iArr3.length < i) {
                        iArr3 = new int[i];
                    }
                    int[] iArr4 = iArr3;
                    if (b3 != 0) {
                        int i2 = i * 6;
                        this.f24785c.mo21100s(i2);
                        m32398s(j4, this.f24785c.f23918a, i2);
                        j4 += (long) i2;
                        this.f24785c.mo21103v(0);
                        for (int i3 = 0; i3 < i; i3++) {
                            iArr2[i3] = this.f24785c.mo21091j();
                            iArr4[i3] = this.f24785c.mo21090i();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = rjVar.f22866a - ((int) (j4 - rjVar.f22867b));
                    }
                    C5706wg wgVar = rjVar.f22869d;
                    C5114gg ggVar3 = jgVar2.f18473b;
                    byte[] bArr = wgVar.f25384b;
                    byte[] bArr2 = ggVar3.f17035a;
                    int i4 = wgVar.f25383a;
                    ggVar3.mo17905b(i, iArr2, iArr4, bArr, bArr2, 1);
                    long j5 = rjVar.f22867b;
                    int i5 = (int) (j4 - j5);
                    rjVar.f22867b = j5 + ((long) i5);
                    rjVar.f22866a -= i5;
                }
                jgVar2.mo18615h(this.f24784b.f22866a);
                C5524rj rjVar2 = this.f24784b;
                long j6 = rjVar2.f22867b;
                ByteBuffer byteBuffer = jgVar2.f18474c;
                int i6 = rjVar2.f22866a;
                m32396q(j6);
                while (i6 > 0) {
                    int i7 = (int) (j6 - this.f24787e.f23896a);
                    int min = Math.min(i6, 65536 - i7);
                    C5562sk skVar = this.f24787e.f23899d;
                    byteBuffer.put(skVar.f23520a, i7, min);
                    j6 += (long) min;
                    i6 -= min;
                    if (j6 == this.f24787e.f23897b) {
                        this.f24793k.mo22207c(skVar);
                        C5598tj tjVar = this.f24787e;
                        tjVar.f23899d = null;
                        this.f24787e = tjVar.f23900e;
                    }
                }
                m32396q(this.f24784b.f22868c);
            }
            return -4;
        }
    }

    /* renamed from: g */
    public final long mo21518g() {
        return this.f24783a.mo20850c();
    }

    /* renamed from: h */
    public final zzapg mo21519h() {
        return this.f24783a.mo20853f();
    }

    /* renamed from: i */
    public final void mo21520i() {
        if (this.f24786d.getAndSet(2) == 0) {
            m32395p();
        }
    }

    /* renamed from: j */
    public final void mo21521j(boolean z) {
        int andSet = this.f24786d.getAndSet(true != z ? 2 : 0);
        m32395p();
        this.f24783a.mo20857j();
        if (andSet == 2) {
            this.f24789g = null;
        }
    }

    /* renamed from: k */
    public final void mo21522k(C5635uj ujVar) {
        this.f24792j = ujVar;
    }

    /* renamed from: l */
    public final void mo21523l() {
        long d = this.f24783a.mo20851d();
        if (d != -1) {
            m32396q(d);
        }
    }

    /* renamed from: m */
    public final boolean mo21524m() {
        return this.f24783a.mo20859l();
    }

    /* renamed from: n */
    public final boolean mo21525n(long j, boolean z) {
        long e = this.f24783a.mo20852e(j, z);
        if (e == -1) {
            return false;
        }
        m32396q(e);
        return true;
    }
}
