package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.jz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5244jz {

    /* renamed from: a */
    private final Collection<C5207iz<?>> f18683a = new ArrayList();

    /* renamed from: b */
    private final Collection<C5207iz<String>> f18684b = new ArrayList();

    /* renamed from: c */
    private final Collection<C5207iz<String>> f18685c = new ArrayList();

    /* renamed from: a */
    public final List<String> mo18769a() {
        ArrayList arrayList = new ArrayList();
        for (C5207iz<String> b : this.f18684b) {
            String str = (String) C5054ev.m23225c().mo20153b(b);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(C5540rz.m30465a());
        return arrayList;
    }

    /* renamed from: b */
    public final List<String> mo18770b() {
        List<String> a = mo18769a();
        for (C5207iz<String> b : this.f18685c) {
            String str = (String) C5054ev.m23225c().mo20153b(b);
            if (!TextUtils.isEmpty(str)) {
                a.add(str);
            }
        }
        a.addAll(C5540rz.m30466b());
        return a;
    }

    /* renamed from: c */
    public final void mo18771c(C5207iz<String> izVar) {
        this.f18684b.add(izVar);
    }

    /* renamed from: d */
    public final void mo18772d(C5207iz izVar) {
        this.f18683a.add(izVar);
    }

    /* renamed from: e */
    public final void mo18773e(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (C5207iz next : this.f18683a) {
            if (next.mo18522e() == 1) {
                next.mo16431d(editor, next.mo16428a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            ul0.m31859d("Flag Json is null.");
        }
    }
}
