package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.d7 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class C4993d7 implements C5030e7 {

    /* renamed from: b */
    private static final Logger f15523b = Logger.getLogger(C4993d7.class.getName());

    /* renamed from: a */
    final ThreadLocal<ByteBuffer> f15524a = new C4956c7(this);

    /* renamed from: a */
    public final C5142h7 mo16872a(kr3 kr3, C5179i7 i7Var) throws IOException {
        int B0;
        long j;
        long a = kr3.mo19005a();
        this.f15524a.get().rewind().limit(8);
        do {
            B0 = kr3.mo19003B0(this.f15524a.get());
            if (B0 == 8) {
                this.f15524a.get().rewind();
                long e = C5105g7.m24187e(this.f15524a.get());
                byte[] bArr = null;
                if (e >= 8 || e <= 1) {
                    byte[] bArr2 = new byte[4];
                    this.f15524a.get().get(bArr2);
                    try {
                        String str = new String(bArr2, "ISO-8859-1");
                        if (e == 1) {
                            this.f15524a.get().limit(16);
                            kr3.mo19003B0(this.f15524a.get());
                            this.f15524a.get().position(8);
                            j = C5105g7.m24188f(this.f15524a.get()) - 16;
                        } else {
                            j = e == 0 ? kr3.mo19006b() - kr3.mo19005a() : e - 8;
                        }
                        if ("uuid".equals(str)) {
                            this.f15524a.get().limit(this.f15524a.get().limit() + 16);
                            kr3.mo19003B0(this.f15524a.get());
                            bArr = new byte[16];
                            for (int position = this.f15524a.get().position() - 16; position < this.f15524a.get().position(); position++) {
                                bArr[position - (this.f15524a.get().position() - 16)] = this.f15524a.get().get(position);
                            }
                            j -= 16;
                        }
                        long j2 = j;
                        C5142h7 b = mo16873b(str, bArr, i7Var instanceof C5142h7 ? ((C5142h7) i7Var).zza() : BuildConfig.FLAVOR);
                        b.mo17279d(i7Var);
                        this.f15524a.get().rewind();
                        b.mo17280p(kr3, this.f15524a.get(), j2, this);
                        return b;
                    } catch (UnsupportedEncodingException e2) {
                        throw new RuntimeException(e2);
                    }
                } else {
                    Logger logger = f15523b;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(e);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
            }
        } while (B0 >= 0);
        kr3.mo19007g(a);
        throw new EOFException();
    }

    /* renamed from: b */
    public abstract C5142h7 mo16873b(String str, byte[] bArr, String str2);
}
