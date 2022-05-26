package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.common.internal.C3292l;
import java.util.List;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class b20 extends RelativeLayout {

    /* renamed from: h */
    private static final float[] f14274h = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: g */
    private AnimationDrawable f14275g;

    public b20(Context context, a20 a20, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        C3292l.m14240h(a20);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f14274h, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(a20.mo15651f());
        setLayoutParams(layoutParams);
        C2971s.m13215r();
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(a20.mo15649d())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(a20.mo15649d());
            textView.setTextColor(a20.zze());
            textView.setTextSize((float) a20.mo15652f7());
            C4980cv.m22123b();
            int s = nl0.m27927s(context, 4);
            C4980cv.m22123b();
            textView.setPadding(s, 0, nl0.m27927s(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<d20> g7 = a20.mo15653g7();
        if (g7 != null && g7.size() > 1) {
            this.f14275g = new AnimationDrawable();
            for (d20 c : g7) {
                try {
                    this.f14275g.addFrame((Drawable) C4865b.m20502K0(c.mo16823c()), a20.mo15647a());
                } catch (Exception e) {
                    ul0.m31860e("Error while getting drawable.", e);
                }
            }
            C2971s.m13215r();
            imageView.setBackground(this.f14275g);
        } else if (g7.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) C4865b.m20502K0(g7.get(0).mo16823c()));
            } catch (Exception e2) {
                ul0.m31860e("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f14275g;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
