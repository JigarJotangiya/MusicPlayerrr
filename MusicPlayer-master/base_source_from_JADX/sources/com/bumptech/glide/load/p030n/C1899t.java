package com.bumptech.glide.load.p030n;

import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.data.C1754e;
import com.bumptech.glide.load.p030n.C1871i;
import com.bumptech.glide.p051s.C2193j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p082e.p109h.p118o.C3700f;

/* renamed from: com.bumptech.glide.load.n.t */
/* compiled from: LoadPath */
public class C1899t<Data, ResourceType, Transcode> {

    /* renamed from: a */
    private final C3700f<List<Throwable>> f6849a;

    /* renamed from: b */
    private final List<? extends C1871i<Data, ResourceType, Transcode>> f6850b;

    /* renamed from: c */
    private final String f6851c;

    public C1899t(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C1871i<Data, ResourceType, Transcode>> list, C3700f<List<Throwable>> fVar) {
        this.f6849a = fVar;
        C2193j.m10268c(list);
        this.f6850b = list;
        this.f6851c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: b */
    private C1902v<Transcode> m9187b(C1754e<Data> eVar, C1790i iVar, int i, int i2, C1871i.C1872a<ResourceType> aVar, List<Throwable> list) throws C1895q {
        List<Throwable> list2 = list;
        int size = this.f6850b.size();
        C1902v<Transcode> vVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                vVar = ((C1871i) this.f6850b.get(i3)).mo7922a(eVar, i, i2, iVar, aVar);
            } catch (C1895q e) {
                list2.add(e);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new C1895q(this.f6851c, (List<Throwable>) new ArrayList(list2));
    }

    /* renamed from: a */
    public C1902v<Transcode> mo7993a(C1754e<Data> eVar, C1790i iVar, int i, int i2, C1871i.C1872a<ResourceType> aVar) throws C1895q {
        List<Throwable> b = this.f6849a.mo8513b();
        C2193j.m10269d(b);
        List list = b;
        try {
            return m9187b(eVar, iVar, i, i2, aVar, list);
        } finally {
            this.f6849a.mo8512a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f6850b.toArray()) + '}';
    }
}
