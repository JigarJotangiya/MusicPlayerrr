package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.common.p078l.C3334c;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ov1 {

    /* renamed from: a */
    private final Context f21208a;

    /* renamed from: b */
    private final ApplicationInfo f21209b;

    /* renamed from: c */
    private final int f21210c;

    /* renamed from: d */
    private final int f21211d;

    /* renamed from: e */
    private String f21212e = BuildConfig.FLAVOR;

    public ov1(Context context) {
        this.f21208a = context;
        this.f21209b = context.getApplicationInfo();
        this.f21210c = ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22519f6)).intValue();
        this.f21211d = ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22527g6)).intValue();
    }

    /* renamed from: a */
    public final JSONObject mo20131a() throws JSONException {
        Drawable drawable;
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", C3334c.m14368a(this.f21208a).mo11911d(this.f21209b.packageName));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.f21209b.packageName);
        C2971s.m13214q();
        jSONObject.put("adMobAppId", C2979b2.m13252d0(this.f21208a));
        if (this.f21212e.isEmpty()) {
            try {
                drawable = (Drawable) C3334c.m14368a(this.f21208a).mo11912e(this.f21209b.packageName).f11714b;
            } catch (PackageManager.NameNotFoundException unused2) {
                drawable = null;
            }
            if (drawable == null) {
                str = BuildConfig.FLAVOR;
            } else {
                drawable.setBounds(0, 0, this.f21210c, this.f21211d);
                Bitmap createBitmap = Bitmap.createBitmap(this.f21210c, this.f21211d, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                str = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f21212e = str;
        }
        if (!this.f21212e.isEmpty()) {
            jSONObject.put("icon", this.f21212e);
            jSONObject.put("iconWidthPx", this.f21210c);
            jSONObject.put("iconHeightPx", this.f21211d);
        }
        return jSONObject;
    }
}
