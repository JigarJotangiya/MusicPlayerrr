package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cm3 {

    /* renamed from: b */
    private static volatile cm3 f15032b;

    /* renamed from: c */
    private static volatile cm3 f15033c;

    /* renamed from: d */
    static final cm3 f15034d = new cm3(true);

    /* renamed from: a */
    private final Map<bm3, pm3<?, ?>> f15035a;

    cm3() {
        this.f15035a = new HashMap();
    }

    /* renamed from: a */
    public static cm3 m21985a() {
        cm3 cm3 = f15032b;
        if (cm3 == null) {
            synchronized (cm3.class) {
                cm3 = f15032b;
                if (cm3 == null) {
                    cm3 = f15034d;
                    f15032b = cm3;
                }
            }
        }
        return cm3;
    }

    /* renamed from: b */
    public static cm3 m21986b() {
        Class<cm3> cls = cm3.class;
        cm3 cm3 = f15033c;
        if (cm3 != null) {
            return cm3;
        }
        synchronized (cls) {
            cm3 cm32 = f15033c;
            if (cm32 != null) {
                return cm32;
            }
            cm3 b = lm3.m26789b(cls);
            f15033c = b;
            return b;
        }
    }

    /* renamed from: c */
    public final <ContainingType extends zn3> pm3<ContainingType, ?> mo16685c(ContainingType containingtype, int i) {
        return this.f15035a.get(new bm3(containingtype, i));
    }

    cm3(boolean z) {
        this.f15035a = Collections.emptyMap();
    }
}
