package androidx.work;

import java.util.List;

/* renamed from: androidx.work.j */
/* compiled from: InputMerger */
public abstract class C1402j {

    /* renamed from: a */
    private static final String f5463a = C1405l.m7462f("InputMerger");

    /* renamed from: a */
    public static C1402j m7454a(String str) {
        try {
            return (C1402j) Class.forName(str).newInstance();
        } catch (Exception e) {
            C1405l c = C1405l.m7460c();
            String str2 = f5463a;
            c.mo6817b(str2, "Trouble instantiating + " + str, e);
            return null;
        }
    }

    /* renamed from: b */
    public abstract C1236e mo6410b(List<C1236e> list);
}
