package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.n0 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6390n0 extends C6358g3 {

    /* renamed from: a */
    private final int f29583a;

    /* renamed from: b */
    private final String f29584b;

    /* renamed from: c */
    private final long f29585c;

    /* renamed from: d */
    private final long f29586d;

    /* renamed from: e */
    private final int f29587e;

    C6390n0(int i, String str, long j, long j2, int i2) {
        this.f29583a = i;
        this.f29584b = str;
        this.f29585c = j;
        this.f29586d = j2;
        this.f29587e = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo25268a() {
        return this.f29583a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo25269b() {
        return this.f29587e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final long mo25270c() {
        return this.f29585c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final long mo25271d() {
        return this.f29586d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final String mo25272e() {
        return this.f29584b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r7.f29584b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.android.play.core.assetpacks.C6358g3
            r2 = 0
            if (r1 == 0) goto L_0x0046
            com.google.android.play.core.assetpacks.g3 r8 = (com.google.android.play.core.assetpacks.C6358g3) r8
            int r1 = r7.f29583a
            int r3 = r8.mo25268a()
            if (r1 != r3) goto L_0x0046
            java.lang.String r1 = r7.f29584b
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = r8.mo25272e()
            if (r1 != 0) goto L_0x0046
            goto L_0x0029
        L_0x001e:
            java.lang.String r3 = r8.mo25272e()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0029
            goto L_0x0046
        L_0x0029:
            long r3 = r7.f29585c
            long r5 = r8.mo25270c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0046
            long r3 = r7.f29586d
            long r5 = r8.mo25271d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0046
            int r1 = r7.f29587e
            int r8 = r8.mo25269b()
            if (r1 != r8) goto L_0x0046
            return r0
        L_0x0046:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C6390n0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = (this.f29583a ^ 1000003) * 1000003;
        String str = this.f29584b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f29585c;
        long j2 = this.f29586d;
        return ((((((i ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f29587e;
    }

    public final String toString() {
        int i = this.f29583a;
        String str = this.f29584b;
        long j = this.f29585c;
        long j2 = this.f29586d;
        int i2 = this.f29587e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i);
        sb.append(", filePath=");
        sb.append(str);
        sb.append(", fileOffset=");
        sb.append(j);
        sb.append(", remainingBytes=");
        sb.append(j2);
        sb.append(", previousChunk=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
