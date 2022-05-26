package p402l.p406b.p407a.p408e;

import java.io.IOException;
import java.io.RandomAccessFile;
import p402l.p406b.p407a.p408e.C8946a;
import p402l.p406b.p407a.p416i.C9057i;

/* renamed from: l.b.a.e.k */
/* compiled from: CommonChunk */
public class C8958k extends C8955h {

    /* renamed from: c */
    private C8946a f35357c;

    public C8958k(C8956i iVar, RandomAccessFile randomAccessFile, C8946a aVar) {
        super(randomAccessFile, iVar);
        this.f35357c = aVar;
    }

    /* renamed from: a */
    public boolean mo31293a() throws IOException {
        Object obj;
        String str;
        int y = C9057i.m48322y(this.f35353b);
        long z = C9057i.m48323z(this.f35353b);
        int y2 = C9057i.m48322y(this.f35353b);
        this.f35352a -= 8;
        double d = C8951d.m47910d(this.f35353b);
        this.f35352a -= 10;
        String str2 = null;
        if (this.f35357c.mo31283t() != C8946a.C8948b.AIFCTYPE) {
            obj = "sowt";
            str = null;
        } else if (this.f35352a == 0) {
            return false;
        } else {
            str2 = C8951d.m47909c(this.f35353b);
            if (str2.equals("sowt")) {
                this.f35357c.mo31287x(C8946a.C8947a.LITTLE_ENDIAN);
            }
            this.f35352a -= 4;
            str = C8951d.m47911e(this.f35353b);
            obj = "sowt";
            this.f35352a -= (long) (str.length() + 1);
        }
        this.f35357c.mo31549h(y2);
        this.f35357c.mo31556o((int) d);
        this.f35357c.mo31550i(y);
        double d2 = ((double) z) / d;
        this.f35357c.mo31553l((int) d2);
        this.f35357c.mo31555n((float) d2);
        this.f35357c.mo31554m(true);
        if (str2 != null) {
            if (!str2.equals("NONE")) {
                if (str2.equals("raw ")) {
                    str = "PCM 8-bit offset-binary";
                } else if (str2.equals("twos")) {
                    str = "PCM 16-bit twos-complement big-endian";
                } else if (str2.equals(obj)) {
                    str = "PCM 16-bit twos-complement little-endian";
                } else {
                    if (!str2.equals("fl32")) {
                        if (str2.equals("fl64")) {
                            str = "PCM 64-bit floating point";
                        } else if (str2.equals("in24")) {
                            str = "PCM 24-bit integer";
                        } else if (!str2.equals("in32")) {
                            this.f35357c.mo31554m(false);
                        }
                    }
                    str = "PCM 32-bit integer";
                }
            }
            this.f35357c.mo31284u(str);
            if (str != null) {
                int length = str.length();
            }
        }
        return true;
    }
}
