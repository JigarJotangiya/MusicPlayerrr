package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: androidx.core.widget.g */
/* compiled from: ImageViewCompat */
public class C0551g {
    /* renamed from: a */
    public static ColorStateList m3398a(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintList();
        }
        if (imageView instanceof C0560o) {
            return ((C0560o) imageView).getSupportImageTintList();
        }
        return null;
    }

    /* renamed from: b */
    public static PorterDuff.Mode m3399b(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintMode();
        }
        if (imageView instanceof C0560o) {
            return ((C0560o) imageView).getSupportImageTintMode();
        }
        return null;
    }

    /* renamed from: c */
    public static void m3400c(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            imageView.setImageTintList(colorStateList);
            if (i == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof C0560o) {
            ((C0560o) imageView).setSupportImageTintList(colorStateList);
        }
    }

    /* renamed from: d */
    public static void m3401d(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            imageView.setImageTintMode(mode);
            if (i == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof C0560o) {
            ((C0560o) imageView).setSupportImageTintMode(mode);
        }
    }
}
