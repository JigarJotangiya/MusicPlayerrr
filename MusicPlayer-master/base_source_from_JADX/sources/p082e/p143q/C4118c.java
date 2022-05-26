package p082e.p143q;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* renamed from: e.q.c */
/* compiled from: ZipUtil */
final class C4118c {

    /* renamed from: e.q.c$a */
    /* compiled from: ZipUtil */
    static class C4119a {

        /* renamed from: a */
        long f12399a;

        /* renamed from: b */
        long f12400b;

        C4119a() {
        }
    }

    /* renamed from: a */
    static long m18206a(RandomAccessFile randomAccessFile, C4119a aVar) throws IOException {
        CRC32 crc32 = new CRC32();
        long j = aVar.f12400b;
        randomAccessFile.seek(aVar.f12399a);
        byte[] bArr = new byte[16384];
        int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384, j));
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j -= (long) read;
            if (j == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min(16384, j));
        }
        return crc32.getValue();
    }

    /* renamed from: b */
    static C4119a m18207b(RandomAccessFile randomAccessFile) throws IOException, ZipException {
        long length = randomAccessFile.length() - 22;
        long j = 0;
        if (length >= 0) {
            long j2 = length - 65536;
            if (j2 >= 0) {
                j = j2;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    C4119a aVar = new C4119a();
                    aVar.f12400b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    aVar.f12399a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    return aVar;
                }
                length--;
            } while (length >= j);
            throw new ZipException("End Of Central Directory signature not found");
        }
        throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
    }

    /* renamed from: c */
    static long m18208c(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return m18206a(randomAccessFile, m18207b(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
