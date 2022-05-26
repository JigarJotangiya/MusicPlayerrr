package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C6490a;
import com.google.gson.internal.C6564d;
import com.google.gson.internal.C6576i;
import com.google.gson.internal.bind.p254c.C6548a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T> {

    /* renamed from: a */
    private final C6498b<T> f29780a;

    /* renamed from: b */
    private final List<DateFormat> f29781b;

    /* renamed from: com.google.gson.internal.bind.DefaultDateTypeAdapter$b */
    public static abstract class C6498b<T extends Date> {

        /* renamed from: b */
        public static final C6498b<Date> f29782b = new C6499a(Date.class);

        /* renamed from: a */
        private final Class<T> f29783a;

        /* renamed from: com.google.gson.internal.bind.DefaultDateTypeAdapter$b$a */
        class C6499a extends C6498b<Date> {
            C6499a(Class cls) {
                super(cls);
            }

            /* access modifiers changed from: protected */
            /* renamed from: d */
            public Date mo25611d(Date date) {
                return date;
            }
        }

        protected C6498b(Class<T> cls) {
            this.f29783a = cls;
        }

        /* renamed from: c */
        private final TypeAdapterFactory m37897c(DefaultDateTypeAdapter<T> defaultDateTypeAdapter) {
            return TypeAdapters.m37927b(this.f29783a, defaultDateTypeAdapter);
        }

        /* renamed from: a */
        public final TypeAdapterFactory mo25609a(int i, int i2) {
            return m37897c(new DefaultDateTypeAdapter(this, i, i2));
        }

        /* renamed from: b */
        public final TypeAdapterFactory mo25610b(String str) {
            return m37897c(new DefaultDateTypeAdapter(this, str));
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public abstract T mo25611d(Date date);
    }

    /* renamed from: a */
    private Date m37894a(String str) {
        synchronized (this.f29781b) {
            for (DateFormat parse : this.f29781b) {
                try {
                    Date parse2 = parse.parse(str);
                    return parse2;
                } catch (ParseException unused) {
                }
            }
            try {
                return C6548a.m37987c(str, new ParsePosition(0));
            } catch (ParseException e) {
                throw new JsonSyntaxException(str, e);
            }
        }
    }

    /* renamed from: b */
    public T read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return this.f29780a.mo25611d(m37894a(jsonReader.nextString()));
    }

    /* renamed from: c */
    public void write(JsonWriter jsonWriter, Date date) throws IOException {
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this.f29781b) {
            jsonWriter.value(this.f29781b.get(0).format(date));
        }
    }

    public String toString() {
        DateFormat dateFormat = this.f29781b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    private DefaultDateTypeAdapter(C6498b<T> bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f29781b = arrayList;
        C6490a.m37867b(bVar);
        this.f29780a = bVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    private DefaultDateTypeAdapter(C6498b<T> bVar, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.f29781b = arrayList;
        C6490a.m37867b(bVar);
        this.f29780a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (C6564d.m38011e()) {
            arrayList.add(C6576i.m38026c(i, i2));
        }
    }
}
