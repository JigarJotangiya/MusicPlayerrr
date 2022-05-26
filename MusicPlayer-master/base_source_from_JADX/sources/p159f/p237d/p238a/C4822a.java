package p159f.p237d.p238a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p159f.p237d.p238a.C4825c;

/* renamed from: f.d.a.a */
/* compiled from: ApkLibraryInstaller */
public class C4822a implements C4825c.C4826a {

    /* renamed from: f.d.a.a$a */
    /* compiled from: ApkLibraryInstaller */
    private static class C4823a {

        /* renamed from: a */
        public ZipFile f13635a;

        /* renamed from: b */
        public ZipEntry f13636b;

        public C4823a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f13635a = zipFile;
            this.f13636b = zipEntry;
        }
    }

    /* renamed from: b */
    private void m20443b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    private long m20444c(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: d */
    private C4823a m20445d(Context context, String[] strArr, String str, C4830d dVar) {
        String[] strArr2 = strArr;
        String[] f = m20447f(context);
        int length = f.length;
        char c = 0;
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= length) {
                return null;
            }
            String str2 = f[i];
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i2 = i3;
                }
            }
            if (zipFile == null) {
                String str3 = str;
                C4830d dVar2 = dVar;
            } else {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (i4 < 5) {
                        int length2 = strArr2.length;
                        int i6 = 0;
                        while (i6 < length2) {
                            String str4 = "lib" + File.separatorChar + strArr2[i6] + File.separatorChar + str;
                            Object[] objArr = new Object[2];
                            objArr[c] = str4;
                            objArr[1] = str2;
                            dVar.mo15582i("Looking for %s in APK %s...", objArr);
                            ZipEntry entry = zipFile.getEntry(str4);
                            if (entry != null) {
                                return new C4823a(zipFile, entry);
                            }
                            i6++;
                            c = 0;
                        }
                        String str5 = str;
                        C4830d dVar3 = dVar;
                        i4 = i5;
                        c = 0;
                    } else {
                        String str6 = str;
                        C4830d dVar4 = dVar;
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i++;
            c = 0;
        }
    }

    /* renamed from: e */
    private String[] m20446e(Context context, String str) {
        Pattern compile = Pattern.compile("lib" + File.separatorChar + "([^\\" + File.separatorChar + "]*)" + File.separatorChar + str);
        HashSet hashSet = new HashSet();
        for (String file : m20447f(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(file), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(((ZipEntry) entries.nextElement()).getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* renamed from: f */
    private String[] m20447f(Context context) {
        String[] strArr;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (Build.VERSION.SDK_INT < 21 || (strArr = applicationInfo.splitSourceDirs) == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[(strArr.length + 1)];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: f.d.a.a$a} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00b1 A[SYNTHETIC, Splitter:B:75:0x00b1] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15567a(android.content.Context r11, java.lang.String[] r12, java.lang.String r13, java.io.File r14, p159f.p237d.p238a.C4830d r15) {
        /*
            r10 = this;
            r0 = 0
            f.d.a.a$a r1 = r10.m20445d(r11, r12, r13, r15)     // Catch:{ all -> 0x00ae }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0096
            r11 = 0
        L_0x000a:
            int r12 = r11 + 1
            r4 = 5
            if (r11 >= r4) goto L_0x0087
            java.lang.String r11 = "Found %s! Extracting..."
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x009b }
            r4[r2] = r13     // Catch:{ all -> 0x009b }
            r15.mo15582i(r11, r4)     // Catch:{ all -> 0x009b }
            boolean r11 = r14.exists()     // Catch:{ IOException -> 0x0085 }
            if (r11 != 0) goto L_0x0026
            boolean r11 = r14.createNewFile()     // Catch:{ IOException -> 0x0085 }
            if (r11 != 0) goto L_0x0026
            goto L_0x0085
        L_0x0026:
            java.util.zip.ZipFile r11 = r1.f13635a     // Catch:{ FileNotFoundException -> 0x007f, IOException -> 0x0079, all -> 0x0070 }
            java.util.zip.ZipEntry r4 = r1.f13636b     // Catch:{ FileNotFoundException -> 0x007f, IOException -> 0x0079, all -> 0x0070 }
            java.io.InputStream r11 = r11.getInputStream(r4)     // Catch:{ FileNotFoundException -> 0x007f, IOException -> 0x0079, all -> 0x0070 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x006e, IOException -> 0x006c, all -> 0x0068 }
            r4.<init>(r14)     // Catch:{ FileNotFoundException -> 0x006e, IOException -> 0x006c, all -> 0x0068 }
            long r5 = r10.m20444c(r11, r4)     // Catch:{ FileNotFoundException -> 0x0081, IOException -> 0x007b, all -> 0x0066 }
            java.io.FileDescriptor r7 = r4.getFD()     // Catch:{ FileNotFoundException -> 0x0081, IOException -> 0x007b, all -> 0x0066 }
            r7.sync()     // Catch:{ FileNotFoundException -> 0x0081, IOException -> 0x007b, all -> 0x0066 }
            long r7 = r14.length()     // Catch:{ FileNotFoundException -> 0x0081, IOException -> 0x007b, all -> 0x0066 }
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x004d
            r10.m20443b(r11)     // Catch:{ all -> 0x009b }
        L_0x0049:
            r10.m20443b(r4)     // Catch:{ all -> 0x009b }
            goto L_0x0085
        L_0x004d:
            r10.m20443b(r11)     // Catch:{ all -> 0x009b }
            r10.m20443b(r4)     // Catch:{ all -> 0x009b }
            r14.setReadable(r3, r2)     // Catch:{ all -> 0x009b }
            r14.setExecutable(r3, r2)     // Catch:{ all -> 0x009b }
            r14.setWritable(r3)     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x0065
            java.util.zip.ZipFile r11 = r1.f13635a     // Catch:{ IOException -> 0x0065 }
            if (r11 == 0) goto L_0x0065
            r11.close()     // Catch:{ IOException -> 0x0065 }
        L_0x0065:
            return
        L_0x0066:
            r12 = move-exception
            goto L_0x006a
        L_0x0068:
            r12 = move-exception
            r4 = r0
        L_0x006a:
            r0 = r11
            goto L_0x0072
        L_0x006c:
            r4 = r0
            goto L_0x007b
        L_0x006e:
            r4 = r0
            goto L_0x0081
        L_0x0070:
            r12 = move-exception
            r4 = r0
        L_0x0072:
            r10.m20443b(r0)     // Catch:{ all -> 0x009b }
            r10.m20443b(r4)     // Catch:{ all -> 0x009b }
            throw r12     // Catch:{ all -> 0x009b }
        L_0x0079:
            r11 = r0
            r4 = r11
        L_0x007b:
            r10.m20443b(r11)     // Catch:{ all -> 0x009b }
            goto L_0x0049
        L_0x007f:
            r11 = r0
            r4 = r11
        L_0x0081:
            r10.m20443b(r11)     // Catch:{ all -> 0x009b }
            goto L_0x0049
        L_0x0085:
            r11 = r12
            goto L_0x000a
        L_0x0087:
            java.lang.String r11 = "FATAL! Couldn't extract the library from the APK!"
            r15.mo15581h(r11)     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x0095
            java.util.zip.ZipFile r11 = r1.f13635a     // Catch:{ IOException -> 0x0095 }
            if (r11 == 0) goto L_0x0095
            r11.close()     // Catch:{ IOException -> 0x0095 }
        L_0x0095:
            return
        L_0x0096:
            java.lang.String[] r11 = r10.m20446e(r11, r13)     // Catch:{ Exception -> 0x009e }
            goto L_0x00a8
        L_0x009b:
            r11 = move-exception
            r0 = r1
            goto L_0x00af
        L_0x009e:
            r11 = move-exception
            java.lang.String[] r14 = new java.lang.String[r3]     // Catch:{ all -> 0x009b }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x009b }
            r14[r2] = r11     // Catch:{ all -> 0x009b }
            r11 = r14
        L_0x00a8:
            f.d.a.b r14 = new f.d.a.b     // Catch:{ all -> 0x009b }
            r14.<init>(r13, r12, r11)     // Catch:{ all -> 0x009b }
            throw r14     // Catch:{ all -> 0x009b }
        L_0x00ae:
            r11 = move-exception
        L_0x00af:
            if (r0 == 0) goto L_0x00b8
            java.util.zip.ZipFile r12 = r0.f13635a     // Catch:{ IOException -> 0x00b8 }
            if (r12 == 0) goto L_0x00b8
            r12.close()     // Catch:{ IOException -> 0x00b8 }
        L_0x00b8:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p237d.p238a.C4822a.mo15567a(android.content.Context, java.lang.String[], java.lang.String, java.io.File, f.d.a.d):void");
    }
}
