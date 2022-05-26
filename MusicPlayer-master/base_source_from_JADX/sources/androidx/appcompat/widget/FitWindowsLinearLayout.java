package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.C0307r;

public class FitWindowsLinearLayout extends LinearLayout implements C0307r {

    /* renamed from: g */
    private C0307r.C0308a f995g;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        C0307r.C0308a aVar = this.f995g;
        if (aVar != null) {
            aVar.mo581a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C0307r.C0308a aVar) {
        this.f995g = aVar;
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
