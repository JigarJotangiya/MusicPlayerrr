package p369i.p386y;

import java.io.File;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: i.y.j */
/* compiled from: Utils.kt */
class C8555j extends C8554i {
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0064, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        p369i.p386y.C8547b.m46749a(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0068, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006b, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006c, code lost:
        p369i.p386y.C8547b.m46749a(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006f, code lost:
        throw r7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.File m46755a(java.io.File r6, java.io.File r7, boolean r8, int r9) {
        /*
            java.lang.String r0 = "$this$copyTo"
            p369i.p387z.p389d.C8594l.m46771e(r6, r0)
            java.lang.String r0 = "target"
            p369i.p387z.p389d.C8594l.m46771e(r7, r0)
            boolean r0 = r6.exists()
            if (r0 == 0) goto L_0x0070
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x002f
            if (r8 == 0) goto L_0x0027
            boolean r8 = r7.delete()
            if (r8 == 0) goto L_0x001f
            goto L_0x002f
        L_0x001f:
            i.y.d r8 = new i.y.d
            java.lang.String r9 = "Tried to overwrite the destination, but failed to delete it."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x0027:
            i.y.d r8 = new i.y.d
            java.lang.String r9 = "The destination file already exists."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x002f:
            boolean r8 = r6.isDirectory()
            if (r8 == 0) goto L_0x0044
            boolean r8 = r7.mkdirs()
            if (r8 == 0) goto L_0x003c
            goto L_0x0061
        L_0x003c:
            i.y.e r8 = new i.y.e
            java.lang.String r9 = "Failed to create target directory."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x0044:
            java.io.File r8 = r7.getParentFile()
            if (r8 == 0) goto L_0x004d
            r8.mkdirs()
        L_0x004d:
            java.io.FileInputStream r8 = new java.io.FileInputStream
            r8.<init>(r6)
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ all -> 0x0069 }
            r6.<init>(r7)     // Catch:{ all -> 0x0069 }
            p369i.p386y.C8546a.m46748a(r8, r6, r9)     // Catch:{ all -> 0x0062 }
            r9 = 0
            p369i.p386y.C8547b.m46749a(r6, r9)     // Catch:{ all -> 0x0069 }
            p369i.p386y.C8547b.m46749a(r8, r9)
        L_0x0061:
            return r7
        L_0x0062:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r9 = move-exception
            p369i.p386y.C8547b.m46749a(r6, r7)     // Catch:{ all -> 0x0069 }
            throw r9     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x006b }
        L_0x006b:
            r7 = move-exception
            p369i.p386y.C8547b.m46749a(r8, r6)
            throw r7
        L_0x0070:
            i.y.k r7 = new i.y.k
            r2 = 0
            r4 = 2
            r5 = 0
            java.lang.String r3 = "The source file doesn't exist."
            r0 = r7
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p369i.p386y.C8555j.m46755a(java.io.File, java.io.File, boolean, int):java.io.File");
    }

    /* renamed from: b */
    public static /* synthetic */ File m46756b(File file, File file2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 8192;
        }
        m46755a(file, file2, z, i);
        return file2;
    }

    /* renamed from: c */
    public static String m46757c(File file) {
        C8594l.m46771e(file, "$this$extension");
        String name = file.getName();
        C8594l.m46770d(name, "name");
        return C8437p.m46553b0(name, '.', BuildConfig.FLAVOR);
    }

    /* renamed from: d */
    public static String m46758d(File file) {
        C8594l.m46771e(file, "$this$nameWithoutExtension");
        String name = file.getName();
        C8594l.m46770d(name, "name");
        return C8437p.m46562k0(name, ".", (String) null, 2, (Object) null);
    }
}
