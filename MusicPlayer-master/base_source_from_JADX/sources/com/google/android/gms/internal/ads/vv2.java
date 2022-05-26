package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vv2 {

    /* renamed from: a */
    private final cw2 f25025a;

    /* renamed from: b */
    private final cw2 f25026b;

    /* renamed from: c */
    private final zv2 f25027c;

    /* renamed from: d */
    private final bw2 f25028d;

    private vv2(zv2 zv2, bw2 bw2, cw2 cw2, cw2 cw22, boolean z) {
        this.f25027c = zv2;
        this.f25028d = bw2;
        this.f25025a = cw2;
        if (cw22 == null) {
            this.f25026b = cw2.NONE;
        } else {
            this.f25026b = cw22;
        }
    }

    /* renamed from: a */
    public static vv2 m32723a(zv2 zv2, bw2 bw2, cw2 cw2, cw2 cw22, boolean z) {
        dx2.m22729b(bw2, "ImpressionType is null");
        dx2.m22729b(cw2, "Impression owner is null");
        if (cw2 == cw2.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (zv2 == zv2.DEFINED_BY_JAVASCRIPT && cw2 == cw2.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (bw2 != bw2.DEFINED_BY_JAVASCRIPT || cw2 != cw2.NATIVE) {
            return new vv2(zv2, bw2, cw2, cw22, true);
        } else {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    /* renamed from: b */
    public final JSONObject mo21603b() {
        JSONObject jSONObject = new JSONObject();
        bx2.m21586g(jSONObject, "impressionOwner", this.f25025a);
        if (this.f25028d != null) {
            bx2.m21586g(jSONObject, "mediaEventsOwner", this.f25026b);
            bx2.m21586g(jSONObject, "creativeType", this.f25027c);
            bx2.m21586g(jSONObject, "impressionType", this.f25028d);
        } else {
            bx2.m21586g(jSONObject, "videoEventsOwner", this.f25026b);
        }
        bx2.m21586g(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}
