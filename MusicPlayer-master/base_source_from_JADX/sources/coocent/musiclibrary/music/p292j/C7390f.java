package coocent.musiclibrary.music.p292j;

import java.io.File;
import java.io.FileInputStream;
import java.text.DecimalFormat;

/* renamed from: coocent.musiclibrary.music.j.f */
/* compiled from: FileUtil */
public class C7390f {
    /* renamed from: a */
    private static double m41686a(long j, int i) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (i == 1) {
            return Double.valueOf(decimalFormat.format((double) j)).doubleValue();
        }
        if (i == 2) {
            return Double.valueOf(decimalFormat.format(((double) j) / 1024.0d)).doubleValue();
        }
        if (i == 3) {
            return Double.valueOf(decimalFormat.format(((double) j) / 1048576.0d)).doubleValue();
        }
        if (i != 4) {
            return 0.0d;
        }
        return Double.valueOf(decimalFormat.format(((double) j) / 1.073741824E9d)).doubleValue();
    }

    /* renamed from: b */
    public static double m41687b(String str, int i) {
        long j;
        File file = new File(str);
        try {
            if (file.isDirectory()) {
                j = m41689d(file);
            } else {
                j = m41688c(file);
            }
        } catch (Exception e) {
            e.printStackTrace();
            j = 0;
        }
        return m41686a(j, i);
    }

    /* renamed from: c */
    private static long m41688c(File file) throws Exception {
        if (file.exists()) {
            return (long) new FileInputStream(file).available();
        }
        file.createNewFile();
        return 0;
    }

    /* renamed from: d */
    private static long m41689d(File file) throws Exception {
        long j;
        File[] listFiles = file.listFiles();
        long j2 = 0;
        for (int i = 0; i < listFiles.length; i++) {
            if (listFiles[i].isDirectory()) {
                j = m41689d(listFiles[i]);
            } else {
                j = m41688c(listFiles[i]);
            }
            j2 += j;
        }
        return j2;
    }
}
