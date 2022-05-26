package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class do0 {

    /* renamed from: a */
    public final boolean f15684a;

    /* renamed from: b */
    public final int f15685b;

    /* renamed from: c */
    public final int f15686c;

    /* renamed from: d */
    public final int f15687d;

    /* renamed from: e */
    public final int f15688e;

    /* renamed from: f */
    public final int f15689f;

    /* renamed from: g */
    public final int f15690g;

    /* renamed from: h */
    public final int f15691h;

    /* renamed from: i */
    public final boolean f15692i;

    /* renamed from: j */
    public final int f15693j;

    /* renamed from: k */
    public final boolean f15694k;

    /* renamed from: l */
    public final boolean f15695l;

    /* renamed from: m */
    public final boolean f15696m;

    public do0(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f15684a = m22587a(jSONObject, "aggressive_media_codec_release", C5503qz.f22282A);
        this.f15685b = m22588b(jSONObject, "byte_buffer_precache_limit", C5503qz.f22520g);
        this.f15686c = m22588b(jSONObject, "exo_cache_buffer_size", C5503qz.f22584o);
        this.f15687d = m22588b(jSONObject, "exo_connect_timeout_millis", C5503qz.f22488c);
        C5207iz izVar = C5503qz.f22480b;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.f15688e = m22588b(jSONObject, "exo_read_timeout_millis", C5503qz.f22496d);
            this.f15689f = m22588b(jSONObject, "load_check_interval_bytes", C5503qz.f22504e);
            this.f15690g = m22588b(jSONObject, "player_precache_limit", C5503qz.f22512f);
            this.f15691h = m22588b(jSONObject, "socket_receive_buffer_size", C5503qz.f22528h);
            this.f15692i = m22587a(jSONObject, "use_cache_data_source", C5503qz.f22651w2);
            this.f15693j = m22588b(jSONObject, "min_retry_count", C5503qz.f22536i);
            this.f15694k = m22587a(jSONObject, "treat_load_exception_as_non_fatal", C5503qz.f22560l);
            this.f15695l = m22587a(jSONObject, "using_official_simple_exo_player", C5503qz.f22554k1);
            this.f15696m = m22587a(jSONObject, "enable_multiple_video_playback", C5503qz.f22562l1);
        }
        String str2 = (String) C5054ev.m23225c().mo20153b(izVar);
        this.f15688e = m22588b(jSONObject, "exo_read_timeout_millis", C5503qz.f22496d);
        this.f15689f = m22588b(jSONObject, "load_check_interval_bytes", C5503qz.f22504e);
        this.f15690g = m22588b(jSONObject, "player_precache_limit", C5503qz.f22512f);
        this.f15691h = m22588b(jSONObject, "socket_receive_buffer_size", C5503qz.f22528h);
        this.f15692i = m22587a(jSONObject, "use_cache_data_source", C5503qz.f22651w2);
        this.f15693j = m22588b(jSONObject, "min_retry_count", C5503qz.f22536i);
        this.f15694k = m22587a(jSONObject, "treat_load_exception_as_non_fatal", C5503qz.f22560l);
        this.f15695l = m22587a(jSONObject, "using_official_simple_exo_player", C5503qz.f22554k1);
        this.f15696m = m22587a(jSONObject, "enable_multiple_video_playback", C5503qz.f22562l1);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.iz, com.google.android.gms.internal.ads.iz<java.lang.Boolean>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final boolean m22587a(org.json.JSONObject r1, java.lang.String r2, com.google.android.gms.internal.ads.C5207iz<java.lang.Boolean> r3) {
        /*
            com.google.android.gms.internal.ads.oz r0 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r3 = r0.mo20153b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r1 == 0) goto L_0x0014
            boolean r3 = r1.getBoolean(r2)     // Catch:{ JSONException -> 0x0014 }
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.do0.m22587a(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.iz):boolean");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.iz, com.google.android.gms.internal.ads.iz<java.lang.Integer>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final int m22588b(org.json.JSONObject r0, java.lang.String r1, com.google.android.gms.internal.ads.C5207iz<java.lang.Integer> r2) {
        /*
            if (r0 == 0) goto L_0x0007
            int r0 = r0.getInt(r1)     // Catch:{ JSONException -> 0x0007 }
            return r0
        L_0x0007:
            com.google.android.gms.internal.ads.oz r0 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r0 = r0.mo20153b(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.do0.m22588b(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.iz):int");
    }
}
