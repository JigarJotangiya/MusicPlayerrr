package p159f.p237d.p238a.p239g;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: f.d.a.g.g */
/* compiled from: Elf32Header */
public class C4841g extends C4838d {

    /* renamed from: g */
    private final C4843i f13662g;

    public C4841g(boolean z, C4843i iVar) throws IOException {
        this.f13651a = z;
        this.f13662g = iVar;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        iVar.mo15589H(allocate, 16);
        this.f13652b = iVar.mo15592T(allocate, 28);
        this.f13653c = iVar.mo15592T(allocate, 32);
        this.f13654d = iVar.mo15589H(allocate, 42);
        this.f13655e = iVar.mo15589H(allocate, 44);
        this.f13656f = iVar.mo15589H(allocate, 46);
        iVar.mo15589H(allocate, 48);
        iVar.mo15589H(allocate, 50);
    }

    /* renamed from: a */
    public C4837c mo15585a(long j, int i) throws IOException {
        return new C4835a(this.f13662g, this, j, i);
    }

    /* renamed from: b */
    public C4839e mo15586b(long j) throws IOException {
        return new C4844j(this.f13662g, this, j);
    }

    /* renamed from: c */
    public C4840f mo15587c(int i) throws IOException {
        return new C4846l(this.f13662g, this, i);
    }
}
