package com.google.android.play.core.install;

import com.google.android.play.core.install.p251c.C6462a;
import p159f.p243f.p245b.p318c.p319a.p323d.C7644q;

/* renamed from: com.google.android.play.core.install.a */
/* compiled from: com.google.android.play:core@@1.10.2 */
public class C6460a extends C7644q {
    private final int zza;

    public C6460a(int i) {
        super(String.format("Install Error(%d): %s", new Object[]{Integer.valueOf(i), C6462a.m37837a(i)}));
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
