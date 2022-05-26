package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.iz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C5207iz<T> {

    /* renamed from: a */
    private final int f18284a;

    /* renamed from: b */
    private final String f18285b;

    /* renamed from: c */
    private final T f18286c;

    /* synthetic */ C5207iz(int i, String str, Object obj, C5170hz hzVar) {
        this.f18284a = i;
        this.f18285b = str;
        this.f18286c = obj;
        C5054ev.m23223a().mo18772d(this);
    }

    /* renamed from: f */
    public static C5207iz<Float> m25449f(int i, String str, float f) {
        return new C5058ez(1, str, Float.valueOf(f));
    }

    /* renamed from: g */
    public static C5207iz<Integer> m25450g(int i, String str, int i2) {
        return new C4984cz(1, str, Integer.valueOf(i2));
    }

    /* renamed from: h */
    public static C5207iz<Long> m25451h(int i, String str, long j) {
        return new C5021dz(1, str, Long.valueOf(j));
    }

    /* renamed from: i */
    public static C5207iz<Boolean> m25452i(int i, String str, Boolean bool) {
        return new C4947bz(i, str, bool);
    }

    /* renamed from: j */
    public static C5207iz<String> m25453j(int i, String str, String str2) {
        return new C5096fz(1, str, str2);
    }

    /* renamed from: k */
    public static C5207iz<String> m25454k(int i, String str) {
        C5207iz<String> j = m25453j(1, "gads:sdk_core_constants:experiment_id", (String) null);
        C5054ev.m23223a().mo18771c(j);
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo16428a(JSONObject jSONObject);

    /* renamed from: b */
    public abstract T mo16429b(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract T mo16430c(SharedPreferences sharedPreferences);

    /* renamed from: d */
    public abstract void mo16431d(SharedPreferences.Editor editor, T t);

    /* renamed from: e */
    public final int mo18522e() {
        return this.f18284a;
    }

    /* renamed from: l */
    public final T mo18523l() {
        return this.f18286c;
    }

    /* renamed from: m */
    public final String mo18524m() {
        return this.f18285b;
    }
}
