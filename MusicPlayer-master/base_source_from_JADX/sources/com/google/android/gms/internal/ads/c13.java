package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class c13 extends b13 {

    /* renamed from: a */
    private final char f14777a;

    c13(char c) {
        this.f14777a = c;
    }

    /* renamed from: a */
    public final boolean mo16456a(char c) {
        return c == this.f14777a;
    }

    public final String toString() {
        int i = this.f14777a;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        StringBuilder sb = new StringBuilder(String.valueOf(copyValueOf).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(copyValueOf);
        sb.append("')");
        return sb.toString();
    }
}
