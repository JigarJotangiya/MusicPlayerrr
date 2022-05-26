package com.google.android.gms.internal.ads;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ww2 implements sw2 {

    /* renamed from: a */
    private final int[] f25572a = new int[2];

    /* renamed from: a */
    public final void mo20975a(View view, JSONObject jSONObject, rw2 rw2, boolean z) {
        int i;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    rw2.mo19860a(viewGroup.getChildAt(i2), this, jSONObject);
                }
                return;
            }
            HashMap hashMap = new HashMap();
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                View childAt = viewGroup.getChildAt(i3);
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                ArrayList arrayList3 = (ArrayList) hashMap.get((Float) arrayList2.get(i4));
                int size2 = arrayList3.size();
                int i5 = 0;
                while (true) {
                    i = i4 + 1;
                    if (i5 >= size2) {
                        break;
                    }
                    rw2.mo19860a((View) arrayList3.get(i5), this, jSONObject);
                    i5++;
                }
                i4 = i;
            }
        }
    }

    /* renamed from: c */
    public final JSONObject mo20976c(View view) {
        if (view == null) {
            return bx2.m21580a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f25572a);
        int[] iArr = this.f25572a;
        return bx2.m21580a(iArr[0], iArr[1], width, height);
    }
}
