package p402l.p406b.p407a.p420l;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Logger;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p407a.p416i.C9051d;
import p402l.p406b.p407a.p416i.C9053f;
import p402l.p406b.p407a.p420l.p421g.C9101b;
import p402l.p406b.p426c.C9130j;

/* renamed from: l.b.a.l.a */
/* compiled from: OggFileReader */
public class C9093a extends C9051d {

    /* renamed from: b */
    private C9101b f35671b = new C9101b();

    /* renamed from: c */
    private C9096d f35672c = new C9096d();

    static {
        Logger.getLogger("org.jaudiotagger.audio.ogg");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9053f mo31290a(RandomAccessFile randomAccessFile) throws C9015a, IOException {
        return this.f35671b.mo31687b(randomAccessFile);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C9130j mo31291b(RandomAccessFile randomAccessFile) throws C9015a, IOException {
        return this.f35672c.mo31675e(randomAccessFile);
    }
}
