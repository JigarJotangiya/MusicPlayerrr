package p402l.p406b.p407a.p423n.p424d;

import java.io.IOException;
import java.io.RandomAccessFile;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p407a.p416i.C9053f;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.a.n.d.b */
/* compiled from: WavInfoReader */
public class C9115b {
    /* renamed from: a */
    public C9053f mo31720a(RandomAccessFile randomAccessFile) throws C9015a, IOException {
        C9053f fVar = new C9053f();
        if (randomAccessFile.length() >= 12) {
            byte[] bArr = new byte[12];
            randomAccessFile.read(bArr);
            if (new C9116c(bArr).mo31721a()) {
                byte[] bArr2 = new byte[34];
                randomAccessFile.read(bArr2);
                C9114a aVar = new C9114a(bArr2);
                if (aVar.mo31718e()) {
                    fVar.mo31555n((((float) randomAccessFile.length()) - 36.0f) / ((float) aVar.mo31715b()));
                    fVar.mo31550i(aVar.mo31716c());
                    fVar.mo31556o(aVar.mo31717d());
                    fVar.mo31549h(aVar.mo31714a());
                    fVar.mo31551j("WAV-RIFF " + aVar.mo31714a() + " bits");
                    fVar.mo31552k(BuildConfig.FLAVOR);
                    fVar.mo31548g((aVar.mo31715b() * 8) / 1000);
                    fVar.mo31557p(false);
                    return fVar;
                }
                throw new C9015a("Wav Format Header not valid");
            }
            throw new C9015a("Wav RIFF Header not valid");
        }
        throw new C9015a("This is not a WAV File (<12 bytes)");
    }
}
