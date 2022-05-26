package skin.support.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p443m.p444a.p446d.C9323b;
import p443m.p444a.p447e.p448a.C9335g;

/* renamed from: skin.support.widget.f */
/* compiled from: SkinCompatSeekBarHelper */
public class C9715f extends C9714e {

    /* renamed from: f */
    private final SeekBar f36812f;

    /* renamed from: g */
    private int f36813g = 0;

    public C9715f(SeekBar seekBar) {
        super(seekBar);
        this.f36812f = seekBar;
    }

    /* renamed from: b */
    public void mo33878b() {
        super.mo33878b();
        int a = C9712c.m50287a(this.f36813g);
        this.f36813g = a;
        if (a != 0) {
            SeekBar seekBar = this.f36812f;
            seekBar.setThumb(C9335g.m49448a(seekBar.getContext(), this.f36813g));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo33879e(AttributeSet attributeSet, int i) {
        super.mo33879e(attributeSet, i);
        TypedArray obtainStyledAttributes = this.f36812f.getContext().obtainStyledAttributes(attributeSet, C9323b.AppCompatSeekBar, i, 0);
        this.f36813g = obtainStyledAttributes.getResourceId(C9323b.AppCompatSeekBar_android_thumb, 0);
        obtainStyledAttributes.recycle();
        mo33878b();
    }
}
