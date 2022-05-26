package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zh3 extends qm3<zh3, wh3> implements ao3 {
    /* access modifiers changed from: private */
    public static final zh3 zzb;
    private int zze;
    private ym3<yh3> zzf = qm3.m29612p();

    static {
        zh3 zh3 = new zh3();
        zzb = zh3;
        qm3.m29616t(zh3.class, zh3);
    }

    private zh3() {
    }

    /* renamed from: G */
    public static zh3 m34618G(byte[] bArr, cm3 cm3) throws bn3 {
        return (zh3) qm3.m29606B(zzb, bArr, cm3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", yh3.class});
        } else if (i2 == 3) {
            return new zh3();
        } else {
            if (i2 == 4) {
                return new wh3((vh3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo22367D() {
        return this.zzf.size();
    }

    /* renamed from: E */
    public final int mo22368E() {
        return this.zze;
    }

    /* renamed from: H */
    public final List<yh3> mo22369H() {
        return this.zzf;
    }
}
