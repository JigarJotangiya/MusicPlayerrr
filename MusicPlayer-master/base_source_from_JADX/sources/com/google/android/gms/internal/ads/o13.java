package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class o13 {

    /* renamed from: a */
    private final String f20863a;

    /* renamed from: b */
    private final l13 f20864b;

    /* renamed from: c */
    private l13 f20865c;

    /* synthetic */ o13(String str, m13 m13) {
        l13 l13 = new l13((k13) null);
        this.f20864b = l13;
        this.f20865c = l13;
        Objects.requireNonNull(str);
        this.f20863a = str;
    }

    /* renamed from: a */
    public final o13 mo19884a(Object obj) {
        l13 l13 = new l13((k13) null);
        this.f20865c.f19148b = l13;
        this.f20865c = l13;
        l13.f19147a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f20863a);
        sb.append('{');
        l13 l13 = this.f20864b.f19148b;
        String str = BuildConfig.FLAVOR;
        while (l13 != null) {
            Object obj = l13.f19147a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            l13 = l13.f19148b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
