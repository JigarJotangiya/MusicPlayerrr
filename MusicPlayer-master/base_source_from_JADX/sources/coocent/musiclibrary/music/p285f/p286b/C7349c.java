package coocent.musiclibrary.music.p285f.p286b;

import java.io.File;
import java.io.FileFilter;
import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: coocent.musiclibrary.music.f.b.c */
/* compiled from: PatternFilter */
public class C7349c implements FileFilter, Serializable {
    private boolean mDirectoriesFilter;
    private Pattern mPattern;

    public C7349c(Pattern pattern, boolean z) {
        this.mPattern = pattern;
        this.mDirectoriesFilter = z;
    }

    public boolean accept(File file) {
        return (file.isDirectory() && !this.mDirectoriesFilter) || this.mPattern.matcher(file.getName()).matches();
    }
}
