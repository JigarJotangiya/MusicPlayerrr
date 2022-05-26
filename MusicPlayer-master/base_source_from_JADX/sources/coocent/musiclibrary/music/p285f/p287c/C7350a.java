package coocent.musiclibrary.music.p285f.p287c;

import java.io.File;
import java.util.Comparator;

/* renamed from: coocent.musiclibrary.music.f.c.a */
/* compiled from: FileComparator */
public class C7350a implements Comparator<File> {
    /* renamed from: a */
    public int compare(File file, File file2) {
        if (file == file2) {
            return 0;
        }
        if (file.isDirectory() && file2.isFile()) {
            return -1;
        }
        if (!file.isFile() || !file2.isDirectory()) {
            return file.getName().compareToIgnoreCase(file2.getName());
        }
        return 1;
    }
}
