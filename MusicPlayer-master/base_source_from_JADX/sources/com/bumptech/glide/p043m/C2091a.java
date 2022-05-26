package com.bumptech.glide.p043m;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bumptech.glide.m.a */
/* compiled from: DiskLruCache */
public final class C2091a implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final File f7168g;

    /* renamed from: h */
    private final File f7169h;

    /* renamed from: i */
    private final File f7170i;

    /* renamed from: j */
    private final File f7171j;

    /* renamed from: k */
    private final int f7172k;

    /* renamed from: l */
    private long f7173l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final int f7174m;

    /* renamed from: n */
    private long f7175n = 0;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Writer f7176o;

    /* renamed from: p */
    private final LinkedHashMap<String, C2095d> f7177p = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f7178q;

    /* renamed from: r */
    private long f7179r = 0;

    /* renamed from: s */
    final ThreadPoolExecutor f7180s = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C2093b((C2092a) null));

    /* renamed from: t */
    private final Callable<Void> f7181t = new C2092a();

    /* renamed from: com.bumptech.glide.m.a$a */
    /* compiled from: DiskLruCache */
    class C2092a implements Callable<Void> {
        C2092a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() throws java.lang.Exception {
            /*
                r4 = this;
                com.bumptech.glide.m.a r0 = com.bumptech.glide.p043m.C2091a.this
                monitor-enter(r0)
                com.bumptech.glide.m.a r1 = com.bumptech.glide.p043m.C2091a.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.f7176o     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                com.bumptech.glide.m.a r1 = com.bumptech.glide.p043m.C2091a.this     // Catch:{ all -> 0x0028 }
                r1.m9782S0()     // Catch:{ all -> 0x0028 }
                com.bumptech.glide.m.a r1 = com.bumptech.glide.p043m.C2091a.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.m9772F0()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                com.bumptech.glide.m.a r1 = com.bumptech.glide.p043m.C2091a.this     // Catch:{ all -> 0x0028 }
                r1.m9779P0()     // Catch:{ all -> 0x0028 }
                com.bumptech.glide.m.a r1 = com.bumptech.glide.p043m.C2091a.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                int unused = r1.f7178q = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p043m.C2091a.C2092a.call():java.lang.Void");
        }
    }

    /* renamed from: com.bumptech.glide.m.a$b */
    /* compiled from: DiskLruCache */
    private static final class C2093b implements ThreadFactory {
        private C2093b() {
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ C2093b(C2092a aVar) {
            this();
        }
    }

    /* renamed from: com.bumptech.glide.m.a$c */
    /* compiled from: DiskLruCache */
    public final class C2094c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C2095d f7183a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean[] f7184b;

        /* renamed from: c */
        private boolean f7185c;

        /* synthetic */ C2094c(C2091a aVar, C2095d dVar, C2092a aVar2) {
            this(dVar);
        }

        /* renamed from: a */
        public void mo8245a() throws IOException {
            C2091a.this.m9787i0(this, false);
        }

        /* renamed from: b */
        public void mo8246b() {
            if (!this.f7185c) {
                try {
                    mo8245a();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: e */
        public void mo8247e() throws IOException {
            C2091a.this.m9787i0(this, true);
            this.f7185c = true;
        }

        /* renamed from: f */
        public File mo8248f(int i) throws IOException {
            File k;
            synchronized (C2091a.this) {
                if (this.f7183a.f7192f == this) {
                    if (!this.f7183a.f7191e) {
                        this.f7184b[i] = true;
                    }
                    k = this.f7183a.mo8250k(i);
                    C2091a.this.f7168g.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return k;
        }

        private C2094c(C2095d dVar) {
            this.f7183a = dVar;
            this.f7184b = dVar.f7191e ? null : new boolean[C2091a.this.f7174m];
        }
    }

    /* renamed from: com.bumptech.glide.m.a$d */
    /* compiled from: DiskLruCache */
    private final class C2095d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f7187a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long[] f7188b;

        /* renamed from: c */
        File[] f7189c;

        /* renamed from: d */
        File[] f7190d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f7191e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C2094c f7192f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public long f7193g;

        /* synthetic */ C2095d(C2091a aVar, String str, C2092a aVar2) {
            this(str);
        }

        /* renamed from: m */
        private IOException m9813m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public void m9814n(String[] strArr) throws IOException {
            if (strArr.length == C2091a.this.f7174m) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f7188b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        m9813m(strArr);
                        throw null;
                    }
                }
                return;
            }
            m9813m(strArr);
            throw null;
        }

        /* renamed from: j */
        public File mo8249j(int i) {
            return this.f7189c[i];
        }

        /* renamed from: k */
        public File mo8250k(int i) {
            return this.f7190d[i];
        }

        /* renamed from: l */
        public String mo8251l() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f7188b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        private C2095d(String str) {
            this.f7187a = str;
            this.f7188b = new long[C2091a.this.f7174m];
            this.f7189c = new File[C2091a.this.f7174m];
            this.f7190d = new File[C2091a.this.f7174m];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < C2091a.this.f7174m; i++) {
                sb.append(i);
                this.f7189c[i] = new File(C2091a.this.f7168g, sb.toString());
                sb.append(".tmp");
                this.f7190d[i] = new File(C2091a.this.f7168g, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* renamed from: com.bumptech.glide.m.a$e */
    /* compiled from: DiskLruCache */
    public final class C2096e {

        /* renamed from: a */
        private final File[] f7195a;

        /* synthetic */ C2096e(C2091a aVar, String str, long j, File[] fileArr, long[] jArr, C2092a aVar2) {
            this(aVar, str, j, fileArr, jArr);
        }

        /* renamed from: a */
        public File mo8252a(int i) {
            return this.f7195a[i];
        }

        private C2096e(C2091a aVar, String str, long j, File[] fileArr, long[] jArr) {
            this.f7195a = fileArr;
        }
    }

    private C2091a(File file, int i, int i2, long j) {
        File file2 = file;
        this.f7168g = file2;
        this.f7172k = i;
        this.f7169h = new File(file2, "journal");
        this.f7170i = new File(file2, "journal.tmp");
        this.f7171j = new File(file2, "journal.bkp");
        this.f7174m = i2;
        this.f7173l = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: F0 */
    public boolean m9772F0() {
        int i = this.f7178q;
        return i >= 2000 && i >= this.f7177p.size();
    }

    /* renamed from: H0 */
    public static C2091a m9774H0(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m9781R0(file2, file3, false);
                }
            }
            C2091a aVar = new C2091a(file, i, i2, j);
            if (aVar.f7169h.exists()) {
                try {
                    aVar.m9777N0();
                    aVar.m9776L0();
                    return aVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    aVar.mo8240m0();
                }
            }
            file.mkdirs();
            C2091a aVar2 = new C2091a(file, i, i2, j);
            aVar2.m9779P0();
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: L0 */
    private void m9776L0() throws IOException {
        m9788n0(this.f7170i);
        Iterator<C2095d> it = this.f7177p.values().iterator();
        while (it.hasNext()) {
            C2095d next = it.next();
            int i = 0;
            if (next.f7192f == null) {
                while (i < this.f7174m) {
                    this.f7175n += next.f7188b[i];
                    i++;
                }
            } else {
                C2094c unused = next.f7192f = null;
                while (i < this.f7174m) {
                    m9788n0(next.mo8249j(i));
                    m9788n0(next.mo8250k(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f7178q = r0 - r9.f7177p.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.mo8254p() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        m9779P0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9.f7176o = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f7169h, true), com.bumptech.glide.p043m.C2099c.f7202a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008c=Splitter:B:23:0x008c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* renamed from: N0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9777N0() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            com.bumptech.glide.m.b r1 = new com.bumptech.glide.m.b
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f7169h
            r2.<init>(r3)
            java.nio.charset.Charset r3 = com.bumptech.glide.p043m.C2099c.f7202a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo8255x()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r1.mo8255x()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r1.mo8255x()     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r1.mo8255x()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r1.mo8255x()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            int r7 = r9.f7172k     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ba }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            int r4 = r9.f7174m     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ba }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.mo8255x()     // Catch:{ EOFException -> 0x005f }
            r9.m9778O0(r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.m.a$d> r2 = r9.f7177p     // Catch:{ all -> 0x00ba }
            int r2 = r2.size()     // Catch:{ all -> 0x00ba }
            int r0 = r0 - r2
            r9.f7178q = r0     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.mo8254p()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0072
            r9.m9779P0()     // Catch:{ all -> 0x00ba }
            goto L_0x0088
        L_0x0072:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ba }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ba }
            java.io.File r4 = r9.f7169h     // Catch:{ all -> 0x00ba }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r4 = com.bumptech.glide.p043m.C2099c.f7202a     // Catch:{ all -> 0x00ba }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00ba }
            r0.<init>(r2)     // Catch:{ all -> 0x00ba }
            r9.f7176o = r0     // Catch:{ all -> 0x00ba }
        L_0x0088:
            com.bumptech.glide.p043m.C2099c.m9823a(r1)
            return
        L_0x008c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            r7.append(r2)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r3)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r5)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ba }
            r4.<init>(r0)     // Catch:{ all -> 0x00ba }
            throw r4     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            com.bumptech.glide.p043m.C2099c.m9823a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p043m.C2091a.m9777N0():void");
    }

    /* renamed from: O0 */
    private void m9778O0(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f7177p.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C2095d dVar = this.f7177p.get(str2);
            if (dVar == null) {
                dVar = new C2095d(this, str2, (C2092a) null);
                this.f7177p.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                boolean unused = dVar.f7191e = true;
                C2094c unused2 = dVar.f7192f = null;
                dVar.m9814n(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                C2094c unused3 = dVar.f7192f = new C2094c(this, dVar, (C2092a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: P0 */
    public synchronized void m9779P0() throws IOException {
        Writer writer = this.f7176o;
        if (writer != null) {
            m9784Y(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f7170i), C2099c.f7202a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f7172k));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f7174m));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C2095d next : this.f7177p.values()) {
                if (next.f7192f != null) {
                    bufferedWriter.write("DIRTY " + next.f7187a + 10);
                } else {
                    bufferedWriter.write("CLEAN " + next.f7187a + next.mo8251l() + 10);
                }
            }
            m9784Y(bufferedWriter);
            if (this.f7169h.exists()) {
                m9781R0(this.f7169h, this.f7171j, true);
            }
            m9781R0(this.f7170i, this.f7169h, false);
            this.f7171j.delete();
            this.f7176o = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f7169h, true), C2099c.f7202a));
        } catch (Throwable th) {
            m9784Y(bufferedWriter);
            throw th;
        }
    }

    /* renamed from: R0 */
    private static void m9781R0(File file, File file2, boolean z) throws IOException {
        if (z) {
            m9788n0(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S0 */
    public void m9782S0() throws IOException {
        while (this.f7175n > this.f7173l) {
            mo8238Q0((String) this.f7177p.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: T */
    private void m9783T() {
        if (this.f7176o == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @TargetApi(26)
    /* renamed from: Y */
    private static void m9784Y(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
        return;
     */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m9787i0(com.bumptech.glide.p043m.C2091a.C2094c r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            com.bumptech.glide.m.a$d r0 = r10.f7183a     // Catch:{ all -> 0x010e }
            com.bumptech.glide.m.a$c r1 = r0.f7192f     // Catch:{ all -> 0x010e }
            if (r1 != r10) goto L_0x0108
            r1 = 0
            if (r11 == 0) goto L_0x004d
            boolean r2 = r0.f7191e     // Catch:{ all -> 0x010e }
            if (r2 != 0) goto L_0x004d
            r2 = 0
        L_0x0015:
            int r3 = r9.f7174m     // Catch:{ all -> 0x010e }
            if (r2 >= r3) goto L_0x004d
            boolean[] r3 = r10.f7184b     // Catch:{ all -> 0x010e }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x010e }
            if (r3 == 0) goto L_0x0033
            java.io.File r3 = r0.mo8250k(r2)     // Catch:{ all -> 0x010e }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x010e }
            if (r3 != 0) goto L_0x0030
            r10.mo8245a()     // Catch:{ all -> 0x010e }
            monitor-exit(r9)
            return
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0033:
            r10.mo8245a()     // Catch:{ all -> 0x010e }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x010e }
            r11.<init>()     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x010e }
            r11.append(r2)     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x010e }
            r10.<init>(r11)     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x004d:
            int r10 = r9.f7174m     // Catch:{ all -> 0x010e }
            if (r1 >= r10) goto L_0x0081
            java.io.File r10 = r0.mo8250k(r1)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x007b
            boolean r2 = r10.exists()     // Catch:{ all -> 0x010e }
            if (r2 == 0) goto L_0x007e
            java.io.File r2 = r0.mo8249j(r1)     // Catch:{ all -> 0x010e }
            r10.renameTo(r2)     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f7188b     // Catch:{ all -> 0x010e }
            r3 = r10[r1]     // Catch:{ all -> 0x010e }
            long r5 = r2.length()     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f7188b     // Catch:{ all -> 0x010e }
            r10[r1] = r5     // Catch:{ all -> 0x010e }
            long r7 = r9.f7175n     // Catch:{ all -> 0x010e }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f7175n = r7     // Catch:{ all -> 0x010e }
            goto L_0x007e
        L_0x007b:
            m9788n0(r10)     // Catch:{ all -> 0x010e }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x0081:
            int r10 = r9.f7178q     // Catch:{ all -> 0x010e }
            r1 = 1
            int r10 = r10 + r1
            r9.f7178q = r10     // Catch:{ all -> 0x010e }
            r10 = 0
            com.bumptech.glide.p043m.C2091a.C2094c unused = r0.f7192f = r10     // Catch:{ all -> 0x010e }
            boolean r10 = r0.f7191e     // Catch:{ all -> 0x010e }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00c9
            boolean unused = r0.f7191e = r1     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f7176o     // Catch:{ all -> 0x010e }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f7176o     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f7176o     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.f7187a     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f7176o     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.mo8251l()     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f7176o     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x00ec
            long r10 = r9.f7179r     // Catch:{ all -> 0x010e }
            r1 = 1
            long r1 = r1 + r10
            r9.f7179r = r1     // Catch:{ all -> 0x010e }
            long unused = r0.f7193g = r10     // Catch:{ all -> 0x010e }
            goto L_0x00ec
        L_0x00c9:
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.m.a$d> r10 = r9.f7177p     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f7187a     // Catch:{ all -> 0x010e }
            r10.remove(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f7176o     // Catch:{ all -> 0x010e }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f7176o     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f7176o     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f7187a     // Catch:{ all -> 0x010e }
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f7176o     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
        L_0x00ec:
            java.io.Writer r10 = r9.f7176o     // Catch:{ all -> 0x010e }
            m9792z0(r10)     // Catch:{ all -> 0x010e }
            long r10 = r9.f7175n     // Catch:{ all -> 0x010e }
            long r0 = r9.f7173l     // Catch:{ all -> 0x010e }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ff
            boolean r10 = r9.m9772F0()     // Catch:{ all -> 0x010e }
            if (r10 == 0) goto L_0x0106
        L_0x00ff:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f7180s     // Catch:{ all -> 0x010e }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f7181t     // Catch:{ all -> 0x010e }
            r10.submit(r11)     // Catch:{ all -> 0x010e }
        L_0x0106:
            monitor-exit(r9)
            return
        L_0x0108:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            r10.<init>()     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x010e:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p043m.C2091a.m9787i0(com.bumptech.glide.m.a$c, boolean):void");
    }

    /* renamed from: n0 */
    private static void m9788n0(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return null;
     */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.bumptech.glide.p043m.C2091a.C2094c m9790v0(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.m9783T()     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.m.a$d> r0 = r5.f7177p     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x005d }
            com.bumptech.glide.m.a$d r0 = (com.bumptech.glide.p043m.C2091a.C2095d) r0     // Catch:{ all -> 0x005d }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
            if (r0 == 0) goto L_0x001d
            long r1 = r0.f7193g     // Catch:{ all -> 0x005d }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
        L_0x001d:
            monitor-exit(r5)
            return r3
        L_0x001f:
            if (r0 != 0) goto L_0x002c
            com.bumptech.glide.m.a$d r0 = new com.bumptech.glide.m.a$d     // Catch:{ all -> 0x005d }
            r0.<init>(r5, r6, r3)     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.m.a$d> r7 = r5.f7177p     // Catch:{ all -> 0x005d }
            r7.put(r6, r0)     // Catch:{ all -> 0x005d }
            goto L_0x0034
        L_0x002c:
            com.bumptech.glide.m.a$c r7 = r0.f7192f     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x0034
            monitor-exit(r5)
            return r3
        L_0x0034:
            com.bumptech.glide.m.a$c r7 = new com.bumptech.glide.m.a$c     // Catch:{ all -> 0x005d }
            r7.<init>(r5, r0, r3)     // Catch:{ all -> 0x005d }
            com.bumptech.glide.p043m.C2091a.C2094c unused = r0.f7192f = r7     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f7176o     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f7176o     // Catch:{ all -> 0x005d }
            r0 = 32
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f7176o     // Catch:{ all -> 0x005d }
            r8.append(r6)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f7176o     // Catch:{ all -> 0x005d }
            r8 = 10
            r6.append(r8)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f7176o     // Catch:{ all -> 0x005d }
            m9792z0(r6)     // Catch:{ all -> 0x005d }
            monitor-exit(r5)
            return r7
        L_0x005d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p043m.C2091a.m9790v0(java.lang.String, long):com.bumptech.glide.m.a$c");
    }

    @TargetApi(26)
    /* renamed from: z0 */
    private static void m9792z0(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: A0 */
    public synchronized C2096e mo8237A0(String str) throws IOException {
        m9783T();
        C2095d dVar = this.f7177p.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f7191e) {
            return null;
        }
        for (File exists : dVar.f7189c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.f7178q++;
        this.f7176o.append("READ");
        this.f7176o.append(' ');
        this.f7176o.append(str);
        this.f7176o.append(10);
        if (m9772F0()) {
            this.f7180s.submit(this.f7181t);
        }
        return new C2096e(this, str, dVar.f7193g, dVar.f7189c, dVar.f7188b, (C2092a) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        return false;
     */
    /* renamed from: Q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo8238Q0(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.m9783T()     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.m.a$d> r0 = r7.f7177p     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008f }
            com.bumptech.glide.m.a$d r0 = (com.bumptech.glide.p043m.C2091a.C2095d) r0     // Catch:{ all -> 0x008f }
            r1 = 0
            if (r0 == 0) goto L_0x008d
            com.bumptech.glide.m.a$c r2 = r0.f7192f     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0017
            goto L_0x008d
        L_0x0017:
            int r2 = r7.f7174m     // Catch:{ all -> 0x008f }
            if (r1 >= r2) goto L_0x0059
            java.io.File r2 = r0.mo8249j(r1)     // Catch:{ all -> 0x008f }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r0.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008f }
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008f }
            r8.<init>(r0)     // Catch:{ all -> 0x008f }
            throw r8     // Catch:{ all -> 0x008f }
        L_0x0043:
            long r2 = r7.f7175n     // Catch:{ all -> 0x008f }
            long[] r4 = r0.f7188b     // Catch:{ all -> 0x008f }
            r5 = r4[r1]     // Catch:{ all -> 0x008f }
            long r2 = r2 - r5
            r7.f7175n = r2     // Catch:{ all -> 0x008f }
            long[] r2 = r0.f7188b     // Catch:{ all -> 0x008f }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008f }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0059:
            int r0 = r7.f7178q     // Catch:{ all -> 0x008f }
            r1 = 1
            int r0 = r0 + r1
            r7.f7178q = r0     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f7176o     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f7176o     // Catch:{ all -> 0x008f }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f7176o     // Catch:{ all -> 0x008f }
            r0.append(r8)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f7176o     // Catch:{ all -> 0x008f }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.m.a$d> r0 = r7.f7177p     // Catch:{ all -> 0x008f }
            r0.remove(r8)     // Catch:{ all -> 0x008f }
            boolean r8 = r7.m9772F0()     // Catch:{ all -> 0x008f }
            if (r8 == 0) goto L_0x008b
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f7180s     // Catch:{ all -> 0x008f }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f7181t     // Catch:{ all -> 0x008f }
            r8.submit(r0)     // Catch:{ all -> 0x008f }
        L_0x008b:
            monitor-exit(r7)
            return r1
        L_0x008d:
            monitor-exit(r7)
            return r1
        L_0x008f:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p043m.C2091a.mo8238Q0(java.lang.String):boolean");
    }

    public synchronized void close() throws IOException {
        if (this.f7176o != null) {
            Iterator it = new ArrayList(this.f7177p.values()).iterator();
            while (it.hasNext()) {
                C2095d dVar = (C2095d) it.next();
                if (dVar.f7192f != null) {
                    dVar.f7192f.mo8245a();
                }
            }
            m9782S0();
            m9784Y(this.f7176o);
            this.f7176o = null;
        }
    }

    /* renamed from: m0 */
    public void mo8240m0() throws IOException {
        close();
        C2099c.m9824b(this.f7168g);
    }

    /* renamed from: o0 */
    public C2094c mo8241o0(String str) throws IOException {
        return m9790v0(str, -1);
    }
}
