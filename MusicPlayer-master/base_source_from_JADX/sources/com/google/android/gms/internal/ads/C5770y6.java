package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.y6 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class C5770y6 extends C5547s5<String> {

    /* renamed from: s */
    private final Object f26275s = new Object();

    /* renamed from: t */
    private final C5732x5<String> f26276t;

    public C5770y6(int i, String str, C5732x5<String> x5Var, C5695w5 w5Var) {
        super(i, str, w5Var);
        this.f26276t = x5Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo11057G(String str) {
        C5732x5<String> x5Var;
        synchronized (this.f26275s) {
            x5Var = this.f26276t;
        }
        x5Var.mo11064b(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final C5769y5<String> mo11106o(C5399o5 o5Var) {
        String str;
        try {
            byte[] bArr = o5Var.f20922b;
            Map<String, String> map = o5Var.f20923c;
            String str2 = "ISO-8859-1";
            if (map != null) {
                String str3 = map.get("Content-Type");
                if (str3 != null) {
                    String[] split = str3.split(";", 0);
                    int i = 1;
                    while (true) {
                        if (i >= split.length) {
                            break;
                        }
                        String[] split2 = split[i].trim().split("=", 0);
                        if (split2.length == 2 && split2[0].equals("charset")) {
                            str2 = split2[1];
                            break;
                        }
                        i++;
                    }
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(o5Var.f20922b);
        }
        return C5769y5.m34034b(str, C5474q6.m29372b(o5Var));
    }
}
