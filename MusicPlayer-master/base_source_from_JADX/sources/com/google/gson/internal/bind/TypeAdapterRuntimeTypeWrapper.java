package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.p253b.C6488a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {

    /* renamed from: a */
    private final Gson f29829a;

    /* renamed from: b */
    private final TypeAdapter<T> f29830b;

    /* renamed from: c */
    private final Type f29831c;

    TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.f29829a = gson;
        this.f29830b = typeAdapter;
        this.f29831c = type;
    }

    /* renamed from: a */
    private Type m37925a(Type type, Object obj) {
        if (obj != null) {
            return (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type;
        }
        return type;
    }

    public T read(JsonReader jsonReader) throws IOException {
        return this.f29830b.read(jsonReader);
    }

    public void write(JsonWriter jsonWriter, T t) throws IOException {
        TypeAdapter<T> typeAdapter = this.f29830b;
        Type a = m37925a(this.f29831c, t);
        if (a != this.f29831c) {
            typeAdapter = this.f29829a.getAdapter(C6488a.get(a));
            if (typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter) {
                TypeAdapter<T> typeAdapter2 = this.f29830b;
                if (!(typeAdapter2 instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                    typeAdapter = typeAdapter2;
                }
            }
        }
        typeAdapter.write(jsonWriter, t);
    }
}
