package coocent.music.player.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.C7941a;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.p447e.p448a.C9332d;

public class PressButton extends TextView {

    /* renamed from: g */
    private int f31620g = 0;

    /* renamed from: h */
    private boolean f31621h = false;

    /* renamed from: i */
    private int f31622i = 0;

    public PressButton(Context context) {
        super(context);
    }

    /* renamed from: a */
    public boolean mo27549a() {
        return this.f31621h;
    }

    /* renamed from: b */
    public void mo27550b(boolean z, boolean z2) {
        if (!z) {
            int i = this.f31622i;
            if (!(i == 0 || i == 1)) {
            }
        } else {
            int i2 = this.f31622i;
            setTextColor(C9332d.m49405b(getContext(), R.color.press_button_select_color));
        }
        this.f31621h = z;
    }

    public int getType() {
        return this.f31620g;
    }

    public void setPress(boolean z) {
        if (!z) {
            int i = this.f31622i;
            setTextColor(C9332d.m49405b(getContext(), R.color.default_text_color));
        } else {
            int i2 = this.f31622i;
            setTextColor(C9332d.m49405b(getContext(), R.color.press_button_select_color));
        }
        this.f31621h = z;
    }

    public void setPressEnable(boolean z) {
        setPressTextColor(z ? C9332d.m49405b(getContext(), R.color.press_button_select_color) : C8345u.m46326g(R.color.gray_light));
        if (this.f31622i != 0) {
        }
    }

    public void setPressTextColor(int i) {
        setTextColor(i);
    }

    public void setType(byte b) {
        this.f31620g = b;
    }

    public PressButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7941a.PressButton);
        this.f31622i = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public PressButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
