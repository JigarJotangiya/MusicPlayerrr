package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cp2 {

    /* renamed from: a */
    public final int f15117a;

    /* renamed from: b */
    public final int f15118b;

    /* renamed from: c */
    public final boolean f15119c;

    public cp2(int i, int i2, boolean z) {
        this.f15117a = i;
        this.f15118b = i2;
        this.f15119c = z;
    }

    /* renamed from: a */
    static List<cp2> m22067a(JsonReader jsonReader) throws IllegalStateException, IOException, NumberFormatException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i = 0;
            int i2 = 0;
            boolean z = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i2 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new cp2(i, i2, z));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
