package coocent.music.player.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.C7941a;
import p342g.p343a.p344a.p358i.C8343s;

public class EqualizerView extends LinearLayout {

    /* renamed from: g */
    View f31578g;

    /* renamed from: h */
    View f31579h;

    /* renamed from: i */
    View f31580i;

    /* renamed from: j */
    AnimatorSet f31581j;

    /* renamed from: k */
    AnimatorSet f31582k;

    /* renamed from: l */
    int f31583l;

    /* renamed from: m */
    int f31584m;

    public EqualizerView(Context context) {
        super(context);
        m40665b();
    }

    /* renamed from: b */
    private void m40665b() {
        LayoutInflater.from(getContext()).inflate(R.layout.view_equalizer, this, true);
        this.f31578g = findViewById(R.id.music_bar1);
        this.f31579h = findViewById(R.id.music_bar2);
        this.f31580i = findViewById(R.id.music_bar3);
        this.f31578g.setBackgroundColor(this.f31583l);
        this.f31579h.setBackgroundColor(this.f31583l);
        this.f31580i.setBackgroundColor(this.f31583l);
    }

    /* renamed from: c */
    private void m40666c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C7941a.EqualizerView, 0, 0);
        try {
            this.f31583l = C8343s.m46300h();
            this.f31584m = obtainStyledAttributes.getInt(0, 3000);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public void mo27498a() {
        try {
            AnimatorSet animatorSet = this.f31581j;
            if (animatorSet == null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f31578g, "scaleY", new float[]{0.2f, 0.8f, 0.1f, 0.1f, 0.3f, 0.1f, 0.2f, 0.8f, 0.7f, 0.2f, 0.4f, 0.9f, 0.7f, 0.6f, 0.1f, 0.3f, 0.1f, 0.4f, 0.1f, 0.8f, 0.7f, 0.9f, 0.5f, 0.6f, 0.3f, 0.1f});
                ofFloat.setRepeatCount(-1);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f31579h, "scaleY", new float[]{0.2f, 0.5f, 1.0f, 0.5f, 0.3f, 0.1f, 0.2f, 0.3f, 0.5f, 0.1f, 0.6f, 0.5f, 0.3f, 0.7f, 0.8f, 0.9f, 0.3f, 0.1f, 0.5f, 0.3f, 0.6f, 1.0f, 0.6f, 0.7f, 0.4f, 0.1f});
                ofFloat2.setRepeatCount(-1);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f31580i, "scaleY", new float[]{0.6f, 0.5f, 1.0f, 0.6f, 0.5f, 1.0f, 0.6f, 0.5f, 1.0f, 0.5f, 0.6f, 0.7f, 0.2f, 0.3f, 0.1f, 0.5f, 0.4f, 0.6f, 0.7f, 0.1f, 0.4f, 0.3f, 0.1f, 0.4f, 0.3f, 0.7f});
                ofFloat3.setRepeatCount(-1);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f31581j = animatorSet2;
                animatorSet2.playTogether(new Animator[]{ofFloat2, ofFloat3, ofFloat});
                this.f31581j.setDuration((long) this.f31584m);
                this.f31581j.setInterpolator(new LinearInterpolator());
                this.f31581j.start();
            } else if (Build.VERSION.SDK_INT < 19) {
                if (!animatorSet.isStarted()) {
                    this.f31581j.start();
                }
            } else if (animatorSet.isPaused()) {
                this.f31581j.resume();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public void mo27499d() {
        AnimatorSet animatorSet = this.f31581j;
        if (animatorSet != null && animatorSet.isRunning() && this.f31581j.isStarted()) {
            if (Build.VERSION.SDK_INT < 19) {
                this.f31581j.end();
            } else {
                this.f31581j.pause();
            }
        }
        AnimatorSet animatorSet2 = this.f31582k;
        if (animatorSet2 == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f31578g, "scaleY", new float[]{0.4f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f31579h, "scaleY", new float[]{0.7f});
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f31580i, "scaleY", new float[]{0.3f});
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f31582k = animatorSet3;
            animatorSet3.playTogether(new Animator[]{ofFloat3, ofFloat2, ofFloat});
            this.f31582k.setDuration(200);
            this.f31582k.start();
        } else if (!animatorSet2.isStarted()) {
            this.f31582k.start();
        }
    }

    public EqualizerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m40666c(context, attributeSet);
        m40665b();
    }

    public EqualizerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m40666c(context, attributeSet);
        m40665b();
    }
}
