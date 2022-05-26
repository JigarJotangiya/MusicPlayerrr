package com.coocent.marquee;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0534a;

/* renamed from: com.coocent.marquee.d */
/* compiled from: MarqueeColorUtils */
public class C2274d {
    /* renamed from: a */
    public static Bitmap m10589a(Drawable drawable) {
        Bitmap.Config config;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (drawable.getOpacity() != -1) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.RGB_565;
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* renamed from: b */
    public static int m10590b(String str) {
        if (!str.contains("#")) {
            str = "#" + str;
        }
        return Color.parseColor(str);
    }

    /* renamed from: c */
    public static String m10591c(int i) {
        return m10593e(m10592d(i));
    }

    /* renamed from: d */
    public static int[] m10592d(int i) {
        int[] iArr = {0, 0, 0};
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        iArr[0] = red;
        iArr[1] = green;
        iArr[2] = blue;
        return iArr;
    }

    /* renamed from: e */
    public static String m10593e(int[] iArr) {
        int[] iArr2 = iArr;
        String str = "#";
        for (int i : iArr2) {
            if (i < 0) {
                i = 0;
            } else if (i > 255) {
                i = 255;
            }
            String[] strArr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
            str = str + strArr[i / 16] + strArr[i % 16];
        }
        return str;
    }

    /* renamed from: f */
    public static Bitmap m10594f(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    /* renamed from: g */
    public static Drawable m10595g(Drawable drawable, ColorStateList colorStateList) {
        Drawable r = C0534a.m3292r(drawable);
        C0534a.m3289o(r, colorStateList);
        return r;
    }
}
