package p369i.p376f0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import p369i.C8446k;
import p369i.p373c0.C8388c;
import p369i.p375e0.C8407b;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.p390y.C8607a;

/* renamed from: i.f0.e */
/* compiled from: Strings.kt */
final class C8423e implements C8407b<C8388c> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CharSequence f34889a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f34890b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f34891c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C8574p<CharSequence, Integer, C8446k<Integer, Integer>> f34892d;

    /* renamed from: i.f0.e$a */
    /* compiled from: Strings.kt */
    public static final class C8424a implements Iterator<C8388c>, C8607a {

        /* renamed from: g */
        private int f34893g = -1;

        /* renamed from: h */
        private int f34894h;

        /* renamed from: i */
        private int f34895i;

        /* renamed from: j */
        private C8388c f34896j;

        /* renamed from: k */
        private int f34897k;

        /* renamed from: l */
        final /* synthetic */ C8423e f34898l;

        C8424a(C8423e eVar) {
            this.f34898l = eVar;
            int e = C8392f.m46454e(eVar.f34890b, 0, eVar.f34889a.length());
            this.f34894h = e;
            this.f34895i = e;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r0 < p369i.p376f0.C8423e.m46477c(r6.f34898l)) goto L_0x0023;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m46479a() {
            /*
                r6 = this;
                int r0 = r6.f34895i
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f34893g = r1
                r0 = 0
                r6.f34896j = r0
                goto L_0x009e
            L_0x000c:
                i.f0.e r0 = r6.f34898l
                int r0 = r0.f34891c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0023
                int r0 = r6.f34897k
                int r0 = r0 + r3
                r6.f34897k = r0
                i.f0.e r4 = r6.f34898l
                int r4 = r4.f34891c
                if (r0 >= r4) goto L_0x0031
            L_0x0023:
                int r0 = r6.f34895i
                i.f0.e r4 = r6.f34898l
                java.lang.CharSequence r4 = r4.f34889a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0047
            L_0x0031:
                int r0 = r6.f34894h
                i.c0.c r1 = new i.c0.c
                i.f0.e r4 = r6.f34898l
                java.lang.CharSequence r4 = r4.f34889a
                int r4 = p369i.p376f0.C8437p.m46569y(r4)
                r1.<init>(r0, r4)
                r6.f34896j = r1
                r6.f34895i = r2
                goto L_0x009c
            L_0x0047:
                i.f0.e r0 = r6.f34898l
                i.z.c.p r0 = r0.f34892d
                i.f0.e r4 = r6.f34898l
                java.lang.CharSequence r4 = r4.f34889a
                int r5 = r6.f34895i
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                i.k r0 = (p369i.C8446k) r0
                if (r0 != 0) goto L_0x0077
                int r0 = r6.f34894h
                i.c0.c r1 = new i.c0.c
                i.f0.e r4 = r6.f34898l
                java.lang.CharSequence r4 = r4.f34889a
                int r4 = p369i.p376f0.C8437p.m46569y(r4)
                r1.<init>(r0, r4)
                r6.f34896j = r1
                r6.f34895i = r2
                goto L_0x009c
            L_0x0077:
                java.lang.Object r2 = r0.component1()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.component2()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f34894h
                i.c0.c r4 = p369i.p373c0.C8392f.m46456g(r4, r2)
                r6.f34896j = r4
                int r2 = r2 + r0
                r6.f34894h = r2
                if (r0 != 0) goto L_0x0099
                r1 = 1
            L_0x0099:
                int r2 = r2 + r1
                r6.f34895i = r2
            L_0x009c:
                r6.f34893g = r3
            L_0x009e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p369i.p376f0.C8423e.C8424a.m46479a():void");
        }

        /* renamed from: b */
        public C8388c next() {
            if (this.f34893g == -1) {
                m46479a();
            }
            if (this.f34893g != 0) {
                C8388c cVar = this.f34896j;
                Objects.requireNonNull(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f34896j = null;
                this.f34893g = -1;
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f34893g == -1) {
                m46479a();
            }
            return this.f34893g == 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C8423e(CharSequence charSequence, int i, int i2, C8574p<? super CharSequence, ? super Integer, C8446k<Integer, Integer>> pVar) {
        C8594l.m46771e(charSequence, "input");
        C8594l.m46771e(pVar, "getNextMatch");
        this.f34889a = charSequence;
        this.f34890b = i;
        this.f34891c = i2;
        this.f34892d = pVar;
    }

    public Iterator<C8388c> iterator() {
        return new C8424a(this);
    }
}
