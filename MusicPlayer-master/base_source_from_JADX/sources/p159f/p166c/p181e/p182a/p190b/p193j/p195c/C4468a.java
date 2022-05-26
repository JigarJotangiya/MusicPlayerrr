package p159f.p166c.p181e.p182a.p190b.p193j.p195c;

import java.io.File;
import java.util.Comparator;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.b.j.c.a */
/* compiled from: FileComparator.kt */
public final class C4468a implements Comparator<File> {
    /* renamed from: a */
    public int compare(File file, File file2) {
        C8594l.m46771e(file, "f1");
        C8594l.m46771e(file2, "f2");
        if (file == file2) {
            return 0;
        }
        if (file.isDirectory() && file2.isFile()) {
            return -1;
        }
        if (file.isFile() && file2.isDirectory()) {
            return 1;
        }
        String name = file.getName();
        C8594l.m46770d(name, "f1.name");
        String name2 = file2.getName();
        C8594l.m46770d(name2, "f2.name");
        return C8436o.m46516j(name, name2, true);
    }
}
