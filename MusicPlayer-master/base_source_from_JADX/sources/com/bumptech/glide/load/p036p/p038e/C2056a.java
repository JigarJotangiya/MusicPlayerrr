package com.bumptech.glide.load.p036p.p038e;

import com.bumptech.glide.load.data.C1754e;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.p.e.a */
/* compiled from: ByteBufferRewinder */
public class C2056a implements C1754e<ByteBuffer> {

    /* renamed from: a */
    private final ByteBuffer f7099a;

    /* renamed from: com.bumptech.glide.load.p.e.a$a */
    /* compiled from: ByteBufferRewinder */
    public static class C2057a implements C1754e.C1755a<ByteBuffer> {
        /* renamed from: a */
        public Class<ByteBuffer> mo7685a() {
            return ByteBuffer.class;
        }

        /* renamed from: c */
        public C1754e<ByteBuffer> mo7686b(ByteBuffer byteBuffer) {
            return new C2056a(byteBuffer);
        }
    }

    public C2056a(ByteBuffer byteBuffer) {
        this.f7099a = byteBuffer;
    }

    /* renamed from: b */
    public void mo7682b() {
    }

    /* renamed from: c */
    public ByteBuffer mo7681a() {
        this.f7099a.position(0);
        return this.f7099a;
    }
}
