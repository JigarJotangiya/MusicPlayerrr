package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.s4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5546s4 implements C5509r4 {

    /* renamed from: a */
    private final FileChannel f23325a;

    /* renamed from: b */
    private final long f23326b;

    /* renamed from: c */
    private final long f23327c;

    public C5546s4(FileChannel fileChannel, long j, long j2) {
        this.f23325a = fileChannel;
        this.f23326b = j;
        this.f23327c = j2;
    }

    /* renamed from: a */
    public final void mo20390a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.f23325a.map(FileChannel.MapMode.READ_ONLY, this.f23326b + j, (long) i);
        map.load();
        for (MessageDigest update : messageDigestArr) {
            map.position(0);
            update.update(map);
        }
    }

    public final long zza() {
        return this.f23327c;
    }
}
