package net.coocent.android.xmlparser.widget;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public class IntegerAdapter extends TypeAdapter<Integer> {
    /* renamed from: a */
    public Integer read(JsonReader jsonReader) throws IOException {
        try {
            return Integer.valueOf(Integer.parseInt(jsonReader.nextString()));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public void write(JsonWriter jsonWriter, Integer num) throws IOException {
        jsonWriter.value(String.valueOf(num));
    }
}
