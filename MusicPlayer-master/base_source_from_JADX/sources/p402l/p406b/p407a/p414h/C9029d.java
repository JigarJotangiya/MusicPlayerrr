package p402l.p406b.p407a.p414h;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Logger;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p407a.p414h.p415i.C9037a;
import p402l.p406b.p407a.p414h.p415i.C9045i;
import p402l.p406b.p407a.p414h.p415i.C9046j;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.a.h.d */
/* compiled from: FlacInfoReader */
public class C9029d {
    static {
        Logger.getLogger("org.jaudiotagger.audio.flac");
    }

    /* renamed from: a */
    private int m48190a(float f, long j) {
        return (int) (((float) ((j / 1000) * 8)) / f);
    }

    /* renamed from: b */
    public C9026a mo31485b(RandomAccessFile randomAccessFile) throws C9015a, IOException {
        new C9030e(randomAccessFile).mo31486a();
        C9045i iVar = null;
        boolean z = false;
        while (!z) {
            C9046j f = C9046j.m48236f(randomAccessFile);
            if (f.mo31512a() == C9037a.STREAMINFO) {
                iVar = new C9045i(f, randomAccessFile);
                if (!iVar.mo31510i()) {
                    throw new C9015a("FLAC StreamInfo not valid");
                }
            } else {
                randomAccessFile.seek(randomAccessFile.getFilePointer() + ((long) f.mo31515d()));
            }
            z = f.mo31516e();
        }
        if (iVar != null) {
            C9026a aVar = new C9026a();
            aVar.mo31553l(iVar.mo31509h());
            aVar.mo31555n(iVar.mo31507f());
            aVar.mo31550i(iVar.mo31504c());
            aVar.mo31556o(iVar.mo31508g());
            aVar.mo31549h(iVar.mo31503b());
            aVar.mo31551j(iVar.mo31505d());
            aVar.mo31552k(BuildConfig.FLAVOR);
            aVar.mo31548g(m48190a(iVar.mo31507f(), randomAccessFile.length() - randomAccessFile.getFilePointer()));
            aVar.mo31554m(true);
            aVar.mo31484q(iVar.mo31506e());
            return aVar;
        }
        throw new C9015a("Unable to find Flac StreamInfo");
    }
}
