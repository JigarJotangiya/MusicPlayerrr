package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C2971s;
import org.json.JSONObject;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class v31 extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: g */
    private final Context f24565g;

    /* renamed from: h */
    private View f24566h;

    private v31(Context context) {
        super(context);
        this.f24565g = context;
    }

    /* renamed from: a */
    public static v31 m32132a(Context context, View view, bp2 bp2) {
        Resources resources;
        DisplayMetrics displayMetrics;
        v31 v31 = new v31(context);
        if (!(bp2.f14667v.isEmpty() || (resources = v31.f24565g.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null)) {
            cp2 cp2 = bp2.f14667v.get(0);
            float f = displayMetrics.density;
            v31.setLayoutParams(new FrameLayout.LayoutParams((int) (((float) cp2.f15117a) * f), (int) (((float) cp2.f15118b) * f)));
        }
        v31.f24566h = view;
        v31.addView(view);
        C2971s.m13222y();
        um0.m31898b(v31, v31);
        C2971s.m13222y();
        um0.m31897a(v31, v31);
        JSONObject jSONObject = bp2.f14646f0;
        RelativeLayout relativeLayout = new RelativeLayout(v31.f24565g);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            v31.m32134c(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            v31.m32134c(optJSONObject2, relativeLayout, 12);
        }
        v31.addView(relativeLayout);
        return v31;
    }

    /* renamed from: b */
    private final int m32133b(double d) {
        C4980cv.m22123b();
        return nl0.m27927s(this.f24565g, (int) d);
    }

    /* renamed from: c */
    private final void m32134c(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.f24565g);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", BuildConfig.FLAVOR));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int b = m32133b(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, b, 0, b);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, m32133b(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f24566h.setY((float) (-iArr[1]));
    }

    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f24566h.setY((float) (-iArr[1]));
    }
}
