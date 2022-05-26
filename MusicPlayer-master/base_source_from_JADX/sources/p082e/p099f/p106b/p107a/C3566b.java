package p082e.p099f.p106b.p107a;

import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0424a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p082e.p099f.p100a.p101k.p102a.C3503e;

/* renamed from: e.f.b.a.b */
/* compiled from: ViewOscillator */
public abstract class C3566b extends C3503e {

    /* renamed from: e.f.b.a.b$a */
    /* compiled from: ViewOscillator */
    static class C3567a extends C3566b {
        C3567a() {
        }

        /* renamed from: j */
        public void mo12867j(View view, float f) {
            view.setAlpha(mo12528a(f));
        }
    }

    /* renamed from: e.f.b.a.b$b */
    /* compiled from: ViewOscillator */
    static class C3568b extends C3566b {

        /* renamed from: g */
        float[] f11570g = new float[1];

        /* renamed from: h */
        protected C0424a f11571h;

        C3568b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo12530c(Object obj) {
            this.f11571h = (C0424a) obj;
        }

        /* renamed from: j */
        public void mo12867j(View view, float f) {
            this.f11570g[0] = mo12528a(f);
            this.f11571h.mo2937k(view, this.f11570g);
        }
    }

    /* renamed from: e.f.b.a.b$c */
    /* compiled from: ViewOscillator */
    static class C3569c extends C3566b {
        C3569c() {
        }

        /* renamed from: j */
        public void mo12867j(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation(mo12528a(f));
            }
        }
    }

    /* renamed from: e.f.b.a.b$d */
    /* compiled from: ViewOscillator */
    public static class C3570d extends C3566b {
        /* renamed from: j */
        public void mo12867j(View view, float f) {
        }

        /* renamed from: k */
        public void mo12868k(View view, float f, double d, double d2) {
            view.setRotation(mo12528a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* renamed from: e.f.b.a.b$e */
    /* compiled from: ViewOscillator */
    static class C3571e extends C3566b {

        /* renamed from: g */
        boolean f11572g = false;

        C3571e() {
        }

        /* renamed from: j */
        public void mo12867j(View view, float f) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo12528a(f));
            } else if (!this.f11572g) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f11572g = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(mo12528a(f))});
                    } catch (IllegalAccessException e) {
                        Log.e("ViewOscillator", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("ViewOscillator", "unable to setProgress", e2);
                    }
                }
            }
        }
    }

    /* renamed from: e.f.b.a.b$f */
    /* compiled from: ViewOscillator */
    static class C3572f extends C3566b {
        C3572f() {
        }

        /* renamed from: j */
        public void mo12867j(View view, float f) {
            view.setRotation(mo12528a(f));
        }
    }

    /* renamed from: e.f.b.a.b$g */
    /* compiled from: ViewOscillator */
    static class C3573g extends C3566b {
        C3573g() {
        }

        /* renamed from: j */
        public void mo12867j(View view, float f) {
            view.setRotationX(mo12528a(f));
        }
    }

    /* renamed from: e.f.b.a.b$h */
    /* compiled from: ViewOscillator */
    static class C3574h extends C3566b {
        C3574h() {
        }

        /* renamed from: j */
        public void mo12867j(View view, float f) {
            view.setRotationY(mo12528a(f));
        }
    }

    /* renamed from: e.f.b.a.b$i */
    /* compiled from: ViewOscillator */
    static class C3575i extends C3566b {
        C3575i() {
        }

        /* renamed from: j */
        public void mo12867j(View view, float f) {
            view.setScaleX(mo12528a(f));
        }
    }

    /* renamed from: e.f.b.a.b$j */
    /* compiled from: ViewOscillator */
    static class C3576j extends C3566b {
        C3576j() {
        }

        /* renamed from: j */
        public void mo12867j(View view, float f) {
            view.setScaleY(mo12528a(f));
        }
    }

    /* renamed from: e.f.b.a.b$k */
    /* compiled from: ViewOscillator */
    static class C3577k extends C3566b {
        C3577k() {
        }

        /* renamed from: j */
        public void mo12867j(View view, float f) {
            view.setTranslationX(mo12528a(f));
        }
    }

    /* renamed from: e.f.b.a.b$l */
    /* compiled from: ViewOscillator */
    static class C3578l extends C3566b {
        C3578l() {
        }

        /* renamed from: j */
        public void mo12867j(View view, float f) {
            view.setTranslationY(mo12528a(f));
        }
    }

    /* renamed from: e.f.b.a.b$m */
    /* compiled from: ViewOscillator */
    static class C3579m extends C3566b {
        C3579m() {
        }

        /* renamed from: j */
        public void mo12867j(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(mo12528a(f));
            }
        }
    }

    /* renamed from: i */
    public static C3566b m15521i(String str) {
        if (str.startsWith("CUSTOM")) {
            return new C3568b();
        }
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
            case -40300674:
                if (str.equals("rotation")) {
                    c = 9;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = 10;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 12;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = 13;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C3573g();
            case 1:
                return new C3574h();
            case 2:
                return new C3577k();
            case 3:
                return new C3578l();
            case 4:
                return new C3579m();
            case 5:
                return new C3571e();
            case 6:
                return new C3575i();
            case 7:
                return new C3576j();
            case 8:
                return new C3567a();
            case 9:
                return new C3572f();
            case 10:
                return new C3569c();
            case 11:
                return new C3570d();
            case 12:
                return new C3567a();
            case 13:
                return new C3567a();
            default:
                return null;
        }
    }

    /* renamed from: j */
    public abstract void mo12867j(View view, float f);
}
