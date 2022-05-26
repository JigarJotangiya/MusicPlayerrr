package com.bumptech.glide.load.p030n;

import android.util.Log;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.C1792k;
import com.bumptech.glide.load.data.C1754e;
import com.bumptech.glide.load.p036p.p042i.C2087e;
import com.bumptech.glide.p051s.C2193j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p082e.p109h.p118o.C3700f;

/* renamed from: com.bumptech.glide.load.n.i */
/* compiled from: DecodePath */
public class C1871i<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<DataType> f6761a;

    /* renamed from: b */
    private final List<? extends C1792k<DataType, ResourceType>> f6762b;

    /* renamed from: c */
    private final C2087e<ResourceType, Transcode> f6763c;

    /* renamed from: d */
    private final C3700f<List<Throwable>> f6764d;

    /* renamed from: e */
    private final String f6765e;

    /* renamed from: com.bumptech.glide.load.n.i$a */
    /* compiled from: DecodePath */
    interface C1872a<ResourceType> {
        /* renamed from: a */
        C1902v<ResourceType> mo7912a(C1902v<ResourceType> vVar);
    }

    public C1871i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends C1792k<DataType, ResourceType>> list, C2087e<ResourceType, Transcode> eVar, C3700f<List<Throwable>> fVar) {
        this.f6761a = cls;
        this.f6762b = list;
        this.f6763c = eVar;
        this.f6764d = fVar;
        this.f6765e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: b */
    private C1902v<ResourceType> m9099b(C1754e<DataType> eVar, int i, int i2, C1790i iVar) throws C1895q {
        List<Throwable> b = this.f6764d.mo8513b();
        C2193j.m10269d(b);
        List list = b;
        try {
            return m9100c(eVar, i, i2, iVar, list);
        } finally {
            this.f6764d.mo8512a(list);
        }
    }

    /* renamed from: c */
    private C1902v<ResourceType> m9100c(C1754e<DataType> eVar, int i, int i2, C1790i iVar, List<Throwable> list) throws C1895q {
        int size = this.f6762b.size();
        C1902v<ResourceType> vVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C1792k kVar = (C1792k) this.f6762b.get(i3);
            try {
                if (kVar.mo7748a(eVar.mo7681a(), iVar)) {
                    vVar = kVar.mo7749b(eVar.mo7681a(), i, i2, iVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + kVar, e);
                }
                list.add(e);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new C1895q(this.f6765e, (List<Throwable>) new ArrayList(list));
    }

    /* renamed from: a */
    public C1902v<Transcode> mo7922a(C1754e<DataType> eVar, int i, int i2, C1790i iVar, C1872a<ResourceType> aVar) throws C1895q {
        return this.f6763c.mo8232a(aVar.mo7912a(m9099b(eVar, i, i2, iVar)), iVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f6761a + ", decoders=" + this.f6762b + ", transcoder=" + this.f6763c + '}';
    }
}
