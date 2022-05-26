package p159f.p243f.p245b.p318c.p319a.p320a;

import androidx.recyclerview.widget.C0885l;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: f.f.b.c.a.a.v */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C7617v {
    /* renamed from: a */
    public static long m42421a(C7618w wVar, InputStream inputStream, OutputStream outputStream, long j) throws IOException {
        String str;
        byte[] bArr = new byte[16384];
        InputStream inputStream2 = inputStream;
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int readInt = dataInputStream.readInt();
        if (readInt != -771763713) {
            String valueOf = String.valueOf(String.format("%x", new Object[]{Integer.valueOf(readInt)}));
            if (valueOf.length() != 0) {
                str = "Unexpected magic=".concat(valueOf);
            } else {
                str = new String("Unexpected magic=");
            }
            throw new C7616u(str);
        }
        int read = dataInputStream.read();
        if (read == 4) {
            long j2 = 0;
            while (true) {
                long j3 = j - j2;
                try {
                    int read2 = dataInputStream.read();
                    if (read2 == -1) {
                        throw new IOException("Patch file overrun");
                    } else if (read2 == 0) {
                        return j2;
                    } else {
                        switch (read2) {
                            case 247:
                                read2 = dataInputStream.readUnsignedShort();
                                m42423c(bArr, dataInputStream, outputStream, read2, j3);
                                break;
                            case 248:
                                read2 = dataInputStream.readInt();
                                m42423c(bArr, dataInputStream, outputStream, read2, j3);
                                break;
                            case 249:
                                long readUnsignedShort = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    m42422b(bArr, wVar, outputStream, readUnsignedShort, read2, j3);
                                    break;
                                } else {
                                    throw new IOException("Unexpected end of patch");
                                }
                            case C0885l.C0891f.DEFAULT_SWIPE_ANIMATION_DURATION:
                                long readUnsignedShort2 = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.readUnsignedShort();
                                m42422b(bArr, wVar, outputStream, readUnsignedShort2, read2, j3);
                                break;
                            case 251:
                                long readUnsignedShort3 = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.readInt();
                                m42422b(bArr, wVar, outputStream, readUnsignedShort3, read2, j3);
                                break;
                            case 252:
                                long readInt2 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    m42422b(bArr, wVar, outputStream, readInt2, read2, j3);
                                    break;
                                } else {
                                    throw new IOException("Unexpected end of patch");
                                }
                            case 253:
                                long readInt3 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.readUnsignedShort();
                                m42422b(bArr, wVar, outputStream, readInt3, read2, j3);
                                break;
                            case 254:
                                long readInt4 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.readInt();
                                m42422b(bArr, wVar, outputStream, readInt4, read2, j3);
                                break;
                            case 255:
                                long readLong = dataInputStream.readLong();
                                read2 = dataInputStream.readInt();
                                m42422b(bArr, wVar, outputStream, readLong, read2, j3);
                                break;
                            default:
                                m42423c(bArr, dataInputStream, outputStream, read2, j3);
                                break;
                        }
                        j2 += (long) read2;
                    }
                } finally {
                    outputStream.flush();
                }
            }
        } else {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Unexpected version=");
            sb.append(read);
            throw new C7616u(sb.toString());
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0044 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m42422b(byte[] r10, p159f.p243f.p245b.p318c.p319a.p320a.C7618w r11, java.io.OutputStream r12, long r13, int r15, long r16) throws java.io.IOException {
        /*
            r0 = r10
            r1 = r15
            if (r1 < 0) goto L_0x0062
            r2 = 0
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x005a
            long r8 = (long) r1
            int r2 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r2 > 0) goto L_0x0052
            f.f.b.c.a.a.x r2 = new f.f.b.c.a.a.x     // Catch:{ EOFException -> 0x0049 }
            r4 = r2
            r5 = r11
            r6 = r13
            r4.<init>(r5, r6, r8)     // Catch:{ EOFException -> 0x0049 }
            java.io.InputStream r2 = r2.mo28610p()     // Catch:{ EOFException -> 0x0049 }
        L_0x001b:
            if (r1 <= 0) goto L_0x0045
            r3 = 16384(0x4000, float:2.2959E-41)
            int r3 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x0040 }
            r4 = 0
            r5 = 0
        L_0x0025:
            if (r5 >= r3) goto L_0x003a
            int r6 = r3 - r5
            int r6 = r2.read(r10, r5, r6)     // Catch:{ all -> 0x0040 }
            r7 = -1
            if (r6 == r7) goto L_0x0032
            int r5 = r5 + r6
            goto L_0x0025
        L_0x0032:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0040 }
            java.lang.String r1 = "truncated input stream"
            r0.<init>(r1)     // Catch:{ all -> 0x0040 }
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x003a:
            r5 = r12
            r12.write(r10, r4, r3)     // Catch:{ all -> 0x0040 }
            int r1 = r1 - r3
            goto L_0x001b
        L_0x0040:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0044 }
        L_0x0044:
            throw r0     // Catch:{ EOFException -> 0x0049 }
        L_0x0045:
            r2.close()     // Catch:{ EOFException -> 0x0049 }
            return
        L_0x0049:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "patch underrun"
            r1.<init>(r2, r0)
            throw r1
        L_0x0052:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Output length overrun"
            r0.<init>(r1)
            throw r0
        L_0x005a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "inputOffset negative"
            r0.<init>(r1)
            throw r0
        L_0x0062:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "copyLength negative"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p243f.p245b.p318c.p319a.p320a.C7617v.m42422b(byte[], f.f.b.c.a.a.w, java.io.OutputStream, long, int, long):void");
    }

    /* renamed from: c */
    private static void m42423c(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i, long j) throws IOException {
        if (i < 0) {
            throw new IOException("copyLength negative");
        } else if (((long) i) <= j) {
            while (i > 0) {
                try {
                    int min = Math.min(i, 16384);
                    dataInputStream.readFully(bArr, 0, min);
                    outputStream.write(bArr, 0, min);
                    i -= min;
                } catch (EOFException unused) {
                    throw new IOException("patch underrun");
                }
            }
        } else {
            throw new IOException("Output length overrun");
        }
    }
}
