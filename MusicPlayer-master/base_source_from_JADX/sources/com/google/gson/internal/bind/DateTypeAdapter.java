package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C6564d;
import com.google.gson.internal.C6576i;
import com.google.gson.internal.bind.p254c.C6548a;
import com.google.gson.p253b.C6488a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class DateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: b */
    public static final TypeAdapterFactory f29778b = new TypeAdapterFactory() {
        public <T> TypeAdapter<T> create(Gson gson, C6488a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    private final List<DateFormat> f29779a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f29779a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C6564d.m38011e()) {
            arrayList.add(C6576i.m38026c(2, 2));
        }
    }

    /* renamed from: a */
    private synchronized Date m37891a(String str) {
        for (DateFormat parse : this.f29779a) {
            try {
                return parse.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return C6548a.m37987c(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new JsonSyntaxException(str, e);
        }
    }

    /* renamed from: b */
    public Date read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() != JsonToken.NULL) {
            return m37891a(jsonReader.nextString());
        }
        jsonReader.nextNull();
        return null;
    }

    /* renamed from: c */
    public synchronized void write(JsonWriter jsonWriter, Date date) throws IOException {
        if (date == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(this.f29779a.get(0).format(date));
        }
    }
}
