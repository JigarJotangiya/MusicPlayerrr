package com.google.android.gms.internal.ads;

import java.util.Arrays;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xh0 {

    /* renamed from: a */
    public final int f25828a = 1;

    /* renamed from: b */
    private final C5689w[] f25829b;

    /* renamed from: c */
    private int f25830c;

    static {
        yg0 yg0 = yg0.f26359a;
    }

    public xh0(C5689w... wVarArr) {
        this.f25829b = wVarArr;
        m33702c(wVarArr[0].f25124c);
        int i = wVarArr[0].f25126e;
    }

    /* renamed from: c */
    private static String m33702c(String str) {
        return (str == null || str.equals("und")) ? BuildConfig.FLAVOR : str;
    }

    /* renamed from: a */
    public final int mo22030a(C5689w wVar) {
        for (int i = 0; i <= 0; i++) {
            if (wVar == this.f25829b[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final C5689w mo22031b(int i) {
        return this.f25829b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && xh0.class == obj.getClass() && Arrays.equals(this.f25829b, ((xh0) obj).f25829b);
    }

    public final int hashCode() {
        int i = this.f25830c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f25829b) + 527;
        this.f25830c = hashCode;
        return hashCode;
    }
}
