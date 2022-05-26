package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.C0379b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.a */
/* compiled from: ConstraintAttribute */
public class C0424a {

    /* renamed from: a */
    private boolean f2289a = false;

    /* renamed from: b */
    String f2290b;

    /* renamed from: c */
    private C0426b f2291c;

    /* renamed from: d */
    private int f2292d;

    /* renamed from: e */
    private float f2293e;

    /* renamed from: f */
    private String f2294f;

    /* renamed from: g */
    boolean f2295g;

    /* renamed from: h */
    private int f2296h;

    /* renamed from: androidx.constraintlayout.widget.a$a */
    /* compiled from: ConstraintAttribute */
    static /* synthetic */ class C0425a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2297a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.widget.a$b[] r0 = androidx.constraintlayout.widget.C0424a.C0426b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2297a = r0
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0424a.C0426b.REFERENCE_TYPE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2297a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0424a.C0426b.BOOLEAN_TYPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2297a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0424a.C0426b.STRING_TYPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2297a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0424a.C0426b.COLOR_TYPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f2297a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0424a.C0426b.COLOR_DRAWABLE_TYPE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f2297a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0424a.C0426b.INT_TYPE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f2297a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0424a.C0426b.FLOAT_TYPE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f2297a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0424a.C0426b.DIMENSION_TYPE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0424a.C0425a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.a$b */
    /* compiled from: ConstraintAttribute */
    public enum C0426b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public C0424a(String str, C0426b bVar, Object obj, boolean z) {
        this.f2290b = str;
        this.f2291c = bVar;
        this.f2289a = z;
        mo2938l(obj);
    }

    /* renamed from: b */
    private static int m2731b(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    /* renamed from: c */
    public static HashMap<String, C0424a> m2732c(HashMap<String, C0424a> hashMap, View view) {
        HashMap<String, C0424a> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            C0424a aVar = hashMap.get(next);
            try {
                if (next.equals("BackgroundColor")) {
                    hashMap2.put(next, new C0424a(aVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    String valueOf = String.valueOf(next);
                    hashMap2.put(next, new C0424a(aVar, cls.getMethod(valueOf.length() != 0 ? "getMap".concat(valueOf) : new String("getMap"), new Class[0]).invoke(view, new Object[0])));
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return hashMap2;
    }

    /* renamed from: i */
    public static void m2733i(Context context, XmlPullParser xmlPullParser, HashMap<String, C0424a> hashMap) {
        C0426b bVar;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0439f.CustomAttribute);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        C0426b bVar2 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0439f.CustomAttribute_attributeName) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    char upperCase = Character.toUpperCase(str.charAt(0));
                    String substring = str.substring(1);
                    StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 1);
                    sb.append(upperCase);
                    sb.append(substring);
                    str = sb.toString();
                }
            } else if (index == C0439f.CustomAttribute_methodName) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == C0439f.CustomAttribute_customBoolean) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                bVar2 = C0426b.BOOLEAN_TYPE;
            } else {
                if (index == C0439f.CustomAttribute_customColorValue) {
                    bVar = C0426b.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == C0439f.CustomAttribute_customColorDrawableValue) {
                    bVar = C0426b.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == C0439f.CustomAttribute_customPixelDimension) {
                    bVar = C0426b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == C0439f.CustomAttribute_customDimension) {
                    bVar = C0426b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == C0439f.CustomAttribute_customFloatValue) {
                    bVar = C0426b.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == C0439f.CustomAttribute_customIntegerValue) {
                    bVar = C0426b.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == C0439f.CustomAttribute_customStringValue) {
                    bVar = C0426b.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == C0439f.CustomAttribute_customReference) {
                    bVar = C0426b.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                bVar2 = bVar;
                obj = obj2;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new C0424a(str, bVar2, obj, z));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: j */
    public static void m2734j(View view, HashMap<String, C0424a> hashMap) {
        String str;
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            C0424a aVar = hashMap.get(next);
            if (!aVar.f2289a) {
                String valueOf = String.valueOf(next);
                str = valueOf.length() != 0 ? "set".concat(valueOf) : new String("set");
            } else {
                str = next;
            }
            try {
                switch (C0425a.f2297a[aVar.f2291c.ordinal()]) {
                    case 1:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f2292d)});
                        break;
                    case 2:
                        cls.getMethod(str, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(aVar.f2295g)});
                        break;
                    case 3:
                        cls.getMethod(str, new Class[]{CharSequence.class}).invoke(view, new Object[]{aVar.f2294f});
                        break;
                    case 4:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f2296h)});
                        break;
                    case 5:
                        Method method = cls.getMethod(str, new Class[]{Drawable.class});
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f2296h);
                        method.invoke(view, new Object[]{colorDrawable});
                        break;
                    case 6:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f2292d)});
                        break;
                    case 7:
                        cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f2293e)});
                        break;
                    case 8:
                        cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f2293e)});
                        break;
                }
            } catch (NoSuchMethodException e) {
                Log.e("TransitionLayout", e.getMessage());
                String name = cls.getName();
                StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 34 + String.valueOf(name).length());
                sb.append(" Custom Attribute \"");
                sb.append(next);
                sb.append("\" not found on ");
                sb.append(name);
                Log.e("TransitionLayout", sb.toString());
                String name2 = cls.getName();
                StringBuilder sb2 = new StringBuilder(String.valueOf(name2).length() + 20 + String.valueOf(str).length());
                sb2.append(name2);
                sb2.append(" must have a method ");
                sb2.append(str);
                Log.e("TransitionLayout", sb2.toString());
            } catch (IllegalAccessException e2) {
                String name3 = cls.getName();
                StringBuilder sb3 = new StringBuilder(String.valueOf(next).length() + 34 + String.valueOf(name3).length());
                sb3.append(" Custom Attribute \"");
                sb3.append(next);
                sb3.append("\" not found on ");
                sb3.append(name3);
                Log.e("TransitionLayout", sb3.toString());
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                String name4 = cls.getName();
                StringBuilder sb4 = new StringBuilder(String.valueOf(next).length() + 34 + String.valueOf(name4).length());
                sb4.append(" Custom Attribute \"");
                sb4.append(next);
                sb4.append("\" not found on ");
                sb4.append(name4);
                Log.e("TransitionLayout", sb4.toString());
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo2931a(View view) {
        String str;
        Class<?> cls = view.getClass();
        String str2 = this.f2290b;
        if (!this.f2289a) {
            String valueOf = String.valueOf(str2);
            str = valueOf.length() != 0 ? "set".concat(valueOf) : new String("set");
        } else {
            str = str2;
        }
        try {
            switch (C0425a.f2297a[this.f2291c.ordinal()]) {
                case 1:
                case 6:
                    cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(this.f2292d)});
                    return;
                case 2:
                    cls.getMethod(str, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(this.f2295g)});
                    return;
                case 3:
                    cls.getMethod(str, new Class[]{CharSequence.class}).invoke(view, new Object[]{this.f2294f});
                    return;
                case 4:
                    cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(this.f2296h)});
                    return;
                case 5:
                    Method method = cls.getMethod(str, new Class[]{Drawable.class});
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.f2296h);
                    method.invoke(view, new Object[]{colorDrawable});
                    return;
                case 7:
                    cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(this.f2293e)});
                    return;
                case 8:
                    cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(this.f2293e)});
                    return;
                default:
                    return;
            }
        } catch (NoSuchMethodException e) {
            Log.e("TransitionLayout", e.getMessage());
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 34 + String.valueOf(name).length());
            sb.append(" Custom Attribute \"");
            sb.append(str2);
            sb.append("\" not found on ");
            sb.append(name);
            Log.e("TransitionLayout", sb.toString());
            String name2 = cls.getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name2).length() + 20 + String.valueOf(str).length());
            sb2.append(name2);
            sb2.append(" must have a method ");
            sb2.append(str);
            Log.e("TransitionLayout", sb2.toString());
        } catch (IllegalAccessException e2) {
            String name3 = cls.getName();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 34 + String.valueOf(name3).length());
            sb3.append(" Custom Attribute \"");
            sb3.append(str2);
            sb3.append("\" not found on ");
            sb3.append(name3);
            Log.e("TransitionLayout", sb3.toString());
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            String name4 = cls.getName();
            StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 34 + String.valueOf(name4).length());
            sb4.append(" Custom Attribute \"");
            sb4.append(str2);
            sb4.append("\" not found on ");
            sb4.append(name4);
            Log.e("TransitionLayout", sb4.toString());
            e3.printStackTrace();
        }
    }

    /* renamed from: d */
    public C0426b mo2932d() {
        return this.f2291c;
    }

    /* renamed from: e */
    public float mo2933e() {
        switch (C0425a.f2297a[this.f2291c.ordinal()]) {
            case 2:
                return this.f2295g ? 1.0f : 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return (float) this.f2292d;
            case 7:
                return this.f2293e;
            case 8:
                return this.f2293e;
            default:
                return Float.NaN;
        }
    }

    /* renamed from: f */
    public void mo2934f(float[] fArr) {
        switch (C0425a.f2297a[this.f2291c.ordinal()]) {
            case 2:
                fArr[0] = this.f2295g ? 1.0f : 0.0f;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i = this.f2296h;
                float pow = (float) Math.pow((double) (((float) ((i >> 16) & 255)) / 255.0f), 2.2d);
                float pow2 = (float) Math.pow((double) (((float) ((i >> 8) & 255)) / 255.0f), 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((double) (((float) (i & 255)) / 255.0f), 2.2d);
                fArr[3] = ((float) ((i >> 24) & 255)) / 255.0f;
                return;
            case 6:
                fArr[0] = (float) this.f2292d;
                return;
            case 7:
                fArr[0] = this.f2293e;
                return;
            case 8:
                fArr[0] = this.f2293e;
                return;
            default:
                return;
        }
    }

    /* renamed from: g */
    public boolean mo2935g() {
        int i = C0425a.f2297a[this.f2291c.ordinal()];
        return (i == 1 || i == 2 || i == 3) ? false : true;
    }

    /* renamed from: h */
    public int mo2936h() {
        int i = C0425a.f2297a[this.f2291c.ordinal()];
        return (i == 4 || i == 5) ? 4 : 1;
    }

    /* renamed from: k */
    public void mo2937k(View view, float[] fArr) {
        View view2 = view;
        Class<?> cls = view.getClass();
        String valueOf = String.valueOf(this.f2290b);
        String concat = valueOf.length() != 0 ? "set".concat(valueOf) : new String("set");
        try {
            switch (C0425a.f2297a[this.f2291c.ordinal()]) {
                case 2:
                    Method method = cls.getMethod(concat, new Class[]{Boolean.TYPE});
                    Object[] objArr = new Object[1];
                    objArr[0] = Boolean.valueOf(fArr[0] > 0.5f);
                    method.invoke(view2, objArr);
                    return;
                case 3:
                    String valueOf2 = String.valueOf(this.f2290b);
                    throw new RuntimeException(valueOf2.length() != 0 ? "unable to interpolate strings ".concat(valueOf2) : new String("unable to interpolate strings "));
                case 4:
                    cls.getMethod(concat, new Class[]{Integer.TYPE}).invoke(view2, new Object[]{Integer.valueOf((m2731b((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m2731b((int) (fArr[3] * 255.0f)) << 24) | (m2731b((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m2731b((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f)))});
                    return;
                case 5:
                    Method method2 = cls.getMethod(concat, new Class[]{Drawable.class});
                    int b = m2731b((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f));
                    int b2 = m2731b((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor((b << 16) | (m2731b((int) (fArr[3] * 255.0f)) << 24) | (b2 << 8) | m2731b((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f)));
                    method2.invoke(view2, new Object[]{colorDrawable});
                    return;
                case 6:
                    cls.getMethod(concat, new Class[]{Integer.TYPE}).invoke(view2, new Object[]{Integer.valueOf((int) fArr[0])});
                    return;
                case 7:
                    cls.getMethod(concat, new Class[]{Float.TYPE}).invoke(view2, new Object[]{Float.valueOf(fArr[0])});
                    return;
                case 8:
                    cls.getMethod(concat, new Class[]{Float.TYPE}).invoke(view2, new Object[]{Float.valueOf(fArr[0])});
                    return;
                default:
                    return;
            }
        } catch (NoSuchMethodException e) {
            String d = C0379b.m2242d(view);
            StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 21 + String.valueOf(d).length());
            sb.append("no method ");
            sb.append(concat);
            sb.append(" on View \"");
            sb.append(d);
            sb.append("\"");
            Log.e("TransitionLayout", sb.toString());
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            String d2 = C0379b.m2242d(view);
            StringBuilder sb2 = new StringBuilder(String.valueOf(concat).length() + 32 + String.valueOf(d2).length());
            sb2.append("cannot access method ");
            sb2.append(concat);
            sb2.append(" on View \"");
            sb2.append(d2);
            sb2.append("\"");
            Log.e("TransitionLayout", sb2.toString());
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    /* renamed from: l */
    public void mo2938l(Object obj) {
        switch (C0425a.f2297a[this.f2291c.ordinal()]) {
            case 1:
            case 6:
                this.f2292d = ((Integer) obj).intValue();
                return;
            case 2:
                this.f2295g = ((Boolean) obj).booleanValue();
                return;
            case 3:
                this.f2294f = (String) obj;
                return;
            case 4:
            case 5:
                this.f2296h = ((Integer) obj).intValue();
                return;
            case 7:
                this.f2293e = ((Float) obj).floatValue();
                return;
            case 8:
                this.f2293e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public C0424a(C0424a aVar, Object obj) {
        this.f2290b = aVar.f2290b;
        this.f2291c = aVar.f2291c;
        mo2938l(obj);
    }
}
