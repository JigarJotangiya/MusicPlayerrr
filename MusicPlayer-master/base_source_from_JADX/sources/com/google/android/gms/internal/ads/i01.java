package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2996g;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class i01 implements u90<l01> {

    /* renamed from: a */
    private final Context f17830a;

    /* renamed from: b */
    private final C5638um f17831b;

    /* renamed from: c */
    private final PowerManager f17832c;

    public i01(Context context, C5638um umVar) {
        this.f17830a = context;
        this.f17831b = umVar;
        this.f17832c = (PowerManager) context.getSystemService("power");
    }

    /* renamed from: b */
    public final JSONObject mo18249a(l01 l01) throws JSONException {
        JSONObject jSONObject;
        boolean z;
        Integer num;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        C5749xm xmVar = l01.f19133f;
        if (xmVar == null) {
            jSONObject = new JSONObject();
        } else if (this.f17831b.mo21335d() != null) {
            boolean z2 = xmVar.f25875a;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", this.f17831b.mo21333b()).put("activeViewJSON", this.f17831b.mo21335d()).put("timestamp", l01.f19131d).put("adFormat", this.f17831b.mo21332a()).put("hashCode", this.f17831b.mo21334c()).put("isMraid", false);
            boolean z3 = l01.f19130c;
            JSONObject put2 = put.put("isStopped", false).put("isPaused", l01.f19129b).put("isNative", this.f17831b.mo21336e());
            if (Build.VERSION.SDK_INT >= 20) {
                z = this.f17832c.isInteractive();
            } else {
                z = this.f17832c.isScreenOn();
            }
            put2.put("isScreenOn", z).put("appMuted", C2971s.m13216s().mo11032e()).put("appVolume", (double) C2971s.m13216s().mo11029a()).put("deviceVolume", (double) C2996g.m13346b(this.f17830a.getApplicationContext()));
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22310D3)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.f17830a.getApplicationContext().getSystemService("audio");
                if (audioManager == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(audioManager.getMode());
                }
                if (num != null) {
                    jSONObject3.put("audioMode", num);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f17830a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", xmVar.f25876b).put("isAttachedToWindow", z2).put("viewBox", new JSONObject().put("top", xmVar.f25877c.top).put("bottom", xmVar.f25877c.bottom).put("left", xmVar.f25877c.left).put("right", xmVar.f25877c.right)).put("adBox", new JSONObject().put("top", xmVar.f25878d.top).put("bottom", xmVar.f25878d.bottom).put("left", xmVar.f25878d.left).put("right", xmVar.f25878d.right)).put("globalVisibleBox", new JSONObject().put("top", xmVar.f25879e.top).put("bottom", xmVar.f25879e.bottom).put("left", xmVar.f25879e.left).put("right", xmVar.f25879e.right)).put("globalVisibleBoxVisible", xmVar.f25880f).put("localVisibleBox", new JSONObject().put("top", xmVar.f25881g.top).put("bottom", xmVar.f25881g.bottom).put("left", xmVar.f25881g.left).put("right", xmVar.f25881g.right)).put("localVisibleBoxVisible", xmVar.f25882h).put("hitBox", new JSONObject().put("top", xmVar.f25883i.top).put("bottom", xmVar.f25883i.bottom).put("left", xmVar.f25883i.left).put("right", xmVar.f25883i.right)).put("screenDensity", (double) this.f17830a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", l01.f19128a);
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22424T0)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = xmVar.f25885k;
                if (list != null) {
                    for (Rect next : list) {
                        jSONArray2.put(new JSONObject().put("top", next.top).put("bottom", next.bottom).put("left", next.left).put("right", next.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(l01.f19132e)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
