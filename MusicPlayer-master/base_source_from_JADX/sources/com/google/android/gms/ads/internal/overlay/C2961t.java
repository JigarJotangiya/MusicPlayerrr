package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.p074x.C3125a;
import com.google.android.gms.common.util.C3369n;
import com.google.android.gms.internal.ads.C4980cv;
import com.google.android.gms.internal.ads.C5054ev;
import com.google.android.gms.internal.ads.C5503qz;
import com.google.android.gms.internal.ads.nl0;
import com.google.android.gms.internal.ads.ul0;

/* renamed from: com.google.android.gms.ads.internal.overlay.t */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C2961t extends FrameLayout implements View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final ImageButton f9907g;

    /* renamed from: h */
    private final C2942b f9908h;

    public C2961t(Context context, C2960s sVar, C2942b bVar) {
        super(context);
        this.f9908h = bVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f9907g = imageButton;
        m13122d();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        C4980cv.m22123b();
        int s = nl0.m27927s(context, sVar.f9903a);
        C4980cv.m22123b();
        int s2 = nl0.m27927s(context, 0);
        C4980cv.m22123b();
        int s3 = nl0.m27927s(context, sVar.f9904b);
        C4980cv.m22123b();
        imageButton.setPadding(s, s2, s3, nl0.m27927s(context, sVar.f9905c));
        imageButton.setContentDescription("Interstitial close button");
        C4980cv.m22123b();
        int s4 = nl0.m27927s(context, sVar.f9906d + sVar.f9903a + sVar.f9904b);
        C4980cv.m22123b();
        addView(imageButton, new FrameLayout.LayoutParams(s4, nl0.m27927s(context, sVar.f9906d + sVar.f9905c), 17));
        long longValue = ((Long) C5054ev.m23225c().mo20153b(C5503qz.f22354J0)).longValue();
        if (longValue > 0) {
            C2959r rVar = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22361K0)).booleanValue() ? new C2959r(this) : null;
            imageButton.setAlpha(0.0f);
            imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(rVar);
        }
    }

    /* renamed from: d */
    private final void m13122d() {
        String str = (String) C5054ev.m23225c().mo20153b(C5503qz.f22347I0);
        if (!C3369n.m14475g() || TextUtils.isEmpty(str) || "default".equals(str)) {
            this.f9907g.setImageResource(17301527);
            return;
        }
        Resources d = C2971s.m13213p().mo17559d();
        if (d != null) {
            Drawable drawable = null;
            try {
                if ("white".equals(str)) {
                    drawable = d.getDrawable(C3125a.admob_close_button_white_circle_black_cross);
                } else if ("black".equals(str)) {
                    drawable = d.getDrawable(C3125a.admob_close_button_black_circle_white_cross);
                }
            } catch (Resources.NotFoundException unused) {
                ul0.m31857b("Close button resource not found, falling back to default.");
            }
            if (drawable == null) {
                this.f9907g.setImageResource(17301527);
                return;
            }
            this.f9907g.setImageDrawable(drawable);
            this.f9907g.setScaleType(ImageView.ScaleType.CENTER);
            return;
        }
        this.f9907g.setImageResource(17301527);
    }

    /* renamed from: b */
    public final void mo10908b(boolean z) {
        if (z) {
            this.f9907g.setVisibility(8);
            if (((Long) C5054ev.m23225c().mo20153b(C5503qz.f22354J0)).longValue() > 0) {
                this.f9907g.animate().cancel();
                this.f9907g.clearAnimation();
                return;
            }
            return;
        }
        this.f9907g.setVisibility(0);
    }

    public final void onClick(View view) {
        C2942b bVar = this.f9908h;
        if (bVar != null) {
            bVar.mo10860K0();
        }
    }
}
