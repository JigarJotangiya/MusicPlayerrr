package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class wo3 extends hp3 {
    wo3(int i) {
        super(i, (gp3) null);
    }

    /* renamed from: a */
    public final void mo18182a() {
        if (!mo18193j()) {
            for (int i = 0; i < mo18183b(); i++) {
                Map.Entry g = mo18190g(i);
                if (((hm3) g.getKey()).mo18172b()) {
                    g.setValue(Collections.unmodifiableList((List) g.getValue()));
                }
            }
            for (Map.Entry entry : mo18184c()) {
                if (((hm3) entry.getKey()).mo18172b()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo18182a();
    }
}
