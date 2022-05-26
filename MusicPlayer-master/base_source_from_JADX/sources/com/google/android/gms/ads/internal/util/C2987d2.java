package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.C3245g;
import com.google.android.gms.common.util.C3358c;
import com.google.android.gms.common.util.C3371p;

@TargetApi(17)
/* renamed from: com.google.android.gms.ads.internal.util.d2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class C2987d2 extends C2992f {
    public C2987d2() {
        super((C2988e) null);
    }

    /* renamed from: a */
    public final int mo11009a(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "airplane_mode_on", 0);
    }

    /* renamed from: b */
    public final int mo11010b(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "wifi_on", 0);
    }

    /* renamed from: c */
    public final Drawable mo11011c(Context context, Bitmap bitmap, boolean z, float f) {
        if (!z || f <= 0.0f || f > 25.0f) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
        try {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
            RenderScript create = RenderScript.create(context);
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            return new BitmapDrawable(context.getResources(), createBitmap);
        } catch (RuntimeException unused) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
    }

    /* renamed from: d */
    public final String mo11012d(Context context) {
        String str;
        C2998g1 a = C2998g1.m13352a();
        if (TextUtils.isEmpty(a.f10008a)) {
            if (C3358c.m14436a()) {
                str = (String) C2986d1.m13315a(context, new C2990e1(a, context));
            } else {
                str = (String) C2986d1.m13315a(context, new C2994f1(a, C3245g.m14047c(context), context));
            }
            a.f10008a = str;
        }
        return a.f10008a;
    }

    /* renamed from: e */
    public final void mo11013e(Context context) {
        C2998g1 a = C2998g1.m13352a();
        C3018m1.m13388k("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(a.f10008a)) {
            Context c = C3245g.m14047c(context);
            if (!C3358c.m14436a()) {
                if (c == null) {
                    c = null;
                }
                a.f10008a = defaultUserAgent;
            }
            SharedPreferences.Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
            if (c == null) {
                putString.apply();
                a.f10008a = defaultUserAgent;
            } else {
                C3371p.m14480a(context, putString, "admob_user_agent");
                throw null;
            }
        }
        C3018m1.m13388k("User agent is updated.");
    }

    /* renamed from: f */
    public final boolean mo11014f(Context context, WebSettings webSettings) {
        super.mo11014f(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }
}
