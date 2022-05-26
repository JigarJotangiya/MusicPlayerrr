package com.google.android.gms.internal.ads;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vw2 implements sw2 {

    /* renamed from: a */
    private final sw2 f25033a;

    public vw2(sw2 sw2) {
        this.f25033a = sw2;
    }

    /* renamed from: a */
    public final void mo20975a(View view, JSONObject jSONObject, rw2 rw2, boolean z) {
        ArrayList arrayList = new ArrayList();
        jw2 a = jw2.m26008a();
        if (a != null) {
            Collection<yv2> b = a.mo18754b();
            int size = b.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            for (yv2 f : b) {
                View f2 = f.mo22298f();
                if (f2 != null && ((Build.VERSION.SDK_INT < 19 || f2.isAttachedToWindow()) && f2.isShown())) {
                    View view2 = f2;
                    while (true) {
                        if (view2 != null) {
                            if (view2.getAlpha() == 0.0f) {
                                break;
                            }
                            ViewParent parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        } else {
                            View rootView = f2.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float a2 = ex2.m23308a(rootView);
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (ex2.m23308a((View) arrayList.get(i)) <= a2) {
                                        break;
                                    }
                                    size2 = i;
                                }
                                arrayList.add(size2, rootView);
                            }
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            rw2.mo19860a((View) arrayList.get(i2), this.f25033a, jSONObject);
        }
    }

    /* renamed from: c */
    public final JSONObject mo20976c(View view) {
        throw null;
    }
}
