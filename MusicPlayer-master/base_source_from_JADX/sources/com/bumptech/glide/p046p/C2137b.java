package com.bumptech.glide.p046p;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.p.b */
/* compiled from: ImageHeaderParserRegistry */
public final class C2137b {

    /* renamed from: a */
    private final List<ImageHeaderParser> f7293a = new ArrayList();

    /* renamed from: a */
    public synchronized void mo8340a(ImageHeaderParser imageHeaderParser) {
        this.f7293a.add(imageHeaderParser);
    }

    /* renamed from: b */
    public synchronized List<ImageHeaderParser> mo8341b() {
        return this.f7293a;
    }
}
