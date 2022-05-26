package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class s10 {

    /* renamed from: a */
    public static final t00<Boolean> f23294a = t00.m31013d("gads:always_collect_trustless_token_at_native_side", true);

    /* renamed from: b */
    public static final t00<Long> f23295b = t00.m31011b("gads:timeout_for_trustless_token:millis", 2000);

    static {
        t00.m31013d("gms:expose_token_for_gma:enabled", true);
        t00.m31011b("gads:cached_token:ttl_millis", 10800000);
    }
}
