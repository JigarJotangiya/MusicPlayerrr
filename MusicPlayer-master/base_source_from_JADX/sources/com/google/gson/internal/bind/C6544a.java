package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.gson.internal.bind.a */
/* compiled from: JsonTreeReader */
public final class C6544a extends JsonReader {

    /* renamed from: k */
    private static final Reader f29899k = new C6545a();

    /* renamed from: l */
    private static final Object f29900l = new Object();

    /* renamed from: g */
    private Object[] f29901g = new Object[32];

    /* renamed from: h */
    private int f29902h = 0;

    /* renamed from: i */
    private String[] f29903i = new String[32];

    /* renamed from: j */
    private int[] f29904j = new int[32];

    /* renamed from: com.google.gson.internal.bind.a$a */
    /* compiled from: JsonTreeReader */
    class C6545a extends Reader {
        C6545a() {
        }

        public void close() throws IOException {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    }

    public C6544a(JsonElement jsonElement) {
        super(f29899k);
        m37976H(jsonElement);
    }

    /* renamed from: H */
    private void m37976H(Object obj) {
        int i = this.f29902h;
        Object[] objArr = this.f29901g;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.f29901g = Arrays.copyOf(objArr, i2);
            this.f29904j = Arrays.copyOf(this.f29904j, i2);
            this.f29903i = (String[]) Arrays.copyOf(this.f29903i, i2);
        }
        Object[] objArr2 = this.f29901g;
        int i3 = this.f29902h;
        this.f29902h = i3 + 1;
        objArr2[i3] = obj;
    }

    /* renamed from: c */
    private void m37977c(JsonToken jsonToken) throws IOException {
        if (peek() != jsonToken) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
        }
    }

    private String locationString() {
        return " at path " + getPath();
    }

    /* renamed from: p */
    private Object m37978p() {
        return this.f29901g[this.f29902h - 1];
    }

    /* renamed from: x */
    private Object m37979x() {
        Object[] objArr = this.f29901g;
        int i = this.f29902h - 1;
        this.f29902h = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* renamed from: E */
    public void mo25676E() throws IOException {
        m37977c(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m37978p()).next();
        m37976H(entry.getValue());
        m37976H(new JsonPrimitive((String) entry.getKey()));
    }

    public void beginArray() throws IOException {
        m37977c(JsonToken.BEGIN_ARRAY);
        m37976H(((JsonArray) m37978p()).iterator());
        this.f29904j[this.f29902h - 1] = 0;
    }

    public void beginObject() throws IOException {
        m37977c(JsonToken.BEGIN_OBJECT);
        m37976H(((JsonObject) m37978p()).entrySet().iterator());
    }

    public void close() throws IOException {
        this.f29901g = new Object[]{f29900l};
        this.f29902h = 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public JsonElement mo25680d() throws IOException {
        JsonToken peek = peek();
        if (peek == JsonToken.NAME || peek == JsonToken.END_ARRAY || peek == JsonToken.END_OBJECT || peek == JsonToken.END_DOCUMENT) {
            throw new IllegalStateException("Unexpected " + peek + " when reading a JsonElement.");
        }
        JsonElement jsonElement = (JsonElement) m37978p();
        skipValue();
        return jsonElement;
    }

    public void endArray() throws IOException {
        m37977c(JsonToken.END_ARRAY);
        m37979x();
        m37979x();
        int i = this.f29902h;
        if (i > 0) {
            int[] iArr = this.f29904j;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public void endObject() throws IOException {
        m37977c(JsonToken.END_OBJECT);
        m37979x();
        m37979x();
        int i = this.f29902h;
        if (i > 0) {
            int[] iArr = this.f29904j;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (true) {
            int i2 = this.f29902h;
            if (i >= i2) {
                return sb.toString();
            }
            Object[] objArr = this.f29901g;
            if (objArr[i] instanceof JsonArray) {
                i++;
                if (i < i2 && (objArr[i] instanceof Iterator)) {
                    sb.append('[');
                    sb.append(this.f29904j[i]);
                    sb.append(']');
                }
            } else if ((objArr[i] instanceof JsonObject) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                sb.append('.');
                String[] strArr = this.f29903i;
                if (strArr[i] != null) {
                    sb.append(strArr[i]);
                }
            }
            i++;
        }
    }

    public boolean hasNext() throws IOException {
        JsonToken peek = peek();
        return (peek == JsonToken.END_OBJECT || peek == JsonToken.END_ARRAY) ? false : true;
    }

    public boolean nextBoolean() throws IOException {
        m37977c(JsonToken.BOOLEAN);
        boolean asBoolean = ((JsonPrimitive) m37979x()).getAsBoolean();
        int i = this.f29902h;
        if (i > 0) {
            int[] iArr = this.f29904j;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asBoolean;
    }

    public double nextDouble() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek == jsonToken || peek == JsonToken.STRING) {
            double asDouble = ((JsonPrimitive) m37978p()).getAsDouble();
            if (isLenient() || (!Double.isNaN(asDouble) && !Double.isInfinite(asDouble))) {
                m37979x();
                int i = this.f29902h;
                if (i > 0) {
                    int[] iArr = this.f29904j;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return asDouble;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + asDouble);
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
    }

    public int nextInt() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek == jsonToken || peek == JsonToken.STRING) {
            int asInt = ((JsonPrimitive) m37978p()).getAsInt();
            m37979x();
            int i = this.f29902h;
            if (i > 0) {
                int[] iArr = this.f29904j;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return asInt;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
    }

    public long nextLong() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek == jsonToken || peek == JsonToken.STRING) {
            long asLong = ((JsonPrimitive) m37978p()).getAsLong();
            m37979x();
            int i = this.f29902h;
            if (i > 0) {
                int[] iArr = this.f29904j;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return asLong;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
    }

    public String nextName() throws IOException {
        m37977c(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m37978p()).next();
        String str = (String) entry.getKey();
        this.f29903i[this.f29902h - 1] = str;
        m37976H(entry.getValue());
        return str;
    }

    public void nextNull() throws IOException {
        m37977c(JsonToken.NULL);
        m37979x();
        int i = this.f29902h;
        if (i > 0) {
            int[] iArr = this.f29904j;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public String nextString() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (peek == jsonToken || peek == JsonToken.NUMBER) {
            String asString = ((JsonPrimitive) m37979x()).getAsString();
            int i = this.f29902h;
            if (i > 0) {
                int[] iArr = this.f29904j;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return asString;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
    }

    public JsonToken peek() throws IOException {
        if (this.f29902h == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object p = m37978p();
        if (p instanceof Iterator) {
            boolean z = this.f29901g[this.f29902h - 2] instanceof JsonObject;
            Iterator it = (Iterator) p;
            if (!it.hasNext()) {
                return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z) {
                return JsonToken.NAME;
            }
            m37976H(it.next());
            return peek();
        } else if (p instanceof JsonObject) {
            return JsonToken.BEGIN_OBJECT;
        } else {
            if (p instanceof JsonArray) {
                return JsonToken.BEGIN_ARRAY;
            }
            if (p instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) p;
                if (jsonPrimitive.isString()) {
                    return JsonToken.STRING;
                }
                if (jsonPrimitive.isBoolean()) {
                    return JsonToken.BOOLEAN;
                }
                if (jsonPrimitive.isNumber()) {
                    return JsonToken.NUMBER;
                }
                throw new AssertionError();
            } else if (p instanceof JsonNull) {
                return JsonToken.NULL;
            } else {
                if (p == f29900l) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public void skipValue() throws IOException {
        if (peek() == JsonToken.NAME) {
            nextName();
            this.f29903i[this.f29902h - 2] = "null";
        } else {
            m37979x();
            int i = this.f29902h;
            if (i > 0) {
                this.f29903i[i - 1] = "null";
            }
        }
        int i2 = this.f29902h;
        if (i2 > 0) {
            int[] iArr = this.f29904j;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public String toString() {
        return C6544a.class.getSimpleName() + locationString();
    }
}
