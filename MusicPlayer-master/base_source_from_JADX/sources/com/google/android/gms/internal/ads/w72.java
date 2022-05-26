package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class w72<T> {

    /* renamed from: a */
    public final T f25258a;

    /* renamed from: b */
    private h64 f25259b = new h64();

    /* renamed from: c */
    private boolean f25260c;

    /* renamed from: d */
    private boolean f25261d;

    public w72(T t) {
        this.f25258a = t;
    }

    /* renamed from: a */
    public final void mo21738a(int i, u52<T> u52) {
        if (!this.f25261d) {
            if (i != -1) {
                this.f25259b.mo18093a(i);
            }
            this.f25260c = true;
            u52.mo15949b(this.f25258a);
        }
    }

    /* renamed from: b */
    public final void mo21739b(v62<T> v62) {
        if (!this.f25261d && this.f25260c) {
            i84 b = this.f25259b.mo18094b();
            this.f25259b = new h64();
            this.f25260c = false;
            v62.mo21360a(this.f25258a, b);
        }
    }

    /* renamed from: c */
    public final void mo21740c(v62<T> v62) {
        this.f25261d = true;
        if (this.f25260c) {
            v62.mo21360a(this.f25258a, this.f25259b.mo18094b());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w72.class != obj.getClass()) {
            return false;
        }
        return this.f25258a.equals(((w72) obj).f25258a);
    }

    public final int hashCode() {
        return this.f25258a.hashCode();
    }
}
