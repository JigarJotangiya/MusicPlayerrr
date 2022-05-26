package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C6491b;
import com.google.gson.internal.C6549c;
import com.google.gson.internal.C6565e;
import com.google.gson.internal.C6575h;
import com.google.gson.internal.C6578k;
import com.google.gson.p253b.C6488a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

public final class MapTypeAdapterFactory implements TypeAdapterFactory {

    /* renamed from: g */
    private final C6549c f29785g;

    /* renamed from: h */
    final boolean f29786h;

    private final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {

        /* renamed from: a */
        private final TypeAdapter<K> f29787a;

        /* renamed from: b */
        private final TypeAdapter<V> f29788b;

        /* renamed from: c */
        private final C6575h<? extends Map<K, V>> f29789c;

        public Adapter(Gson gson, Type type, TypeAdapter<K> typeAdapter, Type type2, TypeAdapter<V> typeAdapter2, C6575h<? extends Map<K, V>> hVar) {
            this.f29787a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f29788b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.f29789c = hVar;
        }

        /* renamed from: a */
        private String m37904a(JsonElement jsonElement) {
            if (jsonElement.isJsonPrimitive()) {
                JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
                if (asJsonPrimitive.isNumber()) {
                    return String.valueOf(asJsonPrimitive.getAsNumber());
                }
                if (asJsonPrimitive.isBoolean()) {
                    return Boolean.toString(asJsonPrimitive.getAsBoolean());
                }
                if (asJsonPrimitive.isString()) {
                    return asJsonPrimitive.getAsString();
                }
                throw new AssertionError();
            } else if (jsonElement.isJsonNull()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: b */
        public Map<K, V> read(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map<K, V> map = (Map) this.f29789c.mo25717a();
            if (peek == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    K read = this.f29787a.read(jsonReader);
                    if (map.put(read, this.f29788b.read(jsonReader)) == null) {
                        jsonReader.endArray();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + read);
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    C6565e.INSTANCE.promoteNameToValue(jsonReader);
                    K read2 = this.f29787a.read(jsonReader);
                    if (map.put(read2, this.f29788b.read(jsonReader)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + read2);
                    }
                }
                jsonReader.endObject();
            }
            return map;
        }

        /* renamed from: c */
        public void write(JsonWriter jsonWriter, Map<K, V> map) throws IOException {
            if (map == null) {
                jsonWriter.nullValue();
            } else if (!MapTypeAdapterFactory.this.f29786h) {
                jsonWriter.beginObject();
                for (Map.Entry next : map.entrySet()) {
                    jsonWriter.name(String.valueOf(next.getKey()));
                    this.f29788b.write(jsonWriter, next.getValue());
                }
                jsonWriter.endObject();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry next2 : map.entrySet()) {
                    JsonElement jsonTree = this.f29787a.toJsonTree(next2.getKey());
                    arrayList.add(jsonTree);
                    arrayList2.add(next2.getValue());
                    z |= jsonTree.isJsonArray() || jsonTree.isJsonObject();
                }
                if (z) {
                    jsonWriter.beginArray();
                    int size = arrayList.size();
                    while (i < size) {
                        jsonWriter.beginArray();
                        C6578k.m38030b((JsonElement) arrayList.get(i), jsonWriter);
                        this.f29788b.write(jsonWriter, arrayList2.get(i));
                        jsonWriter.endArray();
                        i++;
                    }
                    jsonWriter.endArray();
                    return;
                }
                jsonWriter.beginObject();
                int size2 = arrayList.size();
                while (i < size2) {
                    jsonWriter.name(m37904a((JsonElement) arrayList.get(i)));
                    this.f29788b.write(jsonWriter, arrayList2.get(i));
                    i++;
                }
                jsonWriter.endObject();
            }
        }
    }

    public MapTypeAdapterFactory(C6549c cVar, boolean z) {
        this.f29785g = cVar;
        this.f29786h = z;
    }

    /* renamed from: a */
    private TypeAdapter<?> m37903a(Gson gson, Type type) {
        if (type == Boolean.TYPE || type == Boolean.class) {
            return TypeAdapters.f29860f;
        }
        return gson.getAdapter(C6488a.get(type));
    }

    public <T> TypeAdapter<T> create(Gson gson, C6488a<T> aVar) {
        Type type = aVar.getType();
        if (!Map.class.isAssignableFrom(aVar.getRawType())) {
            return null;
        }
        Type[] j = C6491b.m37877j(type, C6491b.m37878k(type));
        return new Adapter(gson, j[0], m37903a(gson, j[0]), j[1], gson.getAdapter(C6488a.get(j[1])), this.f29785g.mo25715a(aVar));
    }
}
