package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C2971s;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class ld2 implements Callable {
    public /* synthetic */ ld2(md2 md2) {
    }

    public final Object call() {
        String str;
        String str2;
        String str3;
        C2971s.m13214q();
        C5788yn c = C2971s.m13213p().mo17562h().mo11086c();
        Bundle bundle = null;
        if (c != null && (!C2971s.m13213p().mo17562h().mo11067K() || !C2971s.m13213p().mo17562h().mo11100s())) {
            if (c.mo22264h()) {
                c.mo22263g();
            }
            C5417on a = c.mo22257a();
            if (a != null) {
                str2 = a.mo20035d();
                str = a.mo20036e();
                str3 = a.mo20038f();
                if (str2 != null) {
                    C2971s.m13213p().mo17562h().mo11078W(str2);
                }
                if (str3 != null) {
                    C2971s.m13213p().mo17562h().mo11068M(str3);
                }
            } else {
                str2 = C2971s.m13213p().mo17562h().mo11093g();
                str3 = C2971s.m13213p().mo17562h().mo11094h();
                str = null;
            }
            Bundle bundle2 = new Bundle(1);
            if (!C2971s.m13213p().mo17562h().mo11100s()) {
                if (str3 == null || TextUtils.isEmpty(str3)) {
                    bundle2.putString("v_fp_vertical", "no_hash");
                } else {
                    bundle2.putString("v_fp_vertical", str3);
                }
            }
            if (str2 != null && !C2971s.m13213p().mo17562h().mo11067K()) {
                bundle2.putString("fingerprint", str2);
                if (!str2.equals(str)) {
                    bundle2.putString("v_fp", str);
                }
            }
            if (!bundle2.isEmpty()) {
                bundle = bundle2;
            }
        }
        return new nd2(bundle);
    }
}
