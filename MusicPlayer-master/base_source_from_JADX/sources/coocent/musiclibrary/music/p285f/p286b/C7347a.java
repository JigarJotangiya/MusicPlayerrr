package coocent.musiclibrary.music.p285f.p286b;

import java.io.File;
import java.io.FileFilter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: coocent.musiclibrary.music.f.b.a */
/* compiled from: CompositeFilter */
public class C7347a implements FileFilter, Serializable {
    private ArrayList<FileFilter> mFilters;

    public C7347a(ArrayList<FileFilter> arrayList) {
        this.mFilters = arrayList;
    }

    public boolean accept(File file) {
        Iterator<FileFilter> it = this.mFilters.iterator();
        while (it.hasNext()) {
            if (!it.next().accept(file)) {
                return false;
            }
        }
        return true;
    }
}
