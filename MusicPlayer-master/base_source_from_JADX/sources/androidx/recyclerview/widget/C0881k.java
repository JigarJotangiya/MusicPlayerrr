package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p082e.p109h.p115l.C3656k;

/* renamed from: androidx.recyclerview.widget.k */
/* compiled from: GapWorker */
final class C0881k implements Runnable {

    /* renamed from: k */
    static final ThreadLocal<C0881k> f3958k = new ThreadLocal<>();

    /* renamed from: l */
    static Comparator<C0884c> f3959l = new C0882a();

    /* renamed from: g */
    ArrayList<RecyclerView> f3960g = new ArrayList<>();

    /* renamed from: h */
    long f3961h;

    /* renamed from: i */
    long f3962i;

    /* renamed from: j */
    private ArrayList<C0884c> f3963j = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.k$a */
    /* compiled from: GapWorker */
    class C0882a implements Comparator<C0884c> {
        C0882a() {
        }

        /* renamed from: a */
        public int compare(C0884c cVar, C0884c cVar2) {
            RecyclerView recyclerView = cVar.f3971d;
            if ((recyclerView == null) != (cVar2.f3971d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = cVar.f3968a;
            if (z == cVar2.f3968a) {
                int i = cVar2.f3969b - cVar.f3969b;
                if (i != 0) {
                    return i;
                }
                int i2 = cVar.f3970c - cVar2.f3970c;
                if (i2 != 0) {
                    return i2;
                }
                return 0;
            } else if (z) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.k$b */
    /* compiled from: GapWorker */
    static class C0883b implements RecyclerView.C0809p.C0812c {

        /* renamed from: a */
        int f3964a;

        /* renamed from: b */
        int f3965b;

        /* renamed from: c */
        int[] f3966c;

        /* renamed from: d */
        int f3967d;

        C0883b() {
        }

        /* renamed from: a */
        public void mo4977a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f3967d * 2;
                int[] iArr = this.f3966c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f3966c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f3966c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f3966c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f3967d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5300b() {
            int[] iArr = this.f3966c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3967d = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5301c(RecyclerView recyclerView, boolean z) {
            this.f3967d = 0;
            int[] iArr = this.f3966c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.C0809p pVar = recyclerView.f3609s;
            if (recyclerView.f3607r != null && pVar != null && pVar.mo4965v0()) {
                if (z) {
                    if (!recyclerView.f3591j.mo5153p()) {
                        pVar.mo4502q(recyclerView.f3607r.getItemCount(), this);
                    }
                } else if (!recyclerView.mo4663s0()) {
                    pVar.mo4500p(this.f3964a, this.f3965b, recyclerView.f3602o0, this);
                }
                int i = this.f3967d;
                if (i > pVar.f3665m) {
                    pVar.f3665m = i;
                    pVar.f3666n = z;
                    recyclerView.f3587h.mo5006K();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo5302d(int i) {
            if (this.f3966c != null) {
                int i2 = this.f3967d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f3966c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5303e(int i, int i2) {
            this.f3964a = i;
            this.f3965b = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.k$c */
    /* compiled from: GapWorker */
    static class C0884c {

        /* renamed from: a */
        public boolean f3968a;

        /* renamed from: b */
        public int f3969b;

        /* renamed from: c */
        public int f3970c;

        /* renamed from: d */
        public RecyclerView f3971d;

        /* renamed from: e */
        public int f3972e;

        C0884c() {
        }

        /* renamed from: a */
        public void mo5304a() {
            this.f3968a = false;
            this.f3969b = 0;
            this.f3970c = 0;
            this.f3971d = null;
            this.f3972e = 0;
        }
    }

    C0881k() {
    }

    /* renamed from: b */
    private void m5448b() {
        C0884c cVar;
        int size = this.f3960g.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f3960g.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f3600n0.mo5301c(recyclerView, false);
                i += recyclerView.f3600n0.f3967d;
            }
        }
        this.f3963j.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f3960g.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0883b bVar = recyclerView2.f3600n0;
                int abs = Math.abs(bVar.f3964a) + Math.abs(bVar.f3965b);
                for (int i5 = 0; i5 < bVar.f3967d * 2; i5 += 2) {
                    if (i3 >= this.f3963j.size()) {
                        cVar = new C0884c();
                        this.f3963j.add(cVar);
                    } else {
                        cVar = this.f3963j.get(i3);
                    }
                    int[] iArr = bVar.f3966c;
                    int i6 = iArr[i5 + 1];
                    cVar.f3968a = i6 <= abs;
                    cVar.f3969b = abs;
                    cVar.f3970c = i6;
                    cVar.f3971d = recyclerView2;
                    cVar.f3972e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f3963j, f3959l);
    }

    /* renamed from: c */
    private void m5449c(C0884c cVar, long j) {
        RecyclerView.C0792c0 i = m5453i(cVar.f3971d, cVar.f3972e, cVar.f3968a ? Long.MAX_VALUE : j);
        if (i != null && i.mNestedRecyclerView != null && i.isBound() && !i.isInvalid()) {
            m5452h((RecyclerView) i.mNestedRecyclerView.get(), j);
        }
    }

    /* renamed from: d */
    private void m5450d(long j) {
        int i = 0;
        while (i < this.f3963j.size()) {
            C0884c cVar = this.f3963j.get(i);
            if (cVar.f3971d != null) {
                m5449c(cVar, j);
                cVar.mo5304a();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    static boolean m5451e(RecyclerView recyclerView, int i) {
        int j = recyclerView.f3593k.mo5220j();
        for (int i2 = 0; i2 < j; i2++) {
            RecyclerView.C0792c0 k0 = RecyclerView.m4641k0(recyclerView.f3593k.mo5219i(i2));
            if (k0.mPosition == i && !k0.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m5452h(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.f3566K && recyclerView.f3593k.mo5220j() != 0) {
                recyclerView.mo4574b1();
            }
            C0883b bVar = recyclerView.f3600n0;
            bVar.mo5301c(recyclerView, true);
            if (bVar.f3967d != 0) {
                try {
                    C3656k.m15717a("RV Nested Prefetch");
                    recyclerView.f3602o0.mo5061f(recyclerView.f3607r);
                    for (int i = 0; i < bVar.f3967d * 2; i += 2) {
                        m5453i(recyclerView, bVar.f3966c[i], j);
                    }
                } finally {
                    C3656k.m15718b();
                }
            }
        }
    }

    /* renamed from: i */
    private RecyclerView.C0792c0 m5453i(RecyclerView recyclerView, int i, long j) {
        if (m5451e(recyclerView, i)) {
            return null;
        }
        RecyclerView.C0820v vVar = recyclerView.f3587h;
        try {
            recyclerView.mo4554N0();
            RecyclerView.C0792c0 I = vVar.mo5004I(i, false, j);
            if (I != null) {
                if (!I.isBound() || I.isInvalid()) {
                    vVar.mo5009a(I, false);
                } else {
                    vVar.mo4998B(I.itemView);
                }
            }
            return I;
        } finally {
            recyclerView.mo4558P0(false);
        }
    }

    /* renamed from: a */
    public void mo5293a(RecyclerView recyclerView) {
        this.f3960g.add(recyclerView);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo5294f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f3961h == 0) {
            this.f3961h = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f3600n0.mo5303e(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo5295g(long j) {
        m5448b();
        m5450d(j);
    }

    /* renamed from: j */
    public void mo5296j(RecyclerView recyclerView) {
        this.f3960g.remove(recyclerView);
    }

    public void run() {
        try {
            C3656k.m15717a("RV Prefetch");
            if (!this.f3960g.isEmpty()) {
                int size = this.f3960g.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f3960g.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    mo5295g(TimeUnit.MILLISECONDS.toNanos(j) + this.f3962i);
                    this.f3961h = 0;
                    C3656k.m15718b();
                }
            }
        } finally {
            this.f3961h = 0;
            C3656k.m15718b();
        }
    }
}
