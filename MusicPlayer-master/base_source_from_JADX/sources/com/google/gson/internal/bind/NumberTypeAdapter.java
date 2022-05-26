package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ToNumberPolicy;
import com.google.gson.ToNumberStrategy;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.p253b.C6488a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public final class NumberTypeAdapter extends TypeAdapter<Number> {

    /* renamed from: b */
    private static final TypeAdapterFactory f29791b = m37908b(ToNumberPolicy.LAZILY_PARSED_NUMBER);

    /* renamed from: a */
    private final ToNumberStrategy f29792a;

    /* renamed from: com.google.gson.internal.bind.NumberTypeAdapter$a */
    static /* synthetic */ class C6501a {

        /* renamed from: a */
        static final /* synthetic */ int[] f29794a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29794a = r0
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29794a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29794a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.NumberTypeAdapter.C6501a.<clinit>():void");
        }
    }

    private NumberTypeAdapter(ToNumberStrategy toNumberStrategy) {
        this.f29792a = toNumberStrategy;
    }

    /* renamed from: a */
    public static TypeAdapterFactory m37907a(ToNumberStrategy toNumberStrategy) {
        if (toNumberStrategy == ToNumberPolicy.LAZILY_PARSED_NUMBER) {
            return f29791b;
        }
        return m37908b(toNumberStrategy);
    }

    /* renamed from: b */
    private static TypeAdapterFactory m37908b(ToNumberStrategy toNumberStrategy) {
        return new TypeAdapterFactory() {
            public <T> TypeAdapter<T> create(Gson gson, C6488a<T> aVar) {
                if (aVar.getRawType() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    public Number read(JsonReader jsonReader) throws IOException {
        JsonToken peek = jsonReader.peek();
        int i = C6501a.f29794a[peek.ordinal()];
        if (i == 1) {
            jsonReader.nextNull();
            return null;
        } else if (i == 2 || i == 3) {
            return this.f29792a.readNumber(jsonReader);
        } else {
            throw new JsonSyntaxException("Expecting number, got: " + peek);
        }
    }

    public void write(JsonWriter jsonWriter, Number number) throws IOException {
        jsonWriter.value(number);
    }
}
