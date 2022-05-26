package net.coocent.android.xmlparser.widget;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class StringAdapter extends TypeAdapter<String> {
    /* renamed from: a */
    public String read(JsonReader jsonReader) throws IOException {
        try {
            if (jsonReader.peek() != JsonToken.NULL) {
                return jsonReader.nextString();
            }
            jsonReader.nextNull();
            return BuildConfig.FLAVOR;
        } catch (Exception e) {
            e.printStackTrace();
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: b */
    public void write(JsonWriter jsonWriter, String str) throws IOException {
        if (str == null) {
            try {
                jsonWriter.nullValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            jsonWriter.value(str);
        }
    }
}
