package com.airbnb.lottie.p015t.p016b;

import android.graphics.Path;
import com.airbnb.lottie.p026y.C1683h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.b.b */
/* compiled from: CompoundTrimPathContent */
public class C1509b {

    /* renamed from: a */
    private List<C1528s> f5783a = new ArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7138a(C1528s sVar) {
        this.f5783a.add(sVar);
    }

    /* renamed from: b */
    public void mo7139b(Path path) {
        for (int size = this.f5783a.size() - 1; size >= 0; size--) {
            C1683h.m8456b(path, this.f5783a.get(size));
        }
    }
}
