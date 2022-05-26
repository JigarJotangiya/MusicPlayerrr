package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.l1 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6381l1 {

    /* renamed from: a */
    private final Map<String, Double> f29563a = new HashMap();

    C6381l1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized double mo25306a(String str) {
        Double d = this.f29563a.get(str);
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized double mo25307b(String str, C6332c2 c2Var) {
        double d;
        d = (((double) ((C6325b1) c2Var).f29389h) + 1.0d) / ((double) ((C6325b1) c2Var).f29390i);
        this.f29563a.put(str, Double.valueOf(d));
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo25308c(String str) {
        this.f29563a.put(str, Double.valueOf(0.0d));
    }
}
