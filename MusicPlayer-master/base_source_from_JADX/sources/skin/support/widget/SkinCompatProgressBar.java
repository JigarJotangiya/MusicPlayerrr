package skin.support.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class SkinCompatProgressBar extends ProgressBar implements C9716g {

    /* renamed from: g */
    private C9714e f36778g;

    public SkinCompatProgressBar(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: f */
    public void mo33834f() {
        C9714e eVar = this.f36778g;
        if (eVar != null) {
            eVar.mo33878b();
        }
    }

    public SkinCompatProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842871);
    }

    public SkinCompatProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9714e eVar = new C9714e(this);
        this.f36778g = eVar;
        eVar.mo33879e(attributeSet, i);
    }
}
