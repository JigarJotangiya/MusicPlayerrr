package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gs */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public enum C5126gs implements sm3 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);
    
    private final int zzi;

    private C5126gs(int i) {
        this.zzi = i;
    }

    public static C5126gs zzb(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return CONNECTING;
        }
        if (i == 2) {
            return CONNECTED;
        }
        if (i == 3) {
            return DISCONNECTING;
        }
        if (i == 4) {
            return DISCONNECTED;
        }
        if (i != 5) {
            return null;
        }
        return SUSPENDED;
    }

    public static tm3 zzc() {
        return C5089fs.f16744a;
    }

    public final String toString() {
        return Integer.toString(this.zzi);
    }

    public final int zza() {
        return this.zzi;
    }
}
