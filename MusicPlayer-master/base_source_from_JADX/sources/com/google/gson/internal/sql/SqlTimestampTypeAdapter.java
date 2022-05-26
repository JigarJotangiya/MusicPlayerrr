package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.p253b.C6488a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

class SqlTimestampTypeAdapter extends TypeAdapter<Timestamp> {

    /* renamed from: b */
    static final TypeAdapterFactory f29954b = new TypeAdapterFactory() {
        public <T> TypeAdapter<T> create(Gson gson, C6488a<T> aVar) {
            if (aVar.getRawType() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(gson.getAdapter(Date.class));
            }
            return null;
        }
    };

    /* renamed from: a */
    private final TypeAdapter<Date> f29955a;

    /* renamed from: a */
    public Timestamp read(JsonReader jsonReader) throws IOException {
        Date read = this.f29955a.read(jsonReader);
        if (read != null) {
            return new Timestamp(read.getTime());
        }
        return null;
    }

    /* renamed from: b */
    public void write(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
        this.f29955a.write(jsonWriter, timestamp);
    }

    private SqlTimestampTypeAdapter(TypeAdapter<Date> typeAdapter) {
        this.f29955a = typeAdapter;
    }
}
