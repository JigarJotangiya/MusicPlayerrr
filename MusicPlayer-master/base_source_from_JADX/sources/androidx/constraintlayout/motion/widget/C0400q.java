package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0430c;
import androidx.constraintlayout.widget.C0438e;
import androidx.constraintlayout.widget.C0439f;
import androidx.constraintlayout.widget.C0442h;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p082e.p099f.p100a.p101k.p102a.C3500c;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: androidx.constraintlayout.motion.widget.q */
/* compiled from: MotionScene */
public class C0400q {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final MotionLayout f1914a;

    /* renamed from: b */
    C0442h f1915b = null;

    /* renamed from: c */
    C0402b f1916c = null;

    /* renamed from: d */
    private boolean f1917d = false;

    /* renamed from: e */
    private ArrayList<C0402b> f1918e = new ArrayList<>();

    /* renamed from: f */
    private C0402b f1919f = null;

    /* renamed from: g */
    private ArrayList<C0402b> f1920g = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public SparseArray<C0430c> f1921h = new SparseArray<>();

    /* renamed from: i */
    private HashMap<String, Integer> f1922i = new HashMap<>();

    /* renamed from: j */
    private SparseIntArray f1923j = new SparseIntArray();

    /* renamed from: k */
    private boolean f1924k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f1925l = 400;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f1926m = 0;

    /* renamed from: n */
    private MotionEvent f1927n;

    /* renamed from: o */
    private boolean f1928o = false;

    /* renamed from: p */
    private boolean f1929p = false;

    /* renamed from: q */
    private MotionLayout.C0373g f1930q;

    /* renamed from: r */
    private boolean f1931r;

    /* renamed from: s */
    final C0410t f1932s;

    /* renamed from: t */
    float f1933t;

    /* renamed from: u */
    float f1934u;

    /* renamed from: androidx.constraintlayout.motion.widget.q$a */
    /* compiled from: MotionScene */
    class C0401a implements Interpolator {

        /* renamed from: a */
        final /* synthetic */ C3500c f1935a;

        C0401a(C0400q qVar, C3500c cVar) {
            this.f1935a = cVar;
        }

        public float getInterpolation(float f) {
            return (float) this.f1935a.mo12523a((double) f);
        }
    }

    C0400q(Context context, MotionLayout motionLayout, int i) {
        this.f1914a = motionLayout;
        this.f1932s = new C0410t(motionLayout);
        m2490K(context, i);
        SparseArray<C0430c> sparseArray = this.f1921h;
        int i2 = C0438e.motion_base;
        sparseArray.put(i2, new C0430c());
        this.f1922i.put("motion_base", Integer.valueOf(i2));
    }

    /* renamed from: I */
    private boolean m2488I(int i) {
        int i2 = this.f1923j.get(i);
        int size = this.f1923j.size();
        while (i2 > 0) {
            if (i2 == i) {
                return true;
            }
            int i3 = size - 1;
            if (size < 0) {
                return true;
            }
            i2 = this.f1923j.get(i2);
            size = i3;
        }
        return false;
    }

    /* renamed from: J */
    private boolean m2489J() {
        return this.f1930q != null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2490K(android.content.Context r10, int r11) {
        /*
            r9 = this;
            android.content.res.Resources r0 = r10.getResources()
            android.content.res.XmlResourceParser r0 = r0.getXml(r11)
            r1 = 0
            int r2 = r0.getEventType()     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
        L_0x000d:
            r3 = 1
            if (r2 == r3) goto L_0x0184
            if (r2 == 0) goto L_0x0172
            r4 = 2
            if (r2 == r4) goto L_0x0017
            goto L_0x0175
        L_0x0017:
            java.lang.String r2 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            boolean r5 = r9.f1924k     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            if (r5 == 0) goto L_0x003b
            java.io.PrintStream r5 = java.lang.System.out     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            java.lang.String r6 = "parsing = "
            java.lang.String r7 = java.lang.String.valueOf(r2)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            int r8 = r7.length()     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            if (r8 == 0) goto L_0x0032
            java.lang.String r6 = r6.concat(r7)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            goto L_0x0038
        L_0x0032:
            java.lang.String r7 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            r7.<init>(r6)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            r6 = r7
        L_0x0038:
            r5.println(r6)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
        L_0x003b:
            int r5 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            java.lang.String r6 = "MotionScene"
            r7 = -1
            switch(r5) {
                case -1349929691: goto L_0x00a0;
                case -1239391468: goto L_0x0095;
                case -687739768: goto L_0x008b;
                case 61998586: goto L_0x0080;
                case 269306229: goto L_0x0077;
                case 312750793: goto L_0x006d;
                case 327855227: goto L_0x0063;
                case 793277014: goto L_0x005b;
                case 1382829617: goto L_0x0051;
                case 1942574248: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x00aa
        L_0x0047:
            java.lang.String r3 = "include"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            if (r2 == 0) goto L_0x00aa
            r3 = 6
            goto L_0x00ab
        L_0x0051:
            java.lang.String r3 = "StateSet"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            if (r2 == 0) goto L_0x00aa
            r3 = 4
            goto L_0x00ab
        L_0x005b:
            boolean r2 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            if (r2 == 0) goto L_0x00aa
            r3 = 0
            goto L_0x00ab
        L_0x0063:
            java.lang.String r3 = "OnSwipe"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            if (r2 == 0) goto L_0x00aa
            r3 = 2
            goto L_0x00ab
        L_0x006d:
            java.lang.String r3 = "OnClick"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            if (r2 == 0) goto L_0x00aa
            r3 = 3
            goto L_0x00ab
        L_0x0077:
            java.lang.String r4 = "Transition"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            if (r2 == 0) goto L_0x00aa
            goto L_0x00ab
        L_0x0080:
            java.lang.String r3 = "ViewTransition"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            if (r2 == 0) goto L_0x00aa
            r3 = 9
            goto L_0x00ab
        L_0x008b:
            java.lang.String r3 = "Include"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            if (r2 == 0) goto L_0x00aa
            r3 = 7
            goto L_0x00ab
        L_0x0095:
            java.lang.String r3 = "KeyFrameSet"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            if (r2 == 0) goto L_0x00aa
            r3 = 8
            goto L_0x00ab
        L_0x00a0:
            java.lang.String r3 = "ConstraintSet"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            if (r2 == 0) goto L_0x00aa
            r3 = 5
            goto L_0x00ab
        L_0x00aa:
            r3 = -1
        L_0x00ab:
            switch(r3) {
                case 0: goto L_0x016e;
                case 1: goto L_0x012c;
                case 2: goto L_0x00e6;
                case 3: goto L_0x00df;
                case 4: goto L_0x00d6;
                case 5: goto L_0x00d1;
                case 6: goto L_0x00cc;
                case 7: goto L_0x00cc;
                case 8: goto L_0x00bc;
                case 9: goto L_0x00b0;
                default: goto L_0x00ae;
            }     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
        L_0x00ae:
            goto L_0x0175
        L_0x00b0:
            androidx.constraintlayout.motion.widget.s r2 = new androidx.constraintlayout.motion.widget.s     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            r2.<init>(r10, r0)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            androidx.constraintlayout.motion.widget.t r3 = r9.f1932s     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            r3.mo2728a(r2)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            goto L_0x0175
        L_0x00bc:
            androidx.constraintlayout.motion.widget.h r2 = new androidx.constraintlayout.motion.widget.h     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            r2.<init>(r10, r0)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            if (r1 == 0) goto L_0x0175
            java.util.ArrayList r3 = r1.f1946k     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            r3.add(r2)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            goto L_0x0175
        L_0x00cc:
            r9.m2493N(r10, r0)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            goto L_0x0175
        L_0x00d1:
            r9.m2491L(r10, r0)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            goto L_0x0175
        L_0x00d6:
            androidx.constraintlayout.widget.h r2 = new androidx.constraintlayout.widget.h     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            r2.<init>(r10, r0)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            r9.f1915b = r2     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            goto L_0x0175
        L_0x00df:
            if (r1 == 0) goto L_0x0175
            r1.mo2675u(r10, r0)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            goto L_0x0175
        L_0x00e6:
            if (r1 != 0) goto L_0x011f
            android.content.res.Resources r2 = r10.getResources()     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            java.lang.String r2 = r2.getResourceEntryName(r11)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            int r3 = r0.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            int r4 = r4.length()     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            int r4 = r4 + 27
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            r5.<init>(r4)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            java.lang.String r4 = " OnSwipe ("
            r5.append(r4)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            r5.append(r2)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            java.lang.String r2 = ".xml:"
            r5.append(r2)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            r5.append(r3)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            java.lang.String r2 = ")"
            r5.append(r2)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            java.lang.String r2 = r5.toString()     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            android.util.Log.v(r6, r2)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
        L_0x011f:
            if (r1 == 0) goto L_0x0175
            androidx.constraintlayout.motion.widget.r r2 = new androidx.constraintlayout.motion.widget.r     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r9.f1914a     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            r2.<init>(r10, r3, r0)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            androidx.constraintlayout.motion.widget.C0404r unused = r1.f1947l = r2     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            goto L_0x0175
        L_0x012c:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r1 = r9.f1918e     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            androidx.constraintlayout.motion.widget.q$b r2 = new androidx.constraintlayout.motion.widget.q$b     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            r2.<init>(r9, r10, r0)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            r1.add(r2)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            androidx.constraintlayout.motion.widget.q$b r1 = r9.f1916c     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            if (r1 != 0) goto L_0x0153
            boolean r1 = r2.f1937b     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            if (r1 != 0) goto L_0x0153
            r9.f1916c = r2     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            androidx.constraintlayout.motion.widget.r r1 = r2.f1947l     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            if (r1 == 0) goto L_0x0153
            androidx.constraintlayout.motion.widget.q$b r1 = r9.f1916c     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            androidx.constraintlayout.motion.widget.r r1 = r1.f1947l     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            boolean r3 = r9.f1931r     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            r1.mo2706x(r3)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
        L_0x0153:
            boolean r1 = r2.f1937b     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            if (r1 == 0) goto L_0x016c
            int r1 = r2.f1938c     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            if (r1 != r7) goto L_0x0162
            r9.f1919f = r2     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            goto L_0x0167
        L_0x0162:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r1 = r9.f1920g     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            r1.add(r2)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
        L_0x0167:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r1 = r9.f1918e     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            r1.remove(r2)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
        L_0x016c:
            r1 = r2
            goto L_0x0175
        L_0x016e:
            r9.m2494O(r10, r0)     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            goto L_0x0175
        L_0x0172:
            r0.getName()     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
        L_0x0175:
            int r2 = r0.next()     // Catch:{ XmlPullParserException -> 0x0180, IOException -> 0x017b }
            goto L_0x000d
        L_0x017b:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x0184
        L_0x0180:
            r10 = move-exception
            r10.printStackTrace()
        L_0x0184:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0400q.m2490K(android.content.Context, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m2491L(android.content.Context r18, org.xmlpull.v1.XmlPullParser r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            androidx.constraintlayout.widget.c r3 = new androidx.constraintlayout.widget.c
            r3.<init>()
            r4 = 0
            r3.mo2951R(r4)
            int r5 = r19.getAttributeCount()
            r6 = -1
            r7 = 0
            r8 = -1
            r9 = -1
        L_0x0017:
            r10 = 1
            if (r7 >= r5) goto L_0x00f5
            java.lang.String r11 = r2.getAttributeName(r7)
            java.lang.String r12 = r2.getAttributeValue(r7)
            boolean r13 = r0.f1924k
            if (r13 == 0) goto L_0x0042
            java.io.PrintStream r13 = java.lang.System.out
            java.lang.String r14 = "id string = "
            java.lang.String r15 = java.lang.String.valueOf(r12)
            int r16 = r15.length()
            if (r16 == 0) goto L_0x0039
            java.lang.String r14 = r14.concat(r15)
            goto L_0x003f
        L_0x0039:
            java.lang.String r15 = new java.lang.String
            r15.<init>(r14)
            r14 = r15
        L_0x003f:
            r13.println(r14)
        L_0x0042:
            r11.hashCode()
            int r13 = r11.hashCode()
            r14 = 2
            switch(r13) {
                case -1496482599: goto L_0x0065;
                case -1153153640: goto L_0x005a;
                case 3355: goto L_0x004f;
                default: goto L_0x004d;
            }
        L_0x004d:
            r11 = -1
            goto L_0x006f
        L_0x004f:
            java.lang.String r13 = "id"
            boolean r11 = r11.equals(r13)
            if (r11 != 0) goto L_0x0058
            goto L_0x004d
        L_0x0058:
            r11 = 2
            goto L_0x006f
        L_0x005a:
            java.lang.String r13 = "constraintRotate"
            boolean r11 = r11.equals(r13)
            if (r11 != 0) goto L_0x0063
            goto L_0x004d
        L_0x0063:
            r11 = 1
            goto L_0x006f
        L_0x0065:
            java.lang.String r13 = "deriveConstraintsFrom"
            boolean r11 = r11.equals(r13)
            if (r11 != 0) goto L_0x006e
            goto L_0x004d
        L_0x006e:
            r11 = 0
        L_0x006f:
            switch(r11) {
                case 0: goto L_0x00ed;
                case 1: goto L_0x008d;
                case 2: goto L_0x0074;
                default: goto L_0x0072;
            }
        L_0x0072:
            goto L_0x00f1
        L_0x0074:
            int r8 = r0.m2502r(r1, r12)
            java.util.HashMap<java.lang.String, java.lang.Integer> r10 = r0.f1922i
            java.lang.String r11 = m2497a0(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            r10.put(r11, r12)
            java.lang.String r10 = androidx.constraintlayout.motion.widget.C0379b.m2241c(r1, r8)
            r3.f2319a = r10
            goto L_0x00f1
        L_0x008d:
            int r11 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x0095 }
            r3.f2321c = r11     // Catch:{ NumberFormatException -> 0x0095 }
            goto L_0x00f1
        L_0x0095:
            r12.hashCode()
            int r11 = r12.hashCode()
            r13 = 4
            r15 = 3
            switch(r11) {
                case -768416914: goto L_0x00d0;
                case 3317767: goto L_0x00c5;
                case 3387192: goto L_0x00ba;
                case 108511772: goto L_0x00af;
                case 1954540437: goto L_0x00a4;
                default: goto L_0x00a2;
            }
        L_0x00a2:
            r11 = -1
            goto L_0x00da
        L_0x00a4:
            java.lang.String r11 = "x_right"
            boolean r11 = r12.equals(r11)
            if (r11 != 0) goto L_0x00ad
            goto L_0x00a2
        L_0x00ad:
            r11 = 4
            goto L_0x00da
        L_0x00af:
            java.lang.String r11 = "right"
            boolean r11 = r12.equals(r11)
            if (r11 != 0) goto L_0x00b8
            goto L_0x00a2
        L_0x00b8:
            r11 = 3
            goto L_0x00da
        L_0x00ba:
            java.lang.String r11 = "none"
            boolean r11 = r12.equals(r11)
            if (r11 != 0) goto L_0x00c3
            goto L_0x00a2
        L_0x00c3:
            r11 = 2
            goto L_0x00da
        L_0x00c5:
            java.lang.String r11 = "left"
            boolean r11 = r12.equals(r11)
            if (r11 != 0) goto L_0x00ce
            goto L_0x00a2
        L_0x00ce:
            r11 = 1
            goto L_0x00da
        L_0x00d0:
            java.lang.String r11 = "x_left"
            boolean r11 = r12.equals(r11)
            if (r11 != 0) goto L_0x00d9
            goto L_0x00a2
        L_0x00d9:
            r11 = 0
        L_0x00da:
            switch(r11) {
                case 0: goto L_0x00ea;
                case 1: goto L_0x00e7;
                case 2: goto L_0x00e4;
                case 3: goto L_0x00e1;
                case 4: goto L_0x00de;
                default: goto L_0x00dd;
            }
        L_0x00dd:
            goto L_0x00f1
        L_0x00de:
            r3.f2321c = r15
            goto L_0x00f1
        L_0x00e1:
            r3.f2321c = r10
            goto L_0x00f1
        L_0x00e4:
            r3.f2321c = r4
            goto L_0x00f1
        L_0x00e7:
            r3.f2321c = r14
            goto L_0x00f1
        L_0x00ea:
            r3.f2321c = r13
            goto L_0x00f1
        L_0x00ed:
            int r9 = r0.m2502r(r1, r12)
        L_0x00f1:
            int r7 = r7 + 1
            goto L_0x0017
        L_0x00f5:
            if (r8 == r6) goto L_0x010f
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r0.f1914a
            int r4 = r4.f1667W
            if (r4 == 0) goto L_0x0100
            r3.mo2952S(r10)
        L_0x0100:
            r3.mo2948E(r1, r2)
            if (r9 == r6) goto L_0x010a
            android.util.SparseIntArray r1 = r0.f1923j
            r1.put(r8, r9)
        L_0x010a:
            android.util.SparseArray<androidx.constraintlayout.widget.c> r1 = r0.f1921h
            r1.put(r8, r3)
        L_0x010f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0400q.m2491L(android.content.Context, org.xmlpull.v1.XmlPullParser):int");
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public int m2492M(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return m2491L(context, xml);
                }
            }
            return -1;
        } catch (XmlPullParserException e) {
            e.printStackTrace();
            return -1;
        } catch (IOException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    /* renamed from: N */
    private void m2493N(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0439f.include);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0439f.include_constraintSet) {
                m2492M(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: O */
    private void m2494O(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0439f.MotionScene);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0439f.MotionScene_defaultDuration) {
                int i2 = obtainStyledAttributes.getInt(index, this.f1925l);
                this.f1925l = i2;
                if (i2 < 8) {
                    this.f1925l = 8;
                }
            } else if (index == C0439f.MotionScene_layoutDuringTransition) {
                this.f1926m = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: S */
    private void m2495S(int i, MotionLayout motionLayout) {
        C0430c cVar = this.f1921h.get(i);
        cVar.f2320b = cVar.f2319a;
        int i2 = this.f1923j.get(i);
        if (i2 > 0) {
            m2495S(i2, motionLayout);
            C0430c cVar2 = this.f1921h.get(i2);
            if (cVar2 == null) {
                String valueOf = String.valueOf(C0379b.m2241c(this.f1914a.getContext(), i2));
                Log.e("MotionScene", valueOf.length() != 0 ? "ERROR! invalid deriveConstraintsFrom: @id/".concat(valueOf) : new String("ERROR! invalid deriveConstraintsFrom: @id/"));
                return;
            }
            String valueOf2 = String.valueOf(cVar.f2320b);
            String str = cVar2.f2320b;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 1 + String.valueOf(str).length());
            sb.append(valueOf2);
            sb.append("/");
            sb.append(str);
            cVar.f2320b = sb.toString();
            cVar.mo2950M(cVar2);
        } else {
            cVar.f2320b = String.valueOf(cVar.f2320b).concat("  layout");
            cVar.mo2949L(motionLayout);
        }
        cVar.mo2954h(cVar);
    }

    /* renamed from: a0 */
    public static String m2497a0(String str) {
        if (str == null) {
            return BuildConfig.FLAVOR;
        }
        int indexOf = str.indexOf(47);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(indexOf + 1);
    }

    /* renamed from: r */
    private int m2502r(Context context, String str) {
        int i;
        if (str.contains("/")) {
            i = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
            if (this.f1924k) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder(27);
                sb.append("id getMap res = ");
                sb.append(i);
                printStream.println(sb.toString());
            }
        } else {
            i = -1;
        }
        if (i != -1) {
            return i;
        }
        if (str != null && str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e("MotionScene", "error in parsing id");
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.mo2991c(r3, -1, -1);
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m2503y(int r3) {
        /*
            r2 = this;
            androidx.constraintlayout.widget.h r0 = r2.f1915b
            if (r0 == 0) goto L_0x000c
            r1 = -1
            int r0 = r0.mo2991c(r3, r1, r1)
            if (r0 == r1) goto L_0x000c
            return r0
        L_0x000c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0400q.m2503y(int):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public float mo2625A() {
        C0402b bVar = this.f1916c;
        if (bVar == null || bVar.f1947l == null) {
            return 0.0f;
        }
        return this.f1916c.f1947l.mo2693l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public float mo2626B() {
        C0402b bVar = this.f1916c;
        if (bVar == null || bVar.f1947l == null) {
            return 0.0f;
        }
        return this.f1916c.f1947l.mo2694m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public float mo2627C() {
        C0402b bVar = this.f1916c;
        if (bVar == null || bVar.f1947l == null) {
            return 0.0f;
        }
        return this.f1916c.f1947l.mo2695n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public float mo2628D() {
        C0402b bVar = this.f1916c;
        if (bVar == null || bVar.f1947l == null) {
            return 0.0f;
        }
        return this.f1916c.f1947l.mo2696o();
    }

    /* renamed from: E */
    public float mo2629E() {
        C0402b bVar = this.f1916c;
        if (bVar != null) {
            return bVar.f1944i;
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public int mo2630F() {
        C0402b bVar = this.f1916c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f1939d;
    }

    /* renamed from: G */
    public C0402b mo2631G(int i) {
        Iterator<C0402b> it = this.f1918e.iterator();
        while (it.hasNext()) {
            C0402b next = it.next();
            if (next.f1936a == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: H */
    public List<C0402b> mo2632H(int i) {
        int y = m2503y(i);
        ArrayList arrayList = new ArrayList();
        Iterator<C0402b> it = this.f1918e.iterator();
        while (it.hasNext()) {
            C0402b next = it.next();
            if (next.f1939d == y || next.f1938c == y) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo2633P(float f, float f2) {
        C0402b bVar = this.f1916c;
        if (bVar != null && bVar.f1947l != null) {
            this.f1916c.f1947l.mo2703u(f, f2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo2634Q(float f, float f2) {
        C0402b bVar = this.f1916c;
        if (bVar != null && bVar.f1947l != null) {
            this.f1916c.f1947l.mo2704v(f, f2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo2635R(MotionEvent motionEvent, int i, MotionLayout motionLayout) {
        MotionLayout.C0373g gVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.f1930q == null) {
            this.f1930q = this.f1914a.mo2501t0();
        }
        this.f1930q.mo2525b(motionEvent);
        if (i != -1) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (action == 0) {
                this.f1933t = motionEvent.getRawX();
                this.f1934u = motionEvent.getRawY();
                this.f1927n = motionEvent;
                this.f1928o = false;
                if (this.f1916c.f1947l != null) {
                    RectF f = this.f1916c.f1947l.mo2687f(this.f1914a, rectF);
                    if (f == null || f.contains(this.f1927n.getX(), this.f1927n.getY())) {
                        RectF p = this.f1916c.f1947l.mo2697p(this.f1914a, rectF);
                        if (p == null || p.contains(this.f1927n.getX(), this.f1927n.getY())) {
                            this.f1929p = false;
                        } else {
                            this.f1929p = true;
                        }
                        this.f1916c.f1947l.mo2705w(this.f1933t, this.f1934u);
                        return;
                    }
                    this.f1927n = null;
                    this.f1928o = true;
                    return;
                }
                return;
            } else if (action == 2 && !this.f1928o) {
                float rawY = motionEvent.getRawY() - this.f1934u;
                float rawX = motionEvent.getRawX() - this.f1933t;
                if ((((double) rawX) != 0.0d || ((double) rawY) != 0.0d) && (motionEvent2 = this.f1927n) != null) {
                    C0402b i2 = mo2648i(i, rawX, rawY, motionEvent2);
                    if (i2 != null) {
                        motionLayout.setTransition(i2);
                        RectF p2 = this.f1916c.f1947l.mo2697p(this.f1914a, rectF);
                        if (p2 != null && !p2.contains(this.f1927n.getX(), this.f1927n.getY())) {
                            z = true;
                        }
                        this.f1929p = z;
                        this.f1916c.f1947l.mo2708z(this.f1933t, this.f1934u);
                    }
                } else {
                    return;
                }
            }
        }
        if (!this.f1928o) {
            C0402b bVar = this.f1916c;
            if (!(bVar == null || bVar.f1947l == null || this.f1929p)) {
                this.f1916c.f1947l.mo2700s(motionEvent, this.f1930q, i, this);
            }
            this.f1933t = motionEvent.getRawX();
            this.f1934u = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 && (gVar = this.f1930q) != null) {
                gVar.mo2524a();
                this.f1930q = null;
                int i3 = motionLayout.f1633F;
                if (i3 != -1) {
                    mo2647h(motionLayout, i3);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo2636T(MotionLayout motionLayout) {
        int i = 0;
        while (i < this.f1921h.size()) {
            int keyAt = this.f1921h.keyAt(i);
            if (m2488I(keyAt)) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            } else {
                m2495S(keyAt, motionLayout);
                i++;
            }
        }
    }

    /* renamed from: U */
    public void mo2637U(int i, C0430c cVar) {
        this.f1921h.put(i, cVar);
    }

    /* renamed from: V */
    public void mo2638V(int i) {
        C0402b bVar = this.f1916c;
        if (bVar != null) {
            bVar.mo2669E(i);
        } else {
            this.f1925l = i;
        }
    }

    /* renamed from: W */
    public void mo2639W(boolean z) {
        this.f1931r = z;
        C0402b bVar = this.f1916c;
        if (bVar != null && bVar.f1947l != null) {
            this.f1916c.f1947l.mo2706x(this.f1931r);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r2 != -1) goto L_0x0018;
     */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2640X(int r7, int r8) {
        /*
            r6 = this;
            androidx.constraintlayout.widget.h r0 = r6.f1915b
            r1 = -1
            if (r0 == 0) goto L_0x0016
            int r0 = r0.mo2991c(r7, r1, r1)
            if (r0 == r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r0 = r7
        L_0x000d:
            androidx.constraintlayout.widget.h r2 = r6.f1915b
            int r2 = r2.mo2991c(r8, r1, r1)
            if (r2 == r1) goto L_0x0017
            goto L_0x0018
        L_0x0016:
            r0 = r7
        L_0x0017:
            r2 = r8
        L_0x0018:
            androidx.constraintlayout.motion.widget.q$b r3 = r6.f1916c
            if (r3 == 0) goto L_0x002b
            int r3 = r3.f1938c
            if (r3 != r8) goto L_0x002b
            androidx.constraintlayout.motion.widget.q$b r3 = r6.f1916c
            int r3 = r3.f1939d
            if (r3 != r7) goto L_0x002b
            return
        L_0x002b:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r3 = r6.f1918e
            java.util.Iterator r3 = r3.iterator()
        L_0x0031:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x006b
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.q$b r4 = (androidx.constraintlayout.motion.widget.C0400q.C0402b) r4
            int r5 = r4.f1938c
            if (r5 != r2) goto L_0x0049
            int r5 = r4.f1939d
            if (r5 == r0) goto L_0x0055
        L_0x0049:
            int r5 = r4.f1938c
            if (r5 != r8) goto L_0x0031
            int r5 = r4.f1939d
            if (r5 != r7) goto L_0x0031
        L_0x0055:
            r6.f1916c = r4
            if (r4 == 0) goto L_0x006a
            androidx.constraintlayout.motion.widget.r r7 = r4.f1947l
            if (r7 == 0) goto L_0x006a
            androidx.constraintlayout.motion.widget.q$b r7 = r6.f1916c
            androidx.constraintlayout.motion.widget.r r7 = r7.f1947l
            boolean r8 = r6.f1931r
            r7.mo2706x(r8)
        L_0x006a:
            return
        L_0x006b:
            androidx.constraintlayout.motion.widget.q$b r7 = r6.f1919f
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r3 = r6.f1920g
            java.util.Iterator r3 = r3.iterator()
        L_0x0073:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0087
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.q$b r4 = (androidx.constraintlayout.motion.widget.C0400q.C0402b) r4
            int r5 = r4.f1938c
            if (r5 != r8) goto L_0x0073
            r7 = r4
            goto L_0x0073
        L_0x0087:
            androidx.constraintlayout.motion.widget.q$b r8 = new androidx.constraintlayout.motion.widget.q$b
            r8.<init>(r6, r7)
            int unused = r8.f1939d = r0
            int unused = r8.f1938c = r2
            if (r0 == r1) goto L_0x0099
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r7 = r6.f1918e
            r7.add(r8)
        L_0x0099:
            r6.f1916c = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0400q.mo2640X(int, int):void");
    }

    /* renamed from: Y */
    public void mo2641Y(C0402b bVar) {
        this.f1916c = bVar;
        if (bVar != null && bVar.f1947l != null) {
            this.f1916c.f1947l.mo2706x(this.f1931r);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo2642Z() {
        C0402b bVar = this.f1916c;
        if (bVar != null && bVar.f1947l != null) {
            this.f1916c.f1947l.mo2683A();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public boolean mo2643b0() {
        Iterator<C0402b> it = this.f1918e.iterator();
        while (it.hasNext()) {
            if (it.next().f1947l != null) {
                return true;
            }
        }
        C0402b bVar = this.f1916c;
        if (bVar == null || bVar.f1947l == null) {
            return false;
        }
        return true;
    }

    /* renamed from: c0 */
    public void mo2644c0(int i, View... viewArr) {
        this.f1932s.mo2735i(i, viewArr);
    }

    /* renamed from: f */
    public void mo2645f(MotionLayout motionLayout, int i) {
        Iterator<C0402b> it = this.f1918e.iterator();
        while (it.hasNext()) {
            C0402b next = it.next();
            if (next.f1948m.size() > 0) {
                Iterator it2 = next.f1948m.iterator();
                while (it2.hasNext()) {
                    ((C0402b.C0403a) it2.next()).mo2681d(motionLayout);
                }
            }
        }
        Iterator<C0402b> it3 = this.f1920g.iterator();
        while (it3.hasNext()) {
            C0402b next2 = it3.next();
            if (next2.f1948m.size() > 0) {
                Iterator it4 = next2.f1948m.iterator();
                while (it4.hasNext()) {
                    ((C0402b.C0403a) it4.next()).mo2681d(motionLayout);
                }
            }
        }
        Iterator<C0402b> it5 = this.f1918e.iterator();
        while (it5.hasNext()) {
            C0402b next3 = it5.next();
            if (next3.f1948m.size() > 0) {
                Iterator it6 = next3.f1948m.iterator();
                while (it6.hasNext()) {
                    ((C0402b.C0403a) it6.next()).mo2679a(motionLayout, i, next3);
                }
            }
        }
        Iterator<C0402b> it7 = this.f1920g.iterator();
        while (it7.hasNext()) {
            C0402b next4 = it7.next();
            if (next4.f1948m.size() > 0) {
                Iterator it8 = next4.f1948m.iterator();
                while (it8.hasNext()) {
                    ((C0402b.C0403a) it8.next()).mo2679a(motionLayout, i, next4);
                }
            }
        }
    }

    /* renamed from: g */
    public boolean mo2646g(int i, C0396n nVar) {
        return this.f1932s.mo2731d(i, nVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo2647h(MotionLayout motionLayout, int i) {
        C0402b bVar;
        if (m2489J() || this.f1917d) {
            return false;
        }
        Iterator<C0402b> it = this.f1918e.iterator();
        while (it.hasNext()) {
            C0402b next = it.next();
            if (next.f1949n != 0 && ((bVar = this.f1916c) != next || !bVar.mo2668D(2))) {
                if (i == next.f1939d && (next.f1949n == 4 || next.f1949n == 2)) {
                    MotionLayout.C0377k kVar = MotionLayout.C0377k.FINISHED;
                    motionLayout.setState(kVar);
                    motionLayout.setTransition(next);
                    if (next.f1949n == 4) {
                        motionLayout.mo2439D0();
                        motionLayout.setState(MotionLayout.C0377k.SETUP);
                        motionLayout.setState(MotionLayout.C0377k.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.mo2453g0(true);
                        motionLayout.setState(MotionLayout.C0377k.SETUP);
                        motionLayout.setState(MotionLayout.C0377k.MOVING);
                        motionLayout.setState(kVar);
                        motionLayout.mo2503u0();
                    }
                    return true;
                } else if (i == next.f1938c && (next.f1949n == 3 || next.f1949n == 1)) {
                    MotionLayout.C0377k kVar2 = MotionLayout.C0377k.FINISHED;
                    motionLayout.setState(kVar2);
                    motionLayout.setTransition(next);
                    if (next.f1949n == 3) {
                        motionLayout.mo2441F0();
                        motionLayout.setState(MotionLayout.C0377k.SETUP);
                        motionLayout.setState(MotionLayout.C0377k.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.mo2453g0(true);
                        motionLayout.setState(MotionLayout.C0377k.SETUP);
                        motionLayout.setState(MotionLayout.C0377k.MOVING);
                        motionLayout.setState(kVar2);
                        motionLayout.mo2503u0();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: i */
    public C0402b mo2648i(int i, float f, float f2, MotionEvent motionEvent) {
        RectF f3;
        int i2 = i;
        float f4 = f;
        float f5 = f2;
        if (i2 == -1) {
            return this.f1916c;
        }
        List<C0402b> H = mo2632H(i);
        float f6 = 0.0f;
        C0402b bVar = null;
        RectF rectF = new RectF();
        for (C0402b next : H) {
            if (!next.f1950o && next.f1947l != null) {
                next.f1947l.mo2706x(this.f1931r);
                RectF p = next.f1947l.mo2697p(this.f1914a, rectF);
                if ((p == null || motionEvent == null || p.contains(motionEvent.getX(), motionEvent.getY())) && ((f3 = next.f1947l.mo2687f(this.f1914a, rectF)) == null || motionEvent == null || f3.contains(motionEvent.getX(), motionEvent.getY()))) {
                    float a = next.f1947l.mo2684a(f4, f5);
                    if (next.f1947l.f1976l && motionEvent != null) {
                        float x = motionEvent.getX() - next.f1947l.f1973i;
                        float y = motionEvent.getY() - next.f1947l.f1974j;
                        a = ((float) (Math.atan2((double) (f5 + y), (double) (f4 + x)) - Math.atan2((double) x, (double) y))) * 10.0f;
                    }
                    float f7 = a * (next.f1938c == i2 ? -1.0f : 1.1f);
                    if (f7 > f6) {
                        bVar = next;
                        f6 = f7;
                    }
                }
            }
        }
        return bVar;
    }

    /* renamed from: j */
    public int mo2649j() {
        C0402b bVar = this.f1916c;
        if (bVar != null) {
            return bVar.f1951p;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo2650k() {
        C0402b bVar = this.f1916c;
        if (bVar == null || bVar.f1947l == null) {
            return 0;
        }
        return this.f1916c.f1947l.mo2685d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C0430c mo2651l(int i) {
        return mo2652m(i, -1, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C0430c mo2652m(int i, int i2, int i3) {
        int c;
        if (this.f1924k) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder(14);
            sb.append("id ");
            sb.append(i);
            printStream.println(sb.toString());
            PrintStream printStream2 = System.out;
            int size = this.f1921h.size();
            StringBuilder sb2 = new StringBuilder(16);
            sb2.append("size ");
            sb2.append(size);
            printStream2.println(sb2.toString());
        }
        C0442h hVar = this.f1915b;
        if (!(hVar == null || (c = hVar.mo2991c(i, i2, i3)) == -1)) {
            i = c;
        }
        if (this.f1921h.get(i) != null) {
            return this.f1921h.get(i);
        }
        String c2 = C0379b.m2241c(this.f1914a.getContext(), i);
        StringBuilder sb3 = new StringBuilder(String.valueOf(c2).length() + 55);
        sb3.append("Warning could not find ConstraintSet id/");
        sb3.append(c2);
        sb3.append(" In MotionScene");
        Log.e("MotionScene", sb3.toString());
        SparseArray<C0430c> sparseArray = this.f1921h;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    /* renamed from: n */
    public int[] mo2653n() {
        int size = this.f1921h.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = this.f1921h.keyAt(i);
        }
        return iArr;
    }

    /* renamed from: o */
    public ArrayList<C0402b> mo2654o() {
        return this.f1918e;
    }

    /* renamed from: p */
    public int mo2655p() {
        C0402b bVar = this.f1916c;
        if (bVar != null) {
            return bVar.f1943h;
        }
        return this.f1925l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo2656q() {
        C0402b bVar = this.f1916c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f1938c;
    }

    /* renamed from: s */
    public Interpolator mo2657s() {
        int g = this.f1916c.f1940e;
        if (g == -2) {
            return AnimationUtils.loadInterpolator(this.f1914a.getContext(), this.f1916c.f1942g);
        }
        if (g == -1) {
            return new C0401a(this, C3500c.m15017c(this.f1916c.f1941f));
        }
        if (g == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (g == 1) {
            return new AccelerateInterpolator();
        }
        if (g == 2) {
            return new DecelerateInterpolator();
        }
        if (g == 4) {
            return new BounceInterpolator();
        }
        if (g == 5) {
            return new OvershootInterpolator();
        }
        if (g != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    /* renamed from: t */
    public void mo2658t(C0396n nVar) {
        C0402b bVar = this.f1916c;
        if (bVar == null) {
            C0402b bVar2 = this.f1919f;
            if (bVar2 != null) {
                Iterator it = bVar2.f1946k.iterator();
                while (it.hasNext()) {
                    ((C0387h) it.next()).mo2556b(nVar);
                }
                return;
            }
            return;
        }
        Iterator it2 = bVar.f1946k.iterator();
        while (it2.hasNext()) {
            ((C0387h) it2.next()).mo2556b(nVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public float mo2659u() {
        C0402b bVar = this.f1916c;
        if (bVar == null || bVar.f1947l == null) {
            return 0.0f;
        }
        return this.f1916c.f1947l.mo2688g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public float mo2660v() {
        C0402b bVar = this.f1916c;
        if (bVar == null || bVar.f1947l == null) {
            return 0.0f;
        }
        return this.f1916c.f1947l.mo2689h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo2661w() {
        C0402b bVar = this.f1916c;
        if (bVar == null || bVar.f1947l == null) {
            return false;
        }
        return this.f1916c.f1947l.mo2690i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public float mo2662x(float f, float f2) {
        C0402b bVar = this.f1916c;
        if (bVar == null || bVar.f1947l == null) {
            return 0.0f;
        }
        return this.f1916c.f1947l.mo2691j(f, f2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public int mo2663z() {
        C0402b bVar = this.f1916c;
        if (bVar == null || bVar.f1947l == null) {
            return 0;
        }
        return this.f1916c.f1947l.mo2692k();
    }

    /* renamed from: androidx.constraintlayout.motion.widget.q$b */
    /* compiled from: MotionScene */
    public static class C0402b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f1936a = -1;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f1937b = false;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f1938c = -1;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f1939d = -1;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f1940e = 0;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f1941f = null;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f1942g = -1;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f1943h = 400;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public float f1944i = 0.0f;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public final C0400q f1945j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public ArrayList<C0387h> f1946k = new ArrayList<>();
        /* access modifiers changed from: private */

        /* renamed from: l */
        public C0404r f1947l = null;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public ArrayList<C0403a> f1948m = new ArrayList<>();
        /* access modifiers changed from: private */

        /* renamed from: n */
        public int f1949n = 0;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public boolean f1950o = false;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public int f1951p = -1;

        /* renamed from: q */
        private int f1952q = 0;

        /* renamed from: r */
        private int f1953r = 0;

        /* renamed from: androidx.constraintlayout.motion.widget.q$b$a */
        /* compiled from: MotionScene */
        public static class C0403a implements View.OnClickListener {

            /* renamed from: g */
            private final C0402b f1954g;

            /* renamed from: h */
            int f1955h = -1;

            /* renamed from: i */
            int f1956i = 17;

            public C0403a(Context context, C0402b bVar, XmlPullParser xmlPullParser) {
                this.f1954g = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0439f.OnClick);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == C0439f.OnClick_targetId) {
                        this.f1955h = obtainStyledAttributes.getResourceId(index, this.f1955h);
                    } else if (index == C0439f.OnClick_clickAction) {
                        this.f1956i = obtainStyledAttributes.getInt(index, this.f1956i);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* renamed from: a */
            public void mo2679a(MotionLayout motionLayout, int i, C0402b bVar) {
                int i2 = this.f1955h;
                View view = motionLayout;
                if (i2 != -1) {
                    view = motionLayout.findViewById(i2);
                }
                if (view == null) {
                    int i3 = this.f1955h;
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("OnClick could not find id ");
                    sb.append(i3);
                    Log.e("MotionScene", sb.toString());
                    return;
                }
                int c = bVar.f1939d;
                int a = bVar.f1938c;
                if (c == -1) {
                    view.setOnClickListener(this);
                    return;
                }
                int i4 = this.f1956i;
                boolean z = false;
                boolean z2 = ((i4 & 1) != 0 && i == c) | ((i4 & 1) != 0 && i == c) | ((i4 & 256) != 0 && i == c) | ((i4 & 16) != 0 && i == a);
                if ((i4 & 4096) != 0 && i == a) {
                    z = true;
                }
                if (z2 || z) {
                    view.setOnClickListener(this);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public boolean mo2680b(C0402b bVar, MotionLayout motionLayout) {
                C0402b bVar2 = this.f1954g;
                if (bVar2 == bVar) {
                    return true;
                }
                int a = bVar2.f1938c;
                int c = this.f1954g.f1939d;
                if (c != -1) {
                    int i = motionLayout.f1633F;
                    if (i == c || i == a) {
                        return true;
                    }
                    return false;
                } else if (motionLayout.f1633F != a) {
                    return true;
                } else {
                    return false;
                }
            }

            /* renamed from: d */
            public void mo2681d(MotionLayout motionLayout) {
                int i = this.f1955h;
                if (i != -1) {
                    View findViewById = motionLayout.findViewById(i);
                    if (findViewById == null) {
                        int i2 = this.f1955h;
                        StringBuilder sb = new StringBuilder(35);
                        sb.append(" (*)  could not find id ");
                        sb.append(i2);
                        Log.e("MotionScene", sb.toString());
                        return;
                    }
                    findViewById.setOnClickListener((View.OnClickListener) null);
                }
            }

            public void onClick(View view) {
                MotionLayout d = this.f1954g.f1945j.f1914a;
                if (d.mo2484s0()) {
                    if (this.f1954g.f1939d == -1) {
                        int currentState = d.getCurrentState();
                        if (currentState == -1) {
                            d.mo2442G0(this.f1954g.f1938c);
                            return;
                        }
                        C0402b bVar = new C0402b(this.f1954g.f1945j, this.f1954g);
                        int unused = bVar.f1939d = currentState;
                        int unused2 = bVar.f1938c = this.f1954g.f1938c;
                        d.setTransition(bVar);
                        d.mo2439D0();
                        return;
                    }
                    C0402b bVar2 = this.f1954g.f1945j.f1916c;
                    int i = this.f1956i;
                    boolean z = false;
                    boolean z2 = ((i & 1) == 0 && (i & 256) == 0) ? false : true;
                    boolean z3 = ((i & 16) == 0 && (i & 4096) == 0) ? false : true;
                    if (z2 && z3) {
                        C0402b bVar3 = this.f1954g.f1945j.f1916c;
                        C0402b bVar4 = this.f1954g;
                        if (bVar3 != bVar4) {
                            d.setTransition(bVar4);
                        }
                        if (d.getCurrentState() != d.getEndState() && d.getProgress() <= 0.5f) {
                            z = z2;
                            z3 = false;
                        }
                    } else {
                        z = z2;
                    }
                    if (!mo2680b(bVar2, d)) {
                        return;
                    }
                    if (z && (this.f1956i & 1) != 0) {
                        d.setTransition(this.f1954g);
                        d.mo2439D0();
                    } else if (z3 && (this.f1956i & 16) != 0) {
                        d.setTransition(this.f1954g);
                        d.mo2441F0();
                    } else if (z && (this.f1956i & 256) != 0) {
                        d.setTransition(this.f1954g);
                        d.setProgress(1.0f);
                    } else if (z3 && (this.f1956i & 4096) != 0) {
                        d.setTransition(this.f1954g);
                        d.setProgress(0.0f);
                    }
                }
            }
        }

        C0402b(C0400q qVar, C0402b bVar) {
            this.f1945j = qVar;
            this.f1943h = qVar.f1925l;
            if (bVar != null) {
                this.f1951p = bVar.f1951p;
                this.f1940e = bVar.f1940e;
                this.f1941f = bVar.f1941f;
                this.f1942g = bVar.f1942g;
                this.f1943h = bVar.f1943h;
                this.f1946k = bVar.f1946k;
                this.f1944i = bVar.f1944i;
                this.f1952q = bVar.f1952q;
            }
        }

        /* renamed from: v */
        private void m2562v(C0400q qVar, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                if (index == C0439f.Transition_constraintSetEnd) {
                    this.f1938c = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1938c);
                    if ("layout".equals(resourceTypeName)) {
                        C0430c cVar = new C0430c();
                        cVar.mo2947D(context, this.f1938c);
                        qVar.f1921h.append(this.f1938c, cVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f1938c = qVar.m2492M(context, this.f1938c);
                    }
                } else if (index == C0439f.Transition_constraintSetStart) {
                    this.f1939d = typedArray.getResourceId(index, this.f1939d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f1939d);
                    if ("layout".equals(resourceTypeName2)) {
                        C0430c cVar2 = new C0430c();
                        cVar2.mo2947D(context, this.f1939d);
                        qVar.f1921h.append(this.f1939d, cVar2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f1939d = qVar.m2492M(context, this.f1939d);
                    }
                } else if (index == C0439f.Transition_motionInterpolator) {
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.f1942g = resourceId;
                        if (resourceId != -1) {
                            this.f1940e = -2;
                        }
                    } else if (i2 == 3) {
                        String string = typedArray.getString(index);
                        this.f1941f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f1942g = typedArray.getResourceId(index, -1);
                                this.f1940e = -2;
                            } else {
                                this.f1940e = -1;
                            }
                        }
                    } else {
                        this.f1940e = typedArray.getInteger(index, this.f1940e);
                    }
                } else if (index == C0439f.Transition_duration) {
                    int i3 = typedArray.getInt(index, this.f1943h);
                    this.f1943h = i3;
                    if (i3 < 8) {
                        this.f1943h = 8;
                    }
                } else if (index == C0439f.Transition_staggered) {
                    this.f1944i = typedArray.getFloat(index, this.f1944i);
                } else if (index == C0439f.Transition_autoTransition) {
                    this.f1949n = typedArray.getInteger(index, this.f1949n);
                } else if (index == C0439f.Transition_android_id) {
                    this.f1936a = typedArray.getResourceId(index, this.f1936a);
                } else if (index == C0439f.Transition_transitionDisable) {
                    this.f1950o = typedArray.getBoolean(index, this.f1950o);
                } else if (index == C0439f.Transition_pathMotionArc) {
                    this.f1951p = typedArray.getInteger(index, -1);
                } else if (index == C0439f.Transition_layoutDuringTransition) {
                    this.f1952q = typedArray.getInteger(index, 0);
                } else if (index == C0439f.Transition_transitionFlags) {
                    this.f1953r = typedArray.getInteger(index, 0);
                }
            }
            if (this.f1939d == -1) {
                this.f1937b = true;
            }
        }

        /* renamed from: w */
        private void m2563w(C0400q qVar, Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0439f.Transition);
            m2562v(qVar, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: A */
        public int mo2665A() {
            return this.f1939d;
        }

        /* renamed from: B */
        public C0404r mo2666B() {
            return this.f1947l;
        }

        /* renamed from: C */
        public boolean mo2667C() {
            return !this.f1950o;
        }

        /* renamed from: D */
        public boolean mo2668D(int i) {
            return (i & this.f1953r) != 0;
        }

        /* renamed from: E */
        public void mo2669E(int i) {
            this.f1943h = Math.max(i, 8);
        }

        /* renamed from: F */
        public void mo2670F(boolean z) {
            this.f1950o = !z;
        }

        /* renamed from: G */
        public void mo2671G(int i, String str, int i2) {
            this.f1940e = i;
            this.f1941f = str;
            this.f1942g = i2;
        }

        /* renamed from: H */
        public void mo2672H(int i) {
            C0404r B = mo2666B();
            if (B != null) {
                B.mo2707y(i);
            }
        }

        /* renamed from: I */
        public void mo2673I(int i) {
            this.f1951p = i;
        }

        /* renamed from: t */
        public void mo2674t(C0387h hVar) {
            this.f1946k.add(hVar);
        }

        /* renamed from: u */
        public void mo2675u(Context context, XmlPullParser xmlPullParser) {
            this.f1948m.add(new C0403a(context, this, xmlPullParser));
        }

        /* renamed from: x */
        public int mo2676x() {
            return this.f1949n;
        }

        /* renamed from: y */
        public int mo2677y() {
            return this.f1938c;
        }

        /* renamed from: z */
        public int mo2678z() {
            return this.f1952q;
        }

        public C0402b(int i, C0400q qVar, int i2, int i3) {
            this.f1936a = i;
            this.f1945j = qVar;
            this.f1939d = i2;
            this.f1938c = i3;
            this.f1943h = qVar.f1925l;
            this.f1952q = qVar.f1926m;
        }

        C0402b(C0400q qVar, Context context, XmlPullParser xmlPullParser) {
            this.f1943h = qVar.f1925l;
            this.f1952q = qVar.f1926m;
            this.f1945j = qVar;
            m2563w(qVar, context, Xml.asAttributeSet(xmlPullParser));
        }
    }
}
