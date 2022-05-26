package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fq0 implements y50<eo0> {
    /* renamed from: b */
    private static final Integer m23775b(Map<String, String> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = map.get(str);
            StringBuilder sb = new StringBuilder(str.length() + 39 + String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            ul0.m31862g(sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15685a(Object obj, Map map) {
        eq0 eq0;
        vp0 vp0;
        Map map2 = map;
        eo0 eo0 = (eo0) obj;
        if (ul0.m31865j(3)) {
            JSONObject jSONObject = new JSONObject(map2);
            jSONObject.remove("google.afma.Notify_dt");
            ul0.m31857b("Precache GMSG: ".concat(jSONObject.toString()));
        }
        wp0 z = C2971s.m13223z();
        if (!map2.containsKey("abort")) {
            String str = (String) map2.get("src");
            Integer b = m23775b(map2, "periodicReportIntervalMs");
            Integer b2 = m23775b(map2, "exoPlayerRenderingIntervalMs");
            Integer b3 = m23775b(map2, "exoPlayerIdleIntervalMs");
            do0 do0 = new do0((String) map2.get("flags"));
            boolean z2 = do0.f15696m;
            if (str != null) {
                String[] strArr = {str};
                String str2 = (String) map2.get("demuxed");
                if (str2 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str2);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i = 0; i < jSONArray.length(); i++) {
                            strArr2[i] = jSONArray.getString(i);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused) {
                        ul0.m31862g(str2.length() != 0 ? "Malformed demuxed URL list for precache: ".concat(str2) : new String("Malformed demuxed URL list for precache: "));
                        strArr = null;
                    }
                }
                if (strArr == null) {
                    strArr = new String[]{str};
                }
                if (z2) {
                    Iterator<vp0> it = z.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            vp0 = null;
                            break;
                        }
                        vp0 next = it.next();
                        if (next.f24891c == eo0 && str.equals(next.mo21596e())) {
                            vp0 = next;
                            break;
                        }
                    }
                } else {
                    vp0 = z.mo21868d(eo0);
                }
                if (vp0 != null) {
                    ul0.m31862g("Precache task is already running.");
                    return;
                } else if (eo0.mo17245m() == null) {
                    ul0.m31862g("Precache requires a dependency provider.");
                    return;
                } else {
                    Integer b4 = m23775b(map2, "player");
                    if (b4 == null) {
                        b4 = 0;
                    }
                    if (b != null) {
                        eo0.mo17233W(b.intValue());
                    }
                    if (b2 != null) {
                        eo0.mo17243k0(b2.intValue());
                    }
                    if (b3 != null) {
                        eo0.mo17249t0(b3.intValue());
                    }
                    int intValue = b4.intValue();
                    pp0 pp0 = eo0.mo17245m().f9814b;
                    if (intValue > 0) {
                        int U = un0.m31902U();
                        if (U < do0.f15690g) {
                            eq0 = new nq0(eo0, do0);
                        } else if (U < do0.f15685b) {
                            eq0 = new kq0(eo0, do0);
                        } else {
                            eq0 = new iq0(eo0);
                        }
                    } else {
                        eq0 = new hq0(eo0);
                    }
                    new vp0(eo0, eq0, str, strArr).mo10973b();
                }
            } else {
                vp0 d = z.mo21868d(eo0);
                if (d != null) {
                    eq0 = d.f24892d;
                } else {
                    ul0.m31862g("Precache must specify a source.");
                    return;
                }
            }
            Integer b5 = m23775b(map2, "minBufferMs");
            if (b5 != null) {
                eq0.mo17271s(b5.intValue());
            }
            Integer b6 = m23775b(map2, "maxBufferMs");
            if (b6 != null) {
                eq0.mo17270q(b6.intValue());
            }
            Integer b7 = m23775b(map2, "bufferForPlaybackMs");
            if (b7 != null) {
                eq0.mo17268o(b7.intValue());
            }
            Integer b8 = m23775b(map2, "bufferForPlaybackAfterRebufferMs");
            if (b8 != null) {
                eq0.mo17269p(b8.intValue());
            }
        } else if (!z.mo21872t(eo0)) {
            ul0.m31862g("Precache abort but no precache task running.");
        }
    }
}
