package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C6549c;
import com.google.gson.p252a.C6484b;
import com.google.gson.p253b.C6488a;

public final class JsonAdapterAnnotationTypeAdapterFactory implements TypeAdapterFactory {

    /* renamed from: g */
    private final C6549c f29784g;

    public JsonAdapterAnnotationTypeAdapterFactory(C6549c cVar) {
        this.f29784g = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: com.google.gson.TypeAdapter<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: com.google.gson.TypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.gson.TypeAdapter<?> mo25612a(com.google.gson.internal.C6549c r9, com.google.gson.Gson r10, com.google.gson.p253b.C6488a<?> r11, com.google.gson.p252a.C6484b r12) {
        /*
            r8 = this;
            java.lang.Class r0 = r12.value()
            com.google.gson.b.a r0 = com.google.gson.p253b.C6488a.get(r0)
            com.google.gson.internal.h r9 = r9.mo25715a(r0)
            java.lang.Object r9 = r9.mo25717a()
            boolean r0 = r9 instanceof com.google.gson.TypeAdapter
            if (r0 == 0) goto L_0x0017
            com.google.gson.TypeAdapter r9 = (com.google.gson.TypeAdapter) r9
            goto L_0x0075
        L_0x0017:
            boolean r0 = r9 instanceof com.google.gson.TypeAdapterFactory
            if (r0 == 0) goto L_0x0022
            com.google.gson.TypeAdapterFactory r9 = (com.google.gson.TypeAdapterFactory) r9
            com.google.gson.TypeAdapter r9 = r9.create(r10, r11)
            goto L_0x0075
        L_0x0022:
            boolean r0 = r9 instanceof com.google.gson.JsonSerializer
            if (r0 != 0) goto L_0x005b
            boolean r1 = r9 instanceof com.google.gson.JsonDeserializer
            if (r1 == 0) goto L_0x002b
            goto L_0x005b
        L_0x002b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Invalid attempt to bind an instance of "
            r12.append(r0)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r12.append(r9)
            java.lang.String r9 = " as a @JsonAdapter for "
            r12.append(r9)
            java.lang.String r9 = r11.toString()
            r12.append(r9)
            java.lang.String r9 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r10.<init>(r9)
            throw r10
        L_0x005b:
            r1 = 0
            if (r0 == 0) goto L_0x0063
            r0 = r9
            com.google.gson.JsonSerializer r0 = (com.google.gson.JsonSerializer) r0
            r3 = r0
            goto L_0x0064
        L_0x0063:
            r3 = r1
        L_0x0064:
            boolean r0 = r9 instanceof com.google.gson.JsonDeserializer
            if (r0 == 0) goto L_0x006b
            r1 = r9
            com.google.gson.JsonDeserializer r1 = (com.google.gson.JsonDeserializer) r1
        L_0x006b:
            r4 = r1
            com.google.gson.internal.bind.TreeTypeAdapter r9 = new com.google.gson.internal.bind.TreeTypeAdapter
            r7 = 0
            r2 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0075:
            if (r9 == 0) goto L_0x0081
            boolean r10 = r12.nullSafe()
            if (r10 == 0) goto L_0x0081
            com.google.gson.TypeAdapter r9 = r9.nullSafe()
        L_0x0081:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.mo25612a(com.google.gson.internal.c, com.google.gson.Gson, com.google.gson.b.a, com.google.gson.a.b):com.google.gson.TypeAdapter");
    }

    public <T> TypeAdapter<T> create(Gson gson, C6488a<T> aVar) {
        C6484b bVar = (C6484b) aVar.getRawType().getAnnotation(C6484b.class);
        if (bVar == null) {
            return null;
        }
        return mo25612a(this.f29784g, gson, aVar, bVar);
    }
}
