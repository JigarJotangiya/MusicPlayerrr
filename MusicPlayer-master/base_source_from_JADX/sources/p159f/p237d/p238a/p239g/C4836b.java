package p159f.p237d.p238a.p239g;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: f.d.a.g.b */
/* compiled from: Dynamic64Structure */
public class C4836b extends C4837c {
    public C4836b(C4843i iVar, C4838d dVar, long j, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(dVar.f13651a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + ((long) (i * 16));
        this.f13649a = iVar.mo15590K(allocate, j2);
        this.f13650b = iVar.mo15590K(allocate, j2 + 8);
    }
}
