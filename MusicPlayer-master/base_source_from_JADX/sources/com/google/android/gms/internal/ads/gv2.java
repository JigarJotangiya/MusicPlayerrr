package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gv2 extends qm3<gv2, fv2> implements ao3 {
    /* access modifiers changed from: private */
    public static final gv2 zzb;
    private cv2 zze;

    static {
        gv2 gv2 = new gv2();
        zzb = gv2;
        qm3.m29616t(gv2.class, gv2);
    }

    private gv2() {
    }

    /* renamed from: D */
    public static fv2 m24558D() {
        return (fv2) zzb.mo20477v();
    }

    /* renamed from: F */
    static /* synthetic */ void m24560F(gv2 gv2, cv2 cv2) {
        cv2.getClass();
        gv2.zze = cv2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new gv2();
        } else {
            if (i2 == 4) {
                return new fv2((dv2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
