package p159f.p166c.p224o.p226l;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import p159f.p166c.p231p.p233b.C4800d;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.o.l.l */
/* compiled from: MediaStoreUtils.kt */
public final class C4662l {

    /* renamed from: a */
    public static final C4662l f13448a = new C4662l();

    /* renamed from: b */
    private static BufferedInputStream f13449b;

    /* renamed from: c */
    private static BufferedOutputStream f13450c;

    /* renamed from: d */
    private static Uri f13451d;

    private C4662l() {
    }

    /* renamed from: b */
    private final void m20164b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final Uri mo15394a() {
        BufferedInputStream bufferedInputStream = f13449b;
        if (bufferedInputStream != null) {
            bufferedInputStream.close();
        }
        BufferedOutputStream bufferedOutputStream = f13450c;
        if (bufferedOutputStream != null) {
            bufferedOutputStream.close();
        }
        return f13451d;
    }

    @TargetApi(29)
    /* renamed from: c */
    public final Uri mo15395c(ContentResolver contentResolver, String str, String str2, ContentValues contentValues, C4800d dVar) {
        Uri insert;
        C8594l.m46771e(contentResolver, "contentResolver");
        C8594l.m46771e(str, "sourcePath");
        C8594l.m46771e(str2, "dstPath");
        C8594l.m46771e(contentValues, "contentValues");
        contentValues.put("relative_path", str2);
        File file = new File(str);
        if (!file.exists() || (insert = contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues)) == null) {
            return null;
        }
        f13451d = insert;
        FileInputStream fileInputStream = new FileInputStream(file);
        Uri uri = f13451d;
        C8594l.m46769c(uri);
        OutputStream openOutputStream = contentResolver.openOutputStream(uri);
        boolean d = mo15396d(new BufferedInputStream(fileInputStream), new BufferedOutputStream(openOutputStream), dVar);
        fileInputStream.close();
        if (openOutputStream != null) {
            openOutputStream.close();
        }
        if (d) {
            return f13451d;
        }
        Uri uri2 = f13451d;
        C8594l.m46769c(uri2);
        contentResolver.delete(uri2, (String) null, (String[]) null);
        return null;
    }

    /* renamed from: d */
    public final boolean mo15396d(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream, C4800d dVar) {
        int read;
        f13449b = bufferedInputStream;
        f13450c = bufferedOutputStream;
        if (bufferedInputStream == null || bufferedOutputStream == null) {
            return false;
        }
        try {
            byte[] bArr = new byte[1024];
            C8594l.m46769c(bufferedInputStream);
            double available = (double) bufferedInputStream.available();
            do {
                BufferedInputStream bufferedInputStream2 = f13449b;
                C8594l.m46769c(bufferedInputStream2);
                read = bufferedInputStream2.read(bArr);
                if (read != -1) {
                    BufferedOutputStream bufferedOutputStream2 = f13450c;
                    C8594l.m46769c(bufferedOutputStream2);
                    bufferedOutputStream2.write(bArr, 0, read);
                    if (dVar == null) {
                        continue;
                    } else {
                        BufferedInputStream bufferedInputStream3 = f13449b;
                        C8594l.m46769c(bufferedInputStream3);
                        dVar.mo10074a((((double) 1) - (((double) bufferedInputStream3.available()) / available)) * ((double) 100));
                        continue;
                    }
                }
            } while (read != -1);
            m20164b(f13449b);
            m20164b(f13450c);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            m20164b(f13449b);
            m20164b(f13450c);
            return false;
        } catch (Throwable th) {
            m20164b(f13449b);
            m20164b(f13450c);
            throw th;
        }
    }
}
