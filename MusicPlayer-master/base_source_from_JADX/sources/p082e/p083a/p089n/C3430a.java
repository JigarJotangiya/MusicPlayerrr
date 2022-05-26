package p082e.p083a.p089n;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: e.a.n.a */
/* compiled from: AllCapsTransformationMethod */
public class C3430a implements TransformationMethod {

    /* renamed from: g */
    private Locale f10897g;

    public C3430a(Context context) {
        this.f10897g = context.getResources().getConfiguration().locale;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f10897g);
        }
        return null;
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
