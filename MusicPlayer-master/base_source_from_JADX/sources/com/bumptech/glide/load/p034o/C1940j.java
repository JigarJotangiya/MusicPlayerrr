package com.bumptech.glide.load.p034o;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.o.j */
/* compiled from: LazyHeaders */
public final class C1940j implements C1938h {

    /* renamed from: b */
    private final Map<String, List<C1939i>> f6914b;

    /* renamed from: c */
    private volatile Map<String, String> f6915c;

    /* renamed from: com.bumptech.glide.load.o.j$a */
    /* compiled from: LazyHeaders */
    public static final class C1941a {

        /* renamed from: b */
        private static final String f6916b;

        /* renamed from: c */
        private static final Map<String, List<C1939i>> f6917c;

        /* renamed from: a */
        private Map<String, List<C1939i>> f6918a = f6917c;

        static {
            String b = m9308b();
            f6916b = b;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(b)) {
                hashMap.put("User-Agent", Collections.singletonList(new C1942b(b)));
            }
            f6917c = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: b */
        static String m9308b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public C1940j mo8041a() {
            return new C1940j(this.f6918a);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.j$b */
    /* compiled from: LazyHeaders */
    static final class C1942b implements C1939i {

        /* renamed from: a */
        private final String f6919a;

        C1942b(String str) {
            this.f6919a = str;
        }

        /* renamed from: a */
        public String mo8037a() {
            return this.f6919a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C1942b) {
                return this.f6919a.equals(((C1942b) obj).f6919a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6919a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f6919a + '\'' + '}';
        }
    }

    C1940j(Map<String, List<C1939i>> map) {
        this.f6914b = Collections.unmodifiableMap(map);
    }

    /* renamed from: b */
    private String m9305b(List<C1939i> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a = list.get(i).mo8037a();
            if (!TextUtils.isEmpty(a)) {
                sb.append(a);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    private Map<String, String> m9306c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f6914b.entrySet()) {
            String b = m9305b((List) next.getValue());
            if (!TextUtils.isEmpty(b)) {
                hashMap.put(next.getKey(), b);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public Map<String, String> mo8036a() {
        if (this.f6915c == null) {
            synchronized (this) {
                if (this.f6915c == null) {
                    this.f6915c = Collections.unmodifiableMap(m9306c());
                }
            }
        }
        return this.f6915c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1940j) {
            return this.f6914b.equals(((C1940j) obj).f6914b);
        }
        return false;
    }

    public int hashCode() {
        return this.f6914b.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f6914b + '}';
    }
}
