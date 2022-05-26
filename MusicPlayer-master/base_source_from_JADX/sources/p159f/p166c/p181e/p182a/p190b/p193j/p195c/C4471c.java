package p159f.p166c.p181e.p182a.p190b.p193j.p195c;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.c.e.a.b.j.c.c */
/* compiled from: FileUtils */
public class C4471c {
    /* renamed from: a */
    public static String m19552a(String str) {
        if (str.length() - str.replace("/", BuildConfig.FLAVOR).length() <= 1) {
            return "/";
        }
        String substring = str.substring(0, str.lastIndexOf("/"));
        return substring.equals("/storage/emulated") ? "/storage" : substring;
    }

    /* renamed from: b */
    public static List<File> m19553b(String str, FileFilter fileFilter) {
        File[] listFiles = new File(str).listFiles(fileFilter);
        if (listFiles == null) {
            return new ArrayList();
        }
        List<File> asList = Arrays.asList(listFiles);
        Collections.sort(asList, new C4468a());
        return asList;
    }
}
