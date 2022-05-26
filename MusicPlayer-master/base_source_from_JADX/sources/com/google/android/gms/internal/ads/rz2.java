package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.C3365j;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rz2 {
    /* renamed from: a */
    public static File m30471a(File file, boolean z) {
        if (z && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: b */
    public static File m30472b(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(m30473c(str, file), str2);
    }

    /* renamed from: c */
    public static File m30473c(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        m30471a(file2, false);
        return file2;
    }

    /* renamed from: d */
    public static boolean m30474d(File file) {
        boolean z;
        if (!file.exists()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            z = true;
            for (int i = 0; i < length; i++) {
                File file2 = listFiles[i];
                z = file2 != null && m30474d(file2) && z;
            }
        } else {
            z = true;
        }
        if (!file.delete() || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m30475e(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                C3365j.m14462a(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                C3365j.m14462a(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                C3365j.m14462a(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
            C3365j.m14462a(fileOutputStream);
            return false;
        } catch (Throwable th2) {
            th = th2;
            C3365j.m14462a(fileOutputStream);
            throw th;
        }
    }
}
