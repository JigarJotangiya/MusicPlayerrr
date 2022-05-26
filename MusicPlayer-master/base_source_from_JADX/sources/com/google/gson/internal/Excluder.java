package com.google.gson.internal;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.p252a.C6483a;
import com.google.gson.p252a.C6486d;
import com.google.gson.p252a.C6487e;
import com.google.gson.p253b.C6488a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Excluder implements TypeAdapterFactory, Cloneable {

    /* renamed from: m */
    public static final Excluder f29758m = new Excluder();

    /* renamed from: g */
    private double f29759g = -1.0d;

    /* renamed from: h */
    private int f29760h = 136;

    /* renamed from: i */
    private boolean f29761i = true;

    /* renamed from: j */
    private boolean f29762j;

    /* renamed from: k */
    private List<ExclusionStrategy> f29763k = Collections.emptyList();

    /* renamed from: l */
    private List<ExclusionStrategy> f29764l = Collections.emptyList();

    /* renamed from: e */
    private boolean m37849e(Class<?> cls) {
        if (this.f29759g != -1.0d && !m37856n((C6486d) cls.getAnnotation(C6486d.class), (C6487e) cls.getAnnotation(C6487e.class))) {
            return true;
        }
        if ((this.f29761i || !m37852j(cls)) && !m37851i(cls)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private boolean m37850f(Class<?> cls, boolean z) {
        for (ExclusionStrategy shouldSkipClass : z ? this.f29763k : this.f29764l) {
            if (shouldSkipClass.shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private boolean m37851i(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && !m37853k(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* renamed from: j */
    private boolean m37852j(Class<?> cls) {
        return cls.isMemberClass() && !m37853k(cls);
    }

    /* renamed from: k */
    private boolean m37853k(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: l */
    private boolean m37854l(C6486d dVar) {
        return dVar == null || dVar.value() <= this.f29759g;
    }

    /* renamed from: m */
    private boolean m37855m(C6487e eVar) {
        return eVar == null || eVar.value() > this.f29759g;
    }

    /* renamed from: n */
    private boolean m37856n(C6486d dVar, C6487e eVar) {
        return m37854l(dVar) && m37855m(eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public Excluder mo25579b() {
        Excluder a = clone();
        a.f29761i = false;
        return a;
    }

    /* renamed from: c */
    public boolean mo25580c(Class<?> cls, boolean z) {
        return m37849e(cls) || m37850f(cls, z);
    }

    public <T> TypeAdapter<T> create(Gson gson, C6488a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        boolean e = m37849e(rawType);
        final boolean z = e || m37850f(rawType, true);
        final boolean z2 = e || m37850f(rawType, false);
        if (!z && !z2) {
            return null;
        }
        final Gson gson2 = gson;
        final C6488a<T> aVar2 = aVar;
        return new TypeAdapter<T>() {

            /* renamed from: a */
            private TypeAdapter<T> f29765a;

            /* renamed from: a */
            private TypeAdapter<T> m37865a() {
                TypeAdapter<T> typeAdapter = this.f29765a;
                if (typeAdapter != null) {
                    return typeAdapter;
                }
                TypeAdapter<T> delegateAdapter = gson2.getDelegateAdapter(Excluder.this, aVar2);
                this.f29765a = delegateAdapter;
                return delegateAdapter;
            }

            public T read(JsonReader jsonReader) throws IOException {
                if (!z2) {
                    return m37865a().read(jsonReader);
                }
                jsonReader.skipValue();
                return null;
            }

            public void write(JsonWriter jsonWriter, T t) throws IOException {
                if (z) {
                    jsonWriter.nullValue();
                } else {
                    m37865a().write(jsonWriter, t);
                }
            }
        };
    }

    /* renamed from: g */
    public boolean mo25582g(Field field, boolean z) {
        C6483a aVar;
        if ((this.f29760h & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f29759g != -1.0d && !m37856n((C6486d) field.getAnnotation(C6486d.class), (C6487e) field.getAnnotation(C6487e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f29762j && ((aVar = (C6483a) field.getAnnotation(C6483a.class)) == null || (!z ? !aVar.deserialize() : !aVar.serialize()))) {
            return true;
        }
        if ((!this.f29761i && m37852j(field.getType())) || m37851i(field.getType())) {
            return true;
        }
        List<ExclusionStrategy> list = z ? this.f29763k : this.f29764l;
        if (list.isEmpty()) {
            return false;
        }
        FieldAttributes fieldAttributes = new FieldAttributes(field);
        for (ExclusionStrategy shouldSkipField : list) {
            if (shouldSkipField.shouldSkipField(fieldAttributes)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public Excluder mo25583h() {
        Excluder a = clone();
        a.f29762j = true;
        return a;
    }

    /* renamed from: o */
    public Excluder mo25584o(ExclusionStrategy exclusionStrategy, boolean z, boolean z2) {
        Excluder a = clone();
        if (z) {
            ArrayList arrayList = new ArrayList(this.f29763k);
            a.f29763k = arrayList;
            arrayList.add(exclusionStrategy);
        }
        if (z2) {
            ArrayList arrayList2 = new ArrayList(this.f29764l);
            a.f29764l = arrayList2;
            arrayList2.add(exclusionStrategy);
        }
        return a;
    }

    /* renamed from: q */
    public Excluder mo25585q(int... iArr) {
        Excluder a = clone();
        a.f29760h = 0;
        for (int i : iArr) {
            a.f29760h = i | a.f29760h;
        }
        return a;
    }

    /* renamed from: r */
    public Excluder mo25586r(double d) {
        Excluder a = clone();
        a.f29759g = d;
        return a;
    }
}
