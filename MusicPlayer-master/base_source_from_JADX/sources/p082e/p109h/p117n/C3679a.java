package p082e.p109h.p117n;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: e.h.n.a */
/* compiled from: BidiFormatter */
public final class C3679a {

    /* renamed from: d */
    static final C3686d f11670d;

    /* renamed from: e */
    private static final String f11671e = Character.toString(8206);

    /* renamed from: f */
    private static final String f11672f = Character.toString(8207);

    /* renamed from: g */
    static final C3679a f11673g;

    /* renamed from: h */
    static final C3679a f11674h;

    /* renamed from: a */
    private final boolean f11675a;

    /* renamed from: b */
    private final int f11676b;

    /* renamed from: c */
    private final C3686d f11677c;

    /* renamed from: e.h.n.a$a */
    /* compiled from: BidiFormatter */
    public static final class C3680a {

        /* renamed from: a */
        private boolean f11678a;

        /* renamed from: b */
        private int f11679b;

        /* renamed from: c */
        private C3686d f11680c;

        public C3680a() {
            m15774c(C3679a.m15765e(Locale.getDefault()));
        }

        /* renamed from: b */
        private static C3679a m15773b(boolean z) {
            return z ? C3679a.f11674h : C3679a.f11673g;
        }

        /* renamed from: c */
        private void m15774c(boolean z) {
            this.f11678a = z;
            this.f11680c = C3679a.f11670d;
            this.f11679b = 2;
        }

        /* renamed from: a */
        public C3679a mo12961a() {
            if (this.f11679b == 2 && this.f11680c == C3679a.f11670d) {
                return m15773b(this.f11678a);
            }
            return new C3679a(this.f11678a, this.f11679b, this.f11680c);
        }
    }

    /* renamed from: e.h.n.a$b */
    /* compiled from: BidiFormatter */
    private static class C3681b {

        /* renamed from: f */
        private static final byte[] f11681f = new byte[1792];

        /* renamed from: a */
        private final CharSequence f11682a;

        /* renamed from: b */
        private final boolean f11683b;

        /* renamed from: c */
        private final int f11684c;

        /* renamed from: d */
        private int f11685d;

        /* renamed from: e */
        private char f11686e;

        static {
            for (int i = 0; i < 1792; i++) {
                f11681f[i] = Character.getDirectionality(i);
            }
        }

        C3681b(CharSequence charSequence, boolean z) {
            this.f11682a = charSequence;
            this.f11683b = z;
            this.f11684c = charSequence.length();
        }

        /* renamed from: c */
        private static byte m15776c(char c) {
            return c < 1792 ? f11681f[c] : Character.getDirectionality(c);
        }

        /* renamed from: f */
        private byte m15777f() {
            char charAt;
            int i = this.f11685d;
            do {
                int i2 = this.f11685d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f11682a;
                int i3 = i2 - 1;
                this.f11685d = i3;
                charAt = charSequence.charAt(i3);
                this.f11686e = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f11685d = i;
            this.f11686e = ';';
            return 13;
        }

        /* renamed from: g */
        private byte m15778g() {
            char charAt;
            do {
                int i = this.f11685d;
                if (i >= this.f11684c) {
                    return 12;
                }
                CharSequence charSequence = this.f11682a;
                this.f11685d = i + 1;
                charAt = charSequence.charAt(i);
                this.f11686e = charAt;
            } while (charAt != ';');
            return 12;
        }

        /* renamed from: h */
        private byte m15779h() {
            char charAt;
            int i = this.f11685d;
            while (true) {
                int i2 = this.f11685d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f11682a;
                int i3 = i2 - 1;
                this.f11685d = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f11686e = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i4 = this.f11685d;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f11682a;
                        int i5 = i4 - 1;
                        this.f11685d = i5;
                        charAt = charSequence2.charAt(i5);
                        this.f11686e = charAt;
                    } while (charAt != charAt2);
                }
            }
            this.f11685d = i;
            this.f11686e = '>';
            return 13;
        }

        /* renamed from: i */
        private byte m15780i() {
            char charAt;
            int i = this.f11685d;
            while (true) {
                int i2 = this.f11685d;
                if (i2 < this.f11684c) {
                    CharSequence charSequence = this.f11682a;
                    this.f11685d = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.f11686e = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i3 = this.f11685d;
                            if (i3 >= this.f11684c) {
                                break;
                            }
                            CharSequence charSequence2 = this.f11682a;
                            this.f11685d = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f11686e = charAt;
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f11685d = i;
                    this.f11686e = '<';
                    return 13;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public byte mo12962a() {
            char charAt = this.f11682a.charAt(this.f11685d - 1);
            this.f11686e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f11682a, this.f11685d);
                this.f11685d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f11685d--;
            byte c = m15776c(this.f11686e);
            if (!this.f11683b) {
                return c;
            }
            char c2 = this.f11686e;
            if (c2 == '>') {
                return m15779h();
            }
            return c2 == ';' ? m15777f() : c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public byte mo12963b() {
            char charAt = this.f11682a.charAt(this.f11685d);
            this.f11686e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f11682a, this.f11685d);
                this.f11685d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f11685d++;
            byte c = m15776c(this.f11686e);
            if (!this.f11683b) {
                return c;
            }
            char c2 = this.f11686e;
            if (c2 == '<') {
                return m15780i();
            }
            return c2 == '&' ? m15778g() : c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo12964d() {
            this.f11685d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f11685d < this.f11684c && i == 0) {
                byte b = mo12963b();
                if (b != 0) {
                    if (b == 1 || b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b != 9) {
                        switch (b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f11685d > 0) {
                switch (mo12962a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r1 = r1 - 1;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo12965e() {
            /*
                r7 = this;
                int r0 = r7.f11684c
                r7.f11685d = r0
                r0 = 0
                r1 = 0
                r2 = 0
            L_0x0007:
                int r3 = r7.f11685d
                if (r3 <= 0) goto L_0x003b
                byte r3 = r7.mo12962a()
                r4 = -1
                if (r3 == 0) goto L_0x0034
                r5 = 1
                if (r3 == r5) goto L_0x002e
                r6 = 2
                if (r3 == r6) goto L_0x002e
                r6 = 9
                if (r3 == r6) goto L_0x0007
                switch(r3) {
                    case 14: goto L_0x0028;
                    case 15: goto L_0x0028;
                    case 16: goto L_0x0025;
                    case 17: goto L_0x0025;
                    case 18: goto L_0x0022;
                    default: goto L_0x001f;
                }
            L_0x001f:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0022:
                int r1 = r1 + 1
                goto L_0x0007
            L_0x0025:
                if (r2 != r1) goto L_0x002b
                return r5
            L_0x0028:
                if (r2 != r1) goto L_0x002b
                return r4
            L_0x002b:
                int r1 = r1 + -1
                goto L_0x0007
            L_0x002e:
                if (r1 != 0) goto L_0x0031
                return r5
            L_0x0031:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0034:
                if (r1 != 0) goto L_0x0037
                return r4
            L_0x0037:
                if (r2 != 0) goto L_0x0007
            L_0x0039:
                r2 = r1
                goto L_0x0007
            L_0x003b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p109h.p117n.C3679a.C3681b.mo12965e():int");
        }
    }

    static {
        C3686d dVar = C3687e.f11702c;
        f11670d = dVar;
        f11673g = new C3679a(false, 2, dVar);
        f11674h = new C3679a(true, 2, dVar);
    }

    C3679a(boolean z, int i, C3686d dVar) {
        this.f11675a = z;
        this.f11676b = i;
        this.f11677c = dVar;
    }

    /* renamed from: a */
    private static int m15762a(CharSequence charSequence) {
        return new C3681b(charSequence, false).mo12964d();
    }

    /* renamed from: b */
    private static int m15763b(CharSequence charSequence) {
        return new C3681b(charSequence, false).mo12965e();
    }

    /* renamed from: c */
    public static C3679a m15764c() {
        return new C3680a().mo12961a();
    }

    /* renamed from: e */
    static boolean m15765e(Locale locale) {
        return C3694f.m15811b(locale) == 1;
    }

    /* renamed from: f */
    private String m15766f(CharSequence charSequence, C3686d dVar) {
        boolean a = dVar.mo12991a(charSequence, 0, charSequence.length());
        if (!this.f11675a && (a || m15763b(charSequence) == 1)) {
            return f11671e;
        }
        if (this.f11675a) {
            return (!a || m15763b(charSequence) == -1) ? f11672f : BuildConfig.FLAVOR;
        }
        return BuildConfig.FLAVOR;
    }

    /* renamed from: g */
    private String m15767g(CharSequence charSequence, C3686d dVar) {
        boolean a = dVar.mo12991a(charSequence, 0, charSequence.length());
        if (!this.f11675a && (a || m15762a(charSequence) == 1)) {
            return f11671e;
        }
        if (this.f11675a) {
            return (!a || m15762a(charSequence) == -1) ? f11672f : BuildConfig.FLAVOR;
        }
        return BuildConfig.FLAVOR;
    }

    /* renamed from: d */
    public boolean mo12956d() {
        return (this.f11676b & 2) != 0;
    }

    /* renamed from: h */
    public CharSequence mo12957h(CharSequence charSequence) {
        return mo12958i(charSequence, this.f11677c, true);
    }

    /* renamed from: i */
    public CharSequence mo12958i(CharSequence charSequence, C3686d dVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a = dVar.mo12991a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (mo12956d() && z) {
            spannableStringBuilder.append(m15767g(charSequence, a ? C3687e.f11701b : C3687e.f11700a));
        }
        if (a != this.f11675a) {
            spannableStringBuilder.append(a ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append(m15766f(charSequence, a ? C3687e.f11701b : C3687e.f11700a));
        }
        return spannableStringBuilder;
    }

    /* renamed from: j */
    public String mo12959j(String str) {
        return mo12960k(str, this.f11677c, true);
    }

    /* renamed from: k */
    public String mo12960k(String str, C3686d dVar, boolean z) {
        if (str == null) {
            return null;
        }
        return mo12958i(str, dVar, z).toString();
    }
}
