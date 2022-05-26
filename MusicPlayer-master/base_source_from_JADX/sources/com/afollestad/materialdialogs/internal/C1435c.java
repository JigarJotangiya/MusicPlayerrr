package com.afollestad.materialdialogs.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.C0506a;
import androidx.core.graphics.drawable.C0534a;
import java.lang.reflect.Field;
import p159f.p160a.p161a.C4284g;
import p159f.p160a.p161a.C4287j;
import p159f.p160a.p161a.p163r.C4297a;

@SuppressLint({"PrivateResource"})
/* renamed from: com.afollestad.materialdialogs.internal.c */
/* compiled from: MDTintHelper */
public class C1435c {
    /* renamed from: a */
    private static ColorStateList m7533a(Context context, int i) {
        int i2 = C4284g.colorControlNormal;
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842919, -16842908}, new int[0]}, new int[]{C4297a.m18798l(context, i2), C4297a.m18798l(context, i2), i});
    }

    /* renamed from: b */
    private static void m7534b(EditText editText, int i) {
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable[] drawableArr = {C0506a.m3152d(editText.getContext(), i2), C0506a.m3152d(editText.getContext(), i2)};
            drawableArr[0].setColorFilter(i, PorterDuff.Mode.SRC_IN);
            drawableArr[1].setColorFilter(i, PorterDuff.Mode.SRC_IN);
            declaredField3.set(obj, drawableArr);
        } catch (NoSuchFieldException e) {
            Log.d("MDTintHelper", "Device issue with cursor tinting: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m7535c(CheckBox checkBox, int i) {
        int d = C4297a.m18790d(checkBox.getContext());
        m7536d(checkBox, new ColorStateList(new int[][]{new int[]{16842910, -16842912}, new int[]{16842910, 16842912}, new int[]{-16842910, -16842912}, new int[]{-16842910, 16842912}}, new int[]{C4297a.m18798l(checkBox.getContext(), C4284g.colorControlNormal), i, d, d}));
    }

    /* renamed from: d */
    public static void m7536d(CheckBox checkBox, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 22) {
            checkBox.setButtonTintList(colorStateList);
            return;
        }
        Drawable r = C0534a.m3292r(C0506a.m3152d(checkBox.getContext(), C4287j.abc_btn_check_material));
        C0534a.m3289o(r, colorStateList);
        checkBox.setButtonDrawable(r);
    }

    /* renamed from: e */
    public static void m7537e(EditText editText, int i) {
        ColorStateList a = m7533a(editText.getContext(), i);
        if (editText instanceof AppCompatEditText) {
            ((AppCompatEditText) editText).setSupportBackgroundTintList(a);
        } else if (Build.VERSION.SDK_INT >= 21) {
            editText.setBackgroundTintList(a);
        }
        m7534b(editText, i);
    }

    /* renamed from: f */
    public static void m7538f(ProgressBar progressBar, int i) {
        m7539g(progressBar, i, false);
    }

    /* renamed from: g */
    private static void m7539g(ProgressBar progressBar, int i, boolean z) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            progressBar.setProgressTintList(valueOf);
            progressBar.setSecondaryProgressTintList(valueOf);
            if (!z) {
                progressBar.setIndeterminateTintList(valueOf);
                return;
            }
            return;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i2 <= 10) {
            mode = PorterDuff.Mode.MULTIPLY;
        }
        if (!z && progressBar.getIndeterminateDrawable() != null) {
            progressBar.getIndeterminateDrawable().setColorFilter(i, mode);
        }
        if (progressBar.getProgressDrawable() != null) {
            progressBar.getProgressDrawable().setColorFilter(i, mode);
        }
    }

    /* renamed from: h */
    public static void m7540h(RadioButton radioButton, int i) {
        int d = C4297a.m18790d(radioButton.getContext());
        m7541i(radioButton, new ColorStateList(new int[][]{new int[]{16842910, -16842912}, new int[]{16842910, 16842912}, new int[]{-16842910, -16842912}, new int[]{-16842910, 16842912}}, new int[]{C4297a.m18798l(radioButton.getContext(), C4284g.colorControlNormal), i, d, d}));
    }

    /* renamed from: i */
    public static void m7541i(RadioButton radioButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 22) {
            radioButton.setButtonTintList(colorStateList);
            return;
        }
        Drawable r = C0534a.m3292r(C0506a.m3152d(radioButton.getContext(), C4287j.abc_btn_radio_material));
        C0534a.m3289o(r, colorStateList);
        radioButton.setButtonDrawable(r);
    }
}
