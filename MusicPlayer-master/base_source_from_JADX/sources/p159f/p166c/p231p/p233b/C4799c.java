package p159f.p166c.p231p.p233b;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.p.b.c */
/* compiled from: MediaStoreUtils.kt */
public final class C4799c {

    /* renamed from: a */
    public static final C4799c f13592a = new C4799c();

    private C4799c() {
    }

    /* renamed from: a */
    private final void m20384a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    @TargetApi(29)
    /* renamed from: b */
    public final Uri mo15537b(ContentResolver contentResolver, String str, String str2, ContentValues contentValues) {
        Uri insert;
        C8594l.m46771e(contentResolver, "contentResolver");
        C8594l.m46771e(str, "sourcePath");
        C8594l.m46771e(str2, "dstPath");
        C8594l.m46771e(contentValues, "contentValues");
        contentValues.put("relative_path", str2);
        File file = new File(str);
        if (file.exists() && (insert = contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues)) != null && mo15538c(new FileInputStream(file), contentResolver.openOutputStream(insert))) {
            return insert;
        }
        return null;
    }

    /* renamed from: c */
    public final boolean mo15538c(InputStream inputStream, OutputStream outputStream) {
        int read;
        boolean z = false;
        if (inputStream == null || outputStream == null) {
            return false;
        }
        try {
            byte[] bArr = new byte[1024];
            do {
                read = inputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                    continue;
                }
            } while (read != -1);
            z = true;
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            m20384a(inputStream);
            m20384a(outputStream);
            throw th;
        }
        m20384a(inputStream);
        m20384a(outputStream);
        return z;
    }
}
