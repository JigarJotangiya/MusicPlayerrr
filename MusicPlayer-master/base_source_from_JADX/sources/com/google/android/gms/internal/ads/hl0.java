package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hl0 {

    /* renamed from: a */
    private BigInteger f17695a = BigInteger.ONE;

    /* renamed from: b */
    private String f17696b = "0";

    /* renamed from: a */
    public final synchronized String mo18166a() {
        String bigInteger;
        bigInteger = this.f17695a.toString();
        this.f17695a = this.f17695a.add(BigInteger.ONE);
        this.f17696b = bigInteger;
        return bigInteger;
    }

    /* renamed from: b */
    public final synchronized String mo18167b() {
        return this.f17696b;
    }
}
