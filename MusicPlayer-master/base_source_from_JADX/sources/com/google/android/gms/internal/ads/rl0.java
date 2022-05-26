package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.google.android.gms.common.util.C3357b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final /* synthetic */ class rl0 implements sl0 {

    /* renamed from: a */
    public final /* synthetic */ byte[] f22893a;

    public /* synthetic */ rl0(byte[] bArr) {
        this.f22893a = bArr;
    }

    /* renamed from: a */
    public final void mo20019a(JsonWriter jsonWriter) {
        byte[] bArr = this.f22893a;
        int i = tl0.f23926g;
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String a = C3357b.m14434a(bArr);
        if (length < 10000) {
            jsonWriter.name("body").value(a);
        } else {
            String e = nl0.m27916e(a);
            if (e != null) {
                jsonWriter.name("bodydigest").value(e);
            }
        }
        jsonWriter.name("bodylength").value((long) length);
        jsonWriter.endObject();
    }
}
