package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.eo */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5047eo {

    /* renamed from: a */
    private final int f16029a;

    /* renamed from: b */
    private final C4936bo f16030b = new C5122go();

    public C5047eo(int i) {
        this.f16029a = i;
    }

    /* renamed from: a */
    public final String mo17226a(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(arrayList.get(i).toLowerCase(Locale.US));
            sb.append(10);
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return BuildConfig.FLAVOR;
        }
        C5010do doVar = new C5010do();
        PriorityQueue priorityQueue = new PriorityQueue(this.f16029a, new C4973co(this));
        for (String b : split) {
            String[] b2 = C5085fo.m23738b(b, false);
            if (b2.length != 0) {
                C5233jo.m25803c(b2, this.f16029a, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                doVar.f15683b.write(this.f16030b.mo16329b(((C5196io) it.next()).f18123b));
            } catch (IOException e) {
                ul0.m31860e("Error while writing hash to byteStream", e);
            }
        }
        return doVar.toString();
    }
}
