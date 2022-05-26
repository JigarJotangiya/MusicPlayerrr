package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C6490a;
import com.google.gson.internal.C6578k;
import com.google.gson.p253b.C6488a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;

public final class TreeTypeAdapter<T> extends TypeAdapter<T> {

    /* renamed from: a */
    private final JsonSerializer<T> f29816a;

    /* renamed from: b */
    private final JsonDeserializer<T> f29817b;

    /* renamed from: c */
    final Gson f29818c;

    /* renamed from: d */
    private final C6488a<T> f29819d;

    /* renamed from: e */
    private final TypeAdapterFactory f29820e;

    /* renamed from: f */
    private final TreeTypeAdapter<T>.C1427b f29821f = new C6507b();

    /* renamed from: g */
    private TypeAdapter<T> f29822g;

    private static final class SingleTypeFactory implements TypeAdapterFactory {

        /* renamed from: g */
        private final C6488a<?> f29823g;

        /* renamed from: h */
        private final boolean f29824h;

        /* renamed from: i */
        private final Class<?> f29825i;

        /* renamed from: j */
        private final JsonSerializer<?> f29826j;

        /* renamed from: k */
        private final JsonDeserializer<?> f29827k;

        SingleTypeFactory(Object obj, C6488a<?> aVar, boolean z, Class<?> cls) {
            JsonDeserializer<?> jsonDeserializer = null;
            JsonSerializer<?> jsonSerializer = obj instanceof JsonSerializer ? (JsonSerializer) obj : null;
            this.f29826j = jsonSerializer;
            jsonDeserializer = obj instanceof JsonDeserializer ? (JsonDeserializer) obj : jsonDeserializer;
            this.f29827k = jsonDeserializer;
            C6490a.m37866a((jsonSerializer == null && jsonDeserializer == null) ? false : true);
            this.f29823g = aVar;
            this.f29824h = z;
            this.f29825i = cls;
        }

        public <T> TypeAdapter<T> create(Gson gson, C6488a<T> aVar) {
            boolean z;
            C6488a<?> aVar2 = this.f29823g;
            if (aVar2 != null) {
                z = aVar2.equals(aVar) || (this.f29824h && this.f29823g.getType() == aVar.getRawType());
            } else {
                z = this.f29825i.isAssignableFrom(aVar.getRawType());
            }
            if (z) {
                return new TreeTypeAdapter(this.f29826j, this.f29827k, gson, aVar, this);
            }
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.bind.TreeTypeAdapter$b */
    private final class C6507b implements JsonSerializationContext, JsonDeserializationContext {
        private C6507b() {
        }

        public <R> R deserialize(JsonElement jsonElement, Type type) throws JsonParseException {
            return TreeTypeAdapter.this.f29818c.fromJson(jsonElement, type);
        }

        public JsonElement serialize(Object obj) {
            return TreeTypeAdapter.this.f29818c.toJsonTree(obj);
        }

        public JsonElement serialize(Object obj, Type type) {
            return TreeTypeAdapter.this.f29818c.toJsonTree(obj, type);
        }
    }

    public TreeTypeAdapter(JsonSerializer<T> jsonSerializer, JsonDeserializer<T> jsonDeserializer, Gson gson, C6488a<T> aVar, TypeAdapterFactory typeAdapterFactory) {
        this.f29816a = jsonSerializer;
        this.f29817b = jsonDeserializer;
        this.f29818c = gson;
        this.f29819d = aVar;
        this.f29820e = typeAdapterFactory;
    }

    /* renamed from: a */
    private TypeAdapter<T> m37922a() {
        TypeAdapter<T> typeAdapter = this.f29822g;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter<T> delegateAdapter = this.f29818c.getDelegateAdapter(this.f29820e, this.f29819d);
        this.f29822g = delegateAdapter;
        return delegateAdapter;
    }

    /* renamed from: b */
    public static TypeAdapterFactory m37923b(C6488a<?> aVar, Object obj) {
        return new SingleTypeFactory(obj, aVar, aVar.getType() == aVar.getRawType(), (Class<?>) null);
    }

    /* renamed from: c */
    public static TypeAdapterFactory m37924c(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, (C6488a<?>) null, false, cls);
    }

    public T read(JsonReader jsonReader) throws IOException {
        if (this.f29817b == null) {
            return m37922a().read(jsonReader);
        }
        JsonElement a = C6578k.m38029a(jsonReader);
        if (a.isJsonNull()) {
            return null;
        }
        return this.f29817b.deserialize(a, this.f29819d.getType(), this.f29821f);
    }

    public void write(JsonWriter jsonWriter, T t) throws IOException {
        JsonSerializer<T> jsonSerializer = this.f29816a;
        if (jsonSerializer == null) {
            m37922a().write(jsonWriter, t);
        } else if (t == null) {
            jsonWriter.nullValue();
        } else {
            C6578k.m38030b(jsonSerializer.serialize(t, this.f29819d.getType(), this.f29821f), jsonWriter);
        }
    }
}
