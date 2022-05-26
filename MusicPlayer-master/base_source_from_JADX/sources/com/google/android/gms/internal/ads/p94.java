package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class p94 {

    /* renamed from: c */
    private static final Pattern f21376c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f21377a = -1;

    /* renamed from: b */
    public int f21378b = -1;

    /* renamed from: c */
    private final boolean m28951c(String str) {
        Matcher matcher = f21376c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i = wy2.f25579a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f21377a = parseInt;
            this.f21378b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo20242a() {
        return (this.f21377a == -1 || this.f21378b == -1) ? false : true;
    }

    /* renamed from: b */
    public final boolean mo20243b(zzdd zzdd) {
        for (int i = 0; i < zzdd.mo22581a(); i++) {
            zzdc b = zzdd.mo22582b(i);
            if (b instanceof zzzn) {
                zzzn zzzn = (zzzn) b;
                if ("iTunSMPB".equals(zzzn.f27463i) && m28951c(zzzn.f27464j)) {
                    return true;
                }
            } else if (b instanceof zzzw) {
                zzzw zzzw = (zzzw) b;
                if ("com.apple.iTunes".equals(zzzw.f27470h) && "iTunSMPB".equals(zzzw.f27471i) && m28951c(zzzw.f27472j)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
