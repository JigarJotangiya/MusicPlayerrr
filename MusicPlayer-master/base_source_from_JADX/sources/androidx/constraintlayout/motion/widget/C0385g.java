package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.C0424a;
import androidx.constraintlayout.widget.C0439f;
import java.util.HashMap;
import java.util.HashSet;
import p082e.p099f.p100a.p101k.p102a.C3511j;
import p082e.p099f.p106b.p107a.C3566b;
import p082e.p099f.p106b.p107a.C3580c;

/* renamed from: androidx.constraintlayout.motion.widget.g */
/* compiled from: KeyCycle */
public class C0385g extends C0382e {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f1762g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f1763h = 0;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f1764i = -1;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f1765j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public float f1766k = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public float f1767l = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public float f1768m = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public float f1769n = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f1770o = -1;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public float f1771p = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public float f1772q = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public float f1773r = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public float f1774s = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public float f1775t = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public float f1776u = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public float f1777v = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public float f1778w = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public float f1779x = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public float f1780y = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public float f1781z = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.g$a */
    /* compiled from: KeyCycle */
    private static class C0386a {

        /* renamed from: a */
        private static SparseIntArray f1782a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1782a = sparseIntArray;
            sparseIntArray.append(C0439f.KeyCycle_motionTarget, 1);
            f1782a.append(C0439f.KeyCycle_framePosition, 2);
            f1782a.append(C0439f.KeyCycle_transitionEasing, 3);
            f1782a.append(C0439f.KeyCycle_curveFit, 4);
            f1782a.append(C0439f.KeyCycle_waveShape, 5);
            f1782a.append(C0439f.KeyCycle_wavePeriod, 6);
            f1782a.append(C0439f.KeyCycle_waveOffset, 7);
            f1782a.append(C0439f.KeyCycle_waveVariesBy, 8);
            f1782a.append(C0439f.KeyCycle_android_alpha, 9);
            f1782a.append(C0439f.KeyCycle_android_elevation, 10);
            f1782a.append(C0439f.KeyCycle_android_rotation, 11);
            f1782a.append(C0439f.KeyCycle_android_rotationX, 12);
            f1782a.append(C0439f.KeyCycle_android_rotationY, 13);
            f1782a.append(C0439f.KeyCycle_transitionPathRotate, 14);
            f1782a.append(C0439f.KeyCycle_android_scaleX, 15);
            f1782a.append(C0439f.KeyCycle_android_scaleY, 16);
            f1782a.append(C0439f.KeyCycle_android_translationX, 17);
            f1782a.append(C0439f.KeyCycle_android_translationY, 18);
            f1782a.append(C0439f.KeyCycle_android_translationZ, 19);
            f1782a.append(C0439f.KeyCycle_motionProgress, 20);
            f1782a.append(C0439f.KeyCycle_wavePhase, 21);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m2344b(C0385g gVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f1782a.get(index)) {
                    case 1:
                        if (!MotionLayout.f1622Y0) {
                            if (typedArray.peekValue(index).type != 3) {
                                gVar.f1740b = typedArray.getResourceId(index, gVar.f1740b);
                                break;
                            } else {
                                gVar.f1741c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, gVar.f1740b);
                            gVar.f1740b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                gVar.f1741c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 2:
                        gVar.f1739a = typedArray.getInt(index, gVar.f1739a);
                        break;
                    case 3:
                        String unused = gVar.f1762g = typedArray.getString(index);
                        break;
                    case 4:
                        int unused2 = gVar.f1763h = typedArray.getInteger(index, gVar.f1763h);
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type != 3) {
                            int unused3 = gVar.f1764i = typedArray.getInt(index, gVar.f1764i);
                            break;
                        } else {
                            String unused4 = gVar.f1765j = typedArray.getString(index);
                            int unused5 = gVar.f1764i = 7;
                            break;
                        }
                    case 6:
                        float unused6 = gVar.f1766k = typedArray.getFloat(index, gVar.f1766k);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type != 5) {
                            float unused7 = gVar.f1767l = typedArray.getFloat(index, gVar.f1767l);
                            break;
                        } else {
                            float unused8 = gVar.f1767l = typedArray.getDimension(index, gVar.f1767l);
                            break;
                        }
                    case 8:
                        int unused9 = gVar.f1770o = typedArray.getInt(index, gVar.f1770o);
                        break;
                    case 9:
                        float unused10 = gVar.f1771p = typedArray.getFloat(index, gVar.f1771p);
                        break;
                    case 10:
                        float unused11 = gVar.f1772q = typedArray.getDimension(index, gVar.f1772q);
                        break;
                    case 11:
                        float unused12 = gVar.f1773r = typedArray.getFloat(index, gVar.f1773r);
                        break;
                    case 12:
                        float unused13 = gVar.f1775t = typedArray.getFloat(index, gVar.f1775t);
                        break;
                    case 13:
                        float unused14 = gVar.f1776u = typedArray.getFloat(index, gVar.f1776u);
                        break;
                    case 14:
                        float unused15 = gVar.f1774s = typedArray.getFloat(index, gVar.f1774s);
                        break;
                    case 15:
                        float unused16 = gVar.f1777v = typedArray.getFloat(index, gVar.f1777v);
                        break;
                    case 16:
                        float unused17 = gVar.f1778w = typedArray.getFloat(index, gVar.f1778w);
                        break;
                    case 17:
                        float unused18 = gVar.f1779x = typedArray.getDimension(index, gVar.f1779x);
                        break;
                    case 18:
                        float unused19 = gVar.f1780y = typedArray.getDimension(index, gVar.f1780y);
                        break;
                    case 19:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            float unused20 = gVar.f1781z = typedArray.getDimension(index, gVar.f1781z);
                            break;
                        }
                    case 20:
                        float unused21 = gVar.f1769n = typedArray.getFloat(index, gVar.f1769n);
                        break;
                    case 21:
                        float unused22 = gVar.f1768m = typedArray.getFloat(index, gVar.f1768m) / 360.0f;
                        break;
                    default:
                        String hexString = Integer.toHexString(index);
                        int i2 = f1782a.get(index);
                        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 33);
                        sb.append("unused attribute 0x");
                        sb.append(hexString);
                        sb.append("   ");
                        sb.append(i2);
                        Log.e("KeyCycle", sb.toString());
                        break;
                }
            }
        }
    }

    public C0385g() {
        this.f1742d = 4;
        this.f1743e = new HashMap<>();
    }

    /* renamed from: Y */
    public void mo2553Y(HashMap<String, C3566b> hashMap) {
        C3566b bVar;
        C3566b bVar2;
        HashMap<String, C3566b> hashMap2 = hashMap;
        for (String next : hashMap.keySet()) {
            if (next.startsWith("CUSTOM")) {
                C0424a aVar = this.f1743e.get(next.substring(7));
                if (!(aVar == null || aVar.mo2932d() != C0424a.C0426b.FLOAT_TYPE || (bVar2 = hashMap2.get(next)) == null)) {
                    bVar2.mo12532e(this.f1739a, this.f1764i, this.f1765j, this.f1770o, this.f1766k, this.f1767l, this.f1768m, aVar.mo2933e(), aVar);
                }
            } else {
                float Z = mo2554Z(next);
                if (!Float.isNaN(Z) && (bVar = hashMap2.get(next)) != null) {
                    bVar.mo12531d(this.f1739a, this.f1764i, this.f1765j, this.f1770o, this.f1766k, this.f1767l, this.f1768m, Z);
                }
            }
        }
    }

    /* renamed from: Z */
    public float mo2554Z(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 7;
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c = 8;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = 9;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 10;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 11;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = 12;
                    break;
                }
                break;
            case 1530034690:
                if (str.equals("wavePhase")) {
                    c = 13;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return this.f1775t;
            case 1:
                return this.f1776u;
            case 2:
                return this.f1779x;
            case 3:
                return this.f1780y;
            case 4:
                return this.f1781z;
            case 5:
                return this.f1769n;
            case 6:
                return this.f1777v;
            case 7:
                return this.f1778w;
            case 8:
                return this.f1773r;
            case 9:
                return this.f1772q;
            case 10:
                return this.f1774s;
            case 11:
                return this.f1771p;
            case 12:
                return this.f1767l;
            case 13:
                return this.f1768m;
            default:
                if (str.startsWith("CUSTOM")) {
                    return Float.NaN;
                }
                String valueOf = String.valueOf(str);
                Log.v("WARNING! KeyCycle", valueOf.length() != 0 ? "  UNKNOWN  ".concat(valueOf) : new String("  UNKNOWN  "));
                return Float.NaN;
        }
    }

    /* renamed from: a */
    public void mo2539a(HashMap<String, C3580c> hashMap) {
        int size = hashMap.size();
        StringBuilder sb = new StringBuilder(22);
        sb.append("add ");
        sb.append(size);
        sb.append(" values");
        C0379b.m2245g("KeyCycle", sb.toString(), 2);
        for (String next : hashMap.keySet()) {
            C3511j jVar = hashMap.get(next);
            if (jVar != null) {
                next.hashCode();
                char c = 65535;
                switch (next.hashCode()) {
                    case -1249320806:
                        if (next.equals("rotationX")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1249320805:
                        if (next.equals("rotationY")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1225497657:
                        if (next.equals("translationX")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1225497656:
                        if (next.equals("translationY")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1225497655:
                        if (next.equals("translationZ")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1001078227:
                        if (next.equals("progress")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -908189618:
                        if (next.equals("scaleX")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (next.equals("scaleY")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -40300674:
                        if (next.equals("rotation")) {
                            c = 8;
                            break;
                        }
                        break;
                    case -4379043:
                        if (next.equals("elevation")) {
                            c = 9;
                            break;
                        }
                        break;
                    case 37232917:
                        if (next.equals("transitionPathRotate")) {
                            c = 10;
                            break;
                        }
                        break;
                    case 92909918:
                        if (next.equals("alpha")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 156108012:
                        if (next.equals("waveOffset")) {
                            c = 12;
                            break;
                        }
                        break;
                    case 1530034690:
                        if (next.equals("wavePhase")) {
                            c = 13;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        jVar.mo12553c(this.f1739a, this.f1775t);
                        break;
                    case 1:
                        jVar.mo12553c(this.f1739a, this.f1776u);
                        break;
                    case 2:
                        jVar.mo12553c(this.f1739a, this.f1779x);
                        break;
                    case 3:
                        jVar.mo12553c(this.f1739a, this.f1780y);
                        break;
                    case 4:
                        jVar.mo12553c(this.f1739a, this.f1781z);
                        break;
                    case 5:
                        jVar.mo12553c(this.f1739a, this.f1769n);
                        break;
                    case 6:
                        jVar.mo12553c(this.f1739a, this.f1777v);
                        break;
                    case 7:
                        jVar.mo12553c(this.f1739a, this.f1778w);
                        break;
                    case 8:
                        jVar.mo12553c(this.f1739a, this.f1773r);
                        break;
                    case 9:
                        jVar.mo12553c(this.f1739a, this.f1772q);
                        break;
                    case 10:
                        jVar.mo12553c(this.f1739a, this.f1774s);
                        break;
                    case 11:
                        jVar.mo12553c(this.f1739a, this.f1771p);
                        break;
                    case 12:
                        jVar.mo12553c(this.f1739a, this.f1767l);
                        break;
                    case 13:
                        jVar.mo12553c(this.f1739a, this.f1768m);
                        break;
                    default:
                        if (next.startsWith("CUSTOM")) {
                            break;
                        } else {
                            String valueOf = String.valueOf(next);
                            Log.v("WARNING KeyCycle", valueOf.length() != 0 ? "  UNKNOWN  ".concat(valueOf) : new String("  UNKNOWN  "));
                            break;
                        }
                }
            }
        }
    }

    /* renamed from: b */
    public C0382e clone() {
        C0385g gVar = new C0385g();
        gVar.mo2541c(this);
        return gVar;
    }

    /* renamed from: c */
    public C0382e mo2541c(C0382e eVar) {
        super.mo2541c(eVar);
        C0385g gVar = (C0385g) eVar;
        this.f1762g = gVar.f1762g;
        this.f1763h = gVar.f1763h;
        this.f1764i = gVar.f1764i;
        this.f1765j = gVar.f1765j;
        this.f1766k = gVar.f1766k;
        this.f1767l = gVar.f1767l;
        this.f1768m = gVar.f1768m;
        this.f1769n = gVar.f1769n;
        this.f1770o = gVar.f1770o;
        this.f1771p = gVar.f1771p;
        this.f1772q = gVar.f1772q;
        this.f1773r = gVar.f1773r;
        this.f1774s = gVar.f1774s;
        this.f1775t = gVar.f1775t;
        this.f1776u = gVar.f1776u;
        this.f1777v = gVar.f1777v;
        this.f1778w = gVar.f1778w;
        this.f1779x = gVar.f1779x;
        this.f1780y = gVar.f1780y;
        this.f1781z = gVar.f1781z;
        return this;
    }

    /* renamed from: d */
    public void mo2543d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f1771p)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f1772q)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f1773r)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f1775t)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f1776u)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f1777v)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f1778w)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f1774s)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f1779x)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f1780y)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f1781z)) {
            hashSet.add("translationZ");
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
        C0386a.m2344b(this, context.obtainStyledAttributes(attributeSet, C0439f.KeyCycle));
    }
}
