package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.ads.internal.util.i0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C3005i0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<String> f10017a = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List<Double> f10018b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final List<Double> f10019c = new ArrayList();

    /* renamed from: a */
    public final C3005i0 mo11039a(String str, double d, double d2) {
        int i = 0;
        while (i < this.f10017a.size()) {
            double doubleValue = this.f10019c.get(i).doubleValue();
            double doubleValue2 = this.f10018b.get(i).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.f10017a.add(i, str);
        this.f10019c.add(i, Double.valueOf(d));
        this.f10018b.add(i, Double.valueOf(d2));
        return this;
    }

    /* renamed from: b */
    public final C3011k0 mo11040b() {
        return new C3011k0(this, (C3008j0) null);
    }
}
