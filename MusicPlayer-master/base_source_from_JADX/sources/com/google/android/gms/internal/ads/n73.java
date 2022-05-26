package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class n73<I, O, F, T> extends i83<O> implements Runnable {

    /* renamed from: p */
    public static final /* synthetic */ int f20535p = 0;

    /* renamed from: n */
    d93<? extends I> f20536n;

    /* renamed from: o */
    F f20537o;

    n73(d93<? extends I> d93, F f) {
        Objects.requireNonNull(d93);
        this.f20536n = d93;
        Objects.requireNonNull(f);
        this.f20537o = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public abstract T mo19089F(F f, I i) throws Exception;

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public abstract void mo19090G(T t);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final String mo18099i() {
        String str;
        d93<? extends I> d93 = this.f20536n;
        F f = this.f20537o;
        String i = super.mo18099i();
        if (d93 != null) {
            String obj = d93.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 16);
            sb.append("inputFuture=[");
            sb.append(obj);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = BuildConfig.FLAVOR;
        }
        if (f != null) {
            String obj2 = f.toString();
            StringBuilder sb2 = new StringBuilder(str.length() + 11 + obj2.length());
            sb2.append(str);
            sb2.append("function=[");
            sb2.append(obj2);
            sb2.append("]");
            return sb2.toString();
        } else if (i != null) {
            return i.length() != 0 ? str.concat(i) : new String(str);
        } else {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo18102j() {
        mo18104u(this.f20536n);
        this.f20536n = null;
        this.f20537o = null;
    }

    public final void run() {
        d93<? extends I> d93 = this.f20536n;
        F f = this.f20537o;
        boolean z = true;
        boolean isCancelled = isCancelled() | (d93 == null);
        if (f != null) {
            z = false;
        }
        if (!isCancelled && !z) {
            this.f20536n = null;
            if (d93.isCancelled()) {
                mo18107y(d93);
                return;
            }
            try {
                try {
                    Object F = mo19089F(f, s83.m30614p(d93));
                    this.f20537o = null;
                    mo19090G(F);
                } catch (Throwable th) {
                    this.f20537o = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e) {
                mo18106x(e.getCause());
            } catch (RuntimeException e2) {
                mo18106x(e2);
            } catch (Error e3) {
                mo18106x(e3);
            }
        }
    }
}
