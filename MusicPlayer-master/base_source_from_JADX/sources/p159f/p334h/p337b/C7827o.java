package p159f.p334h.p337b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import p159f.p334h.p337b.p338z.p339j.C7876f;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.h.b.o */
/* compiled from: Headers */
public final class C7827o {

    /* renamed from: a */
    private final String[] f33286a;

    /* renamed from: f.h.b.o$b */
    /* compiled from: Headers */
    public static final class C7829b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<String> f33287a = new ArrayList(20);

        /* renamed from: d */
        private C7829b m42890d(String str, String str2) {
            this.f33287a.add(str);
            this.f33287a.add(str2.trim());
            return this;
        }

        /* renamed from: b */
        public C7829b mo29163b(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            } else if (str2 == null) {
                throw new IllegalArgumentException("value == null");
            } else if (str.length() != 0 && str.indexOf(0) == -1 && str2.indexOf(0) == -1) {
                m42890d(str, str2);
                return this;
            } else {
                throw new IllegalArgumentException("Unexpected header: " + str + ": " + str2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C7829b mo29164c(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                m42890d(str.substring(0, indexOf), str.substring(indexOf + 1));
                return this;
            } else if (str.startsWith(":")) {
                m42890d(BuildConfig.FLAVOR, str.substring(1));
                return this;
            } else {
                m42890d(BuildConfig.FLAVOR, str);
                return this;
            }
        }

        /* renamed from: e */
        public C7827o mo29165e() {
            return new C7827o(this);
        }

        /* renamed from: f */
        public C7829b mo29166f(String str) {
            int i = 0;
            while (i < this.f33287a.size()) {
                if (str.equalsIgnoreCase(this.f33287a.get(i))) {
                    this.f33287a.remove(i);
                    this.f33287a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: g */
        public C7829b mo29167g(String str, String str2) {
            mo29166f(str);
            mo29163b(str, str2);
            return this;
        }
    }

    /* renamed from: b */
    private static String m42882b(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* renamed from: a */
    public String mo29156a(String str) {
        return m42882b(this.f33286a, str);
    }

    /* renamed from: c */
    public Date mo29157c(String str) {
        String a = mo29156a(str);
        if (a != null) {
            return C7876f.m43142b(a);
        }
        return null;
    }

    /* renamed from: d */
    public String mo29158d(int i) {
        int i2 = i * 2;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this.f33286a;
        if (i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    /* renamed from: e */
    public C7829b mo29159e() {
        C7829b bVar = new C7829b();
        Collections.addAll(bVar.f33287a, this.f33286a);
        return bVar;
    }

    /* renamed from: f */
    public int mo29160f() {
        return this.f33286a.length / 2;
    }

    /* renamed from: g */
    public String mo29161g(int i) {
        int i2 = (i * 2) + 1;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this.f33286a;
        if (i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int f = mo29160f();
        for (int i = 0; i < f; i++) {
            sb.append(mo29158d(i));
            sb.append(": ");
            sb.append(mo29161g(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    private C7827o(C7829b bVar) {
        this.f33286a = (String[]) bVar.f33287a.toArray(new String[bVar.f33287a.size()]);
    }
}
