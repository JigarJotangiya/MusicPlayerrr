package p159f.p166c.p181e.p182a.p190b.p193j.p194b;

import java.io.File;
import java.io.FileFilter;
import java.io.Serializable;
import java.util.regex.Pattern;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.b.j.b.c */
/* compiled from: PatternFilter.kt */
public final class C4467c implements FileFilter, Serializable {
    private final boolean mDirectoriesFilter;
    private final Pattern mPattern;

    public C4467c(Pattern pattern, boolean z) {
        C8594l.m46771e(pattern, "mPattern");
        this.mPattern = pattern;
        this.mDirectoriesFilter = z;
    }

    public boolean accept(File file) {
        C8594l.m46771e(file, "f");
        return (file.isDirectory() && !this.mDirectoriesFilter) || this.mPattern.matcher(file.getName()).matches();
    }
}
