package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class p83<V> implements Runnable {

    /* renamed from: g */
    final Future<V> f21367g;

    /* renamed from: h */
    final o83<? super V> f21368h;

    p83(Future<V> future, o83<? super V> o83) {
        this.f21367g = future;
        this.f21368h = o83;
    }

    public final void run() {
        Throwable a;
        Future<V> future = this.f21367g;
        if (!(future instanceof v93) || (a = w93.m33021a((v93) future)) == null) {
            try {
                this.f21368h.mo10677a(s83.m30614p(this.f21367g));
            } catch (ExecutionException e) {
                this.f21368h.mo10678b(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.f21368h.mo10678b(e2);
            }
        } else {
            this.f21368h.mo10678b(a);
        }
    }

    public final String toString() {
        o13 a = p13.m28828a(this);
        a.mo19884a(this.f21368h);
        return a.toString();
    }
}
