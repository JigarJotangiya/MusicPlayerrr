package p159f.p237d.p238a.p239g;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: f.d.a.g.k */
/* compiled from: Program64Header */
public class C4845k extends C4839e {
    public C4845k(C4843i iVar, C4838d dVar, long j) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(dVar.f13651a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = dVar.f13652b + (j * ((long) dVar.f13654d));
        this.f13657a = iVar.mo15592T(allocate, j2);
        this.f13658b = iVar.mo15590K(allocate, 8 + j2);
        this.f13659c = iVar.mo15590K(allocate, 16 + j2);
        this.f13660d = iVar.mo15590K(allocate, j2 + 40);
    }
}
