package coocent.music.player.skin.p274c;

import coocent.music.player.skin.net.MySkinEntity;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: coocent.music.player.skin.c.h */
/* compiled from: ZipUtil */
public class C7112h {

    /* renamed from: a */
    public static C7112h f31390a;

    /* renamed from: a */
    private void m40469a(MySkinEntity mySkinEntity) {
        C7111g.m40468a(C8345u.m46327h(), mySkinEntity);
    }

    /* renamed from: b */
    public static C7112h m40470b() {
        if (f31390a == null) {
            f31390a = new C7112h();
        }
        return f31390a;
    }

    /* renamed from: e */
    private void m40471e(File file, String str) throws IOException {
        ZipFile zipFile = new ZipFile(file);
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        byte[] bArr = new byte[1024];
        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
            if (zipEntry.isDirectory()) {
                new File(new String(str.getBytes("8859_1"), "GB2312")).mkdir();
            } else {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(mo27303c(str, zipEntry.getName())));
                BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntry));
                while (true) {
                    int read = bufferedInputStream.read(bArr, 0, 1024);
                    if (read == -1) {
                        break;
                    }
                    bufferedOutputStream.write(bArr, 0, read);
                }
                bufferedInputStream.close();
                bufferedOutputStream.close();
            }
        }
        zipFile.close();
    }

    /* renamed from: c */
    public File mo27303c(String str, String str2) {
        String[] split = str2.split("/");
        File file = new File(str);
        if (split.length <= 1) {
            return file;
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        String str3 = split[split.length - 1];
        try {
            str3 = new String(str3.getBytes("8859_1"), "GB2312");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return new File(file, str3);
    }

    /* renamed from: d */
    public boolean mo27304d(MySkinEntity mySkinEntity, String str, String str2) {
        try {
            m40471e(new File(str2), str);
            m40469a(mySkinEntity);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
