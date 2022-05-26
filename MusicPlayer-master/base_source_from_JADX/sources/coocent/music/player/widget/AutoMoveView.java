package coocent.music.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;
import skin.support.widget.SkinCompatTextView;

public class AutoMoveView extends SkinCompatTextView {

    /* renamed from: m */
    private SeekBar f31459m;

    /* renamed from: n */
    private int f31460n;

    /* renamed from: o */
    private int f31461o = 1;

    public AutoMoveView(Context context) {
        super(context);
    }

    /* renamed from: p */
    private AutoMoveView m40544p() {
        int progress = this.f31459m.getProgress() * 300;
        int i = (this.f31460n * 300) / 2;
        if (progress > i) {
            int i2 = (progress - i) / 1000;
            if (i2 != 0) {
                setText("+" + i2);
            } else {
                setText("0");
            }
        } else if (progress < i) {
            int i3 = (i - progress) / 1000;
            if (i3 != 0) {
                setText("-" + i3);
            } else {
                setText("0");
            }
        } else {
            setText("0");
        }
        return this;
    }

    /* renamed from: q */
    private AutoMoveView m40545q() {
        setText(String.valueOf(this.f31459m.getProgress() / this.f31461o));
        return this;
    }

    /* renamed from: r */
    public AutoMoveView mo27378r(SeekBar seekBar, boolean z) {
        this.f31459m = seekBar;
        this.f31460n = seekBar.getMax();
        int abs = Math.abs(seekBar.getProgress() - this.f31460n);
        StringBuilder sb = new StringBuilder();
        double height = (double) ((((((float) abs) * ((float) seekBar.getHeight())) / ((float) this.f31460n)) + seekBar.getY()) - 100.0f);
        sb.append(height - (0.15d * height));
        sb.append(BuildConfig.FLAVOR);
        float parseFloat = Float.parseFloat(sb.toString());
        if (parseFloat <= seekBar.getY()) {
            setY(seekBar.getY());
        } else {
            setY(parseFloat);
        }
        if (z) {
            m40544p();
            return this;
        }
        m40545q();
        return this;
    }

    /* renamed from: s */
    public AutoMoveView mo27379s() {
        setText(BuildConfig.FLAVOR);
        return this;
    }

    public AutoMoveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AutoMoveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
