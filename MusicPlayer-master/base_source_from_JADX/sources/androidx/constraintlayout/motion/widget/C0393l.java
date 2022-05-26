package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.C0424a;
import androidx.constraintlayout.widget.C0439f;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import p082e.p099f.p106b.p107a.C3580c;

/* renamed from: androidx.constraintlayout.motion.widget.l */
/* compiled from: KeyTrigger */
public class C0393l extends C0382e {

    /* renamed from: A */
    HashMap<String, Method> f1818A;

    /* renamed from: g */
    private int f1819g = -1;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f1820h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f1821i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f1822j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f1823k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f1824l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f1825m;

    /* renamed from: n */
    private View f1826n;

    /* renamed from: o */
    float f1827o;

    /* renamed from: p */
    private boolean f1828p;

    /* renamed from: q */
    private boolean f1829q;

    /* renamed from: r */
    private boolean f1830r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public float f1831s;

    /* renamed from: t */
    private float f1832t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f1833u;

    /* renamed from: v */
    int f1834v;

    /* renamed from: w */
    int f1835w;

    /* renamed from: x */
    int f1836x;

    /* renamed from: y */
    RectF f1837y;

    /* renamed from: z */
    RectF f1838z;

    /* renamed from: androidx.constraintlayout.motion.widget.l$a */
    /* compiled from: KeyTrigger */
    private static class C0394a {

        /* renamed from: a */
        private static SparseIntArray f1839a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1839a = sparseIntArray;
            sparseIntArray.append(C0439f.KeyTrigger_framePosition, 8);
            f1839a.append(C0439f.KeyTrigger_onCross, 4);
            f1839a.append(C0439f.KeyTrigger_onNegativeCross, 1);
            f1839a.append(C0439f.KeyTrigger_onPositiveCross, 2);
            f1839a.append(C0439f.KeyTrigger_motionTarget, 7);
            f1839a.append(C0439f.KeyTrigger_triggerId, 6);
            f1839a.append(C0439f.KeyTrigger_triggerSlack, 5);
            f1839a.append(C0439f.KeyTrigger_motion_triggerOnCollision, 9);
            f1839a.append(C0439f.KeyTrigger_motion_postLayoutCollision, 10);
            f1839a.append(C0439f.KeyTrigger_triggerReceiver, 11);
            f1839a.append(C0439f.KeyTrigger_viewTransitionOnCross, 12);
            f1839a.append(C0439f.KeyTrigger_viewTransitionOnNegativeCross, 13);
            f1839a.append(C0439f.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }

        /* renamed from: a */
        public static void m2421a(C0393l lVar, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f1839a.get(index)) {
                    case 1:
                        String unused = lVar.f1822j = typedArray.getString(index);
                        break;
                    case 2:
                        String unused2 = lVar.f1823k = typedArray.getString(index);
                        break;
                    case 4:
                        String unused3 = lVar.f1820h = typedArray.getString(index);
                        break;
                    case 5:
                        lVar.f1827o = typedArray.getFloat(index, lVar.f1827o);
                        break;
                    case 6:
                        int unused4 = lVar.f1824l = typedArray.getResourceId(index, lVar.f1824l);
                        break;
                    case 7:
                        if (!MotionLayout.f1622Y0) {
                            if (typedArray.peekValue(index).type != 3) {
                                lVar.f1740b = typedArray.getResourceId(index, lVar.f1740b);
                                break;
                            } else {
                                lVar.f1741c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, lVar.f1740b);
                            lVar.f1740b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                lVar.f1741c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 8:
                        int integer = typedArray.getInteger(index, lVar.f1739a);
                        lVar.f1739a = integer;
                        float unused5 = lVar.f1831s = (((float) integer) + 0.5f) / 100.0f;
                        break;
                    case 9:
                        int unused6 = lVar.f1825m = typedArray.getResourceId(index, lVar.f1825m);
                        break;
                    case 10:
                        boolean unused7 = lVar.f1833u = typedArray.getBoolean(index, lVar.f1833u);
                        break;
                    case 11:
                        int unused8 = lVar.f1821i = typedArray.getResourceId(index, lVar.f1821i);
                        break;
                    case 12:
                        lVar.f1836x = typedArray.getResourceId(index, lVar.f1836x);
                        break;
                    case 13:
                        lVar.f1834v = typedArray.getResourceId(index, lVar.f1834v);
                        break;
                    case 14:
                        lVar.f1835w = typedArray.getResourceId(index, lVar.f1835w);
                        break;
                    default:
                        String hexString = Integer.toHexString(index);
                        int i2 = f1839a.get(index);
                        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 33);
                        sb.append("unused attribute 0x");
                        sb.append(hexString);
                        sb.append("   ");
                        sb.append(i2);
                        Log.e("KeyTrigger", sb.toString());
                        break;
                }
            }
        }
    }

    public C0393l() {
        int i = C0382e.f1738f;
        this.f1821i = i;
        this.f1822j = null;
        this.f1823k = null;
        this.f1824l = i;
        this.f1825m = i;
        this.f1826n = null;
        this.f1827o = 0.1f;
        this.f1828p = true;
        this.f1829q = true;
        this.f1830r = true;
        this.f1831s = Float.NaN;
        this.f1833u = false;
        this.f1834v = i;
        this.f1835w = i;
        this.f1836x = i;
        this.f1837y = new RectF();
        this.f1838z = new RectF();
        this.f1818A = new HashMap<>();
        this.f1742d = 5;
        this.f1743e = new HashMap<>();
    }

    /* renamed from: A */
    private void m2400A(String str, View view) {
        C0424a aVar;
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String next : this.f1743e.keySet()) {
            String lowerCase = next.toLowerCase(Locale.ROOT);
            if ((z || lowerCase.matches(str)) && (aVar = this.f1743e.get(next)) != null) {
                aVar.mo2931a(view);
            }
        }
    }

    /* renamed from: B */
    private void m2401B(RectF rectF, View view, boolean z) {
        rectF.top = (float) view.getTop();
        rectF.bottom = (float) view.getBottom();
        rectF.left = (float) view.getLeft();
        rectF.right = (float) view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    /* renamed from: z */
    private void m2414z(String str, View view) {
        Method method;
        if (str != null) {
            if (str.startsWith(".")) {
                m2400A(str, view);
                return;
            }
            if (this.f1818A.containsKey(str)) {
                method = this.f1818A.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, new Class[0]);
                    this.f1818A.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.f1818A.put(str, (Object) null);
                    String simpleName = view.getClass().getSimpleName();
                    String d = C0379b.m2242d(view);
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(simpleName).length() + String.valueOf(d).length());
                    sb.append("Could not find method \"");
                    sb.append(str);
                    sb.append("\"on class ");
                    sb.append(simpleName);
                    sb.append(" ");
                    sb.append(d);
                    Log.e("KeyTrigger", sb.toString());
                    return;
                }
            }
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception unused2) {
                String str2 = this.f1820h;
                String simpleName2 = view.getClass().getSimpleName();
                String d2 = C0379b.m2242d(view);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 30 + String.valueOf(simpleName2).length() + String.valueOf(d2).length());
                sb2.append("Exception in call \"");
                sb2.append(str2);
                sb2.append("\"on class ");
                sb2.append(simpleName2);
                sb2.append(" ");
                sb2.append(d2);
                Log.e("KeyTrigger", sb2.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo2539a(HashMap<String, C3580c> hashMap) {
    }

    /* renamed from: b */
    public C0382e clone() {
        C0393l lVar = new C0393l();
        lVar.mo2541c(this);
        return lVar;
    }

    /* renamed from: c */
    public C0382e mo2541c(C0382e eVar) {
        super.mo2541c(eVar);
        C0393l lVar = (C0393l) eVar;
        this.f1819g = lVar.f1819g;
        this.f1820h = lVar.f1820h;
        this.f1821i = lVar.f1821i;
        this.f1822j = lVar.f1822j;
        this.f1823k = lVar.f1823k;
        this.f1824l = lVar.f1824l;
        this.f1825m = lVar.f1825m;
        this.f1826n = lVar.f1826n;
        this.f1827o = lVar.f1827o;
        this.f1828p = lVar.f1828p;
        this.f1829q = lVar.f1829q;
        this.f1830r = lVar.f1830r;
        this.f1831s = lVar.f1831s;
        this.f1832t = lVar.f1832t;
        this.f1833u = lVar.f1833u;
        this.f1837y = lVar.f1837y;
        this.f1838z = lVar.f1838z;
        this.f1818A = lVar.f1818A;
        return this;
    }

    /* renamed from: d */
    public void mo2543d(HashSet<String> hashSet) {
    }

    /* renamed from: e */
    public void mo2544e(Context context, AttributeSet attributeSet) {
        C0394a.m2421a(this, context.obtainStyledAttributes(attributeSet, C0439f.KeyTrigger), context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2562y(float r10, android.view.View r11) {
        /*
            r9 = this;
            int r0 = r9.f1825m
            int r1 = androidx.constraintlayout.motion.widget.C0382e.f1738f
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x0062
            android.view.View r0 = r9.f1826n
            if (r0 != 0) goto L_0x001a
            android.view.ViewParent r0 = r11.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r9.f1825m
            android.view.View r0 = r0.findViewById(r1)
            r9.f1826n = r0
        L_0x001a:
            android.graphics.RectF r0 = r9.f1837y
            android.view.View r1 = r9.f1826n
            boolean r4 = r9.f1833u
            r9.m2401B(r0, r1, r4)
            android.graphics.RectF r0 = r9.f1838z
            boolean r1 = r9.f1833u
            r9.m2401B(r0, r11, r1)
            android.graphics.RectF r0 = r9.f1837y
            android.graphics.RectF r1 = r9.f1838z
            boolean r0 = r0.intersect(r1)
            if (r0 == 0) goto L_0x004c
            boolean r0 = r9.f1828p
            if (r0 == 0) goto L_0x003c
            r9.f1828p = r2
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            boolean r1 = r9.f1830r
            if (r1 == 0) goto L_0x0045
            r9.f1830r = r2
            r1 = 1
            goto L_0x0046
        L_0x0045:
            r1 = 0
        L_0x0046:
            r9.f1829q = r3
            r4 = r1
            r1 = 0
            goto L_0x00e3
        L_0x004c:
            boolean r0 = r9.f1828p
            if (r0 != 0) goto L_0x0054
            r9.f1828p = r3
            r0 = 1
            goto L_0x0055
        L_0x0054:
            r0 = 0
        L_0x0055:
            boolean r1 = r9.f1829q
            if (r1 == 0) goto L_0x005d
            r9.f1829q = r2
            r1 = 1
            goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            r9.f1830r = r3
            goto L_0x00e2
        L_0x0062:
            boolean r0 = r9.f1828p
            r1 = 0
            if (r0 == 0) goto L_0x0078
            float r0 = r9.f1831s
            float r4 = r10 - r0
            float r5 = r9.f1832t
            float r5 = r5 - r0
            float r4 = r4 * r5
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0088
            r9.f1828p = r2
            r0 = 1
            goto L_0x0089
        L_0x0078:
            float r0 = r9.f1831s
            float r0 = r10 - r0
            float r0 = java.lang.Math.abs(r0)
            float r4 = r9.f1827o
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0088
            r9.f1828p = r3
        L_0x0088:
            r0 = 0
        L_0x0089:
            boolean r4 = r9.f1829q
            if (r4 == 0) goto L_0x00a2
            float r4 = r9.f1831s
            float r5 = r10 - r4
            float r6 = r9.f1832t
            float r6 = r6 - r4
            float r6 = r6 * r5
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b2
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b2
            r9.f1829q = r2
            r4 = 1
            goto L_0x00b3
        L_0x00a2:
            float r4 = r9.f1831s
            float r4 = r10 - r4
            float r4 = java.lang.Math.abs(r4)
            float r5 = r9.f1827o
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b2
            r9.f1829q = r3
        L_0x00b2:
            r4 = 0
        L_0x00b3:
            boolean r5 = r9.f1830r
            if (r5 == 0) goto L_0x00d1
            float r5 = r9.f1831s
            float r6 = r10 - r5
            float r7 = r9.f1832t
            float r7 = r7 - r5
            float r7 = r7 * r6
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x00cc
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00cc
            r9.f1830r = r2
            r1 = 1
            goto L_0x00cd
        L_0x00cc:
            r1 = 0
        L_0x00cd:
            r8 = r4
            r4 = r1
            r1 = r8
            goto L_0x00e3
        L_0x00d1:
            float r1 = r9.f1831s
            float r1 = r10 - r1
            float r1 = java.lang.Math.abs(r1)
            float r5 = r9.f1827o
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00e1
            r9.f1830r = r3
        L_0x00e1:
            r1 = r4
        L_0x00e2:
            r4 = 0
        L_0x00e3:
            r9.f1832t = r10
            if (r1 != 0) goto L_0x00eb
            if (r0 != 0) goto L_0x00eb
            if (r4 == 0) goto L_0x00f6
        L_0x00eb:
            android.view.ViewParent r5 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r5 = (androidx.constraintlayout.motion.widget.MotionLayout) r5
            int r6 = r9.f1824l
            r5.mo2469k0(r6, r4, r10)
        L_0x00f6:
            int r10 = r9.f1821i
            int r5 = androidx.constraintlayout.motion.widget.C0382e.f1738f
            if (r10 != r5) goto L_0x00fe
            r10 = r11
            goto L_0x010a
        L_0x00fe:
            android.view.ViewParent r10 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r10 = (androidx.constraintlayout.motion.widget.MotionLayout) r10
            int r5 = r9.f1821i
            android.view.View r10 = r10.findViewById(r5)
        L_0x010a:
            if (r1 == 0) goto L_0x0128
            java.lang.String r1 = r9.f1822j
            if (r1 == 0) goto L_0x0113
            r9.m2414z(r1, r10)
        L_0x0113:
            int r1 = r9.f1834v
            int r5 = androidx.constraintlayout.motion.widget.C0382e.f1738f
            if (r1 == r5) goto L_0x0128
            android.view.ViewParent r1 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r1 = (androidx.constraintlayout.motion.widget.MotionLayout) r1
            int r5 = r9.f1834v
            android.view.View[] r6 = new android.view.View[r3]
            r6[r2] = r10
            r1.mo2448M0(r5, r6)
        L_0x0128:
            if (r4 == 0) goto L_0x0146
            java.lang.String r1 = r9.f1823k
            if (r1 == 0) goto L_0x0131
            r9.m2414z(r1, r10)
        L_0x0131:
            int r1 = r9.f1835w
            int r4 = androidx.constraintlayout.motion.widget.C0382e.f1738f
            if (r1 == r4) goto L_0x0146
            android.view.ViewParent r1 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r1 = (androidx.constraintlayout.motion.widget.MotionLayout) r1
            int r4 = r9.f1835w
            android.view.View[] r5 = new android.view.View[r3]
            r5[r2] = r10
            r1.mo2448M0(r4, r5)
        L_0x0146:
            if (r0 == 0) goto L_0x0164
            java.lang.String r0 = r9.f1820h
            if (r0 == 0) goto L_0x014f
            r9.m2414z(r0, r10)
        L_0x014f:
            int r0 = r9.f1836x
            int r1 = androidx.constraintlayout.motion.widget.C0382e.f1738f
            if (r0 == r1) goto L_0x0164
            android.view.ViewParent r11 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r11 = (androidx.constraintlayout.motion.widget.MotionLayout) r11
            int r0 = r9.f1836x
            android.view.View[] r1 = new android.view.View[r3]
            r1[r2] = r10
            r11.mo2448M0(r0, r1)
        L_0x0164:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0393l.mo2562y(float, android.view.View):void");
    }
}
