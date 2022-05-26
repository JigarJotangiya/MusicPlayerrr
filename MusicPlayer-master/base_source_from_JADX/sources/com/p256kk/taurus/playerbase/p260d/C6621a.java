package com.p256kk.taurus.playerbase.p260d;

import android.os.Bundle;
import com.p256kk.taurus.playerbase.p261e.C6640b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.kk.taurus.playerbase.d.a */
/* compiled from: BundlePool */
public class C6621a {

    /* renamed from: a */
    private static List<Bundle> f30010a = new ArrayList();

    static {
        for (int i = 0; i < 3; i++) {
            f30010a.add(new Bundle());
        }
    }

    /* renamed from: a */
    public static synchronized Bundle m38175a() {
        synchronized (C6621a.class) {
            for (int i = 0; i < 3; i++) {
                if (f30010a.get(i).isEmpty()) {
                    Bundle bundle = f30010a.get(i);
                    return bundle;
                }
            }
            C6640b.m38218c("BundlePool", "<create new bundle object>");
            Bundle bundle2 = new Bundle();
            return bundle2;
        }
    }
}
