package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ws0 {

    /* renamed from: a */
    private static final Pattern f25523a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* renamed from: b */
    private static final Pattern f25524b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    /* renamed from: a */
    public static String m33324a(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        Matcher matcher = f25523a.matcher(str);
        int i = 0;
        if (matcher.find()) {
            int end = matcher.end();
            sb.append(str.substring(0, end));
            while (i <= 0) {
                String str2 = strArr[i];
                if (str2 != null) {
                    sb.append(str2);
                }
                i++;
            }
            sb.append(str.substring(end));
        } else {
            if (!f25524b.matcher(str).find()) {
                while (i <= 0) {
                    String str3 = strArr[i];
                    if (str3 != null) {
                        sb.append(str3);
                    }
                    i++;
                }
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
