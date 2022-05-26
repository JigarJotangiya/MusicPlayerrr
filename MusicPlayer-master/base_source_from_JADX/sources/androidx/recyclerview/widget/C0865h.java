package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.h */
/* compiled from: DiffUtil */
public class C0865h {

    /* renamed from: a */
    private static final Comparator<C0869d> f3893a = new C0866a();

    /* renamed from: androidx.recyclerview.widget.h$a */
    /* compiled from: DiffUtil */
    class C0866a implements Comparator<C0869d> {
        C0866a() {
        }

        /* renamed from: a */
        public int compare(C0869d dVar, C0869d dVar2) {
            return dVar.f3896a - dVar2.f3896a;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$b */
    /* compiled from: DiffUtil */
    public static abstract class C0867b {
        /* renamed from: a */
        public abstract boolean mo5203a(int i, int i2);

        /* renamed from: b */
        public abstract boolean mo5204b(int i, int i2);

        /* renamed from: c */
        public abstract Object mo5205c(int i, int i2);

        /* renamed from: d */
        public abstract int mo5206d();

        /* renamed from: e */
        public abstract int mo5207e();
    }

    /* renamed from: androidx.recyclerview.widget.h$c */
    /* compiled from: DiffUtil */
    static class C0868c {

        /* renamed from: a */
        private final int[] f3894a;

        /* renamed from: b */
        private final int f3895b;

        C0868c(int i) {
            int[] iArr = new int[i];
            this.f3894a = iArr;
            this.f3895b = iArr.length / 2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int[] mo5265a() {
            return this.f3894a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo5266b(int i) {
            return this.f3894a[i + this.f3895b];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5267c(int i, int i2) {
            this.f3894a[i + this.f3895b] = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$d */
    /* compiled from: DiffUtil */
    static class C0869d {

        /* renamed from: a */
        public final int f3896a;

        /* renamed from: b */
        public final int f3897b;

        /* renamed from: c */
        public final int f3898c;

        C0869d(int i, int i2, int i3) {
            this.f3896a = i;
            this.f3897b = i2;
            this.f3898c = i3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo5268a() {
            return this.f3896a + this.f3898c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo5269b() {
            return this.f3897b + this.f3898c;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$e */
    /* compiled from: DiffUtil */
    public static class C0870e {

        /* renamed from: a */
        private final List<C0869d> f3899a;

        /* renamed from: b */
        private final int[] f3900b;

        /* renamed from: c */
        private final int[] f3901c;

        /* renamed from: d */
        private final C0867b f3902d;

        /* renamed from: e */
        private final int f3903e;

        /* renamed from: f */
        private final int f3904f;

        /* renamed from: g */
        private final boolean f3905g;

        C0870e(C0867b bVar, List<C0869d> list, int[] iArr, int[] iArr2, boolean z) {
            this.f3899a = list;
            this.f3900b = iArr;
            this.f3901c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f3902d = bVar;
            this.f3903e = bVar.mo5207e();
            this.f3904f = bVar.mo5206d();
            this.f3905g = z;
            m5406a();
            m5408d();
        }

        /* renamed from: a */
        private void m5406a() {
            C0869d dVar = this.f3899a.isEmpty() ? null : this.f3899a.get(0);
            if (!(dVar != null && dVar.f3896a == 0 && dVar.f3897b == 0)) {
                this.f3899a.add(0, new C0869d(0, 0, 0));
            }
            this.f3899a.add(new C0869d(this.f3903e, this.f3904f, 0));
        }

        /* renamed from: c */
        private void m5407c(int i) {
            int size = this.f3899a.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C0869d dVar = this.f3899a.get(i3);
                while (i2 < dVar.f3897b) {
                    if (this.f3901c[i2] != 0 || !this.f3902d.mo5204b(i, i2)) {
                        i2++;
                    } else {
                        int i4 = this.f3902d.mo5203a(i, i2) ? 8 : 4;
                        this.f3900b[i] = (i2 << 4) | i4;
                        this.f3901c[i2] = (i << 4) | i4;
                        return;
                    }
                }
                i2 = dVar.mo5269b();
            }
        }

        /* renamed from: d */
        private void m5408d() {
            for (C0869d next : this.f3899a) {
                for (int i = 0; i < next.f3898c; i++) {
                    int i2 = next.f3896a + i;
                    int i3 = next.f3897b + i;
                    int i4 = this.f3902d.mo5203a(i2, i3) ? 1 : 2;
                    this.f3900b[i2] = (i3 << 4) | i4;
                    this.f3901c[i3] = (i2 << 4) | i4;
                }
            }
            if (this.f3905g) {
                m5409e();
            }
        }

        /* renamed from: e */
        private void m5409e() {
            int i = 0;
            for (C0869d next : this.f3899a) {
                while (i < next.f3896a) {
                    if (this.f3900b[i] == 0) {
                        m5407c(i);
                    }
                    i++;
                }
                i = next.mo5268a();
            }
        }

        /* renamed from: f */
        private static C0872g m5410f(Collection<C0872g> collection, int i, boolean z) {
            C0872g gVar;
            Iterator<C0872g> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    gVar = null;
                    break;
                }
                gVar = it.next();
                if (gVar.f3906a == i && gVar.f3908c == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                C0872g next = it.next();
                if (z) {
                    next.f3907b--;
                } else {
                    next.f3907b++;
                }
            }
            return gVar;
        }

        /* renamed from: b */
        public void mo5270b(C0905s sVar) {
            C0850e eVar;
            int i;
            if (sVar instanceof C0850e) {
                eVar = (C0850e) sVar;
            } else {
                eVar = new C0850e(sVar);
            }
            int i2 = this.f3903e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = this.f3903e;
            int i4 = this.f3904f;
            for (int size = this.f3899a.size() - 1; size >= 0; size--) {
                C0869d dVar = this.f3899a.get(size);
                int a = dVar.mo5268a();
                int b = dVar.mo5269b();
                while (true) {
                    if (i3 <= a) {
                        break;
                    }
                    i3--;
                    int i5 = this.f3900b[i3];
                    if ((i5 & 12) != 0) {
                        int i6 = i5 >> 4;
                        C0872g f = m5410f(arrayDeque, i6, false);
                        if (f != null) {
                            int i7 = (i2 - f.f3907b) - 1;
                            eVar.mo5173a(i3, i7);
                            if ((i5 & 4) != 0) {
                                eVar.mo5176d(i7, 1, this.f3902d.mo5205c(i3, i6));
                            }
                        } else {
                            arrayDeque.add(new C0872g(i3, (i2 - i3) - 1, true));
                        }
                    } else {
                        eVar.mo5175c(i3, 1);
                        i2--;
                    }
                }
                while (i4 > b) {
                    i4--;
                    int i8 = this.f3901c[i4];
                    if ((i8 & 12) != 0) {
                        int i9 = i8 >> 4;
                        C0872g f2 = m5410f(arrayDeque, i9, true);
                        if (f2 == null) {
                            arrayDeque.add(new C0872g(i4, i2 - i3, false));
                        } else {
                            eVar.mo5173a((i2 - f2.f3907b) - 1, i3);
                            if ((i8 & 4) != 0) {
                                eVar.mo5176d(i3, 1, this.f3902d.mo5205c(i9, i4));
                            }
                        }
                    } else {
                        eVar.mo5174b(i3, 1);
                        i2++;
                    }
                }
                int i10 = dVar.f3896a;
                int i11 = dVar.f3897b;
                for (i = 0; i < dVar.f3898c; i++) {
                    if ((this.f3900b[i10] & 15) == 2) {
                        eVar.mo5176d(i10, 1, this.f3902d.mo5205c(i10, i11));
                    }
                    i10++;
                    i11++;
                }
                i3 = dVar.f3896a;
                i4 = dVar.f3897b;
            }
            eVar.mo5211e();
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$f */
    /* compiled from: DiffUtil */
    public static abstract class C0871f<T> {
        /* renamed from: a */
        public abstract boolean mo5271a(T t, T t2);

        /* renamed from: b */
        public abstract boolean mo5272b(T t, T t2);

        /* renamed from: c */
        public Object mo5273c(T t, T t2) {
            return null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$g */
    /* compiled from: DiffUtil */
    private static class C0872g {

        /* renamed from: a */
        int f3906a;

        /* renamed from: b */
        int f3907b;

        /* renamed from: c */
        boolean f3908c;

        C0872g(int i, int i2, boolean z) {
            this.f3906a = i;
            this.f3907b = i2;
            this.f3908c = z;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$h */
    /* compiled from: DiffUtil */
    static class C0873h {

        /* renamed from: a */
        int f3909a;

        /* renamed from: b */
        int f3910b;

        /* renamed from: c */
        int f3911c;

        /* renamed from: d */
        int f3912d;

        public C0873h() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo5274a() {
            return this.f3912d - this.f3911c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo5275b() {
            return this.f3910b - this.f3909a;
        }

        public C0873h(int i, int i2, int i3, int i4) {
            this.f3909a = i;
            this.f3910b = i2;
            this.f3911c = i3;
            this.f3912d = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$i */
    /* compiled from: DiffUtil */
    static class C0874i {

        /* renamed from: a */
        public int f3913a;

        /* renamed from: b */
        public int f3914b;

        /* renamed from: c */
        public int f3915c;

        /* renamed from: d */
        public int f3916d;

        /* renamed from: e */
        public boolean f3917e;

        C0874i() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo5276a() {
            return Math.min(this.f3915c - this.f3913a, this.f3916d - this.f3914b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo5277b() {
            return this.f3916d - this.f3914b != this.f3915c - this.f3913a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo5278c() {
            return this.f3916d - this.f3914b > this.f3915c - this.f3913a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C0869d mo5279d() {
            if (!mo5277b()) {
                int i = this.f3913a;
                return new C0869d(i, this.f3914b, this.f3915c - i);
            } else if (this.f3917e) {
                return new C0869d(this.f3913a, this.f3914b, mo5276a());
            } else {
                if (mo5278c()) {
                    return new C0869d(this.f3913a, this.f3914b + 1, mo5276a());
                }
                return new C0869d(this.f3913a + 1, this.f3914b, mo5276a());
            }
        }
    }

    /* renamed from: a */
    private static C0874i m5390a(C0873h hVar, C0867b bVar, C0868c cVar, C0868c cVar2, int i) {
        int i2;
        int i3;
        int i4;
        boolean z = (hVar.mo5275b() - hVar.mo5274a()) % 2 == 0;
        int b = hVar.mo5275b() - hVar.mo5274a();
        int i5 = -i;
        int i6 = i5;
        while (i6 <= i) {
            if (i6 == i5 || (i6 != i && cVar2.mo5266b(i6 + 1) < cVar2.mo5266b(i6 - 1))) {
                i3 = cVar2.mo5266b(i6 + 1);
                i2 = i3;
            } else {
                i3 = cVar2.mo5266b(i6 - 1);
                i2 = i3 - 1;
            }
            int i7 = hVar.f3912d - ((hVar.f3910b - i2) - i6);
            int i8 = (i == 0 || i2 != i3) ? i7 : i7 + 1;
            while (i2 > hVar.f3909a && i7 > hVar.f3911c && bVar.mo5204b(i2 - 1, i7 - 1)) {
                i2--;
                i7--;
            }
            cVar2.mo5267c(i6, i2);
            if (!z || (i4 = b - i6) < i5 || i4 > i || cVar.mo5266b(i4) < i2) {
                i6 += 2;
            } else {
                C0874i iVar = new C0874i();
                iVar.f3913a = i2;
                iVar.f3914b = i7;
                iVar.f3915c = i3;
                iVar.f3916d = i8;
                iVar.f3917e = true;
                return iVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C0870e m5391b(C0867b bVar) {
        return m5392c(bVar, true);
    }

    /* renamed from: c */
    public static C0870e m5392c(C0867b bVar, boolean z) {
        C0873h hVar;
        int e = bVar.mo5207e();
        int d = bVar.mo5206d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0873h(0, e, 0, d));
        int i = ((((e + d) + 1) / 2) * 2) + 1;
        C0868c cVar = new C0868c(i);
        C0868c cVar2 = new C0868c(i);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C0873h hVar2 = (C0873h) arrayList2.remove(arrayList2.size() - 1);
            C0874i e2 = m5394e(hVar2, bVar, cVar, cVar2);
            if (e2 != null) {
                if (e2.mo5276a() > 0) {
                    arrayList.add(e2.mo5279d());
                }
                if (arrayList3.isEmpty()) {
                    hVar = new C0873h();
                } else {
                    hVar = (C0873h) arrayList3.remove(arrayList3.size() - 1);
                }
                hVar.f3909a = hVar2.f3909a;
                hVar.f3911c = hVar2.f3911c;
                hVar.f3910b = e2.f3913a;
                hVar.f3912d = e2.f3914b;
                arrayList2.add(hVar);
                hVar2.f3910b = hVar2.f3910b;
                hVar2.f3912d = hVar2.f3912d;
                hVar2.f3909a = e2.f3915c;
                hVar2.f3911c = e2.f3916d;
                arrayList2.add(hVar2);
            } else {
                arrayList3.add(hVar2);
            }
        }
        Collections.sort(arrayList, f3893a);
        return new C0870e(bVar, arrayList, cVar.mo5265a(), cVar2.mo5265a(), z);
    }

    /* renamed from: d */
    private static C0874i m5393d(C0873h hVar, C0867b bVar, C0868c cVar, C0868c cVar2, int i) {
        int i2;
        int i3;
        int i4;
        boolean z = true;
        if (Math.abs(hVar.mo5275b() - hVar.mo5274a()) % 2 != 1) {
            z = false;
        }
        int b = hVar.mo5275b() - hVar.mo5274a();
        int i5 = -i;
        int i6 = i5;
        while (i6 <= i) {
            if (i6 == i5 || (i6 != i && cVar.mo5266b(i6 + 1) > cVar.mo5266b(i6 - 1))) {
                i3 = cVar.mo5266b(i6 + 1);
                i2 = i3;
            } else {
                i3 = cVar.mo5266b(i6 - 1);
                i2 = i3 + 1;
            }
            int i7 = (hVar.f3911c + (i2 - hVar.f3909a)) - i6;
            int i8 = (i == 0 || i2 != i3) ? i7 : i7 - 1;
            while (i2 < hVar.f3910b && i7 < hVar.f3912d && bVar.mo5204b(i2, i7)) {
                i2++;
                i7++;
            }
            cVar.mo5267c(i6, i2);
            if (!z || (i4 = b - i6) < i5 + 1 || i4 > i - 1 || cVar2.mo5266b(i4) > i2) {
                i6 += 2;
            } else {
                C0874i iVar = new C0874i();
                iVar.f3913a = i3;
                iVar.f3914b = i8;
                iVar.f3915c = i2;
                iVar.f3916d = i7;
                iVar.f3917e = false;
                return iVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    private static C0874i m5394e(C0873h hVar, C0867b bVar, C0868c cVar, C0868c cVar2) {
        if (hVar.mo5275b() >= 1 && hVar.mo5274a() >= 1) {
            int b = ((hVar.mo5275b() + hVar.mo5274a()) + 1) / 2;
            cVar.mo5267c(1, hVar.f3909a);
            cVar2.mo5267c(1, hVar.f3910b);
            for (int i = 0; i < b; i++) {
                C0874i d = m5393d(hVar, bVar, cVar, cVar2, i);
                if (d != null) {
                    return d;
                }
                C0874i a = m5390a(hVar, bVar, cVar, cVar2, i);
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }
}
