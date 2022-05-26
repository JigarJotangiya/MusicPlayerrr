package com.bumptech.glide.load.p036p.p041h;

import android.util.Log;
import com.bumptech.glide.load.C1778f;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.C1792k;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p030n.C1902v;
import com.bumptech.glide.load.p030n.p031a0.C1802b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.p.h.j */
/* compiled from: StreamGifDecoder */
public class C2082j implements C1792k<InputStream, C2070c> {

    /* renamed from: a */
    private final List<ImageHeaderParser> f7154a;

    /* renamed from: b */
    private final C1792k<ByteBuffer, C2070c> f7155b;

    /* renamed from: c */
    private final C1802b f7156c;

    public C2082j(List<ImageHeaderParser> list, C1792k<ByteBuffer, C2070c> kVar, C1802b bVar) {
        this.f7154a = list;
        this.f7155b = kVar;
        this.f7156c = bVar;
    }

    /* renamed from: e */
    private static byte[] m9754e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e);
            return null;
        }
    }

    /* renamed from: c */
    public C1902v<C2070c> mo7749b(InputStream inputStream, int i, int i2, C1790i iVar) throws IOException {
        byte[] e = m9754e(inputStream);
        if (e == null) {
            return null;
        }
        return this.f7155b.mo7749b(ByteBuffer.wrap(e), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo7748a(InputStream inputStream, C1790i iVar) throws IOException {
        return !((Boolean) iVar.mo7744c(C2081i.f7153b)).booleanValue() && C1778f.m8807e(this.f7154a, inputStream, this.f7156c) == ImageHeaderParser.ImageType.GIF;
    }
}
