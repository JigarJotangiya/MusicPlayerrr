package p159f.p237d.p238a.p239g;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: f.d.a.g.a */
/* compiled from: Dynamic32Structure */
public class C4835a extends C4837c {
    public C4835a(C4843i iVar, C4838d dVar, long j, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(dVar.f13651a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + ((long) (i * 8));
        this.f13649a = iVar.mo15592T(allocate, j2);
        this.f13650b = iVar.mo15592T(allocate, j2 + 4);
    }
}
