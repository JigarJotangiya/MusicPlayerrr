package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.p250d.C6335a;
import p159f.p243f.p245b.p318c.p319a.p323d.C7644q;

/* renamed from: com.google.android.play.core.assetpacks.a */
/* compiled from: com.google.android.play:core@@1.10.2 */
public class C6317a extends C7644q {
    private final int zza;

    C6317a(int i) {
        super(String.format("Asset Pack Download Error(%d): %s", new Object[]{Integer.valueOf(i), C6335a.m37591a(i)}));
        if (i != 0) {
            this.zza = i;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }

    public int getErrorCode() {
        return this.zza;
    }
}
