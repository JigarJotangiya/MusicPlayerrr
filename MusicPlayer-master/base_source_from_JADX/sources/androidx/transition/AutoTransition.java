package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;

public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        m6110z0();
    }

    /* renamed from: z0 */
    private void m6110z0() {
        mo6016w0(1);
        mo6009o0(new Fade(2));
        mo6009o0(new ChangeBounds());
        mo6009o0(new Fade(1));
    }

    public AutoTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6110z0();
    }
}
