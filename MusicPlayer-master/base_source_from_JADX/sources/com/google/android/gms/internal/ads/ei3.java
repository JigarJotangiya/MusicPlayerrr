package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ei3 extends qm3<ei3, bi3> implements ao3 {
    /* access modifiers changed from: private */
    public static final ei3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private ym3<di3> zzf = qm3.m29612p();

    static {
        ei3 ei3 = new ei3();
        zzb = ei3;
        qm3.m29616t(ei3.class, ei3);
    }

    private ei3() {
    }

    /* renamed from: D */
    public static bi3 m23007D() {
        return (bi3) zzb.mo20477v();
    }

    /* renamed from: G */
    static /* synthetic */ void m23010G(ei3 ei3, di3 di3) {
        di3.getClass();
        ym3<di3> ym3 = ei3.zzf;
        if (!ym3.mo21839b()) {
            ei3.zzf = qm3.m29613q(ym3);
        }
        ei3.zzf.add(di3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", di3.class});
        } else if (i2 == 3) {
            return new ei3();
        } else {
            if (i2 == 4) {
                return new bi3((ai3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
