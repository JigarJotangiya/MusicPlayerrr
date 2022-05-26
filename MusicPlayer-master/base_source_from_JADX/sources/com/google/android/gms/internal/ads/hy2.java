package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class hy2 extends ey2 {

    /* renamed from: a */
    private String f17788a;

    /* renamed from: b */
    private Boolean f17789b;

    /* renamed from: c */
    private Boolean f17790c;

    hy2() {
    }

    /* renamed from: a */
    public final ey2 mo17432a(String str) {
        Objects.requireNonNull(str, "Null clientVersion");
        this.f17788a = str;
        return this;
    }

    /* renamed from: b */
    public final ey2 mo17433b(boolean z) {
        this.f17790c = Boolean.TRUE;
        return this;
    }

    /* renamed from: c */
    public final ey2 mo17434c(boolean z) {
        this.f17789b = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: d */
    public final fy2 mo17435d() {
        Boolean bool;
        String str = this.f17788a;
        if (str != null && (bool = this.f17789b) != null && this.f17790c != null) {
            return new jy2(str, bool.booleanValue(), this.f17790c.booleanValue(), (iy2) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f17788a == null) {
            sb.append(" clientVersion");
        }
        if (this.f17789b == null) {
            sb.append(" shouldGetAdvertisingId");
        }
        if (this.f17790c == null) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
