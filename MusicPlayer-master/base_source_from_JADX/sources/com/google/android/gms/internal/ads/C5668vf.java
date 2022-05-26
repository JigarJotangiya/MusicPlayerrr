package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.vf */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5668vf {

    /* renamed from: A */
    private Method f24705A;

    /* renamed from: B */
    private int f24706B;

    /* renamed from: C */
    private long f24707C;

    /* renamed from: D */
    private long f24708D;

    /* renamed from: E */
    private int f24709E;

    /* renamed from: F */
    private long f24710F;

    /* renamed from: G */
    private long f24711G;

    /* renamed from: H */
    private int f24712H;

    /* renamed from: I */
    private int f24713I;

    /* renamed from: J */
    private long f24714J;

    /* renamed from: K */
    private long f24715K;

    /* renamed from: L */
    private long f24716L;

    /* renamed from: M */
    private float f24717M;

    /* renamed from: N */
    private C4927bf[] f24718N;

    /* renamed from: O */
    private ByteBuffer[] f24719O;

    /* renamed from: P */
    private ByteBuffer f24720P;

    /* renamed from: Q */
    private ByteBuffer f24721Q;

    /* renamed from: R */
    private byte[] f24722R;

    /* renamed from: S */
    private int f24723S;

    /* renamed from: T */
    private int f24724T;

    /* renamed from: U */
    private boolean f24725U;

    /* renamed from: V */
    private boolean f24726V;

    /* renamed from: W */
    private int f24727W;

    /* renamed from: X */
    private boolean f24728X;

    /* renamed from: Y */
    private long f24729Y;

    /* renamed from: a */
    private final C5705wf f24730a;

    /* renamed from: b */
    private final C4965cg f24731b;

    /* renamed from: c */
    private final C4927bf[] f24732c;

    /* renamed from: d */
    private final C5520rf f24733d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ConditionVariable f24734e = new ConditionVariable(true);

    /* renamed from: f */
    private final long[] f24735f;

    /* renamed from: g */
    private final C5372nf f24736g;

    /* renamed from: h */
    private final LinkedList<C5594tf> f24737h;

    /* renamed from: i */
    private AudioTrack f24738i;

    /* renamed from: j */
    private int f24739j;

    /* renamed from: k */
    private int f24740k;

    /* renamed from: l */
    private int f24741l;

    /* renamed from: m */
    private int f24742m;

    /* renamed from: n */
    private boolean f24743n;

    /* renamed from: o */
    private int f24744o;

    /* renamed from: p */
    private long f24745p;

    /* renamed from: q */
    private C5482qe f24746q;

    /* renamed from: r */
    private C5482qe f24747r;

    /* renamed from: s */
    private long f24748s;

    /* renamed from: t */
    private long f24749t;

    /* renamed from: u */
    private int f24750u;

    /* renamed from: v */
    private int f24751v;

    /* renamed from: w */
    private long f24752w;

    /* renamed from: x */
    private long f24753x;

    /* renamed from: y */
    private boolean f24754y;

    /* renamed from: z */
    private long f24755z;

    public C5668vf(C5816ze zeVar, C4927bf[] bfVarArr, C5520rf rfVar) {
        this.f24733d = rfVar;
        if (C4934bm.f14552a >= 18) {
            try {
                this.f24705A = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (C4934bm.f14552a >= 19) {
            this.f24736g = new C5409of();
        } else {
            this.f24736g = new C5372nf((C5335mf) null);
        }
        C5705wf wfVar = new C5705wf();
        this.f24730a = wfVar;
        C4965cg cgVar = new C4965cg();
        this.f24731b = cgVar;
        C4927bf[] bfVarArr2 = new C4927bf[3];
        this.f24732c = bfVarArr2;
        bfVarArr2[0] = new C4891ag();
        bfVarArr2[1] = wfVar;
        System.arraycopy(bfVarArr, 0, bfVarArr2, 2, 0);
        bfVarArr2[2] = cgVar;
        this.f24735f = new long[10];
        this.f24717M = 1.0f;
        this.f24713I = 0;
        this.f24727W = 0;
        this.f24747r = C5482qe.f21905d;
        this.f24724T = -1;
        this.f24718N = new C4927bf[0];
        this.f24719O = new ByteBuffer[0];
        this.f24737h = new LinkedList<>();
    }

    /* renamed from: p */
    private final long m32340p(long j) {
        return (j * ((long) this.f24739j)) / 1000000;
    }

    /* renamed from: q */
    private final long m32341q(long j) {
        return (j * 1000000) / ((long) this.f24739j);
    }

    /* renamed from: r */
    private final long m32342r() {
        return this.f24743n ? this.f24711G : this.f24710F / ((long) this.f24709E);
    }

    /* renamed from: s */
    private final void m32343s(long j) throws C5631uf {
        ByteBuffer byteBuffer;
        int length = this.f24718N.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f24719O[i - 1];
            } else {
                byteBuffer = this.f24720P;
                if (byteBuffer == null) {
                    byteBuffer = C4927bf.f14427a;
                }
            }
            if (i == length) {
                m32350z(byteBuffer, j);
            } else {
                C4927bf bfVar = this.f24718N[i];
                bfVar.mo15773c(byteBuffer);
                ByteBuffer b = bfVar.mo15772b();
                this.f24719O[i] = b;
                if (b.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: t */
    private final void m32344t() {
        ArrayList arrayList = new ArrayList();
        C4927bf[] bfVarArr = this.f24732c;
        for (int i = 0; i < 3; i++) {
            C4927bf bfVar = bfVarArr[i];
            if (bfVar.mo15777g()) {
                arrayList.add(bfVar);
            } else {
                bfVar.mo15776f();
            }
        }
        int size = arrayList.size();
        this.f24718N = (C4927bf[]) arrayList.toArray(new C4927bf[size]);
        this.f24719O = new ByteBuffer[size];
        for (int i2 = 0; i2 < size; i2++) {
            C4927bf bfVar2 = this.f24718N[i2];
            bfVar2.mo15776f();
            this.f24719O[i2] = bfVar2.mo15772b();
        }
    }

    /* renamed from: u */
    private final void m32345u() {
        this.f24752w = 0;
        this.f24751v = 0;
        this.f24750u = 0;
        this.f24753x = 0;
        this.f24754y = false;
        this.f24755z = 0;
    }

    /* renamed from: v */
    private final void m32346v() {
        if (m32348x()) {
            if (C4934bm.f14552a >= 21) {
                this.f24738i.setVolume(this.f24717M);
                return;
            }
            AudioTrack audioTrack = this.f24738i;
            float f = this.f24717M;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m32347w() throws com.google.android.gms.internal.ads.C5631uf {
        /*
            r9 = this;
            int r0 = r9.f24724T
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r9.f24743n
            if (r0 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.bf[] r0 = r9.f24718N
            int r0 = r0.length
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r9.f24724T = r0
        L_0x0012:
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            int r4 = r9.f24724T
            com.google.android.gms.internal.ads.bf[] r5 = r9.f24718N
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x0038
            r4 = r5[r4]
            if (r0 == 0) goto L_0x0028
            r4.zze()
        L_0x0028:
            r9.m32343s(r7)
            boolean r0 = r4.mo15778h()
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r9.f24724T
            int r0 = r0 + r2
            r9.f24724T = r0
            goto L_0x0012
        L_0x0038:
            java.nio.ByteBuffer r0 = r9.f24721Q
            if (r0 == 0) goto L_0x0044
            r9.m32350z(r0, r7)
            java.nio.ByteBuffer r0 = r9.f24721Q
            if (r0 == 0) goto L_0x0044
            return r3
        L_0x0044:
            r9.f24724T = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5668vf.m32347w():boolean");
    }

    /* renamed from: x */
    private final boolean m32348x() {
        return this.f24738i != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r4.f24742m;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m32349y() {
        /*
            r4 = this;
            int r0 = com.google.android.gms.internal.ads.C4934bm.f14552a
            r1 = 1
            r2 = 0
            r3 = 23
            if (r0 >= r3) goto L_0x0012
            int r0 = r4.f24742m
            r3 = 5
            if (r0 == r3) goto L_0x0013
            r3 = 6
            if (r0 == r3) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            return r1
        L_0x0012:
            r1 = 0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5668vf.m32349y():boolean");
    }

    /* renamed from: z */
    private final boolean m32350z(ByteBuffer byteBuffer, long j) throws C5631uf {
        int i;
        if (!byteBuffer.hasRemaining()) {
            return true;
        }
        ByteBuffer byteBuffer2 = this.f24721Q;
        if (byteBuffer2 != null) {
            C5304ll.m26774c(byteBuffer2 == byteBuffer);
        } else {
            this.f24721Q = byteBuffer;
            if (C4934bm.f14552a < 21) {
                int remaining = byteBuffer.remaining();
                byte[] bArr = this.f24722R;
                if (bArr == null || bArr.length < remaining) {
                    this.f24722R = new byte[remaining];
                }
                int position = byteBuffer.position();
                byteBuffer.get(this.f24722R, 0, remaining);
                byteBuffer.position(position);
                this.f24723S = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        if (C4934bm.f14552a < 21) {
            int a = this.f24744o - ((int) (this.f24710F - (this.f24736g.mo19714a() * ((long) this.f24709E))));
            if (a > 0) {
                i = this.f24738i.write(this.f24722R, this.f24723S, Math.min(remaining2, a));
                if (i > 0) {
                    this.f24723S += i;
                    byteBuffer.position(byteBuffer.position() + i);
                }
            } else {
                i = 0;
            }
        } else {
            i = this.f24738i.write(byteBuffer, remaining2, 1);
        }
        this.f24729Y = SystemClock.elapsedRealtime();
        if (i >= 0) {
            boolean z = this.f24743n;
            if (!z) {
                this.f24710F += (long) i;
            }
            if (i != remaining2) {
                return false;
            }
            if (z) {
                this.f24711G += (long) this.f24712H;
            }
            this.f24721Q = null;
            return true;
        }
        throw new C5631uf(i);
    }

    /* renamed from: a */
    public final long mo21479a(boolean z) {
        long j;
        long j2;
        long j3;
        long j4;
        if (!m32348x() || this.f24713I == 0) {
            return Long.MIN_VALUE;
        }
        if (this.f24738i.getPlayState() == 3) {
            long b = this.f24736g.mo19715b();
            if (b != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f24753x >= 30000) {
                    long[] jArr = this.f24735f;
                    int i = this.f24750u;
                    jArr[i] = b - nanoTime;
                    this.f24750u = (i + 1) % 10;
                    int i2 = this.f24751v;
                    if (i2 < 10) {
                        this.f24751v = i2 + 1;
                    }
                    this.f24753x = nanoTime;
                    this.f24752w = 0;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.f24751v;
                        if (i3 >= i4) {
                            break;
                        }
                        this.f24752w += this.f24735f[i3] / ((long) i4);
                        i3++;
                    }
                }
                if (!m32349y() && nanoTime - this.f24755z >= 500000) {
                    boolean h = this.f24736g.mo19721h();
                    this.f24754y = h;
                    if (h) {
                        long d = this.f24736g.mo19717d() / 1000;
                        long c = this.f24736g.mo19716c();
                        if (d < this.f24715K) {
                            this.f24754y = false;
                        } else if (Math.abs(d - nanoTime) > 5000000) {
                            StringBuilder sb = new StringBuilder(136);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(c);
                            sb.append(", ");
                            sb.append(d);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(b);
                            Log.w("AudioTrack", sb.toString());
                            this.f24754y = false;
                        } else if (Math.abs(m32341q(c) - b) > 5000000) {
                            StringBuilder sb2 = new StringBuilder(138);
                            sb2.append("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(c);
                            sb2.append(", ");
                            sb2.append(d);
                            sb2.append(", ");
                            sb2.append(nanoTime);
                            sb2.append(", ");
                            sb2.append(b);
                            Log.w("AudioTrack", sb2.toString());
                            this.f24754y = false;
                        }
                    }
                    Method method = this.f24705A;
                    if (method != null && !this.f24743n) {
                        try {
                            long intValue = (((long) ((Integer) method.invoke(this.f24738i, (Object[]) null)).intValue()) * 1000) - this.f24745p;
                            this.f24716L = intValue;
                            long max = Math.max(intValue, 0);
                            this.f24716L = max;
                            if (max > 5000000) {
                                StringBuilder sb3 = new StringBuilder(61);
                                sb3.append("Ignoring impossibly large audio latency: ");
                                sb3.append(max);
                                Log.w("AudioTrack", sb3.toString());
                                this.f24716L = 0;
                            }
                        } catch (Exception unused) {
                            this.f24705A = null;
                        }
                    }
                    this.f24755z = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.f24754y) {
            j = m32341q(this.f24736g.mo19716c() + m32340p(nanoTime2 - (this.f24736g.mo19717d() / 1000)));
        } else {
            j = this.f24751v == 0 ? this.f24736g.mo19715b() : nanoTime2 + this.f24752w;
            if (!z) {
                j -= this.f24716L;
            }
        }
        long j5 = this.f24714J;
        while (!this.f24737h.isEmpty() && j >= this.f24737h.getFirst().f23837c) {
            C5594tf remove = this.f24737h.remove();
            this.f24747r = remove.f23835a;
            this.f24749t = remove.f23837c;
            this.f24748s = remove.f23836b - this.f24714J;
        }
        if (this.f24747r.f21906a == 1.0f) {
            j2 = (j + this.f24748s) - this.f24749t;
        } else {
            if (!this.f24737h.isEmpty() || this.f24731b.mo16626l() < 1024) {
                j3 = this.f24748s;
                j4 = (long) (((double) this.f24747r.f21906a) * ((double) (j - this.f24749t)));
            } else {
                j3 = this.f24748s;
                j4 = C4934bm.m21440j(j - this.f24749t, this.f24731b.mo16625k(), this.f24731b.mo16626l());
            }
            j2 = j4 + j3;
        }
        return j5 + j2;
    }

    /* renamed from: c */
    public final C5482qe mo21480c() {
        return this.f24747r;
    }

    /* renamed from: d */
    public final C5482qe mo21481d(C5482qe qeVar) {
        if (this.f24743n) {
            C5482qe qeVar2 = C5482qe.f21905d;
            this.f24747r = qeVar2;
            return qeVar2;
        }
        float j = this.f24731b.mo16624j(qeVar.f21906a);
        C4965cg cgVar = this.f24731b;
        float f = qeVar.f21907b;
        cgVar.mo16623i(1.0f);
        C5482qe qeVar3 = new C5482qe(j, 1.0f);
        C5482qe qeVar4 = this.f24746q;
        if (qeVar4 == null) {
            if (!this.f24737h.isEmpty()) {
                qeVar4 = this.f24737h.getLast().f23835a;
            } else {
                qeVar4 = this.f24747r;
            }
        }
        if (!qeVar3.equals(qeVar4)) {
            if (m32348x()) {
                this.f24746q = qeVar3;
            } else {
                this.f24747r = qeVar3;
            }
        }
        return this.f24747r;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b5  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21482e(java.lang.String r7, int r8, int r9, int r10, int r11, int[] r12) throws com.google.android.gms.internal.ads.C5446pf {
        /*
            r6 = this;
            int r7 = com.google.android.gms.internal.ads.C4934bm.m21439i(r10, r8)
            r6.f24706B = r7
            com.google.android.gms.internal.ads.wf r7 = r6.f24730a
            r7.mo21811i(r12)
            com.google.android.gms.internal.ads.bf[] r7 = r6.f24732c
            r11 = 0
            r12 = 0
            r0 = 0
        L_0x0010:
            r1 = 3
            r2 = 2
            if (r12 >= r1) goto L_0x0033
            r1 = r7[r12]
            boolean r3 = r1.mo15775e(r9, r8, r10)     // Catch:{ af -> 0x002c }
            r0 = r0 | r3
            boolean r3 = r1.mo15777g()
            if (r3 == 0) goto L_0x0029
            int r8 = r1.zza()
            r1.mo15771a()
            r10 = 2
        L_0x0029:
            int r12 = r12 + 1
            goto L_0x0010
        L_0x002c:
            r7 = move-exception
            com.google.android.gms.internal.ads.pf r8 = new com.google.android.gms.internal.ads.pf
            r8.<init>((java.lang.Throwable) r7)
            throw r8
        L_0x0033:
            if (r0 == 0) goto L_0x0038
            r6.m32344t()
        L_0x0038:
            r7 = 252(0xfc, float:3.53E-43)
            switch(r8) {
                case 1: goto L_0x006b;
                case 2: goto L_0x0068;
                case 3: goto L_0x0065;
                case 4: goto L_0x0062;
                case 5: goto L_0x005f;
                case 6: goto L_0x005c;
                case 7: goto L_0x0059;
                case 8: goto L_0x0056;
                default: goto L_0x003d;
            }
        L_0x003d:
            com.google.android.gms.internal.ads.pf r7 = new com.google.android.gms.internal.ads.pf
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r10 = 38
            r9.<init>(r10)
            java.lang.String r10 = "Unsupported channel count: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>((java.lang.String) r8)
            throw r7
        L_0x0056:
            int r12 = com.google.android.gms.internal.ads.C5740xd.f25754a
            goto L_0x006c
        L_0x0059:
            r12 = 1276(0x4fc, float:1.788E-42)
            goto L_0x006c
        L_0x005c:
            r12 = 252(0xfc, float:3.53E-43)
            goto L_0x006c
        L_0x005f:
            r12 = 220(0xdc, float:3.08E-43)
            goto L_0x006c
        L_0x0062:
            r12 = 204(0xcc, float:2.86E-43)
            goto L_0x006c
        L_0x0065:
            r12 = 28
            goto L_0x006c
        L_0x0068:
            r12 = 12
            goto L_0x006c
        L_0x006b:
            r12 = 4
        L_0x006c:
            int r3 = com.google.android.gms.internal.ads.C4934bm.f14552a
            r4 = 23
            if (r3 > r4) goto L_0x0092
            java.lang.String r4 = com.google.android.gms.internal.ads.C4934bm.f14553b
            java.lang.String r5 = "foster"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0092
            java.lang.String r4 = com.google.android.gms.internal.ads.C4934bm.f14554c
            java.lang.String r5 = "NVIDIA"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0092
            if (r8 == r1) goto L_0x0093
            r1 = 5
            if (r8 == r1) goto L_0x0093
            r7 = 7
            if (r8 == r7) goto L_0x008f
            goto L_0x0092
        L_0x008f:
            int r7 = com.google.android.gms.internal.ads.C5740xd.f25754a
            goto L_0x0093
        L_0x0092:
            r7 = r12
        L_0x0093:
            r12 = 25
            if (r3 > r12) goto L_0x009f
            java.lang.String r12 = com.google.android.gms.internal.ads.C4934bm.f14553b
            java.lang.String r1 = "fugu"
            boolean r12 = r1.equals(r12)
        L_0x009f:
            if (r0 != 0) goto L_0x00b5
            boolean r12 = r6.m32348x()
            if (r12 == 0) goto L_0x00b5
            int r12 = r6.f24741l
            if (r12 != r10) goto L_0x00b5
            int r12 = r6.f24739j
            if (r12 != r9) goto L_0x00b5
            int r12 = r6.f24740k
            if (r12 == r7) goto L_0x00b4
            goto L_0x00b5
        L_0x00b4:
            return
        L_0x00b5:
            r6.mo21488k()
            r6.f24741l = r10
            r6.f24743n = r11
            r6.f24739j = r9
            r6.f24740k = r7
            r6.f24742m = r2
            int r8 = com.google.android.gms.internal.ads.C4934bm.m21439i(r2, r8)
            r6.f24709E = r8
            int r8 = r6.f24742m
            int r7 = android.media.AudioTrack.getMinBufferSize(r9, r7, r8)
            r8 = -2
            if (r7 == r8) goto L_0x00d2
            r11 = 1
        L_0x00d2:
            com.google.android.gms.internal.ads.C5304ll.m26776e(r11)
            int r8 = r7 * 4
            r9 = 250000(0x3d090, double:1.235164E-318)
            long r9 = r6.m32340p(r9)
            int r10 = (int) r9
            int r9 = r6.f24709E
            int r10 = r10 * r9
            long r11 = (long) r7
            r0 = 750000(0xb71b0, double:3.70549E-318)
            long r0 = r6.m32340p(r0)
            int r7 = r6.f24709E
            long r2 = (long) r7
            long r0 = r0 * r2
            long r11 = java.lang.Math.max(r11, r0)
            int r7 = (int) r11
            if (r8 >= r10) goto L_0x00f9
            r8 = r10
            goto L_0x00fc
        L_0x00f9:
            if (r8 <= r7) goto L_0x00fc
            r8 = r7
        L_0x00fc:
            r6.f24744o = r8
            int r7 = r6.f24709E
            int r8 = r8 / r7
            long r7 = (long) r8
            long r7 = r6.m32341q(r7)
            r6.f24745p = r7
            com.google.android.gms.internal.ads.qe r7 = r6.f24747r
            r6.mo21481d(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5668vf.mo21482e(java.lang.String, int, int, int, int, int[]):void");
    }

    /* renamed from: f */
    public final void mo21483f() {
        if (this.f24713I == 1) {
            this.f24713I = 2;
        }
    }

    /* renamed from: g */
    public final void mo21484g() {
        this.f24726V = false;
        if (m32348x()) {
            m32345u();
            this.f24736g.mo19719f();
        }
    }

    /* renamed from: h */
    public final void mo21485h() {
        this.f24726V = true;
        if (m32348x()) {
            this.f24715K = System.nanoTime() / 1000;
            this.f24738i.play();
        }
    }

    /* renamed from: i */
    public final void mo21486i() throws C5631uf {
        if (!this.f24725U && m32348x() && m32347w()) {
            this.f24736g.mo19718e(m32342r());
            this.f24725U = true;
        }
    }

    /* renamed from: j */
    public final void mo21487j() {
        mo21488k();
        C4927bf[] bfVarArr = this.f24732c;
        for (int i = 0; i < 3; i++) {
            bfVarArr[i].mo15774d();
        }
        this.f24727W = 0;
        this.f24726V = false;
    }

    /* renamed from: k */
    public final void mo21488k() {
        if (m32348x()) {
            this.f24707C = 0;
            this.f24708D = 0;
            this.f24710F = 0;
            this.f24711G = 0;
            this.f24712H = 0;
            C5482qe qeVar = this.f24746q;
            if (qeVar != null) {
                this.f24747r = qeVar;
                this.f24746q = null;
            } else if (!this.f24737h.isEmpty()) {
                this.f24747r = this.f24737h.getLast().f23835a;
            }
            this.f24737h.clear();
            this.f24748s = 0;
            this.f24749t = 0;
            this.f24720P = null;
            this.f24721Q = null;
            int i = 0;
            while (true) {
                C4927bf[] bfVarArr = this.f24718N;
                if (i >= bfVarArr.length) {
                    break;
                }
                C4927bf bfVar = bfVarArr[i];
                bfVar.mo15776f();
                this.f24719O[i] = bfVar.mo15772b();
                i++;
            }
            this.f24725U = false;
            this.f24724T = -1;
            this.f24713I = 0;
            this.f24716L = 0;
            m32345u();
            if (this.f24738i.getPlayState() == 3) {
                this.f24738i.pause();
            }
            AudioTrack audioTrack = this.f24738i;
            this.f24738i = null;
            this.f24736g.mo19720g((AudioTrack) null, false);
            this.f24734e.close();
            new C5298lf(this, audioTrack).start();
        }
    }

    /* renamed from: l */
    public final void mo21489l(float f) {
        if (this.f24717M != f) {
            this.f24717M = f;
            m32346v();
        }
    }

    /* renamed from: m */
    public final boolean mo21490m(ByteBuffer byteBuffer, long j) throws C5483qf, C5631uf {
        long j2;
        int i;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j3 = j;
        ByteBuffer byteBuffer3 = this.f24720P;
        C5304ll.m26774c(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (!m32348x()) {
            this.f24734e.block();
            int i2 = this.f24727W;
            if (i2 == 0) {
                this.f24738i = new AudioTrack(3, this.f24739j, this.f24740k, this.f24742m, this.f24744o, 1);
            } else {
                this.f24738i = new AudioTrack(3, this.f24739j, this.f24740k, this.f24742m, this.f24744o, 1, i2);
            }
            int state = this.f24738i.getState();
            if (state == 1) {
                int audioSessionId = this.f24738i.getAudioSessionId();
                if (this.f24727W != audioSessionId) {
                    this.f24727W = audioSessionId;
                    ((C5780yf) this.f24733d).f26352a.f26747Q.mo18608b(audioSessionId);
                }
                this.f24736g.mo19720g(this.f24738i, m32349y());
                m32346v();
                this.f24728X = false;
                if (this.f24726V) {
                    mo21485h();
                }
            } else {
                try {
                    this.f24738i.release();
                } catch (Exception unused) {
                } finally {
                    this.f24738i = null;
                }
                throw new C5483qf(state, this.f24739j, this.f24740k, this.f24744o);
            }
        }
        if (m32349y()) {
            if (this.f24738i.getPlayState() == 2) {
                this.f24728X = false;
                return false;
            } else if (this.f24738i.getPlayState() == 1 && this.f24736g.mo19714a() != 0) {
                return false;
            }
        }
        boolean z = this.f24728X;
        boolean n = mo21491n();
        this.f24728X = n;
        if (z && !n && this.f24738i.getPlayState() != 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j4 = this.f24729Y;
            C5520rf rfVar = this.f24733d;
            ((C5780yf) rfVar).f26352a.f26747Q.mo18609c(this.f24744o, C5740xd.m33643b(this.f24745p), elapsedRealtime - j4);
        }
        if (this.f24720P == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f24743n && this.f24712H == 0) {
                int i3 = this.f24742m;
                if (i3 == 7 || i3 == 8) {
                    int position = byteBuffer.position();
                    i = ((((byteBuffer2.get(position + 5) & 252) >> 2) | ((byteBuffer2.get(position + 4) & 1) << 6)) + 1) * 32;
                } else if (i3 == 5) {
                    int i4 = C5779ye.f26347d;
                    i = 1536;
                } else if (i3 == 6) {
                    i = C5779ye.m34097a(byteBuffer);
                } else {
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unexpected audio encoding: ");
                    sb.append(i3);
                    throw new IllegalStateException(sb.toString());
                }
                this.f24712H = i;
            }
            if (this.f24746q != null) {
                if (!m32347w()) {
                    return false;
                }
                this.f24737h.add(new C5594tf(this.f24746q, Math.max(0, j3), m32341q(m32342r()), (C5557sf) null));
                this.f24746q = null;
                m32344t();
            }
            if (this.f24713I == 0) {
                this.f24714J = Math.max(0, j3);
                this.f24713I = 1;
            } else {
                long j5 = this.f24714J;
                if (this.f24743n) {
                    j2 = this.f24708D;
                } else {
                    j2 = this.f24707C / ((long) this.f24706B);
                }
                long q = j5 + m32341q(j2);
                if (this.f24713I == 1 && Math.abs(q - j3) > 200000) {
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Discontinuity detected [expected ");
                    sb2.append(q);
                    sb2.append(", got ");
                    sb2.append(j3);
                    sb2.append("]");
                    Log.e("AudioTrack", sb2.toString());
                    this.f24713I = 2;
                }
                if (this.f24713I == 2) {
                    this.f24714J += j3 - q;
                    this.f24713I = 1;
                    ((C5780yf) this.f24733d).f26352a.f26753W = true;
                }
            }
            if (this.f24743n) {
                this.f24708D += (long) this.f24712H;
            } else {
                this.f24707C += (long) byteBuffer.remaining();
            }
            this.f24720P = byteBuffer2;
        }
        if (this.f24743n) {
            m32350z(this.f24720P, j3);
        } else {
            m32343s(j3);
        }
        if (this.f24720P.hasRemaining()) {
            return false;
        }
        this.f24720P = null;
        return true;
    }

    /* renamed from: n */
    public final boolean mo21491n() {
        if (m32348x()) {
            if (m32342r() > this.f24736g.mo19714a()) {
                return true;
            }
            if (m32349y() && this.f24738i.getPlayState() == 2 && this.f24738i.getPlaybackHeadPosition() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean mo21492o() {
        return !m32348x() || (this.f24725U && !mo21491n());
    }
}
