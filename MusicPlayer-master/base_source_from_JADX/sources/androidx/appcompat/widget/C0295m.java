package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p082e.p083a.C3409j;
import p082e.p109h.p119p.C3774v;

/* renamed from: androidx.appcompat.widget.m */
/* compiled from: AppCompatTextViewAutoSizeHelper */
class C0295m {

    /* renamed from: l */
    private static final RectF f1372l = new RectF();

    /* renamed from: m */
    private static ConcurrentHashMap<String, Method> f1373m = new ConcurrentHashMap<>();

    /* renamed from: n */
    private static ConcurrentHashMap<String, Field> f1374n = new ConcurrentHashMap<>();

    /* renamed from: a */
    private int f1375a = 0;

    /* renamed from: b */
    private boolean f1376b = false;

    /* renamed from: c */
    private float f1377c = -1.0f;

    /* renamed from: d */
    private float f1378d = -1.0f;

    /* renamed from: e */
    private float f1379e = -1.0f;

    /* renamed from: f */
    private int[] f1380f = new int[0];

    /* renamed from: g */
    private boolean f1381g = false;

    /* renamed from: h */
    private TextPaint f1382h;

    /* renamed from: i */
    private final TextView f1383i;

    /* renamed from: j */
    private final Context f1384j;

    /* renamed from: k */
    private final C0298c f1385k;

    /* renamed from: androidx.appcompat.widget.m$a */
    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static class C0296a extends C0298c {
        C0296a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2102a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0295m.m1770r(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: androidx.appcompat.widget.m$b */
    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static class C0297b extends C0296a {
        C0297b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2102a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo2103b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* renamed from: androidx.appcompat.widget.m$c */
    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static class C0298c {
        C0298c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2102a(StaticLayout.Builder builder, TextView textView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo2103b(TextView textView) {
            return ((Boolean) C0295m.m1770r(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    C0295m(TextView textView) {
        this.f1383i = textView;
        this.f1384j = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            this.f1385k = new C0297b();
        } else if (i >= 23) {
            this.f1385k = new C0296a();
        } else {
            this.f1385k = new C0298c();
        }
    }

    /* renamed from: A */
    private void m1756A(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f1380f = m1762c(iArr);
            m1757B();
        }
    }

    /* renamed from: B */
    private boolean m1757B() {
        int[] iArr = this.f1380f;
        int length = iArr.length;
        boolean z = length > 0;
        this.f1381g = z;
        if (z) {
            this.f1375a = 1;
            this.f1378d = (float) iArr[0];
            this.f1379e = (float) iArr[length - 1];
            this.f1377c = -1.0f;
        }
        return z;
    }

    /* renamed from: C */
    private boolean m1758C(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1383i.getText();
        TransformationMethod transformationMethod = this.f1383i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f1383i)) == null)) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f1383i.getMaxLines() : -1;
        mo2095q(i);
        StaticLayout e = mo2089e(text, (Layout.Alignment) m1770r(this.f1383i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (e.getLineCount() <= maxLines && e.getLineEnd(e.getLineCount() - 1) == text.length())) && ((float) e.getHeight()) <= rectF.bottom;
    }

    /* renamed from: D */
    private boolean m1759D() {
        return !(this.f1383i instanceof AppCompatEditText);
    }

    /* renamed from: E */
    private void m1760E(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f1375a = 1;
            this.f1378d = f;
            this.f1379e = f2;
            this.f1377c = f3;
            this.f1381g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }

    /* renamed from: a */
    private static <T> T m1761a(Object obj, String str, T t) {
        try {
            Field o = m1768o(str);
            if (o == null) {
                return t;
            }
            return o.get(obj);
        } catch (IllegalAccessException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return t;
        }
    }

    /* renamed from: c */
    private int[] m1762c(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: d */
    private void m1763d() {
        this.f1375a = 0;
        this.f1378d = -1.0f;
        this.f1379e = -1.0f;
        this.f1377c = -1.0f;
        this.f1380f = new int[0];
        this.f1376b = false;
    }

    /* renamed from: f */
    private StaticLayout m1764f(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1382h, i);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f1383i.getLineSpacingExtra(), this.f1383i.getLineSpacingMultiplier()).setIncludePad(this.f1383i.getIncludeFontPadding()).setBreakStrategy(this.f1383i.getBreakStrategy()).setHyphenationFrequency(this.f1383i.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            this.f1385k.mo2102a(obtain, this.f1383i);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    /* renamed from: g */
    private StaticLayout m1765g(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f1382h, i, alignment, ((Float) m1761a(this.f1383i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) m1761a(this.f1383i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) m1761a(this.f1383i, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    /* renamed from: h */
    private StaticLayout m1766h(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f1382h, i, alignment, this.f1383i.getLineSpacingMultiplier(), this.f1383i.getLineSpacingExtra(), this.f1383i.getIncludeFontPadding());
    }

    /* renamed from: i */
    private int m1767i(RectF rectF) {
        int length = this.f1380f.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m1758C(this.f1380f[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f1380f[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: o */
    private static Field m1768o(String str) {
        try {
            Field field = f1374n.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f1374n.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return null;
        }
    }

    /* renamed from: p */
    private static Method m1769p(String str) {
        try {
            Method method = f1373m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1373m.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: r */
    static <T> T m1770r(Object obj, String str, T t) {
        try {
            return m1769p(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: x */
    private void m1771x(float f) {
        if (f != this.f1383i.getPaint().getTextSize()) {
            this.f1383i.getPaint().setTextSize(f);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f1383i.isInLayout() : false;
            if (this.f1383i.getLayout() != null) {
                this.f1376b = false;
                try {
                    Method p = m1769p("nullLayouts");
                    if (p != null) {
                        p.invoke(this.f1383i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f1383i.requestLayout();
                } else {
                    this.f1383i.forceLayout();
                }
                this.f1383i.invalidate();
            }
        }
    }

    /* renamed from: z */
    private boolean m1772z() {
        if (!m1759D() || this.f1375a != 1) {
            this.f1376b = false;
        } else {
            if (!this.f1381g || this.f1380f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f1379e - this.f1378d) / this.f1377c))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f1378d + (((float) i) * this.f1377c));
                }
                this.f1380f = m1762c(iArr);
            }
            this.f1376b = true;
        }
        return this.f1376b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2088b() {
        int i;
        if (mo2096s()) {
            if (this.f1376b) {
                if (this.f1383i.getMeasuredHeight() > 0 && this.f1383i.getMeasuredWidth() > 0) {
                    if (this.f1385k.mo2103b(this.f1383i)) {
                        i = 1048576;
                    } else {
                        i = (this.f1383i.getMeasuredWidth() - this.f1383i.getTotalPaddingLeft()) - this.f1383i.getTotalPaddingRight();
                    }
                    int height = (this.f1383i.getHeight() - this.f1383i.getCompoundPaddingBottom()) - this.f1383i.getCompoundPaddingTop();
                    if (i > 0 && height > 0) {
                        RectF rectF = f1372l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) i;
                            rectF.bottom = (float) height;
                            float i2 = (float) m1767i(rectF);
                            if (i2 != this.f1383i.getTextSize()) {
                                mo2101y(0, i2);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1376b = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public StaticLayout mo2089e(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            return m1764f(charSequence, alignment, i, i2);
        }
        if (i3 >= 16) {
            return m1766h(charSequence, alignment, i);
        }
        return m1765g(charSequence, alignment, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo2090j() {
        return Math.round(this.f1379e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo2091k() {
        return Math.round(this.f1378d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo2092l() {
        return Math.round(this.f1377c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int[] mo2093m() {
        return this.f1380f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo2094n() {
        return this.f1375a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo2095q(int i) {
        TextPaint textPaint = this.f1382h;
        if (textPaint == null) {
            this.f1382h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1382h.set(this.f1383i.getPaint());
        this.f1382h.setTextSize((float) i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo2096s() {
        return m1759D() && this.f1375a != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo2097t(AttributeSet attributeSet, int i) {
        int resourceId;
        Context context = this.f1384j;
        int[] iArr = C3409j.AppCompatTextView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView = this.f1383i;
        C3774v.m16213m0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i2 = C3409j.AppCompatTextView_autoSizeTextType;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f1375a = obtainStyledAttributes.getInt(i2, 0);
        }
        int i3 = C3409j.AppCompatTextView_autoSizeStepGranularity;
        float dimension = obtainStyledAttributes.hasValue(i3) ? obtainStyledAttributes.getDimension(i3, -1.0f) : -1.0f;
        int i4 = C3409j.AppCompatTextView_autoSizeMinTextSize;
        float dimension2 = obtainStyledAttributes.hasValue(i4) ? obtainStyledAttributes.getDimension(i4, -1.0f) : -1.0f;
        int i5 = C3409j.AppCompatTextView_autoSizeMaxTextSize;
        float dimension3 = obtainStyledAttributes.hasValue(i5) ? obtainStyledAttributes.getDimension(i5, -1.0f) : -1.0f;
        int i6 = C3409j.AppCompatTextView_autoSizePresetSizes;
        if (obtainStyledAttributes.hasValue(i6) && (resourceId = obtainStyledAttributes.getResourceId(i6, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m1756A(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m1759D()) {
            this.f1375a = 0;
        } else if (this.f1375a == 1) {
            if (!this.f1381g) {
                DisplayMetrics displayMetrics = this.f1384j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m1760E(dimension2, dimension3, dimension);
            }
            m1772z();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo2098u(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (m1759D()) {
            DisplayMetrics displayMetrics = this.f1384j.getResources().getDisplayMetrics();
            m1760E(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m1772z()) {
                mo2088b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo2099v(int[] iArr, int i) throws IllegalArgumentException {
        if (m1759D()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1384j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f1380f = m1762c(iArr2);
                if (!m1757B()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1381g = false;
            }
            if (m1772z()) {
                mo2088b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo2100w(int i) {
        if (!m1759D()) {
            return;
        }
        if (i == 0) {
            m1763d();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.f1384j.getResources().getDisplayMetrics();
            m1760E(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m1772z()) {
                mo2088b();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo2101y(int i, float f) {
        Resources resources;
        Context context = this.f1384j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        m1771x(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }
}
