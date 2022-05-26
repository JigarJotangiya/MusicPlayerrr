package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class q43<E> extends z33<E> {

    /* renamed from: d */
    Object[] f21812d;

    /* renamed from: e */
    private int f21813e;

    q43(int i) {
        super(i);
        this.f21812d = new Object[r43.zzh(i)];
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ a43 mo15684a(Object obj) {
        mo20392f(obj);
        return this;
    }

    /* renamed from: f */
    public final q43<E> mo20392f(E e) {
        Object[] objArr;
        int length;
        Objects.requireNonNull(e);
        if (this.f21812d == null || r43.zzh(this.f26657b) > (length = objArr.length)) {
            this.f21812d = null;
            super.mo22329c(e);
            return this;
        }
        (objArr = this.f21812d).getClass();
        int i = length - 1;
        int hashCode = e.hashCode();
        int a = y33.m34009a(hashCode);
        while (true) {
            int i2 = a & i;
            Object[] objArr2 = this.f21812d;
            Object obj = objArr2[i2];
            if (obj != null) {
                if (obj.equals(e)) {
                    break;
                }
                a = i2 + 1;
            } else {
                objArr2[i2] = e;
                this.f21813e += hashCode;
                super.mo22329c(e);
                break;
            }
        }
        return this;
    }

    /* renamed from: g */
    public final q43<E> mo20393g(Iterable<? extends E> iterable) {
        if (this.f21812d != null) {
            for (Object f : iterable) {
                mo20392f(f);
            }
        } else {
            super.mo22330d(iterable);
        }
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.google.android.gms.internal.ads.b63} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.gms.internal.ads.r43} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: com.google.android.gms.internal.ads.b63} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.android.gms.internal.ads.b63} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.r43<E> mo20394h() {
        /*
            r8 = this;
            int r0 = r8.f26657b
            if (r0 == 0) goto L_0x005d
            r1 = 1
            if (r0 == r1) goto L_0x004f
            java.lang.Object[] r2 = r8.f21812d
            if (r2 == 0) goto L_0x003b
            int r0 = com.google.android.gms.internal.ads.r43.zzh(r0)
            java.lang.Object[] r2 = r8.f21812d
            int r2 = r2.length
            if (r0 != r2) goto L_0x003b
            int r0 = r8.f26657b
            java.lang.Object[] r2 = r8.f26656a
            int r2 = r2.length
            boolean r0 = com.google.android.gms.internal.ads.r43.m29864p(r0, r2)
            if (r0 == 0) goto L_0x0028
            java.lang.Object[] r0 = r8.f26656a
            int r2 = r8.f26657b
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            goto L_0x002a
        L_0x0028:
            java.lang.Object[] r0 = r8.f26656a
        L_0x002a:
            r3 = r0
            com.google.android.gms.internal.ads.b63 r0 = new com.google.android.gms.internal.ads.b63
            int r4 = r8.f21813e
            java.lang.Object[] r5 = r8.f21812d
            int r2 = r5.length
            int r6 = r2 + -1
            int r7 = r8.f26657b
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0049
        L_0x003b:
            int r0 = r8.f26657b
            java.lang.Object[] r2 = r8.f26656a
            com.google.android.gms.internal.ads.r43 r0 = com.google.android.gms.internal.ads.r43.m29863d(r0, r2)
            int r2 = r0.size()
            r8.f26657b = r2
        L_0x0049:
            r8.f26658c = r1
            r1 = 0
            r8.f21812d = r1
            return r0
        L_0x004f:
            java.lang.Object[] r0 = r8.f26656a
            r1 = 0
            r0 = r0[r1]
            r0.getClass()
            com.google.android.gms.internal.ads.g63 r1 = new com.google.android.gms.internal.ads.g63
            r1.<init>(r0)
            return r1
        L_0x005d:
            com.google.android.gms.internal.ads.b63<java.lang.Object> r0 = com.google.android.gms.internal.ads.b63.zza
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q43.mo20394h():com.google.android.gms.internal.ads.r43");
    }
}
