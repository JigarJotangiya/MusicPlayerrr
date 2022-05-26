package p159f.p237d.p238a.p239g;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: f.d.a.g.m */
/* compiled from: Section64Header */
public class C4847m extends C4840f {
    public C4847m(C4843i iVar, C4838d dVar, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(dVar.f13651a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f13661a = iVar.mo15592T(allocate, dVar.f13653c + ((long) (i * dVar.f13656f)) + 44);
    }
}
