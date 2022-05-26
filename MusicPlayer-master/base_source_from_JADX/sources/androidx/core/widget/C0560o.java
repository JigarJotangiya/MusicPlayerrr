package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* renamed from: androidx.core.widget.o */
/* compiled from: TintableImageSourceView */
public interface C0560o {
    ColorStateList getSupportImageTintList();

    PorterDuff.Mode getSupportImageTintMode();

    void setSupportImageTintList(ColorStateList colorStateList);

    void setSupportImageTintMode(PorterDuff.Mode mode);
}
