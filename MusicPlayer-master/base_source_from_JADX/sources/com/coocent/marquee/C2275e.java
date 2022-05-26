package com.coocent.marquee;

import android.app.Activity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.util.List;

/* renamed from: com.coocent.marquee.e */
/* compiled from: MarqueeCommonUtil */
public class C2275e {
    /* renamed from: a */
    public static void m10596a(Activity activity, InputMethodManager inputMethodManager) {
        if (activity.getCurrentFocus() != null && activity != null) {
            if (inputMethodManager == null) {
                inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            }
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
            }
        }
    }

    /* renamed from: b */
    public static final void m10597b(Activity activity, MotionEvent motionEvent, List<View> list) {
        if (motionEvent.getAction() == 0) {
            if (list != null && !list.isEmpty()) {
                int i = 0;
                while (i < list.size()) {
                    if (!m10599d(list.get(i), motionEvent)) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
            View currentFocus = activity.getCurrentFocus();
            if (m10598c(currentFocus, motionEvent)) {
                Log.d("MarqueeCommonUtil", "hideInputWhenTouchOtherView#正在隐藏软键盘#");
                InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                }
            }
        }
    }

    /* renamed from: c */
    public static final boolean m10598c(View view, MotionEvent motionEvent) {
        if (view == null || !(view instanceof EditText)) {
            return false;
        }
        return !m10599d(view, motionEvent);
    }

    /* renamed from: d */
    public static final boolean m10599d(View view, MotionEvent motionEvent) {
        if (!(view == null || motionEvent == null)) {
            int[] iArr = {0, 0};
            view.getLocationInWindow(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            int height = view.getHeight() + i2;
            int width = view.getWidth() + i;
            if (motionEvent.getRawX() <= ((float) i) || motionEvent.getRawX() >= ((float) width) || motionEvent.getRawY() <= ((float) i2) || motionEvent.getRawY() >= ((float) height)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
