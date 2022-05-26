package p159f.p237d.p238a.p239g;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: f.d.a.g.j */
/* compiled from: Program32Header */
public class C4844j extends C4839e {
    public C4844j(C4843i iVar, C4838d dVar, long j) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(dVar.f13651a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = dVar.f13652b + (j * ((long) dVar.f13654d));
        this.f13657a = iVar.mo15592T(allocate, j2);
        this.f13658b = iVar.mo15592T(allocate, 4 + j2);
        this.f13659c = iVar.mo15592T(allocate, 8 + j2);
        this.f13660d = iVar.mo15592T(allocate, j2 + 20);
    }
}
