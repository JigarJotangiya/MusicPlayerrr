package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class hy3 {

    /* renamed from: A */
    private long f17791A;

    /* renamed from: B */
    private long f17792B;

    /* renamed from: C */
    private long f17793C;

    /* renamed from: D */
    private boolean f17794D;

    /* renamed from: E */
    private long f17795E;

    /* renamed from: F */
    private long f17796F;

    /* renamed from: a */
    private final gy3 f17797a;

    /* renamed from: b */
    private final long[] f17798b;

    /* renamed from: c */
    private AudioTrack f17799c;

    /* renamed from: d */
    private int f17800d;

    /* renamed from: e */
    private int f17801e;

    /* renamed from: f */
    private fy3 f17802f;

    /* renamed from: g */
    private int f17803g;

    /* renamed from: h */
    private boolean f17804h;

    /* renamed from: i */
    private long f17805i;

    /* renamed from: j */
    private float f17806j;

    /* renamed from: k */
    private boolean f17807k;

    /* renamed from: l */
    private long f17808l;

    /* renamed from: m */
    private long f17809m;

    /* renamed from: n */
    private Method f17810n;

    /* renamed from: o */
    private long f17811o;

    /* renamed from: p */
    private boolean f17812p;

    /* renamed from: q */
    private boolean f17813q;

    /* renamed from: r */
    private long f17814r;

    /* renamed from: s */
    private long f17815s;

    /* renamed from: t */
    private long f17816t;

    /* renamed from: u */
    private long f17817u;

    /* renamed from: v */
    private int f17818v;

    /* renamed from: w */
    private int f17819w;

    /* renamed from: x */
    private long f17820x;

    /* renamed from: y */
    private long f17821y;

    /* renamed from: z */
    private long f17822z;

    public hy3(gy3 gy3) {
        this.f17797a = gy3;
        if (wy2.f25579a >= 18) {
            try {
                this.f17810n = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f17798b = new long[10];
    }

    /* renamed from: m */
    private final long m24971m(long j) {
        return (j * 1000000) / ((long) this.f17803g);
    }

    /* renamed from: n */
    private final long m24972n() {
        AudioTrack audioTrack = this.f17799c;
        Objects.requireNonNull(audioTrack);
        if (this.f17820x != -9223372036854775807L) {
            return Math.min(this.f17791A, this.f17822z + ((((SystemClock.elapsedRealtime() * 1000) - this.f17820x) * ((long) this.f17803g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f17804h) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.f17817u = this.f17815s;
                }
                playState = 2;
            }
            playbackHeadPosition += this.f17817u;
        }
        if (wy2.f25579a <= 29) {
            if (playbackHeadPosition == 0 && this.f17815s > 0 && playState == 3) {
                if (this.f17821y == -9223372036854775807L) {
                    this.f17821y = SystemClock.elapsedRealtime();
                }
                return this.f17815s;
            }
            this.f17821y = -9223372036854775807L;
        }
        if (this.f17815s > playbackHeadPosition) {
            this.f17816t++;
        }
        this.f17815s = playbackHeadPosition;
        return playbackHeadPosition + (this.f17816t << 32);
    }

    /* renamed from: o */
    private final void m24973o() {
        this.f17808l = 0;
        this.f17819w = 0;
        this.f17818v = 0;
        this.f17809m = 0;
        this.f17793C = 0;
        this.f17796F = 0;
        this.f17807k = false;
    }

    /* renamed from: a */
    public final int mo18230a(long j) {
        return this.f17801e - ((int) (j - (m24972n() * ((long) this.f17800d))));
    }

    /* renamed from: b */
    public final long mo18231b(boolean z) {
        long j;
        Method method;
        hy3 hy3 = this;
        AudioTrack audioTrack = hy3.f17799c;
        Objects.requireNonNull(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            long m = hy3.m24971m(m24972n());
            if (m != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - hy3.f17809m >= 30000) {
                    long[] jArr = hy3.f17798b;
                    int i = hy3.f17818v;
                    jArr[i] = m - nanoTime;
                    hy3.f17818v = (i + 1) % 10;
                    int i2 = hy3.f17819w;
                    if (i2 < 10) {
                        hy3.f17819w = i2 + 1;
                    }
                    hy3.f17809m = nanoTime;
                    hy3.f17808l = 0;
                    int i3 = 0;
                    while (true) {
                        int i4 = hy3.f17819w;
                        if (i3 >= i4) {
                            break;
                        }
                        hy3.f17808l += hy3.f17798b[i3] / ((long) i4);
                        i3++;
                    }
                }
                if (!hy3.f17804h) {
                    fy3 fy3 = hy3.f17802f;
                    Objects.requireNonNull(fy3);
                    if (fy3.mo17778g(nanoTime)) {
                        long b = fy3.mo17773b();
                        long a = fy3.mo17772a();
                        if (Math.abs(b - nanoTime) > 5000000) {
                            ry3 ry3 = (ry3) hy3.f17797a;
                            long K = ry3.f23227a.m32794v();
                            long L = ry3.f23227a.m32795w();
                            StringBuilder sb = new StringBuilder(180);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(a);
                            sb.append(", ");
                            sb.append(b);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(m);
                            sb.append(", ");
                            sb.append(K);
                            sb.append(", ");
                            sb.append(L);
                            Log.w("DefaultAudioSink", sb.toString());
                            fy3.mo17775d();
                        } else {
                            fy3 fy32 = fy3;
                            if (Math.abs(hy3.m24971m(a) - m) > 5000000) {
                                ry3 ry32 = (ry3) hy3.f17797a;
                                long K2 = ry32.f23227a.m32794v();
                                long L2 = ry32.f23227a.m32795w();
                                StringBuilder sb2 = new StringBuilder(182);
                                sb2.append("Spurious audio timestamp (frame position mismatch): ");
                                sb2.append(a);
                                sb2.append(", ");
                                sb2.append(b);
                                sb2.append(", ");
                                sb2.append(nanoTime);
                                sb2.append(", ");
                                sb2.append(m);
                                sb2.append(", ");
                                sb2.append(K2);
                                sb2.append(", ");
                                sb2.append(L2);
                                Log.w("DefaultAudioSink", sb2.toString());
                                fy32.mo17775d();
                            } else {
                                fy32.mo17774c();
                            }
                        }
                        hy3 = this;
                    }
                    if (hy3.f17813q && (method = hy3.f17810n) != null && nanoTime - hy3.f17814r >= 500000) {
                        try {
                            AudioTrack audioTrack2 = hy3.f17799c;
                            Objects.requireNonNull(audioTrack2);
                            int i5 = wy2.f25579a;
                            long intValue = (((long) ((Integer) method.invoke(audioTrack2, new Object[0])).intValue()) * 1000) - hy3.f17805i;
                            hy3.f17811o = intValue;
                            long max = Math.max(intValue, 0);
                            hy3.f17811o = max;
                            if (max > 5000000) {
                                StringBuilder sb3 = new StringBuilder(61);
                                sb3.append("Ignoring impossibly large audio latency: ");
                                sb3.append(max);
                                Log.w("DefaultAudioSink", sb3.toString());
                                hy3.f17811o = 0;
                            }
                        } catch (Exception unused) {
                            hy3.f17810n = null;
                        }
                        hy3.f17814r = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        fy3 fy33 = hy3.f17802f;
        Objects.requireNonNull(fy33);
        boolean f = fy33.mo17777f();
        if (f) {
            j = hy3.m24971m(fy33.mo17772a()) + wy2.m33427V(nanoTime2 - fy33.mo17773b(), hy3.f17806j);
        } else {
            if (hy3.f17819w == 0) {
                j = hy3.m24971m(m24972n());
            } else {
                j = hy3.f17808l + nanoTime2;
            }
            if (!z) {
                j = Math.max(0, j - hy3.f17811o);
            }
        }
        if (hy3.f17794D != f) {
            hy3.f17796F = hy3.f17793C;
            hy3.f17795E = hy3.f17792B;
        }
        long j2 = nanoTime2 - hy3.f17796F;
        if (j2 < 1000000) {
            long j3 = (j2 * 1000) / 1000000;
            j = ((j * j3) + ((1000 - j3) * (hy3.f17795E + wy2.m33427V(j2, hy3.f17806j)))) / 1000;
        }
        if (!hy3.f17807k) {
            long j4 = hy3.f17792B;
            if (j > j4) {
                hy3.f17807k = true;
                long currentTimeMillis = System.currentTimeMillis() - bw3.m21570d(wy2.m33429X(bw3.m21570d(j - j4), hy3.f17806j));
                ry3 ry33 = (ry3) hy3.f17797a;
                if (ry33.f23227a.f25084k != null) {
                    ((yy3) ry33.f23227a.f25084k).f26593a.f27074F0.mo21643r(currentTimeMillis);
                }
            }
        }
        hy3.f17793C = nanoTime2;
        hy3.f17792B = j;
        hy3.f17794D = f;
        return j;
    }

    /* renamed from: c */
    public final long mo18232c(long j) {
        return bw3.m21570d(m24971m(-m24972n()));
    }

    /* renamed from: d */
    public final void mo18233d(long j) {
        this.f17822z = m24972n();
        this.f17820x = SystemClock.elapsedRealtime() * 1000;
        this.f17791A = j;
    }

    /* renamed from: e */
    public final void mo18234e() {
        m24973o();
        this.f17799c = null;
        this.f17802f = null;
    }

    /* renamed from: f */
    public final void mo18235f(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.f17799c = audioTrack;
        this.f17800d = i2;
        this.f17801e = i3;
        this.f17802f = new fy3(audioTrack);
        this.f17803g = audioTrack.getSampleRate();
        this.f17804h = false;
        boolean r = wy2.m33455r(i);
        this.f17813q = r;
        this.f17805i = r ? m24971m((long) (i3 / i2)) : -9223372036854775807L;
        this.f17815s = 0;
        this.f17816t = 0;
        this.f17817u = 0;
        this.f17812p = false;
        this.f17820x = -9223372036854775807L;
        this.f17821y = -9223372036854775807L;
        this.f17814r = 0;
        this.f17811o = 0;
        this.f17806j = 1.0f;
    }

    /* renamed from: g */
    public final void mo18236g() {
        fy3 fy3 = this.f17802f;
        Objects.requireNonNull(fy3);
        fy3.mo17776e();
    }

    /* renamed from: h */
    public final boolean mo18237h(long j) {
        if (j > m24972n()) {
            return true;
        }
        if (!this.f17804h) {
            return false;
        }
        AudioTrack audioTrack = this.f17799c;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 2 && m24972n() == 0;
    }

    /* renamed from: i */
    public final boolean mo18238i() {
        AudioTrack audioTrack = this.f17799c;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    /* renamed from: j */
    public final boolean mo18239j(long j) {
        return this.f17821y != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.f17821y >= 200;
    }

    /* renamed from: k */
    public final boolean mo18240k(long j) {
        AudioTrack audioTrack = this.f17799c;
        Objects.requireNonNull(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.f17804h) {
            if (playState == 2) {
                this.f17812p = false;
                return false;
            } else if (playState == 1) {
                if (m24972n() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.f17812p;
        boolean h = mo18237h(j);
        this.f17812p = h;
        if (z && !h && playState != 1) {
            gy3 gy3 = this.f17797a;
            int i = this.f17801e;
            long d = bw3.m21570d(this.f17805i);
            ry3 ry3 = (ry3) gy3;
            if (ry3.f23227a.f25084k != null) {
                ((yy3) ry3.f23227a.f25084k).f26593a.f27074F0.mo21645t(i, d, SystemClock.elapsedRealtime() - ry3.f23227a.f25071K);
            }
        }
        return true;
    }

    /* renamed from: l */
    public final boolean mo18241l() {
        m24973o();
        if (this.f17820x != -9223372036854775807L) {
            return false;
        }
        fy3 fy3 = this.f17802f;
        Objects.requireNonNull(fy3);
        fy3.mo17776e();
        return true;
    }
}
