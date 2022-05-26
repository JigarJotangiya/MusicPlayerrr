package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.google.android.gms.common.util.C3359d;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class st1 {

    /* renamed from: a */
    private final C3359d f23623a;

    public st1(C3359d dVar) {
        this.f23623a = dVar;
    }

    /* renamed from: a */
    public final void mo20962a(List<Object> list, String str, String str2, Object... objArr) {
        String str3;
        if (h10.f17486a.mo20989e().booleanValue()) {
            long a = this.f23623a.mo11988a();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(a);
                jsonWriter.name("source").value(str);
                jsonWriter.name("event").value(str2);
                jsonWriter.name("components").beginArray();
                for (Object obj : list) {
                    jsonWriter.value(obj.toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj2 = objArr[i];
                    jsonWriter.value(obj2 != null ? obj2.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e) {
                ul0.m31860e("unable to log", e);
            }
            String valueOf = String.valueOf(stringWriter.toString());
            if (valueOf.length() != 0) {
                str3 = "AD-DBG ".concat(valueOf);
            } else {
                str3 = new String("AD-DBG ");
            }
            ul0.m31861f(str3);
        }
    }
}
