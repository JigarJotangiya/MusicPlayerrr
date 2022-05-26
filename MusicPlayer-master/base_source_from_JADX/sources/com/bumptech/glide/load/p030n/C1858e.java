package com.bumptech.glide.load.p030n;

import com.bumptech.glide.load.C1747d;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.p030n.p032b0.C1826a;
import java.io.File;

/* renamed from: com.bumptech.glide.load.n.e */
/* compiled from: DataCacheWriter */
class C1858e<DataType> implements C1826a.C1828b {

    /* renamed from: a */
    private final C1747d<DataType> f6695a;

    /* renamed from: b */
    private final DataType f6696b;

    /* renamed from: c */
    private final C1790i f6697c;

    C1858e(C1747d<DataType> dVar, DataType datatype, C1790i iVar) {
        this.f6695a = dVar;
        this.f6696b = datatype;
        this.f6697c = iVar;
    }

    /* renamed from: a */
    public boolean mo7824a(File file) {
        return this.f6695a.mo7680a(this.f6696b, file, this.f6697c);
    }
}
