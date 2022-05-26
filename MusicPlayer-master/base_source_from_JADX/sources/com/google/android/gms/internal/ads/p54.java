package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class p54 extends n81 {

    /* renamed from: e */
    private final ContentResolver f21340e;

    /* renamed from: f */
    private Uri f21341f;

    /* renamed from: g */
    private AssetFileDescriptor f21342g;

    /* renamed from: h */
    private FileInputStream f21343h;

    /* renamed from: i */
    private long f21344i;

    /* renamed from: j */
    private boolean f21345j;

    public p54(Context context) {
        super(false);
        this.f21340e = context.getContentResolver();
    }

    /* renamed from: c */
    public final int mo15695c(byte[] bArr, int i, int i2) throws o54 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f21344i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new o54(e, 2000);
            }
        }
        FileInputStream fileInputStream = this.f21343h;
        int i3 = wy2.f25579a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f21344i;
        if (j2 != -1) {
            this.f21344i = j2 - ((long) read);
        }
        mo19649n(read);
        return read;
    }

    /* renamed from: g */
    public final Uri mo15696g() {
        return this.f21341f;
    }

    /* renamed from: h */
    public final void mo15697h() throws o54 {
        this.f21341f = null;
        try {
            FileInputStream fileInputStream = this.f21343h;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f21343h = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f21342g;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f21342g = null;
                if (this.f21345j) {
                    this.f21345j = false;
                    mo19650o();
                }
            } catch (IOException e) {
                throw new o54(e, 2000);
            } catch (Throwable th) {
                this.f21342g = null;
                if (this.f21345j) {
                    this.f21345j = false;
                    mo19650o();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new o54(e2, 2000);
        } catch (Throwable th2) {
            this.f21343h = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f21342g;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f21342g = null;
                if (this.f21345j) {
                    this.f21345j = false;
                    mo19650o();
                }
                throw th2;
            } catch (IOException e3) {
                throw new o54(e3, 2000);
            } catch (Throwable th3) {
                this.f21342g = null;
                if (this.f21345j) {
                    this.f21345j = false;
                    mo19650o();
                }
                throw th3;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fc, code lost:
        r3 = 2000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0106, code lost:
        r3 = 2005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x010d, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010c A[ExcHandler: o54 (r0v1 'e' com.google.android.gms.internal.ads.o54 A[CUSTOM_DECLARE]), Splitter:B:1:0x0004] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo15698m(com.google.android.gms.internal.ads.uf1 r18) throws com.google.android.gms.internal.ads.o54 {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            android.net.Uri r4 = r0.f24320a     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            r1.f21341f = r4     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            r17.mo19651p(r18)     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            java.lang.String r5 = "content"
            android.net.Uri r6 = r0.f24320a     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            java.lang.String r6 = r6.getScheme()     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            boolean r5 = r5.equals(r6)     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            if (r5 == 0) goto L_0x0030
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            r5.<init>()     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            int r6 = com.google.android.gms.internal.ads.wy2.f25579a     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            r7 = 31
            if (r6 < r7) goto L_0x0027
            com.google.android.gms.internal.ads.n54.m27701a(r5)     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
        L_0x0027:
            android.content.ContentResolver r6 = r1.f21340e     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            java.lang.String r7 = "*/*"
            android.content.res.AssetFileDescriptor r5 = r6.openTypedAssetFileDescriptor(r4, r7, r5)     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            goto L_0x0038
        L_0x0030:
            android.content.ContentResolver r5 = r1.f21340e     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            java.lang.String r6 = "r"
            android.content.res.AssetFileDescriptor r5 = r5.openAssetFileDescriptor(r4, r6)     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
        L_0x0038:
            r1.f21342g = r5     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            if (r5 == 0) goto L_0x00cd
            long r6 = r5.getLength()     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            java.io.FileDescriptor r8 = r5.getFileDescriptor()     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            r4.<init>(r8)     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            r1.f21343h = r4     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            r8 = 2008(0x7d8, float:2.814E-42)
            r9 = 0
            r10 = -1
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0061
            long r13 = r0.f24325f     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            int r15 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r15 > 0) goto L_0x005b
            goto L_0x0061
        L_0x005b:
            com.google.android.gms.internal.ads.o54 r0 = new com.google.android.gms.internal.ads.o54     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            r0.<init>(r9, r8)     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            throw r0     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
        L_0x0061:
            long r13 = r5.getStartOffset()     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            long r2 = r0.f24325f     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            long r2 = r2 + r13
            long r2 = r4.skip(r2)     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            long r2 = r2 - r13
            long r13 = r0.f24325f     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            int r16 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r16 != 0) goto L_0x00c7
            r13 = 0
            if (r12 != 0) goto L_0x0099
            java.nio.channels.FileChannel r2 = r4.getChannel()     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            long r3 = r2.size()     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            int r6 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x0087
            r1.f21344i = r10     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            r3 = r10
            goto L_0x00a1
        L_0x0087:
            long r6 = r2.position()     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            long r3 = r3 - r6
            r1.f21344i = r3     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            int r2 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x0093
            goto L_0x00a1
        L_0x0093:
            com.google.android.gms.internal.ads.o54 r0 = new com.google.android.gms.internal.ads.o54     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            r0.<init>(r9, r8)     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            throw r0     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
        L_0x0099:
            long r3 = r6 - r2
            r1.f21344i = r3     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            int r2 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x00c1
        L_0x00a1:
            long r5 = r0.f24326g
            int r2 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x00b1
            int r2 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x00af
            long r5 = java.lang.Math.min(r3, r5)
        L_0x00af:
            r1.f21344i = r5
        L_0x00b1:
            r2 = 1
            r1.f21345j = r2
            r17.mo19652q(r18)
            long r2 = r0.f24326g
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00be
            return r2
        L_0x00be:
            long r2 = r1.f21344i
            return r2
        L_0x00c1:
            com.google.android.gms.internal.ads.o54 r0 = new com.google.android.gms.internal.ads.o54     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            r0.<init>(r9, r8)     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            throw r0     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
        L_0x00c7:
            com.google.android.gms.internal.ads.o54 r0 = new com.google.android.gms.internal.ads.o54     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            r0.<init>(r9, r8)     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            throw r0     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
        L_0x00cd:
            com.google.android.gms.internal.ads.o54 r0 = new com.google.android.gms.internal.ads.o54     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            int r4 = r4.length()     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            int r4 = r4 + 36
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            r6.<init>(r4)     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            java.lang.String r4 = "Could not open file descriptor for: "
            r6.append(r4)     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            r6.append(r3)     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            java.lang.String r3 = r6.toString()     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            r2.<init>(r3)     // Catch:{ o54 -> 0x010c, IOException -> 0x00fb }
            r3 = 2000(0x7d0, float:2.803E-42)
            r0.<init>(r2, r3)     // Catch:{ o54 -> 0x010c, IOException -> 0x00f9 }
            throw r0     // Catch:{ o54 -> 0x010c, IOException -> 0x00f9 }
        L_0x00f9:
            r0 = move-exception
            goto L_0x00fe
        L_0x00fb:
            r0 = move-exception
            r3 = 2000(0x7d0, float:2.803E-42)
        L_0x00fe:
            com.google.android.gms.internal.ads.o54 r2 = new com.google.android.gms.internal.ads.o54
            boolean r4 = r0 instanceof java.io.FileNotFoundException
            r5 = 1
            if (r5 == r4) goto L_0x0106
            goto L_0x0108
        L_0x0106:
            r3 = 2005(0x7d5, float:2.81E-42)
        L_0x0108:
            r2.<init>(r0, r3)
            throw r2
        L_0x010c:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p54.mo15698m(com.google.android.gms.internal.ads.uf1):long");
    }
}
