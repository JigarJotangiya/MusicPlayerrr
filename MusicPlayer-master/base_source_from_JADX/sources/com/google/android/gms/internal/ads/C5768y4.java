package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.gms.internal.ads.y4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5768y4 {
    /* renamed from: a */
    public static long m34017a(ByteBuffer byteBuffer) {
        m34023g(byteBuffer);
        return m34021e(byteBuffer, byteBuffer.position() + 16);
    }

    /* renamed from: b */
    public static long m34018b(ByteBuffer byteBuffer) {
        m34023g(byteBuffer);
        return m34021e(byteBuffer, byteBuffer.position() + 12);
    }

    /* renamed from: c */
    static Pair<ByteBuffer, Long> m34019c(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair<ByteBuffer, Long> f = m34022f(randomAccessFile, 0);
        if (f != null) {
            return f;
        }
        return m34022f(randomAccessFile, 65535);
    }

    /* renamed from: d */
    public static void m34020d(ByteBuffer byteBuffer, long j) {
        m34023g(byteBuffer);
        int position = byteBuffer.position() + 16;
        if (j < 0 || j > 4294967295L) {
            StringBuilder sb = new StringBuilder(47);
            sb.append("uint32 value of out range: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        byteBuffer.putInt(byteBuffer.position() + position, (int) j);
    }

    /* renamed from: e */
    private static long m34021e(ByteBuffer byteBuffer, int i) {
        return ((long) byteBuffer.getInt(i)) & 4294967295L;
    }

    /* renamed from: f */
    private static Pair<ByteBuffer, Long> m34022f(RandomAccessFile randomAccessFile, int i) throws IOException {
        int i2;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min((long) i, -22 + length)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - ((long) allocate.capacity());
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        m34023g(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i3 = capacity2 - 22;
            int min = Math.min(i3, 65535);
            int i4 = 0;
            while (true) {
                if (i4 >= min) {
                    break;
                }
                i2 = i3 - i4;
                if (allocate.getInt(i2) == 101010256 && ((char) allocate.getShort(i2 + 20)) == i4) {
                    break;
                }
                i4++;
            }
        }
        i2 = -1;
        if (i2 == -1) {
            return null;
        }
        allocate.position(i2);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + ((long) i2)));
    }

    /* renamed from: g */
    private static void m34023g(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
