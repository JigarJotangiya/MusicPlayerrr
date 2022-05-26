package p159f.p166c.p181e.p182a.p190b.p193j.p194b;

import java.io.File;
import java.io.FileFilter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.b.j.b.a */
/* compiled from: CompositeFilter.kt */
public final class C4465a implements FileFilter, Serializable {
    private final ArrayList<FileFilter> mFilters;

    public C4465a(ArrayList<FileFilter> arrayList) {
        C8594l.m46771e(arrayList, "mFilters");
        this.mFilters = arrayList;
    }

    public boolean accept(File file) {
        C8594l.m46771e(file, "f");
        Iterator<FileFilter> it = this.mFilters.iterator();
        while (it.hasNext()) {
            if (!it.next().accept(file)) {
                return false;
            }
        }
        return true;
    }
}
