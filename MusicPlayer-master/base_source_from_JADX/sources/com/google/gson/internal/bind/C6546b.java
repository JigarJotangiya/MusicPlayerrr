package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.gson.internal.bind.b */
/* compiled from: JsonTreeWriter */
public final class C6546b extends JsonWriter {

    /* renamed from: j */
    private static final Writer f29905j = new C6547a();

    /* renamed from: k */
    private static final JsonPrimitive f29906k = new JsonPrimitive("closed");

    /* renamed from: g */
    private final List<JsonElement> f29907g = new ArrayList();

    /* renamed from: h */
    private String f29908h;

    /* renamed from: i */
    private JsonElement f29909i = JsonNull.INSTANCE;

    /* renamed from: com.google.gson.internal.bind.b$a */
    /* compiled from: JsonTreeWriter */
    class C6547a extends Writer {
        C6547a() {
        }

        public void close() throws IOException {
            throw new AssertionError();
        }

        public void flush() throws IOException {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C6546b() {
        super(f29905j);
    }

    /* renamed from: d */
    private JsonElement m37982d() {
        List<JsonElement> list = this.f29907g;
        return list.get(list.size() - 1);
    }

    /* renamed from: p */
    private void m37983p(JsonElement jsonElement) {
        if (this.f29908h != null) {
            if (!jsonElement.isJsonNull() || getSerializeNulls()) {
                ((JsonObject) m37982d()).add(this.f29908h, jsonElement);
            }
            this.f29908h = null;
        } else if (this.f29907g.isEmpty()) {
            this.f29909i = jsonElement;
        } else {
            JsonElement d = m37982d();
            if (d instanceof JsonArray) {
                ((JsonArray) d).add(jsonElement);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public JsonWriter beginArray() throws IOException {
        JsonArray jsonArray = new JsonArray();
        m37983p(jsonArray);
        this.f29907g.add(jsonArray);
        return this;
    }

    public JsonWriter beginObject() throws IOException {
        JsonObject jsonObject = new JsonObject();
        m37983p(jsonObject);
        this.f29907g.add(jsonObject);
        return this;
    }

    /* renamed from: c */
    public JsonElement mo25699c() {
        if (this.f29907g.isEmpty()) {
            return this.f29909i;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f29907g);
    }

    public void close() throws IOException {
        if (this.f29907g.isEmpty()) {
            this.f29907g.add(f29906k);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public JsonWriter endArray() throws IOException {
        if (this.f29907g.isEmpty() || this.f29908h != null) {
            throw new IllegalStateException();
        } else if (m37982d() instanceof JsonArray) {
            List<JsonElement> list = this.f29907g;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public JsonWriter endObject() throws IOException {
        if (this.f29907g.isEmpty() || this.f29908h != null) {
            throw new IllegalStateException();
        } else if (m37982d() instanceof JsonObject) {
            List<JsonElement> list = this.f29907g;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public void flush() throws IOException {
    }

    public JsonWriter name(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f29907g.isEmpty() || this.f29908h != null) {
            throw new IllegalStateException();
        } else if (m37982d() instanceof JsonObject) {
            this.f29908h = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public JsonWriter nullValue() throws IOException {
        m37983p(JsonNull.INSTANCE);
        return this;
    }

    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            nullValue();
            return this;
        }
        m37983p(new JsonPrimitive(str));
        return this;
    }

    public JsonWriter value(boolean z) throws IOException {
        m37983p(new JsonPrimitive(Boolean.valueOf(z)));
        return this;
    }

    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            nullValue();
            return this;
        }
        m37983p(new JsonPrimitive(bool));
        return this;
    }

    public JsonWriter value(double d) throws IOException {
        if (isLenient() || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            m37983p(new JsonPrimitive((Number) Double.valueOf(d)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
    }

    public JsonWriter value(long j) throws IOException {
        m37983p(new JsonPrimitive((Number) Long.valueOf(j)));
        return this;
    }

    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            nullValue();
            return this;
        }
        if (!isLenient()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m37983p(new JsonPrimitive(number));
        return this;
    }
}
