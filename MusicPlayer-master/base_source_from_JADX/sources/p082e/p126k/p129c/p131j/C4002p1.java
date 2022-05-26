package p082e.p126k.p129c.p131j;

import java.util.Collections;
import java.util.List;

/* renamed from: e.k.c.j.p1 */
/* compiled from: UninitializedMessageException */
public class C4002p1 extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;
    private final List<String> missingFields;

    public C4002p1(C4012s0 s0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.missingFields = null;
    }

    /* renamed from: a */
    private static String m17481a(List<String> list) {
        StringBuilder sb = new StringBuilder("Message missing required fields: ");
        boolean z = true;
        for (String next : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(next);
        }
        return sb.toString();
    }

    public C3911c0 asInvalidProtocolBufferException() {
        return new C3911c0(getMessage());
    }

    public List<String> getMissingFields() {
        return Collections.unmodifiableList(this.missingFields);
    }

    public C4002p1(List<String> list) {
        super(m17481a(list));
        this.missingFields = list;
    }
}
