package com.airbnb.lottie.p018u;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.airbnb.lottie.C1460a;
import com.airbnb.lottie.p019v.C1564i;
import com.airbnb.lottie.p026y.C1679d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.airbnb.lottie.u.a */
/* compiled from: FontAssetManager */
public class C1553a {

    /* renamed from: a */
    private final C1564i<String> f5963a = new C1564i<>();

    /* renamed from: b */
    private final Map<C1564i<String>, Typeface> f5964b = new HashMap();

    /* renamed from: c */
    private final Map<String, Typeface> f5965c = new HashMap();

    /* renamed from: d */
    private final AssetManager f5966d;

    /* renamed from: e */
    private C1460a f5967e;

    /* renamed from: f */
    private String f5968f = ".ttf";

    public C1553a(Drawable.Callback callback, C1460a aVar) {
        if (!(callback instanceof View)) {
            C1679d.m8416c("LottieDrawable must be inside of a view for images to work.");
            this.f5966d = null;
            return;
        }
        this.f5966d = ((View) callback).getContext().getAssets();
    }

    /* renamed from: a */
    private Typeface m7961a(String str) {
        Typeface typeface = this.f5965c.get(str);
        if (typeface != null) {
            return typeface;
        }
        C1460a aVar = this.f5967e;
        if (aVar != null) {
            aVar.mo6998a(str);
            throw null;
        } else if (aVar != null) {
            aVar.mo6999b(str);
            throw null;
        } else {
            Typeface createFromAsset = Typeface.createFromAsset(this.f5966d, "fonts/" + str + this.f5968f);
            this.f5965c.put(str, createFromAsset);
            return createFromAsset;
        }
    }

    /* renamed from: d */
    private Typeface m7962d(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i = (!contains || !contains2) ? contains ? 2 : contains2 ? 1 : 0 : 3;
        if (typeface.getStyle() == i) {
            return typeface;
        }
        return Typeface.create(typeface, i);
    }

    /* renamed from: b */
    public Typeface mo7211b(String str, String str2) {
        this.f5963a.mo7241b(str, str2);
        Typeface typeface = this.f5964b.get(this.f5963a);
        if (typeface != null) {
            return typeface;
        }
        Typeface d = m7962d(m7961a(str), str2);
        this.f5964b.put(this.f5963a, d);
        return d;
    }

    /* renamed from: c */
    public void mo7212c(C1460a aVar) {
    }
}
