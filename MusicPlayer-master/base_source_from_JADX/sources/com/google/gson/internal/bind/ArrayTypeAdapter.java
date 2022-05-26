package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C6491b;
import com.google.gson.p253b.C6488a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {

    /* renamed from: c */
    public static final TypeAdapterFactory f29772c = new TypeAdapterFactory() {
        public <T> TypeAdapter<T> create(Gson gson, C6488a<T> aVar) {
            Type type = aVar.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type g = C6491b.m37874g(type);
            return new ArrayTypeAdapter(gson, gson.getAdapter(C6488a.get(g)), C6491b.m37878k(g));
        }
    };

    /* renamed from: a */
    private final Class<E> f29773a;

    /* renamed from: b */
    private final TypeAdapter<E> f29774b;

    public ArrayTypeAdapter(Gson gson, TypeAdapter<E> typeAdapter, Class<E> cls) {
        this.f29774b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.f29773a = cls;
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.f29774b.read(jsonReader));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f29773a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f29774b.write(jsonWriter, Array.get(obj, i));
        }
        jsonWriter.endArray();
    }
}
