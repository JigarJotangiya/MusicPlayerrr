package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.C0439f;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.f */
/* compiled from: KeyAttributes */
public class C0383f extends C0382e {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f1744g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f1745h = -1;

    /* renamed from: i */
    private boolean f1746i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public float f1747j = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public float f1748k = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public float f1749l = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public float f1750m = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public float f1751n = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public float f1752o = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public float f1753p = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public float f1754q = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public float f1755r = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public float f1756s = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public float f1757t = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public float f1758u = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public float f1759v = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public float f1760w = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.f$a */
    /* compiled from: KeyAttributes */
    private static class C0384a {

        /* renamed from: a */
        private static SparseIntArray f1761a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1761a = sparseIntArray;
            sparseIntArray.append(C0439f.KeyAttribute_android_alpha, 1);
            f1761a.append(C0439f.KeyAttribute_android_elevation, 2);
            f1761a.append(C0439f.KeyAttribute_android_rotation, 4);
            f1761a.append(C0439f.KeyAttribute_android_rotationX, 5);
            f1761a.append(C0439f.KeyAttribute_android_rotationY, 6);
            f1761a.append(C0439f.KeyAttribute_android_transformPivotX, 19);
            f1761a.append(C0439f.KeyAttribute_android_transformPivotY, 20);
            f1761a.append(C0439f.KeyAttribute_android_scaleX, 7);
            f1761a.append(C0439f.KeyAttribute_transitionPathRotate, 8);
            f1761a.append(C0439f.KeyAttribute_transitionEasing, 9);
            f1761a.append(C0439f.KeyAttribute_motionTarget, 10);
            f1761a.append(C0439f.KeyAttribute_framePosition, 12);
            f1761a.append(C0439f.KeyAttribute_curveFit, 13);
            f1761a.append(C0439f.KeyAttribute_android_scaleY, 14);
            f1761a.append(C0439f.KeyAttribute_android_translationX, 15);
            f1761a.append(C0439f.KeyAttribute_android_translationY, 16);
            f1761a.append(C0439f.KeyAttribute_android_translationZ, 17);
            f1761a.append(C0439f.KeyAttribute_motionProgress, 18);
        }

        /* renamed from: a */
        public static void m2297a(C0383f fVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f1761a.get(index)) {
                    case 1:
                        float unused = fVar.f1747j = typedArray.getFloat(index, fVar.f1747j);
                        break;
                    case 2:
                        float unused2 = fVar.f1748k = typedArray.getDimension(index, fVar.f1748k);
                        break;
                    case 4:
                        float unused3 = fVar.f1749l = typedArray.getFloat(index, fVar.f1749l);
                        break;
                    case 5:
                        float unused4 = fVar.f1750m = typedArray.getFloat(index, fVar.f1750m);
                        break;
                    case 6:
                        float unused5 = fVar.f1751n = typedArray.getFloat(index, fVar.f1751n);
                        break;
                    case 7:
                        float unused6 = fVar.f1755r = typedArray.getFloat(index, fVar.f1755r);
                        break;
                    case 8:
                        float unused7 = fVar.f1754q = typedArray.getFloat(index, fVar.f1754q);
                        break;
                    case 9:
                        String unused8 = fVar.f1744g = typedArray.getString(index);
                        break;
                    case 10:
                        if (!MotionLayout.f1622Y0) {
                            if (typedArray.peekValue(index).type != 3) {
                                fVar.f1740b = typedArray.getResourceId(index, fVar.f1740b);
                                break;
                            } else {
                                fVar.f1741c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, fVar.f1740b);
                            fVar.f1740b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                fVar.f1741c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 12:
                        fVar.f1739a = typedArray.getInt(index, fVar.f1739a);
                        break;
                    case 13:
                        int unused9 = fVar.f1745h = typedArray.getInteger(index, fVar.f1745h);
                        break;
                    case 14:
                        float unused10 = fVar.f1756s = typedArray.getFloat(index, fVar.f1756s);
                        break;
                    case 15:
                        float unused11 = fVar.f1757t = typedArray.getDimension(index, fVar.f1757t);
                        break;
                    case 16:
                        float unused12 = fVar.f1758u = typedArray.getDimension(index, fVar.f1758u);
                        break;
                    case 17:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            float unused13 = fVar.f1759v = typedArray.getDimension(index, fVar.f1759v);
                            break;
                        }
                    case 18:
                        float unused14 = fVar.f1760w = typedArray.getFloat(index, fVar.f1760w);
                        break;
                    case 19:
                        float unused15 = fVar.f1752o = typedArray.getDimension(index, fVar.f1752o);
                        break;
                    case 20:
                        float unused16 = fVar.f1753p = typedArray.getDimension(index, fVar.f1753p);
                        break;
                    default:
                        String hexString = Integer.toHexString(index);
                        int i2 = f1761a.get(index);
                        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 33);
                        sb.append("unused attribute 0x");
                        sb.append(hexString);
                        sb.append("   ");
                        sb.append(i2);
                        Log.e("KeyAttribute", sb.toString());
                        break;
                }
            }
        }
    }

    public C0383f() {
        this.f1742d = 1;
        this.f1743e = new HashMap<>();
    }

    /* renamed from: R */
    public void mo2552R(String str, Object obj) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals("motionProgress")) {
                    c = 0;
                    break;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c = 1;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 4;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 5;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 6;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 7;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 8;
                    break;
                }
                break;
            case -760884510:
                if (str.equals("transformPivotX")) {
                    c = 9;
                    break;
                }
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    c = 10;
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = 12;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 13;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 14;
                    break;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c = 15;
                    break;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f1760w = mo2550k(obj);
                return;
            case 1:
                obj.toString();
                return;
            case 2:
                this.f1750m = mo2550k(obj);
                return;
            case 3:
                this.f1751n = mo2550k(obj);
                return;
            case 4:
                this.f1757t = mo2550k(obj);
                return;
            case 5:
                this.f1758u = mo2550k(obj);
                return;
            case 6:
                this.f1759v = mo2550k(obj);
                return;
            case 7:
                this.f1755r = mo2550k(obj);
                return;
            case 8:
                this.f1756s = mo2550k(obj);
                return;
            case 9:
                this.f1752o = mo2550k(obj);
                return;
            case 10:
                this.f1753p = mo2550k(obj);
                return;
            case 11:
                this.f1749l = mo2550k(obj);
                return;
            case 12:
                this.f1748k = mo2550k(obj);
                return;
            case 13:
                this.f1754q = mo2550k(obj);
                return;
            case 14:
                this.f1747j = mo2550k(obj);
                return;
            case 15:
                this.f1745h = mo2551l(obj);
                return;
            case 16:
                this.f1746i = mo2549j(obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        if (r1.equals("scaleY") == false) goto L_0x0047;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2539a(java.util.HashMap<java.lang.String, p082e.p099f.p106b.p107a.C3580c> r7) {
        /*
            r6 = this;
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01e3
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.get(r1)
            e.f.a.k.a.j r2 = (p082e.p099f.p100a.p101k.p102a.C3511j) r2
            if (r2 != 0) goto L_0x001d
            goto L_0x0008
        L_0x001d:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            r4 = 7
            if (r3 == 0) goto L_0x003c
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r3 = r6.f1743e
            java.lang.Object r1 = r3.get(r1)
            androidx.constraintlayout.widget.a r1 = (androidx.constraintlayout.widget.C0424a) r1
            if (r1 == 0) goto L_0x0008
            e.f.b.a.c$b r2 = (p082e.p099f.p106b.p107a.C3580c.C3582b) r2
            int r3 = r6.f1739a
            r2.mo12870i(r3, r1)
            goto L_0x0008
        L_0x003c:
            r1.hashCode()
            r3 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00e5;
                case -1249320805: goto L_0x00d9;
                case -1225497657: goto L_0x00cd;
                case -1225497656: goto L_0x00c1;
                case -1225497655: goto L_0x00b6;
                case -1001078227: goto L_0x00ab;
                case -908189618: goto L_0x00a0;
                case -908189617: goto L_0x0097;
                case -760884510: goto L_0x008b;
                case -760884509: goto L_0x007e;
                case -40300674: goto L_0x0071;
                case -4379043: goto L_0x0064;
                case 37232917: goto L_0x0057;
                case 92909918: goto L_0x004a;
                default: goto L_0x0047;
            }
        L_0x0047:
            r4 = -1
            goto L_0x00f0
        L_0x004a:
            java.lang.String r4 = "alpha"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0053
            goto L_0x0047
        L_0x0053:
            r4 = 13
            goto L_0x00f0
        L_0x0057:
            java.lang.String r4 = "transitionPathRotate"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0060
            goto L_0x0047
        L_0x0060:
            r4 = 12
            goto L_0x00f0
        L_0x0064:
            java.lang.String r4 = "elevation"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x006d
            goto L_0x0047
        L_0x006d:
            r4 = 11
            goto L_0x00f0
        L_0x0071:
            java.lang.String r4 = "rotation"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x007a
            goto L_0x0047
        L_0x007a:
            r4 = 10
            goto L_0x00f0
        L_0x007e:
            java.lang.String r4 = "transformPivotY"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0087
            goto L_0x0047
        L_0x0087:
            r4 = 9
            goto L_0x00f0
        L_0x008b:
            java.lang.String r4 = "transformPivotX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0094
            goto L_0x0047
        L_0x0094:
            r4 = 8
            goto L_0x00f0
        L_0x0097:
            java.lang.String r5 = "scaleY"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x00f0
            goto L_0x0047
        L_0x00a0:
            java.lang.String r4 = "scaleX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00a9
            goto L_0x0047
        L_0x00a9:
            r4 = 6
            goto L_0x00f0
        L_0x00ab:
            java.lang.String r4 = "progress"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00b4
            goto L_0x0047
        L_0x00b4:
            r4 = 5
            goto L_0x00f0
        L_0x00b6:
            java.lang.String r4 = "translationZ"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00bf
            goto L_0x0047
        L_0x00bf:
            r4 = 4
            goto L_0x00f0
        L_0x00c1:
            java.lang.String r4 = "translationY"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00cb
            goto L_0x0047
        L_0x00cb:
            r4 = 3
            goto L_0x00f0
        L_0x00cd:
            java.lang.String r4 = "translationX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00d7
            goto L_0x0047
        L_0x00d7:
            r4 = 2
            goto L_0x00f0
        L_0x00d9:
            java.lang.String r4 = "rotationY"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00e3
            goto L_0x0047
        L_0x00e3:
            r4 = 1
            goto L_0x00f0
        L_0x00e5:
            java.lang.String r4 = "rotationX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00ef
            goto L_0x0047
        L_0x00ef:
            r4 = 0
        L_0x00f0:
            switch(r4) {
                case 0: goto L_0x01d2;
                case 1: goto L_0x01c1;
                case 2: goto L_0x01b0;
                case 3: goto L_0x019f;
                case 4: goto L_0x018e;
                case 5: goto L_0x017d;
                case 6: goto L_0x016c;
                case 7: goto L_0x015b;
                case 8: goto L_0x014a;
                case 9: goto L_0x0139;
                case 10: goto L_0x0128;
                case 11: goto L_0x0117;
                case 12: goto L_0x0106;
                case 13: goto L_0x00f5;
                default: goto L_0x00f3;
            }
        L_0x00f3:
            goto L_0x0008
        L_0x00f5:
            float r1 = r6.f1747j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1739a
            float r3 = r6.f1747j
            r2.mo12553c(r1, r3)
            goto L_0x0008
        L_0x0106:
            float r1 = r6.f1754q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1739a
            float r3 = r6.f1754q
            r2.mo12553c(r1, r3)
            goto L_0x0008
        L_0x0117:
            float r1 = r6.f1748k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1739a
            float r3 = r6.f1748k
            r2.mo12553c(r1, r3)
            goto L_0x0008
        L_0x0128:
            float r1 = r6.f1749l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1739a
            float r3 = r6.f1749l
            r2.mo12553c(r1, r3)
            goto L_0x0008
        L_0x0139:
            float r1 = r6.f1751n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1739a
            float r3 = r6.f1753p
            r2.mo12553c(r1, r3)
            goto L_0x0008
        L_0x014a:
            float r1 = r6.f1750m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1739a
            float r3 = r6.f1752o
            r2.mo12553c(r1, r3)
            goto L_0x0008
        L_0x015b:
            float r1 = r6.f1756s
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1739a
            float r3 = r6.f1756s
            r2.mo12553c(r1, r3)
            goto L_0x0008
        L_0x016c:
            float r1 = r6.f1755r
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1739a
            float r3 = r6.f1755r
            r2.mo12553c(r1, r3)
            goto L_0x0008
        L_0x017d:
            float r1 = r6.f1760w
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1739a
            float r3 = r6.f1760w
            r2.mo12553c(r1, r3)
            goto L_0x0008
        L_0x018e:
            float r1 = r6.f1759v
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1739a
            float r3 = r6.f1759v
            r2.mo12553c(r1, r3)
            goto L_0x0008
        L_0x019f:
            float r1 = r6.f1758u
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1739a
            float r3 = r6.f1758u
            r2.mo12553c(r1, r3)
            goto L_0x0008
        L_0x01b0:
            float r1 = r6.f1757t
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1739a
            float r3 = r6.f1757t
            r2.mo12553c(r1, r3)
            goto L_0x0008
        L_0x01c1:
            float r1 = r6.f1751n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1739a
            float r3 = r6.f1751n
            r2.mo12553c(r1, r3)
            goto L_0x0008
        L_0x01d2:
            float r1 = r6.f1750m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1739a
            float r3 = r6.f1750m
            r2.mo12553c(r1, r3)
            goto L_0x0008
        L_0x01e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0383f.mo2539a(java.util.HashMap):void");
    }

    /* renamed from: b */
    public C0382e clone() {
        C0383f fVar = new C0383f();
        fVar.mo2541c(this);
        return fVar;
    }

    /* renamed from: c */
    public C0382e mo2541c(C0382e eVar) {
        super.mo2541c(eVar);
        C0383f fVar = (C0383f) eVar;
        this.f1745h = fVar.f1745h;
        this.f1746i = fVar.f1746i;
        this.f1747j = fVar.f1747j;
        this.f1748k = fVar.f1748k;
        this.f1749l = fVar.f1749l;
        this.f1750m = fVar.f1750m;
        this.f1751n = fVar.f1751n;
        this.f1752o = fVar.f1752o;
        this.f1753p = fVar.f1753p;
        this.f1754q = fVar.f1754q;
        this.f1755r = fVar.f1755r;
        this.f1756s = fVar.f1756s;
        this.f1757t = fVar.f1757t;
        this.f1758u = fVar.f1758u;
        this.f1759v = fVar.f1759v;
        this.f1760w = fVar.f1760w;
        return this;
    }

    /* renamed from: d */
    public void mo2543d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f1747j)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f1748k)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f1749l)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f1750m)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f1751n)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f1752o)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f1753p)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f1757t)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f1758u)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f1759v)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f1754q)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f1755r)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f1756s)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f1760w)) {
            hashSet.add("progress");
        }
        if (this.f1743e.size() > 0) {
            for (String valueOf : this.f1743e.keySet()) {
                String valueOf2 = String.valueOf(valueOf);
                hashSet.add(valueOf2.length() != 0 ? "CUSTOM,".concat(valueOf2) : new String("CUSTOM,"));
            }
        }
    }

    /* renamed from: e */
    public void mo2544e(Context context, AttributeSet attributeSet) {
        C0384a.m2297a(this, context.obtainStyledAttributes(attributeSet, C0439f.KeyAttribute));
    }

    /* renamed from: h */
    public void mo2547h(HashMap<String, Integer> hashMap) {
        if (this.f1745h != -1) {
            if (!Float.isNaN(this.f1747j)) {
                hashMap.put("alpha", Integer.valueOf(this.f1745h));
            }
            if (!Float.isNaN(this.f1748k)) {
                hashMap.put("elevation", Integer.valueOf(this.f1745h));
            }
            if (!Float.isNaN(this.f1749l)) {
                hashMap.put("rotation", Integer.valueOf(this.f1745h));
            }
            if (!Float.isNaN(this.f1750m)) {
                hashMap.put("rotationX", Integer.valueOf(this.f1745h));
            }
            if (!Float.isNaN(this.f1751n)) {
                hashMap.put("rotationY", Integer.valueOf(this.f1745h));
            }
            if (!Float.isNaN(this.f1752o)) {
                hashMap.put("transformPivotX", Integer.valueOf(this.f1745h));
            }
            if (!Float.isNaN(this.f1753p)) {
                hashMap.put("transformPivotY", Integer.valueOf(this.f1745h));
            }
            if (!Float.isNaN(this.f1757t)) {
                hashMap.put("translationX", Integer.valueOf(this.f1745h));
            }
            if (!Float.isNaN(this.f1758u)) {
                hashMap.put("translationY", Integer.valueOf(this.f1745h));
            }
            if (!Float.isNaN(this.f1759v)) {
                hashMap.put("translationZ", Integer.valueOf(this.f1745h));
            }
            if (!Float.isNaN(this.f1754q)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f1745h));
            }
            if (!Float.isNaN(this.f1755r)) {
                hashMap.put("scaleX", Integer.valueOf(this.f1745h));
            }
            if (!Float.isNaN(this.f1756s)) {
                hashMap.put("scaleY", Integer.valueOf(this.f1745h));
            }
            if (!Float.isNaN(this.f1760w)) {
                hashMap.put("progress", Integer.valueOf(this.f1745h));
            }
            if (this.f1743e.size() > 0) {
                for (String valueOf : this.f1743e.keySet()) {
                    String valueOf2 = String.valueOf(valueOf);
                    hashMap.put(valueOf2.length() != 0 ? "CUSTOM,".concat(valueOf2) : new String("CUSTOM,"), Integer.valueOf(this.f1745h));
                }
            }
        }
    }
}
