package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.C2921g;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yp2 {
    /* renamed from: a */
    public static zzbfi m34266a(Context context, List<cp2> list) {
        ArrayList arrayList = new ArrayList();
        for (cp2 next : list) {
            if (next.f15119c) {
                arrayList.add(C2921g.f9800p);
            } else {
                arrayList.add(new C2921g(next.f15117a, next.f15118b));
            }
        }
        return new zzbfi(context, (C2921g[]) arrayList.toArray(new C2921g[arrayList.size()]));
    }

    /* renamed from: b */
    public static cp2 m34267b(List<cp2> list, cp2 cp2) {
        return list.get(0);
    }

    /* renamed from: c */
    public static cp2 m34268c(zzbfi zzbfi) {
        return zzbfi.f27223o ? new cp2(-3, 0, true) : new cp2(zzbfi.f27219k, zzbfi.f27216h, false);
    }
}
