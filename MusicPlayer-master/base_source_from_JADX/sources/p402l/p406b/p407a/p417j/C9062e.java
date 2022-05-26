package p402l.p406b.p407a.p417j;

import java.io.IOException;
import java.io.RandomAccessFile;
import p402l.p406b.p407a.C8942a;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p407a.p413g.C9017c;
import p402l.p406b.p407a.p416i.C9052e;
import p402l.p406b.p426c.C9130j;
import p402l.p406b.p426c.p431t.C9180d;
import p402l.p406b.p426c.p431t.C9244r;

/* renamed from: l.b.a.j.e */
/* compiled from: MP3FileWriter */
public class C9062e extends C9052e {
    /* renamed from: a */
    public synchronized void mo31539a(C8942a aVar) throws C9015a, C9017c {
        ((C9060c) aVar).mo31581t((C9244r) null);
        ((C9060c) aVar).mo31582u((C9180d) null);
        aVar.mo31266c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo31300b(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) throws C9017c, IOException {
        throw new RuntimeException("MP3FileReader.getEncodingInfo should be called");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo31301f(C9130j jVar, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) throws C9017c, IOException {
        throw new RuntimeException("MP3FileReaderwriteTag should not be called");
    }
}
