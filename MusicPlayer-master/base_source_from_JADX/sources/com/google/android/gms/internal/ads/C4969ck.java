package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.ck */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4969ck {

    /* renamed from: d */
    public static final C4969ck f14994d = new C4969ck(new C4932bk[0]);

    /* renamed from: a */
    public final int f14995a;

    /* renamed from: b */
    private final C4932bk[] f14996b;

    /* renamed from: c */
    private int f14997c;

    public C4969ck(C4932bk... bkVarArr) {
        this.f14996b = bkVarArr;
        this.f14995a = bkVarArr.length;
    }

    /* renamed from: a */
    public final int mo16649a(C4932bk bkVar) {
        for (int i = 0; i < this.f14995a; i++) {
            if (this.f14996b[i] == bkVar) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final C4932bk mo16650b(int i) {
        return this.f14996b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4969ck.class == obj.getClass()) {
            C4969ck ckVar = (C4969ck) obj;
            return this.f14995a == ckVar.f14995a && Arrays.equals(this.f14996b, ckVar.f14996b);
        }
    }

    public final int hashCode() {
        int i = this.f14997c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f14996b);
        this.f14997c = hashCode;
        return hashCode;
    }
}
