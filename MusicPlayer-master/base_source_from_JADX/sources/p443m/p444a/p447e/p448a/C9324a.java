package p443m.p444a.p447e.p448a;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p443m.p444a.p449f.C9337a;
import p443m.p444a.p452i.C9348d;

/* renamed from: m.a.e.a.a */
/* compiled from: ColorState */
public final class C9324a {

    /* renamed from: a */
    boolean f36040a;

    /* renamed from: b */
    String f36041b;

    /* renamed from: c */
    String f36042c;

    /* renamed from: d */
    String f36043d;

    /* renamed from: e */
    String f36044e;

    /* renamed from: f */
    String f36045f;

    /* renamed from: g */
    String f36046g;

    /* renamed from: h */
    String f36047h;

    /* renamed from: i */
    String f36048i;

    /* renamed from: j */
    String f36049j;

    /* renamed from: k */
    String f36050k;

    /* renamed from: l */
    String f36051l;

    /* renamed from: m */
    String f36052m;

    /* renamed from: n */
    String f36053n;

    /* renamed from: m.a.e.a.a$a */
    /* compiled from: ColorState */
    public static class C9325a {

        /* renamed from: a */
        String f36054a;

        /* renamed from: b */
        String f36055b;

        /* renamed from: c */
        String f36056c;

        /* renamed from: d */
        String f36057d;

        /* renamed from: e */
        String f36058e;

        /* renamed from: f */
        String f36059f;

        /* renamed from: g */
        String f36060g;

        /* renamed from: h */
        String f36061h;

        /* renamed from: i */
        String f36062i;

        /* renamed from: j */
        String f36063j;

        /* renamed from: k */
        String f36064k;

        /* renamed from: l */
        String f36065l;

        /* renamed from: a */
        public C9324a mo32302a() {
            if (!TextUtils.isEmpty(this.f36065l)) {
                return new C9324a(this.f36054a, this.f36055b, this.f36056c, this.f36057d, this.f36058e, this.f36059f, this.f36060g, this.f36061h, this.f36062i, this.f36063j, this.f36064k, this.f36065l);
            }
            throw new C9337a("Default color can not empty!");
        }

        /* renamed from: b */
        public C9325a mo32303b(String str) {
            if (C9324a.m49350a("colorAccelerated", str)) {
                this.f36061h = str;
            }
            return this;
        }

        /* renamed from: c */
        public C9325a mo32304c(String str) {
            if (C9324a.m49350a("colorActivated", str)) {
                this.f36060g = str;
            }
            return this;
        }

        /* renamed from: d */
        public C9325a mo32305d(String str) {
            if (C9324a.m49350a("colorChecked", str)) {
                this.f36059f = str;
            }
            return this;
        }

        /* renamed from: e */
        public C9325a mo32306e(String str) {
            if (C9324a.m49350a("colorDefault", str)) {
                this.f36065l = str;
            }
            return this;
        }

        /* renamed from: f */
        public C9325a mo32307f(String str) {
            if (C9324a.m49350a("colorDragCanAccept", str)) {
                this.f36063j = str;
            }
            return this;
        }

        /* renamed from: g */
        public C9325a mo32308g(String str) {
            if (C9324a.m49350a("colorDragHovered", str)) {
                this.f36064k = str;
            }
            return this;
        }

        /* renamed from: h */
        public C9325a mo32309h(String str) {
            if (C9324a.m49350a("colorEnabled", str)) {
                this.f36057d = str;
            }
            return this;
        }

        /* renamed from: i */
        public C9325a mo32310i(String str) {
            if (C9324a.m49350a("colorFocused", str)) {
                this.f36056c = str;
            }
            return this;
        }

        /* renamed from: j */
        public C9325a mo32311j(String str) {
            if (C9324a.m49350a("colorHovered", str)) {
                this.f36062i = str;
            }
            return this;
        }

        /* renamed from: k */
        public C9325a mo32312k(String str) {
            if (C9324a.m49350a("colorPressed", str)) {
                this.f36058e = str;
            }
            return this;
        }

        /* renamed from: l */
        public C9325a mo32313l(String str) {
            if (C9324a.m49350a("colorSelected", str)) {
                this.f36055b = str;
            }
            return this;
        }

        /* renamed from: m */
        public C9325a mo32314m(String str) {
            if (C9324a.m49350a("colorWindowFocused", str)) {
                this.f36054a = str;
            }
            return this;
        }
    }

    C9324a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.f36042c = str;
        this.f36043d = str2;
        this.f36044e = str3;
        this.f36045f = str4;
        this.f36046g = str5;
        this.f36047h = str6;
        this.f36048i = str7;
        this.f36049j = str8;
        this.f36050k = str9;
        this.f36051l = str10;
        this.f36052m = str11;
        this.f36053n = str12;
        boolean z = TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str9) && TextUtils.isEmpty(str10) && TextUtils.isEmpty(str11);
        this.f36040a = z;
        if (z && !str12.startsWith("#")) {
            throw new C9337a("Default color cannot be a reference, when only default color is available!");
        }
    }

    /* renamed from: a */
    static boolean m49350a(String str, String str2) {
        boolean z = !TextUtils.isEmpty(str2) && (!str2.startsWith("#") || str2.length() == 7 || str2.length() == 9);
        if (C9348d.f36128a && !z) {
            C9348d.m49503a("ColorState", "Invalid color -> " + str + ": " + str2);
        }
        return z;
    }

    /* renamed from: b */
    static C9324a m49351b(JSONObject jSONObject) {
        if (!jSONObject.has("colorName") || !jSONObject.has("colorDefault") || !jSONObject.has("onlyDefaultColor")) {
            return null;
        }
        try {
            boolean z = jSONObject.getBoolean("onlyDefaultColor");
            String string = jSONObject.getString("colorName");
            String string2 = jSONObject.getString("colorDefault");
            if (z) {
                return new C9324a(string, string2);
            }
            C9325a aVar = new C9325a();
            aVar.mo32306e(string2);
            if (jSONObject.has("colorWindowFocused")) {
                aVar.mo32314m(jSONObject.getString("colorWindowFocused"));
            }
            if (jSONObject.has("colorSelected")) {
                aVar.mo32313l(jSONObject.getString("colorSelected"));
            }
            if (jSONObject.has("colorFocused")) {
                aVar.mo32310i(jSONObject.getString("colorFocused"));
            }
            if (jSONObject.has("colorEnabled")) {
                aVar.mo32309h(jSONObject.getString("colorEnabled"));
            }
            if (jSONObject.has("colorPressed")) {
                aVar.mo32312k(jSONObject.getString("colorPressed"));
            }
            if (jSONObject.has("colorChecked")) {
                aVar.mo32305d(jSONObject.getString("colorChecked"));
            }
            if (jSONObject.has("colorActivated")) {
                aVar.mo32304c(jSONObject.getString("colorActivated"));
            }
            if (jSONObject.has("colorAccelerated")) {
                aVar.mo32303b(jSONObject.getString("colorAccelerated"));
            }
            if (jSONObject.has("colorHovered")) {
                aVar.mo32311j(jSONObject.getString("colorHovered"));
            }
            if (jSONObject.has("colorDragCanAccept")) {
                aVar.mo32307f(jSONObject.getString("colorDragCanAccept"));
            }
            if (jSONObject.has("colorDragHovered")) {
                aVar.mo32308g(jSONObject.getString("colorDragHovered"));
            }
            C9324a a = aVar.mo32302a();
            a.f36041b = string;
            return a;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    private String m49352c(String str) {
        if (str.startsWith("#")) {
            return str;
        }
        C9324a j = C9334f.m49436g().mo32331j(str);
        if (j == null) {
            return null;
        }
        if (j.mo32300d()) {
            return j.f36053n;
        }
        if (!C9348d.f36128a) {
            return null;
        }
        C9348d.m49503a("ColorState", str + " cannot reference " + j.f36041b);
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(3:2|3|(30:5|6|9|(3:11|12|(2:14|15))|17|(3:19|20|(2:22|23))|25|(3:27|28|(2:30|31))|33|(3:35|36|(2:38|39))|41|(3:43|44|(2:46|47))|49|(3:51|52|(2:54|55))|57|(3:59|60|(2:62|63))|65|(3:67|68|(2:70|71))|73|(3:75|76|(2:78|79))|81|(3:83|84|(2:86|87))|88|89|(1:91)|92|(1:94)|103|95|96))|7|9|(0)|17|(0)|25|(0)|33|(0)|41|(0)|49|(0)|57|(0)|65|(0)|73|(0)|81|(0)|88|89|(0)|92|(0)|103|95|96) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0206, code lost:
        p443m.p444a.p452i.C9348d.m49503a("ColorState", r7.f36041b + " parse failure.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x021e, code lost:
        p443m.p444a.p447e.p448a.C9334f.m49436g().mo32336p(r7.f36041b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0228, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0204, code lost:
        if (p443m.p444a.p452i.C9348d.f36128a != false) goto L_0x0206;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x01c0 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a A[SYNTHETIC, Splitter:B:11:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062 A[SYNTHETIC, Splitter:B:19:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a A[SYNTHETIC, Splitter:B:27:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b2 A[SYNTHETIC, Splitter:B:35:0x00b2] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00da A[SYNTHETIC, Splitter:B:43:0x00da] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0102 A[SYNTHETIC, Splitter:B:51:0x0102] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012a A[SYNTHETIC, Splitter:B:59:0x012a] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0152 A[SYNTHETIC, Splitter:B:67:0x0152] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017a A[SYNTHETIC, Splitter:B:75:0x017a] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01a2 A[SYNTHETIC, Splitter:B:83:0x01a2] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01cc A[Catch:{ Exception -> 0x0201 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01e4 A[Catch:{ Exception -> 0x0201 }, LOOP:0: B:93:0x01e2->B:94:0x01e4, LOOP_END] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.content.res.ColorStateList m49353f() {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = r7.f36042c
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 0
            if (r2 != 0) goto L_0x0031
            java.lang.String r2 = r7.f36042c     // Catch:{ Exception -> 0x0031 }
            java.lang.String r2 = r7.m49352c(r2)     // Catch:{ Exception -> 0x0031 }
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0031 }
            if (r4 != 0) goto L_0x0031
            int r2 = android.graphics.Color.parseColor(r2)     // Catch:{ Exception -> 0x0031 }
            int[] r4 = p443m.p444a.p447e.p448a.C9333e.f36093d     // Catch:{ Exception -> 0x0031 }
            r0.add(r4)     // Catch:{ Exception -> 0x0031 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0031 }
            r1.add(r2)     // Catch:{ Exception -> 0x0031 }
            r2 = 1
            goto L_0x0032
        L_0x0031:
            r2 = 0
        L_0x0032:
            java.lang.String r4 = r7.f36043d
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x005a
            java.lang.String r4 = r7.f36043d     // Catch:{ Exception -> 0x0059 }
            java.lang.String r4 = r7.m49352c(r4)     // Catch:{ Exception -> 0x0059 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0059 }
            if (r5 != 0) goto L_0x005a
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ Exception -> 0x0059 }
            int[] r5 = p443m.p444a.p447e.p448a.C9333e.f36102m     // Catch:{ Exception -> 0x0059 }
            r0.add(r5)     // Catch:{ Exception -> 0x0059 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0059 }
            r1.add(r4)     // Catch:{ Exception -> 0x0059 }
            int r2 = r2 + 1
            goto L_0x005a
        L_0x0059:
        L_0x005a:
            java.lang.String r4 = r7.f36044e
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0082
            java.lang.String r4 = r7.f36044e     // Catch:{ Exception -> 0x0081 }
            java.lang.String r4 = r7.m49352c(r4)     // Catch:{ Exception -> 0x0081 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0081 }
            if (r5 != 0) goto L_0x0082
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ Exception -> 0x0081 }
            int[] r5 = p443m.p444a.p447e.p448a.C9333e.f36094e     // Catch:{ Exception -> 0x0081 }
            r0.add(r5)     // Catch:{ Exception -> 0x0081 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0081 }
            r1.add(r4)     // Catch:{ Exception -> 0x0081 }
            int r2 = r2 + 1
            goto L_0x0082
        L_0x0081:
        L_0x0082:
            java.lang.String r4 = r7.f36045f
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x00aa
            java.lang.String r4 = r7.f36045f     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r4 = r7.m49352c(r4)     // Catch:{ Exception -> 0x00a9 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x00a9 }
            if (r5 != 0) goto L_0x00aa
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ Exception -> 0x00a9 }
            int[] r5 = p443m.p444a.p447e.p448a.C9333e.f36092c     // Catch:{ Exception -> 0x00a9 }
            r0.add(r5)     // Catch:{ Exception -> 0x00a9 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x00a9 }
            r1.add(r4)     // Catch:{ Exception -> 0x00a9 }
            int r2 = r2 + 1
            goto L_0x00aa
        L_0x00a9:
        L_0x00aa:
            java.lang.String r4 = r7.f36046g
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x00d2
            java.lang.String r4 = r7.f36046g     // Catch:{ Exception -> 0x00d1 }
            java.lang.String r4 = r7.m49352c(r4)     // Catch:{ Exception -> 0x00d1 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x00d1 }
            if (r5 != 0) goto L_0x00d2
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ Exception -> 0x00d1 }
            int[] r5 = p443m.p444a.p447e.p448a.C9333e.f36100k     // Catch:{ Exception -> 0x00d1 }
            r0.add(r5)     // Catch:{ Exception -> 0x00d1 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x00d1 }
            r1.add(r4)     // Catch:{ Exception -> 0x00d1 }
            int r2 = r2 + 1
            goto L_0x00d2
        L_0x00d1:
        L_0x00d2:
            java.lang.String r4 = r7.f36047h
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x00fa
            java.lang.String r4 = r7.f36047h     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r4 = r7.m49352c(r4)     // Catch:{ Exception -> 0x00f9 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x00f9 }
            if (r5 != 0) goto L_0x00fa
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ Exception -> 0x00f9 }
            int[] r5 = p443m.p444a.p447e.p448a.C9333e.f36101l     // Catch:{ Exception -> 0x00f9 }
            r0.add(r5)     // Catch:{ Exception -> 0x00f9 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x00f9 }
            r1.add(r4)     // Catch:{ Exception -> 0x00f9 }
            int r2 = r2 + 1
            goto L_0x00fa
        L_0x00f9:
        L_0x00fa:
            java.lang.String r4 = r7.f36048i
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0122
            java.lang.String r4 = r7.f36048i     // Catch:{ Exception -> 0x0121 }
            java.lang.String r4 = r7.m49352c(r4)     // Catch:{ Exception -> 0x0121 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0121 }
            if (r5 != 0) goto L_0x0122
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ Exception -> 0x0121 }
            int[] r5 = p443m.p444a.p447e.p448a.C9333e.f36095f     // Catch:{ Exception -> 0x0121 }
            r0.add(r5)     // Catch:{ Exception -> 0x0121 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0121 }
            r1.add(r4)     // Catch:{ Exception -> 0x0121 }
            int r2 = r2 + 1
            goto L_0x0122
        L_0x0121:
        L_0x0122:
            java.lang.String r4 = r7.f36049j
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x014a
            java.lang.String r4 = r7.f36049j     // Catch:{ Exception -> 0x0149 }
            java.lang.String r4 = r7.m49352c(r4)     // Catch:{ Exception -> 0x0149 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0149 }
            if (r5 != 0) goto L_0x014a
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ Exception -> 0x0149 }
            int[] r5 = p443m.p444a.p447e.p448a.C9333e.f36096g     // Catch:{ Exception -> 0x0149 }
            r0.add(r5)     // Catch:{ Exception -> 0x0149 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0149 }
            r1.add(r4)     // Catch:{ Exception -> 0x0149 }
            int r2 = r2 + 1
            goto L_0x014a
        L_0x0149:
        L_0x014a:
            java.lang.String r4 = r7.f36050k
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0172
            java.lang.String r4 = r7.f36050k     // Catch:{ Exception -> 0x0171 }
            java.lang.String r4 = r7.m49352c(r4)     // Catch:{ Exception -> 0x0171 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0171 }
            if (r5 != 0) goto L_0x0172
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ Exception -> 0x0171 }
            int[] r5 = p443m.p444a.p447e.p448a.C9333e.f36097h     // Catch:{ Exception -> 0x0171 }
            r0.add(r5)     // Catch:{ Exception -> 0x0171 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0171 }
            r1.add(r4)     // Catch:{ Exception -> 0x0171 }
            int r2 = r2 + 1
            goto L_0x0172
        L_0x0171:
        L_0x0172:
            java.lang.String r4 = r7.f36051l
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x019a
            java.lang.String r4 = r7.f36051l     // Catch:{ Exception -> 0x0199 }
            java.lang.String r4 = r7.m49352c(r4)     // Catch:{ Exception -> 0x0199 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0199 }
            if (r5 != 0) goto L_0x019a
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ Exception -> 0x0199 }
            int[] r5 = p443m.p444a.p447e.p448a.C9333e.f36098i     // Catch:{ Exception -> 0x0199 }
            r0.add(r5)     // Catch:{ Exception -> 0x0199 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0199 }
            r1.add(r4)     // Catch:{ Exception -> 0x0199 }
            int r2 = r2 + 1
            goto L_0x019a
        L_0x0199:
        L_0x019a:
            java.lang.String r4 = r7.f36052m
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x01c0
            java.lang.String r4 = r7.f36052m     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r4 = r7.m49352c(r4)     // Catch:{ Exception -> 0x01c0 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x01c0 }
            if (r5 != 0) goto L_0x01c0
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ Exception -> 0x01c0 }
            int[] r5 = p443m.p444a.p447e.p448a.C9333e.f36099j     // Catch:{ Exception -> 0x01c0 }
            r0.add(r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x01c0 }
            r1.add(r4)     // Catch:{ Exception -> 0x01c0 }
            int r2 = r2 + 1
        L_0x01c0:
            java.lang.String r4 = r7.f36053n     // Catch:{ Exception -> 0x0201 }
            java.lang.String r4 = r7.m49352c(r4)     // Catch:{ Exception -> 0x0201 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0201 }
            if (r5 != 0) goto L_0x01de
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ Exception -> 0x0201 }
            int[] r5 = p443m.p444a.p447e.p448a.C9333e.f36103n     // Catch:{ Exception -> 0x0201 }
            r0.add(r5)     // Catch:{ Exception -> 0x0201 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0201 }
            r1.add(r4)     // Catch:{ Exception -> 0x0201 }
            int r2 = r2 + 1
        L_0x01de:
            int[][] r4 = new int[r2][]     // Catch:{ Exception -> 0x0201 }
            int[] r5 = new int[r2]     // Catch:{ Exception -> 0x0201 }
        L_0x01e2:
            if (r3 >= r2) goto L_0x01fb
            java.lang.Object r6 = r0.get(r3)     // Catch:{ Exception -> 0x0201 }
            int[] r6 = (int[]) r6     // Catch:{ Exception -> 0x0201 }
            r4[r3] = r6     // Catch:{ Exception -> 0x0201 }
            java.lang.Object r6 = r1.get(r3)     // Catch:{ Exception -> 0x0201 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ Exception -> 0x0201 }
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x0201 }
            r5[r3] = r6     // Catch:{ Exception -> 0x0201 }
            int r3 = r3 + 1
            goto L_0x01e2
        L_0x01fb:
            android.content.res.ColorStateList r0 = new android.content.res.ColorStateList     // Catch:{ Exception -> 0x0201 }
            r0.<init>(r4, r5)     // Catch:{ Exception -> 0x0201 }
            return r0
        L_0x0201:
            boolean r0 = p443m.p444a.p452i.C9348d.f36128a
            if (r0 == 0) goto L_0x021e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r7.f36041b
            r0.append(r1)
            java.lang.String r1 = " parse failure."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ColorState"
            p443m.p444a.p452i.C9348d.m49503a(r1, r0)
        L_0x021e:
            m.a.e.a.f r0 = p443m.p444a.p447e.p448a.C9334f.m49436g()
            java.lang.String r1 = r7.f36041b
            r0.mo32336p(r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p443m.p444a.p447e.p448a.C9324a.m49353f():android.content.res.ColorStateList");
    }

    /* renamed from: d */
    public boolean mo32300d() {
        return this.f36040a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public ColorStateList mo32301e() {
        if (this.f36040a) {
            return ColorStateList.valueOf(Color.parseColor(this.f36053n));
        }
        return m49353f();
    }

    C9324a(String str, String str2) {
        this.f36041b = str;
        this.f36053n = str2;
        this.f36040a = true;
        if (!str2.startsWith("#")) {
            throw new C9337a("Default color cannot be a reference, when only default color is available!");
        }
    }
}
