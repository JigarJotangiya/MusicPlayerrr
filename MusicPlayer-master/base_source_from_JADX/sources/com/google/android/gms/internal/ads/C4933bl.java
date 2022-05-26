package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.bl */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class C4933bl extends IOException {
    public final C5747xk zza;

    public C4933bl(IOException iOException, C5747xk xkVar, int i) {
        super(iOException);
        this.zza = xkVar;
    }

    public C4933bl(String str, C5747xk xkVar, int i) {
        super(str);
        this.zza = xkVar;
    }

    public C4933bl(String str, IOException iOException, C5747xk xkVar, int i) {
        super(str, iOException);
        this.zza = xkVar;
    }
}
