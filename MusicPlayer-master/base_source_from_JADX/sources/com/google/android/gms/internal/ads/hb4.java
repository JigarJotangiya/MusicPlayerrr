package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hb4 {

    /* renamed from: a */
    private final ByteArrayOutputStream f17609a;

    /* renamed from: b */
    private final DataOutputStream f17610b;

    public hb4() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f17609a = byteArrayOutputStream;
        this.f17610b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: b */
    private static void m24759b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* renamed from: a */
    public final byte[] mo18121a(zzyw zzyw) {
        this.f17609a.reset();
        try {
            m24759b(this.f17610b, zzyw.f27424g);
            String str = zzyw.f27425h;
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            m24759b(this.f17610b, str);
            this.f17610b.writeLong(zzyw.f27426i);
            this.f17610b.writeLong(zzyw.f27427j);
            this.f17610b.write(zzyw.f27428k);
            this.f17610b.flush();
            return this.f17609a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
