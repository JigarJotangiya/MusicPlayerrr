package com.google.android.play.core.assetpacks.p250d;

/* renamed from: com.google.android.play.core.assetpacks.d.b */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C6336b {
    /* renamed from: a */
    public static String m37592a(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    public static String m37593b(String str, String str2, String str3) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        sb.append(":");
        sb.append(str3);
        return sb.toString();
    }
}
