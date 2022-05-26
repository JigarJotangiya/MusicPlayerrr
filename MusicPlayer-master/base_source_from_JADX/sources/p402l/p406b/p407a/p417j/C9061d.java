package p402l.p406b.p407a.p417j;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import p402l.p406b.p407a.C8942a;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p407a.p413g.C9018d;
import p402l.p406b.p407a.p413g.C9022h;
import p402l.p406b.p407a.p416i.C9051d;
import p402l.p406b.p407a.p416i.C9053f;
import p402l.p406b.p426c.C9130j;
import p402l.p406b.p426c.C9131k;

/* renamed from: l.b.a.j.d */
/* compiled from: MP3FileReader */
public class C9061d extends C9051d {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9053f mo31290a(RandomAccessFile randomAccessFile) throws C9015a, IOException {
        throw new RuntimeException("MP3FileReader.getEncodingInfo should be called");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C9130j mo31291b(RandomAccessFile randomAccessFile) throws C9015a, IOException {
        throw new RuntimeException("MP3FileReader.getEncodingInfo should be called");
    }

    /* renamed from: c */
    public C8942a mo31298c(File file) throws IOException, C9131k, C9022h, C9018d {
        return new C9060c(file, 6, true);
    }
}
