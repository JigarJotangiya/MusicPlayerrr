package com.google.android.gms.internal.ads;

import android.util.JsonWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final /* synthetic */ class pl0 implements sl0 {

    /* renamed from: a */
    public final /* synthetic */ String f21417a;

    public /* synthetic */ pl0(String str) {
        this.f21417a = str;
    }

    /* renamed from: a */
    public final void mo20019a(JsonWriter jsonWriter) {
        String str = this.f21417a;
        int i = tl0.f23926g;
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }
}
