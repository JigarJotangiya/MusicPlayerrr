package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.C4955c6;
import com.google.android.gms.internal.ads.C4980cv;
import com.google.android.gms.internal.ads.C5054ev;
import com.google.android.gms.internal.ads.C5141h6;
import com.google.android.gms.internal.ads.C5178i6;
import com.google.android.gms.internal.ads.C5399o5;
import com.google.android.gms.internal.ads.C5437p6;
import com.google.android.gms.internal.ads.C5503qz;
import com.google.android.gms.internal.ads.C5547s5;
import com.google.android.gms.internal.ads.C5585t6;
import com.google.android.gms.internal.ads.C5622u6;
import com.google.android.gms.internal.ads.C5658v5;
import com.google.android.gms.internal.ads.h70;
import com.google.android.gms.internal.ads.nl0;
import java.io.File;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.ads.internal.util.d0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C2985d0 extends C5178i6 {

    /* renamed from: b */
    private final Context f10001b;

    private C2985d0(Context context, C5141h6 h6Var) {
        super(h6Var);
        this.f10001b = context;
    }

    /* renamed from: b */
    public static C5658v5 m13313b(Context context) {
        C5658v5 v5Var = new C5658v5(new C5437p6(new File(context.getCacheDir(), "admob_volley"), 20971520), new C2985d0(context, new C5622u6((C5585t6) null, (SSLSocketFactory) null)), 4);
        v5Var.mo21430d();
        return v5Var;
    }

    /* renamed from: a */
    public final C5399o5 mo11008a(C5547s5<?> s5Var) throws C4955c6 {
        String str;
        if (s5Var.zza() == 0) {
            if (Pattern.matches((String) C5054ev.m23225c().mo20153b(C5503qz.f22309D2), s5Var.mo20785r())) {
                C4980cv.m22123b();
                if (nl0.m27922n(this.f10001b, 13400000)) {
                    C5399o5 a = new h70(this.f10001b).mo11008a(s5Var);
                    if (a != null) {
                        String valueOf = String.valueOf(s5Var.mo20785r());
                        C3018m1.m13388k(valueOf.length() != 0 ? "Got gmscore asset response: ".concat(valueOf) : new String("Got gmscore asset response: "));
                        return a;
                    }
                    String valueOf2 = String.valueOf(s5Var.mo20785r());
                    if (valueOf2.length() != 0) {
                        str = "Failed to get gmscore asset response: ".concat(valueOf2);
                    } else {
                        str = new String("Failed to get gmscore asset response: ");
                    }
                    C3018m1.m13388k(str);
                }
            }
        }
        return super.mo11008a(s5Var);
    }
}
