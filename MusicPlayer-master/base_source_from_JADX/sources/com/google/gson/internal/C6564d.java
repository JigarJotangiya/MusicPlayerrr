package com.google.gson.internal;

/* renamed from: com.google.gson.internal.d */
/* compiled from: JavaVersion */
public final class C6564d {

    /* renamed from: a */
    private static final int f29922a = m38007a();

    /* renamed from: a */
    private static int m38007a() {
        return m38010d(System.getProperty("java.version"));
    }

    /* renamed from: b */
    private static int m38008b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static int m38009c() {
        return f29922a;
    }

    /* renamed from: d */
    static int m38010d(String str) {
        int f = m38012f(str);
        if (f == -1) {
            f = m38008b(str);
        }
        if (f == -1) {
            return 6;
        }
        return f;
    }

    /* renamed from: e */
    public static boolean m38011e() {
        return f29922a >= 9;
    }

    /* renamed from: f */
    private static int m38012f(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
