package p159f.p237d.p238a.p239g;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: f.d.a.g.h */
/* compiled from: Elf64Header */
public class C4842h extends C4838d {

    /* renamed from: g */
    private final C4843i f13663g;

    public C4842h(boolean z, C4843i iVar) throws IOException {
        this.f13651a = z;
        this.f13663g = iVar;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        iVar.mo15589H(allocate, 16);
        this.f13652b = iVar.mo15590K(allocate, 32);
        this.f13653c = iVar.mo15590K(allocate, 40);
        this.f13654d = iVar.mo15589H(allocate, 54);
        this.f13655e = iVar.mo15589H(allocate, 56);
        this.f13656f = iVar.mo15589H(allocate, 58);
        iVar.mo15589H(allocate, 60);
        iVar.mo15589H(allocate, 62);
    }

    /* renamed from: a */
    public C4837c mo15585a(long j, int i) throws IOException {
        return new C4836b(this.f13663g, this, j, i);
    }

    /* renamed from: b */
    public C4839e mo15586b(long j) throws IOException {
        return new C4845k(this.f13663g, this, j);
    }

    /* renamed from: c */
    public C4840f mo15587c(int i) throws IOException {
        return new C4847m(this.f13663g, this, i);
    }
}
