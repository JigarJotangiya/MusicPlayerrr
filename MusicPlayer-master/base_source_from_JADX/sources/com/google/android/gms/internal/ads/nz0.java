package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.C2971s;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nz0 implements wy0 {

    /* renamed from: a */
    private final CookieManager f20770a;

    public nz0(Context context) {
        this.f20770a = C2971s.m13215r().mo11022l(context);
    }

    /* renamed from: a */
    public final void mo15988a(Map<String, String> map) {
        String str;
        if (this.f20770a != null) {
            if (map.get("clear") != null) {
                String str2 = (String) C5054ev.m23225c().mo20153b(C5503qz.f22649w0);
                String cookie = this.f20770a.getCookie(str2);
                if (cookie != null) {
                    List<String> f = b23.m21042c(f13.m23421b(';')).mo16018f(cookie);
                    int i = 0;
                    while (i < f.size()) {
                        CookieManager cookieManager = this.f20770a;
                        Iterator<String> it = b23.m21042c(f13.m23421b('=')).mo16017d(f.get(i)).iterator();
                        Objects.requireNonNull(it);
                        if (it.hasNext()) {
                            String valueOf = String.valueOf(it.next());
                            String valueOf2 = String.valueOf((String) C5054ev.m23225c().mo20153b(C5503qz.f22577n0));
                            if (valueOf2.length() != 0) {
                                str = valueOf.concat(valueOf2);
                            } else {
                                str = new String(valueOf);
                            }
                            cookieManager.setCookie(str2, str);
                            i++;
                        } else {
                            StringBuilder sb = new StringBuilder(91);
                            sb.append("position (0) must be less than the number of elements that remained (");
                            sb.append(0);
                            sb.append(")");
                            throw new IndexOutOfBoundsException(sb.toString());
                        }
                    }
                    return;
                }
                return;
            }
            String str3 = map.get("cookie");
            if (!TextUtils.isEmpty(str3)) {
                this.f20770a.setCookie((String) C5054ev.m23225c().mo20153b(C5503qz.f22649w0), str3);
            }
        }
    }
}
