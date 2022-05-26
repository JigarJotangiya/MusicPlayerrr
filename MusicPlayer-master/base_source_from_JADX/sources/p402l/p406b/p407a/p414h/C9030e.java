package p402l.p406b.p407a.p414h;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Logger;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.p431t.C9180d;

/* renamed from: l.b.a.h.e */
/* compiled from: FlacStreamReader */
public class C9030e {

    /* renamed from: c */
    public static Logger f35474c = Logger.getLogger("org.jaudiotagger.audio.flac");

    /* renamed from: a */
    private RandomAccessFile f35475a;

    /* renamed from: b */
    private int f35476b;

    public C9030e(RandomAccessFile randomAccessFile) {
        this.f35475a = randomAccessFile;
    }

    /* renamed from: c */
    private boolean m48192c() throws IOException {
        byte[] bArr = new byte[4];
        this.f35475a.read(bArr);
        return new String(bArr).equals("fLaC");
    }

    /* renamed from: d */
    private boolean m48193d() throws IOException {
        this.f35475a.seek(0);
        if (C9180d.m48789H(this.f35475a)) {
            f35474c.warning(C9118b.FLAC_CONTAINS_ID3TAG.getMsg(Long.valueOf(this.f35475a.getFilePointer())));
            if (m48192c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo31486a() throws IOException, C9015a {
        if (this.f35475a.length() != 0) {
            this.f35475a.seek(0);
            if (m48192c()) {
                this.f35476b = 0;
            } else if (m48193d()) {
                this.f35476b = (int) (this.f35475a.getFilePointer() - 4);
            } else {
                throw new C9015a(C9118b.FLAC_NO_FLAC_HEADER_FOUND.getMsg());
            }
        } else {
            throw new C9015a("Error: File empty");
        }
    }

    /* renamed from: b */
    public int mo31487b() {
        return this.f35476b;
    }
}
