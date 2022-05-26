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
import p082e.p099f.p106b.p107a.C3580c;

/* renamed from: androidx.constraintlayout.motion.widget.k */
/* compiled from: KeyTimeCycle */
public class C0391k extends C0382e {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f1799g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f1800h = -1;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public float f1801i = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public float f1802j = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public float f1803k = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public float f1804l = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public float f1805m = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public float f1806n = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public float f1807o = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public float f1808p = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public float f1809q = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public float f1810r = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public float f1811s = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public float f1812t = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f1813u = 0;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public String f1814v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public float f1815w = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public float f1816x = 0.0f;

    /* renamed from: androidx.constraintlayout.motion.widget.k$a */
    /* compiled from: KeyTimeCycle */
    private static class C0392a {

        /* renamed from: a */
        private static SparseIntArray f1817a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1817a = sparseIntArray;
            sparseIntArray.append(C0439f.KeyTimeCycle_android_alpha, 1);
            f1817a.append(C0439f.KeyTimeCycle_android_elevation, 2);
            f1817a.append(C0439f.KeyTimeCycle_android_rotation, 4);
            f1817a.append(C0439f.KeyTimeCycle_android_rotationX, 5);
            f1817a.append(C0439f.KeyTimeCycle_android_rotationY, 6);
            f1817a.append(C0439f.KeyTimeCycle_android_scaleX, 7);
            f1817a.append(C0439f.KeyTimeCycle_transitionPathRotate, 8);
            f1817a.append(C0439f.KeyTimeCycle_transitionEasing, 9);
            f1817a.append(C0439f.KeyTimeCycle_motionTarget, 10);
            f1817a.append(C0439f.KeyTimeCycle_framePosition, 12);
            f1817a.append(C0439f.KeyTimeCycle_curveFit, 13);
            f1817a.append(C0439f.KeyTimeCycle_android_scaleY, 14);
            f1817a.append(C0439f.KeyTimeCycle_android_translationX, 15);
            f1817a.append(C0439f.KeyTimeCycle_android_translationY, 16);
            f1817a.append(C0439f.KeyTimeCycle_android_translationZ, 17);
            f1817a.append(C0439f.KeyTimeCycle_motionProgress, 18);
            f1817a.append(C0439f.KeyTimeCycle_wavePeriod, 20);
            f1817a.append(C0439f.KeyTimeCycle_waveOffset, 21);
            f1817a.append(C0439f.KeyTimeCycle_waveShape, 19);
        }

        /* renamed from: a */
        public static void m2399a(C0391k kVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f1817a.get(index)) {
                    case 1:
                        float unused = kVar.f1801i = typedArray.getFloat(index, kVar.f1801i);
                        break;
                    case 2:
                        float unused2 = kVar.f1802j = typedArray.getDimension(index, kVar.f1802j);
                        break;
                    case 4:
                        float unused3 = kVar.f1803k = typedArray.getFloat(index, kVar.f1803k);
                        break;
                    case 5:
                        float unused4 = kVar.f1804l = typedArray.getFloat(index, kVar.f1804l);
                        break;
                    case 6:
                        float unused5 = kVar.f1805m = typedArray.getFloat(index, kVar.f1805m);
                        break;
                    case 7:
                        float unused6 = kVar.f1807o = typedArray.getFloat(index, kVar.f1807o);
                        break;
                    case 8:
                        float unused7 = kVar.f1806n = typedArray.getFloat(index, kVar.f1806n);
                        break;
                    case 9:
                        String unused8 = kVar.f1799g = typedArray.getString(index);
                        break;
                    case 10:
                        if (!MotionLayout.f1622Y0) {
                            if (typedArray.peekValue(index).type != 3) {
                                kVar.f1740b = typedArray.getResourceId(index, kVar.f1740b);
                                break;
                            } else {
                                kVar.f1741c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, kVar.f1740b);
                            kVar.f1740b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                kVar.f1741c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 12:
                        kVar.f1739a = typedArray.getInt(index, kVar.f1739a);
                        break;
                    case 13:
                        int unused9 = kVar.f1800h = typedArray.getInteger(index, kVar.f1800h);
                        break;
                    case 14:
                        float unused10 = kVar.f1808p = typedArray.getFloat(index, kVar.f1808p);
                        break;
                    case 15:
                        float unused11 = kVar.f1809q = typedArray.getDimension(index, kVar.f1809q);
                        break;
                    case 16:
                        float unused12 = kVar.f1810r = typedArray.getDimension(index, kVar.f1810r);
                        break;
                    case 17:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            float unused13 = kVar.f1811s = typedArray.getDimension(index, kVar.f1811s);
                            break;
                        }
                    case 18:
                        float unused14 = kVar.f1812t = typedArray.getFloat(index, kVar.f1812t);
                        break;
                    case 19:
                        if (typedArray.peekValue(index).type != 3) {
                            int unused15 = kVar.f1813u = typedArray.getInt(index, kVar.f1813u);
                            break;
                        } else {
                            String unused16 = kVar.f1814v = typedArray.getString(index);
                            int unused17 = kVar.f1813u = 7;
                            break;
                        }
                    case 20:
                        float unused18 = kVar.f1815w = typedArray.getFloat(index, kVar.f1815w);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type != 5) {
                            float unused19 = kVar.f1816x = typedArray.getFloat(index, kVar.f1816x);
                            break;
                        } else {
                            float unused20 = kVar.f1816x = typedArray.getDimension(index, kVar.f1816x);
                            break;
                        }
                    default:
                        String hexString = Integer.toHexString(index);
                        int i2 = f1817a.get(index);
                        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 33);
                        sb.append("unused attribute 0x");
                        sb.append(hexString);
                        sb.append("   ");
                        sb.append(i2);
                        Log.e("KeyTimeCycle", sb.toString());
                        break;
                }
            }
        }
    }

    public C0391k() {
        this.f1742d = 3;
        this.f1743e = new HashMap<>();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008c, code lost:
        if (r1.equals("scaleY") == false) goto L_0x0050;
     */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2561U(java.util.HashMap<java.lang.String, p082e.p099f.p106b.p107a.C3597e> r11) {
        /*
            r10 = this;
            java.util.Set r0 = r11.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x021a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r11.get(r1)
            r3 = r2
            e.f.b.a.e r3 = (p082e.p099f.p106b.p107a.C3597e) r3
            if (r3 != 0) goto L_0x001e
            goto L_0x0008
        L_0x001e:
            java.lang.String r2 = "CUSTOM"
            boolean r2 = r1.startsWith(r2)
            r4 = 7
            if (r2 == 0) goto L_0x0045
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r2 = r10.f1743e
            java.lang.Object r1 = r2.get(r1)
            r6 = r1
            androidx.constraintlayout.widget.a r6 = (androidx.constraintlayout.widget.C0424a) r6
            if (r6 == 0) goto L_0x0008
            r4 = r3
            e.f.b.a.e$b r4 = (p082e.p099f.p106b.p107a.C3597e.C3599b) r4
            int r5 = r10.f1739a
            float r7 = r10.f1815w
            int r8 = r10.f1813u
            float r9 = r10.f1816x
            r4.mo12876j(r5, r6, r7, r8, r9)
            goto L_0x0008
        L_0x0045:
            r1.hashCode()
            r2 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00d1;
                case -1249320805: goto L_0x00c6;
                case -1225497657: goto L_0x00bb;
                case -1225497656: goto L_0x00b0;
                case -1225497655: goto L_0x00a5;
                case -1001078227: goto L_0x009a;
                case -908189618: goto L_0x008f;
                case -908189617: goto L_0x0086;
                case -40300674: goto L_0x007a;
                case -4379043: goto L_0x006d;
                case 37232917: goto L_0x0060;
                case 92909918: goto L_0x0053;
                default: goto L_0x0050;
            }
        L_0x0050:
            r4 = -1
            goto L_0x00dc
        L_0x0053:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x005c
            goto L_0x0050
        L_0x005c:
            r4 = 11
            goto L_0x00dc
        L_0x0060:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0069
            goto L_0x0050
        L_0x0069:
            r4 = 10
            goto L_0x00dc
        L_0x006d:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0076
            goto L_0x0050
        L_0x0076:
            r4 = 9
            goto L_0x00dc
        L_0x007a:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0083
            goto L_0x0050
        L_0x0083:
            r4 = 8
            goto L_0x00dc
        L_0x0086:
            java.lang.String r5 = "scaleY"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x00dc
            goto L_0x0050
        L_0x008f:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0098
            goto L_0x0050
        L_0x0098:
            r4 = 6
            goto L_0x00dc
        L_0x009a:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00a3
            goto L_0x0050
        L_0x00a3:
            r4 = 5
            goto L_0x00dc
        L_0x00a5:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00ae
            goto L_0x0050
        L_0x00ae:
            r4 = 4
            goto L_0x00dc
        L_0x00b0:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00b9
            goto L_0x0050
        L_0x00b9:
            r4 = 3
            goto L_0x00dc
        L_0x00bb:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00c4
            goto L_0x0050
        L_0x00c4:
            r4 = 2
            goto L_0x00dc
        L_0x00c6:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00cf
            goto L_0x0050
        L_0x00cf:
            r4 = 1
            goto L_0x00dc
        L_0x00d1:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00db
            goto L_0x0050
        L_0x00db:
            r4 = 0
        L_0x00dc:
            switch(r4) {
                case 0: goto L_0x0203;
                case 1: goto L_0x01ec;
                case 2: goto L_0x01d5;
                case 3: goto L_0x01be;
                case 4: goto L_0x01a7;
                case 5: goto L_0x0190;
                case 6: goto L_0x0179;
                case 7: goto L_0x0162;
                case 8: goto L_0x014b;
                case 9: goto L_0x0134;
                case 10: goto L_0x011d;
                case 11: goto L_0x0106;
                default: goto L_0x00df;
            }
        L_0x00df:
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            int r2 = r2 + 20
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "UNKNOWN addValues \""
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = "\""
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "KeyTimeCycles"
            android.util.Log.e(r2, r1)
            goto L_0x0008
        L_0x0106:
            float r1 = r10.f1801i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1739a
            float r5 = r10.f1801i
            float r6 = r10.f1815w
            int r7 = r10.f1813u
            float r8 = r10.f1816x
            r3.mo12564b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x011d:
            float r1 = r10.f1806n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1739a
            float r5 = r10.f1806n
            float r6 = r10.f1815w
            int r7 = r10.f1813u
            float r8 = r10.f1816x
            r3.mo12564b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0134:
            float r1 = r10.f1802j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1739a
            float r5 = r10.f1802j
            float r6 = r10.f1815w
            int r7 = r10.f1813u
            float r8 = r10.f1816x
            r3.mo12564b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x014b:
            float r1 = r10.f1803k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1739a
            float r5 = r10.f1803k
            float r6 = r10.f1815w
            int r7 = r10.f1813u
            float r8 = r10.f1816x
            r3.mo12564b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0162:
            float r1 = r10.f1808p
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1739a
            float r5 = r10.f1808p
            float r6 = r10.f1815w
            int r7 = r10.f1813u
            float r8 = r10.f1816x
            r3.mo12564b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0179:
            float r1 = r10.f1807o
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1739a
            float r5 = r10.f1807o
            float r6 = r10.f1815w
            int r7 = r10.f1813u
            float r8 = r10.f1816x
            r3.mo12564b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0190:
            float r1 = r10.f1812t
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1739a
            float r5 = r10.f1812t
            float r6 = r10.f1815w
            int r7 = r10.f1813u
            float r8 = r10.f1816x
            r3.mo12564b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01a7:
            float r1 = r10.f1811s
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1739a
            float r5 = r10.f1811s
            float r6 = r10.f1815w
            int r7 = r10.f1813u
            float r8 = r10.f1816x
            r3.mo12564b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01be:
            float r1 = r10.f1810r
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1739a
            float r5 = r10.f1810r
            float r6 = r10.f1815w
            int r7 = r10.f1813u
            float r8 = r10.f1816x
            r3.mo12564b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01d5:
            float r1 = r10.f1809q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1739a
            float r5 = r10.f1809q
            float r6 = r10.f1815w
            int r7 = r10.f1813u
            float r8 = r10.f1816x
            r3.mo12564b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01ec:
            float r1 = r10.f1805m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1739a
            float r5 = r10.f1805m
            float r6 = r10.f1815w
            int r7 = r10.f1813u
            float r8 = r10.f1816x
            r3.mo12564b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0203:
            float r1 = r10.f1804l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1739a
            float r5 = r10.f1804l
            float r6 = r10.f1815w
            int r7 = r10.f1813u
            float r8 = r10.f1816x
            r3.mo12564b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x021a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0391k.mo2561U(java.util.HashMap):void");
    }

    /* renamed from: a */
    public void mo2539a(HashMap<String, C3580c> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    /* renamed from: b */
    public C0382e clone() {
        C0391k kVar = new C0391k();
        kVar.mo2541c(this);
        return kVar;
    }

    /* renamed from: c */
    public C0382e mo2541c(C0382e eVar) {
        super.mo2541c(eVar);
        C0391k kVar = (C0391k) eVar;
        this.f1799g = kVar.f1799g;
        this.f1800h = kVar.f1800h;
        this.f1813u = kVar.f1813u;
        this.f1815w = kVar.f1815w;
        this.f1816x = kVar.f1816x;
        this.f1812t = kVar.f1812t;
        this.f1801i = kVar.f1801i;
        this.f1802j = kVar.f1802j;
        this.f1803k = kVar.f1803k;
        this.f1806n = kVar.f1806n;
        this.f1804l = kVar.f1804l;
        this.f1805m = kVar.f1805m;
        this.f1807o = kVar.f1807o;
        this.f1808p = kVar.f1808p;
        this.f1809q = kVar.f1809q;
        this.f1810r = kVar.f1810r;
        this.f1811s = kVar.f1811s;
        return this;
    }

    /* renamed from: d */
    public void mo2543d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f1801i)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f1802j)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f1803k)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f1804l)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f1805m)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f1809q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f1810r)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f1811s)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f1806n)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f1807o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f1808p)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f1812t)) {
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
        C0392a.m2399a(this, context.obtainStyledAttributes(attributeSet, C0439f.KeyTimeCycle));
    }

    /* renamed from: h */
    public void mo2547h(HashMap<String, Integer> hashMap) {
        if (this.f1800h != -1) {
            if (!Float.isNaN(this.f1801i)) {
                hashMap.put("alpha", Integer.valueOf(this.f1800h));
            }
            if (!Float.isNaN(this.f1802j)) {
                hashMap.put("elevation", Integer.valueOf(this.f1800h));
            }
            if (!Float.isNaN(this.f1803k)) {
                hashMap.put("rotation", Integer.valueOf(this.f1800h));
            }
            if (!Float.isNaN(this.f1804l)) {
                hashMap.put("rotationX", Integer.valueOf(this.f1800h));
            }
            if (!Float.isNaN(this.f1805m)) {
                hashMap.put("rotationY", Integer.valueOf(this.f1800h));
            }
            if (!Float.isNaN(this.f1809q)) {
                hashMap.put("translationX", Integer.valueOf(this.f1800h));
            }
            if (!Float.isNaN(this.f1810r)) {
                hashMap.put("translationY", Integer.valueOf(this.f1800h));
            }
            if (!Float.isNaN(this.f1811s)) {
                hashMap.put("translationZ", Integer.valueOf(this.f1800h));
            }
            if (!Float.isNaN(this.f1806n)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f1800h));
            }
            if (!Float.isNaN(this.f1807o)) {
                hashMap.put("scaleX", Integer.valueOf(this.f1800h));
            }
            if (!Float.isNaN(this.f1807o)) {
                hashMap.put("scaleY", Integer.valueOf(this.f1800h));
            }
            if (!Float.isNaN(this.f1812t)) {
                hashMap.put("progress", Integer.valueOf(this.f1800h));
            }
            if (this.f1743e.size() > 0) {
                for (String valueOf : this.f1743e.keySet()) {
                    String valueOf2 = String.valueOf(valueOf);
                    hashMap.put(valueOf2.length() != 0 ? "CUSTOM,".concat(valueOf2) : new String("CUSTOM,"), Integer.valueOf(this.f1800h));
                }
            }
        }
    }
}
