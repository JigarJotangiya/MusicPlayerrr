package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class pq0 extends n81 implements dp1 {

    /* renamed from: u */
    private static final Pattern f21457u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: v */
    private static final AtomicReference<byte[]> f21458v = new AtomicReference<>();

    /* renamed from: e */
    private final SSLSocketFactory f21459e = new oq0(this);

    /* renamed from: f */
    private final int f21460f;

    /* renamed from: g */
    private final int f21461g;

    /* renamed from: h */
    private final String f21462h;

    /* renamed from: i */
    private final co1 f21463i;

    /* renamed from: j */
    private uf1 f21464j;

    /* renamed from: k */
    private HttpURLConnection f21465k;

    /* renamed from: l */
    private InputStream f21466l;

    /* renamed from: m */
    private boolean f21467m;

    /* renamed from: n */
    private int f21468n;

    /* renamed from: o */
    private long f21469o;

    /* renamed from: p */
    private long f21470p;

    /* renamed from: q */
    private long f21471q;

    /* renamed from: r */
    private long f21472r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f21473s;

    /* renamed from: t */
    private final Set<Socket> f21474t = new HashSet();

    pq0(String str, fr1 fr1, int i, int i2, int i3) {
        super(true);
        gs1.m24485c(str);
        this.f21462h = str;
        this.f21463i = new co1();
        this.f21460f = i;
        this.f21461g = i2;
        this.f21473s = i3;
        if (fr1 != null) {
            mo19648l(fr1);
        }
    }

    /* renamed from: u */
    private final void m29070u() {
        HttpURLConnection httpURLConnection = this.f21465k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                ul0.m31860e("Unexpected error while disconnecting", e);
            }
            this.f21465k = null;
        }
    }

    /* renamed from: c */
    public final int mo15695c(byte[] bArr, int i, int i2) throws am1 {
        try {
            if (this.f21471q != this.f21469o) {
                byte[] andSet = f21458v.getAndSet((Object) null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j = this.f21471q;
                    long j2 = this.f21469o;
                    if (j == j2) {
                        f21458v.set(andSet);
                        break;
                    }
                    int read = this.f21466l.read(andSet, 0, (int) Math.min(j2 - j, (long) andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f21471q += (long) read;
                        mo19649n(read);
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.f21470p;
            if (j3 != -1) {
                long j4 = j3 - this.f21472r;
                if (j4 != 0) {
                    i2 = (int) Math.min((long) i2, j4);
                }
                return -1;
            }
            int read2 = this.f21466l.read(bArr, i, i2);
            if (read2 != -1) {
                this.f21472r += (long) read2;
                mo19649n(read2);
                return read2;
            } else if (this.f21470p == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e) {
            throw new am1(e, this.f21464j, 2000, 2);
        }
    }

    /* renamed from: g */
    public final Uri mo15696g() {
        HttpURLConnection httpURLConnection = this.f21465k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:4|(1:6)(1:7)|8|9|(5:13|14|(2:16|(1:18))(2:19|(1:21))|22|(1:26))|27|28) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0067 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15697h() throws com.google.android.gms.internal.ads.am1 {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.f21466l     // Catch:{ all -> 0x008d }
            if (r2 == 0) goto L_0x0079
            java.net.HttpURLConnection r2 = r9.f21465k     // Catch:{ all -> 0x008d }
            long r3 = r9.f21470p     // Catch:{ all -> 0x008d }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0011
            goto L_0x0014
        L_0x0011:
            long r7 = r9.f21472r     // Catch:{ all -> 0x008d }
            long r3 = r3 - r7
        L_0x0014:
            int r7 = com.google.android.gms.internal.ads.wy2.f25579a     // Catch:{ all -> 0x008d }
            r8 = 19
            if (r7 == r8) goto L_0x001f
            r8 = 20
            if (r7 == r8) goto L_0x001f
            goto L_0x0067
        L_0x001f:
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ Exception -> 0x0067 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x002f
            int r3 = r2.read()     // Catch:{ Exception -> 0x0067 }
            r4 = -1
            if (r3 == r4) goto L_0x0067
            goto L_0x0036
        L_0x002f:
            r5 = 2048(0x800, double:1.0118E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0036
            goto L_0x0067
        L_0x0036:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x0067 }
            if (r4 != 0) goto L_0x004e
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0067 }
            if (r3 == 0) goto L_0x0067
        L_0x004e:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x0067 }
            java.lang.Class r3 = r3.getSuperclass()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0067 }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x0067 }
            r4 = 1
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x0067 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0067 }
            r3.invoke(r2, r4)     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            java.io.InputStream r2 = r9.f21466l     // Catch:{ IOException -> 0x006d }
            r2.close()     // Catch:{ IOException -> 0x006d }
            goto L_0x0079
        L_0x006d:
            r2 = move-exception
            com.google.android.gms.internal.ads.am1 r3 = new com.google.android.gms.internal.ads.am1     // Catch:{ all -> 0x008d }
            com.google.android.gms.internal.ads.uf1 r4 = r9.f21464j     // Catch:{ all -> 0x008d }
            r5 = 2000(0x7d0, float:2.803E-42)
            r6 = 3
            r3.<init>((java.io.IOException) r2, (com.google.android.gms.internal.ads.uf1) r4, (int) r5, (int) r6)     // Catch:{ all -> 0x008d }
            throw r3     // Catch:{ all -> 0x008d }
        L_0x0079:
            r9.f21466l = r0
            r9.m29070u()
            boolean r0 = r9.f21467m
            if (r0 == 0) goto L_0x0087
            r9.f21467m = r1
            r9.mo19650o()
        L_0x0087:
            java.util.Set<java.net.Socket> r0 = r9.f21474t
            r0.clear()
            return
        L_0x008d:
            r2 = move-exception
            r9.f21466l = r0
            r9.m29070u()
            boolean r0 = r9.f21467m
            if (r0 == 0) goto L_0x009c
            r9.f21467m = r1
            r9.mo19650o()
        L_0x009c:
            java.util.Set<java.net.Socket> r0 = r9.f21474t
            r0.clear()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pq0.mo15697h():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010d, code lost:
        if (r2 != 0) goto L_0x0112;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01f5  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo15698m(com.google.android.gms.internal.ads.uf1 r22) throws com.google.android.gms.internal.ads.am1 {
        /*
            r21 = this;
            r1 = r21
            r7 = r22
            java.lang.String r2 = "Unable to connect to "
            r1.f21464j = r7
            r3 = 0
            r1.f21472r = r3
            r1.f21471q = r3
            r5 = 1
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x02d8 }
            android.net.Uri r6 = r7.f24320a     // Catch:{ IOException -> 0x02d8 }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x02d8 }
            r0.<init>(r6)     // Catch:{ IOException -> 0x02d8 }
            byte[] r6 = r7.f24322c     // Catch:{ IOException -> 0x02d8 }
            long r8 = r7.f24325f     // Catch:{ IOException -> 0x02d8 }
            long r10 = r7.f24326g     // Catch:{ IOException -> 0x02d8 }
            boolean r6 = r7.mo21262b(r5)     // Catch:{ IOException -> 0x02d8 }
            r13 = 0
        L_0x0025:
            int r14 = r13 + 1
            r15 = 20
            if (r13 > r15) goto L_0x02bf
            java.net.URLConnection r13 = r0.openConnection()     // Catch:{ IOException -> 0x02d8 }
            java.net.HttpURLConnection r13 = (java.net.HttpURLConnection) r13     // Catch:{ IOException -> 0x02d8 }
            boolean r5 = r13 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x02d8 }
            if (r5 == 0) goto L_0x003d
            r5 = r13
            javax.net.ssl.HttpsURLConnection r5 = (javax.net.ssl.HttpsURLConnection) r5     // Catch:{ IOException -> 0x02d8 }
            javax.net.ssl.SSLSocketFactory r12 = r1.f21459e     // Catch:{ IOException -> 0x02d8 }
            r5.setSSLSocketFactory(r12)     // Catch:{ IOException -> 0x02d8 }
        L_0x003d:
            int r5 = r1.f21460f     // Catch:{ IOException -> 0x02d8 }
            r13.setConnectTimeout(r5)     // Catch:{ IOException -> 0x02d8 }
            int r5 = r1.f21461g     // Catch:{ IOException -> 0x02d8 }
            r13.setReadTimeout(r5)     // Catch:{ IOException -> 0x02d8 }
            com.google.android.gms.internal.ads.co1 r5 = r1.f21463i     // Catch:{ IOException -> 0x02d8 }
            java.util.Map r5 = r5.mo16700a()     // Catch:{ IOException -> 0x02d8 }
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x02d8 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x02d8 }
        L_0x0055:
            boolean r12 = r5.hasNext()     // Catch:{ IOException -> 0x02d8 }
            if (r12 == 0) goto L_0x0075
            java.lang.Object r12 = r5.next()     // Catch:{ IOException -> 0x02d8 }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ IOException -> 0x02d8 }
            java.lang.Object r16 = r12.getKey()     // Catch:{ IOException -> 0x02d8 }
            r15 = r16
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ IOException -> 0x02d8 }
            java.lang.Object r12 = r12.getValue()     // Catch:{ IOException -> 0x02d8 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ IOException -> 0x02d8 }
            r13.setRequestProperty(r15, r12)     // Catch:{ IOException -> 0x02d8 }
            r15 = 20
            goto L_0x0055
        L_0x0075:
            r5 = 27
            r17 = -1
            int r12 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r12 != 0) goto L_0x0081
            int r12 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r12 == 0) goto L_0x00bb
        L_0x0081:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02d8 }
            r12.<init>(r5)     // Catch:{ IOException -> 0x02d8 }
            java.lang.String r15 = "bytes="
            r12.append(r15)     // Catch:{ IOException -> 0x02d8 }
            r12.append(r8)     // Catch:{ IOException -> 0x02d8 }
            java.lang.String r15 = "-"
            r12.append(r15)     // Catch:{ IOException -> 0x02d8 }
            java.lang.String r12 = r12.toString()     // Catch:{ IOException -> 0x02d8 }
            int r15 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r15 == 0) goto L_0x00b6
            long r19 = r8 + r10
            long r3 = r19 + r17
            int r15 = r12.length()     // Catch:{ IOException -> 0x02d8 }
            r16 = 20
            int r15 = r15 + 20
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02d8 }
            r5.<init>(r15)     // Catch:{ IOException -> 0x02d8 }
            r5.append(r12)     // Catch:{ IOException -> 0x02d8 }
            r5.append(r3)     // Catch:{ IOException -> 0x02d8 }
            java.lang.String r12 = r5.toString()     // Catch:{ IOException -> 0x02d8 }
        L_0x00b6:
            java.lang.String r3 = "Range"
            r13.setRequestProperty(r3, r12)     // Catch:{ IOException -> 0x02d8 }
        L_0x00bb:
            java.lang.String r3 = "User-Agent"
            java.lang.String r4 = r1.f21462h     // Catch:{ IOException -> 0x02d8 }
            r13.setRequestProperty(r3, r4)     // Catch:{ IOException -> 0x02d8 }
            if (r6 != 0) goto L_0x00cb
            java.lang.String r3 = "Accept-Encoding"
            java.lang.String r4 = "identity"
            r13.setRequestProperty(r3, r4)     // Catch:{ IOException -> 0x02d8 }
        L_0x00cb:
            r3 = 0
            r13.setInstanceFollowRedirects(r3)     // Catch:{ IOException -> 0x02d8 }
            r13.setDoOutput(r3)     // Catch:{ IOException -> 0x02d8 }
            r13.connect()     // Catch:{ IOException -> 0x02d8 }
            int r4 = r13.getResponseCode()     // Catch:{ IOException -> 0x02d8 }
            r5 = 300(0x12c, float:4.2E-43)
            if (r4 == r5) goto L_0x026e
            r5 = 301(0x12d, float:4.22E-43)
            if (r4 == r5) goto L_0x026e
            r5 = 302(0x12e, float:4.23E-43)
            if (r4 == r5) goto L_0x026e
            r5 = 303(0x12f, float:4.25E-43)
            if (r4 == r5) goto L_0x026e
            r5 = 307(0x133, float:4.3E-43)
            if (r4 == r5) goto L_0x026e
            r5 = 308(0x134, float:4.32E-43)
            if (r4 != r5) goto L_0x00f3
            goto L_0x026e
        L_0x00f3:
            r1.f21465k = r13     // Catch:{ IOException -> 0x02d8 }
            int r0 = r13.getResponseCode()     // Catch:{ IOException -> 0x0248 }
            r1.f21468n = r0     // Catch:{ IOException -> 0x0248 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 < r2) goto L_0x0220
            r3 = 299(0x12b, float:4.19E-43)
            if (r0 <= r3) goto L_0x0105
            goto L_0x0220
        L_0x0105:
            if (r0 != r2) goto L_0x0110
            long r2 = r7.f24325f
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0110
            goto L_0x0112
        L_0x0110:
            r2 = 0
        L_0x0112:
            r1.f21469o = r2
            r2 = 1
            boolean r0 = r7.mo21262b(r2)
            if (r0 != 0) goto L_0x01fe
            long r2 = r7.f24326g
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x0125
            r1.f21470p = r2
            goto L_0x0202
        L_0x0125:
            java.net.HttpURLConnection r0 = r1.f21465k
            java.lang.String r2 = "Content-Length"
            java.lang.String r2 = r0.getHeaderField(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r4 = "]"
            if (r3 != 0) goto L_0x015b
            long r5 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x013a }
            goto L_0x015d
        L_0x013a:
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 28
            r5.<init>(r3)
            java.lang.String r3 = "Unexpected Content-Length ["
            r5.append(r3)
            r5.append(r2)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            com.google.android.gms.internal.ads.ul0.m31859d(r3)
        L_0x015b:
            r5 = r17
        L_0x015d:
            java.lang.String r3 = "Content-Range"
            java.lang.String r0 = r0.getHeaderField(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x01f1
            java.util.regex.Pattern r3 = f21457u
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r8 = r3.find()
            if (r8 == 0) goto L_0x01f1
            r8 = 2
            java.lang.String r8 = r3.group(r8)     // Catch:{ NumberFormatException -> 0x01cf }
            long r8 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x01cf }
            r10 = 1
            java.lang.String r3 = r3.group(r10)     // Catch:{ NumberFormatException -> 0x01cf }
            long r10 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x01cf }
            long r8 = r8 - r10
            r10 = 1
            long r8 = r8 + r10
            r19 = 0
            int r3 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r3 >= 0) goto L_0x0193
            r5 = r8
            goto L_0x01f1
        L_0x0193:
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x01f1
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ NumberFormatException -> 0x01cf }
            int r3 = r3.length()     // Catch:{ NumberFormatException -> 0x01cf }
            int r3 = r3 + 26
            java.lang.String r10 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01cf }
            int r10 = r10.length()     // Catch:{ NumberFormatException -> 0x01cf }
            int r3 = r3 + r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x01cf }
            r10.<init>(r3)     // Catch:{ NumberFormatException -> 0x01cf }
            java.lang.String r3 = "Inconsistent headers ["
            r10.append(r3)     // Catch:{ NumberFormatException -> 0x01cf }
            r10.append(r2)     // Catch:{ NumberFormatException -> 0x01cf }
            java.lang.String r2 = "] ["
            r10.append(r2)     // Catch:{ NumberFormatException -> 0x01cf }
            r10.append(r0)     // Catch:{ NumberFormatException -> 0x01cf }
            r10.append(r4)     // Catch:{ NumberFormatException -> 0x01cf }
            java.lang.String r2 = r10.toString()     // Catch:{ NumberFormatException -> 0x01cf }
            com.google.android.gms.internal.ads.ul0.m31862g(r2)     // Catch:{ NumberFormatException -> 0x01cf }
            long r2 = java.lang.Math.max(r5, r8)     // Catch:{ NumberFormatException -> 0x01cf }
            r5 = r2
            goto L_0x01f1
        L_0x01cf:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r8 = 27
            int r2 = r2 + r8
            r3.<init>(r2)
            java.lang.String r2 = "Unexpected Content-Range ["
            r3.append(r2)
            r3.append(r0)
            r3.append(r4)
            java.lang.String r0 = r3.toString()
            com.google.android.gms.internal.ads.ul0.m31859d(r0)
        L_0x01f1:
            int r0 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x01f9
            long r2 = r1.f21469o
            long r17 = r5 - r2
        L_0x01f9:
            r2 = r17
            r1.f21470p = r2
            goto L_0x0202
        L_0x01fe:
            long r2 = r7.f24326g
            r1.f21470p = r2
        L_0x0202:
            java.net.HttpURLConnection r0 = r1.f21465k     // Catch:{ IOException -> 0x0213 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x0213 }
            r1.f21466l = r0     // Catch:{ IOException -> 0x0213 }
            r2 = 1
            r1.f21467m = r2
            r21.mo19652q(r22)
            long r2 = r1.f21470p
            return r2
        L_0x0213:
            r0 = move-exception
            r21.m29070u()
            com.google.android.gms.internal.ads.am1 r2 = new com.google.android.gms.internal.ads.am1
            r3 = 2000(0x7d0, float:2.803E-42)
            r4 = 1
            r2.<init>((java.io.IOException) r0, (com.google.android.gms.internal.ads.uf1) r7, (int) r3, (int) r4)
            throw r2
        L_0x0220:
            java.net.HttpURLConnection r0 = r1.f21465k
            java.util.Map r6 = r0.getHeaderFields()
            r21.m29070u()
            com.google.android.gms.internal.ads.bn1 r0 = new com.google.android.gms.internal.ads.bn1
            int r3 = r1.f21468n
            r4 = 0
            r5 = 0
            byte[] r8 = com.google.android.gms.internal.ads.wy2.f25584f
            r2 = r0
            r7 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8)
            int r2 = r1.f21468n
            r3 = 416(0x1a0, float:5.83E-43)
            if (r2 != r3) goto L_0x0247
            com.google.android.gms.internal.ads.rc1 r2 = new com.google.android.gms.internal.ads.rc1
            r3 = 2008(0x7d8, float:2.814E-42)
            r2.<init>(r3)
            r0.initCause(r2)
        L_0x0247:
            throw r0
        L_0x0248:
            r0 = move-exception
            r21.m29070u()
            com.google.android.gms.internal.ads.am1 r3 = new com.google.android.gms.internal.ads.am1
            android.net.Uri r4 = r7.f24320a
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r5 = r4.length()
            if (r5 == 0) goto L_0x0263
            java.lang.String r2 = r2.concat(r4)
            goto L_0x0269
        L_0x0263:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r2)
            r2 = r4
        L_0x0269:
            r4 = 1
            r3.<init>((java.lang.String) r2, (java.io.IOException) r0, (com.google.android.gms.internal.ads.uf1) r7, (int) r4)
            throw r3
        L_0x026e:
            r19 = 0
            java.lang.String r4 = "Location"
            java.lang.String r4 = r13.getHeaderField(r4)     // Catch:{ IOException -> 0x02d8 }
            r13.disconnect()     // Catch:{ IOException -> 0x02d8 }
            if (r4 == 0) goto L_0x02b7
            java.net.URL r5 = new java.net.URL     // Catch:{ IOException -> 0x02d8 }
            r5.<init>(r0, r4)     // Catch:{ IOException -> 0x02d8 }
            java.lang.String r0 = r5.getProtocol()     // Catch:{ IOException -> 0x02d8 }
            java.lang.String r4 = "https"
            boolean r4 = r4.equals(r0)     // Catch:{ IOException -> 0x02d8 }
            if (r4 != 0) goto L_0x02b0
            java.lang.String r4 = "http"
            boolean r4 = r4.equals(r0)     // Catch:{ IOException -> 0x02d8 }
            if (r4 != 0) goto L_0x02b0
            java.net.ProtocolException r3 = new java.net.ProtocolException     // Catch:{ IOException -> 0x02d8 }
            java.lang.String r4 = "Unsupported protocol redirect: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x02d8 }
            int r5 = r0.length()     // Catch:{ IOException -> 0x02d8 }
            if (r5 == 0) goto L_0x02a7
            java.lang.String r0 = r4.concat(r0)     // Catch:{ IOException -> 0x02d8 }
            goto L_0x02ac
        L_0x02a7:
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x02d8 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x02d8 }
        L_0x02ac:
            r3.<init>(r0)     // Catch:{ IOException -> 0x02d8 }
            throw r3     // Catch:{ IOException -> 0x02d8 }
        L_0x02b0:
            r0 = r5
            r13 = r14
            r3 = r19
            r5 = 1
            goto L_0x0025
        L_0x02b7:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x02d8 }
            java.lang.String r3 = "Null location redirect"
            r0.<init>(r3)     // Catch:{ IOException -> 0x02d8 }
            throw r0     // Catch:{ IOException -> 0x02d8 }
        L_0x02bf:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x02d8 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02d8 }
            r4 = 31
            r3.<init>(r4)     // Catch:{ IOException -> 0x02d8 }
            java.lang.String r4 = "Too many redirects: "
            r3.append(r4)     // Catch:{ IOException -> 0x02d8 }
            r3.append(r14)     // Catch:{ IOException -> 0x02d8 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x02d8 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x02d8 }
            throw r0     // Catch:{ IOException -> 0x02d8 }
        L_0x02d8:
            r0 = move-exception
            com.google.android.gms.internal.ads.am1 r3 = new com.google.android.gms.internal.ads.am1
            android.net.Uri r4 = r7.f24320a
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r5 = r4.length()
            if (r5 == 0) goto L_0x02f0
            java.lang.String r2 = r2.concat(r4)
            goto L_0x02f6
        L_0x02f0:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r2)
            r2 = r4
        L_0x02f6:
            r4 = 1
            r3.<init>((java.lang.String) r2, (java.io.IOException) r0, (com.google.android.gms.internal.ads.uf1) r7, (int) r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pq0.mo15698m(com.google.android.gms.internal.ads.uf1):long");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo20297t(int i) {
        this.f21473s = i;
        for (Socket next : this.f21474t) {
            if (!next.isClosed()) {
                try {
                    next.setReceiveBufferSize(this.f21473s);
                } catch (SocketException e) {
                    ul0.m31863h("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    public final Map<String, List<String>> zza() {
        HttpURLConnection httpURLConnection = this.f21465k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
