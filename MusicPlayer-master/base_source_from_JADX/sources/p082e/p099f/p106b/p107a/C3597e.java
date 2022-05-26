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
import p082e.p099f.p100a.p101k.p102a.C3502d;
import p082e.p099f.p100a.p101k.p102a.C3517o;

/* renamed from: e.f.b.a.e */
/* compiled from: ViewTimeCycle */
public abstract class C3597e extends C3517o {

    /* renamed from: e.f.b.a.e$a */
    /* compiled from: ViewTimeCycle */
    static class C3598a extends C3597e {
        C3598a() {
        }

        /* renamed from: i */
        public boolean mo12875i(View view, float f, long j, C3502d dVar) {
            view.setAlpha(mo12874f(f, j, view, dVar));
            return this.f11270h;
        }
    }

    /* renamed from: e.f.b.a.e$b */
    /* compiled from: ViewTimeCycle */
    public static class C3599b extends C3597e {

        /* renamed from: l */
        String f11581l;

        /* renamed from: m */
        SparseArray<C0424a> f11582m;

        /* renamed from: n */
        SparseArray<float[]> f11583n = new SparseArray<>();

        /* renamed from: o */
        float[] f11584o;

        /* renamed from: p */
        float[] f11585p;

        public C3599b(String str, SparseArray<C0424a> sparseArray) {
            this.f11581l = str.split(",")[1];
            this.f11582m = sparseArray;
        }

        /* renamed from: b */
        public void mo12564b(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        /* renamed from: e */
        public void mo12567e(int i) {
            int size = this.f11582m.size();
            int h = this.f11582m.valueAt(0).mo2936h();
            double[] dArr = new double[size];
            int i2 = h + 2;
            this.f11584o = new float[i2];
            this.f11585p = new float[h];
            int[] iArr = new int[2];
            iArr[1] = i2;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = this.f11582m.keyAt(i3);
                float[] valueAt = this.f11583n.valueAt(i3);
                dArr[i3] = ((double) keyAt) * 0.01d;
                this.f11582m.valueAt(i3).mo2934f(this.f11584o);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.f11584o;
                    if (i4 >= fArr.length) {
                        break;
                    }
                    dArr2[i3][i4] = (double) fArr[i4];
                    i4++;
                }
                dArr2[i3][h] = (double) valueAt[0];
                dArr2[i3][h + 1] = (double) valueAt[1];
            }
            this.f11263a = C3498b.m15003a(i, dArr, dArr2);
        }

        /* renamed from: i */
        public boolean mo12875i(View view, float f, long j, C3502d dVar) {
            View view2 = view;
            long j2 = j;
            this.f11263a.mo12509e((double) f, this.f11584o);
            float[] fArr = this.f11584o;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j3 = j2 - this.f11271i;
            if (Float.isNaN(this.f11272j)) {
                float a = dVar.mo12526a(view2, this.f11581l, 0);
                this.f11272j = a;
                if (Float.isNaN(a)) {
                    this.f11272j = 0.0f;
                }
            }
            float f4 = (float) ((((double) this.f11272j) + ((((double) j3) * 1.0E-9d) * ((double) f2))) % 1.0d);
            this.f11272j = f4;
            this.f11271i = j2;
            float a2 = mo12563a(f4);
            this.f11270h = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.f11585p;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.f11270h;
                float[] fArr3 = this.f11584o;
                this.f11270h = z | (((double) fArr3[i]) != 0.0d);
                fArr2[i] = (fArr3[i] * a2) + f3;
                i++;
            }
            this.f11582m.valueAt(0).mo2937k(view2, this.f11585p);
            if (f2 != 0.0f) {
                this.f11270h = true;
            }
            return this.f11270h;
        }

        /* renamed from: j */
        public void mo12876j(int i, C0424a aVar, float f, int i2, float f2) {
            this.f11582m.append(i, aVar);
            this.f11583n.append(i, new float[]{f, f2});
            this.f11264b = Math.max(this.f11264b, i2);
        }
    }

    /* renamed from: e.f.b.a.e$c */
    /* compiled from: ViewTimeCycle */
    static class C3600c extends C3597e {
        C3600c() {
        }

        /* renamed from: i */
        public boolean mo12875i(View view, float f, long j, C3502d dVar) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation(mo12874f(f, j, view, dVar));
            }
            return this.f11270h;
        }
    }

    /* renamed from: e.f.b.a.e$d */
    /* compiled from: ViewTimeCycle */
    public static class C3601d extends C3597e {
        /* renamed from: i */
        public boolean mo12875i(View view, float f, long j, C3502d dVar) {
            return this.f11270h;
        }

        /* renamed from: j */
        public boolean mo12877j(View view, C3502d dVar, float f, long j, double d, double d2) {
            view.setRotation(mo12874f(f, j, view, dVar) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.f11270h;
        }
    }

    /* renamed from: e.f.b.a.e$e */
    /* compiled from: ViewTimeCycle */
    static class C3602e extends C3597e {

        /* renamed from: l */
        boolean f11586l = false;

        C3602e() {
        }

        /* renamed from: i */
        public boolean mo12875i(View view, float f, long j, C3502d dVar) {
            View view2 = view;
            if (view2 instanceof MotionLayout) {
                ((MotionLayout) view2).setProgress(mo12874f(f, j, view, dVar));
            } else if (this.f11586l) {
                return false;
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f11586l = true;
                }
                Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, new Object[]{Float.valueOf(mo12874f(f, j, view, dVar))});
                    } catch (IllegalAccessException e) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e2);
                    }
                }
            }
            return this.f11270h;
        }
    }

    /* renamed from: e.f.b.a.e$f */
    /* compiled from: ViewTimeCycle */
    static class C3603f extends C3597e {
        C3603f() {
        }

        /* renamed from: i */
        public boolean mo12875i(View view, float f, long j, C3502d dVar) {
            view.setRotation(mo12874f(f, j, view, dVar));
            return this.f11270h;
        }
    }

    /* renamed from: e.f.b.a.e$g */
    /* compiled from: ViewTimeCycle */
    static class C3604g extends C3597e {
        C3604g() {
        }

        /* renamed from: i */
        public boolean mo12875i(View view, float f, long j, C3502d dVar) {
            view.setRotationX(mo12874f(f, j, view, dVar));
            return this.f11270h;
        }
    }

    /* renamed from: e.f.b.a.e$h */
    /* compiled from: ViewTimeCycle */
    static class C3605h extends C3597e {
        C3605h() {
        }

        /* renamed from: i */
        public boolean mo12875i(View view, float f, long j, C3502d dVar) {
            view.setRotationY(mo12874f(f, j, view, dVar));
            return this.f11270h;
        }
    }

    /* renamed from: e.f.b.a.e$i */
    /* compiled from: ViewTimeCycle */
    static class C3606i extends C3597e {
        C3606i() {
        }

        /* renamed from: i */
        public boolean mo12875i(View view, float f, long j, C3502d dVar) {
            view.setScaleX(mo12874f(f, j, view, dVar));
            return this.f11270h;
        }
    }

    /* renamed from: e.f.b.a.e$j */
    /* compiled from: ViewTimeCycle */
    static class C3607j extends C3597e {
        C3607j() {
        }

        /* renamed from: i */
        public boolean mo12875i(View view, float f, long j, C3502d dVar) {
            view.setScaleY(mo12874f(f, j, view, dVar));
            return this.f11270h;
        }
    }

    /* renamed from: e.f.b.a.e$k */
    /* compiled from: ViewTimeCycle */
    static class C3608k extends C3597e {
        C3608k() {
        }

        /* renamed from: i */
        public boolean mo12875i(View view, float f, long j, C3502d dVar) {
            view.setTranslationX(mo12874f(f, j, view, dVar));
            return this.f11270h;
        }
    }

    /* renamed from: e.f.b.a.e$l */
    /* compiled from: ViewTimeCycle */
    static class C3609l extends C3597e {
        C3609l() {
        }

        /* renamed from: i */
        public boolean mo12875i(View view, float f, long j, C3502d dVar) {
            view.setTranslationY(mo12874f(f, j, view, dVar));
            return this.f11270h;
        }
    }

    /* renamed from: e.f.b.a.e$m */
    /* compiled from: ViewTimeCycle */
    static class C3610m extends C3597e {
        C3610m() {
        }

        /* renamed from: i */
        public boolean mo12875i(View view, float f, long j, C3502d dVar) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(mo12874f(f, j, view, dVar));
            }
            return this.f11270h;
        }
    }

    /* renamed from: g */
    public static C3597e m15562g(String str, SparseArray<C0424a> sparseArray) {
        return new C3599b(str, sparseArray);
    }

    /* renamed from: h */
    public static C3597e m15563h(String str, long j) {
        C3597e eVar;
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
        }
        switch (c) {
            case 0:
                eVar = new C3604g();
                break;
            case 1:
                eVar = new C3605h();
                break;
            case 2:
                eVar = new C3608k();
                break;
            case 3:
                eVar = new C3609l();
                break;
            case 4:
                eVar = new C3610m();
                break;
            case 5:
                eVar = new C3602e();
                break;
            case 6:
                eVar = new C3606i();
                break;
            case 7:
                eVar = new C3607j();
                break;
            case 8:
                eVar = new C3603f();
                break;
            case 9:
                eVar = new C3600c();
                break;
            case 10:
                eVar = new C3601d();
                break;
            case 11:
                eVar = new C3598a();
                break;
            default:
                return null;
        }
        eVar.mo12565c(j);
        return eVar;
    }

    /* renamed from: f */
    public float mo12874f(float f, long j, View view, C3502d dVar) {
        long j2 = j;
        View view2 = view;
        C3502d dVar2 = dVar;
        this.f11263a.mo12509e((double) f, this.f11269g);
        float[] fArr = this.f11269g;
        float f2 = fArr[1];
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i == 0) {
            this.f11270h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f11272j)) {
            float a = dVar2.mo12526a(view2, this.f11268f, 0);
            this.f11272j = a;
            if (Float.isNaN(a)) {
                this.f11272j = 0.0f;
            }
        }
        float f3 = (float) ((((double) this.f11272j) + ((((double) (j2 - this.f11271i)) * 1.0E-9d) * ((double) f2))) % 1.0d);
        this.f11272j = f3;
        dVar2.mo12527b(view2, this.f11268f, 0, f3);
        this.f11271i = j2;
        float f4 = this.f11269g[0];
        float a2 = (mo12563a(this.f11272j) * f4) + this.f11269g[2];
        this.f11270h = (f4 == 0.0f && i == 0) ? false : true;
        return a2;
    }

    /* renamed from: i */
    public abstract boolean mo12875i(View view, float f, long j, C3502d dVar);
}
