package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final /* synthetic */ class ql0 implements sl0 {

    /* renamed from: a */
    public final /* synthetic */ String f21948a;

    /* renamed from: b */
    public final /* synthetic */ String f21949b;

    /* renamed from: c */
    public final /* synthetic */ Map f21950c;

    /* renamed from: d */
    public final /* synthetic */ byte[] f21951d;

    public /* synthetic */ ql0(String str, String str2, Map map, byte[] bArr) {
        this.f21948a = str;
        this.f21949b = str2;
        this.f21950c = map;
        this.f21951d = bArr;
    }

    /* renamed from: a */
    public final void mo20019a(JsonWriter jsonWriter) {
        tl0.m31309a(this.f21948a, this.f21949b, this.f21950c, this.f21951d, jsonWriter);
    }
}
