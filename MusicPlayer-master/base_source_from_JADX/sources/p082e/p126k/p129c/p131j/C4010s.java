package p082e.p126k.p129c.p131j;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p082e.p126k.p129c.p131j.C4042w1;
import p082e.p126k.p129c.p131j.C4056z;

/* renamed from: e.k.c.j.s */
/* compiled from: ExtensionSchemaLite */
final class C4010s extends C4007r<C4056z.C4060d> {

    /* renamed from: e.k.c.j.s$a */
    /* compiled from: ExtensionSchemaLite */
    static /* synthetic */ class C4011a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12163a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                e.k.c.j.w1$b[] r0 = p082e.p126k.p129c.p131j.C4042w1.C4044b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12163a = r0
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12163a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12163a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12163a     // Catch:{ NoSuchFieldError -> 0x0033 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f12163a     // Catch:{ NoSuchFieldError -> 0x003e }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f12163a     // Catch:{ NoSuchFieldError -> 0x0049 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f12163a     // Catch:{ NoSuchFieldError -> 0x0054 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f12163a     // Catch:{ NoSuchFieldError -> 0x0060 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f12163a     // Catch:{ NoSuchFieldError -> 0x006c }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.UINT32     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f12163a     // Catch:{ NoSuchFieldError -> 0x0078 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f12163a     // Catch:{ NoSuchFieldError -> 0x0084 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f12163a     // Catch:{ NoSuchFieldError -> 0x0090 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.SINT32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f12163a     // Catch:{ NoSuchFieldError -> 0x009c }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.SINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f12163a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.ENUM     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f12163a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.BYTES     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f12163a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.STRING     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f12163a     // Catch:{ NoSuchFieldError -> 0x00cc }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.GROUP     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f12163a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C4010s.C4011a.<clinit>():void");
        }
    }

    C4010s() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo13932a(Map.Entry<?, ?> entry) {
        return ((C4056z.C4060d) entry.getKey()).getNumber();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Object mo13933b(C4003q qVar, C4012s0 s0Var, int i) {
        return qVar.mo13909a(s0Var, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C4028v<C4056z.C4060d> mo13934c(Object obj) {
        return ((C4056z.C4059c) obj).extensions;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C4028v<C4056z.C4060d> mo13935d(Object obj) {
        return ((C4056z.C4059c) obj).mo14105L();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo13936e(C4012s0 s0Var) {
        return s0Var instanceof C4056z.C4059c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo13937f(Object obj) {
        mo13934c(obj).mo14036t();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public <UT, UB> UB mo13938g(C3933h1 h1Var, Object obj, C4003q qVar, C4028v<C4056z.C4060d> vVar, UB ub, C4006q1<UT, UB> q1Var) throws IOException {
        Object i;
        ArrayList arrayList;
        C4056z.C4061e eVar = (C4056z.C4061e) obj;
        int c = eVar.mo14111c();
        if (!eVar.f12242b.mo14039e() || !eVar.f12242b.isPacked()) {
            Object obj2 = null;
            if (eVar.mo14109a() != C4042w1.C4044b.ENUM) {
                switch (C4011a.f12163a[eVar.mo14109a().ordinal()]) {
                    case 1:
                        obj2 = Double.valueOf(h1Var.readDouble());
                        break;
                    case 2:
                        obj2 = Float.valueOf(h1Var.readFloat());
                        break;
                    case 3:
                        obj2 = Long.valueOf(h1Var.mo13489L());
                        break;
                    case 4:
                        obj2 = Long.valueOf(h1Var.mo13498c());
                        break;
                    case 5:
                        obj2 = Integer.valueOf(h1Var.mo13482E());
                        break;
                    case 6:
                        obj2 = Long.valueOf(h1Var.mo13499d());
                        break;
                    case 7:
                        obj2 = Integer.valueOf(h1Var.mo13505i());
                        break;
                    case 8:
                        obj2 = Boolean.valueOf(h1Var.mo13506j());
                        break;
                    case 9:
                        obj2 = Integer.valueOf(h1Var.mo13510n());
                        break;
                    case 10:
                        obj2 = Integer.valueOf(h1Var.mo13485H());
                        break;
                    case 11:
                        obj2 = Long.valueOf(h1Var.mo13507k());
                        break;
                    case 12:
                        obj2 = Integer.valueOf(h1Var.mo13520v());
                        break;
                    case 13:
                        obj2 = Long.valueOf(h1Var.mo13521w());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        obj2 = h1Var.mo13480C();
                        break;
                    case 16:
                        obj2 = h1Var.mo13523y();
                        break;
                    case 17:
                        obj2 = h1Var.mo13509m(eVar.mo14110b().getClass(), qVar);
                        break;
                    case 18:
                        obj2 = h1Var.mo13501e(eVar.mo14110b().getClass(), qVar);
                        break;
                }
            } else {
                int E = h1Var.mo13482E();
                if (eVar.f12242b.mo14108d().mo13461a(E) == null) {
                    return C3978l1.m17305L(c, E, ub, q1Var);
                }
                obj2 = Integer.valueOf(E);
            }
            if (eVar.mo14112d()) {
                vVar.mo14023a(eVar.f12242b, obj2);
            } else {
                int i2 = C4011a.f12163a[eVar.mo14109a().ordinal()];
                if ((i2 == 17 || i2 == 18) && (i = vVar.mo14029i(eVar.f12242b)) != null) {
                    obj2 = C3899b0.m16652h(i, obj2);
                }
                vVar.mo14038x(eVar.f12242b, obj2);
            }
        } else {
            switch (C4011a.f12163a[eVar.mo14109a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    h1Var.mo13487J(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    h1Var.mo13481D(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    h1Var.mo13511o(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    h1Var.mo13508l(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    h1Var.mo13513q(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    h1Var.mo13491N(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    h1Var.mo13519u(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    h1Var.mo13522x(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    h1Var.mo13504h(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    h1Var.mo13502f(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    h1Var.mo13512p(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    h1Var.mo13496b(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    h1Var.mo13503g(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    h1Var.mo13514r(arrayList);
                    ub = C3978l1.m17350z(c, arrayList, eVar.f12242b.mo14108d(), ub, q1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f12242b.mo14040f());
            }
            vVar.mo14038x(eVar.f12242b, arrayList);
        }
        return ub;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo13939h(C3933h1 h1Var, Object obj, C4003q qVar, C4028v<C4056z.C4060d> vVar) throws IOException {
        C4056z.C4061e eVar = (C4056z.C4061e) obj;
        vVar.mo14038x(eVar.f12242b, h1Var.mo13501e(eVar.mo14110b().getClass(), qVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo13940i(C3934i iVar, Object obj, C4003q qVar, C4028v<C4056z.C4060d> vVar) throws IOException {
        C4056z.C4061e eVar = (C4056z.C4061e) obj;
        C4012s0 x = eVar.mo14110b().mo13955g().mo13958x();
        C3917e P = C3917e.m16668P(ByteBuffer.wrap(iVar.toByteArray()), true);
        C3924e1.m16737a().mo13537b(x, P, qVar);
        vVar.mo14038x(eVar.f12242b, x);
        if (P.mo13524z() != Integer.MAX_VALUE) {
            throw C3911c0.invalidEndTag();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo13941j(C4052x1 x1Var, Map.Entry<?, ?> entry) throws IOException {
        C4056z.C4060d dVar = (C4056z.C4060d) entry.getKey();
        if (dVar.mo14039e()) {
            switch (C4011a.f12163a[dVar.mo14040f().ordinal()]) {
                case 1:
                    C3978l1.m17309P(dVar.getNumber(), (List) entry.getValue(), x1Var, dVar.isPacked());
                    return;
                case 2:
                    C3978l1.m17313T(dVar.getNumber(), (List) entry.getValue(), x1Var, dVar.isPacked());
                    return;
                case 3:
                    C3978l1.m17316W(dVar.getNumber(), (List) entry.getValue(), x1Var, dVar.isPacked());
                    return;
                case 4:
                    C3978l1.m17329e0(dVar.getNumber(), (List) entry.getValue(), x1Var, dVar.isPacked());
                    return;
                case 5:
                    C3978l1.m17315V(dVar.getNumber(), (List) entry.getValue(), x1Var, dVar.isPacked());
                    return;
                case 6:
                    C3978l1.m17312S(dVar.getNumber(), (List) entry.getValue(), x1Var, dVar.isPacked());
                    return;
                case 7:
                    C3978l1.m17311R(dVar.getNumber(), (List) entry.getValue(), x1Var, dVar.isPacked());
                    return;
                case 8:
                    C3978l1.m17307N(dVar.getNumber(), (List) entry.getValue(), x1Var, dVar.isPacked());
                    return;
                case 9:
                    C3978l1.m17327d0(dVar.getNumber(), (List) entry.getValue(), x1Var, dVar.isPacked());
                    return;
                case 10:
                    C3978l1.m17318Y(dVar.getNumber(), (List) entry.getValue(), x1Var, dVar.isPacked());
                    return;
                case 11:
                    C3978l1.m17319Z(dVar.getNumber(), (List) entry.getValue(), x1Var, dVar.isPacked());
                    return;
                case 12:
                    C3978l1.m17321a0(dVar.getNumber(), (List) entry.getValue(), x1Var, dVar.isPacked());
                    return;
                case 13:
                    C3978l1.m17323b0(dVar.getNumber(), (List) entry.getValue(), x1Var, dVar.isPacked());
                    return;
                case 14:
                    C3978l1.m17315V(dVar.getNumber(), (List) entry.getValue(), x1Var, dVar.isPacked());
                    return;
                case 15:
                    C3978l1.m17308O(dVar.getNumber(), (List) entry.getValue(), x1Var);
                    return;
                case 16:
                    C3978l1.m17325c0(dVar.getNumber(), (List) entry.getValue(), x1Var);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        C3978l1.m17314U(dVar.getNumber(), (List) entry.getValue(), x1Var, C3924e1.m16737a().mo13539d(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        C3978l1.m17317X(dVar.getNumber(), (List) entry.getValue(), x1Var, C3924e1.m16737a().mo13539d(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            switch (C4011a.f12163a[dVar.mo14040f().ordinal()]) {
                case 1:
                    x1Var.mo13801e(dVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    x1Var.mo13786E(dVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    x1Var.mo13812p(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    x1Var.mo13810n(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                    x1Var.mo13816t(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    x1Var.mo13804h(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    x1Var.mo13800d(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    x1Var.mo13813q(dVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    x1Var.mo13798b(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    x1Var.mo13814r(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    x1Var.mo13820x(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    x1Var.mo13794M(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    x1Var.mo13785D(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 14:
                    x1Var.mo13816t(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    x1Var.mo13819w(dVar.getNumber(), (C3934i) entry.getValue());
                    return;
                case 16:
                    x1Var.mo13809m(dVar.getNumber(), (String) entry.getValue());
                    return;
                case 17:
                    x1Var.mo13796O(dVar.getNumber(), entry.getValue(), C3924e1.m16737a().mo13539d(entry.getValue().getClass()));
                    return;
                case 18:
                    x1Var.mo13822z(dVar.getNumber(), entry.getValue(), C3924e1.m16737a().mo13539d(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
    }
}
