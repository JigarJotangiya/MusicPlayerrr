package p402l.p406b.p407a.p409f.p411d;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import p402l.p406b.p407a.p409f.p410c.C8978l;
import p402l.p406b.p407a.p409f.p412e.C9014c;

/* renamed from: l.b.a.f.d.d */
/* compiled from: AsfStreamer */
public class C8991d {
    /* renamed from: a */
    private void m48108a(C8978l lVar, InputStream inputStream, OutputStream outputStream) throws IOException {
        long o = C9014c.m48181o(inputStream);
        outputStream.write(lVar.mo31375b());
        C9014c.m48184r(o, outputStream);
        C9014c.m48167a(inputStream, outputStream, o - 24);
    }

    /* renamed from: c */
    private void m48109c(InputStream inputStream, OutputStream outputStream, long j) throws IOException {
        outputStream.write(C8978l.f35399k.mo31375b());
        long o = C9014c.m48181o(inputStream);
        C9014c.m48184r(o, outputStream);
        outputStream.write(C9014c.m48178l(inputStream).mo31375b());
        C9014c.m48184r(C9014c.m48181o(inputStream) + j, outputStream);
        C9014c.m48167a(inputStream, outputStream, o - 48);
    }

    /* renamed from: b */
    public void mo31458b(InputStream inputStream, OutputStream outputStream, List<C8994g> list) throws IOException {
        long j;
        byte[] bArr;
        long j2;
        byte[] bArr2;
        InputStream inputStream2 = inputStream;
        OutputStream outputStream2 = outputStream;
        List<C8994g> list2 = list;
        ArrayList<C8994g> arrayList = new ArrayList<>();
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        C8978l l = C9014c.m48178l(inputStream);
        if (C8978l.f35400l.equals(l)) {
            long o = C9014c.m48181o(inputStream);
            long n = C9014c.m48180n(inputStream);
            byte[] bArr3 = {(byte) (inputStream.read() & 255), (byte) (inputStream.read() & 255)};
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            long j3 = 0;
            long j4 = 0;
            long j5 = 0;
            byte[] bArr4 = null;
            while (j3 < n) {
                C8978l l2 = C9014c.m48178l(inputStream);
                if (C8978l.f35399k.equals(l2)) {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    long o2 = C9014c.m48181o(inputStream);
                    C9014c.m48184r(o2, byteArrayOutputStream2);
                    C9014c.m48167a(inputStream2, byteArrayOutputStream2, o2 - 24);
                    bArr4 = byteArrayOutputStream2.toByteArray();
                    j = n;
                    bArr = bArr3;
                } else {
                    byte[] bArr5 = bArr4;
                    int i = 0;
                    boolean z = false;
                    while (i < arrayList.size() && !z) {
                        if (((C8994g) arrayList.get(i)).mo31450a(l2)) {
                            C9005r b = ((C8994g) arrayList.get(i)).mo31451b(l2, inputStream2, byteArrayOutputStream);
                            bArr2 = bArr3;
                            j2 = n;
                            j5 += (long) b.mo31474b();
                            j4 += b.mo31473a();
                            arrayList.remove(i);
                            z = true;
                        } else {
                            j2 = n;
                            bArr2 = bArr3;
                        }
                        i++;
                        bArr3 = bArr2;
                        n = j2;
                    }
                    j = n;
                    bArr = bArr3;
                    if (!z) {
                        m48108a(l2, inputStream2, byteArrayOutputStream);
                    }
                    bArr4 = bArr5;
                }
                j3++;
                bArr3 = bArr;
                n = j;
            }
            long j6 = n;
            byte[] bArr6 = bArr3;
            byte[] bArr7 = bArr4;
            long j7 = j4;
            for (C8994g b2 : arrayList) {
                C9005r b3 = b2.mo31451b((C8978l) null, (InputStream) null, byteArrayOutputStream);
                j5 += (long) b3.mo31474b();
                j7 += b3.mo31473a();
            }
            outputStream2.write(l.mo31375b());
            C9014c.m48184r(o + j7, outputStream2);
            C9014c.m48183q(j6 + j5, outputStream2);
            outputStream2.write(bArr6);
            m48109c(new ByteArrayInputStream(bArr7), outputStream2, j7);
            outputStream2.write(byteArrayOutputStream.toByteArray());
            C9014c.m48168b(inputStream, outputStream);
            return;
        }
        throw new IllegalArgumentException("No ASF header object.");
    }
}
