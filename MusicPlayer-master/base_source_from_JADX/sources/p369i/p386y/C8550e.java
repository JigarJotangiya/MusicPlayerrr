package p369i.p386y;

import java.io.File;
import java.io.IOException;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.y.e */
/* compiled from: Exceptions.kt */
public class C8550e extends IOException {
    private final File file;
    private final File other;
    private final String reason;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8550e(File file2, File file3, String str, int i, C8589g gVar) {
        this(file2, (i & 2) != 0 ? null : file3, (i & 4) != 0 ? null : str);
    }

    public final File getFile() {
        return this.file;
    }

    public final File getOther() {
        return this.other;
    }

    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8550e(File file2, File file3, String str) {
        super(C8548c.m46751b(file2, file3, str));
        C8594l.m46771e(file2, "file");
        this.file = file2;
        this.other = file3;
        this.reason = str;
    }
}
