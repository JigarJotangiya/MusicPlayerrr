package com.afollestad.materialdialogs.prefs;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import java.lang.reflect.Method;
import p159f.p160a.p161a.p162q.C4295b;
import p159f.p160a.p161a.p162q.C4296c;

/* renamed from: com.afollestad.materialdialogs.prefs.a */
/* compiled from: PrefUtil */
class C1451a {
    /* renamed from: a */
    static void m7564a(Preference preference, PreferenceManager.OnActivityDestroyListener onActivityDestroyListener) {
        try {
            PreferenceManager preferenceManager = preference.getPreferenceManager();
            Method declaredMethod = preferenceManager.getClass().getDeclaredMethod("registerOnActivityDestroyListener", new Class[]{PreferenceManager.OnActivityDestroyListener.class});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(preferenceManager, new Object[]{onActivityDestroyListener});
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    static void m7565b(Context context, Preference preference, AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (attributeSet != null) {
            int i = 0;
            while (true) {
                if (i < attributeSet.getAttributeCount()) {
                    if (((XmlResourceParser) attributeSet).getAttributeNamespace(0).equals("http://schemas.android.com/apk/res/android") && attributeSet.getAttributeName(i).equals("layout")) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        z = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C4296c.Preference, 0, 0);
            try {
                z2 = obtainStyledAttributes.getBoolean(C4296c.Preference_useStockLayout, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        if (!z && !z2) {
            preference.setLayoutResource(C4295b.md_preference_custom);
        }
    }

    /* renamed from: c */
    static void m7566c(Preference preference, PreferenceManager.OnActivityDestroyListener onActivityDestroyListener) {
        try {
            PreferenceManager preferenceManager = preference.getPreferenceManager();
            Method declaredMethod = preferenceManager.getClass().getDeclaredMethod("unregisterOnActivityDestroyListener", new Class[]{PreferenceManager.OnActivityDestroyListener.class});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(preferenceManager, new Object[]{onActivityDestroyListener});
        } catch (Exception unused) {
        }
    }
}
