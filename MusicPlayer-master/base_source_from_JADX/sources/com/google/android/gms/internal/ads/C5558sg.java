package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.sg */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5558sg {

    /* renamed from: c */
    private static final Pattern f23438c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f23439a = -1;

    /* renamed from: b */
    public int f23440b = -1;

    /* renamed from: a */
    public final boolean mo20842a() {
        return (this.f23439a == -1 || this.f23440b == -1) ? false : true;
    }

    /* renamed from: b */
    public final boolean mo20843b(zzatr zzatr) {
        for (int i = 0; i < zzatr.mo22501a(); i++) {
            zzatq b = zzatr.mo22502b(i);
            if (b instanceof zzatv) {
                zzatv zzatv = (zzatv) b;
                String str = zzatv.f27155i;
                String str2 = zzatv.f27156j;
                if (!"iTunSMPB".equals(str)) {
                    continue;
                } else {
                    Matcher matcher = f23438c.matcher(str2);
                    if (matcher.find()) {
                        try {
                            int parseInt = Integer.parseInt(matcher.group(1), 16);
                            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                            if (parseInt > 0 || parseInt2 > 0) {
                                this.f23439a = parseInt;
                                this.f23440b = parseInt2;
                                return true;
                            }
                        } catch (NumberFormatException unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
    }
}
