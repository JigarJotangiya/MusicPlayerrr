package skin.support.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRatingBar;
import p443m.p444a.p446d.C9322a;

public class SkinCompatRatingBar extends AppCompatRatingBar implements C9716g {

    /* renamed from: h */
    private C9714e f36783h;

    public SkinCompatRatingBar(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: f */
    public void mo33834f() {
        C9714e eVar = this.f36783h;
        if (eVar != null) {
            eVar.mo33878b();
        }
    }

    public SkinCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9322a.ratingBarStyle);
    }

    public SkinCompatRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9714e eVar = new C9714e(this);
        this.f36783h = eVar;
        eVar.mo33879e(attributeSet, i);
    }
}
