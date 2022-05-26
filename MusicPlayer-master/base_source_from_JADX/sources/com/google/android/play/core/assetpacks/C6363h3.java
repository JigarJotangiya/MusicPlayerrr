package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;
import p159f.p243f.p245b.p318c.p319a.p320a.C7577a;

/* renamed from: com.google.android.play.core.assetpacks.h3 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6363h3 {

    /* renamed from: h */
    private static final C7577a f29475h = new C7577a("SliceMetadataManager");

    /* renamed from: a */
    private final byte[] f29476a = new byte[8192];

    /* renamed from: b */
    private final C6355g0 f29477b;

    /* renamed from: c */
    private final String f29478c;

    /* renamed from: d */
    private final int f29479d;

    /* renamed from: e */
    private final long f29480e;

    /* renamed from: f */
    private final String f29481f;

    /* renamed from: g */
    private int f29482g;

    C6363h3(C6355g0 g0Var, String str, int i, long j, String str2) {
        this.f29477b = g0Var;
        this.f29478c = str;
        this.f29479d = i;
        this.f29480e = j;
        this.f29481f = str2;
        this.f29482g = -1;
    }

    /* renamed from: n */
    private final File m37662n() {
        File B = this.f29477b.mo25241B(this.f29478c, this.f29479d, this.f29480e, this.f29481f);
        if (!B.exists()) {
            B.mkdirs();
        }
        return B;
    }

    /* renamed from: o */
    private final File m37663o() throws IOException {
        File A = this.f29477b.mo25240A(this.f29478c, this.f29479d, this.f29480e, this.f29481f);
        A.getParentFile().mkdirs();
        A.createNewFile();
        return A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo25274a() throws IOException {
        File A = this.f29477b.mo25240A(this.f29478c, this.f29479d, this.f29480e, this.f29481f);
        if (!A.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(A);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new C6361h1("Slice checkpoint file corrupt.");
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C6358g3 mo25275b() throws IOException {
        File A = this.f29477b.mo25240A(this.f29478c, this.f29479d, this.f29480e, this.f29481f);
        if (A.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(A);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    throw new C6361h1("Slice checkpoint file corrupt.");
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.f29482g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    return new C6390n0(parseInt, property, parseLong, parseLong2, parseInt2);
                } catch (NumberFormatException e) {
                    throw new C6361h1("Slice checkpoint file corrupt.", (Exception) e);
                }
            } catch (Throwable unused) {
            }
        } else {
            throw new C6361h1("Slice checkpoint file does not exist.");
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final File mo25276c() {
        return new File(m37662n(), String.format("%s-NAM.dat", new Object[]{Integer.valueOf(this.f29482g)}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo25277d(InputStream inputStream, long j) throws IOException {
        int read;
        RandomAccessFile randomAccessFile = new RandomAccessFile(mo25276c(), "rw");
        try {
            randomAccessFile.seek(j);
            do {
                read = inputStream.read(this.f29476a);
                if (read > 0) {
                    randomAccessFile.write(this.f29476a, 0, read);
                }
            } while (read == 8192);
            randomAccessFile.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo25278e(long j, byte[] bArr, int i, int i2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(mo25276c(), "rw");
        try {
            randomAccessFile.seek(j);
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo25279f(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(mo25276c().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f29482g));
        FileOutputStream fileOutputStream = new FileOutputStream(m37663o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo25280g(String str, long j, long j2, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f29482g));
        FileOutputStream fileOutputStream = new FileOutputStream(m37663o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo25281h(byte[] bArr, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f29482g));
        FileOutputStream fileOutputStream = new FileOutputStream(m37663o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File z = this.f29477b.mo25266z(this.f29478c, this.f29479d, this.f29480e, this.f29481f);
            if (z.exists()) {
                z.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(z);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
                return;
            } catch (Throwable unused) {
            }
            throw th;
            throw th;
        } catch (Throwable unused2) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo25282i(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f29482g));
        FileOutputStream fileOutputStream = new FileOutputStream(m37663o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0030 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25283j(byte[] r6) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f29482g
            r1 = 1
            int r0 = r0 + r1
            r5.f29482g = r0
            java.io.File r0 = new java.io.File
            java.io.File r2 = r5.m37662n()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r3 = r5.f29482g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r1[r4] = r3
            java.lang.String r3 = "%s-LFH.dat"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            r0.<init>(r2, r1)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0031 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0031 }
            r1.write(r6)     // Catch:{ all -> 0x002c }
            r1.close()     // Catch:{ IOException -> 0x0031 }
            return
        L_0x002c:
            r6 = move-exception
            r1.close()     // Catch:{ all -> 0x0030 }
        L_0x0030:
            throw r6     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            r6 = move-exception
            com.google.android.play.core.assetpacks.h1 r0 = new com.google.android.play.core.assetpacks.h1
            java.lang.String r1 = "Could not write metadata file."
            r0.<init>((java.lang.String) r1, (java.lang.Exception) r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C6363h3.mo25283j(byte[]):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo25284k(byte[] bArr, InputStream inputStream) throws IOException {
        this.f29482g++;
        FileOutputStream fileOutputStream = new FileOutputStream(mo25276c());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.f29476a);
            while (read > 0) {
                fileOutputStream.write(this.f29476a, 0, read);
                read = inputStream.read(this.f29476a);
            }
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo25285l(byte[] bArr, int i, int i2) throws IOException {
        this.f29482g++;
        FileOutputStream fileOutputStream = new FileOutputStream(mo25276c());
        try {
            fileOutputStream.write(bArr, 0, i2);
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004a */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25286m() {
        /*
            r6 = this;
            com.google.android.play.core.assetpacks.g0 r0 = r6.f29477b
            java.lang.String r1 = r6.f29478c
            int r2 = r6.f29479d
            long r3 = r6.f29480e
            java.lang.String r5 = r6.f29481f
            java.io.File r0 = r0.mo25240A(r1, r2, r3, r5)
            boolean r1 = r0.exists()
            r2 = 0
            if (r1 != 0) goto L_0x0016
            return r2
        L_0x0016:
            r1 = 1
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x004b }
            r3.<init>(r0)     // Catch:{ IOException -> 0x004b }
            java.util.Properties r0 = new java.util.Properties     // Catch:{ all -> 0x0046 }
            r0.<init>()     // Catch:{ all -> 0x0046 }
            r0.load(r3)     // Catch:{ all -> 0x0046 }
            r3.close()     // Catch:{ IOException -> 0x004b }
            java.lang.String r3 = "fileStatus"
            java.lang.String r4 = r0.getProperty(r3)
            if (r4 != 0) goto L_0x0039
            f.f.b.c.a.a.a r0 = f29475h
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r3 = "Slice checkpoint file corrupt while checking if extraction finished."
            r0.mo28575b(r3, r1)
            return r2
        L_0x0039:
            java.lang.String r0 = r0.getProperty(r3)
            int r0 = java.lang.Integer.parseInt(r0)
            r3 = 4
            if (r0 != r3) goto L_0x0045
            return r1
        L_0x0045:
            return r2
        L_0x0046:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x004a }
        L_0x004a:
            throw r0     // Catch:{ IOException -> 0x004b }
        L_0x004b:
            r0 = move-exception
            f.f.b.c.a.a.a r3 = f29475h
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r0
            java.lang.String r0 = "Could not read checkpoint while checking if extraction finished. %s"
            r3.mo28575b(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C6363h3.mo25286m():boolean");
    }
}
