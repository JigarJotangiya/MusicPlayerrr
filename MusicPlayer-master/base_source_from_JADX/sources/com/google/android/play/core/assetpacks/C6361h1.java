package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.h1 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6361h1 extends RuntimeException {
    final int zza;

    C6361h1(String str) {
        super(str);
        this.zza = -1;
    }

    C6361h1(String str, int i) {
        super(str);
        this.zza = i;
    }

    C6361h1(String str, Exception exc) {
        super(str, exc);
        this.zza = -1;
    }

    C6361h1(String str, Exception exc, int i) {
        super(str, exc);
        this.zza = i;
    }
}
