package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gq2 {

    /* renamed from: a */
    private final Pattern f17230a;

    public gq2() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) C5054ev.m23225c().mo20153b(C5503qz.f22335G4));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.f17230a = pattern;
    }

    /* renamed from: a */
    public final String mo18005a(String str) {
        Pattern pattern = this.f17230a;
        if (!(pattern == null || str == null)) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}
