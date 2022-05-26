package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.util.C3009j1;
import com.google.android.gms.ads.internal.util.C3018m1;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rp0 implements y50<eo0> {

    /* renamed from: a */
    private boolean f22944a;

    /* renamed from: b */
    private static int m30280b(Context context, Map<String, String> map, String str, int i) {
        String str2 = map.get(str);
        if (str2 != null) {
            try {
                C4980cv.m22123b();
                i = nl0.m27927s(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(str.length() + 34 + str2.length());
                sb.append("Could not parse ");
                sb.append(str);
                sb.append(" in a video GMSG: ");
                sb.append(str2);
                ul0.m31862g(sb.toString());
            }
        }
        if (C3018m1.m13390m()) {
            StringBuilder sb2 = new StringBuilder(str.length() + 48 + String.valueOf(str2).length());
            sb2.append("Parse pixels for ");
            sb2.append(str);
            sb2.append(", got string ");
            sb2.append(str2);
            sb2.append(", int ");
            sb2.append(i);
            sb2.append(".");
            C3018m1.m13388k(sb2.toString());
        }
        return i;
    }

    /* renamed from: c */
    private static void m30281c(rn0 rn0, Map<String, String> map) {
        String str = map.get("minBufferMs");
        String str2 = map.get("maxBufferMs");
        String str3 = map.get("bufferForPlaybackMs");
        String str4 = map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                rn0.mo20705G(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                ul0.m31862g(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", new Object[]{str, str2}));
                return;
            }
        }
        if (str2 != null) {
            rn0.mo20704F(Integer.parseInt(str2));
        }
        if (str3 != null) {
            rn0.mo20702D(Integer.parseInt(str3));
        }
        if (str4 != null) {
            rn0.mo20703E(Integer.parseInt(str4));
        }
        if (str5 != null) {
            rn0.mo20708j(Integer.parseInt(str5));
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15685a(Object obj, Map map) {
        int i;
        int i2;
        int i3;
        String str;
        String str2;
        String str3;
        String str4;
        eo0 eo0 = (eo0) obj;
        String str5 = (String) map.get("action");
        if (str5 == null) {
            ul0.m31862g("Action missing from video GMSG.");
            return;
        }
        if (ul0.m31865j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder(str5.length() + 13 + String.valueOf(jSONObject2).length());
            sb.append("Video GMSG: ");
            sb.append(str5);
            sb.append(" ");
            sb.append(jSONObject2);
            ul0.m31857b(sb.toString());
        }
        if ("background".equals(str5)) {
            String str6 = (String) map.get("color");
            if (TextUtils.isEmpty(str6)) {
                ul0.m31862g("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                eo0.setBackgroundColor(Color.parseColor(str6));
            } catch (IllegalArgumentException unused) {
                ul0.m31862g("Invalid color parameter in background video GMSG.");
            }
        } else if ("playerBackground".equals(str5)) {
            String str7 = (String) map.get("color");
            if (TextUtils.isEmpty(str7)) {
                ul0.m31862g("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                eo0.mo17234b0(Color.parseColor(str7));
            } catch (IllegalArgumentException unused2) {
                ul0.m31862g("Invalid color parameter in playerBackground video GMSG.");
            }
        } else {
            if ("decoderProps".equals(str5)) {
                String str8 = (String) map.get("mimeTypes");
                if (str8 == null) {
                    ul0.m31862g("No MIME types specified for decoder properties inspection.");
                    HashMap hashMap = new HashMap();
                    hashMap.put("event", "decoderProps");
                    hashMap.put("error", "missingMimeTypes");
                    eo0.mo16880n0("onVideoEvent", hashMap);
                    return;
                }
                HashMap hashMap2 = new HashMap();
                for (String str9 : str8.split(",")) {
                    hashMap2.put(str9, C3009j1.m13369a(str9.trim()));
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put("event", "decoderProps");
                hashMap3.put("mimeTypes", hashMap2);
                eo0.mo16880n0("onVideoEvent", hashMap3);
                return;
            }
            sn0 N0 = eo0.mo17230N0();
            if (N0 == null) {
                ul0.m31862g("Could not get underlay container for a video GMSG.");
                return;
            }
            boolean equals = "new".equals(str5);
            boolean equals2 = "position".equals(str5);
            if (equals || equals2) {
                Context context = eo0.getContext();
                int b = m30280b(context, map, "x", 0);
                int b2 = m30280b(context, map, "y", 0);
                int b3 = m30280b(context, map, "w", -1);
                C5207iz izVar = C5503qz.f22539i2;
                if (!((Boolean) C5054ev.m23225c().mo20153b(izVar)).booleanValue()) {
                    if (C3018m1.m13390m()) {
                        int h = eo0.mo17240h();
                        StringBuilder sb2 = new StringBuilder(110);
                        sb2.append("Calculate width with original width ");
                        sb2.append(b3);
                        sb2.append(", videoHost.getVideoBoundingWidth() ");
                        sb2.append(h);
                        sb2.append(", x ");
                        sb2.append(b);
                        sb2.append(".");
                        C3018m1.m13388k(sb2.toString());
                    }
                    i = Math.min(b3, eo0.mo17240h() - b);
                } else if (b3 == -1) {
                    i = eo0.mo17240h();
                } else {
                    i = Math.min(b3, eo0.mo17240h());
                }
                int b4 = m30280b(context, map, "h", -1);
                if (!((Boolean) C5054ev.m23225c().mo20153b(izVar)).booleanValue()) {
                    if (C3018m1.m13390m()) {
                        int g = eo0.mo17238g();
                        StringBuilder sb3 = new StringBuilder(113);
                        sb3.append("Calculate height with original height ");
                        sb3.append(b4);
                        sb3.append(", videoHost.getVideoBoundingHeight() ");
                        sb3.append(g);
                        sb3.append(", y ");
                        sb3.append(b2);
                        sb3.append(".");
                        C3018m1.m13388k(sb3.toString());
                    }
                    i2 = Math.min(b4, eo0.mo17238g() - b2);
                } else if (b4 == -1) {
                    i2 = eo0.mo17238g();
                } else {
                    i2 = Math.min(b4, eo0.mo17238g());
                }
                int i4 = i2;
                try {
                    i3 = Integer.parseInt((String) map.get("player"));
                } catch (NumberFormatException unused3) {
                    i3 = 0;
                }
                boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
                if (!equals || N0.mo20882a() != null) {
                    N0.mo20883b(b, b2, i, i4);
                    return;
                }
                N0.mo20884c(b, b2, i, i4, i3, parseBoolean, new do0((String) map.get("flags")));
                rn0 a = N0.mo20882a();
                if (a != null) {
                    m30281c(a, map);
                    return;
                }
                return;
            }
            ms0 zzs = eo0.zzs();
            if (zzs != null) {
                if ("timeupdate".equals(str5)) {
                    String str10 = (String) map.get("currentTime");
                    if (str10 == null) {
                        ul0.m31862g("currentTime parameter missing from timeupdate video GMSG.");
                        return;
                    }
                    try {
                        zzs.mo19503j7(Float.parseFloat(str10));
                        return;
                    } catch (NumberFormatException unused4) {
                        if (str10.length() != 0) {
                            str4 = "Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str10);
                        } else {
                            str4 = new String("Could not parse currentTime parameter from timeupdate video GMSG: ");
                        }
                        ul0.m31862g(str4);
                        return;
                    }
                } else if ("skip".equals(str5)) {
                    zzs.mo19505u();
                    return;
                }
            }
            rn0 a2 = N0.mo20882a();
            if (a2 == null) {
                HashMap hashMap4 = new HashMap();
                hashMap4.put("event", "no_video_view");
                eo0.mo16880n0("onVideoEvent", hashMap4);
            } else if ("click".equals(str5)) {
                Context context2 = eo0.getContext();
                int b5 = m30280b(context2, map, "x", 0);
                int b6 = m30280b(context2, map, "y", 0);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) b5, (float) b6, 0);
                a2.mo20701C(obtain);
                obtain.recycle();
            } else if ("currentTime".equals(str5)) {
                String str11 = (String) map.get("time");
                if (str11 == null) {
                    ul0.m31862g("Time parameter missing from currentTime video GMSG.");
                    return;
                }
                try {
                    a2.mo20700B((int) (Float.parseFloat(str11) * 1000.0f));
                } catch (NumberFormatException unused5) {
                    if (str11.length() != 0) {
                        str3 = "Could not parse time parameter from currentTime video GMSG: ".concat(str11);
                    } else {
                        str3 = new String("Could not parse time parameter from currentTime video GMSG: ");
                    }
                    ul0.m31862g(str3);
                }
            } else if ("hide".equals(str5)) {
                a2.setVisibility(4);
            } else if ("load".equals(str5)) {
                a2.mo20718w();
            } else if ("loadControl".equals(str5)) {
                m30281c(a2, map);
            } else if ("muted".equals(str5)) {
                if (Boolean.parseBoolean((String) map.get("muted"))) {
                    a2.mo20719x();
                } else {
                    a2.mo20713o();
                }
            } else if ("pause".equals(str5)) {
                a2.mo20721z();
            } else if ("play".equals(str5)) {
                a2.mo20699A();
            } else if ("show".equals(str5)) {
                a2.setVisibility(0);
            } else if ("src".equals(str5)) {
                String str12 = (String) map.get("src");
                Integer num = null;
                if (map.containsKey("periodicReportIntervalMs")) {
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                    } catch (NumberFormatException unused6) {
                        String str13 = (String) map.get("periodicReportIntervalMs");
                        String.valueOf(str13).length();
                        ul0.m31862g("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf(str13)));
                    }
                }
                String[] strArr = {str12};
                String str14 = (String) map.get("demuxed");
                if (str14 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str14);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                            strArr2[i5] = jSONArray.getString(i5);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused7) {
                        if (str14.length() != 0) {
                            str2 = "Malformed demuxed URL list for playback: ".concat(str14);
                        } else {
                            str2 = new String("Malformed demuxed URL list for playback: ");
                        }
                        ul0.m31862g(str2);
                        strArr = new String[]{str12};
                    }
                }
                if (num != null) {
                    eo0.mo17233W(num.intValue());
                }
                a2.mo20709k(str12, strArr);
            } else if ("touchMove".equals(str5)) {
                Context context3 = eo0.getContext();
                a2.mo20712n((float) m30280b(context3, map, "dx", 0), (float) m30280b(context3, map, "dy", 0));
                if (!this.f22944a) {
                    eo0.mo17232R();
                    this.f22944a = true;
                }
            } else if ("volume".equals(str5)) {
                String str15 = (String) map.get("volume");
                if (str15 == null) {
                    ul0.m31862g("Level parameter missing from volume video GMSG.");
                    return;
                }
                try {
                    a2.mo20711m(Float.parseFloat(str15));
                } catch (NumberFormatException unused8) {
                    if (str15.length() != 0) {
                        str = "Could not parse volume parameter from volume video GMSG: ".concat(str15);
                    } else {
                        str = new String("Could not parse volume parameter from volume video GMSG: ");
                    }
                    ul0.m31862g(str);
                }
            } else if ("watermark".equals(str5)) {
                a2.mo20715t();
            } else {
                ul0.m31862g(str5.length() != 0 ? "Unknown video action: ".concat(str5) : new String("Unknown video action: "));
            }
        }
    }
}
