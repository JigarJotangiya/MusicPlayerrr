package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class n64 extends n81 {

    /* renamed from: e */
    private final Resources f20524e;

    /* renamed from: f */
    private final String f20525f;

    /* renamed from: g */
    private Uri f20526g;

    /* renamed from: h */
    private AssetFileDescriptor f20527h;

    /* renamed from: i */
    private InputStream f20528i;

    /* renamed from: j */
    private long f20529j;

    /* renamed from: k */
    private boolean f20530k;

    public n64(Context context) {
        super(false);
        this.f20524e = context.getResources();
        this.f20525f = context.getPackageName();
    }

    /* renamed from: c */
    public final int mo15695c(byte[] bArr, int i, int i2) throws m64 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f20529j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new m64((String) null, e, 2000);
            }
        }
        InputStream inputStream = this.f20528i;
        int i3 = wy2.f25579a;
        int read = inputStream.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f20529j;
            if (j2 != -1) {
                this.f20529j = j2 - ((long) read);
            }
            mo19649n(read);
            return read;
        } else if (this.f20529j == -1) {
            return -1;
        } else {
            throw new m64("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
    }

    /* renamed from: g */
    public final Uri mo15696g() {
        return this.f20526g;
    }

    /* renamed from: h */
    public final void mo15697h() throws m64 {
        this.f20526g = null;
        try {
            InputStream inputStream = this.f20528i;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f20528i = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f20527h;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f20527h = null;
                if (this.f20530k) {
                    this.f20530k = false;
                    mo19650o();
                }
            } catch (IOException e) {
                throw new m64((String) null, e, 2000);
            } catch (Throwable th) {
                this.f20527h = null;
                if (this.f20530k) {
                    this.f20530k = false;
                    mo19650o();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new m64((String) null, e2, 2000);
        } catch (Throwable th2) {
            this.f20528i = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f20527h;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f20527h = null;
                if (this.f20530k) {
                    this.f20530k = false;
                    mo19650o();
                }
                throw th2;
            } catch (IOException e3) {
                throw new m64((String) null, e3, 2000);
            } catch (Throwable th3) {
                this.f20527h = null;
                if (this.f20530k) {
                    this.f20530k = false;
                    mo19650o();
                }
                throw th3;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
        if (r3.matches("\\d+") != false) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0165  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo15698m(com.google.android.gms.internal.ads.uf1 r18) throws com.google.android.gms.internal.ads.m64 {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            android.net.Uri r2 = r0.f24320a
            r1.f20526g = r2
            java.lang.String r3 = r2.getScheme()
            java.lang.String r4 = "rawresource"
            boolean r3 = android.text.TextUtils.equals(r4, r3)
            r4 = 2005(0x7d5, float:2.81E-42)
            r5 = 1004(0x3ec, float:1.407E-42)
            r6 = 1
            r7 = 0
            if (r3 != 0) goto L_0x00a9
            java.lang.String r3 = r2.getScheme()
            java.lang.String r8 = "android.resource"
            boolean r3 = android.text.TextUtils.equals(r8, r3)
            if (r3 == 0) goto L_0x0040
            java.util.List r3 = r2.getPathSegments()
            int r3 = r3.size()
            if (r3 != r6) goto L_0x0040
            java.lang.String r3 = r2.getLastPathSegment()
            java.util.Objects.requireNonNull(r3)
            java.lang.String r9 = "\\d+"
            boolean r3 = r3.matches(r9)
            if (r3 == 0) goto L_0x0040
            goto L_0x00a9
        L_0x0040:
            java.lang.String r3 = r2.getScheme()
            boolean r3 = android.text.TextUtils.equals(r8, r3)
            if (r3 == 0) goto L_0x00a1
            java.lang.String r3 = r2.getPath()
            java.util.Objects.requireNonNull(r3)
            java.lang.String r5 = "/"
            boolean r5 = r3.startsWith(r5)
            if (r5 == 0) goto L_0x005d
            java.lang.String r3 = r3.substring(r6)
        L_0x005d:
            java.lang.String r5 = r2.getHost()
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            if (r8 == 0) goto L_0x006a
            java.lang.String r5 = ""
            goto L_0x0074
        L_0x006a:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r8 = ":"
            java.lang.String r5 = r5.concat(r8)
        L_0x0074:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r8 = r3.length()
            if (r8 == 0) goto L_0x0087
            java.lang.String r3 = r5.concat(r3)
            goto L_0x008c
        L_0x0087:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r5)
        L_0x008c:
            android.content.res.Resources r5 = r1.f20524e
            java.lang.String r8 = r1.f20525f
            java.lang.String r9 = "raw"
            int r3 = r5.getIdentifier(r3, r9, r8)
            if (r3 == 0) goto L_0x0099
            goto L_0x00b4
        L_0x0099:
            com.google.android.gms.internal.ads.m64 r0 = new com.google.android.gms.internal.ads.m64
            java.lang.String r2 = "Resource not found."
            r0.<init>(r2, r7, r4)
            throw r0
        L_0x00a1:
            com.google.android.gms.internal.ads.m64 r0 = new com.google.android.gms.internal.ads.m64
            java.lang.String r2 = "URI must either use scheme rawresource or android.resource"
            r0.<init>(r2, r7, r5)
            throw r0
        L_0x00a9:
            java.lang.String r3 = r2.getLastPathSegment()     // Catch:{ NumberFormatException -> 0x0189 }
            java.util.Objects.requireNonNull(r3)
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0189 }
        L_0x00b4:
            r17.mo19651p(r18)
            android.content.res.Resources r5 = r1.f20524e     // Catch:{ NotFoundException -> 0x0182 }
            android.content.res.AssetFileDescriptor r3 = r5.openRawResourceFd(r3)     // Catch:{ NotFoundException -> 0x0182 }
            r1.f20527h = r3
            if (r3 == 0) goto L_0x0165
            long r8 = r3.getLength()
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.FileDescriptor r5 = r3.getFileDescriptor()
            r2.<init>(r5)
            r1.f20528i = r2
            r5 = 2008(0x7d8, float:2.814E-42)
            r10 = -1
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x00e5
            long r13 = r0.f24325f     // Catch:{ m64 -> 0x0163, IOException -> 0x015a }
            int r15 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r15 > 0) goto L_0x00df
            goto L_0x00e5
        L_0x00df:
            com.google.android.gms.internal.ads.m64 r0 = new com.google.android.gms.internal.ads.m64     // Catch:{ m64 -> 0x0163, IOException -> 0x015a }
            r0.<init>(r7, r7, r5)     // Catch:{ m64 -> 0x0163, IOException -> 0x015a }
            throw r0     // Catch:{ m64 -> 0x0163, IOException -> 0x015a }
        L_0x00e5:
            long r13 = r3.getStartOffset()     // Catch:{ m64 -> 0x0163, IOException -> 0x015a }
            long r4 = r0.f24325f     // Catch:{ m64 -> 0x0163, IOException -> 0x015a }
            long r4 = r4 + r13
            long r4 = r2.skip(r4)     // Catch:{ m64 -> 0x0163, IOException -> 0x015a }
            long r4 = r4 - r13
            long r13 = r0.f24325f     // Catch:{ m64 -> 0x0163, IOException -> 0x015a }
            int r16 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r16 != 0) goto L_0x0152
            r13 = 0
            if (r12 != 0) goto L_0x0123
            java.nio.channels.FileChannel r2 = r2.getChannel()     // Catch:{ m64 -> 0x0163, IOException -> 0x015a }
            long r4 = r2.size()     // Catch:{ m64 -> 0x0163, IOException -> 0x015a }
            int r8 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r8 != 0) goto L_0x010b
            r1.f20529j = r10     // Catch:{ m64 -> 0x0163, IOException -> 0x015a }
            r4 = r10
            goto L_0x012b
        L_0x010b:
            long r4 = r2.size()     // Catch:{ m64 -> 0x0163, IOException -> 0x015a }
            long r8 = r2.position()     // Catch:{ m64 -> 0x0163, IOException -> 0x015a }
            long r4 = r4 - r8
            r1.f20529j = r4     // Catch:{ m64 -> 0x0163, IOException -> 0x015a }
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x011b
            goto L_0x012b
        L_0x011b:
            com.google.android.gms.internal.ads.m64 r0 = new com.google.android.gms.internal.ads.m64     // Catch:{ m64 -> 0x0163, IOException -> 0x015a }
            r2 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r7, r7, r2)     // Catch:{ m64 -> 0x0163, IOException -> 0x015a }
            throw r0     // Catch:{ m64 -> 0x0163, IOException -> 0x015a }
        L_0x0123:
            long r4 = r8 - r4
            r1.f20529j = r4     // Catch:{ m64 -> 0x0163, IOException -> 0x015a }
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x014a
        L_0x012b:
            long r2 = r0.f24326g
            int r7 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x013b
            int r7 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x0139
            long r2 = java.lang.Math.min(r4, r2)
        L_0x0139:
            r1.f20529j = r2
        L_0x013b:
            r1.f20530k = r6
            r17.mo19652q(r18)
            long r2 = r0.f24326g
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0147
            return r2
        L_0x0147:
            long r2 = r1.f20529j
            return r2
        L_0x014a:
            com.google.android.gms.internal.ads.rc1 r0 = new com.google.android.gms.internal.ads.rc1     // Catch:{ m64 -> 0x0163, IOException -> 0x015a }
            r2 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r2)     // Catch:{ m64 -> 0x0163, IOException -> 0x015a }
            throw r0     // Catch:{ m64 -> 0x0163, IOException -> 0x015a }
        L_0x0152:
            com.google.android.gms.internal.ads.m64 r0 = new com.google.android.gms.internal.ads.m64     // Catch:{ m64 -> 0x0163, IOException -> 0x015a }
            r2 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r7, r7, r2)     // Catch:{ m64 -> 0x0163, IOException -> 0x015a }
            throw r0     // Catch:{ m64 -> 0x0163, IOException -> 0x015a }
        L_0x015a:
            r0 = move-exception
            com.google.android.gms.internal.ads.m64 r2 = new com.google.android.gms.internal.ads.m64
            r3 = 2000(0x7d0, float:2.803E-42)
            r2.<init>(r7, r0, r3)
            throw r2
        L_0x0163:
            r0 = move-exception
            throw r0
        L_0x0165:
            com.google.android.gms.internal.ads.m64 r0 = new com.google.android.gms.internal.ads.m64
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = java.lang.String.valueOf(r2)
            r4.length()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "Resource is compressed: "
            java.lang.String r2 = r4.concat(r2)
            r3 = 2000(0x7d0, float:2.803E-42)
            r0.<init>(r2, r7, r3)
            throw r0
        L_0x0182:
            r0 = move-exception
            com.google.android.gms.internal.ads.m64 r2 = new com.google.android.gms.internal.ads.m64
            r2.<init>(r7, r0, r4)
            throw r2
        L_0x0189:
            com.google.android.gms.internal.ads.m64 r0 = new com.google.android.gms.internal.ads.m64
            java.lang.String r2 = "Resource identifier must be an integer."
            r0.<init>(r2, r7, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n64.mo15698m(com.google.android.gms.internal.ads.uf1):long");
    }
}
