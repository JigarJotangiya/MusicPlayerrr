package com.airbnb.lottie.p015t.p017c;

import android.graphics.Path;
import com.airbnb.lottie.p019v.p021k.C1586h;
import com.airbnb.lottie.p019v.p021k.C1594m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.c.h */
/* compiled from: MaskKeyframeAnimation */
public class C1543h {

    /* renamed from: a */
    private final List<C1529a<C1594m, Path>> f5929a;

    /* renamed from: b */
    private final List<C1529a<Integer, Integer>> f5930b;

    /* renamed from: c */
    private final List<C1586h> f5931c;

    public C1543h(List<C1586h> list) {
        this.f5931c = list;
        this.f5929a = new ArrayList(list.size());
        this.f5930b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f5929a.add(list.get(i).mo7293b().mo7245a());
            this.f5930b.add(list.get(i).mo7294c().mo7245a());
        }
    }

    /* renamed from: a */
    public List<C1529a<C1594m, Path>> mo7187a() {
        return this.f5929a;
    }

    /* renamed from: b */
    public List<C1586h> mo7188b() {
        return this.f5931c;
    }

    /* renamed from: c */
    public List<C1529a<Integer, Integer>> mo7189c() {
        return this.f5930b;
    }
}
