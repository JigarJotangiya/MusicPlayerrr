package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class he3 extends qm3<he3, ge3> implements ao3 {
    /* access modifiers changed from: private */
    public static final he3 zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        he3 he3 = new he3();
        zzb = he3;
        qm3.m29616t(he3.class, he3);
    }

    private he3() {
    }

    /* renamed from: E */
    public static ge3 m24786E() {
        return (ge3) zzb.mo20477v();
    }

    /* renamed from: G */
    public static he3 m24788G() {
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
            return qm3.m29615s(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new he3();
        } else {
            if (i2 == 4) {
                return new ge3((fe3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo18134D() {
        return this.zze;
    }
}
