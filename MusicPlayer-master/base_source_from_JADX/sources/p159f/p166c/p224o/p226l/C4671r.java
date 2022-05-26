package p159f.p166c.p224o.p226l;

import android.app.Application;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.coocent.videostore.p067po.Video;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import p159f.p166c.p231p.p233b.C4796a;
import p159f.p166c.p231p.p233b.C4800d;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.o.l.r */
/* compiled from: VideoUtils.kt */
public final class C4671r {
    /* renamed from: a */
    public static final void m20190a() {
        C4662l.f13448a.mo15394a();
    }

    /* renamed from: b */
    public static final void m20191b() {
        C4796a.m20376a();
    }

    /* renamed from: c */
    public static final void m20192c(Application application, Video video, C4800d dVar, C4664n nVar) {
        C8594l.m46771e(application, "application");
        C8594l.m46771e(video, "video");
        C8594l.m46771e(dVar, "bufferedListener");
        C8594l.m46771e(nVar, "successListener");
        try {
            boolean z = true;
            if (Build.VERSION.SDK_INT >= 29) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("title", video.mo10565w());
                contentValues.put("_display_name", video.mo10546f());
                contentValues.put("_size", Long.valueOf(video.mo10563u()));
                contentValues.put("width", Integer.valueOf(video.mo10568y()));
                contentValues.put("height", Integer.valueOf(video.mo10552k()));
                contentValues.put("is_pending", 0);
                C4662l lVar = C4662l.f13448a;
                ContentResolver contentResolver = application.getContentResolver();
                C8594l.m46770d(contentResolver, "application.contentResolver");
                String t = video.mo10561t();
                C8594l.m46770d(t, "video.path");
                String str = Environment.DIRECTORY_MOVIES;
                C8594l.m46770d(str, "DIRECTORY_MOVIES");
                Uri c = lVar.mo15395c(contentResolver, t, str, contentValues, dVar);
                if (c == null) {
                    z = false;
                }
                nVar.mo10076b(c, z);
                return;
            }
            File file = new File(video.mo10561t());
            if (file.exists()) {
                File file2 = new File(video.mo10555n());
                if (file2.exists()) {
                    file2.delete();
                }
                if (C4662l.f13448a.mo15396d(new BufferedInputStream(new FileInputStream(file)), new BufferedOutputStream(new FileOutputStream(file2)), dVar)) {
                    MediaScannerConnection.scanFile(application, new String[]{file2.getPath()}, new String[]{"video/*"}, new C4646a(nVar));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m20193d(C4664n nVar, String str, Uri uri) {
        C8594l.m46771e(nVar, "$successListener");
        if (uri == null) {
            nVar.mo10076b(Uri.parse(str), !TextUtils.isEmpty(str));
        } else {
            nVar.mo10076b(uri, !TextUtils.isEmpty(str));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.nio.file.Path} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.File] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m20194e(android.app.Application r12, com.coocent.videostore.p067po.Video r13, p159f.p166c.p231p.p233b.C4800d r14, p159f.p166c.p224o.p226l.C4664n r15) {
        /*
            java.lang.String r0 = "application"
            p369i.p387z.p389d.C8594l.m46771e(r12, r0)
            java.lang.String r0 = "video"
            p369i.p387z.p389d.C8594l.m46771e(r13, r0)
            java.lang.String r0 = "bufferedListener"
            p369i.p387z.p389d.C8594l.m46771e(r14, r0)
            java.lang.String r0 = "successListener"
            p369i.p387z.p389d.C8594l.m46771e(r15, r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "VID_"
            java.lang.String r0 = p369i.p387z.p389d.C8594l.m46777k(r1, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 26
            if (r1 < r5) goto L_0x00a8
            android.content.ContentResolver r1 = r12.getContentResolver()     // Catch:{ Exception -> 0x008e }
            java.lang.String r13 = r13.mo10567x()     // Catch:{ Exception -> 0x008e }
            android.net.Uri r13 = android.net.Uri.parse(r13)     // Catch:{ Exception -> 0x008e }
            java.lang.String r5 = "r"
            android.content.res.AssetFileDescriptor r13 = r1.openAssetFileDescriptor(r13, r5)     // Catch:{ Exception -> 0x008e }
            if (r13 != 0) goto L_0x0040
            return
        L_0x0040:
            java.lang.String r12 = p159f.p166c.p231p.p233b.C4796a.m20380e(r12)     // Catch:{ Exception -> 0x008b }
            java.lang.String r12 = p369i.p387z.p389d.C8594l.m46777k(r12, r0)     // Catch:{ Exception -> 0x008b }
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ Exception -> 0x008b }
            java.nio.file.Path r12 = java.nio.file.Paths.get(r12, r0)     // Catch:{ Exception -> 0x008b }
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r4]     // Catch:{ Exception -> 0x0086 }
            boolean r0 = java.nio.file.Files.exists(r12, r0)     // Catch:{ Exception -> 0x0086 }
            if (r0 != 0) goto L_0x005b
            java.nio.file.attribute.FileAttribute[] r0 = new java.nio.file.attribute.FileAttribute[r4]     // Catch:{ Exception -> 0x0086 }
            java.nio.file.Files.createDirectories(r12, r0)     // Catch:{ Exception -> 0x0086 }
        L_0x005b:
            java.io.FileInputStream r3 = r13.createInputStream()     // Catch:{ Exception -> 0x0086 }
            long r0 = r13.getLength()     // Catch:{ Exception -> 0x0086 }
            java.nio.file.CopyOption[] r10 = new java.nio.file.CopyOption[r2]     // Catch:{ Exception -> 0x0086 }
            java.nio.file.StandardCopyOption r5 = java.nio.file.StandardCopyOption.REPLACE_EXISTING     // Catch:{ Exception -> 0x0086 }
            r10[r4] = r5     // Catch:{ Exception -> 0x0086 }
            r5 = r3
            r6 = r12
            r7 = r0
            r9 = r14
            long r5 = p159f.p166c.p231p.p233b.C4796a.m20379d(r5, r6, r7, r9, r10)     // Catch:{ Exception -> 0x0086 }
            r3.close()     // Catch:{ Exception -> 0x0086 }
            r13.close()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r14 = r12.toString()     // Catch:{ Exception -> 0x0086 }
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r2 = 0
        L_0x0081:
            r15.mo10075a(r14, r2)     // Catch:{ Exception -> 0x0086 }
            goto L_0x0131
        L_0x0086:
            r14 = move-exception
            r11 = r3
            r3 = r12
            r12 = r11
            goto L_0x0091
        L_0x008b:
            r14 = move-exception
            r12 = r3
            goto L_0x0091
        L_0x008e:
            r14 = move-exception
            r12 = r3
            r13 = r12
        L_0x0091:
            r14.printStackTrace()
            if (r3 == 0) goto L_0x0099
            java.nio.file.Files.delete(r3)
        L_0x0099:
            if (r12 != 0) goto L_0x009c
            goto L_0x009f
        L_0x009c:
            r12.close()
        L_0x009f:
            if (r13 != 0) goto L_0x00a3
            goto L_0x0131
        L_0x00a3:
            r13.close()
            goto L_0x0131
        L_0x00a8:
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0119 }
            java.lang.String r5 = p159f.p166c.p231p.p233b.C4796a.m20380e(r12)     // Catch:{ Exception -> 0x0119 }
            r1.<init>(r5)     // Catch:{ Exception -> 0x0119 }
            boolean r5 = r1.exists()     // Catch:{ Exception -> 0x0119 }
            if (r5 != 0) goto L_0x00ba
            r1.mkdir()     // Catch:{ Exception -> 0x0119 }
        L_0x00ba:
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0119 }
            java.lang.String r12 = p159f.p166c.p231p.p233b.C4796a.m20380e(r12)     // Catch:{ Exception -> 0x0119 }
            java.lang.String r12 = p369i.p387z.p389d.C8594l.m46777k(r12, r0)     // Catch:{ Exception -> 0x0119 }
            r1.<init>(r12)     // Catch:{ Exception -> 0x0119 }
            boolean r12 = r1.exists()     // Catch:{ Exception -> 0x0114 }
            if (r12 != 0) goto L_0x00d0
            r1.createNewFile()     // Catch:{ Exception -> 0x0114 }
        L_0x00d0:
            java.io.File r12 = new java.io.File     // Catch:{ Exception -> 0x0114 }
            java.lang.String r0 = r13.mo10561t()     // Catch:{ Exception -> 0x0114 }
            r12.<init>(r0)     // Catch:{ Exception -> 0x0114 }
            boolean r0 = r12.exists()     // Catch:{ Exception -> 0x0114 }
            if (r0 != 0) goto L_0x00e0
            return
        L_0x00e0:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0114 }
            r0.<init>(r12)     // Catch:{ Exception -> 0x0114 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0111 }
            r5.<init>(r1)     // Catch:{ Exception -> 0x0111 }
            long r6 = r12.length()     // Catch:{ Exception -> 0x010f }
            long r12 = r13.mo10563u()     // Catch:{ Exception -> 0x010f }
            long r12 = p159f.p166c.p231p.p233b.C4796a.m20378c(r0, r5, r14, r12)     // Catch:{ Exception -> 0x010f }
            r0.close()     // Catch:{ Exception -> 0x010f }
            r5.close()     // Catch:{ Exception -> 0x010f }
            java.lang.String r14 = r1.getPath()     // Catch:{ Exception -> 0x010f }
            java.lang.String r3 = "mPrivateFile.path"
            p369i.p387z.p389d.C8594l.m46770d(r14, r3)     // Catch:{ Exception -> 0x010f }
            int r3 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x010a
            goto L_0x010b
        L_0x010a:
            r2 = 0
        L_0x010b:
            r15.mo10075a(r14, r2)     // Catch:{ Exception -> 0x010f }
            goto L_0x0131
        L_0x010f:
            r12 = move-exception
            goto L_0x0117
        L_0x0111:
            r12 = move-exception
            r5 = r3
            goto L_0x0117
        L_0x0114:
            r12 = move-exception
            r0 = r3
            r5 = r0
        L_0x0117:
            r3 = r1
            goto L_0x011c
        L_0x0119:
            r12 = move-exception
            r0 = r3
            r5 = r0
        L_0x011c:
            r12.printStackTrace()
            if (r3 != 0) goto L_0x0122
            goto L_0x0125
        L_0x0122:
            r3.delete()
        L_0x0125:
            if (r0 != 0) goto L_0x0128
            goto L_0x012b
        L_0x0128:
            r0.close()
        L_0x012b:
            if (r5 != 0) goto L_0x012e
            goto L_0x0131
        L_0x012e:
            r5.close()
        L_0x0131:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p224o.p226l.C4671r.m20194e(android.app.Application, com.coocent.videostore.po.Video, f.c.p.b.d, f.c.o.l.n):void");
    }
}
