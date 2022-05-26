package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vy3 implements cy3 {

    /* renamed from: A */
    private ByteBuffer f25061A;

    /* renamed from: B */
    private byte[] f25062B;

    /* renamed from: C */
    private int f25063C;

    /* renamed from: D */
    private int f25064D;

    /* renamed from: E */
    private boolean f25065E;

    /* renamed from: F */
    private boolean f25066F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f25067G;

    /* renamed from: H */
    private boolean f25068H;

    /* renamed from: I */
    private int f25069I;

    /* renamed from: J */
    private ys3 f25070J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public long f25071K;

    /* renamed from: L */
    private boolean f25072L;

    /* renamed from: M */
    private final my3 f25073M;

    /* renamed from: a */
    private final jy3 f25074a;

    /* renamed from: b */
    private final fz3 f25075b;

    /* renamed from: c */
    private final kx3[] f25076c;

    /* renamed from: d */
    private final kx3[] f25077d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ConditionVariable f25078e = new ConditionVariable(true);

    /* renamed from: f */
    private final hy3 f25079f = new hy3(new ry3(this, (qy3) null));

    /* renamed from: g */
    private final ArrayDeque<oy3> f25080g;

    /* renamed from: h */
    private uy3 f25081h;

    /* renamed from: i */
    private final py3<yx3> f25082i;

    /* renamed from: j */
    private final py3<by3> f25083j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public zx3 f25084k;

    /* renamed from: l */
    private ly3 f25085l;

    /* renamed from: m */
    private ly3 f25086m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public AudioTrack f25087n;

    /* renamed from: o */
    private fc3 f25088o;

    /* renamed from: p */
    private oy3 f25089p;

    /* renamed from: q */
    private oy3 f25090q;

    /* renamed from: r */
    private long f25091r;

    /* renamed from: s */
    private long f25092s;

    /* renamed from: t */
    private boolean f25093t;

    /* renamed from: u */
    private boolean f25094u;

    /* renamed from: v */
    private long f25095v;

    /* renamed from: w */
    private float f25096w;

    /* renamed from: x */
    private kx3[] f25097x;

    /* renamed from: y */
    private ByteBuffer[] f25098y;

    /* renamed from: z */
    private ByteBuffer f25099z;

    public vy3(hx3 hx3, kx3[] kx3Arr, boolean z) {
        my3 my3 = new my3(kx3Arr);
        this.f25073M = my3;
        int i = wy2.f25579a;
        jy3 jy3 = new jy3();
        this.f25074a = jy3;
        fz3 fz3 = new fz3();
        this.f25075b = fz3;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new iy3[]{new az3(), jy3, fz3});
        Collections.addAll(arrayList, my3.mo19580e());
        this.f25076c = (kx3[]) arrayList.toArray(new kx3[0]);
        this.f25077d = new kx3[]{new wy3()};
        this.f25096w = 1.0f;
        this.f25088o = fc3.f16529c;
        this.f25069I = 0;
        this.f25070J = new ys3(0, 0.0f);
        this.f25090q = new oy3(i10.f17853d, false, 0, 0, (ny3) null);
        this.f25064D = -1;
        this.f25097x = new kx3[0];
        this.f25098y = new ByteBuffer[0];
        this.f25080g = new ArrayDeque<>();
        this.f25082i = new py3<>(100);
        this.f25083j = new py3<>(100);
    }

    /* renamed from: A */
    private final void m32777A() {
        if (!this.f25066F) {
            this.f25066F = true;
            this.f25079f.mo18233d(m32795w());
            this.f25087n.stop();
        }
    }

    /* renamed from: B */
    private final void m32778B(long j) throws by3 {
        ByteBuffer byteBuffer;
        int length = this.f25097x.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f25098y[i - 1];
            } else {
                byteBuffer = this.f25099z;
                if (byteBuffer == null) {
                    byteBuffer = kx3.f19102a;
                }
            }
            if (i == length) {
                m32781E(byteBuffer, j);
            } else {
                kx3 kx3 = this.f25097x[i];
                if (i > this.f25064D) {
                    kx3.mo15991h(byteBuffer);
                }
                ByteBuffer a = kx3.mo17059a();
                this.f25098y[i] = a;
                if (a.hasRemaining()) {
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

    /* renamed from: C */
    private final void m32779C(i10 i10, boolean z) {
        oy3 x = m32796x();
        if (!i10.equals(x.f21237a) || z != x.f21238b) {
            oy3 oy3 = new oy3(i10, z, -9223372036854775807L, -9223372036854775807L, (ny3) null);
            if (m32783G()) {
                this.f25089p = oy3;
            } else {
                this.f25090q = oy3;
            }
        }
    }

    /* renamed from: D */
    private final void m32780D() {
        if (m32783G()) {
            if (wy2.f25579a >= 21) {
                this.f25087n.setVolume(this.f25096w);
                return;
            }
            AudioTrack audioTrack = this.f25087n;
            float f = this.f25096w;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* renamed from: E */
    private final void m32781E(ByteBuffer byteBuffer, long j) throws by3 {
        int i;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f25061A;
            boolean z = true;
            if (byteBuffer2 != null) {
                gs1.m24486d(byteBuffer2 == byteBuffer);
            } else {
                this.f25061A = byteBuffer;
                if (wy2.f25579a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.f25062B;
                    if (bArr == null || bArr.length < remaining) {
                        this.f25062B = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f25062B, 0, remaining);
                    byteBuffer.position(position);
                    this.f25063C = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            int i2 = wy2.f25579a;
            if (i2 < 21) {
                int a = this.f25079f.mo18230a(this.f25092s);
                if (a > 0) {
                    i = this.f25087n.write(this.f25062B, this.f25063C, Math.min(remaining2, a));
                    if (i > 0) {
                        this.f25063C += i;
                        byteBuffer.position(byteBuffer.position() + i);
                    }
                } else {
                    i = 0;
                }
            } else {
                i = this.f25087n.write(byteBuffer, remaining2, 1);
            }
            this.f25071K = SystemClock.elapsedRealtime();
            if (i < 0) {
                if ((i2 < 24 || i != -6) && i != -32) {
                    z = false;
                }
                by3 by3 = new by3(i, this.f25086m.f19657a, z);
                zx3 zx3 = this.f25084k;
                if (zx3 != null) {
                    zx3.mo22309b(by3);
                }
                if (!by3.zza) {
                    this.f25083j.mo20346b(by3);
                    return;
                }
                throw by3;
            }
            this.f25083j.mo20345a();
            if (m32784H(this.f25087n) && this.f25067G && this.f25084k != null && i < remaining2 && !this.f25072L) {
                long c = this.f25079f.mo18232c(0);
                yy3 yy3 = (yy3) this.f25084k;
                if (yy3.f26593a.f27083O0 != null) {
                    yy3.f26593a.f27083O0.mo18211b(c);
                }
            }
            int i3 = this.f25086m.f19659c;
            this.f25092s += (long) i;
            if (i == remaining2) {
                this.f25061A = null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m32782F() throws com.google.android.gms.internal.ads.by3 {
        /*
            r9 = this;
            int r0 = r9.f25064D
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x000b
            r9.f25064D = r3
        L_0x0009:
            r0 = 1
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            int r4 = r9.f25064D
            com.google.android.gms.internal.ads.kx3[] r5 = r9.f25097x
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x002f
            r4 = r5[r4]
            if (r0 == 0) goto L_0x001f
            r4.mo17063f()
        L_0x001f:
            r9.m32778B(r7)
            boolean r0 = r4.mo17062e()
            if (r0 != 0) goto L_0x0029
            return r3
        L_0x0029:
            int r0 = r9.f25064D
            int r0 = r0 + r2
            r9.f25064D = r0
            goto L_0x0009
        L_0x002f:
            java.nio.ByteBuffer r0 = r9.f25061A
            if (r0 == 0) goto L_0x003b
            r9.m32781E(r0, r7)
            java.nio.ByteBuffer r0 = r9.f25061A
            if (r0 == 0) goto L_0x003b
            return r3
        L_0x003b:
            r9.f25064D = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vy3.m32782F():boolean");
    }

    /* renamed from: G */
    private final boolean m32783G() {
        return this.f25087n != null;
    }

    /* renamed from: H */
    private static boolean m32784H(AudioTrack audioTrack) {
        return wy2.f25579a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* renamed from: I */
    private final boolean m32785I() {
        if (!"audio/raw".equals(this.f25086m.f19657a.f25133l)) {
            return false;
        }
        int i = this.f25086m.f19657a.f25116A;
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final long m32794v() {
        ly3 ly3 = this.f25086m;
        int i = ly3.f19659c;
        return this.f25091r / ((long) ly3.f19658b);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final long m32795w() {
        ly3 ly3 = this.f25086m;
        int i = ly3.f19659c;
        return this.f25092s / ((long) ly3.f19660d);
    }

    /* renamed from: x */
    private final oy3 m32796x() {
        oy3 oy3 = this.f25089p;
        if (oy3 != null) {
            return oy3;
        }
        return !this.f25080g.isEmpty() ? this.f25080g.getLast() : this.f25090q;
    }

    /* renamed from: y */
    private final void m32797y(long j) {
        i10 i10;
        boolean z;
        if (m32785I()) {
            my3 my3 = this.f25073M;
            i10 = m32796x().f21237a;
            my3.mo19578c(i10);
        } else {
            i10 = i10.f17853d;
        }
        i10 i102 = i10;
        if (m32785I()) {
            my3 my32 = this.f25073M;
            boolean z2 = m32796x().f21238b;
            my32.mo19579d(z2);
            z = z2;
        } else {
            z = false;
        }
        this.f25080g.add(new oy3(i102, z, Math.max(0, j), this.f25086m.mo19300b(m32795w()), (ny3) null));
        kx3[] kx3Arr = this.f25086m.f19665i;
        ArrayList arrayList = new ArrayList();
        for (kx3 kx3 : kx3Arr) {
            if (kx3.mo16432d()) {
                arrayList.add(kx3);
            } else {
                kx3.mo17060b();
            }
        }
        int size = arrayList.size();
        this.f25097x = (kx3[]) arrayList.toArray(new kx3[size]);
        this.f25098y = new ByteBuffer[size];
        m32798z();
        zx3 zx3 = this.f25084k;
        if (zx3 != null) {
            ((yy3) zx3).f26593a.f27074F0.mo21644s(z);
        }
    }

    /* renamed from: z */
    private final void m32798z() {
        int i = 0;
        while (true) {
            kx3[] kx3Arr = this.f25097x;
            if (i < kx3Arr.length) {
                kx3 kx3 = kx3Arr[i];
                kx3.mo17060b();
                this.f25098y[i] = kx3.mo17059a();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: S */
    public final long mo16771S(boolean z) {
        long j;
        if (!m32783G() || this.f25094u) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.f25079f.mo18231b(z), this.f25086m.mo19300b(m32795w()));
        while (!this.f25080g.isEmpty() && min >= this.f25080g.getFirst().f21240d) {
            this.f25090q = this.f25080g.remove();
        }
        oy3 oy3 = this.f25090q;
        long j2 = min - oy3.f21240d;
        if (oy3.f21237a.equals(i10.f17853d)) {
            j = this.f25090q.f21239c + j2;
        } else if (this.f25080g.isEmpty()) {
            j = this.f25073M.mo19576a(j2) + this.f25090q.f21239c;
        } else {
            oy3 first = this.f25080g.getFirst();
            j = first.f21239c - wy2.m33427V(first.f21240d - min, this.f25090q.f21237a.f17854a);
        }
        return j + this.f25086m.mo19300b(this.f25073M.mo19577b());
    }

    /* renamed from: a */
    public final int mo16772a(C5689w wVar) {
        if (!"audio/raw".equals(wVar.f25133l)) {
            int i = wy2.f25579a;
            return 0;
        } else if (wy2.m33455r(wVar.f25116A)) {
            return wVar.f25116A != 2 ? 1 : 2;
        } else {
            int i2 = wVar.f25116A;
            StringBuilder sb = new StringBuilder(33);
            sb.append("Invalid PCM encoding: ");
            sb.append(i2);
            Log.w("DefaultAudioSink", sb.toString());
            return 0;
        }
    }

    /* renamed from: b */
    public final i10 mo16773b() {
        return m32796x().f21237a;
    }

    /* renamed from: c */
    public final void mo16774c() {
        this.f25093t = true;
    }

    /* renamed from: d */
    public final void mo16775d() {
        this.f25067G = false;
        if (m32783G() && this.f25079f.mo18241l()) {
            this.f25087n.pause();
        }
    }

    /* renamed from: e */
    public final void mo16776e() {
        this.f25067G = true;
        if (m32783G()) {
            this.f25079f.mo18236g();
            this.f25087n.play();
        }
    }

    /* renamed from: f */
    public final void mo16777f(ys3 ys3) {
        if (!this.f25070J.equals(ys3)) {
            int i = ys3.f26511a;
            float f = ys3.f26512b;
            if (this.f25087n != null) {
                int i2 = this.f25070J.f26511a;
            }
            this.f25070J = ys3;
        }
    }

    /* renamed from: g */
    public final void mo16778g() throws by3 {
        if (!this.f25065E && m32783G() && m32782F()) {
            m32777A();
            this.f25065E = true;
        }
    }

    /* renamed from: h */
    public final void mo16779h() {
        zze();
        for (kx3 c : this.f25076c) {
            c.mo17061c();
        }
        kx3[] kx3Arr = this.f25077d;
        int length = kx3Arr.length;
        for (int i = 0; i <= 0; i++) {
            kx3Arr[i].mo17061c();
        }
        this.f25067G = false;
    }

    /* renamed from: i */
    public final void mo16780i(int i) {
        if (this.f25069I != i) {
            this.f25069I = i;
            this.f25068H = i != 0;
            zze();
        }
    }

    /* renamed from: j */
    public final boolean mo16781j(C5689w wVar) {
        return mo16772a(wVar) != 0;
    }

    /* renamed from: k */
    public final void mo16782k(i10 i10) {
        m32779C(new i10(wy2.m33406A(i10.f17854a, 0.1f, 8.0f), wy2.m33406A(i10.f17855b, 0.1f, 8.0f)), m32796x().f21238b);
    }

    /* renamed from: l */
    public final void mo16783l(float f) {
        if (this.f25096w != f) {
            this.f25096w = f;
            m32780D();
        }
    }

    /* renamed from: m */
    public final boolean mo16784m(ByteBuffer byteBuffer, long j, int i) throws yx3, by3 {
        ByteBuffer byteBuffer2 = this.f25099z;
        gs1.m24486d(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f25085l != null) {
            if (!m32782F()) {
                return false;
            }
            ly3 ly3 = this.f25085l;
            ly3 ly32 = this.f25086m;
            int i2 = ly32.f19659c;
            int i3 = ly3.f19659c;
            if (ly32.f19663g == ly3.f19663g && ly32.f19661e == ly3.f19661e && ly32.f19662f == ly3.f19662f && ly32.f19660d == ly3.f19660d) {
                this.f25086m = ly3;
                this.f25085l = null;
                if (m32784H(this.f25087n)) {
                    this.f25087n.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f25087n;
                    C5689w wVar = this.f25086m.f19657a;
                    audioTrack.setOffloadDelayPadding(wVar.f25117B, wVar.f25118C);
                    this.f25072L = true;
                }
            } else {
                m32777A();
                if (zzs()) {
                    return false;
                }
                zze();
            }
            m32797y(j);
        }
        if (!m32783G()) {
            try {
                this.f25078e.block();
                ly3 ly33 = this.f25086m;
                Objects.requireNonNull(ly33);
                AudioTrack c = ly33.mo19301c(false, this.f25088o, this.f25069I);
                this.f25087n = c;
                if (m32784H(c)) {
                    AudioTrack audioTrack2 = this.f25087n;
                    if (this.f25081h == null) {
                        this.f25081h = new uy3(this);
                    }
                    this.f25081h.mo21399a(audioTrack2);
                    AudioTrack audioTrack3 = this.f25087n;
                    C5689w wVar2 = this.f25086m.f19657a;
                    audioTrack3.setOffloadDelayPadding(wVar2.f25117B, wVar2.f25118C);
                }
                this.f25069I = this.f25087n.getAudioSessionId();
                hy3 hy3 = this.f25079f;
                AudioTrack audioTrack4 = this.f25087n;
                ly3 ly34 = this.f25086m;
                int i4 = ly34.f19659c;
                hy3.mo18235f(audioTrack4, false, ly34.f19663g, ly34.f19660d, ly34.f19664h);
                m32780D();
                int i5 = this.f25070J.f26511a;
                this.f25094u = true;
            } catch (yx3 e) {
                zx3 zx3 = this.f25084k;
                if (zx3 != null) {
                    zx3.mo22309b(e);
                }
                throw e;
            } catch (yx3 e2) {
                this.f25082i.mo20346b(e2);
                return false;
            }
        }
        this.f25082i.mo20345a();
        if (this.f25094u) {
            this.f25095v = Math.max(0, j);
            this.f25093t = false;
            this.f25094u = false;
            m32797y(j);
            if (this.f25067G) {
                mo16776e();
            }
        }
        if (!this.f25079f.mo18240k(m32795w())) {
            return false;
        }
        if (this.f25099z == null) {
            gs1.m24486d(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            int i6 = this.f25086m.f19659c;
            if (this.f25089p != null) {
                if (!m32782F()) {
                    return false;
                }
                m32797y(j);
                this.f25089p = null;
            }
            long v = this.f25095v + (((m32794v() - this.f25075b.mo17780o()) * 1000000) / ((long) this.f25086m.f19657a.f25147z));
            if (!this.f25093t && Math.abs(v - j) > 200000) {
                this.f25084k.mo22309b(new ay3(j, v));
                this.f25093t = true;
            }
            if (this.f25093t) {
                if (!m32782F()) {
                    return false;
                }
                long j2 = j - v;
                this.f25095v += j2;
                this.f25093t = false;
                m32797y(j);
                zx3 zx32 = this.f25084k;
                if (!(zx32 == null || j2 == 0)) {
                    ((yy3) zx32).f26593a.mo22450f0();
                }
            }
            int i7 = this.f25086m.f19659c;
            this.f25091r += (long) byteBuffer.remaining();
            this.f25099z = byteBuffer;
        }
        m32778B(j);
        if (!this.f25099z.hasRemaining()) {
            this.f25099z = null;
            return true;
        } else if (!this.f25079f.mo18239j(m32795w())) {
            return false;
        } else {
            Log.w("DefaultAudioSink", "Resetting stalled audio track");
            zze();
            return true;
        }
    }

    /* renamed from: n */
    public final boolean mo16785n() {
        return !m32783G() || (this.f25065E && !zzs());
    }

    /* renamed from: o */
    public final void mo16786o(zx3 zx3) {
        this.f25084k = zx3;
    }

    /* renamed from: p */
    public final void mo16787p(C5689w wVar, int i, int[] iArr) throws xx3 {
        if ("audio/raw".equals(wVar.f25133l)) {
            gs1.m24486d(wy2.m33455r(wVar.f25116A));
            int S = wy2.m33424S(wVar.f25116A, wVar.f25146y);
            int i2 = wVar.f25116A;
            kx3[] kx3Arr = this.f25076c;
            this.f25075b.mo17782q(wVar.f25117B, wVar.f25118C);
            int i3 = 0;
            if (wy2.f25579a < 21 && wVar.f25146y == 8 && iArr == null) {
                iArr = new int[6];
                for (int i4 = 0; i4 < 6; i4++) {
                    iArr[i4] = i4;
                }
            }
            this.f25074a.mo18768o(iArr);
            ix3 ix3 = new ix3(wVar.f25147z, wVar.f25146y, wVar.f25116A);
            int length = kx3Arr.length;
            while (i3 < length) {
                kx3 kx3 = kx3Arr[i3];
                try {
                    ix3 g = kx3.mo17064g(ix3);
                    if (true == kx3.mo16432d()) {
                        ix3 = g;
                    }
                    i3++;
                } catch (jx3 e) {
                    throw new xx3((Throwable) e, wVar);
                }
            }
            int i5 = ix3.f18273c;
            int i6 = ix3.f18271a;
            int P = wy2.m33421P(ix3.f18272b);
            int S2 = wy2.m33424S(i5, ix3.f18272b);
            if (i5 == 0) {
                String valueOf = String.valueOf(wVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Invalid output encoding (mode=0) for: ");
                sb.append(valueOf);
                throw new xx3(sb.toString(), wVar);
            } else if (P != 0) {
                ly3 ly3 = new ly3(wVar, S, 0, S2, i6, P, i5, 0, false, kx3Arr);
                if (m32783G()) {
                    this.f25085l = ly3;
                } else {
                    this.f25086m = ly3;
                }
            } else {
                String valueOf2 = String.valueOf(wVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 54);
                sb2.append("Invalid output channel config (mode=0) for: ");
                sb2.append(valueOf2);
                throw new xx3(sb2.toString(), wVar);
            }
        } else {
            int i7 = wVar.f25147z;
            int i8 = wy2.f25579a;
            String valueOf3 = String.valueOf(wVar);
            String.valueOf(valueOf3).length();
            throw new xx3("Unable to configure passthrough for: ".concat(String.valueOf(valueOf3)), wVar);
        }
    }

    /* renamed from: q */
    public final void mo16788q(fc3 fc3) {
        if (!this.f25088o.equals(fc3)) {
            this.f25088o = fc3;
            zze();
        }
    }

    /* renamed from: r */
    public final void mo16789r(boolean z) {
        m32779C(m32796x().f21237a, z);
    }

    public final void zze() {
        if (m32783G()) {
            this.f25091r = 0;
            this.f25092s = 0;
            this.f25072L = false;
            this.f25090q = new oy3(m32796x().f21237a, m32796x().f21238b, 0, 0, (ny3) null);
            this.f25095v = 0;
            this.f25089p = null;
            this.f25080g.clear();
            this.f25099z = null;
            this.f25061A = null;
            this.f25066F = false;
            this.f25065E = false;
            this.f25064D = -1;
            this.f25075b.mo17781p();
            m32798z();
            if (this.f25079f.mo18238i()) {
                this.f25087n.pause();
            }
            if (m32784H(this.f25087n)) {
                uy3 uy3 = this.f25081h;
                Objects.requireNonNull(uy3);
                uy3.mo21400b(this.f25087n);
            }
            AudioTrack audioTrack = this.f25087n;
            this.f25087n = null;
            if (wy2.f25579a < 21 && !this.f25068H) {
                this.f25069I = 0;
            }
            ly3 ly3 = this.f25085l;
            if (ly3 != null) {
                this.f25086m = ly3;
                this.f25085l = null;
            }
            this.f25079f.mo18234e();
            this.f25078e.close();
            new ky3(this, "ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.f25083j.mo20345a();
        this.f25082i.mo20345a();
    }

    public final boolean zzs() {
        return m32783G() && this.f25079f.mo18237h(m32795w());
    }
}
