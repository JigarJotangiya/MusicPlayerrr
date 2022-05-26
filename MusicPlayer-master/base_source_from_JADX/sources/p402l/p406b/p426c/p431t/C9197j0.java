package p402l.p406b.p426c.p431t;

import java.util.Iterator;

/* renamed from: l.b.c.t.j0 */
/* compiled from: TyerTdatAggregatedFrame */
public class C9197j0 extends C9194i {
    public String getContent() {
        StringBuilder sb = new StringBuilder();
        Iterator<C9176c> it = this.f35884g.iterator();
        sb.append(it.next().getContent());
        C9176c next = it.next();
        sb.append("-");
        sb.append(next.getContent().substring(2, 4));
        sb.append("-");
        sb.append(next.getContent().substring(0, 2));
        return sb.toString();
    }
}
