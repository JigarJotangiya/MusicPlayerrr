package p159f.p237d.p238a.p239g;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: f.d.a.g.i */
/* compiled from: ElfParser */
public class C4843i implements Closeable {

    /* renamed from: g */
    private final FileChannel f13664g;

    public C4843i(File file) throws FileNotFoundException {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f13664g = new FileInputStream(file).getChannel();
    }

    /* renamed from: c */
    private long m20483c(C4838d dVar, long j, long j2) throws IOException {
        for (long j3 = 0; j3 < j; j3++) {
            C4839e b = dVar.mo15586b(j3);
            if (b.f13657a == 1) {
                long j4 = b.f13659c;
                if (j4 <= j2 && j2 <= b.f13660d + j4) {
                    return (j2 - j4) + b.f13658b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public short mo15588E(ByteBuffer byteBuffer, long j) throws IOException {
        mo15596x(byteBuffer, j, 1);
        return (short) (byteBuffer.get() & 255);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public int mo15589H(ByteBuffer byteBuffer, long j) throws IOException {
        mo15596x(byteBuffer, j, 2);
        return byteBuffer.getShort() & 65535;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public long mo15590K(ByteBuffer byteBuffer, long j) throws IOException {
        mo15596x(byteBuffer, j, 8);
        return byteBuffer.getLong();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public String mo15591Q(ByteBuffer byteBuffer, long j) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short E = mo15588E(byteBuffer, j);
            if (E == 0) {
                return sb.toString();
            }
            sb.append((char) E);
            j = j2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public long mo15592T(ByteBuffer byteBuffer, long j) throws IOException {
        mo15596x(byteBuffer, j, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    public void close() throws IOException {
        this.f13664g.close();
    }

    /* renamed from: d */
    public C4838d mo15594d() throws IOException {
        this.f13664g.position(0);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (mo15592T(allocate, 0) == 1179403647) {
            short E = mo15588E(allocate, 4);
            boolean z = mo15588E(allocate, 5) == 2;
            if (E == 1) {
                return new C4841g(z, this);
            }
            if (E == 2) {
                return new C4842h(z, this);
            }
            throw new IllegalStateException("Invalid class type!");
        }
        throw new IllegalArgumentException("Invalid ELF Magic!");
    }

    /* renamed from: p */
    public List<String> mo15595p() throws IOException {
        long j;
        this.f13664g.position(0);
        ArrayList arrayList = new ArrayList();
        C4838d d = mo15594d();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(d.f13651a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = (long) d.f13655e;
        int i = 0;
        if (j2 == 65535) {
            j2 = d.mo15587c(0).f13661a;
        }
        long j3 = 0;
        while (true) {
            if (j3 >= j2) {
                j = 0;
                break;
            }
            C4839e b = d.mo15586b(j3);
            if (b.f13657a == 2) {
                j = b.f13658b;
                break;
            }
            j3++;
        }
        if (j == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList<Long> arrayList2 = new ArrayList<>();
        long j4 = 0;
        while (true) {
            C4837c a = d.mo15585a(j, i);
            long j5 = j;
            long j6 = a.f13649a;
            if (j6 == 1) {
                arrayList2.add(Long.valueOf(a.f13650b));
            } else if (j6 == 5) {
                j4 = a.f13650b;
            }
            i++;
            if (a.f13649a == 0) {
                break;
            }
            j = j5;
        }
        if (j4 != 0) {
            long c = m20483c(d, j2, j4);
            for (Long longValue : arrayList2) {
                arrayList.add(mo15591Q(allocate, longValue.longValue() + c));
            }
            return arrayList;
        }
        throw new IllegalStateException("String table offset not found!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo15596x(ByteBuffer byteBuffer, long j, int i) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < ((long) i)) {
            int read = this.f13664g.read(byteBuffer, j + j2);
            if (read != -1) {
                j2 += (long) read;
            } else {
                throw new EOFException();
            }
        }
        byteBuffer.position(0);
    }
}
