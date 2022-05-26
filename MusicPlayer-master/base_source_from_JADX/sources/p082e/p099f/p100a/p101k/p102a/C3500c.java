package p082e.p099f.p100a.p101k.p102a;

import java.io.PrintStream;
import java.util.Arrays;

/* renamed from: e.f.a.k.a.c */
/* compiled from: Easing */
public class C3500c {

    /* renamed from: b */
    static C3500c f11186b = new C3500c();

    /* renamed from: c */
    public static String[] f11187c = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: a */
    String f11188a = "identity";

    /* renamed from: e.f.a.k.a.c$a */
    /* compiled from: Easing */
    static class C3501a extends C3500c {

        /* renamed from: h */
        private static double f11189h = 0.01d;

        /* renamed from: i */
        private static double f11190i = 1.0E-4d;

        /* renamed from: d */
        double f11191d;

        /* renamed from: e */
        double f11192e;

        /* renamed from: f */
        double f11193f;

        /* renamed from: g */
        double f11194g;

        C3501a(String str) {
            this.f11188a = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.f11191d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i);
            this.f11192e = Double.parseDouble(str.substring(i, indexOf3).trim());
            int i2 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i2);
            this.f11193f = Double.parseDouble(str.substring(i2, indexOf4).trim());
            int i3 = indexOf4 + 1;
            this.f11194g = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        /* renamed from: d */
        private double m15020d(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.f11191d * d2 * d3 * d) + (this.f11193f * d3 * d * d) + (d * d * d);
        }

        /* renamed from: e */
        private double m15021e(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.f11192e * d2 * d3 * d) + (this.f11194g * d3 * d * d) + (d * d * d);
        }

        /* renamed from: a */
        public double mo12523a(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f11189h) {
                d2 *= 0.5d;
                d3 = m15020d(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double d5 = m15020d(d4);
            double d6 = d3 + d2;
            double d7 = m15020d(d6);
            double e = m15021e(d4);
            return (((m15021e(d6) - e) * (d - d5)) / (d7 - d5)) + e;
        }

        /* renamed from: b */
        public double mo12524b(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f11190i) {
                d2 *= 0.5d;
                d3 = m15020d(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double d5 = d3 + d2;
            return (m15021e(d5) - m15021e(d4)) / (m15020d(d5) - m15020d(d4));
        }
    }

    /* renamed from: c */
    public static C3500c m15017c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new C3501a(str);
        }
        if (str.startsWith("spline")) {
            return new C3514l(str);
        }
        if (str.startsWith("Schlick")) {
            return new C3510i(str);
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals("accelerate")) {
                    c = 0;
                    break;
                }
                break;
            case -1263948740:
                if (str.equals("decelerate")) {
                    c = 1;
                    break;
                }
                break;
            case -1197605014:
                if (str.equals("anticipate")) {
                    c = 2;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c = 3;
                    break;
                }
                break;
            case -749065269:
                if (str.equals("overshoot")) {
                    c = 4;
                    break;
                }
                break;
            case 1312628413:
                if (str.equals("standard")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C3501a("cubic(0.4, 0.05, 0.8, 0.7)");
            case 1:
                return new C3501a("cubic(0.0, 0.0, 0.2, 0.95)");
            case 2:
                return new C3501a("cubic(0.36, 0, 0.66, -0.56)");
            case 3:
                return new C3501a("cubic(1, 1, 0, 0)");
            case 4:
                return new C3501a("cubic(0.34, 1.56, 0.64, 1)");
            case 5:
                return new C3501a("cubic(0.4, 0.0, 0.2, 1)");
            default:
                PrintStream printStream = System.err;
                printStream.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f11187c));
                return f11186b;
        }
    }

    /* renamed from: a */
    public double mo12523a(double d) {
        return d;
    }

    /* renamed from: b */
    public double mo12524b(double d) {
        return 1.0d;
    }

    public String toString() {
        return this.f11188a;
    }
}
