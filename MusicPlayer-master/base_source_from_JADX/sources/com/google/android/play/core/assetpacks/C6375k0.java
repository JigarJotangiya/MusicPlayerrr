package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.k0 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6375k0 extends C6323b {

    /* renamed from: a */
    private final int f29538a;

    /* renamed from: b */
    private final String f29539b;

    /* renamed from: c */
    private final String f29540c;

    C6375k0(int i, String str, String str2) {
        this.f29538a = i;
        this.f29539b = str;
        this.f29540c = str2;
    }

    /* renamed from: a */
    public final String mo25215a() {
        return this.f29540c;
    }

    /* renamed from: b */
    public final int mo25216b() {
        return this.f29538a;
    }

    /* renamed from: c */
    public final String mo25217c() {
        return this.f29539b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r1 = r4.f29540c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f29539b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.play.core.assetpacks.C6323b
            r2 = 0
            if (r1 == 0) goto L_0x003f
            com.google.android.play.core.assetpacks.b r5 = (com.google.android.play.core.assetpacks.C6323b) r5
            int r1 = r4.f29538a
            int r3 = r5.mo25216b()
            if (r1 != r3) goto L_0x003f
            java.lang.String r1 = r4.f29539b
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = r5.mo25217c()
            if (r1 != 0) goto L_0x003f
            goto L_0x0028
        L_0x001e:
            java.lang.String r3 = r5.mo25217c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003f
        L_0x0028:
            java.lang.String r1 = r4.f29540c
            if (r1 != 0) goto L_0x0033
            java.lang.String r5 = r5.mo25215a()
            if (r5 != 0) goto L_0x003f
            goto L_0x003e
        L_0x0033:
            java.lang.String r5 = r5.mo25215a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            return r0
        L_0x003f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C6375k0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2 = (this.f29538a ^ 1000003) * 1000003;
        String str = this.f29539b;
        int i3 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i4 = (i2 ^ i) * 1000003;
        String str2 = this.f29540c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i4 ^ i3;
    }

    public final String toString() {
        int i = this.f29538a;
        String str = this.f29539b;
        String str2 = this.f29540c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(i);
        sb.append(", path=");
        sb.append(str);
        sb.append(", assetsPath=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
