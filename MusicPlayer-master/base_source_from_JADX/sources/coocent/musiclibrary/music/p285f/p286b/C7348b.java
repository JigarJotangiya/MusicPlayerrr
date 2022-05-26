package coocent.musiclibrary.music.p285f.p286b;

import java.io.File;
import java.io.FileFilter;
import java.io.Serializable;

/* renamed from: coocent.musiclibrary.music.f.b.b */
/* compiled from: HiddenFilter */
public class C7348b implements FileFilter, Serializable {
    public boolean accept(File file) {
        return !file.isHidden();
    }
}
