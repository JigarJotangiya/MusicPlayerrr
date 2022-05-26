package androidx.room;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import p082e.p149u.p150a.C4215c;

/* renamed from: androidx.room.y0 */
/* compiled from: SQLiteCopyOpenHelperFactory */
class C1020y0 implements C4215c.C4219c {

    /* renamed from: a */
    private final String f4321a;

    /* renamed from: b */
    private final File f4322b;

    /* renamed from: c */
    private final Callable<InputStream> f4323c;

    /* renamed from: d */
    private final C4215c.C4219c f4324d;

    C1020y0(String str, File file, Callable<InputStream> callable, C4215c.C4219c cVar) {
        this.f4321a = str;
        this.f4322b = file;
        this.f4323c = callable;
        this.f4324d = cVar;
    }

    /* renamed from: a */
    public C4215c mo5440a(C4215c.C4217b bVar) {
        return new C1015x0(bVar.f12596a, this.f4321a, this.f4322b, this.f4323c, bVar.f12598c.f12595a, this.f4324d.mo5440a(bVar));
    }
}
