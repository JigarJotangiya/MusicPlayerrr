package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class lr3 extends qr3 {

    /* renamed from: a */
    final String f19516a;

    public lr3(String str) {
        this.f19516a = str;
    }

    /* renamed from: a */
    public final void mo19279a(String str) {
        String str2 = this.f19516a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
