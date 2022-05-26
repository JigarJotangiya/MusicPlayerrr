package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jz0 implements wy0 {

    /* renamed from: a */
    private final ap2 f18686a;

    public jz0(ap2 ap2) {
        this.f18686a = ap2;
    }

    /* renamed from: a */
    public final void mo15988a(Map<String, String> map) {
        String str = map.get("render_in_browser");
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f18686a.mo15920b(Boolean.parseBoolean(str));
            } catch (Exception unused) {
                throw new IllegalStateException("Invalid render_in_browser state");
            }
        }
    }
}
