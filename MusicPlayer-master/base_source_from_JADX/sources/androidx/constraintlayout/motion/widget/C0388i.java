package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.C0439f;
import java.util.HashMap;
import p082e.p099f.p100a.p101k.p102a.C3500c;
import p082e.p099f.p106b.p107a.C3580c;

/* renamed from: androidx.constraintlayout.motion.widget.i */
/* compiled from: KeyPosition */
public class C0388i extends C0390j {

    /* renamed from: h */
    String f1785h = null;

    /* renamed from: i */
    int f1786i = C0382e.f1738f;

    /* renamed from: j */
    int f1787j = 0;

    /* renamed from: k */
    float f1788k = Float.NaN;

    /* renamed from: l */
    float f1789l = Float.NaN;

    /* renamed from: m */
    float f1790m = Float.NaN;

    /* renamed from: n */
    float f1791n = Float.NaN;

    /* renamed from: o */
    float f1792o = Float.NaN;

    /* renamed from: p */
    float f1793p = Float.NaN;

    /* renamed from: q */
    int f1794q = 0;

    /* renamed from: r */
    private float f1795r = Float.NaN;

    /* renamed from: s */
    private float f1796s = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.i$a */
    /* compiled from: KeyPosition */
    private static class C0389a {

        /* renamed from: a */
        private static SparseIntArray f1797a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1797a = sparseIntArray;
            sparseIntArray.append(C0439f.KeyPosition_motionTarget, 1);
            f1797a.append(C0439f.KeyPosition_framePosition, 2);
            f1797a.append(C0439f.KeyPosition_transitionEasing, 3);
            f1797a.append(C0439f.KeyPosition_curveFit, 4);
            f1797a.append(C0439f.KeyPosition_drawPath, 5);
            f1797a.append(C0439f.KeyPosition_percentX, 6);
            f1797a.append(C0439f.KeyPosition_percentY, 7);
            f1797a.append(C0439f.KeyPosition_keyPositionType, 9);
            f1797a.append(C0439f.KeyPosition_sizePercent, 8);
            f1797a.append(C0439f.KeyPosition_percentWidth, 11);
            f1797a.append(C0439f.KeyPosition_percentHeight, 12);
            f1797a.append(C0439f.KeyPosition_pathMotionArc, 10);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m2356b(C0388i iVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f1797a.get(index)) {
                    case 1:
                        if (!MotionLayout.f1622Y0) {
                            if (typedArray.peekValue(index).type != 3) {
                                iVar.f1740b = typedArray.getResourceId(index, iVar.f1740b);
                                break;
                            } else {
                                iVar.f1741c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, iVar.f1740b);
                            iVar.f1740b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                iVar.f1741c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 2:
                        iVar.f1739a = typedArray.getInt(index, iVar.f1739a);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type != 3) {
                            iVar.f1785h = C3500c.f11187c[typedArray.getInteger(index, 0)];
                            break;
                        } else {
                            iVar.f1785h = typedArray.getString(index);
                            break;
                        }
                    case 4:
                        iVar.f1798g = typedArray.getInteger(index, iVar.f1798g);
                        break;
                    case 5:
                        iVar.f1787j = typedArray.getInt(index, iVar.f1787j);
                        break;
                    case 6:
                        iVar.f1790m = typedArray.getFloat(index, iVar.f1790m);
                        break;
                    case 7:
                        iVar.f1791n = typedArray.getFloat(index, iVar.f1791n);
                        break;
                    case 8:
                        float f = typedArray.getFloat(index, iVar.f1789l);
                        iVar.f1788k = f;
                        iVar.f1789l = f;
                        break;
                    case 9:
                        iVar.f1794q = typedArray.getInt(index, iVar.f1794q);
                        break;
                    case 10:
                        iVar.f1786i = typedArray.getInt(index, iVar.f1786i);
                        break;
                    case 11:
                        iVar.f1788k = typedArray.getFloat(index, iVar.f1788k);
                        break;
                    case 12:
                        iVar.f1789l = typedArray.getFloat(index, iVar.f1789l);
                        break;
                    default:
                        String hexString = Integer.toHexString(index);
                        int i2 = f1797a.get(index);
                        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 33);
                        sb.append("unused attribute 0x");
                        sb.append(hexString);
                        sb.append("   ");
                        sb.append(i2);
                        Log.e("KeyPosition", sb.toString());
                        break;
                }
            }
            if (iVar.f1739a == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }

    public C0388i() {
        this.f1742d = 2;
    }

    /* renamed from: a */
    public void mo2539a(HashMap<String, C3580c> hashMap) {
    }

    /* renamed from: b */
    public C0382e mo2540b() {
        C0388i iVar = new C0388i();
        iVar.mo2541c(this);
        return iVar;
    }

    /* renamed from: c */
    public C0382e mo2541c(C0382e eVar) {
        super.mo2541c(eVar);
        C0388i iVar = (C0388i) eVar;
        this.f1785h = iVar.f1785h;
        this.f1786i = iVar.f1786i;
        this.f1787j = iVar.f1787j;
        this.f1788k = iVar.f1788k;
        this.f1789l = Float.NaN;
        this.f1790m = iVar.f1790m;
        this.f1791n = iVar.f1791n;
        this.f1792o = iVar.f1792o;
        this.f1793p = iVar.f1793p;
        this.f1795r = iVar.f1795r;
        this.f1796s = iVar.f1796s;
        return this;
    }

    /* renamed from: e */
    public void mo2544e(Context context, AttributeSet attributeSet) {
        C0389a.m2356b(this, context.obtainStyledAttributes(attributeSet, C0439f.KeyPosition));
    }

    /* renamed from: m */
    public void mo2559m(int i) {
        this.f1794q = i;
    }

    /* renamed from: n */
    public void mo2560n(String str, Object obj) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c = 0;
                    break;
                }
                break;
            case -1127236479:
                if (str.equals("percentWidth")) {
                    c = 1;
                    break;
                }
                break;
            case -1017587252:
                if (str.equals("percentHeight")) {
                    c = 2;
                    break;
                }
                break;
            case -827014263:
                if (str.equals("drawPath")) {
                    c = 3;
                    break;
                }
                break;
            case -200259324:
                if (str.equals("sizePercent")) {
                    c = 4;
                    break;
                }
                break;
            case 428090547:
                if (str.equals("percentX")) {
                    c = 5;
                    break;
                }
                break;
            case 428090548:
                if (str.equals("percentY")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f1785h = obj.toString();
                return;
            case 1:
                this.f1788k = mo2550k(obj);
                return;
            case 2:
                this.f1789l = mo2550k(obj);
                return;
            case 3:
                this.f1787j = mo2551l(obj);
                return;
            case 4:
                float k = mo2550k(obj);
                this.f1788k = k;
                this.f1789l = k;
                return;
            case 5:
                this.f1790m = mo2550k(obj);
                return;
            case 6:
                this.f1791n = mo2550k(obj);
                return;
            default:
                return;
        }
    }
}
