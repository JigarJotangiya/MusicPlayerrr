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
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

final class SqlTimeTypeAdapter extends TypeAdapter<Time> {

    /* renamed from: b */
    static final TypeAdapterFactory f29952b = new TypeAdapterFactory() {
        public <T> TypeAdapter<T> create(Gson gson, C6488a<T> aVar) {
            if (aVar.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    private final DateFormat f29953a;

    /* renamed from: a */
    public synchronized Time read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return new Time(this.f29953a.parse(jsonReader.nextString()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException((Throwable) e);
        }
    }

    /* renamed from: b */
    public synchronized void write(JsonWriter jsonWriter, Time time) throws IOException {
        jsonWriter.value(time == null ? null : this.f29953a.format(time));
    }

    private SqlTimeTypeAdapter() {
        this.f29953a = new SimpleDateFormat("hh:mm:ss a");
    }
}
