package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C2971s;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class f00 {

    /* renamed from: a */
    private final List<c00> f16387a = new LinkedList();

    /* renamed from: b */
    private final Map<String, String> f16388b;

    /* renamed from: c */
    private final Object f16389c;

    public f00(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f16388b = linkedHashMap;
        this.f16389c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    /* renamed from: f */
    public static final c00 m23398f() {
        return new c00(C2971s.m13198a().mo11989b(), (String) null, (c00) null);
    }

    /* renamed from: a */
    public final e00 mo17445a() {
        e00 e00;
        boolean booleanValue = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22546j1)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.f16389c) {
            for (c00 next : this.f16387a) {
                long a = next.mo16440a();
                String c = next.mo16442c();
                c00 b = next.mo16441b();
                if (b != null && a > 0) {
                    sb.append(c);
                    sb.append('.');
                    sb.append(a - b.mo16440a());
                    sb.append(',');
                    if (booleanValue) {
                        if (!hashMap.containsKey(Long.valueOf(b.mo16440a()))) {
                            hashMap.put(Long.valueOf(b.mo16440a()), new StringBuilder(c));
                        } else {
                            StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(b.mo16440a()));
                            sb2.append('+');
                            sb2.append(c);
                        }
                    }
                }
            }
            this.f16387a.clear();
            String str = null;
            if (!TextUtils.isEmpty((CharSequence) null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append(C2971s.m13198a().mo11988a() + (((Long) entry.getKey()).longValue() - C2971s.m13198a().mo11989b()));
                    sb3.append(',');
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                str = sb3.toString();
            }
            e00 = new e00(sb.toString(), str);
        }
        return e00;
    }

    /* renamed from: b */
    public final Map<String, String> mo17446b() {
        Map<String, String> map;
        synchronized (this.f16389c) {
            C2971s.m13213p().mo17560f();
            map = this.f16388b;
        }
        return map;
    }

    /* renamed from: c */
    public final void mo17447c(f00 f00) {
        synchronized (this.f16389c) {
        }
    }

    /* renamed from: d */
    public final void mo17448d(String str, String str2) {
        C5688vz f;
        if (!TextUtils.isEmpty(str2) && (f = C2971s.m13213p().mo17560f()) != null) {
            synchronized (this.f16389c) {
                b00 a = f.mo21649a(str);
                Map<String, String> map = this.f16388b;
                map.put(str, a.mo15611a(map.get(str), str2));
            }
        }
    }

    /* renamed from: e */
    public final boolean mo17449e(c00 c00, long j, String... strArr) {
        synchronized (this.f16389c) {
            for (int i = 0; i <= 0; i++) {
                this.f16387a.add(new c00(j, strArr[i], c00));
            }
        }
        return true;
    }
}
