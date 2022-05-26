package p394k;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import p369i.p377u.C8461b;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: k.q */
/* compiled from: Options.kt */
public final class C8648q extends C8461b<C8638h> implements RandomAccess {

    /* renamed from: j */
    public static final C8649a f34993j = new C8649a((C8589g) null);

    /* renamed from: h */
    private final C8638h[] f34994h;

    /* renamed from: i */
    private final int[] f34995i;

    /* renamed from: k.q$a */
    /* compiled from: Options.kt */
    public static final class C8649a {
        private C8649a() {
        }

        /* renamed from: a */
        private final void m47007a(long j, C8633e eVar, int i, List<? extends C8638h> list, int i2, int i3, List<Integer> list2) {
            int i4;
            int i5;
            int i6;
            int i7;
            C8633e eVar2;
            C8633e eVar3 = eVar;
            int i8 = i;
            List<? extends C8638h> list3 = list;
            int i9 = i2;
            int i10 = i3;
            List<Integer> list4 = list2;
            if (i9 < i10) {
                int i11 = i9;
                while (i11 < i10) {
                    if (((C8638h) list3.get(i11)).size() >= i8) {
                        i11++;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                C8638h hVar = (C8638h) list.get(i2);
                C8638h hVar2 = (C8638h) list3.get(i10 - 1);
                if (i8 == hVar.size()) {
                    int intValue = list4.get(i9).intValue();
                    int i12 = i9 + 1;
                    i4 = i12;
                    i5 = intValue;
                    hVar = (C8638h) list3.get(i12);
                } else {
                    i4 = i9;
                    i5 = -1;
                }
                if (hVar.getByte(i8) != hVar2.getByte(i8)) {
                    int i13 = 1;
                    for (int i14 = i4 + 1; i14 < i10; i14++) {
                        if (((C8638h) list3.get(i14 - 1)).getByte(i8) != ((C8638h) list3.get(i14)).getByte(i8)) {
                            i13++;
                        }
                    }
                    long c = j + m47009c(eVar3) + ((long) 2) + ((long) (i13 * 2));
                    eVar3.mo30701d1(i13);
                    eVar3.mo30701d1(i5);
                    for (int i15 = i4; i15 < i10; i15++) {
                        byte b = ((C8638h) list3.get(i15)).getByte(i8);
                        if (i15 == i4 || b != ((C8638h) list3.get(i15 - 1)).getByte(i8)) {
                            eVar3.mo30701d1(b & 255);
                        }
                    }
                    C8633e eVar4 = new C8633e();
                    while (i4 < i10) {
                        byte b2 = ((C8638h) list3.get(i4)).getByte(i8);
                        int i16 = i4 + 1;
                        int i17 = i16;
                        while (true) {
                            if (i17 >= i10) {
                                i6 = i10;
                                break;
                            } else if (b2 != ((C8638h) list3.get(i17)).getByte(i8)) {
                                i6 = i17;
                                break;
                            } else {
                                i17++;
                            }
                        }
                        if (i16 == i6 && i8 + 1 == ((C8638h) list3.get(i4)).size()) {
                            eVar3.mo30701d1(list4.get(i4).intValue());
                            i7 = i6;
                            eVar2 = eVar4;
                        } else {
                            eVar3.mo30701d1(((int) (c + m47009c(eVar4))) * -1);
                            i7 = i6;
                            eVar2 = eVar4;
                            m47007a(c, eVar4, i8 + 1, list, i4, i6, list2);
                        }
                        eVar4 = eVar2;
                        i4 = i7;
                    }
                    eVar3.mo30703e0(eVar4);
                    return;
                }
                int min = Math.min(hVar.size(), hVar2.size());
                int i18 = i8;
                int i19 = 0;
                while (i18 < min && hVar.getByte(i18) == hVar2.getByte(i18)) {
                    i19++;
                    i18++;
                }
                long c2 = j + m47009c(eVar3) + ((long) 2) + ((long) i19) + 1;
                eVar3.mo30701d1(-i19);
                eVar3.mo30701d1(i5);
                int i20 = i8 + i19;
                while (i8 < i20) {
                    eVar3.mo30701d1(hVar.getByte(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i10) {
                    if (i20 == ((C8638h) list3.get(i4)).size()) {
                        eVar3.mo30701d1(list4.get(i4).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                C8633e eVar5 = new C8633e();
                eVar3.mo30701d1(((int) (m47009c(eVar5) + c2)) * -1);
                m47007a(c2, eVar5, i20, list, i4, i3, list2);
                eVar3.mo30703e0(eVar5);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: b */
        static /* synthetic */ void m47008b(C8649a aVar, long j, C8633e eVar, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            aVar.m47007a((i4 & 1) != 0 ? 0 : j, eVar, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        /* renamed from: c */
        private final long m47009c(C8633e eVar) {
            return eVar.mo30688U0() / ((long) 4);
        }

        /* renamed from: d */
        public final C8648q mo30821d(C8638h... hVarArr) {
            C8638h[] hVarArr2 = hVarArr;
            C8594l.m46771e(hVarArr2, "byteStrings");
            int i = 0;
            if (hVarArr2.length == 0) {
                return new C8648q(new C8638h[0], new int[]{0, -1}, (C8589g) null);
            }
            List v = C8477h.m46637v(hVarArr);
            C8486p.m46673n(v);
            ArrayList arrayList = new ArrayList(hVarArr2.length);
            for (C8638h hVar : hVarArr2) {
                arrayList.add(-1);
            }
            Object[] array = arrayList.toArray(new Integer[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Integer[] numArr = (Integer[]) array;
            List i2 = C8482l.m46668i((Integer[]) Arrays.copyOf(numArr, numArr.length));
            int length = hVarArr2.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                i2.set(C8482l.m46664e(v, hVarArr2[i3], 0, 0, 6, (Object) null), Integer.valueOf(i4));
                i3++;
                i4++;
            }
            if (((C8638h) v.get(0)).size() > 0) {
                int i5 = 0;
                while (i5 < v.size()) {
                    C8638h hVar2 = (C8638h) v.get(i5);
                    int i6 = i5 + 1;
                    int i7 = i6;
                    while (i7 < v.size()) {
                        C8638h hVar3 = (C8638h) v.get(i7);
                        if (!hVar3.startsWith(hVar2)) {
                            continue;
                            break;
                        }
                        if (!(hVar3.size() != hVar2.size())) {
                            throw new IllegalArgumentException(("duplicate option: " + hVar3).toString());
                        } else if (((Number) i2.get(i7)).intValue() > ((Number) i2.get(i5)).intValue()) {
                            v.remove(i7);
                            i2.remove(i7);
                        } else {
                            i7++;
                        }
                    }
                    i5 = i6;
                }
                C8633e eVar = new C8633e();
                m47008b(this, 0, eVar, 0, v, 0, 0, i2, 53, (Object) null);
                int[] iArr = new int[((int) m47009c(eVar))];
                while (!eVar.mo30664A()) {
                    iArr[i] = eVar.readInt();
                    i++;
                }
                Object[] copyOf = Arrays.copyOf(hVarArr2, hVarArr2.length);
                C8594l.m46770d(copyOf, "java.util.Arrays.copyOf(this, size)");
                return new C8648q((C8638h[]) copyOf, iArr, (C8589g) null);
            }
            throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
        }

        public /* synthetic */ C8649a(C8589g gVar) {
            this();
        }
    }

    public /* synthetic */ C8648q(C8638h[] hVarArr, int[] iArr, C8589g gVar) {
        this(hVarArr, iArr);
    }

    /* renamed from: y */
    public static final C8648q m46999y(C8638h... hVarArr) {
        return f34993j.mo30821d(hVarArr);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C8638h) {
            return mo30815p((C8638h) obj);
        }
        return false;
    }

    /* renamed from: d */
    public int mo30438d() {
        return this.f34994h.length;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C8638h) {
            return mo30819v((C8638h) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C8638h) {
            return mo30820x((C8638h) obj);
        }
        return -1;
    }

    /* renamed from: p */
    public /* bridge */ boolean mo30815p(C8638h hVar) {
        return super.contains(hVar);
    }

    /* renamed from: s */
    public C8638h get(int i) {
        return this.f34994h[i];
    }

    /* renamed from: t */
    public final C8638h[] mo30817t() {
        return this.f34994h;
    }

    /* renamed from: u */
    public final int[] mo30818u() {
        return this.f34995i;
    }

    /* renamed from: v */
    public /* bridge */ int mo30819v(C8638h hVar) {
        return super.indexOf(hVar);
    }

    /* renamed from: x */
    public /* bridge */ int mo30820x(C8638h hVar) {
        return super.lastIndexOf(hVar);
    }

    private C8648q(C8638h[] hVarArr, int[] iArr) {
        this.f34994h = hVarArr;
        this.f34995i = iArr;
    }
}
