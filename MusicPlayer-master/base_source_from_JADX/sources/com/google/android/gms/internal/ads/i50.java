package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class i50 implements i13 {

    /* renamed from: a */
    public final /* synthetic */ String f17889a;

    public /* synthetic */ i50(String str) {
        this.f17889a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f17889a;
        String str2 = (String) obj;
        y50<pr0> y50 = x50.f25661a;
        if (str2 != null) {
            if (e10.f15825f.mo20989e().booleanValue()) {
                String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                String host = Uri.parse(str).getHost();
                int i = 0;
                while (true) {
                    if (i < 3) {
                        if (host.endsWith(strArr[i])) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            String e = e10.f15820a.mo20989e();
            String e2 = e10.f15821b.mo20989e();
            if (!TextUtils.isEmpty(e)) {
                str = str.replace(e, str2);
            }
            if (!TextUtils.isEmpty(e2)) {
                Uri parse = Uri.parse(str);
                if (TextUtils.isEmpty(parse.getQueryParameter(e2))) {
                    return parse.buildUpon().appendQueryParameter(e2, str2).toString();
                }
            }
        }
        return str;
    }
}
