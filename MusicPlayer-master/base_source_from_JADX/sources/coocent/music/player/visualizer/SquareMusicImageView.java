package coocent.music.player.visualizer;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import com.makeramen.roundedimageview.RoundedImageView;
import p342g.p343a.p344a.p355g.C8287e;

public class SquareMusicImageView extends RoundedImageView {

    /* renamed from: x */
    private ObjectAnimator f31441x;

    /* renamed from: y */
    private int f31442y;

    public SquareMusicImageView(Context context) {
        super(context);
        m40517i();
    }

    /* renamed from: i */
    private void m40517i() {
        this.f31442y = 3;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "rotation", new float[]{0.0f, 360.0f});
        this.f31441x = ofFloat;
        ofFloat.setDuration(20000);
        this.f31441x.setInterpolator(new LinearInterpolator());
        this.f31441x.setRepeatCount(-1);
        this.f31441x.setRepeatMode(1);
    }

    /* renamed from: j */
    public void mo27357j() {
        if (this.f31442y != 2 && !C8287e.m45812V()) {
            if (Build.VERSION.SDK_INT >= 19) {
                this.f31441x.pause();
            } else {
                this.f31441x.cancel();
            }
            this.f31442y = 2;
        }
    }

    /* renamed from: k */
    public void mo27358k() {
        boolean V = C8287e.m45812V();
        boolean z = !V;
        boolean X = C8287e.m45816X();
        int i = (!V || z || X) ? (V || !z || X) ? 3 : 2 : 1;
        int i2 = this.f31442y;
        if (i2 == 2 && i != 2) {
            if (Build.VERSION.SDK_INT >= 19) {
                this.f31441x.resume();
            } else {
                this.f31441x.start();
            }
            this.f31442y = i;
        } else if (i2 != 1 && i == 1) {
            this.f31441x.start();
            this.f31442y = i;
        } else if (i2 != 2 && i == 2) {
            if (Build.VERSION.SDK_INT >= 19) {
                this.f31441x.pause();
            } else {
                this.f31441x.cancel();
            }
            this.f31442y = i;
        } else if (i2 != 3 && i == 3) {
            this.f31441x.end();
            this.f31442y = i;
        }
    }

    /* renamed from: l */
    public void mo27359l() {
        if (this.f31442y == 1 && C8287e.m45812V()) {
            if (Build.VERSION.SDK_INT >= 19) {
                this.f31441x.pause();
            } else {
                this.f31441x.cancel();
            }
            this.f31442y = 2;
        }
    }

    /* renamed from: m */
    public void mo27360m() {
        if (this.f31442y == 2 && C8287e.m45812V()) {
            if (Build.VERSION.SDK_INT >= 19) {
                this.f31441x.resume();
            } else {
                this.f31441x.start();
            }
            this.f31442y = 1;
        } else if (this.f31442y == 3 && C8287e.m45812V()) {
            this.f31441x.start();
            this.f31442y = 3;
        }
    }

    /* renamed from: n */
    public void mo27361n() {
        ObjectAnimator objectAnimator = this.f31441x;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f31442y = 3;
    }

    public SquareMusicImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m40517i();
    }

    public SquareMusicImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m40517i();
    }
}
