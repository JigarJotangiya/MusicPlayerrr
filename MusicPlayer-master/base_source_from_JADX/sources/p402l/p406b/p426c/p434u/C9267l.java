package p402l.p406b.p426c.p434u;

import java.io.IOException;
import java.io.RandomAccessFile;
import p402l.p406b.p426c.C9131k;
import p402l.p406b.p426c.C9134n;
import p402l.p406b.p426c.p431t.C9176c;
import p402l.p406b.p426c.p431t.C9188f;
import p402l.p406b.p426c.p431t.C9190g;
import p402l.p406b.p426c.p431t.p432k0.C9199a;
import p402l.p406b.p426c.p431t.p432k0.C9205d;
import p402l.p406b.p426c.p431t.p432k0.C9211i;
import p402l.p406b.p426c.p431t.p432k0.C9227y;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.u.l */
/* compiled from: Lyrics3v2Field */
public class C9267l extends C9188f {
    public C9267l() {
    }

    /* renamed from: g */
    public String mo31857g() {
        C9190g gVar = this.f35855h;
        if (gVar == null) {
            return BuildConfig.FLAVOR;
        }
        return gVar.mo31857g();
    }

    /* renamed from: h */
    public int mo31919h() {
        return this.f35855h.mo31919h() + 5 + mo31857g().length();
    }

    /* renamed from: l */
    public void mo32103l(RandomAccessFile randomAccessFile) throws IOException {
        if (this.f35855h.mo31919h() > 0 || C9134n.m48562h().mo31753x()) {
            byte[] bArr = new byte[3];
            String g = mo31857g();
            for (int i = 0; i < g.length(); i++) {
                bArr[i] = (byte) g.charAt(i);
            }
            randomAccessFile.write(bArr, 0, g.length());
        }
    }

    public String toString() {
        C9190g gVar = this.f35855h;
        if (gVar == null) {
            return BuildConfig.FLAVOR;
        }
        return gVar.toString();
    }

    public C9267l(C9267l lVar) {
        super(lVar);
    }

    public C9267l(C9257b bVar) {
        this.f35855h = bVar;
    }

    public C9267l(C9176c cVar) throws C9131k {
        String g = cVar.mo31857g();
        if (g.startsWith("USLT")) {
            C9264i iVar = new C9264i(BuildConfig.FLAVOR);
            this.f35855h = iVar;
            iVar.mo32095v((C9227y) cVar.mo31934j());
        } else if (g.startsWith("SYLT")) {
            C9264i iVar2 = new C9264i(BuildConfig.FLAVOR);
            this.f35855h = iVar2;
            iVar2.mo32094u((C9211i) cVar.mo31934j());
        } else if (g.startsWith("COMM")) {
            this.f35855h = new C9263h(((C9205d) cVar.mo31934j()).mo31975y());
        } else if (g.equals("TCOM")) {
            C9199a aVar = (C9199a) cVar.mo31934j();
            this.f35855h = new C9258c(BuildConfig.FLAVOR);
            if (aVar != null && aVar.mo31962x().length() > 0) {
                this.f35855h = new C9258c(aVar.mo31962x());
            }
        } else if (g.equals("TALB")) {
            C9199a aVar2 = (C9199a) cVar.mo31934j();
            if (aVar2 != null && aVar2.mo31962x().length() > 0) {
                this.f35855h = new C9259d(aVar2.mo31962x());
            }
        } else if (g.equals("TPE1")) {
            C9199a aVar3 = (C9199a) cVar.mo31934j();
            if (aVar3 != null && aVar3.mo31962x().length() > 0) {
                this.f35855h = new C9260e(aVar3.mo31962x());
            }
        } else if (g.equals("TIT2")) {
            C9199a aVar4 = (C9199a) cVar.mo31934j();
            if (aVar4 != null && aVar4.mo31962x().length() > 0) {
                this.f35855h = new C9261f(aVar4.mo31962x());
            }
        } else {
            throw new C9131k("Cannot createField Lyrics3v2 field from given ID3v2 frame");
        }
    }
}
