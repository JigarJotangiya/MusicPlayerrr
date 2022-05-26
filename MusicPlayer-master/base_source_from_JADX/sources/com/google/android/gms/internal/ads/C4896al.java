package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.al */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4896al implements C5044el {

    /* renamed from: n */
    private static final Pattern f13937n = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: o */
    private static final AtomicReference<byte[]> f13938o = new AtomicReference<>();

    /* renamed from: a */
    private final int f13939a;

    /* renamed from: b */
    private final int f13940b;

    /* renamed from: c */
    private final String f13941c;

    /* renamed from: d */
    private final C5007dl f13942d = new C5007dl();

    /* renamed from: e */
    private final C5267kl<? super C4896al> f13943e;

    /* renamed from: f */
    private C5747xk f13944f;

    /* renamed from: g */
    private HttpURLConnection f13945g;

    /* renamed from: h */
    private InputStream f13946h;

    /* renamed from: i */
    private boolean f13947i;

    /* renamed from: j */
    private long f13948j;

    /* renamed from: k */
    private long f13949k;

    /* renamed from: l */
    private long f13950l;

    /* renamed from: m */
    private long f13951m;

    public C4896al(String str, C5674vl<String> vlVar, C5267kl<? super C4896al> klVar, int i, int i2, boolean z, C5007dl dlVar) {
        C5304ll.m26773b(str);
        this.f13941c = str;
        this.f13943e = klVar;
        this.f13939a = i;
        this.f13940b = i2;
    }

    /* renamed from: d */
    private final void m20790d() {
        HttpURLConnection httpURLConnection = this.f13945g;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f13945g = null;
        }
    }

    /* renamed from: a */
    public final int mo15842a(byte[] bArr, int i, int i2) throws C4933bl {
        try {
            if (this.f13950l != this.f13948j) {
                byte[] andSet = f13938o.getAndSet((Object) null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j = this.f13950l;
                    long j2 = this.f13948j;
                    if (j == j2) {
                        f13938o.set(andSet);
                        break;
                    }
                    int read = this.f13946h.read(andSet, 0, (int) Math.min(j2 - j, (long) andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f13950l += (long) read;
                        C5267kl<? super C4896al> klVar = this.f13943e;
                        if (klVar != null) {
                            klVar.mo18904h(this, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.f13949k;
            if (j3 != -1) {
                long j4 = j3 - this.f13951m;
                if (j4 != 0) {
                    i2 = (int) Math.min((long) i2, j4);
                }
                return -1;
            }
            int read2 = this.f13946h.read(bArr, i, i2);
            if (read2 != -1) {
                this.f13951m += (long) read2;
                C5267kl<? super C4896al> klVar2 = this.f13943e;
                if (klVar2 == null) {
                    return read2;
                }
                klVar2.mo18904h(this, read2);
                return read2;
            } else if (this.f13949k == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e) {
            throw new C4933bl(e, this.f13944f, 2);
        }
    }

    /* renamed from: b */
    public final Uri mo15843b() {
        HttpURLConnection httpURLConnection = this.f13945g;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f8, code lost:
        if (r3 != 0) goto L_0x00fd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01da  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo15844c(com.google.android.gms.internal.ads.C5747xk r21) throws com.google.android.gms.internal.ads.C4933bl {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            java.lang.String r3 = "Unable to connect to "
            r1.f13944f = r2
            r4 = 0
            r1.f13951m = r4
            r1.f13950l = r4
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x02ae }
            android.net.Uri r7 = r2.f25862a     // Catch:{ IOException -> 0x02ae }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x02ae }
            r0.<init>(r7)     // Catch:{ IOException -> 0x02ae }
            long r7 = r2.f25864c     // Catch:{ IOException -> 0x02ae }
            long r9 = r2.f25865d     // Catch:{ IOException -> 0x02ae }
            r12 = 0
        L_0x001e:
            int r13 = r12 + 1
            r14 = 20
            if (r12 > r14) goto L_0x0295
            java.net.URLConnection r12 = r0.openConnection()     // Catch:{ IOException -> 0x02ae }
            java.net.HttpURLConnection r12 = (java.net.HttpURLConnection) r12     // Catch:{ IOException -> 0x02ae }
            int r15 = r1.f13939a     // Catch:{ IOException -> 0x02ae }
            r12.setConnectTimeout(r15)     // Catch:{ IOException -> 0x02ae }
            int r15 = r1.f13940b     // Catch:{ IOException -> 0x02ae }
            r12.setReadTimeout(r15)     // Catch:{ IOException -> 0x02ae }
            com.google.android.gms.internal.ads.dl r15 = r1.f13942d     // Catch:{ IOException -> 0x02ae }
            java.util.Map r15 = r15.mo16944a()     // Catch:{ IOException -> 0x02ae }
            java.util.Set r15 = r15.entrySet()     // Catch:{ IOException -> 0x02ae }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ IOException -> 0x02ae }
        L_0x0042:
            boolean r16 = r15.hasNext()     // Catch:{ IOException -> 0x02ae }
            if (r16 == 0) goto L_0x0062
            java.lang.Object r16 = r15.next()     // Catch:{ IOException -> 0x02ae }
            java.util.Map$Entry r16 = (java.util.Map.Entry) r16     // Catch:{ IOException -> 0x02ae }
            java.lang.Object r17 = r16.getKey()     // Catch:{ IOException -> 0x02ae }
            r6 = r17
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x02ae }
            java.lang.Object r16 = r16.getValue()     // Catch:{ IOException -> 0x02ae }
            r11 = r16
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ IOException -> 0x02ae }
            r12.setRequestProperty(r6, r11)     // Catch:{ IOException -> 0x02ae }
            goto L_0x0042
        L_0x0062:
            r6 = 27
            r15 = -1
            int r11 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r11 != 0) goto L_0x006e
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L_0x00a5
        L_0x006e:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02ae }
            r11.<init>(r6)     // Catch:{ IOException -> 0x02ae }
            java.lang.String r6 = "bytes="
            r11.append(r6)     // Catch:{ IOException -> 0x02ae }
            r11.append(r7)     // Catch:{ IOException -> 0x02ae }
            java.lang.String r6 = "-"
            r11.append(r6)     // Catch:{ IOException -> 0x02ae }
            java.lang.String r6 = r11.toString()     // Catch:{ IOException -> 0x02ae }
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L_0x00a0
            long r18 = r7 + r9
            long r4 = r18 + r15
            int r11 = r6.length()     // Catch:{ IOException -> 0x02ae }
            int r11 = r11 + r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02ae }
            r14.<init>(r11)     // Catch:{ IOException -> 0x02ae }
            r14.append(r6)     // Catch:{ IOException -> 0x02ae }
            r14.append(r4)     // Catch:{ IOException -> 0x02ae }
            java.lang.String r6 = r14.toString()     // Catch:{ IOException -> 0x02ae }
        L_0x00a0:
            java.lang.String r4 = "Range"
            r12.setRequestProperty(r4, r6)     // Catch:{ IOException -> 0x02ae }
        L_0x00a5:
            java.lang.String r4 = "User-Agent"
            java.lang.String r5 = r1.f13941c     // Catch:{ IOException -> 0x02ae }
            r12.setRequestProperty(r4, r5)     // Catch:{ IOException -> 0x02ae }
            java.lang.String r4 = "Accept-Encoding"
            java.lang.String r5 = "identity"
            r12.setRequestProperty(r4, r5)     // Catch:{ IOException -> 0x02ae }
            r4 = 0
            r12.setInstanceFollowRedirects(r4)     // Catch:{ IOException -> 0x02ae }
            r12.setDoOutput(r4)     // Catch:{ IOException -> 0x02ae }
            r12.connect()     // Catch:{ IOException -> 0x02ae }
            int r4 = r12.getResponseCode()     // Catch:{ IOException -> 0x02ae }
            r5 = 300(0x12c, float:4.2E-43)
            if (r4 == r5) goto L_0x0244
            r5 = 301(0x12d, float:4.22E-43)
            if (r4 == r5) goto L_0x0244
            r5 = 302(0x12e, float:4.23E-43)
            if (r4 == r5) goto L_0x0244
            r5 = 303(0x12f, float:4.25E-43)
            if (r4 == r5) goto L_0x0244
            r5 = 307(0x133, float:4.3E-43)
            if (r4 == r5) goto L_0x0244
            r5 = 308(0x134, float:4.32E-43)
            if (r4 != r5) goto L_0x00db
            goto L_0x0244
        L_0x00db:
            r1.f13945g = r12     // Catch:{ IOException -> 0x02ae }
            int r0 = r12.getResponseCode()     // Catch:{ IOException -> 0x021d }
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 < r3) goto L_0x0201
            r4 = 299(0x12b, float:4.19E-43)
            if (r0 <= r4) goto L_0x00eb
            goto L_0x0201
        L_0x00eb:
            java.net.HttpURLConnection r4 = r1.f13945g
            r4.getContentType()
            if (r0 != r3) goto L_0x00fb
            long r3 = r2.f25864c
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00fb
            goto L_0x00fd
        L_0x00fb:
            r3 = 0
        L_0x00fd:
            r1.f13948j = r3
            long r3 = r2.f25865d
            int r0 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0109
            r1.f13949k = r3
            goto L_0x01e1
        L_0x0109:
            java.net.HttpURLConnection r0 = r1.f13945g
            java.lang.String r3 = "Content-Length"
            java.lang.String r3 = r0.getHeaderField(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r5 = "DefaultHttpDataSource"
            java.lang.String r6 = "]"
            if (r4 != 0) goto L_0x0141
            long r7 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x0120 }
            goto L_0x0142
        L_0x0120:
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r4 = r4 + 28
            r7.<init>(r4)
            java.lang.String r4 = "Unexpected Content-Length ["
            r7.append(r4)
            r7.append(r3)
            r7.append(r6)
            java.lang.String r4 = r7.toString()
            android.util.Log.e(r5, r4)
        L_0x0141:
            r7 = r15
        L_0x0142:
            java.lang.String r4 = "Content-Range"
            java.lang.String r0 = r0.getHeaderField(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x01d6
            java.util.regex.Pattern r4 = f13937n
            java.util.regex.Matcher r4 = r4.matcher(r0)
            boolean r9 = r4.find()
            if (r9 == 0) goto L_0x01d6
            r9 = 2
            java.lang.String r9 = r4.group(r9)     // Catch:{ NumberFormatException -> 0x01b4 }
            long r9 = java.lang.Long.parseLong(r9)     // Catch:{ NumberFormatException -> 0x01b4 }
            r11 = 1
            java.lang.String r4 = r4.group(r11)     // Catch:{ NumberFormatException -> 0x01b4 }
            long r11 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x01b4 }
            long r9 = r9 - r11
            r11 = 1
            long r9 = r9 + r11
            r18 = 0
            int r4 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r4 >= 0) goto L_0x0178
            r7 = r9
            goto L_0x01d6
        L_0x0178:
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x01d6
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ NumberFormatException -> 0x01b4 }
            int r4 = r4.length()     // Catch:{ NumberFormatException -> 0x01b4 }
            int r4 = r4 + 26
            java.lang.String r11 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01b4 }
            int r11 = r11.length()     // Catch:{ NumberFormatException -> 0x01b4 }
            int r4 = r4 + r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x01b4 }
            r11.<init>(r4)     // Catch:{ NumberFormatException -> 0x01b4 }
            java.lang.String r4 = "Inconsistent headers ["
            r11.append(r4)     // Catch:{ NumberFormatException -> 0x01b4 }
            r11.append(r3)     // Catch:{ NumberFormatException -> 0x01b4 }
            java.lang.String r3 = "] ["
            r11.append(r3)     // Catch:{ NumberFormatException -> 0x01b4 }
            r11.append(r0)     // Catch:{ NumberFormatException -> 0x01b4 }
            r11.append(r6)     // Catch:{ NumberFormatException -> 0x01b4 }
            java.lang.String r3 = r11.toString()     // Catch:{ NumberFormatException -> 0x01b4 }
            android.util.Log.w(r5, r3)     // Catch:{ NumberFormatException -> 0x01b4 }
            long r3 = java.lang.Math.max(r7, r9)     // Catch:{ NumberFormatException -> 0x01b4 }
            r7 = r3
            goto L_0x01d6
        L_0x01b4:
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r9 = 27
            int r3 = r3 + r9
            r4.<init>(r3)
            java.lang.String r3 = "Unexpected Content-Range ["
            r4.append(r3)
            r4.append(r0)
            r4.append(r6)
            java.lang.String r0 = r4.toString()
            android.util.Log.e(r5, r0)
        L_0x01d6:
            int r0 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x01de
            long r3 = r1.f13948j
            long r15 = r7 - r3
        L_0x01de:
            r3 = r15
            r1.f13949k = r3
        L_0x01e1:
            java.net.HttpURLConnection r0 = r1.f13945g     // Catch:{ IOException -> 0x01f6 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x01f6 }
            r1.f13946h = r0     // Catch:{ IOException -> 0x01f6 }
            r3 = 1
            r1.f13947i = r3
            com.google.android.gms.internal.ads.kl<? super com.google.android.gms.internal.ads.al> r0 = r1.f13943e
            if (r0 == 0) goto L_0x01f3
            r0.mo18905r(r1, r2)
        L_0x01f3:
            long r2 = r1.f13949k
            return r2
        L_0x01f6:
            r0 = move-exception
            r20.m20790d()
            com.google.android.gms.internal.ads.bl r3 = new com.google.android.gms.internal.ads.bl
            r4 = 1
            r3.<init>((java.io.IOException) r0, (com.google.android.gms.internal.ads.C5747xk) r2, (int) r4)
            throw r3
        L_0x0201:
            java.net.HttpURLConnection r3 = r1.f13945g
            java.util.Map r3 = r3.getHeaderFields()
            r20.m20790d()
            com.google.android.gms.internal.ads.cl r4 = new com.google.android.gms.internal.ads.cl
            r4.<init>(r0, r3, r2)
            r2 = 416(0x1a0, float:5.83E-43)
            if (r0 != r2) goto L_0x021c
            com.google.android.gms.internal.ads.wk r0 = new com.google.android.gms.internal.ads.wk
            r5 = 0
            r0.<init>(r5)
            r4.initCause(r0)
        L_0x021c:
            throw r4
        L_0x021d:
            r0 = move-exception
            r4 = r0
            r20.m20790d()
            com.google.android.gms.internal.ads.bl r0 = new com.google.android.gms.internal.ads.bl
            android.net.Uri r5 = r2.f25862a
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x0239
            java.lang.String r3 = r3.concat(r5)
            goto L_0x023f
        L_0x0239:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r3)
            r3 = r5
        L_0x023f:
            r5 = 1
            r0.<init>(r3, r4, r2, r5)
            throw r0
        L_0x0244:
            r5 = 0
            r18 = 0
            java.lang.String r4 = "Location"
            java.lang.String r4 = r12.getHeaderField(r4)     // Catch:{ IOException -> 0x02ae }
            r12.disconnect()     // Catch:{ IOException -> 0x02ae }
            if (r4 == 0) goto L_0x028d
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException -> 0x02ae }
            r6.<init>(r0, r4)     // Catch:{ IOException -> 0x02ae }
            java.lang.String r0 = r6.getProtocol()     // Catch:{ IOException -> 0x02ae }
            java.lang.String r4 = "https"
            boolean r4 = r4.equals(r0)     // Catch:{ IOException -> 0x02ae }
            if (r4 != 0) goto L_0x0287
            java.lang.String r4 = "http"
            boolean r4 = r4.equals(r0)     // Catch:{ IOException -> 0x02ae }
            if (r4 != 0) goto L_0x0287
            java.net.ProtocolException r4 = new java.net.ProtocolException     // Catch:{ IOException -> 0x02ae }
            java.lang.String r5 = "Unsupported protocol redirect: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x02ae }
            int r6 = r0.length()     // Catch:{ IOException -> 0x02ae }
            if (r6 == 0) goto L_0x027e
            java.lang.String r0 = r5.concat(r0)     // Catch:{ IOException -> 0x02ae }
            goto L_0x0283
        L_0x027e:
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x02ae }
            r0.<init>(r5)     // Catch:{ IOException -> 0x02ae }
        L_0x0283:
            r4.<init>(r0)     // Catch:{ IOException -> 0x02ae }
            throw r4     // Catch:{ IOException -> 0x02ae }
        L_0x0287:
            r0 = r6
            r12 = r13
            r4 = r18
            goto L_0x001e
        L_0x028d:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x02ae }
            java.lang.String r4 = "Null location redirect"
            r0.<init>(r4)     // Catch:{ IOException -> 0x02ae }
            throw r0     // Catch:{ IOException -> 0x02ae }
        L_0x0295:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x02ae }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02ae }
            r5 = 31
            r4.<init>(r5)     // Catch:{ IOException -> 0x02ae }
            java.lang.String r5 = "Too many redirects: "
            r4.append(r5)     // Catch:{ IOException -> 0x02ae }
            r4.append(r13)     // Catch:{ IOException -> 0x02ae }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x02ae }
            r0.<init>(r4)     // Catch:{ IOException -> 0x02ae }
            throw r0     // Catch:{ IOException -> 0x02ae }
        L_0x02ae:
            r0 = move-exception
            com.google.android.gms.internal.ads.bl r4 = new com.google.android.gms.internal.ads.bl
            android.net.Uri r5 = r2.f25862a
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x02c6
            java.lang.String r3 = r3.concat(r5)
            goto L_0x02cc
        L_0x02c6:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r3)
            r3 = r5
        L_0x02cc:
            r5 = 1
            r4.<init>(r3, r0, r2, r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4896al.mo15844c(com.google.android.gms.internal.ads.xk):long");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:4|(1:6)(1:7)|8|9|(5:13|14|(2:16|(1:18))(2:19|(1:21))|22|(1:26))|27|28) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0067 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15845f() throws com.google.android.gms.internal.ads.C4933bl {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.f13946h     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x0077
            java.net.HttpURLConnection r2 = r9.f13945g     // Catch:{ all -> 0x0083 }
            long r3 = r9.f13949k     // Catch:{ all -> 0x0083 }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0011
            goto L_0x0014
        L_0x0011:
            long r7 = r9.f13951m     // Catch:{ all -> 0x0083 }
            long r3 = r3 - r7
        L_0x0014:
            int r7 = com.google.android.gms.internal.ads.C4934bm.f14552a     // Catch:{ all -> 0x0083 }
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
            java.io.InputStream r2 = r9.f13946h     // Catch:{ IOException -> 0x006d }
            r2.close()     // Catch:{ IOException -> 0x006d }
            goto L_0x0077
        L_0x006d:
            r2 = move-exception
            com.google.android.gms.internal.ads.bl r3 = new com.google.android.gms.internal.ads.bl     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.xk r4 = r9.f13944f     // Catch:{ all -> 0x0083 }
            r5 = 3
            r3.<init>((java.io.IOException) r2, (com.google.android.gms.internal.ads.C5747xk) r4, (int) r5)     // Catch:{ all -> 0x0083 }
            throw r3     // Catch:{ all -> 0x0083 }
        L_0x0077:
            r9.f13946h = r0
            r9.m20790d()
            boolean r0 = r9.f13947i
            if (r0 == 0) goto L_0x0082
            r9.f13947i = r1
        L_0x0082:
            return
        L_0x0083:
            r2 = move-exception
            r9.f13946h = r0
            r9.m20790d()
            boolean r0 = r9.f13947i
            if (r0 == 0) goto L_0x008f
            r9.f13947i = r1
        L_0x008f:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4896al.mo15845f():void");
    }

    public final Map<String, List<String>> zze() {
        HttpURLConnection httpURLConnection = this.f13945g;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
