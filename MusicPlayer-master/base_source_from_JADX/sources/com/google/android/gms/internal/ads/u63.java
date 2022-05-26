package com.google.android.gms.internal.ads;

import java.lang.Throwable;
import java.util.Objects;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class u63<V, X extends Throwable, F, T> extends i83<V> implements Runnable {

    /* renamed from: n */
    d93<? extends V> f24217n;

    /* renamed from: o */
    Class<X> f24218o;

    /* renamed from: p */
    F f24219p;

    u63(d93<? extends V> d93, Class<X> cls, F f) {
        Objects.requireNonNull(d93);
        this.f24217n = d93;
        this.f24218o = cls;
        Objects.requireNonNull(f);
        this.f24219p = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public abstract T mo20796F(F f, X x) throws Exception;

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public abstract void mo20797G(T t);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final String mo18099i() {
        String str;
        d93<? extends V> d93 = this.f24217n;
        Class<X> cls = this.f24218o;
        F f = this.f24219p;
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
        if (cls != null && f != null) {
            String obj2 = cls.toString();
            String obj3 = f.toString();
            StringBuilder sb2 = new StringBuilder(str.length() + 29 + obj2.length() + obj3.length());
            sb2.append(str);
            sb2.append("exceptionType=[");
            sb2.append(obj2);
            sb2.append("], fallback=[");
            sb2.append(obj3);
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
        mo18104u(this.f24217n);
        this.f24217n = null;
        this.f24218o = null;
        this.f24219p = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.d93<? extends V> r0 = r10.f24217n
            java.lang.Class<X> r1 = r10.f24218o
            F r2 = r10.f24219p
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x000c
            r5 = 1
            goto L_0x000d
        L_0x000c:
            r5 = 0
        L_0x000d:
            if (r1 != 0) goto L_0x0011
            r6 = 1
            goto L_0x0012
        L_0x0011:
            r6 = 0
        L_0x0012:
            r5 = r5 | r6
            if (r2 != 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            r3 = r3 | r5
            if (r3 != 0) goto L_0x00b5
            boolean r3 = r10.isCancelled()
            if (r3 == 0) goto L_0x0022
            goto L_0x00b5
        L_0x0022:
            r3 = 0
            r10.f24217n = r3
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.v93     // Catch:{ ExecutionException -> 0x003c, all -> 0x0039 }
            if (r4 == 0) goto L_0x0031
            r4 = r0
            com.google.android.gms.internal.ads.v93 r4 = (com.google.android.gms.internal.ads.v93) r4     // Catch:{ ExecutionException -> 0x003c, all -> 0x0039 }
            java.lang.Throwable r4 = r4.mo18095a()     // Catch:{ ExecutionException -> 0x003c, all -> 0x0039 }
            goto L_0x0032
        L_0x0031:
            r4 = r3
        L_0x0032:
            if (r4 != 0) goto L_0x003a
            java.lang.Object r5 = com.google.android.gms.internal.ads.s83.m30614p(r0)     // Catch:{ ExecutionException -> 0x003c, all -> 0x0039 }
            goto L_0x008b
        L_0x0039:
            r4 = move-exception
        L_0x003a:
            r5 = r3
            goto L_0x008b
        L_0x003c:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L_0x0089
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r7 = java.lang.String.valueOf(r6)
            int r7 = r7.length()
            java.lang.String r8 = java.lang.String.valueOf(r4)
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r7 = r7 + 35
            int r7 = r7 + r8
            r9.<init>(r7)
            java.lang.String r7 = "Future type "
            r9.append(r7)
            r9.append(r6)
            java.lang.String r6 = " threw "
            r9.append(r6)
            r9.append(r4)
            java.lang.String r4 = " without a cause"
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            r5.<init>(r4)
        L_0x0089:
            r4 = r5
            goto L_0x003a
        L_0x008b:
            if (r4 != 0) goto L_0x0091
            r10.mo18105w(r5)
            return
        L_0x0091:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto L_0x00b2
            java.lang.Object r0 = r10.mo20796F(r2, r4)     // Catch:{ all -> 0x00a3 }
            r10.f24218o = r3
            r10.f24219p = r3
            r10.mo20797G(r0)
            return
        L_0x00a3:
            r0 = move-exception
            r10.mo18106x(r0)     // Catch:{ all -> 0x00ac }
            r10.f24218o = r3
            r10.f24219p = r3
            return
        L_0x00ac:
            r0 = move-exception
            r10.f24218o = r3
            r10.f24219p = r3
            throw r0
        L_0x00b2:
            r10.mo18107y(r0)
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u63.run():void");
    }
}
