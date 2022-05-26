package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.p6 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5437p6 implements C4954c5 {

    /* renamed from: a */
    private final Map<String, C5326m6> f21346a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b */
    private long f21347b = 0;

    /* renamed from: c */
    private final C5400o6 f21348c;

    /* renamed from: d */
    private final int f21349d;

    public C5437p6(C5400o6 o6Var, int i) {
        this.f21348c = o6Var;
        this.f21349d = 5242880;
    }

    /* renamed from: b */
    static int m28893b(InputStream inputStream) throws IOException {
        return (m28900k(inputStream) << 24) | m28900k(inputStream) | (m28900k(inputStream) << 8) | (m28900k(inputStream) << 16);
    }

    /* renamed from: c */
    static long m28894c(InputStream inputStream) throws IOException {
        return (((long) m28900k(inputStream)) & 255) | ((((long) m28900k(inputStream)) & 255) << 8) | ((((long) m28900k(inputStream)) & 255) << 16) | ((((long) m28900k(inputStream)) & 255) << 24) | ((((long) m28900k(inputStream)) & 255) << 32) | ((((long) m28900k(inputStream)) & 255) << 40) | ((((long) m28900k(inputStream)) & 255) << 48) | ((255 & ((long) m28900k(inputStream))) << 56);
    }

    /* renamed from: e */
    static String m28895e(C5363n6 n6Var) throws IOException {
        return new String(m28899j(n6Var, m28894c(n6Var)), "UTF-8");
    }

    /* renamed from: g */
    static void m28896g(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* renamed from: h */
    static void m28897h(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    /* renamed from: i */
    static void m28898i(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        m28897h(outputStream, (long) length);
        outputStream.write(bytes, 0, length);
    }

    /* renamed from: j */
    static byte[] m28899j(C5363n6 n6Var, long j) throws IOException {
        long c = n6Var.mo19613c();
        if (j >= 0 && j <= c) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(n6Var).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(c);
        throw new IOException(sb.toString());
    }

    /* renamed from: k */
    private static int m28900k(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: l */
    private final void m28901l(String str, C5326m6 m6Var) {
        if (!this.f21346a.containsKey(str)) {
            this.f21347b += m6Var.f19780a;
        } else {
            this.f21347b += m6Var.f19780a - this.f21346a.get(str).f19780a;
        }
        this.f21346a.put(str, m6Var);
    }

    /* renamed from: m */
    private final void m28902m(String str) {
        C5326m6 remove = this.f21346a.remove(str);
        if (remove != null) {
            this.f21347b -= remove.f19780a;
        }
    }

    /* renamed from: n */
    private static final String m28903n(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x005a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo16494a() {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.o6 r0 = r9.f21348c     // Catch:{ all -> 0x0062 }
            java.io.File r0 = r0.zza()     // Catch:{ all -> 0x0062 }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x0062 }
            r2 = 0
            if (r1 != 0) goto L_0x0026
            boolean r1 = r0.mkdirs()     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x0024
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0062 }
            r1[r2] = r0     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = "Unable to create cache dir %s"
            com.google.android.gms.internal.ads.C5066f6.m23481b(r0, r1)     // Catch:{ all -> 0x0062 }
            monitor-exit(r9)
            return
        L_0x0024:
            monitor-exit(r9)
            return
        L_0x0026:
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x0062 }
            if (r0 != 0) goto L_0x002e
            monitor-exit(r9)
            return
        L_0x002e:
            int r1 = r0.length     // Catch:{ all -> 0x0062 }
        L_0x002f:
            if (r2 >= r1) goto L_0x0060
            r3 = r0[r2]     // Catch:{ all -> 0x0062 }
            long r4 = r3.length()     // Catch:{ IOException -> 0x005a }
            com.google.android.gms.internal.ads.n6 r6 = new com.google.android.gms.internal.ads.n6     // Catch:{ IOException -> 0x005a }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x005a }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ IOException -> 0x005a }
            r8.<init>(r3)     // Catch:{ IOException -> 0x005a }
            r7.<init>(r8)     // Catch:{ IOException -> 0x005a }
            r6.<init>(r7, r4)     // Catch:{ IOException -> 0x005a }
            com.google.android.gms.internal.ads.m6 r7 = com.google.android.gms.internal.ads.C5326m6.m27158a(r6)     // Catch:{ all -> 0x0055 }
            r7.f19780a = r4     // Catch:{ all -> 0x0055 }
            java.lang.String r4 = r7.f19781b     // Catch:{ all -> 0x0055 }
            r9.m28901l(r4, r7)     // Catch:{ all -> 0x0055 }
            r6.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x005d
        L_0x0055:
            r4 = move-exception
            r6.close()     // Catch:{ IOException -> 0x005a }
            throw r4     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            r3.delete()     // Catch:{ all -> 0x0062 }
        L_0x005d:
            int r2 = r2 + 1
            goto L_0x002f
        L_0x0060:
            monitor-exit(r9)
            return
        L_0x0062:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5437p6.mo16494a():void");
    }

    /* renamed from: d */
    public final File mo20223d(String str) {
        return new File(this.f21348c.zza(), m28903n(str));
    }

    /* renamed from: f */
    public final synchronized void mo20224f(String str) {
        boolean delete = mo20223d(str).delete();
        m28902m(str);
        if (!delete) {
            C5066f6.m23480a("Could not delete cache entry for key=%s, filename=%s", str, m28903n(str));
        }
    }

    /* renamed from: p */
    public final synchronized C4917b5 mo16495p(String str) {
        C5363n6 n6Var;
        C5326m6 m6Var = this.f21346a.get(str);
        if (m6Var == null) {
            return null;
        }
        File d = mo20223d(str);
        try {
            n6Var = new C5363n6(new BufferedInputStream(new FileInputStream(d)), d.length());
            C5326m6 a = C5326m6.m27158a(n6Var);
            if (!TextUtils.equals(str, a.f19781b)) {
                C5066f6.m23480a("%s: key=%s, found=%s", d.getAbsolutePath(), str, a.f19781b);
                m28902m(str);
                n6Var.close();
                return null;
            }
            byte[] j = m28899j(n6Var, n6Var.mo19613c());
            C4917b5 b5Var = new C4917b5();
            b5Var.f14318a = j;
            b5Var.f14319b = m6Var.f19782c;
            b5Var.f14320c = m6Var.f19783d;
            b5Var.f14321d = m6Var.f19784e;
            b5Var.f14322e = m6Var.f19785f;
            b5Var.f14323f = m6Var.f19786g;
            List<C5251k5> list = m6Var.f19787h;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (C5251k5 next : list) {
                treeMap.put(next.mo18836a(), next.mo18837b());
            }
            b5Var.f14324g = treeMap;
            b5Var.f14325h = Collections.unmodifiableList(m6Var.f19787h);
            n6Var.close();
            return b5Var;
        } catch (IOException e) {
            C5066f6.m23480a("%s: %s", d.getAbsolutePath(), e.toString());
            mo20224f(str);
            return null;
        } catch (Throwable th) {
            n6Var.close();
            throw th;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x016e */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo16496q(java.lang.String r16, com.google.android.gms.internal.ads.C4917b5 r17) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r2 = r17
            monitor-enter(r15)
            long r3 = r1.f21347b     // Catch:{ all -> 0x01a4 }
            byte[] r5 = r2.f14318a     // Catch:{ all -> 0x01a4 }
            int r5 = r5.length     // Catch:{ all -> 0x01a4 }
            int r6 = r1.f21349d     // Catch:{ all -> 0x01a4 }
            long r7 = (long) r5
            long r3 = r3 + r7
            long r7 = (long) r6
            r9 = 1063675494(0x3f666666, float:0.9)
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x0022
            float r3 = (float) r5
            float r4 = (float) r6
            float r4 = r4 * r9
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            monitor-exit(r15)
            return
        L_0x0022:
            java.io.File r3 = r15.mo20223d(r16)     // Catch:{ all -> 0x01a4 }
            r4 = 1
            r5 = 0
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x016e }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x016e }
            r7.<init>(r3)     // Catch:{ IOException -> 0x016e }
            r6.<init>(r7)     // Catch:{ IOException -> 0x016e }
            com.google.android.gms.internal.ads.m6 r7 = new com.google.android.gms.internal.ads.m6     // Catch:{ IOException -> 0x016e }
            r7.<init>(r0, r2)     // Catch:{ IOException -> 0x016e }
            r8 = 538247942(0x20150306, float:1.2621791E-19)
            m28896g(r6, r8)     // Catch:{ IOException -> 0x014a }
            java.lang.String r8 = r7.f19781b     // Catch:{ IOException -> 0x014a }
            m28898i(r6, r8)     // Catch:{ IOException -> 0x014a }
            java.lang.String r8 = r7.f19782c     // Catch:{ IOException -> 0x014a }
            if (r8 != 0) goto L_0x0048
            java.lang.String r8 = ""
        L_0x0048:
            m28898i(r6, r8)     // Catch:{ IOException -> 0x014a }
            long r10 = r7.f19783d     // Catch:{ IOException -> 0x014a }
            m28897h(r6, r10)     // Catch:{ IOException -> 0x014a }
            long r10 = r7.f19784e     // Catch:{ IOException -> 0x014a }
            m28897h(r6, r10)     // Catch:{ IOException -> 0x014a }
            long r10 = r7.f19785f     // Catch:{ IOException -> 0x014a }
            m28897h(r6, r10)     // Catch:{ IOException -> 0x014a }
            long r10 = r7.f19786g     // Catch:{ IOException -> 0x014a }
            m28897h(r6, r10)     // Catch:{ IOException -> 0x014a }
            java.util.List<com.google.android.gms.internal.ads.k5> r8 = r7.f19787h     // Catch:{ IOException -> 0x014a }
            if (r8 == 0) goto L_0x0089
            int r10 = r8.size()     // Catch:{ IOException -> 0x014a }
            m28896g(r6, r10)     // Catch:{ IOException -> 0x014a }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ IOException -> 0x014a }
        L_0x006e:
            boolean r10 = r8.hasNext()     // Catch:{ IOException -> 0x014a }
            if (r10 == 0) goto L_0x008c
            java.lang.Object r10 = r8.next()     // Catch:{ IOException -> 0x014a }
            com.google.android.gms.internal.ads.k5 r10 = (com.google.android.gms.internal.ads.C5251k5) r10     // Catch:{ IOException -> 0x014a }
            java.lang.String r11 = r10.mo18836a()     // Catch:{ IOException -> 0x014a }
            m28898i(r6, r11)     // Catch:{ IOException -> 0x014a }
            java.lang.String r10 = r10.mo18837b()     // Catch:{ IOException -> 0x014a }
            m28898i(r6, r10)     // Catch:{ IOException -> 0x014a }
            goto L_0x006e
        L_0x0089:
            m28896g(r6, r5)     // Catch:{ IOException -> 0x014a }
        L_0x008c:
            r6.flush()     // Catch:{ IOException -> 0x014a }
            byte[] r2 = r2.f14318a     // Catch:{ IOException -> 0x016e }
            r6.write(r2)     // Catch:{ IOException -> 0x016e }
            r6.close()     // Catch:{ IOException -> 0x016e }
            long r10 = r3.length()     // Catch:{ IOException -> 0x016e }
            r7.f19780a = r10     // Catch:{ IOException -> 0x016e }
            r15.m28901l(r0, r7)     // Catch:{ IOException -> 0x016e }
            long r6 = r1.f21347b     // Catch:{ IOException -> 0x016e }
            int r0 = r1.f21349d     // Catch:{ IOException -> 0x016e }
            long r10 = (long) r0     // Catch:{ IOException -> 0x016e }
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ab
            goto L_0x01a2
        L_0x00ab:
            boolean r0 = com.google.android.gms.internal.ads.C5066f6.f16447b     // Catch:{ IOException -> 0x016e }
            if (r0 == 0) goto L_0x00b6
            java.lang.String r0 = "Pruning old cache entries."
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x016e }
            com.google.android.gms.internal.ads.C5066f6.m23483d(r0, r2)     // Catch:{ IOException -> 0x016e }
        L_0x00b6:
            long r6 = r1.f21347b     // Catch:{ IOException -> 0x016e }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x016e }
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.m6> r0 = r1.f21346a     // Catch:{ IOException -> 0x016e }
            java.util.Set r0 = r0.entrySet()     // Catch:{ IOException -> 0x016e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x016e }
            r2 = 0
        L_0x00c7:
            boolean r8 = r0.hasNext()     // Catch:{ IOException -> 0x016e }
            r12 = 2
            if (r8 == 0) goto L_0x011e
            java.lang.Object r8 = r0.next()     // Catch:{ IOException -> 0x016e }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ IOException -> 0x016e }
            java.lang.Object r8 = r8.getValue()     // Catch:{ IOException -> 0x016e }
            com.google.android.gms.internal.ads.m6 r8 = (com.google.android.gms.internal.ads.C5326m6) r8     // Catch:{ IOException -> 0x016e }
            java.lang.String r13 = r8.f19781b     // Catch:{ IOException -> 0x016e }
            java.io.File r13 = r15.mo20223d(r13)     // Catch:{ IOException -> 0x016e }
            boolean r13 = r13.delete()     // Catch:{ IOException -> 0x016e }
            if (r13 == 0) goto L_0x00f0
            long r13 = r1.f21347b     // Catch:{ IOException -> 0x016e }
            r16 = r10
            long r9 = r8.f19780a     // Catch:{ IOException -> 0x016e }
            long r13 = r13 - r9
            r1.f21347b = r13     // Catch:{ IOException -> 0x016e }
            goto L_0x0103
        L_0x00f0:
            r16 = r10
            java.lang.String r9 = "Could not delete cache entry for key=%s, filename=%s"
            java.lang.Object[] r10 = new java.lang.Object[r12]     // Catch:{ IOException -> 0x016e }
            java.lang.String r8 = r8.f19781b     // Catch:{ IOException -> 0x016e }
            r10[r5] = r8     // Catch:{ IOException -> 0x016e }
            java.lang.String r8 = m28903n(r8)     // Catch:{ IOException -> 0x016e }
            r10[r4] = r8     // Catch:{ IOException -> 0x016e }
            com.google.android.gms.internal.ads.C5066f6.m23480a(r9, r10)     // Catch:{ IOException -> 0x016e }
        L_0x0103:
            r0.remove()     // Catch:{ IOException -> 0x016e }
            int r2 = r2 + 1
            long r8 = r1.f21347b     // Catch:{ IOException -> 0x016e }
            float r8 = (float) r8     // Catch:{ IOException -> 0x016e }
            int r9 = r1.f21349d     // Catch:{ IOException -> 0x016e }
            float r9 = (float) r9     // Catch:{ IOException -> 0x016e }
            r10 = 1063675494(0x3f666666, float:0.9)
            float r9 = r9 * r10
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x0118
            goto L_0x0120
        L_0x0118:
            r10 = r16
            r9 = 1063675494(0x3f666666, float:0.9)
            goto L_0x00c7
        L_0x011e:
            r16 = r10
        L_0x0120:
            boolean r0 = com.google.android.gms.internal.ads.C5066f6.f16447b     // Catch:{ IOException -> 0x016e }
            if (r0 == 0) goto L_0x01a2
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IOException -> 0x016e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x016e }
            r0[r5] = r2     // Catch:{ IOException -> 0x016e }
            long r8 = r1.f21347b     // Catch:{ IOException -> 0x016e }
            long r8 = r8 - r6
            java.lang.Long r2 = java.lang.Long.valueOf(r8)     // Catch:{ IOException -> 0x016e }
            r0[r4] = r2     // Catch:{ IOException -> 0x016e }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x016e }
            r8 = r16
            long r6 = r6 - r8
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ IOException -> 0x016e }
            r0[r12] = r2     // Catch:{ IOException -> 0x016e }
            java.lang.String r2 = "pruned %d files, %d bytes, %d ms"
            com.google.android.gms.internal.ads.C5066f6.m23483d(r2, r0)     // Catch:{ IOException -> 0x016e }
            monitor-exit(r15)
            return
        L_0x014a:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x016e }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x016e }
            r2[r5] = r0     // Catch:{ IOException -> 0x016e }
            java.lang.String r0 = "%s"
            com.google.android.gms.internal.ads.C5066f6.m23480a(r0, r2)     // Catch:{ IOException -> 0x016e }
            r6.close()     // Catch:{ IOException -> 0x016e }
            java.lang.String r0 = "Failed to write header for %s"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x016e }
            java.lang.String r6 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x016e }
            r2[r5] = r6     // Catch:{ IOException -> 0x016e }
            com.google.android.gms.internal.ads.C5066f6.m23480a(r0, r2)     // Catch:{ IOException -> 0x016e }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x016e }
            r0.<init>()     // Catch:{ IOException -> 0x016e }
            throw r0     // Catch:{ IOException -> 0x016e }
        L_0x016e:
            boolean r0 = r3.delete()     // Catch:{ all -> 0x01a4 }
            if (r0 != 0) goto L_0x0181
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x01a4 }
            java.lang.String r2 = r3.getAbsolutePath()     // Catch:{ all -> 0x01a4 }
            r0[r5] = r2     // Catch:{ all -> 0x01a4 }
            java.lang.String r2 = "Could not clean up file %s"
            com.google.android.gms.internal.ads.C5066f6.m23480a(r2, r0)     // Catch:{ all -> 0x01a4 }
        L_0x0181:
            com.google.android.gms.internal.ads.o6 r0 = r1.f21348c     // Catch:{ all -> 0x01a4 }
            java.io.File r0 = r0.zza()     // Catch:{ all -> 0x01a4 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x01a4 }
            if (r0 != 0) goto L_0x01a2
            java.lang.String r0 = "Re-initializing cache after external clearing."
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x01a4 }
            com.google.android.gms.internal.ads.C5066f6.m23480a(r0, r2)     // Catch:{ all -> 0x01a4 }
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.m6> r0 = r1.f21346a     // Catch:{ all -> 0x01a4 }
            r0.clear()     // Catch:{ all -> 0x01a4 }
            r2 = 0
            r1.f21347b = r2     // Catch:{ all -> 0x01a4 }
            r15.mo16494a()     // Catch:{ all -> 0x01a4 }
            monitor-exit(r15)
            return
        L_0x01a2:
            monitor-exit(r15)
            return
        L_0x01a4:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5437p6.mo16496q(java.lang.String, com.google.android.gms.internal.ads.b5):void");
    }

    /* renamed from: r */
    public final synchronized void mo16497r(String str, boolean z) {
        C4917b5 p = mo16495p(str);
        if (p != null) {
            p.f14323f = 0;
            p.f14322e = 0;
            mo16496q(str, p);
        }
    }

    public C5437p6(File file, int i) {
        this.f21348c = new C5289l6(this, file);
        this.f21349d = 20971520;
    }
}
