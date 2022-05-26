package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.C3044v0;
import com.google.android.gms.common.util.C3365j;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class mp2 {

    /* renamed from: a */
    public final List<bp2> f20120a;

    /* renamed from: b */
    public final ep2 f20121b;

    /* renamed from: c */
    public final List<lp2> f20122c;

    mp2(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException, AssertionError {
        List<bp2> emptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        ep2 ep2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        emptyList = new ArrayList<>();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            emptyList.add(new bp2(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        ep2 = new ep2(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    JSONObject jSONObject = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if ("name".equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            jSONObject = C3044v0.m13481h(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new lp2(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.f20122c = arrayList;
        this.f20120a = emptyList;
        this.f20121b = ep2 == null ? new ep2(new JsonReader(new StringReader("{}"))) : ep2;
    }

    /* renamed from: a */
    public static mp2 m27384a(Reader reader) throws fp2 {
        try {
            mp2 mp2 = new mp2(new JsonReader(reader));
            C3365j.m14462a(reader);
            return mp2;
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
            throw new fp2("unable to parse ServerResponse", e);
        } catch (Throwable th) {
            C3365j.m14462a(reader);
            throw th;
        }
    }
}
