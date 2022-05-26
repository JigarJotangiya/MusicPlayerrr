package com.bumptech.glide.load.p030n.p032b0;

import android.util.Log;
import com.bumptech.glide.load.C1786g;
import com.bumptech.glide.load.p030n.p032b0.C1826a;
import com.bumptech.glide.p043m.C2091a;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.n.b0.e */
/* compiled from: DiskLruCacheWrapper */
public class C1835e implements C1826a {

    /* renamed from: a */
    private final C1845j f6641a;

    /* renamed from: b */
    private final File f6642b;

    /* renamed from: c */
    private final long f6643c;

    /* renamed from: d */
    private final C1830c f6644d = new C1830c();

    /* renamed from: e */
    private C2091a f6645e;

    @Deprecated
    protected C1835e(File file, long j) {
        this.f6642b = file;
        this.f6643c = j;
        this.f6641a = new C1845j();
    }

    /* renamed from: c */
    public static C1826a m8972c(File file, long j) {
        return new C1835e(file, j);
    }

    /* renamed from: d */
    private synchronized C2091a m8973d() throws IOException {
        if (this.f6645e == null) {
            this.f6645e = C2091a.m9774H0(this.f6642b, 1, 1, this.f6643c);
        }
        return this.f6645e;
    }

    /* renamed from: a */
    public void mo7821a(C1786g gVar, C1826a.C1828b bVar) {
        C2091a.C2094c o0;
        String b = this.f6641a.mo7846b(gVar);
        this.f6644d.mo7825a(b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + b + " for for Key: " + gVar);
            }
            try {
                C2091a d = m8973d();
                if (d.mo8237A0(b) == null) {
                    o0 = d.mo8241o0(b);
                    if (o0 != null) {
                        if (bVar.mo7824a(o0.mo8248f(0))) {
                            o0.mo8247e();
                        }
                        o0.mo8246b();
                        this.f6644d.mo7826b(b);
                        return;
                    }
                    throw new IllegalStateException("Had two simultaneous puts for: " + b);
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            } catch (Throwable th) {
                o0.mo8246b();
                throw th;
            }
        } finally {
            this.f6644d.mo7826b(b);
        }
    }

    /* renamed from: b */
    public File mo7822b(C1786g gVar) {
        String b = this.f6641a.mo7846b(gVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + b + " for for Key: " + gVar);
        }
        try {
            C2091a.C2096e A0 = m8973d().mo8237A0(b);
            if (A0 != null) {
                return A0.mo8252a(0);
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }
}
