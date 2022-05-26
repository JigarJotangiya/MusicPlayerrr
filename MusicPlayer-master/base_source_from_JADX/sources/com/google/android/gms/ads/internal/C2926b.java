package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.internal.ads.zi0;
import com.google.android.gms.internal.ads.zzcde;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.ads.internal.b */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C2926b {

    /* renamed from: a */
    private final Context f9815a;

    /* renamed from: b */
    private boolean f9816b;

    /* renamed from: c */
    private final zi0 f9817c;

    /* renamed from: d */
    private final zzcde f9818d = new zzcde(false, Collections.emptyList());

    public C2926b(Context context, zi0 zi0, zzcde zzcde) {
        this.f9815a = context;
        this.f9817c = zi0;
    }

    /* renamed from: d */
    private final boolean m13048d() {
        zi0 zi0 = this.f9817c;
        return (zi0 != null && zi0.zza().f27369l) || this.f9818d.f27343g;
    }

    /* renamed from: a */
    public final void mo10827a() {
        this.f9816b = true;
    }

    /* renamed from: b */
    public final void mo10828b(String str) {
        List<String> list;
        if (m13048d()) {
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            zi0 zi0 = this.f9817c;
            if (zi0 != null) {
                zi0.mo21065a(str, (Map<String, String>) null, 3);
                return;
            }
            zzcde zzcde = this.f9818d;
            if (zzcde.f27343g && (list = zzcde.f27344h) != null) {
                for (String next : list) {
                    if (!TextUtils.isEmpty(next)) {
                        String replace = next.replace("{NAVIGATION_URL}", Uri.encode(str));
                        C2971s.m13214q();
                        C2979b2.m13267o(this.f9815a, BuildConfig.FLAVOR, replace);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final boolean mo10829c() {
        return !m13048d() || this.f9816b;
    }
}
