package coocent.music.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import coocent.music.player.base.BaseApplication;
import coocent.musiclibrary.music.p292j.C7397j;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p355g.C8287e;

public class GuideLayout extends RelativeLayout implements View.OnClickListener {

    /* renamed from: g */
    private ImageView f31591g;

    /* renamed from: h */
    private TextView f31592h;

    /* renamed from: i */
    private int f31593i = 0;

    public GuideLayout(Context context) {
        super(context);
        mo27506d(context);
    }

    /* renamed from: a */
    private LinearLayout m40683a(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = (C7397j.f32505b * 3) / 9;
        layoutParams.addRule(14);
        linearLayout.setGravity(14);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        ImageView imageView = new ImageView(context);
        this.f31591g = imageView;
        linearLayout.addView(imageView);
        TextView textView = new TextView(context);
        this.f31592h = textView;
        textView.setTextColor(context.getResources().getColor(R.color.white));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = C7397j.m41731a(context, 15);
        this.f31592h.setLayoutParams(layoutParams2);
        linearLayout.addView(this.f31592h);
        setTip(context);
        return linearLayout;
    }

    /* renamed from: b */
    private LinearLayout m40684b(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12);
        layoutParams.addRule(14);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        if (BaseApplication.f31159w && BaseApplication.f31158v) {
            layoutParams.bottomMargin = BaseApplication.f31157u;
        }
        TextView textView = new TextView(context);
        textView.setTextColor(context.getResources().getColor(R.color.white));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = C7397j.m41731a(context, 15);
        textView.setLayoutParams(layoutParams2);
        linearLayout.addView(textView);
        linearLayout.addView(new ImageView(context));
        textView.setText(context.getResources().getString(R.string.library_tip));
        setTip(context);
        addView(linearLayout);
        return linearLayout;
    }

    private void setGuide(Context context) {
        setBackgroundColor(context.getResources().getColor(R.color.crop_bg_color_half));
        addView(m40683a(context));
    }

    private void setTip(Context context) {
        int i = this.f31593i;
        if (i == 0) {
            this.f31592h.setText(context.getResources().getString(R.string.click_tip));
        } else if (i == 1) {
            this.f31592h.setText(context.getResources().getString(R.string.sliding_tip));
        } else if (i == 2) {
            this.f31591g.setVisibility(8);
            this.f31592h.setVisibility(8);
        }
        this.f31593i++;
    }

    /* renamed from: d */
    public void mo27506d(Context context) {
        setBackgroundColor(context.getResources().getColor(R.color.black));
    }

    public void onClick(View view) {
        int i = this.f31593i;
        if (i == 0) {
            setTip(getContext());
        } else if (i == 1) {
            setTip(getContext());
        } else if (i == 2) {
            m40684b(getContext());
        } else if (i == 3) {
            setVisibility(8);
            C8287e.m45880y0(false);
            this.f31593i = 0;
        }
    }

    public GuideLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo27506d(context);
    }

    public GuideLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo27506d(context);
    }
}
