package kotlinx.coroutines;

import kotlinx.coroutines.internal.C8840m;
import kotlinx.coroutines.internal.C8842o;
import p369i.p387z.p389d.C8594l;

/* renamed from: kotlinx.coroutines.m2 */
/* compiled from: JobSupport.kt */
public final class C8880m2 extends C8840m implements C8920v1 {
    /* renamed from: A */
    public final String mo31203A(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        boolean z = true;
        for (C8842o oVar = (C8842o) mo31145o(); !C8594l.m46767a(oVar, this); oVar = oVar.mo31146p()) {
            if (oVar instanceof C8775h2) {
                C8775h2 h2Var = (C8775h2) oVar;
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(h2Var);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        C8594l.m46770d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: b */
    public C8880m2 mo31011b() {
        return this;
    }

    /* renamed from: c */
    public boolean mo31012c() {
        return true;
    }

    public String toString() {
        return C8919v0.m47826c() ? mo31203A("Active") : super.toString();
    }
}
