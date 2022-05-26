package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.C0346c;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C2964w;
import com.google.android.gms.ads.internal.overlay.C2966y;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.common.util.C3369n;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class b42 implements k22<rg1> {

    /* renamed from: a */
    private final Context f14313a;

    /* renamed from: b */
    private final ph1 f14314b;

    /* renamed from: c */
    private final Executor f14315c;

    /* renamed from: d */
    private final ap2 f14316d;

    public b42(Context context, Executor executor, ph1 ph1, ap2 ap2) {
        this.f14313a = context;
        this.f14314b = ph1;
        this.f14315c = executor;
        this.f14316d = ap2;
    }

    /* renamed from: d */
    private static String m21085d(bp2 bp2) {
        try {
            return bp2.f14668w.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo15700a(np2 np2, bp2 bp2) {
        return (this.f14313a instanceof Activity) && C3369n.m14469a() && p00.m28808g(this.f14313a) && !TextUtils.isEmpty(m21085d(bp2));
    }

    /* renamed from: b */
    public final d93<rg1> mo15701b(np2 np2, bp2 bp2) {
        String d = m21085d(bp2);
        return s83.m30612n(s83.m30607i(null), new a42(this, d != null ? Uri.parse(d) : null, np2, bp2), this.f14315c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ d93 mo16046c(Uri uri, np2 np2, bp2 bp2, Object obj) throws Exception {
        try {
            C0346c a = new C0346c.C0347a().mo2276a();
            a.f1502a.setData(uri);
            zzc zzc = new zzc(a.f1502a, (C2964w) null);
            mm0 mm0 = new mm0();
            sg1 c = this.f14314b.mo20274c(new w41(np2, bp2, (String) null), new wg1(new z32(mm0), (pr0) null));
            mm0.mo19449c(new AdOverlayInfoParcel(zzc, (C5497qt) null, c.mo19287h(), (C2966y) null, new zzcjf(0, 0, false, false, false), (pr0) null, (yf1) null));
            this.f14316d.mo15919a();
            return s83.m30607i(c.mo19288i());
        } catch (Throwable th) {
            ul0.m31860e("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
