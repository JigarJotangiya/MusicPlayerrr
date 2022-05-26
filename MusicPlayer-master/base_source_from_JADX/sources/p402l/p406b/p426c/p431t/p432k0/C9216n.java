package p402l.p406b.p426c.p431t.p432k0;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import p402l.p406b.p426c.p431t.C9192h;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.t.k0.n */
/* compiled from: FrameBodyTDRC */
public class C9216n extends C9199a implements C9206d0 {

    /* renamed from: q */
    private static SimpleDateFormat f35904q = new SimpleDateFormat("yyyy", Locale.UK);

    /* renamed from: r */
    private static SimpleDateFormat f35905r = new SimpleDateFormat("yyyy", Locale.UK);

    /* renamed from: s */
    private static SimpleDateFormat f35906s = new SimpleDateFormat("ddMM", Locale.UK);

    /* renamed from: t */
    private static SimpleDateFormat f35907t = new SimpleDateFormat("-MM-dd", Locale.UK);

    /* renamed from: u */
    private static SimpleDateFormat f35908u = new SimpleDateFormat("-MM", Locale.UK);

    /* renamed from: v */
    private static SimpleDateFormat f35909v = new SimpleDateFormat("HHmm", Locale.UK);

    /* renamed from: w */
    private static SimpleDateFormat f35910w = new SimpleDateFormat("'T'HH:mm", Locale.UK);

    /* renamed from: x */
    private static SimpleDateFormat f35911x = new SimpleDateFormat("'T'HH", Locale.UK);

    /* renamed from: y */
    private static final List<SimpleDateFormat> f35912y;

    /* renamed from: k */
    private String f35913k;

    /* renamed from: l */
    private String f35914l = BuildConfig.FLAVOR;

    /* renamed from: m */
    private String f35915m = BuildConfig.FLAVOR;

    /* renamed from: n */
    private String f35916n = BuildConfig.FLAVOR;

    /* renamed from: o */
    private boolean f35917o = false;

    /* renamed from: p */
    private boolean f35918p = false;

    static {
        ArrayList arrayList = new ArrayList();
        f35912y = arrayList;
        arrayList.add(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.UK));
        arrayList.add(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm", Locale.UK));
        arrayList.add(new SimpleDateFormat("yyyy-MM-dd'T'HH", Locale.UK));
        arrayList.add(new SimpleDateFormat("yyyy-MM-dd", Locale.UK));
        arrayList.add(new SimpleDateFormat("yyyy-MM", Locale.UK));
        arrayList.add(new SimpleDateFormat("yyyy", Locale.UK));
    }

    public C9216n() {
    }

    /* renamed from: A */
    private void m48976A(Date date, int i) {
        Logger logger = C9192h.f35863g;
        logger.fine("Precision is:" + i + "for date:" + date.toString());
        if (i == 5) {
            mo32003S(m48980G(date));
        } else if (i == 4) {
            mo32003S(m48980G(date));
            mo31999O(m48978E(date));
            this.f35917o = true;
        } else if (i == 3) {
            mo32003S(m48980G(date));
            mo31999O(m48978E(date));
        } else if (i == 2) {
            mo32003S(m48980G(date));
            mo31999O(m48978E(date));
            mo32002R(m48979F(date));
            this.f35918p = true;
        } else if (i == 1) {
            mo32003S(m48980G(date));
            mo31999O(m48978E(date));
            mo32002R(m48979F(date));
        } else if (i == 0) {
            mo32003S(m48980G(date));
            mo31999O(m48978E(date));
            mo32002R(m48979F(date));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        return p453me.zhanghai.android.materialprogressbar.BuildConfig.FLAVOR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r2 = p402l.p406b.p426c.p431t.C9192h.f35863g;
        r2.warning("Unable to parse:" + r4);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000f */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.lang.String m48977C(java.text.SimpleDateFormat r2, java.text.SimpleDateFormat r3, java.lang.String r4) {
        /*
            java.lang.Class<l.b.c.t.k0.n> r0 = p402l.p406b.p426c.p431t.p432k0.C9216n.class
            monitor-enter(r0)
            java.util.Date r3 = r3.parse(r4)     // Catch:{ ParseException -> 0x000f }
            java.lang.String r2 = r2.format(r3)     // Catch:{ ParseException -> 0x000f }
            monitor-exit(r0)
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0029
        L_0x000f:
            java.util.logging.Logger r2 = p402l.p406b.p426c.p431t.C9192h.f35863g     // Catch:{ all -> 0x000d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x000d }
            r3.<init>()     // Catch:{ all -> 0x000d }
            java.lang.String r1 = "Unable to parse:"
            r3.append(r1)     // Catch:{ all -> 0x000d }
            r3.append(r4)     // Catch:{ all -> 0x000d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x000d }
            r2.warning(r3)     // Catch:{ all -> 0x000d }
            java.lang.String r2 = ""
            monitor-exit(r0)
            return r2
        L_0x0029:
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p402l.p406b.p426c.p431t.p432k0.C9216n.m48977C(java.text.SimpleDateFormat, java.text.SimpleDateFormat, java.lang.String):java.lang.String");
    }

    /* renamed from: E */
    private static synchronized String m48978E(Date date) {
        String format;
        synchronized (C9216n.class) {
            format = f35906s.format(date);
        }
        return format;
    }

    /* renamed from: F */
    private static synchronized String m48979F(Date date) {
        String format;
        synchronized (C9216n.class) {
            format = f35909v.format(date);
        }
        return format;
    }

    /* renamed from: G */
    private static synchronized String m48980G(Date date) {
        String format;
        synchronized (C9216n.class) {
            format = f35904q.format(date);
        }
        return format;
    }

    /* renamed from: B */
    public void mo31991B() {
        Date parse;
        int i = 0;
        while (true) {
            List<SimpleDateFormat> list = f35912y;
            if (i < list.size()) {
                try {
                    synchronized (list.get(i)) {
                        parse = list.get(i).parse(mo31962x());
                    }
                    if (parse != null) {
                        m48976A(parse, i);
                        return;
                    } else {
                        continue;
                        i++;
                    }
                } catch (ParseException unused) {
                } catch (NumberFormatException e) {
                    Logger logger = C9192h.f35863g;
                    Level level = Level.WARNING;
                    logger.log(level, "Date Formatter:" + f35912y.get(i).toPattern() + "failed to parse:" + mo31962x() + "with " + e.getMessage(), e);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: H */
    public String mo31992H() {
        return this.f35916n;
    }

    /* renamed from: I */
    public String mo31993I() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.f35913k == null) {
            return mo31962x();
        }
        String str = this.f35914l;
        if (str != null && !str.equals(BuildConfig.FLAVOR)) {
            stringBuffer.append(m48977C(f35905r, f35904q, this.f35914l));
        }
        if (!this.f35916n.equals(BuildConfig.FLAVOR)) {
            if (mo31998N()) {
                stringBuffer.append(m48977C(f35908u, f35906s, this.f35916n));
            } else {
                stringBuffer.append(m48977C(f35907t, f35906s, this.f35916n));
            }
        }
        if (!this.f35915m.equals(BuildConfig.FLAVOR)) {
            if (mo31997M()) {
                stringBuffer.append(m48977C(f35911x, f35909v, this.f35915m));
            } else {
                stringBuffer.append(m48977C(f35910w, f35909v, this.f35915m));
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: J */
    public String mo31994J() {
        return this.f35913k;
    }

    /* renamed from: K */
    public String mo31995K() {
        return this.f35915m;
    }

    /* renamed from: L */
    public String mo31996L() {
        return this.f35914l;
    }

    /* renamed from: M */
    public boolean mo31997M() {
        return this.f35918p;
    }

    /* renamed from: N */
    public boolean mo31998N() {
        return this.f35917o;
    }

    /* renamed from: O */
    public void mo31999O(String str) {
        Logger logger = C9192h.f35863g;
        logger.finest("Setting date to:" + str);
        this.f35916n = str;
    }

    /* renamed from: P */
    public void mo32000P(boolean z) {
        this.f35918p = z;
    }

    /* renamed from: Q */
    public void mo32001Q(boolean z) {
        this.f35917o = z;
    }

    /* renamed from: R */
    public void mo32002R(String str) {
        Logger logger = C9192h.f35863g;
        logger.finest("Setting time to:" + str);
        this.f35915m = str;
    }

    /* renamed from: S */
    public void mo32003S(String str) {
        Logger logger = C9192h.f35863g;
        logger.finest("Setting year to" + str);
        this.f35914l = str;
    }

    /* renamed from: g */
    public String mo31857g() {
        return "TDRC";
    }

    public C9216n(byte b, String str) {
        super(b, str);
        mo31991B();
    }
}
