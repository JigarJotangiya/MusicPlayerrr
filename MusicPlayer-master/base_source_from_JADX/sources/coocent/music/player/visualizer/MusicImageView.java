package coocent.music.player.visualizer;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.AppCompatImageView;

public class MusicImageView extends AppCompatImageView {

    /* renamed from: g */
    private ObjectAnimator f31406g;

    public MusicImageView(Context context) {
        super(context);
        m40504d();
    }

    /* renamed from: d */
    private void m40504d() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "rotation", new float[]{0.0f, 360.0f});
        this.f31406g = ofFloat;
        ofFloat.setDuration(60000);
        this.f31406g.setInterpolator(new LinearInterpolator());
        this.f31406g.setRepeatCount(-1);
        this.f31406g.setRepeatMode(1);
    }

    public MusicImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m40504d();
    }

    public MusicImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m40504d();
    }
}
