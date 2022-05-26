package p369i.p373c0;

import p369i.p377u.C8495y;
import p369i.p383x.C8543c;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.p390y.C8607a;

/* renamed from: i.c0.a */
/* compiled from: Progressions.kt */
public class C8385a implements Iterable<Integer>, C8607a {

    /* renamed from: j */
    public static final C8386a f34870j = new C8386a((C8589g) null);

    /* renamed from: g */
    private final int f34871g;

    /* renamed from: h */
    private final int f34872h;

    /* renamed from: i */
    private final int f34873i;

    /* renamed from: i.c0.a$a */
    /* compiled from: Progressions.kt */
    public static final class C8386a {
        private C8386a() {
        }

        /* renamed from: a */
        public final C8385a mo30364a(int i, int i2, int i3) {
            return new C8385a(i, i2, i3);
        }

        public /* synthetic */ C8386a(C8589g gVar) {
            this();
        }
    }

    public C8385a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f34871g = i;
            this.f34872h = C8543c.m46744b(i, i2, i3);
            this.f34873i = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* renamed from: d */
    public final int mo30355d() {
        return this.f34871g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8385a) {
            if (!isEmpty() || !((C8385a) obj).isEmpty()) {
                C8385a aVar = (C8385a) obj;
                if (!(this.f34871g == aVar.f34871g && this.f34872h == aVar.f34872h && this.f34873i == aVar.f34873i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f34871g * 31) + this.f34872h) * 31) + this.f34873i;
    }

    public boolean isEmpty() {
        if (this.f34873i > 0) {
            if (this.f34871g > this.f34872h) {
                return true;
            }
        } else if (this.f34871g < this.f34872h) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final int mo30360p() {
        return this.f34872h;
    }

    /* renamed from: s */
    public final int mo30361s() {
        return this.f34873i;
    }

    /* renamed from: t */
    public C8495y iterator() {
        return new C8387b(this.f34871g, this.f34872h, this.f34873i);
    }

    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f34873i > 0) {
            sb = new StringBuilder();
            sb.append(this.f34871g);
            sb.append("..");
            sb.append(this.f34872h);
            sb.append(" step ");
            i = this.f34873i;
        } else {
            sb = new StringBuilder();
            sb.append(this.f34871g);
            sb.append(" downTo ");
            sb.append(this.f34872h);
            sb.append(" step ");
            i = -this.f34873i;
        }
        sb.append(i);
        return sb.toString();
    }
}
