package com.google.android.play.core.assetpacks;

import java.util.Arrays;

/* renamed from: com.google.android.play.core.assetpacks.o0 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6395o0 extends C6393n3 {

    /* renamed from: a */
    private final String f29591a;

    /* renamed from: b */
    private final long f29592b;

    /* renamed from: c */
    private final int f29593c;

    /* renamed from: d */
    private final boolean f29594d;

    /* renamed from: e */
    private final boolean f29595e;

    /* renamed from: f */
    private final byte[] f29596f;

    C6395o0(String str, long j, int i, boolean z, boolean z2, byte[] bArr) {
        this.f29591a = str;
        this.f29592b = j;
        this.f29593c = i;
        this.f29594d = z;
        this.f29595e = z2;
        this.f29596f = bArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo25337a() {
        return this.f29593c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo25338b() {
        return this.f29592b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo25339c() {
        return this.f29591a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo25340d() {
        return this.f29595e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo25341e() {
        return this.f29594d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6393n3) {
            C6393n3 n3Var = (C6393n3) obj;
            String str = this.f29591a;
            if (str != null ? str.equals(n3Var.mo25339c()) : n3Var.mo25339c() == null) {
                if (this.f29592b == n3Var.mo25338b() && this.f29593c == n3Var.mo25337a() && this.f29594d == n3Var.mo25341e() && this.f29595e == n3Var.mo25340d()) {
                    if (Arrays.equals(this.f29596f, n3Var instanceof C6395o0 ? ((C6395o0) n3Var).f29596f : n3Var.mo25342f())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final byte[] mo25342f() {
        return this.f29596f;
    }

    public final int hashCode() {
        int i;
        String str = this.f29591a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        long j = this.f29592b;
        int i2 = 1237;
        int i3 = (((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f29593c) * 1000003) ^ (true != this.f29594d ? 1237 : 1231)) * 1000003;
        if (true == this.f29595e) {
            i2 = 1231;
        }
        return ((i3 ^ i2) * 1000003) ^ Arrays.hashCode(this.f29596f);
    }

    public final String toString() {
        String str = this.f29591a;
        long j = this.f29592b;
        int i = this.f29593c;
        boolean z = this.f29594d;
        boolean z2 = this.f29595e;
        String arrays = Arrays.toString(this.f29596f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(arrays).length());
        sb.append("ZipEntry{name=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j);
        sb.append(", compressionMethod=");
        sb.append(i);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        sb.append(", headerBytes=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
