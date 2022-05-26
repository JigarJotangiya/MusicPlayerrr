package androidx.work;

import androidx.work.C1236e;
import java.util.HashMap;
import java.util.List;

public final class OverwritingInputMerger extends C1402j {
    /* renamed from: b */
    public C1236e mo6410b(List<C1236e> list) {
        C1236e.C1237a aVar = new C1236e.C1237a();
        HashMap hashMap = new HashMap();
        for (C1236e h : list) {
            hashMap.putAll(h.mo6504h());
        }
        aVar.mo6512d(hashMap);
        return aVar.mo6509a();
    }
}
