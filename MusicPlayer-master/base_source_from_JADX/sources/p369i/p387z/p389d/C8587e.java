package p369i.p387z.p389d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p369i.C8384c;
import p369i.C8446k;
import p369i.C8453p;
import p369i.p374d0.C8396c;
import p369i.p377u.C8480j;
import p369i.p387z.C8557a;
import p369i.p387z.p388c.C8559a;
import p369i.p387z.p388c.C8560b;
import p369i.p387z.p388c.C8561c;
import p369i.p387z.p388c.C8562d;
import p369i.p387z.p388c.C8563e;
import p369i.p387z.p388c.C8564f;
import p369i.p387z.p388c.C8565g;
import p369i.p387z.p388c.C8566h;
import p369i.p387z.p388c.C8567i;
import p369i.p387z.p388c.C8568j;
import p369i.p387z.p388c.C8569k;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p388c.C8571m;
import p369i.p387z.p388c.C8572n;
import p369i.p387z.p388c.C8573o;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p388c.C8575q;
import p369i.p387z.p388c.C8576r;
import p369i.p387z.p388c.C8577s;
import p369i.p387z.p388c.C8578t;
import p369i.p387z.p388c.C8579u;
import p369i.p387z.p388c.C8580v;
import p369i.p387z.p388c.C8581w;

/* renamed from: i.z.d.e */
/* compiled from: ClassReference.kt */
public final class C8587e implements C8396c<Object>, C8586d {

    /* renamed from: h */
    private static final Map<Class<? extends C8384c<?>>, Integer> f34929h;

    /* renamed from: i */
    private static final HashMap<String, String> f34930i;

    /* renamed from: j */
    private static final HashMap<String, String> f34931j;

    /* renamed from: k */
    private static final HashMap<String, String> f34932k;

    /* renamed from: g */
    private final Class<?> f34933g;

    static {
        int i = 0;
        List h = C8482l.m46667h(C8559a.class, C8570l.class, C8574p.class, C8575q.class, C8576r.class, C8577s.class, C8578t.class, C8579u.class, C8580v.class, C8581w.class, C8560b.class, C8561c.class, C8562d.class, C8563e.class, C8564f.class, C8565g.class, C8566h.class, C8567i.class, C8568j.class, C8569k.class, C8571m.class, C8572n.class, C8573o.class);
        ArrayList arrayList = new ArrayList(C8483m.m46672m(h, 10));
        for (Object next : h) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(C8453p.m46576a((Class) next, Integer.valueOf(i)));
                i = i2;
            } else {
                C8480j.m46649l();
                throw null;
            }
        }
        f34929h = C8468c0.m46593g(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f34930i = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f34931j = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C8594l.m46770d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            C8594l.m46770d(str, "kotlinName");
            sb.append(C8437p.m46555d0(str, '.', (String) null, 2, (Object) null));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            C8446k a = C8453p.m46576a(sb2, str + ".Companion");
            hashMap3.put(a.getFirst(), a.getSecond());
        }
        for (Map.Entry next2 : f34929h.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f34932k = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C8466b0.m46586a(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), C8437p.m46555d0((String) entry.getValue(), '.', (String) null, 2, (Object) null));
        }
    }

    public C8587e(Class<?> cls) {
        C8594l.m46771e(cls, "jClass");
        this.f34933g = cls;
    }

    /* renamed from: a */
    public Class<?> mo30621a() {
        return this.f34933g;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8587e) && C8594l.m46767a(C8557a.m46759a(this), C8557a.m46759a((C8396c) obj));
    }

    public int hashCode() {
        return C8557a.m46759a(this).hashCode();
    }

    public String toString() {
        return mo30621a().toString() + " (Kotlin reflection is not available)";
    }
}
