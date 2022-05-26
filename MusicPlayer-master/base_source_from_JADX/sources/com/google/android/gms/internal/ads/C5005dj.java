package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.dj */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5005dj implements C5156hl {

    /* renamed from: a */
    private final Uri f15624a;

    /* renamed from: b */
    private final C5673vk f15625b;

    /* renamed from: c */
    private final C5042ej f15626c;

    /* renamed from: d */
    private final C5378nl f15627d;

    /* renamed from: e */
    private final C5595tg f15628e = new C5595tg();

    /* renamed from: f */
    private volatile boolean f15629f;

    /* renamed from: g */
    private boolean f15630g = true;

    /* renamed from: h */
    private long f15631h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public long f15632i = -1;

    /* renamed from: j */
    final /* synthetic */ C5117gj f15633j;

    public C5005dj(C5117gj gjVar, Uri uri, C5673vk vkVar, C5042ej ejVar, C5378nl nlVar) {
        this.f15633j = gjVar;
        Objects.requireNonNull(uri);
        this.f15624a = uri;
        Objects.requireNonNull(vkVar);
        this.f15625b = vkVar;
        Objects.requireNonNull(ejVar);
        this.f15626c = ejVar;
        this.f15627d = nlVar;
    }

    /* renamed from: a */
    public final void mo16935a() {
        this.f15629f = true;
    }

    /* renamed from: b */
    public final void mo16936b() throws IOException, InterruptedException {
        C5410og ogVar;
        long j;
        while (!this.f15629f) {
            int i = 0;
            try {
                long j2 = this.f15628e.f23851a;
                C5673vk vkVar = this.f15625b;
                C5747xk xkVar = r4;
                long j3 = j2;
                C5747xk xkVar2 = new C5747xk(this.f15624a, (byte[]) null, j2, j2, -1, (String) null, 0);
                long c = vkVar.mo15844c(xkVar);
                this.f15632i = c;
                if (c != -1) {
                    j = j3;
                    c += j;
                    this.f15632i = c;
                } else {
                    j = j3;
                }
                C5673vk vkVar2 = this.f15625b;
                ogVar = new C5410og(vkVar2, j, c);
                try {
                    C5447pg b = this.f15626c.mo17195b(ogVar, vkVar2.mo15843b());
                    if (this.f15630g) {
                        b.mo17914e(j, this.f15631h);
                        this.f15630g = false;
                    }
                    long j4 = j;
                    int i2 = 0;
                    while (true) {
                        if (i2 != 0) {
                            break;
                        }
                        try {
                            if (this.f15629f) {
                                i2 = 0;
                                break;
                            }
                            this.f15627d.mo19746a();
                            i2 = b.mo17915f(ogVar, this.f15628e);
                            if (ogVar.mo19984d() > this.f15633j.f17135m + j4) {
                                j4 = ogVar.mo19984d();
                                this.f15627d.mo19747b();
                                this.f15633j.f17141s.post(this.f15633j.f17140r);
                            }
                        } catch (Throwable th) {
                            th = th;
                            i = i2;
                            this.f15628e.f23851a = ogVar.mo19984d();
                            C4934bm.m21443m(this.f15625b);
                            throw th;
                        }
                    }
                    if (i2 != 1) {
                        this.f15628e.f23851a = ogVar.mo19984d();
                        i = i2;
                    }
                    C4934bm.m21443m(this.f15625b);
                    if (i != 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.f15628e.f23851a = ogVar.mo19984d();
                    C4934bm.m21443m(this.f15625b);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                ogVar = null;
                if (!(i == 1 || ogVar == null)) {
                    this.f15628e.f23851a = ogVar.mo19984d();
                }
                C4934bm.m21443m(this.f15625b);
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final void mo16937d(long j, long j2) {
        this.f15628e.f23851a = j;
        this.f15631h = j2;
        this.f15630g = true;
    }

    public final boolean zze() {
        return this.f15629f;
    }
}
