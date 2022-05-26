package com.google.android.gms.internal.ads;

import java.util.List;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vi3 extends qm3<vi3, ui3> implements ao3 {
    /* access modifiers changed from: private */
    public static final vi3 zzb;
    private String zze = BuildConfig.FLAVOR;
    private ym3<uh3> zzf = qm3.m29612p();

    static {
        vi3 vi3 = new vi3();
        zzb = vi3;
        qm3.m29616t(vi3.class, vi3);
    }

    private vi3() {
    }

    /* renamed from: E */
    public static vi3 m32391E() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", uh3.class});
        } else if (i2 == 3) {
            return new vi3();
        } else {
            if (i2 == 4) {
                return new ui3((ti3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final List<uh3> mo21511F() {
        return this.zzf;
    }
}
