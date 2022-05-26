package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class fy3 {

    /* renamed from: a */
    private final ey3 f16812a;

    /* renamed from: b */
    private int f16813b;

    /* renamed from: c */
    private long f16814c;

    /* renamed from: d */
    private long f16815d;

    /* renamed from: e */
    private long f16816e;

    /* renamed from: f */
    private long f16817f;

    public fy3(AudioTrack audioTrack) {
        if (wy2.f25579a >= 19) {
            this.f16812a = new ey3(audioTrack);
            mo17776e();
            return;
        }
        this.f16812a = null;
        m24007h(3);
    }

    /* renamed from: h */
    private final void m24007h(int i) {
        this.f16813b = i;
        long j = 10000;
        if (i == 0) {
            this.f16816e = 0;
            this.f16817f = -1;
            this.f16814c = System.nanoTime() / 1000;
        } else if (i != 1) {
            j = (i == 2 || i == 3) ? 10000000 : 500000;
        } else {
            this.f16815d = 10000;
            return;
        }
        this.f16815d = j;
    }

    @TargetApi(19)
    /* renamed from: a */
    public final long mo17772a() {
        ey3 ey3 = this.f16812a;
        if (ey3 != null) {
            return ey3.mo17436a();
        }
        return -1;
    }

    @TargetApi(19)
    /* renamed from: b */
    public final long mo17773b() {
        ey3 ey3 = this.f16812a;
        if (ey3 != null) {
            return ey3.mo17437b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: c */
    public final void mo17774c() {
        if (this.f16813b == 4) {
            mo17776e();
        }
    }

    /* renamed from: d */
    public final void mo17775d() {
        m24007h(4);
    }

    /* renamed from: e */
    public final void mo17776e() {
        if (this.f16812a != null) {
            m24007h(0);
        }
    }

    /* renamed from: f */
    public final boolean mo17777f() {
        return this.f16813b == 2;
    }

    @TargetApi(19)
    /* renamed from: g */
    public final boolean mo17778g(long j) {
        ey3 ey3 = this.f16812a;
        if (ey3 != null && j - this.f16816e >= this.f16815d) {
            this.f16816e = j;
            boolean c = ey3.mo17438c();
            int i = this.f16813b;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3 && c) {
                            mo17776e();
                            return true;
                        }
                    } else if (!c) {
                        mo17776e();
                        return false;
                    }
                } else if (!c) {
                    mo17776e();
                } else if (this.f16812a.mo17436a() > this.f16817f) {
                    m24007h(2);
                    return true;
                }
            } else if (c) {
                if (this.f16812a.mo17437b() < this.f16814c) {
                    return false;
                }
                this.f16817f = this.f16812a.mo17436a();
                m24007h(1);
                return true;
            } else if (j - this.f16814c > 500000) {
                m24007h(3);
            }
            return c;
        }
        return false;
    }
}
