package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C6491b;
import com.google.gson.internal.C6549c;
import com.google.gson.internal.C6575h;
import com.google.gson.p253b.C6488a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

public final class CollectionTypeAdapterFactory implements TypeAdapterFactory {

    /* renamed from: g */
    private final C6549c f29775g;

    private static final class Adapter<E> extends TypeAdapter<Collection<E>> {

        /* renamed from: a */
        private final TypeAdapter<E> f29776a;

        /* renamed from: b */
        private final C6575h<? extends Collection<E>> f29777b;

        public Adapter(Gson gson, Type type, TypeAdapter<E> typeAdapter, C6575h<? extends Collection<E>> hVar) {
            this.f29776a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f29777b = hVar;
        }

        /* renamed from: a */
        public Collection<E> read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection<E> collection = (Collection) this.f29777b.mo25717a();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                collection.add(this.f29776a.read(jsonReader));
            }
            jsonReader.endArray();
            return collection;
        }

        /* renamed from: b */
        public void write(JsonWriter jsonWriter, Collection<E> collection) throws IOException {
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            for (E write : collection) {
                this.f29776a.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
    }

    public CollectionTypeAdapterFactory(C6549c cVar) {
        this.f29775g = cVar;
    }

    public <T> TypeAdapter<T> create(Gson gson, C6488a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type h = C6491b.m37875h(type, rawType);
        return new Adapter(gson, h, gson.getAdapter(C6488a.get(h)), this.f29775g.mo25715a(aVar));
    }
}
