package p159f.p166c.p181e.p182a.p190b.p193j.p194b;

import java.io.File;
import java.io.FileFilter;
import java.io.Serializable;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.b.j.b.b */
/* compiled from: HiddenFilter.kt */
public final class C4466b implements FileFilter, Serializable {
    public boolean accept(File file) {
        C8594l.m46771e(file, "f");
        return !file.isHidden();
    }
}
