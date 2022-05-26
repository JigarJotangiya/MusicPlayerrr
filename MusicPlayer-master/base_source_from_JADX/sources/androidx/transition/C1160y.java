package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.transition.y */
/* compiled from: TransitionValues */
public class C1160y {

    /* renamed from: a */
    public final Map<String, Object> f4751a = new HashMap();

    /* renamed from: b */
    public View f4752b;

    /* renamed from: c */
    final ArrayList<Transition> f4753c = new ArrayList<>();

    @Deprecated
    public C1160y() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1160y)) {
            return false;
        }
        C1160y yVar = (C1160y) obj;
        return this.f4752b == yVar.f4752b && this.f4751a.equals(yVar.f4751a);
    }

    public int hashCode() {
        return (this.f4752b.hashCode() * 31) + this.f4751a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f4752b + "\n") + "    values:";
        for (String next : this.f4751a.keySet()) {
            str = str + "    " + next + ": " + this.f4751a.get(next) + "\n";
        }
        return str;
    }

    public C1160y(View view) {
        this.f4752b = view;
    }
}
