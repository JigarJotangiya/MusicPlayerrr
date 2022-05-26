package p369i.p383x;

import java.lang.reflect.Method;
import p369i.p371b0.C8377b;
import p369i.p371b0.C8379c;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.x.a */
/* compiled from: PlatformImplementations.kt */
public class C8540a {

    /* renamed from: i.x.a$a */
    /* compiled from: PlatformImplementations.kt */
    private static final class C8541a {

        /* renamed from: a */
        public static final Method f34923a;

        /* JADX WARNING: Removed duplicated region for block: B:10:0x003e A[LOOP:0: B:1:0x000e->B:10:0x003e, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0042 A[EDGE_INSN: B:18:0x0042->B:12:0x0042 ?: BREAK  , SYNTHETIC] */
        static {
            /*
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                p369i.p387z.p389d.C8594l.m46770d(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L_0x000e:
                java.lang.String r5 = "it"
                if (r4 >= r2) goto L_0x0041
                r6 = r1[r4]
                p369i.p387z.p389d.C8594l.m46770d(r6, r5)
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = p369i.p387z.p389d.C8594l.m46767a(r7, r8)
                if (r7 == 0) goto L_0x003a
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                p369i.p387z.p389d.C8594l.m46770d(r7, r8)
                java.lang.Object r7 = p369i.p377u.C8477h.m46632q(r7)
                java.lang.Class r7 = (java.lang.Class) r7
                boolean r7 = p369i.p387z.p389d.C8594l.m46767a(r7, r0)
                if (r7 == 0) goto L_0x003a
                r7 = 1
                goto L_0x003b
            L_0x003a:
                r7 = 0
            L_0x003b:
                if (r7 == 0) goto L_0x003e
                goto L_0x0042
            L_0x003e:
                int r4 = r4 + 1
                goto L_0x000e
            L_0x0041:
                r6 = 0
            L_0x0042:
                f34923a = r6
                int r0 = r1.length
            L_0x0045:
                if (r3 >= r0) goto L_0x005c
                r2 = r1[r3]
                p369i.p387z.p389d.C8594l.m46770d(r2, r5)
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = p369i.p387z.p389d.C8594l.m46767a(r2, r4)
                if (r2 == 0) goto L_0x0059
                goto L_0x005c
            L_0x0059:
                int r3 = r3 + 1
                goto L_0x0045
            L_0x005c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p369i.p383x.C8540a.C8541a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo30606a(Throwable th, Throwable th2) {
        C8594l.m46771e(th, "cause");
        C8594l.m46771e(th2, "exception");
        Method method = C8541a.f34923a;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }

    /* renamed from: b */
    public C8379c mo30607b() {
        return new C8377b();
    }
}
