package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class d00 {

    /* renamed from: a */
    private final Map<String, c00> f15413a = new HashMap();

    /* renamed from: b */
    private final f00 f15414b;

    public d00(f00 f00) {
        this.f15414b = f00;
    }

    /* renamed from: a */
    public final f00 mo16805a() {
        return this.f15414b;
    }

    /* renamed from: b */
    public final void mo16806b(String str, c00 c00) {
        this.f15413a.put(str, c00);
    }

    /* renamed from: c */
    public final void mo16807c(String str, String str2, long j) {
        f00 f00 = this.f15414b;
        c00 c00 = this.f15413a.get(str2);
        String[] strArr = {str};
        if (c00 != null) {
            f00.mo17449e(c00, j, strArr);
        }
        this.f15413a.put(str, new c00(j, (String) null, (c00) null));
    }
}
