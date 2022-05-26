package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class a13 {
    /* renamed from: a */
    public static String m20554a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m20558e(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m20558e(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: b */
    public static String m20555b(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m20557d(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m20557d(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: c */
    public static boolean m20556c(CharSequence charSequence, CharSequence charSequence2) {
        int f;
        int length = "content-length".length();
        if (charSequence2 == "content-length") {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = "content-length".charAt(i);
            char charAt2 = charSequence2.charAt(i);
            if (charAt != charAt2 && ((f = m20559f(charAt)) >= 26 || f != m20559f(charAt2))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m20557d(char c) {
        return c >= 'a' && c <= 'z';
    }

    /* renamed from: e */
    public static boolean m20558e(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* renamed from: f */
    private static int m20559f(char c) {
        return (char) ((c | ' ') - 'a');
    }
}
