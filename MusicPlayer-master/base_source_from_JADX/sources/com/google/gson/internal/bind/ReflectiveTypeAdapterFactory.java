package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C6491b;
import com.google.gson.internal.C6549c;
import com.google.gson.internal.C6575h;
import com.google.gson.internal.C6577j;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.p255m.C6587b;
import com.google.gson.p252a.C6484b;
import com.google.gson.p252a.C6485c;
import com.google.gson.p253b.C6488a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {

    /* renamed from: g */
    private final C6549c f29800g;

    /* renamed from: h */
    private final FieldNamingStrategy f29801h;

    /* renamed from: i */
    private final Excluder f29802i;

    /* renamed from: j */
    private final JsonAdapterAnnotationTypeAdapterFactory f29803j;

    /* renamed from: k */
    private final C6587b f29804k = C6587b.m38040a();

    public static final class Adapter<T> extends TypeAdapter<T> {

        /* renamed from: a */
        private final C6575h<T> f29805a;

        /* renamed from: b */
        private final Map<String, C6505b> f29806b;

        Adapter(C6575h<T> hVar, Map<String, C6505b> map) {
            this.f29805a = hVar;
            this.f29806b = map;
        }

        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            T a = this.f29805a.mo25717a();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    C6505b bVar = this.f29806b.get(jsonReader.nextName());
                    if (bVar != null) {
                        if (bVar.f29815c) {
                            bVar.mo25617a(jsonReader, a);
                        }
                    }
                    jsonReader.skipValue();
                }
                jsonReader.endObject();
                return a;
            } catch (IllegalStateException e) {
                throw new JsonSyntaxException((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public void write(JsonWriter jsonWriter, T t) throws IOException {
            if (t == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                for (C6505b next : this.f29806b.values()) {
                    if (next.mo25619c(t)) {
                        jsonWriter.name(next.f29813a);
                        next.mo25618b(jsonWriter, t);
                    }
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$a */
    class C6504a extends C6505b {

        /* renamed from: d */
        final /* synthetic */ Field f29807d;

        /* renamed from: e */
        final /* synthetic */ boolean f29808e;

        /* renamed from: f */
        final /* synthetic */ TypeAdapter f29809f;

        /* renamed from: g */
        final /* synthetic */ Gson f29810g;

        /* renamed from: h */
        final /* synthetic */ C6488a f29811h;

        /* renamed from: i */
        final /* synthetic */ boolean f29812i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6504a(ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory, String str, boolean z, boolean z2, Field field, boolean z3, TypeAdapter typeAdapter, Gson gson, C6488a aVar, boolean z4) {
            super(str, z, z2);
            this.f29807d = field;
            this.f29808e = z3;
            this.f29809f = typeAdapter;
            this.f29810g = gson;
            this.f29811h = aVar;
            this.f29812i = z4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo25617a(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException {
            Object read = this.f29809f.read(jsonReader);
            if (read != null || !this.f29812i) {
                this.f29807d.set(obj, read);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo25618b(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException {
            TypeAdapter typeAdapter;
            Object obj2 = this.f29807d.get(obj);
            if (this.f29808e) {
                typeAdapter = this.f29809f;
            } else {
                typeAdapter = new TypeAdapterRuntimeTypeWrapper(this.f29810g, this.f29809f, this.f29811h.getType());
            }
            typeAdapter.write(jsonWriter, obj2);
        }

        /* renamed from: c */
        public boolean mo25619c(Object obj) throws IOException, IllegalAccessException {
            if (this.f29814b && this.f29807d.get(obj) != obj) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$b */
    static abstract class C6505b {

        /* renamed from: a */
        final String f29813a;

        /* renamed from: b */
        final boolean f29814b;

        /* renamed from: c */
        final boolean f29815c;

        protected C6505b(String str, boolean z, boolean z2) {
            this.f29813a = str;
            this.f29814b = z;
            this.f29815c = z2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo25617a(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException;

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo25618b(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException;

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract boolean mo25619c(Object obj) throws IOException, IllegalAccessException;
    }

    public ReflectiveTypeAdapterFactory(C6549c cVar, FieldNamingStrategy fieldNamingStrategy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f29800g = cVar;
        this.f29801h = fieldNamingStrategy;
        this.f29802i = excluder;
        this.f29803j = jsonAdapterAnnotationTypeAdapterFactory;
    }

    /* renamed from: a */
    private C6505b m37911a(Gson gson, Field field, String str, C6488a<?> aVar, boolean z, boolean z2) {
        Gson gson2 = gson;
        C6488a<?> aVar2 = aVar;
        boolean a = C6577j.m38027a(aVar.getRawType());
        Field field2 = field;
        C6484b bVar = (C6484b) field.getAnnotation(C6484b.class);
        TypeAdapter<?> a2 = bVar != null ? this.f29803j.mo25612a(this.f29800g, gson, aVar2, bVar) : null;
        boolean z3 = a2 != null;
        if (a2 == null) {
            a2 = gson.getAdapter(aVar2);
        }
        return new C6504a(this, str, z, z2, field, z3, a2, gson, aVar, a);
    }

    /* renamed from: c */
    static boolean m37912c(Field field, boolean z, Excluder excluder) {
        return !excluder.mo25580c(field.getType(), z) && !excluder.mo25582g(field, z);
    }

    /* renamed from: d */
    private Map<String, C6505b> m37913d(Gson gson, C6488a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = aVar.getType();
        C6488a<?> aVar2 = aVar;
        Class<? super Object> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean b = mo25616b(field, true);
                boolean b2 = mo25616b(field, z);
                if (b || b2) {
                    this.f29804k.mo25773b(field);
                    Type p = C6491b.m37883p(aVar2.getType(), cls2, field.getGenericType());
                    List<String> e = m37914e(field);
                    int size = e.size();
                    C6505b bVar = null;
                    int i2 = 0;
                    while (i2 < size) {
                        String str = e.get(i2);
                        boolean z2 = i2 != 0 ? false : b;
                        String str2 = str;
                        int i3 = i2;
                        C6505b bVar2 = bVar;
                        int i4 = size;
                        List<String> list = e;
                        Field field2 = field;
                        bVar = bVar2 == null ? (C6505b) linkedHashMap.put(str2, m37911a(gson, field, str2, C6488a.get(p), z2, b2)) : bVar2;
                        i2 = i3 + 1;
                        b = z2;
                        e = list;
                        size = i4;
                        field = field2;
                    }
                    C6505b bVar3 = bVar;
                    if (bVar3 != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + bVar3.f29813a);
                    }
                }
                i++;
                z = false;
            }
            aVar2 = C6488a.get(C6491b.m37883p(aVar2.getType(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.getRawType();
        }
        return linkedHashMap;
    }

    /* renamed from: e */
    private List<String> m37914e(Field field) {
        C6485c cVar = (C6485c) field.getAnnotation(C6485c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f29801h.translateName(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String add : alternate) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: b */
    public boolean mo25616b(Field field, boolean z) {
        return m37912c(field, z, this.f29802i);
    }

    public <T> TypeAdapter<T> create(Gson gson, C6488a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        return new Adapter(this.f29800g.mo25715a(aVar), m37913d(gson, aVar, rawType));
    }
}
