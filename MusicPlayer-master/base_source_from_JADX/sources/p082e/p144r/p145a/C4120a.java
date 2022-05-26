package p082e.p144r.p145a;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import p082e.p109h.p110h.C3621a;
import p082e.p144r.p145a.C4123b;

/* renamed from: e.r.a.a */
/* compiled from: ColorCutQuantizer */
final class C4120a {

    /* renamed from: f */
    private static final Comparator<C4122b> f12401f = new C4121a();

    /* renamed from: a */
    final int[] f12402a;

    /* renamed from: b */
    final int[] f12403b;

    /* renamed from: c */
    final List<C4123b.C4129e> f12404c;

    /* renamed from: d */
    final C4123b.C4127c[] f12405d;

    /* renamed from: e */
    private final float[] f12406e = new float[3];

    /* renamed from: e.r.a.a$a */
    /* compiled from: ColorCutQuantizer */
    static class C4121a implements Comparator<C4122b> {
        C4121a() {
        }

        /* renamed from: a */
        public int compare(C4122b bVar, C4122b bVar2) {
            return bVar2.mo14219g() - bVar.mo14219g();
        }
    }

    /* renamed from: e.r.a.a$b */
    /* compiled from: ColorCutQuantizer */
    private class C4122b {

        /* renamed from: a */
        private int f12407a;

        /* renamed from: b */
        private int f12408b;

        /* renamed from: c */
        private int f12409c;

        /* renamed from: d */
        private int f12410d;

        /* renamed from: e */
        private int f12411e;

        /* renamed from: f */
        private int f12412f;

        /* renamed from: g */
        private int f12413g;

        /* renamed from: h */
        private int f12414h;

        /* renamed from: i */
        private int f12415i;

        C4122b(int i, int i2) {
            this.f12407a = i;
            this.f12408b = i2;
            mo14215c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo14213a() {
            return mo14217e() > 1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final int mo14214b() {
            int f = mo14218f();
            C4120a aVar = C4120a.this;
            int[] iArr = aVar.f12402a;
            int[] iArr2 = aVar.f12403b;
            C4120a.m18212e(iArr, f, this.f12407a, this.f12408b);
            Arrays.sort(iArr, this.f12407a, this.f12408b + 1);
            C4120a.m18212e(iArr, f, this.f12407a, this.f12408b);
            int i = this.f12409c / 2;
            int i2 = this.f12407a;
            int i3 = 0;
            while (true) {
                int i4 = this.f12408b;
                if (i2 > i4) {
                    return this.f12407a;
                }
                i3 += iArr2[iArr[i2]];
                if (i3 >= i) {
                    return Math.min(i4 - 1, i2);
                }
                i2++;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo14215c() {
            C4120a aVar = C4120a.this;
            int[] iArr = aVar.f12402a;
            int[] iArr2 = aVar.f12403b;
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = 0;
            for (int i8 = this.f12407a; i8 <= this.f12408b; i8++) {
                int i9 = iArr[i8];
                i7 += iArr2[i9];
                int k = C4120a.m18218k(i9);
                int j = C4120a.m18217j(i9);
                int i10 = C4120a.m18216i(i9);
                if (k > i4) {
                    i4 = k;
                }
                if (k < i) {
                    i = k;
                }
                if (j > i5) {
                    i5 = j;
                }
                if (j < i2) {
                    i2 = j;
                }
                if (i10 > i6) {
                    i6 = i10;
                }
                if (i10 < i3) {
                    i3 = i10;
                }
            }
            this.f12410d = i;
            this.f12411e = i4;
            this.f12412f = i2;
            this.f12413g = i5;
            this.f12414h = i3;
            this.f12415i = i6;
            this.f12409c = i7;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final C4123b.C4129e mo14216d() {
            C4120a aVar = C4120a.this;
            int[] iArr = aVar.f12402a;
            int[] iArr2 = aVar.f12403b;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = this.f12407a; i5 <= this.f12408b; i5++) {
                int i6 = iArr[i5];
                int i7 = iArr2[i6];
                i2 += i7;
                i += C4120a.m18218k(i6) * i7;
                i3 += C4120a.m18217j(i6) * i7;
                i4 += i7 * C4120a.m18216i(i6);
            }
            float f = (float) i2;
            return new C4123b.C4129e(C4120a.m18210b(Math.round(((float) i) / f), Math.round(((float) i3) / f), Math.round(((float) i4) / f)), i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final int mo14217e() {
            return (this.f12408b + 1) - this.f12407a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public final int mo14218f() {
            int i = this.f12411e - this.f12410d;
            int i2 = this.f12413g - this.f12412f;
            int i3 = this.f12415i - this.f12414h;
            if (i < i2 || i < i3) {
                return (i2 < i || i2 < i3) ? -1 : -2;
            }
            return -3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public final int mo14219g() {
            return ((this.f12411e - this.f12410d) + 1) * ((this.f12413g - this.f12412f) + 1) * ((this.f12415i - this.f12414h) + 1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public final C4122b mo14220h() {
            if (mo14213a()) {
                int b = mo14214b();
                C4122b bVar = new C4122b(b + 1, this.f12408b);
                this.f12408b = b;
                mo14215c();
                return bVar;
            }
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
    }

    C4120a(int[] iArr, int i, C4123b.C4127c[] cVarArr) {
        this.f12405d = cVarArr;
        int[] iArr2 = new int[32768];
        this.f12403b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int g = m18214g(iArr[i2]);
            iArr[i2] = g;
            iArr2[g] = iArr2[g] + 1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 32768; i4++) {
            if (iArr2[i4] > 0 && m18219l(i4)) {
                iArr2[i4] = 0;
            }
            if (iArr2[i4] > 0) {
                i3++;
            }
        }
        int[] iArr3 = new int[i3];
        this.f12402a = iArr3;
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                iArr3[i5] = i6;
                i5++;
            }
        }
        if (i3 <= i) {
            this.f12404c = new ArrayList();
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = iArr3[i7];
                this.f12404c.add(new C4123b.C4129e(m18209a(i8), iArr2[i8]));
            }
            return;
        }
        this.f12404c = m18215h(i);
    }

    /* renamed from: a */
    private static int m18209a(int i) {
        return m18210b(m18218k(i), m18217j(i), m18216i(i));
    }

    /* renamed from: b */
    static int m18210b(int i, int i2, int i3) {
        return Color.rgb(m18213f(i, 5, 8), m18213f(i2, 5, 8), m18213f(i3, 5, 8));
    }

    /* renamed from: c */
    private List<C4123b.C4129e> m18211c(Collection<C4122b> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (C4122b d : collection) {
            C4123b.C4129e d2 = d.mo14216d();
            if (!m18221n(d2)) {
                arrayList.add(d2);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    static void m18212e(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = m18216i(i4) | (m18217j(i4) << 10) | (m18218k(i4) << 5);
                i2++;
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = m18218k(i5) | (m18216i(i5) << 10) | (m18217j(i5) << 5);
                i2++;
            }
        }
    }

    /* renamed from: f */
    private static int m18213f(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    /* renamed from: g */
    private static int m18214g(int i) {
        return m18213f(Color.blue(i), 8, 5) | (m18213f(Color.red(i), 8, 5) << 10) | (m18213f(Color.green(i), 8, 5) << 5);
    }

    /* renamed from: h */
    private List<C4123b.C4129e> m18215h(int i) {
        PriorityQueue priorityQueue = new PriorityQueue(i, f12401f);
        priorityQueue.offer(new C4122b(0, this.f12402a.length - 1));
        m18222o(priorityQueue, i);
        return m18211c(priorityQueue);
    }

    /* renamed from: i */
    static int m18216i(int i) {
        return i & 31;
    }

    /* renamed from: j */
    static int m18217j(int i) {
        return (i >> 5) & 31;
    }

    /* renamed from: k */
    static int m18218k(int i) {
        return (i >> 10) & 31;
    }

    /* renamed from: l */
    private boolean m18219l(int i) {
        int a = m18209a(i);
        C3621a.m15588f(a, this.f12406e);
        return m18220m(a, this.f12406e);
    }

    /* renamed from: m */
    private boolean m18220m(int i, float[] fArr) {
        C4123b.C4127c[] cVarArr = this.f12405d;
        if (cVarArr != null && cVarArr.length > 0) {
            int length = cVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.f12405d[i2].mo14224a(i, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: n */
    private boolean m18221n(C4123b.C4129e eVar) {
        return m18220m(eVar.mo14235e(), eVar.mo14233c());
    }

    /* renamed from: o */
    private void m18222o(PriorityQueue<C4122b> priorityQueue, int i) {
        C4122b poll;
        while (priorityQueue.size() < i && (poll = priorityQueue.poll()) != null && poll.mo14213a()) {
            priorityQueue.offer(poll.mo14220h());
            priorityQueue.offer(poll);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public List<C4123b.C4129e> mo14210d() {
        return this.f12404c;
    }
}
