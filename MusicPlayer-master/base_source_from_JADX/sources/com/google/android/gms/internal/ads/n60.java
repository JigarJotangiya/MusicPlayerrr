package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C3018m1;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class n60 implements y50<Object> {

    /* renamed from: a */
    private final Object f20518a = new Object();

    /* renamed from: b */
    private final Map<String, m60> f20519b = new HashMap();

    /* renamed from: a */
    public final void mo15685a(Object obj, Map<String, String> map) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = map.get("id");
        String str6 = map.get("fail");
        String str7 = map.get("fail_reason");
        String str8 = map.get("fail_stack");
        String str9 = map.get("result");
        if (true == TextUtils.isEmpty(str8)) {
            str7 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str8)) {
            str = BuildConfig.FLAVOR;
        } else {
            String valueOf = String.valueOf(str8);
            str = valueOf.length() != 0 ? "\n".concat(valueOf) : new String("\n");
        }
        synchronized (this.f20518a) {
            m60 remove = this.f20519b.remove(str5);
            if (remove == null) {
                String valueOf2 = String.valueOf(str5);
                if (valueOf2.length() != 0) {
                    str4 = "Received result for unexpected method invocation: ".concat(valueOf2);
                } else {
                    str4 = new String("Received result for unexpected method invocation: ");
                }
                ul0.m31862g(str4);
            } else if (!TextUtils.isEmpty(str6)) {
                String valueOf3 = String.valueOf(str7);
                String valueOf4 = String.valueOf(str);
                if (valueOf4.length() != 0) {
                    str3 = valueOf3.concat(valueOf4);
                } else {
                    str3 = new String(valueOf3);
                }
                remove.mo17141p(str3);
            } else if (str9 == null) {
                remove.mo17140a((JSONObject) null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str9);
                    if (C3018m1.m13390m()) {
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        if (valueOf5.length() != 0) {
                            str2 = "Result GMSG: ".concat(valueOf5);
                        } else {
                            str2 = new String("Result GMSG: ");
                        }
                        C3018m1.m13388k(str2);
                    }
                    remove.mo17140a(jSONObject);
                } catch (JSONException e) {
                    remove.mo17141p(e.getMessage());
                }
            }
        }
    }

    /* renamed from: b */
    public final <EngineT extends p80> d93<JSONObject> mo19616b(EngineT enginet, String str, JSONObject jSONObject) {
        mm0 mm0 = new mm0();
        C2971s.m13214q();
        String uuid = UUID.randomUUID().toString();
        mo19617c(uuid, new l60(this, mm0));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            enginet.mo17684c1(str, jSONObject2);
        } catch (Exception e) {
            mm0.mo19451e(e);
        }
        return mm0;
    }

    /* renamed from: c */
    public final void mo19617c(String str, m60 m60) {
        synchronized (this.f20518a) {
            this.f20519b.put(str, m60);
        }
    }
}
