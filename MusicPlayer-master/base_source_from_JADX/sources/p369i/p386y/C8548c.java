package p369i.p386y;

import java.io.File;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.y.c */
/* compiled from: Exceptions.kt */
public final class C8548c {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final String m46751b(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": " + str);
        }
        String sb2 = sb.toString();
        C8594l.m46770d(sb2, "sb.toString()");
        return sb2;
    }
}
