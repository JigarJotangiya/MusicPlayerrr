package p082e.p099f.p100a.p101k.p102a;

/* renamed from: e.f.a.k.a.i */
/* compiled from: Schlick */
public class C3510i extends C3500c {

    /* renamed from: d */
    double f11232d;

    /* renamed from: e */
    double f11233e;

    C3510i(String str) {
        this.f11188a = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.f11232d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i = indexOf2 + 1;
        this.f11233e = Double.parseDouble(str.substring(i, str.indexOf(44, i)).trim());
    }

    /* renamed from: d */
    private double m15062d(double d) {
        double d2 = this.f11233e;
        if (d < d2) {
            double d3 = this.f11232d;
            return ((d3 * d2) * d2) / ((((d2 - d) * d3) + d) * ((d3 * (d2 - d)) + d));
        }
        double d4 = this.f11232d;
        return (((d2 - 1.0d) * d4) * (d2 - 1.0d)) / (((((-d4) * (d2 - d)) - d) + 1.0d) * ((((-d4) * (d2 - d)) - d) + 1.0d));
    }

    /* renamed from: e */
    private double m15063e(double d) {
        double d2 = this.f11233e;
        if (d < d2) {
            return (d2 * d) / (d + (this.f11232d * (d2 - d)));
        }
        return ((1.0d - d2) * (d - 1.0d)) / ((1.0d - d) - (this.f11232d * (d2 - d)));
    }

    /* renamed from: a */
    public double mo12523a(double d) {
        return m15063e(d);
    }

    /* renamed from: b */
    public double mo12524b(double d) {
        return m15062d(d);
    }
}
