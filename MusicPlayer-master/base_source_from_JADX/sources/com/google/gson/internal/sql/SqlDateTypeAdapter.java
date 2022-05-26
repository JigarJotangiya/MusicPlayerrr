package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.p253b.C6488a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

final class SqlDateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: b */
    static final TypeAdapterFactory f29950b = new TypeAdapterFactory() {
        public <T> TypeAdapter<T> create(Gson gson, C6488a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    private final DateFormat f29951a;

    /* renamed from: a */
    public synchronized Date read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return new Date(this.f29951a.parse(jsonReader.nextString()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException((Throwable) e);
        }
    }

    /* renamed from: b */
    public synchronized void write(JsonWriter jsonWriter, Date date) throws IOException {
        jsonWriter.value(date == null ? null : this.f29951a.format(date));
    }

    private SqlDateTypeAdapter() {
        this.f29951a = new SimpleDateFormat("MMM d, yyyy");
    }
}
