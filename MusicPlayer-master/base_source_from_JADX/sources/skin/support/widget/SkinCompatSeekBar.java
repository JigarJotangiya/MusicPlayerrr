package skin.support.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import p443m.p444a.p446d.C9322a;

public class SkinCompatSeekBar extends AppCompatSeekBar implements C9716g {

    /* renamed from: h */
    private C9715f f36786h;

    public SkinCompatSeekBar(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: f */
    public void mo33834f() {
        C9715f fVar = this.f36786h;
        if (fVar != null) {
            fVar.mo33878b();
        }
    }

    public SkinCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9322a.seekBarStyle);
    }

    public SkinCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9715f fVar = new C9715f(this);
        this.f36786h = fVar;
        fVar.mo33879e(attributeSet, i);
    }
}
