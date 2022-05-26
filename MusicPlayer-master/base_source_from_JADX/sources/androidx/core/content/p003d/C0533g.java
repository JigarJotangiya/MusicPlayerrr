package androidx.core.content.p003d;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.core.content.d.g */
/* compiled from: TypedArrayUtils */
public class C0533g {
    /* renamed from: a */
    public static boolean m3242a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        if (!m3251j(xmlPullParser, str)) {
            return z;
        }
        return typedArray.getBoolean(i, z);
    }

    /* renamed from: b */
    public static int m3243b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m3251j(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getColor(i, i2);
    }

    /* renamed from: c */
    public static ColorStateList m3244c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (!m3251j(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
        } else if (i2 < 28 || i2 > 31) {
            return C0514a.m3177d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
        } else {
            return m3245d(typedValue);
        }
    }

    /* renamed from: d */
    private static ColorStateList m3245d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: e */
    public static C0515b m3246e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (m3251j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C0515b.m3183b(typedValue.data);
            }
            C0515b g = C0515b.m3186g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (g != null) {
                return g;
            }
        }
        return C0515b.m3183b(i2);
    }

    /* renamed from: f */
    public static float m3247f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        if (!m3251j(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    /* renamed from: g */
    public static int m3248g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m3251j(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    /* renamed from: h */
    public static int m3249h(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m3251j(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getResourceId(i, i2);
    }

    /* renamed from: i */
    public static String m3250i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m3251j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: j */
    public static boolean m3251j(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: k */
    public static TypedArray m3252k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: l */
    public static TypedValue m3253l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m3251j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }
}
