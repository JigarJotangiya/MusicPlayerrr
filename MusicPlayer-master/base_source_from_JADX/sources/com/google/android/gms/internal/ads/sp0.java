package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C2971s;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class sp0 implements y50<eo0> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15685a(Object obj, Map map) {
        eo0 eo0 = (eo0) obj;
        ms0 zzs = eo0.zzs();
        if (zzs == null) {
            try {
                ms0 ms0 = new ms0(eo0, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                eo0.mo17248t(ms0);
                zzs = ms0;
            } catch (NullPointerException e) {
                e = e;
                ul0.m31860e("Unable to parse videoMeta message.", e);
                C2971s.m13213p().mo17571s(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e2) {
                e = e2;
                ul0.m31860e("Unable to parse videoMeta message.", e);
                C2971s.m13213p().mo17571s(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get("duration"));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        int i = 0;
        if (parseInt >= 0) {
            if (parseInt <= 3) {
                i = parseInt;
            }
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (ul0.m31865j(3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 140);
            sb.append("Video Meta GMSG: currentTime : ");
            sb.append(parseFloat2);
            sb.append(" , duration : ");
            sb.append(parseFloat);
            sb.append(" , isMuted : ");
            sb.append(equals);
            sb.append(" , playbackState : ");
            sb.append(i);
            sb.append(" , aspectRatio : ");
            sb.append(str);
            ul0.m31857b(sb.toString());
        }
        zzs.mo19499f7(parseFloat2, parseFloat, i, equals, parseFloat3);
    }
}
