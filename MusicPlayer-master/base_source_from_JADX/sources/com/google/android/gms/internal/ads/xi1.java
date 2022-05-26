package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xi1 extends n81 implements dp1 {

    /* renamed from: e */
    private final boolean f25842e;

    /* renamed from: f */
    private final int f25843f;

    /* renamed from: g */
    private final int f25844g;

    /* renamed from: h */
    private final String f25845h;

    /* renamed from: i */
    private final co1 f25846i;

    /* renamed from: j */
    private final co1 f25847j;

    /* renamed from: k */
    private uf1 f25848k;

    /* renamed from: l */
    private HttpURLConnection f25849l;

    /* renamed from: m */
    private InputStream f25850m;

    /* renamed from: n */
    private boolean f25851n;

    /* renamed from: o */
    private int f25852o;

    /* renamed from: p */
    private long f25853p;

    /* renamed from: q */
    private long f25854q;

    private xi1(String str, int i, int i2, boolean z, co1 co1, t13<String> t13, boolean z2) {
        super(true);
        this.f25845h = str;
        this.f25843f = i;
        this.f25844g = i2;
        this.f25842e = z;
        this.f25846i = co1;
        this.f25847j = new co1();
    }

    /* synthetic */ xi1(String str, int i, int i2, boolean z, co1 co1, t13 t13, boolean z2, wh1 wh1) {
        this(str, i, i2, z, co1, (t13<String>) null, false);
    }

    /* renamed from: r */
    private final HttpURLConnection m33707r(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f25843f);
        httpURLConnection.setReadTimeout(this.f25844g);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f25846i.mo16700a());
        hashMap.putAll(this.f25847j.mo16700a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j == 0 && j2 == -1) {
            str = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("bytes=");
            sb.append(j);
            sb.append("-");
            if (j2 != -1) {
                sb.append((j + j2) - 1);
            }
            str = sb.toString();
        }
        if (str != null) {
            httpURLConnection.setRequestProperty("Range", str);
        }
        String str2 = this.f25845h;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true != z ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        httpURLConnection.setRequestMethod(uf1.m31805a(1));
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* renamed from: s */
    private final URL m33708s(URL url, String str, uf1 uf1) throws am1 {
        String str2;
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    String valueOf = String.valueOf(protocol);
                    if (valueOf.length() != 0) {
                        str2 = "Unsupported protocol redirect: ".concat(valueOf);
                    } else {
                        str2 = new String("Unsupported protocol redirect: ");
                    }
                    throw new am1(str2, uf1, 2001, 1);
                } else if (this.f25842e || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    String protocol2 = url.getProtocol();
                    StringBuilder sb = new StringBuilder(String.valueOf(protocol2).length() + 41 + String.valueOf(protocol).length());
                    sb.append("Disallowed cross-protocol redirect (");
                    sb.append(protocol2);
                    sb.append(" to ");
                    sb.append(protocol);
                    sb.append(")");
                    throw new am1(sb.toString(), uf1, 2001, 1);
                }
            } catch (MalformedURLException e) {
                throw new am1((IOException) e, uf1, 2001, 1);
            }
        } else {
            throw new am1("Null location redirect", uf1, 2001, 1);
        }
    }

    /* renamed from: t */
    private final void m33709t() {
        HttpURLConnection httpURLConnection = this.f25849l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                y92.m34067a("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f25849l = null;
        }
    }

    /* renamed from: c */
    public final int mo15695c(byte[] bArr, int i, int i2) throws am1 {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f25853p;
            if (j != -1) {
                long j2 = j - this.f25854q;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min((long) i2, j2);
            }
            InputStream inputStream = this.f25850m;
            int i3 = wy2.f25579a;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.f25854q += (long) read;
            mo19649n(read);
            return read;
        } catch (IOException e) {
            uf1 uf1 = this.f25848k;
            int i4 = wy2.f25579a;
            throw am1.zza(e, uf1, 2);
        }
    }

    /* renamed from: g */
    public final Uri mo15696g() {
        HttpURLConnection httpURLConnection = this.f25849l;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|(1:6)(1:7)|8|(3:10|11|(5:15|16|(2:18|(1:20))(2:21|(1:23))|24|(4:28|29|30|31)))|32|33) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x006d */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15697h() throws com.google.android.gms.internal.ads.am1 {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r10.f25850m     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x007f
            long r3 = r10.f25853p     // Catch:{ all -> 0x008e }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0010
            r3 = r5
            goto L_0x0013
        L_0x0010:
            long r7 = r10.f25854q     // Catch:{ all -> 0x008e }
            long r3 = r3 - r7
        L_0x0013:
            java.net.HttpURLConnection r7 = r10.f25849l     // Catch:{ all -> 0x008e }
            if (r7 == 0) goto L_0x006d
            int r8 = com.google.android.gms.internal.ads.wy2.f25579a     // Catch:{ all -> 0x008e }
            r9 = 19
            if (r8 < r9) goto L_0x006d
            r9 = 20
            if (r8 <= r9) goto L_0x0022
            goto L_0x006d
        L_0x0022:
            java.io.InputStream r7 = r7.getInputStream()     // Catch:{ Exception -> 0x006d }
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x0032
            int r3 = r7.read()     // Catch:{ Exception -> 0x006d }
            r4 = -1
            if (r3 == r4) goto L_0x006d
            goto L_0x0039
        L_0x0032:
            r5 = 2048(0x800, double:1.0118E-320)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 > 0) goto L_0x0039
            goto L_0x006d
        L_0x0039:
            java.lang.Class r3 = r7.getClass()     // Catch:{ Exception -> 0x006d }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x006d }
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r4.equals(r3)     // Catch:{ Exception -> 0x006d }
            if (r4 != 0) goto L_0x0051
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r4.equals(r3)     // Catch:{ Exception -> 0x006d }
            if (r3 == 0) goto L_0x006d
        L_0x0051:
            java.lang.Class r3 = r7.getClass()     // Catch:{ Exception -> 0x006d }
            java.lang.Class r3 = r3.getSuperclass()     // Catch:{ Exception -> 0x006d }
            java.util.Objects.requireNonNull(r3)
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x006d }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x006d }
            r4 = 1
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x006d }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x006d }
            r3.invoke(r7, r4)     // Catch:{ Exception -> 0x006d }
        L_0x006d:
            r2.close()     // Catch:{ IOException -> 0x0071 }
            goto L_0x007f
        L_0x0071:
            r2 = move-exception
            com.google.android.gms.internal.ads.am1 r3 = new com.google.android.gms.internal.ads.am1     // Catch:{ all -> 0x008e }
            com.google.android.gms.internal.ads.uf1 r4 = r10.f25848k     // Catch:{ all -> 0x008e }
            int r5 = com.google.android.gms.internal.ads.wy2.f25579a     // Catch:{ all -> 0x008e }
            r5 = 2000(0x7d0, float:2.803E-42)
            r6 = 3
            r3.<init>((java.io.IOException) r2, (com.google.android.gms.internal.ads.uf1) r4, (int) r5, (int) r6)     // Catch:{ all -> 0x008e }
            throw r3     // Catch:{ all -> 0x008e }
        L_0x007f:
            r10.f25850m = r0
            r10.m33709t()
            boolean r0 = r10.f25851n
            if (r0 == 0) goto L_0x008d
            r10.f25851n = r1
            r10.mo19650o()
        L_0x008d:
            return
        L_0x008e:
            r2 = move-exception
            r10.f25850m = r0
            r10.m33709t()
            boolean r0 = r10.f25851n
            if (r0 == 0) goto L_0x009d
            r10.f25851n = r1
            r10.mo19650o()
        L_0x009d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xi1.mo15697h():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b4, code lost:
        if (r8 != 0) goto L_0x00b8;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo15698m(com.google.android.gms.internal.ads.uf1 r25) throws com.google.android.gms.internal.ads.am1 {
        /*
            r24 = this;
            r12 = r24
            r13 = r25
            r12.f25848k = r13
            r14 = 0
            r12.f25854q = r14
            r12.f25853p = r14
            r24.mo19651p(r25)
            r11 = 1
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x01f5 }
            android.net.Uri r0 = r13.f24320a     // Catch:{ IOException -> 0x01f5 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x01f5 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x01f5 }
            int r0 = r13.f24321b     // Catch:{ IOException -> 0x01f5 }
            byte[] r0 = r13.f24322c     // Catch:{ IOException -> 0x01f5 }
            long r9 = r13.f24325f     // Catch:{ IOException -> 0x01f5 }
            long r7 = r13.f24326g     // Catch:{ IOException -> 0x01f5 }
            boolean r0 = r13.mo21262b(r11)     // Catch:{ IOException -> 0x01f5 }
            boolean r1 = r12.f25842e     // Catch:{ IOException -> 0x01f5 }
            r5 = 0
            if (r1 != 0) goto L_0x0041
            r3 = 1
            r4 = 0
            r16 = 1
            java.util.Map<java.lang.String, java.lang.String> r6 = r13.f24323d     // Catch:{ IOException -> 0x01f5 }
            r1 = r24
            r17 = r6
            r5 = r9
            r9 = r0
            r10 = r16
            r11 = r17
            java.net.HttpURLConnection r0 = r1.m33707r(r2, r3, r4, r5, r7, r9, r10, r11)     // Catch:{ IOException -> 0x01f5 }
            goto L_0x008b
        L_0x0041:
            r11 = r2
            r5 = 0
        L_0x0043:
            int r6 = r5 + 1
            r1 = 20
            if (r5 > r1) goto L_0x01ce
            r3 = 1
            r4 = 0
            r16 = 0
            java.util.Map<java.lang.String, java.lang.String> r5 = r13.f24323d     // Catch:{ IOException -> 0x01f5 }
            r1 = r24
            r2 = r11
            r17 = r5
            r18 = r6
            r5 = r9
            r19 = r7
            r21 = r9
            r9 = r0
            r10 = r16
            r23 = r11
            r11 = r17
            java.net.HttpURLConnection r1 = r1.m33707r(r2, r3, r4, r5, r7, r9, r10, r11)     // Catch:{ IOException -> 0x01f5 }
            int r2 = r1.getResponseCode()     // Catch:{ IOException -> 0x01f5 }
            java.lang.String r3 = "Location"
            java.lang.String r3 = r1.getHeaderField(r3)     // Catch:{ IOException -> 0x01f5 }
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 == r4) goto L_0x01bb
            r4 = 301(0x12d, float:4.22E-43)
            if (r2 == r4) goto L_0x01bb
            r4 = 302(0x12e, float:4.23E-43)
            if (r2 == r4) goto L_0x01bb
            r4 = 303(0x12f, float:4.25E-43)
            if (r2 == r4) goto L_0x01bb
            r4 = 307(0x133, float:4.3E-43)
            if (r2 == r4) goto L_0x01bb
            r4 = 308(0x134, float:4.32E-43)
            if (r2 != r4) goto L_0x008a
            goto L_0x01bb
        L_0x008a:
            r0 = r1
        L_0x008b:
            r12.f25849l = r0     // Catch:{ IOException -> 0x01f5 }
            int r1 = r0.getResponseCode()     // Catch:{ IOException -> 0x01f5 }
            r12.f25852o = r1     // Catch:{ IOException -> 0x01f5 }
            java.lang.String r3 = r0.getResponseMessage()     // Catch:{ IOException -> 0x01f5 }
            int r1 = r12.f25852o
            r2 = 2008(0x7d8, float:2.814E-42)
            java.lang.String r4 = "Content-Range"
            r5 = 200(0xc8, float:2.8E-43)
            r6 = -1
            if (r1 < r5) goto L_0x0163
            r8 = 299(0x12b, float:4.19E-43)
            if (r1 <= r8) goto L_0x00a9
            goto L_0x0163
        L_0x00a9:
            r0.getContentType()
            int r1 = r12.f25852o
            if (r1 != r5) goto L_0x00b7
            long r8 = r13.f24325f
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r8 = r14
        L_0x00b8:
            java.lang.String r1 = "Content-Encoding"
            java.lang.String r1 = r0.getHeaderField(r1)
            java.lang.String r3 = "gzip"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x00e6
            long r10 = r13.f24326g
            int r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x00cf
            r12.f25853p = r10
            goto L_0x00ea
        L_0x00cf:
            java.lang.String r3 = "Content-Length"
            java.lang.String r3 = r0.getHeaderField(r3)
            java.lang.String r4 = r0.getHeaderField(r4)
            long r3 = com.google.android.gms.internal.ads.eq1.m23098a(r3, r4)
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x00e3
            long r6 = r3 - r8
        L_0x00e3:
            r12.f25853p = r6
            goto L_0x00ea
        L_0x00e6:
            long r3 = r13.f24326g
            r12.f25853p = r3
        L_0x00ea:
            r3 = 2000(0x7d0, float:2.803E-42)
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x0158 }
            r12.f25850m = r0     // Catch:{ IOException -> 0x0158 }
            if (r1 == 0) goto L_0x00fd
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0158 }
            java.io.InputStream r1 = r12.f25850m     // Catch:{ IOException -> 0x0158 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0158 }
            r12.f25850m = r0     // Catch:{ IOException -> 0x0158 }
        L_0x00fd:
            r5 = 1
            r12.f25851n = r5
            r24.mo19652q(r25)
            int r0 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x0108
            goto L_0x0144
        L_0x0108:
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x0147 }
        L_0x010c:
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x0144
            r6 = 4096(0x1000, double:2.0237E-320)
            long r6 = java.lang.Math.min(r8, r6)     // Catch:{ IOException -> 0x0147 }
            int r1 = (int) r6     // Catch:{ IOException -> 0x0147 }
            java.io.InputStream r4 = r12.f25850m     // Catch:{ IOException -> 0x0147 }
            int r6 = com.google.android.gms.internal.ads.wy2.f25579a     // Catch:{ IOException -> 0x0147 }
            r6 = 0
            int r1 = r4.read(r0, r6, r1)     // Catch:{ IOException -> 0x0147 }
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ IOException -> 0x0147 }
            boolean r4 = r4.isInterrupted()     // Catch:{ IOException -> 0x0147 }
            if (r4 != 0) goto L_0x0139
            r4 = -1
            if (r1 == r4) goto L_0x0133
            long r10 = (long) r1     // Catch:{ IOException -> 0x0147 }
            long r8 = r8 - r10
            r12.mo19649n(r1)     // Catch:{ IOException -> 0x0147 }
            goto L_0x010c
        L_0x0133:
            com.google.android.gms.internal.ads.am1 r0 = new com.google.android.gms.internal.ads.am1     // Catch:{ IOException -> 0x0147 }
            r0.<init>(r13, r2, r5)     // Catch:{ IOException -> 0x0147 }
            throw r0     // Catch:{ IOException -> 0x0147 }
        L_0x0139:
            com.google.android.gms.internal.ads.am1 r0 = new com.google.android.gms.internal.ads.am1     // Catch:{ IOException -> 0x0147 }
            java.io.InterruptedIOException r1 = new java.io.InterruptedIOException     // Catch:{ IOException -> 0x0147 }
            r1.<init>()     // Catch:{ IOException -> 0x0147 }
            r0.<init>((java.io.IOException) r1, (com.google.android.gms.internal.ads.uf1) r13, (int) r3, (int) r5)     // Catch:{ IOException -> 0x0147 }
            throw r0     // Catch:{ IOException -> 0x0147 }
        L_0x0144:
            long r0 = r12.f25853p
            return r0
        L_0x0147:
            r0 = move-exception
            r24.m33709t()
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.am1
            if (r1 == 0) goto L_0x0152
            com.google.android.gms.internal.ads.am1 r0 = (com.google.android.gms.internal.ads.am1) r0
            throw r0
        L_0x0152:
            com.google.android.gms.internal.ads.am1 r1 = new com.google.android.gms.internal.ads.am1
            r1.<init>((java.io.IOException) r0, (com.google.android.gms.internal.ads.uf1) r13, (int) r3, (int) r5)
            throw r1
        L_0x0158:
            r0 = move-exception
            r5 = 1
            r24.m33709t()
            com.google.android.gms.internal.ads.am1 r1 = new com.google.android.gms.internal.ads.am1
            r1.<init>((java.io.IOException) r0, (com.google.android.gms.internal.ads.uf1) r13, (int) r3, (int) r5)
            throw r1
        L_0x0163:
            r5 = 1
            java.util.Map r8 = r0.getHeaderFields()
            int r1 = r12.f25852o
            r9 = 416(0x1a0, float:5.83E-43)
            if (r1 != r9) goto L_0x018a
            java.lang.String r1 = r0.getHeaderField(r4)
            long r10 = com.google.android.gms.internal.ads.eq1.m23099b(r1)
            r4 = r3
            long r2 = r13.f24325f
            int r16 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r16 != 0) goto L_0x018b
            r12.f25851n = r5
            r24.mo19652q(r25)
            long r0 = r13.f24326g
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0189
            return r0
        L_0x0189:
            return r14
        L_0x018a:
            r4 = r3
        L_0x018b:
            java.io.InputStream r0 = r0.getErrorStream()
            if (r0 == 0) goto L_0x0196
            byte[] r0 = com.google.android.gms.internal.ads.wy2.m33461x(r0)     // Catch:{ IOException -> 0x019a }
            goto L_0x0198
        L_0x0196:
            byte[] r0 = com.google.android.gms.internal.ads.wy2.f25584f     // Catch:{ IOException -> 0x019a }
        L_0x0198:
            r7 = r0
            goto L_0x019d
        L_0x019a:
            byte[] r0 = com.google.android.gms.internal.ads.wy2.f25584f
            goto L_0x0198
        L_0x019d:
            r24.m33709t()
            int r0 = r12.f25852o
            if (r0 != r9) goto L_0x01ac
            com.google.android.gms.internal.ads.rc1 r0 = new com.google.android.gms.internal.ads.rc1
            r1 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r1)
            goto L_0x01ad
        L_0x01ac:
            r0 = 0
        L_0x01ad:
            com.google.android.gms.internal.ads.bn1 r9 = new com.google.android.gms.internal.ads.bn1
            int r2 = r12.f25852o
            r1 = r9
            r3 = r4
            r4 = r0
            r5 = r8
            r6 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7)
            throw r9
        L_0x01bb:
            r5 = 1
            r6 = 0
            r1.disconnect()     // Catch:{ IOException -> 0x01f3 }
            r2 = r23
            java.net.URL r11 = r12.m33708s(r2, r3, r13)     // Catch:{ IOException -> 0x01f3 }
            r5 = r18
            r7 = r19
            r9 = r21
            goto L_0x0043
        L_0x01ce:
            r18 = r6
            r5 = 1
            com.google.android.gms.internal.ads.am1 r0 = new com.google.android.gms.internal.ads.am1     // Catch:{ IOException -> 0x01f3 }
            java.net.NoRouteToHostException r1 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x01f3 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01f3 }
            r3 = 31
            r2.<init>(r3)     // Catch:{ IOException -> 0x01f3 }
            java.lang.String r3 = "Too many redirects: "
            r2.append(r3)     // Catch:{ IOException -> 0x01f3 }
            r3 = r18
            r2.append(r3)     // Catch:{ IOException -> 0x01f3 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x01f3 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x01f3 }
            r2 = 2001(0x7d1, float:2.804E-42)
            r0.<init>((java.io.IOException) r1, (com.google.android.gms.internal.ads.uf1) r13, (int) r2, (int) r5)     // Catch:{ IOException -> 0x01f3 }
            throw r0     // Catch:{ IOException -> 0x01f3 }
        L_0x01f3:
            r0 = move-exception
            goto L_0x01f7
        L_0x01f5:
            r0 = move-exception
            r5 = 1
        L_0x01f7:
            r24.m33709t()
            com.google.android.gms.internal.ads.am1 r0 = com.google.android.gms.internal.ads.am1.zza(r0, r13, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xi1.mo15698m(com.google.android.gms.internal.ads.uf1):long");
    }

    public final Map<String, List<String>> zza() {
        HttpURLConnection httpURLConnection = this.f25849l;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }
}
