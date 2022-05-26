package p082e.p099f.p106b.p107a;

import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0424a;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p082e.p099f.p100a.p101k.p102a.C3498b;
import p082e.p099f.p100a.p101k.p102a.C3511j;

/* renamed from: e.f.b.a.c */
/* compiled from: ViewSpline */
public abstract class C3580c extends C3511j {

    /* renamed from: e.f.b.a.c$a */
    /* compiled from: ViewSpline */
    static class C3581a extends C3580c {
        C3581a() {
        }

        /* renamed from: h */
        public void mo12869h(View view, float f) {
            view.setAlpha(mo12551a(f));
        }
    }

    /* renamed from: e.f.b.a.c$b */
    /* compiled from: ViewSpline */
    public static class C3582b extends C3580c {

        /* renamed from: f */
        SparseArray<C0424a> f11573f;

        /* renamed from: g */
        float[] f11574g;

        public C3582b(String str, SparseArray<C0424a> sparseArray) {
            String str2 = str.split(",")[1];
            this.f11573f = sparseArray;
        }

        /* renamed from: c */
        public void mo12553c(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        /* renamed from: e */
        public void mo12555e(int i) {
            int size = this.f11573f.size();
            int h = this.f11573f.valueAt(0).mo2936h();
            double[] dArr = new double[size];
            this.f11574g = new float[h];
            int[] iArr = new int[2];
            iArr[1] = h;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            for (int i2 = 0; i2 < size; i2++) {
                dArr[i2] = ((double) this.f11573f.keyAt(i2)) * 0.01d;
                this.f11573f.valueAt(i2).mo2934f(this.f11574g);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.f11574g;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    dArr2[i2][i3] = (double) fArr[i3];
                    i3++;
                }
            }
            this.f11234a = C3498b.m15003a(i, dArr, dArr2);
        }

        /* renamed from: h */
        public void mo12869h(View view, float f) {
            this.f11234a.mo12509e((double) f, this.f11574g);
            this.f11573f.valueAt(0).mo2937k(view, this.f11574g);
        }

        /* renamed from: i */
        public void mo12870i(int i, C0424a aVar) {
            this.f11573f.append(i, aVar);
        }
    }

    /* renamed from: e.f.b.a.c$c */
    /* compiled from: ViewSpline */
    static class C3583c extends C3580c {
        C3583c() {
        }

        /* renamed from: h */
        public void mo12869h(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation(mo12551a(f));
            }
        }
    }

    /* renamed from: e.f.b.a.c$d */
    /* compiled from: ViewSpline */
    public static class C3584d extends C3580c {
        /* renamed from: h */
        public void mo12869h(View view, float f) {
        }

        /* renamed from: i */
        public void mo12871i(View view, float f, double d, double d2) {
            view.setRotation(mo12551a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* renamed from: e.f.b.a.c$e */
    /* compiled from: ViewSpline */
    static class C3585e extends C3580c {
        C3585e() {
        }

        /* renamed from: h */
        public void mo12869h(View view, float f) {
            view.setPivotX(mo12551a(f));
        }
    }

    /* renamed from: e.f.b.a.c$f */
    /* compiled from: ViewSpline */
    static class C3586f extends C3580c {
        C3586f() {
        }

        /* renamed from: h */
        public void mo12869h(View view, float f) {
            view.setPivotY(mo12551a(f));
        }
    }

    /* renamed from: e.f.b.a.c$g */
    /* compiled from: ViewSpline */
    static class C3587g extends C3580c {

        /* renamed from: f */
        boolean f11575f = false;

        C3587g() {
        }

        /* renamed from: h */
        public void mo12869h(View view, float f) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo12551a(f));
            } else if (!this.f11575f) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f11575f = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(mo12551a(f))});
                    } catch (IllegalAccessException e) {
                        Log.e("ViewSpline", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("ViewSpline", "unable to setProgress", e2);
                    }
                }
            }
        }
    }

    /* renamed from: e.f.b.a.c$h */
    /* compiled from: ViewSpline */
    static class C3588h extends C3580c {
        C3588h() {
        }

        /* renamed from: h */
        public void mo12869h(View view, float f) {
            view.setRotation(mo12551a(f));
        }
    }

    /* renamed from: e.f.b.a.c$i */
    /* compiled from: ViewSpline */
    static class C3589i extends C3580c {
        C3589i() {
        }

        /* renamed from: h */
        public void mo12869h(View view, float f) {
            view.setRotationX(mo12551a(f));
        }
    }

    /* renamed from: e.f.b.a.c$j */
    /* compiled from: ViewSpline */
    static class C3590j extends C3580c {
        C3590j() {
        }

        /* renamed from: h */
        public void mo12869h(View view, float f) {
            view.setRotationY(mo12551a(f));
        }
    }

    /* renamed from: e.f.b.a.c$k */
    /* compiled from: ViewSpline */
    static class C3591k extends C3580c {
        C3591k() {
        }

        /* renamed from: h */
        public void mo12869h(View view, float f) {
            view.setScaleX(mo12551a(f));
        }
    }

    /* renamed from: e.f.b.a.c$l */
    /* compiled from: ViewSpline */
    static class C3592l extends C3580c {
        C3592l() {
        }

        /* renamed from: h */
        public void mo12869h(View view, float f) {
            view.setScaleY(mo12551a(f));
        }
    }

    /* renamed from: e.f.b.a.c$m */
    /* compiled from: ViewSpline */
    static class C3593m extends C3580c {
        C3593m() {
        }

        /* renamed from: h */
        public void mo12869h(View view, float f) {
            view.setTranslationX(mo12551a(f));
        }
    }

    /* renamed from: e.f.b.a.c$n */
    /* compiled from: ViewSpline */
    static class C3594n extends C3580c {
        C3594n() {
        }

        /* renamed from: h */
        public void mo12869h(View view, float f) {
            view.setTranslationY(mo12551a(f));
        }
    }

    /* renamed from: e.f.b.a.c$o */
    /* compiled from: ViewSpline */
    static class C3595o extends C3580c {
        C3595o() {
        }

        /* renamed from: h */
        public void mo12869h(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(mo12551a(f));
            }
        }
    }

    /* renamed from: f */
    public static C3580c m15538f(String str, SparseArray<C0424a> sparseArray) {
        return new C3582b(str, sparseArray);
    }

    /* renamed from: g */
    public static C3580c m15539g(String str) {
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
            case -797520672:
                if (str.equals("waveVariesBy")) {
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
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = 15;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C3589i();
            case 1:
                return new C3590j();
            case 2:
                return new C3593m();
            case 3:
                return new C3594n();
            case 4:
                return new C3595o();
            case 5:
                return new C3587g();
            case 6:
                return new C3591k();
            case 7:
                return new C3592l();
            case 8:
                return new C3581a();
            case 9:
                return new C3585e();
            case 10:
                return new C3586f();
            case 11:
                return new C3588h();
            case 12:
                return new C3583c();
            case 13:
                return new C3584d();
            case 14:
                return new C3581a();
            case 15:
                return new C3581a();
            default:
                return null;
        }
    }

    /* renamed from: h */
    public abstract void mo12869h(View view, float f);
}
