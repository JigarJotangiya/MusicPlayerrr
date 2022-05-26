package com.airbnb.lottie.p018u;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.airbnb.lottie.C1461b;
import com.airbnb.lottie.C1489g;
import com.airbnb.lottie.p026y.C1679d;
import com.airbnb.lottie.p026y.C1683h;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.airbnb.lottie.u.b */
/* compiled from: ImageAssetManager */
public class C1554b {

    /* renamed from: e */
    private static final Object f5969e = new Object();

    /* renamed from: a */
    private final Context f5970a;

    /* renamed from: b */
    private final String f5971b;

    /* renamed from: c */
    private C1461b f5972c;

    /* renamed from: d */
    private final Map<String, C1489g> f5973d;

    public C1554b(Drawable.Callback callback, String str, C1461b bVar, Map<String, C1489g> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f5971b = str;
        } else {
            this.f5971b = str + '/';
        }
        if (!(callback instanceof View)) {
            C1679d.m8416c("LottieDrawable must be inside of a view for images to work.");
            this.f5973d = new HashMap();
            this.f5970a = null;
            return;
        }
        this.f5970a = ((View) callback).getContext();
        this.f5973d = map;
        mo7215d(bVar);
    }

    /* renamed from: c */
    private Bitmap m7965c(String str, Bitmap bitmap) {
        synchronized (f5969e) {
            this.f5973d.get(str).mo7111f(bitmap);
        }
        return bitmap;
    }

    /* renamed from: a */
    public Bitmap mo7213a(String str) {
        C1489g gVar = this.f5973d.get(str);
        if (gVar == null) {
            return null;
        }
        Bitmap a = gVar.mo7106a();
        if (a != null) {
            return a;
        }
        C1461b bVar = this.f5972c;
        if (bVar != null) {
            Bitmap a2 = bVar.mo7000a(gVar);
            if (a2 != null) {
                m7965c(str, a2);
            }
            return a2;
        }
        String b = gVar.mo7107b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!b.startsWith("data:") || b.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(this.f5971b)) {
                    AssetManager assets = this.f5970a.getAssets();
                    try {
                        Bitmap l = C1683h.m8466l(BitmapFactory.decodeStream(assets.open(this.f5971b + b), (Rect) null, options), gVar.mo7110e(), gVar.mo7108c());
                        m7965c(str, l);
                        return l;
                    } catch (IllegalArgumentException e) {
                        C1679d.m8417d("Unable to decode image.", e);
                        return null;
                    }
                } else {
                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                }
            } catch (IOException e2) {
                C1679d.m8417d("Unable to open asset.", e2);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(b.substring(b.indexOf(44) + 1), 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                m7965c(str, decodeByteArray);
                return decodeByteArray;
            } catch (IllegalArgumentException e3) {
                C1679d.m8417d("data URL did not have correct base64 format.", e3);
                return null;
            }
        }
    }

    /* renamed from: b */
    public boolean mo7214b(Context context) {
        return (context == null && this.f5970a == null) || this.f5970a.equals(context);
    }

    /* renamed from: d */
    public void mo7215d(C1461b bVar) {
        this.f5972c = bVar;
    }
}
