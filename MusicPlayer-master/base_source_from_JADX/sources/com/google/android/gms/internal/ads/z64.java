package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class z64 {

    /* renamed from: a */
    private y64 f26692a = new y64();

    /* renamed from: b */
    private y64 f26693b = new y64();

    /* renamed from: c */
    private boolean f26694c;

    /* renamed from: d */
    private long f26695d = -9223372036854775807L;

    /* renamed from: e */
    private int f26696e;

    /* renamed from: a */
    public final float mo22341a() {
        if (this.f26692a.mo22180f()) {
            return (float) (1.0E9d / ((double) this.f26692a.mo22175a()));
        }
        return -1.0f;
    }

    /* renamed from: b */
    public final int mo22342b() {
        return this.f26696e;
    }

    /* renamed from: c */
    public final long mo22343c() {
        if (this.f26692a.mo22180f()) {
            return this.f26692a.mo22175a();
        }
        return -9223372036854775807L;
    }

    /* renamed from: d */
    public final long mo22344d() {
        if (this.f26692a.mo22180f()) {
            return this.f26692a.mo22176b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: e */
    public final void mo22345e(long j) {
        this.f26692a.mo22177c(j);
        int i = 0;
        if (this.f26692a.mo22180f()) {
            this.f26694c = false;
        } else if (this.f26695d != -9223372036854775807L) {
            if (!this.f26694c || this.f26693b.mo22179e()) {
                this.f26693b.mo22178d();
                this.f26693b.mo22177c(this.f26695d);
            }
            this.f26694c = true;
            this.f26693b.mo22177c(j);
        }
        if (this.f26694c && this.f26693b.mo22180f()) {
            y64 y64 = this.f26692a;
            this.f26692a = this.f26693b;
            this.f26693b = y64;
            this.f26694c = false;
        }
        this.f26695d = j;
        if (!this.f26692a.mo22180f()) {
            i = this.f26696e + 1;
        }
        this.f26696e = i;
    }

    /* renamed from: f */
    public final void mo22346f() {
        this.f26692a.mo22178d();
        this.f26693b.mo22178d();
        this.f26694c = false;
        this.f26695d = -9223372036854775807L;
        this.f26696e = 0;
    }

    /* renamed from: g */
    public final boolean mo22347g() {
        return this.f26692a.mo22180f();
    }
}
