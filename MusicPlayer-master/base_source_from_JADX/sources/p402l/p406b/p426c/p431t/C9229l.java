package p402l.p406b.p426c.p431t;

import java.nio.ByteBuffer;

/* renamed from: l.b.c.t.l */
/* compiled from: ID3SyncSafeInteger */
public class C9229l {
    /* renamed from: a */
    protected static int m49050a(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr, 0, 4);
        return m49051b(bArr);
    }

    /* renamed from: b */
    private static int m49051b(byte[] bArr) {
        return ((bArr[0] & 255) << 21) + ((bArr[1] & 255) << 14) + ((bArr[2] & 255) << 7) + (bArr[3] & 255);
    }

    /* renamed from: c */
    protected static boolean m49052c(byte[] bArr) {
        for (byte b : bArr) {
            if (b != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    protected static boolean m49053d(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        for (int i = 0; i < 4; i++) {
            if ((byteBuffer.get(position + i) & 128) > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    protected static byte[] m49054e(int i) {
        return new byte[]{(byte) ((266338304 & i) >> 21), (byte) ((2080768 & i) >> 14), (byte) ((i & 16256) >> 7), (byte) (i & 127)};
    }
}
