package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hv2 extends qm3<hv2, ev2> implements ao3 {
    /* access modifiers changed from: private */
    public static final hv2 zzb;
    /* access modifiers changed from: private */
    public ym3<gv2> zze = qm3.m29612p();

    static {
        hv2 hv2 = new hv2();
        zzb = hv2;
        qm3.m29616t(hv2.class, hv2);
    }

    private hv2() {
    }

    /* renamed from: E */
    public static ev2 m24928E() {
        return (ev2) zzb.mo20477v();
    }

    /* renamed from: H */
    static /* synthetic */ void m24931H(hv2 hv2, gv2 gv2) {
        gv2.getClass();
        ym3<gv2> ym3 = hv2.zze;
        if (!ym3.mo21839b()) {
            hv2.zze = qm3.m29613q(ym3);
        }
        hv2.zze.add(gv2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", gv2.class});
        } else if (i2 == 3) {
            return new hv2();
        } else {
            if (i2 == 4) {
                return new ev2((dv2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo18215D() {
        return this.zze.size();
    }
}
